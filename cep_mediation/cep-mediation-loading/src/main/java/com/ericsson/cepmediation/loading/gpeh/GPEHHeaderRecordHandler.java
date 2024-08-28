package com.ericsson.cepmediation.loading.gpeh;

import java.util.TimeZone;

import com.ericsson.cepmediation.base.meta.admin.SchemaTypeHandler;
import com.ericsson.cepmediation.base.meta.schema.SchemaException;
import com.ericsson.cepmediation.loading.events.EventHeaderRecordHandler;
import com.ericsson.cepmediation.loading.filerecords.RecordHandler;

/**
 * This class handles the header of an GPEH file
 * 
 * @author eeilfn
 */
public class GPEHHeaderRecordHandler extends EventHeaderRecordHandler implements RecordHandler {
    // Constant indicating the type of a call trace header record
    private final static short HEADER_RECORD_TYPE = 0;

    // Constant indicating the type of a MME event record
    private final static short EVENT_RECORD_TYPE = 4;

    /**
     * Constructor, Sets information on events for this file
     * @param schemaTypeHandler A handler for all loaded MME schemas of this type
     */
    public GPEHHeaderRecordHandler(final SchemaTypeHandler schemaTypeHandler) {
        // Call the superclass
        super(schemaTypeHandler);

        // Set the event record type
        eventRecordType = EVENT_RECORD_TYPE;
    }

    /**
     * This method processes the GPEH header record
     * @return true if the record was processed successfully
     * @throws SchemaException 
     */
    @Override
    public boolean process(final byte[] data) throws SchemaException {
        // Set the file format version, bytes 0 to 5 in data
        fileFormatVersion = new String(data, 0, 5).replaceAll(" ", "");

        // Set the time shift on the super class
        super.setHeaderTimestamp();

        // Set the NE user label field, bytes 12..211 in data
        neUserLabel = new String(data, 12, 200).trim();

        // Set the NE logical name field, bytes 212..411 in data
        neLogicalName = new String(data, 212, 200).trim();

        // Set NE logical name to NE user label if it is not set
        if (neLogicalName == null || neLogicalName.length() == 0) {
            neLogicalName = neUserLabel;
        }

        // File information version in GPEH files is in bytes 412..416
        fileInformationVersion = new String(data, 412, 5).trim();

        // Use the superclass to find the schema
        return super.process();
    }

    /**
     * This method returns the record type
     * @return the record type
     */
    @Override
    public short getRecordType() {
        return HEADER_RECORD_TYPE;
    }

    /**
     * Return the number of events processed by this record handler
     * @return the number of events
     */
    @Override
    public long getEventsProcessed() {
        // This record handler does not process events
        return 0;
    }

    /**
     * Clear the number of events processed by this record handler
     */
    @Override
    public void clearEventsProcessed() {
        // This record handler does not process events
    }

    @Override
    public String toString(byte[] data) {
        return toString();
    }
    
    @Override
    public String toString() {
        return "GPEHHeaderRecordHandler [schemaTypeHandler=" + schemaTypeHandler + ", usedSchema=" + usedSchema + ", eventRecordType=" + eventRecordType
                + ", fileFormatVersion=" + fileFormatVersion + ", fileInformationVersion=" + fileInformationVersion + ", pmRecordingRevision="
                + pmRecordingRevision + ", timestamp=" + timestamp.getTime() + ", utcStartOfDay=" + utcStartOfDay + ", utcOffsetOfDataInsideFile="
                + utcOffsetOfDataInsideFile + ", networkElementTimezoneOffset=" + networkElementTimezoneOffset + ", neUserLabel=" + neUserLabel
                + ", neLogicalName=" + neLogicalName + ", subNetworkName=" + subNetworkName + ", ossId=" + ossId + "]";
    }

    @Override
    protected void setUtcOffsetOfDataInsideFile(int timezoneOffsetInFileName) {
        // Gpeh data is in UTC time inside the file
        utcOffsetOfDataInsideFile = 0;
    }

    @Override
    protected void setNetworkElementTimezoneOffset(int timezoneOffsetInFileName) {
        if (timezoneOffsetInFileName != -1) {
            // Offset is set in file name
            networkElementTimezoneOffset = (short) timezoneOffsetInFileName;
        } else {
            // Offset is not in file name, use the offset from the server instead
            TimeZone serverTimezone = TimeZone.getDefault();
            // store the offset in minutes
            networkElementTimezoneOffset = (short) ((serverTimezone.getOffset(timestamp.getTimeInMillis()) / 1000) / 60);
        }
    }
}
