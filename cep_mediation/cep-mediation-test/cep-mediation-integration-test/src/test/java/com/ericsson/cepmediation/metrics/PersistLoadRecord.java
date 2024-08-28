package com.ericsson.cepmediation.metrics;

/**
 * Class to hold metrics on a persisted event from the persister
 * 
 * @author eeilfn
 *
 */
public class PersistLoadRecord {
	private static final String LOAD_START_TAG = "Loading CSV file into database: ";
	private static final String LOAD_END_TAG = "CSV file loaded into database: ";
	
	private String fileName = "";
	private long eventCount;
	private long startTime = 0;
	private long endTime = 0;
	
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public long getEventCount() {
		return eventCount;
	}
	public void setEventCount(long eventCount) {
		this.eventCount = eventCount;
	}
	public long getStartTime() {
		return startTime;
	}
	public void setStartTime(long startTime) {
		this.startTime = startTime;
	}
	
	public long getEndTime() {
		return endTime;
	}
	public void setEndTime(long endTime) {
		this.endTime = endTime;
	}
	
	protected static boolean isLoadStart(String line) {
		return line.contains(LOAD_START_TAG);
	}
	
	protected static boolean isLoadEnd(String line) {
		return line.contains(LOAD_END_TAG);
	}

	protected static String getCsvHeader() {
		return ("File Name,Events,Loading Duration(ms),Events Loaded/ms");
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		
		builder.append(fileName);
		builder.append(',');
		builder.append(eventCount);
		builder.append(',');
		
		if (endTime > 0) {
			builder.append(endTime-startTime);
			builder.append(',');
			builder.append((float)eventCount/(float)(endTime-startTime));
		}
		// Event not completed yet
		else {
			builder.append(0);
			builder.append(',');
			builder.append(0);
		}
		
		return builder.toString();
	}

	protected static String parseFileName(String line) {
		if (!line.contains(LOAD_START_TAG) && !line.contains(LOAD_END_TAG)) {
			return null;
		}
		
		return line.substring(line.lastIndexOf(' ') + 1);
	}

	protected static long getLoadEventCount(String line) {
		String fileName = parseFileName(line);
		
		return Long.parseLong(fileName.substring(fileName.indexOf('_') + 1, fileName.indexOf('.')));
	}
}
