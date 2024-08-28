package com.ericsson.cepmediation.forwarding.iq;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.cepmediation.base.apeventbeans.ApEventBean;
import com.ericsson.cepmediation.base.properties.CepMediationProperties;
import com.ericsson.cepmediation.base.properties.CepMediationProperty;
import com.ericsson.cepmediation.base.statistics.Statistics;
import com.ericsson.cepmediation.base.statistics.StatisticsAware;
import com.ericsson.cepmediation.base.util.Metrics;
import com.ericsson.cepmediation.base.util.constants.SystemExitCode;
import com.ericsson.cepmediation.forwarding.ForwarderUtilityHelper;
import com.ericsson.cepmediation.persist.IqFileWriter;

/**
 * This class loads events into iq database.
 * 
 * It creates binary file and writes events into it until the flush method is invoked. The flush method returns
 * the file created which can then be loaded into iq.
 * 
 * @author emicned
 */
public abstract class IqTableBuffer implements StatisticsAware {

    private static DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSSS");

    // The folder for temporary binary files.
    private static final String IQ_BINARY_DIRECTORY = CepMediationProperties
            .getFileProperty(CepMediationProperty.IQ_BINARY_DIRECTORY);

    // The number of folders used by the IQ loader for load balancing
    private static final int LOAD_BALANCING_FOLDERS_CNT = ForwarderUtilityHelper.getFileSystemMountDirNames().length;

    // The actual binary files 
    private final File[] binaryFiles = new File[LOAD_BALANCING_FOLDERS_CNT];

    // Shows into which folder we should put the file
    private int currFileIdx = -1;

    // Get a reference to the logger
    private static final Logger logger = LoggerFactory.getLogger(IqTableBuffer.class);

    // Get a reference to the metrics logger
    private static final Logger metricLogger = LoggerFactory.getLogger(Metrics.class);

    // Property strings for File IO
    private static final int FILE_BUFFER_SIZE = CepMediationProperties
            .getIntProperty(CepMediationProperty.IQ_BINARY_FILE_BUFFER_SIZE);

    // Member data for the table definition
    private final String absoluteName;

    // Writer for printing to the file
    protected OutputStream binaryWriter = null;

    // Holds the last time that the file was updated
    private long lastUpdatedTime = 0;

    // Count the number of rows in this table buffer
    private long rowCount = 0;

    private String lastEventTimeForwarded = "";

    private static final String FILE_SEPERATOR = File.separator;

    /**
     * Define a table, its schema, and its columns
     * @param filePrefix the prefix for all binary files 
     * @param schema The schema this table is in
     * @param table The name of this table
     * @param binaryFileDirectory The directory in which to buffer binary files for this table
     * @throws IllegalArgumentException if there is no tech pack for the specified event
     */
    IqTableBuffer(final String absoluteName, final String techPackName, final String filePrefix) {
        // Save the parts and absolute name of the schema
        this.absoluteName = absoluteName;

        // Create the files that will hold binary data      
        final String pathPattern = IQ_BINARY_DIRECTORY + getPathPatternForPathSuffix();
        for (int i = 0; i < binaryFiles.length; i++) {
            final File path = createParentFolderIfRequired(techPackName, pathPattern, i);
            binaryFiles[i] = new File(path, filePrefix + absoluteName + ".binary"); //NOPMD necessary evil
        }
    }

    private File createParentFolderIfRequired(final String techPackName, final String pathPattern, final int i) {
        final String loadBalancingFolder = i < 10 ? "0" + i : String.valueOf(i);

        final File path = new File(String.format(pathPattern, loadBalancingFolder, techPackName));
        if (path.exists() && path.isDirectory() && path.canWrite()) {
            logger.debug("Directory already exists: " + path);
        } else {
            try {
                final boolean result = path.mkdir();
                if (!result) {
                    logger.error("Failed to create tmp directory " + path);
                    logger.error("Are there problems with the NAS? Are the relevant tech pack directories installed? Do all directories have the correct permissions? ...");
                    // No point continuing as not able to store the binary files
                    logger.error("Stopping process as cannot write to the output directory " + path);
                    System.exit(SystemExitCode.SYSTEM_EXIT_OUTPUT_DIR_ISSUES.getValue());
                }
            } catch (Exception e) {
                logger.error("Exception while trying to create tmp directory " + path + " , " + e.getMessage(), e);
                logger.error("Are there problems with the NAS? Are the relevant tech pack directories installed? Do all directories have the correct permissions? ...");
                // No point continuing as not able to store the binary files
                logger.error("Stopping process as cannot write to the output directory " + path);
                System.exit(SystemExitCode.SYSTEM_EXIT_OUTPUT_DIR_ISSUES.getValue());
            }
        }
        return path;
    }

