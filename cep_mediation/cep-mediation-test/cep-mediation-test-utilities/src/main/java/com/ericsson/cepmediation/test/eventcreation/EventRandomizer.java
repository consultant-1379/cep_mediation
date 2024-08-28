/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.test.eventcreation;

import com.ericsson.cepmediation.test.common.GpehEventType;

/**
 * @author EEMECOY
 *
 */
public class EventRandomizer {

    /**
     * Generate a random radio event type
     * Distribution of generated radio event types isn't random - the set up below should guarantee ~12% of 
     * INTERNAL_SYSTEM_UTILIZATION events, and uniform distribution of all other even ttypes
     * 
     * @return random event type
     */
    public GpehEventType randomEventType() {
        final int numberOfGpehEvents = GpehEventType.values().length;
        final int theRandomizer = numberOfGpehEvents + 3;
        final int randomIndex = Randomizer.rand(theRandomizer);
        if (randomIndex >= numberOfGpehEvents) {
            return GpehEventType.INTERNAL_SYSTEM_UTILIZATION;
        }
        return GpehEventType.values()[randomIndex];
    }

}
