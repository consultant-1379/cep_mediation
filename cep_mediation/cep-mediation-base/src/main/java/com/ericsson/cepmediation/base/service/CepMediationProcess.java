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
package com.ericsson.cepmediation.base.service;

import com.ericsson.cepmediation.base.proc.config.ServiceConfigBean;
import com.ericsson.cepmediation.base.util.ConfigData;

public interface CepMediationProcess {

    /**
     * This method can be used to start the service and it will called by the
     * class  ServiceLoader
     * 
     * @throws ServiceException
     *              if the system failed to start the requested service
     */
    void start() throws ServiceException;

    /**
     * This method provider must provide an implementation to end the service
     * gracefully.
     */
    void stop();

    /**
     * This method  may be executed as part of the start method. This method
     * can be used to pass the configuration data or arguments into the service
     * class.
     * 
     * @param data , an instance of {@link ConfigData}
     */
    void init(ConfigData data, ServiceConfigBean serviceData) throws ServiceException;
}
