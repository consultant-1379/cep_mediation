/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.loading.filecollection.ssh;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;

import com.ericsson.cepmediation.base.util.FileServerData;
import com.ericsson.cepmediation.loading.filecollection.CollectionException;
import com.ericsson.cepmediation.loading.filecollection.ssh.SSHAgent;
import com.ericsson.cepmediation.loading.filecollection.ssh.SSHCommandResult;
import com.ericsson.cepmediation.loading.filecollection.ssh.SSHExecuter;

/**
 * @author eemecoy
 *
 */
public class SSHAgentTest {

    private SSHAgent sshAgent;

    SSHExecuter mockedSSHExecutor;

    @Before
    public void setup() {
        mockedSSHExecutor = mock(SSHExecuter.class);
        sshAgent = new StubbedSSHAgent(new FileServerData());
    }

    @Test
    public void testListDirectories() throws CollectionException {
        final String path = "a path";

        final SSHCommandResult sshCommandResult = new SSHCommandResult();
        when(mockedSSHExecutor.open()).thenReturn(sshCommandResult);
        final SSHCommandResult lsCommandResult = new SSHCommandResult();
        lsCommandResult.setResultCode(0);
        final String[] expectedFileListing = new String[] { "file1", "file2" };
        lsCommandResult.setRemoteOutput(expectedFileListing);
        when(mockedSSHExecutor.execute("ls -d " + path)).thenReturn(lsCommandResult);
        final String[] fileListing = sshAgent.listDirectories(path);
        assertArrayEquals(expectedFileListing, fileListing);
    }

    class StubbedSSHAgent extends SSHAgent {

        /**
         * @param fileServerData
         */
        public StubbedSSHAgent(final FileServerData fileServerData) {
            super(fileServerData);
        }

        /* (non-Javadoc)
         * @see com.ericsson.cepmediation.loading.ssh.SSHAgent#createSSHExecutor(com.ericsson.cepmediation.base.util.FileServerData)
         */
        @Override
        SSHExecuter createSSHExecutor(final FileServerData fileServerData) {
            return mockedSSHExecutor;
        }

    }

}
