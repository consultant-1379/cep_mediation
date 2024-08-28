package com.ericsson.cepmediation.loading.gpeh;

import com.ericsson.cepmediation.loading.filerecords.RecordHandler;

/**
 * This class handles a scanner for a cell trace file
 * 
 * @author eeilfn
 */
public class GPEHProtocolRecordHandler implements RecordHandler {
	// Constant indicating the type of a GPEH protocol record
	private final static short RECORD_TYPE = 2;

	// ENUM for protocol ID
	public enum ProtocolID {
		RRC,
		NBAP,
		RANAP,
		RESERVED_3,
		RNSAP,
		INTERNAL_EVENT,
		PCAP,
		SABP,
		INVALID
	};

	// Constants for valid protocol IDs values
	private static final short RRC            = 0;
	private static final short NBAP           = 1;
	private static final short RANAP          = 2;
	private static final short RNSAP          = 4;
	private static final short INTERNAL_EVENT = 5;
	private static final short PCAP           = 6;
	private static final short SABP           = 7;

	// Member data for protocol ID, name, and object identifier
	private ProtocolID protocolID = ProtocolID.INVALID;
	private String protocolName = null;
	private String protocolObjectIdentifier = null;

	/**
	 * This method processes the protocol record
	 * @return true if the record was processed successfully
	 */
	@Override
	public boolean process(final byte[] data) {
		// Set the protocol ID field, byte 0
		protocolID = setProtocolID(data[0]);
		
		// Set the protocol name, bytes 1..50
		protocolName = new String(data, 1, 50);
		
		// Set the protocol object identifier, bytes 51..100
		protocolObjectIdentifier = new String(data, 51, 30);

		return true;
	}

	/**
	 * This method returns the record type
	 * @return the record type
	 */
	@Override
	public short getRecordType() {
		return RECORD_TYPE;
	}

	/**
	 * Return the number of events processed by this record handler
	 * @return the number of events
	 */
	@Override
	public long getEventsProcessed() {
		// This record handler does not process events
		return 0;
	}

	/**
	 * Clear the number of events processed by this record handler
	 */
	@Override
	public void clearEventsProcessed() {
		// This record handler does not process events
	}
	
	/**
	 * Get the protocol ID of the protocol
	 * @return the protocol ID
	 */
	public ProtocolID getProtocolID() {
		return protocolID;
	}

	/**
	 * Get the protocol name of the protocol
	 * @return the protocol name
	 */
	public String getProtocolName() {
		return protocolName;
	}

	/**
	 * Get the protocol object identifier of the protocol
	 * @return the protocol object identifier
	 */
	public String getProtocolObjectIdentifier() {
		return protocolObjectIdentifier;
	}

	/**
	 * Format event for printing
	 * 
	 *  @return The formatted string
	 */
	@Override
	public String toString(final byte[] data) {
		// Process this record just to ensure member data is set
		this.process(data);
		
		return "GPEHProtocolRecordHandler [protocolID=" + protocolID
				+ ", protocolName=" + protocolName
				+ ", protocolObjectIdentifier=" + protocolObjectIdentifier
				+ "]";
	}

	/**
	 * Set the protocol ID from a value
	 * @param protocol ID value
	 */
	private static ProtocolID setProtocolID(final short protocolId) {
		// Use a big switch, the old ways are sometimes best
		switch (protocolId) {
		case RRC:
			return ProtocolID.RRC;

		case NBAP:
			return ProtocolID.NBAP;

		case RANAP:
			return ProtocolID.RANAP;

		case RNSAP:
			return ProtocolID.RNSAP;

		case INTERNAL_EVENT:
			return ProtocolID.INTERNAL_EVENT;

		case PCAP:
			return ProtocolID.PCAP;

		case SABP:
			return ProtocolID.SABP;

		default:
			return ProtocolID.INVALID;
		}
	}
}
