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

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.ericsson.cepmediation.config.bean.NetworkElement;

/**
 * 
 * This class encapsulates the service configuration data(service name,
 * class and arguments for a each process defined in the config.xml )
 * @author eachsaj
 *
 */

public class ServiceConfigBean implements Serializable {

    /**
     * generated serial version id
     */
    private static final long serialVersionUID = 7053887055746919305L;

    //any arguments/parameters required to initialise this process
    //this object must contain all required parameters
    private Object arguments;

    // Name of the class to be loaded using java reflection.
    private String className;

    // name of the this process's initialiser  method, it will executed 
    //after loading the class 
    private String initMethod;

    // process status
    private boolean enabled;

    //Service name	
    private String serviceName;

    //enodB directory to be used by the loading service only.
    private String[] enodBNodes;

    //mmeNode directory names, it will be used by only loading service.
    private String[] mmeNodes;

    // Probe node directory names, it will be used by only loading service.
    private String[] probeLogNodes;

    // RNC node directory names, it will be used by only loading service.
    private String[] rncNodes;
    
    private int processId;

    private boolean isSerialProcessing;

    public boolean isSerialProcessing() {
        return isSerialProcessing;
    }

    public void setSerialProcessing(boolean isSerialProcessing) {
        this.isSerialProcessing = isSerialProcessing;
    }

    private int serviceId;

    private Correlation correlationData;

    private String forwardType;

    private EventListening eventListening;

    private List<Ne> networkElements;

    private String hostName;

    private String hostIp;
    
    private String hazelcastTopic;

    public Correlation getCorrelationData() {
        return correlationData;
    }

    public void setCorrelationData(final Correlation correlationData) {
        this.correlationData = correlationData;
    }

    /**
     * @return service name
     */
    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(final String serviceName) {
        this.serviceName = serviceName;
    }

    /**
     * Any arguments required to initialise the class
     * @return Any {@link java.lang.Object)} type object
     */
    public Object getArguments() {
        return arguments;
    }

    /**Implementation class definition for this process.
     * 
     * @return a {@link java.lang.Class} type object 
     */
    public String getClassDefinition() {
        return className;
    }

    /**sets the arguments (this object contains all required arguments)
     * @param arguments is a  {@link java.lang.Object)} type object
     */
    public void setArguments(final Object arguments) {
        this.arguments = arguments;
    }

    public void setClassDefinition(final String className) {
        this.className = className.trim();
    }

    public String getInitMethod() {
        return initMethod;
    }

    public void setInitMethod(final String initMethod) {
        this.initMethod = initMethod.trim();
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(final boolean enabled) {
        this.enabled = enabled;
    }

    /**This method to access the assigned MME nodes directory names for this loading service
     * @return String [] 
     */
    public String[] getMMENodes() {
        return mmeNodes;
    }

    public void setMMENodes(final String[] mmeNodes) {
        this.mmeNodes = mmeNodes;
    }

    /**This method to access the assigned Probe nodes directory names for this loading service
     * @return String [] 
     */
    public String[] getProbeLogNodes() {
        return probeLogNodes;
    }

    public void setProbeLogNodes(final String[] probeLogNodes) {
        this.probeLogNodes = probeLogNodes;
    }

    public String[] getRNCNodes() {
        return rncNodes;
    }

    public void setRNCNodes(final String[] rncNodes) {
        this.rncNodes = rncNodes;
    }

    public int getProcessId() {
        return processId;
    }

    public void setProcessId(final int processId) {
        this.processId = processId;
    }

    public int getServiceId() {
        return serviceId;
    }

    public void setServiceId(final int serviceId) {
        this.serviceId = serviceId;
    }

    public void setForwarderType(final String forwardType) {
        String forwardTypeTrimmed = forwardType;
        if (forwardType != null) {
            forwardTypeTrimmed = forwardType.trim();
        }
        this.forwardType = forwardTypeTrimmed;

    }

    public String getForwarderType() {
        return forwardType;

    }

    public EventListening getEventListening() {
        return eventListening;
    }

    public void setEventListening(final EventListening eventListening) {
        this.eventListening = eventListening;
    }
    
    public void addNetworkElement(NetworkElement networkElement){
        if (networkElements == null){
            networkElements = new ArrayList<Ne>();
        }
        networkElements.add(new Ne(networkElement));
    }
    
    public List<Ne> getNetworkElementsOfType(NE_TYPE typeOfNetworkElement) {
        List<Ne> networkElementList = new ArrayList<Ne>();
        for (Ne networkElement : networkElements) {
            if(typeOfNetworkElement.getValue() == networkElement.getNeType())
                networkElementList.add(networkElement);
        }
        return networkElementList;
    }

    public List<Ne> getNetworkElements() {
        return networkElements;
    }
    
    public String getHazelcastTopic() {
        return hazelcastTopic;
    }

    public void setHazelcastTopic(String hazelcastTopic) {
        this.hazelcastTopic = hazelcastTopic;
    }

    @Override
    public String toString() {
        return "ServiceConfigBean [arguments=" + arguments + ", className=" + className + ", initMethod=" + initMethod + ", enabled=" + enabled
                + ", serviceName=" + serviceName + ", enodBNodes=" + Arrays.toString(enodBNodes) + ", mmeNodes=" + Arrays.toString(mmeNodes)
                + ", probeLogNodes=" + Arrays.toString(probeLogNodes) + ", rncNodes=" + Arrays.toString(rncNodes) + ", processId=" + processId + ", serviceId="
                + serviceId + ", correlationData=" + correlationData + ", forwardType=" + forwardType + ", eventListening=" + eventListening
                + ", networkElements=" + networkElements + ", hostName=" + hostName + ", hostIp=" + hostIp + ", hazelcastTopic=" + hazelcastTopic + "]";
    }

    public String getHostIp() {
        return hostIp;
    }

    public void setHostIp(final String hostIp) {
        this.hostIp = hostIp;
    }

    public void setHostName(final String hostName) {
        this.hostName = hostName;
    }

    public String getHostName() {
        return hostName;
    }
}
