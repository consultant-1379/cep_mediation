package com.ericsson.cepmediation.loading.mme;

import com.ericsson.cepmediation.loading.filerecords.RecordHandler;

/**
 * This class handles the footer of an EBS file
 * 
 * @author eeilfn
 */
public class MMEFooterRecordHandler implements RecordHandler {
	// Constant indicating the type of an EBS event record
	private final static short RECORD_TYPE = 3;

	// ENUM for error type
	public enum TerminationCause {
		OK,
		MAX_FILE_SIZE_EXCEEDED,
		OTHER,
		ROP_RECONFIGURED,
		INVALID
	};

	// Constants for valid error type values
	private static final short OK                     = 0;
	private static final short MAX_FILE_SIZE_EXCEEDED = 1;
	private static final short OTHER                  = 2;
	private static final short ROP_RECONFIGURED       = 3;

	// Member data for the footer record
	private TerminationCause fileTerminationCause = TerminationCause.INVALID;

	/**
	 * This method processes the EBS footer record
	 * @return true if the record was processed successfully
	 */
	@Override
	public boolean process(final byte[] data) {
		// get the file termination cause
		fileTerminationCause = setTerminationCause(data[0]);
		
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
	 * Format footer for printing
	 * 
	 *  @return The formatted string
	 */
	@Override
    public String toString(final byte[] data) {
		// Process this record just to ensure member data is set
		this.process(data);

		// Construct the string representation
		final StringBuilder builder = new StringBuilder();

		builder.append("[Footer ] ");

		// Append termination cause
		builder.append("File Termination Cause:");
		builder.append(fileTerminationCause);

		// Return the string
		return builder.toString();

	}

	/**
	 * return the file termination cause
	 * @return The file termination cause
	 */
	public TerminationCause getFileTerminationCause() {
		return fileTerminationCause;
	}

	/**
	 * Set the termination cause enum from a value
	 * @param terminationCause the value to use
	 */
	private static TerminationCause setTerminationCause(final short terminationCause) {
		// Use a big switch, the old ways are sometimes best
		switch (terminationCause) {
		case OK:
			return TerminationCause.OK;

		case MAX_FILE_SIZE_EXCEEDED:
			return TerminationCause.MAX_FILE_SIZE_EXCEEDED;

		case OTHER:
			return TerminationCause.OTHER;

		case ROP_RECONFIGURED:
			return TerminationCause.ROP_RECONFIGURED;

		default:
			return TerminationCause.INVALID;
		}
	}
}
