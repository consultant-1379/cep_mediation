/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2013 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.eniq.events.cepmediation.datagen_precook.common;

import com.ericsson.cepmediation.base.util.DataConverters;

/**
 * @author eeikonl
 * @since 2013
 *
 */
public class GpehDateTime {

    private final int year;

    private final int month;

    private final int day;

    private final int hour;

    private final int minute;

    private final int second;

    public GpehDateTime(final byte[] data) {
        year = DataConverters.getShort(data, 0, false, 2);
        month = DataConverters.getShort(data, 2, false, 1);
        day = DataConverters.getShort(data, 3, false, 1);
        hour = DataConverters.getShort(data, 4, false, 1);
        minute = DataConverters.getShort(data, 5, false, 1);
        second = DataConverters.getShort(data, 6, false, 1);
    }

    /**
     * @return the year
     */
    public int getYear() {
        return year;
    }

    /**
     * @return the month
     */
    public int getMonth() {
        return month;
    }

    /**
     * @return the day
     */
    public int getDay() {
        return day;
    }

    /**
     * @return the hour
     */
    public int getHour() {
        return hour;
    }

    /**
     * @return the minute
     */
    public int getMinute() {
        return minute;
    }

    /**
     * @return the second
     */
    public int getSecond() {
        return second;
    }

}
