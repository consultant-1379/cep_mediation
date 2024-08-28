package com.ericsson.cepmediation.base.util.binaryformatter;

public abstract class BinaryFormatter {

    /**
     * Accepts NULL and all that.
     */
    public static byte[] doFormat(byte[] value, final int expectedSize) {
        if (value == null || value.length != expectedSize) {
            value = new byte[expectedSize + 1];
            value[value.length - 1] = 1;
            return value;
        }
        final byte[] result = new byte[expectedSize + 1];
        System.arraycopy(value, 0, result, 0, expectedSize);
        result[result.length - 1] = 0;
        return result;

    }
}
