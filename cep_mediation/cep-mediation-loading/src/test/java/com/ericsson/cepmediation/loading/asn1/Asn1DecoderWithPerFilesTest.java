/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.loading.asn1;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import com.ericsson.cepmediation.base.apeventbeans.ApEventBean;
import com.ericsson.cepmediation.base.apeventbeans.Asn1Message;
import com.ericsson.cepmediation.base.apeventbeans.DefaultValues;
import com.ericsson.cepmediation.base.meta.schema.Event;
import com.ericsson.cepmediation.base.util.constants.EventIdConstants;
import com.ericsson.cepmediation.base.util.constants.MeasReportAttributes;

/**
 * @author eemecoy
 *
 */
public class Asn1DecoderWithPerFilesTest {

    private Asn1Decoder decoder;

    private Asn1RealFiles asn1RealFiles;

    @Before
    public void setup() {
        asn1RealFiles = new Asn1RealFiles();
        decoder = new Asn1Decoder();
    }

    @Test
    public void testDecodingIntraFreqEventsIn41511() throws Exception {
        final List<Asn1Message> asn1MessageList = decodeFile("41511");
        assertThat(asn1MessageList.size(), is(2));
        final Asn1Message firstAsn1Message = getAsn1MessageForScramblingCode((short) 426, asn1MessageList);
        checkResult(firstAsn1Message, 38, 28, EVENT_TYPE.INTRA_FREQ, (short) 3, (short) 426,
                DefaultAsn1AttributeValues.DEFAULT_BSIC_VALUE, 0, 0, true, true);
        final Asn1Message secondAsn1Message = getAsn1MessageForScramblingCode((short) 418, asn1MessageList);
        checkResult(secondAsn1Message, 20, 19, EVENT_TYPE.INTRA_FREQ, (short) -1, (short) 418,
                DefaultAsn1AttributeValues.DEFAULT_BSIC_VALUE, 1, -1, true, false);
    }

    private void checkResult(final Asn1Message asn1Message, final int expectedEcnoValue, final int expectedRscpValue,
            final EVENT_TYPE eventType, final short expectedTriggerEventId, final short expectedScramblingCode,
            final int expectedBsic, final int expectedMeasResultsOrderNumber,
            final int expectedEventResultsOrderNumber, final boolean expectedValidMeasResult,
            final boolean expectedValidEventResults) {
        Asn1TestUtilities.checkResultWithSingleMeasurement(asn1Message, expectedEcnoValue, expectedRscpValue,
                eventType, expectedTriggerEventId, expectedScramblingCode, expectedBsic,
                expectedMeasResultsOrderNumber, expectedEventResultsOrderNumber, expectedValidMeasResult,
                expectedValidEventResults);
    }

    private Asn1Message getAsn1MessageForScramblingCode(final short scramblingCode,
            final List<Asn1Message> asn1MessageList) {
        return Asn1TestUtilities.getAsn1MessageForScramblingCode(scramblingCode, asn1MessageList);
    }

    private boolean messageListContainsIntraFreqEvent(final int expectedTriggerEventId,
            final int expectedScramblingCode, final int expectedOrder, final int expectedRscp, final int expectedEcno,
            final List<Asn1Message> asn1MessageList) {

        final int expectedBsic = DefaultValues.DEFAULT_INT_VALUE;
        return messageListContains(EVENT_TYPE.INTRA_FREQ, expectedTriggerEventId, expectedScramblingCode,
                expectedOrder, expectedBsic, expectedRscp, expectedEcno, asn1MessageList);
    }

    private List<Asn1Message> decodeFile(final String fileName) throws Exception {
        final byte[] asnData = asn1RealFiles.getAsnDataFromFile(fileName);
        final ApEventBean apEventBean = new StubbedApEventBean(asnData);
        decoder.decodeAsn1(apEventBean);
        final List<Asn1Message> asn1MessageList = apEventBean.getAsn1MessageList();
        printMessages(asn1MessageList);
        return asn1MessageList;
    }

