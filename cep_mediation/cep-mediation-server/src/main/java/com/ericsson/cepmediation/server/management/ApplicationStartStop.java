package com.ericsson.cepmediation.server.management;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.cepmediation.base.proc.config.HostConfigBean;
import com.ericsson.cepmediation.base.properties.ConfigBinder;
import com.ericsson.cepmediation.base.properties.ConfigurationException;
import com.ericsson.cepmediation.base.properties.PropertyValidator;
import com.ericsson.cepmediation.base.status.StartStopStatusUpdate;
import com.ericsson.cepmediation.base.util.constants.SystemExitCode;
import com.ericsson.cepmediation.config.bean.AppStartTypeEnum;
import com.ericsson.cepmediation.server.management.status.startupstatus.MonitorCentre;

public abstract class ApplicationStartStop {
    private static final Logger logger = LoggerFactory.getLogger(ApplicationStartStop.class);

    /**
     * The command line arguments, should be "start" or "stop"
     */
    public static void main(final String[] args) {
        logger.info("ApplicationStartStop>>>");
        // Sanity check the arguments
        if (args.length != 1 || (args.length == 1 && (!args[0].equalsIgnoreCase("start")) && !args[0].equalsIgnoreCase("stop"))) {
            sendStatusUpdate(StartStopStatusUpdate.INCORRECT_USAGE);
            logger.error("usage: ApplicationStartStop <start|stop>");
            System.exit(SystemExitCode.SYSTEM_EXIT_CODE_NOK.getValue());
        }
        
        ConfigBinder.getInstance().printNetworkElements();

        final boolean startStopFlag = (args[0].equalsIgnoreCase("start") ? true : false);

        logger.info("ApplicationStartStop(" + args[0] + ")");

        // do licence check
        if (startStopFlag) {
            new LicenceChecker();
        }

        // Load the configuration file for the application to find out if the local machine is a master or slave host
        boolean master = false;

        try {

            final List<AppStartTypeEnum> appStartTypeEnumList = ConfigBinder.getInstance().getAppStartTypes();
            for (AppStartTypeEnum appStartTypeEnum : appStartTypeEnumList) {
                new PropertyValidator().checkStartUpPropertiesPresent(appStartTypeEnum);
            }

            // Get the host configuration for the local host
            final HostConfigBean localHostConfigBean = ConfigBinder.getInstance().getLocalHostConfig();
            sendStatusUpdate(StartStopStatusUpdate.SUCCESSFULLY_LOADED_SYSTEM_CONFIGURATION);

            // Check if local host configuration has been found
            if (localHostConfigBean == null) {
                sendStatusUpdate(StartStopStatusUpdate.NO_CONFIGURATION_INFORMATION_FOR_LOCAL_HOST_FOUND_IN_CONFIGURATION_FILE);
                logger.error("no configuration information for local host found in configuration file");
                System.exit(SystemExitCode.SYSTEM_EXIT_CODE_NOK.getValue());
            }
            sendStatusUpdate(StartStopStatusUpdate.CONFIGURATION_INFORMATION_FOR_LOCAL_HOST_FOUND);
            
            // validate the configuration information on startup
            if (startStopFlag) {
            	try {         	
            		ConfigBinder.getInstance().validateConfiguration();
            	} catch (ConfigurationException ce) {
            		sendStatusUpdate(StartStopStatusUpdate.FAILED_TO_VALIDATE_THE_CONFIGURATION_INFORMATION);
            		logger.error("Failed to validate the configuration information", ce);
            		System.exit(SystemExitCode.SYSTEM_EXIT_CODE_NOK.getValue());
            	}
            }

            master = localHostConfigBean.isMaster();
        } catch (final ConfigurationException e) {
            sendStatusUpdate(StartStopStatusUpdate.FAILED_TO_LOAD_SYSTEM_CONFIGURATION);
            logger.error("could not connect to master server, failed to load system configuration", e);
            System.exit(SystemExitCode.SYSTEM_EXIT_CODE_NOK.getValue());
        }

        // Start the local host as a master or slave
        if (master) {
            // Start a master host locally
            new MasterHostManagementServer().startStop(startStopFlag);
        } else {
            // Start a slave host locally
            SlaveHostManagementServer.startStop(startStopFlag);
        }
        
        logger.info("ApplicationStartStop<<<");

    }
    private static void sendStatusUpdate(final StartStopStatusUpdate statusUpdate) {
        MonitorCentre.getMonitor().statusUpdate(statusUpdate);
    }
}
