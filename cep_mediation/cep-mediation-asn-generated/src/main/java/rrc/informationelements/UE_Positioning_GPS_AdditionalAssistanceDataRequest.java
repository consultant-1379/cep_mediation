/*************************************************************/
/* Copyright (C) 2012 OSS Nokalva, Inc.  All rights reserved.*/
/*************************************************************/

/* THIS FILE IS PROPRIETARY MATERIAL OF OSS NOKALVA, INC.
 * AND MAY BE USED ONLY BY DIRECT LICENSEES OF OSS NOKALVA, INC.
 * THIS FILE MAY NOT BE DISTRIBUTED. */

/* Generated for: LM Ericsson Ltd, Athlone, Ireland - License 11536 for Solaris x86 */
/* Abstract syntax: class-definitions */
/* ASN.1 Java project: rrc.Rrc */
/* Created: Wed Feb 15 12:27:03 2012 */
/* ASN.1 Compiler for Java version: 4.1 */
/* ASN.1 compiler options and file names specified:
 * -output rrc -uper -root constants.asn ie-definitions.asn internode.asn
 * pdu-definitions.asn class-definitions.asn
 */


package rrc.informationelements;

import com.oss.asn1.*;
import com.oss.metadata.*;
import rrc.*;

/**
 * Define the ASN1 Type UE_Positioning_GPS_AdditionalAssistanceDataRequest from ASN1 Module InformationElements.
 * @see Sequence
 */

public class UE_Positioning_GPS_AdditionalAssistanceDataRequest extends Sequence {
    
    /**
     * The default constructor.
     */
    public UE_Positioning_GPS_AdditionalAssistanceDataRequest()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public UE_Positioning_GPS_AdditionalAssistanceDataRequest(BOOLEAN almanacRequest, 
		    BOOLEAN utcModelRequest, BOOLEAN ionosphericModelRequest, 
		    BOOLEAN navigationModelRequest, 
		    BOOLEAN dgpsCorrectionsRequest, 
		    BOOLEAN referenceLocationRequest, 
		    BOOLEAN referenceTimeRequest, 
		    BOOLEAN aquisitionAssistanceRequest, 
		    BOOLEAN realTimeIntegrityRequest, 
		    UE_Positioning_GPS_NavModelAddDataReq navModelAddDataRequest)
    {
	setAlmanacRequest(almanacRequest);
	setUtcModelRequest(utcModelRequest);
	setIonosphericModelRequest(ionosphericModelRequest);
	setNavigationModelRequest(navigationModelRequest);
	setDgpsCorrectionsRequest(dgpsCorrectionsRequest);
	setReferenceLocationRequest(referenceLocationRequest);
	setReferenceTimeRequest(referenceTimeRequest);
	setAquisitionAssistanceRequest(aquisitionAssistanceRequest);
	setRealTimeIntegrityRequest(realTimeIntegrityRequest);
	setNavModelAddDataRequest(navModelAddDataRequest);
    }
    
    /**
     * Construct with components.
     */
    public UE_Positioning_GPS_AdditionalAssistanceDataRequest(boolean almanacRequest, 
		    boolean utcModelRequest, boolean ionosphericModelRequest, 
		    boolean navigationModelRequest, 
		    boolean dgpsCorrectionsRequest, 
		    boolean referenceLocationRequest, 
		    boolean referenceTimeRequest, 
		    boolean aquisitionAssistanceRequest, 
		    boolean realTimeIntegrityRequest, 
		    UE_Positioning_GPS_NavModelAddDataReq navModelAddDataRequest)
    {
	this(new BOOLEAN(almanacRequest), new BOOLEAN(utcModelRequest), 
	     new BOOLEAN(ionosphericModelRequest), 
	     new BOOLEAN(navigationModelRequest), 
	     new BOOLEAN(dgpsCorrectionsRequest), 
	     new BOOLEAN(referenceLocationRequest), 
	     new BOOLEAN(referenceTimeRequest), 
	     new BOOLEAN(aquisitionAssistanceRequest), 
	     new BOOLEAN(realTimeIntegrityRequest), navModelAddDataRequest);
    }
    
    /**
     * Construct with required components.
     */
    public UE_Positioning_GPS_AdditionalAssistanceDataRequest(boolean almanacRequest, 
		    boolean utcModelRequest, boolean ionosphericModelRequest, 
		    boolean navigationModelRequest, 
		    boolean dgpsCorrectionsRequest, 
		    boolean referenceLocationRequest, 
		    boolean referenceTimeRequest, 
		    boolean aquisitionAssistanceRequest, 
		    boolean realTimeIntegrityRequest)
    {
	setAlmanacRequest(almanacRequest);
	setUtcModelRequest(utcModelRequest);
	setIonosphericModelRequest(ionosphericModelRequest);
	setNavigationModelRequest(navigationModelRequest);
	setDgpsCorrectionsRequest(dgpsCorrectionsRequest);
	setReferenceLocationRequest(referenceLocationRequest);
	setReferenceTimeRequest(referenceTimeRequest);
	setAquisitionAssistanceRequest(aquisitionAssistanceRequest);
	setRealTimeIntegrityRequest(realTimeIntegrityRequest);
    }
    
