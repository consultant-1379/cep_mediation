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
package com.ericsson.cepmediation.correlation.support;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Method;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.cepmediation.apeventbeans.correlation.EE_RRC_MEASUREMENT;
import com.ericsson.cepmediation.apeventbeans.correlation.NET_TG_SERVICE_REQUEST_CORR;
import com.ericsson.cepmediation.apeventbeans.correlation.S1_HANDOVER;
import com.ericsson.cepmediation.apeventbeans.correlation.SERVICE_REQUEST_CORR;
import com.ericsson.cepmediation.apeventbeans.correlation.X2_HANDOVER;
import com.ericsson.cepmediation.apeventbeans.ebm.RAU;
import com.ericsson.cepmediation.apeventbeans.gpeh.INTERNAL_CALL_REESTABLISHMENT;
import com.ericsson.cepmediation.apeventbeans.gpeh.INTERNAL_CHANNEL_SWITCHING;
import com.ericsson.cepmediation.apeventbeans.gpeh.INTERNAL_CMODE_ACTIVATE;
import com.ericsson.cepmediation.apeventbeans.gpeh.INTERNAL_CMODE_DEACTIVATE;
import com.ericsson.cepmediation.apeventbeans.gpeh.INTERNAL_FAILED_HSDSCH_CELL_CHANGE;
import com.ericsson.cepmediation.apeventbeans.gpeh.INTERNAL_HSDSCH_CELL_SELECTION_NO_CELL_SELECTED;
import com.ericsson.cepmediation.apeventbeans.gpeh.INTERNAL_IFHO_EXECUTION_ACTIVE;
import com.ericsson.cepmediation.apeventbeans.gpeh.INTERNAL_IMSI;
import com.ericsson.cepmediation.apeventbeans.gpeh.INTERNAL_OUT_HARD_HANDOVER_FAILURE;
import com.ericsson.cepmediation.apeventbeans.gpeh.INTERNAL_RAB_ESTABLISHMENT;
import com.ericsson.cepmediation.apeventbeans.gpeh.INTERNAL_NORMAL_RELEASE;
import com.ericsson.cepmediation.apeventbeans.gpeh.INTERNAL_RAB_RELEASE;
import com.ericsson.cepmediation.apeventbeans.gpeh.INTERNAL_SOFT_HANDOVER_EXECUTION;
import com.ericsson.cepmediation.apeventbeans.gpeh.INTERNAL_SUCCESSFUL_HSDSCH_CELL_CHANGE;
import com.ericsson.cepmediation.apeventbeans.gpeh.INTERNAL_SYSTEM_RELEASE;
import com.ericsson.cepmediation.apeventbeans.gpeh.INTERNAL_SYSTEM_UTILIZATION;
import com.ericsson.cepmediation.apeventbeans.gpeh.RRC_MEASUREMENT_REPORT;
import com.ericsson.cepmediation.base.apeventbeans.ApEventBean;
import com.ericsson.cepmediation.base.apeventbeans.DefaultValues;
import com.ericsson.cepmediation.base.database.entity.RabCombination;
import com.ericsson.cepmediation.base.licensing.CannotAccessLicensingServiceException;
import com.ericsson.cepmediation.base.licensing.LicensingService;
import com.ericsson.cepmediation.base.properties.ConfigBinder;
import com.ericsson.cepmediation.base.util.Pair;
import com.ericsson.cepmediation.config.bean.FeaturesEnum;
import com.ericsson.cepmediation.correlation.enrichment.InternalGpehSession;
import com.ericsson.cepmediation.correlation.lookup.impl.DefaultLookupService;

public class Util {
    private static final String TXT = ".txt";

    private static final String FILE_PATH = "/opt/ericsson/cep-mediation/cep-mediation/etc/rnc-config/";

    private static final int ONE_MINUTE = 60 * 1000;

    // Get the logger
    private static final Logger logger = LoggerFactory.getLogger(Util.class);

    public static final byte[] NULL_IP_ADDRESS = new byte[16];

    private static final char DEFAULT_COLLECTION_SEPARATOR = '|';

    /**
     * This method checks Session Browser license and enabled/disabled status in
     * config.xml
     * 
     * @return boolean
     */
    public static boolean isSBEnabled() {
        try {
            List<FeaturesEnum> enabledFeatures = ConfigBinder.getInstance()
                    .getEnabledFeatures();
            return LicensingService.getInstance().hasSessionBrowserLicense()
                    && enabledFeatures.contains(FeaturesEnum.SESSION_BROWSER);
        } catch (CannotAccessLicensingServiceException e) {
            logger.warn("Error accessing licensing service", e);
            return false;
        } catch (Exception e) {
            logger.error("Error accessing licensing service", e);
            return false;
        }
    }

