/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.base.util.threadpool;

import java.util.concurrent.TimeUnit;

/**
 * @author eemecoy
 *
 */
public class WorkerDetails {

    private Worker job;

    private int startDelay;

    private int interval;

    private TimeUnit timeUnit;

    /**
     * 
     * @param job -  An instance of Worker interface 
     * @param startDelay - the time to delay first execution
     * @param interval  -the period between successive executions
     * @param timeUnit- the time unit of the initialDelay and period parameters 
     * 
     */
    public WorkerDetails(Worker job, int startDelay, int interval, TimeUnit timeUnit) {
        this.setJob(job);
        this.setStartDelay(startDelay);
        this.setInterval(interval);
        this.setTimeUnit(timeUnit);
    }

    /**
     * @return the job
     */
    public Worker getJob() {
        return job;
    }

    /**
     * @param job the job to set
     */
    public void setJob(Worker job) {
        this.job = job;
    }

    /**
     * @return the startDelay
     */
    public int getStartDelay() {
        return startDelay;
    }

    /**
     * @param startDelay the startDelay to set
     */
    public void setStartDelay(int startDelay) {
        this.startDelay = startDelay;
    }

    /**
     * @return the interval
     */
    public int getInterval() {
        return interval;
    }

    /**
     * @param interval the interval to set
     */
    public void setInterval(int interval) {
        this.interval = interval;
    }

    /**
     * @return the timeUnit
     */
    public TimeUnit getTimeUnit() {
        return timeUnit;
    }

    /**
     * @param timeUnit the timeUnit to set
     */
    public void setTimeUnit(TimeUnit timeUnit) {
        this.timeUnit = timeUnit;
    }

}
