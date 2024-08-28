/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.base.publishing.eventbus.local;

import java.util.HashMap;
import java.util.Map;

import com.ericsson.cepmediation.base.publishing.eventbus.EventBusLifecycleService;
import com.ericsson.cepmediation.base.publishing.eventbus.EventBusTopic;

/**
 * Central point for the local event bus - centralized point for creating and storing EventBusTopic's
 * and managing the EventBusLifecycleService
 * 
 * @author eemecoy
 *
 */
public class LocalEventBusCentre {

    private static Map<String, EventBusTopic> topics = new HashMap<String, EventBusTopic>();

    private static EventBusLifecycleService localEventBusLifecycleService = new LocalEventBusLifecycleService();

    public synchronized static <E> EventBusTopic<E> getTopic(final String topicName) {
        if (topics.containsKey(topicName)) {
            return topics.get(topicName);
        }
        final LocalEventBusTopic<E> eventBusTopic = new LocalEventBusTopic<E>(topicName);
        topics.put(topicName, eventBusTopic);
        return eventBusTopic;
    }

    public synchronized static EventBusLifecycleService getLifecycleService() {
        return localEventBusLifecycleService;
    }

}
