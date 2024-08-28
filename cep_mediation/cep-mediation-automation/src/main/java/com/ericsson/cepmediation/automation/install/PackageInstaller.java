/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.automation.install;

import static com.ericsson.cepmediation.test.common.TestConstants.PACKAGE_INSTALL_CONFIGURED;

import java.io.File;
import java.io.FilenameFilter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.cepmediation.automation.configuration.CEPMediationPropertiesInAutomatedTest;
import com.ericsson.cepmediation.automation.file.LocalMachineFileAgent;
import com.ericsson.cepmediation.automation.remoteserver.RemoteCommandInvoker;

/**
 * @author eemecoy
 * 
 */
public class PackageInstaller {
	private static final Logger logger = LoggerFactory.getLogger(LocalMachineFileAgent.class);

	private RemoteCommandInvoker remoteCommandInvoker;

	private String latestPackageName;

	private String fullPathToLatestPackage;

	public PackageInstaller() {
		String host = CEPMediationPropertiesInAutomatedTest.getProperty("automatedtest.cep.blade.hostName");
		String rootUser = CEPMediationPropertiesInAutomatedTest.getProperty("automatedtest.cep.blade.rootUser");
		String rootPass = CEPMediationPropertiesInAutomatedTest.getProperty("automatedtest.cep.blade.rootPassword");
		remoteCommandInvoker = new RemoteCommandInvoker(host, rootUser, rootPass);
		setUpLatestPackageNameAndLocation();
	}

	private void installPackage() throws Exception {
		if (packageInstallConfigured()) {
			String packageCurrentlyInstalled = getPackageCurrentlyInstalled();
			if (upgradeAvailable(packageCurrentlyInstalled)) {
				uninstallExistingPackage(packageCurrentlyInstalled);
				copyRPMOntoServer();
				installNewPackage();
			} else {
				logger.info("No package upgrade available, currently installed version is " + packageCurrentlyInstalled + ", latest package is "
						+ latestPackageName);
			}
		}
	}

	private boolean upgradeAvailable(String packageCurrentlyInstalled) {
		String latestVersionAvailable = getLatestVersionAvailable();
		return !latestVersionAvailable.equals(packageCurrentlyInstalled);
	}

	private String getLatestVersionAvailable() {
		return latestPackageName.substring(0, latestPackageName.length() - 4);
	}

	private boolean packageInstallConfigured() {
		return CEPMediationPropertiesInAutomatedTest.getBooleanProperty(PACKAGE_INSTALL_CONFIGURED);
	}

	private void installNewPackage() {
		logger.info("Installing package " + latestPackageName);
		remoteCommandInvoker.runCommand("rpm -i /" + latestPackageName);
		stopServer();
	}

	private void setUpLatestPackageNameAndLocation() {
		String projectWorkspace = System.getProperty("WORKSPACE");
		String gitRoot = getGitRoot(projectWorkspace);
		String pathToLatestPackage = gitRoot + "eniq_cep_mediation/workspace/tar/packages/";
		File folder = new File(pathToLatestPackage);
		logger.info("listing files in " + pathToLatestPackage);
		String[] rpmFiles = folder.list(new FilenameFilter() {

			@Override
			public boolean accept(File arg0, String arg1) {
				return arg1.startsWith("ERICcep");
			}
		});
		latestPackageName = rpmFiles[0];
		fullPathToLatestPackage = pathToLatestPackage + "/" + latestPackageName;
	}

	private String getGitRoot(String projectWorkspace) {
		String key = "jobs";
		int endIndex = projectWorkspace.indexOf(key) + key.length() + 1;
		return projectWorkspace.substring(0, endIndex);
	}

	private void uninstallExistingPackage(String packageCurrentlyInstalled) {
		if (packageCurrentlyInstalled != null) {
			// stop the server in case it is running
			stopServer();
			String uninstallCommand = "rpm -e " + packageCurrentlyInstalled;
			logger.info("Uninstalling existing package with " + uninstallCommand);
			remoteCommandInvoker.runCommand(uninstallCommand);
		}
	}

	private void stopServer() {
		String stopServerCommand = "service cep-mediation stop";
		logger.info("Stopping server in case it is running: " + stopServerCommand);
		remoteCommandInvoker.runCommand(stopServerCommand);
		sleep(10 * 1000);
	}

	private void sleep(long millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			logger.error("Sleep interrupted", e);
		}
	}

	private String getPackageCurrentlyInstalled() {
		String[] rpmVersionCurrentlyInstalled = remoteCommandInvoker.runCommand("rpm -qa | grep cep");
		if (rpmVersionCurrentlyInstalled.length == 0) {
			logger.info("No rpm currently installed");
			return null;
		}
		return rpmVersionCurrentlyInstalled[0];
	}

	private void copyRPMOntoServer() throws Exception {
		remoteCommandInvoker.copyFileToRemoteHost(fullPathToLatestPackage, "/");
	}

	public static void main(String[] args) throws Exception {
		new PackageInstaller().installPackage();
	}

}
