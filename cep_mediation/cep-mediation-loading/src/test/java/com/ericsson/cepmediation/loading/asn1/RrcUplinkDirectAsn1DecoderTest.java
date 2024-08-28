/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.loading.asn1;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.ericsson.cepmediation.base.apeventbeans.ApEventBean;
import com.ericsson.cepmediation.base.apeventbeans.Asn1Message;
import com.ericsson.cepmediation.base.meta.schema.Event;
import com.ericsson.cepmediation.base.util.constants.EventIdConstants;
import com.ericsson.cepmediation.base.util.constants.UplinkDirectTransferAttributes;


public class RrcUplinkDirectAsn1DecoderTest  {

    private RrcUplinkDirectTransferAsn1Decoder rrcUplinkDirectTransferDecoder;
    
    @Before
    public void setup() {
    	
    	RRCCoder rrcCoder = new RRCCoder();
    	rrcUplinkDirectTransferDecoder = new RrcUplinkDirectTransferAsn1Decoder(rrcCoder);
    }
    
    @Test
    public void testValidImeisvIsHandledCorrectly() {
    	byte[] nasMessage = getValidIdentityResponseWithImeisv();
    	assertTrue(rrcUplinkDirectTransferDecoder.hasIdentityResponse(nasMessage));
    	assertTrue(rrcUplinkDirectTransferDecoder.isIdentityOfTypeImei(nasMessage));
    	
    	String imei = rrcUplinkDirectTransferDecoder.getImei(nasMessage);
        assertThat(imei, is("1234567891234123"));
    }
    
    @Test
    public void testValidImeiIsHandledCorrectly() {
    	byte[] nasMessage = getValidIdentityResponseWithImei();
    	assertTrue(rrcUplinkDirectTransferDecoder.hasIdentityResponse(nasMessage));
    	assertTrue(rrcUplinkDirectTransferDecoder.isIdentityOfTypeImei(nasMessage));
    	
    	String imei = rrcUplinkDirectTransferDecoder.getImei(nasMessage);
        assertThat(imei, is("123456789123412"));
    }
    
    @Test
    public void testNasMessageThatIsNotIdentityResponse() {
    	byte[] nasMessage = getAuthenticationResponseMessage();
    	assertThat(rrcUplinkDirectTransferDecoder.hasIdentityResponse(nasMessage), is(false));
    }
    
    @Test
    public void testIdentityResponseWithImsiIdentifier() {
    	byte[] nasMessage = getValidIdentityResponseWithImsi();
    	assertThat(rrcUplinkDirectTransferDecoder.isIdentityOfTypeImei(nasMessage), is(false));
    }
    
    @Test
    public void testListIsPopulatedCorrectlyInApEventBean() {
    	Asn1Decoder asn1Decoder = new Asn1Decoder();
    	ApEventBean apEventBean = new StubbedApEventBean();
    	asn1Decoder.decodeAsn1(apEventBean);
    	
    	List<Asn1Message> asn1Messagelist = apEventBean.getAsn1MessageList();
    	assertThat(asn1Messagelist.size(), is(1));
    	
    	String imei = asn1Messagelist.get(0).getMessageAttributes().get(UplinkDirectTransferAttributes.IMEI);
    	assertThat(imei, is("0130580089503704"));
    	
    }
    
    
    /*
     * Returns an IdentityResponse NAS message with IMEISV = 1234567891234123
     */
    private byte[] getValidIdentityResponseWithImeisv() {
    	byte protocolDiscrimator = 0x05;  // 5 indicates Mobility Management
    	byte messageType = 0x19; // 19 indicates Identity Response in Mobility Management
    	byte length = 9;
    	byte d1Type = 0x13; // Type of 3 indicates IMEISV and hence length of 9
    	byte d3d2 = 0x32;
    	byte d5d4 = 0x54;
    	byte d7d6 = 0x76;
    	byte d9d8 = (byte) 0x98;
    	byte d11d10 = 0x21;
    	byte d13d12 = 0x43;
    	byte d15d14 = 0x21;
    	byte padd16 = (byte) 0xf3;
    	
    	return new byte[] {protocolDiscrimator, messageType, length, d1Type, d3d2, d5d4, d7d6, d9d8, d11d10, d13d12, d15d14, padd16};
    }
    
    
    /*
     * Returns an IdentityResponse NAS message with IMEI = 123456789123412
     */
    private byte[] getValidIdentityResponseWithImei() {
    	byte protocolDiscrimator = 0x05;  // 5 indicates Mobility Management
    	byte messageType = (byte)0xd9; // 19 indicates Identity Response in Mobility Management, ignore 2 most significant bits
    	byte length = 8;
    	byte d1Type = 0x12; // Type of 2 indicates IMEI and hence length of 8
    	byte d3d2 = 0x32;
    	byte d5d4 = 0x54;
    	byte d7d6 = 0x76;
    	byte d9d8 = (byte) 0x98;
    	byte d11d10 = 0x21;
    	byte d13d12 = 0x43;
    	byte d15d14 = 0x21;
    	
    	return new byte[] {protocolDiscrimator, messageType, length, d1Type, d3d2, d5d4, d7d6, d9d8, d11d10, d13d12, d15d14};
    }
    
    
    /*
     * Returns an IdentityResponse NAS message with IMEISV = 1234567891234123
     */
    private byte[] getAuthenticationResponseMessage() {
    	byte protocolDiscrimator = 0x05;  // 5 indicates Mobility Management
    	byte messageType = 0x14; // 14 indicates Authentication Response in Mobility Management
    	
    	return new byte[] {protocolDiscrimator, messageType};
    }
    
    /*
     * Returns an IdentityResponse NAS message with IMSI Identifier
     */
    private byte[] getValidIdentityResponseWithImsi() {
    	byte protocolDiscrimator = 0x05;  // 5 indicates Mobility Management
    	byte messageType = 0x19; // 19 indicates Identity Response in Mobility Management
    	byte length = 8;
    	byte d1Type = 0x11; // Type of 1 indicates IMSI
    	byte d3d2 = 0x32;
    	byte d5d4 = 0x54;
    	byte d7d6 = 0x76;
    	byte d9d8 = (byte) 0x98;
    	byte d11d10 = 0x21;
    	byte d13d12 = 0x43;
    	byte d15d14 = 0x21;
    	byte padd16 = (byte) 0xf3;
    	
    	return new byte[] {protocolDiscrimator, messageType, length, d1Type, d3d2, d5d4, d7d6, d9d8, d11d10, d13d12, d15d14, padd16};
    }

    
    class StubbedApEventBean extends ApEventBean {

        @Override
        public String getAbsoluteName() {

            return null;
        }

        @Override
        public void setData(final Event event, final byte[] data, final int offset) {
        }

        @Override
        public String getCSVString() {

            return null;
        }

        @Override
        public String getDecodedString() {

            return null;
        }
        
        // Returns an IMEISV with value 0130580089503704
        @Override
        public byte[] getAsn1Data() {
        	return new byte[]{(byte)0x80,0x00,0x00,0x01,(byte)0x86,(byte)0xc0,0x05,(byte)0x82,(byte)0xac,(byte)0x84,(byte)0x81,(byte)0x98,
        			(byte)0xa8,0x04,0x40,0x2c,(byte)0x98,0x03,(byte)0xfa,0x00};
        }
        
        @Override
        public int getEventId() {
            return EventIdConstants.RRC_UPLINK_DIRECT_TRANSFER;
        }

    }

}