    /**
     * Converts IP address into 16-bytes binary array. Convention is based on
     * what we have already in Sybase IQ.
     */
    public static byte[] getIpv4Address(final String ipv4Address) {
        try {
            if (ipv4Address != null && ipv4Address.length() > 0) {
                final String[] parts = ipv4Address.split("\\.");
                if (parts.length == 4) {
                    final int one = Integer.valueOf(parts[0]);
                    final int two = Integer.valueOf(parts[1]);
                    final int three = Integer.valueOf(parts[2]);
                    final int four = Integer.valueOf(parts[3]);
                    final byte[] result = new byte[16];
                    result[0] = (byte) one;
                    result[1] = (byte) two;
                    result[2] = (byte) three;
                    result[3] = (byte) four;
                    return result;
                }
            }
            return null;
        } catch (final Exception e) {
            logger.warn("Exception while parsing IP address", e);
            return null;
        }
    }

    // esper does not recognize hash(String... s)
    public static int hash(String s1, String s2, String s3, String s4,
            String s5, String s6, String s7) {
        String key = s1 + s2 + s3 + s4 + s5 + s6 + s7;
        return key.hashCode();
    }

    public static long transformImeisv(final String imeisv) {
        try {
            if (imeisv != null && imeisv.length() > 0) {
                return Long.valueOf(imeisv);
            }
            return -1;
        } catch (final Exception e) {
            return -1;
        }
    }

    public static boolean isRoaming(final String imsiMcc, final String imsiMnc) {
        return DefaultLookupService.getInstance().isRoaming(imsiMcc, imsiMnc);
    }

    public static boolean isInHfaWhitelist(final int eventId,
            short exceptionClass, short causeValue, short subCauseValue) {
        return DefaultLookupService.getInstance().isInHfaWhitelist(eventId,
                exceptionClass, causeValue, subCauseValue);
    }

    public static boolean isInHfaWhitelist(final int eventId, byte causeValue,
            byte subCauseValue) {
        return DefaultLookupService.getInstance().isInHfaWhitelist(eventId,
                DefaultValues.DEFAULT_SHORT_VALUE, causeValue, subCauseValue);
    }

    public static boolean isInHfaWhitelist(final int eventId, byte causeValue) {
        return DefaultLookupService.getInstance().isInHfaWhitelist(eventId,
                DefaultValues.DEFAULT_SHORT_VALUE, causeValue,
                DefaultValues.DEFAULT_SHORT_VALUE);
    }

    public static boolean isInCfaWhitelist(final int eventId,
            byte rabDisconnectionCode, byte rabDisconnectionSubCode) {
        return DefaultLookupService.getInstance().isInCfaWhitelist(eventId,
                rabDisconnectionCode, rabDisconnectionSubCode);
    }

    public static boolean isRoaming(final Long imsi) {
        String imsiMcc = getMcc(imsi);
        String imsiMnc = getMnc(imsi);
        return isRoaming(imsiMcc, imsiMnc);
    }

    // MY STUFF
    public static boolean addEvent(final InternalGpehSession window,
            final ApEventBean event) {
        window.addEvent(event);
        return true;
    }

    public static boolean isHsdpaBearer(final short bearerId) {
        return DefaultLookupService.getInstance().isHsdpaBearer(bearerId);
    }

    public static boolean isPsRab(final int bearerId) {
        return DefaultLookupService.getInstance().isPacketSwitchedRAB(bearerId);
    }

    public static boolean containsPsRab(final int bearerId) {
        return DefaultLookupService.getInstance().getPsCount(bearerId) > 0;
    }

    public static boolean isCsRabOnly(final short rab) {
        return DefaultLookupService.getInstance().isCsRabOnly(rab);
    }

    public static short getNumPsRabsEstablished(final short oldRab,
            final short newRab) {
        final int diff = DefaultLookupService.getInstance().getPsCount(newRab)
                - DefaultLookupService.getInstance().getPsCount(oldRab);
        return diff > 0 ? (short) diff : 0;
    }

    public static byte getNumPsRabsDropped(final short oldRab,
            final short newRab) {
        final int diff = DefaultLookupService.getInstance().getPsCount(oldRab)
                - DefaultLookupService.getInstance().getPsCount(newRab);
        return diff > 0 ? (byte) diff : 0;
    }

    public static byte getNumPsRabsFailed(final short currentRab,
            final short failedRab) {
        // Same logic as for rab establishment
        Short result = getNumPsRabsEstablished(currentRab, failedRab);
        return result.byteValue();
    }

