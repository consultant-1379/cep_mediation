/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.correlation.radio.utils;

import static com.ericsson.cepmediation.test.common.TestConstants.*;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.ericsson.cepmediation.apeventbeans.gpeh.GpehBase;
import com.ericsson.cepmediation.apeventbeans.gpeh.INTERNAL_CHANNEL_SWITCHING;
import com.ericsson.cepmediation.apeventbeans.gpeh.INTERNAL_IMSI;
import com.ericsson.cepmediation.apeventbeans.gpeh.INTERNAL_RAB_ESTABLISHMENT;
import com.ericsson.cepmediation.apeventbeans.gpeh.INTERNAL_RAB_RELEASE;
import com.ericsson.cepmediation.apeventbeans.gpeh.INTERNAL_SYSTEM_RELEASE;
import com.ericsson.cepmediation.apeventbeans.gpeh.INTERNAL_SYSTEM_UTILIZATION;
import com.ericsson.cepmediation.apeventbeans.gpeh.RRC_MEASUREMENT_REPORT;
import com.ericsson.cepmediation.base.apeventbeans.Asn1Message;
import com.ericsson.cepmediation.base.util.constants.MeasReportAttributes;
import com.ericsson.cepmediation.test.common.GpehEventType;
import com.ericsson.cepmediation.test.eventcreation.EventRandomizer;
import com.ericsson.cepmediation.test.eventcreation.Randomizer;

/**
 * @author eemecoy
 *
 */
public class EventCreator {

    private static interface KEYS {
        static final String RADIO_SESSION = "RadioSesion";

        static final short NUMBER_OF_RNC = 1;

        static final int NUMBER_OF_CELL_IN_A_RNC = 1;

        static final byte NUMBER_OF_RNC_MODULE_ID = 1;

        static final short NUMBER_OF_UE_CONTEXT = 1;
    }

    private static final String PACKAGE_NAME = "com.ericsson.cepmediation.apeventbeans.gpeh";

    public static GpehBase createEvent(final GpehEventType gpehEventType) {
        try {
            final Class<? extends GpehBase> clazz = getClazz(gpehEventType);
            //constructor for the class
            final Constructor<? extends GpehBase> constructor = clazz.getDeclaredConstructor();
            GpehBase newInstance;
            newInstance = constructor.newInstance();
            newInstance.setEventId(gpehEventType.getId());
            return newInstance;
        } catch (final Exception e) {
            throw new RuntimeException(e);
        }

    }

    public static Class<? extends GpehBase> getClazz(final GpehEventType gpehEventType) throws Exception {
        final String className = PACKAGE_NAME + "." + gpehEventType.toString();
        return (Class<? extends GpehBase>) Class.forName(className);
    }

    public static INTERNAL_SYSTEM_RELEASE createSystemReleaseEventsWithParams(final int cellId, final long timestamp, final short rncId,
            final byte rncModuleId, final short ueContext, final short sourceConf, final short targetConf) {
        final INTERNAL_SYSTEM_RELEASE gpehEvent = (INTERNAL_SYSTEM_RELEASE) createRadioEventsWithParams(GpehEventType.INTERNAL_SYSTEM_RELEASE, cellId,
                timestamp, rncId, rncModuleId, ueContext);
        gpehEvent.setSOURCE_CONF(sourceConf);
        gpehEvent.setTARGET_CONF(targetConf);
        return gpehEvent;
    }

    public static INTERNAL_RAB_RELEASE createRabReleaseEventsWithParams(final int cellId, final long timestamp, final short rncId, final byte rncModuleId,
            final short ueContext, final short sourceConf, final short targetConf) {
        final INTERNAL_RAB_RELEASE gpehEvent = (INTERNAL_RAB_RELEASE) createRadioEventsWithParams(GpehEventType.INTERNAL_RAB_RELEASE, cellId, timestamp, rncId,
                rncModuleId, ueContext);
        gpehEvent.setSOURCE_CONF(sourceConf);
        gpehEvent.setTARGET_CONF(targetConf);
        return gpehEvent;
    }

    public static GpehBase createRandomRadioEvent() {
        final Randomizer randomizer = new Randomizer(KEYS.NUMBER_OF_RNC, KEYS.NUMBER_OF_CELL_IN_A_RNC, KEYS.NUMBER_OF_RNC_MODULE_ID, KEYS.NUMBER_OF_UE_CONTEXT);
        final GpehEventType randomEventType = new EventRandomizer().randomEventType();
        final GpehBase gpehEvent = getRadioEvent(randomEventType);
        setParameters(gpehEvent, randomizer.getRandomCellId(), randomizer.getRandomRnc(), randomizer.getRandomRncMdouleId(), randomizer.getRandomUeContext());
        return gpehEvent;
    }

