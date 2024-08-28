/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.base.publishing.eventbus.hazelcast;

import com.ericsson.cepmediation.base.publishing.eventbus.EventBusTopic;
import com.ericsson.cepmediation.base.publishing.eventbus.Listener;
import com.hazelcast.core.ITopic;

/**
 * @author eemecoy
 * @param <E>
 *
 */
public class HazelcastEventBusTopic<E> implements EventBusTopic<E> {

    private final ITopic<E> hazelcastTopic;

    /**
     * @param topic
     */
    public HazelcastEventBusTopic(final ITopic<E> topic) {
        this.hazelcastTopic = topic;
    }

    /* (non-Javadoc)
     * @see com.ericsson.cepmediation.base.publishing.eventbus.EventBusTopic#getName()
     */
    @Override
    public String getName() {
        return hazelcastTopic.getName();
    }

    /* (non-Javadoc)
     * @see com.ericsson.cepmediation.base.publishing.eventbus.EventBusTopic#addMessageListener(com.ericsson.cepmediation.base.listening.TopicListener)
     */
    @Override
    public synchronized void addListener(final Listener<E> topicListener) {
        hazelcastTopic.addMessageListener(new HazelcastListener(topicListener));
    }

    @Override
    public void publish(E message, String dataLabel) {
        hazelcastTopic.publish(message);
    }

}
