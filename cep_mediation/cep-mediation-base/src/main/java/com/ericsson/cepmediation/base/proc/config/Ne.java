package com.ericsson.cepmediation.base.proc.config;

import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.io.Serializable;

import com.ericsson.cepmediation.config.bean.NetworkElement;

public class Ne extends NetworkElement implements Serializable{

    /**
     * for serialization at version controlled serials.
     */
    private static final long serialVersionUID = -6006032846710844222L;
    
    protected java.lang.String label;
    protected java.lang.String collectionMode;
    protected java.lang.String serviceTypes;
    protected java.lang.String memorySize;
    protected java.lang.String memoryHint;
    protected java.lang.String ip;
    protected java.lang.String password;
    protected java.lang.String uname;
    protected java.lang.String directory;
    protected int neType;
    
    public Ne(){
        
    }
    
    public Ne(NetworkElement networkElement) {
        try {
            for(PropertyDescriptor propertyDescriptor : Introspector.getBeanInfo(NetworkElement.class).getPropertyDescriptors()){
                if(propertyDescriptor.getReadMethod() != null && propertyDescriptor.getWriteMethod() != null){
                    propertyDescriptor.getWriteMethod().invoke(this, propertyDescriptor.getReadMethod().invoke(networkElement));
                }
            }    
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    public java.lang.String getLabel() {
        return label;
    }

    public void setLabel(java.lang.String label) {
        this.label = label;
    }

    public java.lang.String getCollectionMode() {
        return collectionMode;
    }

    public void setCollectionMode(java.lang.String collectionMode) {
        this.collectionMode = collectionMode;
    }

    public java.lang.String getServiceTypes() {
        return serviceTypes;
    }

    public void setServiceTypes(java.lang.String serviceTypes) {
        this.serviceTypes = serviceTypes;
    }

    public java.lang.String getMemorySize() {
        return memorySize;
    }

    public void setMemorySize(java.lang.String memorySize) {
        this.memorySize = memorySize;
    }

    public java.lang.String getMemoryHint() {
        return memoryHint;
    }

    public void setMemoryHint(java.lang.String memoryHint) {
        this.memoryHint = memoryHint;
    }

    public java.lang.String getIp() {
        return ip;
    }

    public void setIp(java.lang.String ip) {
        this.ip = ip;
    }

    public java.lang.String getPassword() {
        return password;
    }

    public void setPassword(java.lang.String password) {
        this.password = password;
    }

    public java.lang.String getUname() {
        return uname;
    }

    public void setUname(java.lang.String uname) {
        this.uname = uname;
    }

    public java.lang.String getDirectory() {
        return directory;
    }

    public void setDirectory(java.lang.String directory) {
        this.directory = directory;
    }

    public int getNeType() {
        return neType;
    }

    public void setNeType(int neType) {
        this.neType = neType;
    }
     



}
