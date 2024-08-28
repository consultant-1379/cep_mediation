package com.ericsson.cepmediation.correlation.radio;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.ericsson.cepmediation.apeventbeans.gpeh.INTERNAL_IMSI;
import com.ericsson.cepmediation.test.common.GpehEventType;
import com.espertech.esper.event.arr.ObjectArrayEventBean;

@Ignore
public class RadioCorrelationSessionEventEnrichmentByImsiTest extends RadioCorrelationBase {

    @Before
    public void setUp() throws Exception {
        configure("radio_correlation.epl");
        rncId = 1;
        rncModuleId = 1;
        ueContext = 1;
        cellId = 1;
    }

    @Test
    public void shouldMiddleEventsEnrichedWithTheImsiofTheInternalImsiEvent() {
        correlationEngine.sendEvent(createRadioEventsWithParams(GpehEventType.RRC_RRC_CONNECTION_SETUP, cellId, rncId, rncModuleId, ueContext));
        correlationEngine.sendEvent(createRadioEventsWithParams(GpehEventType.INTERNAL_CHANNEL_SWITCHING, cellId, rncId, rncModuleId, ueContext));
        final INTERNAL_IMSI imsiEvent = (INTERNAL_IMSI) createRadioEventsWithParams(GpehEventType.INTERNAL_IMSI, cellId, rncId, rncModuleId, ueContext);
        correlationEngine.sendEvent(imsiEvent);
        final ObjectArrayEventBean parameters = (ObjectArrayEventBean) enrichedEventListener.getNewDataList().get(0)[0];
        Assert.assertEquals("imsiOfTheMiddleEventShouldMatchWithTheInternalImsi", imsiEvent.getIMSI(), parameters.getProperties()[1]);
    }

}
