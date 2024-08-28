package com.ericsson.cepmediation.base.util.binaryformatter;

import java.math.BigInteger;

public abstract class DatetimeFormatter {
    public static byte[] doFormat(final String value, final boolean isLittleEndian) {
        // format is YYYY-MM-DD HH:mm:ss.S parse values

        if (value == null || value.length() == 0) {
            final byte[] ret = new byte[9];
            for (int i = 0; i < 8; i++) {
                ret[i] = 0;
            }
            ret[8] = 1;

            return ret;

        } else {

            final String[] parts = value.split(" ");

            if (parts.length != 2) {
                throw new IllegalArgumentException("Unknown datetime format: " + value);
            }

            final BigInteger binaryDateValue = BigInteger.valueOf(DateFormatter.getBinaryValue(parts[0]));
            final BigInteger binaryTimeValue = TimeFormatter.getBinaryValue(parts[1]);

            final BigInteger hos_date_scale = BigInteger.valueOf(86400000000L);

            final BigInteger binarydatetimevalue = binaryDateValue.multiply(hos_date_scale).add(binaryTimeValue);

            return UnsignedbigintFormatter.doFormat(binarydatetimevalue, isLittleEndian, false);

        }
    }

}
