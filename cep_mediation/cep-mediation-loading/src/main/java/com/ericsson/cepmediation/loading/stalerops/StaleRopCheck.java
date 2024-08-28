/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.loading.stalerops;

import java.text.ParseException;
import java.util.Calendar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.cepmediation.base.properties.CepMediationProperties;
import com.ericsson.cepmediation.base.properties.CepMediationProperty;
import com.ericsson.cepmediation.base.util.NodeFileNameUtils;

/**
 * @author eemecoy
 *
 */
public class StaleRopCheck {

    private static final Logger logger = LoggerFactory.getLogger(StaleRopCheck.class);

    private static final int FIFTEEN_MINUTES = 15 * 60 * 1000;

    private long period;

    public StaleRopCheck() {
        long ropLifetime = CepMediationProperties.getIntProperty(CepMediationProperty.BACKLOG_RECOVERY_INTERVAL);
        // convert to millis
        period = ropLifetime * 60 * 1000;
        // floor to fiften mins which is the max rop duration 
        period = (period / FIFTEEN_MINUTES) * FIFTEEN_MINUTES;
    }

    /**
     * Check if a ROP file is considered stale ie older than a configured time limit
     * 
     * @param ropFile name of rop file (short name)
     */
    public boolean isStaleRopFile(String ropFile, long currTime) {
        try {
            Calendar timeOnFile = NodeFileNameUtils.nameToCalendar(ropFile);
            return isStaleRop(timeOnFile.getTimeInMillis(), currTime);
        } catch (ParseException e) {
            e.printStackTrace();
            logger.warn("Could not parse rop" + ropFile, e);
            return false;
        }
    }

    /**
     * Check if a timestamp is considered stale ie older than a configured time limit
     */
    public boolean isStaleRop(long ropTimestamp, long currTime) {
        currTime = (currTime / FIFTEEN_MINUTES) * FIFTEEN_MINUTES;
        long threshold = currTime - period;
        return ropTimestamp < threshold;
    }
}
