package com.ericsson.cepmediation.correlation.enrichment.listeners.up.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.ericsson.cepmediation.apeventbeans.correlation.IP_TO_IMSI_LOOKUP;
import com.ericsson.cepmediation.correlation.enrichment.listeners.up.IpAddressPartition;
import com.ericsson.cepmediation.correlation.support.TimeOnlyApEventBeanComparator;

public final class DefaultIpAddressPartition implements IpAddressPartition {
	private final List<IP_TO_IMSI_LOOKUP> events;
	private long writeCount;
	private long lastSeenWriteCount;
	
	public DefaultIpAddressPartition() {
		events = new ArrayList<IP_TO_IMSI_LOOKUP>();
		writeCount = 0;
		lastSeenWriteCount = 0;
	}

	@Override
    public synchronized IP_TO_IMSI_LOOKUP getEvent(final int idx) {
		return events.get(idx);
	}
	
	// only one thread should remove events from the list
	@Override
    public synchronized IP_TO_IMSI_LOOKUP removeEvent(final int idx) {
		return events.remove(idx);
	}
	
	@Override
	public synchronized int getSize() {
		return events.size();
	}

	/**
	 * 1=ACTIVATE, 2=SERVICE_REQUEST, 3=RAU, 4=ISRAU, 5=CLASSIFICATION_REPORT
	 */
	@Override
	public synchronized IP_TO_IMSI_LOOKUP find(final long timestamp, final boolean isFinal) {
		try {
			if(events.size() == 0) {
				return null;
			}
			if (lastSeenWriteCount != writeCount) { // sort only if there was a write
				Collections.sort(events, TimeOnlyApEventBeanComparator.COMPARATOR);
			}
			for (int i = events.size() - 1; i >= 0; i--) {
				final IP_TO_IMSI_LOOKUP event = events.get(i);
				if(event.getTimestamp() <= timestamp) {
					if(isFinal) {
						return event;
					} else if(event.getSOURCE_EVENT_TYPE() == 5) {						
						return event;
					}
				}
			}
			return null;			
		} finally {			
			lastSeenWriteCount = writeCount;
		}
	}
	
	@Override
	public synchronized void onEvent(final IP_TO_IMSI_LOOKUP event) {
		++writeCount;
		event.setCREATION_TIME(System.currentTimeMillis());
		events.add(event);			
	}
}
