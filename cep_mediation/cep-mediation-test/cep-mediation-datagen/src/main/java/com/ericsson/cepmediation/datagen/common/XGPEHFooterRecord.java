package com.ericsson.cepmediation.datagen.common;


public class XGPEHFooterRecord extends XRecord {
    private int year = 0;

    private int month = 0;

    private int day = 0;

    private int hour = 0;

    private int minute = 0;

    private int second = 0;

    public XGPEHFooterRecord(final int year, final int month, final int day, final int hour, final int minute,
            final int second) {
        super();
        this.year = year;
        this.month = month;
        this.day = day;
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public XGPEHFooterRecord(final GpehDateTime date) {
        super();
        this.year = date.getYear();
        this.month = date.getMonth();
        this.day = date.getDay();
        this.hour = date.getHour();
        this.minute = date.getMinute();
        this.second = date.getSecond();
    }

    @Override
    protected int getRecordLength() {
        return 7;
    }

    @Override
    protected void buildRecord() {
        if (year < 0 || year > 9999) {
            throw new IllegalArgumentException("year");
        }
        insertShort((short) year, 0);

        if (month < 0 || month > 12) {
            throw new IllegalArgumentException("month");
        }
        insertByte((byte) month, 2);

        if (day < 0 || day > 31) {
            throw new IllegalArgumentException("day");
        }
        insertByte((byte) day, 3);

        if (hour < 0 || hour > 23) {
            throw new IllegalArgumentException("hour");
        }
        insertByte((byte) hour, 4);

        if (minute < 0 || minute > 59) {
            throw new IllegalArgumentException("minute");
        }
        insertByte((byte) minute, 5);

        if (second < 0 || second > 59) {
            throw new IllegalArgumentException("second");
        }
        insertByte((byte) second, 6);
    }

    public int getYear() {
        return year;
    }

    public void setYear(final int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(final int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(final int day) {
        this.day = day;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(final int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(final int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(final int second) {
        this.second = second;
    }
}
