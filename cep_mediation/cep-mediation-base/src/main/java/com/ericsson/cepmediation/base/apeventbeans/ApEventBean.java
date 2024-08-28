package com.ericsson.cepmediation.base.apeventbeans;

/**
 * This class is the base class for all event class java beans. It has member data for the event time stamp
 * and the event NE name, with getters and setters for those. It also has abstract methods for setting
 * the event class data from the raw event 
 * 
 * @author eeilfn
 */

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.TimeZone;
import java.util.TreeMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.cepmediation.base.meta.schema.Event;
import com.ericsson.cepmediation.base.meta.schema.EventParameter;
import com.ericsson.cepmediation.base.util.binaryformatter.UnsignedintFormatter;

@SuppressWarnings("serial")
public abstract class ApEventBean implements Comparable<ApEventBean>, Serializable, RootEvent {
	private static final Logger logger = LoggerFactory.getLogger(ApEventBean.class);
	
	protected static final int ONE_MINUTE = 60 * 1000;

	protected static final String TIME_ZONE = "UTC";

	protected static final String DATE_TIME_FORMAT = "yyyy-MM-dd HH:mm:ss.SSS";

	// This date formatter is required to format dates into UTC
	protected static final DateFormat dateFormat = new SimpleDateFormat(DATE_TIME_FORMAT);
	// Set the time zone for the formatter as UTC
	static {
		dateFormat.setTimeZone(TimeZone.getTimeZone(TIME_ZONE));
	}

	// Member data for the event time stamp, NE, event name and version
	private int eventId;

	protected long timestamp;

	protected String subNetwork = "unknown";

	protected String ne;

	protected String name;

	protected String version;

	protected long sessionId;

	private List<Asn1Message> asn1MessageList = null;

	protected long ropId;

	private List<Object> measurements;
	
	protected String OSS_ID;
	
	protected short networkElementTimezoneOffset;

	/**
	 * Define a default constructor
	 */
	public ApEventBean() {
	}

	/**
	 * Define a constructor for the base properties
	 * 
	 * @param timestamp
	 * @param subNetwork
	 * @param ne
	 * @param name
	 * @param version
	 */
	public ApEventBean(final long timestamp, final String subNetwork, final String ne, final String name, final String version) {
		this.timestamp = timestamp;
		this.subNetwork = subNetwork;
		this.ne = ne;
		this.name = name;
		this.version = version;
	}

	public byte[] getData(final Event event) {
		throw new UnsupportedOperationException("getData method is not supported");
	}

	public void setMeasurements(List<Object> measurements) {
		this.measurements = measurements;
	}

	public List<Object> getMeasurements() {
		return this.measurements;
	}

	public long getSessionId() {
		return sessionId;
	}

	public void setSessionId(final long sessionId) {
		this.sessionId = sessionId;
	}

	/**
	 * Getter for ASN.1 data
	 */
	public byte[] getAsn1Data() {
		return null;
	}

	/**
	 * Getter for ASN.1 data
	 */
	public List<Asn1Message> getAsn1MessageList() {
		return asn1MessageList;
	}

	/**
	 * Get the event time stamp
	 * 
	 * @return The event time stamp
	 */
	public long getTimestamp() {
		return timestamp;
	}

	/**
	 * Get the event NE
	 * 
	 * @return The event NE
	 */
	public String getNe() {
		return ne;
	}

	/**
	 * Getter for the SubNetwork name
	 * 
	 * @return
	 */
	public String getSubNetwork() {
		return subNetwork;
	}

	/**
	 * Getter for the event name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Getter for the event name
	 */
	public String getVersion() {
		return version;
	}
	
	/**
	 * Getter for the OSS ID
	 */
	public String getOSS_ID() {
		return OSS_ID;
	}
	
	/**
	 * Getter for the Network Element Timezone Offset
	 */
	public short getNetworkElementTimezoneOffset() {
		return networkElementTimezoneOffset;
	}

	/**
	 * Setter for the event name
	 */
	public void setName(final String newName) {
		name = newName;
	}

	/**
	 * Setter for the SubNetwork name
	 */
	public void setSubNetwork(final String subNetwork) {
		this.subNetwork = subNetwork;
	}

	/**
	 * Setter for the event version
	 */
	public void setVersion(final String newVersion) {
		version = newVersion;
	}

	/**
	 * Set the event time stamp
	 * 
	 * @param newTimestamp
	 *            The event time stamp to set
	 */
	public void setTimestamp(final long newTimestamp) {
		timestamp = newTimestamp;
	}

