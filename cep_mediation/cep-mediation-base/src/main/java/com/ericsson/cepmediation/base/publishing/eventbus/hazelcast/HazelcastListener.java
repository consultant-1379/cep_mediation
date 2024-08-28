/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.base.publishing.eventbus.hazelcast;

import com.ericsson.cepmediation.base.publishing.eventbus.Listener;
import com.hazelcast.core.MessageListener;

/**
 * @author eemecoy
 * @param <E>
 *
 */
public class HazelcastListener<E> implements MessageListener<E> {

    private final Listener<E> eventBusListener;

    /**
     * @param topicListener
     */
    public HazelcastListener(final Listener<E> topicListener) {
        this.eventBusListener = topicListener;
    }

    /* (non-Javadoc)
     * @see com.hazelcast.core.MessageListener#onMessage(java.lang.Object)
     */
    @Override
    public void onMessage(final E message) {
        eventBusListener.onMessage(message);

    }

}
