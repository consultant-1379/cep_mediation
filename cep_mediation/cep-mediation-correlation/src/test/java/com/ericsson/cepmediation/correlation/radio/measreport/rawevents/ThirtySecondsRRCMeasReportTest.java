package com.ericsson.cepmediation.correlation.radio.measreport.rawevents;

import static com.ericsson.cepmediation.test.common.TestConstants.*;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.ericsson.cepmediation.apeventbeans.correlation.EE_RRC_MEASUREMENT;
import com.ericsson.cepmediation.apeventbeans.gpeh.GpehBase;
import com.ericsson.cepmediation.apeventbeans.gpeh.INTERNAL_IMSI;
import com.ericsson.cepmediation.apeventbeans.gpeh.INTERNAL_SYSTEM_RELEASE;
import com.ericsson.cepmediation.apeventbeans.gpeh.RRC_MEASUREMENT_REPORT;
import com.ericsson.cepmediation.base.apeventbeans.Asn1Message;
import com.ericsson.cepmediation.base.apeventbeans.DefaultValues;
import com.ericsson.cepmediation.base.util.constants.EventIdConstants;
import com.ericsson.cepmediation.base.util.constants.MeasReportAttributes;
import com.ericsson.cepmediation.correlation.enrichment.EnhancedGpehSession;
import com.ericsson.cepmediation.correlation.enrichment.MeasurementWindow;
import com.ericsson.cepmediation.correlation.enrichment.SessionEndEvent;
import com.ericsson.cepmediation.correlation.radio.RadioCorrelationBase;
import com.ericsson.cepmediation.correlation.util.XSecondsConstants;
import com.ericsson.cepmediation.test.common.GpehEventType;
import com.ericsson.cepmediation.test.common.RadioUser;
import com.ericsson.cepmediation.test.tools.calculators.EcnoMappingForTest;
import com.ericsson.cepmediation.test.tools.calculators.RscpMappingForTest;
import com.ericsson.cepmediation.test.util.MccMncCalculator;
import com.ericsson.cepmediation.test.util.tracer.EE_RRC_MEASUREMENTReporter;
import com.ericsson.cepmediation.test.util.tracer.EventTracer;
import com.ericsson.cepmediation.test.util.tracer.SessionTracer;

public class ThirtySecondsRRCMeasReportTest extends RadioCorrelationBase {

    private static final int NUMBER_ASN_MESSAGES_PER_REPORT = 3;

    private static final long IMSI_1 = 4540666611111l;

    private static final long FIVE_SECONDS = 5000;

    private static final long TEN_MINUTES = 10 * 60 * 1000;

    private static final long IMSI_2 = 999999999;

    private RadioUser radioUser1;

    private RadioUser radioUser2;

    private RadioUser radioUser1WithDifferentRncModuleIdUeContext;

    private RadioUser radioUserWithSameUeContextRncModuleIdAndDifferentIMSI;

    @Before
    public void warmUp() throws Exception {
        XSecondsConstants.setRrcMeasReportRetentionPeriodInSeconds(2);
        configure("esper/rc.epl", "Thirty-Second-RRC-Measurement-Reports-Before-Call-Drop");
        setUpRadioUsers();
        rncId = 19;
        cellId = 144;
    }

    @After
    public void checkWindowsCleanedUp() {
        checkNothingLeftIn("EE_RRC_Measurement_Temporary");
    }

    @Test
    public void testAttributesSetToDefaultValueIfNoValuesPresentInMeasurement() {
        final List<Measurement> measurements = new ArrayList<ThirtySecondsRRCMeasReportTest.Measurement>();
        final Measurement trafficVolumeMeasurement = new Measurement();
        measurements.add(trafficVolumeMeasurement);
        final long startTime = 0;
        sendEvent(GpehEventType.RRC_RRC_CONNECTION_SETUP, startTime, radioUser1);
        sendInternalIMSIEvent(startTime + 1, radioUser1);
        sendMeasurementReport(startTime + 2, radioUser1, measurements);
        sendInternalSystemReleaseEvent(startTime + 5, radioUser1);
        flush(startTime + FIVE_MINUTE);

        final List<EE_RRC_MEASUREMENT> result = getEERRCMeasurements();
        assertThat(result.size(), is(1));
        final EE_RRC_MEASUREMENT measurement = result.get(0);
        assertThat(measurement.getSCRAMBLING_CODE(), is(DefaultValues.DEFAULT_SHORT_VALUE));
        assertThat(measurement.getBSIC(), is(DefaultValues.DEFAULT_INT_VALUE));
        assertThat(measurement.getEVENT_RESULTS_ORDER_NUMBER(), is((byte) 0));
        assertThat(measurement.getMEAS_RESULTS_ORDER_NUMBER(), is((byte) 0));
        assertThat(measurement.getVALID_EVENT_RESULTS(), is(true));
        assertThat(measurement.getVALID_MEAS_RESULTS(), is(true));
    }