    public static short getPsCount(final short oldRab, final short newRab,
            final short currVal) {
        final short diff = getNumPsRabsEstablished(oldRab, newRab);
        return diff > 0 ? (short) (currVal + diff) : currVal;
    }

    public static short getNumCsRabsEstablished(final short oldRab,
            final short newRab) {
        final int diff = DefaultLookupService.getInstance().getCsCount(newRab)
                - DefaultLookupService.getInstance().getCsCount(oldRab);
        return diff > 0 ? (short) diff : 0;
    }

    public static byte getNumCsRabsDropped(final short oldRab,
            final short newRab) {
        final int diff = DefaultLookupService.getInstance().getCsCount(oldRab)
                - DefaultLookupService.getInstance().getCsCount(newRab);
        return diff > 0 ? (byte) diff : 0;
    }

    public static byte getNumCsRabsFailed(final short currentRab,
            final short failedRab) {
        // Same logic as for rab establishment
        Short result = getNumCsRabsEstablished(currentRab, failedRab);
        return result.byteValue();
    }

    public static short getCsCount(final short oldRab, final short newRab,
            final short currVal) {
        final short diff = getNumCsRabsEstablished(oldRab, newRab);
        return diff > 0 ? (short) (currVal + diff) : currVal;
    }

    public static short getNumMultiRabsEstablished(final short oldRab,
            final short newRab) {
        return (DefaultLookupService.getInstance().isMultiRab(oldRab) == false && DefaultLookupService
                .getInstance().isMultiRab(newRab) == true) ? (short) 1 : 0;
    }

    public static byte getNumMultiRabsDropped(final short oldRab,
            final short newRab) {
        return (DefaultLookupService.getInstance().isMultiRab(oldRab) == true && DefaultLookupService
                .getInstance().isMultiRab(newRab) == false) ? (byte) 1 : 0;
    }

    public static byte getNumMultiRabsFailed(final short currentRab,
            final short failedRab) {
        // Same logic as for rab establishment
        Short result = getNumMultiRabsEstablished(currentRab, failedRab);
        return result.byteValue();
    }

    /**
     * Finds the rabs that are in first rab but not in the second rab. The value
     * is returned is the rab type value representing the combination of rabs.
     * 
     * @param firstRab
     * @param secondRab
     * @return value representing rabType that contains the combination of rabs
     */
    public static short getExtraRabsInFirstRab(final short firstRab,
            final short secondRab) {
        RabCombination firstRabCombo = DefaultLookupService.getInstance()
                .getRabCombination(firstRab);
        if (firstRabCombo == null) {
            return DefaultValues.DEFAULT_SHORT_VALUE;
        }

        RabCombination secondRabCombo = DefaultLookupService.getInstance()
                .getRabCombination(secondRab);
        if (secondRabCombo == null) {
            return DefaultValues.DEFAULT_SHORT_VALUE;
        }

        RabCombination extraRabsInFirstRab = firstRabCombo
                .findMissingRabs(secondRabCombo);
        Short result = DefaultLookupService.getInstance().getRab(
                extraRabsInFirstRab);
        if (result != null) {
            return result.shortValue();
        }
        return DefaultValues.DEFAULT_SHORT_VALUE;
    }

    public static short getRabTypeForDroppedRabs(final short oldRab,
            final short newRab) {
        return getExtraRabsInFirstRab(oldRab, newRab);
    }

    public static short getRabTypeForFailedRabs(final short currentRab,
            final short failedRab) {
        return getExtraRabsInFirstRab(failedRab, currentRab);
    }

    /*
     * Imsi is passed as Long to avoid Esper warnings in the logs
     */
    public static String getMcc(final Long imsi) {
        return DefaultLookupService.getInstance().getMcc(imsi.longValue());
    }

    /*
     * Imsi is passed as Long to avoid Esper warnings in the logs
     */
    public static String getMnc(final Long imsi) {
        return DefaultLookupService.getInstance().getMnc(imsi.longValue());
    }

    public static boolean isHsupaBearer(final short bearerId) {
        return DefaultLookupService.getInstance().isHsupaBearer(bearerId);
    }

    public static boolean isDownswitch(final ApEventBean event) {
        if (!(event instanceof INTERNAL_CHANNEL_SWITCHING)) {
            return true; // downswitch more probable
        }
        final INTERNAL_CHANNEL_SWITCHING ics = (INTERNAL_CHANNEL_SWITCHING) event;
        final int reason = ics.getCHANNEL_SWITCH_REASON();
        final int reasonExt = ics.getCHANNEL_SWITCH_REASON_EXT();

        // see email from Johan Larsson B
        if (reason == 1 || reason == 7) {
            return false;
        }
        if (reasonExt == 0 || reasonExt == 1) {
            return false;
        }
        return true;
    }

