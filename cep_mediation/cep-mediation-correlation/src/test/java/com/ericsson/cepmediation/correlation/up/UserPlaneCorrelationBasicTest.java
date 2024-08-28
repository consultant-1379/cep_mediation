/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.correlation.up;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

import com.ericsson.cepmediation.apeventbeans.bearer_plane.TCP_REPORT_PARTIAL;
import com.ericsson.cepmediation.apeventbeans.correlation.TCP_REPORT_ENRICHED;
import com.ericsson.cepmediation.base.apeventbeans.DefaultValues;
import com.ericsson.cepmediation.correlation.enrichment.SessionEndEvent;
import com.ericsson.cepmediation.correlation.enrichment.listeners.up.TCP_REPORT_ENRICHEDHelper;
import com.espertech.esper.client.EventBean;
import com.espertech.esper.client.scopetest.SupportUpdateListener;

/**
 * User Plane correlation basic tests
 *
 * @author exuexie
 */
public class UserPlaneCorrelationBasicTest extends UserPlaneCorrelationBase {

    private SupportUpdateListener basicEventListener = null;

    protected String imeisv = "1234567890123456";

    protected String imsi = "1234";

    protected String host = "youtube";

    @Before
    public void setUp() {
        configure("esper/WcdmaUserPlaneCorrelation.epl", "TCP_REPORT_ENRICHED", basicEventListener = new SupportUpdateListener());
    }

    @Test
    public void testFloatFieldsSetToDefaultFloatValuesWithFlashVideoReport() {
        //FLASH_PARTIAL_REMOVED.
    }

    @Test
    public void testFloatFieldsDurationSetToDefaultFLoatValuesWithTcpPartialReprt() {

        TCP_REPORT_PARTIAL event = new TCP_REPORT_PARTIAL();

        correlationEngine.sendEvent(event);

        correlationEngine.sendEvent(new SessionEndEvent());
        assertEquals("numberOfSessionsCreated", 1, basicEventListener.getNewDataList().size());

        //if the previous test case is met, there exists one new array eventbeans
        EventBean[] eventBean = basicEventListener.getNewDataList().get(0);

        assertEquals("numberOfEventBeans", 1, eventBean.length);

        TCP_REPORT_ENRICHED session = (TCP_REPORT_ENRICHED) eventBean[0].getUnderlying();

        assertEquals("IMEISV", -1, session.getIMEISV());
        assertEquals("EVENT ID", 20002, session.getEVENT_ID());
        assertEquals("START APN", null, session.getSTART_APN());
        assertEquals("END APN", null, session.getEND_APN());
        assertEquals("DURATION", 60, session.getDURATION());
        assertEquals("DOWNLINK", false, session.getDOWNLINK());
        assertEquals("Data received", -1, session.getDATA_RECEIVED());
        assertEquals("MAX_RWIN", -1, session.getMAX_RWIN());
        assertEquals("SETUP_TIME_NET", 0, session.getSETUP_TIME_NET());
        assertEquals("SETUP_TIME_TERM", 0, session.getSETUP_TIME_TERM());
        assertEquals("MAX_DATA_PACKET", -1, session.getMAX_DATA_PACKET());
        assertEquals(0, session.getPACKET_LOSS_NET(), 0);
        assertEquals(0, session.getPACKET_LOSS_TERM(), 0);
        assertEquals("TAC", -1, session.getTAC());
        assertEquals("ACTIVITY START TIME", 0, session.getACTIVITY_START_TIME());
        assertEquals("ACTIVITY duration", 0, session.getACTIVITY_DURATION());
        assertEquals("Number of samples", 1, session.getNO_OF_SAMPLES());
        assertEquals("IMSI", -1, session.getIMSI());
        assertEquals("HOST", null, session.getHOST());
        assertEquals(DefaultValues.DEFAULT_FLOAT_VALUE, session.getALONE_RATIO(), 0);

    }