	/**
	 * Set the event NE
	 * 
	 * @param newNe
	 *            The new NE
	 */
	public void setNe(final String newNe) {
		ne = newNe;
	}
	
	/**
	 * Set the OSS ID
	 * 
	 * @param ossId
	 *            The OSS ID
	 */
	public void setOSS_ID(final String ossId) {
		OSS_ID = ossId;
	}
	
	/**
	 * Set the Network Element Timezone Offset
	 * 
	 * @param timezoneOffset
	 *            The Network Element Timezone Offset
	 */
	public void setNetworkElementTimezoneOffset(final short timezoneOffset) {
		networkElementTimezoneOffset = timezoneOffset;
	}

	/**
	 * Get the absolute name for this event
	 * 
	 * @return the topic name
	 */
	public abstract String getAbsoluteName();

	/**
	 * Set the data of the event from a byte array, this method is generated
	 * from the XML schema for events
	 * 
	 * @param event
	 *            The event to set data for
	 * @param data
	 *            The byte array
	 * @param offset
	 *            The offset in the array to start at
	 */
	public abstract void setData(Event event, byte[] data, int offset);

	/**
	 * Set each field of the <event> event from a string array, this method is
	 * generated from the XML schema for the <event> event
	 * 
	 * @param event
	 *            The <event> event for which data is to be set
	 * @param fields
	 *            The string array
	 * @param startIndex
	 *            The start index position of the array fields
	 */
	public void setFields(final Event event, final String[] fields, final int startIndex) {
		throw new UnsupportedOperationException();
	}

	/**
	 * This method is used to set a list of messages received in ASN.1
	 * 
	 * @param asn1MessageList
	 *            The ASN.1 message list
	 */
	public void setAsn1MessageList(final List<Asn1Message> asn1MessageList) {
		this.asn1MessageList = asn1MessageList;
	}

	/**
	 * Output the event as a CSV string
	 * 
	 * @return The event data as a CSV string
	 */
	public abstract String getCSVString();

	/**
	 * Method to decode an event, prefixing each parameter with its name
	 * 
	 * @return string containing the event
	 */
	public abstract String getDecodedString();

	/**
	 * Method to get ROP Id set using generated file date and time.
	 */
	public long getRopId() {
		return ropId;
	}

	/**
	 * Method to set ROP Id using generated file date and time.
	 */
	public void setRopId(final long ropId) {
		this.ropId = ropId;
	}

	public int getEventId() {
		return eventId;
	}

	public void setEventId(final int eventId) {
		this.eventId = eventId;
	}

	/**
	 * Compare two event bean objects by time stamp
	 * 
	 * @param otherBean
	 *            The bean to compare this bean with
	 * @return The comparison result
	 */
	@Override
	public int compareTo(final ApEventBean otherBean) {
		// Compare on timestamp
		if (this.timestamp != otherBean.timestamp) {
			return (int) (this.timestamp - otherBean.timestamp);
		}

		// Compare on S/N
		if (!this.subNetwork.equals(otherBean)) {
			return this.subNetwork.compareTo(otherBean.subNetwork);
		}

		// Compare on NE
		if (!this.ne.equals(otherBean)) {
			return this.ne.compareTo(otherBean.ne);
		}

		// Compare on name
		if (!this.name.equals(otherBean.name)) {
			return this.name.compareTo(otherBean.name);
		}

		// Compare on version
		if (!this.version.equals(otherBean.version)) {
			return this.version.compareTo(otherBean.version);
		}

		// The ApEventBean events are the same
		return 0;
	}

	public String getDecodedAsn1String() {
		final StringBuilder stringBuilder = new StringBuilder();
		if (asn1MessageList != null) {
			for (final Asn1Message asn1Message : asn1MessageList) {
				stringBuilder.append(new TreeMap<String, String>(asn1Message.getMessageAttributes()));
			}
		} else {
			if (measurements != null) {
				for (final Object measurement : measurements) {
					stringBuilder.append(measurement.toString());
				}
			}
		}
		return stringBuilder.toString();

	}

	protected int adjustOffset(EventParameter parameter, int offset) {
		int adjustedOffset = offset;
		if (parameter.isUseValid()) {
			adjustedOffset++;
		}
		adjustedOffset += parameter.getNumberOfBytes();
		return adjustedOffset;

	}

	public ApEventBean clone() {
		try {
			return (ApEventBean) super.clone();
		} catch (CloneNotSupportedException e) {
			logger.debug("CloneNotSupportedException,"+e);
		}
		return null;
	}
}
