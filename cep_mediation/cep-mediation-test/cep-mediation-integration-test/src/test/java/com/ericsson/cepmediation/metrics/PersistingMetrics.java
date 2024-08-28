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
 * This class compiles metrics from a Persisting log file
 * 
 * @author eeilfn
 *
 */
public class PersistingMetrics {
	private static final String RECEIVE_START_TAG = "com.ericsson.cepmediation.base.util.Metrics - ";
	private static final String RECEIVE_EVENT_TAG = " events buffered for database storage";

	private static TreeMap<Long, RecordedSecond> receiveSecondMap = new TreeMap<Long, RecordedSecond>();
	private static TreeMap<String, PersistFileRecord> fileMap = new TreeMap<String, PersistFileRecord>();
	private static TreeMap<String, PersistLoadRecord> loadMap = new TreeMap<String, PersistLoadRecord>();
	private static TreeMap<String, EventStoredRecord> storedEventMap = new TreeMap<String, EventStoredRecord>();

	/**
	 * @param args
	 * @throws IOException 
	 * @throws ParseException 
	 */
	public static void main(String[] args) throws IOException, ParseException {

		if (args.length != 1) {
			System.err.println("usage: PersistingMetrics <log_file_name.log>");
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
			if (eventsReceived(logLine)) {
				processReceiveLine(logLine);
				continue;
			}

			String eventFileName = PersistFileRecord.parseEventFileName(logLine);

			if (eventFileName != null) {
				processFileLine(eventFileName, logLine);
				continue;
			}

			String fileName = PersistLoadRecord.parseFileName(logLine);

			if (fileName != null) {
				processLoadLine(fileName, logLine);
				continue;
			}
		}

		System.out.println("Statistics for events stored to DB by persister");
		long receivedEventCount = 0;
		System.out.println(EventStoredRecord.getCsvHeader());
		for (EventStoredRecord persistingRecord : storedEventMap.values()) {
			System.out.println(persistingRecord);
			receivedEventCount += persistingRecord.getCount();
		}

		System.out.println();
		System.out.println("Statistics on events received by persister by second");
		long maxReceptionRate = 0;
		long avReceptionRate = 0;
		System.out.println(RecordedSecond.getCsvHeader());
		for (RecordedSecond receivedSecond : receiveSecondMap.values()) {
			System.out.println(receivedSecond);

			avReceptionRate += receivedSecond.getEventCount();
			if (receivedSecond.getEventCount() > maxReceptionRate) {
				maxReceptionRate = receivedSecond.getEventCount();
			}
		}
		avReceptionRate = avReceptionRate / receiveSecondMap.size();

		System.out.println();
		System.out.println("Statistics for events stored to file by persister");
		long fileEventCount = 0;
		long fileDuration = 0;
		System.out.println(PersistFileRecord.getCsvHeader());
		for (PersistFileRecord persistingRecord : fileMap.values()) {
			System.out.println(persistingRecord);
			fileEventCount += persistingRecord.getEventCount();
			fileDuration += persistingRecord.getDuration();
		}

		System.out.println();
		System.out.println("Statistics for events loaded from file to database by persister");
		long loadEventCount = 0;
		long loadStartTime = 0x0fffffffffffffffl;
		long loadEndTime = 0;
		System.out.println(PersistLoadRecord.getCsvHeader());
		for (PersistLoadRecord persistLoadRecord : loadMap.values()) {
			System.out.println(persistLoadRecord);
			loadEventCount += persistLoadRecord.getEventCount();

			if (loadStartTime > persistLoadRecord.getStartTime()) {
				loadStartTime = persistLoadRecord.getStartTime();
			}

			if (loadEndTime < persistLoadRecord.getEndTime()) {
				loadEndTime = persistLoadRecord.getEndTime();
			}
		}
		long loadDuration = loadEndTime - loadStartTime;

		System.out.println();
		System.out.println("Statistics on events loaded by persister to DB by second");
		long maxLoadRate = 0;
		float avLoadRate = 0;
		System.out.println(RecordedSecond.getCsvHeader());
		for (long second = loadStartTime/1000; second < loadEndTime/1000 + 1; second++) {
			RecordedSecond recordedSecond = new RecordedSecond();
			recordedSecond.setSecond(second);

			long eventCount = 0;
			for (PersistLoadRecord persistLoadRecord: loadMap.values()) {
				long startSecond = persistLoadRecord.getStartTime()/1000;
				long endSecond = (persistLoadRecord.getEndTime() % 1000 == 0 ? persistLoadRecord.getEndTime()/1000 : persistLoadRecord.getEndTime()/1000 + 1);

				if (second >= startSecond && second < endSecond) {
					eventCount += persistLoadRecord.getEventCount() / (endSecond - startSecond);
				}
			}
			recordedSecond.setEventCount(eventCount);
			System.out.println(recordedSecond);

			avLoadRate += recordedSecond.getEventCount();
			if (recordedSecond.getEventCount() > maxLoadRate) {
				maxLoadRate = recordedSecond.getEventCount();
			}
		}
		avLoadRate = avLoadRate / (loadEndTime - loadStartTime);

		System.out.println();
		System.out.println("Summary statistics for persistence");

		System.out.println(
				"Events Received,Events to File,Events Loaded," + 
				"Av. Events Received/ms,Max Events Received/ms," +
				"File Storage Duration(ms),Av. Events to File Storage/ms," +
				"Event Loading to DB Duration(ms)," +
				"Av. Events Loaded to DB/ms,Max. Events Loaded to DB/ms"
		);
		System.out.println(
				receivedEventCount + "," + fileEventCount + "," + loadEventCount + "," +
				(float)avReceptionRate/1000 + "," + (float)maxReceptionRate/1000 + "," +
				fileDuration + "," + (float)fileEventCount/(float)fileDuration + "," +
				loadDuration + "," +
				avLoadRate + "," + (float)maxLoadRate/1000);
	}

