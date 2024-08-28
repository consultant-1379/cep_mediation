/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.loading.events;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.ericsson.cepmediation.apeventbeans.correlation.ASN1_MEASUREMENT;
import com.ericsson.cepmediation.apeventbeans.gpeh.RRC_MEASUREMENT_REPORT;
import com.ericsson.cepmediation.base.apeventbeans.ApEventBean;
import com.ericsson.cepmediation.base.apeventbeans.Asn1Message;
import com.ericsson.cepmediation.base.util.constants.EventIdConstants;
import com.ericsson.cepmediation.base.util.constants.MeasReportAttributes;
import com.ericsson.cepmediation.loading.asn1.ASN1MeasurementWrapper;

/**
 * 
 * 
 * @author eemecoy
 *
 */
public class Asn1MessageSplitter {

    /*
     *  Number that is added to each ASN1MeasurementWrapper ApEventBean generated.
     *  All the ASN1MeasurementWrapper ApEventBeans generated from the same RRC_MEASUREMENT_REPORT are assigned the same number.
     *  A different number is assigned for each RRC_MEASUREMENT_REPORT. The number will wrap around. 
     */
    private static int seq_number = 0;

    /**
     *  For each Asn1Message object RRC_MEASUREMENT_REPORT.getAsn1MessageList(), create a new ApEventBean
     *  
     *  @param rrcMeasurementReportEvent                the parent RRC_MEASUREMENT_REPORT
     *  @return  list of new events
     *   
     */
    public static List<Object> splitEvent(final ApEventBean rrcMeasurementReportEvent) {
        final List<Object> splitEvents = new ArrayList<Object>();
        final List<Asn1Message> asn1MessageList = rrcMeasurementReportEvent.getAsn1MessageList();
        if (asn1MessageList != null && asn1MessageList.size() > 0) {
            final RRC_MEASUREMENT_REPORT rrcMeasurementReport = (RRC_MEASUREMENT_REPORT) rrcMeasurementReportEvent;
            for (final Asn1Message asn1Message : asn1MessageList) {
                splitEvents.add(createApEventBeanFromAsn1Message(asn1Message, rrcMeasurementReport));
            }
        }
        seq_number++;
        return splitEvents;
    }

    private static ASN1MeasurementWrapper createApEventBeanFromAsn1Message(final Asn1Message asn1Message, final RRC_MEASUREMENT_REPORT parentRRCMeasurementReport) {
        final ASN1_MEASUREMENT rrcMeasurement = new ASN1_MEASUREMENT();
        final Map<String, String> messageAttributes = asn1Message.getMessageAttributes();
        rrcMeasurement.setSCRAMBLING_CODE(getScramblingCode(messageAttributes));
        rrcMeasurement.setTRIGGER_EVENT_ID(getTriggerEventID(messageAttributes));
        rrcMeasurement.setMEASUREMENT_TYPE(getMeasurementType(messageAttributes));
        rrcMeasurement.setBSIC(getBSIC(messageAttributes));
        rrcMeasurement.setRSCP(getRSCP(messageAttributes));
        rrcMeasurement.setECNO(getECNO(messageAttributes));
        rrcMeasurement.setMEAS_RESULTS_ORDER_NUMBER(getMeasResultsOrderNumber(messageAttributes));
        rrcMeasurement.setC_ID_1(parentRRCMeasurementReport.getC_ID_1());
        rrcMeasurement.setC_ID_2(parentRRCMeasurementReport.getC_ID_2());
        rrcMeasurement.setC_ID_3(parentRRCMeasurementReport.getC_ID_3());
        rrcMeasurement.setC_ID_4(parentRRCMeasurementReport.getC_ID_4());
        rrcMeasurement.setRNC_ID_1(parentRRCMeasurementReport.getRNC_ID_1());
        rrcMeasurement.setRNC_ID_2(parentRRCMeasurementReport.getRNC_ID_2());
        rrcMeasurement.setRNC_ID_3(parentRRCMeasurementReport.getRNC_ID_3());
        rrcMeasurement.setRNC_ID_4(parentRRCMeasurementReport.getRNC_ID_4());
        rrcMeasurement.setADDITIONAL_EVENT_ID(seq_number);
        rrcMeasurement.setMEAS_RESULTS_ORDER_NUMBER(getMEAS_RESULTS_ORDER_NUMBER(messageAttributes));
        rrcMeasurement.setEVENT_RESULTS_ORDER_NUMBER(getEVENT_RESULTS_ORDER_NUMBER(messageAttributes));
        rrcMeasurement.setVALID_MEAS_RESULTS(getVALID_MEAS_RESULTS(messageAttributes));
        rrcMeasurement.setVALID_EVENT_RESULTS(getVALID_EVENT_RESULTS(messageAttributes));
        final ASN1MeasurementWrapper wrapperEvent = new ASN1MeasurementWrapper(rrcMeasurement);
        wrapperEvent.setEventId(EventIdConstants.ASN1_MEASUREMENT);
        wrapperEvent.setUE_CONTEXT(parentRRCMeasurementReport.getUE_CONTEXT());
        wrapperEvent.setRNC_MODULE_ID(parentRRCMeasurementReport.getRNC_MODULE_ID());
        wrapperEvent.setTimestamp(parentRRCMeasurementReport.getTimestamp());
        return wrapperEvent;
    }

