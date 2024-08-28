package com.ericsson.cepmediation.metrics;

import java.io.File;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * This class holds the metrics for a loading job
 * 
 * @author eeilfn
 *
 */
public class LoadingJobMetric {
	// Constants
	private static final String JOB_TAG = " - job: ";
	
	private String name;
	private String[] nodeList = null;
	
	private long loadStartTime = 0;
	private long listingCompletedTime = 0;
	private long fileCopyCompletedTime = 0;
	private long loadCompletedTime = 0;
	private int filesToCopy = 0;
	private long parseDuration = 0;
	private long recordsProcessed = 0;
	private long eventsProcessed = 0;
	
	private TreeMap<String, LoadingROPMetric> ropMap = new TreeMap<String, LoadingROPMetric>();
	private LoadingROPMetric currentLoadingROPMetric = null;
	
	private static TreeSet<String> topicNameSet = new TreeSet<String>();
	private TreeMap<String, TopicPublishingMetric> topicMap = new TreeMap<String, TopicPublishingMetric>();

	protected LoadingJobMetric(String name) {
		this.name = name;
	}
	
	public long getLoadStartTime() {
		return loadStartTime;
	}

	public void setLoadStartTime(long loadStartTime) {
		this.loadStartTime = loadStartTime;
	}

	public long getListingCompletedTime() {
		return listingCompletedTime;
	}

	public void setListingCompletedTime(long listingCompletedTime) {
		this.listingCompletedTime = listingCompletedTime;
	}

	public long getFileCopyCompletedTime() {
		return fileCopyCompletedTime;
	}

	public void setFileCopyCompletedTime(long fileCopyCompletedTime) {
		this.fileCopyCompletedTime = fileCopyCompletedTime;
	}

	public long getLoadCompletedTime() {
		return loadCompletedTime;
	}

	public void setLoadCompletedTime(long loadCompletedTime) {
		this.loadCompletedTime = loadCompletedTime;
	}

	public int getFilesToCopy() {
		return filesToCopy;
	}

	public void setFilesToCopy(int filesToCopy) {
		this.filesToCopy = filesToCopy;
	}

	public long getParseDuration() {
		return parseDuration;
	}

	public long getRecordsProcessed() {
		return recordsProcessed;
	}

	public long getEventsProcessed() {
		return eventsProcessed;
	}

	public void ropStart(String rop) {
		currentLoadingROPMetric =  new LoadingROPMetric(rop);
	}
	
	public void ropEnd(String rop) {
		if (!rop.equals(currentLoadingROPMetric.getName())) {
			System.err.println("ROP mismatch: in=" + rop + ", current = " + currentLoadingROPMetric.getName());
			return;
		}
		
		recordsProcessed += currentLoadingROPMetric.getRecords();
		eventsProcessed += currentLoadingROPMetric.getEvents();
		parseDuration += currentLoadingROPMetric.getTime();
		
		ropMap.put(rop, currentLoadingROPMetric);
		currentLoadingROPMetric = null;
	}

	public void topicPublishStart(String topicName, long events, long time) {
		currentLoadingROPMetric.topicPublishStart(topicName, events, time);
		
		topicNameSet.add(topicName);
		
		TopicPublishingMetric topicPublishingMetric = topicMap.get(topicName);
		if (topicPublishingMetric == null) {
			topicPublishingMetric = new TopicPublishingMetric();
			topicPublishingMetric.setName(topicName);
			topicMap.put(topicName, topicPublishingMetric);	
		}
		topicPublishingMetric.setCount(topicPublishingMetric.getCount() + events);
		if (topicPublishingMetric.getStartTime() > time) {
			topicPublishingMetric.setStartTime(time);
		}
	}
	
	public void topicPublishEnd(String topicName, long events, long time) {
		currentLoadingROPMetric.topicPublishEnd(topicName, events, time);
		
		TopicPublishingMetric topicPublishingMetric = topicMap.get(topicName);
		if (topicPublishingMetric == null) {
			System.err.println("topic " + topicName + "not found on job " + name);
			return;
		}
		
		if (topicPublishingMetric.getEndTime() < time) {
			topicPublishingMetric.setEndTime(time);
		}
	}
	
	public void setLoadingMetrics(String loadingMetricsString) {
		currentLoadingROPMetric.setROPMetrics(loadingMetricsString);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String[] getNodeList() {
		return nodeList;
	}
	
	public void setNodeList(String[] nodeList) {
		this.nodeList = nodeList;
	}
	
	public TreeMap<String, LoadingROPMetric> getRopMap() {
		return ropMap;
	}

	protected static String getCsvHeader() {
		String csvHeader = "Name,Files,Records,Events,Files Parsed/ms,Records Parsed/ms,Events Parsed/ms,Parsing(ms),Listing(ms),Copy(ms),Total(ms)";

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
		builder.append(filesToCopy);
		builder.append(',');
		builder.append(recordsProcessed);
		builder.append(',');
		builder.append(eventsProcessed);
		builder.append(',');
		builder.append((float)filesToCopy / (float)parseDuration);
		builder.append(',');
		builder.append((float)recordsProcessed / (float)parseDuration);
		builder.append(',');
		builder.append((float)eventsProcessed / (float)parseDuration);
		builder.append(',');
		builder.append(parseDuration);
		builder.append(',');
		builder.append(listingCompletedTime - loadStartTime);
		builder.append(',');
		builder.append(fileCopyCompletedTime - listingCompletedTime);
		builder.append(',');
		builder.append(loadCompletedTime - loadStartTime);

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

	protected static String parseJobName(String line) {
		if (!line.contains(JOB_TAG)) {
			return null;
		}
		
		String jobName = line.substring(line.indexOf(JOB_TAG));
		
		int jobCommaPos = jobName.indexOf(',');
		if (jobCommaPos == -1) {
			return null;
		}
		
		return jobName.substring(JOB_TAG.length(), jobCommaPos);
	}

	protected static String[] getNodesInJob(String line) {
		String nodesLine = line.substring(line.indexOf(JOB_TAG));
		
		int nodeListStartPos = nodesLine.indexOf('[') + 1;
		int nodeListEndPos   = nodesLine.indexOf(']');
		
		String[] nodeList = nodesLine.substring(nodeListStartPos, nodeListEndPos).split(",");
		for (int i = 0; i < nodeList.length; i++) {
			File nodeFile = new File(nodeList[i]);
			nodeList[i] = nodeFile.getName();
		}
		
		return nodeList;
	}
	
	protected static String getROPInJob(String line) {
		String ropLine = line.substring(line.indexOf(JOB_TAG));
		
		// Find last space
		int ropStartPos = ropLine.lastIndexOf(' ');
		// Find second last space
		ropStartPos = ropLine.substring(0, ropStartPos-1).lastIndexOf(' ');
		
		return ropLine.substring(ropStartPos+1);
	}
	
	protected static int getFilesInJob(String line) {
		String jobName = line.substring(line.indexOf(JOB_TAG));
		
		int jobNumStartPos = jobName.indexOf(", ") + 2;
		int jobNumEndPos   = jobName.indexOf(" new remote files found to be copied");
		
		return Integer.parseInt(jobName.substring(jobNumStartPos, jobNumEndPos));
	}
	
	protected static String getJobLoadingMetrics(String line) {
		String jobMetrics = line.substring(line.indexOf(JOB_TAG));
		
		int loadingMetricsStartPos = jobMetrics.indexOf("loading metrics:") + "loading metrics:".length();
		
		return jobMetrics.substring(loadingMetricsStartPos);
	}
}
