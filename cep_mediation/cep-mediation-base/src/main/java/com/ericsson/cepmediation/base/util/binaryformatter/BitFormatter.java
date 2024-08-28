package com.ericsson.cepmediation.base.util.binaryformatter;

public abstract class BitFormatter {
    public static byte[] doFormat(final byte b) {
        return new byte[] { b, (byte) 0 };
    }
}