    public static final float[] ECNOs = new float[50];

    public static final float[] RSCPs = new float[92];

    public static final byte[] RSSIs = new byte[64];
    static {
        float value = -24.5f;
        for (int i = 0; i < ECNOs.length; i++) {
            ECNOs[i] = value;
            value = value + 0.5f;
        }
        value = -116;
        for (int i = 0; i < RSCPs.length; i++) {
            RSCPs[i] = value;
            value = value + 1;
        }

        byte rssiValue = 111;
        for (int i = 0; i < RSSIs.length; i++) {
            RSSIs[i] = rssiValue;
            rssiValue--;
        }
    }

    public static float getMappedRscp(final int index) {
        if (0 <= index && index < RSCPs.length) {
            return RSCPs[index];
        }
        if (-5 <= index && index < 0) {
            return (RSCPs[0] + index);
        }
        if (index < -5) {
            logger.debug("Received RSCP is illegal value '" + index + "'");
            return (RSCPs[0] - 5);
        }
        logger.debug("Received RSCP is illegal value '" + index + "'");
        return RSCPs[RSCPs.length - 1];
    }

    public static float getMappedEcno(final int index) {
        if (0 <= index && index < ECNOs.length) {
            return ECNOs[index];
        }
        if (index < 0) {
            logger.debug("Received ECNO is illegal value '" + index + "'");
            return ECNOs[0];
        }
        logger.debug("Received ECNO is illegal value '" + index + "'");
        return ECNOs[ECNOs.length - 1];
    }

    public static byte getMappedRSSI(final int index) {
        if (0 <= index && index < RSSIs.length) {
            return RSSIs[index];
        }

        return -1;
    }

    public static boolean updateInterOutHHOFailList(
            final InternalGpehSession window, final ApEventBean event) {
        window.addInterOutHHOFail((INTERNAL_OUT_HARD_HANDOVER_FAILURE) event);

        return true;
    }

    public static boolean updateSucHsdschCellList(
            final InternalGpehSession window, final ApEventBean event) {
        window.addSucHsdschCell((INTERNAL_SUCCESSFUL_HSDSCH_CELL_CHANGE) event);

        return false;
    }

    // TODO consider rewriting it in Esper; verify that it works correctly
    public static boolean updateRrcMeasurements(
            final InternalGpehSession window, final ApEventBean event) {
        if (event instanceof EE_RRC_MEASUREMENT) {
            // store the report in the window
            window.addRrcMeasurement((EE_RRC_MEASUREMENT) event);
            // calculate metrics
            final MeasurementCategory cat = getMeasurementCategory((EE_RRC_MEASUREMENT) event);
            switch (cat) {
            case GCGS:
                window.incGcGsCount();
                break;
            case GCBS:
                window.incGcBsCount();
                break;
            case BCGS:
                window.incBcGsCount();
                break;
            case BCBS:
                window.incBcBsCount();
                break;
            }
        }
        return false;
    }

    public static MeasurementCategory getMeasurementCategory(
            final EE_RRC_MEASUREMENT meas) {
        if (meas.getECNO() == Integer.MIN_VALUE
                || meas.getRSCP() == Integer.MIN_VALUE) {
            return null;
        }
        final int ecnoThreshold = DefaultLookupService.getInstance()
                .getECNOThresholdValue(); // TODO injection of reference
        final int rscpThreshold = DefaultLookupService.getInstance()
                .getRSCPThresholdValue(); // TODO injection of reference

        final float receivedRscp = meas.getRSCP();
        final float receivedEcno = meas.getECNO();
        if (receivedRscp >= rscpThreshold && receivedEcno >= ecnoThreshold) {
            return MeasurementCategory.GCGS;
        } else if (receivedRscp >= rscpThreshold
                && receivedEcno < ecnoThreshold) {
            return MeasurementCategory.GCBS;
        } else if (receivedRscp < rscpThreshold
                && receivedEcno >= ecnoThreshold) {
            return MeasurementCategory.BCGS;
        } else {
            return MeasurementCategory.BCBS;
        }
    }

    public static long floorTime(final long timeInMs) {
        return (timeInMs / ONE_MINUTE) * ONE_MINUTE;
    }