    @Test
    public void testUnsetRscpValueIsntMapped() {
        final int correctEcno = 34;
        final int correctRscp = 46;
        final long startTime = 0;
        sendEvent(GpehEventType.RRC_RRC_CONNECTION_SETUP, startTime, radioUser1);
        sendInternalIMSIEvent(startTime + 1, radioUser1);
        final List<Measurement> measurements = new ArrayList<ThirtySecondsRRCMeasReportTest.Measurement>();
        final Measurement measurementWithUnsetRscp = new Measurement();
        measurementWithUnsetRscp.setRscp(Integer.MIN_VALUE);
        measurements.add(measurementWithUnsetRscp);
        final Measurement measurementWithFieldsSet = new Measurement();
        measurementWithFieldsSet.setEcno(correctEcno);
        measurementWithFieldsSet.setRscp(correctRscp);
        measurements.add(measurementWithFieldsSet);
        sendMeasurementReport(startTime + 2, radioUser1, measurements);
        sendInternalSystemReleaseEvent(startTime + 5, radioUser1);
        flush(startTime + FIVE_MINUTE);

        final List<EE_RRC_MEASUREMENT> result = getEERRCMeasurements();
        assertThat(result.size(), is(2));
        final EE_RRC_MEASUREMENT firstMeasurement = result.get(0);
        assertThat(firstMeasurement.getRSCP(), is(Integer.MIN_VALUE));
        assertThat(firstMeasurement.getECNO(), is(EcnoMappingForTest.getMappedEcno(0)));
        final EE_RRC_MEASUREMENT secondMeasurement = result.get(1);
        assertThat(secondMeasurement.getECNO(), is(EcnoMappingForTest.getMappedEcno(correctEcno)));
        assertThat(secondMeasurement.getRSCP(), is(RscpMappingForTest.getMappedRscp(correctRscp)));
    }

    @Test
    public void testUnsetEcnoValueIsntMapped() {
        final int correctEcno = 34;
        final int correctRscp = 46;
        final long startTime = 0;
        sendEvent(GpehEventType.RRC_RRC_CONNECTION_SETUP, startTime, radioUser1);
        sendInternalIMSIEvent(startTime + 1, radioUser1);
        final List<Measurement> measurements = new ArrayList<ThirtySecondsRRCMeasReportTest.Measurement>();
        final Measurement measurementWithUnsetEcno = new Measurement();
        measurementWithUnsetEcno.setEcno(DefaultValues.DEFAULT_INT_VALUE);
        measurements.add(measurementWithUnsetEcno);
        final Measurement measurementWithFieldsSet = new Measurement();
        measurementWithFieldsSet.setEcno(correctEcno);
        measurementWithFieldsSet.setRscp(correctRscp);
        measurements.add(measurementWithFieldsSet);
        sendMeasurementReport(startTime + 2, radioUser1, measurements);
        sendInternalSystemReleaseEvent(startTime + 5, radioUser1);
        flush(startTime + FIVE_MINUTE);

        final List<EE_RRC_MEASUREMENT> result = getEERRCMeasurements();
        assertThat(result.size(), is(2));
        final EE_RRC_MEASUREMENT firstMeasurement = result.get(0);
        assertThat("ECNO is wrong", firstMeasurement.getECNO(), is(DefaultValues.DEFAULT_FLOAT_VALUE));
        final EE_RRC_MEASUREMENT secondMeasurement = result.get(1);
        assertThat(secondMeasurement.getECNO(), is(EcnoMappingForTest.getMappedEcno(correctEcno)));
        assertThat(secondMeasurement.getRSCP(), is(RscpMappingForTest.getMappedRscp(correctRscp)));
    }

    private void sendMeasurementReport(final long timestamp, final RadioUser radioUser, final List<Measurement> measurements) {
        final RRC_MEASUREMENT_REPORT event = (RRC_MEASUREMENT_REPORT) createEvent(GpehEventType.RRC_MEASUREMENT_REPORT, timestamp, radioUser);
        final List<Asn1Message> asn1MessageList = new ArrayList<Asn1Message>();
        for (final Measurement measurement : measurements) {
            final Asn1Message asn1Message = new Asn1Message();
            final Map<String, String> messageAttributes = new HashMap<String, String>();
            messageAttributes.put(MeasReportAttributes.EC_NO, Integer.toString(measurement.getEcno()));
            messageAttributes.put(MeasReportAttributes.RSCP, Integer.toString(measurement.getRscp()));
            messageAttributes.put(MeasReportAttributes.SCRAMBLING_CODE, Short.toString(DefaultValues.DEFAULT_SHORT_VALUE));
            messageAttributes.put(MeasReportAttributes.TRIGGER_EVENT_ID, "0");
            messageAttributes.put(MeasReportAttributes.MEASUREMENT_TYPE, "0");
            messageAttributes.put(MeasReportAttributes.BSIC, Integer.toString(DefaultValues.DEFAULT_INT_VALUE));
            messageAttributes.put(MeasReportAttributes.EVENT_RESULTS_ORDER_NUMBER, "0");
            messageAttributes.put(MeasReportAttributes.MEAS_RESULTS_ORDER_NUMBER, "0");
            messageAttributes.put(MeasReportAttributes.VALID_EVENT_RESULTS, "true");
            messageAttributes.put(MeasReportAttributes.VALID_MEAS_RESULTS, "true");
            asn1Message.setMessageAttributes(messageAttributes);
            asn1MessageList.add(asn1Message);
            EventTracer.traceAsn1Message(asn1Message);
        }
        event.setAsn1MessageList(asn1MessageList);
        correlationEngine.sendEvent(event);
    }

