/*------------------------------------------------------------------------------
 *******************************************************************************
 * COPYRIGHT Ericsson 2015
 *
 * The copyright to the computer program(s) herein is the property of
 * Ericsson Inc. The programs may be used and/or copied only with written
 * permission from Ericsson Inc. or in accordance with the terms and
 * conditions stipulated in the agreement/contract under which the
 * program(s) have been supplied.
 *******************************************************************************
 *----------------------------------------------------------------------------*/
package com.ericsson.cepmediation.test.util.tracer;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import com.ericsson.cepmediation.apeventbeans.correlation.GPEH_SESSION;
import com.ericsson.cepmediation.test.common.DateTimeUtilities;

/**
 * @author eemecoy
 * 
 */
public class SessionTracer {

    private static List<String> attributesToIgnore = new ArrayList<String>();

    private static SessionAttributeFilter sessionAttributeFilter = new SessionAttributeFilter();

    public static void traceSession(final GPEH_SESSION session) {
        System.out.println(getSessionTrace(session));
    }

    public static String getSessionTrace(final GPEH_SESSION session) {
        final StringBuilder trace = new StringBuilder();
        trace.append("GPEH Session: ");
        trace.append(convertToDateTime(session.getTimestamp()));
        trace.append(", DATETIME_ID " + session.getDATETIME_ID());
        trace.append(", IMSI " + session.getIMSI());
        traceSessionAttributes(session, trace);
        return trace.toString();

    }

    private static void traceSessionAttributes(final GPEH_SESSION session,
            final StringBuilder trace) {
        Method[] methods = session.getClass().getMethods();
        for (Method method : methods) {
            if (isAGetterMethod(method)) {
                if (isNotAlreadyTraced(method, trace)
                        && wantToTraceThisAttribute(method)) {
                    trace.append(getAttributeTrace(method, session));
                }
            }
        }
    }

    private static boolean wantToTraceThisAttribute(Method method) {
        String attributeName = getAttributeNameFromGetterMethod(method);
        return isNotAnAttibuteThatShouldAlwaysBeIgnored(method)
                && userFilterContainsAttribute(attributeName);
    }

    private static boolean userFilterContainsAttribute(String attributeName) {
        if (sessionAttributeFilter.userWantsAttributesFiltered()) {
            return sessionAttributeFilter
                    .filterContainsAttribute(attributeName);

        }
        return true;
    }

    private static boolean isNotAnAttibuteThatShouldAlwaysBeIgnored(
            Method method) {
        return !attributesToIgnore
                .contains(getAttributeNameFromGetterMethod(method));
    }

    private static String getAttributeTrace(Method getterMethod,
            GPEH_SESSION session) {
        StringBuilder attributeTrace = new StringBuilder();
        String attributeName = getAttributeNameFromGetterMethod(getterMethod);
        attributeTrace.append(", " + attributeName + " ");
        try {
            Object attributeValue = getterMethod.invoke(session);
            attributeTrace.append(stringify(attributeValue, attributeName));
            return attributeTrace.toString();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    private static Object stringify(Object attributeValue, String attributeName) {
        if (isATimestampAttribute(attributeName)) {
            long timestamp = (Long) attributeValue;
            return DateTimeUtilities.convertTimeStampToDateString(timestamp);
        }
        return attributeValue;
    }

    private static boolean isATimestampAttribute(String attributeName) {
        return attributeName.contains("TIME");
    }

    private static String getAttributeNameFromGetterMethod(Method method) {
        String methodName = method.getName();
        return methodName.substring(3, methodName.length());
    }

    private static boolean isNotAlreadyTraced(Method method, StringBuilder trace) {
        String methodName = getAttributeNameFromGetterMethod(method);
        return !trace.toString().contains(methodName);
    }

    private static boolean isAGetterMethod(Method method) {
        return method.getName().contains("get");
    }

    private static String convertToDateTime(final long timestamp) {
        return DateTimeUtilities.convertTimeStampToDateString(timestamp);
    }

    public static void traceSessions(List<GPEH_SESSION> sessions) {
        System.out.println("Tracing sessions:");
        for (GPEH_SESSION session : sessions) {
            traceSession(session);
        }

    }

    public static void main(String[] args) {
        GPEH_SESSION session = new GPEH_SESSION();
        traceSession(session);
    }

    static {
        attributesToIgnore.add("AbsoluteName");
        attributesToIgnore.add("Asn1Data");
        attributesToIgnore.add("CSVString");
        attributesToIgnore.add("CSVStringQuoted");
        attributesToIgnore.add("DecodedString");
        attributesToIgnore.add("DecodedAsn1String");
        attributesToIgnore.add("Asn1MessageList");
        attributesToIgnore.add("Class");
        attributesToIgnore.add("Name");
        attributesToIgnore.add("SessionId");
        attributesToIgnore.add("Ne");
        attributesToIgnore.add("SubNetwork");
        attributesToIgnore.add("RopId");
        attributesToIgnore.add("Version");
        attributesToIgnore.add("Data");

    }

}
