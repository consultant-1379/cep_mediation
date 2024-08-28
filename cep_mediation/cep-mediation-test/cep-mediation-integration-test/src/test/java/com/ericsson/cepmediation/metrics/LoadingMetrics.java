package com.ericsson.cepmediation.metrics;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;
import java.util.TreeMap;

/**
 * This class compiles metrics from a Loading log file
 * 
 * @author eeilfn
 *
 */
public class LoadingMetrics {
	private static TreeMap<String, LoadingJobMetric> jobMetricMap = new TreeMap<String, LoadingJobMetric>();
	private static TreeMap<String, LoadingJobMetric> completedJobMetricMap = new TreeMap<String, LoadingJobMetric>();
	private static TreeMap<Long, RecordedSecond> publishedSecondMap = new TreeMap<Long, RecordedSecond>();

	/**
	 * @param args
	 * @throws IOException 
	 * @throws ParseException 
	 */
	public static void main(String[] args) throws IOException, ParseException {

		if (args.length != 1) {
			System.err.println("usage: LoadingMetrics <log_file_name.log>");
			System.exit(1);
		}

		File logFile = new File(args[0]);

		if (!logFile.isFile()) {
			System.err.println("log file " + args[0] + " not found");
			System.exit(1);			
		}

		BufferedReader logBR = new BufferedReader(new InputStreamReader(new FileInputStream(logFile)));

		String logLine = null;

		while ((logLine = logBR.readLine()) != null) {
			String jobName = LoadingJobMetric.parseJobName(logLine);

			if (jobName != null) {
				processJobLine(jobName, logLine);
			}
		}

		System.out.println("Nodes in each job");
		System.out.println("Job,Node");
		for (LoadingJobMetric job : completedJobMetricMap.values()) {
			for (String nodeName : job.getNodeList()) {
				System.out.println(job.getName() + ',' + nodeName);
			}
		}

		System.out.println();
		System.out.println("Published events by second");
		long maxPublishingRate = 0;
		long avPublishingRate = 0;
		if (publishedSecondMap.size() > 0) {
			System.out.println(RecordedSecond.getCsvHeader());
			for (long second = publishedSecondMap.firstKey(); second <= publishedSecondMap.lastKey(); second++) {
				RecordedSecond loadingPublishedSecond = publishedSecondMap.get(second);

				if (loadingPublishedSecond == null) {
					loadingPublishedSecond = new RecordedSecond();
					loadingPublishedSecond.setSecond(second);
					loadingPublishedSecond.setEventCount(0);
				}
				System.out.println(loadingPublishedSecond);

				avPublishingRate += loadingPublishedSecond.getEventCount();
				if (loadingPublishedSecond.getEventCount() > maxPublishingRate) {
					maxPublishingRate = loadingPublishedSecond.getEventCount();
				}
			}
			avPublishingRate = avPublishingRate / publishedSecondMap.size();
		}
		else {
			System.out.println("No published events found in log file");
		}

		System.out.println();
		System.out.println("Loading statistics by ROP");
		System.out.println("Job," + LoadingROPMetric.getCsvHeader());
		for (LoadingJobMetric job : completedJobMetricMap.values()) {
			for (LoadingROPMetric loadingROPMetric : job.getRopMap().values()) {
				System.out.println(job.getName() + ',' + loadingROPMetric);
			}
		}

		System.out.println();
		System.out.println("Summary statistics for loading");
		long ctrJobs = 0;
		long ctrFiles = 0;
		long ctrRecordCount = 0;
		long ctrEventCount = 0;
		long avCtrListingTime = 0;
		long avCtrCopyTime = 0;
		long avCtrParseTime = 0;
		long avCtrTotalTime = 0;

		System.out.println(LoadingJobMetric.getCsvHeader());
		for (LoadingJobMetric job : completedJobMetricMap.values()) {
			System.out.println(job);

			if (job.getName().contains("ctr")) {
				ctrJobs++;
				ctrFiles += job.getFilesToCopy();
				ctrRecordCount += job.getRecordsProcessed();
				ctrEventCount += job.getEventsProcessed();
				avCtrListingTime += (job.getListingCompletedTime() - job.getLoadStartTime());
				avCtrCopyTime += (job.getFileCopyCompletedTime() - job.getListingCompletedTime());
				avCtrParseTime += (job.getLoadCompletedTime() - job.getFileCopyCompletedTime());
				avCtrTotalTime += (job.getLoadCompletedTime() - job.getLoadStartTime());
			}
		}

		System.out.println();
		avCtrListingTime = avCtrListingTime / ctrJobs;
		avCtrCopyTime = avCtrCopyTime / ctrJobs;
		avCtrParseTime = avCtrParseTime / ctrJobs;
		avCtrTotalTime = avCtrTotalTime / ctrJobs;

		System.out.println(
				"Cell Trace files,Cell Trace Records,Cell Trace Events Published," + 
				"Av. Run Time,Av. Listing Time,Av. Copy Time,Av. Parse Time," + 
				"Av. Records Parsed/ms,Av. Events Output/ms," +
		"Av. Events Published/ms,Max Events Published/ms");
		System.out.println(
				ctrFiles + "," +
				ctrRecordCount + "," +
				ctrEventCount + "," +
				avCtrTotalTime + "," +
				avCtrListingTime + "," +
				avCtrCopyTime + "," +
				avCtrParseTime + "," +
				(float)ctrRecordCount / avCtrParseTime + "," +
				(float)ctrEventCount / avCtrParseTime + "," +
				(float)avPublishingRate/1000 + "," +
				(float)maxPublishingRate/1000);
	}

