package com.ericsson.cepmediation.autoconfig.command;

import com.ericsson.cepmediation.autoconfig.model.Config;

/**
 * This class is responsible to invoke the corresponding process methods based on command input
 * @author evikkua
 *
 */

public class CommandDispatcher {
    /**
     * 
     * @param command
     * @param config
     * @return
     */

    public boolean process(COMMAND command, Config config) {
        switch (command) {
        case NETWORK_ELEMENT:
            return new GenerateCommand().process(config);
        case STANDALONE:
            return new StandaloneCommand().process(config);
        case HAZELCAST:
            return new HazelcastCommand().process(config);
        default:
            throw new IllegalArgumentException("Command not supported: " + command);
        }
    }
}
