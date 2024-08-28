/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.automation.remoteserver;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.cepmediation.automation.configuration.CEPMediationPropertiesInAutomatedTest;

/**
 * @author eemecoy
 * 
 */
public class RemoteCommandInvoker {

	private static final Logger logger = LoggerFactory.getLogger(RemoteCommandInvoker.class);

	// Default credentials
	private String host = CEPMediationPropertiesInAutomatedTest.getProperty("automatedtest.cep.blade.hostName");
	private String user = CEPMediationPropertiesInAutomatedTest.getProperty("automatedtest.cep.blade.userName");
	private String pass = CEPMediationPropertiesInAutomatedTest.getProperty("automatedtest.cep.blade.password");

	public RemoteCommandInvoker() {
	}

	public RemoteCommandInvoker(String host, String user, String pass) {
		this.host = host;
		this.user = user;
		this.pass = pass;
	}

	public String[] runCommand(String command) {
		return runCommandImpl(command, new SSHConnection(host, user, pass));
	}

	private String[] runCommandImpl(String command, SSHConnection sshConnection) {
		String[] resultOfCommand = sshConnection.executeCommand(command);
		logCommandResult(resultOfCommand);
		return resultOfCommand;
	}

	private void logCommandResult(String[] resultOfCommand) {
		for (String result : resultOfCommand) {
			logger.debug(result);
		}
	}

	public void copyFileToRemoteHost(String localFile, String destinationOnRemoteHost) throws IOException, Exception {
		new SSHConnection(host, user, pass).copyFileToRemoteHost(localFile, destinationOnRemoteHost);
	}
}
