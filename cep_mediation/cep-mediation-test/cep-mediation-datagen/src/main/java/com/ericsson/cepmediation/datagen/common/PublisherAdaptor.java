package com.ericsson.cepmediation.datagen.common;

import java.util.Collection;

import com.ericsson.cepmediation.base.apeventbeans.ApEventBean;
import com.ericsson.cepmediation.base.meta.admin.MappedEvent;
import com.ericsson.cepmediation.base.publishing.Publisher;

public abstract class PublisherAdaptor implements Publisher {

    protected String currentFileName;

    @Override
    public void addEvents(String schemaType, Collection<MappedEvent> events) {

    }

    @Override
    public void removeEvents(String schemaType, Collection<MappedEvent> events) {

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
    public void publishMessage(ApEventBean apEventBean) {
    }

    public String getCurrentFileName() {
        return currentFileName;
    }

    @Override
    public void setCurrentFileName(String currentFileName) {
        this.currentFileName = currentFileName;
    }

}
