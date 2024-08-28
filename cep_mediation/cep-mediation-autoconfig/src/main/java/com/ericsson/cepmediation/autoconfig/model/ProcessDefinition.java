package com.ericsson.cepmediation.autoconfig.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Configuration holder of CEP Processes 
 * @author evikkua
 *
 */
public class ProcessDefinition implements Comparable<ProcessDefinition> {
    private long memory;

    private int processId;

    private List<NetworkElementDefinition> networkElementDefinitionList;

    private List<Rnc> rncs;

    private int cellsused;

    private Host host;

    public ProcessDefinition() {
        networkElementDefinitionList = new ArrayList<NetworkElementDefinition>();
        rncs = new ArrayList<Rnc>();
    }

    public long getMemory() {
        return memory;
    }

    public void setMemory(long memory) {
        this.memory = memory;
    }

    public int getProcessId() {
        return processId;
    }

    public void setProcessId(int processId) {
        this.processId = processId;
    }

    public List<NetworkElementDefinition> getNetworkElementDefinitionList() {
        return networkElementDefinitionList;
    }

    public void setNetworkElementDefinitionList(List<NetworkElementDefinition> networkElementDefinitionList) {
        this.networkElementDefinitionList = networkElementDefinitionList;
    }

    @Override
    public String toString() {
        return "ProcessDefinition [memory=" + memory + ", processId=" + processId + ", networkElementDefinitionList=" + networkElementDefinitionList + "]";
    }

    @Override
    public int compareTo(ProcessDefinition o) {
        return cellsused - o.cellsused;
    }

    public int getCellsused() {
        return cellsused;
    }

    public void setCellsused(int cellsused) {
        this.cellsused = cellsused;
    }

    public Host getHost() {
        return host;
    }

    public void setHost(Host host) {
        this.host = host;
    }

    public List<Rnc> getRncs() {
        return rncs;
    }

    public void setRncs(List<Rnc> rncs) {
        this.rncs = rncs;
    }
}
