/*
 *  This file is part of nzyme.
 *
 *  nzyme is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  nzyme is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with nzyme.  If not, see <http://www.gnu.org/licenses/>.
 */

package horse.wtf.nzyme.dot11.parsers;

public class Frames {

    /*
     * TYPE:        BEACON
     * SSID:        WTF
     * Transmitter: 00:c0:ca:95:68:3b
     * Fingerprint: dfac3abce0c722f9609343f7dfa208afa51a1c7decbd2eb6f96c78051f0a594b
     * WPS:         false
     * Security:    WPA1-EAM-PSK-CCMP, WPA2-EAM-PSK-CCMP
     */
    public static final byte[] BEACON_1_HEADER = new byte[]{(byte) 0x00, (byte) 0x00, (byte) 0x12, (byte) 0x00, (byte) 0x2e, (byte) 0x48, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x02, (byte) 0x9e, (byte) 0x09, (byte) 0xa0, (byte) 0x00, (byte) 0xf3, (byte) 0x01, (byte) 0x00, (byte) 0x00};
    public static final byte[] BEACON_1_PAYLOAD = new byte[]{(byte) 0x80, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0x00, (byte) 0xc0, (byte) 0xca, (byte) 0x95, (byte) 0x68, (byte) 0x3b, (byte) 0x00, (byte) 0xc0, (byte) 0xca, (byte) 0x95, (byte) 0x68, (byte) 0x3b, (byte) 0x10, (byte) 0x9c, (byte) 0xa0, (byte) 0xbf, (byte) 0xb2, (byte) 0x59, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x64, (byte) 0x00, (byte) 0x31, (byte) 0x04, (byte) 0x00, (byte) 0x03, (byte) 0x57, (byte) 0x54, (byte) 0x46, (byte) 0x01, (byte) 0x08, (byte) 0x82, (byte) 0x84, (byte) 0x8b, (byte) 0x96, (byte) 0x8c, (byte) 0x12, (byte) 0x98, (byte) 0x24, (byte) 0x03, (byte) 0x01, (byte) 0x0b, (byte) 0x05, (byte) 0x04, (byte) 0x00, (byte) 0x01, (byte) 0x00, (byte) 0x00, (byte) 0x07, (byte) 0x06, (byte) 0x55, (byte) 0x53, (byte) 0x20, (byte) 0x01, (byte) 0x0b, (byte) 0x1e, (byte) 0x2a, (byte) 0x01, (byte) 0x00, (byte) 0x32, (byte) 0x04, (byte) 0xb0, (byte) 0x48, (byte) 0x60, (byte) 0x6c, (byte) 0x30, (byte) 0x18, (byte) 0x01, (byte) 0x00, (byte) 0x00, (byte) 0x0f, (byte) 0xac, (byte) 0x04, (byte) 0x01, (byte) 0x00, (byte) 0x00, (byte) 0x0f, (byte) 0xac, (byte) 0x04, (byte) 0x02, (byte) 0x00, (byte) 0x00, (byte) 0x0f, (byte) 0xac, (byte) 0x01, (byte) 0x00, (byte) 0x0f, (byte) 0xac, (byte) 0x02, (byte) 0x00, (byte) 0x00, (byte) 0xdd, (byte) 0x1a, (byte) 0x00, (byte) 0x50, (byte) 0xf2, (byte) 0x01, (byte) 0x01, (byte) 0x00, (byte) 0x00, (byte) 0x50, (byte) 0xf2, (byte) 0x04, (byte) 0x01, (byte) 0x00, (byte) 0x00, (byte) 0x50, (byte) 0xf2, (byte) 0x04, (byte) 0x02, (byte) 0x00, (byte) 0x00, (byte) 0x50, (byte) 0xf2, (byte) 0x01, (byte) 0x00, (byte) 0x50, (byte) 0xf2, (byte) 0x02};

    /*
     * TYPE:        BEACON
     * SSID:        WTF
     * Transmitter: 00:c0:ca:95:68:3b
     * Fingerprint: 6586b438a7ef3c680c39983b8f2a079e53962f12b302f5ffeeaf4daad2e8ca33
     * WPS:         false
     * Security:    WPA1-EAM-PSK-CCMP-TKIP, WPA2-EAM-PSK-CCMP-TKIP
     */
    public static final byte[] BEACON_2_HEADER = new byte[]{(byte) 0x00, (byte) 0x00, (byte) 0x12, (byte) 0x00, (byte) 0x2e, (byte) 0x48, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x02, (byte) 0x8a, (byte) 0x09, (byte) 0xa0, (byte) 0x00, (byte) 0xdd, (byte) 0x01, (byte) 0x00, (byte) 0x00};
    public static final byte[] BEACON_2_PAYLOAD = new byte[]{(byte) 0x80, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0x00, (byte) 0xc0, (byte) 0xca, (byte) 0x95, (byte) 0x68, (byte) 0x3b, (byte) 0x00, (byte) 0xc0, (byte) 0xca, (byte) 0x95, (byte) 0x68, (byte) 0x3b, (byte) 0x10, (byte) 0x38, (byte) 0x22, (byte) 0xe5, (byte) 0x74, (byte) 0x05, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x64, (byte) 0x00, (byte) 0x31, (byte) 0x04, (byte) 0x00, (byte) 0x03, (byte) 0x57, (byte) 0x54, (byte) 0x46, (byte) 0x01, (byte) 0x08, (byte) 0x82, (byte) 0x84, (byte) 0x8b, (byte) 0x96, (byte) 0x8c, (byte) 0x12, (byte) 0x98, (byte) 0x24, (byte) 0x03, (byte) 0x01, (byte) 0x0b, (byte) 0x05, (byte) 0x04, (byte) 0x00, (byte) 0x01, (byte) 0x00, (byte) 0x00, (byte) 0x07, (byte) 0x06, (byte) 0x55, (byte) 0x53, (byte) 0x20, (byte) 0x01, (byte) 0x0b, (byte) 0x1e, (byte) 0x2a, (byte) 0x01, (byte) 0x00, (byte) 0x32, (byte) 0x04, (byte) 0xb0, (byte) 0x48, (byte) 0x60, (byte) 0x6c, (byte) 0x30, (byte) 0x1c, (byte) 0x01, (byte) 0x00, (byte) 0x00, (byte) 0x0f, (byte) 0xac, (byte) 0x02, (byte) 0x02, (byte) 0x00, (byte) 0x00, (byte) 0x0f, (byte) 0xac, (byte) 0x04, (byte) 0x00, (byte) 0x0f, (byte) 0xac, (byte) 0x02, (byte) 0x02, (byte) 0x00, (byte) 0x00, (byte) 0x0f, (byte) 0xac, (byte) 0x01, (byte) 0x00, (byte) 0x0f, (byte) 0xac, (byte) 0x02, (byte) 0x00, (byte) 0x00, (byte) 0xdd, (byte) 0x1e, (byte) 0x00, (byte) 0x50, (byte) 0xf2, (byte) 0x01, (byte) 0x01, (byte) 0x00, (byte) 0x00, (byte) 0x50, (byte) 0xf2, (byte) 0x02, (byte) 0x02, (byte) 0x00, (byte) 0x00, (byte) 0x50, (byte) 0xf2, (byte) 0x04, (byte) 0x00, (byte) 0x50, (byte) 0xf2, (byte) 0x02, (byte) 0x02, (byte) 0x00, (byte) 0x00, (byte) 0x50, (byte) 0xf2, (byte) 0x01, (byte) 0x00, (byte) 0x50, (byte) 0xf2, (byte) 0x02};

