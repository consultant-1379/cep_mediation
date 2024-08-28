/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.automation.launcher;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.cepmediation.automation.configuration.CEPMediationPropertiesInAutomatedTest;
import com.ericsson.cepmediation.automation.file.FileAgent;
import com.ericsson.cepmediation.automation.file.RemoteMachineFileAgent;
import com.ericsson.cepmediation.automation.remoteserver.RemoteCommandInvoker;
import com.ericsson.cepmediation.automation.sql.SQLCommand;
import com.ericsson.cepmediation.base.resourceloading.ResourceFileFinder;
import com.ericsson.cepmediation.base.resourceloading.ResourceLoadingFailedException;
import com.ericsson.cepmediation.base.util.FileUtils;

/**
 * This class launches CEP Mediation on the remote server specified. Before luanching,
 * it prepares the server: copies config files, cleans up database etc.
 * 
 * @author emicned
 *
 */
public class ApplicationLauncher {
    private static final Logger logger = LoggerFactory.getLogger(ApplicationLauncher.class);

    private static final String INPUT_FILES_ZIP = "inputFiles.zip";

    private static final String CEP_MEDIATION_COMMAND = "service cep-mediation ";

    private static final String APP_CONFIG_PATH = "/opt/ericsson/cep-mediation/cep-mediation/etc/app-config/";

    private static final String HOME_PATH = CEPMediationPropertiesInAutomatedTest.getProperty("automatedtest.home.dir");

    public static final String SNAPSHOTS_PATH = HOME_PATH + File.separator + "snapshots";

    private static final String INPUT_PATH = HOME_PATH + File.separator + "input";

    private static final String BACKUP_PATH = HOME_PATH + File.separator + "backup";

    private static final String OUTPUT_PATH = HOME_PATH + File.separator + "output";

    private static final String TOPOLOGY_PATH = HOME_PATH + File.separator + "topology";

    private static final String TOPOLOGY_LOAD_CMD = ". .profile; dbisql -c \"UID=dc;PWD=dc;ENG=dwhdb;LINKS=TCPIP(host=localhost;port=2640;dobroadcast=DIRECT)\" -nogui input into %s from %s FORMAT TEXT;";

    private ResourceFileFinder finder = new ResourceFileFinder();

    private RemoteCommandInvoker remoteScriptInvoker;

    private RemoteCommandInvoker remoteScriptInvokerRoot;

    private RemoteCommandInvoker dbServerScriptInvoker;

    private FileAgent fileAgent = new RemoteMachineFileAgent();

    public ApplicationLauncher() {
        remoteScriptInvoker = new RemoteCommandInvoker();

        String host = CEPMediationPropertiesInAutomatedTest.getProperty("automatedtest.cep.blade.hostName");
        String rootUser = CEPMediationPropertiesInAutomatedTest.getProperty("automatedtest.cep.blade.rootUser");
        String rootPass = CEPMediationPropertiesInAutomatedTest.getProperty("automatedtest.cep.blade.rootPassword");
        remoteScriptInvokerRoot = new RemoteCommandInvoker(host, rootUser, rootPass);

        String dbHost = CEPMediationPropertiesInAutomatedTest.getProperty("automatedtest.eniq.events.db.serverName");
        String dbUser = CEPMediationPropertiesInAutomatedTest.getProperty("automatedtest.eniq.events.db.server.user");
        String dbPass = CEPMediationPropertiesInAutomatedTest.getProperty("automatedtest.eniq.events.db.server.pass");
        dbServerScriptInvoker = new RemoteCommandInvoker(dbHost, dbUser, dbPass);
    }

