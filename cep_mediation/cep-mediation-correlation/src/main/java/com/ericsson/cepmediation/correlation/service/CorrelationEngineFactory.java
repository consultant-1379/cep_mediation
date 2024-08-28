package com.ericsson.cepmediation.correlation.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.ericsson.cepmediation.base.proc.config.NE_TYPE;
import com.ericsson.cepmediation.base.proc.config.Ne;
import com.ericsson.cepmediation.base.proc.config.ServiceConfigBean;
import com.ericsson.cepmediation.base.service.ServiceException;
import com.ericsson.cepmediation.base.util.ErrorCode;

public class CorrelationEngineFactory {
    
    public static Map<String, CorrelationEngine> createCorrelationEngineMap(ServiceConfigBean serviceData) throws ServiceException {
        if (serviceData.getNetworkElements() == null || serviceData.getNetworkElements().size() == 0) {
            throw new ServiceException("Network Element Definition missing for "
                    + serviceData.getCorrelationData().getName(), ErrorCode.CORRELATION_NAME_UNDEFINED);
        } 

        Map<String, CorrelationEngine> correlationEngineMap = new HashMap<String, CorrelationEngine>();
        List<Ne> networkElements = serviceData.getNetworkElementsOfType(NE_TYPE.resolveNetworkType(serviceData.getCorrelationData().getName()));
        for (Ne ne : networkElements)
            correlationEngineMap.put(ne.getLabel(), EsperCorrelationEngine.instance(serviceData, ne.getLabel()));
        return correlationEngineMap;
    }
}
