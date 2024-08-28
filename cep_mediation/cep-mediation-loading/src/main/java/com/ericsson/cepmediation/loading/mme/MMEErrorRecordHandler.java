package com.ericsson.cepmediation.loading.mme;

import java.util.Formatter;

import com.ericsson.cepmediation.loading.filerecords.RecordHandler;

/**
 * This class handles an error record in an EBS file
 * 
 * @author eeilfn
 */
public class MMEErrorRecordHandler implements RecordHandler {
	// Constant indicating the type of an EBS event record
	private final static short RECORD_TYPE = 2;

	// ENUM for error type
	public enum ErrorType {
		OTHER,
		CONENCTION_FAILED,
		CONGESTION,
		INVALID
	};

	// Constants for valid error type values
	private static final short OTHER             = 0;
	private static final short CONENCTION_FAILED = 1;
	private static final short CONGESTION        = 2;

	// Member data for the error time stamp
	private int hour   = 0;
	private int minute = 0;
	private int second = 0;

	// Member data for errors
	private ErrorType errorType = ErrorType.INVALID;

	/**
	 * This method processes the EBS error record
	 * @return true if the record was processed successfully
	 */
	@Override
	public boolean process(final byte[] data) {
		// Get the hour minute and second in bytes 0, 1, and 2 respectively
		hour   = data[0];
		minute = data[1];
		second = data[2];

		// Get the error type from byte 3
		errorType = setErrorType(data[3]);
		
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
		formatter.format(" Time:%02d:%02d:%02d", hour, minute, second);

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
		case OTHER:
			return ErrorType.OTHER;

		case CONENCTION_FAILED:
			return ErrorType.CONENCTION_FAILED;

		case CONGESTION:
			return ErrorType.CONGESTION;

		default:
			return ErrorType.INVALID;
		}
	}
}
