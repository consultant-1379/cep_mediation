/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.correlation.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.ericsson.cepmediation.base.apeventbeans.ApEventBean;
import com.ericsson.cepmediation.base.meta.admin.MappedEvent;
import com.ericsson.cepmediation.base.publishing.Publisher;

/**
 * @author EEMECOY
 *
 */
public class SimplePublisher implements Publisher {

    List<ApEventBean> gpehEvents = new ArrayList<ApEventBean>();

    @Override
    public void publishMessage(final ApEventBean event) {
        gpehEvents.add(event);
    }

    @Override
    public void addEvents(final String schemaType, final Collection<MappedEvent> events) {
    }

    @Override
    public void removeEvents(final String schemaType, final Collection<MappedEvent> events) {
    }

    @Override
    public void flush() {
    }

    @Override
    public void close() {
    }

    public List<ApEventBean> getEvents() {
        return gpehEvents;
    }
    
	public String getCurrentFileName() {
		return null;
	}

	public void setCurrentFileName(String currentFileName) {
	}

}
