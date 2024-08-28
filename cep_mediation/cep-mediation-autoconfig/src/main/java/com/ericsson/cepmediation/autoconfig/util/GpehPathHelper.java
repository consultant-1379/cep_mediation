package com.ericsson.cepmediation.autoconfig.util;

import java.io.File;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.cepmediation.autoconfig.properties.AutoconfigProperties;
import com.ericsson.cepmediation.autoconfig.properties.AutoconfigProperties.NEPath;
import com.ericsson.cepmediation.base.database.iq.IqDatabaseManager;

/**
 * This class computes the path to the NE files by given RNC id.
 * 
 * The gpeh NE files path should look like: /eniq/data/eventdata/events_oss_1/GpehEvents_CEP/SubNetwork=RNC09
 * The root part of the path(/eniq/data/eventdata) is specified in the config file. The oss part of
 * the path(events_oss_1) is determined by topology tables. The GpehEvents_CEP part is determined by
 * matching actual subfolders of events_oss_1 with a regex from config file.
 * 
 * In case the ne dir does not exist, default path is returned and a warning is logged so that
 * the user can manually change the path in the generated file. 
 * 
 * @author emicned
 *
 */
public class GpehPathHelper {
    static final String SUB_NETWORK_PATH_PART = "SubNetwork=";

    static final String GPEH_EVENTS_CEP = "GpehEvents_CEP";

    static final Logger logger = LoggerFactory.getLogger(GpehPathHelper.class);

    NEPath path;

    Map<String, String> rncId2ossId;

    public GpehPathHelper() {
        try {
            path = AutoconfigProperties.instance.getGpehPath();
            rncId2ossId = IqDatabaseManager.getInstance().getRncId2OssIdMappings();
        } catch (Throwable e) {
            logger.error("Error initializing GpehPathHelper.", e);
        }
    }
    
    // needed for JUnit, unit testing without DI is a pain...
    public GpehPathHelper(Map<String, String> rncId2ossId, NEPath path) {
        this.path = path;
        this.rncId2ossId = rncId2ossId;
    }

    public String getNEPath(String rncId) {
        logger.info("Constructing ne path for " + rncId);
        
        if (rncId2ossId == null || rncId2ossId.isEmpty()) {
            logger.warn("rncId 2 ossId topology table is empty. Skipping rnc NE generation althogether.");
            return null;
        }

        String ossId = rncId2ossId.get(rncId);
        if (ossId == null || ossId.isEmpty()) {
            logger.warn("RncId: " + rncId + " not present in topology table(dim_e_ran_rncfunction). Skipping it...");
            return null;
        }

        String defaultPath = getDefaultPath(ossId, rncId);

        File ossPath = getFirstMatch(new File(path.getRootPath()), ossId);
        if (ossPath == null) {
            logger.warn("Generating Network Element with non existing path:" + defaultPath + " Parent: " + path.getRootPath() + " regex: " + ossId);
            return defaultPath;
        }

        File cepFilesPath = getFirstMatch(ossPath, path.getPathregexCep());
        if (cepFilesPath == null) {
            logger.warn("Generating Network Element with non existing path: " + defaultPath + " Parent:  " + ossPath + " regex: " + path.getPathregexCep());
            return defaultPath;
        }

        String subNetworkDir = "SubNetwork=" + rncId;
        File nePath = getFirstMatch(cepFilesPath, subNetworkDir);
        if (nePath == null) {
            String res = cepFilesPath.getAbsolutePath() + File.separator + subNetworkDir;
            logger.warn("Generating Network Element with non existing path:" + res + " Parent: " + cepFilesPath + " regex: " + subNetworkDir);
            return res;
        }

        logger.info("Computed sucessfully ne path: " + nePath.getAbsolutePath());

        return nePath.getAbsolutePath();
    }

    File getFirstMatch(File parent, String regex) {
        List<File> matches = Utils.getMatchingSubDirs(parent, regex);

        if (matches == null || matches.isEmpty()) {
            return null;
        }

        if (matches.size() > 1) {
            logger.warn("Found more than one dirs matching the regex : " + regex + " under: " + parent.getAbsolutePath() + ": " + matches
                    + ". Using the first one.");
        }

        return matches.get(0);
    }

    String getDefaultPath(String ossId, String rncId) {
        return path.getRootPath() + ossId + File.separator + GPEH_EVENTS_CEP + File.separatorChar + SUB_NETWORK_PATH_PART + rncId;
    }
}