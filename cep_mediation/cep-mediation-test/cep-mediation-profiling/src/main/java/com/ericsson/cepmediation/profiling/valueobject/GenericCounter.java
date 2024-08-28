package com.ericsson.cepmediation.profiling.valueobject;

import com.ericsson.cepmediation.profiling.INTERVALS;

public class GenericCounter extends SystemData {

    public GenericCounter(INTERVALS interval, long time) {
        super(interval, time);
    }

    @Override
    public int getComputedValue() {
        return (int) total;
    }

    @Override
    public SystemData nextInstance() {
        return new GenericCounter(interval, endTime + interval.getMillis());
    }

    @Override
    public String getData() {
        return String.valueOf(total);
    }
}
