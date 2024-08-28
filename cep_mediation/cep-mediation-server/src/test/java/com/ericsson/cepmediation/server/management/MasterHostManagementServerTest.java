/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.server.management;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.rmi.RemoteException;
import java.rmi.UnmarshalException;

import org.junit.Before;
import org.junit.Test;

import com.ericsson.cepmediation.base.properties.ConfigBinder;
import com.ericsson.cepmediation.base.properties.ConfigurationException;
import com.ericsson.cepmediation.base.service.ServiceException;
import com.ericsson.cepmediation.base.status.StartStopStatusUpdate;
import com.ericsson.cepmediation.base.util.constants.SystemExitCode;
import com.ericsson.cepmediation.server.management.status.startupstatus.Monitor;
import com.ericsson.cepmediation.server.management.util.CouldNotConnectToRMIServiceException;

/**
 * Attempt to get existing {@link MasterHostManagementServer} class under test - this is difficult as class
 * was originally written without unit tests, hence the complexity of the test code below
 * 
 * @author eemecoy
 *
 */
public class MasterHostManagementServerTest {

    private MasterHostManagementServer masterHostManagementServer;

    ConfigBinder mockedConfigBinder;

    boolean serverStarted;

    boolean processesStarted;

    boolean statisticsCollectionStarted;

    AgentData mockedAgentData;

    CepMediationServer mockedRMIObject;

    Monitor mockedMonitor;

    boolean throwException;

    int expectedExitCode;

    boolean shouldThrowExceptionWhenTryToConnectToRMIServer;

    @Before
    public void setup() throws ConfigurationException {
        shouldThrowExceptionWhenTryToConnectToRMIServer = false;
        serverStarted = false;
        processesStarted = false;
        statisticsCollectionStarted = false;
        throwException = false;
        expectedExitCode = -1;
        mockedConfigBinder = mock(ConfigBinder.class);
        when(mockedConfigBinder.getLocalHostName()).thenReturn("");
        mockedAgentData = mock(AgentData.class);
        mockedRMIObject = mock(CepMediationServer.class);
        mockedMonitor = mock(Monitor.class);
        masterHostManagementServer = new StubbedMasterHostManagementServer();
    }

    @Test
    public void testUnMarshalExceptionIsIgnoredWhenStoppingServer() throws RemoteException {
        doThrow(new UnmarshalException("")).when(mockedRMIObject).stop();
        masterHostManagementServer.startStop(false);
        verify(mockedMonitor).statusUpdate(StartStopStatusUpdate.SUCCESSFULLY_STOPPED_APPLICATION);
    }

    @Test
    public void testExitCodeWhenFailsToStart() {
        throwException = true;
        expectedExitCode = SystemExitCode.SYSTEM_EXIT_CODE_NOK.getValue();
        masterHostManagementServer.startStop(true);
        verify(mockedMonitor).statusUpdate(StartStopStatusUpdate.FAILED_TO_START_APPLICATION);
    }

    @Test
    public void testExitCodeIsFailureWhenStopsAndItsAlreadyStopped() {
        expectedExitCode = SystemExitCode.SYSTEM_EXIT_CODE_NOK.getValue();
        shouldThrowExceptionWhenTryToConnectToRMIServer = true;
        masterHostManagementServer.startStop(false);
        verify(mockedMonitor).statusUpdate(StartStopStatusUpdate.FAILED_TO_SUCCESSFULLY_STOP_APPLICATION);
    }

    @Test
    public void testExitCodeWhenFailsToStop() throws RemoteException {
        expectedExitCode = SystemExitCode.SYSTEM_EXIT_CODE_NOK.getValue();
        doThrow(new RemoteException()).when(mockedRMIObject).stop();
        masterHostManagementServer.startStop(false);
        verify(mockedMonitor).statusUpdate(StartStopStatusUpdate.FAILED_TO_SUCCESSFULLY_STOP_APPLICATION);
    }

    @Test
    public void testStarting() {
        masterHostManagementServer.startStop(true);
        assertThat(serverStarted, is(true));
        assertThat(processesStarted, is(true));
        assertThat(statisticsCollectionStarted, is(true));
        verify(mockedMonitor).statusUpdate(StartStopStatusUpdate.SUCCESSFULLY_STARTED_APPLICATION);
    }

    @Test
    public void testStopping() throws RemoteException {
        masterHostManagementServer.startStop(false);
        verify(mockedRMIObject).stop();
        verify(mockedMonitor).statusUpdate(StartStopStatusUpdate.SUCCESSFULLY_STOPPED_APPLICATION);
    }

    class StubbedMasterHostManagementServer extends MasterHostManagementServer {

        StubbedMasterHostManagementServer() {
            super();
        }

        @Override
        ConfigBinder getConfigBinderInstance() {
            return mockedConfigBinder;
        }

        /* (non-Javadoc)
         * @see com.ericsson.cepmediation.server.management.ManagementServerImpl#setRMIPort()
         */
        @Override
        void setRMIPort() {

        }

        @Override
        protected void startServer() throws AdminException, ConfigurationException, ServiceException {
            serverStarted = true;
        }

        @Override
        protected void startProcesses() throws ServiceException {
            processesStarted = true;
        }

        @Override
        void startToCollectStatistics() {
            if (throwException) {
                throw new RuntimeException();
            }
            statisticsCollectionStarted = true;
        }

        @Override
        AgentData createAgentData() {
            return mockedAgentData;
        }

        @Override
        CepMediationServer getRemoteCepMediationServerObject(final AgentData masterServerData)
                throws CouldNotConnectToRMIServiceException {
            if (shouldThrowExceptionWhenTryToConnectToRMIServer) {
                throw new CouldNotConnectToRMIServiceException(null);
            }
            return mockedRMIObject;
        }

        @Override
        Monitor getStartupStatusMonitor() {
            return mockedMonitor;
        }

        @Override
        void exitSystem(final int exitCode) {
            assertThat(exitCode, is(expectedExitCode));
        }

    }

}
