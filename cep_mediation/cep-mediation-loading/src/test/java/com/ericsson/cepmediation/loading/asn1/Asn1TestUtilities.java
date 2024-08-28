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

import com.ericsson.cepmediation.base.apeventbeans.Asn1Message;
import com.ericsson.cepmediation.base.util.constants.MeasReportAttributes;

/**
 * @author eemecoy
 *
 */
public class Asn1TestUtilities {

    public static void checkResultWithSingleMeasurement(final Asn1Message asn1Message, final int expectedEcnoValue, final int expectedRscpValue, final EVENT_TYPE eventType,
            final short expectedTriggerEventId, final short expectedScramblingCode, final int expectedBsic, final int expectedMeasResultsOrderNumber, int expectedEventResultsOrderNumber,
            boolean expectedValidMeasResults, boolean expectedValidEventResults) {
        assertThat(asn1Message.getMessageName(), is("rrc_measurement"));
        Map<String, String> messageAttributes = asn1Message.getMessageAttributes();
        checkResultWithSingleMeasurement(messageAttributes, expectedEcnoValue, expectedRscpValue, eventType, expectedTriggerEventId, expectedScramblingCode, expectedBsic,
                expectedMeasResultsOrderNumber, expectedEventResultsOrderNumber, expectedValidMeasResults, expectedValidEventResults);

    }

    public static void checkResultWithSingleMeasurement(Map<String, String> messageAttributes, final int expectedEcnoValue, final int expectedRscpValue, final EVENT_TYPE eventType,
            final short expectedTriggerEventId, final short expectedScramblingCode, final int expectedBsic, final int expectedMeasResultsOrderNumber, int expectedEventResultsOrderNumber,
            boolean expectedValidMeasResults, boolean expectedValidEventResults) {

        checkAttribute(messageAttributes, expectedEcnoValue, MeasReportAttributes.EC_NO);
        checkAttribute(messageAttributes, expectedRscpValue, MeasReportAttributes.RSCP);
        checkAttribute(messageAttributes, eventType.getId(), MeasReportAttributes.MEASUREMENT_TYPE);
        checkAttribute(messageAttributes, expectedTriggerEventId, MeasReportAttributes.TRIGGER_EVENT_ID);
        checkAttribute(messageAttributes, expectedScramblingCode, MeasReportAttributes.SCRAMBLING_CODE);
        checkAttribute(messageAttributes, expectedBsic, MeasReportAttributes.BSIC);
        checkAttribute(messageAttributes, expectedMeasResultsOrderNumber, MeasReportAttributes.MEAS_RESULTS_ORDER_NUMBER);
        checkAttribute(messageAttributes, expectedEventResultsOrderNumber, MeasReportAttributes.EVENT_RESULTS_ORDER_NUMBER);
        checkBooleanAttribute(messageAttributes, expectedValidMeasResults, MeasReportAttributes.VALID_MEAS_RESULTS);
        checkBooleanAttribute(messageAttributes, expectedValidEventResults, MeasReportAttributes.VALID_EVENT_RESULTS);
    }

    private static void checkBooleanAttribute(Map<String, String> messageAttributes, boolean expectedAttributeValue, String attributeName) {
        boolean attributeValue = getBooleanAttributeValue(messageAttributes, attributeName);
        assertThat(attributeName + " is incorrect", attributeValue, is(expectedAttributeValue));
    }

    private static boolean getBooleanAttributeValue(Map<String, String> messageAttributes, String attributeName) {
        String attributeValue = getAttributeValue(attributeName, messageAttributes);
        return Boolean.parseBoolean(attributeValue);
    }

    private static void checkAttribute(final Map<String, String> messageAttributes, final int expectedMeasResultsOrderNumber, String attributeName) {
        final int measResultsOrderNumber = getAttributeValueFromAsn1Message(attributeName, messageAttributes);
        assertThat(attributeName + " is incorrect", measResultsOrderNumber, is(expectedMeasResultsOrderNumber));
    }

    public static Asn1Message getAsn1MessageForScramblingCode(short scramblingCodeToSearchFor, List<Asn1Message> asn1MessageList) {
        for (Asn1Message asn1Message : asn1MessageList) {
            Map<String, String> messageAttributes = asn1Message.getMessageAttributes();
            int scramblingCode = getAttributeValueFromAsn1Message(MeasReportAttributes.SCRAMBLING_CODE, messageAttributes);
            if (scramblingCode == scramblingCodeToSearchFor) {
                return asn1Message;
            }
        }
        fail("Could not find asn1Message for scrambling code " + scramblingCodeToSearchFor);
        return null;
    }

    protected static int getAttributeValueFromAsn1Message(final String attributeName, final Map<String, String> messageAttributes) {
        String attributeValue = getAttributeValue(attributeName, messageAttributes);
        return Integer.parseInt(attributeValue);
    }

    private static String getAttributeValue(final String attributeName, final Asn1Message asn1Message) {
        Map<String, String> messageAttributes = asn1Message.getMessageAttributes();
        return getAttributeValue(attributeName, messageAttributes);
    }

    public static String getAttributeValue(final String attributeName, Map<String, String> messageAttributes) {
        String attributeValue = messageAttributes.get(attributeName);
        if (attributeValue == null) {
            throw new RuntimeException("Attribute value should not be a null string for " + attributeName);
        }
        return attributeValue;
    }

    public static int getIntegerAttributeValue(String attributeName, Map<String, String> map) {
        String attributeValue = getAttributeValue(attributeName, map);
        return Integer.parseInt(attributeValue);
    }
}
