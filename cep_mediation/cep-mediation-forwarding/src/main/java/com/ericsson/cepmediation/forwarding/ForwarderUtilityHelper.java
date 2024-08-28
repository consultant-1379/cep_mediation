/*------------------------------------------------------------------------------
 *******************************************************************************
 * COPYRIGHT Ericsson 2014
 *
 * The copyright to the computer program(s) herein is the property of
 * Ericsson Inc. The programs may be used and/or copied only with written
 * permission from Ericsson Inc. or in accordance with the terms and
 * conditions stipulated in the agreement/contract under which the
 * program(s) have been supplied.
 *******************************************************************************
 *----------------------------------------------------------------------------*/

package com.ericsson.cepmediation.forwarding;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.cepmediation.base.apeventbeans.ApEventBean;
import com.ericsson.cepmediation.base.features.FeatureManager;
import com.ericsson.cepmediation.base.features.impl.FeatureManagerImpl;
import com.ericsson.cepmediation.base.properties.CepMediationProperties;
import com.ericsson.cepmediation.base.properties.CepMediationProperty;
import com.ericsson.cepmediation.base.util.constants.SystemExitCode;
import com.ericsson.cepmediation.forwarding.validation.Hier3AllCalls15MinValidator;
import com.ericsson.cepmediation.forwarding.validation.Hier3CellIdAllCalls15MinValidator;
import com.ericsson.cepmediation.forwarding.validation.MeasurementTypeValidator;

public class ForwarderUtilityHelper {

    private static final String CORRELATION_RAB_ESTABLISH_CELL_AGGR = "correlation.RAB_ESTABLISH_CELL_AGGR";

    private static final String CORRELATION_RAB_ESTABLISH_RNC_AGGR = "correlation.RAB_ESTABLISH_RNC_AGGR";

    private static final Logger logger = LoggerFactory
            .getLogger(ForwarderUtilityHelper.class);

    private static String hostName;

    private static String hostIp;

    private static int procId;

    private static final String[] fileSystemMountDirNames = { "00", "01", "02",
            "03" };

    public static final String INITIAL_LOCATION_OF_BINARY_FILES = "tmp/";

    private static final String dirRaw1 = "raw/1/";

    private static final String dirRaw2 = "raw/2/";

    private static final String dirRaw3 = "raw/3/";

    private static final String dirRaw5 = "raw/5/";

    private static final String dirFifteenMinute6 = "15min/6/";

    private static final String FILE_SEPERATOR = File.separator;

    private static String binaryDirectory = CepMediationProperties
            .getFileProperty(CepMediationProperty.IQ_BINARY_DIRECTORY);

    private static final FeatureManager featureManager = FeatureManagerImpl
            .getInstance();

    private static Map<String, MeasurementTypeDetails> event2measTypeDetails = new HashMap<String, MeasurementTypeDetails>();

    private static Map<String, String> measType2location = new HashMap<String, String>();

    private static Map<String, MeasurementTypeValidator> event2Validator = new HashMap<String, MeasurementTypeValidator>();

