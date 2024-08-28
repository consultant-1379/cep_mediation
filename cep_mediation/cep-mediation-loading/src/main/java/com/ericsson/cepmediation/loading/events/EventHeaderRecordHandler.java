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
package com.ericsson.cepmediation.loading.events;

import java.io.File;
import java.text.ParseException;
import java.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.cepmediation.base.meta.admin.SchemaTypeHandler;
import com.ericsson.cepmediation.base.meta.schema.*;
import com.ericsson.cepmediation.base.util.NodeFileNameUtils;
import com.ericsson.cepmediation.loading.filerecords.RecordHandler;

/**
 * This interface enforces implementation of header methods for records from a NE
 *
 */
public abstract class EventHeaderRecordHandler implements RecordHandler {
    private static final Logger logger = LoggerFactory.getLogger(EventHeaderRecordHandler.class);

    // Member data referencing all possible schemas for cell trace files, used to check file versions
    protected SchemaTypeHandler schemaTypeHandler = null;

    // Hold the reference to the schema for this file separately for speed, to avoid a map lookup for all records in the file
    protected Schema usedSchema = null;

    // The record type for event records in this schema, set from the schema
    protected int eventRecordType = 0;

    // The length in bits of ID fields in events for this schema, set from the schema
    private int idLength = 0;

    // The starting position  in bits of ID fields in events for this schema, set from the schema
    private int idStartPos = 0;

    // True if the ID field is in the event, set from the schema
    private boolean idInEvent = false;

    // Member data for versions
    protected String fileFormatVersion = null;

    protected String fileInformationVersion = null;

    protected String pmRecordingRevision = null;

    // Member data for the time stamps, the UTC start of day is the UTC representation of the start of
    // day in the time zone on which the files were generated. This is the time from which time stamps in
    // the files are offset
    protected Calendar timestamp = null;

    protected long utcStartOfDay = 0;

    private final long timeZoneDiffDuration = 0; // veljko fix

    // The amount of time in milliseconds that the timestamps inside the network element files are offset from utc time
    protected long utcOffsetOfDataInsideFile = 0;

    // The timezone offset of the network element in minutes
    protected short networkElementTimezoneOffset = 0;

    // Member data identifying the NE
    protected String neUserLabel = null;

    protected String neLogicalName = null;

    protected String subNetworkName = null;

    protected String ossId = null;

    private boolean isTreatAs;

    private final static Map<String, String> fivVersionMap;
    static {
        fivVersionMap = new HashMap<String, String>();
        fivVersionMap.put("A", "DC5");
        fivVersionMap.put("B", "DC5");
    }

    /**
     * Constructor, Sets information on events for this file
     *
     * @param schemaTypeHandler
     *            A handler for all loaded cell trace schemas
     *
     */
    public EventHeaderRecordHandler(final SchemaTypeHandler schemaTypeHandler) {
        // Save the schema reference
        this.schemaTypeHandler = schemaTypeHandler;
    }

    /**
     * This method processes a header record
     *
     * @return true if the record was processed successfully
     * @throws SchemaException
     */
    public boolean process() throws SchemaException {
        // Find the schema for this file from the schema map
        usedSchema = schemaTypeHandler.getFileInformationVersionMap().get(fileInformationVersion);

        if (usedSchema == null) {
            logger.warn("No match for file information version(fiv): " + fileInformationVersion);
            usedSchema = getClosestSchema();
            if (usedSchema != null) {
                isTreatAs = true;
                final General generalInfo = usedSchema.getGeneralHandler().getGeneralInfo();
                final String fiv = generalInfo.getFileInformationVersion();
                final String ffv = generalInfo.getFileFormatVersion();
                logger.info("Will treat fiv/ffv " + fileInformationVersion + "/" + fileFormatVersion + " as " + fiv + "/" + ffv);
            } else {
                isTreatAs = false;
                logger.info("No treat as candidate found!");
            }
        } else {
            isTreatAs = false;
        }

        // Throw an exception if the schema was not found
        if (usedSchema == null) {
            throw new SchemaException("No schema matching the file information version of this file found: fiv=" + fileInformationVersion);
        }

        // Set the event ID length and starting position
        idLength = schemaTypeHandler.getIdLength();
        idStartPos = schemaTypeHandler.getIdStartPos();
        idInEvent = schemaTypeHandler.isIdInEvent();

        return true;
    }

    private Schema getClosestSchema() {
        Schema res = null;
        String floorKey = null;
        if (fivVersionMap.containsKey(fileInformationVersion)) {
            floorKey = fivVersionMap.get(fileInformationVersion);
        } else {
            floorKey = schemaTypeHandler.getFileInformationVersionMap().floorKey(fileInformationVersion);
        }
        if (floorKey != null && !floorKey.isEmpty()) {
            res = schemaTypeHandler.getFileInformationVersionMap().get(floorKey);
            if (fileFormatVersion != null && !fileFormatVersion.isEmpty()) {
                final String ffv = res.getGeneralHandler().getGeneralInfo().getFileFormatVersion();
                if (!fileFormatVersion.equalsIgnoreCase(ffv)) {
                    logger.info("The closest match found for fiv: " + fileInformationVersion + " is " + floorKey + " but its ffv(" + ffv
                            + ") does not match ffv in MP0(" + fileFormatVersion + ")");
                    return null;
                }
            }
        }

        return res;
    }