    @Test
    public void testDecodingIntraFreqEventsIn41512() throws Exception {
        final List<Asn1Message> asn1MessageList = decodeFile("41512");
        assertThat(asn1MessageList.size(), is(2));
        final Asn1Message firstAsn1Message = getAsn1MessageForScramblingCode((short) 426, asn1MessageList);
        checkResult(firstAsn1Message, 38, 28, EVENT_TYPE.INTRA_FREQ, (short) 3, (short) 426,
                DefaultAsn1AttributeValues.DEFAULT_BSIC_VALUE, 0, 0, true, true);
        final Asn1Message secondAsn1Message = getAsn1MessageForScramblingCode((short) 418, asn1MessageList);
        checkResult(secondAsn1Message, 22, 19, EVENT_TYPE.INTRA_FREQ, (short) -1, (short) 418,
                DefaultAsn1AttributeValues.DEFAULT_BSIC_VALUE, 1, -1, true, false);
    }

    private void printMessages(final List<Asn1Message> asn1MessageList) {
        for (final Asn1Message asn1Message : asn1MessageList) {
            System.out.println(asn1Message.getMessageAttributes());
        }
    }

    @Test
    public void testDecodingIntraFreqEventsIn41513() throws Exception {
        final List<Asn1Message> asn1MessageList = decodeFile("41513");
        assertThat(asn1MessageList.size(), is(2));
        final Asn1Message firstAsn1Message = getAsn1MessageForScramblingCode((short) 426, asn1MessageList);
        checkResult(firstAsn1Message, 33, 33, EVENT_TYPE.INTRA_FREQ, (short) -1, (short) 426,
                DefaultAsn1AttributeValues.DEFAULT_BSIC_VALUE, 0, -1, true, false);
        final Asn1Message secondAsn1Message = getAsn1MessageForScramblingCode((short) 418, asn1MessageList);
        checkResult(secondAsn1Message, 5, 18, EVENT_TYPE.INTRA_FREQ, (short) 1, (short) 418,
                DefaultAsn1AttributeValues.DEFAULT_BSIC_VALUE, 1, 0, true, true);
        assertTrue(messageListContainsIntraFreqEvent(-1, 426, 0, 33, 33, asn1MessageList));
    }

    @Test
    public void testDecodingInterFreqEventsIn41514() throws Exception {
        final List<Asn1Message> asn1MessageList = decodeFile("41514");
        assertThat(asn1MessageList.size(), is(1));
        final short expectedScramblingCode = DefaultValues.DEFAULT_SHORT_VALUE;
        final int expectedBsic = DefaultValues.DEFAULT_INT_VALUE;
        verifyMessageAttributes(asn1MessageList.get(0), Integer.MIN_VALUE, Integer.MIN_VALUE, EVENT_TYPE.INTER_FREQ, 5,
                expectedScramblingCode, expectedBsic, DefaultAsn1AttributeValues.DEFAULT_MEAS_RESULTS_ORDER);
    }

    @Test
    public void testDecodingIntraFreqEventsIn41515() throws Exception {
        final List<Asn1Message> asn1MessageList = decodeFile("41515");
        assertThat(asn1MessageList.size(), is(2));
        assertTrue(messageListContainsIntraFreqEvent(-1, 418, 0, 23, 26, asn1MessageList));
        assertTrue(messageListContainsIntraFreqEvent(0, 409, 1, 19, 24, asn1MessageList));
    }

    @Test
    public void testDecodingTrafficVolumeEventIn41516() throws Exception {
        final List<Asn1Message> asn1MessageList = decodeFile("41516");
        assertThat(asn1MessageList.size(), is(1));
        final Asn1Message asn1Message = asn1MessageList.get(0);
        verifyTrafficVolumeEvent(asn1Message, 31);
    }

    private void verifyTrafficVolumeEvent(final Asn1Message asn1Message, final int expectedEcno) {
        final short expectedScramblingCode = DefaultValues.DEFAULT_SHORT_VALUE;
        final int expectedBsic = DefaultValues.DEFAULT_INT_VALUE;
        checkResult(asn1Message, expectedEcno, DefaultAsn1AttributeValues.DEFAULT_RSCP_VALUE,
                EVENT_TYPE.TRAFFIC_VOLUME, (short) 0, expectedScramblingCode, expectedBsic,
                DefaultAsn1AttributeValues.DEFAULT_MEAS_RESULTS_ORDER, -1, false, false);
    }

