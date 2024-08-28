/*------------------------------------------------------------------------------
 *******************************************************************************
 * COPYRIGHT Ericsson 2015
 *
 * The copyright to the computer program(s) herein is the property of
 * Ericsson Inc. The programs may be used and/or copied only with written
 * permission from Ericsson Inc. or in accordance with the terms and
 * conditions stipulated in the agreement/contract under which the
 * program(s) have been supplied.
 *******************************************************************************
 *----------------------------------------------------------------------------*/

package com.ericsson.cepmediation.correlation.precorrelation.esperservices.impl;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Matchers.anyObject;
import static org.mockito.Matchers.argThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.List;
import java.util.TimeZone;

import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.junit.Before;
import org.junit.Test;

import com.ericsson.cepmediation.apeventbeans.gpeh.GpehBase;
import com.ericsson.cepmediation.base.apeventbeans.ApEventBean;
import com.ericsson.cepmediation.correlation.enrichment.InternalNormalReleaseSetValue;
import com.ericsson.cepmediation.correlation.enrichment.SessionEndEvent;
import com.ericsson.cepmediation.correlation.enrichment.SessionFlushEvent;
import com.ericsson.cepmediation.correlation.lookup.LookupService;
import com.ericsson.cepmediation.correlation.stubs.DefaultLookupService;
import com.ericsson.cepmediation.correlation.util.parser.PlainFileParser;
import com.ericsson.cepmediation.loading.events.Asn1MessageSplitter;
import com.espertech.esper.client.EPRuntime;
import com.espertech.esper.core.service.EPRuntimeImpl;

public class RopProcessorTest {
    private static final int Sleep_Time = 1000;

    private static final String PROCESSOR = "processor";

    private static final String DATA_LABEL = "dataLabel";

    private static final String RADIO_SESSION_M_CORRELATION = "3GRadioSessionMCorrelation_";

    private static final String RADIO_SESSION_VC_CORRELATION = "3GRadioSessionVCCorrelation_";

    private static final String RADIO_SESSION_CORRELATION = "3GRadioSessionCorrelation_";

    private static final String FIVE_MINUTES = "FIVE_MINUTES";

    private final class SessionEndMatcher extends BaseMatcher<ApEventBean> {
        private final long date;

        private final DateFormat df = new SimpleDateFormat(
                "yyyy-MM-dd HH:mm:ss.SSS");

        SessionEndMatcher(final String dateStr) throws ParseException {
            df.setTimeZone(TimeZone.getTimeZone("UTC"));
            date = df.parse(dateStr).getTime();
        }

        @Override
        public boolean matches(final Object o) {
            if (o instanceof SessionEndEvent) {
                long other = ((SessionEndEvent) o).getTimestamp();
                return other == date;
            }

            System.out.println(o.getClass().getName());
            return false;
        }

        @Override
        public void describeTo(final Description arg0) {
        }
    }

    private final class SessionFlushMatcher extends BaseMatcher<ApEventBean> {
        @Override
        public boolean matches(final Object o) {
            return (o instanceof SessionFlushEvent);
        }

        @Override
        public void describeTo(final Description arg0) {
        }
    }

    private final class GpehEventMatcher extends BaseMatcher<ApEventBean> {

        @Override
        public boolean matches(final Object o) {
            return (o instanceof GpehBase);
        }

        @Override
        public void describeTo(final Description arg0) {
        }
    }

    private RopProcessor instance;

    private EPRuntime mockRuntime;

    @Before
    public void setUp() {
        mockRuntime = mock(EPRuntimeImpl.class);
        instance = new RopProcessor(DATA_LABEL, mockRuntime, PROCESSOR,
                FIVE_MINUTES);
    }

    @Test
    public void shouldNotCarryOver() throws Exception {
        final List<ApEventBean> events = new PlainFileParser(
                "esperservices/rop_processor_dont_carry_over.txt").parse();
        final ApEventBean first = events.get(0);
        final ApEventBean last = events.get(events.size() - 1);
        Collections.sort(events);
        instance.process(events);
        Thread.sleep(Sleep_Time);

        verify(mockRuntime, times(11)).sendEvent(anyObject());
        verify(mockRuntime).sendEvent(first);
        verify(mockRuntime).sendEvent(last);
        System.out.println("shouldNotCarryOver end");
    }

