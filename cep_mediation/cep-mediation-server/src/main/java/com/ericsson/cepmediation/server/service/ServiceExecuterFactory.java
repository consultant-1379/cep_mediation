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

import com.ericsson.cepmediation.base.service.SERVICES;
import com.ericsson.cepmediation.base.service.ServiceException;
import com.ericsson.cepmediation.base.service.ServiceExecuter;
import com.ericsson.cepmediation.base.util.ErrorCode;
import com.ericsson.cepmediation.correlation.service.CorrelationExecuter;
import com.ericsson.cepmediation.forwarding.ForwarderListenerExecuter;
import com.ericsson.cepmediation.forwarding.uertt.UERTTForwarderListenerExecuter;
import com.ericsson.cepmediation.loading.service.LoadingServiceExecuter;
import com.ericsson.cepmediation.standalone.IMEIEnrichmentServiceExecuter;
import com.ericsson.cepmediation.correlation.service.UERTTCorrelationExecuter;

/**
 * This class responsible to locate and create instance of the requested service
 * class.This class is defined to create common structure for the service class
 * access and to avoid the direct access of service classes.
 * 
 * @author eachsaj
 * 
 */
public class ServiceExecuterFactory {

    /**
     * This method locates and instantiate the requested service type class
     * 
     * @param serviceType
     *            , an ENUM of type {@link SERVICES}
     * @return an instance of interface type {@link ServiceExecuter}
     * @throws ServiceException
     *             , if the system failed to located the specified service.
     */
    public static ServiceExecuter createService(final SERVICES serviceType)
            throws ServiceException {
        switch (serviceType) {

        case LOAD_BAL_SERVICE:
            return ParsingLoadBalanceExecuter.create();
        case LOADING_SERVICE:
            return LoadingServiceExecuter.create();
        case CORRELATION_SERVICE:
            return CorrelationExecuter.create();
        case DATA_FORWARDER_SERVICE:
            return ForwarderListenerExecuter.create();
        case IMEI_ENRICHMENT_SERVICE:
            return IMEIEnrichmentServiceExecuter.create();
        case UERTT_SERVICE:
            return UERTTCorrelationExecuter.create();
        case UERTT_DATA_FORWARDER_SERVICE:
            return UERTTForwarderListenerExecuter.create();

        default:
            throw new ServiceException("Unkown Service requested",
                    ErrorCode.UNKNOWN_SERVICE);

        }
    }

}
