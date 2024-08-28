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
package com.ericsson.cepmediation.server.management.helper;

import java.rmi.RemoteException;
import java.util.TimerTask;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.cepmediation.server.management.AgentData;

/**
 * This class is respon
 * @author eachsaj
 *
 */
public class HBMonitor extends TimerTask {
    private static final Logger logger = LoggerFactory.getLogger(HBMonitor.class);

    private final AgentData data;

    public HBMonitor(final AgentData data) {
        this.data = data;
    }

    @Override
    public void run() {
        try {
            if (data.getServer().isAlive()) {
                if (logger.isDebugEnabled()) {
                    logger.debug("Server " + data.getHost() + " is alive");
                }
                data.setReachable(true);
            } else {
                logger.warn("Server " + data.getHost() + " is not reachable ");
                data.disableMonitor();
                data.setReachable(false);
            }
        } catch (final RemoteException e) {
            logger.warn("Server " + data.getHost() + " is not reachable ");
            data.disableMonitor();
            data.setReachable(false);
        }
    }

}
