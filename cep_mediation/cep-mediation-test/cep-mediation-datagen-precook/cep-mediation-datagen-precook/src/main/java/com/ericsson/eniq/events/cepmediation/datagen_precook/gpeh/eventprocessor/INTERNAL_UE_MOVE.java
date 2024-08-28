package com.ericsson.eniq.events.cepmediation.datagen_precook.gpeh.eventprocessor;
import java.io.Serializable;

import com.ericsson.cepmediation.base.meta.schema.Event;
import com.ericsson.cepmediation.base.apeventbeans.ApEventBean;
import com.ericsson.cepmediation.base.apeventbeans.RootEvent;
@SuppressWarnings("serial")
public class INTERNAL_UE_MOVE extends ApEventBean implements Comparable<ApEventBean>, Serializable, RootEvent {

	protected int eventId;

	public INTERNAL_UE_MOVE()
	{
		this.eventId = 0;
	}
	@Override
	public String getAbsoluteName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setData(Event event, byte[] data, int offset) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getCSVString() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getDecodedString() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int getEventId() {
		return eventId;
	}
	@Override
	public void setEventId(final int eventId) {
		this.eventId = eventId;
	}



}
