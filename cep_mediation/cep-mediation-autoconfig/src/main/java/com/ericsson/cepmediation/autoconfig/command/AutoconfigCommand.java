package com.ericsson.cepmediation.autoconfig.command;

import com.ericsson.cepmediation.autoconfig.model.Config;

/**
 * Common interface of each commands
 * @author evikkua
 *
 */
interface AutoconfigCommand {

    public boolean process(Config config);

}
