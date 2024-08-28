package com.ericsson.cepmediation.evolution.common;

public class Host {

    public Host(String name, String ip, boolean isMaster) {

        this.name = name;
        this.ip = ip;
        this.isMaster = isMaster;
    }

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
    public boolean isMaster() {

        return isMaster;
    }

    public void setMaster(boolean isMaster) {
        this.isMaster = isMaster;
    }

    @Override
    public int hashCode(){
        
        final int prime = 31;
        int result = isMaster ? 1 : 0;
        result = prime * result
                + ((name == null) ? 0 : name.hashCode());
        
        result = prime * result + ((ip == null) ? 0 : ip.hashCode());

        return result;
    }

    @Override
    public boolean equals(Object obj) {

        if (obj == this) {

            return true;
        }

        if (obj == null || obj.getClass() != this.getClass()) {

            return false;
        }

        Host host = (Host) obj;

        return (isMaster == host.isMaster) && (name == host.name || (name != null && name.equals(host.getName())))
                && (ip == host.ip || (ip != null && ip.equals(host.getIp())));

    }

    @Override
    public String toString() {

        return new String("Host name: " + name + ";Ip: " + ip + ";isMaster(" + isMaster + ")");
    }

    private String name;

    private String ip;

    private boolean isMaster;
}