    /*
     * TYPE:        BEACON
     * SSID:        United_Wi-Fi
     * Transmitter: 06:0d:2d:c9:36:23
     * Fingerprint: c9ed4adc12dc3e17208446b6a10070b70a73b9ce3a99215e05426faea6de91c7
     * WPS:         false
     * Security:    NONE
     */
    public static final byte[] BEACON_3_HEADER = new byte[]{(byte) 0x00, (byte) 0x00, (byte) 0x12, (byte) 0x00, (byte) 0x2e, (byte) 0x48, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x02, (byte) 0x85, (byte) 0x09, (byte) 0xa0, (byte) 0x00, (byte) 0xd1, (byte) 0x01, (byte) 0x00, (byte) 0x00};
    public static final byte[] BEACON_3_PAYLOAD = new byte[]{(byte) 0x80, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0x06, (byte) 0x0d, (byte) 0x2d, (byte) 0xc9, (byte) 0x36, (byte) 0x23, (byte) 0x06, (byte) 0x0d, (byte) 0x2d, (byte) 0xc9, (byte) 0x36, (byte) 0x23, (byte) 0x90, (byte) 0x50, (byte) 0x83, (byte) 0xa1, (byte) 0xda, (byte) 0xb3, (byte) 0x12, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x64, (byte) 0x00, (byte) 0x01, (byte) 0x04, (byte) 0x00, (byte) 0x0c, (byte) 0x55, (byte) 0x6e, (byte) 0x69, (byte) 0x74, (byte) 0x65, (byte) 0x64, (byte) 0x5f, (byte) 0x57, (byte) 0x69, (byte) 0x2d, (byte) 0x46, (byte) 0x69, (byte) 0x01, (byte) 0x08, (byte) 0x82, (byte) 0x84, (byte) 0x8b, (byte) 0x96, (byte) 0x0c, (byte) 0x12, (byte) 0x18, (byte) 0x24, (byte) 0x03, (byte) 0x01, (byte) 0x06, (byte) 0x05, (byte) 0x07, (byte) 0x00, (byte) 0x01, (byte) 0x00, (byte) 0x04, (byte) 0x08, (byte) 0x0d, (byte) 0x03, (byte) 0x07, (byte) 0x06, (byte) 0x43, (byte) 0x41, (byte) 0x20, (byte) 0x01, (byte) 0x0b, (byte) 0x1e, (byte) 0x2a, (byte) 0x01, (byte) 0x04, (byte) 0x32, (byte) 0x04, (byte) 0x30, (byte) 0x48, (byte) 0x60, (byte) 0x6c, (byte) 0x2d, (byte) 0x1a, (byte) 0xad, (byte) 0x09, (byte) 0x03, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x01, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x3d, (byte) 0x16, (byte) 0x06, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x4a, (byte) 0x0e, (byte) 0x14, (byte) 0x00, (byte) 0x0a, (byte) 0x00, (byte) 0x2c, (byte) 0x01, (byte) 0xc8, (byte) 0x00, (byte) 0x14, (byte) 0x00, (byte) 0x05, (byte) 0x00, (byte) 0x19, (byte) 0x00, (byte) 0x7f, (byte) 0x08, (byte) 0x01, (byte) 0x00, (byte) 0x0f, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x40, (byte) 0xbf, (byte) 0x0c, (byte) 0xb2, (byte) 0x79, (byte) 0x8b, (byte) 0x33, (byte) 0xaa, (byte) 0xff, (byte) 0x00, (byte) 0x00, (byte) 0xaa, (byte) 0xff, (byte) 0x00, (byte) 0x00, (byte) 0xc0, (byte) 0x05, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0xfc, (byte) 0xff, (byte) 0xdd, (byte) 0x18, (byte) 0x00, (byte) 0x50, (byte) 0xf2, (byte) 0x02, (byte) 0x01, (byte) 0x01, (byte) 0x80, (byte) 0x00, (byte) 0x03, (byte) 0xa4, (byte) 0x00, (byte) 0x00, (byte) 0x27, (byte) 0xa4, (byte) 0x00, (byte) 0x00, (byte) 0x42, (byte) 0x43, (byte) 0x5e, (byte) 0x00, (byte) 0x62, (byte) 0x32, (byte) 0x2f, (byte) 0x00, (byte) 0xdd, (byte) 0x09, (byte) 0x00, (byte) 0x03, (byte) 0x7f, (byte) 0x01, (byte) 0x01, (byte) 0x00, (byte) 0x00, (byte) 0xff, (byte) 0x7f};