    public static boolean updateSwitchingList(final InternalGpehSession window,
            final ApEventBean event) {
        if (event instanceof INTERNAL_CHANNEL_SWITCHING) {
            window.addChannelSwitching((INTERNAL_CHANNEL_SWITCHING) event);
        }
        return true;
    }

    public static boolean updateRabList(final InternalGpehSession window,
            final long timestamp, final short rab) {
        window.updateRabList(timestamp, rab);
        return true;
    }

    public static boolean updateCmList(final InternalGpehSession window,
            final ApEventBean event) {
        if (event instanceof INTERNAL_CMODE_ACTIVATE) {
            window.addCmActivate(event);
        } else if (event instanceof INTERNAL_CMODE_DEACTIVATE) {
            window.addCmDeactivate(event);
        }
        return false;
    }

    public static boolean updateStartEndCellRnc(
            final InternalGpehSession window, final ApEventBean event) {
        window.updateStartEndCellRnc(event);
        return true;
    }

    public static boolean updateFirstLastEvents(
            final InternalGpehSession window, final ApEventBean event) {
        window.handleEventForFirstLast(event);
        return false;
    }

    public static boolean sessionClosing(final InternalGpehSession window) {
        window.sessionClosing();
        return true;
    }

    public static boolean updateServingRncAndCell(
            final InternalGpehSession record, final ApEventBean event) {
        record.updateServingRncAndCell(event);
        return false;
    }

    public static Pair<Short, Integer> getRncAndCell(final ApEventBean event) {
        try {
            final Class<? extends ApEventBean> clazz = event.getClass();
            final Method getCID = clazz.getMethod("getC_ID_1",
                    new Class<?>[] {});
            final Object cId = getCID.invoke(event, new Object[] {});
            final Method getRNCID = clazz.getMethod("getRNC_ID_1",
                    new Class<?>[] {});
            final Object rncId = getRNCID.invoke(event, new Object[] {});
            return new Pair<Short, Integer>(((Short) rncId),
                    CellUtil.getUnsignedCellId(((Integer) cId)));
        } catch (final Throwable e) {
            return null;
        }
    }

    // MY STUFF

    public static String[] updateArray(String[] inArray, final String newEntry,
            final Boolean createNew) {
        if (inArray == null) {
            inArray = new String[0];
        }
        if (createNew) {
            return new String[] { newEntry };
        }
        final List<String> asList = new ArrayList<String>();
        asList.addAll(Arrays.asList(inArray));
        if (!asList.contains(newEntry)) {

            asList.add(newEntry);
        }
        return asList.toArray(new String[0]);
    }

    public static long[] updateLongArray(final long[] result, Long newData,
            final Boolean createNew) {
        newData = newData < 0 ? (newData * -1) : newData;
        if (createNew) {
            return new long[] { newData };
        }
        final long[] output = new long[result.length + 1];
        System.arraycopy(result, 0, output, 0, result.length);
        output[output.length - 1] = newData;

        return output;
    }

    public static double[] updateArray(final double[] result, Double newData,
            final Boolean createNew) {
        newData = newData < 0 ? (newData * -1) : newData;
        if (createNew) {
            return new double[] { newData };
        }
        final double[] output = new double[result.length + 1];
        System.arraycopy(result, 0, output, 0, result.length);
        output[output.length - 1] = newData;

        return output;
    }

    public static int[] updateIntegerArray(final Integer[] result,
            final Integer[] newDatas) {
        final List<Integer> data = new ArrayList<Integer>();
        for (final int oldData : result) {
            data.add(oldData);
        }
        for (final int newData : newDatas) {
            data.add(newData);
        }
        final int[] output = new int[data.size()];
        int index = 0;
        for (final int updatedData : data) {
            output[index] = updatedData;
            index++;
        }
        return output;
    }

    public static double[] updateDoubleArray(final Double[] result,
            final Double newData, final Boolean createNew) {
        if (createNew) {
            return new double[] { newData };
        }
        final Double[] mediator = new Double[result.length + 1];
        final double[] output = new double[result.length + 1];
        System.arraycopy(result, 0, mediator, 0, result.length);
        mediator[mediator.length - 1] = newData;
        for (int i = 0; i < mediator.length; i++) {
            output[i] = mediator[i];
        }
        return output;
    }

    public static String getArrayString(final byte[] array) {
        final StringBuffer result = new StringBuffer();
        result.append("{\"");
        for (final byte data : array) {
            if (data > -1) {
                result.append(data);
            }
        }
        result.append("\"}");
        return result.toString();
    }

    public static String getArrayString(final short[] array) {
        final StringBuffer result = new StringBuffer();
        result.append("{\"");
        for (final short data : array) {
            if (data > -1) {
                result.append(data);
            }
        }
        result.append("\"}");
        return result.toString();
    }

