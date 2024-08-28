package com.ericsson.cepmediation.loading.staple;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import java.util.zip.GZIPInputStream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.cepmediation.apeventbeans.bearer_plane.FLASH_VIDEO_REPORT;
import com.ericsson.cepmediation.apeventbeans.bearer_plane.FLASH_VIDEO_REPORT_PARTIAL;
import com.ericsson.cepmediation.apeventbeans.bearer_plane.TCP_REPORT;
import com.ericsson.cepmediation.apeventbeans.bearer_plane.TCP_REPORT_PARTIAL;
import com.ericsson.cepmediation.base.apeventbeans.ApEventBean;
import com.ericsson.cepmediation.base.features.impl.FeatureManagerImpl;
import com.ericsson.cepmediation.base.meta.admin.SchemaTypeHandler;
import com.ericsson.cepmediation.base.meta.schema.Event;
import com.ericsson.cepmediation.base.meta.schema.Schema;
import com.ericsson.cepmediation.base.publishing.Publisher;
import com.ericsson.cepmediation.base.statistics.Statistics;
import com.ericsson.cepmediation.base.statistics.StatisticsAware;
import com.ericsson.cepmediation.base.statistics.StatisticsCollector;
import com.ericsson.cepmediation.base.util.Metrics;
import com.ericsson.cepmediation.loading.filerecords.LoadingMetrics;

/**
 * This class loads a list of Staple text files into memory, parses them, and stores them into
 * the database
 * 
 * @author epstvxj
 */
public class LoadStaple implements StatisticsAware {
    // Get a reference to the logger
    private static final Logger logger = LoggerFactory.getLogger(LoadStaple.class);

    // Get a reference to the metrics logger
    private static final Logger metricLogger = LoggerFactory.getLogger(Metrics.class);

    // Get the event class package name
    private static final String EVENT_CLASS_PACKAGE = "com.ericsson.cepmediation.apeventbeans";

    private static final String SCHEMA_TYPE_HANDLER_NAME = "bearer_plane_pa1";

    // Constants for processing of Staple files
    private static final String STAPLE_FILE_PREFIX = "_staple_";

    private static final String TCPTA_FILE_PREFIX = "tcpta";

    private static final String TCPTA_PARTIAL_FILE_PREFIX = "tcpta-partial";

    private static final String FLV_FILE_PREFIX = "flv";

    private static final String FLV_PARTIAL_FILE_PREFIX = "flv-partial";

    private static AtomicLong numberOfRecordsParsed = new AtomicLong(0);

    public LoadStaple() {
        super();
        StatisticsCollector.registerMe(this);
    }

    @Override
    public void exportTo(final Statistics statistics) {
        statistics.add(Statistics.Keys.STAPLE_NUMBER_OF_RECORDS_PARSED, numberOfRecordsParsed.getAndSet(0l));
    }

    /**
     * Method that loads a list of Staple files, parses them, and stores them
     * 
     * @param fileList The list of files to process
     * @param publishers The publishers to use to publish events
     */
    public LoadingMetrics load(final SchemaTypeHandler schemaTypeHandler, final Collection<File> fileList, final Publisher[] publishers) {
        // Declare a metrics bean to hold the metrics for this run
        final LoadingMetrics loadingMetrics = new LoadingMetrics();

        // Always put handling of a file in try/catch to capture unforeseen parsing errors
        try {
            // Record the start time
            loadingMetrics.setStartTime(System.currentTimeMillis());

            Set<Integer> enabledEvents = FeatureManagerImpl.getInstance().getEnabledUserPlaneEvents();

            // Iterate over the list of files
            for (final File file : fileList) {
                logger.debug("processing " + file);

                // Increment the number of files processed by 1
                loadingMetrics.incrementFiles(1);

                // Find out what type of file we are dealing with
                final STAPLE_FILE_TYPE stapleFileType = getStapleFileType(file);

                // Check if we found a valid file type
                if (stapleFileType.equals(STAPLE_FILE_TYPE.INVALID)) {
                    logger.warn("error processing event file \"" + file + "\"" + ", invalid staple file type specified");
                    continue;
                }

                final Schema schema = schemaTypeHandler.getSchemaMap().get(SCHEMA_TYPE_HANDLER_NAME);

                final Event event = getEvent(schema, stapleFileType);
                if (event == null) {
                    logger.warn("Invalid staple file type encountered");
                    continue;
                }

                if (!enabledEvents.contains(event.getId())) {
                    logger.debug("Event " + event.getName() + " is not enabled and will be skipped.");
                    continue;
                }

                // Read and process the file
                try {
                    // Process the file and get the number of records processed
                    final int recordsProcessed = processStapleFile(file, schema, event, publishers, loadingMetrics, schemaTypeHandler);

                    // Increment the number of records processed
                    loadingMetrics.incrementRecords(recordsProcessed);
                    loadingMetrics.setEvents(loadingMetrics.getEvents() + recordsProcessed);
                } catch (final Exception e) {
                    logger.warn("error processing event file \"" + file + "\"" + e, e);
                }
            }
        } catch (final Exception e) {
            logger.warn("error processing event files", e);
        }

        // Record the finish time for the processing and storing 
        loadingMetrics.setEndTime(System.currentTimeMillis());

        logLoadingPerformance(schemaTypeHandler.getName(), loadingMetrics);

        // Flush the publishers
        for (final Publisher publisher : publishers) {
            publisher.flush();
        }

        metricLogger.trace(loadingMetrics.toString());

        return loadingMetrics;
    }

