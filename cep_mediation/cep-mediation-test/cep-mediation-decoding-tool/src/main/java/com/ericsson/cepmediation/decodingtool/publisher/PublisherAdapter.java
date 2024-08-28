package com.ericsson.cepmediation.decodingtool.publisher;

import java.util.Collection;

import com.ericsson.cepmediation.base.apeventbeans.ApEventBean;
import com.ericsson.cepmediation.base.meta.admin.MappedEvent;
import com.ericsson.cepmediation.base.publishing.Publisher;

/**
 * Adapter class that eliminates the need to implement all methods in the interface.
 * 
 * @author emicned
 *
 */
public class PublisherAdapter implements Publisher {

    @Override
    public void addEvents(final String arg0, final Collection<MappedEvent> arg1) {
        // TODO Auto-generated method stub

    }

    @Override
    public void close() {
        // TODO Auto-generated method stub

    }


    @Override
    public void publishMessage(final ApEventBean arg0) {
        // TODO Auto-generated method stub

    }

    @Override
    public void removeEvents(final String arg0, final Collection<MappedEvent> arg1) {
        // TODO Auto-generated method stub

    }
	public String getCurrentFileName() {
		return null;
	}

	public void setCurrentFileName(String currentFileName) {
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}

}