    public static String getArrayString(final int[] array) {
        final StringBuffer result = new StringBuffer();
        result.append("{\"");
        for (final int data : array) {
            if (data > -1) {
                result.append(data);
            }
        }
        result.append("\"}");
        return result.toString();
    }

    public static synchronized int parse(final Long duration) {
        return duration < 0 ? (int) (duration * -1) : (int) duration
                .longValue();
    }

    /**
     * This method returns the IMEITac value from the imeisv attribute
     * 
     * @param imeiSv
     *            String imeiSv
     * @return String IMEITac
     */
    public static String getIMEITacFromImeisv(final String imeiSv) {
        if (imeiSv == null) {
            return null;
        }
        if (imeiSv.trim().length() <= 8) {
            return imeiSv;
        }
        return imeiSv.trim().substring(0, 8);
    }

    public static synchronized String[] buildEventsList(
            final SERVICE_REQUEST_CORR object, final String eventName,
            final Long newTime) {
        // EVENTS_EVENT_NAME array builds here
        final List<String> eventsName = new ArrayList<String>();
        eventsName.addAll(Arrays.asList(object.getEVENTS_EVENT_NAME()));
        eventsName.add(eventName);
        // sets the events duration
        object.setEVENTS_TIME_REL(updateArray(object.getEVENTS_TIME_REL(),
                new Double((object.getTimestamp() - newTime) / 1000), false));
        return eventsName.toArray(new String[0]);
    }

    public static synchronized String[] buildEventsList(
            final NET_TG_SERVICE_REQUEST_CORR object, final String eventName,
            final Long newTime) {
        // EVENTS_EVENT_NAME array builds here
        final List<String> eventsName = new ArrayList<String>();
        eventsName.addAll(Arrays.asList(object.getEVENTS_EVENT_NAME()));
        eventsName.add(eventName);
        // sets the events duration
        object.setEVENTS_TIME_REL(updateArray(object.getEVENTS_TIME_REL(),
                new Double((object.getTimestamp() - newTime) / 1000), false));
        return eventsName.toArray(new String[0]);
    }

    public static synchronized String[] buildMilestone(
            final NET_TG_SERVICE_REQUEST_CORR object, final String eventName,
            final String milestone, final Long newTime) {
        final List<String> eventsName = new ArrayList<String>();
        // EVENTS_EVENT_NAME array builds here
        eventsName.addAll(Arrays.asList(object.getEVENTS_EVENT_NAME()));
        eventsName.add(eventName);
        object.setEVENTS_EVENT_NAME(eventsName.toArray(new String[0]));
        // sets the events duration
        object.setEVENTS_TIME_REL(updateArray(object.getEVENTS_TIME_REL(),
                new Double((object.getTimestamp() - newTime) / 1000), false));
        // building MILESTONE_NAME array
        final List<String> milestonName = new ArrayList<String>();
        milestonName
                .addAll(Arrays.asList(object.getMILESTONES_MILESTONE_NAME()));
        milestonName.add(milestone);
        // sets the milestone time stamp
        object.setMILESTONES_MILESTONE_TIMESTAMP(updateLongArray(
                object.getMILESTONES_MILESTONE_TIMESTAMP(), newTime, false));
        // returns the milestone names
        return milestonName.toArray(new String[0]);
    }

    public static synchronized String[] buildMilestone(
            final SERVICE_REQUEST_CORR object, final String eventName,
            final String milestone, final Long newTime) {
        final List<String> eventsName = new ArrayList<String>();
        // EVENTS_EVENT_NAME array builds here
        eventsName.addAll(Arrays.asList(object.getEVENTS_EVENT_NAME()));
        eventsName.add(eventName);
        object.setEVENTS_EVENT_NAME(eventsName.toArray(new String[0]));
        // sets the events duration
        object.setEVENTS_TIME_REL(updateArray(object.getEVENTS_TIME_REL(),
                new Double((object.getTimestamp() - newTime) / 1000), false));
        // building MILESTONE_NAME array
        final List<String> milestonName = new ArrayList<String>();
        milestonName
                .addAll(Arrays.asList(object.getMILESTONES_MILESTONE_NAME()));
        milestonName.add(milestone);
        // sets the milestone time stamp
        object.setMILESTONES_MILESTONE_TIMESTAMP(updateLongArray(
                object.getMILESTONES_MILESTONE_TIMESTAMP(), newTime, false));
        // returns the milestone names
        return milestonName.toArray(new String[0]);
    }

