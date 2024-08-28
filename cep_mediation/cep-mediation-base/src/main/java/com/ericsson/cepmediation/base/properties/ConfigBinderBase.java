package com.ericsson.cepmediation.base.properties;

import java.io.InputStream;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.cepmediation.base.proc.config.Correlation;
import com.ericsson.cepmediation.base.proc.config.EventListening;
import com.ericsson.cepmediation.base.proc.config.ProcessConfigBean;
import com.ericsson.cepmediation.base.proc.config.ServiceConfigBean;
import com.ericsson.cepmediation.base.resourceloading.ResourceFileFinder;
import com.ericsson.cepmediation.base.resourceloading.ResourceLoadingFailedException;
import com.ericsson.cepmediation.base.util.DataConverters;
import com.ericsson.cepmediation.base.util.ErrorCode;
import com.ericsson.cepmediation.base.util.constants.ApplicationConstants;
import com.ericsson.cepmediation.config.bean.AppConfigType;
import com.ericsson.cepmediation.config.bean.CorrelationSpec;
import com.ericsson.cepmediation.config.bean.EventListeningType;
import com.ericsson.cepmediation.config.bean.FeatureType;
import com.ericsson.cepmediation.config.bean.FeaturesEnum;
import com.ericsson.cepmediation.config.bean.FeaturesType;
import com.ericsson.cepmediation.config.bean.HostType;
import com.ericsson.cepmediation.config.bean.ServiceType;

/**
 * Base class for mapping config file contents to java pojos.
 * 
 * @author emicned
 *
 */
public abstract class ConfigBinderBase {
    private static final Logger logger = LoggerFactory.getLogger(ConfigBinderBase.class);

    private static final String SERVICE_ID_SEPARATOR = ",";

    protected List<AppConfigType> appConfigs;

    protected HostType localhost;

    protected String hostName;

    protected ConfigBinderBase() {
        initAppConfig();
        initHost();
    }

    protected abstract List<StreamSource> getConfigFiles();

    private void initAppConfig() throws ConfigurationException {
        final List<StreamSource> sources = getConfigFiles();

        final List<AppConfigType> configTypes = new ArrayList<AppConfigType>();
        for (final StreamSource source : sources) {
            configTypes.add(readAppConfig(source));
        }
        if (configTypes.size() == 0) {
            throw new ConfigurationException("No config file found.", ErrorCode.PROBLEM_READING_SERVICE_CONFIG);
        }
        appConfigs = configTypes;
    }

    public List<FeaturesEnum> getEnabledFeatures() {
        List<FeaturesEnum> res = new ArrayList<FeaturesEnum>();
        for (AppConfigType appConfigType : appConfigs) {
            FeaturesType features = appConfigType.getFeatures();
            if (features != null && !features.getFeature().isEmpty()) {
                for (FeatureType feature : features.getFeature()) {
                    if (Boolean.TRUE.equals(feature.getEnabled())) {
                        res.add(feature.getValue());
                    }
                }
            }
        }

        return res;
    }

    protected AppConfigType readAppConfig(StreamSource source) throws ConfigurationException {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(AppConfigType.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            JAXBElement<AppConfigType> rootElement = unmarshaller.unmarshal(source, AppConfigType.class);
            return rootElement.getValue();
        } catch (JAXBException e) {
            throw new ConfigurationException("Could not marshall xml to pojo", ErrorCode.PROBLEM_READING_SERVICE_CONFIG);
        }
    }

    private void initHost() throws ConfigurationException {
        List<InetAddress> inetAdressList = findNetworkInterfaces();
        logger.info("Found inet addresses: " + inetAdressList);
        for (InetAddress inetAddress : inetAdressList) {
            HostType definedHost = getDefinedHost(inetAddress);
            if (definedHost != null) {
                localhost = definedHost;
                // read the host name from the InetAddress and not from the HostType
                hostName = inetAddress.getHostName();
                logger.info("Found local inet address: " + inetAddress);
                return;
            }
        }
    }

