package com.ericsson.cepmediation.base.util;

import java.util.List;

import com.ericsson.cepmediation.base.proc.config.HostConfigBean;
import com.ericsson.cepmediation.base.proc.config.ProcessConfigBean;
import com.ericsson.cepmediation.base.properties.ConfigBinder;
import com.ericsson.cepmediation.base.properties.ConfigurationException;

/**
 * This class contains a main method that prints the configuration of the local machine on the standard output, it
 * is used during the installation to decide what should be installed on the local machine to support CEP Mediation
 * functionality
 * 
 * @author eeilfn
 *
 */
public abstract class LocalConfig {

    /**
     * Main method that prints the local configuration data
     * @param args No arguments used
     */
    public static void main(final String[] args) {
        HostConfigBean hostConfigData = null;

        // Get the local configuration data
        hostConfigData = ConfigBinder.getInstance().getLocalHostConfig();

        // Check if configuration data was found
        if (hostConfigData == null) {
            throw new ConfigurationException("No local configuration data found", ErrorCode.FAILED_LOAD_PROC_DEF);
        }

        // Print the host configuration data
        System.out.println(hostConfigData);

        // Get the process configuration data
        final List<ProcessConfigBean> processConfigBeanList = ConfigBinder.getInstance().getAllLocalProcesses();

        // Check if process configuration data was found
        if (processConfigBeanList == null) {
            throw new ConfigurationException("No process configuration data found", ErrorCode.FAILED_LOAD_PROC_DEF);
        }

        for (final ProcessConfigBean processConfigBean : processConfigBeanList) {
            System.out.println(processConfigBean);
        }
    }
}
