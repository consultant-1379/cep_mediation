/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.loading.asn1;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;

import rrc.class_definitions.UL_DCCH_Message;
import rrc.class_definitions.UL_DCCH_MessageType;
import rrc.informationelements.CPICH_Ec_N0;
import rrc.informationelements.CPICH_RSCP;
import rrc.informationelements.CellMeasuredResults;
import rrc.informationelements.CellMeasuredResults.ModeSpecificInfo;
import rrc.informationelements.CellMeasurementEventResults;
import rrc.informationelements.CellToReportList;
import rrc.informationelements.EventResults;
import rrc.informationelements.InterFreqCellList;
import rrc.informationelements.InterFreqCellMeasuredResultsList;
import rrc.informationelements.InterFreqMeasuredResultsList;
import rrc.informationelements.IntraFreqMeasuredResultsList;
import rrc.informationelements.MeasuredResults;
import rrc.informationelements.PrimaryCPICH_Info;
import rrc.informationelements.PrimaryScramblingCode;
import rrc.pdu_definitions.MeasurementReport;

import com.ericsson.cepmediation.base.apeventbeans.ApEventBean;
import com.ericsson.cepmediation.base.apeventbeans.Asn1Message;
import com.ericsson.cepmediation.base.meta.schema.Event;
import com.ericsson.cepmediation.base.util.constants.EventIdConstants;
import com.ericsson.cepmediation.base.util.constants.MeasReportAttributes;
import com.oss.asn1.SequenceOf;

/**
 * @author eemecoy
 *
 */
public class BaseAsn1DecoderMock {

    protected CellMeasurementEventResults mockedCellMeasurementEventResults;

    protected List<CellMeasuredResults> mockedCellMeasuredResultsList;

    UL_DCCH_MessageType mockedMessageType;

    protected MeasurementReport mockedMeasurementReport;

    protected Asn1Decoder asn1Decoder;

    RRCCoder mockedRRCCoder;

    int interFreqCellListSize;

    int cellMeasurementEventResultsSize;

    int interFreqMeasuredResultsListSize;

    int intraFreqMeasuredResultsListSize;

    int interFreqCellMeasuredResultsList;

    int cellToReportListSize;

    @Before
    public void setupBase() {
        resetListSizes();
        mockedRRCCoder = mock(RRCCoder.class);
        mockedCellMeasuredResultsList = new ArrayList<CellMeasuredResults>();
        mockedMessageType = mock(UL_DCCH_MessageType.class);
        when(mockedMessageType.hasMeasurementReport()).thenReturn(true);
        asn1Decoder = new StubbedAsn1Decoder();
    }

    private void resetListSizes() {
        interFreqCellListSize = 0;
        cellMeasurementEventResultsSize = 0;
        interFreqMeasuredResultsListSize = 0;
        intraFreqMeasuredResultsListSize = 0;
    }

    protected EventResults mockInitialMethods() {
        mockedMeasurementReport = mock(MeasurementReport.class);
        when(mockedMessageType.getChosenValue()).thenReturn(mockedMeasurementReport);
        final EventResults mockedEventResults = mock(EventResults.class);
        when(mockedMeasurementReport.getEventResults()).thenReturn(mockedEventResults);
        return mockedEventResults;
    }

    protected void setUpMeasurementResultMocks(final short scramblingCode, final short rscpValueForEvent,
            final short ecnoValueForEvent) {
        mockedCellMeasurementEventResults = mock(CellMeasurementEventResults.class);
        when(mockedCellMeasurementEventResults.hasFdd()).thenReturn(true);
        final CellMeasurementEventResults.Fdd mockedFdd = mock(CellMeasurementEventResults.Fdd.class);
        when(mockedCellMeasurementEventResults.getChosenValue()).thenReturn(mockedFdd);
        final PrimaryCPICH_Info mockedPrimaryCpichInfo = mock(PrimaryCPICH_Info.class);
        when(mockedFdd.get(0)).thenReturn(mockedPrimaryCpichInfo);
        final PrimaryScramblingCode mockedPrimaryScramblingCode = new PrimaryScramblingCode(scramblingCode);
        when(mockedPrimaryCpichInfo.getPrimaryScramblingCode()).thenReturn(mockedPrimaryScramblingCode);
        final rrc.informationelements.CellMeasuredResults.ModeSpecificInfo.Fdd fdd = mock(rrc.informationelements.CellMeasuredResults.ModeSpecificInfo.Fdd.class);
        when(fdd.getPrimaryCPICH_Info()).thenReturn(mockedPrimaryCpichInfo);
        when(fdd.hasCpich_Ec_N0()).thenReturn(true);
        when(fdd.hasCpich_RSCP()).thenReturn(true);
        CellMeasuredResults mockedCellMeasuredResults = mock(CellMeasuredResults.class);
        mockedCellMeasuredResultsList.add(mockedCellMeasuredResults);
        final ModeSpecificInfo modeSpecificInfo = mock(ModeSpecificInfo.class);
        when(mockedCellMeasuredResults.getModeSpecificInfo()).thenReturn(modeSpecificInfo);
        when(modeSpecificInfo.getChosenValue()).thenReturn(fdd);
        when(fdd.getCpich_RSCP()).thenReturn(new CPICH_RSCP(rscpValueForEvent));
        when(fdd.getCpich_Ec_N0()).thenReturn(new CPICH_Ec_N0(ecnoValueForEvent));
    }

