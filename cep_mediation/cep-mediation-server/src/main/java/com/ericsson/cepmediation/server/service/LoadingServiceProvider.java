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
 * This class responsible for start/stop the scp and parser services
 * @category Loader
 * @author eachsaj
 * 
 *
 */
public class LoadingServiceProvider implements Service {

    // Get a reference to the logger
    private static final Logger logger = LoggerFactory.getLogger(LoadBalancerServiceProvider.class);

    /**
     * instance of {@link ServiceExecuter}
     */
    private ServiceExecuter loadingService = null;

    @Override
    public void init(ConfigData data, ServiceConfigBean serviceData) throws ServiceException {
        logger.trace("init()-->");
        loadingService = ServiceExecuterFactory.createService(SERVICES.LOADING_SERVICE);
        loadingService.init(data, serviceData);
        logger.debug("Loading Service initialised");
        logger.trace("init()<--");
    }

    @Override
    public void start() throws ServiceException {
        logger.trace("start()-->");
        loadingService.execute();
        logger.debug("Loading Service Started");
        logger.trace("start()<--");
    }

    @Override
    public void stop() {
        logger.trace("stop()-->");
        if (loadingService != null) {
            loadingService.terminate();
        }
        logger.trace("stop()<--");
    }

}
