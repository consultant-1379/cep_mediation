/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.loading.asn1;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.List;

import org.junit.Test;

import rrc.informationelements.CPICH_Ec_N0;
import rrc.informationelements.CPICH_RSCP;
import rrc.informationelements.CellMeasuredResults;
import rrc.informationelements.CellMeasuredResults.ModeSpecificInfo;
import rrc.informationelements.CellMeasurementEventResults;
import rrc.informationelements.EventIDIntraFreq;
import rrc.informationelements.EventResults;
import rrc.informationelements.IntraFreqEventResults;
import rrc.informationelements.IntraFreqMeasuredResultsList;
import rrc.informationelements.MeasuredResults;
import rrc.informationelements.PrimaryCPICH_Info;
import rrc.informationelements.PrimaryScramblingCode;
import rrc.pdu_definitions.MeasurementReport;

import com.ericsson.cepmediation.base.apeventbeans.ApEventBean;
import com.ericsson.cepmediation.base.apeventbeans.Asn1Message;
import com.ericsson.cepmediation.base.apeventbeans.DefaultValues;
import com.ericsson.cepmediation.base.util.constants.MeasReportAttributes;

/**
 * @author eemecoy
 *
 */
public class Asn1DecoderIntraFreqTest extends BaseAsn1DecoderMock {

    @Test
    public void checkScramblingCodesInEventResultsButHaveNoMeasurementsAreReported() {
        final short scramblingCodeWithMeasurement = 2;
        final short ecno = 23;
        final short rscp = 45;

        final short scrmablingCodeWithoutMeasurement = 3;
        final short[] scramblingCodes = new short[] { scramblingCodeWithMeasurement, scrmablingCodeWithoutMeasurement };
        intraFreqMeasuredResultsListSize = 1;
        cellMeasurementEventResultsSize = scramblingCodes.length;
        final EventResults mockedEventResults = mockInitialMethods();
        when(mockedEventResults.hasIntraFreqEventResults()).thenReturn(true);
        final IntraFreqEventResults mockedIntraFreqEventResults = mock(IntraFreqEventResults.class);
        final EventIDIntraFreq eventId = EventIDIntraFreq.e1j;
        when(mockedIntraFreqEventResults.getEventID()).thenReturn(eventId);
        when(mockedEventResults.getChosenValue()).thenReturn(mockedIntraFreqEventResults);

        final CellMeasurementEventResults mockedCellMeasurementEventResultsWithTwoScramblingCodes = setUpCellMeasurementEventResults(scramblingCodes);
        when(mockedIntraFreqEventResults.getCellMeasurementEventResults()).thenReturn(
                mockedCellMeasurementEventResultsWithTwoScramblingCodes);

        final MeasuredResults mockedMeasuredResults = mock(MeasuredResults.class);
        when(mockedMeasurementReport.getMeasuredResults()).thenReturn(mockedMeasuredResults);
        when(mockedMeasuredResults.hasIntraFreqMeasuredResultsList()).thenReturn(true);
        final IntraFreqMeasuredResultsList mockedIntraFreqMeasuredResultsList = mock(IntraFreqMeasuredResultsList.class);
        final IntraFreqMeasuredResultsList mockedCellMeasuredResultsListWithOneEntry = setUpMeasurementsList(
                scramblingCodeWithMeasurement, rscp, ecno);
        when(mockedIntraFreqMeasuredResultsList.get(0)).thenReturn(mockedCellMeasuredResultsListWithOneEntry.get(0));
        when(mockedMeasuredResults.getChosenValue()).thenReturn(mockedIntraFreqMeasuredResultsList);
        final List<Asn1Message> asn1MessageList = getAsn1MessageList();
        assertThat(asn1MessageList.size(), is(2));
        final Asn1Message asn1MessageForCellWithMeasurements = getAsn1MessageForScramblingCode(
                scramblingCodeWithMeasurement, asn1MessageList);
        checkResultWithSingleMeasurement(asn1MessageForCellWithMeasurements, ecno, rscp, EVENT_TYPE.INTRA_FREQ,
                (short) eventId.longValue(), scramblingCodeWithMeasurement, DefaultValues.DEFAULT_INT_VALUE, 0, 0,
                true, true);
        final Asn1Message asn1MessageForCellWithNoMeasurements = getAsn1MessageForScramblingCode(
                scrmablingCodeWithoutMeasurement, asn1MessageList);
        checkResultWithSingleMeasurement(asn1MessageForCellWithNoMeasurements, DefaultValues.DEFAULT_INT_VALUE,
                DefaultValues.DEFAULT_INT_VALUE, EVENT_TYPE.INTRA_FREQ, (short) eventId.longValue(),
                scrmablingCodeWithoutMeasurement, DefaultValues.DEFAULT_INT_VALUE, -1, 1, false, true);

    }

