/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.correlation.util.esperwindows;

import java.io.Serializable;

import com.ericsson.cepmediation.apeventbeans.gpeh.GpehBase;
import com.ericsson.cepmediation.test.common.DateTimeUtilities;

/**
 * @author eemecoy
 *
 */
public class EnhancedEvent implements Serializable {

    private String imsi;

    private GpehBase event;

    public EnhancedEvent() {

    }

    public EnhancedEvent(final String imsi, final GpehBase RRC_MEASUREMENT_REPORT) {
        this.setImsi(imsi);
        this.setEvent(RRC_MEASUREMENT_REPORT);
    }

    /**
     * @return the imsi
     */
    public String getImsi() {
        return imsi;
    }

    /**
     * @param imsi the imsi to set
     */
    public void setImsi(final String imsi) {
        this.imsi = imsi;
    }

    /**
     * @return the event
     */
    public GpehBase getEvent() {
        return event;
    }

    /**
     * @param rRC_MEASUREMENT_REPORT the event to set
     */
    public void setEvent(final GpehBase rRC_MEASUREMENT_REPORT) {
        this.event = rRC_MEASUREMENT_REPORT;
    }

    @Override
    public String toString() {
        return "IMSI: " + imsi + ", event " + event + " at " + DateTimeUtilities.convertTimeStampToDateString(event.getTimestamp());
    }

}
