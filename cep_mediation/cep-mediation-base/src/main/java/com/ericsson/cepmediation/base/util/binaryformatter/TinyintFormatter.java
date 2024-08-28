package com.ericsson.cepmediation.base.util.binaryformatter;

public abstract class TinyintFormatter {
    public static byte[] doFormat(final byte value, final boolean isNull) {
        final byte[] ret = new byte[2];
        if (isNull) {
            ret[0] = 0;
            ret[1] = 1;
        } else {
            ret[0] = value;
            ret[1] = 0;
        }
        return ret;
    }

}
