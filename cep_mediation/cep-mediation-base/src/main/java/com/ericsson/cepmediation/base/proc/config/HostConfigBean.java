/**
 * (C) Copyright LM Ericsson System Expertise AT/LMI, 2011
 *
 * The copyright to the computer program(s) herein is the property of Ericsson
 * System Expertise EEI, Sweden. The program(s) may be used and/or copied only
 * with the written permission from Ericsson System Expertise AT/LMI or in
 * accordance with the terms and conditions stipulated in the agreement/contract
 * under which the program(s) have been supplied.
 *
 */
package com.ericsson.cepmediation.base.proc.config;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * 
 * This class encapsulates the host configuration data; IP address, host name, and mastership
 * 
 * @author eeilfn
 * 
 */
public final class HostConfigBean implements Serializable {
    private static final long serialVersionUID = -2626643783605849412L;

    // Host name of this process running machine 
    private String host;

    // IP address of the process running host, may be IPV4 or IPV6

    private String ip;

    // Indicates if this host is the master host
    private boolean master = false;

    /*
     * host name of this process running machine
     */
    public String getHost() {
        return host;
    }

    /*
     * @return ip address of the process running host
     */
    public String getIp() {
        return ip;
    }

    /*
     * @return true the process running host is the master host
     */
    public boolean isMaster() {
        return master;
    }

    /**
     * This is a generic utility method to serialise a class state
     * 
     * @return an absolute path of the persisted file
     */

    public String persist() {

        FileOutputStream fos = null;
        ObjectOutputStream out = null;

        final String fileName = "/tmp/tub" + System.currentTimeMillis() + ".ser";
        try {
            fos = new FileOutputStream(fileName);
            out = new ObjectOutputStream(fos);

            out.writeObject(this);
            out.flush();
            out.close();
        } catch (final Exception e) {
            throw new RuntimeException("Failed to persist this object");
        }
        return fileName;

    }

    private void readObject(final ObjectInputStream is) {
        try {

            is.defaultReadObject();
        } catch (final Exception e) {
            e.printStackTrace();
        }
    }

    public void setHost(final String host) {
        this.host = host.trim();
    }

    public void setIp(final String ip) {
        this.ip = ip.trim();
    }

    public void setMaster(final Boolean master) {
        this.master = master;
    }

    /*
     * this is a helper method to support the serialisation process
     * 
     * @param outputStream
     */
    private void writeObject(final ObjectOutputStream outputStream) {

        try {
            // enable this method to be used as default writer, when writing
            // field List<ServiceConfigBeab>
            outputStream.defaultWriteObject();
        } catch (final IOException e) {
            throw new IllegalStateException("Failed to persist bean, Reson:\n" + e.getMessage());
        }
    }

    @Override
    public String toString() {
        return "HostConfigBean [host=" + host + ", ip=" + ip + ", master=" + master + "]";
    }
}
