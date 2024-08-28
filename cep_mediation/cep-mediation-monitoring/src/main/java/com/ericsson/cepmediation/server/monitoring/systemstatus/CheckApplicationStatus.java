/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.server.monitoring.systemstatus;

import com.ericsson.cepmediation.base.properties.CepMediationProperties;
import com.ericsson.cepmediation.base.properties.CepMediationProperty;
import com.ericsson.cepmediation.base.util.constants.ApplicationConstants;
import com.ericsson.cepmediation.base.util.constants.SystemExitCode;
import com.ericsson.cepmediation.server.management.CepMediationServer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import static com.ericsson.cepmediation.base.util.constants.SystemExitCode.SYSTEM_EXIT_CODE_NOK;
import static com.ericsson.cepmediation.base.util.constants.SystemExitCode.SYSTEM_EXIT_CODE_OK;

/**
 * @author eemecoy
 *
 */
public class CheckApplicationStatus {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    private CepMediationServer server;

    public SystemExitCode checkApplicationStatus() {
	    logger.info("Checking application status...");
        final SystemExitCode statusCode = checkIfServerIsAvailable();
        if (isServerAvailable(statusCode)) {
            return checkIfServerIsAlive();
        }
        return statusCode;
    }

    private boolean isServerAvailable(final SystemExitCode statusCode) {
        return statusCode == SYSTEM_EXIT_CODE_OK;
    }

    private SystemExitCode checkIfServerIsAlive() {
        try {
            final boolean isAlive = server.isAlive();
            if (!isAlive) {
	            logger.info("Application is not alive.");
                logMessageToLogsAndConsole("Application is not alive");
                return SYSTEM_EXIT_CODE_NOK;
            }
            System.out.println("Application is running");
            logger.info("Application is running");
            return SYSTEM_EXIT_CODE_OK;

        } catch (final RemoteException e) {
            logExceptionToLogsAndConsole(e, "Could not call method on RMI service");
            return SYSTEM_EXIT_CODE_NOK;
        }
    }

    private void logMessageToLogsAndConsole(final String message) {
        System.out.println(message);
        logger.debug(message);
    }

    private SystemExitCode checkIfServerIsAvailable() {
        try {
            server = getRMIService(ApplicationConstants.getInstance().getAdminServer());
        } catch (final Exception e) {
	        logger.info("Applcation is not started.");
            logExceptionToLogsAndConsole(e, "Application is not started");
            return SYSTEM_EXIT_CODE_NOK;
        }
        return SYSTEM_EXIT_CODE_OK;
    }

    private void logExceptionToLogsAndConsole(final Exception e, final String errorMessage) {
        final String errorMessageIncludingRootException = errorMessage + e.getMessage();
        System.out.println(errorMessage);
        logger.debug(errorMessageIncludingRootException, e);
    }

    private CepMediationServer getRMIService(final String serviceName) throws MalformedURLException, RemoteException, NotBoundException {
        final String rmiServiceAddress = putTogetherRMIServiceAddress(serviceName);
        return lookUpRMIService(rmiServiceAddress);
    }

    CepMediationServer lookUpRMIService(final String rmiServiceAddress) throws NotBoundException, MalformedURLException, RemoteException {
        return (CepMediationServer) Naming.lookup(rmiServiceAddress);
    }

    private String putTogetherRMIServiceAddress(final String serviceName) {
        final int rmiPort = getConfiguredRMIPort();
        return "//localhost:" + rmiPort + "/" + serviceName;
    }

    int getConfiguredRMIPort() {
        return CepMediationProperties.getIntProperty(CepMediationProperty.JAVA_RMI_SERVER_PORT);
    }
}
