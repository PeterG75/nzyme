/*
 * This file is part of nzyme.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the Server Side Public License, version 1,
 * as published by MongoDB, Inc.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * Server Side Public License for more details.
 *
 * You should have received a copy of the Server Side Public License
 * along with this program. If not, see
 * <http://www.mongodb.com/licensing/server-side-public-license>.
 */

package horse.wtf.nzyme.configuration.leader;

import com.beust.jcommander.internal.Lists;
import com.google.common.base.Enums;
import com.google.common.collect.ImmutableList;
import com.typesafe.config.Config;
import com.typesafe.config.ConfigException;
import com.typesafe.config.ConfigFactory;
import horse.wtf.nzyme.Role;
import horse.wtf.nzyme.alerts.Alert;
import horse.wtf.nzyme.alerts.service.callbacks.AlertCallback;
import horse.wtf.nzyme.alerts.service.callbacks.EmailCallback;
import horse.wtf.nzyme.bandits.trackers.devices.TrackerDevice;
import horse.wtf.nzyme.configuration.*;
import horse.wtf.nzyme.dot11.deception.traps.Trap;
import horse.wtf.nzyme.notifications.uplinks.graylog.GraylogAddress;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.annotation.Nullable;
import java.io.File;
import java.io.FileNotFoundException;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class LeaderConfigurationLoader {

    private static final Logger LOG = LogManager.getLogger(LeaderConfigurationLoader.class);

    private final Config root;
    private final Config general;
    private final Config interfaces;
    private final Config python;
    private final Config alerting;

    private final BaseDot11ConfigurationLoader baseDot11ConfigurationLoader;

    public LeaderConfigurationLoader(File configFile, boolean skipValidation) throws InvalidConfigurationException, IncompleteConfigurationException, FileNotFoundException {
        if (!Files.isReadable(configFile.toPath())) {
            throw new FileNotFoundException("File at [" + configFile.getPath() + "] does not exist or is not readable. Check path and permissions.");
        }

        this.root = ConfigFactory.parseFile(configFile).resolve();

        this.baseDot11ConfigurationLoader = new BaseDot11ConfigurationLoader(root);

        try {
            this.general = root.getConfig(ConfigurationKeys.GENERAL);
            this.python = general.getConfig(ConfigurationKeys.PYTHON);
            this.alerting = general.getConfig(ConfigurationKeys.ALERTING);
            this.interfaces = root.getConfig(ConfigurationKeys.INTERFACES);
        } catch(ConfigException e) {
            throw new IncompleteConfigurationException("Incomplete configuration.", e);
        }

        if (!skipValidation) {
            validate();
        }
    }

    public LeaderConfiguration get() {
        return LeaderConfiguration.create(
                parseVersionchecksEnabled(),
                parseFetchOUIsEnabled(),
                parseRole(),
                parseAdminPasswordHash(),
                parseDatabasePath(),
                parsePythonExecutable(),
                parsePythonScriptDirectory(),
                parsePythonScriptPrefix(),
                parseRestListenUri(),
                parseHttpExternalUri(),
                parseUseTls(),
                parseTlsCertificatePath(),
                parseTlsKeyPath(),
                baseDot11ConfigurationLoader.parseDot11Monitors(),
                baseDot11ConfigurationLoader.parseDot11Networks(),
                parseDot11TrapDeviceDefinitions(),
                parseDot11Alerts(),
                parseAlertingTrainingPeriodSeconds(),
                parseGraylogUplinks(),
                parseAlertCallbacks(),
                parseGroundstationDevice()
        );
    }

    private Role parseRole() {
        return general.getEnum(Role.class, ConfigurationKeys.ROLE);
    }

    private String parseAdminPasswordHash() {
        return general.getString(ConfigurationKeys.ADMIN_PASSWORD_HASH);
    }

    private String parseDatabasePath() {
        return general.getString(ConfigurationKeys.DATABASE_PATH);
    }

    private String parsePythonExecutable() {
        return python.getString(ConfigurationKeys.PYTHON_PATH);
    }

    private String parsePythonScriptDirectory() {
        return python.getString(ConfigurationKeys.PYTHON_SCRIPT_DIR);
    }

    private String parsePythonScriptPrefix() {
        return python.getString(ConfigurationKeys.PYTHON_SCRIPT_PREFIX);
    }

    private boolean parseVersionchecksEnabled() {
        return general.getBoolean(ConfigurationKeys.VERSIONCHECKS);
    }

    private boolean parseFetchOUIsEnabled() {
        return general.getBoolean(ConfigurationKeys.FETCH_OUIS);
    }

    private boolean parseUseTls() {
        return interfaces.getBoolean(ConfigurationKeys.USE_TLS);
    }

    @Nullable
    private Path parseTlsCertificatePath() {
        if (interfaces.hasPath(ConfigurationKeys.TLS_CERTIFICATE_PATH)) {
            return new File(interfaces.getString(ConfigurationKeys.TLS_CERTIFICATE_PATH)).toPath();
        } else {
            return null;
        }
    }

    @Nullable
    private Path parseTlsKeyPath() {
        if (interfaces.hasPath(ConfigurationKeys.TLS_KEY_PATH)) {
            return new File(interfaces.getString(ConfigurationKeys.TLS_KEY_PATH)).toPath();
        } else {
            return null;
        }
    }

    private URI parseRestListenUri() {
        return URI.create(interfaces.getString(ConfigurationKeys.REST_LISTEN_URI));
    }

    private URI parseHttpExternalUri() {
        return URI.create(interfaces.getString(ConfigurationKeys.HTTP_EXTERNAL_URI));
    }

    private Integer parseAlertingTrainingPeriodSeconds() {
        return alerting.getInt(ConfigurationKeys.TRAINING_PERIOD_SECONDS);
    }

    private ImmutableList<Dot11TrapDeviceDefinition> parseDot11TrapDeviceDefinitions() {
        ImmutableList.Builder<Dot11TrapDeviceDefinition> result = new ImmutableList.Builder<>();

        for (Config config : root.getConfigList(ConfigurationKeys.DOT11_TRAPS)) {
            if (!Dot11TrapDeviceDefinition.checkConfig(config)) {
                LOG.info("Skipping 802.11 trap device definition with invalid configuration. Invalid definition: [{}]", config);
                continue;
            }

            Config trapConfig = config.getConfig(ConfigurationKeys.TRAP);
            Dot11TrapConfiguration trap = Dot11TrapConfiguration.create(
                    Trap.Type.valueOf(trapConfig.getString(ConfigurationKeys.TYPE)),
                    trapConfig
            );

            result.add(Dot11TrapDeviceDefinition.create(
                    config.getString(ConfigurationKeys.DEVICE),
                    config.getIntList(ConfigurationKeys.CHANNELS),
                    config.getString(ConfigurationKeys.HOP_COMMAND),
                    config.getInt(ConfigurationKeys.HOP_INTERVAL),
                    trap
            ));
        }

        return result.build();
    }

    private ImmutableList<Alert.TYPE_WIDE> parseDot11Alerts() {
        ImmutableList.Builder<Alert.TYPE_WIDE> result = new ImmutableList.Builder<>();

        for (String alert : root.getStringList(ConfigurationKeys.DOT11_ALERTS)) {
            String name = alert.toUpperCase();

            if (Enums.getIfPresent(Alert.TYPE_WIDE.class, name).isPresent()) {
                result.add(Alert.TYPE_WIDE.valueOf(name));
            }
        }

        return result.build();
    }

    @Nullable
    private ImmutableList<GraylogAddress> parseGraylogUplinks() {
        try {
            List<String> graylogAddresses = root.getStringList(ConfigurationKeys.GRAYLOG_UPLINKS);
            if (graylogAddresses == null) {
                return null;
            }

            ImmutableList.Builder<GraylogAddress> result = new ImmutableList.Builder<>();
            for (String address : graylogAddresses) {
                String[] parts = address.split(":");
                result.add(GraylogAddress.create(parts[0], Integer.parseInt(parts[1])));
            }

            return result.build();
        } catch (ConfigException e) {
            LOG.debug(e);
            return null;
        }
    }

    private ImmutableList<AlertCallback> parseAlertCallbacks() {
        ImmutableList.Builder<AlertCallback> callbacks = new ImmutableList.Builder<>();
        if (!alerting.hasPath(ConfigurationKeys.CALLBACKS)) {
            return callbacks.build();
        }

        List<? extends Config> cs;
        try {
            cs = alerting.getConfigList(ConfigurationKeys.CALLBACKS);

            for (Config c : cs) {
                if (!c.hasPath(ConfigurationKeys.TYPE) || !c.hasPath(ConfigurationKeys.ENABLED)) {
                    LOG.error("Alert callback is missing type or enabled field. Please consult callback documentation.");
                    continue;
                }

                String type = c.getString(ConfigurationKeys.TYPE);
                if (!c.getBoolean(ConfigurationKeys.ENABLED)) {
                    LOG.info("Skipping disabled alert callback of type [{}].", type);
                    continue;
                }

                switch(type) {
                    case "email":
                        callbacks.add(new EmailCallback(EmailCallback.parseConfiguration(c, parseHttpExternalUri().toString())));
                        break;
                    default:
                        LOG.error("Skipping unknown alert callback of type [{}].", type);
                }
            }
        } catch (Exception e) {
            LOG.error("Could not parse alert callbacks", e);
            return callbacks.build();
        }

        return callbacks.build();
    }

    @Nullable
    private UplinkDeviceConfiguration parseGroundstationDevice() {
        if (!root.hasPath(ConfigurationKeys.GROUNDSTATION_DEVICE)) {
            return null;
        }

        Config trackerDevice = root.getConfig(ConfigurationKeys.GROUNDSTATION_DEVICE);

        if(trackerDevice.hasPath(ConfigurationKeys.TYPE)) {
            return UplinkDeviceConfiguration.create(
                    trackerDevice.getString(ConfigurationKeys.TYPE),
                    trackerDevice.getConfig(ConfigurationKeys.PARAMETERS)
            );
        } else {
            return null;
        }
    }

    private void validate() throws IncompleteConfigurationException, InvalidConfigurationException {
        // Completeness and type validity.
        ConfigurationValidator.expectEnum(general, ConfigurationKeys.ROLE, ConfigurationKeys.GENERAL, Role.class);
        ConfigurationValidator.expect(general, ConfigurationKeys.ADMIN_PASSWORD_HASH, ConfigurationKeys.GENERAL, String.class);
        ConfigurationValidator.expect(general, ConfigurationKeys.DATABASE_PATH, ConfigurationKeys.GENERAL, String.class);
        ConfigurationValidator.expect(general, ConfigurationKeys.VERSIONCHECKS, ConfigurationKeys.GENERAL, Boolean.class);
        ConfigurationValidator.expect(general, ConfigurationKeys.FETCH_OUIS, ConfigurationKeys.GENERAL, Boolean.class);
        ConfigurationValidator.expect(python, ConfigurationKeys.PYTHON_PATH, ConfigurationKeys.GENERAL + "." + ConfigurationKeys.PYTHON, String.class);
        ConfigurationValidator.expect(python, ConfigurationKeys.PYTHON_SCRIPT_DIR, ConfigurationKeys.GENERAL + "." + ConfigurationKeys.PYTHON, String.class);
        ConfigurationValidator.expect(python, ConfigurationKeys.PYTHON_SCRIPT_PREFIX, ConfigurationKeys.GENERAL + "." + ConfigurationKeys.PYTHON, String.class);
        ConfigurationValidator.expect(alerting, ConfigurationKeys.TRAINING_PERIOD_SECONDS, ConfigurationKeys.GENERAL + "." + ConfigurationKeys.ALERTING, Integer.class);
        ConfigurationValidator.expect(interfaces, ConfigurationKeys.REST_LISTEN_URI, ConfigurationKeys.INTERFACES, String.class);
        ConfigurationValidator.expect(interfaces, ConfigurationKeys.HTTP_EXTERNAL_URI, ConfigurationKeys.INTERFACES, String.class);
        ConfigurationValidator.expect(root, ConfigurationKeys.DOT11_MONITORS, "<root>", List.class);
        ConfigurationValidator.expect(root, ConfigurationKeys.DOT11_NETWORKS, "<root>", List.class);
        ConfigurationValidator.expect(root, ConfigurationKeys.DOT11_ALERTS, "<root>", List.class);
        ConfigurationValidator.expect(root, ConfigurationKeys.GROUNDSTATION_DEVICE, "<root>", Config.class);

        if (root.hasPath(ConfigurationKeys.GROUNDSTATION_DEVICE)) {
            Config groundstationDevice = root.getConfig(ConfigurationKeys.GROUNDSTATION_DEVICE);

            if (groundstationDevice.hasPath(ConfigurationKeys.TYPE)) {
                ConfigurationValidator.expect(groundstationDevice, ConfigurationKeys.TYPE, ConfigurationKeys.GROUNDSTATION_DEVICE, String.class);
                ConfigurationValidator.expect(groundstationDevice, ConfigurationKeys.PARAMETERS, ConfigurationKeys.GROUNDSTATION_DEVICE, Config.class);

                // Validate parameters of SX126X LoRa HAT.
                if (groundstationDevice.getString(ConfigurationKeys.TYPE).equals(TrackerDevice.TYPE.SX126X_LORA.toString())) {
                    Config loraConfig = groundstationDevice.getConfig(ConfigurationKeys.PARAMETERS);

                    // Serial port must exist.
                    ConfigurationValidator.expect(loraConfig, ConfigurationKeys.SERIAL_PORT, ConfigurationKeys.GROUNDSTATION_DEVICE + "." + ConfigurationKeys.PARAMETERS, String.class);
                    String serialPortPath = loraConfig.getString(ConfigurationKeys.SERIAL_PORT);
                    if (!new File(serialPortPath).exists()) {
                        throw new InvalidConfigurationException("Parameter " + ConfigurationKeys.GROUNDSTATION_DEVICE + "." + ConfigurationKeys.PARAMETERS + "."
                                + ConfigurationKeys.SERIAL_PORT + " does not point to an existing serial port path at [" + serialPortPath + "].");
                    }

                    // Encryption key must exist and be exactly 32 characters.
                    ConfigurationValidator.expect(loraConfig, ConfigurationKeys.ENCRYPTION_KEY, ConfigurationKeys.GROUNDSTATION_DEVICE + "." + ConfigurationKeys.PARAMETERS, String.class);
                    String encryptionKey = loraConfig.getString(ConfigurationKeys.ENCRYPTION_KEY);
                    if (encryptionKey.length() != 32) {
                        throw new InvalidConfigurationException("Parameter " + ConfigurationKeys.GROUNDSTATION_DEVICE + "." + ConfigurationKeys.PARAMETERS + "."
                                + ConfigurationKeys.ENCRYPTION_KEY + " must be exactly 32 characters long.");
                    }
                }
            }
        }

        // Password hash is 64 characters long (the size of a SHA256 hash string)
        if (parseAdminPasswordHash().length() != 64) {
            throw new InvalidConfigurationException("Parameter [" + ConfigurationKeys.GENERAL + "." + ConfigurationKeys.ADMIN_PASSWORD_HASH + "] must be 64 characters long (a SHA256 hash).");
        }

        // Validate shared/base 802.11 config.
        baseDot11ConfigurationLoader.validate();

        // 802.11 Trap Pairs
        int i = 0;
        List<String> trapDevices = Lists.newArrayList();
        for (Config c : root.getConfigList(ConfigurationKeys.DOT11_TRAPS)) {
            String where = ConfigurationKeys.DOT11_TRAPS + ".#" + i;
            ConfigurationValidator.expect(c, ConfigurationKeys.DEVICE, where, String.class);
            ConfigurationValidator.expect(c, ConfigurationKeys.CHANNELS, where, List.class);
            ConfigurationValidator.expect(c, ConfigurationKeys.HOP_COMMAND, where, String.class);
            ConfigurationValidator.expect(c, ConfigurationKeys.HOP_INTERVAL, where, Integer.class);
            ConfigurationValidator.expect(c, ConfigurationKeys.TRAP, where, Config.class);

            String deviceName = c.getString(ConfigurationKeys.DEVICE);

            Config trap = c.getConfig(ConfigurationKeys.TRAP);

            // Make sure trap type exists and is set to an existing trap type.
            ConfigurationValidator.expect(trap, ConfigurationKeys.TYPE, where, String.class);
            String trapType = trap.getString(ConfigurationKeys.TYPE);
            try {
                Trap.Type.valueOf(trapType);
            } catch(IllegalArgumentException e) {
                throw new InvalidConfigurationException("Trap [" + where + "] is of invalid type [" + trapType + "].");
            }

            if (trapDevices.contains(deviceName)) {
                throw new InvalidConfigurationException("Trap ["+ where+"] is using already configured device [" + deviceName + "]. Devices can only be used once.");
            }
            trapDevices.add(deviceName);

            for (Dot11MonitorDefinition monitor : baseDot11ConfigurationLoader.parseDot11Monitors()) {
                if (monitor.device().equals(deviceName)) {
                    throw new InvalidConfigurationException("Trap ["+ where+"] is using already configured monitor device [" + deviceName + "]. Devices can only be used once.");
                }
            }
        }

        // Logical validity.
        // Python: executable is an executable file.
        if(!Files.isExecutable(new File(parsePythonExecutable()).toPath())) {
            throw new InvalidConfigurationException("Parameter [general.python." + ConfigurationKeys.PYTHON_PATH + "] does not point to an executable file: " + parsePythonExecutable());
        }

        // Python: script directory is a directory and writable.
        if (!Files.isDirectory(new File(parsePythonScriptDirectory()).toPath()) || !Files.isWritable(new File(parsePythonScriptDirectory()).toPath())) {
            throw new InvalidConfigurationException("Parameter [general.python." + ConfigurationKeys.PYTHON_SCRIPT_DIR + "] does not point to a writable directory: " + parsePythonScriptDirectory());
        }

        // REST listen URI can be parsed into a URI.
        try {
            parseRestListenUri();
        } catch(Exception e) {
            LOG.error(e);
            throw new InvalidConfigurationException("Parameter [interfaces." + ConfigurationKeys.REST_LISTEN_URI + "] cannot be parsed into a URI. Make sure it is correct.");
        }

        // HTTP external URI can be parsed into a URI.
        try {
            parseHttpExternalUri();
        } catch(Exception e) {
            LOG.error(e);
            throw new InvalidConfigurationException("Parameter [interfaces." + ConfigurationKeys.HTTP_EXTERNAL_URI + "] cannot be parsed into a URI. Make sure it is correct.");
        }

        // TLS, if TLS is enabled.
        if (parseUseTls()) {
            try {
                Path cert = parseTlsCertificatePath();
                if (!cert.toFile().canRead()) {
                    throw new InvalidConfigurationException("Parameter [interfaces." + ConfigurationKeys.TLS_CERTIFICATE_PATH + "] points to a file that is not readable.");
                }
            } catch(Exception e) {
                LOG.error(e);
                throw new InvalidConfigurationException("Parameter [interfaces." + ConfigurationKeys.TLS_CERTIFICATE_PATH + "] cannot be parsed into a path. Make sure it is correct.");
            }

            try {
                Path key = parseTlsKeyPath();
                if (!key.toFile().canRead()) {
                    throw new InvalidConfigurationException("Parameter [interfaces." + ConfigurationKeys.TLS_KEY_PATH + "] points to a file that is not readable.");
                }
            } catch(Exception e) {
                LOG.error(e);
                throw new InvalidConfigurationException("Parameter [interfaces." + ConfigurationKeys.TLS_KEY_PATH + "] cannot be parsed into a path. Make sure it is correct.");
            }
        }
    }

}
