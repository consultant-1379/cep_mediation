/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.server.monitoring.startupstatus;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.cepmediation.base.util.FileUtils;

/**
 * @author eemecoy
 *
 */
public class FileMonitor extends Observable {

    final Logger logger = LoggerFactory.getLogger(getClass());

    public static final long SLEEP_INTERVAL = 1000;

    private static final int TIME_TO_SLEEP_TO_ALLOW_FILE_TO_BE_UPDATED = 1000;

    final String fileName;

    private List<String> linesInFile = new ArrayList<String>();

    /**
     * @param fileName
     */
    public FileMonitor(final String fileName) {
        this.fileName = fileName;
    }

    public void startMonitoringFile() throws FileNotFoundException {
        final Runnable monitoringRunnable = new FileMonitoringRunnable(fileName);
        new Thread(monitoringRunnable).start();

    }

    List<String> getNewLinesInFile() throws IOException {
        traceExistingLinesInFile();
        final List<String> latestLinesInFile = readLinesInFile();
        traceLatestLinesInFile(latestLinesInFile);
        final List<String> difference = new ArrayList<String>(latestLinesInFile);
        difference.removeAll(linesInFile);
        logger.debug("Difference is " + difference.size());
        linesInFile = latestLinesInFile;
        return difference;
    }

    private void traceLatestLinesInFile(final List<String> latestLinesInFile) {
        if (logger.isTraceEnabled()) {
            logger.debug("Latest lines in file: " + latestLinesInFile.size());
            for (final String lineInFile : latestLinesInFile) {
                logger.debug(lineInFile);
            }
        }
    }

    private void traceExistingLinesInFile() {
        if (logger.isTraceEnabled()) {
            logger.trace("Existing lines in file: " + linesInFile.size());
            for (final String line : linesInFile) {
                logger.trace(line);
            }
        }
    }

    List<String> readLinesInFile() throws IOException {
        return FileUtils.readFile(fileName);
    }

    class FileMonitoringRunnable implements Runnable {

        private final File fileObject;

        private long lastModifiedTime;

        public FileMonitoringRunnable(final String fileName) throws FileNotFoundException {
            fileObject = new File(fileName);
            checkFileExists();

        }

        private void checkFileExists() throws FileNotFoundException {
            if (!fileObject.exists()) {
                throw new FileNotFoundException(fileName);
            }

        }

        @Override
        public void run() {
            while (true) {
                final long newModifiedTime = fileObject.lastModified();
                final boolean hasFileChanged = checkIfFileHasChanged(newModifiedTime);
                try {
                    if (hasFileChanged) {
                        logger.debug("Have detected a change in file");
                        lastModifiedTime = newModifiedTime;
                        sleepToAllowTimeForFileToBeUpdated();
                        notifyObserversOfNewLinesInFile();
                    }
                    Thread.sleep(SLEEP_INTERVAL);
                } catch (final InterruptedException e) {
                    e.printStackTrace();
                }

            }

        }

        /**
         * have noticed problems where the file modified time had changed
         * but the next method found no new lines - suspect this is because of a delay between log4j
         * touching the file and writing the new lines to the file, so sleeping briefly here
         * 
         */
        private void sleepToAllowTimeForFileToBeUpdated() throws InterruptedException {
            Thread.sleep(TIME_TO_SLEEP_TO_ALLOW_FILE_TO_BE_UPDATED);
        }

        private void notifyObserversOfNewLinesInFile() {
            try {
                setChanged();
                notifyObservers(getNewLinesInFile());
            } catch (final IOException e) {
                e.printStackTrace();
            }
        }

        private boolean checkIfFileHasChanged(final long newModifiedTime) {
            boolean hasFileChanged;
            if (newModifiedTime == lastModifiedTime) {
                hasFileChanged = false;
            } else {
                hasFileChanged = true;
            }
            return hasFileChanged;
        }
    }

}
