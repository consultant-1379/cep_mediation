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
package com.ericsson.cepmediation.loading.events;

import static org.mockito.Mockito.*;

import java.io.IOException;
import java.util.TreeMap;

import org.junit.Before;
import org.junit.Test;

import com.ericsson.cepmediation.base.meta.admin.SchemaTypeHandler;

import com.ericsson.cepmediation.base.meta.schema.Event;
import com.ericsson.cepmediation.base.meta.schema.General;
import com.ericsson.cepmediation.base.meta.schema.GeneralHandler;
import com.ericsson.cepmediation.base.meta.schema.Schema;
import com.ericsson.cepmediation.base.meta.schema.SchemaException;

public class EventHeaderRecordHandlerTest {

    private static final String fileInformationVersionDF5 = "DF5";

    private static final String fileInformationVersionW15A = "B1";

    private static final String fileInformationVersion15B = "G1";

    private static final String fileInformationVersionW14B = "DC5";

    private static final String fileInformationVersionSGEH15B = "31";

    private static final String fileInformationVersionW16A = "J";
    
    private static final String fileInformationVersionW16B = "T1";

    static final String fileFormatVersionSGEH15B = "4";

    static final String fileFormatVersion = "7-2";

    Event mockedEventSchema;

    Schema mockedSchema;

    private MockedEventHeaderRecordHandler headerRecordHandler;

    private SchemaTypeHandler mockedSchemaTypeHandler;

    private GeneralHandler mockedGeneralHandler;

    private General mockedGeneral;

    private final TreeMap<String, Schema> fileInformationVersionMap = new TreeMap<String, Schema>();

    @Before
    public void setup() {

        mockedEventSchema = mock(Event.class);
        mockedSchema = mock(Schema.class);
        fileInformationVersionMap.put(fileInformationVersionW14B, mockedSchema);
        fileInformationVersionMap.put(fileInformationVersion15B, mockedSchema);
        fileInformationVersionMap.put(fileInformationVersionSGEH15B, mockedSchema);
        fileInformationVersionMap.put(fileInformationVersionW15A, mockedSchema);
        fileInformationVersionMap.put(fileInformationVersionW16A, mockedSchema);
        mockedSchemaTypeHandler = mock(SchemaTypeHandler.class);
        mockedGeneral = mock(General.class);
        when(mockedGeneral.getFileFormatVersion()).thenReturn(fileFormatVersion);
        when(mockedGeneral.getFileInformationVersion()).thenReturn(fileInformationVersionW14B);
        mockedGeneralHandler = mock(GeneralHandler.class);
        when(mockedSchema.getGeneralHandler()).thenReturn(mockedGeneralHandler);
        when(mockedGeneralHandler.getGeneralInfo()).thenReturn(mockedGeneral);
        when(mockedSchemaTypeHandler.getFileInformationVersionMap()).thenReturn(fileInformationVersionMap);

        headerRecordHandler = new MockedEventHeaderRecordHandler(mockedSchemaTypeHandler);
    }

    @Test
    public void testFivTreatAsSGEH15B() throws SchemaException {
        headerRecordHandler.setFileInformationVersion(fileInformationVersionSGEH15B);
        headerRecordHandler.setFileFormatVersion(fileFormatVersionSGEH15B);
        headerRecordHandler.process();
    }

    @Test
    public void testSchemaMatch() throws SchemaException {
        headerRecordHandler.setFileInformationVersion(fileInformationVersionW14B);
        headerRecordHandler.setFileFormatVersion(fileFormatVersion);
        headerRecordHandler.process();
    }

    @Test
    public void testFivOldVersionTreatAs() throws SchemaException {
        headerRecordHandler.setFileInformationVersion(fileInformationVersionDF5);
        headerRecordHandler.setFileFormatVersion(fileFormatVersion);
        headerRecordHandler.process();
    }

    @Test
    public void testSchemaG1() throws SchemaException {
        headerRecordHandler.setFileInformationVersion(fileInformationVersion15B);
        headerRecordHandler.setFileFormatVersion(fileFormatVersion);
        headerRecordHandler.process();
    }

    @Test
    public void testSchemaJ() throws SchemaException {
        headerRecordHandler.setFileInformationVersion(fileInformationVersionW16A);
        headerRecordHandler.setFileFormatVersion(fileFormatVersion);
        headerRecordHandler.process();
    }

    @Test
    public void testSchemaB1() throws SchemaException {
        headerRecordHandler.setFileInformationVersion(fileInformationVersionW15A);
        headerRecordHandler.setFileFormatVersion(fileFormatVersion);
        headerRecordHandler.process();
    }

    @Test(expected = SchemaException.class)
    public void testFfvMismatch() throws SchemaException {
        headerRecordHandler.setFileInformationVersion(fileInformationVersionW16B);
        headerRecordHandler.setFileFormatVersion("7");
        headerRecordHandler.process();
    }

    @Test(expected = SchemaException.class)
    public void testNullFiv() throws SchemaException {
        headerRecordHandler.setFileInformationVersion("");
        headerRecordHandler.setFileFormatVersion(fileFormatVersion);
        headerRecordHandler.process();
    }

    public class MockedEventHeaderRecordHandler extends EventHeaderRecordHandler {

        public MockedEventHeaderRecordHandler(final SchemaTypeHandler schemaTypeHandler) {
            super(schemaTypeHandler);
        }

        @Override
        public short getRecordType() {
            return 0;
        }

        @Override
        public long getEventsProcessed() {
            return 0;
        }

        @Override
        public void clearEventsProcessed() {
        }

        @Override
        public String toString(final byte[] data) {
            return null;
        }

        @Override
        protected void setUtcOffsetOfDataInsideFile(final int timezoneOffsetInFileName) {
        }

        @Override
        protected void setNetworkElementTimezoneOffset(final int timezoneOffsetInFileName) {
        }

        @Override
        public boolean process() throws SchemaException {
            return super.process();
        }

        @Override
        public boolean process(final byte[] data) throws IOException, SchemaException {
            return false;
        }

        public void setFileFormatVersion(final String fileFormatVersion) {
            this.fileFormatVersion = fileFormatVersion;
        }

        public void setFileInformationVersion(final String fileInformationVersion) {
            this.fileInformationVersion = fileInformationVersion;
        }

    }

}
