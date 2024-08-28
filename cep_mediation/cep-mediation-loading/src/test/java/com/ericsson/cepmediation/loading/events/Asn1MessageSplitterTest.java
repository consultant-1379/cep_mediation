/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.loading.events;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import org.mockito.ArgumentMatcher;

import com.ericsson.cepmediation.apeventbeans.correlation.ASN1_MEASUREMENT;
import com.ericsson.cepmediation.apeventbeans.gpeh.RRC_MEASUREMENT_REPORT;
import com.ericsson.cepmediation.base.apeventbeans.Asn1Message;
import com.ericsson.cepmediation.base.util.constants.MeasReportAttributes;
import com.ericsson.cepmediation.loading.asn1.ASN1MeasurementWrapper;

/**
 * @author eemecoy
 *
 */
public class Asn1MessageSplitterTest {

    private final int cellId1 = 3;

    private final int cellId2 = 56;

    private final int cellId3 = 67;

    private final int cellId4 = 45;

    private final short rncId1 = 2;

    private final short rncId2 = 4;

    private final short rncId3 = 6;

    private final short rncId4 = 4;

    @Before
    public void setup() {

        new Asn1MessageSplitter();
    }

    @Test
    public void testSplitEvent() {
        final RRC_MEASUREMENT_REPORT rrcMeasurementReportEvent = new RRC_MEASUREMENT_REPORT();
        final List<Asn1Message> asn1MessageList = new ArrayList<Asn1Message>();
        final int ecno1 = 3;
        final byte orderNumber1 = 1;
        final int rscp1 = 7;
        final int bsic1 = 3;
        final byte measurementType1 = 2;
        final short triggerEventId1 = 4;
        final short scramblingCode1 = 99;
        byte eventResultsOrderNumber = 2;
        final Asn1Message asn1Message1 = createAsn1Message(orderNumber1, ecno1, rscp1, bsic1, measurementType1,
                triggerEventId1, scramblingCode1, eventResultsOrderNumber);
        asn1MessageList.add(asn1Message1);
        rrcMeasurementReportEvent.setAsn1MessageList(asn1MessageList);
        setTopologyFields(rrcMeasurementReportEvent);
        final List<Object> result = Asn1MessageSplitter.splitEvent(rrcMeasurementReportEvent);
        assertThat(result.size(), is(1));
        final ASN1MeasurementWrapper expectedEvent = createExpectedEvent(orderNumber1, ecno1, rscp1, bsic1,
                measurementType1, triggerEventId1, scramblingCode1);
        assertThat(new IsMatchingApEventBean(expectedEvent).matches(result.get(0)), is(true));
    }

    private void setTopologyFields(final RRC_MEASUREMENT_REPORT rrcMeasurementReportEvent) {
        rrcMeasurementReportEvent.setC_ID_1(cellId1);
        rrcMeasurementReportEvent.setC_ID_2(cellId2);
        rrcMeasurementReportEvent.setC_ID_3(cellId3);
        rrcMeasurementReportEvent.setC_ID_4(cellId4);
        rrcMeasurementReportEvent.setRNC_ID_1(rncId1);
        rrcMeasurementReportEvent.setRNC_ID_2(rncId2);
        rrcMeasurementReportEvent.setRNC_ID_3(rncId3);
        rrcMeasurementReportEvent.setRNC_ID_4(rncId4);
    }

    private ASN1MeasurementWrapper createExpectedEvent(final byte orderNumber, final int ecno, final int rscp,
            final int bsic, final byte measurementType, final short triggerEventId, final short scramblingCode) {
        final ASN1_MEASUREMENT asn1Message = new ASN1_MEASUREMENT();
        asn1Message.setMEAS_RESULTS_ORDER_NUMBER(orderNumber);
        asn1Message.setECNO(ecno);
        asn1Message.setRSCP(rscp);
        asn1Message.setBSIC(bsic);
        asn1Message.setMEASUREMENT_TYPE(measurementType);
        asn1Message.setTRIGGER_EVENT_ID(triggerEventId);
        asn1Message.setSCRAMBLING_CODE(scramblingCode);
        asn1Message.setC_ID_1(cellId1);
        asn1Message.setC_ID_2(cellId2);
        asn1Message.setC_ID_3(cellId3);
        asn1Message.setC_ID_4(cellId4);
        asn1Message.setRNC_ID_1(rncId1);
        asn1Message.setRNC_ID_2(rncId2);
        asn1Message.setRNC_ID_3(rncId3);
        asn1Message.setRNC_ID_4(rncId4);
        return new ASN1MeasurementWrapper(asn1Message);
    }

