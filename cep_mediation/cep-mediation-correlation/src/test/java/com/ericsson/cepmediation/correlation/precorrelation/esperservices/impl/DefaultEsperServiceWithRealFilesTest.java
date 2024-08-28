/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.correlation.precorrelation.esperservices.impl;

import java.util.List;

import org.junit.Before;
import org.junit.Ignore;

import com.ericsson.cepmediation.base.apeventbeans.ApEventBean;
import com.ericsson.cepmediation.correlation.util.FileParser;
import com.ericsson.cepmediation.loading.exception.ParsingFailedException;
import com.espertech.esper.client.scopetest.SupportUpdateListener;

/**
 * @author eemecoy
 *
 */
@Ignore("requires real files to run")
public class DefaultEsperServiceWithRealFilesTest {

    private DefaultEsperService esperService;

    private SupportUpdateListener listener;

    @Before
    public void setup() {
        esperService = new DefaultEsperService("dummy", new EsperConfiguration().getEsperConfiguration(), "RadioCorrelation.epl", "FIVE_MINUTES");
        listener = new SupportUpdateListener();
        esperService.deploy("esper/RadioCorrelation.epl");
        esperService.attachListenerToStatements(listener, new String[] { "Session-Enrichment" });
    }

    public void testParsingAndCorrelatingFiles() throws ParsingFailedException, InterruptedException {
        final List<ApEventBean> events = new FileParser().parseGPEHRopFiles();
        esperService.onEvents(events);
        Thread.sleep(100 * 60 * 1000); //sleep to allow all messages to be pushed to esper - not possible to wait on number
        //of sessions produced - tried this, and events still being pushed to esper after correct number of sessions created, 
        //guess sessions might not be finished
    }

}