    private static  byte getMeasResultsOrderNumber(final Map<String, String> messageAttributes) {
        return (byte) getAttribute(messageAttributes, MeasReportAttributes.MEAS_RESULTS_ORDER_NUMBER);
    }

    private static  int getECNO(final Map<String, String> messageAttributes) {
        return getAttribute(messageAttributes, MeasReportAttributes.EC_NO);
    }

    final private static  int getRSCP(final Map<String, String> messageAttributes) {
        return getAttribute(messageAttributes, MeasReportAttributes.RSCP);
    }

    private static  int getBSIC(final Map<String, String> messageAttributes) {
        return getAttribute(messageAttributes, MeasReportAttributes.BSIC);
    }

    private static  byte getMeasurementType(final Map<String, String> messageAttributes) {
        return (byte) getAttribute(messageAttributes, MeasReportAttributes.MEASUREMENT_TYPE);
    }

    private static  short getTriggerEventID(final Map<String, String> messageAttributes) {
        return (short) getAttribute(messageAttributes, MeasReportAttributes.TRIGGER_EVENT_ID);
    }

    private static  short getScramblingCode(final Map<String, String> messageAttributes) {
        return (short) getAttribute(messageAttributes, MeasReportAttributes.SCRAMBLING_CODE);
    }

    private static  byte getMEAS_RESULTS_ORDER_NUMBER(final Map<String, String> messageAttributes) {
        return Byte.parseByte(messageAttributes.get(MeasReportAttributes.MEAS_RESULTS_ORDER_NUMBER));
    }

    private static  byte getEVENT_RESULTS_ORDER_NUMBER(final Map<String, String> messageAttributes) {
        return Byte.parseByte(messageAttributes.get(MeasReportAttributes.EVENT_RESULTS_ORDER_NUMBER));
    }

    private static  boolean getVALID_MEAS_RESULTS(final Map<String, String> messageAttributes) {
        return Boolean.parseBoolean(messageAttributes.get(MeasReportAttributes.VALID_MEAS_RESULTS));
    }

    private static  boolean getVALID_EVENT_RESULTS(final Map<String, String> messageAttributes) {
        return Boolean.parseBoolean(messageAttributes.get(MeasReportAttributes.VALID_EVENT_RESULTS));
    }

    private static int getAttribute(final Map<String, String> messageAttributes, final String attributeName) {
        final String stringValue = messageAttributes.get(attributeName);
        return Integer.parseInt(stringValue);
    }

}