    @Test
    public void testMRsAreStoredIfCallDropHappensAfterRRCConnectionReleaseCompleteEvent() {
        final long startTime = 0;
        sendEvent(GpehEventType.RRC_RRC_CONNECTION_SETUP, startTime, radioUser1);
        sendInternalIMSIEvent(startTime + 1, radioUser1);
        sendEvent(GpehEventType.RRC_MEASUREMENT_REPORT, startTime + 2, radioUser1);
        sendEvent(GpehEventType.RRC_MEASUREMENT_REPORT, startTime + 3, radioUser1);
        sendEvent(GpehEventType.RRC_RRC_CONNECTION_RELEASE_COMPLETE, startTime + 4, radioUser1);
        sendInternalSystemReleaseEvent(startTime + 5, radioUser1);
        flush(startTime + FIVE_MINUTE);

        verifyMeasurementsForSingleUser(2, radioUser1);
    }

    @Test
    public void testEventsFromPreviousSessionSameUeContextRncModuleIdDifferentIMSINotIncluded() {
        final long startTimeForFirstSession = 0;
        System.out.println("First session, for " + radioUser1);
        sendEvent(GpehEventType.RRC_RRC_CONNECTION_SETUP, startTimeForFirstSession, radioUser1);
        sendInternalIMSIEvent(startTimeForFirstSession + 2, radioUser1);

        sendEvent(GpehEventType.RRC_MEASUREMENT_REPORT, startTimeForFirstSession + 1, radioUser1);

        sendEvent(GpehEventType.RRC_MEASUREMENT_REPORT, startTimeForFirstSession + 3, radioUser1);
        sendEvent(GpehEventType.RRC_RRC_CONNECTION_RELEASE_COMPLETE, startTimeForFirstSession + 4, radioUser1);

        final long startTimeForSecondSession = startTimeForFirstSession + 10;
        System.out.println("Second session, for " + radioUserWithSameUeContextRncModuleIdAndDifferentIMSI);
        sendEvent(GpehEventType.RRC_RRC_CONNECTION_SETUP, startTimeForSecondSession, radioUserWithSameUeContextRncModuleIdAndDifferentIMSI);
        sendInternalIMSIEvent(startTimeForSecondSession + 2, radioUserWithSameUeContextRncModuleIdAndDifferentIMSI);
        sendEvent(GpehEventType.RRC_MEASUREMENT_REPORT, startTimeForSecondSession + 1, radioUserWithSameUeContextRncModuleIdAndDifferentIMSI);
        sendEvent(GpehEventType.RRC_MEASUREMENT_REPORT, startTimeForSecondSession + 3, radioUserWithSameUeContextRncModuleIdAndDifferentIMSI);
        sendInternalSystemReleaseEvent(startTimeForSecondSession + 4, radioUserWithSameUeContextRncModuleIdAndDifferentIMSI);

        verifyMeasurementsForSingleUser(2, radioUserWithSameUeContextRncModuleIdAndDifferentIMSI);
    }

    @Test
    public void testMRsArrivingWithDifferentIMSIForSameUeContextRncModuleIdDontOverWriteFirstIMSIsEvents() {
        System.out.println("First session, with call drop for " + radioUser1);
        sendEvent(GpehEventType.RRC_RRC_CONNECTION_SETUP, getTimestamp(), radioUser1);
        sendEvent(GpehEventType.RRC_MEASUREMENT_REPORT, getTimestamp(), radioUser1);
        sendInternalIMSIEvent(getTimestamp(), radioUser1);
        sendInternalSystemReleaseEvent(getTimestamp(), radioUser1);

        System.out.println("\nSecond call drop for " + radioUserWithSameUeContextRncModuleIdAndDifferentIMSI);
        sendEvent(GpehEventType.RRC_RRC_CONNECTION_SETUP, getTimestamp(), radioUserWithSameUeContextRncModuleIdAndDifferentIMSI);
        sendEvent(GpehEventType.RRC_MEASUREMENT_REPORT, getTimestamp(), radioUserWithSameUeContextRncModuleIdAndDifferentIMSI);
        sendInternalIMSIEvent(getTimestamp(), radioUserWithSameUeContextRncModuleIdAndDifferentIMSI);
        sendInternalSystemReleaseEvent(getTimestamp(), radioUserWithSameUeContextRncModuleIdAndDifferentIMSI);

        flush(getTimestamp() + FIVE_MINUTE);

        final List<EE_RRC_MEASUREMENT> measurements = getEERRCMeasurements();
        EE_RRC_MEASUREMENTReporter.traceMeasurements(measurements);
        assertThat(measurements.size(), is(6));
        assertThat(getMeasurementsForUser(radioUser1.getImsi(), measurements).size(), is(3));
        assertThat(getMeasurementsForUser(radioUserWithSameUeContextRncModuleIdAndDifferentIMSI.getImsi(), measurements).size(), is(3));
    }

    private List<EE_RRC_MEASUREMENT> getMeasurementsForUser(final long imsi, final List<EE_RRC_MEASUREMENT> measurements) {
        final List<EE_RRC_MEASUREMENT> measurementsForUser = new ArrayList<EE_RRC_MEASUREMENT>();
        for (final EE_RRC_MEASUREMENT measurement : measurements) {
            if (measurement.getIMSI() == imsi) {
                measurementsForUser.add(measurement);
            }
        }
        return measurementsForUser;
    }

