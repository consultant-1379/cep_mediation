/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.loading.asn1;

import static org.junit.Assert.*;

import org.junit.Test;

import com.ericsson.cepmediation.apeventbeans.correlation.ASN1_MEASUREMENT;

/**
 * @author eemecoy
 *
 */
public class ASN1MeasurementWrapperTest {

    @Test
    public void testGetAbsoluteName() {
        final ASN1MeasurementWrapper asn1MeasurementWrapper = new ASN1MeasurementWrapper(new ASN1_MEASUREMENT());
        String expectedAbsoluteName = "gpeh.ASN1MeasurementWrapper";
        assertEquals(expectedAbsoluteName, asn1MeasurementWrapper.getAbsoluteName());
        assertEquals(expectedAbsoluteName, ASN1MeasurementWrapper.ABSOLUTE_NAME);
    }

}
