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

/**
 * This interface defines the service execution methods
 * @author eachsaj
 * @category Base
 */
public interface ServiceExecuter {

    void init(ConfigData data, ServiceConfigBean serviceData);

    /**
     * This method executes the requested service
     * @throws ServiceException 
     */
    void execute() throws ServiceException;

    /**
     * this method stops the service 
     */
    void terminate();
}
