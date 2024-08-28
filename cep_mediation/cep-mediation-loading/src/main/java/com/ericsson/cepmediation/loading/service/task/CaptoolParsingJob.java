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
 * This class initiates a Captool parsing job
 * 
 * @author eeilfn
 *
 */
public final class CaptoolParsingJob extends ParsingJob {
    public static final String CAPTOOL_TAG = "captool";

    private static final Logger logger = LoggerFactory.getLogger(CaptoolParsingJob.class);

    private static Lock processingLock = new ReentrantLock(true);

    /**
     * Constructor, sets up the configuration for the fetching/parsing job
     * @param serviceData 
     * 
     * @param jobCounter, int thread count
     * @param config, an instance of ConfigData
     * @param serviceData, an instance of ServiceConfigBean
     */
    public CaptoolParsingJob(final int jobCounter, final ConfigData config, ServiceConfigBean serviceData) {
        super(jobCounter, config, serviceData, CAPTOOL_TAG);
        localFileStoragePath = config.getLocalFileStorage() + '/' + CAPTOOL_TAG + "_" + dataLabel.trim();
        logger.trace("Constructs CaptoolParsingJob( " + jobCounter + "," + config.toString() + ")-->");
        logger.debug("Created Captool Parsing job " + jobCounter + " for the nodes\n" + Arrays.toString(serviceData.getProbeLogNodes()));
        logger.trace("Constructs CaptoolParsingJob( " + jobCounter + "," + config.toString() + ")<--");
    }

    @Override
    protected CollectionJob createCollectionJob() {
        final CollectionJobParameters parameters = new CollectionJobParameters();

        parameters.setConfig(config);
        parameters.setServiceData(serviceData);
        parameters.setFileServerData(config.getServerData());

        parameters.setSearchPattern(".*summary_.*.gz");

        parameters.setJobLabel(jobLabel);

        parameters.setShouldDeleteAdditionalFiles(false);
        parameters.setInputType(getInputType());
        parameters.setShouldRenameCopiedFiles(true);

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
        return InputType.CAPTOOL;
    }

    @Override
    protected Lock getProcessingLock() {
        return isSerialProcessing ? processingLock : null;
    }

}
