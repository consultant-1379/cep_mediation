package com.ericsson.cepmediation.decodingtool.parser;

import java.io.File;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.cepmediation.base.meta.admin.SchemaHandler;
import com.ericsson.cepmediation.base.meta.admin.SchemaTypeHandler;
import com.ericsson.cepmediation.loading.events.EventHeaderRecordHandler;
import com.ericsson.cepmediation.loading.filerecords.RecordBuffer;
import com.ericsson.cepmediation.loading.filerecords.RecordDescriptor;
import com.ericsson.cepmediation.loading.gpeh.GPEHHeaderRecordHandler;
import com.ericsson.cepmediation.loading.mme.MMEHeaderRecordHandler;
import com.ericsson.cepmediation.loading.service.EBMParser;
import com.ericsson.cepmediation.loading.service.GPEHParser;

public class HeaderPrinter {
    private static final Logger logger = LoggerFactory.getLogger(HeaderPrinter.class);
    private RecordDescriptor recordDescriptor;
    private EventHeaderRecordHandler headerRecordHandler;

    public HeaderPrinter(String schemaType) {
        recordDescriptor = new RecordDescriptor(true);
        if (GPEHParser.GPEH_SCHEMA_TYPE.equals(schemaType)) {
            try {
                SchemaHandler schemaHandler = new SchemaHandler();
                SchemaTypeHandler schemaTypeHandler = schemaHandler.getSchemaMap().get(GPEHParser.GPEH_SCHEMA_TYPE);
                headerRecordHandler = new GPEHHeaderRecordHandler(schemaTypeHandler);
                recordDescriptor.addRecordHandler(headerRecordHandler);
            } catch (Exception e) {
                logger.error("Error creating schema ", e);
            }
        } else if (EBMParser.EBM_SCHEMA_TYPE.equals(schemaType)) {
            try {
                SchemaHandler schemaHandler = new SchemaHandler();
                SchemaTypeHandler schemaTypeHandler = schemaHandler.getSchemaMap().get(EBMParser.EBM_SCHEMA_TYPE);
                headerRecordHandler = new MMEHeaderRecordHandler(schemaTypeHandler);
                recordDescriptor.addRecordHandler(headerRecordHandler);
            } catch (Exception e) {
                logger.error("Error creating schema ", e);
            }
        } else {
            throw new IllegalArgumentException("Unsupported schema type: " + schemaType);
        }
    }

    public void print(File mp0) {
        try {
            headerRecordHandler.extractFileNameFields(mp0);
            RecordBuffer recordBuffer = new RecordBuffer(mp0, recordDescriptor);
            recordBuffer.process();
        } catch (Exception e) {
            logger.error("Error parsing file: " + mp0.getAbsolutePath(), e);
            return;
        }

        logger.info(headerRecordHandler.toString());
    }

}
