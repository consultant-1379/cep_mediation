package com.ericsson.eniq.events.cepmediation.datagen_precook.common;

import java.io.File;
import java.util.Collection;

import com.ericsson.cepmediation.base.apeventbeans.ApEventBean;
import com.ericsson.cepmediation.base.meta.admin.MappedEvent;
import com.ericsson.cepmediation.base.publishing.Publisher;

public abstract class PublisherAdaptor implements Publisher {

    protected String currentFileName;

    public void addEvents(final String schemaType, final Collection<MappedEvent> events) {

    }

    public void removeEvents(final String schemaType, final Collection<MappedEvent> events) {

    }

    public void flush() {
        // TODO Auto-generated method stub

    }

    public void close() {
        // TODO Auto-generated method stub

    }

    public void publishMessage(final ApEventBean apEventBean) {
    }

    public String getCurrentFileName() {
        return currentFileName;
    }

    public void setCurrentFileName(final String currentFileName) {
        this.currentFileName = currentFileName;
    }

    public abstract void writeHeaderFile(final File neFile);
}