    public static GpehBase createRadioEventsWithParams(final GpehEventType radioEventId, final int cellId, final long timestamp, final short rncId,
            final int rncModuleId, final short ueContext) {
        final GpehBase gpehEvent = getRadioEvent(radioEventId);
        setParameters(gpehEvent, cellId, rncId, rncModuleId, ueContext);
        gpehEvent.setTimestamp(timestamp);
        return gpehEvent;
    }

    public static GpehBase createRadioEventsWithParams(final GpehEventType radioEventId, final int cellId, final short rncId, final byte rncModuleId,
            final short ueContext) {
        final GpehBase gpehEvent = getRadioEvent(radioEventId);
        setParameters(gpehEvent, cellId, rncId, rncModuleId, ueContext);
        gpehEvent.setTimestamp(getTimestamp());
        return gpehEvent;
    }

    private static long getTimestamp() {
        return System.currentTimeMillis();
    }

    public static GpehBase createImsiEventsWithParams(final int cellId, final long timestamp, final short rncId, final int rncModuleId, final short ueContext,
            final long imsi) {
        return createImsiEventsWithParams(cellId, timestamp, rncId, rncModuleId, ueContext, Long.toString(imsi));
    }

    public static GpehBase createImsiEventsWithParams(final int cellId, final long timestamp, final short rncId, final int rncModuleId, final short ueContext,
            final String imsi) {
        final GpehBase gpehEvent = createRadioEventsWithParams(GpehEventType.INTERNAL_IMSI, cellId, timestamp, rncId, rncModuleId, ueContext);
        ((INTERNAL_IMSI) gpehEvent).setIMSI(imsi);
        return gpehEvent;
    }

    public static INTERNAL_RAB_ESTABLISHMENT createRabEventsWithParams(final int cellId, final long timestamp, final short rncId, final int rncModuleId,
            final short ueContext, final short sourceConf, final short targetConf) {
        final INTERNAL_RAB_ESTABLISHMENT gpehEvent = (INTERNAL_RAB_ESTABLISHMENT) createRadioEventsWithParams(GpehEventType.INTERNAL_RAB_ESTABLISHMENT, cellId,
                timestamp, rncId, rncModuleId, ueContext);
        gpehEvent.setSOURCE_CONF(sourceConf);
        gpehEvent.setTARGET_CONF(targetConf);
        final byte hsCat = 1;
        final byte eulCat = 2;
        gpehEvent.setHS_DSCH_PHYSICAL_LAYER_CATEGORY(hsCat);
        gpehEvent.setE_DCH_PHYSICAL_LAYER_CATEGORY(eulCat);
        return gpehEvent;
    }

    public static INTERNAL_SYSTEM_UTILIZATION createInterSysUtilEventsWithParams(final int cellId, final long timestamp, final short rncId,
            final byte rncModuleId, final short hsUsers, final short ulInterference, final short dlNonHsPower, final byte cmUsers) {
        final short ueContext = -1;
        final INTERNAL_SYSTEM_UTILIZATION gpehEvent = (INTERNAL_SYSTEM_UTILIZATION) createRadioEventsWithParams(GpehEventType.INTERNAL_SYSTEM_UTILIZATION,
                cellId, timestamp, rncId, rncModuleId, ueContext);
        gpehEvent.setNUMBER_OF_USERS_ASSIGNED_TO_PHYS_HS_CHAN(hsUsers);
        gpehEvent.setUL_INTERFERENCE(ulInterference);
        gpehEvent.setDL_NON_HS_TX_POWER(dlNonHsPower);
        gpehEvent.setNO_OF_CM_USERS(cmUsers);
        return gpehEvent;
    }

    public static INTERNAL_CHANNEL_SWITCHING createChannelSwitchEventsWithParams(final int cellId, final long timestamp, final short rncId,
            final byte rncModuleId, final short ueContext, final byte reason) {
        final INTERNAL_CHANNEL_SWITCHING gpehEvent = (INTERNAL_CHANNEL_SWITCHING) createRadioEventsWithParams(GpehEventType.INTERNAL_CHANNEL_SWITCHING, cellId,
                timestamp, rncId, rncModuleId, ueContext);
        gpehEvent.setCHANNEL_SWITCH_REASON(reason);
        return gpehEvent;
    }