    static {
        addIfEnabled("correlation.GPEH_SESSION", "event_e_ran_session",
                dirRaw2, PartitionTypeEnum.VOLUME_BASED);

        addIfEnabled("correlation.SGEH_SESSION", "event_e_core_session",
                dirRaw1, PartitionTypeEnum.VOLUME_BASED);
        addIfEnabled("correlation.EE_VISITED_CELL",
                "event_e_ran_session_cell_visited", dirRaw2,
                PartitionTypeEnum.VOLUME_BASED);
        addIfEnabled("correlation.EE_RRC_MEASUREMENT",
                "event_e_ran_session_rrc_meas", dirRaw2,
                PartitionTypeEnum.VOLUME_BASED);
        addIfEnabled("correlation.TCP_REPORT_ENRICHED",
                "event_e_user_plane_tcp", dirRaw1,
                PartitionTypeEnum.VOLUME_BASED);
        addIfEnabled("correlation.CLASSIFICATION_REPORT_ENRICHED",
                "event_e_user_plane_classification", dirRaw1,
                PartitionTypeEnum.VOLUME_BASED);

        addIfEnabled("gpeh.INTERNAL_START_CONGESTION",
                "event_e_ran_session_inter_congest", dirRaw2,
                PartitionTypeEnum.VOLUME_BASED);
        addIfEnabled("gpeh.INTERNAL_STOP_CONGESTION",
                "event_e_ran_session_inter_congest", dirRaw2,
                PartitionTypeEnum.VOLUME_BASED);
        addIfEnabled("gpeh.INTERNAL_RECORDING_FAULT",
                "event_e_ran_session_inter_record", dirRaw2,
                PartitionTypeEnum.VOLUME_BASED);
        addIfEnabled("gpeh.INTERNAL_RECORDING_FAULT_RECOVERED",
                "event_e_ran_session_inter_record", dirRaw2,
                PartitionTypeEnum.VOLUME_BASED);
        addIfEnabled("gpeh.INTERNAL_MP_OVERLOAD",
                "event_e_ran_session_mp_overload", dirRaw2,
                PartitionTypeEnum.VOLUME_BASED);
        addIfEnabled("gpeh.INTERNAL_SYSTEM_UTILIZATION",
                "event_e_ran_session_inter_sys_util", dirRaw2,
                PartitionTypeEnum.VOLUME_BASED);

        addIfEnabled(
                "gpeh.enrichment.INTERNAL_SUCCESSFUL_HSDSCH_CELL_CHANGE_ENRICHED",
                "event_e_ran_session_suc_hsdsch_cell_change", dirRaw2,
                PartitionTypeEnum.VOLUME_BASED);
        addIfEnabled(
                "gpeh.enrichment.INTERNAL_OUT_HARD_HANDOVER_FAILURE_ENRICHED",
                "event_e_ran_session_inter_out_hho", dirRaw2,
                PartitionTypeEnum.VOLUME_BASED);
        addIfEnabled(
                "gpeh.enrichment.INTERNAL_SOHO_DS_MISSING_NEIGHBOUR_ENRICHED",
                "event_e_ran_session_inter_soho_ds_msng_nbr", dirRaw2,
                PartitionTypeEnum.VOLUME_BASED);

        addIfEnabled("gpeh.enrichment.INTERNAL_CALL_SETUP_FAIL_ENRICHED",
                "event_e_ran_cfa_err", dirRaw5, PartitionTypeEnum.VOLUME_BASED);
        addIfEnabled("gpeh.enrichment.INTERNAL_SYSTEM_RELEASE_ENRICHED",
                "event_e_ran_cfa_err", dirRaw5, PartitionTypeEnum.VOLUME_BASED);
        addIfEnabled("gpeh.enrichment.INTERNAL_CALL_REESTABLISHMENT_ENRICHED",
                "event_e_ran_cfa_err", dirRaw5, PartitionTypeEnum.VOLUME_BASED);
        addIfEnabled(CORRELATION_RAB_ESTABLISH_RNC_AGGR,
                "event_e_ran_cfa_hier3_allcalls", dirFifteenMinute6,
                PartitionTypeEnum.TIME_BASED);
        addIfEnabled(CORRELATION_RAB_ESTABLISH_CELL_AGGR,
                "event_e_ran_cfa_hier3_cell_id_allcalls", dirFifteenMinute6,
                PartitionTypeEnum.TIME_BASED);

        addIfEnabled(
                "gpeh.enrichment.INTERNAL_SOFT_HANDOVER_EXECUTION_ENRICHED",
                "event_e_ran_hfa_soho_err", dirRaw3,
                PartitionTypeEnum.VOLUME_BASED);
        addIfEnabled(
                "gpeh.enrichment.INTERNAL_OUT_HARD_HANDOVER_FAILURE_IFHO_ENRICHED",
                "event_e_ran_hfa_ifho_err", dirRaw3,
                PartitionTypeEnum.VOLUME_BASED);
        addIfEnabled(
                "gpeh.enrichment.INTERNAL_OUT_HARD_HANDOVER_FAILURE_IRAT_ENRICHED",
                "event_e_ran_hfa_irat_err", dirRaw3,
                PartitionTypeEnum.VOLUME_BASED);

        addIfEnabled(
                "gpeh.enrichment.INTERNAL_FAILED_HSDSCH_CELL_CHANGE_ENRICHED",
                "event_e_ran_hfa_hsdsch_err", dirRaw3,
                PartitionTypeEnum.VOLUME_BASED);
        addIfEnabled(
                "gpeh.enrichment.INTERNAL_HSDSCH_CELL_SELECTION_NO_CELL_SELECTED_ENRICHED",
                "event_e_ran_hfa_hsdsch_err", dirRaw3,
                PartitionTypeEnum.VOLUME_BASED);
        addIfEnabled("gpeh.enrichment.INTERNAL_IFHO_EXECUTION_ACTIVE_ENRICHED",
                "event_e_ran_hfa_ifho_err", dirRaw3,
                PartitionTypeEnum.VOLUME_BASED);
        logger.info("Enabled tables: " + event2measTypeDetails);
    }

