/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.test.common;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import com.ibm.icu.util.Calendar;

/**
 * @author eemecoy
 *
 */
public class DateTimeUtilities {

    private static DateFormat dateFormatterWithFourMilliseconds = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSSS");

    private static DateFormat dateFormatterWithThreeMilliseconds = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");

    private static SimpleDateFormat dateFormatForRopFileNames = new SimpleDateFormat("yyyyMMdd.HHmm");

    private static final String TIME_ZONE = "UTC";

    private static final long TWO_HOURS = 2 * 60 * 60 * 1000;

    // Set the time zone for the formatter as UTC
    static {
        dateFormatterWithFourMilliseconds.setTimeZone(TimeZone.getTimeZone(TIME_ZONE));
    }

    public static String getRopFilePrefixForNow() {
        Date date = new Date();
        return "A" + dateFormatForRopFileNames.format(date);
    }

    public static long timestampForTwoHoursAgo() {
        return System.currentTimeMillis() - TWO_HOURS;
    }

    private static long convertDateToTimestamp(final Date date) {
        return date.getTime();
    }

    public static long convertDateStringtoTimestamp(final String dateString) {
        try {
            return convertDateToTimestamp(dateFormatterWithFourMilliseconds.parse(dateString));
        } catch (final ParseException e) {
            throw new RuntimeException(e);
        }
    }

    public static String convertTimeStampToDateString(final long timestamp) {
        return dateFormatterWithFourMilliseconds.format(new Date(timestamp));
    }

    /**
     * Timestamp must be in format:
     * 2012-05-16 16:45:00.000
     */
    public static String subtractOneMillisecondFrom(String timestamp) {
        try {
            Date date = dateFormatterWithThreeMilliseconds.parse(timestamp);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            calendar.add(Calendar.MILLISECOND, -1);
            Date newDate = calendar.getTime();
            return dateFormatterWithThreeMilliseconds.format(newDate);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

}
