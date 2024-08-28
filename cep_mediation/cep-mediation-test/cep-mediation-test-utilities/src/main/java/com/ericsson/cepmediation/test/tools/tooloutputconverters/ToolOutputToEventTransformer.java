/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.test.tools.tooloutputconverters;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.ericsson.cepmediation.apeventbeans.gpeh.GpehBase;
import com.ericsson.cepmediation.base.apeventbeans.ApEventBean;
import com.ericsson.cepmediation.base.apeventbeans.Asn1Message;
import com.ericsson.cepmediation.base.util.FileUtils;
import com.ericsson.cepmediation.base.util.constants.MeasReportAttributes;
import com.ericsson.cepmediation.test.common.DateTimeUtilities;
import com.ericsson.cepmediation.test.common.GpehEventType;

/**
 * @author eemecoy
 *
 */
public class ToolOutputToEventTransformer {

    public List<ApEventBean> transformToolOutputToEvents(final String inputFile) throws Exception {
        final List<String> linesInFile = FileUtils.readFile(inputFile);
        return transformToEvents(linesInFile);
    }

    private List<ApEventBean> transformToEvents(final List<String> linesInFile) throws Exception {
        final List<ApEventBean> events = new ArrayList<ApEventBean>();
        for (final String line : linesInFile) {
            if (isEvent(line)) {
                final GpehBase event = transformToEvent(line);
                events.add(event);
            }
        }
        return events;
    }

    private GpehBase transformToEvent(final String line) throws Exception {
        final Map<String, List<String>> tokens = transformLineToMapOfValues(line);
        return transformToEvent(tokens);
    }

    private Map<String, List<String>> transformLineToMapOfValues(final String line) {
        final String strippedLine = ToolOutputUtils.stripHeaderInfoIfRequired(line);
        final String[] tokens = strippedLine.split("[,{}]");
        final Map<String, List<String>> eventAttributes = new HashMap<String, List<String>>();
        for (int i = 0; i < tokens.length; i++) {
            final String token = tokens[i];
            if (isEventTime(i)) {
                storeValueInMap(eventAttributes, "EVENT_TIME", token);
            } else if (isEventType(i)) {
                //ignore, its just a string               
            } else {
                if (token.length() > 0) {
                    final String[] values = token.split("=");
                    final String key = values[0].trim();
                    final String value = values[1];
                    storeValueInMap(eventAttributes, key, adjustValueIfRequired(key, value));
                }
            }
        }
        return eventAttributes;
    }

    private String adjustValueIfRequired(final String key, final String value) {
        if (key.equals("IMSI")) {
            final String imsi = stripLeadingZeroAndQuotes(value);
            // System.out.println(imsi);
            return imsi;
        }
        return value;
    }

    private String stripLeadingZeroAndQuotes(final String imsi) {
        return imsi.substring(2, imsi.length() - 1);
    }

    private void storeValueInMap(final Map<String, List<String>> eventAttributes, final String key, final String value) {
        List<String> list;
        if (eventAttributes.containsKey(key)) {
            list = eventAttributes.get(key);
        } else {
            list = new ArrayList<String>();

        }
        list.add(value);
        eventAttributes.put(key, list);
    }

    private boolean isEventType(final int i) {
        return i == 3;
    }

    private boolean isEventTime(final int i) {
        return i == 0;
    }

    private GpehBase transformToEvent(final Map<String, List<String>> eventAttributes) throws Exception {
        final GpehEventType eventType = getEventType(eventAttributes);
        final GpehBase event = EventCreatorForToolOutput.createEvent(eventType);
        setAttributes(eventAttributes, event, eventType);
        if (eventType == GpehEventType.RRC_MEASUREMENT_REPORT) {
            updateRRCMeasurementReport(eventAttributes, event);
        }
        return event;
    }

    private void setAttributes(final Map<String, List<String>> eventAttributes, final GpehBase event,
            final GpehEventType eventType) throws Exception {
        final Map<String, String> plainAttributes = getPlainAttributes(eventAttributes);
        for (final String attributeName : plainAttributes.keySet()) {
            final String attributeValue = plainAttributes.get(attributeName);
            setAttribute(attributeName, attributeValue, event, eventType);
        }
        event.setTimestamp(getEventTime(eventAttributes));
    }

    private void setAttribute(final String attributeName, final String attributeValue, final GpehBase event,
            final GpehEventType eventType) throws Exception {
        final Class<? extends ApEventBean> clazz = EventCreatorForToolOutput.getClazz(eventType);
        final String setterMethodName = "set" + attributeName;
        final Method setterMethod = findSetterMethod(setterMethodName, clazz);
        final Class<?>[] parameterTypes = setterMethod.getParameterTypes();
        final Object typedParameterValue = adjustParameterClass(parameterTypes, attributeValue);
        setterMethod.invoke(event, typedParameterValue);
    }

    private Object adjustParameterClass(final Class<?>[] parameterTypes, final String attributeValue) {
        final String parameterType = parameterTypes[0].getSimpleName();
        if (parameterType.equals("short")) {
            return Short.parseShort(attributeValue);
        }
        if (parameterType.equals("int")) {
            return Integer.parseInt(attributeValue);
        }
        if (parameterType.equals("byte")) {
            return Byte.parseByte(attributeValue);
        }
        if (parameterType.equals("String")) {
            return attributeValue;
        }
        throw new RuntimeException("No definition provided for class of type " + parameterType);
    }