    private void flush(final long timestamp) {
        correlationEngine.sendEvent(new SessionEndEvent(timestamp));
    }

    @Test
    /**
     * Seen in real data from Smartone - 4% of ISR events have no IMSI
     */
    public void testISREventsWithNoIMSIAreDumped() {
        sendEvent(GpehEventType.RRC_RRC_CONNECTION_SETUP, getTimestamp(), radioUser1);
        sendInternalIMSIEvent(getTimestamp(), radioUser1);
        sendEvent(GpehEventType.RRC_MEASUREMENT_REPORT, getTimestamp(), radioUser1);
        sendInternalSystemReleaseEventWithIMSISetTo0(getTimestamp(), radioUser1);
        verifyCorrectNumberOfMeasurementsReturned(0);
        final List<MeasurementWindow> measurementWindowsInSlidingWIndow = getMeasurementWindowsCurrentlyInSlidingWindow();
        assertThat(measurementWindowsInSlidingWIndow.size(), is(3));
    }

    private void sendInternalSystemReleaseEventWithIMSISetTo0(final long timestamp, final RadioUser radioUser) {
        final GpehBase event = createEvent(GpehEventType.INTERNAL_SYSTEM_RELEASE, timestamp, radioUser);
        final INTERNAL_SYSTEM_RELEASE internalSystemReleaseEvent = (INTERNAL_SYSTEM_RELEASE) event;
        internalSystemReleaseEvent.setIMSI("0");
        sendEvent(internalSystemReleaseEvent);
    }

    @Test
    public void testMeasurementsStayInMeasurementWindowWhenNoISREvent() {
        sendEvent(GpehEventType.RRC_RRC_CONNECTION_SETUP, getTimestamp(), radioUser1);
        sendInternalIMSIEvent(getTimestamp(), radioUser1);
//        traceRadioSessionWindow();    // Causing test to fail
        sendEvent(GpehEventType.RRC_MEASUREMENT_REPORT, getTimestamp(), radioUser1);
        traceMeasurementWindow();
        traceEERRCMeasurementTemporaryWindow();
        verifyCorrectNumberOfMeasurementsReturned(0);
        final List<MeasurementWindow> measurementWindowsInSlidingWIndow = getMeasurementWindowsCurrentlyInSlidingWindow();
        assertThat(measurementWindowsInSlidingWIndow.size(), is(3));
    }

    @Test
    public void testWithOneRRCMeasurementReport() {
        sendEvent(GpehEventType.RRC_RRC_CONNECTION_SETUP, getTimestamp(), radioUser1);
        sendInternalIMSIEvent(getTimestamp(), radioUser1);
        sendEvent(GpehEventType.RRC_MEASUREMENT_REPORT, getTimestamp(), radioUser1);
        sendInternalSystemReleaseEvent(getTimestamp(), radioUser1);
        verifyMeasurementsForSingleUser(1, radioUser1);
        checkNothingLeftIn("MeasurementWindow");
    }

    private void traceRadioSessionWindow() {
        final List<? extends Object> radioSessions = getElementsInWindow("RadioSessionWindow");
        for (final Object object : radioSessions) {
            final EnhancedGpehSession gpehSession = (EnhancedGpehSession) object;
            SessionTracer.traceSession(gpehSession);
        }
    }

    private void verifyMeasurementsForSingleUser(final int expectedNumberParentRRCMREvents, final RadioUser radioUser) {
        final List<EE_RRC_MEASUREMENT> measurements = getEERRCMeasurements();
        verifyCorrectNumberOfMeasurementsReturned(measurements, expectedNumberParentRRCMREvents);
        verifyMeasurementsReturned(measurements, radioUser);
    }

    private void verifyMeasurementsReturned(final List<EE_RRC_MEASUREMENT> measurements, final RadioUser radioUser) {
        for (final EE_RRC_MEASUREMENT measurement : measurements) {
            EE_RRC_MEASUREMENTReporter.traceMeasurement(measurement);
            assertThat(measurement.getIMSI(), is(radioUser.getImsi()));
            assertThat(measurement.getIMSI_MCC(), is(MccMncCalculator.getMccForIMSI(radioUser.getImsi())));
            assertThat(measurement.getIMSI_MNC(), is(MccMncCalculator.getMncForIMSI(radioUser.getImsi())));
            assertThat("Serving cell id is wrong", measurement.getC_ID_1(), is(cellId));
            assertThat("cell id 2 wrong", measurement.getC_ID_2(), is(-1));
            assertThat(measurement.getC_ID_3(), is(-1));
            assertThat(measurement.getC_ID_4(), is(-1));
            assertThat(measurement.getRNC_ID_1(), is(rncId));
            assertThat(measurement.getRNC_ID_2(), is((short) -1));
            assertThat(measurement.getRNC_ID_3(), is((short) -1));
            assertThat(measurement.getRNC_ID_4(), is((short) -1));
            assertThat(measurement.getEVENT_ID(), is((short) EventIdConstants.RRC_MEASUREMENT_REPORT));
            assertThat("RNC Module ID is incorrect", measurement.getRNC_MODULE_ID(), is(radioUser.getRncModuleIdForUser()));
            assertThat(measurement.getUE_CONTEXT(), is(radioUser.getUeContextForUser()));
            assertFalse("Timestamp should be set ", measurement.getTimestamp() == 0);

            assertThat(measurement.getBSIC(), is(TEST_BSIC));
            assertThat(measurement.getECNO(), is(EcnoMappingForTest.getMappedEcno(TEST_ECNO)));
            assertThat(measurement.getRSCP(), is(RscpMappingForTest.getMappedRscp(TEST_RSCP)));
            assertThat("Scrambling code incorrect", measurement.getSCRAMBLING_CODE(), is(TEST_SCRAMBLING_CODE));
            assertThat("Order number incorrect", measurement.getMEAS_RESULTS_ORDER_NUMBER(), is(TEST_ORDER));
            assertThat(measurement.getTRIGGER_EVENT_ID(), is(TEST_TRIGGER_EVENT_ID));
            assertThat(measurement.getMEASUREMENT_TYPE(), is(TEST_MEASUREMENT_TYPE));
        }
    }

