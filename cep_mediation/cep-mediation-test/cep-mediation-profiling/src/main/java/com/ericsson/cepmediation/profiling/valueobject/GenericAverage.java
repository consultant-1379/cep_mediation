package com.ericsson.cepmediation.profiling.valueobject;

import com.ericsson.cepmediation.profiling.INTERVALS;

public class GenericAverage extends SystemData {
    public int average;

    private String data;

    private boolean isComputed = false;
    
    public GenericAverage(INTERVALS interval, long time) {
        super(interval, time);
    }
    
    private void compute() {
        if (!isComputed) {
            average = (int) (total / cnt);
            isComputed = true;
        }
    }

    public int getComputedValue() {
        compute();
        return average;
    }
    
    @Override
    public SystemData add(SystemData other) {
        if (! (other instanceof GenericAverage)) {
            throw new IllegalArgumentException();
        } 
        return super.add(other);
    }

    @Override
    public String getData() {
        compute();
        if (data == null) {
            data = average + "%";
        }
        return data;
    }

    @Override
    public SystemData nextInstance() {
        return new GenericAverage(interval, endTime + interval.getMillis());
    }

    @Override
    public String toString() {
        return "GenericAverage [average=" + average + ", data=" + data + ", isComputed=" + isComputed + ", time=" + endTime + ", total=" + total + ", cnt="
                + cnt + ", interval=" + interval + "]";
    }
}
