/*------------------------------------------------------------------------------
 *******************************************************************************
 * COPYRIGHT Ericsson 2013
 *
 * The copyright to the computer program(s) herein is the property of
 * Ericsson Inc. The programs may be used and/or copied only with written
 * permission from Ericsson Inc. or in accordance with the terms and
 * conditions stipulated in the agreement/contract under which the
 * program(s) have been supplied.
 *******************************************************************************
 *----------------------------------------------------------------------------*/

package com.ericsson.cepmediation.loading.events;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

import com.ericsson.cepmediation.base.apeventbeans.ApEventBean;
import com.ericsson.cepmediation.base.meta.admin.MappedEvent;
import com.ericsson.cepmediation.base.meta.schema.Event;
import com.ericsson.cepmediation.base.meta.schema.EventParameter;
import com.ericsson.cepmediation.base.meta.schema.Schema;
import com.ericsson.cepmediation.base.meta.schema.SchemaException;
import com.ericsson.cepmediation.base.publishing.Publisher;


public class EventRecordHandlerBitUnpackingTest {

    Event mockedEventSchema;

    Schema mockedSchema;

    private EventHeaderRecordHandler headerRecordHandler;

    @Before
    public void setup() {
        mockedEventSchema = mock(Event.class);
        mockedSchema = mock(Schema.class);
        headerRecordHandler = mock(EventHeaderRecordHandler.class);
        when(headerRecordHandler.getTimestamp()).thenReturn(Calendar.getInstance());
        when(headerRecordHandler.getIdStartPos()).thenReturn(52);
        when(headerRecordHandler.getIdLength()).thenReturn(11);
        when(headerRecordHandler.isIdInEvent()).thenReturn(true);
        when(headerRecordHandler.getUTCStartOfDay()).thenReturn(1337126400000L);
        when(headerRecordHandler.getSubNetworkName()).thenReturn("RNC09");
        when(headerRecordHandler.getNeLogicalName()).thenReturn("unknown");
        when(headerRecordHandler.getFileInformationVersion()).thenReturn("CF2");

    }

    @Test
    public void testDecodingAndCreating_RRC_MEASUREMENT_REPORT() throws SchemaException {
        setUpMockedEventSchema();
         String expectedEvent = "2012-05-16 16:44:59.634,SN=RNC09,NE=unknown,RRC_MEASUREMENT_REPORT,VERSION=CF2,SCANNER_ID=4,"
                + "TIMESTAMP_HOUR=16,TIMESTAMP_MINUTE=44,TIMESTAMP_SECOND=59,TIMESTAMP_MILLISEC=634,UE_CONTEXT=3314,RNC_MODULE_ID=21,"
                + "C_ID_1=42058,RNC_ID_1=9,C_ID_2=-2147483648,RNC_ID_2=-1,C_ID_3=-2147483648,RNC_ID_3=-1,C_ID_4=-2147483648,RNC_ID_4=-1,"
                + "EVENT_ID=8,PDU_TYPE=2,PROTOCOL_ID=0,MESSAGE_DIRECTION=0,MESSAGE_LENGTH=11,"+"MESSAGE_CONTENTS=ffffffffffffffffffffff";

        Publisher myPublisher = new MyPublisher(expectedEvent);
        EventRecordHandler eventRecordHandler = new StubbedEventRecordHandler(headerRecordHandler,
                new Publisher[] { myPublisher });
        byte[] data = new byte[] { 0, 0, 4, -123, -99, -89, -96, 16, 25, -28, 85, 72, -108, 0, -97, -1, -1, -1, -1, -1,
                -1, -1, -1, -1, -1, -4, 64, 0, 92, 0, 0, 0, 8, 17, 4, 0, 13, 70, -87, -48 };
        boolean resultOfProcessing = eventRecordHandler.process(data);
        assertTrue("Processing failed", resultOfProcessing);
    }

    private void setUpMockedEventSchema() {
        when(mockedSchema.getName()).thenReturn("gpeh_11b_12a");
        when(mockedEventSchema.isVariableLength()).thenReturn(true);
        when(mockedEventSchema.getName()).thenReturn("RRC_MEASUREMENT_REPORT");
        List<EventParameter> eventParameters = createEventParameters();
        when(mockedEventSchema.getParameterList()).thenReturn(eventParameters);
        when(mockedEventSchema.isBitpacked()).thenReturn(true);
        when(mockedEventSchema.getLength()).thenReturn(4160);
        when(mockedEventSchema.isDecodeAsn1()).thenReturn(true);
    }

