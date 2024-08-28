package com.ericsson.cepmediation.metrics;

import java.util.TreeMap;
import java.util.TreeSet;

/**
 * This class holds the metrics for a loading job
 * 
 * @author eeilfn
 *
 */
public class LoadingROPMetric {
	private String name;
	private long files = 0;
	private long records = 0;
	private long events = 0;
	private long time = 0;
	
	private static TreeSet<String> topicNameSet = new TreeSet<String>();
	private TreeMap<String, TopicPublishingMetric> topicMap = new TreeMap<String, TopicPublishingMetric>();
	
	protected LoadingROPMetric(String name) {
		this.name = name;
	}
	
	protected void setROPMetrics(String metricLine) {
		files = getMetricField("files=", metricLine);
		records = getMetricField("records=", metricLine);
		events = getMetricField("events=", metricLine);
		time = getMetricField("elapsed time=", metricLine);
	}

	public void topicPublishStart(String topicName, long events, long time) {
		topicNameSet.add(topicName);
		
		TopicPublishingMetric topicPublishingMetric = new TopicPublishingMetric();
		topicPublishingMetric.setName(topicName);
		topicPublishingMetric.setCount(events);
		topicPublishingMetric.setStartTime(time);
		
		topicMap.put(topicName, topicPublishingMetric);
	}
	
	public void topicPublishEnd(String topicName, long events, long time) {
		TopicPublishingMetric topicPublishingMetric = topicMap.get(topicName);
		if (topicPublishingMetric == null) {
			System.err.println("topic " + topicName + "not found on ROP " + name);
			return;
		}
		
		if (topicPublishingMetric.getCount() != events) {
			System.err.println("event publish count mismatch topic " + topicName + " on ROP " + name);
		}
		topicPublishingMetric.setEndTime(time);
	}

	public String getName() {
		return name;
	}

	public long getFiles() {
		return files;
	}

	public long getRecords() {
		return records;
	}

	public long getEvents() {
		return events;
	}

	public long getTime() {
		return time;
	}

	public TreeMap<String, TopicPublishingMetric> getTopicMap() {
		return topicMap;
	}

	protected static String getCsvHeader() {
		String csvHeader = "ROP,Files,Records,Events,Files Parsed/ms,Records Parsed/ms,Events Parsed/ms,Duration(ms)";
		
		for (String topicName : topicNameSet) {
			csvHeader += ',' + topicName;
		}
		
		return csvHeader;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		
		builder.append(name);
		builder.append(',');
		builder.append(files);
		builder.append(',');
		builder.append(records);
		builder.append(',');
		builder.append(events);
		builder.append(',');
		builder.append((float)files / (float)(time));
		builder.append(',');
		builder.append((float)records / (float)time);
		builder.append(',');
		builder.append((float)events / (float)time);
		builder.append(',');
		builder.append(time);
		
		for (String topicName : topicNameSet) {
			builder.append(',');
			
			TopicPublishingMetric topicPublishingMetric = topicMap.get(topicName);
			if (topicPublishingMetric == null ) {
				builder.append(0);
			}
			else {
				builder.append(topicMap.get(topicName).getCount());
			}
		}
		
		return builder.toString();
	}
	
	private long getMetricField(String field, String metricLine) {
		String fieldString = metricLine.substring(metricLine.indexOf(field) + field.length());
		
		return Long.parseLong(fieldString.substring(0, fieldString.indexOf(',')));
	}
}