    protected void checkResultWithSingleMeasurement(final Asn1Message asn1Message, final int expectedEcnoValue,
            final int expectedRscpValue, final EVENT_TYPE eventType, final short expectedTriggerEventId,
            final short expectedScramblingCode, final int expectedBsic, final int expectedMeasResultsOrderNumber,
            int expectedEventResultsOrderNumber, boolean expectedValidMeasResults, boolean expectedValidEventResults) {
        Asn1TestUtilities.checkResultWithSingleMeasurement(asn1Message, expectedEcnoValue, expectedRscpValue,
                eventType, expectedTriggerEventId, expectedScramblingCode, expectedBsic,
                expectedMeasResultsOrderNumber, expectedEventResultsOrderNumber, expectedValidMeasResults,
                expectedValidEventResults);

    }

    protected int getAttributeValueFromAsn1Message(final String attributeName, final Asn1Message asn1Message) {
        return Asn1TestUtilities.getAttributeValueFromAsn1Message(attributeName, asn1Message.getMessageAttributes());
    }

    Asn1Message decodeAsn1() {
        List<Asn1Message> asn1MessageList = getAsn1MessageList();
        assertNotNull("Asn1MessageList should not be null", asn1MessageList);
        assertThat("Expected one message, but there was " + asn1MessageList.size(), asn1MessageList.size(), is(1));
        return asn1MessageList.get(0);
    }

    List<Asn1Message> getAsn1MessageList() {
        final ApEventBean apEventBean = new StubbedApEventBean();
        asn1Decoder.decodeAsn1(apEventBean);
        List<Asn1Message> asn1MessageList = apEventBean.getAsn1MessageList();
        return asn1MessageList;
    }

    protected MeasuredResults setUpMocksForNoEventResultBlockInMessage() {
        mockedMeasurementReport = mock(MeasurementReport.class);
        when(mockedMessageType.getChosenValue()).thenReturn(mockedMeasurementReport);
        when(mockedMeasurementReport.getEventResults()).thenReturn(null);
        MeasuredResults mockedMeasuredResults = mock(MeasuredResults.class);
        when(mockedMeasurementReport.getMeasuredResults()).thenReturn(mockedMeasuredResults);
        return mockedMeasuredResults;
    }

    protected void decodeAndVerifyMeasurementType(EVENT_TYPE expectedEventType) {
        Asn1Message decodedAsn1Mesage = decodeAsn1();
        int measurementType = getAttributeValueFromAsn1Message(MeasReportAttributes.MEASUREMENT_TYPE, decodedAsn1Mesage);
        assertThat(measurementType, is(expectedEventType.getId()));
    }
    
    class StubbedAsn1Decoder extends Asn1Decoder {
    	@Override
        RRCCoder createRRCCoder() {
            return mockedRRCCoder;
        }
    	
    	@Override
    	RrcMeasurementReportAsn1Decoder createRrcMeasurementReportAsn1Decoder(RRCCoder coder) {
            return new StubbedRrcMeasurementReportAsn1Decoder(coder);
        }
    	
    }

    class StubbedRrcMeasurementReportAsn1Decoder extends RrcMeasurementReportAsn1Decoder {

        public StubbedRrcMeasurementReportAsn1Decoder(RRCCoder rrcCoderValue) {
			super(rrcCoderValue);
			// TODO Auto-generated constructor stub
		}

		@Override
        protected UL_DCCH_MessageType getUL_DCCH_MessageType(final UL_DCCH_Message message) {
            return mockedMessageType;
        }

        @Override
        protected int getSize(final SequenceOf sequence) {
            if (sequence == null) {
                return 0;
            }
            System.out.println("In getSize with " + sequence.getClass());
            if (sequence instanceof InterFreqCellList) {
                return interFreqCellListSize;
            }
            if (sequence instanceof CellMeasurementEventResults.Fdd) {
                return cellMeasurementEventResultsSize;
            }
            if (sequence instanceof InterFreqMeasuredResultsList) {
                return interFreqMeasuredResultsListSize;
            }
            if (sequence instanceof IntraFreqMeasuredResultsList) {
                return intraFreqMeasuredResultsListSize;
            }
            if (sequence instanceof InterFreqCellMeasuredResultsList) {
                return interFreqCellMeasuredResultsList;
            }
            if (sequence instanceof CellToReportList) {
                return cellToReportListSize;
            }
            throw new RuntimeException("No size defined for " + sequence.getClass());
        }

    }

    class StubbedApEventBean extends ApEventBean {

        @Override
        public String getAbsoluteName() {

            return null;
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

            return null;
        }
        
        @Override
        public int getEventId() {
            return EventIdConstants.RRC_MEASUREMENT_REPORT;
        }

    }
}