    public static synchronized String[] buildMilestone(
            final X2_HANDOVER object, final String eventName1,
            final String milestone, final Long newTime) {
        // building MILESTONE_NAME array
        final List<String> milestonName = new ArrayList<String>();
        milestonName.addAll(cleanList(Arrays.asList(object
                .getMILESTONES_MILESTONE_NAME())));
        if (!milestonName.contains(milestone)) {
            milestonName.add(milestone);
            // sets the milestone time stamp
            object.setMILESTONES_MILESTONE_TIMESTAMP(updateLongArray(
                    object.getMILESTONES_MILESTONE_TIMESTAMP(), newTime, false));
            // returns the milestone names
        }
        return milestonName.toArray(new String[0]);
    }

    private static synchronized List<String> cleanList(
            final List<String> milestonName) {
        final List<String> milestonNames = new ArrayList<String>();
        for (final String ms : milestonName) {
            if (ms != null) {
                milestonNames.add(ms);
            }
        }
        return milestonNames;
    }

    public static synchronized String[] buildMilestone(
            final S1_HANDOVER object, final String eventName1,
            final String milestone, final Long newTime) {
        final List<String> milestonName = new ArrayList<String>();
        milestonName.addAll(cleanList(Arrays.asList(object
                .getMILESTONES_MILESTONE_NAME())));
        if (!milestonName.contains(milestone)) {
            milestonName.add(milestone);
            // sets the milestone time stamp
            object.setMILESTONES_MILESTONE_TIMESTAMP(updateLongArray(
                    object.getMILESTONES_MILESTONE_TIMESTAMP(), newTime, false));
            // returns the milestone names
        }
        return milestonName.toArray(new String[0]);
    }

    /**
     * This method covert Double[] to double[]
     * 
     * @param arrayIn
     *            an array of type Double
     * @return an array of type double
     */
    public static synchronized double[] castArrayType(final Double[] arrayIn) {
        final double[] arrayOut = new double[arrayIn.length];
        for (int index = 0; index < arrayIn.length; index++) {
            arrayOut[index] = arrayIn[index];
        }
        return arrayOut;
    }

    /**
     * This method covert Long[] to long[]
     * 
     * @param arrayIn
     *            an array of type Long
     * @return an array of type long
     */
    public static synchronized long[] castArrayType(final Long[] arrayIn) {
        final long[] arrayOut = new long[arrayIn.length];
        for (int index = 0; index < arrayIn.length; index++) {
            arrayOut[index] = arrayIn[index];
        }
        return arrayOut;
    }

    /**
     * This method is no longer implemented - see older versions of this class
     * in GIT for the original implementation It looks like the original
     * implementation reads data from the PostGreSQL database which no longer
     * exists
     * 
     * @param enbSessionId
     * @param mmSessionId
     * @return
     */
    public static synchronized boolean validate(final String imsi,
            final Integer targetEnbSessionId, final Integer targetMmeSessionId) {
        throw new UnsupportedOperationException(
                "This method is no longer implemented, check previous versions of this class to see former implementation");
    }

    protected static void sort(final List<ApEventBean> rauList) {
        Collections.sort(rauList, new Comparator<ApEventBean>() {

            @Override
            public int compare(final ApEventBean rau1, final ApEventBean rau2) {
                if (rau1.getTimestamp() == rau2.getTimestamp()) {
                    return 0;
                }
                if (rau1.getTimestamp() > rau2.getTimestamp()) {
                    return -1;
                } else {
                    return 1;
                }
            }
        });
    }

    public static ApEventBean[] sort(final ApEventBean[] eventBeanArray) {
        if (eventBeanArray == null || eventBeanArray.length == 0) {
            return new ApEventBean[0];
        }
        final List<ApEventBean> listToBeSorted = toApEventList(eventBeanArray);
        sort(listToBeSorted);

        return listToBeSorted.toArray(new ApEventBean[0]);
    }

    /**
     * This method is copies the {@link RAU}[] into List<{@link RAU}>
     * 
     * @param Array
     *            of {@link RAU}
     * @return List of {@link RAU}
     */
    private static synchronized List<ApEventBean> toApEventList(
            final ApEventBean[] raus) {

        final List<ApEventBean> result = new ArrayList<ApEventBean>();
        if (raus == null) {
            return result;
        }
        for (final ApEventBean rau : raus) {
            result.add(rau);
        }
        return result;
    }

    /**
     * List of 3G events that business correlations are interested in.
     */
    public static final Set<String> EVENTS_OF_INTEREST = getEventsOfInterest();

