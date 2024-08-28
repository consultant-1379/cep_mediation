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

public class IMEIEnrichmentServiceProvider implements Service {
    private static final Logger logger = LoggerFactory.getLogger(IMEIEnrichmentServiceProvider.class);

    // correlation service 
    private ServiceExecuter command;

    @Override
    public void start() throws ServiceException {
        logger.trace("start() -->");
        command.execute();
        logger.trace("start() <--");
    }

    @Override
    public void stop() {
        logger.trace("stop() -->");
        if (command != null) {
            command.terminate();
        }
        logger.trace("stop() -->");
    }

    @Override
    public void init(final ConfigData data, final ServiceConfigBean serviceData) throws ServiceException {
        logger.trace("init() -->");
        command = ServiceExecuterFactory.createService(SERVICES.IMEI_ENRICHMENT_SERVICE);
        command.init(data, serviceData);
        logger.info("IMEI Enrichment Service initialised");
        logger.trace("init() -->");
    }

}
