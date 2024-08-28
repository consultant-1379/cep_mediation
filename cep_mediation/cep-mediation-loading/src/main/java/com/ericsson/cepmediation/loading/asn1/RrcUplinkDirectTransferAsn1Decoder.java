/*
  The description below was mainly taken from the MZ UFDL for WCDMA CFA/HFA
   
     The Identity Response NAS message contains the Mobile Identity. The Identity Response message is part
     of two L3 protocols as listed below
        - Mobility Management, see Section 9.2.11, 3GPP TS 24.008 version 10.4.0 Release 10
        - GPRS Mobility Management, see Section 9.4.13, 3GPP TS 24.008 version 10.4.0 Release 10
              
 
    Identity Response NAS message (See chapter 10 of 3GPP TS 24.008 version)
    =================
    
    FIELDS:
    
       8     7     6     5     4     3     2     1
     ------------------------------------------------  
    | Skip Indicator        | Protocol Discriminator |  Octet 1
     ------------------------------------------------
    |              Message Type                      |  Octet 2
     ------------------------------------------------
    |              Mobile Identity Data              |  x octets, see description below
    
    
 
    Protocol Discriminator
         3GPP TS 24.007 version 10.0.0 Release 10, section 11.2.3.1.1
             bits 4 3 2 1  
                  0 1 0 1 mobility management messages (5)
                  1 0 0 0 GPRS mobility management messages (8)
 
    Skip Indicator
         3GPP TS 24.008 version 10.4.0 Release 10, section 10.3.1
         A message received with skip indicator different from 0000 shall be ignored.
 
    Message Type
         GPP TS 24.008 version 10.4.0 Release 10, section 10.4
         Table 10.2/3GPP TS 24.008: Message types for Mobility Management
             Identity Response = XX011001 (X means reserved) (25)
         Table 10.4/3GPP TS 24.008: Message types for GPRS mobility management
             Identity Response = 0 0 0 1 0 1 1 0 (22)
 
    Mobile Identity
        GPP TS 24.008 version 10.4.0 Release 10, section 10.5.1.4
 
    MM hex value starts with 05x9 (x due to unused fields)
    GMM hex value starts with 0816
 
    For example see: http://www.sharetechnote.com/html/BasicCall_Voice_WCDMA.html#24_Identity_Response
 
    SIZE: Mobile Identity 76 bits + Identity Response 16 bits = 92 + 4 bits padding = 96 bits = 12 bytes.
 


     Mobile Identity (See 3GPP TS 24.008 version 10.4.0 Release 10, section 10.5.1.4)
     ===============
     
     FIELDS for mobile identities of types IMEI/IMEISV:
     
       8    7    6    5    4    3    2    1
     -------------------------------------------  
    |     |     Mobile Identity IEI             |  Octet 1, does not exist
     -------------------------------------------
    |     Length of mobile identity contents    |  Octet 2
     -------------------------------------------
    |  Identity digit 1  |o/e| Type of Identity |  Octet 3 (o/e = odd/event indicator)
     -------------------------------------------
    | Identity digit p+1 |   Identity digit p   |  Octet 4*
     -------------------------------------------
 
     Mobile Identity IEI
         We don't need to examine this field. Correction: it does not exist.
 
     Type Of Identity
         There are different types of mobile identities that can be used e.g. IMSI, IMEI/IMEISV, TMSI/P-TMSI etc.  
             IMEI - identityResponse.mobile_identity.type_of_identity = 010 (2)
             IMEISV - identityResponse.mobile_identity.type_of_identity = 011 (3)
 

external identityResponseRaw : dynamic_size(record_length){

    short record_length : static_size(1); //Will be 12 (11 + 1, imei) or 13 (12 + 1, imeisv)

    bit_block: dynamic_size(remaining_size){
        byte skip_indicator :                   bit_size(4); //skip indicator, part of general NAS message (common part)
        byte protocol_descriminator :           bit_size(4); //protocol descriminator, part of general NAS message (common part)
        short message_type :                    bit_size(8); //message_type, part of general NAS message (common part)
        short length_of_contents   :            bit_size(8); //length 
        byte imei_d1 :                          bit_size(4); //imei digit1
        byte odd_even_indication :              bit_size(1); //odd/even indicator
        byte type_of_identity :                 bit_size(3); //type_of_identity
        byte imei_d3 :                          bit_size(4); //imei digit3
        byte imei_d2 :                          bit_size(4); //imei digit2
        byte imei_d5 :                          bit_size(4); //imei digit5
        byte imei_d4 :                          bit_size(4); //imei digit4
        byte imei_d7 :                          bit_size(4); //imei digit7
        byte imei_d6 :                          bit_size(4); //imei digit6
        byte imei_d9 :                          bit_size(4); //imei digit9
        byte imei_d8 :                          bit_size(4); //imei digit8
        byte imei_d11 :                         bit_size(4); //imei digit11
        byte imei_d10 :                         bit_size(4); //imei digit10
        byte imei_d13 :                         bit_size(4); //imei digit13
        byte imei_d12 :                         bit_size(4); //imei digit12
        byte imei_d15 :                         bit_size(4); //imei digit15
        byte imei_d14 :                         bit_size(4); //imei digit14
        byte padding_digit :                    bit_size(4), present if(length_of_contents == 9); //padding
        byte imei_d16 :                         bit_size(4), present if(length_of_contents == 9); //imei digit16


*/


