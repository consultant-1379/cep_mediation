package com.ericsson.cepmediation.loading.mme;

import com.ericsson.cepmediation.base.meta.admin.SchemaTypeHandler;
import com.ericsson.cepmediation.base.meta.schema.SchemaException;
import com.ericsson.cepmediation.loading.events.EventHeaderRecordHandler;

/**
 * This class handles the header of an EBS file
 * 
 * @author eeilfn
 */
public class MMEHeaderRecordHandler extends EventHeaderRecordHandler{
    // Constant indicating the type of a call trace header record
    private final static short HEADER_RECORD_TYPE = 0;

    // Constant indicating the type of a MME event record
    private final static short EVENT_RECORD_TYPE = 1;

    /**
     * Constructor, Sets information on events for this file
     * @param schemaTypeHandler A handler for all loaded MME schemas of this type
     */
    public MMEHeaderRecordHandler(final SchemaTypeHandler schemaTypeHandler) {
        // Call the superclass
        super(schemaTypeHandler);

        // Set the event record type
        eventRecordType = EVENT_RECORD_TYPE;
    }

    /**
     * This method processes the EBS header record
     * @return true if the record was processed successfully
     * @throws SchemaException 
     */
    @Override
    public boolean process(final byte[] data) throws SchemaException {
        // Set the file format version, byte 0 in data
        fileFormatVersion = Integer.toString(data[0]);

        // Set the file information version, byte 1 in data
        fileInformationVersion = Integer.toString(data[1]);

        // Set the time shift on the super class
        super.setHeaderTimestamp();

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
        return "MMEHeaderRecordHandler [schemaTypeHandler=" + schemaTypeHandler + ", usedSchema=" + usedSchema + ", eventRecordType=" + eventRecordType
                + ", fileFormatVersion=" + fileFormatVersion + ", fileInformationVersion=" + fileInformationVersion + ", pmRecordingRevision="
                + pmRecordingRevision + ", timestamp=" + timestamp + ", utcStartOfDay=" + utcStartOfDay + ", utcOffsetOfDataInsideFile="
                + utcOffsetOfDataInsideFile + ", networkElementTimezoneOffset=" + networkElementTimezoneOffset + ", neUserLabel=" + neUserLabel
                + ", neLogicalName=" + neLogicalName + ", subNetworkName=" + subNetworkName + ", ossId=" + ossId + "]";
    }

    @Override
    protected void setUtcOffsetOfDataInsideFile(int timezoneOffsetInFileName) {
        // EBM (SGEH) is local time inside file, local time = utc + offset to utc => utc = local time - offset to utc
        // value in milliseconds
        utcOffsetOfDataInsideFile = -(timezoneOffsetInFileName * 60 * 1000);
    }

    @Override
    protected void setNetworkElementTimezoneOffset(int timezoneOffsetInFileName) {
        // In EBM (SGEH), offset is defined in the file name
        networkElementTimezoneOffset = (short) timezoneOffsetInFileName;

    }
}
