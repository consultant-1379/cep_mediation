package com.ericsson.cepmediation.autoconfig.model;

/**
 * Configuration holder of Network Element
 * @author evikkua
 *
 */
public class NetworkElementDefinition {
    private String ip;

    private String userName;

    private String password;

    private String label;

    private String directory;

    private int neType;

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getDirectory() {
        return directory;
    }

    public void setDirectory(String directory) {
        this.directory = directory;
    }

    public int getNeType() {
        return neType;
    }

    public void setNeType(int neType) {
        this.neType = neType;
    }

    @Override
    public String toString() {
        return "NetworkElementDefinition [ip=" + ip + ", userName=" + userName + ", password=" + password + ", label=" + label + ", directory=" + directory
                + ", neType=" + neType + "]";
    }

}