    private Asn1Message getAsn1MessageForScramblingCode(final short scramblingCodeToSearchFor,
            final List<Asn1Message> asn1MessageList) {
        return Asn1TestUtilities.getAsn1MessageForScramblingCode(scramblingCodeToSearchFor, asn1MessageList);
    }

    private IntraFreqMeasuredResultsList setUpMeasurementsList(final short scramblingCode, final short rscp,
            final short ecno) {
        final PrimaryCPICH_Info mockedPrimaryCpichInfo = mock(PrimaryCPICH_Info.class);
        final PrimaryScramblingCode mockedPrimaryScramblingCode = new PrimaryScramblingCode(scramblingCode);
        when(mockedPrimaryCpichInfo.getPrimaryScramblingCode()).thenReturn(mockedPrimaryScramblingCode);
        final rrc.informationelements.CellMeasuredResults.ModeSpecificInfo.Fdd fdd = mock(rrc.informationelements.CellMeasuredResults.ModeSpecificInfo.Fdd.class);
        when(fdd.getPrimaryCPICH_Info()).thenReturn(mockedPrimaryCpichInfo);
        when(fdd.hasCpich_Ec_N0()).thenReturn(true);
        when(fdd.hasCpich_RSCP()).thenReturn(true);
        final CellMeasuredResults mockedCellMeasuredResults = mock(CellMeasuredResults.class);
        final ModeSpecificInfo modeSpecificInfo = mock(ModeSpecificInfo.class);
        when(mockedCellMeasuredResults.getModeSpecificInfo()).thenReturn(modeSpecificInfo);
        when(modeSpecificInfo.getChosenValue()).thenReturn(fdd);
        when(fdd.getCpich_RSCP()).thenReturn(new CPICH_RSCP(rscp));
        when(fdd.getCpich_Ec_N0()).thenReturn(new CPICH_Ec_N0(ecno));

        final IntraFreqMeasuredResultsList measuredResultsList = new IntraFreqMeasuredResultsList(
                new CellMeasuredResults[] { mockedCellMeasuredResults });
        return measuredResultsList;
    }

    private CellMeasurementEventResults setUpCellMeasurementEventResults(final short... scramblingCodes) {
        final CellMeasurementEventResults mock = mock(CellMeasurementEventResults.class);
        when(mock.hasFdd()).thenReturn(true);
        final CellMeasurementEventResults.Fdd mockedFdd = mock(CellMeasurementEventResults.Fdd.class);
        when(mock.getChosenValue()).thenReturn(mockedFdd);
        for (int i = 0; i < scramblingCodes.length; i++) {
            final PrimaryCPICH_Info mockedPrimaryCpichInfo = mock(PrimaryCPICH_Info.class);
            when(mockedFdd.get(i)).thenReturn(mockedPrimaryCpichInfo);
            final PrimaryScramblingCode mockedPrimaryScramblingCode = new PrimaryScramblingCode(scramblingCodes[i]);
            when(mockedPrimaryCpichInfo.getPrimaryScramblingCode()).thenReturn(mockedPrimaryScramblingCode);
            when(mockedFdd.get(i)).thenReturn(mockedPrimaryCpichInfo);
        }

        return mock;
    }

