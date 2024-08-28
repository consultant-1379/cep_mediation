package com.ericsson.cepmediation.forwarding.iq;

import java.io.File;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.cepmediation.base.properties.CepMediationProperties;
import com.ericsson.cepmediation.base.properties.CepMediationProperty;
import com.ericsson.cepmediation.forwarding.ForwarderUtilityHelper;

/**
 * This class handles loading of a binary file into the database 
 * 
 * @author emicned
 */
public class IqFileLoader implements Runnable {

    // Defines how many time we should try to move a file.
    // Moving can fail several times and then succeed for OS specific reasons.
    private static final int MAX_NUMB_OF_MOVE_ATTEMPTS = 3;

    // Get a reference to the logger
    private static final Logger logger = LoggerFactory.getLogger(IqFileLoader.class);

    // Get a reference to the metrics logger
    private static final Logger metricLogger = LoggerFactory.getLogger(IqFileLoader.class);
    
    // Constants controlling database loading
    private static final boolean DB_STORAGE_ACTIVE = CepMediationProperties
            .getBooleanProperty(CepMediationProperty.DB_STORAGE_ACTIVE);

    private static final int DB_MAX_THREAD_COUNTER = CepMediationProperties
            .getIntProperty(CepMediationProperty.DB_MAX_THREAD_COUNT);

    private static final long DB_THREAD_COUNTER_DELAY = CepMediationProperties
            .getIntProperty(CepMediationProperty.DB_MAX_THREAD_COUNTER_DELAY);
    
    private final ExecutorService updateDBService = Executors.newFixedThreadPool(DB_MAX_THREAD_COUNTER, new ThreadFactory() {
        @Override
        public Thread newThread(final Runnable r) {
            return new Thread(r, "updateDB_thread");
        }
    });
    
    private final ExecutorService iqFileLoaderService = Executors.newSingleThreadExecutor(new ThreadFactory() {
        @Override
        public Thread newThread(final Runnable r) {
            return new Thread(r, "iqFileLoader_thread");
        }
    });
    private final BlockingQueue<File> binaryFileQueue = new LinkedBlockingQueue<File>();
    

    /**
     * Constructor, Initializes the Binary file loader
     */
    IqFileLoader() {
        // Check if DB loading is active
        if (!DB_STORAGE_ACTIVE) {
            return;
        }
        logger.debug("iqFileLoaderService is started.");
        iqFileLoaderService.submit(this);
    }

    /**
     * Add a binary file the bottom of the binary file queue
     * 
     * @param binaryFile
     *            the binaryfile
     */
    protected synchronized void addToQueue(final File binaryFile) {
        // Check if DB loading is active
        if (!DB_STORAGE_ACTIVE) {
            return;
        }
        // Add file to the queue
        binaryFileQueue.add(binaryFile);
        logger.debug("file " + binaryFile.getAbsolutePath() + " added to binary file loader queue");
    }

    
    /**
     * Kick off the thread to load the binary file into the database
     * 
     * @see java.lang.Runnable#run()
     */
    @Override
    public void run() {
        logger.debug("Binary file loading thread started");
        // This thread runs until all the files in the binary file list are
        // processed
        File binaryFile = null;
        while (true)
        {
            try {
                if((binaryFile = binaryFileQueue.take()) != null)
                  updatedDb(binaryFile);    
            } catch (Throwable t) {
                logger.warn("Exception occured while moving binaryFile : " + binaryFile.getAbsolutePath() + " : " + t.getMessage() , t);
            }   
        }
    }

    protected void delay() {
        try {
            Thread.sleep(DB_THREAD_COUNTER_DELAY);
        } catch (final InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void updatedDb(final File binaryFile) {
        updateDBService.submit(
                new Runnable() {
                    @Override
                    public void run() {
                        final String absolutePath = binaryFile.getAbsolutePath();
                        final String targetPath = buildTargetPath(absolutePath);
                        logger.debug("Loading binary file into database: " + absolutePath);
                        metricLogger.trace("Loading binary file into database: " + absolutePath);
                        int numbAttempts = 0;
                        final File targetFile = new File(targetPath);
                        logger.info("Move file '" + absolutePath + "' into '" + targetPath + "'");
                        while (!binaryFile.renameTo(targetFile) && numbAttempts < MAX_NUMB_OF_MOVE_ATTEMPTS) {
                            // Try to move the file several times because the first attempt(s) may fail because some
                            // handles to the file that has just been created are not released yet
                            try {
                                Thread.sleep(1000);
                            } catch (final InterruptedException e) {
                            }
                            numbAttempts++;
                        }
                        if (numbAttempts == MAX_NUMB_OF_MOVE_ATTEMPTS) {
                            logger.warn("Failed to move file from " + binaryFile.getAbsolutePath() + " to " + targetPath);
                        } else {
                            logger.debug("Binary file loaded into database: " + binaryFile.getAbsolutePath());
                        }
                        metricLogger.trace("Binary file loaded into database: " + binaryFile.getAbsolutePath());
                    }
             });
    }

    public String buildTargetPath(final String absolutePath) {
        final int pos = absolutePath.lastIndexOf(File.separator);
        // Get the full measurement type directory without the last file separator
        String measTypeDir = absolutePath.substring(0, pos-ForwarderUtilityHelper.INITIAL_LOCATION_OF_BINARY_FILES.length());
        return measTypeDir + File.separator + getRelTargetDirectoryPath(measTypeDir)
                + absolutePath.substring(pos + 1, absolutePath.length());
    }
    
    private String getRelTargetDirectoryPath(String measTypeDir) {
    	final int pos = measTypeDir.lastIndexOf(File.separator);
    	String measTypeName = measTypeDir.substring(pos + 1);
    	return ForwarderUtilityHelper.getMeasType2Location(measTypeName);
    }

   
}
