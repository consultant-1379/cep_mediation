package com.ericsson.cepmediation.metrics;

/**
 * Class to hold metrics on a published event from the loader
 * 
 * @author eeilfn
 *
 */
public class CorrelationRecord {
	private static final String START_TAG = "com.ericsson.cepmediation.base.util.Metrics - ";
	private static final String INPUT_EVENT_TAG = " events sent to correlation ";
	private static final String OUTPUT_MIDDLE_TAG = ", event.topic: ";
	private static final String OUTPUT_EVENT_TAG = " events published to bus, Event publishing topic";
	
	private String name = "";
	private long inputCount = 0;
	private long outputCount = 0;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getInputCount() {
		return inputCount;
	}
	public void setInputCount(long inputCount) {
		this.inputCount = inputCount;
	}
	
	public long getOutputCount() {
		return outputCount;
	}
	public void setOutputCount(long outputCount) {
		this.outputCount = outputCount;
	}
	protected static String getCsvHeader() {
		return ("Name,Input Events,Correlated Events");
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		
		builder.append(name);
		builder.append(',');
		builder.append(inputCount);
		builder.append(',');
		builder.append(outputCount);
		
		return builder.toString();
	}

	protected static String parseInputCorrelationName(String line) {
		if (!line.contains(INPUT_EVENT_TAG)) {
			return null;
		}

		return line.substring(line.indexOf(INPUT_EVENT_TAG) +  INPUT_EVENT_TAG.length());
	}

	protected static long getInputEventCount(String line) {
		String eventCountLine = line.substring(line.indexOf(START_TAG) + START_TAG.length());
		int eventCountEndPos = eventCountLine.indexOf(INPUT_EVENT_TAG);
		
		return Long.parseLong(eventCountLine.substring(0, eventCountEndPos));
	}
	
	protected static String parseOutputCorrelationName(String line) {
		if (!line.contains(OUTPUT_EVENT_TAG)) {
			return null;
		}
		
		return line.substring(line.indexOf(START_TAG) + START_TAG.length(), line.indexOf(OUTPUT_MIDDLE_TAG));
	}

	protected static long getOutputEventCount(String line) {
		String eventCountLine = line.substring(line.indexOf(OUTPUT_MIDDLE_TAG) + OUTPUT_MIDDLE_TAG.length());
		int eventCountEndPos = eventCountLine.indexOf(OUTPUT_EVENT_TAG);
		
		return Long.parseLong(eventCountLine.substring(0, eventCountEndPos));
	}
}
