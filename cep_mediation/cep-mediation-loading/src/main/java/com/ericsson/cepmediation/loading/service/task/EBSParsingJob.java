/**
 * (C) Copyright LM Ericsson System Expertise AT/LMI, 2011
 *
 * The copyright to the computer program(s) herein is the property of Ericsson
 * System Expertise EEI, Sweden. The program(s) may be used and/or copied only
 * with the written permission from Ericsson System Expertise AT/LMI or in
 * accordance with the terms and conditions stipulated in the agreement/contract
 * under which the program(s) have been supplied.
 *
 */

package com.ericsson.cepmediation.loading.service.task;

import java.util.Arrays;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.cepmediation.base.proc.config.ServiceConfigBean;
import com.ericsson.cepmediation.base.properties.CepMediationProperties;
import com.ericsson.cepmediation.base.properties.CepMediationProperty;
import com.ericsson.cepmediation.base.publishing.Publisher;
import com.ericsson.cepmediation.base.publishing.impl.EventBusPublisher;
import com.ericsson.cepmediation.base.util.ConfigData;
import com.ericsson.cepmediation.loading.filecollection.CollectionMode;
import com.ericsson.cepmediation.loading.filecollection.CollectionModeConfigured;
import com.ericsson.cepmediation.loading.service.InputType;
import com.ericsson.cepmediation.loading.service.task.collection.CollectionJob;
import com.ericsson.cepmediation.loading.service.task.collection.CollectionJobParameters;

/**
 * This class responsible for the EBS file parsing
 * 
 * @author eachsaj
 *
 */
public class EBSParsingJob extends ParsingJob {
    public static final String EBS_TAG = "ebs";

    private static final Logger logger = LoggerFactory.getLogger(EBSParsingJob.class);

    private static Lock processingLock = new ReentrantLock(true);

    /**
     * Constructor, sets up the configuration for the fetching/parsing job
     * @param serviceData 
     * 
     * @param jobCounter, int thread count
     * @param config, an instance of {@linkplain ConfigData}
     * @param serviceData, an instance of {@linkplain ServiceConfigBean}
     */
    public EBSParsingJob(final int jobCounter, final ConfigData config, final ServiceConfigBean serviceData) {
        super(jobCounter, config, serviceData, EBS_TAG);
        localFileStoragePath = config.getLocalFileStorage() + '/' + dataLabel.trim();
        logger.trace("EBSParsingJob()-->");
        logger.debug("Created EBS Parsing job " + jobCounter + " for the nodes\n" + Arrays.toString(serviceData.getMMENodes()));
        logger.trace("EBSParsingJob()<--");
    }

    @Override
    protected Publisher createPublisher(String label) {
        int buffSize = CepMediationProperties.getIntProperty(CepMediationProperty.EBS_PUBLISHING_BUFFER_SIZE);
        final EventBusPublisher eventBusPublisher = new EventBusPublisher(label, buffSize);
        return eventBusPublisher;
    }

    @Override
    protected CollectionJob createCollectionJob() {
        final CollectionJobParameters parameters = new CollectionJobParameters();
        CollectionMode collectionMode = new CollectionModeConfigured().getConfiguredCollectionMode(getInputType());
        parameters.setConfig(config);
        parameters.setServiceData(serviceData);
        parameters.setJobLabel(jobLabel);
        parameters.setFileServerData(config.getServerData());
        parameters.setSearchPattern(".*_ebs..*");
        parameters.setShouldDeleteAdditionalFiles(false);
        parameters.setInputType(getInputType());
        parameters.setShouldRenameCopiedFiles(false);
        parameters.setCollectionMode(collectionMode);
        parameters.setDeleteRemoteFilesAfterCopy(collectionMode == CollectionMode.SYMBOLIC_LINK);
        parameters.setPathToFilesCopiedLocally(localFileStoragePath);
        return new CollectionJob(parameters);
    }

    @Override
    protected InputType getInputType() {
        return InputType.EBS;
    }

    @Override
    protected Lock getProcessingLock() {
        return isSerialProcessing ? processingLock : null;
    }

}
