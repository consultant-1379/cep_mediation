/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.correlation.core;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.ericsson.cepmediation.apeventbeans.correlation.SGEH_SESSION;
import com.ericsson.cepmediation.correlation.enrichment.SessionEndEvent;
import com.espertech.esper.client.EventBean;
import com.espertech.esper.client.scopetest.SupportUpdateListener;

/**
 * Core correlation basic tests
 *
 * @author exuexie
 */
public class CoreCorrelationBasicTest extends CoreCorrelationBase {

    private SupportUpdateListener basicEventListener = null;

    protected String imeisv = "1234567890123456";

    protected String imsi = "1234";

    @Before
    public void setUp() {
        configure("esper/CoreCorrelation.epl", "CORE_SESSION", basicEventListener = new SupportUpdateListener());
    }

    @Test
    public void sgehSessionCreationTest() {

        //get the current time stamp
        long timestamp = getTimestamp();

        //align the timestamp to the start of a new session
        timestamp = timestamp - timestamp % SESSION_DURATION;

        //send the first event 1minute after session start
        correlationEngine.sendEvent(createCoreEvent(CoreEventType.ACTIVATE, timestamp + 60000, imsi, imeisv, "cmnet", (byte) 0));

        //send the next event 2minute after
        correlationEngine.sendEvent(createCoreEvent(CoreEventType.RAU, timestamp + 120000, imsi, imeisv, null, (byte) 0));

        //send the third event 3minute after
        correlationEngine.sendEvent(createCoreEvent(CoreEventType.ISRAU, timestamp + 180000, imsi, imeisv, null, (byte) 1));

        //send deactivate event
        correlationEngine.sendEvent(createCoreEvent(CoreEventType.DEACTIVATE, timestamp + 180000, imsi, imeisv, "cmwap", (byte) 0));

        correlationEngine.sendEvent(new SessionEndEvent());
        assertEquals("numberOfSessionsCreated", 1, basicEventListener.getNewDataList().size());

        //if the prvious test case is met, there exists one new array eventbeans
        EventBean[] eventBean = basicEventListener.getNewDataList().get(0);

        assertEquals("numberOfEventBeans", 1, eventBean.length);

        SGEH_SESSION sgehSession = (SGEH_SESSION) eventBean[0].getUnderlying();

        assertEquals("START APN:", "cmnet", sgehSession.getSTART_APN());

        assertEquals("END APN:", "cmwap", sgehSession.getEND_APN());

        assertEquals("RAU property value(attempt):", 1, sgehSession.getRAU_ATT_CNT());

        assertEquals("RAU property value(success):", 1, sgehSession.getRAU_SUC_CNT());

        assertEquals("ISRAU property value(attempt):", 1, sgehSession.getISRAU_ATT_CNT());

        assertEquals("ISRAU property value(success):", 0, sgehSession.getISRAU_SUC_CNT());

        assertEquals("TAC: ", 12345678, sgehSession.getTAC());

    }

}