package com.ericsson.cepmediation.loading.gpeh;

import com.ericsson.cepmediation.base.util.DataConverters;
import com.ericsson.cepmediation.loading.filerecords.RecordHandler;

/**
 * This class handles the footer of an GPEH file
 * 
 * @author eeilfn
 */
public class GPEHFooterRecordHandler implements RecordHandler {
	// Constant indicating the type of an GPEH event record
	private final static short RECORD_TYPE = 7;

	// Member data for the footer time stamp
	// Set the time fields, bytes 5..6, 7, 8, 9, 10, and 11 for Year, month, day, hour, minute, and second 
	int year   = 0;
	int month  = 0;
	int day    = 0;
	int hour   = 0;
	int minute = 0;
	int second = 0;

	/**
	 * This method processes the GPEH footer record
	 * @return true if the record was processed successfully
	 */
	@Override
	public boolean process(final byte[] data) {
		// Set the time fields, bytes 5..6, 7, 8, 9, 10, and 11 for Year, month, day, hour, minute, and second 
		year   = (int)DataConverters.getByteArrayInteger(data, 0, 2, DataConverters.UNSIGNED_FLAG);
		month  = data[2]-1; // Month is zero counted
		day    = data[3];
		hour   = data[4];
		minute = data[5];
		second = data[6];

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
	 * Return the year of the footer
	 * @return year
	 */
	public int getYear() {
		return year;
	}

	/**
	 * Return the month of the footer
	 * @return month
	 */
	public int getMonth() {
		return month;
	}

	/**
	 * Return the day of the footer
	 * @return day
	 */
	public int getDay() {
		return day;
	}

	/**
	 * Return the hour of the footer
	 * @return hour
	 */
	public int getHour() {
		return hour;
	}

	/**
	 * Return the minute of the footer
	 * @return minute
	 */
	public int getMinute() {
		return minute;
	}

	/**
	 * Return the second of the footer
	 * @return second
	 */
	public int getSecond() {
		return second;
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

		// Append the time stamp
		builder.append("timestamp:");
		builder.append(year);
		builder.append('-');
		builder.append(month);
		builder.append('-');
		builder.append(day);
		builder.append(' ');
		builder.append(hour);
		builder.append(':');
		builder.append(minute);
		builder.append(':');
		builder.append(second);

		// Return the string
		return builder.toString();

	}
}