    private void logLoadingPerformance(final String schema, final LoadingMetrics metrics) {
        final StringBuilder res = new StringBuilder();
        res.append("loading_performance: schema=" + schema);
        res.append(", events=" + metrics.getEvents());
        res.append(", time ms=" + metrics.getLoadTime());
        res.append(", events per ms= " + (metrics.getLoadTime() > 0 ? metrics.getEvents() / metrics.getLoadTime() : -1));

        logger.info(res.toString());
    }

    /**
     * Method to get the type of Staple file we are dealing with from the file name
     * @param stapleFile The input file type
     * @return The type of staple file
     */
    private STAPLE_FILE_TYPE getStapleFileType(final File stapleFile) {
        // Get the staple file type start position and check it
        final int fileTypeStartPos = stapleFile.getName().indexOf(STAPLE_FILE_PREFIX);
        if (fileTypeStartPos == -1) {
            return STAPLE_FILE_TYPE.INVALID;
        }

        // Get the file type prefix, its the file name up to the underscore
        String fileTypePrefix = stapleFile.getName().substring(fileTypeStartPos + STAPLE_FILE_PREFIX.length());

        // Get the staple file type end position and check it
        final int fileTypeEndPos = fileTypePrefix.indexOf('_');
        if (fileTypeEndPos == -1) {
            return STAPLE_FILE_TYPE.INVALID;
        }

        // Now, we have the complete file type
        fileTypePrefix = fileTypePrefix.substring(0, fileTypeEndPos);

        // Now, check each prefix in turn
        if (fileTypePrefix.equals(TCPTA_FILE_PREFIX)) {
            return STAPLE_FILE_TYPE.TCP_REPORT;
        } else if (fileTypePrefix.equals(TCPTA_PARTIAL_FILE_PREFIX)) {
            return STAPLE_FILE_TYPE.TCP_REPORT_PARTIAL;
        } else if (fileTypePrefix.equals(FLV_FILE_PREFIX)) {
            return STAPLE_FILE_TYPE.FLASH_VIDEO_REPORT;
        } else if (fileTypePrefix.equals(FLV_PARTIAL_FILE_PREFIX)) {
            return STAPLE_FILE_TYPE.FLASH_VIDEO_REPORT_PARTIAL;
        } else {
            return STAPLE_FILE_TYPE.INVALID;
        }
    }

