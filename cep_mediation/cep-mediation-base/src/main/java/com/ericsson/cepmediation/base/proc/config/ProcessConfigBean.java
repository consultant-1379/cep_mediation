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
import java.util.Map;
import java.util.TreeMap;

import com.ericsson.cepmediation.config.bean.ProcessType;


/**
 * 
 * This class encapsulates the process configuration data(process name, class
 * and arguments for a each process defined in the config.xml )
 * 
 * @author eachsaj
 * 
 */
public final class ProcessConfigBean implements Serializable {
    /**
     * generated serial version id.
     */
    private static final long serialVersionUID = -8566389292998535594L;

    // process names stores here from xml file
    private PROC_TYPE processType;

    // list of services defined
    private TreeMap<Integer, ServiceConfigBean> services;

    private int processId;

    private boolean isSerialProcessing;

    public boolean isSerialProcessing() {
        return isSerialProcessing;
    }

    public void setSerialProcessing(boolean isSerialProcessing) {
        this.isSerialProcessing = isSerialProcessing;
    }

    private String hostName = null;

    private Map<String, String> processArgs;

    private String ip;
    
    public ProcessConfigBean(){}
    
    public ProcessConfigBean(String host, String ip, ProcessType procType) {
        this.hostName = host;
        this.ip = ip;
        this.processId = procType.getProcid();
        this.processType = PROC_TYPE.SLAVE;
    }

    // /process type, it could be Server or Slave
    // slaves process running in its own jvm
    public PROC_TYPE getProcessType() {
        return processType;
    }

    // list of services
    public TreeMap<Integer, ServiceConfigBean> getServices() {
        return services;
    }

    /**
     *
     * Get the service config bean by the service name
     *
     * @param serviceName
     * @return
     */
    public ServiceConfigBean getServiceByName(final String serviceName) {

        //return null if the parameter is null or empty
        if (serviceName == null || serviceName.equals("")) {

            return null;
        }

        //Find the service of specified name
        for (final Integer key : services.keySet()) {

            if (serviceName.equals(services.get(key).getServiceName())) {

                return services.get(key);
            }
        }

        return null;

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

    @SuppressWarnings("unchecked")
    private void readObject(final ObjectInputStream is) {
        try {

            is.defaultReadObject();
            this.services = (TreeMap<Integer, ServiceConfigBean>) is.readObject();
        } catch (final Exception e) {
            e.printStackTrace();
        }
    }

    public void setProcessType(final PROC_TYPE processtype) {
        this.processType = processtype;
    }

    public int getProcessId() {
        return processId;
    }

    public void setProcessId(final int processId) {
        this.processId = processId;
    }

    public String getHostName() {
        return hostName;
    }

    public void setHostName(final String hostName) {
        this.hostName = hostName;
    }

    public void setServices(final TreeMap<Integer, ServiceConfigBean> services) {
        this.services = services;
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
            outputStream.writeObject(services);
        } catch (final IOException e) {
            throw new IllegalStateException("Failed to persist bean, Reson:\n" + e.getMessage());
        }

    }

    public void setArguments(final Map<String, String> processArguments) {
        this.processArgs = processArguments;

    }

    public Map<String, String> getArguments() {
        return this.processArgs;
    }

    @Override
    public String toString() {
        return "ProcessConfigBean [processType=" + processType + ", services=" + services + ", processId=" + processId
                + ", processArgs=" + processArgs + "]";
    }

    public void setHostIp(final String ip) {
        this.ip = ip;
    }

    public String getIp() {
        return ip;
    }
}
