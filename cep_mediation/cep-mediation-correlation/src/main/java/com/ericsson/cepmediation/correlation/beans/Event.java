package com.ericsson.cepmediation.correlation.beans;

import com.ericsson.cepmediation.base.apeventbeans.ApEventBean;

/**
 * Wrapper around {@link ApEventBean} with unique timestamp. We order {@link ApEventBean}s
 * based on their timestamp field and UE context field. In case two events have same
 * timestamp, timestamp field decides.
 * 
 * @author evelziv
 */
public final class Event implements Comparable<Event> {

	private int observedCount;
	private final long timestamp;
	private final ApEventBean underlying;
	
	public Event(final long timestamp, final ApEventBean underlying) {
		this.timestamp = timestamp;
		this.underlying = underlying;
		observedCount = 0;
	}

	public int getObservedCount() {
		return observedCount;
	}

	public void incObservedCount() {
		++observedCount;
	}
	
	public long getTimestamp() {
		return timestamp;
	}
	
	public ApEventBean getUnderlying() {
		return underlying;
	}

	@Override
	public int compareTo(final Event other) {
		final long leftTimestamp = underlying.getTimestamp();
		final long rightTimestamp = other.getUnderlying().getTimestamp();
		if(leftTimestamp < rightTimestamp) {
			return -1;
		}else if(leftTimestamp > rightTimestamp) {
			return 1;
		} else {
			return Long.valueOf(timestamp).compareTo(other.getTimestamp());
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (timestamp ^ (timestamp >>> 32));
		result = prime * result + Long.valueOf(underlying.getTimestamp()).hashCode();
		return result;
	}

	@Override
	public boolean equals(final Object obj) {
		if (this == obj) {
			return true;
		} else if (obj == null) {
			return false;
		} else  if (getClass() != obj.getClass()) {
			return false;
		}
		final Event other = (Event) obj;
		if (timestamp != other.getTimestamp()) {
			return false;
		} else if (underlying.getTimestamp() != other.getUnderlying().getTimestamp()) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Event [timestamp=" + timestamp + ", underlying=" + underlying + "]";
	}
}
