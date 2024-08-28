package com.ericsson.cepmediation.autoconfig.command;

/**
 * ENUM for commands
 * @author evikkua
 *
 */
public enum COMMAND {
    NETWORK_ELEMENT(1), STANDALONE(2), HAZELCAST(3);

    private int id;

    private COMMAND(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
