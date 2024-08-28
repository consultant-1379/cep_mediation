package com.ericsson.cepmediation.hyperic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hyperic.hq.product.AutoServerDetector;
import org.hyperic.hq.product.PluginException;
import org.hyperic.hq.product.ServerDetector;
import org.hyperic.hq.product.ServerResource;
import org.hyperic.hq.product.ServiceResource;
import org.hyperic.util.config.ConfigResponse;

import com.ericsson.cepmediation.base.proc.config.HostConfigBean;
import com.ericsson.cepmediation.base.proc.config.ProcessConfigBean;
import com.ericsson.cepmediation.base.proc.config.ServiceConfigBean;
import com.ericsson.cepmediation.base.properties.CepMediationProperties;
import com.ericsson.cepmediation.base.properties.CepMediationProperty;
import com.ericsson.cepmediation.base.properties.ConfigBinder;

/**
 * 
 * This class implements hyperic plugin functions that are 
 * used by hypric server detector class for automatic  detection of services
 * that are defined in hq-plugin.xml file and for cep mediation auto discovery    
 *  
 * @category Managment
 * @since 08/12/2011
 * 
 * 
 * @author eurorad
 *
 */
public class EAServerDetector extends ServerDetector implements AutoServerDetector {

    /* (non-Javadoc)
    * @see org.hyperic.hq.product.AutoServerDetector#getServerResources(org.hyperic.util.config.ConfigResponse)
    */
    @Override
    public List<ServerResource> getServerResources(final ConfigResponse config) throws PluginException {

        try {
            final HostConfigBean ea_server = ConfigBinder.getInstance().getLocalHostConfig();
            final List<ServerResource> servers = new ArrayList<ServerResource>();

            //using HostConfigBean function isMaster() to set the type string for presentation layer in hyperic
            //String type = (ea_server.isMaster()) ? "Master" : "Slave";

            //seting values for the configuration fields that are defined in hq-plugin.xml
            config.setValue("host.ip", ea_server.getIp());
            config.setValue("process.query", "State.Name.eq=java,Args.*.ct=ApplicationStartStop");

            final ServerResource server = createServerResource(CepMediationProperties.getProperty(
                    CepMediationProperty.INSTALL_DIR, ""));

            final String serverType = CepMediationProperties.getProperty(CepMediationProperty.SERVER_TYPE, "");

            server.setDescription(serverType);
            server.setIdentifier(serverType);
            server.setName(serverType + " "
                    + CepMediationProperties.getProperty(CepMediationProperty.SERVER_VERSION, "") + ":"
                    + config.getValue("host.ip"));

            server.setProductConfig(config);
            server.setControlConfig();
            server.setMeasurementConfig();
            servers.add(server);

            return servers;

        } catch (final Exception e) {
            getLog().error("-------------->ea_server_exception:" + e.getMessage());
            e.printStackTrace();
            return null;
        }

    }