    public void runApplication() throws Exception {
        logger.info("Checking topology data...");
        checkTopology();

        logger.info("Stopping the application in case it is running...");
        remoteScriptInvokerRoot.runCommand(CEP_MEDIATION_COMMAND + "stop");
        // allow some time for the application to stop
        Thread.sleep(30000);

        String cleanBinariesCmd = "find /eniq/data/etldata_ -type f | xargs rm";
        logger.info("Cleaning binaries: " + cleanBinariesCmd);
        remoteScriptInvoker.runCommand(cleanBinariesCmd);

        String cleanInputFilesCmd = "find " + INPUT_PATH + " -type f | xargs rm";
        logger.info("Cleaning input folder: " + cleanInputFilesCmd);
        remoteScriptInvoker.runCommand(cleanInputFilesCmd);

        String cleanOutputFilesCmd = "rm -rf " + OUTPUT_PATH + File.separator + "*";
        logger.info("Cleaning output folder: " + cleanOutputFilesCmd);
        remoteScriptInvoker.runCommand(cleanOutputFilesCmd);

        logger.info("Checking internal dirs...");
        checkRemoteFolders();

        logger.info("Checking input files...");
        checkInputFiles();

        logger.info("Cleaning database...");
        cleanDatabase();

        logger.info("Copying config files...");
        copyConfigFiles();

        logger.info("Starting the application...");
        remoteScriptInvokerRoot.runCommand(CEP_MEDIATION_COMMAND + "start");
    }

    private void checkTopology() throws Exception {
        Map<String, String> table2topologyfile = new HashMap<String, String>();
        table2topologyfile.put("DIM_E_RAN_RNC", "topology/DIM_E_RAN_RNC.dbf");
        table2topologyfile.put("DIM_E_RAN_RNCFUNCTION", "topology/DIM_E_RAN_RNCFUNCTION.dbf");
        table2topologyfile.put("DIM_E_SGEH_HIER321_CELL", "topology/DIM_E_SGEH_HIER321_CELL.dbf");
        table2topologyfile.put("DIM_E_SGEH_HIER321", "topology/DIM_E_SGEH_HIER321.dbf");

        for (Map.Entry<String, String> entry : table2topologyfile.entrySet()) {
            InputStream file = finder.findResourceFile(entry.getValue());
            List<String> lines = FileUtils.readFile(file);
            int fileRecords = lines.size();
            int dbRecords = getDbRecords(entry.getKey());
            if (fileRecords != dbRecords) {
                logger.info(String.format("Topology data missmatch for table %s: found %s records but %s were expected. Reloading data...", entry.getKey(),
                        dbRecords, fileRecords));
                new SQLCommand().executeUpdate("delete from " + entry.getKey());
                dbServerScriptInvoker.runCommand("mkdir -p " + TOPOLOGY_PATH);
                File tmp = createTmpFile(entry.getValue());
                String remoteFilePath = TOPOLOGY_PATH + File.separator + entry.getKey() + ".dbf";
                dbServerScriptInvoker.copyFileToRemoteHost(tmp.getAbsolutePath(), remoteFilePath);
                String topologyLoadCmd = String.format(TOPOLOGY_LOAD_CMD, entry.getKey(), remoteFilePath);
                logger.info("Loading topology data: " + topologyLoadCmd);
                dbServerScriptInvoker.runCommand(topologyLoadCmd);
                logger.info("Topology loaded successfully");
                tmp.delete();
            } else {
                logger.info("Topology records in database and topology file match. Number of records: " + dbRecords);
            }
        }
    }

    private int getDbRecords(String table) {
        List<Map<String, String>> res = new SQLCommand().executeQuery("SELECT count(*) as cnt FROM " + table);
        try {
            return Integer.parseInt(res.get(0).get("cnt"));
        } catch (Exception e) {
            return -1;
        }
    }

    public void stopApplication() {
        logger.info("Stopping the application...");
        remoteScriptInvokerRoot.runCommand(CEP_MEDIATION_COMMAND + "stop");
    }

    private void cleanDatabase() {
        SQLCommand sqlCommand = new SQLCommand(); 
        String tableNameAlias = "table_name";
        String tableNamesQuery = "SELECT name as " + tableNameAlias + " FROM sysobjects WHERE type = 'U' AND (name LIKE '%event_e_ran_session%' or name LIKE 'event_e_ran_cfa_err%' or name LIKE 'event_e_ran_hfa%')";
        List<Map<String, String>> tableNames = sqlCommand.executeQuery(tableNamesQuery);
        logger.debug("Table names: " + tableNames);
        if (tableNames.isEmpty()) {
            String server = CEPMediationPropertiesInAutomatedTest.getProperty("automatedtest.eniq.events.db.serverName");
            throw new RuntimeException("Ran session tables not found in db. DB server: " + server + "; table names query: " + tableNamesQuery);
        }

        for (Map<String, String> cols : tableNames) {
            String tableName = cols.get(tableNameAlias);
            sqlCommand.executeUpdate("delete from " + tableName);
        }
    }

