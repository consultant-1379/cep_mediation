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
 * Define the ASN1 Type AssistanceDataDelivery_v4b0ext_IEs from ASN1 Module PDU_definitions.
 * @see Sequence
 */

public class AssistanceDataDelivery_v4b0ext_IEs extends Sequence {
    
    /**
     * The default constructor.
     */
    public AssistanceDataDelivery_v4b0ext_IEs()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public AssistanceDataDelivery_v4b0ext_IEs(rrc.informationelements.UE_Positioning_OTDOA_AssistanceData_r4ext ue_Positioning_OTDOA_AssistanceData_r4ext)
    {
	setUe_Positioning_OTDOA_AssistanceData_r4ext(ue_Positioning_OTDOA_AssistanceData_r4ext);
    }
    
    public void initComponents()
    {
	mComponents[0] = new rrc.informationelements.UE_Positioning_OTDOA_AssistanceData_r4ext();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[1];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new rrc.informationelements.UE_Positioning_OTDOA_AssistanceData_r4ext();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "ue_Positioning_OTDOA_AssistanceData_r4ext"
    public rrc.informationelements.UE_Positioning_OTDOA_AssistanceData_r4ext getUe_Positioning_OTDOA_AssistanceData_r4ext()
    {
	return (rrc.informationelements.UE_Positioning_OTDOA_AssistanceData_r4ext)mComponents[0];
    }
    
    public void setUe_Positioning_OTDOA_AssistanceData_r4ext(rrc.informationelements.UE_Positioning_OTDOA_AssistanceData_r4ext ue_Positioning_OTDOA_AssistanceData_r4ext)
    {
	mComponents[0] = ue_Positioning_OTDOA_AssistanceData_r4ext;
    }
    
    public boolean hasUe_Positioning_OTDOA_AssistanceData_r4ext()
    {
	return componentIsPresent(0);
    }
    
    public void deleteUe_Positioning_OTDOA_AssistanceData_r4ext()
    {
	setComponentAbsent(0);
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
	    "AssistanceDataDelivery_v4b0ext_IEs"
	),
	new QName (
	    "PDU-definitions",
	    "AssistanceDataDelivery-v4b0ext-IEs"
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
				"UE_Positioning_OTDOA_AssistanceData_r4ext"
			    ),
			    new QName (
				"InformationElements",
				"UE-Positioning-OTDOA-AssistanceData-r4ext"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_OTDOA_AssistanceData_r4ext"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_OTDOA_AssistanceData_r4ext"
				)
			    ),
			    0
			)
		    ),
		    "ue-Positioning-OTDOA-AssistanceData-r4ext",
		    0,
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
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' AssistanceDataDelivery_v4b0ext_IEs object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' AssistanceDataDelivery_v4b0ext_IEs object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for AssistanceDataDelivery_v4b0ext_IEs
