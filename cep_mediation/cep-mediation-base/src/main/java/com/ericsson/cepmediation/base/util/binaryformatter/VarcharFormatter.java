package com.ericsson.cepmediation.base.util.binaryformatter;

public abstract class VarcharFormatter {

    public static byte[] doFormat(final String value, final int size) {

        final byte[] ret = new byte[size + 1];

        for (int i = 0; i < ret.length - 1; i++) {
            ret[i] = 32;
        }

        /**
        *
        * if the value is null, set the validation field to '0x01'
        * or set the validation field to '0x00'
        *
         */
        if (value == null) {
            ret[ret.length - 1] = 1;
        } else {
            ret[ret.length - 1] = 0;
        }

        if (value == null || value.length() == 0) {
            // If value is empty string or null, return blank byte array (null
            // byte array should not be returned for varchar format)
            return ret;
        }

        final byte[] arr = value.getBytes();

        int i = 0;
        for (i = 0; i < arr.length && i < ret.length - 1; i++) {
            ret[i] = arr[i];
        }

        return ret;
    }
}
