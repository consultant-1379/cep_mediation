package com.ericsson.cepmediation.correlation.gpeh;

import java.util.Collection;

import com.ericsson.cepmediation.base.apeventbeans.ApEventBean;
import com.ericsson.cepmediation.base.meta.admin.MappedEvent;
import com.ericsson.cepmediation.base.publishing.Publisher;

public class PublisherAdapter implements Publisher {

    @Override
    public void addEvents(final String schemaType, final Collection<MappedEvent> events) {
        // TODO Auto-generated method stub

    }

    @Override
    public void removeEvents(final String schemaType, final Collection<MappedEvent> events) {
        // TODO Auto-generated method stub

    }

    @Override
    public void publishMessage(final ApEventBean event) {
        // TODO Auto-generated method stub

    }

    @Override
    public void flush() {
        // TODO Auto-generated method stub

    }

    @Override
    public void close() {
        // TODO Auto-generated method stub

    }

	@Override
	public void setCurrentFileName(String name) {
		// TODO Auto-generated method stub
		
	}
}