    @Test
    public void shouldCarryOverAllButOne() throws Exception {
        final List<ApEventBean> events = new PlainFileParser(
                "esperservices/rop_processor_carry_over_all_but_one.txt")
                .parse();
        final ApEventBean first = events.get(0);
        Collections.sort(events);
        instance.process(events);
        Thread.sleep(Sleep_Time);

        verify(mockRuntime, times(1)).sendEvent(first);
    }

    @Test
    public void shouldCarryOverOnlyOne() throws Exception {
        final List<ApEventBean> events = new PlainFileParser(
                "esperservices/rop_processor_carry_over_only_one.txt").parse();
        final ApEventBean first = events.get(0);
        final ApEventBean last = events.get(events.size() - 2);
        Collections.sort(events);
        instance.process(events);
        Thread.sleep(Sleep_Time);

        verify(mockRuntime, times(11)).sendEvent(anyObject());
        verify(mockRuntime).sendEvent(first);
        verify(mockRuntime).sendEvent(last);
    }

    @Test
    public void shouldOverlap() throws Exception {
        final List<ApEventBean> events = new PlainFileParser(
                "esperservices/rop_processor_dont_carry_over.txt").parse();
        Collections.sort(events);
        instance.process(events);
        Thread.sleep(Sleep_Time);

        final List<ApEventBean> secondRop = new PlainFileParser(
                "esperservices/rop_processor_overlap.txt").parse();
        Collections.sort(secondRop);
        instance.process(secondRop);
        Thread.sleep(Sleep_Time);

        verify(mockRuntime, times(16)).sendEvent(anyObject());
        for (final ApEventBean e : events) {
            verify(mockRuntime).sendEvent(e);
        }

        for (int i = 4; i > -1; i--) {
            verify(mockRuntime).sendEvent(secondRop.get(i));
        }
    }

    @Test
    public void shouldSendEndEvent() throws Exception {
        final List<ApEventBean> events = new PlainFileParser(
                "esperservices/rop_processor_session_end.txt").parse();
        Collections.sort(events);
        instance.process(events);
        Thread.sleep(Sleep_Time);

        verify(mockRuntime, times(1)).sendEvent(events.get(0));
        verify(mockRuntime, times(1)).sendEvent(events.get(1));
        verify(mockRuntime, times(1)).sendEvent(
                argThat(new SessionEndMatcher("2012-05-17 13:05:00.001")));
    }

    @Test
    public void shouldSendEndEventWithCarryOver() throws Exception {
        final List<ApEventBean> events = new PlainFileParser(
                "esperservices/rop_processor_carry_over_session_end_1.txt")
                .parse();
        Collections.sort(events);
        instance.process(events);
        Thread.sleep(Sleep_Time);

        verify(mockRuntime, times(1)).sendEvent(
                argThat(new SessionEndMatcher("2012-05-17 13:05:00.001")));
        verify(mockRuntime, times(1)).sendEvent(
                argThat(new SessionEndMatcher("2012-05-17 13:10:00.001")));

        final List<ApEventBean> secondRop = new PlainFileParser(
                "esperservices/rop_processor_carry_over_session_end_2.txt")
                .parse();
        Collections.sort(secondRop);
        instance.process(secondRop);
        Thread.sleep(Sleep_Time);
        verify(mockRuntime, times(1)).sendEvent(
                argThat(new SessionEndMatcher("2012-05-17 13:15:00.001")));
    }

    @Test
    public void shouldSendFlushEvent() throws Exception {
        final List<ApEventBean> events = new PlainFileParser(
                "esperservices/rop_processor_flush_1.txt").parse();
        Collections.sort(events);
        instance.process(events);
        Thread.sleep(Sleep_Time);

        verify(mockRuntime, times(1))
                .sendEvent(argThat(new GpehEventMatcher()));

        final List<ApEventBean> secondRop = new PlainFileParser(
                "esperservices/rop_processor_flush_2.txt").parse();
        Collections.sort(secondRop);
        instance.process(secondRop);
        Thread.sleep(Sleep_Time);

        verify(mockRuntime, times(1)).sendEvent(
                argThat(new SessionEndMatcher("2012-05-17 13:05:00.001")));
        verify(mockRuntime, times(12)).sendEvent(
                argThat(new GpehEventMatcher()));
        verify(mockRuntime, times(1)).sendEvent(
                argThat(new SessionFlushMatcher()));
    }

