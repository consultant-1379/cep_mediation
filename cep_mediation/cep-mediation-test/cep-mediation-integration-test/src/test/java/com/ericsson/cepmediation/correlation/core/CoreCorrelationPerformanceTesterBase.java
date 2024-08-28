package com.ericsson.cepmediation.correlation.core;

import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.ericsson.cepmediation.base.proc.config.HostConfigBean;
import com.ericsson.cepmediation.base.proc.config.ProcessConfigBean;
import com.ericsson.cepmediation.base.proc.config.ServiceConfigBean;
import com.ericsson.cepmediation.base.properties.CepMediationProperties;
import com.ericsson.cepmediation.base.properties.CepMediationProperty;
import com.ericsson.cepmediation.base.properties.ConfigBinder;
import com.ericsson.cepmediation.base.properties.ConfigurationException;
import com.ericsson.cepmediation.base.publishing.Publisher;
import com.ericsson.cepmediation.base.publishing.impl.EventBusPublisher;
import com.ericsson.cepmediation.base.service.ServiceException;
import com.ericsson.cepmediation.base.util.ConfigData;
import com.ericsson.cepmediation.correlation.service.CorrelationExecuter;
import com.ericsson.cepmediation.forwarding.ForwarderListenerExecuter;
import com.ericsson.cepmediation.loading.exception.ParsingFailedException;
import com.ericsson.cepmediation.loading.service.InputType;
import com.ericsson.cepmediation.loading.service.ParserFactory;
import com.ericsson.cepmediation.loading.service.ParserService;

/**
 * Base class for the core correlation intergation test
 *
 * @author exuexie
 */
public class CoreCorrelationPerformanceTesterBase {

    protected ConfigData configData;

    protected ConfigBinder configBinder;

    protected ServiceConfigBean correlationServiceBean;

    protected ServiceConfigBean forwardServiceBean;

    //parse service
    protected ParserService parser;

    protected CorrelationExecuter correlationExecuter;

    //forwarder listener
    protected ForwarderListenerExecuter forwarderListenerExecuter;

    private static final int BUFFER_SIZE = 8000000;

    protected static final int PUBLISHING_SCAN_INTERVAL = CepMediationProperties
            .getIntProperty(CepMediationProperty.PUBLISHING_LOADING_SCAN_INTERVAL);

    public void init() {

        //create the ConfigData bean
        configData = ConfigData.create(null);

        configBinder = ConfigBinder.getInstance();

        final HostConfigBean masterHostConfigBean = configBinder.getMasterHostConfig();

        final ProcessConfigBean processBean = configBinder.getProcessList(masterHostConfigBean).get(0);

        //get the service for Core Correlation service
        correlationServiceBean = processBean.getServiceByName("CoreCorrelationService");

        correlationExecuter = CorrelationExecuter.create();

        forwardServiceBean = processBean.getServiceByName("ForwarderService");

        forwarderListenerExecuter = ForwarderListenerExecuter.create();

    }

    /**
     * start the loading
     */
    protected void configureParser() {

        try {

            //create a new parser for EBM files
            parser = ParserFactory.create(InputType.EBS);

            final EventBusPublisher parsingPublisher = new EventBusPublisher("", BUFFER_SIZE);

            final Publisher[] publisherList = new Publisher[] { parsingPublisher };

            //initialise the EBS parser
            parser.initialize(configData.getSchemaHandler(), publisherList);

        } catch (final ParsingFailedException e) {
            e.printStackTrace();
        }

    }

    /**
     * Start the esper service
     */
    protected void configureEsperService() {

        correlationExecuter.init(configData, correlationServiceBean);

        try {
            correlationExecuter.execute();
        } catch (final ServiceException e) {
            e.printStackTrace(); //To change body of catch statement use File | Settings | File Templates.
        }
    }

    public void configureForwarder() {

        forwarderListenerExecuter.init(configData, forwardServiceBean);

    }

    protected List<File> getFiles(final String folder) {
        final File directory = new File(folder);
        final File[] files = directory.listFiles(new FileFilter() {
            @Override
            public boolean accept(final File file) {
                return file.isFile();
            }
        });

        if (files == null) {
            return Collections.emptyList();
        }

        Arrays.sort(files);
        return Arrays.asList(files);
    }

}
