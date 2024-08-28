/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.loading.asn1.testswithtooloutput;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.json.simple.parser.ParseException;
import org.junit.Before;
import org.junit.Test;

import rrc.class_definitions.UL_DCCH_Message;

import com.ericsson.cepmediation.base.util.constants.MeasReportAttributes;
import com.ericsson.cepmediation.loading.asn1.Asn1Decoder;
import com.ericsson.cepmediation.loading.asn1.Asn1TestUtilities;
import com.ericsson.cepmediation.loading.asn1.DefaultAsn1AttributeValues;
import com.ericsson.cepmediation.loading.asn1.EVENT_TYPE;

/**
 * @author eemecoy
 *
 */
public class Asn1DecoderWithToolOutputTest {

    private Asn1Encoder asn1Encoder;

    private Asn1Decoder asn1Decoder;

    @Before
    public void setup() {
        asn1Encoder = new Asn1Encoder();
        asn1Decoder = new Asn1Decoder();
    }

    @Test
    public void testDecodingAsn1Message() throws IOException, ParseException {
        String file = "asn-measurements/measurement_report_with_scramblingcodes_in_event_results_not_in_measured_results.txt";
        UL_DCCH_Message asn1Message = asn1Encoder.encodeFile(file);
        List<Map<String, String>> result = asn1Decoder.getRrcMeasurementReportAsn1Decoder().handleUlDcchMessage(asn1Message);
        assertThat(result.size(), is(10));
        for (Map<String, String> map : result) {
            System.out.println(map);
        }
        short scramblingCodeWithNoMeasurement = 255;
        Map<String, String> messageForScramblingCodeWithNoMeasurement = getMessageForScramblingCode(
                scramblingCodeWithNoMeasurement, result);
        verifyMessageForScramblingCodeWithNoMeasurement(messageForScramblingCodeWithNoMeasurement,
                EVENT_TYPE.INTRA_FREQ, (short) 0, scramblingCodeWithNoMeasurement, -1, 3);

    }

    private void verifyMessageForScramblingCodeWithNoMeasurement(
            Map<String, String> messageForScramblingCodeWithNoMeasurement, EVENT_TYPE eventType,
            short expectedTriggerEventId, short expectedScramblingCode, int expectedMeasResultsOrder,
            int expectedEventResultsOrder) {
        Asn1TestUtilities.checkResultWithSingleMeasurement(messageForScramblingCodeWithNoMeasurement,
                DefaultAsn1AttributeValues.DEFAULT_ECNO_VALUE, DefaultAsn1AttributeValues.DEFAULT_RSCP_VALUE,
                eventType, expectedTriggerEventId, expectedScramblingCode,
                DefaultAsn1AttributeValues.DEFAULT_BSIC_VALUE, expectedMeasResultsOrder, expectedEventResultsOrder,
                false, true);
    }

    private Map<String, String> getMessageForScramblingCode(int scramblingCodeToLookFor,
            List<Map<String, String>> result) {
        for (Map<String, String> map : result) {
            int scramblingCode = Asn1TestUtilities.getIntegerAttributeValue(MeasReportAttributes.SCRAMBLING_CODE, map);
            if (scramblingCode == scramblingCodeToLookFor) {
                return map;
            }
        }
        fail("Could not find message for scrambling code " + scramblingCodeToLookFor);
        return null;
    }

}
