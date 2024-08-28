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
package com.ericsson.cepmediation.base.properties;

import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.TreeMap;

import javax.xml.transform.stream.StreamSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.cepmediation.base.proc.config.EventListening;
import com.ericsson.cepmediation.base.proc.config.HostConfigBean;
import com.ericsson.cepmediation.base.proc.config.PROC_TYPE;
import com.ericsson.cepmediation.base.proc.config.ProcessConfigBean;
import com.ericsson.cepmediation.base.proc.config.ServiceConfigBean;
import com.ericsson.cepmediation.base.resourceloading.ResourceFileFinder;
import com.ericsson.cepmediation.base.util.ErrorCode;
import com.ericsson.cepmediation.base.util.constants.ApplicationConstants;
import com.ericsson.cepmediation.config.bean.AppConfigType;
import com.ericsson.cepmediation.config.bean.AppStartTypeEnum;
import com.ericsson.cepmediation.config.bean.HostType;
import com.ericsson.cepmediation.config.bean.NetworkElement;
import com.ericsson.cepmediation.config.bean.NetworkElementConfigurationType;
import com.ericsson.cepmediation.config.bean.NetworkElementsType;
import com.ericsson.cepmediation.config.bean.ProcessType;
import com.ericsson.cepmediation.config.bean.PropertiesType;
import com.ericsson.cepmediation.config.bean.PropertyType;
import com.ericsson.cepmediation.config.bean.RecommendationType;
import com.ericsson.cepmediation.config.bean.ServiceType;

/**
 * This class maps the contents of config files specified in config_file_selector.xml to java pojos.
 * 
 * @author emicned
 * 
 */
public class ConfigBinder extends ConfigBinderBase {
    private static final Logger logger = LoggerFactory.getLogger(ConfigBinder.class);

    // The processes defined in network elements
    private List<ProcessType> processes = null;

    private NetworkElementConfigurationType networkElementConfigurations;

    private List<ServiceType> definedServiceList;

    // config.xml property holder
    private final Map<String, String> properties = new HashMap<String, String>();

    // singleton instance field
    private static ConfigBinder instance = new ConfigBinder();

    // Store configuration for all process for all host
    private final Map<HostConfigBean, Map<Integer, ProcessConfigBean>> allHostList = new HashMap<HostConfigBean, Map<Integer, ProcessConfigBean>>();

    // Store all the duplicate process Ids for each host
    private final Map<HostConfigBean, Set<Integer>> duplicateProcessIds = new HashMap<HostConfigBean, Set<Integer>>();

    public static ConfigBinder getInstance() {
        return instance;
    }

    protected ConfigBinder() {
        super();
        setRootTypes();
        readProperties();
        loadServices();
    }

    /**
     * This method returns all properties defined in the properties section of the config.xml
     * 
     * @return Map<Key, Value>
     */
    public Map<String, String> getProperties() {
        return properties;
    }

    /**
     * this method returns the Application Start Type
     * 
     * @throws ConfigurationException
     */

    public List<AppStartTypeEnum> getAppStartTypes() {
        final List<AppStartTypeEnum> appStartTypeEnumList = new ArrayList<AppStartTypeEnum>();

        for (final AppConfigType appconfig : appConfigs) {

            if (appconfig.getAppStartTypeList() != null) {
                appStartTypeEnumList.addAll(appconfig.getAppStartTypeList().getAppStartType());
            }
        }
        return appStartTypeEnumList;
    }

    public void validateConfiguration() throws ConfigurationException {
        validateProcessIds();
        validateNetworkElements();
    }

    private void validateProcessIds() throws ConfigurationException {
        // Check if the same process ID is re-used for the same host
        if (localhost == null) {
            // should not get here
            throw new ConfigurationException("Trying to validate process Ids in configuration data but can't continue as localhost is null",
                    ErrorCode.FAILED_READ_SYSTEM_IP);
        }

        for (final HostConfigBean hostConfigBean : duplicateProcessIds.keySet()) {
            if (hostConfigBean.getIp().equals(localhost.getIp()) || hostConfigBean.getHost().equals(localhost.getName())) {
                String ipAddress = hostConfigBean.getIp();
                String hostName = hostConfigBean.getHost();
                String procIds = duplicateProcessIds.get(hostConfigBean).toString();

                throw new ConfigurationException("The process Id(s) " + procIds + " are duplicated in the configuration file for host " + hostName
                        + ":" + ipAddress, ErrorCode.DUPLICATE_ENTRY);
            }
        }

    }

