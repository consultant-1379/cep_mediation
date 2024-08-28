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
package com.ericsson.cepmediation.correlation.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.cepmediation.base.proc.config.NE_TYPE;
import com.ericsson.cepmediation.base.proc.config.Ne;
import com.ericsson.cepmediation.base.proc.config.ServiceConfigBean;
import com.ericsson.cepmediation.base.service.ServiceException;
import com.ericsson.cepmediation.base.util.ErrorCode;

/**
 * @author xalomis
 * 
 */
public class UERTTCorrelationEngines {

    private static final Logger logger = LoggerFactory
            .getLogger(UERTTCorrelationEngines.class);

    public static Map<String, CorrelationEngine> createCorrelationEngineMap(
            ServiceConfigBean serviceData) throws ServiceException {
        logger.info("Start UERTTCorrelationEngines :createCorrelationEngineMap()");
        if (serviceData.getNetworkElements() == null
                || serviceData.getNetworkElements().size() == 0) {
            throw new ServiceException(
                    "Network Element Definition missing for "
                            + serviceData.getCorrelationData().getName(),
                    ErrorCode.CORRELATION_NAME_UNDEFINED);
        }
        Map<String, CorrelationEngine> correlationEngineMap = new HashMap<String, CorrelationEngine>();
        List<Ne> networkElements = serviceData
                .getNetworkElementsOfType(NE_TYPE
                        .resolveNetworkType(serviceData.getCorrelationData()
                                .getName()));
        for (Ne ne : networkElements) {
            correlationEngineMap.put(
                    ne.getLabel(),
                    UERTTEsperCorrelationEngine.instance(serviceData,
                            ne.getLabel()));
        }
        logger.info("End UERTTCorrelationEngines :createCorrelationEngineMap()");
        return correlationEngineMap;
    }
}
