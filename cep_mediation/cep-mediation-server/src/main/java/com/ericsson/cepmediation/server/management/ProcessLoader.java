/**
 * (C) Copyright LM Ericsson System Expertise AT/LMI, 2011
 *
 * The copyright to the computer program(s) herein is the property of Ericsson
 * System Expertise EEI, Sweden. The program(s) may be used and/or copied only
 * with the written permission from Ericsson System Expertise AT/LMI or in
 * accordance with the terms and conditions stipulated in the agreement/contract
 * under which the program(s) have been supplied.
 *
 */
package com.ericsson.cepmediation.server.management;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.cepmediation.base.features.FeatureManager;
import com.ericsson.cepmediation.base.features.impl.FeatureManagerImpl;
import com.ericsson.cepmediation.base.proc.config.PROC_TYPE;
import com.ericsson.cepmediation.base.proc.config.ProcessConfigBean;
import com.ericsson.cepmediation.base.properties.ConfigBinder;
import com.ericsson.cepmediation.base.properties.ConfigurationException;
import com.ericsson.cepmediation.base.properties.StandaloneConfigBinder;
import com.ericsson.cepmediation.base.service.ApplicationFactory;
import com.ericsson.cepmediation.base.service.ServiceException;
import com.ericsson.cepmediation.base.util.ConfigData;

/**
 * This class responsible for loading all enabled services in the config.xml file
 * @category Server
 * @author eachsaj
 *
 */
public class ProcessLoader {
    //instance of the Logger
    private static final Logger logger = LoggerFactory.getLogger(ProcessLoader.class);

    //instance of this class
    private static ProcessLoader instance;

    // Server  configuration bean instance.
    private ConfigData configurationData;

    private ConfigBinder servicehelper;

    // All processes defined for this server, which is defined in the config.xml file
    private List<ProcessConfigBean> processConfigBeanList;

    /*
     * This method initializes configuration data, 
     */
    public void init(final ConfigData config) {
        logger.debug("init()-->");
        servicehelper = ConfigBinder.getInstance();
        configurationData = config;
        // all services defined for this server, which is defined in the config.xml file
        // Lock this map to prevent any runtime modifications
        processConfigBeanList = new ArrayList<ProcessConfigBean>(servicehelper.getAllLocalProcesses());
        FeatureManager featureManager = FeatureManagerImpl.getInstance();
        if (featureManager.isCFAEnabled() || featureManager.isHFAEnabled()) {
            logger.info("Looking for standalone process definition...");
            ProcessConfigBean standaloneProcess = StandaloneConfigBinder.getInstance().getLocalStandaloneProcessConfig();
            if (standaloneProcess != null) {
                if (processConfigBeanList.isEmpty()) {
                    standaloneProcess.setProcessType(PROC_TYPE.SERVER);
                }
                logger.info("Found standalone process definition: " + standaloneProcess);
                processConfigBeanList.add(standaloneProcess);
            } else {
                logger.info("Standalone definition for localhost not found.");
            }
        } else {
            logger.info("Neither CFA nor HFA is enabled, standalone application will not be started.");
        }

        logger.debug("init()<--");
    }

    /*
     * private constructor to support singleton instance.
     */
    private ProcessLoader() {
    }

    /**Singleton instance creation/access method  
     * @return instance of this class.
     */
    public static ProcessLoader getInstance() {
        logger.debug("getInstance()-->");
        if (instance == null) {
            instance = new ProcessLoader();
        }
        logger.debug("getInstance()<--");
        return instance;
    }

    public void startProcesses() throws ServiceException {
        logger.debug("startProcesses()-->");

        logger.debug("starting " + processConfigBeanList.size() + " processes . . .");
        for (final ProcessConfigBean processBean : processConfigBeanList) {
            // get service definition sequentially
            logger.debug("starting service: " + processBean);
            ApplicationFactory.create(processBean.getProcessType(), processBean, configurationData);
        }
        logger.debug("processes started");

        logger.debug("startProcesses()<--");
    }

    public void stopProcesses() throws ServiceException {
        logger.debug("stopProcesses()-->");

        // Check if any services have been started
        logger.debug("stopping " + processConfigBeanList.size() + " processes . . .");
        for (final ProcessConfigBean processBean : processConfigBeanList) {
            // get service definition sequentially
            logger.debug("stopping service: " + processBean);
            ApplicationFactory.remove(processBean.getProcessType(), processBean);
        }
        logger.debug("processes stopped");

        logger.debug("stopProcesses()<--");
    }

    public static void main(final String[] args) throws ConfigurationException, ServiceException {
        final ProcessLoader loader = ProcessLoader.getInstance();
        loader.init(loader.configurationData);
        loader.startProcesses();

        try {
            Thread.sleep(10000);
        } catch (final InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        loader.stopProcesses();
    }

}
