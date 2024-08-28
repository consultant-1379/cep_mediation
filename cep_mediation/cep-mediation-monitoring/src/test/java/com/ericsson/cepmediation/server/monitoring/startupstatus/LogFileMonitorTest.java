/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.server.monitoring.startupstatus;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileNotFoundException;

import org.junit.Before;
import org.junit.Test;

import com.ericsson.cepmediation.base.util.constants.ApplicationConstants;

/**
 * @author eemecoy
 *
 */
public class LogFileMonitorTest {

    private LogFileMonitor logFileMonitor;

    @Before
    public void setup() {
        logFileMonitor = new LogFileMonitor();
    }

    @Test(expected = MissingPropertyException.class)
    public void testExceptionThrownIfLogDirectoryNotSet() throws FileNotFoundException, MissingPropertyException {
        logFileMonitor.startLogFileMonitoring();
    }

    @Test
    public void testCorrectLogFilePathReturnedWhenLogDirectoryDoesntEndInSlash() throws MissingPropertyException {
        final String logDirectory = "aPath/pathToLogDirectory";
        System.setProperty(ApplicationConstants.getInstance().getLogDir(), logDirectory);
        assertEquals(logDirectory + File.separator + ApplicationConstants.getInstance().getCepMediationStartStopLog(), logFileMonitor.getLogFileName());
    }

    @Test
    public void testCorrectLogFilePathReturnedWhenLogDirectoryDoesEndInSlash() throws MissingPropertyException {
        final String logDirectory = "aPath/pathToLogDirectory" + File.separator;
        System.setProperty(ApplicationConstants.getInstance().getLogDir(), logDirectory);
        assertEquals(logDirectory + ApplicationConstants.getInstance().getCepMediationStartStopLog(), logFileMonitor.getLogFileName());
    }
}
