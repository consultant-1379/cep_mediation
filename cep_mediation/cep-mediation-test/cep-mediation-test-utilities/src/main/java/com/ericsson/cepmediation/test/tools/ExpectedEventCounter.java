/*------------------------------------------------------------------------------
 *******************************************************************************
 * COPYRIGHT Ericsson 2015
 *
 * The copyright to the computer program(s) herein is the property of
 * Ericsson Inc. The programs may be used and/or copied only with written
 * permission from Ericsson Inc. or in accordance with the terms and
 * conditions stipulated in the agreement/contract under which the
 * program(s) have been supplied.
 *******************************************************************************
 *----------------------------------------------------------------------------*/
package com.ericsson.cepmediation.test.tools;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.ericsson.cepmediation.base.apeventbeans.ApEventBean;
import com.ericsson.cepmediation.test.common.GpehEventType;


public class ExpectedEventCounter {

    private static List<GpehEventType> eventsThatContributeToEventCount = new ArrayList<GpehEventType>();

    static {
        eventsThatContributeToEventCount
                .add(GpehEventType.RRC_RRC_CONNECTION_SETUP);
        eventsThatContributeToEventCount
                .add(GpehEventType.RRC_RRC_CONNECTION_RELEASE_COMPLETE);
        eventsThatContributeToEventCount
                .add(GpehEventType.INTERNAL_RAB_ESTABLISHMENT);
        eventsThatContributeToEventCount
                .add(GpehEventType.INTERNAL_NORMAL_RELEASE);
        eventsThatContributeToEventCount
                .add(GpehEventType.INTERNAL_RAB_RELEASE);
        eventsThatContributeToEventCount
                .add(GpehEventType.INTERNAL_SYSTEM_RELEASE);
        eventsThatContributeToEventCount
                .add(GpehEventType.INTERNAL_CHANNEL_SWITCHING);
        eventsThatContributeToEventCount
                .add(GpehEventType.INTERNAL_FAILED_HSDSCH_CELL_CHANGE);
        eventsThatContributeToEventCount
                .add(GpehEventType.INTERNAL_SUCCESSFUL_HSDSCH_CELL_CHANGE);
        eventsThatContributeToEventCount
                .add(GpehEventType.INTERNAL_HSDSCH_CELL_SELECTION_NO_CELL_SELECTED);
        eventsThatContributeToEventCount
                .add(GpehEventType.INTERNAL_OUT_HARD_HANDOVER_FAILURE);
        eventsThatContributeToEventCount
                .add(GpehEventType.INTERNAL_IFHO_EXECUTION_ACTIVE);
        eventsThatContributeToEventCount
                .add(GpehEventType.INTERNAL_SOFT_HANDOVER_EXECUTION);
        eventsThatContributeToEventCount
                .add(GpehEventType.INTERNAL_CMODE_ACTIVATE);
        eventsThatContributeToEventCount
                .add(GpehEventType.INTERNAL_CMODE_DEACTIVATE);
        eventsThatContributeToEventCount
                .add(GpehEventType.RANAP_IU_RELEASE_COMMAND);
        eventsThatContributeToEventCount
                .add(GpehEventType.RRC_MEASUREMENT_REPORT);

    }

    public int calculateExpectedEventCount(final Collection<ApEventBean> events) {
        final List<GpehEventType> eventTypes = new ArrayList<GpehEventType>();
        for (final ApEventBean gpehEvent : events) {
            eventTypes.add((GpehEventType) getEventType(gpehEvent));
        }
        return calculateExpectedEventCountForEventTypes(eventTypes);
    }

    private Object getEventType(final ApEventBean gpehEvent) {
        return GpehEventType.getEventType(gpehEvent.getEventId());
    }

    public int calculateExpectedEventCountForEventTypes(
            final Collection<GpehEventType> eventTypes) {
        int expectedEventCount = 0;
        for (final GpehEventType gpehEventType : eventTypes) {
            if (eventsThatContributeToEventCount.contains(gpehEventType)) {
                expectedEventCount++;
            }
        }
        return expectedEventCount;
    }

}
