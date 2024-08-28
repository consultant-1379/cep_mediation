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
package com.ericsson.cepmediation.loading.captool;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Collection;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import java.util.zip.GZIPInputStream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.cepmediation.apeventbeans.bearer_plane.CLASSIFICATION_REPORT;
import com.ericsson.cepmediation.base.apeventbeans.ApEventBean;
import com.ericsson.cepmediation.base.apeventbeans.DefaultValues;
import com.ericsson.cepmediation.base.features.impl.FeatureManagerImpl;
import com.ericsson.cepmediation.base.meta.admin.SchemaTypeHandler;
import com.ericsson.cepmediation.base.meta.schema.Event;
import com.ericsson.cepmediation.base.meta.schema.Schema;
import com.ericsson.cepmediation.base.publishing.Publisher;
import com.ericsson.cepmediation.base.statistics.Statistics;
import com.ericsson.cepmediation.base.statistics.StatisticsAware;
import com.ericsson.cepmediation.base.util.Metrics;
import com.ericsson.cepmediation.loading.filerecords.LoadingMetrics;

/**
 * This class loads a list of Captool text files into memory, parses them, and stores them into
 * the database
 *
 */
public class LoadCaptool implements StatisticsAware {
    // Get a reference to the logger
    private static final Logger logger = LoggerFactory.getLogger(LoadCaptool.class);

    // Get a reference to the metrics logger
    private static final Logger metricLogger = LoggerFactory.getLogger(Metrics.class);

    // Get the event class package name
    private static final String EVENT_CLASS_PACKAGE = "com.ericsson.cepmediation.apeventbeans";

    private static final String SCHEMA_TYPE_HANDLER_NAME = "bearer_plane_pa1";

    // Captool field constants
    private static final int CAPTOOL_FIELD_COUNT = 22;

    private static AtomicLong numberOfRecordsParsed = new AtomicLong(0);

    public LoadCaptool() {
        super();
    }

    @Override
    public void exportTo(final Statistics statistics) {
        statistics.add(Statistics.Keys.CAPTOOL_NUMBER_OF_RECORDS_PARSED, numberOfRecordsParsed.getAndSet(0l));
    }

