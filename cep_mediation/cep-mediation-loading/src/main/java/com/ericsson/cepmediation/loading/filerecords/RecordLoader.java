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

import java.io.File;
import java.util.Collection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.cepmediation.base.publishing.Publisher;
import com.ericsson.cepmediation.loading.events.EventHeaderRecordHandler;
import com.ericsson.cepmediation.loading.events.EventRecordHandler;

/**
 * This class loads a list of files into memory, parses them into CSV format,
 * and stores them into the database
 *
 * @author evikkua
 *
 */
public class RecordLoader {

    // Get a reference to the logger
    private static final Logger logger = LoggerFactory
            .getLogger(RecordLoader.class);

    /**
     * Method that loads the list of files, parses them, and stores them to the
     * database
     *
     * @param recordDescriptor
     *            The descriptor of the records for the files in question
     * @param schemaTypeHandlerName
     *            Name of schema, used only for logging
     * @param fileList
     *            The list of files to process
     * @param publishers
     *            A list of publishers to flush after the records are loaded
     */
    public LoadingMetrics load(final RecordDescriptor recordDescriptor,
            final String schemaTypeHandlerName,
            final Collection<File> fileList, final Publisher[] publishers) {
        // Declare a metrics bean to hold the metrics for this run
        final LoadingMetrics loadingMetrics = new LoadingMetrics();

        // Clear the number of events handled by each record handler
        for (final RecordHandler recordHandler : recordDescriptor
                .getHandlerMap().values()) {
            recordHandler.clearEventsProcessed();
        }

        // Always put handling of a file in try/catch to capture unforeseen
        // parsing errors
        try {
            // Record the start time
            loadingMetrics.setStartTime(System.currentTimeMillis());

            // Iterate over the list of files
            for (final File file : fileList) {
                logger.info("processing " + file);

                // Increment the number of files processed by 1
                loadingMetrics.incrementFiles(1);

                try {
                    // Set the name of the file that is currently being parsed
                    for (Publisher publisher : publishers) {
                        publisher.setCurrentFileName(file.getName());
                    }

                    // Get NE Name and Time Zone information from the file name
                    ((EventHeaderRecordHandler) recordDescriptor
                            .getHeaderHandler()).extractFileNameFields(file);
                    // Load all the records into a record buffer
                    final RecordBuffer recordBuffer = new RecordBuffer(file,
                            recordDescriptor);

                    // Process each record in the record buffer
                    recordBuffer.process();

                    // Increment the number of records processed
                    loadingMetrics.incrementRecords(recordBuffer
                            .getRecordList().size());
                } catch (final Exception e) {
                    logger.warn("error processing event file \"" + file + "\"",
                            e);
                }
            }
        } catch (final Exception e) {
            logger.warn("error processing event files", e);
        }

        // Count the number of events handled by each record handler
        for (final RecordHandler recordHandler : recordDescriptor
                .getHandlerMap().values()) {
            loadingMetrics.setEvents(loadingMetrics.getEvents()
                    + recordHandler.getEventsProcessed());

            if (recordHandler instanceof EventRecordHandler) {
                loadingMetrics
                        .setEnabledEventsCounter(((EventRecordHandler) recordHandler)
                                .getEnabledEventsCounter());
            }
        }

        // Record the finish time for the processing and storing
        loadingMetrics.setEndTime(System.currentTimeMillis());

        logLoadingPerformance(schemaTypeHandlerName, loadingMetrics);

        // Flush the publishers

        final long flushStart = System.currentTimeMillis();
        for (final Publisher publisher : publishers) {
            // This is an active flush
            publisher.flush();
        }
        logBusPerformance(schemaTypeHandlerName, loadingMetrics.getEvents(),
                (System.currentTimeMillis() - flushStart));

        return loadingMetrics;
    }

    private void logLoadingPerformance(final String schema,
            final LoadingMetrics metrics) {
        final StringBuilder res = new StringBuilder();
        res.append("loading_performance: schema=" + schema);
        res.append(", events=" + metrics.getEvents());
        res.append(", time ms=" + metrics.getLoadTime());
        res.append(", events per ms= "
                + (metrics.getLoadTime() > 0 ? metrics.getEvents()
                        / metrics.getLoadTime() : -1));

        logger.info(res.toString());
    }

    private void logBusPerformance(final String schema, final long events,
            final long duration) {
        final StringBuilder res = new StringBuilder();
        res.append("bus_performance: schema=" + schema);
        res.append(", events=" + events);
        res.append(", time ms=" + duration);
        res.append(", events per ms= "
                + (duration > 0 ? events / duration : -1));

        logger.info(res.toString());
    }
}