    /**
     * Sets the amount of seconds that time stamps on events in this file should be shifted to account for time zones
     *
     */
    // veljko fix
    protected void setHeaderTimestamp() {

        // Now get the start of day for the UTC time stamp taken from the file name
        final Calendar utcStartOfDayCal = (Calendar) timestamp.clone();

        // Set the hour, minute, second, and millisecond to zero
        utcStartOfDayCal.set(Calendar.HOUR_OF_DAY, 0);
        utcStartOfDayCal.set(Calendar.MINUTE, 0);
        utcStartOfDayCal.set(Calendar.SECOND, 0);
        utcStartOfDayCal.set(Calendar.MILLISECOND, 0);

        //utcStartOfDay = utcStartOfDayCal.getTimeInMillis() + this.timeZoneDiffDuration;
        utcStartOfDay = utcStartOfDayCal.getTimeInMillis();
    }

    /**
     * Return the schema to use for records from this file
     */
    public Schema getUsedSchema() {
        return usedSchema;
    }

    /**
     * Get the event record type of event records in this schema
     *
     * @return the event record type
     */
    public int getEventRecordType() {
        return eventRecordType;
    }

    /**
     * Get the length of the event ID field on events in this schema
     *
     * @return the length of the ID in bits
     */
    public int getIdLength() {
        return idLength;
    }

    /**
     * Get the start position of the event ID field on events in this schema
     *
     * @return the starting position of the ID in bits
     */
    public int getIdStartPos() {
        return idStartPos;
    }

    /**
     * Find if the event ID is in the event as a field
     *
     * @return True if the event ID is a field in the event
     */
    public boolean isIdInEvent() {
        return idInEvent;
    }

    /**
     * Get the file format version
     *
     * @return The file format version
     */
    public String getFileFormatVersion() {
        return fileFormatVersion;
    }

    /**
     * Get the file information version
     *
     * @return The file information version
     */
    public String getFileInformationVersion() {
        return fileInformationVersion;
    }

    /**
     * Get the time for the start of the day in UTC, this is the time that time stamps in the file are offset by
     *
     * @return The start of day time stamp
     */
    public long getUTCStartOfDay() {
        return utcStartOfDay;
    }

    /**
     * Get the PM recording version
     *
     * @return The PM recording version
     */
    public String getPmRecordingRevision() {
        return pmRecordingRevision;
    }

    /**
     * Get the SubNetwork in which this NE is located
     *
     * @return the SubNetwork name
     */
    public String getSubNetworkName() {
        return subNetworkName;
    }

    /**
     * Get the NE user label from the record
     *
     * @return the NE user label
     */
    public String getNeUserLabel() {
        return neUserLabel;
    }

    /**
     * Get the NE logical name from the record
     *
     * @return the NE logical name
     */
    public String getNeLogicalName() {
        return neLogicalName;
    }

    /**
     * Get the OSS ID from the record
     *
     * @return the OSS ID
     */
    public String getOssId() {
        return ossId;
    }

    /**
     *
     * Get the offset between the data inside the file and UTC time
     *
     * @return the offset in milliseconds
     */

    public long getUtcOffsetOfDataInsideFile() {
        return utcOffsetOfDataInsideFile;
    }

    /**
     * Get the UTC offset of the Network Element Timezone
     *
     * @return the offset in minutes
     */
    public short getNetworkElementTimezoneOffset() {
        return networkElementTimezoneOffset;
    }

    /**
     * Extract the NE Logical Name and the date, time, and time zone shift from the file name
     *
     * @param neLogicalName
     *            The logical name of the NE
     * @throws ParseException
     *
     */
    public void extractFileNameFields(final File file) throws ParseException {
        // The NE logical name will be overwritten if it is in the file header
        this.neLogicalName = NodeFileNameUtils.pathToNEName(file.getAbsoluteFile());
        this.timestamp = NodeFileNameUtils.nameToCalendar(file.getName());
        this.subNetworkName = NodeFileNameUtils.pathToSubNetName(file.getAbsoluteFile());
        // this.timeZoneDiffDuration = NodeFileNameUtils.getTimezoneDiffInMillis(file.getName()); // veljko fix
        final int timezoneOffsetInFileName = NodeFileNameUtils.getTimezoneOffsetInMinutesFromFileName(file.getName());
        setUtcOffsetOfDataInsideFile(timezoneOffsetInFileName);
        setNetworkElementTimezoneOffset(timezoneOffsetInFileName);
        this.ossId = NodeFileNameUtils.getOssId(file.getAbsolutePath());
    }

    public Calendar getTimestamp() {
        return timestamp;
    }

    protected abstract void setUtcOffsetOfDataInsideFile(int timezoneOffsetInFileName);

    protected abstract void setNetworkElementTimezoneOffset(int timezoneOffsetInFileName);

    public boolean isTreatAs() {
        return isTreatAs;
    }
}
