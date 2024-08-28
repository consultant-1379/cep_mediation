/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.base.publishing.eventbus;

/**
 * @author eemecoy
 *
 */
public interface Listener<T> {

    /**
     * Invoked when a message is received for the added topic.
     *
     * @param message received message
     */
    void onMessage(T message);
    
    void onMessage(T message,String dataLabel);

}
