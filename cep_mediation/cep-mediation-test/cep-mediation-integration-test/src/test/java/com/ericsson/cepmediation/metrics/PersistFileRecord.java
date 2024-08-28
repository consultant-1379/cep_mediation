package com.ericsson.cepmediation.metrics;

import java.util.ArrayList;

/**
 * Class to hold metrics on a persisted event from the persister
 * 
 * @author eeilfn
 *
 */
public class PersistFileRecord {
	private static final String START_TAG = "com.ericsson.cepmediation.base.util.Metrics - ";
	private static final String FILE_START_TAG = " rows to be persisted to file ";
	private static final String FILE_END_TAG = " rows persisted to file ";
	
	private String fileName = "";
	private long eventCount;
	
	private ArrayList<long[]> timerList = new ArrayList<long[]>();
	
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
	public void setStartTime(long startTime) {
		long[] timer = {startTime, (long)0};
		timerList.add(timer);
	}

	public void setEndTime(long endTime) {
		long[] timer = timerList.get(timerList.size()-1);
		timer[1] = endTime;
		timerList.set(timerList.size()-1, timer);
	}
	
	protected static String getCsvHeader() {
		return ("File Name,Events,File Duration(ms),Events Stored to File/ms");
	}
	
	protected static boolean isFileStart(String line) {
		return line.contains(FILE_START_TAG);
	}
	
	protected static boolean isFileEnd(String line) {
		return line.contains(FILE_END_TAG);
	}

	protected long getDuration() {
		long duration = 0;
		for (long[] timer : timerList) {
			duration += timer[1] - timer[0];
		}
		return duration;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		
		builder.append(fileName);
		builder.append(',');
		builder.append(eventCount);
		builder.append(',');
		
		long duration = 0;
		for (long[] timer : timerList) {
			duration += timer[1] - timer[0];
		}
		builder.append(duration);
		builder.append(',');
		
		double avStoreTime = (duration == 0 ? 0.0 : (double)eventCount/(double)(duration));
		builder.append(avStoreTime);
		
		return builder.toString();
	}

	protected static String parseEventFileName(String line) {
		String eventFileName = null;
		
		if (line.contains(FILE_START_TAG)) {
			eventFileName = line.substring(line.indexOf(FILE_START_TAG) + FILE_START_TAG.length());
		}
		else if (line.contains(FILE_END_TAG)) {
			eventFileName = line.substring(line.indexOf(FILE_END_TAG) + FILE_END_TAG.length());
			eventFileName = eventFileName.substring(0, eventFileName.indexOf(','));
		}
		
		return eventFileName;
	}

	protected static long getFileEventCount(String line) {
		String eventCountLine = line.substring(line.indexOf(START_TAG) + START_TAG.length());
		
		int eventCountEndPos = eventCountLine.indexOf(FILE_START_TAG);
		
		return Long.parseLong(eventCountLine.substring(0, eventCountEndPos));
	}
}
