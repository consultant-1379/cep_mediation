package com.ericsson.cepmediation.autoconfig.model;

/**
 * 
 * @author evikkua
 *
 */
public class Sgsn {
    private String name;

    private String rootPath;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRootPath() {
        return rootPath;
    }

    public void setRootPath(String rootPath) {
        this.rootPath = rootPath;
    }

    @Override
    public String toString() {
        return "Sgsn [name=" + name + ", rootPath=" + rootPath + "]";
    }

}
