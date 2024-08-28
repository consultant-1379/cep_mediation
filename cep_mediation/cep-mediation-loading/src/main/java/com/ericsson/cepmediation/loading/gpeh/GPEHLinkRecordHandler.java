package com.ericsson.cepmediation.loading.gpeh;

import com.ericsson.cepmediation.loading.filerecords.RecordHandler;

/**
 * This class handles a scanner for a cell trace file
 * 
 * @author eeilfn
 */
public class GPEHLinkRecordHandler implements RecordHandler {
    // Constant indicating the type of a GPEH link record
    public final static short RECORD_TYPE = 8;

    // Member data for link file path
    private String filePath = null;

    /**
     * This method processes the link record
     * @return true if the record was processed successfully
     */
    @Override
    public boolean process(final byte[] data) {
        // Set the file path from bytes 0 to 256
        filePath = new String(data, 0, 256);
        return true;
    }

    /**
     * This method returns the record type
     * @return the record type
     */
    @Override
    public short getRecordType() {
        return RECORD_TYPE;
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

    /**
     * Get the file path for the link
     * @return the file path
     */
    public String getFilePath() {
        return filePath;
    }

    /**
     * Format event for printing
     * 
     *  @return The formatted string
     */
    @Override
    public String toString(final byte[] data) {
        // Process this record just to ensure member data is set
        this.process(data);

        // Construct the string representation
        final StringBuilder builder = new StringBuilder();

        builder.append("[link] ");
        builder.append(filePath);

        // Return the string
        return builder.toString();
    }
}
