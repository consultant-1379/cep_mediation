package com.ericsson.cepmediation.autoconfig.model;

/**
 * 
 * @author evikkua
 *
 */
public class UserPlane {
    private String name;

    private String ip;

    private String userName;

    private String password;

    private String path;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

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

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public String toString() {
        return "UP [name=" + name + ", ip=" + ip + ", userName=" + userName + ", password=" + password + ", path=" + path + "]";
    }
}
