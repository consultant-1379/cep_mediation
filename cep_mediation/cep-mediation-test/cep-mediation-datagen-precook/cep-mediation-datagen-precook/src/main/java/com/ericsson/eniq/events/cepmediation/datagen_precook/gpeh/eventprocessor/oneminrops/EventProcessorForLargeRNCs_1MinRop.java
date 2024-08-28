/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2013 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.eniq.events.cepmediation.datagen_precook.gpeh.eventprocessor.oneminrops;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.LoggerFactory;

import com.ericsson.cepmediation.apeventbeans.gpeh.GpehBase;
import com.ericsson.cepmediation.apeventbeans.gpeh.INTERNAL_CHANNEL_SWITCHING;
import com.ericsson.cepmediation.apeventbeans.gpeh.INTERNAL_IMSI;
import com.ericsson.cepmediation.apeventbeans.gpeh.INTERNAL_RES_CPICH_ECNO;
import com.ericsson.cepmediation.apeventbeans.gpeh.INTERNAL_SYSTEM_RELEASE;
import com.ericsson.cepmediation.apeventbeans.gpeh.INTERNAL_UE_POSITIONING_QOS;
import com.ericsson.cepmediation.apeventbeans.gpeh.INTERNAL_UE_POSITIONING_UNSUCC;
import com.ericsson.cepmediation.apeventbeans.gpeh.INTERNAL_SYSTEM_UTILIZATION;
import com.ericsson.cepmediation.base.apeventbeans.ApEventBean;
import com.ericsson.eniq.events.cepmediation.datagen_precook.common.DatagenProperties;
import com.ericsson.eniq.events.cepmediation.datagen_precook.utils.uecontext.UeContextModuleID;
import com.ericsson.eniq.events.cepmediation.datagen_precook.utils.uecontext.UeContextModuleIdMapping;

/**
 * @author eikrwaq
 * @since 2013
 *
 */
public class EventProcessorForLargeRNCs_1MinRop extends EventProcessorForRNCs_1MinRop {

    private static final String INVALID_IMIS = "0fffffffffffffff";
  
    protected int internalSysToCloneCounter = 0;
    
    protected int internalSysToClone = DatagenProperties.getInstance().getType().getNumberInternalSysUtilToClone();
    
    protected final int internalSysToTrack = 100;
    
    protected int internalSysToTrackCounter = 0;

    public EventProcessorForLargeRNCs_1MinRop() {
        logger = LoggerFactory.getLogger(EventProcessorForLargeRNCs_1MinRop.class);
    }

    @Override
    protected void processEvents(final ApEventBean event) {
        // copy only intersestingEvents
        if (interestingEvents.contains(String.valueOf(event.getEventId()))) {
            final GpehBase e = (GpehBase) event;
            final UeContextModuleID key = new UeContextModuleID(e.getUE_CONTEXT(), e.getRNC_MODULE_ID());
            int numOfEventsToClone = DatagenProperties.getInstance().getType().getNumberOfEventToClone() - 1;
            if (event instanceof INTERNAL_IMSI) {
                if (ueContextModuleIDtoProcess.contains(key)) {
                    numOfEventsToClone++;
                }
                imsisForLastMpList.add(event);
                cloneAndStoreEvent(event, numOfEventsToClone, key, true);

            } else {
            	 if (event instanceof INTERNAL_SYSTEM_UTILIZATION){
           		    if (internalSysToTrackCounter < internalSysToTrack) {
           		       if (internalSysToCloneCounter < internalSysToClone){
           		          numOfEventsToClone++;
           		          internalSysToCloneCounter++;
           		       }
           		       internalSysToTrackCounter ++;
           		    }
           		    else {
           			    internalSysToTrackCounter = 0;
           			    internalSysToCloneCounter = 0;
           		    }   
           	   }
               else {   
                   if (ueContextModuleIDtoProcess.contains(key)) {
                       numOfEventsToClone++;
                  }
              }
              eventsToWriteToFile.add(event);
              cloneAndStoreEvent(event, numOfEventsToClone, key, false);
           }
        } else {
            dummyEventList.add(event);
        }
    }