    @Test
    public void testDecodingTrafficVolumeEventIn41517() throws Exception {
        final List<Asn1Message> asn1MessageList = decodeFile("41517");
        assertThat(asn1MessageList.size(), is(1));
        final Asn1Message asn1Message = asn1MessageList.get(0);
        verifyTrafficVolumeEvent(asn1Message, 18);
    }

    @Test
    public void testDecodingTrafficVolumeEventIn41518() throws Exception {
        final List<Asn1Message> asn1MessageList = decodeFile("41518");
        assertThat(asn1MessageList.size(), is(1));
        final Asn1Message asn1Message = asn1MessageList.get(0);
        verifyTrafficVolumeEvent(asn1Message, 21);
    }

    @Test
    public void testDecodingIntraFreqEventsIn41519() throws Exception {
        final List<Asn1Message> asn1MessageList = decodeFile("41519");
        assertThat(asn1MessageList.size(), is(2));
        assertTrue(messageListContainsIntraFreqEvent(0, 409, 0, 23, 36, asn1MessageList));
        assertTrue(messageListContainsIntraFreqEvent(-1, 418, 1, 20, 29, asn1MessageList));
    }

    @Test
    public void testDecodingIntraFreqEventsIn41520() throws Exception {
        final List<Asn1Message> asn1MessageList = decodeFile("41520");
        assertThat(asn1MessageList.size(), is(2));
        assertTrue(messageListContainsIntraFreqEvent(3, 409, 0, 34, 35, asn1MessageList));
        assertTrue(messageListContainsIntraFreqEvent(-1, 418, 1, 21, 14, asn1MessageList));
    }

    @Test
    public void testDecodingIntraFreqEventsIn41521() throws Exception {
        final List<Asn1Message> asn1MessageList = decodeFile("41521");
        assertThat(asn1MessageList.size(), is(2));
        assertTrue(messageListContainsIntraFreqEvent(3, 409, 0, 34, 36, asn1MessageList));
        assertTrue(messageListContainsIntraFreqEvent(-1, 418, 1, 23, 18, asn1MessageList));
    }

    @Test
    public void testDecodingInterFreqEventInRealFileInFile41522() throws Exception {
        final List<Asn1Message> asn1MessageList = decodeFile("41522");
        assertThat(asn1MessageList.size(), is(1));
        final Asn1Message asn1Message = asn1MessageList.get(0);
        final short expectedScramblingCode = DefaultValues.DEFAULT_SHORT_VALUE;
        final int expectedBsic = DefaultValues.DEFAULT_INT_VALUE;
        checkResult(asn1Message, DefaultAsn1AttributeValues.DEFAULT_ECNO_VALUE,
                DefaultAsn1AttributeValues.DEFAULT_RSCP_VALUE, EVENT_TYPE.INTER_FREQ, (short) 5,
                expectedScramblingCode, expectedBsic, DefaultAsn1AttributeValues.DEFAULT_MEAS_RESULTS_ORDER, -1, false,
                false);

    }

    @Test
    public void testDecodingIntraFreqEventsInRealFileInFile41523() throws Exception {
        final List<Asn1Message> asn1MessageList = decodeFile("41523");
        assertThat(asn1MessageList.size(), is(2));
        assertTrue(messageListContainsIntraFreqEvent(-1, 409, 0, 27, 26, asn1MessageList));
        assertTrue(messageListContainsIntraFreqEvent(1, 418, 1, 20, 12, asn1MessageList));
    }

    @Test
    public void testDecodingTrafficVolumeEventIn41524() throws Exception {
        final List<Asn1Message> asn1MessageList = decodeFile("41524");
        assertThat(asn1MessageList.size(), is(1));
        final Asn1Message asn1Message = asn1MessageList.get(0);
        verifyTrafficVolumeEvent(asn1Message, 36);
    }