    private void checkNothingLeftIn(final String windowName) {
        final List<? extends Object> elements = getElementsInWindow(windowName);
        assertThat(windowName + " should be cleaned out", elements.size(), is(0));
    }

    private void verifyCorrectNumberOfMeasurementsReturned(final List<EE_RRC_MEASUREMENT> measurements, final int numberMeasurementReports) {
        assertThat("Incorrect number of measurements returned", measurements.size(), is(numberMeasurementReports * NUMBER_ASN_MESSAGES_PER_REPORT));

    }

    private void setUpRadioUsers() {
        radioUser1 = new RadioUser();
        radioUser1.setRncModuleIdForUser((byte) 1);
        radioUser1.setUeContextForUser((short) 1);
        radioUser1.setImsi(IMSI_1);

        radioUser1WithDifferentRncModuleIdUeContext = new RadioUser();
        radioUser1WithDifferentRncModuleIdUeContext.setImsi(IMSI_1);
        radioUser1WithDifferentRncModuleIdUeContext.setUeContextForUser((short) 99);
        radioUser1WithDifferentRncModuleIdUeContext.setRncModuleIdForUser((byte) 99);

        radioUser2 = new RadioUser();
        radioUser2.setRncModuleIdForUser((byte) 2);
        radioUser2.setUeContextForUser((short) 4);
        radioUser2.setImsi(75656);

        radioUserWithSameUeContextRncModuleIdAndDifferentIMSI = new RadioUser();
        radioUserWithSameUeContextRncModuleIdAndDifferentIMSI.setRncModuleIdForUser(radioUser1.getRncModuleIdForUser());
        radioUserWithSameUeContextRncModuleIdAndDifferentIMSI.setUeContextForUser(radioUser1.getUeContextForUser());
        radioUserWithSameUeContextRncModuleIdAndDifferentIMSI.setImsi(IMSI_2);
    }

    @Test
    public void testMultipleInternalImsiEventsHandled() {
        sendEvent(GpehEventType.RRC_RRC_CONNECTION_SETUP, getTimestamp(), radioUser1);
        sendInternalIMSIEvent(getTimestamp(), radioUser1);

        sendEvent(GpehEventType.RRC_MEASUREMENT_REPORT, getTimestamp(), radioUser1);
        sendInternalIMSIEvent(getTimestamp(), radioUser1);
        sendInternalSystemReleaseEvent(getTimestamp(), radioUser1);

        getMeasurementWindowsCurrentlyInSlidingWindow();
        verifyMeasurementsForSingleUser(1, radioUser1);
        checkNothingLeftIn("MeasurementWindow");
    }

    @Test
    public void testRRCMeasurementReportsFromPreviousSessionSameUserDifferentUeContextRncModuleIdIncluded() {
        final long startTimeForStaleSession = 0;
        System.out.println("Stale previous session:");
        sendEvent(GpehEventType.RRC_RRC_CONNECTION_SETUP, startTimeForStaleSession, radioUser1);
        sendEvent(GpehEventType.RRC_MEASUREMENT_REPORT, startTimeForStaleSession + 1, radioUser1);
        sendInternalIMSIEvent(startTimeForStaleSession + 2, radioUser1);
        sendEvent(GpehEventType.RRC_MEASUREMENT_REPORT, startTimeForStaleSession + 3, radioUser1);
        sendEvent(GpehEventType.RRC_RRC_CONNECTION_RELEASE_COMPLETE, startTimeForStaleSession + 4, radioUser1);

        System.out.println("First real session:");
        final long startTimeForFirstRealSession = startTimeForStaleSession + FIVE_MINUTE;
        sendEvent(GpehEventType.RRC_RRC_CONNECTION_SETUP, startTimeForFirstRealSession, radioUser1);
        sendInternalIMSIEvent(startTimeForFirstRealSession + 2, radioUser1);
        sendEvent(GpehEventType.RRC_MEASUREMENT_REPORT, startTimeForFirstRealSession + 1, radioUser1);
        sendEvent(GpehEventType.RRC_MEASUREMENT_REPORT, startTimeForFirstRealSession + 3, radioUser1);
        sendEvent(GpehEventType.RRC_RRC_CONNECTION_RELEASE_COMPLETE, startTimeForFirstRealSession + 4, radioUser1);

        final long startTimeForSecondSession = startTimeForFirstRealSession + 10;
        System.out.println("Second real session:");
        sendEvent(GpehEventType.RRC_RRC_CONNECTION_SETUP, startTimeForSecondSession, radioUser1WithDifferentRncModuleIdUeContext);
        sendInternalIMSIEvent(startTimeForSecondSession + 2, radioUser1WithDifferentRncModuleIdUeContext);
        sendEvent(GpehEventType.RRC_MEASUREMENT_REPORT, startTimeForSecondSession + 1, radioUser1WithDifferentRncModuleIdUeContext);
        sendEvent(GpehEventType.RRC_MEASUREMENT_REPORT, startTimeForSecondSession + 3, radioUser1WithDifferentRncModuleIdUeContext);
        sendInternalSystemReleaseEvent(startTimeForSecondSession + 4, radioUser1WithDifferentRncModuleIdUeContext);

        verifyCorrectNumberOfMeasurementsReturned(4);
        checkNothingLeftIn("MeasurementWindow");
    }