    /**
     * @param event
     * @param i
     */
    protected void cloneAndStoreEvent(final ApEventBean event, final int amountToClone, final UeContextModuleID key,
            final boolean isImsi) {
        final List<UeContextModuleID> alreadyUsed = new ArrayList<UeContextModuleID>();
        for (int count = 0; count < amountToClone; count++) {
            final GpehBase evnt = (GpehBase) event.clone();
            UeContextModuleID newPair = null;
            if  (event instanceof INTERNAL_SYSTEM_UTILIZATION){
                eventsToWriteToFile.add((evnt));
      			 
      		}
            else {
                if (UeContextModuleIdMapping.getInstance().isAlreadyMapped(key)) {
                   final List<UeContextModuleID> mapping = UeContextModuleIdMapping.getInstance().getMapping(key);
                   for (final UeContextModuleID newId : mapping) {
                       if (!alreadyUsed.contains(newId)) {
                           newPair = newId;
                           alreadyUsed.add(newPair);
                           break;
                       }
                   }
                }
                if (newPair == null) {
                   newPair = ueContextGen.getUniqueUeContextMoudleID();
                   UeContextModuleIdMapping.getInstance().addUeContextMapping(key, newPair);
                   alreadyUsed.add(newPair);
                }
               evnt.setUE_CONTEXT(newPair.getUeContext());
               evnt.setRNC_MODULE_ID(newPair.getModuleID());
               if (isImsi) {
                   imsisForLastMpList.add(changeIMSI(evnt));
               } else {
                    // we need to change IMSI in other events like INTERNAL_CHANNEL_SWITCHING
                    eventsToWriteToFile.add(changeIMSI(evnt));
               }
            }
        }
    }

    /**
     * @return
     */
    private GpehBase changeIMSI(final GpehBase evnt) {
        if (evnt instanceof INTERNAL_CHANNEL_SWITCHING) {
            if (!((INTERNAL_CHANNEL_SWITCHING) evnt).getIMSI().equals(INVALID_IMIS)) {
                ((INTERNAL_CHANNEL_SWITCHING) evnt).setIMSI(randomIMSIGenerator
                        .getImsi(((INTERNAL_CHANNEL_SWITCHING) evnt).getIMSI()));
            }
        } else if (evnt instanceof INTERNAL_IMSI) {
            if (!((INTERNAL_IMSI) evnt).getIMSI().equals(INVALID_IMIS)) {
                ((INTERNAL_IMSI) evnt).setIMSI(randomIMSIGenerator.getImsi(((INTERNAL_IMSI) evnt).getIMSI()));
            }
        } else if (evnt instanceof INTERNAL_RES_CPICH_ECNO) {
            if (!((INTERNAL_RES_CPICH_ECNO) evnt).getIMSI().equals(INVALID_IMIS)) {
                ((INTERNAL_RES_CPICH_ECNO) evnt).setIMSI(randomIMSIGenerator.getImsi(((INTERNAL_RES_CPICH_ECNO) evnt)
                        .getIMSI()));
            }
        } else if (evnt instanceof INTERNAL_SYSTEM_RELEASE) {
            if (!((INTERNAL_SYSTEM_RELEASE) evnt).getIMSI().equals(INVALID_IMIS)) {
                ((INTERNAL_SYSTEM_RELEASE) evnt).setIMSI(randomIMSIGenerator.getImsi(((INTERNAL_SYSTEM_RELEASE) evnt)
                        .getIMSI()));
            }
        } else if (evnt instanceof INTERNAL_UE_POSITIONING_QOS) {
            if (!((INTERNAL_UE_POSITIONING_QOS) evnt).getIMSI().equals(INVALID_IMIS)) {
                ((INTERNAL_UE_POSITIONING_QOS) evnt).setIMSI(randomIMSIGenerator
                        .getImsi(((INTERNAL_UE_POSITIONING_QOS) evnt).getIMSI()));
            }
        } else if (evnt instanceof INTERNAL_UE_POSITIONING_UNSUCC) {
            if (!((INTERNAL_UE_POSITIONING_UNSUCC) evnt).getIMSI().equals(INVALID_IMIS)) {
                ((INTERNAL_UE_POSITIONING_UNSUCC) evnt).setIMSI(randomIMSIGenerator
                        .getImsi(((INTERNAL_UE_POSITIONING_UNSUCC) evnt).getIMSI()));
            }

        }
        return evnt;
    }

}
