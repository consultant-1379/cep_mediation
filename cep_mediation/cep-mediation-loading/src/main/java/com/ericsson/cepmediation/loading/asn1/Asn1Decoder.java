package com.ericsson.cepmediation.loading.asn1;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.cepmediation.base.apeventbeans.ApEventBean;
import com.ericsson.cepmediation.base.util.constants.EventIdConstants;


public class Asn1Decoder {

    private static final Logger logger = LoggerFactory.getLogger(Asn1Decoder.class);

    private final RRCCoder rrcCoder;
    
    private final Map<Integer,AbstractAsn1EventDecoder> asn1EventDecoders = new HashMap<Integer,AbstractAsn1EventDecoder>();

    public Asn1Decoder() {
        rrcCoder = createRRCCoder();
        asn1EventDecoders.put(EventIdConstants.RRC_MEASUREMENT_REPORT, createRrcMeasurementReportAsn1Decoder(rrcCoder));
        asn1EventDecoders.put(EventIdConstants.RRC_UPLINK_DIRECT_TRANSFER, createRrcUplinkDirectTransferAsn1Decoder(rrcCoder));
    }

    /**
     * Has default access to allow unit testing
     */
    RRCCoder createRRCCoder() {
        return new RRCCoder();
    }
    
    /**
     * Has default access to allow unit testing
     */
    RrcMeasurementReportAsn1Decoder createRrcMeasurementReportAsn1Decoder(RRCCoder coder) {
        return new RrcMeasurementReportAsn1Decoder(coder);
    }
    
    /**
     * Has default access to allow unit testing
     */
    RrcUplinkDirectTransferAsn1Decoder createRrcUplinkDirectTransferAsn1Decoder(RRCCoder coder) {
        return new RrcUplinkDirectTransferAsn1Decoder(coder);
    }

    public void decodeAsn1(final ApEventBean apEventBean) {
    	if (asn1EventDecoders.containsKey(apEventBean.getEventId())) {
    		asn1EventDecoders.get(apEventBean.getEventId()).decodeAsn1(apEventBean);
    	} else {
    		StringBuilder eventNames = new StringBuilder();
    		for (AbstractAsn1EventDecoder decoder : asn1EventDecoders.values()) {
    			eventNames.append(decoder.getEventName()).append(",");
    		}
    		logger.warn("Asking to decode ASN1 part of the event " + apEventBean.getName() + " (event id=" + apEventBean.getEventId()
    				+ "). Only Events that have ASN1 decoders are " + eventNames.toString());
    	}
    
    }
    
    public RrcMeasurementReportAsn1Decoder getRrcMeasurementReportAsn1Decoder() {
    	return (RrcMeasurementReportAsn1Decoder)asn1EventDecoders.get(EventIdConstants.RRC_MEASUREMENT_REPORT);
    }
    
    public RrcUplinkDirectTransferAsn1Decoder getRrcUplinkDirectTransferAsn1Decoder() {
    	return (RrcUplinkDirectTransferAsn1Decoder)asn1EventDecoders.get(EventIdConstants.RRC_UPLINK_DIRECT_TRANSFER);
    }


}