package com.ericsson.cepmediation.loading.asn1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import rrc.class_definitions.UL_DCCH_Message;
import rrc.class_definitions.UL_DCCH_MessageType;
import rrc.pdu_definitions.UplinkDirectTransfer;

import com.ericsson.cepmediation.base.apeventbeans.ApEventBean;
import com.ericsson.cepmediation.base.util.DataConverters;
import com.ericsson.cepmediation.base.util.constants.EventIdConstants;
import com.ericsson.cepmediation.base.util.constants.UplinkDirectTransferAttributes;


public class RrcUplinkDirectTransferAsn1Decoder extends AbstractAsn1EventDecoder {
	
	private static final String IDENTITY_RESPONSE = "identity_response";

    private static final Logger logger = LoggerFactory.getLogger(RrcUplinkDirectTransferAsn1Decoder.class);

    public RrcUplinkDirectTransferAsn1Decoder(RRCCoder rrcCoderValue) {
        super(rrcCoderValue);
    }

    public List<Map<String, String>> handleUlDcchMessage(final UL_DCCH_Message message) {
        UL_DCCH_MessageType ul_DCCH_MessageType = getUL_DCCH_MessageType(message);
        if (!ul_DCCH_MessageType.hasUplinkDirectTransfer()) {
        	String error = "Expected event of type " + getEventName();
            throw new IllegalStateException(error);
        }
        UplinkDirectTransfer uplinkDirectTransfer = (UplinkDirectTransfer) ul_DCCH_MessageType.getChosenValue();
        final List<Map<String, String>> results = new ArrayList<Map<String, String>>();
        Map<String, String> resultValues = new HashMap<String,String>();
        byte[] nasMessage = uplinkDirectTransfer.getNas_Message().byteArrayValue();
        
        //Decode Nas Message if it is of type Identity Response and the Identity is of type Imei
        if (hasIdentityResponse(nasMessage)) {
        	if (isIdentityOfTypeImei(nasMessage)) {
        		resultValues.put(UplinkDirectTransferAttributes.IMEI, getImei(nasMessage));
        		results.add(resultValues);
        	}
        }
        
        return results;
    }
    
    // Default access for test
    boolean hasIdentityResponse(byte[] nasMessage) {
    	int protocolDiscriminator = nasMessage[0] & 0x0f;
    	byte messageType = nasMessage[1];
    	if (protocolDiscriminator == EventIdConstants.PROTOCOL_NON_GPRS_MOBILITY_MANAGEMENT) {
    		// Two most significant bits of messageType for NON GPRS Mobility management can include a Send Sequence Number, need to ignore these bits  
    		return ((int)(messageType & 0x3f)) ==  EventIdConstants.NON_GPRS_MM_IDENTITY_RESPONSE;
    	} else if (protocolDiscriminator == EventIdConstants.PROTOCOL_GPRS_MOBILITY_MANAGEMENT) {
    		return (int)messageType == EventIdConstants.GPRS_MM_IDENTITY_RESPONSE;
    	}
    	return false;
    }
    
    // Default access for test
    boolean isIdentityOfTypeImei(byte[] nasMessage) {
    	int typeOfIdentity = nasMessage[3] & 0x07;
    	return (typeOfIdentity == EventIdConstants.IDENTITY_TYPE_IMEI || typeOfIdentity == EventIdConstants.IDENTITY_TYPE_IMEISV);
    }
    
    // Default access for test
    String getImei(byte[] nasMessage) {

    	int length = nasMessage[2];
    	//The encoded Imei(sv) is similar to TBCD encoded data but with first nibble removed
    	// as the first nibble is used to indicate the type of the identity and is not part of the IMEI(SV) value
    	String imei = DataConverters.getByteArrayTBCDString(nasMessage, 3, false, length);
    	return imei.trim().substring(1);

    }
    

	@Override
	protected void postProcess(ApEventBean apEventBean) {
		// Nothing to do
	}

	@Override
	protected String getMessageName() {
		return IDENTITY_RESPONSE;
	}

	@Override
	protected String getEventName() {
		return "RRC_UPLINK_DIRECT_TRANSFER";
	}


}
