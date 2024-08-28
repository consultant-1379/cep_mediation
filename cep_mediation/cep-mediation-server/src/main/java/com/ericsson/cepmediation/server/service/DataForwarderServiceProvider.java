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

package com.ericsson.cepmediation.server.service;

import com.ericsson.cepmediation.base.proc.config.ServiceConfigBean;
import com.ericsson.cepmediation.base.service.SERVICES;
import com.ericsson.cepmediation.base.service.Service;
import com.ericsson.cepmediation.base.service.ServiceException;
import com.ericsson.cepmediation.base.service.ServiceExecuter;
import com.ericsson.cepmediation.base.util.ConfigData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This service class provides a data forwarder implementation.
 * The deletion service may not be called by server.
 * @category Platform
 * @author eachsaj
 *
 */
public class DataForwarderServiceProvider implements Service {
    // Get a reference to the logger
    private static final Logger logger = LoggerFactory.getLogger(DataForwarderServiceProvider.class);

    // Save the database listener service executer instance
    private ServiceExecuter dataForwarderListenerExecuter = null;

    @Override
    public void init(ConfigData data, ServiceConfigBean serviceData) throws ServiceException {
        logger.trace("init() --->");
        dataForwarderListenerExecuter = ServiceExecuterFactory.createService(SERVICES.DATA_FORWARDER_SERVICE);
        dataForwarderListenerExecuter.init(data, serviceData);
        logger.debug("DBService initilised");
        logger.trace("init() <---");
    }

    @Override
    public void start() throws ServiceException {
        logger.trace("start() --->");
        logger.debug("Creating DB schema");
        // Register all schema types with database listener
        logger.debug("Registering all schema types with database listeners ");
        dataForwarderListenerExecuter.execute();
        logger.trace("start() <---");
    }

    @Override
    public void stop() {
        logger.trace("stop() --->");

        // Check if the database listener executer is set
        if (dataForwarderListenerExecuter != null) {
            dataForwarderListenerExecuter.terminate();
        }
        logger.debug("Deleted DB schema");
        logger.trace("stop() <---");
    }
}