    /* (non-Javadoc)
    * @see org.hyperic.hq.product.ServerDetector#discoverServices(org.hyperic.util.config.ConfigResponse)
    */
    @Override
    protected List<ServiceResource> discoverServices(final ConfigResponse serverConfig) {
        try {
            final List<ProcessConfigBean> processConfigBeanList = ConfigBinder.getInstance().getAllLocalProcesses();
            final Map<Integer, Map<Integer, ServiceConfigBean>> serviceMap = new HashMap<Integer, Map<Integer, ServiceConfigBean>>();

            //map contains all services per process where process id is the key
            for (final ProcessConfigBean processConfigBean : processConfigBeanList) {
                serviceMap.put(processConfigBean.getProcessId(), processConfigBean.getServices());
            }

            final List<ServiceResource> serviceTypeList = new ArrayList<ServiceResource>();
            getLog().debug("-------------> discoverServices:");

            boolean firstProcess = true;
            for (final ProcessConfigBean processConfigBean : processConfigBeanList) {

                final ServiceResource serviceResource = new ServiceResource(); //NOPMD eemecoy 18/5/2012 necessary evil

                serviceResource.setType(this, "Process");

                final Map<Integer, ServiceConfigBean> serviceConfigBeanMap = serviceMap.get(processConfigBean
                        .getProcessId());
                StringBuffer services = new StringBuffer(); //NOPMD eemecoy 18/5/2012 necessary evil

                //find all service for process type and create string , this is just for demo purposes 
                //we can do another things with these but for now they are put into string and presented on process level
                for (final Integer sBeanId : serviceConfigBeanMap.keySet()) {

                    final ServiceConfigBean serviceConfigBean = serviceConfigBeanMap.get(sBeanId);
                    services = services.append("Service Id:" + serviceConfigBean.getServiceId() + ":"
                            + serviceConfigBean.getServiceName() + " ");

                    createCorrectService(serverConfig, serviceTypeList, processConfigBean, serviceConfigBean);
                }

                serverConfig.setValue("services", services.toString());
                serverConfig.setValue("process.id", processConfigBean.getProcessId());
                serverConfig.setValue("process.query", "State.Name.eq=java,Args.*.ct=-DprocessId=%process.id%");

                serviceResource.setServiceName("Process Id:" + processConfigBean.getProcessId() + " " + "Services: "
                        + serverConfig.getValue("services"));

                //override process.id for local process (local process start with server it is not separate jvm )
                if (firstProcess) {
                    serverConfig.setValue("process.id", "local");
                }
                firstProcess = false;

                serviceResource.setProductConfig(serverConfig);
                serviceResource.setMeasurementConfig();

                serviceTypeList.add(serviceResource);
            }

            getLog().debug("<------------- discoverServiceType:");
            return serviceTypeList;

        } catch (final Exception e) {
            getLog().error("-------------->processConfigBeanList:", e);
            e.printStackTrace();
            return null;
        }
    }

    private void createCorrectService(final ConfigResponse serverConfig, final List<ServiceResource> serviceTypeList,
            final ProcessConfigBean processConfigBean, final ServiceConfigBean serviceConfigBean) {
        //If it is captool,staple or pcapDistribution service change process query
        final String serviceName = serviceConfigBean.getServiceName();

        if (serviceName.contains("CaptoolService")) {
            createCaptoolServices(serverConfig, serviceTypeList, processConfigBean, serviceConfigBean);

        }

        if (serviceName.contains("PcapDistributorService")) {
            createPcapDistributorService(serverConfig, serviceTypeList, processConfigBean, serviceConfigBean);

        }
        getLog().debug(
                "-------------> service name:" + serviceConfigBean.getServiceId() + ":"
                        + serviceConfigBean.getServiceName());

        if (serviceName.contains("GTPCMergerService")) {

            createGTPCMergerServices(serverConfig, serviceTypeList, serviceConfigBean);

        }
        getLog().debug(
                "-------------> service name:" + serviceConfigBean.getServiceId() + ":"
                        + serviceConfigBean.getServiceName());
        if (serviceName.contains("StapleService")) {

            createStapleService(serverConfig, serviceTypeList, processConfigBean, serviceConfigBean);

        }
        getLog().debug(
                "-------------> service name:" + serviceConfigBean.getServiceId() + ":"
                        + serviceConfigBean.getServiceName());
    }

    private void createStapleService(final ConfigResponse serverConfig, final List<ServiceResource> serviceTypeList,
            final ProcessConfigBean processConfigBean, final ServiceConfigBean serviceConfigBean) {
        final String serviceId = processConfigBean.getProcessId() + "-" + serviceConfigBean.getServiceId();

        final ServiceResource servResource = new ServiceResource();
        final ServiceResource mergerResource = new ServiceResource();

        servResource.setServiceName("Probe Service: staple_" + serviceId);
        servResource.setType(this, "Probe Service");

        serverConfig.setValue("service.id", serviceId);
        serverConfig.setValue("process.query", "State.Name.ct=staple,Args.*.ct=%service.id%");

        servResource.setProductConfig(serverConfig);
        servResource.setMeasurementConfig();

        serviceTypeList.add(servResource);

        serviceId.replaceAll("-", "_");

        mergerResource.setServiceName("Probe Service: pcapmerger_" + serviceId + ": staple");
        mergerResource.setType(this, "Probe Service");

        serverConfig.setValue("service.id", serviceId);
        serverConfig.setValue("process.query", "State.Name.ct=pcapmerger,Args.*.ct=%service.id%");

        mergerResource.setProductConfig(serverConfig);
        mergerResource.setMeasurementConfig();

        serviceTypeList.add(mergerResource);

        getLog().debug("------------->pcap merger parser:" + servResource.getName());
    }

