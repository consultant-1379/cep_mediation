package com.ericsson.cepmediation.correlation;

import java.util.Collection;

import com.ericsson.cepmediation.base.meta.admin.MappedEvent;
import com.ericsson.cepmediation.base.publishing.Publisher;

/**
 * @author evelziv
 */
public abstract class AbstractPublisher implements Publisher {

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
}