    private void validateNetworkElements() throws ConfigurationException {
        if (isNetworkElementDrivenConfigurationUsed()) {
            ProcessValidator.validate(processes);
        }
    }

    public void printNetworkElements() {
        if (isNetworkElementDrivenConfigurationUsed()) {
            ProcessPrinter.printProcesses(processes, properties);
        }
    }

    private void setRootTypes() {
        logger.trace("setRootTypes()-->");
        for (final AppConfigType appConfig : appConfigs) {
            if (appConfig.getNetworkElementConfigurations() != null) {
                networkElementConfigurations = appConfig.getNetworkElementConfigurations();
            }

            if (appConfig.getServiceList() != null) {
                definedServiceList = appConfig.getServiceList().getService();
            }
        }
        logger.trace("setRootTypes()<--");

    }

    @Override
    protected List<StreamSource> getConfigFiles() {
        final List<StreamSource> streamsources = new ArrayList<StreamSource>();
        InputStream selector;
        try {
            selector = new ResourceFileFinder().findResourceFile(ApplicationConstants.getInstance().getConfigFileSelector());
            final Properties properties = new Properties();
            properties.load(selector);
            final String[] fileNames = properties.getProperty("config_files").split(",");
            for (String fileName : fileNames) {
                StreamSource source = findConfigFile(fileName);
                if (source != null) {
                    streamsources.add(source);
                }
            }
        } catch (Exception e) {
            logger.error("Error locating config files!", e);
        }
        return streamsources;
    }

    public HostConfigBean getLocalHostConfig() {
        if (localhost == null) {
            return null;
        }

        // Find the host entry for the local machine
        for (final HostConfigBean hostConfigBean : allHostList.keySet()) {
            if (hostConfigBean.getIp().equals(localhost.getIp()) || hostConfigBean.getHost().equals(localhost.getName())) {
                return hostConfigBean;
            }
        }

        return null;
    }

    /**
     * This method returns the host information for the master server
     */
    public HostConfigBean getMasterHostConfig() {
        logger.trace("-->getMasterHostConfig()");

        // Find the host entry for the master machine
        for (final HostConfigBean hostConfigBean : allHostList.keySet()) {
            if (hostConfigBean.isMaster()) {
                // Found the local host
                logger.trace("<--: Found master:" + hostConfigBean.getHost() + "," + hostConfigBean.getIp());
                return hostConfigBean;
            }
        }

        logger.trace("<-- Master host not found");

        return null;
    }

    public List<ProcessConfigBean> getAllLocalProcesses() {
        List<ProcessConfigBean> processList = new ArrayList<ProcessConfigBean>();

        if (localhost == null) {
            return processList;
        }

        for (final HostConfigBean hostConfigBean : allHostList.keySet()) {
            if (hostConfigBean.getIp().equals(localhost.getIp()) || hostConfigBean.getHost().equals(localhost.getName())) {
                processList = getProcessList(hostConfigBean);
                return processList;
            }
        }

        return processList;
    }

    /**
     * Change to public for testing purpose
     * 
     * @param hostConfigBean
     * @return
     */
    public List<ProcessConfigBean> getProcessList(final HostConfigBean hostConfigBean) {
        return new ArrayList<ProcessConfigBean>(allHostList.get(hostConfigBean).values());
    }

    /**
     * This method resets the process definitions on the local machine
     */
    public List<ProcessConfigBean> resetProcessInfo(final List<ProcessConfigBean> incoming) {
        logger.trace("-->resetProcessIfo()");

        // Check if there are any incoming processes
        if (incoming == null) {
            logger.trace("resetProcessIfo(): no incoming processes");
            logger.trace("<--");
            return null;
        }

        // local host data for identify the local process.
        logger.debug("Reconfiguring the process definitions");
        final List<ProcessConfigBean> processList = new ArrayList<ProcessConfigBean>();

        // Find the host entry for the local machine
        findHostEntryForLocalMachine(incoming, processList);

        // Trace the found processes
        traceFoundProcesses(processList);

        logger.trace("<--");

        return processList;
    }

