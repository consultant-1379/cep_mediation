package com.ericsson.cepmediation.base.util;

import java.io.Serializable;

public class AgentConfigurationData implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1977019590502936932L;

    private boolean isAdminServer;

    private String kpiRootDirectories;

    private FileServerData serverData = new FileServerData();
    
    private String inputDirectory;
    
    private String localFileStorage;

    protected AgentConfigurationData() {
        // Dummy constructor, used by superclass
    }

    /**
     * This constructor clones an AgentConfigurationData object
     * @param originalAgentConfigurationData
     */
    public AgentConfigurationData(final AgentConfigurationData originalAgentConfigurationData) {
        isAdminServer = originalAgentConfigurationData.isAdminServer;
        localFileStorage = originalAgentConfigurationData.localFileStorage;
    }

    public String getLocalFileStorage() {
        return localFileStorage;
    }

     
    public String getKpiRootDirectories() {
        return kpiRootDirectories;
    }

   
    public boolean isAdminServer() {
        return isAdminServer;
    }

    public void setAdminServer(final boolean isAdminServer) {
        this.isAdminServer = isAdminServer;
    }

    public void setLocalFileStorage(final String filePath) {
        this.localFileStorage = filePath;
    }

    public FileServerData getServerData() {
        return serverData;
    }

    public void setServerData(FileServerData serverData) {
        this.serverData = serverData;
    }
    
    public void setServerData(String ip, String username , String password) {
        this.serverData.setServerIP(ip);
        this.serverData.setServerUser(username);
        this.serverData.setServerPassword(password);
    }
    
    
    public String getInputDirectory() {
        return inputDirectory;
    }

    public void setInputDirectory(String inputDirectory) {
        this.inputDirectory = inputDirectory;
    }

    @Override
    public String toString() {
        return "AgentConfigurationData [inputDirectory=" + inputDirectory + ", isAdminServer=" + isAdminServer + ", kpiRootDirectories="
                + kpiRootDirectories + ", serverData=" + serverData + ", localFileStorage=" + localFileStorage + "]";
    }
}
