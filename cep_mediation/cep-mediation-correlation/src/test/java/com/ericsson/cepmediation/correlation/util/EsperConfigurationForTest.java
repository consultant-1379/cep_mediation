/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.correlation.util;

import com.ericsson.cepmediation.correlation.precorrelation.esperservices.impl.EsperConfiguration;
import com.ericsson.cepmediation.correlation.util.esperwindows.UpdateStream;
import com.espertech.esper.client.Configuration;

/**
 * @author eemecoy
 *
 */
public class EsperConfigurationForTest extends EsperConfiguration {

    private static boolean prioritized = true;

    @Override
    public Configuration getEsperConfiguration() {
        Configuration esperConfiguration = super.getEsperConfiguration();
        addExtraConfigurationForTest(esperConfiguration);
        return esperConfiguration;
    }

    @Override
    protected void addUtilImport(Configuration configuration) {
        configuration.addImport("com.ericsson.cepmediation.correlation.stubs.Util");
    }

    private void addExtraConfigurationForTest(Configuration configuration) {
        configuration.addVariable("X", "int", XSecondsConstants.getRRCMeasReportRetentionPeriodInSeconds(), true);
        configuration.addVariable("TIMER_INTERVAL_CHECK_EXPIRY", "int", "1", true); // 1 second
        configuration.addVariable("EXPIRY_TIME", "int", "3000", true); // 3 seconds in milliseconds
        configuration.addVariable("TIMER_INTERVAL_PRODUCE_OUTPUT", "int", "1", true); // 1 second
        configuration.getEngineDefaults().getViewResources().setShareViews(false);
        addExtraImportsForTest(configuration);
        setPrioritized(configuration);
        configuration.addEventType("debugging.UpdateStream", UpdateStream.class);
    }

    private void setPrioritized(Configuration configuration) {
        System.out.println("Setting prioritized on engine to " + prioritized);
        configuration.getEngineDefaults().getExecution().setPrioritized(prioritized);
    }

    private void addExtraImportsForTest(Configuration configuration) {
        configuration.addImport(com.ericsson.cepmediation.correlation.stubs.DefaultLookupService.class);
    }

    /**
     * Temporary workaround until tests fixed, some tests failing if this is set to true, which it is in production code
     */
    public static void setPrioritized(boolean b) {
        prioritized = b;
    }

}
