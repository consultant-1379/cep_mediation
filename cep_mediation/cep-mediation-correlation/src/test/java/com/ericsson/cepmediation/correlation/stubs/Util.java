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
package com.ericsson.cepmediation.correlation.stubs;

import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

import com.ericsson.cepmediation.apeventbeans.gpeh.INTERNAL_CHANNEL_SWITCHING;
import com.ericsson.cepmediation.base.apeventbeans.ApEventBean;
import com.ericsson.cepmediation.base.apeventbeans.DefaultValues;
import com.ericsson.cepmediation.base.util.FileUtils;
import com.ericsson.cepmediation.base.util.Utilities;
import com.ericsson.cepmediation.correlation.RabTypes;
import com.ericsson.cepmediation.correlation.precorrelation.esperservices.impl.RopProcessor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Version of the production Util class for use in test
 */
public class Util {

    private static final String TXT = ".txt";

    final Logger logger = LoggerFactory.getLogger(Util.class);

    protected static boolean flag = true;

    public static int extractTacFromImeiSv(final String imeiSv) {
        return Utilities.extractTacFromImeiSv(imeiSv);
    }

    public static int extractTacFromImeiSv(final long imeiSv) {
        return Utilities.extractTacFromImeiSv(imeiSv);
    }

    public static byte[] getIpv4Address(final String ipv4Address) {
        return com.ericsson.cepmediation.correlation.support.Util
                .getIpv4Address(ipv4Address);
    }

    public static boolean isRoaming(final String imsiMcc, final String imsiMnc) {
        return HomePlmnIds.isRoaming(imsiMcc, imsiMnc);
    }

    public static boolean isInHfaWhitelist(final int eventId,
            short exceptionClass, short causeValue, short subCauseValue) {
        return HfaWhitelistValues.isInHfaWhitelist(eventId, exceptionClass,
                causeValue, subCauseValue);
    }

    public static boolean isInHfaWhitelist(final int eventId, short causeValue,
            short subCauseValue) {
        return HfaWhitelistValues.isInHfaWhitelist(eventId,
                DefaultValues.DEFAULT_SHORT_VALUE, causeValue, subCauseValue);
    }

    public static boolean isInHfaWhitelist(final int eventId, short causeValue) {
        return HfaWhitelistValues.isInHfaWhitelist(eventId,
                DefaultValues.DEFAULT_SHORT_VALUE, causeValue,
                DefaultValues.DEFAULT_SHORT_VALUE);
    }

    public static boolean isInCfaWhitelist(final int eventId, byte causeValue,
            byte subCauseValue) {
        return CfaWhitelist
                .isInCfaWhitelist(eventId, causeValue, subCauseValue);
    }

    public static boolean isRoaming(final Long imsi) {
        String imsiMcc = getMcc(imsi);
        String imsiMnc = getMnc(imsi);
        return isRoaming(imsiMcc, imsiMnc);
    }

    public static boolean containsPsRab(final short targetConf) {
        return RabTypes.getPsCount(targetConf) > 0;
    }

    public static byte getPsRabCount(final short targetConf) {
        return 1;
    }

    public static short getNumPsRabsEstablished(final short sourceConf,
            final short targetConf) {
        final int diff = RabTypes.getPsCount(targetConf)
                - RabTypes.getPsCount(sourceConf);

        return diff > 0 ? (short) diff : 0;
    }

    public static byte getNumPsRabsDropped(final short sourceConf,
            final short targetConf) {
        final int diff = RabTypes.getPsCount(sourceConf)
                - RabTypes.getPsCount(targetConf);
        return diff > 0 ? (byte) diff : 0;
    }

    public static byte getNumPsRabsFailed(final short currentRab,
            final short failedRab) {
        // Same logic as for rab establishment
        Short result = getNumPsRabsEstablished(currentRab, failedRab);
        return result.byteValue();
    }

    public static short getPsCount(final short sourceConf,
            final short targetConf, final short currentCount) {
        final int diff = getNumPsRabsEstablished(sourceConf, targetConf);
        return diff > 0 ? (short) (currentCount + diff) : currentCount;
    }

    public static short getNumCsRabsEstablished(final short sourceConf,
            final short targetConf) {
        final int diff = RabTypes.getCsCount(targetConf)
                - RabTypes.getCsCount(sourceConf);
        return diff > 0 ? (short) diff : 0;
    }

    public static byte getNumCsRabsDropped(final short sourceConf,
            final short targetConf) {
        final int diff = RabTypes.getCsCount(sourceConf)
                - RabTypes.getCsCount(targetConf);
        return diff > 0 ? (byte) diff : 0;
    }

    public static byte getNumCsRabsFailed(final short currentRab,
            final short failedRab) {
        // Same logic as for rab establishment
        Short result = getNumCsRabsEstablished(currentRab, failedRab);
        return result.byteValue();
    }

    public static short getCsCount(final short sourceConf,
            final short targetConf, final short currentCount) {
        final int diff = getNumCsRabsEstablished(sourceConf, targetConf);
        return diff > 0 ? (short) (currentCount + diff) : currentCount;
    }

    public static short getNumMultiRabsEstablished(final short sourceConf,
            final short targetConf) {
        return (RabTypes.isMultiRab(sourceConf) == false && RabTypes
                .isMultiRab(targetConf) == true) ? (short) 1 : 0;
    }

    public static byte getNumMultiRabsDropped(final short sourceConf,
            final short targetConf) {
        return (RabTypes.isMultiRab(sourceConf) == true && RabTypes
                .isMultiRab(targetConf) == false) ? (byte) 1 : 0;
    }

