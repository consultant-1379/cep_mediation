/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.base.publishing.eventbus.local;

import com.ericsson.cepmediation.base.publishing.eventbus.EventBusLifecycleService;

/**
 * Implementation of the EventBusLifecycleService interface
 * Doesnt make that much sense in the context of a "local" service, so just keeping a simple implementation
 * 
 * @author eemecoy
 *
 */
public class LocalEventBusLifecycleService implements EventBusLifecycleService {

    /* (non-Javadoc)
     * @see com.ericsson.cepmediation.base.publishing.eventbus.EventBusLifecycleService#isRunning()
     */
    @Override
    public boolean isRunning() {
        return true;
    }

}
