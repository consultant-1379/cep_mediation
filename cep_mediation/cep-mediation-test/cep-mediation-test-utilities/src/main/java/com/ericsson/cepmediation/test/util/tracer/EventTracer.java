/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.test.util.tracer;

import java.lang.reflect.Method;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.cepmediation.apeventbeans.gpeh.GpehBase;
import com.ericsson.cepmediation.base.apeventbeans.ApEventBean;
import com.ericsson.cepmediation.base.apeventbeans.Asn1Message;
import com.ericsson.cepmediation.test.common.DateTimeUtilities;

/**
 * @author eemecoy
 *
 */
public class EventTracer {
    private static final Logger logger = LoggerFactory.getLogger(EventTracer.class);

    public static void traceApEventBean(final ApEventBean event) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Event ");
        stringBuilder.append(event);
        stringBuilder.append(" at ");
        stringBuilder.append(event.getTimestamp());
        stringBuilder.append(" (");
        stringBuilder.append(prettifyTimestamp(event));
        stringBuilder.append(")");
        stringBuilder.append(" with event id ");
        stringBuilder.append(event.getEventId());
        String imsi = getImsiIfPresent(event);
        stringBuilder.append(", imsi is " + imsi);
        final String eventTrace = stringBuilder.toString();
        System.out.print(eventTrace);
        logger.info(eventTrace);
        System.out.println();
    }

    public static void traceEvent(final GpehBase event) {
        final String eventTrace = getEventTrace(event);
        logger.info(eventTrace);
        System.out.print(eventTrace);
        System.out.println();
    }

    private static String getEventTrace(final GpehBase event) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Event ");
        stringBuilder.append(event);
        stringBuilder.append(" at ");
        stringBuilder.append(event.getTimestamp());
        stringBuilder.append(" (");
        stringBuilder.append(prettifyTimestamp(event));
        stringBuilder.append(") for ueContext ");
        stringBuilder.append(event.getUE_CONTEXT());
        stringBuilder.append(" and rncModuleId ");
        stringBuilder.append(event.getRNC_MODULE_ID());
        stringBuilder.append(" and C_ID_1 ");
        stringBuilder.append(event.getC_ID_1());
        stringBuilder.append(" and C_ID_2 ");
        stringBuilder.append(event.getC_ID_2());
        stringBuilder.append(" and RNC_ID_1 ");
        stringBuilder.append(event.getRNC_ID_1());
        String imsi = getImsiIfPresent(event);
        stringBuilder.append(", imsi is " + imsi);
        return stringBuilder.toString();
    }

    private static String prettifyTimestamp(final ApEventBean event) {
        final long timestamp = event.getTimestamp();
        return DateTimeUtilities.convertTimeStampToDateString(timestamp);
    }

    private static String getImsiIfPresent(final ApEventBean event) {
        final Class<? extends ApEventBean> clazz = event.getClass();
        try {
            final Method imsiGetterMethod = clazz.getMethod("getIMSI");
            final Object imsi = imsiGetterMethod.invoke(event);
            return (String) imsi;

        } catch (final NoSuchMethodException e) {
            //do nothing
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return "imsi not in event";
    }

    public static void traceAsn1Message(final Asn1Message asn1Message) {
        final StringBuilder trace = new StringBuilder();
        trace.append("Asn1Message: ");
        trace.append(asn1Message.getMessageAttributes());
        System.out.println(trace.toString());
    }
}
