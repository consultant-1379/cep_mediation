/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.base.publishing.eventbus.hazelcast;

import com.ericsson.cepmediation.base.publishing.eventbus.EventBus;
import com.ericsson.cepmediation.base.publishing.eventbus.EventBusLifecycleService;
import com.ericsson.cepmediation.base.publishing.eventbus.EventBusTopic;
import com.hazelcast.core.Hazelcast;

/**
 * @author eemecoy
 *
 */
public class HazelcastEventBus implements EventBus {

    /* (non-Javadoc)
     * @see com.ericsson.cepmediation.base.publishing.eventbus.EventBus#getTopic(java.lang.String)
     */
    @Override
    public <E> EventBusTopic<E> getTopic(final String topicName) {
        return new HazelcastEventBusTopic(Hazelcast.getTopic(topicName));
    }

    /* (non-Javadoc)
     * @see com.ericsson.cepmediation.base.publishing.eventbus.EventBus#getLifecycleService()
     */
    @Override
    public EventBusLifecycleService getLifecycleService() {
        return new HazelcastLifecycleService();
    }

}
