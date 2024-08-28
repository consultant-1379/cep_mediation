/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.base.publishing.eventbus.hazelcast;

import com.ericsson.cepmediation.base.publishing.eventbus.EventBusLifecycleService;
import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.LifecycleService;

/**
 * @author eemecoy
 *
 */
public class HazelcastLifecycleService implements EventBusLifecycleService {

    private final LifecycleService lifecycleService;

    public HazelcastLifecycleService() {
        lifecycleService = Hazelcast.getLifecycleService();
    }

    /* (non-Javadoc)
     * @see com.ericsson.cepmediation.base.publishing.eventbus.EventBusLifecycleService#isRunning()
     */
    @Override
    public synchronized boolean isRunning() {
        return lifecycleService.isRunning();
    }

}
