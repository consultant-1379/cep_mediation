/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.base.publishing.eventbus.local;

import java.util.ArrayList;
import java.util.List;

import com.ericsson.cepmediation.base.publishing.eventbus.EventBusTopic;
import com.ericsson.cepmediation.base.publishing.eventbus.Listener;

/**
 * @author eemecoy
 *
 */
public class LocalEventBusTopic<E> implements EventBusTopic<E> {

    private final String name;

    private final List<Listener<E>> listeners = new ArrayList<Listener<E>>();

    /**
     * @param topicName
     */
    public LocalEventBusTopic(final String topicName) {
        this.name = topicName;
    }

    /* (non-Javadoc)
     * @see com.ericsson.cepmediation.base.publishing.eventbus.EventBusTopic#getName()
     */
    @Override
    public String getName() {
        return name;
    }

    /* (non-Javadoc)
     * @see com.ericsson.cepmediation.base.publishing.eventbus.EventBusTopic#addListener(com.ericsson.cepmediation.base.publishing.eventbus.Listener)
     */
    @Override
    public synchronized void addListener(final Listener<E> listener) {
        listeners.add(listener);
    }

    @Override
    public void publish(E message, String dataLabel) {
        for (final Listener<E> listener : listeners) {
            listener.onMessage(message, dataLabel);
        }
    }

}