    @Test
    public void testRRCMeasurementReportsFromPreviousSessionSameUeContextRncModuleIdIncluded_MREventsBeforeSecondIMSIEvent() {
        final long startTimeForFirstSession = 0;
        System.out.println("First session:");
        sendEvent(GpehEventType.RRC_RRC_CONNECTION_SETUP, startTimeForFirstSession, radioUser1);
        sendEvent(GpehEventType.RRC_MEASUREMENT_REPORT, startTimeForFirstSession + 1, radioUser1);
        sendInternalIMSIEvent(startTimeForFirstSession + 2, radioUser1);
        sendEvent(GpehEventType.RRC_MEASUREMENT_REPORT, startTimeForFirstSession + 3, radioUser1);
        sendEvent(GpehEventType.RRC_RRC_CONNECTION_RELEASE_COMPLETE, startTimeForFirstSession + 4, radioUser1);

        final long startTimeForSecondSession = startTimeForFirstSession + 10;
        System.out.println("Second session:");
        sendEvent(GpehEventType.RRC_RRC_CONNECTION_SETUP, startTimeForSecondSession, radioUser1);
        sendEvent(GpehEventType.RRC_MEASUREMENT_REPORT, startTimeForSecondSession + 1, radioUser1);
        sendInternalIMSIEvent(startTimeForSecondSession + 2, radioUser1);
        sendEvent(GpehEventType.RRC_MEASUREMENT_REPORT, startTimeForSecondSession + 3, radioUser1);
        sendInternalSystemReleaseEvent(startTimeForSecondSession + 4, radioUser1);

        verifyMeasurementsForSingleUser(4, radioUser1);
        checkNothingLeftIn("MeasurementWindow");
    }

    @Test
    public void testRRCMeasurementReportsFromPreviousSessionSameUeContextRncModuleIdIncluded() {
        final long startTimeForStaleSession = 0;
        System.out.println("Stale session:");
        sendEvent(GpehEventType.RRC_RRC_CONNECTION_SETUP, startTimeForStaleSession, radioUser1);
        sendEvent(GpehEventType.RRC_MEASUREMENT_REPORT, startTimeForStaleSession + 1, radioUser1);
        sendInternalIMSIEvent(startTimeForStaleSession + 2, radioUser1);

        sendEvent(GpehEventType.RRC_MEASUREMENT_REPORT, startTimeForStaleSession + 3, radioUser1);
        sendEvent(GpehEventType.RRC_RRC_CONNECTION_RELEASE_COMPLETE, startTimeForStaleSession + 4, radioUser1);

        final long startTimeForFirstSession = startTimeForStaleSession + FIVE_SECONDS;
        System.out.println("First session:");
        sendEvent(GpehEventType.RRC_RRC_CONNECTION_SETUP, startTimeForFirstSession, radioUser1);
        sendInternalIMSIEvent(startTimeForFirstSession + 2, radioUser1);

        sendEvent(GpehEventType.RRC_MEASUREMENT_REPORT, startTimeForFirstSession + 1, radioUser1);

        sendEvent(GpehEventType.RRC_MEASUREMENT_REPORT, startTimeForFirstSession + 3, radioUser1);
        sendEvent(GpehEventType.RRC_RRC_CONNECTION_RELEASE_COMPLETE, startTimeForFirstSession + 4, radioUser1);

        getMeasurementWindowsCurrentlyInSlidingWindow();

        final long startTimeForSecondSession = startTimeForFirstSession + 10;
        System.out.println("Second session:");
        sendEvent(GpehEventType.RRC_RRC_CONNECTION_SETUP, startTimeForSecondSession, radioUser1);
        sendInternalIMSIEvent(startTimeForSecondSession + 2, radioUser1);
        sendEvent(GpehEventType.RRC_MEASUREMENT_REPORT, startTimeForSecondSession + 1, radioUser1);
        sendEvent(GpehEventType.RRC_MEASUREMENT_REPORT, startTimeForSecondSession + 3, radioUser1);
        sendInternalSystemReleaseEvent(startTimeForSecondSession + 4, radioUser1);

        verifyMeasurementsForSingleUser(4, radioUser1);
        checkNothingLeftIn("MeasurementWindow");

    }

