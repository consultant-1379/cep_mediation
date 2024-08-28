package com.ericsson.cepmediation.autoconfig.model;

import java.util.Date;
import java.util.List;

/**
 * This class holds configuration parameters
 * @author evikkua
 *
 */
public class Config {
    private Date dateGenerated;

    private List<Rnc> rncs;

    private List<Rnc> rncs1Min;

    private List<Rnc> rncs15Min;

    private List<Sgsn> sgsns;

    private List<UserPlane> ups;

    private List<Host> hosts;

    private String sgsnRootPath;

    private String upRootPath;

    private int processIds = 1;

    private int gpehFixedMemory;

    private int sgehFixedMemory;

    private int UpFixedMemory;

    private int memoryUpperLimit;

    private int maxRncsProcess;

    private String outputNeXML;

    private String standaloneXML;

    private String hazelcastXML;

    private String pcpXML;

    private boolean isSBEnabled;

    public Date getDateGenerated() {
        return dateGenerated;
    }

    public void setDateGenerated(Date dateGenerated) {
        this.dateGenerated = dateGenerated;
    }

    public List<Rnc> getRncs() {
        return rncs;
    }

    public void setRncs(List<Rnc> rncs) {
        this.rncs = rncs;
    }

    public List<Sgsn> getSgsns() {
        return sgsns;
    }

    public void setSgsns(List<Sgsn> sgsns) {
        this.sgsns = sgsns;
    }

    public List<UserPlane> getUps() {
        return ups;
    }

    public void setUps(List<UserPlane> ups) {
        this.ups = ups;
    }

    public List<Host> getHosts() {
        return hosts;
    }

    public void setHosts(List<Host> hosts) {
        this.hosts = hosts;
    }

    public int getProcessIds() {
        return processIds;
    }

    public void setProcessIds(int processIds) {
        this.processIds = processIds;
    }

    public String getSgsnRootPath() {
        return sgsnRootPath;
    }

    public void setSgsnRootPath(String sgsnRootPath) {
        this.sgsnRootPath = sgsnRootPath;
    }

    public String getUpRootPath() {
        return upRootPath;
    }

    public void setUpRootPath(String upRootPath) {
        this.upRootPath = upRootPath;
    }

    public int getGpehFixedMemory() {
        return gpehFixedMemory;
    }

    public void setGpehFixedMemory(int gpehFixedMemory) {
        this.gpehFixedMemory = gpehFixedMemory;
    }

    public int getSgehFixedMeory() {
        return sgehFixedMemory;
    }

    public void setSgehFixedMeory(int sgehFixedMeory) {
        this.sgehFixedMemory = sgehFixedMeory;
    }

    public int getUpFixedMemory() {
        return UpFixedMemory;
    }

    public void setUpFixedMemory(int upFixedMemory) {
        UpFixedMemory = upFixedMemory;
    }

    public String getOutputNeXML() {
        return outputNeXML;
    }

    public void setOutputNeXML(String outputNeXML) {
        this.outputNeXML = outputNeXML;
    }

    public String getStandaloneXML() {
        return standaloneXML;
    }

    public void setStandaloneXML(String standaloneXML) {
        this.standaloneXML = standaloneXML;
    }

    public String getHazelcastXML() {
        return hazelcastXML;
    }

    public void setHazelcastXML(String hazelcastXML) {
        this.hazelcastXML = hazelcastXML;
    }

    public String getPcapXML() {
        return pcpXML;
    }

    public void setPcapXML(String pcpXML) {
        this.pcpXML = pcpXML;
    }

    public boolean isSBEnabled() {
        return isSBEnabled;
    }

    public void setSBEnabled(boolean isSBEnabled) {
        this.isSBEnabled = isSBEnabled;
    }

    public List<Rnc> getRncs1Min() {
        return rncs1Min;
    }

    public void setRncs1Min(List<Rnc> rncs1Min) {
        this.rncs1Min = rncs1Min;
    }

    public List<Rnc> getRncs15Min() {
        return rncs15Min;
    }

    public void setRncs15Min(List<Rnc> rncs15Min) {
        this.rncs15Min = rncs15Min;
    }

    public int getMemoryUpperLimit() {
        return memoryUpperLimit;
    }

    public void setMemoryUpperLimit(int memoryUpperLimit) {
        this.memoryUpperLimit = memoryUpperLimit;
    }

    public int getMaxRncsProcess() {
        return maxRncsProcess;
    }

    public void setMaxRncsProcess(int processUpperLimit) {
        this.maxRncsProcess = processUpperLimit;
    }

}