    /**
     * Method that loads a list of Captool files, parses them, and stores them
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

            final Schema schema = schemaTypeHandler.getSchemaMap().get(SCHEMA_TYPE_HANDLER_NAME);

            //TODO need to change
            final Event event = getEvent(schema, "CLASSIFICATION_REPORT");
            if (null == event) {
                logger.warn("Invalid staple file type encountered");
                loadingMetrics.setEndTime(System.currentTimeMillis());
                return loadingMetrics;
            }

            Set<Integer> enabledEvents = getEnabledEvents();
            if (!enabledEvents.contains(event.getId())) {
                logger.warn("Event " + event + " is not enabled and will be skipped. Enabled events: " + enabledEvents);
                loadingMetrics.setEndTime(System.currentTimeMillis());
                return loadingMetrics;
            }

            // Iterate over the list of files
            for (final File file : fileList) {
                logger.debug("processing " + file);

                // Increment the number of files processed by 1
                loadingMetrics.incrementFiles(1);

                // Read and process the file
                try {
                    // Process the file and get the number of records processed
                    final int recordsProcessed = processCaptoolFile(file, publishers, loadingMetrics, schema, event);

                    // Increment the number of records processed
                    loadingMetrics.incrementRecords(recordsProcessed);
                    loadingMetrics.setEvents(loadingMetrics.getEvents() + recordsProcessed);
                    logger.info("CAPTOOL_Loading_file_" + file.getAbsolutePath() + " recordsProcessed : " + recordsProcessed);
                } catch (final Exception e) {
                    logger.warn("error processing event file \"" + file + "\"" + e, e);
                }
            }
        } catch (final Exception e) {
            logger.warn("error processing event files", e);
        }

        // Flush the publishers
        for (final Publisher publisher : publishers) {
            // This is an active flush
            publisher.flush();
        }

        // Record the finish time for the processing and storing
        loadingMetrics.setEndTime(System.currentTimeMillis());

        logLoadingPerformance(schemaTypeHandler.getName(), loadingMetrics);

        metricLogger.trace(loadingMetrics.toString());

        return loadingMetrics;
    }

    protected Set<Integer> getEnabledEvents() {
        return FeatureManagerImpl.getInstance().getEnabledUserPlaneEvents();
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
     * Method to process a Captool file; read all records and generate an event for each one
     * @param captoolFile
     * @param publishers
     * @param loadingMetrics
     * @return
     * @throws IOException
     * @throws InstantiationException
     * @throws IllegalAccessException
     * @throws ClassNotFoundException
     */
    private int processCaptoolFile(final File captoolFile, final Publisher[] publishers, final LoadingMetrics loadingMetrics, Schema schema, Event event)
            throws IOException, InstantiationException, IllegalAccessException, ClassNotFoundException {

        // Declare an input stream for the file
        InputStream captoolFileInputStream = null;

        // Check if the file is compressed
        if (captoolFile.getName().endsWith(".gz")) {
            // The file is a compressed file, open and read it
            captoolFileInputStream = new GZIPInputStream(new FileInputStream(captoolFile));
        } else {
            // The file is not compressed, open and read it
            captoolFileInputStream = new FileInputStream(captoolFile);
        }

        // Open and read the file
        final BufferedReader captoolBufferedReader = new BufferedReader(new InputStreamReader(captoolFileInputStream));

        // record the number of lines processed
        int lines = 0;

        // Read the file line by line
        for (String line = captoolBufferedReader.readLine(); line != null; line = captoolBufferedReader.readLine()) {
            // Increment the number of lines processed
            lines++;
            numberOfRecordsParsed.incrementAndGet();

            // Declare an ApEventBean to hold the generated event
            final ApEventBean apEventBean = parseRecord(schema, event, line);

            // Check that the apEventBean has been set and filter the eventBean by RAT
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
        captoolBufferedReader.close();

        return lines;
    }

    private Event getEvent(final Schema schema, final String captoolFileType) {
        final Set<Entry<Integer, Event>> entrySet = schema.getEventHandler().getMap().entrySet();

        for (final Entry<Integer, Event> entry : entrySet) {
            if (entry.getValue().getName().equals(captoolFileType)) {
                return entry.getValue();
            }
        }

        return null;
    }

    private ApEventBean parseRecord(final Schema schema, final Event event, final String record) {
        final String[] fields = record.split("\\|", -1);

        if (fields.length < CAPTOOL_FIELD_COUNT) {
            return null;
        }

        final ApEventBean apEventBean = getClassRepresentingEvent(schema, event);
        try {
            setBaseEventBean(apEventBean, schema, event, fields);
        } catch (Exception e) {
            logger.error("Error parsing captool record: " + record, e);
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
        final double timeDouble = Double.parseDouble(fields[1]) * 1000;
        apEventBean.setTimestamp(new Double(timeDouble).longValue());


        apEventBean.setNe(schema.getSchemaTypeHandler().getName());
        apEventBean.setName(event.getName());
        apEventBean.setEventId(event.getId());
        apEventBean.setVersion("11a");


        ((CLASSIFICATION_REPORT) apEventBean).setPERIOD_START(apEventBean.getTimestamp());
        final double endTimeDouble = Double.parseDouble(fields[2]) * 1000;
        ((CLASSIFICATION_REPORT) apEventBean).setPERIOD_END(new Double(endTimeDouble).longValue());

        // Get identification information
        ((CLASSIFICATION_REPORT) apEventBean).setIMSI(getStringValue(fields, 3));
        ((CLASSIFICATION_REPORT) apEventBean).setIMEISV(getImeiSvValue(fields[4], fields[5]));
        ((CLASSIFICATION_REPORT) apEventBean).setAPN(getStringValue(fields, 6));
        ((CLASSIFICATION_REPORT) apEventBean).setRAT(getRatValue(fields[7]));


        setCGI(((CLASSIFICATION_REPORT) apEventBean), fields[8]);
        setSAI(((CLASSIFICATION_REPORT) apEventBean), fields[9]);
        setRAI(((CLASSIFICATION_REPORT) apEventBean), fields[10]);

        // Get the address and throughput values
        ((CLASSIFICATION_REPORT) apEventBean).setADDR_TERM(fields[11]);
        ((CLASSIFICATION_REPORT) apEventBean).setPACKETS_DOWNLINK(getIntValue(fields, 12));
        ((CLASSIFICATION_REPORT) apEventBean).setPACKETS_UPLINK(getIntValue(fields, 13));
        ((CLASSIFICATION_REPORT) apEventBean).setBYTES_DOWNLINK(getIntValue(fields, 14));
        ((CLASSIFICATION_REPORT) apEventBean).setBYTES_UPLINK(getIntValue(fields, 15));

        // Get classification values
        ((CLASSIFICATION_REPORT) apEventBean).setPROTOCOL(getStringValue(fields, 16));
        ((CLASSIFICATION_REPORT) apEventBean).setFUNCTION(getStringValue(fields, 17));
        ((CLASSIFICATION_REPORT) apEventBean).setENCAPSULATION(getStringValue(fields, 18));
        ((CLASSIFICATION_REPORT) apEventBean).setENCRYPTION(getStringValue(fields, 19));
        ((CLASSIFICATION_REPORT) apEventBean).setSERVICE_PROVIDER(getStringValue(fields, 20));
        ((CLASSIFICATION_REPORT) apEventBean).setCLIENT(getStringValue(fields, 21));

        //GTP-C Enriched data
        ((CLASSIFICATION_REPORT) apEventBean).setPDN_CAUSE(getStringValue(fields, 22));
        ((CLASSIFICATION_REPORT) apEventBean).setPDP_TYPE(getStringValue(fields, 23));
        ((CLASSIFICATION_REPORT) apEventBean).setCAUSE(getStringValue(fields, 24));
        ((CLASSIFICATION_REPORT) apEventBean).setGGSN_ADDRESS(getStringValue(fields, 25));
        ((CLASSIFICATION_REPORT) apEventBean).setMSISDN(getStringValue(fields, 26));
        ((CLASSIFICATION_REPORT) apEventBean).setNSAPI(getIntValue(fields, 27));
        ((CLASSIFICATION_REPORT) apEventBean).setUE_ADDRESS(getStringValue(fields, 28));
        ((CLASSIFICATION_REPORT) apEventBean).setARP(getIntValue(fields, 29));
        ((CLASSIFICATION_REPORT) apEventBean).setDELAY_CLASS(getIntValue(fields, 30));
        ((CLASSIFICATION_REPORT) apEventBean).setRELIABILITY_CLASS(getIntValue(fields, 31));
        ((CLASSIFICATION_REPORT) apEventBean).setPRECEDENCE(getIntValue(fields, 32));
        ((CLASSIFICATION_REPORT) apEventBean).setTRAFFIC_CLASS(getStringValue(fields, 33));
        ((CLASSIFICATION_REPORT) apEventBean).setGTPC_THROUGHPUT(getLongValue(fields, 34));
        ((CLASSIFICATION_REPORT) apEventBean).setGTPC_MAX_UPLINK(getIntValue(fields, 35));
        ((CLASSIFICATION_REPORT) apEventBean).setGTPC_MAX_DOWNLINK(getIntValue(fields, 36));
        ((CLASSIFICATION_REPORT) apEventBean).setGTPC_GBR_UPLINK(getIntValue(fields, 37));
        ((CLASSIFICATION_REPORT) apEventBean).setGTPC_GBR_DOWNLINK(getIntValue(fields, 38));
        ((CLASSIFICATION_REPORT) apEventBean).setSDU(getIntValue(fields, 39));
        ((CLASSIFICATION_REPORT) apEventBean).setDT_FLAG(getIntValue(fields, 40));

    }

    /**
     * Method to get a sting value as a value or as a string "null"
     * @param fields The string array
     * @param field The string individual
     * @return the string value
     */
    private String getStringValue(final String[] fields, final int field) {
        // Check for existence of the field
        if (field >= fields.length) {
            return "";
        }

        // Get the value
        final String value = fields[field];

        // Check for null
        if (value == null || value.trim().length() == 0) {
            return "";
        }

        return value;
    }

    /**
     * Method to get a sting value as a value or as a string "null"
     * @param fields The string array
     * @param field The string individual
     * @return the string value
     */
    private int getIntValue(final String[] fields, final int field) {
        // Check for existence of the field
        if (field >= fields.length) {
            return DefaultValues.DEFAULT_INT_VALUE;
        } else {
            return safeParseInteger(fields[field]);
        }
    }

    private int safeParseInteger(String value) {
        if (value == null) {
            return DefaultValues.DEFAULT_INT_VALUE;
        }

        String trimmedValue = value.trim();
        if (isInvalidValue(trimmedValue)) {
            return DefaultValues.DEFAULT_INT_VALUE;
        }

        return Integer.parseInt(trimmedValue);
    }

    private boolean isInvalidValue(String value) {
        return (value.length() == 0 || value.equals("\\N"));
    }

    /**
     * Method to get a sting value as a value or as a string "null"
     * @param fields The string array
     * @param field The string individual
     * @return the string value
     */
    private long getLongValue(final String[] fields, final int field) {
        // Check for existence of the field
        if (field >= fields.length) {
            return DefaultValues.DEFAULT_LONG_VALUE;
        } else {
            return safeParseLong(fields[field]);
        }
    }

    private long safeParseLong(String value) {
        if (value == null) {
            return DefaultValues.DEFAULT_LONG_VALUE;
        }

        String trimmedValue = value.trim();
        if (isInvalidValue(trimmedValue)) {
            return DefaultValues.DEFAULT_LONG_VALUE;
        }

        return Long.parseLong(trimmedValue);
    }

    /**
     * Method to convert a RAT string value to a RAT ENUM value
     * @param value The string value
     * @return the byte value for the RAT
     */
    private byte getRatValue(final String value) {
        if (value.equalsIgnoreCase("geran") || value.equalsIgnoreCase("GSM")) {
            // ENUM value GSM from event file <enum internal="GSM" value="0">GSM</enum>
            return 0;
        }

        if (value.equalsIgnoreCase("utran") || value.equalsIgnoreCase("WCDMA")) {
            // ENUM value WCDMA from event file <enum internal="WCDMA" value="1">WCDMA</enum>
            return 1;
        }

        if (value.equalsIgnoreCase("lte")) {
            // ENUM value GSM from event file <enum internal="LTE" value="2">LTE</enum>
            return 2;
        }

        return -1;
    }

    /**
     * Create an IMEISV field with just the IMEI-TAC and IMEI-SV, set the serial number to be 000000
     * @param imeiTAC The IMIE Type Allocation Code (Handset type)
     * @param imeiSV The IMEI software version Code
     * @return The IMEISV
     */
    private String getImeiSvValue(final String imeiTAC, final String imeiSvn) {
        // Check if the IMEI_TAC is set
        if (imeiTAC == null || imeiTAC.trim().length() != 8) {
            return "";
        }

        // Concatenate 6 0s onto the IMEI-TAC as the serial number
        return imeiTAC + "000000" + imeiSvn;
    }

    /**
     * Set the CGI from a CGI string delimited with ':' characters
     * @param classificationReport The classification report in which to store the CGI
     * @param cgiString The CGI string
     */
    private void setCGI(final CLASSIFICATION_REPORT classificationReport, final String cgiString) {
        // CGI is MCC, MNC, LAC, and CI
        final String[] valueArray = splitOnColon(cgiString, 4);

        // Check if the array is set
        if (valueArray == null) {
            return;
        }

        classificationReport.setCGI_MCC(valueArray[0]);
        classificationReport.setCGI_MNC(valueArray[1]);
        classificationReport.setCGI_LAC(safeParseInteger(valueArray[2]));
        classificationReport.setCGI_CI(safeParseInteger(valueArray[3]));

    }

    /**
     * Set the SAI from a SAI string delimited with ':' characters
     * @param classificationReport The classification report in which to store the SAI
     * @param saiString The SAI string
     */
    private void setSAI(final CLASSIFICATION_REPORT classificationReport, final String saiString) {
        // SAI is MCC, MNC, LAC, and SAC
        final String[] valueArray = splitOnColon(saiString, 4);

        // Check if the array is set
        if (valueArray == null) {
            return;
        }

        classificationReport.setSAI_MCC(valueArray[0]);
        classificationReport.setSAI_MNC(valueArray[1]);
        classificationReport.setSAI_LAC(safeParseInteger(valueArray[2]));
        classificationReport.setSAI_SAC(safeParseInteger(valueArray[3]));

    }

    /**
     * Set the RAI from a RAI string delimited with ':' characters
     * @param classificationReport The classification report in which to store the RAI
     * @param raiString The RAI string
     */
    private void setRAI(final CLASSIFICATION_REPORT classificationReport, final String raiString) {
        // RAI is MCC, MNC, LAC, and RAC
        final String[] valueArray = splitOnColon(raiString, 4);

        // Check if the array is set
        if (valueArray == null) {
            return;
        }

        classificationReport.setRAI_MCC(valueArray[0]);
        classificationReport.setRAI_MNC(valueArray[1]);
        classificationReport.setRAI_LAC(safeParseInteger(valueArray[2]));
        classificationReport.setRAI_RAC(safeParseShort(valueArray[3]));

    }

    private short safeParseShort(String value) {
        if (value == null) {
            return DefaultValues.DEFAULT_SHORT_VALUE;
        }

        String trimmedValue = value.trim();
        if (isInvalidValue(trimmedValue)) {
            return DefaultValues.DEFAULT_SHORT_VALUE;
        }

        return Short.parseShort(trimmedValue);
    }

    /**
     * This method splits a string into a string array delimited by a colon
     * @param splitString The string to split
     * @param  fields The number of fields to expect
     * @return an array with the string split
     */
    private String[] splitOnColon(final String splitString, final int fields) {
        // Check if the split string is valid
        if (splitString == null || splitString.trim().length() <= 0) {
            return null;
        }

        // Split the string
        final String[] fieldArray = splitString.split(":", -1);

        // Check the number of split elements
        /**if (fieldArray.length != fields) {
            return null;
        }*/

        // Check all fields are valid and convert them into short values
        final String[] valueArray = new String[fields];
        for (int i = 0; i < fields; i++) {
            if (fieldArray[i] == null || fieldArray[i].trim().length() <= 0 || "\\N".equalsIgnoreCase(fieldArray[i])) {
                valueArray[i] = null;
            }

            else {
                // Get the field value as a short
                valueArray[i] = fieldArray[i];
            }
        }

        // Everything is OK
        return valueArray;
    }

    //dirty fix to filter up on RAT
    //@TODO create filter for this kind of operation
    private boolean filtering_by_rat(final ApEventBean apEventBean) {

        if (apEventBean instanceof CLASSIFICATION_REPORT) {

            return ((CLASSIFICATION_REPORT) apEventBean).getRAT() == 1;
        }

        return false;

    }

}