    @Test
    public void testFloatFieldsSetToDefaultFLoatValueIfUnsetInEvents() {

        //get the current time stamp
        long timestamp = getTimestamp();

        //align the timestamp to the start of a new session
        timestamp = timestamp - timestamp % SESSION_DURATION;

        TCP_REPORT_PARTIAL e1 = createTcpReportPartialEvent(timestamp, 3, (byte) 1, 100, 1000, 0.3f, 0.3f, 3000, 0f, 0, host, imsi, imeisv, "cmnet");

        correlationEngine.sendEvent(e1);

        correlationEngine.sendEvent(new SessionEndEvent());
        assertEquals("numberOfSessionsCreated", 1, basicEventListener.getNewDataList().size());

        //if the previous test case is met, there exists one new array eventbeans
        EventBean[] eventBean = basicEventListener.getNewDataList().get(0);

        assertEquals("numberOfEventBeans", 1, eventBean.length);

        TCP_REPORT_ENRICHED session = (TCP_REPORT_ENRICHED) eventBean[0].getUnderlying();

        assertEquals("IMEISV", 1234567890123456L, session.getIMEISV());
        assertEquals("EVENT ID", 20002, session.getEVENT_ID());
        assertEquals("START APN", "cmnet", session.getSTART_APN());
        assertEquals("END APN", "cmnet", session.getEND_APN());
        assertEquals("DURATION", 60, session.getDURATION());
        assertEquals("DOWNLINK", true, session.getDOWNLINK());
        assertEquals("Data received", 100, session.getDATA_RECEIVED());
        assertEquals("MAX_RWIN", 1000, session.getMAX_RWIN());
        assertEquals("SETUP_TIME_NET", 300, session.getSETUP_TIME_NET());
        assertEquals("SETUP_TIME_TERM", 300, session.getSETUP_TIME_TERM());
        assertEquals("MAX_DATA_PACKET", 3000, session.getMAX_DATA_PACKET());
        assertEquals(0f, session.getPACKET_LOSS_NET(), 0);
        assertEquals(0f, session.getPACKET_LOSS_TERM(), 0);
        assertEquals("TAC", 12345678, session.getTAC());
        assertEquals("ACTIVITY START TIME", timestamp, session.getACTIVITY_START_TIME());
        assertEquals("ACTIVITY duration", 3000, session.getACTIVITY_DURATION());
        assertEquals("Number of samples", 1, session.getNO_OF_SAMPLES());
        assertEquals("IMSI", 1234, session.getIMSI());
        assertEquals("HOST", "youtube", session.getHOST());
        assertEquals(DefaultValues.DEFAULT_FLOAT_VALUE, session.getALONE_RATIO(), 0);

    }

    @Test
    public void tcpSessionCreationTest() {

        //get the current time stamp
        long timestamp = getTimestamp();

        //align the timestamp to the start of a new session
        timestamp = timestamp - timestamp % SESSION_DURATION;

        TCP_REPORT_PARTIAL e1 = createTcpReportPartialEvent(timestamp, 3, (byte) 1, 100, 1000, 0.3f, 0.3f, 3000, 0.10f, 0.10f, host, imsi, imeisv, "cmnet");

        correlationEngine.sendEvent(e1);

        TCP_REPORT_PARTIAL e2 = createTcpReportPartialEvent(timestamp + 30 * 1000, 4, (byte) 1, 100, 2000, 0.4f, 0.2f, 2000, 0.05f, 0.4f, host, imsi, imeisv,
                "cmwap");

        correlationEngine.sendEvent(e2);

        correlationEngine.sendEvent(new SessionEndEvent());
        assertEquals("numberOfSessionsCreated", 1, basicEventListener.getNewDataList().size());

        //if the prvious test case is met, there exists one new array eventbeans
        EventBean[] eventBean = basicEventListener.getNewDataList().get(0);

        assertEquals("numberOfEventBeans", 1, eventBean.length);

        TCP_REPORT_ENRICHED session = (TCP_REPORT_ENRICHED) eventBean[0].getUnderlying();

        assertEquals("IMEISV", 1234567890123456L, session.getIMEISV());
        assertEquals("EVENT ID", 20002, session.getEVENT_ID());
        assertEquals("START APN", "cmnet", session.getSTART_APN());
        assertEquals("END APN", "cmwap", session.getEND_APN());
        assertEquals("DURATION", 60, session.getDURATION());
        assertEquals("DOWNLINK", true, session.getDOWNLINK());
        assertEquals("Data received", 200, session.getDATA_RECEIVED());
        assertEquals("MAX_RWIN", 2000, session.getMAX_RWIN());
        assertEquals("SETUP_TIME_NET", 700, session.getSETUP_TIME_NET());
        assertEquals("SETUP_TIME_TERM", 500, session.getSETUP_TIME_TERM());
        assertEquals("MAX_DATA_PACKET", 3000, session.getMAX_DATA_PACKET());
        assertEquals(0.15f, session.getPACKET_LOSS_NET(), 0);
        assertEquals(0.5f, session.getPACKET_LOSS_TERM(), 0);
        assertEquals("TAC", 12345678, session.getTAC());
        assertEquals("ACTIVITY START TIME", timestamp, session.getACTIVITY_START_TIME());
        assertEquals("ACTIVITY duration", 7000, session.getACTIVITY_DURATION());
        assertEquals("Number of samples", 2, session.getNO_OF_SAMPLES());
        assertEquals("IMSI", 1234, session.getIMSI());
        assertEquals("HOST", "youtube", session.getHOST());

    }

