/*------------------------------------------------------------------------------
 *******************************************************************************
 * COPYRIGHT Ericsson 2015
 *
 * The copyright to the computer program(s) herein is the property of
 * Ericsson Inc. The programs may be used and/or copied only with written
 * permission from Ericsson Inc. or in accordance with the terms and
 * conditions stipulated in the agreement/contract under which the
 * program(s) have been supplied.
 *******************************************************************************
 *----------------------------------------------------------------------------*/
package com.ericsson.cepmediation.loading.service.task;

import java.io.File;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.cepmediation.base.proc.config.ServiceConfigBean;
import com.ericsson.cepmediation.base.properties.CepMediationProperties;
import com.ericsson.cepmediation.base.properties.CepMediationProperty;
import com.ericsson.cepmediation.base.publishing.Publisher;
import com.ericsson.cepmediation.base.publishing.impl.AutoFlushingPublisher;
import com.ericsson.cepmediation.base.semaphor.ProcessSemaphore;
import com.ericsson.cepmediation.base.util.ConfigData;
import com.ericsson.cepmediation.base.util.Metrics;
import com.ericsson.cepmediation.base.util.Pair;
import com.ericsson.cepmediation.base.util.Utilities;
import com.ericsson.cepmediation.base.util.threadpool.AbstractJob;
import com.ericsson.cepmediation.loading.exception.ParsingFailedException;
import com.ericsson.cepmediation.loading.filecollection.CollectionMode;
import com.ericsson.cepmediation.loading.filecollection.CollectionModeConfigured;
import com.ericsson.cepmediation.loading.filerecords.LoadingMetrics;
import com.ericsson.cepmediation.loading.service.GPEHParser;
import com.ericsson.cepmediation.loading.service.InputType;
import com.ericsson.cepmediation.loading.service.ParserFactory;
import com.ericsson.cepmediation.loading.service.ParserService;
import com.ericsson.cepmediation.loading.service.task.collection.CollectionJob;

/**
 * This class provides a generic parsing mechanism, it used by it's subclasses.
 * 
 * @author eachsaj
 * @since 20/5/2011
 */

public abstract class ParsingJob extends AbstractJob {
    private static final Logger logger = LoggerFactory
            .getLogger(ParsingJob.class);

    private static final Logger metricLogger = LoggerFactory
            .getLogger(Metrics.class);

    // The scan interval to use for buffer flushing
    private static final int PUBLISHING_SCAN_INTERVAL = CepMediationProperties
            .getIntProperty(CepMediationProperty.PUBLISHING_LOADING_SCAN_INTERVAL);

    // Constant defining the delay for CTR file collection, in milliseconds
    private static final long DEFAULT_START_DELAY = 0;

    // The local path to store files. When collection type is remote, the remote
    // files
    // are copied locally to this folder. Also, the dotLast file goes there.
    protected String localFileStoragePath;

    // Configuration data
    protected ConfigData config = null;

    // Service data
    protected final ServiceConfigBean serviceData;

    // Instance of parser, created by sub classes when creates the constructor
    protected ParserService parser;

    // Used to fetch the files for parsing
    protected CollectionJob collectionJob;

    // Collection mode defined in config.xml for this parser
    private final CollectionMode collectionMode;

    protected int jobCounter = -1;

    protected String jobLabel;

    protected String dataLabel;

    protected boolean isSerialProcessing;

    private Map<Integer, Long> eventsCounter = new HashMap<Integer, Long>();

    private long startTime = System.currentTimeMillis();

    private long currentTime = System.currentTimeMillis();

    private final int otherEvents = 0;

    private int flag = 1;

    private final int oneHour = 3600000;

    private int numberOfRopsProcessed = 0;

    /**
     * Constructor, sets up the configuration for the fetching/parsing job
     * 
     * @param serviceData
     * 
     * @param jobCounter
     *            , int thread count
     * @param config
     *            , an instance of {@linkplain ConfigData}
     * @param serviceData
     *            , an instance of {@linkplain ServiceConfigBean}
     */
    public ParsingJob(final int jobCounter, final ConfigData config,
            final ServiceConfigBean serviceData, String tag) {
        this.dataLabel = config.getNetworkElement().getLabel();
        if (dataLabel == null || dataLabel.isEmpty()) {
            logger.error("Network element without label! Exiting...");
            throw new IllegalArgumentException(
                    "Please specify label for every network element in network_elements.xml!");
        }
        this.collectionMode = new CollectionModeConfigured()
                .getConfiguredCollectionMode(getInputType());
        this.jobName = "  Job-" + jobCounter;
        this.config = config;
        this.serviceData = serviceData;
        this.jobCounter = jobCounter;
        this.jobLabel = getJobLabel(tag);
        this.isSerialProcessing = serviceData.isSerialProcessing();
        this.startTime = System.currentTimeMillis();
        this.currentTime = System.currentTimeMillis();

        logger.trace("ParsingJob(" + jobCounter + "," + config + ")");
        metricLogger.trace("job: " + jobLabel
                + ", creating job for nodes: label_"
                + config.getNetworkElement().getLabel() + " directory : "
                + config.getNetworkElement().getDirectory());
        logger.debug("job: " + jobLabel + ", creating job");

        logger.trace("ParsingJob(" + jobLabel + "," + "config)<--");
    }

