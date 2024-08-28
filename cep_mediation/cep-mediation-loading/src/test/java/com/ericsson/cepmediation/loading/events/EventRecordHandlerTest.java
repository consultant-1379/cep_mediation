/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.loading.events;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import static org.mockito.Matchers.*;
import static org.mockito.Mockito.*;

import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import com.ericsson.cepmediation.apeventbeans.bearer_plane.CLASSIFICATION_REPORT;
import com.ericsson.cepmediation.base.apeventbeans.ApEventBean;
import com.ericsson.cepmediation.base.apeventbeans.Asn1Message;
import com.ericsson.cepmediation.base.meta.schema.Event;
import com.ericsson.cepmediation.base.meta.schema.EventHandler;
import com.ericsson.cepmediation.base.meta.schema.Schema;
import com.ericsson.cepmediation.base.meta.schema.SchemaException;
import com.ericsson.cepmediation.base.publishing.Publisher;
import com.ericsson.cepmediation.base.util.constants.EventIdConstants;
import com.ericsson.cepmediation.loading.asn1.Asn1Decoder;

/**
 * @author eemecoy
 *
 */
public class EventRecordHandlerTest {

    private EventRecordHandler eventRecordHandler;

    private EventHeaderRecordHandler mockedEventHeaderRecordHandler;

    private Event event;

    private Schema mockedSchema;

    private Publisher publisher;

    List<Asn1Message> asn1MessageList;

    public List<ApEventBean> expectedApEventBeans;

    private Asn1Decoder mockedAsn1Decoder;

    @Before
    public void setup() {
        asn1MessageList = null;
        expectedApEventBeans = null;
        mockedEventHeaderRecordHandler = mock(EventHeaderRecordHandler.class);
        final Calendar mockCalendar = mock(Calendar.class);
        when(mockedEventHeaderRecordHandler.getTimestamp()).thenReturn(mockCalendar);
        mockedSchema = mock(Schema.class);
        final EventHandler mockedEventHandler = mock(EventHandler.class);
        when(mockedSchema.getEventHandler()).thenReturn(mockedEventHandler);
        final Map<Integer, Event> eventDescriptionsMap = new HashMap<Integer, Event>();
        event = mock(Event.class);
        eventDescriptionsMap.put(EventIdConstants.RRC_MEASUREMENT_REPORT, event);
        eventDescriptionsMap.put(0, event);
        when(mockedEventHandler.getMap()).thenReturn(eventDescriptionsMap);

        when(mockedEventHeaderRecordHandler.getUsedSchema()).thenReturn(mockedSchema);
        publisher = mock(Publisher.class);
        final Publisher[] publishers = new Publisher[] { publisher };
        eventRecordHandler = new EventRecordHandler(mockedEventHeaderRecordHandler, publishers, new HashSet<Integer>(Arrays.asList(0,8,18010)));
        mockedAsn1Decoder = mock(Asn1Decoder.class);
        eventRecordHandler.asn1Decoder = mockedAsn1Decoder;
    }

    @Test
    public void testASN1NotDecodedIfTurnedOff() throws SchemaException {
        when(event.getLength()).thenReturn(10);
        when(mockedEventHeaderRecordHandler.isIdInEvent()).thenReturn(true);
        when(mockedSchema.getName()).thenReturn("bearer_plane");
        when(event.getName()).thenReturn(CLASSIFICATION_REPORT.class.getSimpleName());
        when(event.isDecodeAsn1()).thenReturn(false);

        final byte[] data = new byte[] { 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1 };
        assertThat(eventRecordHandler.process(data), is(true));
        verify(mockedAsn1Decoder, never()).decodeAsn1((ApEventBean) any());
        verify(publisher).publishMessage((ApEventBean) any());
    }

