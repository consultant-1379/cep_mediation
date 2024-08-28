package com.ericsson.cepmediation.loading.cleanup;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.cepmediation.base.properties.CepMediationProperties;
import com.ericsson.cepmediation.base.properties.CepMediationProperty;
import com.ericsson.cepmediation.base.properties.ConfigBinder;
import com.ericsson.cepmediation.config.bean.NetworkElement;
import com.ericsson.cepmediation.config.bean.NetworkElementsType;
import com.ericsson.cepmediation.config.bean.ProcessType;
import com.ericsson.cepmediation.loading.service.task.CaptoolParsingJob;
import com.ericsson.cepmediation.loading.service.task.EBSParsingJob;
import com.ericsson.cepmediation.loading.service.task.StapleParsingJob;
import com.ericsson.cepmediation.loading.service.task.collection.CollectionJob;
import com.ericsson.cepmediation.loading.service.task.gpeh.GPEHParsingJob;

/**
 * 
 * This class is invoked from rpm install script. It removes legacy files from /output folder.
 * 
 * The naming convention for files in this folder was something like:
 * /output/gpeh_1-2-3.last
 * /output/gpeh_1-2-3/Mp0.gz 
 * ...
 * 
 * It changed to:
 * /output/RNC1.last
 * /output/RNC1/Mp0.gz
 * ...
 * 
 * This class renames gpeh_1-2-3.last to RNC1.last and deletes the gpeh_1-2-3 folder.
 * 
 * @author emicned
 *
 */
public class LegacyFileCleaner {
    private static final String LEGACY_NAMING_CONVENTION_PATTERN = "^(captool|staple|gpeh|ebs)_\\d\\d?-1-\\d\\d?.*";
    private static final Logger logger = LoggerFactory.getLogger(LegacyFileCleaner.class);

    public static void main(String[] args) {
        try {
            new LegacyFileCleaner().cleanUp();
        } catch (Exception e) {
            logger.error("Error cleaning legacy files!", e);
        }
    }

    // allow package access for junit
    void cleanUp() {
        logger.info("Checking for legacy files in /output");

        Map<String, String> mappings = computeJobLabelMappings();
        logger.info("Legacy to new label mappings: " + mappings);

        File[] outputDirContents = new File(CepMediationProperties.getProperty(CepMediationProperty.GENERAL_FILECOPY_DESTINATION)).listFiles();
        for (int i = 0; i < outputDirContents.length; i++) {
            File file = outputDirContents[i];
            String fileLabel = file.getName().replace(CollectionJob.LAST_LIST_EXTENSION, "");
            String newLabel = mappings.get(fileLabel);
            if (newLabel != null) {
                cleanLegacyFile(file, newLabel);
            } else if (fileLabel.matches(LEGACY_NAMING_CONVENTION_PATTERN)) {
                delete(file);
            }
        }

        logger.info("Legacy check complete.");
    }

    void cleanLegacyFile(File file, String newLabel) {
        if (file.isFile()) {
            handleLegacyFile(file, newLabel);
        } else if (file.isDirectory()) {
            delete(file);
        }
    }

    private void delete(File legacyDir) {
        logger.info("Deleting: " + legacyDir.getAbsolutePath());
        if (legacyDir.isDirectory()){
            for (File f : legacyDir.listFiles()) {
                if (!f.delete()) {
                    logger.warn("Error deleting file: " + f.getAbsolutePath() + ". Skipping the entire folder...");
                    return;
                }
            }
        }

        boolean success = legacyDir.delete();
        logger.info("Deletion " + (success ? "succeeded." : " failed."));
    }

    private void handleLegacyFile(File file, String newLabel) {
        String absoluteName = file.getAbsolutePath();
        logger.info("Found legacy dotLast file: " + absoluteName);
        int pos = absoluteName.lastIndexOf(File.separator);
        absoluteName = absoluteName.substring(0, pos + 1);
        absoluteName += newLabel + CollectionJob.LAST_LIST_EXTENSION;
        File newDotLast = new File(absoluteName);
        if (newDotLast.exists()) {
            boolean success = file.delete();
            logger.info("DotLast file already exists. Deleting legacy dotLast: " + file.getAbsolutePath() + (success ? " success! " : " failed! "));
        } else {
            boolean success = file.renameTo(newDotLast);
            logger.info((success ? "Successfully renamed" : "Failed to rename") + " legacy file " + file.getAbsolutePath() + " to " + absoluteName);
        }
    }

    Map<String, String> computeJobLabelMappings() {
        Map<String, String> res = new HashMap<String, String>();

        ConfigBinder config = ConfigBinder.getInstance();
        List<ProcessType> processes = config.getProcesses();
        for (int i = 0, n = processes != null ? processes.size() : 0; i < n; i++) {
            addMappings(processes.get(i), res);
        }

        return res;
    }

    void addMappings(ProcessType processType, Map<String, String> mappings) {
        int procId = processType.getProcid();

        NetworkElementsType neTypes = processType.getNetworkElements();
        if (neTypes == null) {
            return;
        }

        List<NetworkElement> nes = neTypes.getNetworkElement();
        if (neTypes.getNetworkElement() == null || neTypes.getNetworkElement().isEmpty()) {
            return;
        }

        int jobCounter = 1;
        for (NetworkElement ne : nes) {
            String label = ne.getLabel();
            int neType = ne.getNeType();
            addMapping(procId, label, neType, jobCounter++, mappings);
        }
    }

    void addMapping(int procId, String label, int neType, int jobCounter, Map<String, String> mappings) {
        label = label.trim();
        String legacyTag = "_" + procId + "-1-" + jobCounter;
        switch (neType) {
        case 1:
            legacyTag = GPEHParsingJob.GPEH_TAG + legacyTag;
            mappings.put(legacyTag, label);
            return;
        case 2:
            legacyTag = EBSParsingJob.EBS_TAG + legacyTag;
            mappings.put(legacyTag, label);
            return;
        case 3:
            mappings.put(CaptoolParsingJob.CAPTOOL_TAG + legacyTag, CaptoolParsingJob.CAPTOOL_TAG + "_" + label);
            mappings.put(StapleParsingJob.STAPLE_TAG + legacyTag, StapleParsingJob.STAPLE_TAG + "_" + label);
            return;
        default:
            logger.warn("Unexpected neType: " + neType + " for label: " + label + ". Skipping it...");
        }
    }

}
