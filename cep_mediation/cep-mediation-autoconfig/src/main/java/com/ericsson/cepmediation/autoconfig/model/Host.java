package com.ericsson.cepmediation.autoconfig.model;

/**
 * 
 * @author evikkua
 *
 */
public class Host implements Comparable<Host> {
    private final String name;

    private final String ip;

    private final boolean isMaster;

    private long remainingMemory;

    private int remainingCPUs;

    private int cells;

    private float ratio;

    public Host(String name, String ip, boolean isMaster, long avaiableMemory, int availableCPUs) {
        this.name = name;
        this.ip = ip;
        this.isMaster = isMaster;
        this.remainingMemory = (long) (avaiableMemory * 0.85f); // Leaving 15% of memory free for OS
        this.remainingCPUs = availableCPUs;
        this.ratio = Float.valueOf(avaiableMemory) / Float.valueOf(availableCPUs);
    }

    public String getName() {
        return name;
    }

    public String getIp() {
        return ip;
    }

    public boolean isMaster() {

        return isMaster;
    }

    @Override
    public int hashCode() {

        final int prime = 31;
        int result = isMaster ? 1 : 0;
        result = prime * result + ((name == null) ? 0 : name.hashCode());

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

    public int getRemainingCPUs() {
        return remainingCPUs;
    }

    public void setRemainingCPUs(int remainingCPUs) {
        this.remainingCPUs = remainingCPUs;
    }

    public long getRemainingMemory() {
        return remainingMemory;
    }

    public void setRemainingMemory(long remainingMemory) {
        this.remainingMemory = remainingMemory;
    }

    @Override
    public String toString() {
        return "Host [name=" + name + ", ip=" + ip + ", isMaster=" + isMaster + ", remainingMemory=" + remainingMemory + ", remainingCPUs=" + remainingCPUs
                + ", cells=" + cells + "]";
    }

    public int getCells() {
        return cells;
    }

    public void setCells(int cells) {
        this.cells = cells;
    }

    @Override
    public int compareTo(Host o) {
        return (int) (o.ratio - ratio);
    }

    public float getRatio() {
        return ratio;
    }

    public void setRatio(float ratio) {
        this.ratio = ratio;
    }

}
