package com.ericsson.cepmediation.base.util.binaryformatter;

public abstract class UnsignedintFormatter {

    public static byte[] doFormat(final long value, final boolean isLittleEndian, final boolean isNull) {
        final byte[] ret = new byte[5];
        if (isNull) {
            for (int i = 0; i < 4; i++) {
                ret[i] = (byte) 0;
            }
            ret[4] = (byte) 1;

        } else {
            if (isLittleEndian) {
                ret[0] = (byte) (value & 0xFF);
                ret[1] = (byte) ((value >> 8) & 0xFF);
                ret[2] = (byte) ((value >> 16) & 0xFF);
                ret[3] = (byte) ((value >> 24) & 0xFF);
            } else {
                ret[0] = (byte) ((value >> 24) & 0xFF);
                ret[1] = (byte) ((value >> 16) & 0xFF);
                ret[2] = (byte) ((value >> 8) & 0xFF);
                ret[3] = (byte) (value & 0xFF);
            }

            ret[4] = (byte) 0; // null byte
        }

        return ret;
    }

}