    @Test
    public void testDecodingASN1() throws SchemaException {
        when(event.getLength()).thenReturn(10);
        when(mockedEventHeaderRecordHandler.isIdInEvent()).thenReturn(true);
        when(mockedSchema.getName()).thenReturn("bearer_plane");
        when(event.getName()).thenReturn(CLASSIFICATION_REPORT.class.getSimpleName());
        when(event.isDecodeAsn1()).thenReturn(true);

        final byte[] data = new byte[] { 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1 };
        assertThat(eventRecordHandler.process(data), is(true));
        verify(mockedAsn1Decoder).decodeAsn1((ApEventBean) any());
        verify(publisher).publishMessage((ApEventBean) any());
    }

    @Test
    public void processEventOfVariableLengthDataTooShort() throws SchemaException {
        when(event.isVariableLength()).thenReturn(true);
        when(event.getLength()).thenReturn(10);
        final byte[] data = new byte[] { 0, 1, 0, 1, 0, 1, 0, 1 };
        assertThat(eventRecordHandler.process(data), is(false));
    }

    @Test
    public void processEventOfInVariableLengthDataLengthIsIncorrectIdIsInEvent() throws SchemaException {
        when(event.getLength()).thenReturn(10);
        when(mockedEventHeaderRecordHandler.isIdInEvent()).thenReturn(true);
        final byte[] data = new byte[] { 0, 1, 0, 1, 0, 1, 0, 1 };
        assertThat(eventRecordHandler.process(data), is(false));
    }

    @Test
    public void processEventOfInVariableLengthDataLengthIsIncorrectIdIsNotInEvent() throws SchemaException {
        when(event.getLength()).thenReturn(10);
        final byte[] data = new byte[] { 0, 1, 0, 1, 0, 1, 0, 1 };
        assertThat(eventRecordHandler.process(data), is(false));
    }

    @Test
    public void processEventOfInVariableLengthDataLengthIsCorrectIdIsInEvent() throws SchemaException {
        when(event.getLength()).thenReturn(10);
        when(mockedEventHeaderRecordHandler.isIdInEvent()).thenReturn(true);
        when(mockedSchema.getName()).thenReturn("bearer_plane");
        when(event.getName()).thenReturn(CLASSIFICATION_REPORT.class.getSimpleName());

        final byte[] data = new byte[] { 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1 };
        assertThat(eventRecordHandler.process(data), is(true));
        verify(publisher).publishMessage((ApEventBean) any());
    }

    @Test
    public void processEventOfInVariableLengthDataLengthIsCorrectIdIsNotInEvent() throws SchemaException {
        when(event.getLength()).thenReturn(10);
        when(mockedSchema.getName()).thenReturn("bearer_plane");
        when(event.getName()).thenReturn(CLASSIFICATION_REPORT.class.getSimpleName());

        final byte[] data = new byte[] { 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1 };
        assertThat(eventRecordHandler.process(data), is(true));
        verify(publisher).publishMessage((ApEventBean) any());
    }

    @Test
    public void processEventOfVariableLengthDataLengthIsCorrectIdIsNotInEvent() throws SchemaException {
        when(event.isVariableLength()).thenReturn(true);
        when(event.getLength()).thenReturn(10);
        when(mockedSchema.getName()).thenReturn("bearer_plane");
        when(event.getName()).thenReturn(CLASSIFICATION_REPORT.class.getSimpleName());

        final byte[] data = new byte[] { 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1 };
        assertThat(eventRecordHandler.process(data), is(true));
        verify(publisher).publishMessage((ApEventBean) any());
    }

    @Test
    public void processEventWithUnknownClassReturnsFalse() throws SchemaException {
        when(event.isVariableLength()).thenReturn(true);
        when(event.getLength()).thenReturn(10);
        when(mockedSchema.getName()).thenReturn("unknown_package");
        when(event.getName()).thenReturn("unknown_class");

        final byte[] data = new byte[] { 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1 };
        assertThat(eventRecordHandler.process(data), is(false));
    }

}