    private void traceFoundProcesses(final List<ProcessConfigBean> processList) {
        if (logger.isTraceEnabled()) {
            for (final ProcessConfigBean procBean : processList) {
                logger.trace("resetProcessIfo(), reset process:" + procBean);
            }
        }
    }

    private void findHostEntryForLocalMachine(final List<ProcessConfigBean> incoming, final List<ProcessConfigBean> processList) {
        if (localhost == null) {
            return;
        }
        for (final HostConfigBean hostConfigBean : allHostList.keySet()) {
            if (hostConfigBean.getIp().equals(localhost.getIp()) || hostConfigBean.getHost().equals(localhost.getName())) {
                // Iterate over this hosts processes
                for (final ProcessConfigBean procBean : allHostList.get(hostConfigBean).values()) {
                    for (final ProcessConfigBean inProcessDef : incoming) {
                        if (inProcessDef.getProcessId() == procBean.getProcessId()) {
                            procBean.setServices(inProcessDef.getServices());
                            logger.trace("resetProcessIfo(), process:" + procBean);
                            processList.add(procBean);
                        }
                    }
                }

                // We found the local host so its finished
                break;
            }
        }
    }

    private void readProperties() {
        logger.trace("readProperties()-->");
        for (final AppConfigType appConfig : appConfigs) {
            final PropertiesType properties2 = appConfig.getProperties();
            if (properties2 != null) {
                for (final PropertyType property : properties2.getProperty()) {
                    properties.put(property.getKey(), property.getValue());
                }
            }
        }
        logger.trace("readProperties()<--");
    }

    /**
     * This method returns all the loading services and its process for all machines.
     */
    public List<ServiceConfigBean> getAllLoadingServices() {
        logger.trace("getAllLoadingServices()-->");
        logger.debug("Discovering all loading Service defined for all servers/slaves");
        final List<ServiceConfigBean> serviceList = new ArrayList<ServiceConfigBean>();

        // Iterate over host entries for all machines
        for (final HostConfigBean hostConfigBean : allHostList.keySet()) {
            // Iterate over this hosts processes
            for (final ProcessConfigBean procBean : allHostList.get(hostConfigBean).values()) {
                // Iterate over the services of this process
                for (final ServiceConfigBean loadingServicebean : procBean.getServices().values()) {
                    if (loadingServicebean.getClassDefinition().equals("com.ericsson.cepmediation.server.service.LoadingServiceProvider")) {
                        logger.trace("getAllLoadingServices(), discovered process:" + loadingServicebean);
                        serviceList.add(loadingServicebean);
                    }
                }
            }
        }

        logger.trace("getAllLoadingServices()<--");
        return serviceList;
    }

    public List<EventListening> getAllEventListeners() {
        final List<EventListening> eventListeners = new ArrayList<EventListening>();
        logger.debug("Discovering all listeners defined for all servers/slaves");

        // Iterate over host entries for all machines
        for (final HostConfigBean hostConfigBean : allHostList.keySet()) {
            // Iterate over this hosts processes
            for (final ProcessConfigBean procBean : allHostList.get(hostConfigBean).values()) {
                // Iterate over the services of this process
                for (final ServiceConfigBean servicebean : procBean.getServices().values()) {
                    if (servicebean.getEventListening() != null && removeUeTraceEventListening(servicebean)) {
                        eventListeners.add(servicebean.getEventListening());
                    }
                }
            }
        }
        return eventListeners;
    }

    private boolean removeUeTraceEventListening(final ServiceConfigBean servicebean) {
        return !(servicebean.getEventListening().getTopicName().equals(FeatureConstants.UERTT_CORRELATION_TOPIC) || servicebean.getEventListening()
                .getTopicName().equals(FeatureConstants.UERTT_FORWARDER_TOPIC));
    }

    /**
     * This method returns all the loading services and its process for a given machine.
     */
    public List<ProcessConfigBean> findLoadingServicesByIP(final String ip) {
        logger.trace("-->findLoadingServicesByIP()");
        //local host data for identify the local process.
        logger.debug("Identity of the requested machine " + ip);
        logger.debug("Discovering all process defined for this machine");
        List<ProcessConfigBean> processList = new ArrayList<ProcessConfigBean>();

        // Find the host entry for the specified IP address
        for (final HostConfigBean hostConfigBean : allHostList.keySet()) {
            if (hostConfigBean.getIp().equals(ip)) {
                processList = getProcessList(hostConfigBean);
                break;
            }
        }

        // Trace the found processes
        if (logger.isTraceEnabled()) {
            for (final ProcessConfigBean procBean : processList) {
                logger.trace("findLoadingServicesByIP(), found process:" + procBean);
            }
        }

        logger.debug("Discovered all process defined for this machine");
        logger.trace("<--");

        return processList;
    }