    public static byte getNumMultiRabsFailed(final short currentRab,
            final short failedRab) {
        // Same logic as for rab establishment
        Short result = getNumMultiRabsEstablished(currentRab, failedRab);
        return result.byteValue();
    }

    public static short getRabTypeForDroppedRabs(final short oldRab,
            final short newRab) {
        return RabTypes.getExtraRabsInFirstRab(oldRab, newRab);
    }

    public static short getRabTypeForFailedRabs(final short currentRab,
            final short failedRab) {
        return RabTypes.getExtraRabsInFirstRab(failedRab, currentRab);
    }

    public static String getMcc(final Long imsi) {
        return imsi.toString().substring(0, 3);
    }

    public static String getMnc(final Long imsi) {
        return imsi.toString().substring(3, 5);
    }

    public static byte getCsRabCount(final short targetConf) {
        // System.out.println("getCsRabCount " + targetConf);
        return 0;
    }

    public static boolean isCsRabOnly(final short targetConf) {
        return RabTypes.isCsRabOnly(targetConf);
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

    public static boolean isHsdpaBearer(final short bearerId) {
        return RabTypes.isHsdpaBearer(bearerId);
    }

    public static boolean isHsupaBearer(final short bearerId) {
        return RabTypes.isHsupaBearer(bearerId);
    }

    public static boolean isTypeInUse(final String type) {
        return type.equalsIgnoreCase("INTERNAL_RAB_ESTABLISHMENT")
                || type.equalsIgnoreCase("INTERNAL_CMODE_ACTIVATE")
                || type.equalsIgnoreCase("INTERNAL_CMODE_DEACTIVATE")
                || type.equalsIgnoreCase("INTERNAL_RAB_RELEASE")
                || type.equalsIgnoreCase("RRC_MEASUREMENT_REPORT")
                || type.equalsIgnoreCase("INTERNAL_CHANNEL_SWITCHING")
                || type.equalsIgnoreCase("RANAP_IU_RELEASE_COMMAND")
                || type.equalsIgnoreCase("INTERNAL_SYSTEM_RELEASE")
                || type.equalsIgnoreCase("RRC_RRC_CONNECTION_RELEASE_COMPLETE")
                || type.equalsIgnoreCase("INTERNAL_FAILED_HSDSCH_CELL_CHANGE")
                || type.equalsIgnoreCase("INTERNAL_SUCCESSFUL_HSDSCH_CELL_CHANGE")
                || type.equalsIgnoreCase("INTERNAL_HSDSCH_CELL_SELECTION_NO_CELL_SELECTED")
                || type.equalsIgnoreCase("INTERNAL_OUT_HARD_HANDOVER_FAILURE")
                || type.equalsIgnoreCase("INTERNAL_IFHO_EXECUTION_ACTIVE")
                || type.equalsIgnoreCase("INTERNAL_NORMAL_RELEASE")
                || type.equalsIgnoreCase("INTERNAL_SOFT_HANDOVER_EXECUTION");
    }

    public static final float[] ECNOs = new float[50];

    public static final float[] RSCPs = new float[92];

    public static final int[] RSSIs = new int[64];
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

        int rssiValue = 111;
        for (int i = 0; i < RSSIs.length; i++) {
            RSSIs[i] = rssiValue;
            rssiValue--;
        }
    }

    public static int getMappedRscps(final byte b) {
        return -1;
    }

    public static float getMappedRscp(final int index) {
        if (0 <= index && index < RSCPs.length) {
            return RSCPs[index];
        }
        if (-5 <= index && index < 0) {
            return (RSCPs[0] + index);
        }
        if (index < -5) {
            return (RSCPs[0] - 5);
        }
        return RSCPs[RSCPs.length - 1];
    }

    public static float getMappedEcno(final int index) {
        if (0 <= index && index < ECNOs.length) {
            return ECNOs[index];
        }
        if (index < 0) {
            return ECNOs[0];
        }
        return ECNOs[ECNOs.length - 1];
    }

    public static byte getMappedRSSI(final int index) {
        return com.ericsson.cepmediation.correlation.support.Util
                .getMappedRSSI(index);
    }

    // esper does not recognize hash(String... s)
    public static int hash(String s1, String s2, String s3, String s4,
            String s5, String s6, String s7) {
        return com.ericsson.cepmediation.correlation.support.Util.hash(s1, s2,
                s3, s4, s5, s6, s7);
    }

    public static boolean setTrue(boolean flagParam) {
        flag = flagParam;
        return flag;

    }

    public static boolean getTrue() {
        return flag;

    }

    public static boolean processtextFile(final String subNetwork)
            throws ClassNotFoundException {
        boolean fileExist = false;
        try {
            File file = null;
            ClassLoader loader = Util.class.getClassLoader();
            file = new File(loader.getResource("").getPath() + subNetwork + TXT);

            if (!file.exists()) {
                file.createNewFile();
                file.setExecutable(false);
                file.setReadable(true);
                file.setWritable(false);

                fileExist = true;

            } else {

                fileExist = true;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return fileExist;
    }

    public static boolean isFileExist(final String subNetwork)
            throws ClassNotFoundException, IOException {

        boolean fileExistforDummy = false;
        try {
            File file = null;
            ClassLoader loader = Util.class.getClassLoader();
            file = new File(loader.getResource("").getPath() + subNetwork + TXT);
            if (file.exists()) {
                fileExistforDummy = true;
            } else {
                fileExistforDummy = false;

            }
        }

        catch (Exception e) {
            e.printStackTrace();
        }

        return fileExistforDummy;
    }

}
