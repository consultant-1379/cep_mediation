package com.ericsson.cepmediation.autoconfig.command;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.cepmediation.autoconfig.model.Config;
import com.ericsson.cepmediation.autoconfig.model.Host;
import com.ericsson.cepmediation.autoconfig.model.NetworkElementDefinition;
import com.ericsson.cepmediation.autoconfig.model.ProcessDefinition;
import com.ericsson.cepmediation.autoconfig.processbalancing.ProcessRNC;
import com.ericsson.cepmediation.autoconfig.processbalancing.ProcessSGSN;
import com.ericsson.cepmediation.autoconfig.processbalancing.ProcessUP;
import com.ericsson.cepmediation.config.bean.AppConfigType;
import com.ericsson.cepmediation.config.bean.HostType;
import com.ericsson.cepmediation.config.bean.HostsType;
import com.ericsson.cepmediation.config.bean.NetworkElement;
import com.ericsson.cepmediation.config.bean.NetworkElementsType;
import com.ericsson.cepmediation.config.bean.ObjectFactory;
import com.ericsson.cepmediation.config.bean.ProcessType;

/**
 * This class is responsible for generating network_element.xml after balancing processes (JVMs) among available hosts
 * @author evikkua
 *
 */
public class GenerateCommand implements AutoconfigCommand {

    private static final Logger logger = LoggerFactory.getLogger(GenerateCommand.class);

    private JAXBContext context;

    private Marshaller marshaller;

    private OutputStream outputStream;

    private final ObjectFactory objectFactory = new ObjectFactory();

    private final AppConfigType appConfig = objectFactory.createAppConfigType();

    private List<ProcessDefinition> processDefinitionsList;

    /**
     * Constructor to initialize XML Generator using JAXB
     */
    public GenerateCommand() {
        logger.debug("Initialiging XML generator..........");
        try {
            context = JAXBContext.newInstance(AppConfigType.class);
            marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        } catch (JAXBException e) {
            logger.error("Initialiging failed, error occurred in JAXB application" + e.getMessage());
            throw new RuntimeException(e);
        }
    }

    /**
     * 
     * @param config
     * @param master 
     * @return Output location of network_element.xml
     */
    private String getFileName(Config config, String host, boolean master) {
        String outputLOC;
        if (master) {
            outputLOC = config.getOutputNeXML();
        } else {
            outputLOC = config.getOutputNeXML() + "_" + host;
        }
        logger.debug("Output location of network_element.xml for host: " + host + "is " + outputLOC);
        return outputLOC;
    }

    /**
     * Invoke methods to set process (JVMs) for RNCs,SGSN and Userplane
     * Setting hosts for XML
     * Setting appConfig structure for XML generation
     * Invoke method to generate XML
     */
    @Override
    public boolean process(Config config) {
        logger.debug("Processing started..........");
        try {
            processDefinitionsList = new ArrayList<ProcessDefinition>();

            if (config.getUps() != null && config.getUps().size() > 0) {
                ProcessUP processUP = new ProcessUP(config, processDefinitionsList);
                processUP.process();
            }

            if (config.getSgsns() != null && config.getSgsns().size() > 0) {
                ProcessSGSN processSGSN = new ProcessSGSN(config, processDefinitionsList);
                processSGSN.process();
            }

            if (config.getRncs() != null && config.getRncs().size() > 0) {
                ProcessRNC processRNC = new ProcessRNC(config);
                List<ProcessDefinition> psl = processRNC.process();
                processDefinitionsList.addAll(psl);
            }
            
            if (processDefinitionsList.isEmpty()) {
                throw new IllegalStateException("No network elements found!");
            }

            return generate(config);
        } catch (Exception e) {
            logger.error("Error in XML generation!");
            return false;
        }
    }