    public void init() {
        parser = ParserFactory.create(getInputType());
        try {
            final Publisher[] publisherList = new Publisher[] { createPublisher(dataLabel) };
            parser.initialize(config.getSchemaHandler(), publisherList);
        } catch (final ParsingFailedException e) {
            logger.error("Schema creation failed", e);
        }

        collectionJob = createCollectionJob();

        if (collectionJob.getCollectionMode() != CollectionMode.SYMBOLIC_LINK) {
            final Map<Long, Collection<File>> fileROPMap = collectionJob
                    .getFileNamesByROP(getInputFolderPaths());
            if (!fileROPMap.isEmpty()) {
                collectionJob.cleanUp(fileROPMap, null);
            }
        }
    }

    protected abstract CollectionJob createCollectionJob();

    protected abstract InputType getInputType();

    // allow overriding
    protected Publisher createPublisher(String label) {
        return new AutoFlushingPublisher(label, PUBLISHING_SCAN_INTERVAL);
    }

    private String getJobLabel(String tag) {
        return tag + '_' + serviceData.getProcessId() + '-'
                + serviceData.getServiceId() + '-' + jobCounter;
    }

    /**
     * This method read all files from the specified path and feed into the
     * parser.
     */
    protected void parseFiles(final Collection<File> fileNames) {
        // read all files
        try {
            // Execute the parsing task
            final LoadingMetrics loadingMetrics = parser.execute(fileNames);

            // Do the below only for Gpeh only data
            if (parser instanceof GPEHParser) {
                currentTime = System.currentTimeMillis();
                numberOfRopsProcessed++;

                if (flag == 1) {
                    eventsCounter.putAll(loadingMetrics
                            .getEnabledEventsCounter());
                    flag = 2;

                } else {
                    for (Integer key : loadingMetrics.getEnabledEventsCounter()
                            .keySet()) {
                        Long value = loadingMetrics.getEnabledEventsCounter()
                                .get(key);
                        if (eventsCounter.containsKey(key))
                            eventsCounter.put(key,
                                    (eventsCounter.get(key) + value));
                    }
                }
                if ((currentTime - startTime) >= oneHour) {
                    displayEventDistributionForGpeh();
                    clearEventsForGpeh();
                    startTime = System.currentTimeMillis();
                    numberOfRopsProcessed = 0;
                }
            }
            logger.debug("job: " + jobLabel + ", loading metrics:"
                    + loadingMetrics);
            metricLogger.trace("job: " + jobLabel + ", loading metrics:"
                    + loadingMetrics);

        } catch (final ParsingFailedException e) {
            logger.error(
                    "job: " + jobLabel + "Parsing failed for following files: "
                            + Arrays.toString(fileNames.toArray()), e);
        }
    }

    /**
     * Execute the job to fetch and parse the files
     */
    @Override
    public void executeJob() {
        logger.trace("Executing executeJob( " + jobLabel + ")-->");

        // Wait for a certain amount of time before starting, defined in
        // subclass
        waitForStart();

        fetchAndParseFiles();

        logger.trace("Executing executeJob( " + jobLabel + ")<--");
    }

    private void fetchAndParseFiles() {
        Map<Long, Collection<File>> fileROPMap = null;
        try {
            boolean hasMore = false;
            do {
                final long time = System.currentTimeMillis();

                // Copy the files if needed
                hasMore = collectionJob.fetchFiles();

                metricLogger.trace("job: " + jobLabel + ", loading started");
                logger.debug("job: " + jobLabel + ", loading started");

                // Get the list of files to parse by ROP
                fileROPMap = collectionJob
                        .getFileNamesByROP(getInputFolderPaths());

                Pair<Long, Collection<File>> excludedFiles = parseRops(fileROPMap);

                trace("job: " + jobLabel + ", loading completed, total time="
                        + (System.currentTimeMillis() - time));

                if (fileROPMap != null && !fileROPMap.isEmpty()) {
                    collectionJob.cleanUp(fileROPMap, excludedFiles);
                }

            } while (hasMore);
        } catch (Exception e) {
            // Just log the error, this thread should not exit.
            logger.debug("Error parsing files: " + e.getMessage());
        }
    }

