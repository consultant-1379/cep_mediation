/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.base.publishing.eventbus;


/**
 * Interface for an event bus
 * This is a reference to methods on the chosen event bus - it does not represent the sole instance of the EventBus
 * running in the application
 * 
 * @author eemecoy
 *
 */
public interface EventBus {

    /**
     * Get the EventBusTopic for the topicName
     * Will create a new EventBusTopic if this topicName doesn't already exist 
     * 
     * @param topicName         name of topic
     * @return EventBusTopic
     */
    <E> EventBusTopic<E> getTopic(String topicName);

    /**
     * Get the {@link EventBusLifecycleService} for this EventBus
     * 
     * @return {@link EventBusLifecycleService}  
     */
    EventBusLifecycleService getLifecycleService();

}