	private static void processJobLine(String jobName, String jobLine) throws ParseException {
		if (jobLine.contains(", creating job for nodes: ")) {
			LoadingJobMetric loadingJobMetric = new LoadingJobMetric(jobName);
			loadingJobMetric.setNodeList(LoadingJobMetric.getNodesInJob(jobLine));
			jobMetricMap.put(jobName, loadingJobMetric);
			return;
		}

		if (jobLine.contains(", loading started")) {
			jobMetricMap.get(jobName).setLoadStartTime(getTimeFromLine(jobLine));
			return;
		}

		if (jobLine.contains(" files on remote host")) {
			jobMetricMap.get(jobName).setListingCompletedTime(getTimeFromLine(jobLine));
			return;
		}

		if (jobLine.contains(" new remote files found to be copied")) {
			jobMetricMap.get(jobName).setFilesToCopy(LoadingJobMetric.getFilesInJob(jobLine));
			return;
		}

		if (jobLine.contains(", fetched")) {
			jobMetricMap.get(jobName).setFileCopyCompletedTime(getTimeFromLine(jobLine));
			return;
		}

		if (jobLine.contains(", processing ROP ")) {
			jobMetricMap.get(jobName).ropStart(LoadingJobMetric.getROPInJob(jobLine));
			return;
		}

		if (jobLine.contains(", ROP processed ")) {
			jobMetricMap.get(jobName).ropEnd(LoadingJobMetric.getROPInJob(jobLine));
			return;
		}

		if (jobLine.contains(" events for publication to bus,")) {
			jobMetricMap.get(jobName).topicPublishStart(TopicPublishingMetric.parseTopicName(jobLine), TopicPublishingMetric.getPublishedEventCount(jobLine), getTimeFromLine(jobLine));
			return;
		}

		if (jobLine.contains(" events published to bus, ")) {
			jobMetricMap.get(jobName).topicPublishEnd(TopicPublishingMetric.parseTopicName(jobLine), TopicPublishingMetric.getPublishedEventCount(jobLine), getTimeFromLine(jobLine));

			long publishedSecond = getTimeFromLine(jobLine) / 1000;

			RecordedSecond recordedSecond = publishedSecondMap.remove(publishedSecond);

			if (recordedSecond == null) {
				recordedSecond = new RecordedSecond();
			}

			recordedSecond.setSecond(publishedSecond);
			recordedSecond.setEventCount(recordedSecond.getEventCount() + TopicPublishingMetric.getPublishedEventCount(jobLine));

			publishedSecondMap.put(publishedSecond, recordedSecond);
			return;
		}

		if (jobLine.contains(", loading metrics")) {
			jobMetricMap.get(jobName).setLoadingMetrics(LoadingJobMetric.getJobLoadingMetrics(jobLine));
			return;
		}

		if (jobLine.contains(", no new remote files found")) {
			jobMetricMap.get(jobName).setFilesToCopy(0);
			return;
		}

		if (jobLine.contains(", loading completed, total time=")) {
			if (jobMetricMap.get(jobName).getFilesToCopy() > 0) {
				LoadingJobMetric jobMetric = jobMetricMap.remove(jobName);
				jobMetric.setLoadCompletedTime(getTimeFromLine(jobLine));
				completedJobMetricMap.put(jobName, jobMetric);
				jobMetricMap.put(jobName, new LoadingJobMetric(jobName));
			}
			return;
		}
		
		if (jobLine.contains("parser initilisation completed")) {
			return;
		}

		System.err.println("unhandled job line: " + jobLine);
	}

	private static long getTimeFromLine(String line) throws ParseException {
		// Define the format of dates on input files
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss,SSS");

		// Get a UTC calendar
		Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));

		// Set the UTC time of the calendar
		calendar.setTime(dateFormat.parse(line.substring(0,	line.indexOf('['))));

		return calendar.getTimeInMillis();
	}
}