    private Pair<Long, Collection<File>> parseRops(
            Map<Long, Collection<File>> fileROPMap) {
        // Iterate over each ROP
        for (final Long ropTime : fileROPMap.keySet()) {
            final Collection<File> filesForROP = fileROPMap.get(ropTime);
            if (completeROPExists(filesForROP)) {
                parseRop(filesForROP, ropTime);
            } else if (!isLaterRopExist(ropTime, fileROPMap)) {
                logger.info("job: "
                        + jobLabel
                        + ", reserving ROP "
                        + Utilities.time2UTCString(ropTime)
                        + " as not all rop files present and no later rop exist.");
                Collection<File> excludedFiles = fileROPMap.get(ropTime);
                return new Pair<Long, Collection<File>>(ropTime, excludedFiles);
            } else {
                logger.info("job: "
                        + jobLabel
                        + ", stop processing ROP "
                        + Utilities.time2UTCString(ropTime)
                        + " as not all rop files present and later rop exist, files ll be discarded.");
            }
        }
        return null;
    }

    private boolean isLaterRopExist(Long ropTimeOfIncompleteRop,
            Map<Long, Collection<File>> fileROPMap) {
        for (Long ropTime : fileROPMap.keySet())
            if (ropTime > ropTimeOfIncompleteRop)
                return true;
        return false;
    }

    private void parseRop(Collection<File> filesForROP, Long ropTime) {
        Lock processingLock = getProcessingLock();
        if (processingLock != null) {
            processingLock.lock();
        }
        try {
            logger.info("parse job: " + jobLabel + ", processing ROP "
                    + Utilities.time2UTCString(ropTime));

            // This invocation is needed just to register the label
            if (dataLabel != null) {
                ProcessSemaphore.getInstance().await(dataLabel);
            }

            // Parse the files for this ROP
            parseFiles(filesForROP);

            try {
                // allow some time for the consumers to start
                // Reduced this delay from 5 seconds to 1 second to allow for
                // the support of 1 min Gpeh ROPs and the fact
                // that there can be multiple RNCs handled by the same process.
                // A 5 second delay for each RNC may not
                // allow enough time for loading and correlation for all RNCs
                // within 1 minute.
                Thread.sleep(1 * 1000);
            } catch (InterruptedException e) {
                logger.error("Interrupted", e);
            }

            // Wait for consumer(correlation process) to finish
            if (dataLabel != null) {
                ProcessSemaphore.getInstance().await(dataLabel);
            }

            logger.info("parse job: " + jobLabel + ", ROP processed "
                    + Utilities.time2UTCString(ropTime));
        } finally {
            if (processingLock != null) {
                processingLock.unlock();
            }
        }

    }

    protected abstract Lock getProcessingLock();

    private String getInputFolderPaths() {
        switch (collectionMode) {
        case SYMBOLIC_LINK:
            return getSymLinkDir();
        default:
            return getLocalDir();
        }
    }

    protected String getLocalDir() {
        return localFileStoragePath;
    }

    private String getSymLinkDir() {
        return config.getNetworkElement().getDirectory();
    }

    // Hook for checking rop integrity in sub classes
    protected boolean completeROPExists(final Collection<File> filesForROP) {
        return true;
    }

    private void trace(final String message) {
        metricLogger.trace(message);
        logger.info(message);
    }

    /**
     * Method to call sub class method to get the start delay
     */
    private void waitForStart() {
        try {
            Thread.sleep(getStartdelay());
        } catch (final Exception e) {
        }
    }

    /**
     * Method implemented by subclasses to define a delay for starting
     * 
     * @return start delay in milliseconds
     */
    protected long getStartdelay() {
        return DEFAULT_START_DELAY;
    }

    /**
     * Set the status of a job
     * 
     * @param jobStatus
     *            The job status
     */
    protected void setJobStatus(final String jobStatus) {
        this.jobStatus = jobStatus;
        trace("job: " + jobLabel + ", status=" + jobStatus);
    }

    public void displayEventDistributionForGpeh() {
        long otherEventsCounter = 0;

        final StringBuilder res = new StringBuilder();
        res.append("event_distribution:  ");
        res.append("number of rops processed=" + numberOfRopsProcessed);

        for (Integer key : eventsCounter.keySet()) {
            Long value = eventsCounter.get(key);
            if (key != otherEvents)
                res.append(", eventid=" + key + " count=" + value + "  ");
            else
                otherEventsCounter = value;
        }
        res.append(", other events count= " + otherEventsCounter + "  ");
        logger.info(res.toString());
    }

    public void clearEventsForGpeh() {
        for (Integer key : eventsCounter.keySet()) {
            eventsCounter.put(key, (long) 0);
        }
    }
}
