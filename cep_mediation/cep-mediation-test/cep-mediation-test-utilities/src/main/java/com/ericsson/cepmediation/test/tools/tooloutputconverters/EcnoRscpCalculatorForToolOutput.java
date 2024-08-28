/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.test.tools.tooloutputconverters;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.ericsson.cepmediation.apeventbeans.gpeh.RRC_MEASUREMENT_REPORT;
import com.ericsson.cepmediation.base.apeventbeans.ApEventBean;
import com.ericsson.cepmediation.base.apeventbeans.Asn1Message;
import com.ericsson.cepmediation.base.util.constants.MeasReportAttributes;
import com.ericsson.cepmediation.test.common.DateTimeUtilities;
import com.ericsson.cepmediation.test.tools.calculators.AverageEcnoRscpCalculator;
import com.ericsson.cepmediation.test.tools.calculators.CoverageSignalCalculator;
import com.ericsson.cepmediation.test.tools.calculators.RRCMeasurementEcnoRscp;
import com.ericsson.cepmediation.test.topology.CellScramblingCodeDetails;
import com.ericsson.cepmediation.test.topology.ServingCellsForTest;

/**
 * @author eemecoy
 *
 */
public class EcnoRscpCalculatorForToolOutput {

    private Collection<ApEventBean> events;

    private final Set<Short> rncIds = new HashSet<Short>();

    private final Set<Integer> cellIds = new HashSet<Integer>();

    private final String inputFile = "C:\\Users\\eemecoy\\Documents\\CEA\\bugs\\bugs in new rc epl\\454063302963615 for first five minutes.txt";

    private void setup() throws Exception {
        events = new ToolOutputToEventTransformer().transformToolOutputToEvents(inputFile);
        setupServingCells();
    }

    public void calculateFigures() throws Exception {
        final List<RRC_MEASUREMENT_REPORT> eventsToConsider = pullOutRRCMeasurementReportEvents();
        System.out.println("RRC_MEAS_REP_SAMPLES should be " + eventsToConsider.size());
        printNumberOfAsn1Messages(eventsToConsider);
        System.out.println("RNCs: " + rncIds);
        System.out.println("Cells: " + cellIds);
        System.out.println(eventsToConsider.size());
        final List<RRCMeasurementEcnoRscp> rrcMeasurements = transform(eventsToConsider);
        System.out.println("GG: " + CoverageSignalCalculator.getExpectedGG(rrcMeasurements));
        System.out.println("GB: " + CoverageSignalCalculator.getExpectedGB(rrcMeasurements));
        System.out.println("BG: " + CoverageSignalCalculator.getExpectedBG(rrcMeasurements));
        System.out.println("BB: " + CoverageSignalCalculator.getExpectedBB(rrcMeasurements));
        System.out.println("Average ecno: " + AverageEcnoRscpCalculator.getExpectedEcnoAvgFromListOfMeasurements(rrcMeasurements));
        System.out.println("Average rscp: " + AverageEcnoRscpCalculator.getExpectedRscpAvgFromListOfMeasurements(rrcMeasurements));
    }

    private void printNumberOfAsn1Messages(final List<RRC_MEASUREMENT_REPORT> eventsToConsider) {
        int totalAsn1MessageCount = 0;
        int numberAsn1MessagesWithValidRscpOrEcno = 0;
        int numberAsn1MessagesWithValidRscpOrEcnoAndInServingCell = 0;
        for (final RRC_MEASUREMENT_REPORT event : eventsToConsider) {
            final String eventTime = getEventTime(event);
            final List<Asn1Message> asn1MessageList = event.getAsn1MessageList();
            for (final Asn1Message asn1Message : asn1MessageList) {
                totalAsn1MessageCount++;
                if (rscpOrEcnoPresent(asn1Message)) {
                    numberAsn1MessagesWithValidRscpOrEcno++;
                    if (isForServingCell(event, asn1Message)) {
                        System.out.println(eventTime);
                        numberAsn1MessagesWithValidRscpOrEcnoAndInServingCell++;
                        printTypeOfMeasurement(asn1Message);
                    }
                }
            }
        }
        System.out.println("Number of asn1Messages in total: " + totalAsn1MessageCount);
        System.out.println("Number of asn1Messages with valid rscp/ecno: " + numberAsn1MessagesWithValidRscpOrEcno);
        System.out.println("Number of asn1Messages with valid rscp/ecno and in serving cell " + numberAsn1MessagesWithValidRscpOrEcnoAndInServingCell);
    }