    @Test
    public void tcpSessionCreationWithInvalidNumericValues() {

        //get the current time stamp
        long timestamp = getTimestamp();

        //align the timestamp to the start of a new session
        timestamp = timestamp - timestamp % SESSION_DURATION;

        TCP_REPORT_PARTIAL e1 = createTcpReportPartialEvent(timestamp, 3, (byte) 1, 100, 1000, 0.3f, DefaultValues.DEFAULT_FLOAT_VALUE, 3000, 0.10f,
                DefaultValues.DEFAULT_FLOAT_VALUE, host, imsi, imeisv, "cmnet");

        correlationEngine.sendEvent(e1);

        TCP_REPORT_PARTIAL e2 = createTcpReportPartialEvent(timestamp + 30 * 1000, 4, (byte) 1, 100, 2000, DefaultValues.DEFAULT_FLOAT_VALUE, 0.2f, 2000,
                0.05f, DefaultValues.DEFAULT_FLOAT_VALUE, host, imsi, imeisv, "cmwap");

        correlationEngine.sendEvent(e2);

        correlationEngine.sendEvent(new SessionEndEvent());
        assertEquals("numberOfSessionsCreated", 1, basicEventListener.getNewDataList().size());

        //if the prvious test case is met, there exists one new array eventbeans
        EventBean[] eventBean = basicEventListener.getNewDataList().get(0);

        assertEquals("numberOfEventBeans", 1, eventBean.length);

        TCP_REPORT_ENRICHEDHelper session = (TCP_REPORT_ENRICHEDHelper) eventBean[0].getUnderlying();

        assertEquals("IMEISV", 1234567890123456L, session.getIMEISV());
        assertEquals("EVENT ID", 20002, session.getEVENT_ID());
        assertEquals("START APN", "cmnet", session.getSTART_APN());
        assertEquals("END APN", "cmwap", session.getEND_APN());
        assertEquals("DURATION", 60, session.getDURATION());
        assertEquals("DOWNLINK", true, session.getDOWNLINK());
        assertEquals("Data received", 200, session.getDATA_RECEIVED());
        assertEquals("MAX_RWIN", 2000, session.getMAX_RWIN());
        assertEquals("SETUP_TIME_NET", 300, session.getSETUP_TIME_NET());
        assertEquals("SETUP_TIME_NETCount", 1, session.getSETUP_TIME_NETCount());
        assertEquals("SETUP_TIME_TERM", 200, session.getSETUP_TIME_TERM());
        assertEquals("SETUP_TIME_TERMCount", 1, session.getSETUP_TIME_TERMCount());
        assertEquals("MAX_DATA_PACKET", 3000, session.getMAX_DATA_PACKET());
        assertEquals("PACKET_LOSS_NET", 0.15f, session.getPACKET_LOSS_NET(), 0);
        assertEquals("PACKET_LOSS_NETCount", 2, session.getPACKET_LOSS_NETCount());
        assertEquals("PACKET_LOSS_TERM", 0, session.getPACKET_LOSS_TERM(), 0);
        assertEquals("PACKET_LOSS_TERMCount", 0, session.getPACKET_LOSS_TERMCount());
        assertEquals("TAC", 12345678, session.getTAC());
        assertEquals("ACTIVITY START TIME", timestamp, session.getACTIVITY_START_TIME());
        assertEquals("ACTIVITY duration", 7000, session.getACTIVITY_DURATION());
        assertEquals("Number of samples", 2, session.getNO_OF_SAMPLES());
        assertEquals("IMSI", 1234, session.getIMSI());
        assertEquals("HOST", "youtube", session.getHOST());

    }

    @Test
    public void tcpSessionCreationWithDifferentHostTest() {

        //get the current time stamp
        long timestamp = getTimestamp();

        //align the timestamp to the start of a new session
        timestamp = timestamp - timestamp % SESSION_DURATION;

        TCP_REPORT_PARTIAL e1 = createTcpReportPartialEvent(timestamp, 3, (byte) 1, 100, 1000, 0.3f, 0.3f, 3000, 0.10f, 0.10f, "youtube", imsi, imeisv, "cmnet");

        correlationEngine.sendEvent(e1);

        TCP_REPORT_PARTIAL e2 = createTcpReportPartialEvent(timestamp + 30 * 1000, 4, (byte) 1, 100, 2000, 0.4f, 0.2f, 2000, 0.05f, 0.4f, "google", imsi,
                imeisv, "cmnet");

        correlationEngine.sendEvent(e2);

        correlationEngine.sendEvent(new SessionEndEvent());
        assertEquals("numberOfSessionsCreated", 1, basicEventListener.getNewDataList().size());

        //if the prvious test case is met, there exists one new array eventbeans
        EventBean[] eventBean = basicEventListener.getNewDataList().get(0);

        assertEquals("numberOfEventBeans", 2, eventBean.length);

    }

