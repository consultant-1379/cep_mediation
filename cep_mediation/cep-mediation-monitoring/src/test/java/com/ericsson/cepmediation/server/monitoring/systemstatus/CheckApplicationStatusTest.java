/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.server.monitoring.systemstatus;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.rmi.RemoteException;

import org.junit.Before;
import org.junit.Test;

import com.ericsson.cepmediation.base.util.constants.ApplicationConstants;
import com.ericsson.cepmediation.base.util.constants.SystemExitCode;
import com.ericsson.cepmediation.server.management.CepMediationServer;

/**
 * @author eemecoy
 *
 */
public class CheckApplicationStatusTest {

    private CheckApplicationStatus checkApplicationStatus;

    CepMediationServer mockedRMIService;

    RemoteException exceptionToThrow;

    String expectedRMIServiceAddress;

    final int rmiPort = 1098;

    @Before
    public void setup() {
        exceptionToThrow = null;
        expectedRMIServiceAddress = "//localhost:" + rmiPort + "/" + ApplicationConstants.getInstance().getAdminServer();
        mockedRMIService = mock(CepMediationServer.class);
        checkApplicationStatus = new StubbedCheckApplicationStatus();
    }

    @Test
    public void testCheckApplicationReturnsNOKIfCannotLookupRMIService() {
        exceptionToThrow = new RemoteException();
        final SystemExitCode result = checkApplicationStatus.checkApplicationStatus();
        assertThat(result, is(SystemExitCode.SYSTEM_EXIT_CODE_NOK));
    }

    @Test
    public void testCheckApplicationReturnsNOKIfCannotCallIsAlive() throws RemoteException {
        when(mockedRMIService.isAlive()).thenThrow(new RemoteException());
        final SystemExitCode result = checkApplicationStatus.checkApplicationStatus();
        assertThat(result, is(SystemExitCode.SYSTEM_EXIT_CODE_NOK));
    }

    @Test
    public void testCheckApplicationReturnsNOKIfIsAliveReturnsFalse() throws RemoteException {
        when(mockedRMIService.isAlive()).thenReturn(false);
        final SystemExitCode result = checkApplicationStatus.checkApplicationStatus();
        assertThat(result, is(SystemExitCode.SYSTEM_EXIT_CODE_NOK));
    }

    @Test
    public void testCheckApplicationReturnsOKIfAllOK() throws RemoteException {
        when(mockedRMIService.isAlive()).thenReturn(true);
        final SystemExitCode result = checkApplicationStatus.checkApplicationStatus();
        assertThat(result, is(SystemExitCode.SYSTEM_EXIT_CODE_OK));
    }

    class StubbedCheckApplicationStatus extends CheckApplicationStatus {

        @Override
        CepMediationServer lookUpRMIService(final String rmiServiceAddress) throws RemoteException {
            assertEquals(expectedRMIServiceAddress, rmiServiceAddress);
            if (exceptionToThrow == null) {
                return mockedRMIService;
            }
            throw exceptionToThrow;
        }

        @Override
        int getConfiguredRMIPort() {
            return rmiPort;
        }
    }

}
