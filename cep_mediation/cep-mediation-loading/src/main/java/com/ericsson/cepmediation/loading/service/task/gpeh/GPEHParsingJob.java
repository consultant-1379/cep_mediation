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

package com.ericsson.cepmediation.loading.service.task.gpeh;

import java.io.File;
import java.util.Arrays;
import java.util.Collection;
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
import com.ericsson.cepmediation.loading.service.task.ParsingJob;
import com.ericsson.cepmediation.loading.service.task.collection.CollectionJob;
import com.ericsson.cepmediation.loading.service.task.collection.CollectionJobParameters;

/**
 * This class responsible for the GPEH file parsing.
 * 
 * @author eachsaj
 *
 */
public class GPEHParsingJob extends ParsingJob {
    public static final String GPEH_TAG = "gpeh";

    private static final Logger logger = LoggerFactory.getLogger(GPEHParsingJob.class);

    private static Lock processingLock = new ReentrantLock(true);

    /**
     * Constructor, sets up the configuration for the fetching/parsing job
     * @param serviceData 
     * 
     * @param jobCounter, int thread count
     * @param config, an instance of {@linkplain ConfigData}
     * @param serviceData, an instance of {@linkplain ServiceConfigBean}
     */
    public GPEHParsingJob(final int jobCounter, final ConfigData config, final ServiceConfigBean serviceData) {
        super(jobCounter, config, serviceData, GPEH_TAG);
        localFileStoragePath = config.getLocalFileStorage() + '/' + dataLabel.trim();
        logger.trace("GPEHParsingJob()-->");
        logger.debug("Created GPEH Parsing job " + jobCounter + " for the nodes\n" + Arrays.toString(serviceData.getRNCNodes()));
        logger.trace("GPEHParsingJob()<--");
    }

    @Override
    protected Publisher createPublisher(String label) {
        int buffSize = CepMediationProperties.getIntProperty(CepMediationProperty.GPEH_PUBLISHING_BUFFER_SIZE);
        final EventBusPublisher eventBusPublisher = new EventBusPublisher(label, buffSize);
        return eventBusPublisher;
    }

    @Override
    protected CollectionJob createCollectionJob() {
        final CollectionJobParameters parameters = new CollectionJobParameters();
        parameters.setConfig(config);
        parameters.setFileServerData(config.getServerData());
        parameters.setSearchPattern(".*_gpehfile_.*");
        parameters.setJobLabel(jobLabel);
        parameters.setServiceData(serviceData);
        parameters.setShouldDeleteAdditionalFiles(false);
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
        final String gpehStartDelayInSeconds = CepMediationProperties.getProperty(CepMediationProperty.ADDITIONAL_GPEH_SERVER_COLLECTION_START_DELAY);
        return Integer.parseInt(gpehStartDelayInSeconds) * 1000;
    }

    @Override
    protected InputType getInputType() {
        return InputType.GPEH;
    }

    @Override
    protected boolean completeROPExists(final Collection<File> filesForROP) {
        return new GPEHSubFilesChecker().areAllSubFilesPresent(filesForROP);
    }

    @Override
    protected Lock getProcessingLock() {
        return isSerialProcessing ? processingLock : null;
    }
}
