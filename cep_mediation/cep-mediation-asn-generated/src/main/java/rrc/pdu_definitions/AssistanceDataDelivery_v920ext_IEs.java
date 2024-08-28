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
 * Define the ASN1 Type AssistanceDataDelivery_v920ext_IEs from ASN1 Module PDU_definitions.
 * @see Sequence
 */

public class AssistanceDataDelivery_v920ext_IEs extends Sequence {
    
    /**
     * The default constructor.
     */
    public AssistanceDataDelivery_v920ext_IEs()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public AssistanceDataDelivery_v920ext_IEs(rrc.informationelements.UE_Positioning_GPS_AssistanceData_v920ext ue_positioning_GPS_AssistanceData_v920ext, 
		    rrc.informationelements.UE_Positioning_GANSS_AssistanceData_v920ext ue_positioning_GANSS_AssistanceData_v920ext)
    {
	setUe_positioning_GPS_AssistanceData_v920ext(ue_positioning_GPS_AssistanceData_v920ext);
	setUe_positioning_GANSS_AssistanceData_v920ext(ue_positioning_GANSS_AssistanceData_v920ext);
    }
    
    public void initComponents()
    {
	mComponents[0] = new rrc.informationelements.UE_Positioning_GPS_AssistanceData_v920ext();
	mComponents[1] = new rrc.informationelements.UE_Positioning_GANSS_AssistanceData_v920ext();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[2];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new rrc.informationelements.UE_Positioning_GPS_AssistanceData_v920ext();
	    case 1:
		return new rrc.informationelements.UE_Positioning_GANSS_AssistanceData_v920ext();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "ue_positioning_GPS_AssistanceData_v920ext"
    public rrc.informationelements.UE_Positioning_GPS_AssistanceData_v920ext getUe_positioning_GPS_AssistanceData_v920ext()
    {
	return (rrc.informationelements.UE_Positioning_GPS_AssistanceData_v920ext)mComponents[0];
    }
    
    public void setUe_positioning_GPS_AssistanceData_v920ext(rrc.informationelements.UE_Positioning_GPS_AssistanceData_v920ext ue_positioning_GPS_AssistanceData_v920ext)
    {
	mComponents[0] = ue_positioning_GPS_AssistanceData_v920ext;
    }
    
    public boolean hasUe_positioning_GPS_AssistanceData_v920ext()
    {
	return componentIsPresent(0);
    }
    
    public void deleteUe_positioning_GPS_AssistanceData_v920ext()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "ue_positioning_GANSS_AssistanceData_v920ext"
    public rrc.informationelements.UE_Positioning_GANSS_AssistanceData_v920ext getUe_positioning_GANSS_AssistanceData_v920ext()
    {
	return (rrc.informationelements.UE_Positioning_GANSS_AssistanceData_v920ext)mComponents[1];
    }
    
    public void setUe_positioning_GANSS_AssistanceData_v920ext(rrc.informationelements.UE_Positioning_GANSS_AssistanceData_v920ext ue_positioning_GANSS_AssistanceData_v920ext)
    {
	mComponents[1] = ue_positioning_GANSS_AssistanceData_v920ext;
    }
    
    public boolean hasUe_positioning_GANSS_AssistanceData_v920ext()
    {
	return componentIsPresent(1);
    }
    
    public void deleteUe_positioning_GANSS_AssistanceData_v920ext()
    {
	setComponentAbsent(1);
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
	    "AssistanceDataDelivery_v920ext_IEs"
	),
	new QName (
	    "PDU-definitions",
	    "AssistanceDataDelivery-v920ext-IEs"
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
				"UE_Positioning_GPS_AssistanceData_v920ext"
			    ),
			    new QName (
				"InformationElements",
				"UE-Positioning-GPS-AssistanceData-v920ext"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_GPS_AssistanceData_v920ext"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_GPS_AssistanceData_v920ext"
				)
			    ),
			    0
			)
		    ),
		    "ue-positioning-GPS-AssistanceData-v920ext",
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
				"UE_Positioning_GANSS_AssistanceData_v920ext"
			    ),
			    new QName (
				"InformationElements",
				"UE-Positioning-GANSS-AssistanceData-v920ext"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_GANSS_AssistanceData_v920ext"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_GANSS_AssistanceData_v920ext"
				)
			    ),
			    0
			)
		    ),
		    "ue-positioning-GANSS-AssistanceData-v920ext",
		    1,
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
			new TagDecoderElement((short)0x8001, 1)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8001, 1)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' AssistanceDataDelivery_v920ext_IEs object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' AssistanceDataDelivery_v920ext_IEs object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for AssistanceDataDelivery_v920ext_IEs
