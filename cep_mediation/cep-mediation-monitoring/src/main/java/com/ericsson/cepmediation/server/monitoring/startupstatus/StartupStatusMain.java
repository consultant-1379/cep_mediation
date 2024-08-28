/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.server.monitoring.startupstatus;

import java.io.File;
import java.io.FileNotFoundException;

/**
 * @author eemecoy
 *
 */
public abstract class StartupStatusMain {

    public static void main(final String[] args) throws FileNotFoundException, MissingPropertyException {
        File logFile = null;
        if(args.length == 1) {
            logFile = new File(args[0]);
            if(!logFile.exists()) {
                throw new FileNotFoundException(logFile.getAbsolutePath());
            }
        }
        new CheckStartupStatus().checkStartupStatus(logFile);
    }

}
