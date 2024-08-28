package com.ericsson.cepmediation.base.util.binaryformatter;

public abstract class BigintFormatter {
    public static byte[] doFormat(final long l, final boolean isLittleEndian, final boolean isNull) {
        final byte[] ret = new byte[9];
        if (isNull) {
            for (int i = 0; i < 8; i++) {
                ret[i] = (byte) 0;
            }
            ret[8] = (byte) 1;
        } else {
            if (isLittleEndian) {
                ret[0] = (byte) (l & 0xFF);
                ret[1] = (byte) ((l >> 8) & 0xFF);
                ret[2] = (byte) ((l >> 16) & 0xFF);
                ret[3] = (byte) ((l >> 24) & 0xFF);
                ret[4] = (byte) ((l >> 32) & 0xFF);
                ret[5] = (byte) ((l >> 40) & 0xFF);
                ret[6] = (byte) ((l >> 48) & 0xFF);
                ret[7] = (byte) ((l >> 56) & 0xFF);
            } else {
                ret[0] = (byte) ((l >> 56) & 0xFF);
                ret[1] = (byte) ((l >> 48) & 0xFF);
                ret[2] = (byte) ((l >> 40) & 0xFF);
                ret[3] = (byte) ((l >> 32) & 0xFF);
                ret[4] = (byte) ((l >> 24) & 0xFF);
                ret[5] = (byte) ((l >> 16) & 0xFF);
                ret[6] = (byte) ((l >> 8) & 0xFF);
                ret[7] = (byte) (l & 0xFF);
            }

            ret[8] = (byte) 0; // null byte
        }
        return ret;
    }

}
