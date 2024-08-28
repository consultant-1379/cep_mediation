package com.ericsson.cepmediation.base.properties;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import javax.xml.bind.JAXBException;
import javax.xml.transform.stream.StreamSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.cepmediation.base.proc.config.EventListening;
import com.ericsson.cepmediation.base.proc.config.ProcessConfigBean;
import com.ericsson.cepmediation.base.proc.config.ServiceConfigBean;
import com.ericsson.cepmediation.base.util.ErrorCode;
import com.ericsson.cepmediation.config.bean.ProcessType;
import com.ericsson.cepmediation.config.bean.ServiceType;

/**
 * This class loads standalone.xml contents into java pojos(e.g. ProcessConfigBean).
 * 
 * @author emicned
 *
 */
public class StandaloneConfigBinder extends ConfigBinderBase {
    private static final Logger logger = LoggerFactory.getLogger(StandaloneConfigBinder.class);

    private static final String STANDALONE_XML = "standalone.xml";

    private static StandaloneConfigBinder instance = new StandaloneConfigBinder();

    private List<ServiceType> services;

    private ProcessConfigBean localStandaloneProcessConfig;

    public static StandaloneConfigBinder getInstance() {
        return instance;
    }

    protected StandaloneConfigBinder() {
        super();
        if (localhost != null) {
            services = appConfigs.get(0).getServiceList().getService();
            try {
                localStandaloneProcessConfig = readLocalStandaloneProcessConfig();
            } catch (JAXBException e) {
                logger.error("JaxbError", e);
                throw new RuntimeException(e);
            }
        }
    }
    
    public List<EventListening> getAllEventListeners() {
        List<EventListening> res = new ArrayList<EventListening>();
        if (localStandaloneProcessConfig != null && localStandaloneProcessConfig.getServices() != null) {
           for (ServiceConfigBean service : localStandaloneProcessConfig.getServices().values()) {
               if (service.getEventListening() != null) {
                   res.add(service.getEventListening());
               }
           }
        }
        return res;
    }

    public ProcessConfigBean getLocalStandaloneProcessConfig() {
        return localStandaloneProcessConfig;
    }

    @Override
    protected List<StreamSource> getConfigFiles() {
        return Arrays.asList(new StreamSource[] { findConfigFile(STANDALONE_XML) });
    }

    private ProcessConfigBean readLocalStandaloneProcessConfig() throws JAXBException {
        logger.info("Reading standalone application configuration...");

        if (services == null || services.isEmpty()) {
            logger.warn("No services were specified in standalone.xml! This is a configuration error!");
            return null;
        }

        // create a ProcessConfigBean with the data provided in standalone.xml
        if (!services.isEmpty()) {
            List<ProcessType> processTypes = localhost.getProcess();
            if (processTypes.size() != 1) {
                throw new ConfigurationException("Exactly one process should be specified in standalone.xml. Instead found " + processTypes.size()
                        + "! This is a configuration error!", ErrorCode.PROBLEM_READING_SERVICE_CONFIG);
            }
            ProcessType processType = processTypes.get(0);
            String serviceTypes = processType.getServiceTypes();
            Map<Integer, ServiceType> id2serviceType = getServiceDefinitions(serviceTypes, services);
            logger.info("Found standalone service definitions: " + id2serviceType);
            if (!id2serviceType.isEmpty()) {
                ProcessConfigBean res = new ProcessConfigBean(localhost.getName(), localhost.getIp(), processType);

                // create the service config beans
                TreeMap<Integer, ServiceConfigBean> serviceConfigBeans = new TreeMap<Integer, ServiceConfigBean>();
                for (ServiceType service : id2serviceType.values()) {
                    buildServiceConfigBean(service, localhost, res, serviceConfigBeans);
                }
                res.setServices(serviceConfigBeans);

                // set memory arguments
                final Map<String, String> processArguments = new HashMap<String, String>();
                processArguments.put("max.mem", processType.getMemorySize());
                processArguments.put("init.mem", processType.getMemorySize());
                processArguments.put("memoryHints", processType.getMemoryHint());
                res.setArguments(processArguments);

                logger.info("Standalone process configuration: " + res);
                return res;
            }
        }

        return null;
    }
}