    private void loadServices() throws ConfigurationException {
        logger.trace("loadServices()-->");
        logger.debug("Discovering all loading Service defined for all servers/slaves");

        for (final HostType host : getAllHostsFromAppConfigs(appConfigs)) {
            // Declare a new host bean and new process list
            final HostConfigBean hostConfigBean = new HostConfigBean(); //NOPMD eemecoy 18/5/2012 necessary evil
            final Map<Integer, ProcessConfigBean> processConfigBeans = new HashMap<Integer, ProcessConfigBean>();//NOPMD eemecoy 18/5/2012 necessary evil
            final Set<Integer> duplicateProcIds = new HashSet<Integer>();

            // Set the host config bean data
            hostConfigBean.setHost((host.getName() == null ? "" : host.getName()));
            hostConfigBean.setIp((host.getIp() == null ? "" : host.getIp()));
            hostConfigBean.setMaster((host.getMaster() == null ? false : host.getMaster()));

            for (ProcessType procType : host.getProcess()) {

                // Declare a new process configuration bean
                final ProcessConfigBean processConfigBean = new ProcessConfigBean(hostConfigBean.getHost(), hostConfigBean.getIp(), procType); //NOPMD eemecoy 18/5/2012 necessary evil

                // The first process on each host is set as the server process, all others are slave processes
                /*
                 * if (processConfigBeans.size() == 0) { processConfigBean.setProcessType(PROC_TYPE.SERVER); } else {
                 * processConfigBean.setProcessType(PROC_TYPE.SLAVE); }
                 */

                //all the processes are regarded as slave processes
                processConfigBean.setProcessType(PROC_TYPE.SLAVE);

                // Check if the process ID has already been used on this host
                if (processConfigBeans.containsKey(procType.getProcid())) {
                    duplicateProcIds.add(procType.getProcid());
                }

                final TreeMap<Integer, ServiceConfigBean> serviceConfigBeans = new TreeMap<Integer, ServiceConfigBean>(); //NOPMD eemecoy 18/5/2012 necessary evil

                // loop through services
                if (isNetworkElementDrivenConfigurationUsed()) {
                    inheritAttributesFromNetworkElementConfigurationsToNetworkElements(procType.getNetworkElements());
                    completeProcessType(procType);
                    processConfigBean.setSerialProcessing(procType.getSerialProcessing());
                    setServicesUsingNetworkElements(host, procType, processConfigBean, serviceConfigBeans);
                    addNetworkElementsToServiceConfigBean(procType.getNetworkElements(), serviceConfigBeans);
                    addToProcessList(procType);
                }

                if (serviceConfigBeans.size() >= 0) {
                    processConfigBean.setServices(serviceConfigBeans);
                    setMemoryArguments(procType, processConfigBean);
                    logger.trace("loadServices(), adding process:" + processConfigBean);
                    processConfigBeans.put(processConfigBean.getProcessId(), processConfigBean);
                } else {
                    logger.debug("no services found for process " + processConfigBean.getProcessId() + ", process not added");
                }
            }
            // Add the host configuration bean and its processes to the list of hosts and processes
            allHostList.put(hostConfigBean, processConfigBeans);
            // Add the list of duplicate process Ids
            if (duplicateProcIds.size() > 0) {
                duplicateProcessIds.put(hostConfigBean, duplicateProcIds);
            }
        }

        logger.trace("loadServices()<--");
    }

