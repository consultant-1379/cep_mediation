/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.base.util.threadpool;

/**
 * @author eemecoy
 *
 */
public abstract class AbstractJob implements Worker {

    /**
     * A string representation of task {@link Name.@see {@link #getJobName()};
     */
    protected String jobName;

    /*
     * A string represents the status of the job for more info @see
     * {@link #getJobStatus()}
     */
    protected String jobStatus;

    /**
     * A boolean representation of the jobStatus
     */
    private boolean isfinished;

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Runnable#run()
     */
    @Override
    public final void run() {
        jobStatus = "Starting job " + jobName;
        isfinished = false;
        executeJob();// further job status can be set by calling
                     // setJobStatus(String status ) method by child class
        isfinished = true;
        jobStatus = "Finished job " + jobName;
    }

    /*
     * (non-Javadoc)
     */
    @Override
    public final String getJobName() {
        return jobName;
    }

    /*
     * (non-Javadoc)
     */
    @Override
    public final String getJobStatus() {
        return jobStatus;
    }

    /*
     */
    @Override
    public Object isfinished() {
        return isfinished;
    }

}