    private void printTypeOfMeasurement(final Asn1Message asn1Message) {
        CoverageSignalCalculator.getType(asn1Message);
    }

    private boolean isForServingCell(final RRC_MEASUREMENT_REPORT event, final Asn1Message asn1Message) {
        final short rnc_ID_1 = event.getRNC_ID_1();
        final int c_ID_1 = event.getC_ID_1();
        final int scramblingCode = getAttribute(asn1Message, MeasReportAttributes.SCRAMBLING_CODE);
        rncIds.add(rnc_ID_1);
        cellIds.add(c_ID_1);
        return isForServingCell(rnc_ID_1, c_ID_1, scramblingCode);
    }

    private String getEventTime(final RRC_MEASUREMENT_REPORT event) {
        final long timestamp = event.getTimestamp();
        return DateTimeUtilities.convertTimeStampToDateString(timestamp);
    }

    private boolean rscpOrEcnoPresent(final Asn1Message asn1Message) {
        final int ecno = getAttribute(asn1Message, MeasReportAttributes.EC_NO);
        final int rscp = getAttribute(asn1Message, MeasReportAttributes.RSCP);
        return ecno > Integer.MIN_VALUE || rscp > Integer.MIN_VALUE;
    }

    private List<RRC_MEASUREMENT_REPORT> pullOutRRCMeasurementReportEvents() {
        final List<RRC_MEASUREMENT_REPORT> eventsToConsider = new ArrayList<RRC_MEASUREMENT_REPORT>();
        for (final ApEventBean event : events) {
            if (event != null) {
                if (event instanceof RRC_MEASUREMENT_REPORT) {
                    final RRC_MEASUREMENT_REPORT rrcMeasurementReport = (RRC_MEASUREMENT_REPORT) event;
                    eventsToConsider.add(rrcMeasurementReport);
                }
            }
        }
        return eventsToConsider;
    }

    private List<RRCMeasurementEcnoRscp> transform(final List<RRC_MEASUREMENT_REPORT> eventsToConsider) {
        final List<RRCMeasurementEcnoRscp> list = new ArrayList<RRCMeasurementEcnoRscp>();
        for (final RRC_MEASUREMENT_REPORT event : eventsToConsider) {
            final List<Asn1Message> asn1MessageList = event.getAsn1MessageList();
            for (final Asn1Message asn1Message : asn1MessageList) {
                final RRCMeasurementEcnoRscp values = new RRCMeasurementEcnoRscp();
                values.setEcno(getEcno(asn1Message));
                values.setRscp(getRscp(asn1Message));
                values.setForServingCell(getIsServingCell(asn1Message, event));
                list.add(values);
            }
        }
        return list;
    }

    private void setupServingCells() {
        final CellScramblingCodeDetails cellScramblingCodeDetails1 = new CellScramblingCodeDetails();
        cellScramblingCodeDetails1.setRnc(9);
        cellScramblingCodeDetails1.setCell(20406);
        cellScramblingCodeDetails1.setScramblingCode(109);

        ServingCellsForTest.addCellScramblingCode(cellScramblingCodeDetails1);

    }

    private boolean getIsServingCell(final Asn1Message asn1Message, final RRC_MEASUREMENT_REPORT parentEvent) {
        final int scramblingCode = getAttribute(asn1Message, MeasReportAttributes.SCRAMBLING_CODE);
        return isForServingCell(parentEvent.getRNC_ID_1(), parentEvent.getC_ID_1(), scramblingCode);
    }

    private boolean isForServingCell(final short rnc_ID_1, final int c_ID_1, final int scramblingCode) {
        return ServingCellsForTest.isForServingCell(rnc_ID_1, c_ID_1, scramblingCode);
    }

    private int getRscp(final Asn1Message asn1Message) {
        return getAttribute(asn1Message, MeasReportAttributes.RSCP);
    }

    private int getEcno(final Asn1Message asn1Message) {
        return getAttribute(asn1Message, MeasReportAttributes.EC_NO);
    }

    private int getAttribute(final Asn1Message asn1Message, final String attributeName) {
        final String value = asn1Message.getMessageAttributes().get(attributeName);
        return Integer.parseInt(value);
    }

    public static void main(final String[] args) throws Exception {
        final EcnoRscpCalculatorForToolOutput calculator = new EcnoRscpCalculatorForToolOutput();
        calculator.setup();
        calculator.calculateFigures();
    }

}
