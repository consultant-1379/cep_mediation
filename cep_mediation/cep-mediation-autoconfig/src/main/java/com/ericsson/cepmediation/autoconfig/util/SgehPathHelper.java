/*------------------------------------------------------------------------------
 *******************************************************************************
 * COPYRIGHT Ericsson 2013
 *
 * The copyright to the computer program(s) herein is the property of
 * Ericsson Inc. The programs may be used and/or copied only with written
 * permission from Ericsson Inc. or in accordance with the terms and
 * conditions stipulated in the agreement/contract under which the
 * program(s) have been supplied.
 *******************************************************************************
 *----------------------------------------------------------------------------*/

package com.ericsson.cepmediation.autoconfig.util;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.cepmediation.autoconfig.properties.AutoconfigProperties;
import com.ericsson.cepmediation.autoconfig.properties.AutoconfigProperties.NEPath;

/**
 * This class computes the path to the NE files by given SGSN id.
 * 
 * The sgeh NE files path should look like: /eniq/data/eventdata/events_oss_1/SgehEvents_CEP/ManagedElement=SGSN01
 * The root part of the path(/eniq/data/eventdata) is specified in the config file. The oss part of
 * the path(events_oss_1) is determined by checking the file system. The SgehEvents_CEP part is determined by
 * matching actual subfolders of events_oss_1 with a regex from config file.
 * 
 * In case the ne dir does not exist, default path is returned and a warning is logged so that
 * the user can manually change the path in the generated file.
 * 
 * @author emicned
 *
 */
public class SgehPathHelper {
    static final Logger logger = LoggerFactory.getLogger(SgehPathHelper.class);

    NEPath path;

    public SgehPathHelper() {
        path = AutoconfigProperties.instance.getSgehPath();
    }

    public SgehPathHelper(NEPath path) {
        this.path = path;
    }

    public String getNEPath(String sgsnId) {
        logger.info("Constructing ne path for " + sgsnId);

        String defaultPath = getDefaultPath(sgsnId);

        List<File> ossPaths = Utils.getMatchingSubDirs(new File(path.getRootPath()), path.getPathregexOss());
        if (ossPaths == null || ossPaths.isEmpty()) {
            logger.warn("Generating Sgeh Network Element with non existing path:" + defaultPath + " Parent: " + path.getRootPath() + " regex:" + path.getPathregexOss());
            return defaultPath;
        }

        List<File> cepFilesPaths = new ArrayList<File>();
        for (File ossPath : ossPaths) {
            List<File> matches = Utils.getMatchingSubDirs(ossPath, path.getPathregexCep());
            if (matches != null && !matches.isEmpty()) {
                cepFilesPaths.addAll(matches);
            }
        }

        if (cepFilesPaths.isEmpty()) {
            logger.warn("Generating Sgeh Network Element with non existing path: " + defaultPath + ". Parents:  " + ossPaths + " regex: "
                    + path.getPathregexCep());
            return defaultPath;
        }

        String managedElementDir = "MeContext=" + sgsnId;
        List<File> managedElementPaths = new ArrayList<File>();
        checkForExistingPath(cepFilesPaths, managedElementDir, managedElementPaths);

        if (managedElementPaths.isEmpty()) {
            managedElementDir = "ManagedElement=" + sgsnId;
            checkForExistingPath(cepFilesPaths, managedElementDir, managedElementPaths);
        }

        if (managedElementPaths.isEmpty()) {
            String res = cepFilesPaths.get(0).getAbsolutePath() + File.separatorChar + managedElementDir;
            logger.warn("Generating Sgeh Network Element with non existing path: " + res + ". Parents:  " + cepFilesPaths + " regex: " + managedElementDir);
            return res;
        }

        String nePath = managedElementPaths.get(0).getAbsolutePath();
        if (managedElementPaths.size() > 1) {
            logger.warn("Found more than one matching paths for " + sgsnId + " : " + managedElementPaths + " Using the first one.");
            return nePath;
        }

        logger.info("Computed sucessfully ne path: " + nePath);

        return nePath;
    }

    private void checkForExistingPath(List<File> cepFilesPaths, String managedElementDir, List<File> managedElementPaths) {
        for (File cepFilePath : cepFilesPaths) {
            List<File> matches = Utils.getMatchingSubDirs(cepFilePath, managedElementDir);
            if (matches != null && !matches.isEmpty()) {
                managedElementPaths.addAll(matches);
            }
        }
    }

    String getDefaultPath(String sgsnId) {
        return path.getRootPath() + "events_oss_1" + File.separator + "SgehEvents_CEP" + File.separator + "ManagedElement=" + sgsnId;
    }
}
