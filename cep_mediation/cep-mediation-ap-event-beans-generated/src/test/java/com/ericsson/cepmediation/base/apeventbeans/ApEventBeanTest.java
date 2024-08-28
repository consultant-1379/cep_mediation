/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.base.apeventbeans;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import com.ericsson.cepmediation.apeventbeans.correlation.TCP_REPORT_ENRICHED;
import com.ericsson.cepmediation.apeventbeans.gpeh.RRC_RRC_CONNECTION_RELEASE;
import com.ericsson.cepmediation.apeventbeans.gpeh.RRC_MEASUREMENT_REPORT;
import com.ericsson.cepmediation.base.meta.schema.Event;
import com.ericsson.cepmediation.base.meta.schema.EventParameter;
import com.ericsson.cepmediation.base.util.constants.MeasReportAttributes;

/**
 * @author eemecoy
 *
 */
public class ApEventBeanTest {

    @Test
    public void testAdjustOffset_DoesNotHaveValidity() {
        testAdjustOffset(false);
    }

    @Test
    public void testAdjustOffset_HasValidity() {
        testAdjustOffset(true);
    }

    private void testAdjustOffset(boolean isUseValid) {
        StubbedApEventBean apEventBean = new StubbedApEventBean();
        EventParameter parameter = mock(EventParameter.class);
        when(parameter.isUseValid()).thenReturn(isUseValid);
        int offset = 0;
        int adjustOffset = apEventBean.adjustOffset(parameter, offset);
        int expectedOffset = 0;
        if (isUseValid) {
            expectedOffset = 1;
        }
        assertThat(adjustOffset, is(expectedOffset));
    }

    @Test
    public void testGetDecodedString_TCP_REPORT_ENRICHED() {
        final ApEventBean event = new TCP_REPORT_ENRICHED();
        printDecodedString(event);
    }

    private void printDecodedString(final ApEventBean event) {
        final String decodedString = event.getDecodedString();
        System.out.println(decodedString);
    }

    @Test
    public void testGetDecodedString_RRC_RRC_CONNECTION_RELEASE() {
        final RRC_RRC_CONNECTION_RELEASE event = new RRC_RRC_CONNECTION_RELEASE(0, null, null, null, null);
        printDecodedString(event);
    }

    @Test
    public void testGetDecodedString_RRC_MEASUREMENT_REPORT() {
        final RRC_MEASUREMENT_REPORT event = createRRCMeasReportEvent();
        printDecodedString(event);
    }

    private RRC_MEASUREMENT_REPORT createRRCMeasReportEvent() {
        final RRC_MEASUREMENT_REPORT event = new RRC_MEASUREMENT_REPORT();
        final List<Asn1Message> asn1MessageList = new ArrayList<Asn1Message>();
        final Asn1Message asn1Message1 = new Asn1Message();
        final Map<String, String> messageAttributes = new HashMap<String, String>();
        messageAttributes.put(MeasReportAttributes.EC_NO, "13");
        messageAttributes.put(MeasReportAttributes.RSCP, "223");
        asn1Message1.setMessageAttributes(messageAttributes);
        asn1MessageList.add(asn1Message1);
        final Asn1Message asn1Message2 = new Asn1Message();
        final Map<String, String> messageAttributes2 = new HashMap<String, String>();
        messageAttributes2.put(MeasReportAttributes.SCRAMBLING_CODE, "3");
        messageAttributes2.put(MeasReportAttributes.MEASUREMENT_TYPE, "4");
        asn1Message2.setMessageAttributes(messageAttributes2);
        asn1MessageList.add(asn1Message2);
        event.setAsn1MessageList(asn1MessageList);
        event.setMESSAGE_CONTENTS(new byte[] {});
        return event;
    }

    class StubbedApEventBean extends ApEventBean {

        /* (non-Javadoc)
         * @see com.ericsson.cepmediation.base.apeventbeans.ApEventBean#getAbsoluteName()
         */
        @Override
        public String getAbsoluteName() {
            // TODO Auto-generated method stub
            return null;
        }

        /* (non-Javadoc)
         * @see com.ericsson.cepmediation.base.apeventbeans.ApEventBean#setData(com.ericsson.cepmediation.base.meta.schema.Event, byte[], int)
         */
        @Override
        public void setData(Event event, byte[] data, int offset) {
            // TODO Auto-generated method stub

        }

        /* (non-Javadoc)
         * @see com.ericsson.cepmediation.base.apeventbeans.ApEventBean#getCSVString()
         */
        @Override
        public String getCSVString() {
            // TODO Auto-generated method stub
            return null;
        }

        /* (non-Javadoc)
         * @see com.ericsson.cepmediation.base.apeventbeans.ApEventBean#getDecodedString()
         */
        @Override
        public String getDecodedString() {
            // TODO Auto-generated method stub
            return null;
        }

    }

}
