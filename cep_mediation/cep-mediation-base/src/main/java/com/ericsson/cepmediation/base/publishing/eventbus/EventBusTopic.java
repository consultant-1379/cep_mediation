/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.base.publishing.eventbus;

/**
 * Interface for topic on an event bus (event bus can be local or distributed)
 * 
 * @author eemecoy
 *
 */
public interface EventBusTopic<T> {

    /**
     * Returns the topic name
     * 
     * @return String           name of topic
     */
    String getName();

    void publish(T message, String dataLabel);

    /**
     * Add listener for events/messages on bus
     * 
     * @param listener          add listener to events on bus
     */
    void addListener(Listener<T> listener);

}
