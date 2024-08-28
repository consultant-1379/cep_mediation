package com.ericsson.cepmediation.hyperic;

import java.util.Arrays;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hyperic.hq.product.ServerControlPlugin;

import com.ericsson.cepmediation.base.properties.CepMediationProperties;
import com.ericsson.cepmediation.base.properties.CepMediationProperty;

/**
 * 
 * This class implements hyperic control plugin functionality  that is 
 * used by hypric server to control server resources     
 *  
 * @category Management
 * @since 08/12/2011
 * 
 * 
 * @author eurorad
 *
 */
public class EAServerControl extends ServerControlPlugin {

    Log log = LogFactory.getLog(this.getClass().getName());

    // List of commands that the shell script takes in
    private static final String[] actions = { "start", "stop", "restart" };

    private static final List<String> commands = Arrays.asList(actions);

    @Override
    public List<String> getActions() {
        return commands;
    }

    public void start() {
        log.debug("-------------->start()");
        execute("start");
    }

    public void stop() {
        log.debug("-------------->stop()");
        execute("stop");
    }

    public void restart() {
        log.debug("-------------->restart()");
        execute("stop");
        execute("start");
    }

    // Sends the option selected from the drop down box in the control page in Hyperic and sends it to the shell script
    private void execute(final String cmd) {
        log.debug("-------------->config = " + config);
        setControlProgram(CepMediationProperties.getProperty(CepMediationProperty.INSTALL_DIR, "")
                + "bin/hypericControl");
        super.doCommand(cmd);

    }
}
