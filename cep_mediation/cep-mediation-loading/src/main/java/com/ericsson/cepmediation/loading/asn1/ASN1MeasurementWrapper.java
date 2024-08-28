/*------------------------------------------------------------------------------
 *******************************************************************************
 * COPYRIGHT Ericsson 2013
 *
 * The copyright to the computer program(s) herein is the property of
 * Ericsson Inc. The programs may be used and/or copied only with written
 * permission from Ericsson Inc. or in accordance with the terms and
 * conditions stipulated in the agreement/contract under which the
 * program(s) have been supplied.
 *******************************************************************************
 *----------------------------------------------------------------------------*/

package com.ericsson.cepmediation.loading.asn1;

import com.ericsson.cepmediation.apeventbeans.correlation.ASN1_MEASUREMENT;
import com.ericsson.cepmediation.apeventbeans.gpeh.GpehBase;
import com.ericsson.cepmediation.base.meta.schema.Event;

/**
 * Class that wraps the ASN1_MEASUREMENT event, which is created when the
 * Asn1Message's are split from the RRC_MEASUREMENT_REPORT event Both the
 * ASN1_MEASUREMENT and this class are required - the ASN1_MEASUREMENT is
 * created from CorrelatedEvents.xml but does not extend the GpehBase class
 * (required for partitioning data in the epl), whereas this class doesn't
 * follow the application structure of being created as a bean from the
 * CorrelatedEvents.xml file
 *
 */
public class ASN1MeasurementWrapper extends GpehBase {

    private final ASN1_MEASUREMENT ASN1_MEASUREMENT;

    public final static String ABSOLUTE_NAME = "gpeh."
            + ASN1MeasurementWrapper.class.getSimpleName();

    private boolean Redundant_ASN1 = false;

    public ASN1MeasurementWrapper(final ASN1_MEASUREMENT rrcMeasurement) {
        this.ASN1_MEASUREMENT = rrcMeasurement;
        setC_ID_1(ASN1_MEASUREMENT.getC_ID_1());
        setC_ID_2(ASN1_MEASUREMENT.getC_ID_2());
        setC_ID_3(ASN1_MEASUREMENT.getC_ID_3());
        setC_ID_4(ASN1_MEASUREMENT.getC_ID_4());
        setRNC_ID_1(ASN1_MEASUREMENT.getRNC_ID_1());
        setRNC_ID_2(ASN1_MEASUREMENT.getRNC_ID_2());
        setRNC_ID_3(ASN1_MEASUREMENT.getRNC_ID_3());
        setRNC_ID_4(ASN1_MEASUREMENT.getRNC_ID_4());
    }

    @Override
    public String getAbsoluteName() {
        return ABSOLUTE_NAME;
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
        return ASN1_MEASUREMENT.getDecodedString();

    }

    /**
     * @return the underlyingEvent
     */
    public ASN1_MEASUREMENT getASN1_MEASUREMENT() {
        return ASN1_MEASUREMENT;
    }

    @Override
    public String toString() {
        return getDecodedString();
    }

    public boolean isRedundant_ASN1() {
        return Redundant_ASN1;
    }

    public void setRedundant_ASN1(boolean redundant_ASN1) {
        Redundant_ASN1 = redundant_ASN1;
    }

}
