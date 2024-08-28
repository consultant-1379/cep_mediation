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

import java.util.Collection;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 * This class is a scheduler and it is responsible for the time based execution
 * in a frequent intervals from a specified start time.
 * 
 * @category platform
 * @since 29/04-2011
 * @author Eachsaj
 * 
 */
public class CollectionScheduler {
    // Get a reference to the logger
    private static final Logger logger = LoggerFactory.getLogger(CollectionScheduler.class);

    /**
     * A ThreadPoolExecutor that can additionally schedule commands to run after
     * a given delay, or to execute periodically.
     */
    private final ScheduledExecutorService scheduler;

    /**
     * Creates a new CollectionScheduler with the given core pool size of Jobs,
     * this pool size should be set by the caller.
     * Also see {@link java.util.concurrent.Executors#newScheduledThreadPool(int)}
     * @param poolSize
     *            , an integer value , represents the maximum number of tasks it
     *            can handle.
     *        
     */
    public CollectionScheduler(final int poolSize) {

        scheduler = Executors.newScheduledThreadPool(poolSize);

    }

    /**
     Creates and executes a periodic action that becomes enabled first after 
     *the given initial delay, and subsequently with the given delay between
     *the termination of one execution and the commencement of the next.
     *
     * @param jobDetails -  details of the jobs to create
     * 
     */
    public void setupTimedExecuter(Collection<WorkerDetails> jobDetails) {
        for (final WorkerDetails jobDetail : jobDetails) {
            scheduler.scheduleAtFixedRate(jobDetail.getJob(), jobDetail.getStartDelay(), jobDetail.getInterval(), jobDetail.getTimeUnit());
        }

    }

    /**
     * Initiates an orderly shutdown in which previously submitted tasks 
     * are executed, but no new tasks will be accepted. Invocation has no
     *  additional effect if already shut down.
     */
    public void shutDown() {
        scheduler.shutdown();// Disable new tasks from being submitted
        try {
            // Wait a while for existing tasks to terminate
            if (!scheduler.awaitTermination(60, TimeUnit.SECONDS)) {
                scheduler.shutdownNow(); // Cancel currently executing tasks
                // Wait a while for tasks to respond to being cancelled
                if (!scheduler.awaitTermination(60, TimeUnit.SECONDS)) {
                    logger.error("Pool did not terminate");
                }
            }
        } catch (final InterruptedException ie) {
            scheduler.shutdownNow();
        }
    }

    public boolean isShutDown() {
        return scheduler.isTerminated();
    }

    @Override
    public String toString() {
        return "CollectionScheduler [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
    }
}
