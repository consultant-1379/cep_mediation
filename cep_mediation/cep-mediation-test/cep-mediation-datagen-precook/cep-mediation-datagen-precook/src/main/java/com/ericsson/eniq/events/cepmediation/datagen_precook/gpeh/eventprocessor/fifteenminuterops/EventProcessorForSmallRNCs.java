/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2013 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.eniq.events.cepmediation.datagen_precook.gpeh.eventprocessor.fifteenminuterops;

import org.slf4j.LoggerFactory;

import com.ericsson.cepmediation.apeventbeans.gpeh.GpehBase;
import com.ericsson.cepmediation.apeventbeans.gpeh.INTERNAL_IMSI;
import com.ericsson.cepmediation.base.apeventbeans.ApEventBean;
import com.ericsson.eniq.events.cepmediation.datagen_precook.utils.uecontext.UeContextModuleID;
import com.ericsson.eniq.events.cepmediation.datagen_precook.common.DatagenProperties;

/**
 * @author eikrwaq
 * @since 2013
 * 
 */
public class EventProcessorForSmallRNCs extends EventProcessorForRNCs {

    /**
     * 
     */
    public EventProcessorForSmallRNCs() {
        logger = LoggerFactory.getLogger(EventProcessorForSmallRNCs.class);
    }

    @Override
    protected void processEvents(final ApEventBean events) {
        // copy only intersestingEvents
        if (interestingEvents.contains(String.valueOf(events.getEventId()))) {
            final GpehBase e = (GpehBase) events;
            final UeContextModuleID key = new UeContextModuleID(
                    e.getUE_CONTEXT(), e.getRNC_MODULE_ID());

            if (ueContextModuleIDtoProcess.contains(key)
                    || isNonSubcriberEvent(e)) {
                if (events instanceof INTERNAL_IMSI) {
                    imsisForLastMpList.add(events);
                    // logger.debug("Entered in instanceof INTERNAL_IMSI");
                    // logger.debug("Event ID in Internal IMSI:"+
                    // events.getEventId()+",");
                } else {
                    eventsToWriteToFile.add(events.clone());
                    // logger.debug("Entered in instanceof eventsToWriteToFile");
                    // logger.debug("Event ID in eventsToWriteToFile:"+
                    // events.getEventId()+",");
                }
            }
        } else {
            dummyEventList.add(events);
            logger.debug("Entered in dummy list add ..Event ID = "
                    + events.getEventId() + ",");
        }
    }

    /**
     * @return
     */
    private boolean isNonSubcriberEvent(GpehBase e) {
        boolean includenonUEevents = DatagenProperties.getInstance()
                .includenonUeEvents();

        return (e.getUE_CONTEXT() == -1 || e.getRNC_MODULE_ID() == -1)
                && includenonUEevents;
    }

}
