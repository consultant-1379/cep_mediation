/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.loading.asn1;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;

import rrc.informationelements.BSICReported;
import rrc.informationelements.CellToReport;
import rrc.informationelements.CellToReportList;
import rrc.informationelements.EventIDInterFreq;
import rrc.informationelements.EventIDInterRAT;
import rrc.informationelements.EventResults;
import rrc.informationelements.InterFreqCell;
import rrc.informationelements.InterFreqCellList;
import rrc.informationelements.InterFreqCellMeasuredResultsList;
import rrc.informationelements.InterFreqEventResults;
import rrc.informationelements.InterFreqMeasuredResults;
import rrc.informationelements.InterFreqMeasuredResultsList;
import rrc.informationelements.InterRATEventResults;
import rrc.informationelements.MeasuredResults;
import rrc.informationelements.MeasuredResultsOnRACH;
import rrc.informationelements.MeasuredResultsOnRACH.CurrentCell;
import rrc.informationelements.MeasuredResultsOnRACH.CurrentCell.ModeSpecificInfo.Fdd.MeasurementQuantity;
import rrc.informationelements.TrafficVolumeEventResults;
import rrc.informationelements.UE_InternalEventResults;
import rrc.pdu_definitions.MeasurementReport;

import com.ericsson.cepmediation.base.apeventbeans.Asn1Message;
import com.ericsson.cepmediation.base.apeventbeans.DefaultValues;
import com.oss.asn1.INTEGER;

/**
 * @author eemecoy
 *
 */
public class Asn1DecoderTest extends BaseAsn1DecoderMock {

    private MeasuredResultsOnRACH measuredResultsOnRACH;

    @Before
    public void setup() {
        measuredResultsOnRACH = mock(MeasuredResultsOnRACH.class);
    }

    @Test
    public void testNoMeasurementReturnedIfMeasuredResultsIsNull() {
        mockedMeasurementReport = mock(MeasurementReport.class);
        when(mockedMessageType.getChosenValue()).thenReturn(mockedMeasurementReport);
        when(mockedMeasurementReport.getEventResults()).thenReturn(null);
        when(mockedMeasurementReport.getMeasuredResults()).thenReturn(null);
        assertNull(getAsn1MessageList());

    }

    @Test
    public void testDecodingWhenNoEventsResultsBlock_TrafficVolume() {
        final MeasuredResults mockedMeasuredResults = setUpMocksForNoEventResultBlockInMessage();
        when(mockedMeasuredResults.hasTrafficVolumeMeasuredResultsList()).thenReturn(true);

        final int ecnoValueToSet = 3;
        mockRACH(ecnoValueToSet);
        final Asn1Message decodedAsn1Message = decodeAsn1();
        final short expectedScramblingCode = DefaultValues.DEFAULT_SHORT_VALUE;
        final int expectedBsic = DefaultValues.DEFAULT_INT_VALUE;
        checkResultWithSingleMeasurement(decodedAsn1Message, ecnoValueToSet, Integer.MIN_VALUE,
                EVENT_TYPE.TRAFFIC_VOLUME, (short) -1, expectedScramblingCode, expectedBsic,
                DefaultAsn1AttributeValues.DEFAULT_MEAS_RESULTS_ORDER, -1, false, false);

    }

