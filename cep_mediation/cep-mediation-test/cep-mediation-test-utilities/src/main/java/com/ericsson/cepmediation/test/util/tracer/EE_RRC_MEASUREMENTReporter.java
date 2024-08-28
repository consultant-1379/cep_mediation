/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.test.util.tracer;

import java.util.ArrayList;
import java.util.List;

import com.ericsson.cepmediation.apeventbeans.correlation.EE_RRC_MEASUREMENT;
import com.ericsson.cepmediation.test.common.DateTimeUtilities;

/**
 * @author eemecoy
 *
 */
public class EE_RRC_MEASUREMENTReporter {

    public static List<EE_RRC_MEASUREMENT> getEERRCMeasurements(final List<Object> eventBeans) {
        final List<EE_RRC_MEASUREMENT> measurements = new ArrayList<EE_RRC_MEASUREMENT>();
        for (final Object eventBean : eventBeans) {
            measurements.add((EE_RRC_MEASUREMENT) eventBean);
        }
        return measurements;
    }

    public static void traceMeasurements(final List<EE_RRC_MEASUREMENT> measurements) {
        System.out.println("Number of measurements is " + measurements.size());
        for (final EE_RRC_MEASUREMENT measurement : measurements) {
            traceMeasurement(measurement);
        }

    }

    public static void traceMeasurement(final EE_RRC_MEASUREMENT measurement) {
        final StringBuilder trace = new StringBuilder();
        trace.append("EE_RRC_MEASUREMENT received with timestamp ");
        trace.append(measurement.getTimestamp());
        trace.append(" (");
        trace.append(DateTimeUtilities.convertTimeStampToDateString(measurement.getTimestamp()));
        trace.append(") for imsi ");
        trace.append(measurement.getIMSI());
        trace.append(" for UeContext ");
        trace.append(measurement.getUE_CONTEXT());
        trace.append(" for RncModuleID ");
        trace.append(measurement.getRNC_MODULE_ID());
        trace.append(" with measured results order number ");
        trace.append(measurement.getMEAS_RESULTS_ORDER_NUMBER());
        trace.append(" with event results event order ");
        trace.append(measurement.getEVENT_RESULTS_ORDER_NUMBER());
        trace.append(" with measured results validity bit ");
        trace.append(measurement.getVALID_MEAS_RESULTS());
        trace.append(" with event results validity bit ");
        trace.append(measurement.getVALID_EVENT_RESULTS());
        trace.append(" with ecno ");
        trace.append(measurement.getECNO());
        trace.append(" and rscp ");
        trace.append(measurement.getRSCP());
        trace.append(" and trigger event id ");
        trace.append(measurement.getTRIGGER_EVENT_ID());
        trace.append(" and trigger event type/measurement type ");
        trace.append(measurement.getMEASUREMENT_TYPE());
        trace.append(" for scrambling code ");
        trace.append(measurement.getSCRAMBLING_CODE());
        trace.append(" for sac for serving cell (hashed): ");
        trace.append(measurement.getHIER321_ID_1());
        System.out.println(trace.toString());
    }
}
