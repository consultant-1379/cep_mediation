/***------------------------------------------------------------------------------	
 *******************************************************************************	
 * COPYRIGHT Ericsson 2013	
 *	
 * The copyright to the computer program(s) herein is the property of	
 * Ericsson Inc. The programs may be used and/or copied only with written	
 * permission from Ericsson Inc. or in accordance with the terms and	
 * conditions stipulated in the agreement/contract under which the	
 * program(s) have been supplied.	
 *******************************************************************************
-----------------------------------------------------------------------------------------------*/
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
 * This service class provides a data forwarder implementation. The deletion
 * service may not be called by server.
 * 
 * @author xalomis
 * 
 */
public class UERTTDataForwarderServiceProvider implements Service {

    private static final Logger logger = LoggerFactory
            .getLogger(UERTTDataForwarderServiceProvider.class);

    private ServiceExecuter dataForwarderListenerExecuter = null;

    @Override
    public void init(ConfigData data, ServiceConfigBean serviceData)
            throws ServiceException {
        logger.info("Start UERTTDataForwarderServiceProvider :init() -->");
        dataForwarderListenerExecuter = ServiceExecuterFactory
                .createService(SERVICES.UERTT_DATA_FORWARDER_SERVICE);
        dataForwarderListenerExecuter.init(data, serviceData);
        logger.info("End UERTTDataForwarderServiceProvider :init() <---");
    }

    @Override
    public void start() throws ServiceException {
        logger.info("Start UERTTDataForwarderServiceProvider :start() --->");
        dataForwarderListenerExecuter.execute();
        logger.info("End UERTTDataForwarderServiceProvider :start() <---");
    }

    @Override
    public void stop() {
        logger.info("Start UERTTDataForwarderServiceProvider :stopt() --->");
        if (dataForwarderListenerExecuter != null) {
            dataForwarderListenerExecuter.terminate();
        }
        logger.info("Start UERTTDataForwarderServiceProvider :stopt() <---");
    }
}