    private Asn1Message createAsn1Message(final byte measResultsOrderNumber, final int ecno, final int rscp,
            final int bsic, final byte measurementType, final short triggerEventId, final short scramblingCode,
            byte eventResultsOrderNumber) {
        final Asn1Message asn1Message = new Asn1Message();
        final Map<String, String> messageAttributes = new HashMap<String, String>();
        messageAttributes.put(MeasReportAttributes.MEAS_RESULTS_ORDER_NUMBER, Byte.toString(measResultsOrderNumber));
        messageAttributes.put(MeasReportAttributes.EC_NO, Integer.toString(ecno));
        messageAttributes.put(MeasReportAttributes.RSCP, Integer.toString(rscp));
        messageAttributes.put(MeasReportAttributes.BSIC, Integer.toString(bsic));
        messageAttributes.put(MeasReportAttributes.MEASUREMENT_TYPE, Byte.toString(measurementType));
        messageAttributes.put(MeasReportAttributes.TRIGGER_EVENT_ID, Short.toString(triggerEventId));
        messageAttributes.put(MeasReportAttributes.SCRAMBLING_CODE, Integer.toString(scramblingCode));
        messageAttributes.put(MeasReportAttributes.EVENT_RESULTS_ORDER_NUMBER, Byte.toString(eventResultsOrderNumber));
        asn1Message.setMessageAttributes(messageAttributes);
        return asn1Message;
    }

    class IsMatchingApEventBean extends ArgumentMatcher<ASN1MeasurementWrapper> {

        private final ASN1MeasurementWrapper expectedEvent;

        /**
         * @param expectedEvent
         */
        public IsMatchingApEventBean(final ASN1MeasurementWrapper expectedEvent) {
            this.expectedEvent = expectedEvent;
        }

        @Override
        public boolean matches(final Object argument) {
            final ASN1MeasurementWrapper rrcMeasurement = (ASN1MeasurementWrapper) argument;
            verifyAsn1MeasurementsAreTheSame(expectedEvent.getASN1_MEASUREMENT(), rrcMeasurement.getASN1_MEASUREMENT());
            return true;
        }

        private void verifyAsn1MeasurementsAreTheSame(final ASN1_MEASUREMENT expectedRRCMeasurement,
                final ASN1_MEASUREMENT actualRRCMeasurement) {
            assertThat("UeContext is incorrect", actualRRCMeasurement.getUE_CONTEXT(),
                    is(expectedRRCMeasurement.getUE_CONTEXT()));
            assertThat(actualRRCMeasurement.getRNC_MODULE_ID(), is(expectedRRCMeasurement.getRNC_MODULE_ID()));
            assertThat("rnc id is incorrect", actualRRCMeasurement.getRNC_ID_1(),
                    is(actualRRCMeasurement.getRNC_ID_1()));
            assertThat(actualRRCMeasurement.getC_ID_1(), is(actualRRCMeasurement.getC_ID_1()));
            assertThat(actualRRCMeasurement.getRNC_ID_2(), is(expectedRRCMeasurement.getRNC_ID_2()));
            assertThat(actualRRCMeasurement.getC_ID_2(), is(expectedRRCMeasurement.getC_ID_2()));
            assertThat(actualRRCMeasurement.getRNC_ID_3(), is(expectedRRCMeasurement.getRNC_ID_3()));
            assertThat(actualRRCMeasurement.getC_ID_3(), is(expectedRRCMeasurement.getC_ID_3()));
            assertThat(actualRRCMeasurement.getRNC_ID_4(), is(expectedRRCMeasurement.getRNC_ID_4()));
            assertThat(actualRRCMeasurement.getC_ID_4(), is(expectedRRCMeasurement.getC_ID_4()));
            assertThat(actualRRCMeasurement.getTimestamp(), is(expectedRRCMeasurement.getTimestamp()));
            assertThat("Scrambling code is incorrect", actualRRCMeasurement.getSCRAMBLING_CODE(),
                    is(actualRRCMeasurement.getSCRAMBLING_CODE()));
            assertThat(actualRRCMeasurement.getTRIGGER_EVENT_ID(), is(expectedRRCMeasurement.getTRIGGER_EVENT_ID()));
            assertThat(actualRRCMeasurement.getMEASUREMENT_TYPE(), is(expectedRRCMeasurement.getMEASUREMENT_TYPE()));
            assertThat(actualRRCMeasurement.getBSIC(), is(expectedRRCMeasurement.getBSIC()));
            assertThat(actualRRCMeasurement.getRSCP(), is(expectedRRCMeasurement.getRSCP()));
            assertThat(actualRRCMeasurement.getECNO(), is(expectedRRCMeasurement.getECNO()));
            assertThat(actualRRCMeasurement.getMEAS_RESULTS_ORDER_NUMBER(),
                    is(expectedRRCMeasurement.getMEAS_RESULTS_ORDER_NUMBER()));
            assertThat(actualRRCMeasurement.getADDITIONAL_EVENT_ID(), is(0));

        }
    }

}
