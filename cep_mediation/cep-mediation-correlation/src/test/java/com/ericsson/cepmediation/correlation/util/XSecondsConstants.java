/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.correlation.util;

/**
 * @author eemecoy
 *
 */
public class XSecondsConstants {

    private static int rrcMeasReportRetentionPeriodInSeconds;

    /**
     * @param rrcMeasReportRetentionPeriodInSeconds the rrcMeasReportRetentionPeriodInSeconds to set
     */
    public static void setRrcMeasReportRetentionPeriodInSeconds(final int rrcMeasReportRetentionPeriodInSeconds) {
        System.out.println("Setting the RRC Measurement Report Retention Period to "
                + rrcMeasReportRetentionPeriodInSeconds + " seconds");
        XSecondsConstants.rrcMeasReportRetentionPeriodInSeconds = rrcMeasReportRetentionPeriodInSeconds;
    }

    public static int getRRCMeasReportRetentionPeriodInSeconds() {
        return rrcMeasReportRetentionPeriodInSeconds;
    }

}
