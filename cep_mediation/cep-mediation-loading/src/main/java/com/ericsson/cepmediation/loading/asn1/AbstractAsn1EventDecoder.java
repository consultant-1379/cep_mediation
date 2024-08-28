package com.ericsson.cepmediation.loading.asn1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import rrc.class_definitions.UL_DCCH_Message;
import rrc.class_definitions.UL_DCCH_MessageType;

import com.ericsson.cepmediation.base.apeventbeans.ApEventBean;
import com.ericsson.cepmediation.base.apeventbeans.Asn1Message;
import com.oss.asn1.AbstractData;


public abstract class AbstractAsn1EventDecoder {
	
	public static final String SHOULD_NULLIFY_ASN1MESSAGECONTENTS_AFTER_DECODING = "should.nullify.asn1messagecontents.after.decoding";

    private static final Logger logger = LoggerFactory.getLogger(AbstractAsn1EventDecoder.class);

    protected RRCCoder rrcCoder;
    
    protected AbstractAsn1EventDecoder(RRCCoder rrcCoderValue) {
    	rrcCoder = rrcCoderValue;
    }
    
    
    public void decodeAsn1(final ApEventBean apEventBean) {
    	try {
    		final AbstractData abstractData = rrcCoder.decodeByteArrayIntoAbstractData(apEventBean);
    		final List<Map<String, String>> resultList = handleUlDcchMessage((UL_DCCH_Message) abstractData);

    		final List<Asn1Message> asn1MessageList = new ArrayList<Asn1Message>();
    		if (resultList.size() > 0) {
    			traceApEventBeansDecodedString(apEventBean);
    			for (final Map<String, String> messageAttributes : resultList) {
    				final Asn1Message asn1Message = new Asn1Message();
    				asn1Message.setMessageName(getMessageName());
    				asn1Message.setMessageAttributes(messageAttributes);
    				asn1MessageList.add(asn1Message);
    				traceAsn1Message(asn1Message);
    			}
    		}
    		apEventBean.setAsn1MessageList(asn1MessageList);
			postProcess(apEventBean);
			
    	} catch (final Exception e) {
    		logger.warn("Exception while decoding the event" + getEventName(), e);
    	}

    }
    

    /**
     * default access to get under test
     */
    protected UL_DCCH_MessageType getUL_DCCH_MessageType(final UL_DCCH_Message message) {
        return (UL_DCCH_MessageType) message.getComponent(1);
    }
    
    protected void traceApEventBeansDecodedString(final ApEventBean apEventBean) {
        if (logger.isTraceEnabled()) {
            logger.trace(apEventBean.getDecodedString());
        }
    }

    protected void traceAsn1Message(final Asn1Message asn1Message) {
        if (logger.isTraceEnabled()) {
            logger.trace(" " + asn1Message);
        }
    }
    
    protected boolean shouldNullifyMessageContentsAfterDecoding() {
        String propertyValue = System.getProperty(SHOULD_NULLIFY_ASN1MESSAGECONTENTS_AFTER_DECODING, Boolean.toString(true));
        return Boolean.parseBoolean(propertyValue);
    }
    
    protected abstract List<Map<String, String>> handleUlDcchMessage(UL_DCCH_Message message);
    
    protected abstract void postProcess(ApEventBean apEventBean);
    
    /*
     * Returns the message name that will be included with the decoded values in the AsnMessage object
     */
    protected abstract String getMessageName();
    
    /*
     * Returns the name of the event that contains the ASN1 data 
     */
    protected abstract String getEventName();

}
