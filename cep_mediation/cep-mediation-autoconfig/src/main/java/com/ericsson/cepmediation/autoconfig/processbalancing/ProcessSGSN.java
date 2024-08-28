package com.ericsson.cepmediation.autoconfig.processbalancing;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.cepmediation.autoconfig.model.Config;
import com.ericsson.cepmediation.autoconfig.model.Host;
import com.ericsson.cepmediation.autoconfig.model.NetworkElementDefinition;
import com.ericsson.cepmediation.autoconfig.model.ProcessDefinition;
import com.ericsson.cepmediation.autoconfig.model.Sgsn;
import com.ericsson.cepmediation.autoconfig.util.Utils;
import com.ericsson.cepmediation.base.proc.config.NE_TYPE;

/**
 * This class is responsible to allocate process (JVMs) for SGSN nodes
 * @author evikkua
 *
 */
public class ProcessSGSN {
    private static final Logger logger = LoggerFactory.getLogger(ProcessSGSN.class);

    Config config;

    private final List<ProcessDefinition> processDefinitionsList;

    /**
     * Initialize config and processDefinitionsList
     * @param config
     * @param processDefinitionsList
     */
    public ProcessSGSN(Config config, List<ProcessDefinition> processDefinitionsList) {
        this.config = config;
        this.processDefinitionsList = processDefinitionsList;
    }

    /**
     * Assigning process to SGSN nodes
     * @return
     */
    public List<ProcessDefinition> process() {
        int cpus = Utils.getAvailableCPUs(config);
        if (cpus <= 0) {
            logger.error("No JVM left to allocate SGSN processes");
            return null;
        }
        final int SGSN_FIXED_MEMORY = config.getSgehFixedMeory() * 1024 * 1024;
        final int FIXED_SGSN_SB = 2;
        final int FIXED_SGSN_CFA = 8;
        List<Sgsn> sgsns = config.getSgsns();
        final int sgsnSize = sgsns.size();
        final boolean isSBEnabled = config.isSBEnabled();
        final Host host = config.getHosts().get(0); // Use always the first host in the host list. (hard coded)
        host.setRemainingCPUs(host.getRemainingCPUs() - 1); // Leaving one cpu for standalone process
        int jvms;
        int processId;
        ProcessDefinition processDefinition;
        NetworkElementDefinition networkElement;
        List<NetworkElementDefinition> networkElementList;

        if (isSBEnabled) { // If Session Browser is enabled set 2 SGSNs per process and calculate the number of processes (jvms) needed
            jvms = sgsnSize / FIXED_SGSN_SB + sgsnSize % FIXED_SGSN_SB;
        } else { //Else set 8 SGSNs per process and calculate the number of processes (jvms) needed
            jvms = sgsnSize / FIXED_SGSN_CFA + ((sgsnSize % FIXED_SGSN_CFA) == 0 ? 0 : 1);
        }

        processId = cpus - jvms; // To set the sgsn process Ids after RNCs process ids

        try {
            int sgsnIndex = 0;
            int counter = isSBEnabled ? FIXED_SGSN_SB : FIXED_SGSN_CFA; //If Session Browser is enabled set 2 SGSNs per process, else set 8 SGSNs per process
            for (int i = 0; i < jvms; i++) {
                processDefinition = new ProcessDefinition();
                processDefinition.setHost(host);
                networkElementList = processDefinition.getNetworkElementDefinitionList();
                processDefinition.setProcessId(++processId);
                processDefinition.setMemory(SGSN_FIXED_MEMORY); // Set sgsn process fixed memory
                host.setRemainingMemory(host.getRemainingMemory() - SGSN_FIXED_MEMORY); // Adjust remaining memory of the host
                host.setRemainingCPUs(host.getRemainingCPUs() - 1); // Adjust remaining cpus (jvms) of the host
                for (int j = 0; j < counter; j++) { // To set multiple sgsns per process based of session browser enable status
                    if (sgsnIndex >= sgsns.size()) {
                        break;
                    }
                    networkElement = new NetworkElementDefinition();
                    networkElement.setLabel(sgsns.get(sgsnIndex).getName());
                    networkElement.setNeType(NE_TYPE.SGEH.getValue());
                    networkElement.setDirectory(sgsns.get(sgsnIndex).getRootPath());
                    networkElementList.add(networkElement);
                    sgsnIndex++;
                }
                processDefinitionsList.add(processDefinition);
            }
        } catch (Exception e) {
            logger.error("Error in allocating SGSN processes " + e.getMessage());
        }
        return processDefinitionsList;
    }
}