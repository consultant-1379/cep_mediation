/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.server.management.status.startupstatus;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.cepmediation.base.status.StartStopStatusUpdate;
import com.ericsson.cepmediation.base.status.StartStopStatusUpdateHelper;

/**
 * @author eemecoy
 *
 */
public class SystemMonitor implements Monitor {

    private final Logger logger = LoggerFactory.getLogger(getClass());
    
    private static final String SYSTEM_USER_NAME = System.getProperty("user.name");
    private static final String SEPERATOR = " - ";
    private static final String STATUS_UPDATE = "Status Update: ";
    

    /* (non-Javadoc)
     * @see com.ericsson.cepmediation.management.status.Monitor#statusUpdate(com.ericsson.cepmediation.management.status.StatusUpdate)
     */
    @Override
    public void statusUpdate(final StartStopStatusUpdate statusUpdate) {
        String updateMessage = STATUS_UPDATE + StartStopStatusUpdateHelper.toDescription(statusUpdate) ;
        if(SYSTEM_USER_NAME != null)
            updateMessage = SYSTEM_USER_NAME + SEPERATOR + updateMessage;
        logger.info(updateMessage);
    }

}
