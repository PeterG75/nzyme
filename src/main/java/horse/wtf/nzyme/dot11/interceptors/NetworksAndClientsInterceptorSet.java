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

package horse.wtf.nzyme.dot11.interceptors;

import com.google.common.collect.ImmutableList;
import horse.wtf.nzyme.NzymeLeader;
import horse.wtf.nzyme.alerts.Alert;
import horse.wtf.nzyme.dot11.Dot11FrameInterceptor;
import horse.wtf.nzyme.dot11.Dot11FrameSubtype;
import horse.wtf.nzyme.dot11.frames.Dot11AssociationRequestFrame;
import horse.wtf.nzyme.dot11.frames.Dot11BeaconFrame;
import horse.wtf.nzyme.dot11.frames.Dot11ProbeRequestFrame;
import horse.wtf.nzyme.dot11.frames.Dot11ProbeResponseFrame;
import org.pcap4j.packet.IllegalRawDataException;

import java.util.Collections;
import java.util.List;

public class NetworksAndClientsInterceptorSet {

    private final NzymeLeader nzyme;

    public NetworksAndClientsInterceptorSet(NzymeLeader nzyme) {
        this.nzyme = nzyme;
    }

    public List<Dot11FrameInterceptor> getInterceptors() {
        ImmutableList.Builder<Dot11FrameInterceptor> interceptors = new ImmutableList.Builder<>();

        interceptors.add(new Dot11FrameInterceptor<Dot11BeaconFrame>() {
            @Override
            public void intercept(Dot11BeaconFrame frame) throws IllegalRawDataException {
                nzyme.getNetworks().registerBeaconFrame(frame);
            }

            @Override
            public byte forSubtype() {
                return Dot11FrameSubtype.BEACON;
            }

            @Override
            public List<Class<? extends Alert>> raisesAlerts() {
                return Collections.emptyList();
            }
        });

        interceptors.add(new Dot11FrameInterceptor<Dot11ProbeResponseFrame>() {
            @Override
            public void intercept(Dot11ProbeResponseFrame frame) throws IllegalRawDataException {
                nzyme.getNetworks().registerProbeResponseFrame(frame);
            }

            @Override
            public byte forSubtype() {
                return Dot11FrameSubtype.PROBE_RESPONSE;
            }

            @Override
            public List<Class<? extends Alert>> raisesAlerts() {
                return Collections.emptyList();
            }
        });

        interceptors.add(new Dot11FrameInterceptor<Dot11ProbeRequestFrame>() {
            @Override
            public void intercept(Dot11ProbeRequestFrame frame) throws IllegalRawDataException {
                nzyme.getClients().registerProbeRequestFrame(frame);
            }

            @Override
            public byte forSubtype() {
                return Dot11FrameSubtype.PROBE_REQUEST;
            }

            @Override
            public List<Class<? extends Alert>> raisesAlerts() {
                return Collections.emptyList();
            }
        });

        interceptors.add(new Dot11FrameInterceptor<Dot11AssociationRequestFrame>() {
            @Override
            public void intercept(Dot11AssociationRequestFrame frame) throws IllegalRawDataException {
                nzyme.getClients().registerAssociationRequestFrame(frame);
            }

            @Override
            public byte forSubtype() {
                return Dot11FrameSubtype.ASSOCIATION_REQUEST;
            }

            @Override
            public List<Class<? extends Alert>> raisesAlerts() {
                return Collections.emptyList();
            }
        });

        return interceptors.build();
    }

}