    private Method findSetterMethod(final String setterMethodName, final Class<? extends ApEventBean> clazz) {
        final Method[] methods = clazz.getMethods();
        for (final Method method : methods) {
            final String methodName = method.getName();
            if (methodName.equals(setterMethodName)) {
                return method;
            }
        }
        throw new RuntimeException("Could not find method " + setterMethodName + " in class " + clazz);
    }

    private Map<String, String> getPlainAttributes(final Map<String, List<String>> eventAttributes) {
        final Collection<String> attributesToIgnore = getAttributesToIgnore();
        final Map<String, String> plainAttributes = new HashMap<String, String>();
        for (final String attributeName : eventAttributes.keySet()) {
            if (!attributesToIgnore.contains(attributeName)) {
                final String value = eventAttributes.get(attributeName).get(0);
                plainAttributes.put(attributeName, value);
            }
        }
        return plainAttributes;
    }

    private Collection<String> getAttributesToIgnore() {
        final Collection<String> attributesToIgnore = new ArrayList<String>();
        attributesToIgnore.add("EVENT_TIME");
        attributesToIgnore.add("SN");
        attributesToIgnore.add("VERSION");
        attributesToIgnore.add("NE");
        attributesToIgnore.add("MESSAGE_CONTENTS");
        attributesToIgnore.add(MeasReportAttributes.BSIC);
        attributesToIgnore.add(MeasReportAttributes.EC_NO);
        attributesToIgnore.add(MeasReportAttributes.RSCP);
        attributesToIgnore.add(MeasReportAttributes.TRIGGER_EVENT_ID);
        attributesToIgnore.add(MeasReportAttributes.MEASUREMENT_TYPE);
        attributesToIgnore.add(MeasReportAttributes.MEAS_RESULTS_ORDER_NUMBER);
        attributesToIgnore.add(MeasReportAttributes.SCRAMBLING_CODE);
        attributesToIgnore.add(MeasReportAttributes.EVENT_RESULTS_ORDER_NUMBER);
        attributesToIgnore.add(MeasReportAttributes.VALID_EVENT_RESULTS);
        attributesToIgnore.add(MeasReportAttributes.VALID_MEAS_RESULTS);
        return attributesToIgnore;
    }

    private GpehEventType getEventType(final Map<String, List<String>> eventAttributes) {
        final int eventId = Integer.parseInt(getSoleValue(eventAttributes, "EVENT_ID"));
        return GpehEventType.getEventType(eventId);
    }

    private String getSoleValue(final Map<String, List<String>> eventAttributes, final String key) {
        if (eventAttributes.containsKey(key)) {
            final List<String> values = eventAttributes.get(key);
            return values.get(0);
        }
        throw new RuntimeException("No values for key " + key);
    }

    private void updateRRCMeasurementReport(final Map<String, List<String>> eventAttributes, final GpehBase event) {
        final List<Asn1Message> asn1MessageList = initialiseAsn1Messages(eventAttributes);
        event.setAsn1MessageList(asn1MessageList);
    }

    private long getEventTime(final Map<String, List<String>> eventAttributes) {
        final String eventTime = getSoleValue(eventAttributes, "EVENT_TIME");
        return DateTimeUtilities.convertDateStringtoTimestamp(eventTime);
    }

    private List<Asn1Message> initialiseAsn1Messages(final Map<String, List<String>> eventAttributes) {
        final List<Asn1Message> list = new ArrayList<Asn1Message>();
        final int numberAsn1Messages = getNumberAsn1Messages(eventAttributes);
        for (int i = 0; i < numberAsn1Messages; i++) {
            final Asn1Message asn1Message = createAsn1Message(i, eventAttributes);
            list.add(asn1Message);
        }
        return list;
    }

    private Asn1Message createAsn1Message(final int i, final Map<String, List<String>> eventAttributes) {
        final Asn1Message asn1Message = new Asn1Message();
        final Map<String, String> messageAttributes = new HashMap<String, String>();
        setAttribute(i, eventAttributes, messageAttributes, MeasReportAttributes.MEASUREMENT_TYPE);
        setAttribute(i, eventAttributes, messageAttributes, MeasReportAttributes.RSCP);
        setAttribute(i, eventAttributes, messageAttributes, MeasReportAttributes.EC_NO);
        setAttribute(i, eventAttributes, messageAttributes, MeasReportAttributes.SCRAMBLING_CODE);
        setAttribute(i, eventAttributes, messageAttributes, MeasReportAttributes.TRIGGER_EVENT_ID);
        setAttribute(i, eventAttributes, messageAttributes, MeasReportAttributes.BSIC);
        setAttribute(i, eventAttributes, messageAttributes, MeasReportAttributes.MEAS_RESULTS_ORDER_NUMBER);
        asn1Message.setMessageAttributes(messageAttributes);
        return asn1Message;
    }

    private void setAttribute(final int i, final Map<String, List<String>> eventAttributes,
            final Map<String, String> messageAttributes, final String attributeName) {
        messageAttributes.put(attributeName, getAttributeValue(eventAttributes, i, attributeName));
    }

    private int getNumberAsn1Messages(final Map<String, List<String>> eventAttributes) {
        return eventAttributes.get(MeasReportAttributes.MEASUREMENT_TYPE).size();
    }

    private String getAttributeValue(final Map<String, List<String>> eventAttributes, final int index,
            final String attributeName) {
        if (eventAttributes.containsKey(attributeName)) {
            return eventAttributes.get(attributeName).get(index);
        }
        throw new RuntimeException("No values for attribute " + attributeName);
    }

    private boolean isEvent(final String line) {
        return line.contains("SN=");
    }

}
