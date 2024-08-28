package com.ericsson.cepmediation.correlation;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.atomic.AtomicLong;

import com.ericsson.cepmediation.base.apeventbeans.ApEventBean;

/**
 * Counts number of events per event name.
 * 
 * @author evelziv
 */
public final class EventCountingPublisher extends AbstractPublisher {

	private final Map<String, AtomicLong> events;
	
	public EventCountingPublisher() {
		events = new HashMap<String, AtomicLong>();
	}
	
	public Map<String, AtomicLong> getEventCounts() {
		return Collections.unmodifiableMap(events);
	}
	
	public long getTotal() {
		long total = 0;
		for(Entry<String, AtomicLong> entry : events.entrySet()) {
			total += entry.getValue().get();
		}
		return total;
	}

	@Override
	public void publishMessage(ApEventBean event) {
		final String name = event.getName();
		AtomicLong count = events.get(name);
		if(count == null) {
			count = new AtomicLong(0);
			events.put(name, count);
		}
		count.incrementAndGet();
	}

	@Override
	public void setCurrentFileName(String name) {
		// TODO Auto-generated method stub
		
	}
}