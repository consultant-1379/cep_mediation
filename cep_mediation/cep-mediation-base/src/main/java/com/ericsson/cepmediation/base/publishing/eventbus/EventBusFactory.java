/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.base.publishing.eventbus;

import com.ericsson.cepmediation.base.publishing.eventbus.hazelcast.HazelcastEventBus;
import com.ericsson.cepmediation.base.publishing.eventbus.local.LocalEventBus;

/**
 * @author eemecoy
 *
 */
public class EventBusFactory {

    public EventBus getEventBus(boolean hazelcast) {
        return hazelcast ? new HazelcastEventBus() : new LocalEventBus();
    }
}
