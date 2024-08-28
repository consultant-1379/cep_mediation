package com.ericsson.cepmediation.autoconfig.model;

import java.util.List;

public class RncRopList {

    List<Rnc> rncs;

    int cells;

    int jvms;

    float memory;

    public List<Rnc> getRncs() {
        return rncs;
    }

    public void setRncs(List<Rnc> rncs) {
        this.rncs = rncs;
    }

    public int getCells() {
        return cells;
    }

    public void setCells(int cells) {
        this.cells = cells;
    }

    public int getJvms() {
        return jvms;
    }

    public void setJvms(int jvms) {
        this.jvms = jvms;
    }

    public float getMemory() {
        return memory;
    }

    public void setMemory(float memory) {
        this.memory = memory;
    }

}
