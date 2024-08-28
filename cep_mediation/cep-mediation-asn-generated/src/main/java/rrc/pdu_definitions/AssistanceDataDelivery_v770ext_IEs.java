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


package rrc.pdu_definitions;

import com.oss.asn1.*;
import com.oss.metadata.*;
import rrc.*;

/**
 * Define the ASN1 Type AssistanceDataDelivery_v770ext_IEs from ASN1 Module PDU_definitions.
 * @see Sequence
 */

public class AssistanceDataDelivery_v770ext_IEs extends Sequence {
    
    /**
     * The default constructor.
     */
    public AssistanceDataDelivery_v770ext_IEs()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public AssistanceDataDelivery_v770ext_IEs(rrc.informationelements.UE_Positioning_OTDOA_AssistanceData_UEB_ext ue_Positioning_OTDOA_AssistanceData_UEB_ext, 
		    rrc.informationelements.UE_Positioning_GPS_AssistanceData_v770ext ue_Positioning_GPS_AssistanceData, 
		    rrc.informationelements.UE_Positioning_GANSS_AssistanceData ue_positioning_GANSS_AssistanceData)
    {
	setUe_Positioning_OTDOA_AssistanceData_UEB_ext(ue_Positioning_OTDOA_AssistanceData_UEB_ext);
	setUe_Positioning_GPS_AssistanceData(ue_Positioning_GPS_AssistanceData);
	setUe_positioning_GANSS_AssistanceData(ue_positioning_GANSS_AssistanceData);
    }
    
    public void initComponents()
    {
	mComponents[0] = new rrc.informationelements.UE_Positioning_OTDOA_AssistanceData_UEB_ext();
	mComponents[1] = new rrc.informationelements.UE_Positioning_GPS_AssistanceData_v770ext();
	mComponents[2] = new rrc.informationelements.UE_Positioning_GANSS_AssistanceData();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[3];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new rrc.informationelements.UE_Positioning_OTDOA_AssistanceData_UEB_ext();
	    case 1:
		return new rrc.informationelements.UE_Positioning_GPS_AssistanceData_v770ext();
	    case 2:
		return new rrc.informationelements.UE_Positioning_GANSS_AssistanceData();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "ue_Positioning_OTDOA_AssistanceData_UEB_ext"
    public rrc.informationelements.UE_Positioning_OTDOA_AssistanceData_UEB_ext getUe_Positioning_OTDOA_AssistanceData_UEB_ext()
    {
	return (rrc.informationelements.UE_Positioning_OTDOA_AssistanceData_UEB_ext)mComponents[0];
    }
    
    public void setUe_Positioning_OTDOA_AssistanceData_UEB_ext(rrc.informationelements.UE_Positioning_OTDOA_AssistanceData_UEB_ext ue_Positioning_OTDOA_AssistanceData_UEB_ext)
    {
	mComponents[0] = ue_Positioning_OTDOA_AssistanceData_UEB_ext;
    }
    
    public boolean hasUe_Positioning_OTDOA_AssistanceData_UEB_ext()
    {
	return componentIsPresent(0);
    }
    
    public void deleteUe_Positioning_OTDOA_AssistanceData_UEB_ext()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "ue_Positioning_GPS_AssistanceData"
    public rrc.informationelements.UE_Positioning_GPS_AssistanceData_v770ext getUe_Positioning_GPS_AssistanceData()
    {
	return (rrc.informationelements.UE_Positioning_GPS_AssistanceData_v770ext)mComponents[1];
    }
    
    public void setUe_Positioning_GPS_AssistanceData(rrc.informationelements.UE_Positioning_GPS_AssistanceData_v770ext ue_Positioning_GPS_AssistanceData)
    {
	mComponents[1] = ue_Positioning_GPS_AssistanceData;
    }
    
    public boolean hasUe_Positioning_GPS_AssistanceData()
    {
	return componentIsPresent(1);
    }
    
    public void deleteUe_Positioning_GPS_AssistanceData()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "ue_positioning_GANSS_AssistanceData"
    public rrc.informationelements.UE_Positioning_GANSS_AssistanceData getUe_positioning_GANSS_AssistanceData()
    {
	return (rrc.informationelements.UE_Positioning_GANSS_AssistanceData)mComponents[2];
    }
    
    public void setUe_positioning_GANSS_AssistanceData(rrc.informationelements.UE_Positioning_GANSS_AssistanceData ue_positioning_GANSS_AssistanceData)
    {
	mComponents[2] = ue_positioning_GANSS_AssistanceData;
    }
    
    public boolean hasUe_positioning_GANSS_AssistanceData()
    {
	return componentIsPresent(2);
    }
    
    public void deleteUe_positioning_GANSS_AssistanceData()
    {
	setComponentAbsent(2);
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
	    "rrc.pdu_definitions",
	    "AssistanceDataDelivery_v770ext_IEs"
	),
	new QName (
	    "PDU-definitions",
	    "AssistanceDataDelivery-v770ext-IEs"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"UE_Positioning_OTDOA_AssistanceData_UEB_ext"
			    ),
			    new QName (
				"InformationElements",
				"UE-Positioning-OTDOA-AssistanceData-UEB-ext"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_OTDOA_AssistanceData_UEB_ext"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_OTDOA_AssistanceData_UEB_ext"
				)
			    ),
			    0
			)
		    ),
		    "ue-Positioning-OTDOA-AssistanceData-UEB-ext",
		    0,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"UE_Positioning_GPS_AssistanceData_v770ext"
			    ),
			    new QName (
				"InformationElements",
				"UE-Positioning-GPS-AssistanceData-v770ext"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_GPS_AssistanceData_v770ext"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_GPS_AssistanceData_v770ext"
				)
			    ),
			    0
			)
		    ),
		    "ue-Positioning-GPS-AssistanceData",
		    1,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"UE_Positioning_GANSS_AssistanceData"
			    ),
			    new QName (
				"InformationElements",
				"UE-Positioning-GANSS-AssistanceData"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_GANSS_AssistanceData"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_GANSS_AssistanceData"
				)
			    ),
			    0
			)
		    ),
		    "ue-positioning-GANSS-AssistanceData",
		    2,
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
			new TagDecoderElement((short)0x8000, 0),
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8002, 2)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' AssistanceDataDelivery_v770ext_IEs object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' AssistanceDataDelivery_v770ext_IEs object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for AssistanceDataDelivery_v770ext_IEs