    public static INTERNAL_CHANNEL_SWITCHING createChannelSwitchEventsWithParamsConf(final int cellId, final long timestamp, final byte rncModuleId,
            final short ueContext, final short sourceConf, final short targetConf) {
        final short rncId = 1;
        final INTERNAL_CHANNEL_SWITCHING gpehEvent = (INTERNAL_CHANNEL_SWITCHING) createRadioEventsWithParams(GpehEventType.INTERNAL_CHANNEL_SWITCHING, cellId,
                timestamp, rncId, rncModuleId, ueContext);
        gpehEvent.setSOURCE_CONF(sourceConf);
        gpehEvent.setTARGET_CONF(targetConf);
        return gpehEvent;
    }

    private static GpehBase setParameters(final GpehBase gpehEvent, final int cellId, final short rncId, final int rncModuleId, final short ueContext) {
        gpehEvent.setC_ID_1(cellId);
        gpehEvent.setRNC_ID_1(rncId);
        gpehEvent.setRNC_MODULE_ID(rncModuleId);
        gpehEvent.setUE_CONTEXT(ueContext);
        return gpehEvent;
    }

    private static GpehBase getRadioEvent(final GpehEventType gpehEventType) {
        GpehBase event = null;
        switch (gpehEventType) {
        case INTERNAL_IMSI:
            event = Randomizer.getAnImsi();
            event.setEventId(GpehEventType.INTERNAL_IMSI.getId());
            break;
        case RRC_MEASUREMENT_REPORT:
            event = createRRCMeasurementReportEvent();
            break;
        default:
            return EventCreator.createEvent(gpehEventType);

        }
        return event;
    }

    public static RRC_MEASUREMENT_REPORT createRRCMeasurementReportEvent() {
        final RRC_MEASUREMENT_REPORT event = (RRC_MEASUREMENT_REPORT) EventCreator.createEvent(GpehEventType.RRC_MEASUREMENT_REPORT);
        final List<Asn1Message> asn1MessageList = new ArrayList<Asn1Message>();
        for (int i = 0; i < 3; i++) {
            asn1MessageList.add(createAsn1Message());
        }
        event.setAsn1MessageList(asn1MessageList);
        return event;
    }

    private static Asn1Message createAsn1Message() {
        final Asn1Message asn1Message = new Asn1Message();
        asn1Message.setMessageName("asn1Message");
        final Map<String, String> messageAttributes = createMessageAttributes();
        asn1Message.setMessageAttributes(messageAttributes);
        return asn1Message;
    }

    private static Map<String, String> createMessageAttributes() {
        final Map<String, String> messageAttributes = new HashMap<String, String>();
        messageAttributes.put(MeasReportAttributes.EC_NO, Integer.toString(TEST_ECNO));
        messageAttributes.put(MeasReportAttributes.RSCP, Integer.toString(TEST_RSCP));
        messageAttributes.put(MeasReportAttributes.TRIGGER_EVENT_ID, Short.toString(TEST_TRIGGER_EVENT_ID));
        messageAttributes.put(MeasReportAttributes.MEASUREMENT_TYPE, Byte.toString(TEST_MEASUREMENT_TYPE));
        messageAttributes.put(MeasReportAttributes.BSIC, Integer.toString(TEST_BSIC));
        messageAttributes.put(MeasReportAttributes.MEAS_RESULTS_ORDER_NUMBER, Byte.toString(TEST_ORDER));
        messageAttributes.put(MeasReportAttributes.EVENT_RESULTS_ORDER_NUMBER, Byte.toString(TEST_ORDER));
        messageAttributes.put(MeasReportAttributes.VALID_EVENT_RESULTS, "true");
        messageAttributes.put(MeasReportAttributes.VALID_MEAS_RESULTS, "true");
        messageAttributes.put(MeasReportAttributes.SCRAMBLING_CODE, Short.toString(TEST_SCRAMBLING_CODE));
        messageAttributes.put(MeasReportAttributes.EVENT_RESULTS_ORDER_NUMBER, Byte.toString((byte) 0));
        return messageAttributes;
    }

    public static RRC_MEASUREMENT_REPORT createRRCMeasurementReportEvent(final long timestamp) {
        final RRC_MEASUREMENT_REPORT rrcMeasurementReportEvent = createRRCMeasurementReportEvent();
        rrcMeasurementReportEvent.setTimestamp(timestamp);
        return rrcMeasurementReportEvent;
    }

}