    public void initComponents()
    {
	mComponents[0] = new BOOLEAN();
	mComponents[1] = new BOOLEAN();
	mComponents[2] = new BOOLEAN();
	mComponents[3] = new BOOLEAN();
	mComponents[4] = new BOOLEAN();
	mComponents[5] = new BOOLEAN();
	mComponents[6] = new BOOLEAN();
	mComponents[7] = new BOOLEAN();
	mComponents[8] = new BOOLEAN();
	mComponents[9] = new UE_Positioning_GPS_NavModelAddDataReq();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[10];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new BOOLEAN();
	    case 1:
		return new BOOLEAN();
	    case 2:
		return new BOOLEAN();
	    case 3:
		return new BOOLEAN();
	    case 4:
		return new BOOLEAN();
	    case 5:
		return new BOOLEAN();
	    case 6:
		return new BOOLEAN();
	    case 7:
		return new BOOLEAN();
	    case 8:
		return new BOOLEAN();
	    case 9:
		return new UE_Positioning_GPS_NavModelAddDataReq();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "almanacRequest"
    public boolean getAlmanacRequest()
    {
	return ((BOOLEAN)mComponents[0]).booleanValue();
    }
    
    public void setAlmanacRequest(boolean almanacRequest)
    {
	setAlmanacRequest(new BOOLEAN(almanacRequest));
    }
    
    public void setAlmanacRequest(BOOLEAN almanacRequest)
    {
	mComponents[0] = almanacRequest;
    }
    
    
    // Methods for field "utcModelRequest"
    public boolean getUtcModelRequest()
    {
	return ((BOOLEAN)mComponents[1]).booleanValue();
    }
    
    public void setUtcModelRequest(boolean utcModelRequest)
    {
	setUtcModelRequest(new BOOLEAN(utcModelRequest));
    }
    
    public void setUtcModelRequest(BOOLEAN utcModelRequest)
    {
	mComponents[1] = utcModelRequest;
    }
    
    
    // Methods for field "ionosphericModelRequest"
    public boolean getIonosphericModelRequest()
    {
	return ((BOOLEAN)mComponents[2]).booleanValue();
    }
    
    public void setIonosphericModelRequest(boolean ionosphericModelRequest)
    {
	setIonosphericModelRequest(new BOOLEAN(ionosphericModelRequest));
    }
    
    public void setIonosphericModelRequest(BOOLEAN ionosphericModelRequest)
    {
	mComponents[2] = ionosphericModelRequest;
    }
    
    
    // Methods for field "navigationModelRequest"
    public boolean getNavigationModelRequest()
    {
	return ((BOOLEAN)mComponents[3]).booleanValue();
    }
    
    public void setNavigationModelRequest(boolean navigationModelRequest)
    {
	setNavigationModelRequest(new BOOLEAN(navigationModelRequest));
    }
    
    public void setNavigationModelRequest(BOOLEAN navigationModelRequest)
    {
	mComponents[3] = navigationModelRequest;
    }
    
    
    // Methods for field "dgpsCorrectionsRequest"
    public boolean getDgpsCorrectionsRequest()
    {
	return ((BOOLEAN)mComponents[4]).booleanValue();
    }
    
    public void setDgpsCorrectionsRequest(boolean dgpsCorrectionsRequest)
    {
	setDgpsCorrectionsRequest(new BOOLEAN(dgpsCorrectionsRequest));
    }
    
    public void setDgpsCorrectionsRequest(BOOLEAN dgpsCorrectionsRequest)
    {
	mComponents[4] = dgpsCorrectionsRequest;
    }
    
    
    // Methods for field "referenceLocationRequest"
    public boolean getReferenceLocationRequest()
    {
	return ((BOOLEAN)mComponents[5]).booleanValue();
    }
    
    public void setReferenceLocationRequest(boolean referenceLocationRequest)
    {
	setReferenceLocationRequest(new BOOLEAN(referenceLocationRequest));
    }
    
    public void setReferenceLocationRequest(BOOLEAN referenceLocationRequest)
    {
	mComponents[5] = referenceLocationRequest;
    }
    
    
    // Methods for field "referenceTimeRequest"
    public boolean getReferenceTimeRequest()
    {
	return ((BOOLEAN)mComponents[6]).booleanValue();
    }
    
    public void setReferenceTimeRequest(boolean referenceTimeRequest)
    {
	setReferenceTimeRequest(new BOOLEAN(referenceTimeRequest));
    }
    
    public void setReferenceTimeRequest(BOOLEAN referenceTimeRequest)
    {
	mComponents[6] = referenceTimeRequest;
    }
    
    
    // Methods for field "aquisitionAssistanceRequest"
    public boolean getAquisitionAssistanceRequest()
    {
	return ((BOOLEAN)mComponents[7]).booleanValue();
    }
    
    public void setAquisitionAssistanceRequest(boolean aquisitionAssistanceRequest)
    {
	setAquisitionAssistanceRequest(new BOOLEAN(aquisitionAssistanceRequest));
    }
    
    public void setAquisitionAssistanceRequest(BOOLEAN aquisitionAssistanceRequest)
    {
	mComponents[7] = aquisitionAssistanceRequest;
    }
    
    
    // Methods for field "realTimeIntegrityRequest"
    public boolean getRealTimeIntegrityRequest()
    {
	return ((BOOLEAN)mComponents[8]).booleanValue();
    }
    
    public void setRealTimeIntegrityRequest(boolean realTimeIntegrityRequest)
    {
	setRealTimeIntegrityRequest(new BOOLEAN(realTimeIntegrityRequest));
    }
    
    public void setRealTimeIntegrityRequest(BOOLEAN realTimeIntegrityRequest)
    {
	mComponents[8] = realTimeIntegrityRequest;
    }
    
    
    // Methods for field "navModelAddDataRequest"
    public UE_Positioning_GPS_NavModelAddDataReq getNavModelAddDataRequest()
    {
	return (UE_Positioning_GPS_NavModelAddDataReq)mComponents[9];
    }
    
    public void setNavModelAddDataRequest(UE_Positioning_GPS_NavModelAddDataReq navModelAddDataRequest)
    {
	mComponents[9] = navModelAddDataRequest;
    }
    
    public boolean hasNavModelAddDataRequest()
    {
	return componentIsPresent(9);
    }
    
    public void deleteNavModelAddDataRequest()
    {
	setComponentAbsent(9);
    }
    
    
    /**
     * Initialize the type descriptor.
     */
    private static final SequenceInfo c_typeinfo = new SequenceInfo (
	new Tags (
	    new short[] {
		0x0010
	    }
	),
	new QName (
	    "rrc.informationelements",
	    "UE_Positioning_GPS_AdditionalAssistanceDataRequest"
	),
	new QName (
	    "InformationElements",
	    "UE-Positioning-GPS-AdditionalAssistanceDataRequest"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"BOOLEAN"
			    ),
			    new QName (
				"builtin",
				"BOOLEAN"
			    ),
			    12314,
			    null
			)
		    ),
		    "almanacRequest",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"BOOLEAN"
			    ),
			    new QName (
				"builtin",
				"BOOLEAN"
			    ),
			    12314,
			    null
			)
		    ),
		    "utcModelRequest",
		    1,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"BOOLEAN"
			    ),
			    new QName (
				"builtin",
				"BOOLEAN"
			    ),
			    12314,
			    null
			)
		    ),
		    "ionosphericModelRequest",
		    2,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"BOOLEAN"
			    ),
			    new QName (
				"builtin",
				"BOOLEAN"
			    ),
			    12314,
			    null
			)
		    ),
		    "navigationModelRequest",
		    3,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8004
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"BOOLEAN"
			    ),
			    new QName (
				"builtin",
				"BOOLEAN"
			    ),
			    12314,
			    null
			)
		    ),
		    "dgpsCorrectionsRequest",
		    4,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8005
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"BOOLEAN"
			    ),
			    new QName (
				"builtin",
				"BOOLEAN"
			    ),
			    12314,
			    null
			)
		    ),
		    "referenceLocationRequest",
		    5,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8006
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"BOOLEAN"
			    ),
			    new QName (
				"builtin",
				"BOOLEAN"
			    ),
			    12314,
			    null
			)
		    ),
		    "referenceTimeRequest",
		    6,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8007
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"BOOLEAN"
			    ),
			    new QName (
				"builtin",
				"BOOLEAN"
			    ),
			    12314,
			    null
			)
		    ),
		    "aquisitionAssistanceRequest",
		    7,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8008
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"BOOLEAN"
			    ),
			    new QName (
				"builtin",
				"BOOLEAN"
			    ),
			    12314,
			    null
			)
		    ),
		    "realTimeIntegrityRequest",
		    8,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8009
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"UE_Positioning_GPS_NavModelAddDataReq"
			    ),
			    new QName (
				"InformationElements",
				"UE-Positioning-GPS-NavModelAddDataReq"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_GPS_NavModelAddDataReq"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_GPS_NavModelAddDataReq"
				)
			    ),
			    0
			)
		    ),
		    "navModelAddDataRequest",
		    9,
		    3,
		    null
		)
	    }
	),
	0,
	new TagDecoders (
	    new TagDecoder[] {
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8000, 0)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8001, 1)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8002, 2)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8003, 3)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8004, 4)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8005, 5)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8006, 6)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8007, 7)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8008, 8)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8009, 9)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' UE_Positioning_GPS_AdditionalAssistanceDataRequest object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UE_Positioning_GPS_AdditionalAssistanceDataRequest object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UE_Positioning_GPS_AdditionalAssistanceDataRequest
