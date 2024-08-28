/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.correlation.radio.measreport.rawevents;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

import com.ericsson.cepmediation.apeventbeans.correlation.EE_RRC_MEASUREMENT;
import com.ericsson.cepmediation.base.apeventbeans.DefaultValues;
import com.ericsson.cepmediation.test.util.tracer.EE_RRC_MEASUREMENTReporter;

/**
 * @author eemecoy
 *
 */
public class ThirtySecondsWithRealFilesAllUsersTest extends BaseThirtySecondsWithRealFilesTest {

    private Set<Byte> uniqueMeasurementTypes = new HashSet<Byte>();

    @Test
    public void testLoadAllFilesForAllUsers() {
        final List<EE_RRC_MEASUREMENT> measurements = parseFilesLoadEventsAndFetchMeasurementWindows();
        EE_RRC_MEASUREMENTReporter.traceMeasurements(measurements);
        printMeasurementsByUser(measurements);
        printSampleMeasurements(measurements);
        assertThat("Incorrect number of measurements for ROP returned", measurements.size(), is(20963));
        checkBasicAttributesForAllAttributes(measurements);
        checkMeasurementWindowsForAllStoredUsers(measurements);
    }

    private void printSampleMeasurements(List<EE_RRC_MEASUREMENT> measurements) {
        for (EE_RRC_MEASUREMENT measurement : measurements) {
            byte measurementType = measurement.getMEASUREMENT_TYPE();
            if (!uniqueMeasurementTypes.contains(measurementType)) {
                EE_RRC_MEASUREMENTReporter.traceMeasurement(measurement);
            }
            uniqueMeasurementTypes.add(measurementType);
        }
    }

    private void checkBasicAttributesForAllAttributes(List<EE_RRC_MEASUREMENT> measurements) {
        checkMeasurementIdIsNeverNull(measurements);

    }

    private void checkMeasurementIdIsNeverNull(List<EE_RRC_MEASUREMENT> measurements) {
        for (EE_RRC_MEASUREMENT measurement : measurements) {
            assertThat(measurement.getMEASUREMENT_TYPE() > DefaultValues.DEFAULT_BYTE_VALUE, is(true));
        }

    }

    private void printMeasurementsByUser(List<EE_RRC_MEASUREMENT> measurements) {
        Map<Long, List<EE_RRC_MEASUREMENT>> measurementsByUser = getMeasurementsByUser(measurements);
        for (Long imsi : measurementsByUser.keySet()) {
            System.out.println("For imsi " + imsi + " there are " + measurementsByUser.get(imsi).size()
                    + " measurements reported");
        }

    }

}
