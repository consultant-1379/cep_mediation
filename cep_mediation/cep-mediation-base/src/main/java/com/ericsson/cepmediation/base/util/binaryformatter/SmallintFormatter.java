package com.ericsson.cepmediation.base.util.binaryformatter;

public abstract class SmallintFormatter {
    public static byte[] doFormat(final short value, final boolean isLittleEndian, final boolean isNull) {
        final byte[] ret = new byte[3];

        if (isNull) {
            ret[0] = 0;
            ret[1] = 0;
            ret[2] = 1;
        } else {
            if (isLittleEndian) {
                ret[0] = (byte) (value & 0xFF);
                ret[1] = (byte) ((value >> 8) & 0xFF);
            } else {
                ret[0] = (byte) ((value >> 8) & 0xFF);
                ret[1] = (byte) (value & 0xFF);
            }

            ret[2] = (byte) 0; // null byte
        }

        return ret;

    }
}
