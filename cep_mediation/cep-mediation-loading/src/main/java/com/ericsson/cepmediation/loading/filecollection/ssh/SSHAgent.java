package com.ericsson.cepmediation.loading.filecollection.ssh;

import java.io.File;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import java.util.TreeSet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.cepmediation.base.util.FileServerData;
import com.ericsson.cepmediation.loading.filecollection.CollectionAgent;
import com.ericsson.cepmediation.loading.filecollection.CollectionException;

/**
 * This class implements helper methods to wrap commands towards OSS machines using SSH.
 * 
 * @author eeilfn
 *
 */
public class SSHAgent implements CollectionAgent {
    // Get a reference to the logger
    private static final Logger logger = LoggerFactory.getLogger(SSHAgent.class);

    // SSH executer instance for this class
    SSHExecuter sshExecuter = null;

    /**
     * Constructor, use the configuration data to set up a SSH executer
     * @param agentConfigurationData
     */
    public SSHAgent(final FileServerData fileServerData) {
        if (logger.isTraceEnabled()) {
            logger.trace("SSHAgent: data=" + fileServerData);
        }

        // Instantiate the SSH executer for this class
        sshExecuter = createSSHExecutor(fileServerData);
    }

    /**
     * extracting to help get class under test
     */
    SSHExecuter createSSHExecutor(final FileServerData fileServerData) {
        return new SSHExecuter(fileServerData.getServerIP(), fileServerData.getServerUser(), fileServerData.getServerPassword());
    }

    /* (non-Javadoc)
     * @see com.ericsson.cepmediation.loading.ssh.CollectionAgent#listDirectories(java.lang.String)
     */
    @Override
    public String[] listDirectories(final String path) throws CollectionException {
        logger.trace("listDirectories(" + path + ')');

        // Open the SSH connection
        SSHCommandResult sshCommandResult = sshExecuter.open();
        if (sshCommandResult.getResultCode() != 0) {
            throw new CollectionException(getExceptionMessage(sshCommandResult));
        }

        // List the directories
        sshCommandResult = sshExecuter.execute("ls -d " + path);
        sshExecuter.close();

        // Get the directory listing
        switch (sshCommandResult.getResultCode()) {
        // Listing worked
        case 0: {
            return sshCommandResult.getRemoteOutput();
        }

        // No such file or directory
        case 1: {
            logger.warn(sshCommandResult.toString());
            return null;
        }

        // Cannot access file, No such file or directory
        case 2: {
            logger.warn(sshCommandResult.toString());
            return null;
        }

        // Other errors
        default: {
            throw new CollectionException(getExceptionMessage(sshCommandResult));
        }
        }
    }

    private String getExceptionMessage(final SSHCommandResult sshCommandResult) {
        return sshCommandResult.toString() + ", resultCode: " + sshCommandResult.getResultCode();
    }

    /* (non-Javadoc)
     * @see com.ericsson.cepmediation.loading.ssh.CollectionAgent#listRemoteFiles(java.lang.String[], java.lang.String)
     */
    @Override
    public TreeSet<String> listFiles(final String[] paths, final String regexPattern) throws CollectionException {
        logger.trace("listRemoteFiles(" + Arrays.toString(paths) + ')');

        // Hold the list of files for all directories
        final TreeSet<String> remoteFileList = new TreeSet<String>();

        // Open the SSH connection
        SSHCommandResult sshCommandResult = sshExecuter.open();
        if (sshCommandResult.getResultCode() != 0) {
            throw new CollectionException(getExceptionMessage(sshCommandResult));
        }

        String commandExtension = " -regex '" + regexPattern + "'";
        commandExtension = modifyCommandExtension(regexPattern);

        // Iterate over each directory
        for (final String path : paths) {
            // List the files in the directory
            sshCommandResult = sshExecuter.execute("find " + path + commandExtension);
            if (sshCommandResult.getResultCode()  != 0) {
                logger.info("path " + path + " cannot able to be opened. (may be not exist). error is : "  + getExceptionMessage(sshCommandResult));
            }else{
                //Add this list of files to the total list of files
                remoteFileList.addAll(Arrays.asList(sshCommandResult.getRemoteOutput()));    
            }
        }
        closeSSHConnection();
        
        // Return the list of files
        if (logger.isTraceEnabled()) {
            logger.trace("listRemoteFiles:" + Arrays.toString(remoteFileList.toArray(new String[0])));
        }
        return remoteFileList;
    }
    
    private void closeSSHConnection(){
        // Close the SSH connection
        sshExecuter.close();
    }

    private String modifyCommandExtension(final String regexPattern) {
        final SSHCommandResult sshCommandResult = sshExecuter.execute("uname");
        final boolean modificationRequired = sshCommandResult.getRemoteOutput()[0].equalsIgnoreCase("SunOs");
        if (modificationRequired && regexPattern.contains("gpeh")) {
            return " -name '*gpeh*'";
        } else if (modificationRequired && regexPattern.contains("ebs")) {
            return " -name '*ebs*'";
        } else if (modificationRequired && regexPattern.contains("summary")) {
            return " -name '*summary*'";
        } else if (modificationRequired && regexPattern.contains("tcpta-partial")) {
            return " -name '*tcpta-partial*'";
        }
        return " -regex '" + regexPattern + "'";
    }

    /* (non-Javadoc)
     * @see com.ericsson.cepmediation.loading.ssh.CollectionAgent#getRemoteFiles(java.util.List, java.lang.String)
     */
    @Override
    public synchronized void getFiles(final Set<String> paths, final String localDirectory) throws CollectionException {
        logger.trace("getRemoteFiles()");

        // Open the SSH connection
        SSHCommandResult sshCommandResult = sshExecuter.open();
        if (sshCommandResult.getResultCode() != 0) {
            throw new CollectionException(getExceptionMessage(sshCommandResult));
        }

        // Get the files
        sshCommandResult = sshExecuter.copyFrom(paths, localDirectory);
        sshExecuter.close();
        if (sshCommandResult.getResultCode() != 0) {
            throw new CollectionException(getExceptionMessage(sshCommandResult));
        }
    }

    @Override
    public synchronized void deleteFiles(final Collection<String> files) throws CollectionException {
        logger.trace("deleteRemoteFiles(" + files.size() + " files)-->");

        // Open the SSH connection
        SSHCommandResult sshCommandResult = sshExecuter.open();
        if (sshCommandResult.getResultCode() != 0) {
            throw new CollectionException(getExceptionMessage(sshCommandResult));
        }

        // Iterate over each file
        for (final String file : files) {
            // Delete the file, passing the host password in the sudo rm command
            sshCommandResult = sshExecuter.execute("echo " + sshExecuter.sshHostInfo.getPassword() + " | sudo -S rm " + file);
            if (sshCommandResult.getResultCode() > 0) {
                // Close the SSH connection
                sshExecuter.close();
                throw new CollectionException(getExceptionMessage(sshCommandResult));
            }
            logger.debug("Deleted the remote file: " + file);
        }

        // Close the SSH connection
        sshExecuter.close();
        logger.trace("deleteRemoteFiles(" + files.size() + " files)<--");
    }

    @Override
    public Set<String> listFiles(final String path, final String regexPattern) throws CollectionException {
        return listFiles(new String[] { path }, regexPattern);
    }

    /* (non-Javadoc)
     * @see com.ericsson.cepmediation.loading.filecollection.CollectionAgent#recursivelyListFilesOnly(java.lang.String)
     */
    @Override
    public Collection<File> recursivelyListFilesOnly(String directory) throws CollectionException {
        throw new UnsupportedOperationException();
    }

}