    private static void addIfEnabled(final String eventName,
            final String measTypeName, final String location,
            final PartitionTypeEnum partitionType) {
        if (featureManager.getEnabledTables().contains(measTypeName)) {
            final MeasurementTypeDetails measTypeDetails = new MeasurementTypeDetails(
                    measTypeName, location, partitionType);
            event2measTypeDetails.put(eventName, measTypeDetails);
            updateMeasType2Location(measTypeDetails, location);
            updateEvent2Validator(eventName);
        }
    }

    private static void updateMeasType2Location(
            final MeasurementTypeDetails measTypeDetails, final String location) {
        final String measTypeName = measTypeDetails.getMeasurementTypeName();

        if (measType2location.containsKey(measTypeName)) {
            final String existingLocation = measType2location.get(measTypeName);
            if (!existingLocation.equals(location)) {
                logger.error("Cannot add more than 1 directory location to a measurement type. Details are: Measurement Type= "
                        + measTypeName
                        + ", Locations are "
                        + existingLocation
                        + " (defined), "
                        + location
                        + " (failed to add). This is currently unsupported. Files are only copied"
                        + "from tmp to 1 directory location for each measurement type");
            }

        } else {
            measType2location.put(measTypeName, location);
            if (checkNasMounting()) {
                createTargetDirectory(measTypeName, location);
            } else {
                logger.error("NAS mounting is not proper.Will not create directories ");
                System.exit(SystemExitCode.SYSTEM_EXIT_OUTPUT_DIR_ISSUES
                        .getValue());
            }
        }
    }

    private static void createTargetDirectory(final String measTypeName,
            final String location) {
        final File path = new File(binaryDirectory);
        if (path.exists() && path.isDirectory() && path.canWrite()) {
            logger.debug("NAS mounting " + path
                    + " is proper,having write access ");
            for (int i = 0; i < getFileSystemMountDirNames().length; i++) {
                final String dir = binaryDirectory + FILE_SEPERATOR
                        + getFileSystemMountDirNames()[i] + FILE_SEPERATOR
                        + measTypeName + FILE_SEPERATOR + location;
                final File fileCreated = new File(dir);
                if (fileCreated.exists()) {
                    logger.debug("Binary Directory : " + dir
                            + " is already present.");
                } else {
                    final boolean result = fileCreated.mkdirs();
                    if (result) {
                        logger.debug("Binary Directory : " + dir
                                + " creation is successful. ");
                    } else {
                        logger.error("Failed to create Binary Directory : "
                                + dir + " .");
                        System.exit(SystemExitCode.SYSTEM_EXIT_OUTPUT_DIR_ISSUES
                                .getValue());
                    }
                }
            }
        }
    }

