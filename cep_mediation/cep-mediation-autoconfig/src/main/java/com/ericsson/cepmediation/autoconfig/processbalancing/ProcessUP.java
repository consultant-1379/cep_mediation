package com.ericsson.cepmediation.autoconfig.processbalancing;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.cepmediation.autoconfig.model.Config;
import com.ericsson.cepmediation.autoconfig.model.Host;
import com.ericsson.cepmediation.autoconfig.model.NetworkElementDefinition;
import com.ericsson.cepmediation.autoconfig.model.ProcessDefinition;
import com.ericsson.cepmediation.autoconfig.model.UserPlane;
import com.ericsson.cepmediation.autoconfig.util.Utils;
import com.ericsson.cepmediation.base.proc.config.NE_TYPE;

/**
 * This class is responsible to allocate process (JVMs) for User Plane nodes
 * @author evikkua
 *
 */
public class ProcessUP {
    private static final Logger logger = LoggerFactory.getLogger(ProcessUP.class);

    Config config;

    private final List<ProcessDefinition> processDefinitionsList;

    /**
     * Initialize config and processDefinitionsList
     * @param config
     * @param processDefinitionsList
     */
    public ProcessUP(Config config, List<ProcessDefinition> processDefinitionsList) {
        this.config = config;
        this.processDefinitionsList = processDefinitionsList;
    }

    /**
     * 
     * @return
     */
    public List<ProcessDefinition> process() {
        final int UP_FIXED_MEMORY = config.getUpFixedMemory() * 1024 * 1024;
        List<UserPlane> ups = config.getUps();
        List<Host> hosts = config.getHosts();
        int processId = Utils.getAvailableCPUs(config) - ups.size(); // To set the up process Ids after sgsns process ids
        ProcessDefinition processDefinition;
        NetworkElementDefinition networkElement;
        List<NetworkElementDefinition> networkElementList;

        try {
            for (int i = 0; i < ups.size();) {
                for (Host host : hosts) {
                    UserPlane up = ups.get(i);
                    processDefinition = new ProcessDefinition();
                    processDefinition.setHost(host);
                    networkElementList = processDefinition.getNetworkElementDefinitionList();
                    processDefinition.setProcessId(++processId);
                    processDefinition.setMemory(UP_FIXED_MEMORY);
                    host.setRemainingMemory(host.getRemainingMemory() - UP_FIXED_MEMORY); // Adjust remaining memory of the host
                    host.setRemainingCPUs(host.getRemainingCPUs() - 2); // Adjust remaining cpus (jvms) of the host (2 cpus per UP process)
                    networkElement = new NetworkElementDefinition();
                    networkElement.setLabel(up.getName());
                    networkElement.setNeType(NE_TYPE.USER_PLANE.getValue());
                    networkElement.setDirectory(up.getPath());
                    networkElement.setIp(up.getIp());
                    networkElement.setUserName(up.getUserName());
                    networkElement.setPassword(up.getPassword());
                    networkElementList.add(networkElement);
                    processDefinitionsList.add(processDefinition);
                    i++;
                }
            }
        } catch (Exception e) {
            logger.error("Error in allocating User Plane processes " + e.getMessage());
        }
        return processDefinitionsList;
    }
}