    @Test
    public void testDecodingWhenNoEventsResultsBlock_IntraFreq() {
        final short ecnoValue = 31;
        final short rscpValue = 51;
        final short primaryScramblingCode = 71;
        intraFreqMeasuredResultsListSize = 1;
        cellMeasurementEventResultsSize = 1;
        mockedMeasurementReport = mock(MeasurementReport.class);
        when(mockedMessageType.getChosenValue()).thenReturn(mockedMeasurementReport);
        when(mockedMeasurementReport.getEventResults()).thenReturn(null);

        final IntraFreqEventResults mockedIntraFreqEventResults = mock(IntraFreqEventResults.class);
        when(mockedIntraFreqEventResults.getEventID()).thenReturn(EventIDIntraFreq.e1j);

        setUpMeasurementResultMocks(primaryScramblingCode, rscpValue, ecnoValue);

        when(mockedIntraFreqEventResults.getCellMeasurementEventResults())
                .thenReturn(mockedCellMeasurementEventResults);

        final MeasuredResults mockedMeasuredResults = mock(MeasuredResults.class);
        when(mockedMeasurementReport.getMeasuredResults()).thenReturn(mockedMeasuredResults);
        when(mockedMeasuredResults.hasIntraFreqMeasuredResultsList()).thenReturn(true);
        final IntraFreqMeasuredResultsList mockedIntraFreqMeasuredResultsList = mock(IntraFreqMeasuredResultsList.class);
        when(mockedIntraFreqMeasuredResultsList.get(0)).thenReturn(mockedCellMeasuredResultsList.get(0));
        when(mockedMeasuredResults.getChosenValue()).thenReturn(mockedIntraFreqMeasuredResultsList);
        final Asn1Message decodedAsn1Message = decodeAsn1();
        final int expectedBsic = DefaultValues.DEFAULT_INT_VALUE;
        checkResultWithSingleMeasurement(decodedAsn1Message, ecnoValue, rscpValue, EVENT_TYPE.INTRA_FREQ, (short) -1,
                primaryScramblingCode, expectedBsic, 0, -1, true, false);
    }

    @Test
    public void checkOrderNumberWithMultipleIntraFreqMessages() {
        final EventResults mockedEventResults = mockInitialMethods();
        when(mockedEventResults.hasIntraFreqEventResults()).thenReturn(true);
        final IntraFreqEventResults mockedIntraFreqEventResults = mock(IntraFreqEventResults.class);
        when(mockedIntraFreqEventResults.getEventID()).thenReturn(EventIDIntraFreq.e1j);
        when(mockedEventResults.getChosenValue()).thenReturn(mockedIntraFreqEventResults);

        final int numberMeasurements = 2;
        setUpMeasurementResultMocksForMultipleMeasurements(numberMeasurements);
        intraFreqMeasuredResultsListSize = numberMeasurements;
        cellMeasurementEventResultsSize = numberMeasurements;

        when(mockedIntraFreqEventResults.getCellMeasurementEventResults())
                .thenReturn(mockedCellMeasurementEventResults);

        final MeasuredResults mockedMeasuredResults = mock(MeasuredResults.class);
        when(mockedMeasurementReport.getMeasuredResults()).thenReturn(mockedMeasuredResults);
        when(mockedMeasuredResults.hasIntraFreqMeasuredResultsList()).thenReturn(true);
        final IntraFreqMeasuredResultsList mockedIntraFreqMeasuredResultsList = mock(IntraFreqMeasuredResultsList.class);
        for (int i = 0; i < numberMeasurements; i++) {
            when(mockedIntraFreqMeasuredResultsList.get(i)).thenReturn(mockedCellMeasuredResultsList.get(i));
        }
        when(mockedMeasuredResults.getChosenValue()).thenReturn(mockedIntraFreqMeasuredResultsList);

        final ApEventBean apEventBean = new StubbedApEventBean();
        asn1Decoder.decodeAsn1(apEventBean);
        final List<Asn1Message> asn1MessageList = apEventBean.getAsn1MessageList();
        assertThat(asn1MessageList.size(), is(2));
        assertThat(
                getAttributeValueFromAsn1Message(MeasReportAttributes.MEAS_RESULTS_ORDER_NUMBER, asn1MessageList.get(0)),
                is(0));
        assertThat(
                getAttributeValueFromAsn1Message(MeasReportAttributes.MEAS_RESULTS_ORDER_NUMBER, asn1MessageList.get(1)),
                is(1));

    }

