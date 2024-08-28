/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.automation.remoteserver;

import com.ericsson.cepmediation.loading.filecollection.ssh.SSHCommandResult;
import com.ericsson.cepmediation.loading.filecollection.ssh.SSHExecuter;
import com.jcraft.jsch.Channel;
import com.jcraft.jsch.ChannelSftp;

/**
 * @author eemecoy
 *
 */
public class SuperSSHExecuter extends SSHExecuter {

    /**
     * @param host
     * @param user
     * @param password
     */
    public SuperSSHExecuter(String host, String user, String password) {
        super(host, user, password);
    }

    /**
     * Copy a list of files to a remote host
     * 
     * @param localFile 
     * @param remoteDirectory The remote directory to copy to
     * 
     * @return The result of the command
     * @throws Exception 
     */
    protected SSHCommandResult copyTo(final String localFile, final String remoteDirectory) throws Exception {

        Channel channel = null;
        SSHCommandResult sshCommandResult;
        try {
            // Hold the output of the command execution
            sshCommandResult = new SSHCommandResult();

            // Execute the command on the remote host
            channel = sshSession.openChannel("sftp");

            // Connect to the channel and cast it to a SFTP channel
            channel.connect();
            final ChannelSftp channelSftp = (ChannelSftp) channel;

            channelSftp.put(localFile, remoteDirectory);

        } finally {
            disconnectChannelAndSEssion(channel);
        }

        return sshCommandResult;
    }

    private void disconnectChannelAndSEssion(Channel channel) {
        if (channel != null) {
            // Disconnect the channel and session
            channel.disconnect();
        }
    }

}
