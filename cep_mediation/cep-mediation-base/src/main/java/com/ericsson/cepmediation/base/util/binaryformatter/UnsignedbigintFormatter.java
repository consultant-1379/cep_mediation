package com.ericsson.cepmediation.base.util.binaryformatter;

import java.math.BigInteger;

public abstract class UnsignedbigintFormatter {

    public static byte[] doFormat(final BigInteger value, final boolean isLittleEndian, final boolean isNull) {
        if (isNull) {
            return createNull();
        } else {
            return doFormat(value, isLittleEndian);
        }
    }

    private static byte[] createNull() {
        final byte[] ret = new byte[9];
        for (int i = 0; i < 8; i++) {
            ret[i] = 0;
        }
        ret[8] = 1;

        return ret;
    }

    static byte[] doFormat(final BigInteger value, final boolean isLittleEndian) {

        final byte[] byteArr = value.toByteArray();
        final byte[] ret = new byte[9];

        for (int i = 0; i < 9; i++) {
            ret[i] = 0;
        }

        if (isLittleEndian) {
            int pos = byteArr.length - 1;

            for (int i = 0; i <= 7 && pos >= 0; i++) {
                ret[i] = byteArr[pos--];
            }
        } else {
            int pos = byteArr.length - 1;

            for (int i = 7; i >= 0 && pos >= 0; i--) {
                ret[i] = byteArr[pos--];
            }
        }

        return ret;

    }
}