    private HostType getDefinedHost(final InetAddress inetAddress) throws ConfigurationException {
        for (final HostType hostType : getAllHostsFromAppConfigs(appConfigs)) {
            String definedHost = getTrimmed(hostType.getName());
            String definedAddress = getTrimmed(hostType.getIp());
            String actualHost = getTrimmed(inetAddress.getHostName());
            String actualAddress = getTrimmed(inetAddress.getHostAddress());

            if (definedHost == null && definedAddress == null) {
                // This is a configuration error, throw an exception
                throw new ConfigurationException("Host detected with neither IP address or host name specified. This is configuration error.",
                        ErrorCode.FAILED_LOAD_PROPS_DEF);
            }

            // Check the host name
            if (definedHost != null && definedHost.equalsIgnoreCase(actualHost)) {
                // Check the IP address, if it is set in configuration, it must match what's on the interface
                if (definedAddress == null || definedAddress.equalsIgnoreCase(actualAddress)) {
                    return hostType;
                }
                String errorMsg = String.format("Host name specified matches but ip does not! Actual host/ip: %s/%s, defined: %s/%s  ", actualHost,
                        actualAddress, definedHost, definedAddress);
                throw new ConfigurationException(errorMsg, ErrorCode.FAILED_LOAD_PROPS_DEF);
            }

            // Check the host address
            if (definedAddress != null && definedAddress.equalsIgnoreCase(actualAddress)) {
                if (definedHost == null || definedHost.equalsIgnoreCase(actualHost)) {
                    return hostType;
                }
                String errorMsg = String.format("Host ip specified matches but host name does not! Actual host/ip: %s/%s, defined: %s/%s  ", actualHost,
                        actualAddress, definedHost, definedAddress);
                throw new ConfigurationException(errorMsg, ErrorCode.FAILED_LOAD_PROPS_DEF);
            }
        }
        return null;
    }

    protected List<HostType> getAllHostsFromAppConfigs(List<AppConfigType> config) {
        final List<HostType> hosts = new ArrayList<HostType>();
        for (final AppConfigType appConfigType : config) {
            if ((null != appConfigType.getHosts()) && (null != appConfigType.getHosts().getHost()))
                hosts.addAll(appConfigType.getHosts().getHost());
        }
        return hosts;
    }

    protected StreamSource findConfigFile(String fileName) {
        if (!fileName.contains(ApplicationConstants.getInstance().getConfigDir())) {
            fileName = ApplicationConstants.getInstance().getConfigDir() + fileName;
        }
        try {
            final InputStream s = new ResourceFileFinder().findResourceFile(fileName);
            return new StreamSource(s);
        } catch (final ResourceLoadingFailedException ex) {
            logger.warn("Config file not found: " + fileName);
        }
        return null;
    }

    protected Map<Integer, ServiceType> getServiceDefinitions(String serviceTypes, List<ServiceType> services) throws ConfigurationException {
        if (!serviceTypes.contains(SERVICE_ID_SEPARATOR)) {
            throw new ConfigurationException("Invalid <service-types> content: " + serviceTypes + ". Value should be more than one service ids separated by "
                    + SERVICE_ID_SEPARATOR, ErrorCode.PROBLEM_READING_SERVICE_CONFIG);
        }
        Map<Integer, ServiceType> id2serviceType = new HashMap<Integer, ServiceType>();
        String[] serviceIds = serviceTypes.split(SERVICE_ID_SEPARATOR);
        for (int i = 0; i < serviceIds.length; i++) {
            try {
                Integer serviceId = Integer.parseInt(serviceIds[i].trim());
                ServiceType service = findService(serviceId, services);
                id2serviceType.put(serviceId, service);
            } catch (Exception e) {
                throw new ConfigurationException("Incorrect ServiceId: " + serviceIds[i], ErrorCode.PROBLEM_READING_SERVICE_CONFIG);
            }
        }

        return id2serviceType;
    }

    private ServiceConfigBean buildServiceBean(final ServiceType service) {
        final ServiceConfigBean bean = new ServiceConfigBean();
        bean.setClassDefinition(service.getClazz());
        bean.setArguments(service.getArgs());
        bean.setServiceName(service.getName());
        bean.setForwarderType(service.getForwarderType());
        bean.setInitMethod(service.getInitMethod());
        bean.setEnabled(service.isProcEnabled());
        final int serviceId = service.getServiceId();
        bean.setServiceId(serviceId);

        //correlation rules/statements/name/events
        final CorrelationSpec corrSpec = service.getCorrelationspec();
        if (corrSpec != null) {
            final Correlation correlation = new Correlation();
            correlation.setListener(corrSpec.getListener());
            correlation.setName(corrSpec.getName());
            correlation.setRule(corrSpec.getEpl().getName());
            correlation.setUses(parseCommaSeparatedList(corrSpec.getEpl().getUses()));
            correlation.setStatements(corrSpec.getStatements().getName());
            correlation.setSessionDuration(corrSpec.getSessionDuration());
            bean.setCorrelationData(correlation);
        }

        final EventListeningType eventListening = service.getEventListening();
        if (eventListening != null) {
            bean.setEventListening(new EventListening(eventListening));
        }

        if (service.getHazelcastTopic() != null) {
            bean.setHazelcastTopic(service.getHazelcastTopic().getTopicName());
        }

        return bean;
    }