    @Test
    public void testDecodingWhenNoEventsResultsBlock_InterFreq() {

        final short ecnoValue = 31;
        final short rscpValue = 51;
        final short primaryScramblingCode = 71;
        interFreqMeasuredResultsListSize = 1;
        interFreqCellMeasuredResultsList = 1;

        final InterFreqEventResults mockedInterFreqEventResults = mock(InterFreqEventResults.class);
        when(mockedInterFreqEventResults.getEventID()).thenReturn(EventIDInterFreq.e2b);
        final InterFreqCellList mockedInterFreqCellList = mock(InterFreqCellList.class);
        when(mockedInterFreqEventResults.getInterFreqCellList()).thenReturn(mockedInterFreqCellList);
        final InterFreqCell interFreqCell = mock(InterFreqCell.class);
        when(mockedInterFreqCellList.get(0)).thenReturn(interFreqCell);

        setUpMeasurementResultMocks(primaryScramblingCode, rscpValue, ecnoValue);

        when(interFreqCell.getNonFreqRelatedEventResults()).thenReturn(mockedCellMeasurementEventResults);
        final MeasuredResults mockedMeasuredResults = setUpMocksForNoEventResultBlockInMessage();
        when(mockedMeasuredResults.hasInterFreqMeasuredResultsList()).thenReturn(true);

        final InterFreqMeasuredResultsList interFreqMeasuredResultsList = mock(InterFreqMeasuredResultsList.class);
        when(mockedMeasuredResults.getChosenValue()).thenReturn(interFreqMeasuredResultsList);
        final InterFreqMeasuredResults interFreqMeasuredResults = mock(InterFreqMeasuredResults.class);
        when(interFreqMeasuredResultsList.get(0)).thenReturn(interFreqMeasuredResults);
        final InterFreqCellMeasuredResultsList interFreqCellMeasuredResultsList = mock(InterFreqCellMeasuredResultsList.class);
        when(interFreqMeasuredResults.getInterFreqCellMeasuredResultsList()).thenReturn(
                interFreqCellMeasuredResultsList);

        when(interFreqCellMeasuredResultsList.get(0)).thenReturn(mockedCellMeasuredResultsList.get(0));

        final Asn1Message decodedAsn1Message = decodeAsn1();
        final int expectedBsic = DefaultValues.DEFAULT_INT_VALUE;
        checkResultWithSingleMeasurement(decodedAsn1Message, ecnoValue, rscpValue, EVENT_TYPE.INTER_FREQ, (short) -1,
                primaryScramblingCode, expectedBsic, 0, -1, true, false);

        decodeAndVerifyMeasurementType(EVENT_TYPE.INTER_FREQ);
    }

    @Test
    public void testDecodingTrafficVolume() {
        final EventResults mockedEventResults = mockInitialMethods();
        when(mockedEventResults.hasTrafficVolumeEventResults()).thenReturn(true);
        final TrafficVolumeEventResults trafficVolumeEventResults = mock(TrafficVolumeEventResults.class);
        when(mockedEventResults.getChosenValue()).thenReturn(trafficVolumeEventResults);
        final int ecnoValueToSet = 3;
        mockRACH(ecnoValueToSet);
        final Asn1Message decodedAsn1Message = decodeAsn1();
        final short expectedScramblingCode = DefaultValues.DEFAULT_SHORT_VALUE;
        final int expectedBsic = DefaultValues.DEFAULT_INT_VALUE;
        checkResultWithSingleMeasurement(decodedAsn1Message, ecnoValueToSet, Integer.MIN_VALUE,
                EVENT_TYPE.TRAFFIC_VOLUME, (short) -1, expectedScramblingCode, expectedBsic,
                DefaultAsn1AttributeValues.DEFAULT_MEAS_RESULTS_ORDER, -1, false, false);
    }

    @Test
    public void testDecodingTrafficVolumeMeasuredResultsOnRACAreNull() {
        final EventResults mockedEventResults = mockInitialMethods();
        when(mockedEventResults.hasTrafficVolumeEventResults()).thenReturn(true);
        final TrafficVolumeEventResults trafficVolumeEventResults = mock(TrafficVolumeEventResults.class);
        when(mockedEventResults.getChosenValue()).thenReturn(trafficVolumeEventResults);

        final Asn1Message decodedAsn1Message = decodeAsn1();
        final short expectedScramblingCode = DefaultValues.DEFAULT_SHORT_VALUE;
        final int expectedBsic = DefaultValues.DEFAULT_INT_VALUE;
        checkResultWithSingleMeasurement(decodedAsn1Message, Integer.MIN_VALUE, Integer.MIN_VALUE,
                EVENT_TYPE.TRAFFIC_VOLUME, (short) -1, expectedScramblingCode, expectedBsic,
                DefaultAsn1AttributeValues.DEFAULT_MEAS_RESULTS_ORDER, -1, false, false);
    }

    @Test
    public void testDecodingUEInternalEvent6B() {
        final EventResults mockedEventResults = mockInitialMethods();
        when(mockedEventResults.hasUe_InternalEventResults()).thenReturn(true);
        final UE_InternalEventResults ueInternalEventResults = mock(UE_InternalEventResults.class);
        when(mockedEventResults.getChosenValue()).thenReturn(ueInternalEventResults);
        when(ueInternalEventResults.hasEvent6b()).thenReturn(true);
        final int ecnoValueForEvent = 3;
        mockRACH(ecnoValueForEvent);

        final Asn1Message decodedAsn1Message = decodeAsn1();
        final short expectedScramblingCode = DefaultValues.DEFAULT_SHORT_VALUE;
        final int expectedBsic = DefaultValues.DEFAULT_INT_VALUE;
        checkResultWithSingleMeasurement(decodedAsn1Message, ecnoValueForEvent, Integer.MIN_VALUE,
                EVENT_TYPE.UE_INTERNAL, UE_INTERNAL_EVENT_RESULT_ID.EVENT6B.getId(), expectedScramblingCode,
                expectedBsic, DefaultAsn1AttributeValues.DEFAULT_MEAS_RESULTS_ORDER, -1, false, false);
    }

