/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.loading.asn1;

import com.ericsson.cepmediation.base.apeventbeans.DefaultValues;

/**
 * @author eemecoy
 *
 */
public interface DefaultAsn1AttributeValues {
    static final int DEFAULT_BSIC_VALUE = DefaultValues.DEFAULT_INT_VALUE;

    static final int DEFAULT_EVENT_RESULTS_ORDER = DefaultValues.DEFAULT_BYTE_VALUE;

    static final int DEFAULT_RSCP_VALUE = DefaultValues.DEFAULT_INT_VALUE;

    static final int DEFAULT_ECNO_VALUE = DefaultValues.DEFAULT_INT_VALUE;

    static final int DEFAULT_MEAS_RESULTS_ORDER = RrcMeasurementReportAsn1Decoder.DEFAULT_MEAS_ORD_NUMB;

}
