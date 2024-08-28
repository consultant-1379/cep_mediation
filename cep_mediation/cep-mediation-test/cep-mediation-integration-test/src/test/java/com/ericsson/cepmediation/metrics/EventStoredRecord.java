package com.ericsson.cepmediation.metrics;

/**
 * Class to hold metrics on a persisted event from the persister
 * 
 * @author eeilfn
 *
 */
public class EventStoredRecord {
	private String name = "";
	private long count = 0;
	
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
	protected static String getCsvHeader() {
		return ("Name,Received Events");
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		
		builder.append(name);
		builder.append(',');
		builder.append(count);
		
		return builder.toString();
	}
}
