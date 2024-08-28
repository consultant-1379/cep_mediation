/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.server.management.status.startupstatus;

/**
 * @author eemecoy
 *
 */
public abstract class MonitorCentre {

    private static Monitor monitor;

    public static Monitor getMonitor() {
        if (monitor == null) {
            monitor = new SystemMonitor();
        }
        return monitor;
    }

}