    private boolean messageListContains(final EVENT_TYPE eventType, final int expectedTriggerEventId,
            final int expectedScramblingCode, final int expectedOrder, final int expectedBsic, final int expectedRscp,
            final int expectedEcno, final List<Asn1Message> asn1MessageList) {
        for (final Asn1Message asn1Message : asn1MessageList) {
            final Map<String, String> messageAttributes = asn1Message.getMessageAttributes();
            final int measurementType = getMeasurementType(messageAttributes);
            final int scramblingCode = getScramblingCode(messageAttributes);
            final int triggerEventId = getTriggerEventId(messageAttributes);
            final int order = getOrder(messageAttributes);
            final int bsic = getBsic(messageAttributes);
            final int rscp = getRscp(messageAttributes);
            final int ecno = getEcno(messageAttributes);
            if (eventType.getId() == measurementType && scramblingCode == expectedScramblingCode
                    && triggerEventId == expectedTriggerEventId && order == expectedOrder && bsic == expectedBsic
                    && rscp == expectedRscp && ecno == expectedEcno) {
                return true;
            }
        }
        return false;
    }

    private int getMeasurementType(final Map<String, String> messageAttributes) {
        return getIntegerAttribute(MeasReportAttributes.MEASUREMENT_TYPE, messageAttributes);
    }

    private void verifyMessageAttributes(final Asn1Message asn1Message, final int expectedEcno, final int expectedRscp,
            final EVENT_TYPE expectedMeasurementType, final int expectedTriggerEventID,
            final short expectedScramblingCode, final int expectedBsic, final int expectedMeasResultsOrderNumber) {
        final Map<String, String> messageAttributes = asn1Message.getMessageAttributes();
        assertThat("ECNO incorrect", getEcno(messageAttributes), is(expectedEcno));
        assertThat("RSCP incorrect", getRscp(messageAttributes), is(expectedRscp));
        assertThat("Measurement type incorrect", getMeasurementType(messageAttributes),
                is(expectedMeasurementType.getId()));
        assertThat("Trigger event id incorrect", getTriggerEventId(messageAttributes), is(expectedTriggerEventID));
        assertThat("Scrambling code is incorrect", getScramblingCode(messageAttributes), is(expectedScramblingCode));
        assertThat(getBsic(messageAttributes), is(expectedBsic));
        assertThat("Meas results order number is incorrect", getOrder(messageAttributes),
                is(expectedMeasResultsOrderNumber));

    }

    private int getEcno(final Map<String, String> messageAttributes) {
        return getIntegerAttribute(MeasReportAttributes.EC_NO, messageAttributes);
    }

    private int getRscp(final Map<String, String> messageAttributes) {
        return getIntegerAttribute(MeasReportAttributes.RSCP, messageAttributes);
    }

    private int getBsic(final Map<String, String> messageAttributes) {
        return getIntegerAttribute(MeasReportAttributes.BSIC, messageAttributes);
    }

    private int getOrder(final Map<String, String> messageAttributes) {
        return getIntegerAttribute(MeasReportAttributes.MEAS_RESULTS_ORDER_NUMBER, messageAttributes);
    }

    private int getTriggerEventId(final Map<String, String> messageAttributes) {
        return getIntegerAttribute(MeasReportAttributes.TRIGGER_EVENT_ID, messageAttributes);
    }

    private short getScramblingCode(final Map<String, String> messageAttributes) {
        return (short) getIntegerAttribute(MeasReportAttributes.SCRAMBLING_CODE, messageAttributes);
    }

    private int getIntegerAttribute(final String attributeName, final Map<String, String> messageAttributes) {
        final String attributeValue = messageAttributes.get(attributeName);
        return Integer.parseInt(attributeValue);
    }

    class StubbedApEventBean extends ApEventBean {

        private final byte[] asnData;

        /**
         * @param byteArray
         */
        public StubbedApEventBean(final byte[] byteArray) {
            this.asnData = byteArray;
        }

        @Override
        public byte[] getAsn1Data() {
            return asnData;
        }

        @Override
        public String getAbsoluteName() {

            return null;
        }

        @Override
        public void setData(final Event event, final byte[] data, final int offset) {
        }

        @Override
        public String getCSVString() {

            return null;
        }

        @Override
        public String getDecodedString() {

            return null;
        }
        
        @Override
        public int getEventId() {
        	return EventIdConstants.RRC_MEASUREMENT_REPORT;
        }

    }

}
