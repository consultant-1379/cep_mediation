package com.ericsson.cepmediation.profiling.valueobject;

import com.ericsson.cepmediation.profiling.INTERVALS;

public abstract class SystemData {
    protected long endTime;

    protected double total;

    protected int cnt;
    
    protected INTERVALS interval;
    
    private long startTime;
    
    public SystemData(INTERVALS interval, long time) {
        this.endTime = time;
        this.startTime = time - interval.getMillis();
        this.interval = interval;
    }

    public void submit(Number d) {
        total += d.doubleValue();
        cnt++;
    }
    
    public SystemData add(SystemData other) {
        if (interval != other.interval) {
            throw new IllegalArgumentException("Cannot add data for different intervals! This: " + interval + " Other: " + other.interval);
        }
        
        SystemData res = nextInstance();
        res.total = total + other.total;
        res.cnt = cnt + other.cnt;
        return res;
    }
    
    public abstract int getComputedValue();
    
    public abstract SystemData nextInstance();
    
    public abstract String getData();

    public long getEndTime() {
        return endTime;
    }
    
    public long getStartTime(){
        return startTime;
    }

    public int getTotal() {
        return (int) total;
    }

    public int getCount() {
        return cnt;
    }

    @Override
    public String toString() {
        return "SystemData [time=" + endTime + ", total=" + total + ", cnt=" + cnt + ", interval=" + interval + "]";
    }

}
