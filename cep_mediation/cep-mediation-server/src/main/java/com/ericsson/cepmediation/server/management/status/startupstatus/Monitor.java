/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.server.management.status.startupstatus;

import com.ericsson.cepmediation.base.status.StartStopStatusUpdate;

/**
 * @author eemecoy
 *
 */
public interface Monitor {

    void statusUpdate(StartStopStatusUpdate statusUpdate);

}