    /** 
     * This method sets hosts of HostType XML element network_element.xml from available hosts information
     * @param config
     * @param hosts
     */
    private boolean generate(Config config) {
        logger.debug("XML generation started..........");
        boolean result = true, resultReturn = true;
        for (Host host : config.getHosts()) {
            HostsType hosts = objectFactory.createHostsType();
            HostType hostType = objectFactory.createHostType();
            hostType.setMaster(host.isMaster());
            hostType.setIp(host.getIp());
            hosts.getHost().add(hostType);
            appConfig.setHosts(hosts);
            result = generateNetworkElementXML(config);
            if (!result) {
                logger.error("Unable to gerenate network_elements.xml for host: " + host);
                resultReturn = false;
            }
        }
        logger.debug("XML generation completed..........");
        return resultReturn;
    }

    /**
     * This method sets values for AppConfigType XML elements
     * Invoke method to generate network_element.xml
     * @param config
     * @return boolean
     */
    private boolean generateNetworkElementXML(Config config) {

        if (processDefinitionsList != null && processDefinitionsList.size() > 0) {
            // Sorting process (JVMs) based on process IDs in increasing order.
            Collections.sort(processDefinitionsList, new Comparator<ProcessDefinition>() {

                @Override
                public int compare(ProcessDefinition o1, ProcessDefinition o2) {
                    return o1.getProcessId() - o2.getProcessId();
                }
            });
        } else {
            return false;
        }

        int processId = 0;
        //        for (ProcessDefinition processDefinition : processDefinitionsList) {
        //            processDefinition.setProcessId(++processId);
        //
        //        }

        List<HostType> hostTypeList = appConfig.getHosts().getHost();
        try {
            // Starting iteration over process List and setting them to ProcessType XML element
            for (ProcessDefinition processDefinition : processDefinitionsList) {
                ProcessType process = objectFactory.createProcessType();
                //                process.setProcid(processDefinition.getProcessId());

                //Iteration over hostTypeList to assign process to corresponding host IP
                for (HostType hostType : hostTypeList) {
                    if (hostType.getIp().equals(processDefinition.getHost().getIp())) {
                        hostType.getProcess().add(process);
                        process.setProcid(++processId);
                        break;
                    }
                }

                NetworkElementsType nes = objectFactory.createNetworkElementsType();
                process.setNetworkElements(nes);
                process.setMemorySize(String.valueOf(processDefinition.getMemory() / 1024));

                //Iteration over NetworkElementDefinitionList to set values for NetworkElement XML element
                for (NetworkElementDefinition networkElement : processDefinition.getNetworkElementDefinitionList()) {
                    NetworkElement ne = objectFactory.createNetworkElement();
                    nes.getNetworkElement().add(ne);
                    ne.setNeType(networkElement.getNeType());
                    ne.setLabel(networkElement.getLabel());
                    ne.setDirectory(networkElement.getDirectory());
                    ne.setIp(networkElement.getIp());
                    ne.setUname(networkElement.getUserName());
                    ne.setPassword(networkElement.getPassword());
                }
            }
        } catch (Exception e) {
            logger.error("Error while setting values for AppConfigType XML elements " + e.getMessage());
            return false;

        }
        return generateXML(config, hostTypeList);
    }

    /**
     * Generate network_element.xml based on generated appConfig structure
     * @param config
     * @return boolean
     */
    private boolean generateXML(Config config, List<HostType> hostTypeList) {
        try {
            if (hostTypeList == null || hostTypeList.isEmpty()) {
                return false;
            }
            String host = hostTypeList.get(0).getIp();
            boolean master = hostTypeList.get(0).getMaster();
            JAXBElement<AppConfigType> element = new ObjectFactory().createAppconfig(appConfig);
            outputStream = new FileOutputStream(getFileName(config, host, master));

            marshaller.marshal(element, outputStream);
            return true;
        } catch (FileNotFoundException e) {
            logger.error("XML generation failed!, file not found", e);
            return false;
        } catch (JAXBException e) {
            logger.error("XML generation failed!, error occurred in JAXB application", e);
            return false;
        }
    }
}