	private static void processReceiveLine(String eventLine) throws ParseException {
		long eventSecond = getTimeFromLine(eventLine) / 1000;

		RecordedSecond receivedSecond = receiveSecondMap.remove(eventSecond);

		if (receivedSecond == null) {
			receivedSecond = new RecordedSecond();
		}

		receivedSecond.setSecond(eventSecond);
		receivedSecond.setEventCount(receivedSecond.getEventCount() + getReceivedEventCount(eventLine));

		receiveSecondMap.put(eventSecond, receivedSecond);
	}

	private static void processFileLine(String eventFileName, String eventLine) throws ParseException {
		PersistFileRecord persistFileRecord = fileMap.remove(eventFileName);

		if (persistFileRecord == null) {
			persistFileRecord = new PersistFileRecord();
			persistFileRecord.setFileName(eventFileName);
		}

		if (PersistFileRecord.isFileStart(eventLine)) {
			persistFileRecord.setEventCount(persistFileRecord.getEventCount() + PersistFileRecord.getFileEventCount(eventLine));
			persistFileRecord.setStartTime(getTimeFromLine(eventLine));
		}
		else if (PersistFileRecord.isFileEnd(eventLine)) {
			persistFileRecord.setEndTime(getTimeFromLine(eventLine));

			String eventName = persistFileRecord.getFileName().replaceAll(".csv", "");
			EventStoredRecord eventStoredRecord = storedEventMap.get(eventName);
			if (eventStoredRecord == null) {
				eventStoredRecord = new EventStoredRecord();
				eventStoredRecord.setName(eventName);
				storedEventMap.put(eventStoredRecord.getName(), eventStoredRecord);
			}

			eventStoredRecord.setCount(eventStoredRecord.getCount() + persistFileRecord.getEventCount());
		}

		fileMap.put(eventFileName, persistFileRecord);
	}

	private static void processLoadLine(String fileName, String eventLine) throws ParseException {
		PersistLoadRecord persistLoadRecord = loadMap.remove(fileName);

		if (persistLoadRecord == null) {
			persistLoadRecord = new PersistLoadRecord();
			persistLoadRecord.setFileName(fileName);
		}

		if (PersistLoadRecord.isLoadStart(eventLine)) {
			persistLoadRecord.setEventCount(persistLoadRecord.getEventCount() + PersistLoadRecord.getLoadEventCount(eventLine));
			persistLoadRecord.setStartTime(getTimeFromLine(eventLine));
		}
		else if (PersistLoadRecord.isLoadEnd(eventLine)) {
			persistLoadRecord.setEndTime(getTimeFromLine(eventLine));
		}

		loadMap.put(fileName, persistLoadRecord);
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

	protected static boolean eventsReceived(String line) {
		return line.contains(RECEIVE_EVENT_TAG);
	}

	protected static long getReceivedEventCount(String line) {
		String eventCountLine = line.substring(line.indexOf(RECEIVE_START_TAG) + RECEIVE_START_TAG.length());
		int eventCountEndPos = eventCountLine.indexOf(RECEIVE_EVENT_TAG);

		return Long.parseLong(eventCountLine.substring(0, eventCountEndPos));
	}
}