    @Test
    public void testRRCMeasurementReportArrivingBeforeInternalIMSIEventIsIncluded() {
        final long startTime = 0;
        sendEvent(GpehEventType.RRC_RRC_CONNECTION_SETUP, startTime, radioUser1);
        sendEvent(GpehEventType.RRC_MEASUREMENT_REPORT, startTime + 1, radioUser1);
        sendEvent(GpehEventType.RRC_MEASUREMENT_REPORT, startTime + 2, radioUser1);
        sendInternalIMSIEvent(startTime + 3, radioUser1);
        sendInternalSystemReleaseEvent(startTime + 4, radioUser1);

        verifyMeasurementsForSingleUser(2, radioUser1);
        checkNothingLeftIn("MeasurementWindow");
    }

    @Test
    public void testRRCMeasurementReportArrivingBeforeAndAfterInternalIMSIEventAreIncluded() {
        final long startTime = 0;
        sendEvent(GpehEventType.RRC_RRC_CONNECTION_SETUP, startTime, radioUser1);
        sendEvent(GpehEventType.RRC_MEASUREMENT_REPORT, startTime + 1, radioUser1);
        sendInternalIMSIEvent(startTime + 2, radioUser1);
        sendEvent(GpehEventType.RRC_MEASUREMENT_REPORT, startTime + 3, radioUser1);
        sendInternalSystemReleaseEvent(startTime + 4, radioUser1);

        verifyMeasurementsForSingleUser(2, radioUser1);
        checkNothingLeftIn("MeasurementWindow");

    }

    @Test
    public void testRRCMeasurementReportsNotBufferedAfterXSecondsIntermediateRRCEventsMultipleIMSIs() {
        final long startTime = 0;
        sendEvent(GpehEventType.RRC_RRC_CONNECTION_SETUP, startTime, radioUser1);
        sendEvent(GpehEventType.RRC_RRC_CONNECTION_SETUP, startTime, radioUser2);

        sendInternalIMSIEvent(startTime + 1, radioUser1);
        sendInternalIMSIEvent(startTime + 1, radioUser2);

        sendEvent(GpehEventType.RRC_MEASUREMENT_REPORT, startTime + 2, radioUser1);
        sendEvent(GpehEventType.RRC_MEASUREMENT_REPORT, startTime + 3, radioUser1);
        sendEvent(GpehEventType.RRC_MEASUREMENT_REPORT, startTime + 2, radioUser2);
        sendEvent(GpehEventType.RRC_MEASUREMENT_REPORT, startTime + 3, radioUser2);
        sendEvent(GpehEventType.RRC_MEASUREMENT_REPORT, startTime + FIVE_SECONDS, radioUser1);
        sendEvent(GpehEventType.RRC_MEASUREMENT_REPORT, startTime + FIVE_SECONDS + 1, radioUser1);

        sendInternalSystemReleaseEvent(startTime + FIVE_SECONDS + 2, radioUser1);

        verifyCorrectNumberOfMeasurementsReturned(2);
        //delete has now executed, so events for radioUser1 have been deleted & events for radioUser2 were pushed out earlier on
        assertThat(getMeasurementWindowsCurrentlyInSlidingWindow().size(), is(0));
        checkNothingLeftIn("MeasurementWindow");

    }

    private void verifyCorrectNumberOfMeasurementsReturned(final int numberExpectedParentMREvents) {
        verifyCorrectNumberOfMeasurementsReturned(getEERRCMeasurements(), numberExpectedParentMREvents);
    }

    @Test
    public void testRRCMeasurementReportsNotBufferedAfterXSecondsIntermediateRRCEvents() {
        final long firstWave = getTimestamp() - TEN_MINUTES;
        sendEvent(GpehEventType.RRC_RRC_CONNECTION_SETUP, firstWave, radioUser1);
        sendInternalIMSIEvent(firstWave + 1, radioUser1);
        sendEvent(GpehEventType.RRC_MEASUREMENT_REPORT, firstWave + 2, radioUser1);
        sendEvent(GpehEventType.RRC_MEASUREMENT_REPORT, firstWave + 3, radioUser1);
        assertThat(getMeasurementWindowsCurrentlyInSlidingWindow().size(), is(6));

        final long secondWave = firstWave + FIVE_SECONDS;
        sendEvent(GpehEventType.RRC_MEASUREMENT_REPORT, secondWave, radioUser1);
        sendEvent(GpehEventType.RRC_MEASUREMENT_REPORT, secondWave + 1, radioUser1);
        assertThat(getMeasurementWindowsCurrentlyInSlidingWindow().size(), is(6));

        sendEvent(GpehEventType.RRC_MEASUREMENT_REPORT, secondWave + 2, radioUser1);
        assertThat(getMeasurementWindowsCurrentlyInSlidingWindow().size(), is(9));

        final long thirdWave = secondWave + FIVE_SECONDS + 1;
        sendEvent(GpehEventType.RRC_MEASUREMENT_REPORT, thirdWave, radioUser1);
        sendEvent(GpehEventType.RRC_MEASUREMENT_REPORT, thirdWave + 1, radioUser1);
        assertThat(getMeasurementWindowsCurrentlyInSlidingWindow().size(), is(6));

        final long fourthWave = thirdWave + FIVE_SECONDS;
        sendEvent(GpehEventType.RRC_MEASUREMENT_REPORT, fourthWave, radioUser1);
        sendInternalSystemReleaseEvent(fourthWave + 1, radioUser1);

        verifyMeasurementsForSingleUser(1, radioUser1);

        assertThat(getMeasurementWindowsCurrentlyInSlidingWindow().size(), is(0));
        checkNothingLeftIn("MeasurementWindow");

    }