    @Test
    public void tcpSessionCreationWithDifferentDownLinkTest() {

        //get the current time stamp
        long timestamp = getTimestamp();

        //align the timestamp to the start of a new session
        timestamp = timestamp - timestamp % SESSION_DURATION;

        TCP_REPORT_PARTIAL e1 = createTcpReportPartialEvent(timestamp, 3, (byte) 0, 100, 1000, 0.3f, 0.3f, 3000, 0.10f, 0.10f, host, imsi, imeisv, "cmnet");

        correlationEngine.sendEvent(e1);

        TCP_REPORT_PARTIAL e2 = createTcpReportPartialEvent(timestamp + 30 * 1000, 4, (byte) 1, 100, 2000, 0.4f, 0.2f, 2000, 0.05f, 0.4f, host, imsi, imeisv,
                "cmnet");

        correlationEngine.sendEvent(e2);

        correlationEngine.sendEvent(new SessionEndEvent());
        assertEquals("numberOfSessionsCreated", 1, basicEventListener.getNewDataList().size());

        //if the prvious test case is met, there exists one new array eventbeans
        EventBean[] eventBean = basicEventListener.getNewDataList().get(0);

        assertEquals("numberOfEventBeans", 2, eventBean.length);

    }

    @Test
    public void tcpSessionCreationFromFlvPartialTest() {
      //FLASH_PARTIAL_REMOVED.
    }

    @Test
    public void tcpSessionCreationFromFlvPartialTestWithInvalidNumericValues() {
      //FLASH_PATIAL_REMOVED.
    }

    @Test
    public void tcpSessionCreationWithNullAggKeysTest() {

        //get the current time stamp
        long timestamp = getTimestamp();

        //align the timestamp to the start of a new session
        timestamp = timestamp - timestamp % SESSION_DURATION;

        TCP_REPORT_PARTIAL e1 = new TCP_REPORT_PARTIAL(timestamp, "", "", "", "");
        TCP_REPORT_PARTIAL e2 = new TCP_REPORT_PARTIAL(timestamp, "", "", "", "");

        e1.setIMSI(imsi);
        e2.setIMSI(imsi);

        correlationEngine.sendEvent(e1);

        correlationEngine.sendEvent(e2);

        correlationEngine.sendEvent(new SessionEndEvent());

        assertThat(basicEventListener.getNewDataList().size(), is(1));

        //if the prvious test case is met, there exists one new array eventbeans
        EventBean[] eventBean = basicEventListener.getNewDataList().get(0);

        assertThat(eventBean.length, is(1));

        TCP_REPORT_ENRICHEDHelper session = (TCP_REPORT_ENRICHEDHelper) eventBean[0].getUnderlying();

        assertThat(session.getIMSI(), is(Long.valueOf(imsi)));
        assertThat(session.getNO_OF_SAMPLES(), is(2));
        assertThat(session.getHOST(), is(nullValue()));
        assertThat(session.getDOWNLINK(), is(false));
        assertThat(session.getUE_IP_ADDRESS(), is(nullValue()));

    }

    @Test
    public void tcpSessionCreationWithSameArrayTest() {

        //get the current time stamp
        long timestamp = getTimestamp();

        //align the timestamp to the start of a new session
        timestamp = timestamp - timestamp % SESSION_DURATION;

        TCP_REPORT_PARTIAL e1 = new TCP_REPORT_PARTIAL(timestamp, "", "", "", "");
        TCP_REPORT_PARTIAL e2 = new TCP_REPORT_PARTIAL(timestamp, "", "", "", "");

        e1.setIMSI(imsi);
        e1.setUE_ADDRESS("192.168.1.1");

        e2.setIMSI(imsi);
        e2.setUE_ADDRESS("192.168.1.1");

        correlationEngine.sendEvent(e1);

        correlationEngine.sendEvent(e2);

        correlationEngine.sendEvent(new SessionEndEvent());

        assertThat(basicEventListener.getNewDataList().size(), is(1));

        //if the prvious test case is met, there exists one new array eventbeans
        EventBean[] eventBean = basicEventListener.getNewDataList().get(0);

        assertThat(eventBean.length, is(1));

        TCP_REPORT_ENRICHEDHelper session = (TCP_REPORT_ENRICHEDHelper) eventBean[0].getUnderlying();

        byte[] addrs = { (byte) 192, (byte) 168, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

        assertArrayEquals(addrs, session.getUE_IP_ADDRESS());

    }

}