    private void mockRACH(final int ecnoValueToSet) {
        when(mockedMeasurementReport.getMeasuredResultsOnRACH()).thenReturn(measuredResultsOnRACH);
        final CurrentCell currentCell = mock(CurrentCell.class);
        when(measuredResultsOnRACH.getCurrentCell()).thenReturn(currentCell);
        final rrc.informationelements.MeasuredResultsOnRACH.CurrentCell.ModeSpecificInfo modeSpecificInfo = mock(rrc.informationelements.MeasuredResultsOnRACH.CurrentCell.ModeSpecificInfo.class);
        when(currentCell.getModeSpecificInfo()).thenReturn(modeSpecificInfo);
        when(modeSpecificInfo.hasFdd()).thenReturn(true);
        final MeasuredResultsOnRACH.CurrentCell.ModeSpecificInfo.Fdd fdd = mock(MeasuredResultsOnRACH.CurrentCell.ModeSpecificInfo.Fdd.class);
        when(modeSpecificInfo.getChosenValue()).thenReturn(fdd);
        final MeasurementQuantity measurementQuantity = mock(MeasurementQuantity.class);
        when(fdd.getMeasurementQuantity()).thenReturn(measurementQuantity);
        when(measurementQuantity.hasCpich_Ec_N0()).thenReturn(true);
        final INTEGER ecno = new INTEGER(ecnoValueToSet);
        when(measurementQuantity.getChosenValue()).thenReturn(ecno);
    }

    @Test
    public void testDecodingUEInternalEvent6BmeasuredResultsOnRACAreNull() {
        final EventResults mockedEventResults = mockInitialMethods();
        when(mockedEventResults.hasUe_InternalEventResults()).thenReturn(true);
        final UE_InternalEventResults ueInternalEventResults = mock(UE_InternalEventResults.class);
        when(mockedEventResults.getChosenValue()).thenReturn(ueInternalEventResults);
        when(ueInternalEventResults.hasEvent6b()).thenReturn(true);

        final Asn1Message decodedAsn1Message = decodeAsn1();
        final short expectedScramblingCode = DefaultValues.DEFAULT_SHORT_VALUE;
        final int expectedBsic = DefaultValues.DEFAULT_INT_VALUE;
        checkResultWithSingleMeasurement(decodedAsn1Message, Integer.MIN_VALUE, Integer.MIN_VALUE,
                EVENT_TYPE.UE_INTERNAL, UE_INTERNAL_EVENT_RESULT_ID.EVENT6B.getId(), expectedScramblingCode,
                expectedBsic, DefaultAsn1AttributeValues.DEFAULT_MEAS_RESULTS_ORDER, -1, false, false);
    }

    @Test
    public void testDecodingInterRat() {
        cellToReportListSize = 1;
        final int bsicValue = 4;
        final EventResults mockedEventResults = mockInitialMethods();
        when(mockedEventResults.hasInterRATEventResults()).thenReturn(true);
        final InterRATEventResults interRATEventResults = mock(InterRATEventResults.class);
        when(mockedEventResults.getChosenValue()).thenReturn(interRATEventResults);
        when(interRATEventResults.getEventID()).thenReturn(EventIDInterRAT.e3a);
        final CellToReportList cellToReportList = mock(CellToReportList.class);
        when(interRATEventResults.getCellToReportList()).thenReturn(cellToReportList);
        final CellToReport cellToReport = mock(CellToReport.class);
        when(cellToReportList.get(0)).thenReturn(cellToReport);
        final BSICReported bsicReported = mock(BSICReported.class);
        when(cellToReport.getBsicReported()).thenReturn(bsicReported);
        when(bsicReported.hasVerifiedBSIC()).thenReturn(true);
        final INTEGER bsic = new INTEGER(bsicValue);
        when(bsicReported.getChosenValue()).thenReturn(bsic);

        final Asn1Message decodedAsn1Message = decodeAsn1();
        final short expectedScramblingCode = DefaultValues.DEFAULT_SHORT_VALUE;
        checkResultWithSingleMeasurement(decodedAsn1Message, Integer.MIN_VALUE, Integer.MIN_VALUE,
                EVENT_TYPE.INTER_RAT, (short) 0, expectedScramblingCode, bsicValue, 0, 0, false, true);
    }

