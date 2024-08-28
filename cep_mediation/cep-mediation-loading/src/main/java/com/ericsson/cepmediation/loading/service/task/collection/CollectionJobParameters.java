/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.loading.service.task.collection;

import com.ericsson.cepmediation.base.proc.config.ServiceConfigBean;
import com.ericsson.cepmediation.base.util.ConfigData;
import com.ericsson.cepmediation.base.util.FileServerData;
import com.ericsson.cepmediation.loading.filecollection.CollectionMode;
import com.ericsson.cepmediation.loading.service.InputType;

/**
 * @author  eemecoy
 */
public class CollectionJobParameters {

    private ConfigData config;

    private ServiceConfigBean serviceData;

    private FileServerData fileServerData;

    private String jobLabel;

    private boolean shouldRenameCopiedFiles;

    private boolean shouldDeleteAdditionalFiles;

    private InputType inputType;

    private CollectionMode collectionMode;

    private boolean isDeleteRemoteFilesAfterCopy;

    private String searchPattern;
    
    private String pathToFilesCopiedLocally;

    public ConfigData getConfig() {
        return config;
    }

    public void setConfig(ConfigData config) {
        this.config = config;
    }

    public ServiceConfigBean getServiceData() {
        return serviceData;
    }

    public void setServiceData(ServiceConfigBean serviceData) {
        this.serviceData = serviceData;
    }

    public FileServerData getFileServerData() {
        return fileServerData;
    }

    public void setFileServerData(FileServerData fileServerData) {
        this.fileServerData = fileServerData;
    }

    public String getJobLabel() {
        return jobLabel;
    }

    public void setJobLabel(String jobLabel) {
        this.jobLabel = jobLabel;
    }

    public boolean isShouldRenameCopiedFiles() {
        return shouldRenameCopiedFiles;
    }

    public void setShouldRenameCopiedFiles(boolean shouldRenameCopiedFiles) {
        this.shouldRenameCopiedFiles = shouldRenameCopiedFiles;
    }

    public boolean isShouldDeleteAdditionalFiles() {
        return shouldDeleteAdditionalFiles;
    }

    public void setShouldDeleteAdditionalFiles(boolean shouldDeleteAdditionalFiles) {
        this.shouldDeleteAdditionalFiles = shouldDeleteAdditionalFiles;
    }

    public InputType getInputType() {
        return inputType;
    }

    public void setInputType(InputType inputType) {
        this.inputType = inputType;
    }

    public void setCollectionMode(CollectionMode collectionMode) {
        this.collectionMode = collectionMode;
    }

    public CollectionMode getCollectionMode() {
        return collectionMode;
    }

    public void setDeleteRemoteFilesAfterCopy(boolean shouldDeleteRemoteFilesAfterCopy) {
        this.isDeleteRemoteFilesAfterCopy = shouldDeleteRemoteFilesAfterCopy;
    }

    public boolean isDeleteRemoteFilesAfterCopy() {
        return isDeleteRemoteFilesAfterCopy;
    }

    public String getSearchPattern() {
        return searchPattern;
    }

    public void setSearchPattern(String searchPattern) {
        this.searchPattern = searchPattern;
    }
    
    public String getPathToFilesCopiedLocally() {
        return pathToFilesCopiedLocally;
    }

    public void setPathToFilesCopiedLocally(String pathToFilesCopiedLocally) {
        this.pathToFilesCopiedLocally = pathToFilesCopiedLocally;
    }

    @Override
    public String toString() {
        return "CollectionJobParameters [config=" + config + ", serviceData=" + serviceData + ", fileServerData=" + fileServerData + ", jobLabel=" + jobLabel
                + ", shouldRenameCopiedFiles=" + shouldRenameCopiedFiles + ", shouldDeleteAdditionalFiles=" + shouldDeleteAdditionalFiles + ", inputType="
                + inputType + ", collectionMode=" + collectionMode + ", isDeleteRemoteFilesAfterCopy=" + isDeleteRemoteFilesAfterCopy + ", searchPattern="
                + searchPattern + ", pathToFilesCopiedLocally=" + pathToFilesCopiedLocally + "]";
    }
}