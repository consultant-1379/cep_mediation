package com.ericsson.cepmediation.metrics;

import java.sql.Timestamp;

/**
 * This class captures data for a second of publishing during loading
 * @author eeilfn
 *
 */
public class RecordedSecond {
	private long second;
	private long eventCount;

	public long getSecond() {
		return second;
	}
	public void setSecond(long second) {
		this.second = second;
	}
	public long getEventCount() {
		return eventCount;
	}
	public void setEventCount(long eventCount) {
		this.eventCount = eventCount;
	}

	protected static String getCsvHeader() {
		return ("Second,Events Recorded per second");
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		
		builder.append("\"");
		builder.append(new Timestamp(second*1000));
		builder.append("\",");
		builder.append(eventCount);
		
		return builder.toString();
	}
}
