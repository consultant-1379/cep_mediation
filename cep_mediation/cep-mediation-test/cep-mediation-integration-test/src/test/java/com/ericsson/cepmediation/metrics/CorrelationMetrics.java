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
public class CorrelationMetrics {
	private static TreeMap<String, CorrelationRecord> correlationRecordMap = new TreeMap<String, CorrelationRecord>();
	private static TreeMap<Long, RecordedSecond> recordedInputSecondMap = new TreeMap<Long, RecordedSecond>();
	private static TreeMap<Long, RecordedSecond> recordedOutputSecondMap = new TreeMap<Long, RecordedSecond>();

	/**
	 * @param args
	 * @throws IOException 
	 * @throws ParseException 
	 */
	public static void main(String[] args) throws IOException, ParseException {

		if (args.length != 1) {
			System.err.println("usage: CorrelationMetrics <log_file_name.log>");
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
			String correlationInputName = CorrelationRecord.parseInputCorrelationName(logLine);

			if (correlationInputName != null) {
				processCorrelationInputLine(correlationInputName, logLine);
				continue;
			}

			String correlationOutputName = CorrelationRecord.parseOutputCorrelationName(logLine);

			if (correlationOutputName != null) {
				processCorrelationOutputLine(correlationOutputName, logLine);
				continue;
			}
		}

		System.out.println("Input events per second to correlations");
		float maxInputEventRate = 0;
		float avActiveInputEventRate = 0;
		System.out.println(RecordedSecond.getCsvHeader());
		for (long second = recordedInputSecondMap.firstKey(); second <= recordedInputSecondMap.lastKey(); second++) {
			RecordedSecond correlationInputSecond = recordedInputSecondMap.get(second);

			if (correlationInputSecond == null) {
				correlationInputSecond = new RecordedSecond();
				correlationInputSecond.setSecond(second);
				correlationInputSecond.setEventCount(0);
			}
			System.out.println(correlationInputSecond);

			avActiveInputEventRate += correlationInputSecond.getEventCount();
			if (correlationInputSecond.getEventCount() > maxInputEventRate) {
				maxInputEventRate = correlationInputSecond.getEventCount();
			}
		}
		float avWindowInputEventRate =
			avActiveInputEventRate / (recordedInputSecondMap.lastEntry().getValue().getSecond() - recordedInputSecondMap.firstEntry().getValue().getSecond());
		avActiveInputEventRate = avActiveInputEventRate / recordedInputSecondMap.size();
		System.out.println();
		System.out.println("Output correlated events per second from correlations");

		float maxOutputEventRate = 0;
		float avActiveOutputEventRate = 0;
		System.out.println(RecordedSecond.getCsvHeader());
		for (long second = recordedOutputSecondMap.firstKey(); second <= recordedOutputSecondMap.lastKey(); second++) {
			RecordedSecond correlationOutputSecond = recordedOutputSecondMap.get(second);

			if (correlationOutputSecond == null) {
				correlationOutputSecond = new RecordedSecond();
				correlationOutputSecond.setSecond(second);
				correlationOutputSecond.setEventCount(0);
			}
			System.out.println(correlationOutputSecond);

			avActiveOutputEventRate += correlationOutputSecond.getEventCount();
			if (correlationOutputSecond.getEventCount() > maxOutputEventRate) {
				maxOutputEventRate = correlationOutputSecond.getEventCount();
			}
		}
		float avWindowOutputEventRate =
			avActiveOutputEventRate / (recordedOutputSecondMap.lastEntry().getValue().getSecond() - recordedOutputSecondMap.firstEntry().getValue().getSecond());
		avActiveOutputEventRate = avActiveOutputEventRate / recordedOutputSecondMap.size();

		System.out.println();
		System.out.println("Statistics per correlation");
		long inputEventCount = 0;
		long outputEventCount = 0;
		System.out.println(CorrelationRecord.getCsvHeader());
		for (CorrelationRecord correlation : correlationRecordMap.values()) {
			System.out.println(correlation);

			inputEventCount += correlation.getInputCount();
			outputEventCount += correlation.getOutputCount();
		}

		System.out.println();
		System.out.println(
				"Input Events,Correlated Events," +
				"Av. Active Correlation Input Rate (Events/ms),Av. Window Correlation Input Rate (Events/ms),Max. Correlation Input Rate (Events/ms)," +
		"Av. Active Correlation Output Rate (Events/ms),Av. Window Correlation Output Rate (Events/ms),Max. Correlation Output Rate (Events/ms),");
		System.out.println(
				inputEventCount + "," + outputEventCount + "," +
				avActiveInputEventRate/1000 + "," + avWindowInputEventRate/1000 + "," + maxInputEventRate/1000 + "," +
				avActiveOutputEventRate/1000 + "," + avWindowOutputEventRate/1000 + "," + maxOutputEventRate/1000 );
	}

	private static void processCorrelationInputLine(String correlationName, String correlationInputLine) throws ParseException {
		CorrelationRecord correlationRecord = correlationRecordMap.remove(correlationName);

		if (correlationRecord == null) {
			correlationRecord = new CorrelationRecord();
		}

		correlationRecord.setName(correlationName);
		correlationRecord.setInputCount(correlationRecord.getInputCount() + CorrelationRecord.getInputEventCount(correlationInputLine));

		correlationRecordMap.put(correlationName, correlationRecord);

		long correlationSecond = getTimeFromLine(correlationInputLine) / 1000;

		RecordedSecond recordedSecond = recordedInputSecondMap.remove(correlationSecond);

		if (recordedSecond == null) {
			recordedSecond = new RecordedSecond();
		}

		recordedSecond.setSecond(correlationSecond);
		recordedSecond.setEventCount(recordedSecond.getEventCount() + CorrelationRecord.getInputEventCount(correlationInputLine));

		recordedInputSecondMap.put(correlationSecond, recordedSecond);
	}

	private static void processCorrelationOutputLine(String correlationName, String correlationOutputLine) throws ParseException {
		CorrelationRecord correlationRecord = correlationRecordMap.remove(correlationName);

		if (correlationRecord == null) {
			correlationRecord = new CorrelationRecord();
		}

		correlationRecord.setName(correlationName);
		correlationRecord.setOutputCount(correlationRecord.getOutputCount() + CorrelationRecord.getOutputEventCount(correlationOutputLine));

		long correlationSecond = getTimeFromLine(correlationOutputLine) / 1000;

		RecordedSecond recordedSecond = recordedOutputSecondMap.remove(correlationSecond);

		if (recordedSecond == null) {
			recordedSecond = new RecordedSecond();
		}

		recordedSecond.setSecond(correlationSecond);
		recordedSecond.setEventCount(recordedSecond.getEventCount() + CorrelationRecord.getOutputEventCount(correlationOutputLine));

		recordedOutputSecondMap.put(correlationSecond, recordedSecond);

		correlationRecordMap.put(correlationName, correlationRecord);
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
