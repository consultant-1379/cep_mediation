/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.correlation.enrichment;

/**
 * @author eemecoy
 *
 */
public class Partial extends EnhancedGpehSession {

    private long IMSI_TIMESTAMP;

    public static final String ABSOLUTE_NAME = "correlation.Partial";

    /**
     * @return the iMSI_TIMESTAMP
     */
    public long getIMSI_TIMESTAMP() {
        return IMSI_TIMESTAMP;
    }

    /**
     * @param iMSI_TIMESTAMP the iMSI_TIMESTAMP to set
     */
    public void setIMSI_TIMESTAMP(long iMSI_TIMESTAMP) {
        IMSI_TIMESTAMP = iMSI_TIMESTAMP;
    }

}
