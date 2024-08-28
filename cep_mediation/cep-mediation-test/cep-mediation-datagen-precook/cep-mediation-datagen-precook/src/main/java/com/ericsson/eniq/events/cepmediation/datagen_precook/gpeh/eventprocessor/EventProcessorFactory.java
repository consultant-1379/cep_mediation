/**
* -----------------------------------------------------------------------
*     Copyright (C) 2013 LM Ericsson Limited.  All rights reserved.
* -----------------------------------------------------------------------
*/
package com.ericsson.eniq.events.cepmediation.datagen_precook.gpeh.eventprocessor;

import com.ericsson.eniq.events.cepmediation.datagen_precook.common.DatagenProperties;
import com.ericsson.eniq.events.cepmediation.datagen_precook.common.RncType;
import com.ericsson.eniq.events.cepmediation.datagen_precook.gpeh.eventprocessor.fifteenminuterops.EventProcessorForLargeRNCs;
import com.ericsson.eniq.events.cepmediation.datagen_precook.gpeh.eventprocessor.fifteenminuterops.EventProcessorForSmallRNCs;
import com.ericsson.eniq.events.cepmediation.datagen_precook.gpeh.eventprocessor.oneminrops.EventProcessorForLargeRNCs_1MinRop;
import com.ericsson.eniq.events.cepmediation.datagen_precook.gpeh.eventprocessor.oneminrops.EventProcessorForSmallRNCs_1MinRop;

/**
* @author eeikonl
* @since 2013
*
*/
public class EventProcessorFactory {

    public static EventProcessor getEventProcessor(final RncType rncType) {
        return getEventProcessor(rncType, DatagenProperties.getInstance().useOneMinuteRops());
    }

    public static EventProcessor getEventProcessor(final RncType rncType, final boolean oneMinRops) {
        switch (rncType) {
        case TYPE1:
        case TYPE2:
        case TYPE3:
            return oneMinRops ? new EventProcessorForSmallRNCs_1MinRop() : new EventProcessorForSmallRNCs();
        case TYPE4:
        case TYPE5:
        case TYPE6:
        case TYPE7:
            return oneMinRops ? new EventProcessorForLargeRNCs_1MinRop() : new EventProcessorForLargeRNCs();
        case TYPE8:
            return oneMinRops ? new EventProcessorForSmallRNCs_1MinRop() : new EventProcessorForSmallRNCs();
        case TYPE9:
            return oneMinRops ? new EventProcessorForLargeRNCs_1MinRop() : new EventProcessorForLargeRNCs();
        case TYPE10:
            return oneMinRops ? new EventProcessorForLargeRNCs_1MinRop() : new EventProcessorForLargeRNCs();
        default:
            throw new RuntimeException("Invalid RNC Type specified");
        }
    }

}