    private void setUpMeasurementResultMocksForMultipleMeasurements(final int numberMeasurements) {
        mockedCellMeasurementEventResults = mock(CellMeasurementEventResults.class);
        when(mockedCellMeasurementEventResults.hasFdd()).thenReturn(true);
        final CellMeasurementEventResults.Fdd mockedFdd = mock(CellMeasurementEventResults.Fdd.class);
        when(mockedCellMeasurementEventResults.getChosenValue()).thenReturn(mockedFdd);
        final PrimaryCPICH_Info mockedPrimaryCpichInfo = mock(PrimaryCPICH_Info.class);
        for (int i = 0; i < numberMeasurements; i++) {
            when(mockedFdd.get(i)).thenReturn(mockedPrimaryCpichInfo);
            final PrimaryScramblingCode mockedPrimaryScramblingCode = new PrimaryScramblingCode(0);
            when(mockedPrimaryCpichInfo.getPrimaryScramblingCode()).thenReturn(mockedPrimaryScramblingCode);
            final rrc.informationelements.CellMeasuredResults.ModeSpecificInfo.Fdd fdd = mock(rrc.informationelements.CellMeasuredResults.ModeSpecificInfo.Fdd.class);
            when(fdd.getPrimaryCPICH_Info()).thenReturn(mockedPrimaryCpichInfo);
            when(fdd.hasCpich_Ec_N0()).thenReturn(true);
            when(fdd.hasCpich_RSCP()).thenReturn(true);
            final CellMeasuredResults mockedCellMeasuredResults = mock(CellMeasuredResults.class);
            final ModeSpecificInfo modeSpecificInfo = mock(ModeSpecificInfo.class);
            when(mockedCellMeasuredResults.getModeSpecificInfo()).thenReturn(modeSpecificInfo);
            when(modeSpecificInfo.getChosenValue()).thenReturn(fdd);
            when(fdd.getCpich_RSCP()).thenReturn(new CPICH_RSCP(0));
            when(fdd.getCpich_Ec_N0()).thenReturn(new CPICH_Ec_N0(0));
            mockedCellMeasuredResultsList.add(mockedCellMeasuredResults);
        }
    }

    @Test
    public void testDecodingIntraFreq() {
        final short ecnoValue = 31;
        final short rscpValue = 51;
        final short primaryScramblingCode = 71;
        intraFreqMeasuredResultsListSize = 1;
        cellMeasurementEventResultsSize = 1;
        final EventResults mockedEventResults = mockInitialMethods();
        when(mockedEventResults.hasIntraFreqEventResults()).thenReturn(true);
        final IntraFreqEventResults mockedIntraFreqEventResults = mock(IntraFreqEventResults.class);
        when(mockedIntraFreqEventResults.getEventID()).thenReturn(EventIDIntraFreq.e1j);
        when(mockedEventResults.getChosenValue()).thenReturn(mockedIntraFreqEventResults);

        setUpMeasurementResultMocks(primaryScramblingCode, rscpValue, ecnoValue);

        when(mockedIntraFreqEventResults.getCellMeasurementEventResults())
                .thenReturn(mockedCellMeasurementEventResults);

        final MeasuredResults mockedMeasuredResults = mock(MeasuredResults.class);
        when(mockedMeasurementReport.getMeasuredResults()).thenReturn(mockedMeasuredResults);
        when(mockedMeasuredResults.hasIntraFreqMeasuredResultsList()).thenReturn(true);
        final IntraFreqMeasuredResultsList mockedIntraFreqMeasuredResultsList = mock(IntraFreqMeasuredResultsList.class);
        when(mockedIntraFreqMeasuredResultsList.get(0)).thenReturn(mockedCellMeasuredResultsList.get(0));
        when(mockedMeasuredResults.getChosenValue()).thenReturn(mockedIntraFreqMeasuredResultsList);
        final Asn1Message decodedAsn1Message = decodeAsn1();
        final int expectedBsic = DefaultValues.DEFAULT_INT_VALUE;
        checkResultWithSingleMeasurement(decodedAsn1Message, ecnoValue, rscpValue, EVENT_TYPE.INTRA_FREQ,
                (short) EventIDIntraFreq.e1j.longValue(), primaryScramblingCode, expectedBsic, 0, 0, true, true);
    }

}
