/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.correlation.radio.measreport.rawevents;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Before;

import com.ericsson.cepmediation.apeventbeans.correlation.EE_RRC_MEASUREMENT;
import com.ericsson.cepmediation.correlation.enrichment.SessionEndEvent;
import com.ericsson.cepmediation.correlation.radio.RadioCorrelationPerformanceTesterBase;
import com.ericsson.cepmediation.correlation.util.XSecondsConstants;
import com.ericsson.cepmediation.test.common.RadioUserFilter;
import com.ericsson.cepmediation.test.topology.ServingCellsForTest;
import com.ericsson.cepmediation.test.util.MccMncCalculator;
import com.ericsson.cepmediation.test.util.tracer.EE_RRC_MEASUREMENTReporter;

/**
 * 
 * 
 * @author eemecoy
 *
 */

public abstract class BaseThirtySecondsWithRealFilesTest extends RadioCorrelationPerformanceTesterBase {

    protected final RadioUserFilter radioUserFilter = new RadioUserFilter();

    private final Map<Long, Integer> correctMeasurementsPerIMSI = new HashMap<Long, Integer>();

    @Before
    public void setUp() throws Exception {
        ServingCellsForTest.addCellScramblingCodesSavedFromDatabase();
        XSecondsConstants.setRrcMeasReportRetentionPeriodInSeconds(30);
        configure("esper/rc.epl", "Thirty-Second-RRC-Measurement-Reports-Before-Call-Drop");
        parseDataFromFilesStoredInGit("A20120516.1645-1700");
        correctMeasurementsPerIMSI.put(454063307348471L, 30);
        correctMeasurementsPerIMSI.put(454061101343047L, 123);
        correctMeasurementsPerIMSI.put(454061106124056L, 0);
    }

    public List<EE_RRC_MEASUREMENT> parseFilesLoadEventsAndFetchMeasurementWindows() {
        sendRealEventsToEsper();
        sendFakeEndOfSessionEventsToEsper();
        return getFinalMeasurementWindows();
    }

    private void sendFakeEndOfSessionEventsToEsper() {
        rncId = 9;
        correlationEngine.sendEvent(new SessionEndEvent(getTimestamp()));
        rncId = -1;
        correlationEngine.sendEvent(new SessionEndEvent(getTimestamp()));
    }

    protected List<EE_RRC_MEASUREMENT> getFinalMeasurementWindows() {
        return EE_RRC_MEASUREMENTReporter.getEERRCMeasurements(getEventBeansCreatedByEsper());
    }

    protected void checkMeasurementWindowsForAllStoredUsers(final List<EE_RRC_MEASUREMENT> measurements) {
        for (final Long imsi : correctMeasurementsPerIMSI.keySet()) {
            checkMeasurementWindowsForUser(measurements, imsi);
        }
    }

    private int getNumberOfMeasurementsPerUser(final Map<Long, List<EE_RRC_MEASUREMENT>> measurementsByUser, final Long imsi) {
        List<EE_RRC_MEASUREMENT> measurementsForAUser = measurementsByUser.get(imsi);
        if (measurementsForAUser == null) {
            return 0;
        }
        return measurementsForAUser.size();
    }

    protected void checkMeasurementWindowsForUser(final List<EE_RRC_MEASUREMENT> measurements, final long imsi) {
        final Map<Long, List<EE_RRC_MEASUREMENT>> measurementsByUser = getMeasurementsByUser(measurements);
        assertThat(getNumberOfMeasurementsPerUser(measurementsByUser, imsi), is(correctMeasurementsPerIMSI.get(imsi)));
        checkMccMnc(measurementsByUser.get(imsi), imsi);
    }

    private void checkMccMnc(List<EE_RRC_MEASUREMENT> measurements, long imsi) {
        for (EE_RRC_MEASUREMENT measurement : measurements) {
            assertThat(measurement.getIMSI_MCC(), is(MccMncCalculator.getMccForIMSI(imsi)));
            assertThat(measurement.getIMSI_MNC(), is(MccMncCalculator.getMncForIMSI(imsi)));
        }

    }

    Map<Long, List<EE_RRC_MEASUREMENT>> getMeasurementsByUser(final List<EE_RRC_MEASUREMENT> measurements) {
        final Map<Long, List<EE_RRC_MEASUREMENT>> users = new HashMap<Long, List<EE_RRC_MEASUREMENT>>();
        for (final EE_RRC_MEASUREMENT measurement : measurements) {
            if (users.containsKey(measurement.getIMSI())) {
                final List<EE_RRC_MEASUREMENT> measurementsForUser = users.get(measurement.getIMSI());
                measurementsForUser.add(measurement);
            } else {
                final List<EE_RRC_MEASUREMENT> list = new ArrayList<EE_RRC_MEASUREMENT>();
                list.add(measurement);
                users.put(measurement.getIMSI(), list);
            }
        }
        return users;
    }

}
