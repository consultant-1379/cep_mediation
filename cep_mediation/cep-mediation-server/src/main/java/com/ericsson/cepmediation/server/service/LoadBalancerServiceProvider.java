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
 * This class responsible to run the load balancer service.
 * @author eachsaj
 *
 */
public class LoadBalancerServiceProvider implements Service {
	
	// Get a reference to the logger
    private static final Logger logger = LoggerFactory.getLogger(LoadBalancerServiceProvider.class);

	/*
	 *instance of the  
	 */
	private ServiceExecuter command=null;


	/* (non-Javadoc)
	 * @see com.ericsson.cepmediation.base.service.Process#start()
	 */
	@Override
	public void start() throws ServiceException {
		logger.trace("start()-->");
		logger.debug("Starting Load Balance Service");
		command.execute();
		logger.debug("Started Load Balance Service");
		logger.trace("start()<--");
	}

	/* (non-Javadoc)
	 * @see com.ericsson.cepmediation.base.service.Process#stop()
	 */
	@Override
	public void stop() {
		logger.trace("stop()-->");
		logger.debug("Stopping Load Balance Service");
		if (command != null) {
			command.terminate();
		}
		logger.debug("Stopped Load Balance Service");
		logger.trace("stop()<--");
	}

	/* (non-Javadoc)
	 * @see com.ericsson.cepmediation.base.service.Process#init(com.ericsson.cepmediation.base.util.ConfigData, com.ericsson.cepmediation.base.proc.config.ServiceConfigBean)
	 */
	@Override
	public void init(ConfigData data, ServiceConfigBean serviceData)throws ServiceException {
		logger.trace("init()-->");
		//ignore serviceData
		command= ServiceExecuterFactory.createService(SERVICES.LOAD_BAL_SERVICE);
		// no need to pass this service 
		command.init(data,null);
		logger.debug("Load Balance Service iInitialised");
		logger.trace("init()<--");
	}

}