    private void createGTPCMergerServices(final ConfigResponse serverConfig,
            final List<ServiceResource> serviceTypeList, final ServiceConfigBean serviceConfigBean) {
        final String gtpcPath = readCaptoolParserId(serviceConfigBean, "from_path");
        final String[] nameValue = gtpcPath.split("/");

        final String gtpcId = nameValue[5];

        final ServiceResource servResource = new ServiceResource();
        servResource.setServiceName("Probe Service: gtpc_" + gtpcId);
        servResource.setType(this, "Probe Service");

        serverConfig.setValue("service.id", gtpcId);
        serverConfig.setValue("process.query", "State.Name.ct=gtpv,Args.*.ct=%service.id%");

        servResource.setProductConfig(serverConfig);
        servResource.setMeasurementConfig();

        serviceTypeList.add(servResource);

        getLog().debug("------------->gtpc merger:" + servResource.getName());
    }

    private void createPcapDistributorService(final ConfigResponse serverConfig,
            final List<ServiceResource> serviceTypeList, final ProcessConfigBean processConfigBean,
            final ServiceConfigBean serviceConfigBean) {
        final String serviceId = processConfigBean.getProcessId() + "_" + serviceConfigBean.getServiceId();
        final ServiceResource servResource = new ServiceResource();
        servResource.setServiceName("Probe Service: pcapDistributor_" + serviceId);
        servResource.setType(this, "Probe Service");

        serverConfig.setValue("service.id", serviceId);
        serverConfig.setValue("process.query", "State.Name.ct=pcapdistributer,Args.*.ct=%service.id%");

        servResource.setProductConfig(serverConfig);
        servResource.setMeasurementConfig();

        serviceTypeList.add(servResource);

        getLog().debug("------------->pcap distributor parser:" + servResource.getName());
    }

    private void createCaptoolServices(final ConfigResponse serverConfig, final List<ServiceResource> serviceTypeList,
            final ProcessConfigBean pConfBean, final ServiceConfigBean sConfBean) {
        final String parserId = readCaptoolParserId(sConfBean, "instanceId");
        final String serviceId = pConfBean.getProcessId() + "_" + sConfBean.getServiceId();

        final ServiceResource servResource = new ServiceResource();
        final ServiceResource mergerResource = new ServiceResource();

        servResource.setServiceName("Probe Service: captool-" + parserId.toString());
        servResource.setType(this, "Probe Service");

        serverConfig.setValue("service.id", parserId.toString());
        serverConfig.setValue("process.query", "State.Name.ct=captool,Args.*.ct=%service.id%");

        servResource.setProductConfig(serverConfig);
        servResource.setMeasurementConfig();

        serviceTypeList.add(servResource);

        getLog().debug("------------->captool parser:" + servResource.getName());

        mergerResource.setServiceName("Probe Service: pcapmerger_" + serviceId + " :captool-" + parserId.toString());
        mergerResource.setType(this, "Probe Service");

        serverConfig.setValue("service.id", serviceId);
        serverConfig.setValue("process.query", "State.Name.ct=pcapmerger,Args.*.ct=%service.id%");

        mergerResource.setProductConfig(serverConfig);
        mergerResource.setMeasurementConfig();

        serviceTypeList.add(mergerResource);

        getLog().debug("------------->pcap merger parser:" + servResource.getName());
    }

    /**
     * Read the arguments for this instance from <args> section of the config.xml file
     */
    private String readCaptoolParserId(final ServiceConfigBean serviceData, final String argument) {

        //Read the input arguments from the config.xml
        final String args = (String) serviceData.getArguments();
        //each argument is delimited by a new line
        final String[] allArgs = args.split("\n");
        for (final String arg : allArgs) {
            //split to read the name and value
            final String[] nameValue = arg.split("=");
            if (nameValue[0].trim().equals(argument)) {
                return nameValue[1];
            }
        }
        return "No value for argument";
    }
}