    private List<MeasurementWindow> getMeasurementWindowsCurrentlyInSlidingWindow() {
        final String query = "select * from MeasurementWindow";
        final List<MeasurementWindow> results = (List<MeasurementWindow>) runOnDemandQuery(query);
        System.out.println(results.size() + " objects currently in sliding window");
        return results;

    }

    @Test
    public void testRRCMeasurementReportsNotBufferedAfterXSeconds() {
        final long startTime = getTimestamp() - TEN_MINUTES;
        sendEvent(GpehEventType.RRC_RRC_CONNECTION_SETUP, startTime, radioUser1);
        sendInternalIMSIEvent(startTime + 1, radioUser1);
        sendEvent(GpehEventType.RRC_MEASUREMENT_REPORT, startTime + 2, radioUser1);
        sendEvent(GpehEventType.RRC_MEASUREMENT_REPORT, startTime + 3 * 1000, radioUser1);
        sendInternalSystemReleaseEvent(startTime + 3 * 1000 + 2, radioUser1);

        verifyMeasurementsForSingleUser(1, radioUser1);
        checkNothingLeftIn("MeasurementWindow");
    }

    @Test
    public void testWithTwoRRCMeasurementReports() {
        final long timestamp1 = getTimestamp();
        final long timestamp2 = timestamp1 + 1;
        sendEvent(GpehEventType.RRC_RRC_CONNECTION_SETUP, getTimestamp(), radioUser1);
        sendInternalIMSIEvent(getTimestamp(), radioUser1);
        sendEvent(GpehEventType.RRC_MEASUREMENT_REPORT, timestamp1, radioUser1);
        sendInternalIMSIEvent(getTimestamp(), radioUser1);
        sendEvent(GpehEventType.RRC_MEASUREMENT_REPORT, timestamp2, radioUser1);
        sendInternalIMSIEvent(getTimestamp(), radioUser1);
        sendInternalSystemReleaseEvent(getTimestamp(), radioUser1);

        verifyMeasurementsForSingleUser(2, radioUser1);
        checkNothingLeftIn("MeasurementWindow");
    }

    private void traceEERRCMeasurementTemporaryWindow() {
        final List<? extends Object> elementsInWindow = getElementsInWindow("EE_RRC_Measurement_Temporary");
        for (final Object object : elementsInWindow) {
            final EE_RRC_MEASUREMENT measurement = (EE_RRC_MEASUREMENT) object;
            System.out.println("EE_RRC_MEASUREMENT for " + measurement.getIMSI());
        }
    }

    private void traceMeasurementWindow() {
        traceWindow("MeasurementWindow");
    }

    private void traceWindow(final String windowName) {
        final List<? extends Object> objects = getElementsInWindow(windowName);
        System.out.println("Number of elements in " + windowName + ": " + objects.size());
        for (final Object object : objects) {
            if (object instanceof MeasurementWindow) {
                final MeasurementWindow measWindow = (MeasurementWindow) object;
                System.out.println("MeasurementWindow for " + measWindow.getIMSI());
            }
        }
    }

    private List<EE_RRC_MEASUREMENT> getEERRCMeasurements() {
        final List<Object> eventBeans = getEventBeansCreatedByEsper();
        final List<EE_RRC_MEASUREMENT> asn1MeasurementWindows = new ArrayList<EE_RRC_MEASUREMENT>();
        for (final Object eventBean : eventBeans) {
            asn1MeasurementWindows.add((EE_RRC_MEASUREMENT) eventBean);
        }
        return asn1MeasurementWindows;
    }

    private void sendInternalSystemReleaseEvent(final long timestamp, final RadioUser radioUser) {
        final GpehBase event = createEvent(GpehEventType.INTERNAL_SYSTEM_RELEASE, timestamp, radioUser);
        final INTERNAL_SYSTEM_RELEASE internalSystemReleaseEvent = (INTERNAL_SYSTEM_RELEASE) event;
        internalSystemReleaseEvent.setIMSI(radioUser.getImsiAsString());
        sendEvent(internalSystemReleaseEvent);
    }

    private void sendInternalIMSIEvent(final long timestamp, final RadioUser radioUser) {
        final GpehBase event = createEvent(GpehEventType.INTERNAL_IMSI, timestamp, radioUser);
        final INTERNAL_IMSI imsiEvent = (INTERNAL_IMSI) event;
        imsiEvent.setIMSI(radioUser.getImsiAsString());
        sendEvent(event);
    }

    private GpehBase createEvent(final GpehEventType eventType, final long timestamp, final RadioUser radioUser) {
        return createRadioEventsWithParams(eventType, cellId, timestamp, rncId, radioUser.getRncModuleIdForUser(), radioUser.getUeContextForUser());
    }

    class Measurement {

        private int ecno;

        private int rscp;

        public void setEcno(final int ecno) {
            this.ecno = ecno;
        }

        public void setRscp(final int rscp) {
            this.rscp = rscp;
        }

        public int getEcno() {
            return ecno;
        }

        public int getRscp() {
            return rscp;
        }

    }

}