    private String getPathPatternForPathSuffix() {
        return FILE_SEPERATOR + "%1$s" + FILE_SEPERATOR + "%2$s" + FILE_SEPERATOR + 
        		ForwarderUtilityHelper.INITIAL_LOCATION_OF_BINARY_FILES;
    }
    

    /**
     * Get the absolute name of the table
     * @return The absolute name of the table
     */
    protected String getAbsoluteName() {
        return absoluteName;
    }

    /**
     * Get the time the table buffer was last updated at
     * @return The last update time
     */
    protected long getLastUpdatedTime() {
        return lastUpdatedTime;
    }

    /**
     * Return the number of rows in this table buffer.
     * @return the number of rows in the table buffer
     */
    protected long getRowCount() {
        return rowCount;
    }

    /**
     * Inserts a line into a file that will be bulk loaded into the database later
     * @param event An event to store in db
     */
    protected synchronized void insertRow(final ApEventBean event) {
        try {
            // Check that the file used to hold the event data for this table is opened
            if (binaryWriter == null) {
                currFileIdx++;
                if (currFileIdx == LOAD_BALANCING_FOLDERS_CNT) {
                    currFileIdx = 0;
                }
                logger.debug("opening binary file " + binaryFiles[currFileIdx].getAbsolutePath());
                binaryWriter = new BufferedOutputStream(new FileOutputStream(binaryFiles[currFileIdx]),
                        FILE_BUFFER_SIZE);
            }

            try {
                // Write the event to the file and record the update time
                IqFileWriter.write(binaryWriter, event);
            } catch (final Exception e) {
                logger.error("Error writing event: " + event.getCSVString() + " to file: " + e.getMessage(), e);
            }

            lastUpdatedTime = System.currentTimeMillis();

            //This part should be removed after Performance Tests!!!!
            lastEventTimeForwarded = currentTime();

            rowCount++;
            
            // Inform the subclasses that the event has been added to the file
            eventInsertedIntoFile(event);

            if (logger.isTraceEnabled()) {
                logger.trace("Successfully inserted '" + "' to '" + binaryFiles[currFileIdx] + "'");
            }
        } catch (final Exception e) {
            logger.warn("insertion of binary row into file failed : " + binaryFiles[currFileIdx], e);
        }
    }

    /**
     * Flush the table buffers for this table handler by closing and renaming the binary file to the
     * current millisecond time plus the binary file name
     */
    protected synchronized File flush() {
        // Check if anything was written into this table buffer
        if (binaryWriter == null) {
            return null;
        }

        // Flush the binary file buffer to disk if it is initialized
        try {
            binaryWriter.close();
        } catch (final IOException e) {
            logger.error("Error while flushing binaryWriter: " + e.getMessage());
        }
        binaryWriter = null;
        
        metricLogger.trace(rowCount + " rows to be persisted to file " + binaryFiles[currFileIdx].getName());

        // Rename the binary file
        final File flushedFile = new File(binaryFiles[currFileIdx].getParentFile(), getFilePrefix()
        		+ binaryFiles[currFileIdx].getName());
        binaryFiles[currFileIdx].renameTo(flushedFile);
                
        metricLogger.trace(rowCount + " rows persisted to file " + binaryFiles[currFileIdx].getName() + ", flushed to "
                + flushedFile.getName());

        // Return the flushed file
        rowCount = 0;
        
        // Inform subclasses that file has been flushed
        fileFlushed();
        
        return flushedFile;
    }
    
    protected String getCommonPrefix() {
    	return System.currentTimeMillis() + "_" + rowCount + ".";
    }

    @Override
    public void exportTo(final Statistics statistics) {
        statistics.add(Statistics.Keys.LAST_EVENT_TIME_FORWARDED, lastEventTimeForwarded);
    }

    private String currentTime() {
        return dateFormatter.format(new Date());
    }
    
    protected abstract boolean canEventBeAddedToFile(final ApEventBean event);
    
    protected abstract void eventInsertedIntoFile(final ApEventBean event);
    
    protected abstract void fileFlushed();
    
    protected abstract String getFilePrefix();
    
}
