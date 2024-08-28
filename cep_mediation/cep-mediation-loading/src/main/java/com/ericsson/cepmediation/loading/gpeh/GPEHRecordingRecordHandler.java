package com.ericsson.cepmediation.loading.gpeh;

import java.util.ArrayList;
import java.util.List;

import com.ericsson.cepmediation.loading.filerecords.RecordHandler;

/**
 * This class handles a scanner for a cell trace file
 * 
 * @author eeilfn
 */
public class GPEHRecordingRecordHandler implements RecordHandler {
    // Constant indicating the type of a GPEH recording record
    private final static short RECORD_TYPE = 1;

    // ENUM for PM Recording Type
    public enum RecordingType {
        UETR, CTR, GPEH, INVALID
    }

    // Constants for valid recording type values
    private static final short UETR = 0;

    private static final short CTR = 1;

    private static final short GPEH = 2;

    // Member data for the PM filter
    private RecordingType recordingType = RecordingType.INVALID;

    private final List<String> filterList = new ArrayList<String>();

    /**
     * This method processes the GPEH record
     * @return true if the record was processed successfully
     */
    @Override
    public boolean process(final byte[] data) {
        // Set the status of the scanner, it is in byte 0
        recordingType = setRecordingType(data[0]);

        // Set the filter value, it is a list of null terminated name value strings, starting at byte 1
        for (int startPos = 1, i = 1; i < data.length; i++) {
            // Check if we have found a null, indicating the end of a string
            if (data[i] == 0) {
                // Check that this is not a null string
                if (startPos < i) {
                    // We have a new string, add it to the array
                    filterList.add(new String(data, startPos, i - startPos));
                }
                startPos = i + 1;
            }
        }

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
     * Return the recording type of this recording record
     * @return The recording type
     */
    public RecordingType getRecordingType() {
        return recordingType;
    }

    /**
     * Get the PM recording filter
     * @return The PM recording filter
     */
    public List<String> getFilter() {
        return filterList;
    }

    /**
     * Format record for printing
     * 
     *  @return The formatted string
     */
    @Override
    public String toString(final byte[] data) {
        // Process this record just to ensure member data is set
        this.process(data);

        return "GPEHRecordingRecordHandler [recordingType=" + recordingType + ", filterList=" + filterList + "]";
    }

    /**
     * Set the recording type value
     * @param RecordingType Value
     */
    private static RecordingType setRecordingType(final short recordingType) {
        // Use a big switch, the old ways are sometimes best
        switch (recordingType) {
        case UETR:
            return RecordingType.UETR;

        case CTR:
            return RecordingType.CTR;

        case GPEH:
            return RecordingType.GPEH;

        default:
            return RecordingType.INVALID;
        }
    }
}
