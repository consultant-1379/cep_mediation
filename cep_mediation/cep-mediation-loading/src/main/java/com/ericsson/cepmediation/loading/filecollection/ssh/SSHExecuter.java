package com.ericsson.cepmediation.loading.filecollection.ssh;

/**
 * This class acts as a wrapper for SSH commands towards a SSH server. It uses the jsch library
 * to access remote machines over SSH
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.jcraft.jsch.Channel;
import com.jcraft.jsch.ChannelExec;
import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.Session;
import com.jcraft.jsch.SftpException;

public class SSHExecuter {
    // Get a reference to the logger
    private static final Logger logger = LoggerFactory.getLogger(SSHExecuter.class);

    // The default SSH port
    private static final int DEFAULT_SSH_PORT = 22;

    // Hold information for the SSH dialogue
    SSHHostInfo sshHostInfo = null;

    // Hold a reference to a SSH session
    protected Session sshSession = null;

    static {
        JSch.setLogger(new SSHLogger());
    }

    /**
     * Instantiate a SSH Executer
     * @param remoteHost The remote host to work towards
     * @param user The userid on the remote host
     * @param password The password on the remote host
     */
    public SSHExecuter(final String host, final String user, String password) {
        logger.trace("SSHExecuter(" + host + ',' + user + ',' + password + ")");

        password = DecryptPassword.decrypt(password);
        // Save the host information  with default port
        sshHostInfo = new SSHHostInfo(host, DEFAULT_SSH_PORT, user, password);
    }

    /**
     * This method opens a connection to a remote SSH host
     * @return sshCommandResult The result of the open command
     */
    public SSHCommandResult open() {
        logger.trace("open()-->");

        // Hold the output of the command execution
        final SSHCommandResult sshCommandResult = new SSHCommandResult();

        try {
            // Get a new SSH session
            sshSession = new JSch().getSession(sshHostInfo.getUser(), sshHostInfo.getHost());

            // Set the user information for the SSH session and connect to the remote host
            sshSession.setPassword(sshHostInfo.getPassword());
            final java.util.Properties config = new java.util.Properties();
            config.put("StrictHostKeyChecking", "no");
            config.put("PreferredAuthentications", "publickey,keyboard-interactive,password");
            sshSession.setConfig(config);
            sshSession.connect();
        } catch (final Exception e) {
            handleSSHException(sshCommandResult, e);
        }

        logger.trace("open()<--" + sshCommandResult);
        return sshCommandResult;
    }

    /**
     * This method opens a connection to a remote SSH host using private key
     * @return sshCommandResult The result of the open command
     */
    public SSHCommandResult open(String home) {
        logger.trace("open()-->");

        // Hold the output of the command execution
        final SSHCommandResult sshCommandResult = new SSHCommandResult();

        try {
            JSch jsch = new JSch();
            String privateKey = home + "/.ssh/id_rsa";

            // Add private key for keyless entry
            jsch.addIdentity(privateKey);
            // Get a new SSH session
            sshSession = jsch.getSession(sshHostInfo.getUser(), sshHostInfo.getHost());

            // Set the user information for the SSH session and connect to the remote host
            final java.util.Properties config = new java.util.Properties();
            config.put("StrictHostKeyChecking", "no");
            config.put("PreferredAuthentications", "publickey,keyboard-interactive,password");
            sshSession.setConfig(config);
            sshSession.connect();
        } catch (final Exception e) {
            handleSSHException(sshCommandResult, e);
        }

        logger.trace("open()<--" + sshCommandResult);
        return sshCommandResult;
    }

    /**
     * This method closes a connection to a remote SSH host
     */
    public SSHCommandResult close() {
        logger.trace("close()-->");

        // Hold the output of the command execution
        final SSHCommandResult sshCommandResult = new SSHCommandResult();

        // Check if the session is open
        if (sshSession != null && sshSession.isConnected()) {
            try {
                sshSession.disconnect();
                logger.trace("closed ssh session");
            } catch (final Exception e) {
                handleSSHException(sshCommandResult, e);
            }
        } else {
            sshCommandResult.setResultCode(-1);
            sshCommandResult.setRemoteError(new String[] { "ssh connection already closed" });
        }

        logger.trace("close()<--" + sshCommandResult);
        return sshCommandResult;
    }

    /**
     * Execute a command on a remote host
     * @param command The command to execute
     * @return The result of the command
     */
    public SSHCommandResult execute(final String command) {
        logger.trace("execute(" + command + ")");

        // Hold the output of the command execution
        final SSHCommandResult sshCommandResult = new SSHCommandResult();

        // Check if the session is open
        if (sshSession == null || !sshSession.isConnected()) {
            logger.trace("ssh session is not open");
        }

        try {
            // Execute the command on the remote host
            final Channel channel = sshSession.openChannel("exec");
            ((ChannelExec) channel).setCommand(command);

            // Get the standard output and standard error of the remote command
            final BufferedReader remoteOutputStream = new BufferedReader(new InputStreamReader(channel.getInputStream()));
            final BufferedReader remoteErrorStream = new BufferedReader(new InputStreamReader(channel.getExtInputStream()));

            // Connect to the channel
            channel.connect();

            // Create an array list to hold the standard output/error
            final List<String> remoteOutput = new ArrayList<String>();
            final List<String> remoteError = new ArrayList<String>();

            // Process output and error streams from remote process
            while (true) {
                // Get remote output
                while (true) {
                    final String remoteOutputLine = remoteOutputStream.readLine();
                    if (remoteOutputLine != null) {
                        remoteOutput.add(remoteOutputLine);
                    } else {
                        break;
                    }
                }

                // Get remote error
                while (true) {
                    final String remoteErrorLine = remoteErrorStream.readLine();
                    if (remoteErrorLine != null) {
                        remoteError.add(remoteErrorLine);
                    } else {
                        break;
                    }
                }

                // Check if the channel is still open
                if (channel.isClosed()) {
                    // Channel is closed, get result code
                    sshCommandResult.setResultCode(channel.getExitStatus());
                    break;
                }
            }

            // Disconnect the channel
            channel.disconnect();

            // Append the result of the command to the command output/error
            sshCommandResult.setRemoteOutput(remoteOutput.toArray(new String[0]));
            sshCommandResult.setRemoteError(remoteError.toArray(new String[0]));
        } catch (final Exception e) {
            // Handle the exception
            handleSSHException(sshCommandResult, e);
        }

        logger.trace("execute() <--- " + sshCommandResult);
        return sshCommandResult;
    }

    /**
     * Copy a list of files from a remote host
     * @param copyList A list of files to copy from the remote host
     * @param localDirectory The local directory to copy to
     * @return The result of the command
     */
    protected SSHCommandResult copyFrom(final Set<String> copyList, final String localDirectory) {
        logger.trace("copyFrom() --->");

        // Hold the output of the command execution
        final SSHCommandResult sshCommandResult = new SSHCommandResult();

        // Check if any files have been specified
        if (copyList == null) {
            // Record the error and return
            sshCommandResult.setResultCode(-1);
            sshCommandResult.setRemoteError(new String[] { "no files specified for SSH copy from remote node" });
            logger.debug("copyFrom()<--- " + sshCommandResult);
            return sshCommandResult;
        }

        try {
            // Execute the command on the remote host
            final Channel channel = sshSession.openChannel("sftp");

            // Connect to the channel and cast it to a SFTP channel
            channel.connect();
            final ChannelSftp channelSftp = (ChannelSftp) channel;

            // Iterate over the file array and get the files one by one
            for (final String sourceFile : copyList) {
                // Check the source file
                if (sourceFile == null || sourceFile.length() == 0) {
                    logger.debug("copyFrom(): invalid source file on copy list item: " + sourceFile);
                    continue;

                }

                // Check the target directory
                if (localDirectory == null || localDirectory.length() == 0) {
                    logger.debug("copyFrom(): invalid target directory on copy list item: " + localDirectory);
                    continue;
                }

                // Check that the target is a directory
                if (!new File(localDirectory).isDirectory()) {
                    logger.debug("copyFrom(): target directory on copy list item not a directory: " + localDirectory);
                    continue;
                }

                // We don't want to stop on file not found, so we handle this exception separately
                try {
                    // Get the remote file
                    logger.trace("copyFrom(): " + sourceFile + "--->" + localDirectory);
                    channelSftp.get(sourceFile, localDirectory + '/' + sourceFile.replaceAll("/", "%~%"));
                } catch (final SftpException e) {
                    // Check if this exception is due to "No such file"
                    if (e.getMessage().equals("No such file")) {
                        logger.debug("copyFrom(): source file on copy list item not found: " + sourceFile);
                    } else {
                        // Rethrow the exception
                        throw e;
                    }
                }
            }

            // Disconnect the channel and session
            channel.disconnect();
        } catch (final Exception e) {
            // Handle the exception
            handleSSHException(sshCommandResult, e);
        }

        logger.trace("copyFrom()<--- " + sshCommandResult);
        return sshCommandResult;
    }

    /**
     * This method builds the information into a SSH Command result object from a SSH exception
     * @param sshCommandResult The result object to build
     * @param e The exception to extract information from
     */
    private void handleSSHException(final SSHCommandResult sshCommandResult, final Exception e) {
        // Check and set the error code as an error if it isn't already set as one
        if (sshCommandResult.getResultCode() == 0) {
            sshCommandResult.setResultCode(-1);
        }

        // Record the exception information, retrieve any existing error messages
        List<String> errorOutput = null;
        if (sshCommandResult.getRemoteError() != null) {
            errorOutput = new ArrayList<String>(Arrays.asList(sshCommandResult.getRemoteError()));
        } else {
            errorOutput = new ArrayList<String>();
        }

        // Append the exception message
        errorOutput.add(e.getMessage());

        // Append the stack trace
        for (final StackTraceElement stackTraceElement : e.getStackTrace()) {
            errorOutput.add(stackTraceElement.toString());
        }

        sshCommandResult.setRemoteError(errorOutput.toArray(new String[0]));
    }

}
