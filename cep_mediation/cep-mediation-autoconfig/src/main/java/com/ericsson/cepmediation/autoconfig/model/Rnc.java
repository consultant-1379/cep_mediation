package com.ericsson.cepmediation.autoconfig.model;

/**
 * 
 * @author evikkua
 *
 */
public class Rnc implements Comparable<Rnc> {
    private String name;

    private int cells;

    private String rootPath;

    private boolean ropOneMin = false;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCells() {
        return cells;
    }

    public void setCells(int cells) {
        this.cells = cells;
    }

    public String getRootPath() {
        return rootPath;
    }

    public void setRootPath(String rootPath) {
        this.rootPath = rootPath;
    }

    @Override
    public String toString() {
        return "Rnc [name=" + name + ", cells=" + cells + ", rootPath=" + rootPath + "]";
    }

    @Override
    public int compareTo(Rnc o) {
        return o.cells - cells;
    }

    public boolean isRopOneMin() {
        return ropOneMin;
    }

    public void setRopOneMin(boolean ropOneMin) {
        this.ropOneMin = ropOneMin;
    }

}