    private void completeProcessType(ProcessType procType) {

        boolean isSerial = false;
        int maxMemorySize = 0;
        int sumMemorySize = 0;
        String memoryHint = null;

        for (NetworkElement networkElement : procType.getNetworkElements().getNetworkElement()) {

            //if serial processing ne is detected, the whole process should use serialization
            if (Boolean.valueOf(networkElement.getSerialProcessing())) {

                isSerial = true;
            }

            int memorySize = Integer.valueOf(networkElement.getMemorySize());
            if (memorySize > maxMemorySize) {
                maxMemorySize = memorySize;
            }
            sumMemorySize += memorySize;

            memoryHint = networkElement.getMemoryHint();

        }

        if (procType.getMemoryHint() == null || procType.getMemoryHint().equals("")) {

            logger.debug("No memory hint found. Assign the value of network element");

            procType.setMemoryHint(memoryHint);
        }

        if (procType.getSerialProcessing() == null) {

            logger.debug("No serial processsing flag found. Calculate that from the network elements");

            procType.setSerialProcessing(isSerial);
        }

        if (procType.getMemorySize() == null || procType.getMemorySize().equals("")) {

            logger.debug("No process memory information found. Calculate that from contained network elements");

            if (isSerial) {

                procType.setMemorySize(String.valueOf(maxMemorySize));
            } else {
                procType.setMemorySize(String.valueOf(sumMemorySize));
            }
        }

    }

    private void addToProcessList(ProcessType procType) {
        if (processes == null) {
            processes = new ArrayList<ProcessType>();
        }
        processes.add(procType);
    }

    private boolean isNetworkElementDrivenConfigurationUsed() {
        return definedServiceList != null && networkElementConfigurations != null;
    }

    private void inheritAttributesFromNetworkElementConfigurationsToNetworkElements(NetworkElementsType networkElements) {
        NetworkElement networkElementConfiguration = null;
        for (NetworkElement networkElement : networkElements.getNetworkElement()) {
            networkElementConfiguration = getNetworkElementConfiguration(networkElement.getNeType());
            inheritAttributesFromTheNetworkElementConfigurationToNetworkElement(networkElement, networkElementConfiguration);
        }
    }

