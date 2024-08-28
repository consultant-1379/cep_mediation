/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.base.publishing.eventbus.local;

import com.ericsson.cepmediation.base.publishing.eventbus.EventBus;
import com.ericsson.cepmediation.base.publishing.eventbus.EventBusLifecycleService;
import com.ericsson.cepmediation.base.publishing.eventbus.EventBusTopic;

/**
 * @author eemecoy
 *
 */
public class LocalEventBus implements EventBus {

    /* (non-Javadoc)
     * @see com.ericsson.cepmediation.base.publishing.eventbus.EventBus#getTopic(java.lang.String)
     */
    @Override
    public <E> EventBusTopic<E> getTopic(final String topicName) {
        return LocalEventBusCentre.getTopic(topicName);
    }

    /* (non-Javadoc)
     * @see com.ericsson.cepmediation.base.publishing.eventbus.EventBus#getLifecycleService()
     */
    @Override
    public EventBusLifecycleService getLifecycleService() {
        return LocalEventBusCentre.getLifecycleService();
    }

}
