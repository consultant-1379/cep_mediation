package com.ericsson.cepmediation.loading.gpeh;

import java.util.Formatter;

import com.ericsson.cepmediation.base.util.DataConverters;
import com.ericsson.cepmediation.loading.filerecords.RecordHandler;

/**
 * This class handles an error record in a GPEH file
 * 
 * @author eeilfn
 */
public class GPEHErrorRecordHandler implements RecordHandler {
    // Constant indicating the type of an GPEH event record
    private final static short RECORD_TYPE = 6;

    // ENUM for error type
    public enum ErrorType {
        FILE_SYSTEM, COMMUNICATION, FILE_SIZE_EXCEEDED, PROCESSOR_OVERLOAD, OTHER, INVALID
    }

    // Constants for valid error type values
    private static final short FILE_SYSTEM = 0;

    private static final short COMMUNICATION = 1;

    private static final short FILE_SIZE_EXCEEDED = 2;

    private static final short PROCESSOR_OVERLOAD = 3;

    private static final short OTHER = 4;

    // Member data for the error time stamp
    private int hour = 0;

    private int minute = 0;

    private int second = 0;

    private int millisecond = 0;

    // Member data for errors
    private ErrorType errorType = ErrorType.INVALID;

    /**
     * This method processes the GPEH error record
     * @return true if the record was processed successfully
     */
    @Override
    public boolean process(final byte[] data) {
        // Get the hour minute, second, and millisecond in bytes 0, 1, 2, and 3..4 respectively
        hour = data[0];
        minute = data[1];
        second = data[2];
        millisecond = (int) DataConverters.getByteArrayInteger(data, 3, 2, DataConverters.UNSIGNED_FLAG);

        // Get the error type from byte 3
        errorType = setErrorType(data[5]);

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
     * Format error record for printing
     * 
     *  @return The formatted string
     */
    @Override
    public String toString(final byte[] data) {
        // Process this record just to ensure member data is set
        this.process(data);

        // Construct the string representation
        final StringBuilder builder = new StringBuilder();
        final Formatter formatter = new Formatter(builder);

        builder.append("[Footer ] ");

        // Append the time, hour minute and second
        formatter.format(" Time:%02d:%02d:%02d.%03d", hour, minute, second, millisecond);

        // Append the error type
        builder.append(", Error Type:");
        builder.append(errorType);

        // Return the string
        return builder.toString();

    }

    /**
     * Set the error type enum from a value
     * @param errorType the value to use
     */
    private static ErrorType setErrorType(final short errorType) {
        // Use a big switch, the old ways are sometimes best
        switch (errorType) {
        case FILE_SYSTEM:
            return ErrorType.FILE_SYSTEM;

        case COMMUNICATION:
            return ErrorType.COMMUNICATION;

        case FILE_SIZE_EXCEEDED:
            return ErrorType.FILE_SIZE_EXCEEDED;

        case PROCESSOR_OVERLOAD:
            return ErrorType.PROCESSOR_OVERLOAD;

        case OTHER:
            return ErrorType.OTHER;

        default:
            return ErrorType.INVALID;
        }
    }
}