    private List<String> parseCommaSeparatedList(String uses) {
        List<String> res = new ArrayList<String>();
        if (uses == null || uses.trim().isEmpty()) {
            return res;
        }
        String[] tokens = uses.split(",");
        for (String token : tokens) {
            token = token.trim();
            if (!token.isEmpty() && !res.contains(token) ) {
                res.add(token);
            }
        }
        return res;
    }

    protected void buildServiceConfigBean(ServiceType service, HostType hostType, ProcessConfigBean processConfigBean,
            Map<Integer, ServiceConfigBean> serviceConfigBeans) throws ConfigurationException {
        // Build the service bean
        final ServiceConfigBean serviceConfigBean = buildServiceBean(service);

        // Check if the service ID has already been used on this process
        if (serviceConfigBeans.containsKey(serviceConfigBean.getServiceId())) {
            throw new ConfigurationException("Duplicate service Id " + serviceConfigBean.getServiceId() + " on process " + processConfigBean.getProcessId()
                    + " in configuration file for host " + hostType.getName() + ":" + hostType.getIp(), ErrorCode.DUPLICATE_ENTRY);
        }

        // Set the service process ID
        serviceConfigBean.setProcessId(processConfigBean.getProcessId());
        serviceConfigBean.setHostName(processConfigBean.getHostName());
        serviceConfigBean.setHostIp(processConfigBean.getIp());
        serviceConfigBean.setSerialProcessing(processConfigBean.isSerialProcessing());
        // Add the service to the list of services for this process
        serviceConfigBeans.put(serviceConfigBean.getServiceId(), serviceConfigBean);

    }

    private ServiceType findService(int serviceId, List<ServiceType> services) throws ConfigurationException {
        for (ServiceType service : services) {
            if (service.getServiceId() == serviceId) {
                return service;
            }
        }

        throw new ConfigurationException("Incorrect ServiceId: " + serviceId + " cannot be found in the defined services list",
                ErrorCode.PROBLEM_READING_SERVICE_CONFIG);
    }

    public List<InetAddress> findNetworkInterfaces() throws ConfigurationException {
        List<InetAddress> res = new ArrayList<InetAddress>();

        try {
            // Get all the network interfaces on this machine
            Enumeration<NetworkInterface> networkInterfaceEnum = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaceEnum.hasMoreElements()) {
                final NetworkInterface networkInterface = networkInterfaceEnum.nextElement();
                logger.info("found local interface:" + networkInterface.getDisplayName());

                final boolean hardwareAddressesOK = checkHardwareAddress(networkInterface);
                if (hardwareAddressesOK) {
                    Enumeration<InetAddress> inetAddressEnum = networkInterface.getInetAddresses();
                    while (inetAddressEnum.hasMoreElements()) {
                        res.add(inetAddressEnum.nextElement());
                    }
                }
            }
        } catch (final SocketException e) {
            // just log the exception
            logger.error("Error geting network interfaces", e);
        }

        return res;
    }

    private boolean checkHardwareAddress(final NetworkInterface networkInterface) {
        try {
            if (networkInterface.getHardwareAddress() != null) {
                logger.debug("setLocalNetworkInterface:MACAddress:" + DataConverters.byteArray2String(networkInterface.getHardwareAddress()));
                return true;
            }
        } catch (final SocketException e) {
            logger.warn("Exception getting hardward addresses of interface " + networkInterface, e);
        }
        return false;
    }

    public String getTrimmed(String s) {
        if (s == null || s.trim().length() == 0) {
            return null;
        }

        return s.trim();
    }

    public String getLocalHostName() {
        return hostName;
    }
}