    private void checkInputFiles() {
        String allInputFilesPath = BACKUP_PATH + File.separator + INPUT_FILES_ZIP;
        if (!fileAgent.doesFileExist(allInputFilesPath)) {
            logger.info("Remote file does not exist: " + allInputFilesPath + ". Copying it...");
            copyFile("ne_files" + File.separator + INPUT_FILES_ZIP, INPUT_FILES_ZIP, BACKUP_PATH, remoteScriptInvoker);
        }

        String command = "unzip -o " + BACKUP_PATH + File.separator + INPUT_FILES_ZIP + " -d " + INPUT_PATH;
        logger.info("Unzipping inputFiles: " + command);
        remoteScriptInvoker.runCommand(command);
    }

    private void checkRemoteFolders() {
        if (!fileAgent.doesFileExist(HOME_PATH)) {
            logger.debug("creating dir: " + HOME_PATH);
            fileAgent.createFolder(HOME_PATH);
        }

        if (!fileAgent.doesFileExist(SNAPSHOTS_PATH)) {
            logger.debug("creating dir: " + SNAPSHOTS_PATH);
            fileAgent.createFolder(SNAPSHOTS_PATH);
        }

        if (!fileAgent.doesFileExist(INPUT_PATH)) {
            logger.debug("creating dir: " + INPUT_PATH);
            fileAgent.createFolder(INPUT_PATH);
        }

        if (!fileAgent.doesFileExist(BACKUP_PATH)) {
            logger.debug("creating dir: " + BACKUP_PATH);
            fileAgent.createFolder(BACKUP_PATH);
        }

        if (!fileAgent.doesFileExist(OUTPUT_PATH)) {
            logger.debug("creating dir: " + OUTPUT_PATH);
            fileAgent.createFolder(OUTPUT_PATH);
        }
    }

    private void copyFile(String localPath, String name, String remoteDir, RemoteCommandInvoker invoker) {
        try {
            File tmp = createTmpFile(localPath);
            logger.info("Tmp file written. Copying to remote host: " + remoteDir);
            invoker.copyFileToRemoteHost(tmp.getAbsolutePath(), remoteDir + File.separator + name);
            logger.info("remote file copied!");
            tmp.delete();
        } catch (IOException e) {
            logger.error("Error creating tmp file! " + " Local path: " + localPath + " name: " + name + " remote path: " + remoteDir + " Error:"
                    + e.getMessage());
            throw new RuntimeException(e);
        } catch (ResourceLoadingFailedException e) {
            logger.error("File not found! " + " Local path: " + localPath + " name: " + name + " remote path: " + remoteDir + " Error:" + e.getMessage());
            throw new RuntimeException(e);
        } catch (Exception e) {
            logger.error("Error copying file! " + "Local path: " + localPath + " name: " + name + " remote path: " + remoteDir + " Error: " + e.getMessage());
            throw new RuntimeException(e);
        }
    }

    private File createTmpFile(String localPath) throws ResourceLoadingFailedException, IOException, FileNotFoundException {
        InputStream in = finder.findResourceFile(localPath);
        logger.debug("located local file: " + localPath);
        File tmp = File.createTempFile("cepTempFile", "");
        logger.debug("created tmp file: " + tmp.getAbsolutePath());
        OutputStream out = new FileOutputStream(tmp);
        int i = -1;
        while ((i = in.read()) != -1) {
            out.write(i);
        }
        in.close();
        out.close();
        return tmp;
    }

    private void copyConfigFiles() throws Exception {
        logger.info("Copying custom config files");
        copyFile("automated_test_config/config.xml", "config.xml", APP_CONFIG_PATH, remoteScriptInvokerRoot);
        copyFile("automated_test_config/network_elements.xml", "network_elements.xml", APP_CONFIG_PATH, remoteScriptInvokerRoot);
        copyFile("automated_test_config/standalone.xml", "standalone.xml", APP_CONFIG_PATH, remoteScriptInvokerRoot);
        copyFile("automated_test_config/hazelcast.xml", "hazelcast.xml", APP_CONFIG_PATH, remoteScriptInvokerRoot);
        copyFile("automated_test_config/log4j.properties", "log4j.properties", APP_CONFIG_PATH, remoteScriptInvokerRoot);
    }
}