    /*
     * TYPE:        ASSOCIATION REQUEST
     * SSID:        ATT4Q5FBC3
     * Transmitter: ac:81:12:d2:26:7e
     * Destination: 14:ed:bb:79:97:4d
     */
    public static final byte[] ASSOC_REQ_1_HEADER = new byte[]{(byte) 0x00, (byte) 0x00, (byte) 0x12, (byte) 0x00, (byte) 0x2e, (byte) 0x48, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x02, (byte) 0x7b, (byte) 0x09, (byte) 0xa0, (byte) 0x00, (byte) 0xb7, (byte) 0x01, (byte) 0x00, (byte) 0x00};
    public static final byte[] ASSOC_REQ_1_PAYLOAD = new byte[]{(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x14, (byte) 0xed, (byte) 0xbb, (byte) 0x79, (byte) 0x97, (byte) 0x4d, (byte) 0xac, (byte) 0x81, (byte) 0x12, (byte) 0xd2, (byte) 0x26, (byte) 0x7e, (byte) 0x14, (byte) 0xed, (byte) 0xbb, (byte) 0x79, (byte) 0x97, (byte) 0x4d, (byte) 0x80, (byte) 0x51, (byte) 0x11, (byte) 0x04, (byte) 0x05, (byte) 0x00, (byte) 0x00, (byte) 0x0a, (byte) 0x41, (byte) 0x54, (byte) 0x54, (byte) 0x34, (byte) 0x51, (byte) 0x35, (byte) 0x46, (byte) 0x42, (byte) 0x43, (byte) 0x33, (byte) 0x01, (byte) 0x08, (byte) 0x82, (byte) 0x84, (byte) 0x8b, (byte) 0x96, (byte) 0x24, (byte) 0x30, (byte) 0x48, (byte) 0x6c, (byte) 0x32, (byte) 0x04, (byte) 0x0c, (byte) 0x12, (byte) 0x18, (byte) 0x60, (byte) 0x2d, (byte) 0x1a, (byte) 0x3c, (byte) 0x00, (byte) 0x02, (byte) 0xff, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x7f, (byte) 0x08, (byte) 0x01, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0xdd, (byte) 0x07, (byte) 0x00, (byte) 0x0c, (byte) 0x43, (byte) 0x06, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0xdd, (byte) 0x07, (byte) 0x00, (byte) 0x50, (byte) 0xf2, (byte) 0x02, (byte) 0x00, (byte) 0x01, (byte) 0x00, (byte) 0x21, (byte) 0x02, (byte) 0x05, (byte) 0x13, (byte) 0x30, (byte) 0x16, (byte) 0x01, (byte) 0x00, (byte) 0x00, (byte) 0x0f, (byte) 0xac, (byte) 0x04, (byte) 0x01, (byte) 0x00, (byte) 0x00, (byte) 0x0f, (byte) 0xac, (byte) 0x04, (byte) 0x01, (byte) 0x00, (byte) 0x00, (byte) 0x0f, (byte) 0xac, (byte) 0x02, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00};

    /*
     * TYPE:          ASSOCIATION_RESPONSE
     * Transmitter:   88:96:4e:4d:77:80
     * Destination:   5c:77:76:d3:26:45
     * Response:      success
     * Response Code: 0
     */
    public static final byte[] ASSOC_RESP_SUCCESS_1_HEADER = new byte[]{(byte) 0x00, (byte) 0x00, (byte) 0x12, (byte) 0x00, (byte) 0x2e, (byte) 0x48, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x02, (byte) 0x9e, (byte) 0x09, (byte) 0xa0, (byte) 0x00, (byte) 0xb7, (byte) 0x01, (byte) 0x00, (byte) 0x00};
    public static final byte[] ASSOC_RESP_SUCCESS_1_PAYLOAD = new byte[]{(byte) 0x10, (byte) 0x00, (byte) 0x3a, (byte) 0x01, (byte) 0x5c, (byte) 0x77, (byte) 0x76, (byte) 0xd3, (byte) 0x26, (byte) 0x45, (byte) 0x88, (byte) 0x96, (byte) 0x4e, (byte) 0x4d, (byte) 0x77, (byte) 0x80, (byte) 0x88, (byte) 0x96, (byte) 0x4e, (byte) 0x4d, (byte) 0x77, (byte) 0x80, (byte) 0xd0, (byte) 0xc8, (byte) 0x11, (byte) 0x14, (byte) 0x00, (byte) 0x00, (byte) 0x02, (byte) 0xc0, (byte) 0x01, (byte) 0x08, (byte) 0x82, (byte) 0x84, (byte) 0x8b, (byte) 0x96, (byte) 0x24, (byte) 0x30, (byte) 0x48, (byte) 0x6c, (byte) 0x32, (byte) 0x04, (byte) 0x0c, (byte) 0x12, (byte) 0x18, (byte) 0x60, (byte) 0x46, (byte) 0x05, (byte) 0x32, (byte) 0x08, (byte) 0x01, (byte) 0x00, (byte) 0x00, (byte) 0x2d, (byte) 0x1a, (byte) 0xad, (byte) 0x09, (byte) 0x1f, (byte) 0xff, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x3d, (byte) 0x16, (byte) 0x0b, (byte) 0x08, (byte) 0x04, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x7f, (byte) 0x08, (byte) 0x04, (byte) 0x00, (byte) 0x08, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x40, (byte) 0xdd, (byte) 0x18, (byte) 0x00, (byte) 0x50, (byte) 0xf2, (byte) 0x04, (byte) 0x10, (byte) 0x4a, (byte) 0x00, (byte) 0x01, (byte) 0x10, (byte) 0x10, (byte) 0x3b, (byte) 0x00, (byte) 0x01, (byte) 0x03, (byte) 0x10, (byte) 0x49, (byte) 0x00, (byte) 0x06, (byte) 0x00, (byte) 0x37, (byte) 0x2a, (byte) 0x00, (byte) 0x01, (byte) 0x20, (byte) 0xdd, (byte) 0x09, (byte) 0x00, (byte) 0x10, (byte) 0x18, (byte) 0x02, (byte) 0x07, (byte) 0x10, (byte) 0x1c, (byte) 0x00, (byte) 0x00, (byte) 0xdd, (byte) 0x18, (byte) 0x00, (byte) 0x50, (byte) 0xf2, (byte) 0x02, (byte) 0x01, (byte) 0x01, (byte) 0x84, (byte) 0x00, (byte) 0x03, (byte) 0xa4, (byte) 0x00, (byte) 0x00, (byte) 0x27, (byte) 0xa4, (byte) 0x00, (byte) 0x00, (byte) 0x42, (byte) 0x43, (byte) 0x5e, (byte) 0x00, (byte) 0x62, (byte) 0x32, (byte) 0x2f, (byte) 0x00};

    /*
     * TYPE:          ASSOCIATION_RESPONSE
     * Transmitter:   88:96:4e:4d:77:80
     * Destination:   5c:77:76:d3:26:45
     * Response:      success
     * Response Code: 0
     */
    public static final byte[] ASSOC_RESP_FAILED_1_HEADER = new byte[]{(byte) 0x00, (byte) 0x00, (byte) 0x12, (byte) 0x00, (byte) 0x2e, (byte) 0x48, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x02, (byte) 0x9e, (byte) 0x09, (byte) 0xa0, (byte) 0x00, (byte) 0xb7, (byte) 0x01, (byte) 0x00, (byte) 0x00};
    public static final byte[] ASSOC_RESP_FAILED_1_PAYLOAD = new byte[]{(byte) 0x10, (byte) 0x00, (byte) 0x3a, (byte) 0x01, (byte) 0x5c, (byte) 0x77, (byte) 0x76, (byte) 0xd3, (byte) 0x26, (byte) 0x45, (byte) 0x88, (byte) 0x96, (byte) 0x4e, (byte) 0x4d, (byte) 0x77, (byte) 0x80, (byte) 0x88, (byte) 0x96, (byte) 0x4e, (byte) 0x4d, (byte) 0x77, (byte) 0x80, (byte) 0xd0, (byte) 0xc8, (byte) 0x11, (byte) 0x14, (byte) 0x01, (byte) 0x00, (byte) 0x02, (byte) 0xc0, (byte) 0x01, (byte) 0x08, (byte) 0x82, (byte) 0x84, (byte) 0x8b, (byte) 0x96, (byte) 0x24, (byte) 0x30, (byte) 0x48, (byte) 0x6c, (byte) 0x32, (byte) 0x04, (byte) 0x0c, (byte) 0x12, (byte) 0x18, (byte) 0x60, (byte) 0x46, (byte) 0x05, (byte) 0x32, (byte) 0x08, (byte) 0x01, (byte) 0x00, (byte) 0x00, (byte) 0x2d, (byte) 0x1a, (byte) 0xad, (byte) 0x09, (byte) 0x1f, (byte) 0xff, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x3d, (byte) 0x16, (byte) 0x0b, (byte) 0x08, (byte) 0x04, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x7f, (byte) 0x08, (byte) 0x04, (byte) 0x00, (byte) 0x08, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x40, (byte) 0xdd, (byte) 0x18, (byte) 0x00, (byte) 0x50, (byte) 0xf2, (byte) 0x04, (byte) 0x10, (byte) 0x4a, (byte) 0x00, (byte) 0x01, (byte) 0x10, (byte) 0x10, (byte) 0x3b, (byte) 0x00, (byte) 0x01, (byte) 0x03, (byte) 0x10, (byte) 0x49, (byte) 0x00, (byte) 0x06, (byte) 0x00, (byte) 0x37, (byte) 0x2a, (byte) 0x00, (byte) 0x01, (byte) 0x20, (byte) 0xdd, (byte) 0x09, (byte) 0x00, (byte) 0x10, (byte) 0x18, (byte) 0x02, (byte) 0x07, (byte) 0x10, (byte) 0x1c, (byte) 0x00, (byte) 0x00, (byte) 0xdd, (byte) 0x18, (byte) 0x00, (byte) 0x50, (byte) 0xf2, (byte) 0x02, (byte) 0x01, (byte) 0x01, (byte) 0x84, (byte) 0x00, (byte) 0x03, (byte) 0xa4, (byte) 0x00, (byte) 0x00, (byte) 0x27, (byte) 0xa4, (byte) 0x00, (byte) 0x00, (byte) 0x42, (byte) 0x43, (byte) 0x5e, (byte) 0x00, (byte) 0x62, (byte) 0x32, (byte) 0x2f, (byte) 0x00};

    /*
     * TYPE:            AUTHENTICATION
     * Transmitter:     ac:5f:3e:b9:5d:be
     * Destination:     e0:22:03:f8:a3:39
     * Status String:   success
     * Status Code:     0
     * Transaction Seq: 1
     */
    public static final byte[] AUTH_SUCCESS_1_HEADER = new byte[]{(byte) 0x00, (byte) 0x00, (byte) 0x12, (byte) 0x00, (byte) 0x2e, (byte) 0x48, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x02, (byte) 0x6c, (byte) 0x09, (byte) 0xa0, (byte) 0x00, (byte) 0xb7, (byte) 0x01, (byte) 0x00, (byte) 0x00};
    public static final byte[] AUTH_SUCCESS_1_PAYLOAD = new byte[]{(byte) 0xb0, (byte) 0x00, (byte) 0x3a, (byte) 0x01, (byte) 0xe0, (byte) 0x22, (byte) 0x03, (byte) 0xf8, (byte) 0xa3, (byte) 0x39, (byte) 0xac, (byte) 0x5f, (byte) 0x3e, (byte) 0xb9, (byte) 0x5d, (byte) 0xbe, (byte) 0xe0, (byte) 0x22, (byte) 0x03, (byte) 0xf8, (byte) 0xa3, (byte) 0x39, (byte) 0xa0, (byte) 0x99, (byte) 0x00, (byte) 0x00, (byte) 0x01, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0xdd, (byte) 0x09, (byte) 0x00, (byte) 0x10, (byte) 0x18, (byte) 0x02, (byte) 0x00, (byte) 0x00, (byte) 0x10, (byte) 0x00, (byte) 0x00};

    /*
     * TYPE:            AUTHENTICATION
     * Transmitter:     ac:5f:3e:b9:5d:be
     * Destination:     e0:22:03:f8:a3:39
     * Status String:   failure
     * Status Code:     1
     * Transaction Seq: 1
     */
    public static final byte[] AUTH_FAILED_1_HEADER = new byte[]{(byte) 0x00, (byte) 0x00, (byte) 0x12, (byte) 0x00, (byte) 0x2e, (byte) 0x48, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x02, (byte) 0x6c, (byte) 0x09, (byte) 0xa0, (byte) 0x00, (byte) 0xb7, (byte) 0x01, (byte) 0x00, (byte) 0x00};
    public static final byte[] AUTH_FAILED_1_PAYLOAD = new byte[]{(byte) 0xb0, (byte) 0x00, (byte) 0x3a, (byte) 0x01, (byte) 0xe0, (byte) 0x22, (byte) 0x03, (byte) 0xf8, (byte) 0xa3, (byte) 0x39, (byte) 0xac, (byte) 0x5f, (byte) 0x3e, (byte) 0xb9, (byte) 0x5d, (byte) 0xbe, (byte) 0xe0, (byte) 0x22, (byte) 0x03, (byte) 0xf8, (byte) 0xa3, (byte) 0x39, (byte) 0xa0, (byte) 0x99, (byte) 0x00, (byte) 0x00, (byte) 0x01, (byte) 0x00, (byte) 0x01, (byte) 0x00, (byte) 0xdd, (byte) 0x09, (byte) 0x00, (byte) 0x10, (byte) 0x18, (byte) 0x02, (byte) 0x00, (byte) 0x00, (byte) 0x10, (byte) 0x00, (byte) 0x00};

    /*
     * TYPE:            AUTHENTICATION
     * Transmitter:     ac:5f:3e:b9:5d:be
     * Destination:     e0:22:03:f8:a3:39
     * Status String:   Invalid/Unknown (5)
     * Status Code:     5
     * Transaction Seq: 1
     */
    public static final byte[] AUTH_INVALID_RESPONSE_1_HEADER = new byte[]{(byte) 0x00, (byte) 0x00, (byte) 0x12, (byte) 0x00, (byte) 0x2e, (byte) 0x48, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x02, (byte) 0x6c, (byte) 0x09, (byte) 0xa0, (byte) 0x00, (byte) 0xb7, (byte) 0x01, (byte) 0x00, (byte) 0x00};
    public static final byte[] AUTH_INVALID_RESPONSE_1_PAYLOAD = new byte[]{(byte) 0xb0, (byte) 0x00, (byte) 0x3a, (byte) 0x01, (byte) 0xe0, (byte) 0x22, (byte) 0x03, (byte) 0xf8, (byte) 0xa3, (byte) 0x39, (byte) 0xac, (byte) 0x5f, (byte) 0x3e, (byte) 0xb9, (byte) 0x5d, (byte) 0xbe, (byte) 0xe0, (byte) 0x22, (byte) 0x03, (byte) 0xf8, (byte) 0xa3, (byte) 0x39, (byte) 0xa0, (byte) 0x99, (byte) 0x00, (byte) 0x00, (byte) 0x01, (byte) 0x00, (byte) 0x05, (byte) 0x00, (byte) 0xdd, (byte) 0x09, (byte) 0x00, (byte) 0x10, (byte) 0x18, (byte) 0x02, (byte) 0x00, (byte) 0x00, (byte) 0x10, (byte) 0x00, (byte) 0x00};

    /*
     * TYPE:          DEAUTHENTICATION
     * Transmitter:   b0:93:5b:1d:c8:f1
     * Destination:   e4:b2:fb:27:50:15
     * BSSID:         b0:93:5b:1d:c8:f1
     * Reason Code:   6
     * Reason String: Class 2 frame received from nonauthenticated STA
    */
    public static final byte[] DEAUTH_1_HEADER = new byte[]{(byte) 0x00, (byte) 0x00, (byte) 0x12, (byte) 0x00, (byte) 0x2e, (byte) 0x48, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x02, (byte) 0x8a, (byte) 0x09, (byte) 0xa0, (byte) 0x00, (byte) 0xbb, (byte) 0x01, (byte) 0x00, (byte) 0x00};
    public static final byte[] DEAUTH_1_PAYLOAD = new byte[]{(byte) 0xc0, (byte) 0x08, (byte) 0x3a, (byte) 0x01, (byte) 0xe4, (byte) 0xb2, (byte) 0xfb, (byte) 0x27, (byte) 0x50, (byte) 0x15, (byte) 0xb0, (byte) 0x93, (byte) 0x5b, (byte) 0x1d, (byte) 0xc8, (byte) 0xf1, (byte) 0xb0, (byte) 0x93, (byte) 0x5b, (byte) 0x1d, (byte) 0xc8, (byte) 0xf1, (byte) 0x00, (byte) 0x10, (byte) 0x06, (byte) 0x00};

    /*
     * TYPE:          DEAUTHENTICATION
     * Transmitter:   c2:93:5b:1d:c8:f1
     * Destination:   0c:cb:85:5f:39:16
     * BSSID:         c2:93:5b:1d:c8:f1
     * Reason Code:   2
     * Reason String: Previous authentication no longer valid
     */
    public static final byte[] DEAUTH_2_HEADER = new byte[]{(byte) 0x00, (byte) 0x00, (byte) 0x12, (byte) 0x00, (byte) 0x2e, (byte) 0x48, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x02, (byte) 0x80, (byte) 0x09, (byte) 0xa0, (byte) 0x00, (byte) 0xbb, (byte) 0x01, (byte) 0x00, (byte) 0x00};
    public static final byte[] DEAUTH_2_PAYLOAD = new byte[]{(byte) 0xc0, (byte) 0x00, (byte) 0x3a, (byte) 0x01, (byte) 0x0c, (byte) 0xcb, (byte) 0x85, (byte) 0x5f, (byte) 0x39, (byte) 0x16, (byte) 0xc2, (byte) 0x93, (byte) 0x5b, (byte) 0x1d, (byte) 0xc8, (byte) 0xf1, (byte) 0xc2, (byte) 0x93, (byte) 0x5b, (byte) 0x1d, (byte) 0xc8, (byte) 0xf1, (byte) 0xa0, (byte) 0x10, (byte) 0x02, (byte) 0x00};

    /*
     * TYPE:          DISASSOCIATION
     * Transmitter:   b4:fb:e4:41:f6:45
     * Destination:   b0:70:2d:56:1c:f7
     * Reason Code:   8
     * Reason String: Disassociated because sending STA is leaving (or has left) BSS
    */
    public static final byte[] DISASSOC_1_HEADER = new byte[]{(byte) 0x00, (byte) 0x00, (byte) 0x12, (byte) 0x00, (byte) 0x2e, (byte) 0x48, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x02, (byte) 0x99, (byte) 0x09, (byte) 0xa0, (byte) 0x00, (byte) 0xef, (byte) 0x01, (byte) 0x00, (byte) 0x00};
    public static final byte[] DISASSOC_1_PAYLOAD = new byte[]{(byte) 0xa0, (byte) 0x00, (byte) 0x3a, (byte) 0x01, (byte) 0xb0, (byte) 0x70, (byte) 0x2d, (byte) 0x56, (byte) 0x1c, (byte) 0xf7, (byte) 0xb4, (byte) 0xfb, (byte) 0xe4, (byte) 0x41, (byte) 0xf6, (byte) 0x45, (byte) 0xb4, (byte) 0xfb, (byte) 0xe4, (byte) 0x41, (byte) 0xf6, (byte) 0x45, (byte) 0x10, (byte) 0x13, (byte) 0x08, (byte) 0x00};

    /*
     * TYPE:          DISASSOCIATION
     * Transmitter:   0c:54:a5:99:06:58
     * Destination:   60:14:b3:51:fe:6b
     * Reason Code:   2
     * Reason String: Previous authentication no longer valid
     */
    public static final byte[] DISASSOC_2_HEADER = new byte[]{(byte) 0x00, (byte) 0x00, (byte) 0x12, (byte) 0x00, (byte) 0x2e, (byte) 0x48, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x02, (byte) 0x6c, (byte) 0x09, (byte) 0xa0, (byte) 0x00, (byte) 0xb1, (byte) 0x01, (byte) 0x00, (byte) 0x00};
    public static final byte[] DISASSOC_2_PAYLOAD = new byte[]{(byte) 0xa0, (byte) 0x00, (byte) 0x3a, (byte) 0x01, (byte) 0x60, (byte) 0x14, (byte) 0xb3, (byte) 0x51, (byte) 0xfe, (byte) 0x6b, (byte) 0x0c, (byte) 0x54, (byte) 0xa5, (byte) 0x99, (byte) 0x06, (byte) 0x58, (byte) 0x0c, (byte) 0x54, (byte) 0xa5, (byte) 0x99, (byte) 0x06, (byte) 0x58, (byte) 0x30, (byte) 0x10, (byte) 0x02, (byte) 0x00};

    /*
     * TYPE:         PROBE_REQUEST
     * SSID:         ATT6r8YXW9
     * Requester:    3c:8d:20:25:20:e9
     * Is Broadcast: false
     */
    public static final byte[] PROBE_REQ_1_HEADER = new byte[]{(byte) 0x00, (byte) 0x00, (byte) 0x12, (byte) 0x00, (byte) 0x2e, (byte) 0x48, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x02, (byte) 0x80, (byte) 0x09, (byte) 0xa0, (byte) 0x00, (byte) 0xaf, (byte) 0x01, (byte) 0x00, (byte) 0x00};
    public static final byte[] PROBE_REQ_1_PAYLOAD = new byte[]{(byte) 0x40, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0x3c, (byte) 0x8d, (byte) 0x20, (byte) 0x25, (byte) 0x20, (byte) 0xe9, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0x30, (byte) 0x2b, (byte) 0x00, (byte) 0x0a, (byte) 0x41, (byte) 0x54, (byte) 0x54, (byte) 0x36, (byte) 0x72, (byte) 0x38, (byte) 0x59, (byte) 0x58, (byte) 0x57, (byte) 0x39, (byte) 0x01, (byte) 0x08, (byte) 0x02, (byte) 0x04, (byte) 0x0b, (byte) 0x0c, (byte) 0x12, (byte) 0x16, (byte) 0x18, (byte) 0x24, (byte) 0x03, (byte) 0x01, (byte) 0x05, (byte) 0x2d, (byte) 0x1a, (byte) 0x62, (byte) 0x00, (byte) 0x03, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x01, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x08, (byte) 0xe0, (byte) 0xe1, (byte) 0x09, (byte) 0x00, (byte) 0x32, (byte) 0x04, (byte) 0x30, (byte) 0x48, (byte) 0x60, (byte) 0x6c, (byte) 0x7f, (byte) 0x08, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x20, (byte) 0x00, (byte) 0x00, (byte) 0x40, (byte) 0xbf, (byte) 0x0c, (byte) 0x30, (byte) 0x70, (byte) 0xc0, (byte) 0x33, (byte) 0xfc, (byte) 0xff, (byte) 0x24, (byte) 0x01, (byte) 0xfc, (byte) 0xff, (byte) 0x24, (byte) 0x01};

    /*
     * TYPE:         PROBE_REQUEST
     * SSID:         TMobileWingman
     * Requester:    a8:51:5b:7f:1b:2d
     * Is Broadcast: false
     */
    public static final byte[] PROBE_REQ_2_HEADER = new byte[]{(byte) 0x00, (byte) 0x00, (byte) 0x12, (byte) 0x00, (byte) 0x2e, (byte) 0x48, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x02, (byte) 0x85, (byte) 0x09, (byte) 0xa0, (byte) 0x00, (byte) 0xb1, (byte) 0x01, (byte) 0x00, (byte) 0x00};
    public static final byte[] PROBE_REQ_2_PAYLOAD = new byte[]{(byte) 0x40, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xa8, (byte) 0x51, (byte) 0x5b, (byte) 0x7f, (byte) 0x1b, (byte) 0x2d, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xc0, (byte) 0xfe, (byte) 0x00, (byte) 0x0e, (byte) 0x54, (byte) 0x4d, (byte) 0x6f, (byte) 0x62, (byte) 0x69, (byte) 0x6c, (byte) 0x65, (byte) 0x57, (byte) 0x69, (byte) 0x6e, (byte) 0x67, (byte) 0x6d, (byte) 0x61, (byte) 0x6e, (byte) 0x01, (byte) 0x08, (byte) 0x02, (byte) 0x04, (byte) 0x0b, (byte) 0x0c, (byte) 0x12, (byte) 0x16, (byte) 0x18, (byte) 0x24, (byte) 0x32, (byte) 0x04, (byte) 0x30, (byte) 0x48, (byte) 0x60, (byte) 0x6c, (byte) 0x03, (byte) 0x01, (byte) 0x05, (byte) 0x2d, (byte) 0x1a, (byte) 0x6f, (byte) 0x01, (byte) 0x17, (byte) 0xff, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x01, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x7f, (byte) 0x08, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x40, (byte) 0xdd, (byte) 0x07, (byte) 0x00, (byte) 0x50, (byte) 0xf2, (byte) 0x08, (byte) 0x00, (byte) 0x13, (byte) 0x00};

    /*
     * TYPE:         PROBE_REQUEST
     * SSID:         [broadcast/wildcard]
     * Requester:    f8:da:0c:2e:af:1c
     * Is Broadcast: true
     */
    public static final byte[] PROBE_REQ_BROADCAST_1_HEADER = new byte[]{(byte) 0x00, (byte) 0x00, (byte) 0x12, (byte) 0x00, (byte) 0x2e, (byte) 0x48, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x02, (byte) 0x7b, (byte) 0x09, (byte) 0xa0, (byte) 0x00, (byte) 0xd5, (byte) 0x01, (byte) 0x00, (byte) 0x00};
    public static final byte[] PROBE_REQ_BROADCAST_1_PAYLOAD = new byte[]{(byte) 0x40, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xf8, (byte) 0xda, (byte) 0x0c, (byte) 0x2e, (byte) 0xaf, (byte) 0x1c, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0x10, (byte) 0xde, (byte) 0x00, (byte) 0x00, (byte) 0x01, (byte) 0x04, (byte) 0x02, (byte) 0x04, (byte) 0x0b, (byte) 0x16, (byte) 0x32, (byte) 0x08, (byte) 0x0c, (byte) 0x12, (byte) 0x18, (byte) 0x24, (byte) 0x30, (byte) 0x48, (byte) 0x60, (byte) 0x6c, (byte) 0x03, (byte) 0x01, (byte) 0x04, (byte) 0x2d, (byte) 0x1a, (byte) 0x20, (byte) 0x00, (byte) 0x1a, (byte) 0xff, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0xdd, (byte) 0x09, (byte) 0x00, (byte) 0x10, (byte) 0x18, (byte) 0x02, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0xdd, (byte) 0x1e, (byte) 0x00, (byte) 0x90, (byte) 0x4c, (byte) 0x33, (byte) 0x20, (byte) 0x00, (byte) 0x1a, (byte) 0xff, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00};

    /*
     * TYPE:        PROBE_RESPONSE
     * SSID:        Home 5F48
     * Destination: 3c:8d:20:52:e4:87
     * Transmitter: b0:93:5b:1d:c8:f1
     * Fingerprint: 2187f729bf5093a1347acac583c86a1ed72c5ce2df0ed2628cafcee4e78e591d
     * WPS:         true
     * Security:    WPA2-PSK-CCMP
     */
    public static final byte[] PROBE_RESP_1_HEADER = new byte[]{(byte) 0x00, (byte) 0x00, (byte) 0x12, (byte) 0x00, (byte) 0x2e, (byte) 0x48, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x02, (byte) 0x85, (byte) 0x09, (byte) 0xa0, (byte) 0x00, (byte) 0xbb, (byte) 0x01, (byte) 0x00, (byte) 0x00};
    public static final byte[] PROBE_RESP_1_PAYLOAD = new byte[]{(byte) 0x50, (byte) 0x00, (byte) 0x3a, (byte) 0x01, (byte) 0x3c, (byte) 0x8d, (byte) 0x20, (byte) 0x52, (byte) 0xe4, (byte) 0x87, (byte) 0xb0, (byte) 0x93, (byte) 0x5b, (byte) 0x1d, (byte) 0xc8, (byte) 0xf1, (byte) 0xb0, (byte) 0x93, (byte) 0x5b, (byte) 0x1d, (byte) 0xc8, (byte) 0xf1, (byte) 0xf0, (byte) 0x29, (byte) 0x25, (byte) 0x4c, (byte) 0x1f, (byte) 0xac, (byte) 0x08, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x64, (byte) 0x00, (byte) 0x31, (byte) 0x14, (byte) 0x00, (byte) 0x09, (byte) 0x48, (byte) 0x6f, (byte) 0x6d, (byte) 0x65, (byte) 0x20, (byte) 0x35, (byte) 0x46, (byte) 0x34, (byte) 0x38, (byte) 0x01, (byte) 0x08, (byte) 0x82, (byte) 0x84, (byte) 0x8b, (byte) 0x96, (byte) 0x8c, (byte) 0x12, (byte) 0x98, (byte) 0x24, (byte) 0x03, (byte) 0x01, (byte) 0x06, (byte) 0x07, (byte) 0x06, (byte) 0x55, (byte) 0x53, (byte) 0x20, (byte) 0x01, (byte) 0x0b, (byte) 0x1e, (byte) 0x2a, (byte) 0x01, (byte) 0x00, (byte) 0x32, (byte) 0x04, (byte) 0xb0, (byte) 0x48, (byte) 0x60, (byte) 0x6c, (byte) 0x46, (byte) 0x05, (byte) 0x73, (byte) 0xd0, (byte) 0x00, (byte) 0x00, (byte) 0x0c, (byte) 0x2d, (byte) 0x1a, (byte) 0xad, (byte) 0x01, (byte) 0x1b, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x01, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x04, (byte) 0x06, (byte) 0xe6, (byte) 0x47, (byte) 0x0d, (byte) 0x00, (byte) 0x3d, (byte) 0x16, (byte) 0x06, (byte) 0x08, (byte) 0x04, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x7f, (byte) 0x08, (byte) 0x00, (byte) 0x00, (byte) 0x0f, (byte) 0x02, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x40, (byte) 0xdd, (byte) 0x18, (byte) 0x00, (byte) 0x50, (byte) 0xf2, (byte) 0x02, (byte) 0x01, (byte) 0x01, (byte) 0x84, (byte) 0x00, (byte) 0x03, (byte) 0xa4, (byte) 0x00, (byte) 0x00, (byte) 0x27, (byte) 0xa4, (byte) 0x00, (byte) 0x00, (byte) 0x42, (byte) 0x43, (byte) 0x5e, (byte) 0x00, (byte) 0x62, (byte) 0x32, (byte) 0x2f, (byte) 0x00, (byte) 0xdd, (byte) 0x09, (byte) 0x00, (byte) 0x03, (byte) 0x7f, (byte) 0x01, (byte) 0x01, (byte) 0x00, (byte) 0x00, (byte) 0xff, (byte) 0x7f, (byte) 0xdd, (byte) 0x9f, (byte) 0x00, (byte) 0x50, (byte) 0xf2, (byte) 0x04, (byte) 0x10, (byte) 0x4a, (byte) 0x00, (byte) 0x01, (byte) 0x10, (byte) 0x10, (byte) 0x44, (byte) 0x00, (byte) 0x01, (byte) 0x02, (byte) 0x10, (byte) 0x3b, (byte) 0x00, (byte) 0x01, (byte) 0x03, (byte) 0x10, (byte) 0x47, (byte) 0x00, (byte) 0x10, (byte) 0x9d, (byte) 0xf4, (byte) 0xa8, (byte) 0x98, (byte) 0x78, (byte) 0x5c, (byte) 0x5d, (byte) 0xaf, (byte) 0x91, (byte) 0x12, (byte) 0x1a, (byte) 0xd2, (byte) 0xec, (byte) 0x40, (byte) 0x6c, (byte) 0x1a, (byte) 0x10, (byte) 0x21, (byte) 0x00, (byte) 0x1c, (byte) 0x41, (byte) 0x74, (byte) 0x68, (byte) 0x65, (byte) 0x72, (byte) 0x6f, (byte) 0x73, (byte) 0x20, (byte) 0x43, (byte) 0x6f, (byte) 0x6d, (byte) 0x6d, (byte) 0x75, (byte) 0x6e, (byte) 0x69, (byte) 0x63, (byte) 0x61, (byte) 0x74, (byte) 0x69, (byte) 0x6f, (byte) 0x6e, (byte) 0x73, (byte) 0x2c, (byte) 0x20, (byte) 0x49, (byte) 0x6e, (byte) 0x63, (byte) 0x2e, (byte) 0x10, (byte) 0x23, (byte) 0x00, (byte) 0x04, (byte) 0x41, (byte) 0x50, (byte) 0x78, (byte) 0x78, (byte) 0x10, (byte) 0x24, (byte) 0x00, (byte) 0x08, (byte) 0x41, (byte) 0x50, (byte) 0x78, (byte) 0x78, (byte) 0x2d, (byte) 0x78, (byte) 0x78, (byte) 0x78, (byte) 0x10, (byte) 0x42, (byte) 0x00, (byte) 0x12, (byte) 0x53, (byte) 0x65, (byte) 0x72, (byte) 0x69, (byte) 0x61, (byte) 0x6c, (byte) 0x20, (byte) 0x4e, (byte) 0x75, (byte) 0x6d, (byte) 0x62, (byte) 0x65, (byte) 0x72, (byte) 0x20, (byte) 0x48, (byte) 0x65, (byte) 0x72, (byte) 0x65, (byte) 0x10, (byte) 0x54, (byte) 0x00, (byte) 0x08, (byte) 0x00, (byte) 0x06, (byte) 0x00, (byte) 0x50, (byte) 0xf2, (byte) 0x04, (byte) 0x00, (byte) 0x01, (byte) 0x10, (byte) 0x11, (byte) 0x00, (byte) 0x09, (byte) 0x41, (byte) 0x74, (byte) 0x68, (byte) 0x65, (byte) 0x72, (byte) 0x6f, (byte) 0x73, (byte) 0x41, (byte) 0x50, (byte) 0x10, (byte) 0x08, (byte) 0x00, (byte) 0x02, (byte) 0x00, (byte) 0x04, (byte) 0x10, (byte) 0x3c, (byte) 0x00, (byte) 0x01, (byte) 0x02, (byte) 0x10, (byte) 0x49, (byte) 0x00, (byte) 0x06, (byte) 0x00, (byte) 0x37, (byte) 0x2a, (byte) 0x00, (byte) 0x01, (byte) 0x20, (byte) 0x30, (byte) 0x14, (byte) 0x01, (byte) 0x00, (byte) 0x00, (byte) 0x0f, (byte) 0xac, (byte) 0x04, (byte) 0x01, (byte) 0x00, (byte) 0x00, (byte) 0x0f, (byte) 0xac, (byte) 0x04, (byte) 0x01, (byte) 0x00, (byte) 0x00, (byte) 0x0f, (byte) 0xac, (byte) 0x02, (byte) 0x00, (byte) 0x00};

    /*
     * TYPE:        PROBE_RESPONSE
     * SSID:        xfinitywifi
     * Destination: 3c:8d:20:52:e4:87
     * Transmitter: c2:93:5b:1d:c8:f1
     * Fingerprint: 0fccc2740091c4a668b8b0f1e7a7ad4e93d62637b8cfb6a4cbb678b1d37477a6
     * WPS:         false
     * Security:    NONE
     */
    public static final byte[] PROBE_RESP_NO_SECURITY_1_HEADER = new byte[]{(byte) 0x00, (byte) 0x00, (byte) 0x12, (byte) 0x00, (byte) 0x2e, (byte) 0x48, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x02, (byte) 0x85, (byte) 0x09, (byte) 0xa0, (byte) 0x00, (byte) 0xb9, (byte) 0x01, (byte) 0x00, (byte) 0x00};
    public static final byte[] PROBE_RESP_NO_SECURITY_1_PAYLOAD = new byte[]{(byte) 0x50, (byte) 0x00, (byte) 0x3a, (byte) 0x01, (byte) 0x3c, (byte) 0x8d, (byte) 0x20, (byte) 0x52, (byte) 0xe4, (byte) 0x87, (byte) 0xc2, (byte) 0x93, (byte) 0x5b, (byte) 0x1d, (byte) 0xc8, (byte) 0xf1, (byte) 0xc2, (byte) 0x93, (byte) 0x5b, (byte) 0x1d, (byte) 0xc8, (byte) 0xf1, (byte) 0xd0, (byte) 0xb4, (byte) 0x48, (byte) 0x4d, (byte) 0x20, (byte) 0xac, (byte) 0x08, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x64, (byte) 0x00, (byte) 0x21, (byte) 0x04, (byte) 0x00, (byte) 0x0b, (byte) 0x78, (byte) 0x66, (byte) 0x69, (byte) 0x6e, (byte) 0x69, (byte) 0x74, (byte) 0x79, (byte) 0x77, (byte) 0x69, (byte) 0x66, (byte) 0x69, (byte) 0x01, (byte) 0x08, (byte) 0x82, (byte) 0x84, (byte) 0x8b, (byte) 0x96, (byte) 0x8c, (byte) 0x12, (byte) 0x98, (byte) 0x24, (byte) 0x03, (byte) 0x01, (byte) 0x06, (byte) 0x07, (byte) 0x06, (byte) 0x55, (byte) 0x53, (byte) 0x20, (byte) 0x01, (byte) 0x0b, (byte) 0x1e, (byte) 0x2a, (byte) 0x01, (byte) 0x00, (byte) 0x32, (byte) 0x04, (byte) 0xb0, (byte) 0x48, (byte) 0x60, (byte) 0x6c, (byte) 0x2d, (byte) 0x1a, (byte) 0xad, (byte) 0x01, (byte) 0x1b, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x01, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x04, (byte) 0x06, (byte) 0xe6, (byte) 0x47, (byte) 0x0d, (byte) 0x00, (byte) 0x3d, (byte) 0x16, (byte) 0x06, (byte) 0x08, (byte) 0x04, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x7f, (byte) 0x08, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x40, (byte) 0xdd, (byte) 0x18, (byte) 0x00, (byte) 0x50, (byte) 0xf2, (byte) 0x02, (byte) 0x01, (byte) 0x01, (byte) 0x84, (byte) 0x00, (byte) 0x03, (byte) 0xa4, (byte) 0x00, (byte) 0x00, (byte) 0x27, (byte) 0xa4, (byte) 0x00, (byte) 0x00, (byte) 0x42, (byte) 0x43, (byte) 0x5e, (byte) 0x00, (byte) 0x62, (byte) 0x32, (byte) 0x2f, (byte) 0x00, (byte) 0xdd, (byte) 0x09, (byte) 0x00, (byte) 0x03, (byte) 0x7f, (byte) 0x01, (byte) 0x01, (byte) 0x00, (byte) 0x00, (byte) 0xff, (byte) 0x7f};

}