    /**
     * Method to process a staple file; read all records and generate an event for each one 
     * @param stapleFile
     * @param publishers
     * @param loadingMetrics                                                                                
     * @param schemaTypeHandler
     * @return
     * @throws IOException
     * @throws InstantiationException
     * @throws IllegalAccessException
     * @throws ClassNotFoundException
     */
    private int processStapleFile(final File stapleFile, Schema schema, Event event, final Publisher[] publishers, final LoadingMetrics loadingMetrics,
            final SchemaTypeHandler schemaTypeHandler) throws IOException, InstantiationException, IllegalAccessException, ClassNotFoundException {

        // Declare an input stream for the file
        InputStream stapleFileInputStream = null;

        // Check if the file is compressed
        if (stapleFile.getName().endsWith(".gz")) {
            // The file is a compressed file, open and read it
            stapleFileInputStream = new GZIPInputStream(new FileInputStream(stapleFile));
        } else {
            // The file is not compressed, open and read it
            stapleFileInputStream = new FileInputStream(stapleFile);
        }

        // Open and read the file
        final BufferedReader stapleBufferedReader = new BufferedReader(new InputStreamReader(stapleFileInputStream));

        // record the number of lines processed
        int lines = 0;

        // Read the file line by line
        for (String line = stapleBufferedReader.readLine(); line != null; line = stapleBufferedReader.readLine()) {
            // Increment the number of lines processed
            lines++;

            numberOfRecordsParsed.incrementAndGet();

            final ApEventBean apEventBean = parseRecord(schema, event, line);

            // Check that the apEventBean has been set
            if (apEventBean != null && filtering_by_rat(apEventBean)) {
                // Publish this event on all publishers
                for (final Publisher publisher : publishers) {
                    publisher.publishMessage(apEventBean);
                }
            } else {
                loadingMetrics.incrementInvalidRecords();
            }

        }

        // Close the file
        stapleBufferedReader.close();

        return lines;
    }

    //dirty fix to filter up on RAT
    //@TODO create filter for this kind of operation
    private boolean filtering_by_rat(final ApEventBean apEventBean) {

        if (apEventBean instanceof TCP_REPORT) {

            return ((TCP_REPORT) apEventBean).getRAT() == 1;
        }

        if (apEventBean instanceof TCP_REPORT_PARTIAL) {

            return ((TCP_REPORT_PARTIAL) apEventBean).getRAT() == 1;
        }

        if (apEventBean instanceof FLASH_VIDEO_REPORT_PARTIAL) {

            return ((FLASH_VIDEO_REPORT_PARTIAL) apEventBean).getRAT() == 1;

        }
        if (apEventBean instanceof FLASH_VIDEO_REPORT) {
            return ((FLASH_VIDEO_REPORT) apEventBean).getRAT() == 1;
        }

        return false;

    }

    private Event getEvent(final Schema schema, final STAPLE_FILE_TYPE stapleFileType) {
        final Set<Entry<Integer, Event>> entrySet = schema.getEventHandler().getMap().entrySet();

        for (final Entry<Integer, Event> entry : entrySet) {
            if (entry.getValue().getName().equals(stapleFileType.name())) {
                return entry.getValue();
            }
        }

        return null;
    }

    private ApEventBean parseRecord(final Schema schema, final Event event, final String record) {
        final String[] fields = record.split("\t");

        if (fields.length <= event.getParameterList().size()) {
            return null;
        }

        final ApEventBean apEventBean = getClassRepresentingEvent(schema, event);
        try {
            setBaseEventBean(apEventBean, schema, event, fields);
        } catch (Exception e) {
            logger.error("Error parsing staple record: " + record, e);
            return null;
        }

        return apEventBean;
    }

    private ApEventBean getClassRepresentingEvent(final Schema schema, final Event event) {
        // Get the class that represents this event
        final String className = EVENT_CLASS_PACKAGE + '.' + schema.getName() + '.' + event.getName();

        try {
            return (ApEventBean) Class.forName(className).newInstance();
        } catch (final Exception e) {
            // The event class for this event was not found
            logger.warn("could not instantiate event class:" + className, e);
            return null;
        }
    }

    private void setBaseEventBean(final ApEventBean apEventBean, final Schema schema, final Event event, final String[] fields) {
        final double timeDouble = Double.parseDouble(fields[0]) * 1000;
        apEventBean.setTimestamp(new Double(timeDouble).longValue());

        //TODO need factoring, we also need to set subnetwork field of the base bean event
        apEventBean.setNe(schema.getSchemaTypeHandler().getName());
        apEventBean.setName(event.getName());
        apEventBean.setEventId(event.getId());
        apEventBean.setVersion("11a");

        apEventBean.setFields(event, fields, 1);
    }
}