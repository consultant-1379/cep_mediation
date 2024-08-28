package com.ericsson.cepmediation.server.management;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import com.ericsson.cepmediation.base.proc.config.ProcessConfigBean;
import com.ericsson.cepmediation.base.properties.CepMediationProperties;
import com.ericsson.cepmediation.base.properties.CepMediationProperty;

public class AgentData implements Serializable {

    private static final long serialVersionUID = 799886062340322034L;

    private String host;

    private int port = CepMediationProperties.getIntProperty(CepMediationProperty.JAVA_RMI_SERVER_PORT);

    private String user;

    private String password;

    private boolean isAdminServer;

    private boolean isReachable;

    private boolean enableMonitor;

    private CepMediationServer server;

    private List<ProcessConfigBean> process;

    public boolean isReachable() {
        return isReachable;
    }

    public void setReachable(final boolean isReachable) {
        this.isReachable = isReachable;
    }

    public boolean isAdminServer() {
        return isAdminServer;
    }

    public void setAdminServer(final boolean isAdminServer) {
        this.isAdminServer = isAdminServer;
    }

    public String getHost() {
        return host;

    }

    public void setHost(final String host) {
        this.host = host;
    }

    public int getPort() {
        return port;
    }

    public void setPort(final int port) {
        this.port = port;
    }

    public String getUser() {
        return user;
    }

    public void setUser(final String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(final String password) {
        this.password = password;
    }

    public boolean isServer() {
        return isServer;
    }

    public void setServer(final boolean isServer) {
        this.isServer = isServer;
    }

    private boolean isServer;

    private Map<String, String[]> nodeServerMapping;

    public Map<String, String[]> getNodeServerMapping() {
        return nodeServerMapping;
    }

    public void setNodeServerMapping(final Map<String, String[]> nodeServerMapping) {
        this.nodeServerMapping = nodeServerMapping;
    }

    @Override
    public String toString() {
        return "AgentData [host=" + host + ", port=" + port + ", user=" + user + ", password=" + password
                + ", isAdminServer=" + isAdminServer + ", isReachable=" + isReachable + ", enableMonitor="
                + enableMonitor + ", server=" + server + ", process=" + process + ", isServer=" + isServer
                + ", nodeServerMapping=" + nodeServerMapping + "]";
    }

    public CepMediationServer getServer() {
        return server;
    }

    public void setServer(final CepMediationServer server) {
        this.server = server;
    }

    public List<ProcessConfigBean> getProcess() {
        return process;
    }

    public void setProcess(final List<ProcessConfigBean> process) {
        this.process = process;
    }

    public boolean isEnableMonitor() {
        return enableMonitor;
    }

    public void disableMonitor() {
        this.enableMonitor = false;
    }

    public void enableMonitor() {
        this.enableMonitor = true;
    }

}
