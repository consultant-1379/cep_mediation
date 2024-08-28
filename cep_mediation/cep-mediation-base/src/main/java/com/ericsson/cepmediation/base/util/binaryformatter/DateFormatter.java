package com.ericsson.cepmediation.base.util.binaryformatter;

import java.util.Calendar;

public abstract class DateFormatter {

    /**
     * Date specific format String form of date is "YYYY-MM-DD"
     */
    public static byte[] doFormat(final String value, final boolean isLittleEndian) {

        if (value == null || value.length() == 0) {
            final byte[] ret = new byte[5];
            for (int i = 0; i < 4; i++) {
                ret[i] = 0;
            }
            ret[4] = 1;

            return ret;

        } else {

            return UnsignedintFormatter.doFormat(getBinaryValue(value), isLittleEndian, false);

        }

    }

    static long getBinaryValue(String value) {
        int YYYY;
        final int MM, DD, jDay;

        final Calendar c = Calendar.getInstance();

        //remove time info if present
        final int pos = value.indexOf(" ");
        if (pos > -1) {
            value = value.substring(0, pos);
        }

        final String[] parts = value.split("-");
        YYYY = Integer.parseInt(parts[0]);
        MM = Integer.parseInt(parts[1]);
        DD = Integer.parseInt(parts[2]);

        c.set(YYYY, MM - 1, DD);
        jDay = c.get(Calendar.DAY_OF_YEAR);

        // Do the trick
        YYYY--;
        return (YYYY * 365) + (YYYY / 4) - (YYYY / 100) + (YYYY / 400) + 366 + jDay - 1;
    }

}
