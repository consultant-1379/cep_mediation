package com.ericsson.cepmediation.base.util.binaryformatter;

import java.math.BigInteger;

public abstract class TimeFormatter {

    public byte[] doFormat(final String value, final boolean isLittleEndian) throws Exception {

        if (value == null || value.length() == 0) {
            final byte[] ret = new byte[9];
            for (int i = 0; i < 8; i++) {
                ret[i] = 0;
            }
            ret[8] = 1;

            return ret;

        } else {

            return UnsignedbigintFormatter.doFormat(getBinaryValue(value), isLittleEndian);

        }
    }

    static BigInteger getBinaryValue(String value) {
        final int pos = value.indexOf(".");
        String millis = null;
        if (pos > -1) {
            millis = value.substring(pos + 1);
            value = value.substring(0, pos);
        }
        // format is HH:mm:ss, parse values

        final long HH;
        final long mm;
        final long ss;
        final long ms;

        final String[] parts = value.split(":");
        HH = Long.parseLong(parts[0]);
        mm = Long.parseLong(parts[1]);
        ss = Long.parseLong(parts[2]);
        ms = millis != null && !millis.isEmpty() ? Long.parseLong(millis) : 0;

        final long msecs = ms + ss * 1000 + mm * 60000 + HH * 3600000;

        final BigInteger bsecs = BigInteger.valueOf(msecs);
        final BigInteger mses = BigInteger.valueOf(1000);

        return bsecs.multiply(mses);
    }

}