    @Test
    public void sendASN1_MessageFor3GRadioSessionMCorrelation()
            throws Exception {
        RopProcessor instance1 = new RopProcessor(DATA_LABEL, mockRuntime,
                RADIO_SESSION_M_CORRELATION, FIVE_MINUTES);
        final List<ApEventBean> events = new PlainFileParser(
                "visitedcells/four_cells_one_session_rrc_meas.txt").parse();

        for (ApEventBean e : events) {
            List<Object> splitEvents = Asn1MessageSplitter.splitEvent(e);
            e.setMeasurements(splitEvents);
        }
        Thread.sleep(Sleep_Time);
        instance1.process(events);
        Thread.sleep(Sleep_Time);
        assertThat(events.size(), is(11));

    }

    @Test
    public void senddummyEventFor3GRadioSessionMCorrelation() throws Exception {
        RopProcessor instance1 = new RopProcessor(DATA_LABEL, mockRuntime,
                RADIO_SESSION_M_CORRELATION, FIVE_MINUTES);
        int dummyEventCount = 1;
        final List<ApEventBean> events = new PlainFileParser(
                "visitedcells/four_cells_one_session_rrc_meas.txt").parse();
        for (ApEventBean e : events) {
            if (RADIO_SESSION_M_CORRELATION
                    .contains(RADIO_SESSION_M_CORRELATION)
                    && dummyEventCount == 1) {
                dummyEventCount++;
                mockRuntime.sendEvent(new InternalNormalReleaseSetValue(
                        DATA_LABEL));

            }
        }
        Thread.sleep(Sleep_Time);
        instance1.process(events);
        assertThat(dummyEventCount, is(2));
        Thread.sleep(Sleep_Time);
        assertThat(events.size(), is(11));

    }

    @Test
    public void sendASN1_MessageFor3GRadioSessionVCCorrelation()
            throws Exception {
        StubbedRopProcessor instance1 = new StubbedRopProcessor(DATA_LABEL,
                mockRuntime, RADIO_SESSION_VC_CORRELATION, FIVE_MINUTES);
        final List<ApEventBean> events = new PlainFileParser(
                "visitedcells/four_cells_one_session_rrc_meas.txt").parse();

        for (ApEventBean e : events) {
            List<Object> splitEvents = Asn1MessageSplitter.splitEvent(e);
            e.setMeasurements(splitEvents);
        }
        Thread.sleep(Sleep_Time);
        instance1.process(events);
        Thread.sleep(Sleep_Time);
        assertThat(events.size(), is(11));

    }

    @Test
    public void sendASN1_MessageFor3GRadioSessionCorrelation() throws Exception {
        StubbedRopProcessor instance1 = new StubbedRopProcessor(DATA_LABEL,
                mockRuntime, RADIO_SESSION_CORRELATION, FIVE_MINUTES);
        final List<ApEventBean> events = new PlainFileParser(
                "visitedcells/four_cells_one_session_rrc_meas.txt").parse();

        for (ApEventBean e : events) {
            List<Object> splitEvents = Asn1MessageSplitter.splitEvent(e);
            e.setMeasurements(splitEvents);
        }
        Thread.sleep(Sleep_Time);
        instance1.process(events);
        Thread.sleep(Sleep_Time);
        assertThat(events.size(), is(11));

    }
}

class StubbedRopProcessor extends RopProcessor {
    StubbedRopProcessor(String dataLabel, EPRuntime runtime, String name,
            String sessionDuration) {
        super(dataLabel, runtime, name, sessionDuration);
    }

    @Override
    protected LookupService getDefaultLookupInstance() {
        return (DefaultLookupService.getInstance());
    }
}
