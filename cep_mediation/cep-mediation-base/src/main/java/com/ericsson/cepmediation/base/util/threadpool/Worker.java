/**
 * (C) Copyright LM Ericsson System Expertise AT/LMI, 2011
 *
 * The copyright to the computer program(s) herein is the property of Ericsson
 * System Expertise EEI, Sweden. The program(s) may be used and/or copied only
 * with the written permission from Ericsson System Expertise AT/LMI or in
 * accordance with the terms and conditions stipulated in the agreement/contract
 * under which the program(s) have been supplied.
 *
 */
package com.ericsson.cepmediation.base.util.threadpool;

/**
 * 
 * This Interface represents a Runnable task, This Interface has one abstract class 
 * {@link AbstractJob}. Application do not requires to directly provide any implementation
 * for this class
 * 
 * @category platform
 * @since 29/04/2011
 * @author Eachsaj
 * 
 */
public interface Worker extends Runnable {

    /**
     * The method must be provided by the subclass. This method represents a
     * single task to be executed. This method will be called by the
     * {@link #run()} method of this class when the
     * {@link CollectionScheduler#setupTimedExecuter(Worker[], long, long, java.util.concurrent.TimeUnit)}
     * starts.
     */
    void executeJob();

    /**
     * A way to get the current job status, a true means current running job finished otherwise false
     * if a scheduled job is not started, this will returns false value;
     * @return a boolean true if the job finished otherwise false
     */
    Object isfinished();

    /**Representation of String job status.
     * return the job status as a String
     */
    String getJobStatus();

    /** 
     * Returns a String type current job's name
     * @see #jobName
     */
    String getJobName();

}