    private static boolean checkNasMounting() {
        final Runtime rtInstance = Runtime.getRuntime();
        final String grepCommand = "nfsstat -m | grep -i " + binaryDirectory
                + " | cut -d' ' -f1 ";
        final String[] cmd = { "/bin/sh", "-c", grepCommand };

        try {
            final Process proc = rtInstance.exec(cmd);
            final BufferedReader outputReader = new BufferedReader(
                    new InputStreamReader(proc.getInputStream()));
            final StringBuffer grepOutputBuffer = new StringBuffer();
            String line = null;
            while ((line = outputReader.readLine()) != null) {
                grepOutputBuffer.append(line);
            }
            final String grepOutputString = grepOutputBuffer.toString();

            for (int i = 0; i < getFileSystemMountDirNames().length; i++) {
                final String mountedDirectory = binaryDirectory
                        + FILE_SEPERATOR + getFileSystemMountDirNames()[i];
                if (grepOutputString.contains(mountedDirectory)) {
                    logger.debug("Nas mounting for " + mountedDirectory
                            + " is present .");
                } else {
                    logger.error("Nas mounting for " + mountedDirectory
                            + " is not present . ");
                    System.exit(SystemExitCode.SYSTEM_EXIT_OUTPUT_DIR_ISSUES
                            .getValue());
                }
            }
            return true;

        } catch (IOException e) {
            logger.error("Nas mounting " + binaryDirectory
                    + " is not proper : " + e.getMessage(), e);
            System.exit(SystemExitCode.SYSTEM_EXIT_OUTPUT_DIR_ISSUES.getValue());
        }
        return false;
    }

    private static void updateEvent2Validator(final String eventName) {
        if (eventName.equals(CORRELATION_RAB_ESTABLISH_RNC_AGGR)) {
            event2Validator.put(eventName, new Hier3AllCalls15MinValidator());
        } else if (eventName.equals(CORRELATION_RAB_ESTABLISH_CELL_AGGR)) {
            event2Validator.put(eventName,
                    new Hier3CellIdAllCalls15MinValidator());
        }
    }

    public static void setInitialData(final String name,
            final String IpAddress, final int processId) {
        hostName = name;
        hostIp = IpAddress;
        procId = processId;
    }

    public static String constructFilePrefix() {
        String filePrefix = null;
        if (hostIp != null && hostIp.length() > 0) {
            filePrefix = hostIp.replace('.', '_');
        } else if (hostName != null && hostName.length() > 0) {
            filePrefix = hostName;
        } else {
            filePrefix = String.valueOf(System.currentTimeMillis());
            logger.warn("Host name and ip are null. Using timestamp as file prefix:"
                    + filePrefix);
        }

        filePrefix += "_" + procId + "_";

        return filePrefix;
    }

    public static Set<String> getAllEventAbsoluteNames() {
        return event2measTypeDetails.keySet();
    }

    public static MeasurementTypeDetails getMeasTypeDetails(
            final String eventAbsoluteName) {
        return event2measTypeDetails.get(eventAbsoluteName);
    }

    public static String getMeasType2Location(final String measType) {
        return measType2location.get(measType);
    }

    public static Set<String> getMeasTypes() {
        return measType2location.keySet();
    }

    public static int getProcId() {
        return procId;
    }

    public static String[] getFileSystemMountDirNames() {
        return fileSystemMountDirNames;
    }

    public static String getFifteenMinDirNames() {
        return dirFifteenMinute6;
    }


    public static boolean canEventBeStored(final ApEventBean event) {
        final MeasurementTypeValidator validator = event2Validator.get(event
                .getAbsoluteName());
        if (validator == null) {
            // No checks to be done
            return true;
        }

        return validator.canDataBeStored(event);
    }

}