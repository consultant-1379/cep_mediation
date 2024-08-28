package com.ericsson.cepmediation.metrics;

/**
 * Class to hold metrics on a published event from the loader
 * 
 * @author eeilfn
 *
 */
public class TopicPublishingMetric {
	private static final String START_TAG = "com.ericsson.cepmediation.base.util.Metrics - ";
	private static final String MIDDLE_TAG = ": ";
	private static final String EVENT_TAG = " events ";
	
	
	private String name = "";
	private long count = 0;
	private long startTime = 0x0fffffffffffffffl;
	private long endTime = 0;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getCount() {
		return count;
	}
	public void setCount(long count) {
		this.count = count;
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
	protected static String getCsvHeader() {
		return ("Topic Name,Events Published");
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		
		builder.append(name);
		builder.append(',');
		builder.append(count);
		
		return builder.toString();
	}

	protected static String parseTopicName(String line) {
		if (!line.contains(EVENT_TAG)) {
			return null;
		}
		
		String topicName = line.substring(line.indexOf(START_TAG) + START_TAG.length());
		topicName = topicName.substring(topicName.indexOf(',') + 2);
		
		int topicNameEndPos = topicName.indexOf(MIDDLE_TAG);
		if (topicNameEndPos == -1) {
			return null;
		}
		
		return topicName.substring(0, topicNameEndPos);
	}

	protected static long getPublishedEventCount(String line) {
		String topicName = parseTopicName(line);
		String eventCount = line.substring(line.indexOf(topicName) + topicName.length() + MIDDLE_TAG.length());
		
		int eventCountEndPos = eventCount.indexOf(EVENT_TAG);
		
		return Long.parseLong(eventCount.substring(0, eventCountEndPos));
	}
	
}
