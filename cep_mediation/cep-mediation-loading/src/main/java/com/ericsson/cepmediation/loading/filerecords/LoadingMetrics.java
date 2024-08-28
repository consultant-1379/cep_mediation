/*------------------------------------------------------------------------------
 *******************************************************************************
 * COPYRIGHT Ericsson 2015
 *
 * The copyright to the computer program(s) herein is the property of
 * Ericsson Inc. The programs may be used and/or copied only with written
 * permission from Ericsson Inc. or in accordance with the terms and
 * conditions stipulated in the agreement/contract under which the
 * program(s) have been supplied.
 *******************************************************************************
 *----------------------------------------------------------------------------*/
package com.ericsson.cepmediation.loading.filerecords;

import java.sql.Timestamp;
import java.util.HashMap;
import java.util.Map;

/**
 * This class is used to report metrics on file loading
 *
 * @author eeilfn
 *
 */
public class LoadingMetrics {
    // Variables for counting records and files
    private long records = 0;
    private long events = 0;
    private int files = 0;
    private long invalidRecords = 0;

    // Variables for times
    private long startTime = 0;
    private long endTime = 0;

    private Map<Integer, Long> enabledEventsCounter = new HashMap<Integer, Long>();

    /**
     * Get the number of records processed
     *
     * @return The number of records processed
     */
    public long getRecords() {
        return records;
    }

    /**
     * Set the number of records processed
     *
     * @param records
     *            the number of records processed
     */
    public void setRecords(final long records) {
        this.records = records;
    }

    /**
     * Increment the number of records processed
     *
     * @param the
     *            amount to increment the number of records processed by
     */
    public void incrementRecords(final long increment) {
        this.records += increment;
    }

    /**
     * Increments the number of events in the file which could not be loaded
     */
    public void incrementInvalidRecords() {
        this.invalidRecords++;
    }

    /**
     * Get the number of files processed
     *
     * @return the number of files processed
     */
    public int getFiles() {
        return files;
    }

    /**
     * Set the number of files processed
     *
     * @param the
     *            number of files processed
     */
    public void setFiles(final int files) {
        this.files = files;
    }

    /**
     * Get the number of events processed
     *
     * @return The number of events processed
     */
    public long getEvents() {
        return events;
    }

    /**
     * Set the number of events processed
     *
     * @param records
     *            the number of events processed
     */
    public void setEvents(final long events) {
        this.events = events;
    }

    /**
     * Increment the number of files processed
     *
     * @param the
     *            amount to increment the number of files processed by
     */
    public void incrementFiles(final int increment) {
        this.files += increment;
    }

    /**
     * Get the loading time
     *
     * @return the loading time
     */
    public long getLoadTime() {
        return endTime - startTime;
    }

    /**
     * Set the start time
     *
     * @param the
     *            start time
     */
    public void setStartTime(final long startTime) {
        this.startTime = startTime;
    }

    /**
     * Set the end time
     *
     * @param the
     *            end time
     */
    public void setEndTime(final long endTime) {
        this.endTime = endTime;
    }

    /**
     * get the enabledEventsCounter
     *
     * @param the
     *            enabledEventsCounter
     */
    public Map<Integer, Long> getEnabledEventsCounter() {
        return enabledEventsCounter;
    }

    /**
     * set the enabledEventsCounter
     *
     * @param the
     *            enabledEventsCounter
     */
    public void setEnabledEventsCounter(Map<Integer, Long> enabledEventsCounter) {
        this.enabledEventsCounter = enabledEventsCounter;
    }

    /**
     * Return this metric bean as a string
     */
    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();

        final long elapsedTime = endTime - startTime;

        builder.append("files=");
        builder.append(files);
        builder.append(",records=");
        builder.append(records);
        builder.append(",events=");
        builder.append(events);
        builder.append(",invalidRecords=");
        builder.append(invalidRecords);
        builder.append(",start time=");
        builder.append(new Timestamp(startTime));
        builder.append(",end time=");
        builder.append(new Timestamp(endTime));
        builder.append(",elapsed time=");
        builder.append(elapsedTime);
        builder.append(",records per ms=");
        builder.append(elapsedTime > 0 ? records / elapsedTime : 0);
        builder.append(",events per ms=");
        builder.append(elapsedTime > 0 ? events / elapsedTime : 0);

        return builder.toString();
    }
}