    @Test
    public void testDecodingInterFreq() {
        final short ecnoValue = 31;
        final short rscpValue = 51;
        final short primaryScramblingCode = 71;
        interFreqCellListSize = 1;
        interFreqMeasuredResultsListSize = 1;
        cellMeasurementEventResultsSize = 1;
        interFreqCellMeasuredResultsList = 1;

        final EventResults mockedEventResults = mockInitialMethods();
        when(mockedEventResults.hasInterFreqEventResults()).thenReturn(true);
        final InterFreqEventResults mockedInterFreqEventResults = mock(InterFreqEventResults.class);
        when(mockedEventResults.getChosenValue()).thenReturn(mockedInterFreqEventResults);
        when(mockedInterFreqEventResults.getEventID()).thenReturn(EventIDInterFreq.e2b);
        final InterFreqCellList mockedInterFreqCellList = mock(InterFreqCellList.class);
        when(mockedInterFreqEventResults.getInterFreqCellList()).thenReturn(mockedInterFreqCellList);
        final InterFreqCell interFreqCell = mock(InterFreqCell.class);
        when(mockedInterFreqCellList.get(0)).thenReturn(interFreqCell);

        setUpMeasurementResultMocks(primaryScramblingCode, rscpValue, ecnoValue);

        when(interFreqCell.getNonFreqRelatedEventResults()).thenReturn(mockedCellMeasurementEventResults);
        final MeasuredResults mockedMeasuredResults = mock(MeasuredResults.class);
        when(mockedMeasurementReport.getMeasuredResults()).thenReturn(mockedMeasuredResults);
        when(mockedMeasuredResults.hasInterFreqMeasuredResultsList()).thenReturn(true);
        final InterFreqMeasuredResultsList interFreqMeasuredResultsList = mock(InterFreqMeasuredResultsList.class);
        when(mockedMeasuredResults.getChosenValue()).thenReturn(interFreqMeasuredResultsList);
        final InterFreqMeasuredResults interFreqMeasuredResults = mock(InterFreqMeasuredResults.class);
        when(interFreqMeasuredResultsList.get(0)).thenReturn(interFreqMeasuredResults);
        final InterFreqCellMeasuredResultsList interFreqCellMeasuredResultsList = mock(InterFreqCellMeasuredResultsList.class);
        when(interFreqMeasuredResults.getInterFreqCellMeasuredResultsList()).thenReturn(
                interFreqCellMeasuredResultsList);

        when(interFreqCellMeasuredResultsList.get(0)).thenReturn(mockedCellMeasuredResultsList.get(0));

        final Asn1Message decodedAsn1Message = decodeAsn1();
        final int expectedBsic = DefaultValues.DEFAULT_INT_VALUE;
        checkResultWithSingleMeasurement(decodedAsn1Message, ecnoValue, rscpValue, EVENT_TYPE.INTER_FREQ,
                (short) EventIDInterFreq.e2b.longValue(), primaryScramblingCode, expectedBsic, 0, 0, true, true);
    }

    @Test
    public void testDecodingInterFreqEmptyList() {
        final EventResults mockedEventResults = mockInitialMethods();
        when(mockedEventResults.hasInterFreqEventResults()).thenReturn(true);
        final InterFreqEventResults mockedInterFreqEventResults = mock(InterFreqEventResults.class);
        when(mockedEventResults.getChosenValue()).thenReturn(mockedInterFreqEventResults);
        when(mockedInterFreqEventResults.getEventID()).thenReturn(EventIDInterFreq.e2c);

        final Asn1Message decodedAsn1Message = decodeAsn1();
        final short expectedScramblingCode = DefaultValues.DEFAULT_SHORT_VALUE;
        final int expectedBsic = DefaultValues.DEFAULT_INT_VALUE;
        checkResultWithSingleMeasurement(decodedAsn1Message, Integer.MIN_VALUE, Integer.MIN_VALUE,
                EVENT_TYPE.INTER_FREQ, (short) EventIDInterFreq.e2c.longValue(), expectedScramblingCode, expectedBsic,
                DefaultAsn1AttributeValues.DEFAULT_MEAS_RESULTS_ORDER, -1, false, false);
    }

}
