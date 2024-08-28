/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.automation.remoteserver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.cepmediation.loading.filecollection.ssh.SSHCommandResult;
import com.jcraft.jsch.JSch;

public class SSHConnection {

	private static final Logger logger = LoggerFactory.getLogger(SSHConnection.class);

	private SuperSSHExecuter sshExecuter;

	public SSHConnection(String host, String user, String pass) {
		sshExecuter = new SuperSSHExecuter(host, user, pass);
		JSch.setLogger(new SilentSshLogger());
	}

	public String[] executeCommand(String command) {
		try {
			logger.debug("Running command: " + command);
			openConnection();
			SSHCommandResult executeResult = sshExecuter.execute(command);
			checkSSHCommandResult(executeResult);
			String[] resultOfCommand = getResultOfCommand(executeResult);
			return resultOfCommand;
		} finally {
			closeConnection();
		}
	}

	private void closeConnection() {
		SSHCommandResult closeResult = sshExecuter.close();
		checkSSHCommandResult(closeResult);
	}

	private void openConnection() {
		SSHCommandResult openResult = sshExecuter.open();
		checkSSHCommandResult(openResult);
	}

	private String[] getResultOfCommand(SSHCommandResult executeResult) {
		return executeResult.getRemoteOutput();
	}

	private void checkSSHCommandResult(SSHCommandResult sshResult) {
		if (sshResult.getResultCode() != SSHResultCode.OK) {
			// throw new RuntimeException("SSH command failed, " + sshResult);
			logger.debug("Command failed, " + sshResult);
		}
	}

	public void copyFileToRemoteHost(String localFile, String destinationOnRemoteHost) throws Exception {
		try {
			openConnection();
			sshExecuter.copyTo(localFile, destinationOnRemoteHost);
		} finally {
			closeConnection();
		}
	}

}
