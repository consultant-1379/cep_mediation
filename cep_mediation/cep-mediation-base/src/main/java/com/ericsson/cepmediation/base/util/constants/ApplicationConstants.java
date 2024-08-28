/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.base.util.constants;

/**
 * @author eemecoy
 *
 */
public class ApplicationConstants {

    private String cepMediationStartStopLog = "cep-mediation-startstop.log";

    private String adminServer = "AdminServer";

    private String managedNode = "ManagedNode";

    private String logDir = "log.directory";;

    private String configDir = "app-config/";

    private String configFile = "app-config/config.xml";

    private String configFileSelector = "app-config/config_file_selector.properties";

    private static ApplicationConstants instance = new ApplicationConstants();

    public static ApplicationConstants getInstance() {
        return instance;
    }

    private ApplicationConstants() {

    }

    public String getCepMediationStartStopLog() {
        return cepMediationStartStopLog;
    }

    public String getAdminServer() {
        return adminServer;
    }

    public String getManagedNode() {
        return managedNode;
    }

    public String getLogDir() {
        return logDir;
    }

    public String getConfigDir() {
        return configDir;
    }

    public String getConfigFile() {
        return configFile;
    }

    public String getConfigFileSelector() {
        return configFileSelector;
    }

}