    private void inheritAttributesFromTheNetworkElementConfigurationToNetworkElement(NetworkElement networkElement,
                                                                                     NetworkElement networkElementConfiguration) {
        try {
            for (PropertyDescriptor propertyDescriptor : Introspector.getBeanInfo(NetworkElement.class).getPropertyDescriptors()) {
                if (propertyDescriptor.getReadMethod() != null && propertyDescriptor.getWriteMethod() != null
                        && propertyDescriptor.getReadMethod().invoke(networkElement) == null) {
                    propertyDescriptor.getWriteMethod()
                            .invoke(networkElement, propertyDescriptor.getReadMethod().invoke(networkElementConfiguration));
                }
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    private NetworkElement getNetworkElementConfiguration(int networkElementType) {
        for (NetworkElement networkElement : networkElementConfigurations.getNetworkElement()) {
            if (networkElementType == networkElement.getNeType()) {
                return networkElement;
            }
        }
        return null;//throw exception
    }

    private void addNetworkElementsToServiceConfigBean(NetworkElementsType networkElements, TreeMap<Integer, ServiceConfigBean> serviceConfigBeans) {
        for (NetworkElement networkElement : networkElements.getNetworkElement()) {
            addNetworkElementToServiceConfigBeans(networkElement, serviceConfigBeans);
        }
    }

    private void addNetworkElementToServiceConfigBeans(NetworkElement networkElement, TreeMap<Integer, ServiceConfigBean> serviceConfigBeans) {
        for (final Map.Entry<Integer, ServiceConfigBean> e : serviceConfigBeans.entrySet()) {
            e.getValue().addNetworkElement(networkElement);
        }
    }

    private void setServicesUsingNetworkElements(HostType host, ProcessType procType, ProcessConfigBean processConfigBean,
                                                 TreeMap<Integer, ServiceConfigBean> serviceConfigBeans) throws ConfigurationException {
        Map<Integer, ServiceType> serviceMap = getServiceMap(procType);
        ServiceType service = null;
        for (final Map.Entry<Integer, ServiceType> e : serviceMap.entrySet()) {
            service = e.getValue();
            if (!service.isProcEnabled()) {
                continue;
            }
            buildServiceConfigBean(service, host, processConfigBean, serviceConfigBeans);
        }
    }

    private Map<Integer, ServiceType> getServiceMap(ProcessType procType) throws ConfigurationException {
        Map<Integer, ServiceType> serviceMap = new HashMap<Integer, ServiceType>();
        for (NetworkElement networkElement : procType.getNetworkElements().getNetworkElement()) {
            serviceMap.putAll(getFullfillingServicesOfTheNetworkElement(networkElement.getNeType()));
        }
        return serviceMap;
    }

    private Map<Integer, ServiceType> getFullfillingServicesOfTheNetworkElement(int neType) throws ConfigurationException {
        Map<Integer, ServiceType> serviceMap = new HashMap<Integer, ServiceType>();
        for (NetworkElement networkElement : networkElementConfigurations.getNetworkElement()) {
            if (networkElement.getNeType() == neType) {
                Map<Integer, ServiceType> id2serviceType = getServiceDefinitions(networkElement.getServiceTypes(), definedServiceList);
                serviceMap.putAll(id2serviceType);
            }
        }
        return serviceMap;
    }

    private void setMemoryArguments(final ProcessType procType, final ProcessConfigBean procBean) {
        if (isNetworkElementDrivenConfigurationUsed()) {
            handleMemoryArguments(procBean, procType);
        }
    }

    private void handleMemoryArguments(ProcessConfigBean procBean, ProcessType procType) {

        final Map<String, String> processArguments = new HashMap<String, String>();

        int memorySize = 0;
        String memoryHint = null;

        if (procBean.isSerialProcessing()) {
            for (NetworkElement ne : procType.getNetworkElements().getNetworkElement()) {
                memoryHint = ne.getMemoryHint();

                if (Integer.valueOf(ne.getMemorySize()) > memorySize) {

                    memorySize = Integer.valueOf(ne.getMemorySize());
                }
            }
        } else {
            for (NetworkElement ne : procType.getNetworkElements().getNetworkElement()) {
                memoryHint = ne.getMemoryHint();
                memorySize += Integer.valueOf(ne.getMemorySize());

            }
        }

        processArguments.put("max.mem", String.valueOf(memorySize));
        processArguments.put("init.mem", String.valueOf(memorySize));
        processArguments.put("memoryHints", memoryHint);
        procBean.setArguments(processArguments);

    }

    public Set<String> getAllHostAddress() {
        final Set<String> hostData = new HashSet<String>();

        for (final HostConfigBean hostConfigBean : allHostList.keySet()) {
            hostData.add(hostConfigBean.getHost().equals("") ? hostConfigBean.getIp() : hostConfigBean.getHost());
        }
        return hostData;
    }

    public List<RecommendationType> getRecommendations(int networkElementType) {

        for (NetworkElement networkElement : networkElementConfigurations.getNetworkElement()) {
            if (networkElementType == networkElement.getNeType()) {

                return networkElement.getRecommendations().getRecommendation();

            }
        }

        return Collections.emptyList();
    }

    public List<ProcessType> getProcesses() {
        return Collections.unmodifiableList(processes);
    }

    public List<EventListening> getUerttForwarderListeners() {
        final List<EventListening> eventListeners = new ArrayList<EventListening>();
        logger.debug("Discovering Uertt Forwarder listeners.");
        for (final HostConfigBean hostConfigBean : allHostList.keySet()) {
            for (final ProcessConfigBean procBean : allHostList.get(hostConfigBean).values()) {
                for (final ServiceConfigBean servicebean : procBean.getServices().values()) {
                    if (servicebean.getEventListening() != null
                            && servicebean.getEventListening().getTopicName().equals(FeatureConstants.UERTT_FORWARDER_TOPIC)) {
                        eventListeners.add(servicebean.getEventListening());
                    }
                }
            }
        }
        return eventListeners;
    }

    public List<EventListening> getUerttCorrelationListeners() {
        final List<EventListening> eventListeners = new ArrayList<EventListening>();
        logger.debug("Discovering Uertt Correlation listeners.");
        for (final HostConfigBean hostConfigBean : allHostList.keySet()) {
            for (final ProcessConfigBean procBean : allHostList.get(hostConfigBean).values()) {
                for (final ServiceConfigBean servicebean : procBean.getServices().values()) {
                    if (servicebean.getEventListening() != null
                            && servicebean.getEventListening().getTopicName().equals(FeatureConstants.UERTT_CORRELATION_TOPIC)) {
                        eventListeners.add(servicebean.getEventListening());
                    }
                }
            }
        }
        return eventListeners;
    }
}