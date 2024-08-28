package com.ericsson.cepmediation.correlation.radio.flush;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

import org.junit.Before;
import org.junit.Test;

import com.ericsson.cepmediation.apeventbeans.correlation.GPEH_SESSION;
import com.ericsson.cepmediation.base.apeventbeans.ApEventBean;
import com.ericsson.cepmediation.base.semaphor.ProcessSemaphore;
import com.ericsson.cepmediation.correlation.precorrelation.esperservices.impl.DefaultEsperService;
import com.ericsson.cepmediation.correlation.radio.RadioCorrelationBase;
import com.ericsson.cepmediation.correlation.util.EsperConfigurationForTest;
import com.ericsson.cepmediation.correlation.util.parser.PlainFileParser;
import com.espertech.esper.client.scopetest.SupportUpdateListener;

// This class uses the original(as opposed to stubbed) version of DefaultEsperService and RopProcessor.
public class SessionFlush extends RadioCorrelationBase {
    private static final String DATA_LABEL = "label";

    private static int esperId = 0;

    private DefaultEsperService service;

    @Before
    public void setup() throws Exception {
        service = new DefaultEsperService(DATA_LABEL, new EsperConfigurationForTest().getEsperConfiguration(), "test service " + esperId++, "FIVE_MINUTES");
        service.deploy("esper/_rc.epl");
        sessionListener = new SupportUpdateListener();
        service.attachListenerToStatements(sessionListener, new String[] { "Session-Enrichment" });
    }

    @Test
    public void flushOneSession() throws Exception {
        processFile("flush/flushOneSession_1.txt");
        Thread.sleep(5000);

        List<GPEH_SESSION> sessions = getSessionsCreated();
        assertThat(sessions.size(), is(0));

        processFile("flush/flushOneSession_2.txt");
        Thread.sleep(5000);

        sessions = getSessionsCreated();
        assertThat(sessions.size(), is(1));
    }

    @Test
    public void flushTwoSession() throws Exception {
        processFile("flush/flushTwoSession_1.txt");
        Thread.sleep(5000);

        List<GPEH_SESSION> sessions = getSessionsCreated();
        assertThat(sessions.size(), is(0));

        processFile("flush/flushTwoSession_2.txt");
        Thread.sleep(5000);

        sessions = getSessionsCreated();
        assertThat(sessions.size(), is(2));
    }

    @Override
    protected void processFile(final String file) {
        final BlockingQueue<List<ApEventBean>> eventsQueue = new LinkedBlockingQueue<List<ApEventBean>>();

        final State state = new State();

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(10000);
                    ProcessSemaphore.getInstance().await(DATA_LABEL);
                    List<ApEventBean> parsed = new PlainFileParser(file).parse();
                    eventsQueue.add(parsed);
                    //allow 5 secs for the correlation to start
                    Thread.sleep(5000);
                    ProcessSemaphore.getInstance().await(DATA_LABEL);
                    assertTrue(state.correlationFinished);
                    state.paraserAwakened = true;
                } catch (final Exception e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();

        List<ApEventBean> events = null;
        try {
            events = eventsQueue.take();
        } catch (InterruptedException e) {
            fail("Error getting events: " + e.getMessage());
        }
        Collections.sort(events);

        ProcessSemaphore.getInstance().consumerStarted(DATA_LABEL);
        try {
            assertFalse(state.paraserAwakened);
            service.onEvents(events);
            assertFalse(state.paraserAwakened);
        } finally {
            state.correlationFinished = true;
            ProcessSemaphore.getInstance().consumerFinished(DATA_LABEL);
        }

        try {
            // allow some time for parser thread to continue
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            fail("Interrupted: " + e.getMessage());
        }
        assertTrue(state.paraserAwakened);
    }

    private static class State {
        boolean correlationFinished;

        boolean paraserAwakened;
    }
}
