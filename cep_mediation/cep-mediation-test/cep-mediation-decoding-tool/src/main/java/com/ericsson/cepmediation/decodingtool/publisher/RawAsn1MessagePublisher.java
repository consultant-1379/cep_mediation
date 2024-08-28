/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.decodingtool.publisher;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.cepmediation.apeventbeans.gpeh.RRC_MEASUREMENT_REPORT;
import com.ericsson.cepmediation.base.apeventbeans.ApEventBean;
import com.ericsson.cepmediation.base.meta.admin.MappedEvent;
import com.ericsson.cepmediation.base.publishing.Publisher;
import com.ericsson.cepmediation.loading.asn1.RRCCoder;
import com.ericsson.cepmediation.loading.events.EventRecordHandler;
import com.ericsson.cepmediation.test.common.DateTimeUtilities;
import com.ericsson.cepmediation.test.common.RadioUser;
import com.ericsson.cepmediation.test.common.RadioUserFilter;
import com.oss.asn1.AbstractData;

/**
 * @author eemecoy
 *
 */
public class RawAsn1MessagePublisher implements Publisher {

    private static final Logger logger = LoggerFactory.getLogger(RawAsn1MessagePublisher.class);

    private static final String COMMA = ",";

    private List<String> rawAsn1Messages = new ArrayList<String>();

    private RRCCoder rrcCoder;

    private RadioUserFilter radioUserFilter = new RadioUserFilter();

    public RawAsn1MessagePublisher(RadioUser radioUser) {
        radioUserFilter.addUser(radioUser);
        System.setProperty(EventRecordHandler.SHOULD_NULLIFY_ASN1MESSAGECONTENTS_AFTER_DECODING, "false");
        rrcCoder = new RRCCoder();
    }

    @Override
    public void addEvents(String schemaType, Collection<MappedEvent> events) {
    }

    @Override
    public void removeEvents(String schemaType, Collection<MappedEvent> events) {
    }

    @Override
    public void publishMessage(ApEventBean event) {
        if (event instanceof RRC_MEASUREMENT_REPORT) {
            if (forSpecifiedUser(event)) {
                rawAsn1Messages.add(decodeAsn1Message((RRC_MEASUREMENT_REPORT) event));
            }
        }
    }

    private boolean forSpecifiedUser(ApEventBean event) {
        return radioUserFilter.isForSelectedUser(event);
    }

    private String decodeAsn1Message(RRC_MEASUREMENT_REPORT event) {
        try {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(getEventHeader(event));
            stringBuilder.append(COMMA);
            stringBuilder.append("MESSAGE_CONTENTS=");
            AbstractData abstractData = rrcCoder.decodeByteArrayIntoAbstractData(event);
            stringBuilder.append(abstractData.toString());
            return stringBuilder.toString();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    private String getEventHeader(RRC_MEASUREMENT_REPORT event) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(DateTimeUtilities.convertTimeStampToDateString(event.getTimestamp()));
        stringBuilder.append(COMMA);
        stringBuilder.append("UE_CONTEXT=");
        stringBuilder.append(event.getUE_CONTEXT());
        stringBuilder.append(COMMA);
        stringBuilder.append("RNC_MODULE_ID=");
        stringBuilder.append(event.getRNC_MODULE_ID());
        return stringBuilder.toString();
    }

    @Override
    public void flush() {
        for (String message : rawAsn1Messages) {
            logger.info(message);
        }
    }

    @Override
    public void close() {
    }
    
	public String getCurrentFileName() {
		return null;
	}

	public void setCurrentFileName(String currentFileName) {
	}

}