    private static Set<String> getEventsOfInterest() {
        final Set<String> result = new HashSet<String>();
        result.add(INTERNAL_RAB_ESTABLISHMENT.ABSOLUTE_NAME);
        result.add(INTERNAL_NORMAL_RELEASE.ABSOLUTE_NAME);
        result.add(INTERNAL_RAB_RELEASE.ABSOLUTE_NAME);
        result.add(INTERNAL_CHANNEL_SWITCHING.ABSOLUTE_NAME);
        result.add(INTERNAL_CMODE_ACTIVATE.ABSOLUTE_NAME);
        result.add(INTERNAL_CMODE_DEACTIVATE.ABSOLUTE_NAME);
        result.add(RRC_MEASUREMENT_REPORT.ABSOLUTE_NAME);
        result.add(INTERNAL_SYSTEM_RELEASE.ABSOLUTE_NAME);
        result.add(INTERNAL_CALL_REESTABLISHMENT.ABSOLUTE_NAME);
        result.add(INTERNAL_IMSI.ABSOLUTE_NAME);
        result.add(INTERNAL_FAILED_HSDSCH_CELL_CHANGE.ABSOLUTE_NAME);
        result.add(INTERNAL_SUCCESSFUL_HSDSCH_CELL_CHANGE.ABSOLUTE_NAME);
        result.add(INTERNAL_HSDSCH_CELL_SELECTION_NO_CELL_SELECTED.ABSOLUTE_NAME);
        result.add(INTERNAL_OUT_HARD_HANDOVER_FAILURE.ABSOLUTE_NAME);
        result.add(INTERNAL_IFHO_EXECUTION_ACTIVE.ABSOLUTE_NAME);
        result.add(INTERNAL_SOFT_HANDOVER_EXECUTION.ABSOLUTE_NAME);
        result.add(INTERNAL_SYSTEM_UTILIZATION.ABSOLUTE_NAME);
        return result;
    }

    public static String getModuleText(final String fileName) {
        final File file = new File(fileName);
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(file));
            final StringBuilder buffer = new StringBuilder();
            String line = null;
            while ((line = reader.readLine()) != null) {
                buffer.append(line);
                buffer.append('\n');
            }
            return buffer.toString();
        } catch (final Exception e) {
            throw new RuntimeException(e);
        } finally {
            if (reader != null) {
                Util.close(reader);
            }
        }
    }

    public static void close(final Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (final Exception e) {
                // swallow
            }
        }
    }

    public static void assertTrue(final boolean expression, final String message) {
        if (!expression) {
            throw new IllegalStateException(message);
        }
    }

    public static String asString(final Collection<?> collection) {
        if (collection == null || collection.size() == 0) {
            return "";
        }
        final Object[] array = collection.toArray();
        final StringBuilder buffer = new StringBuilder();
        for (int i = 0; i < array.length - 1; i++) {
            final Object element = array[i];
            buffer.append(element == null ? "" : element);
            buffer.append(DEFAULT_COLLECTION_SEPARATOR);
        }
        final Object element = array[array.length - 1];
        buffer.append(element == null ? "" : element);
        return buffer.toString();
    }

    public static void close(final ResultSet resultSet,
            final Statement statement, final Connection connection) {
        if (resultSet != null) {
            try {
                resultSet.close();
            } catch (final Exception e) {
            }
        }
        if (statement != null) {
            try {
                statement.close();
            } catch (final Exception e) {
            }
        }
        if (connection != null) {
            try {
                connection.close();
            } catch (final Exception e) {
            }
        }
    }

    public static boolean getFile() {
        return false;

    }

    public static boolean processtextFile(final String subNetwork)
            throws ClassNotFoundException {

        boolean fileExist = false;
        try {

            File file = null;

            file = new File(FILE_PATH + subNetwork + TXT);

            if (!file.exists()) {
                file.createNewFile();
                logger.info("New file created with RNC name " + subNetwork
                        + TXT);
                file.setReadable(true);
                file.setExecutable(false);
                file.setWritable(false);

                fileExist = true;
            } else {
                fileExist = true;
                logger.info("File " + subNetwork + TXT + "exists");
            }

        }

        catch (IOException e) {
            e.printStackTrace();
        }

        return fileExist;
    }

    public static boolean isFileExist(final String subNetwork)
            throws ClassNotFoundException, IOException {
        boolean fileExistforDummy = false;
        try {
            File file = null;
            file = new File(FILE_PATH + subNetwork + TXT);
            if (file.exists()) {
                fileExistforDummy = true;
            } else {
                fileExistforDummy = false;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return fileExistforDummy;
    }
}
