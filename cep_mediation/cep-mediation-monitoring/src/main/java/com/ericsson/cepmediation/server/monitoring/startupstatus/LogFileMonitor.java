/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.server.monitoring.startupstatus;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Observable;
import java.util.Observer;

import com.ericsson.cepmediation.base.util.constants.ApplicationConstants;

/**
 * @author eemecoy
 */
public class LogFileMonitor extends Observable implements Observer {
    private File logFile;

    public LogFileMonitor() {
        logFile = null;
    }

    public LogFileMonitor(File logFile) {
        this.logFile = logFile;
    }

    public void startLogFileMonitoring() throws FileNotFoundException, MissingPropertyException {
        final String logFileName = getLogFileName();
        final FileMonitor fileMonitor = new FileMonitor(logFileName);
        fileMonitor.addObserver(this);
        fileMonitor.startMonitoringFile();

    }

    String getLogFileName() throws MissingPropertyException {
        if (logFile == null) {
            final String logFileDirectory = System.getProperty(ApplicationConstants.getInstance().getLogDir());
            if (logFileDirectory == null) {
                throw new MissingPropertyException("No definition for property " + ApplicationConstants.getInstance().getLogDir());
            }
            final String correctLogFileDirectory = appendFileSeperatorToLogFileDirectoryIfRequired(logFileDirectory);
            final String logFileName = correctLogFileDirectory + ApplicationConstants.getInstance().getCepMediationStartStopLog();
            logFile = new File(logFileName);
            return logFileName;
        } else {
            return logFile.getAbsolutePath();
        }
    }

    private String appendFileSeperatorToLogFileDirectoryIfRequired(final String logFileDirectory) {
        if (logFileDirectory.endsWith(File.separator)) {
            return logFileDirectory;
        }
        return logFileDirectory + File.separator;
    }

    @Override
    public void update(final Observable o, final Object changedObject) {
        setChanged();
        notifyObservers(changedObject);

    }

}
