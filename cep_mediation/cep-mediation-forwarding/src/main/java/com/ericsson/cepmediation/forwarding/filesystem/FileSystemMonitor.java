package com.ericsson.cepmediation.forwarding.filesystem;

import java.io.File;
import java.util.HashSet;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.cepmediation.base.properties.CepMediationProperties;
import com.ericsson.cepmediation.base.properties.CepMediationProperty;
import com.ericsson.cepmediation.forwarding.ForwarderUtilityHelper;

public class FileSystemMonitor implements Runnable {

    private Set<String> techPackDirNames;

    private static final String IQ_BINARY_DIRECTORY = CepMediationProperties.getFileProperty(CepMediationProperty.IQ_BINARY_DIRECTORY);

    private static final int MAX_PERCENTAGE_USED_SPACE = CepMediationProperties.getIntProperty(CepMediationProperty.MAX_PERCENTAGE_USED_SPACE);

    private static final int POLL_INTERVAL = CepMediationProperties.getIntProperty(CepMediationProperty.FILESYSTEM_MONITOR_POLL_INTERVAL) * 1000;

    private static final int MAX_DISKSPACE_FILES = CepMediationProperties.getIntProperty(CepMediationProperty.MAX_DISKSPACE_FILES);

    private static final String FILE_SEPERATOR = File.separator;

    private static final Logger logger = LoggerFactory.getLogger(FileSystemMonitor.class);

    private static FileSystemCheckResultHolder[] fileSystemCheckResultHolders;

    // Hold a reference to the thread that is supervising the table maps
    private Thread monitorThread = null;

    private static FileSystemMonitor fileSystemMonitor = new FileSystemMonitor();

    private FileSystemMonitor() {
    }

    public static FileSystemMonitor getInstance() {
        return fileSystemMonitor;
    }

    public boolean canWriteToFileSystem() {
        boolean result = true;

        StringBuilder resultDetails = new StringBuilder("Results of canWriteToFileSystem are - ");
        for (FileSystemCheckResultHolder fileSystemCheckResultHolder : fileSystemCheckResultHolders) {
            result = result && fileSystemCheckResultHolder.getResult();
            resultDetails.append(fileSystemCheckResultHolder.getFilesystemName()).append(": ").append(fileSystemCheckResultHolder.getResult());
            resultDetails.append(" , ");
        }

        if (logger.isTraceEnabled()) {
            logger.trace(resultDetails.toString());
        }

        return result;
    }

    /**
     * This method starts the monitor thread which monitors the filesystem
     * If the thread is already started, then it returns the existing thread
     * @return The thread that was started
     */
    public Thread start() {
        // Check if the monitor thread is running
        if (monitorThread != null && monitorThread.isAlive()) {
            logger.warn("FileSystem monitor thread is already running");
            return monitorThread;
        }

        // Thread is not running, start it
        // Before starting thread, initiate the holders of the results. There is a holder for each mount point.
        String[] fileSystemMountDirNames = ForwarderUtilityHelper.getFileSystemMountDirNames();
        fileSystemCheckResultHolders = new FileSystemCheckResultHolder[fileSystemMountDirNames.length];
        techPackDirNames = new HashSet<String>(ForwarderUtilityHelper.getMeasTypes());
        for (int i = 0; i < fileSystemMountDirNames.length; i++) {
            fileSystemCheckResultHolders[i] = new FileSystemCheckResultHolder(getAbsolutePath(fileSystemMountDirNames[i]), techPackDirNames,
                    MAX_PERCENTAGE_USED_SPACE, MAX_DISKSPACE_FILES);
        }

        monitorThread = new Thread(this);
        monitorThread.setName(FileSystemMonitor.class.getSimpleName() + "-procId:" + ForwarderUtilityHelper.getProcId());
        monitorThread.start();

        return monitorThread;

    }

    /**
     * This method runs the file system monitor thread that initiates the checks to see if the file system can be written to.
     */
    @Override
    public void run() {
        logger.debug("File system monitor thread started");

        // This thread runs until it is interrupted by the class instance closing
        while (monitorThread != null && monitorThread.isAlive() && !monitorThread.isInterrupted()) {
            logger.debug("File system monitor thread running, interval: " + POLL_INTERVAL + " ms ");

            // Perform checks on the file system and store results
            FileSystemCheckExecutor fileSystemCheckExecutor = new FileSystemCheckExecutor();
            for (int i = 0; i < fileSystemCheckResultHolders.length; i++) {
                fileSystemCheckExecutor.runChecks(fileSystemCheckResultHolders[i]);
                logger.debug(fileSystemCheckResultHolders[i].getResultDetails());

                // Also log an error message if there was a failure
                if (fileSystemCheckResultHolders[i].getResult() == false) {
                    logger.error("There is a problem with a file system where the binary files are written: "
                            + fileSystemCheckResultHolders[i].getResultDetails());
                }
            }

            // Sleep for the poll interval
            try {
                Thread.sleep(POLL_INTERVAL);
            } catch (final InterruptedException ie) {
                // Thread has been interrupted
                logger.debug("File system monitor thread has been interrupted");
                break;
            }
        }

        logger.debug("File system monitor thread finished");
    }

    /**
     * This method stops the thread that monitors the file system
     */
    public void close() {
        // Interrupt the file system monitor thread
        if (monitorThread != null && monitorThread.isAlive()) {
            monitorThread.interrupt();
        } else {
            logger.debug("File system monitor thread has already stopped");
        }
    }

    private String getAbsolutePath(String dirName) {
        return IQ_BINARY_DIRECTORY + FILE_SEPERATOR + dirName;
    }

}
