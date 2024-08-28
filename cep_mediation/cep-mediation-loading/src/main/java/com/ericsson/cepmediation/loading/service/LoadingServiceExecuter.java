package com.ericsson.cepmediation.loading.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.cepmediation.base.features.impl.FeatureManagerImpl;
import com.ericsson.cepmediation.base.proc.config.NE_TYPE;
import com.ericsson.cepmediation.base.proc.config.Ne;
import com.ericsson.cepmediation.base.proc.config.ServiceConfigBean;
import com.ericsson.cepmediation.base.properties.CepMediationProperties;
import com.ericsson.cepmediation.base.properties.CepMediationProperty;
import com.ericsson.cepmediation.base.service.ServiceException;
import com.ericsson.cepmediation.base.service.ServiceExecuter;
import com.ericsson.cepmediation.base.util.ConfigData;
import com.ericsson.cepmediation.base.util.threadpool.CollectionScheduler;
import com.ericsson.cepmediation.base.util.threadpool.Worker;
import com.ericsson.cepmediation.base.util.threadpool.WorkerDetails;

public class LoadingServiceExecuter implements ServiceExecuter {

    private static final Logger logger = LoggerFactory.getLogger(LoadingServiceExecuter.class);

    // Constants for collection intervals
    private final int DEFAULT_COLLECTION_START_DELAY = CepMediationProperties.getIntProperty(CepMediationProperty.GENERAL_SERVER_COLLECTION_START_DELAY);

    private final int DEFAULT_COLLECTION_INTERVAL = CepMediationProperties.getIntProperty(CepMediationProperty.GENERAL_SERVER_COLLECTION_INTERVAL);

    // number Runnable tasks stores in this list and scheduler uses this list
    // later for scheduling
    private final Collection<WorkerDetails> jobsList = new ArrayList<WorkerDetails>();

    // thread pool scheduler instance.
    private CollectionScheduler scheduler;

    // Save collection interval values from the configuration data, in minutes
    private final int collectionStartDelay = DEFAULT_COLLECTION_START_DELAY;

    private final int collectionInterval = DEFAULT_COLLECTION_INTERVAL;

    private LoadingServiceExecuter() {

    }

    public static LoadingServiceExecuter create() {
        return new LoadingServiceExecuter();
    }

    @Override
    public void init(final ConfigData data, final ServiceConfigBean serviceBean) {

        // MME file processing starts here/ MME will be handled by Admin server,
        // because its a small number of nodes
        initializeMMEProcessHandlers(serviceBean);
        // Probe log file processing starts here
        // TODO: Probe log file processing must be load balanced
        initializeProbeLogProcessHandlers(serviceBean);
        // GPEH file processing starts here
        // TODO: GPEH file processing must be load balanced
        initializeRNCProcessHandlers(serviceBean);

        logger.debug("initialized Loading Service");
    }

    @Override
    public void execute() throws ServiceException {
        setupScheduler();

    }

    @Override
    public void terminate() {
        stopScheduler();

    }

    private void initializeMMEProcessHandlers(final ServiceConfigBean serviceData) {
        ConfigData ebsJobData = null;
        Worker sgehJob = null;

        List<Ne> mmeNodes = serviceData.getNetworkElementsOfType(NE_TYPE.SGEH);

        // Set up the SGEH job
        for (Ne mmeNode : mmeNodes) {
            ebsJobData = ConfigData.create(mmeNode);
            sgehJob = ParsingJobFactory.create(InputType.EBS, jobsList.size() + 1, ebsJobData, serviceData);
            addParsingJobToJobsList(sgehJob);
        }
    }

    private void initializeProbeLogProcessHandlers(final ServiceConfigBean serviceData) {
        Worker captoolJob = null;
        Worker stapleJob = null;
        ConfigData captoolJobData = null;
        ConfigData stapleJobData = null;

        List<Ne> probeNodes = serviceData.getNetworkElementsOfType(NE_TYPE.USER_PLANE);
        if (!probeNodes.isEmpty() && !FeatureManagerImpl.getInstance().isUserPlaneEnabled()) {
            logger.warn("User plane network element is defined but user plane is either not enabled or licence is not valid. Please enable user plane or remove the element. Ignoring up nodes: " + probeNodes);
            return;
        }

        // Set up the Probe job
        for (Ne probeNode : probeNodes) {
            captoolJobData = ConfigData.create(probeNode);
            captoolJob = ParsingJobFactory.create(InputType.CAPTOOL, jobsList.size() + 1, captoolJobData, serviceData);
            addParsingJobToJobsList(captoolJob);

            stapleJobData = ConfigData.create(probeNode);//need seperate SchemaHandler.(this object shared.)
            stapleJob = ParsingJobFactory.create(InputType.STAPLE, jobsList.size() + 1, stapleJobData, serviceData);
            addParsingJobToJobsList(stapleJob);
        }

    }

    private void initializeRNCProcessHandlers(final ServiceConfigBean serviceData) {
        ConfigData gpehJobData = null;
        Worker gpehJob = null;
        List<Ne> rncNodes = serviceData.getNetworkElementsOfType(NE_TYPE.GPEH);

        // Set up the GPEH job
        for (Ne rncNode : rncNodes) {
            gpehJobData = ConfigData.create(rncNode);
            gpehJob = ParsingJobFactory.create(InputType.GPEH, jobsList.size() + 1, gpehJobData, serviceData);
            addParsingJobToJobsList(gpehJob);
        }
    }

    private void addParsingJobToJobsList(Worker parsingJob) {
        jobsList.add(new WorkerDetails(parsingJob, collectionStartDelay, collectionInterval, TimeUnit.SECONDS));
    }

    private void setupScheduler() {
        scheduler = new CollectionScheduler(jobsList.size());
        scheduler.setupTimedExecuter(jobsList);
    }

    private void stopScheduler() {
        if ((scheduler != null) && (!scheduler.isShutDown())) {// recreate
            scheduler.shutDown();
            scheduler = null;
        }
    }
}
