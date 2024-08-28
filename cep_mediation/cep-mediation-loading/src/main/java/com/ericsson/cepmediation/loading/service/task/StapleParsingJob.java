package com.ericsson.cepmediation.loading.service.task;

import java.util.Arrays;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.cepmediation.base.proc.config.ServiceConfigBean;
import com.ericsson.cepmediation.base.util.ConfigData;
import com.ericsson.cepmediation.loading.filecollection.CollectionMode;
import com.ericsson.cepmediation.loading.filecollection.CollectionModeConfigured;
import com.ericsson.cepmediation.loading.service.InputType;
import com.ericsson.cepmediation.loading.service.task.collection.CollectionJob;
import com.ericsson.cepmediation.loading.service.task.collection.CollectionJobParameters;

/**
 * This class initiates a Staple parsing job
 * 
 * @author eeilfn
 *
 */
public final class StapleParsingJob extends ParsingJob {
    public static final String STAPLE_TAG = "staple";

    private static final Logger logger = LoggerFactory.getLogger(StapleParsingJob.class);

    private static Lock processingLock = new ReentrantLock(true);

    /**
     * Constructor, sets up the configuration for the fetching/parsing job
     * @param serviceData 
     * 
     * @param jobCounter, int thread count
     * @param config, an instance of ConfigData
     * @param serviceData, an instance of ServiceConfigBean
     */
    public StapleParsingJob(final int jobCounter, final ConfigData config, ServiceConfigBean serviceData) {
        super(jobCounter, config, serviceData, STAPLE_TAG);
        localFileStoragePath = config.getLocalFileStorage() + '/' + STAPLE_TAG + "_" + dataLabel.trim();
        logger.trace("Constructs StapleParsingJob( " + jobCounter + "," + config.toString() + ")-->");
        logger.debug("Created Staple Parsing job " + jobCounter + " for the nodes\n" + Arrays.toString(serviceData.getProbeLogNodes()));
        logger.trace("Constructs StapleParsingJob( " + jobCounter + "," + config.toString() + ")<--");
    }

    @Override
    public CollectionJob createCollectionJob() {
        final CollectionJobParameters parameters = new CollectionJobParameters();
        parameters.setConfig(config);
        parameters.setFileServerData(config.getServerData());
        parameters.setSearchPattern(".*_tcpta-partial_.*.gz");
        parameters.setJobLabel(jobLabel);
        parameters.setServiceData(serviceData);
        //The additional counters_<uniqNum>.log, webpage_<uniqNum>.log and webreq_<uniqNum>.log files must be deleted.
        parameters.setShouldDeleteAdditionalFiles(true);
        parameters.setInputType(getInputType());
        parameters.setShouldRenameCopiedFiles(false);
        CollectionMode collectionMode = new CollectionModeConfigured().getConfiguredCollectionMode(getInputType());
        parameters.setCollectionMode(collectionMode);
        parameters.setDeleteRemoteFilesAfterCopy(collectionMode == CollectionMode.SYMBOLIC_LINK);
        parameters.setPathToFilesCopiedLocally(localFileStoragePath);
        return new CollectionJob(parameters);
    }

    @Override
    protected long getStartdelay() {
        return 5000;
    }

    @Override
    protected InputType getInputType() {
        return InputType.STAPLE;
    }

    @Override
    protected Lock getProcessingLock() {
        return isSerialProcessing ? processingLock : null;
    }
}
