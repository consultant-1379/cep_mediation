/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.base.publishing.eventbus;

/**
 * Interface for the event bus lifecycle service, offers mechanism to access monitoring methods on event bus
 * 
 * @author eemecoy
 *
 */
public interface EventBusLifecycleService {

    /**
     * Check if the event bus is running
     * 
     * @return boolean          is the event bus running
     */
    boolean isRunning();

}