    private List<EventParameter> createEventParameters() {
        List<EventParameter> eventParameters = new ArrayList<EventParameter>();
        eventParameters.add(mockEventParameter("EVENT_PARAM_SCANNER_ID", 3, 24, false));
        eventParameters.add(mockEventParameter("EVENT_PARAM_TIMESTAMP_HOUR", 1, 5, false));
        eventParameters.add(mockEventParameter("EVENT_PARAM_TIMESTAMP_MINUTE", 1, 6, false));
        eventParameters.add(mockEventParameter("EVENT_PARAM_TIMESTAMP_SECOND", 1, 6, false));
        eventParameters.add(mockEventParameter("EVENT_PARAM_TIMESTAMP_MILLISEC", 2, 11, false));
        eventParameters.add(mockEventParameter("EVENT_PARAM_EVENT_ID", 2, 10, true));
        eventParameters.add(mockEventParameter("EVENT_PARAM_UE_CONTEXT", 2, 15, true));
        eventParameters.add(mockEventParameter("EVENT_PARAM_RNC_MODULE_ID", 1, 6, true));
        eventParameters.add(mockEventParameter("EVENT_PARAM_C_ID_1", 2, 16, true));
        eventParameters.add(mockEventParameter("EVENT_PARAM_RNC_ID_1", 2, 12, true));
        eventParameters.add(mockEventParameter("EVENT_PARAM_C_ID_2", 2, 16, true));
        eventParameters.add(mockEventParameter("EVENT_PARAM_RNC_ID_2", 2, 12, true));
        eventParameters.add(mockEventParameter("EVENT_PARAM_C_ID_3", 2, 16, true));
        eventParameters.add(mockEventParameter("EVENT_PARAM_RNC_ID_3", 2, 12, true));
        eventParameters.add(mockEventParameter("EVENT_PARAM_C_ID_4", 2, 16, true));
        eventParameters.add(mockEventParameter("EVENT_PARAM_RNC_ID_4", 2, 12, true));
        eventParameters.add(mockEventParameter("EVENT_PARAM_PDU_TYPE", 1, 4, true));
        eventParameters.add(mockEventParameter("EVENT_PARAM_PROTOCOL_ID", 1, 3, true));
        eventParameters.add(mockEventParameter("EVENT_PARAM_MESSAGE_DIRECTION", 1, 1, true));
        eventParameters.add(mockEventParameter("EVENT_PARAM_MESSAGE_LENGTH", 2, 11, true));
        eventParameters.add(mockMessageContentsEventParameter());
        return eventParameters;
    }

    private EventParameter mockMessageContentsEventParameter() {
        EventParameter messageContentsParameter = mockEventParameter("MESSAGE_CONTENTS");
        when(messageContentsParameter.isVariableLength()).thenReturn(true);
        when(messageContentsParameter.getNumberOfBytes()).thenReturn(11);
        when(messageContentsParameter.isUseValid()).thenReturn(false);
        return messageContentsParameter;
    }

    private EventParameter mockEventParameter(String parameterName, int numberOfBytes, int numberOfBits,
            boolean useValid) {
        EventParameter mockedParameter = mockEventParameter(parameterName);
        when(mockedParameter.getNumberOfBytes()).thenReturn(numberOfBytes);
        when(mockedParameter.getNumberOfBits()).thenReturn(numberOfBits);
        when(mockedParameter.isUseValid()).thenReturn(useValid);
        return mockedParameter;

    }

    private EventParameter mockEventParameter(String parameterName) {
        EventParameter mockedParameter = mock(EventParameter.class, parameterName);
        when(mockedParameter.getName()).thenReturn(parameterName);
        return mockedParameter;
    }

    class StubbedEventRecordHandler extends EventRecordHandler {

        public StubbedEventRecordHandler(final EventHeaderRecordHandler headerRecordHandler,
                final Publisher[] publishers) {
            super(headerRecordHandler, publishers,  new HashSet<Integer>(Arrays.asList(8)));
        }

        @Override
        Event getEventSchema(Schema schema) {
            return mockedEventSchema;
        }

        @Override
        Schema readSchemaFromEventRecordHandler() throws SchemaException {
            return mockedSchema;
        }

        @Override
        long addOneDayToTimestampIfNeeded(long timestamp) {
            return timestamp;
        }

    }

    class MyPublisher implements Publisher {

        private final String expectedEvent;

        /**
         * @param expectedEvent
         */
        public MyPublisher(String expectedEvent) {
            this.expectedEvent = expectedEvent;
        }

        @Override
        public void addEvents(String schemaType, Collection<MappedEvent> events) {
        }

        @Override
        public void removeEvents(String schemaType, Collection<MappedEvent> events) {
        }

        @Override
        public void publishMessage(ApEventBean event) {
            assertNotNull(event);
            assertEquals(expectedEvent, event.getDecodedString());
        }

        @Override
        public void flush() {
        }

        @Override
        public void close() {
        }

    	public String getCurrentFileName() {
    		return null;
    	}

    	@Override
        public void setCurrentFileName(String currentFileName) {
    	}

    }

}
