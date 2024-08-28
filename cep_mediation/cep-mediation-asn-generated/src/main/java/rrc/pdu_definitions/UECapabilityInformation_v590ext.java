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
 * Define the ASN1 Type UECapabilityInformation_v590ext from ASN1 Module PDU_definitions.
 * @see Sequence
 */

public class UECapabilityInformation_v590ext extends Sequence {
    
    /**
     * The default constructor.
     */
    public UECapabilityInformation_v590ext()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public UECapabilityInformation_v590ext(rrc.informationelements.UE_RadioAccessCapability_v3g0ext ue_RadioAccessCapability_v3g0ext, 
		    rrc.informationelements.UE_RadioAccessCapability_v590ext ue_RadioAccessCapability_v590ext, 
		    rrc.informationelements.InterRAT_UE_RadioAccessCapability_v590ext ue_RATSpecificCapability_v590ext)
    {
	setUe_RadioAccessCapability_v3g0ext(ue_RadioAccessCapability_v3g0ext);
	setUe_RadioAccessCapability_v590ext(ue_RadioAccessCapability_v590ext);
	setUe_RATSpecificCapability_v590ext(ue_RATSpecificCapability_v590ext);
    }
    
    public void initComponents()
    {
	mComponents[0] = new rrc.informationelements.UE_RadioAccessCapability_v3g0ext();
	mComponents[1] = new rrc.informationelements.UE_RadioAccessCapability_v590ext();
	mComponents[2] = new rrc.informationelements.InterRAT_UE_RadioAccessCapability_v590ext();
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
		return new rrc.informationelements.UE_RadioAccessCapability_v3g0ext();
	    case 1:
		return new rrc.informationelements.UE_RadioAccessCapability_v590ext();
	    case 2:
		return new rrc.informationelements.InterRAT_UE_RadioAccessCapability_v590ext();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "ue_RadioAccessCapability_v3g0ext"
    public rrc.informationelements.UE_RadioAccessCapability_v3g0ext getUe_RadioAccessCapability_v3g0ext()
    {
	return (rrc.informationelements.UE_RadioAccessCapability_v3g0ext)mComponents[0];
    }
    
    public void setUe_RadioAccessCapability_v3g0ext(rrc.informationelements.UE_RadioAccessCapability_v3g0ext ue_RadioAccessCapability_v3g0ext)
    {
	mComponents[0] = ue_RadioAccessCapability_v3g0ext;
    }
    
    public boolean hasUe_RadioAccessCapability_v3g0ext()
    {
	return componentIsPresent(0);
    }
    
    public void deleteUe_RadioAccessCapability_v3g0ext()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "ue_RadioAccessCapability_v590ext"
    public rrc.informationelements.UE_RadioAccessCapability_v590ext getUe_RadioAccessCapability_v590ext()
    {
	return (rrc.informationelements.UE_RadioAccessCapability_v590ext)mComponents[1];
    }
    
    public void setUe_RadioAccessCapability_v590ext(rrc.informationelements.UE_RadioAccessCapability_v590ext ue_RadioAccessCapability_v590ext)
    {
	mComponents[1] = ue_RadioAccessCapability_v590ext;
    }
    
    public boolean hasUe_RadioAccessCapability_v590ext()
    {
	return componentIsPresent(1);
    }
    
    public void deleteUe_RadioAccessCapability_v590ext()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "ue_RATSpecificCapability_v590ext"
    public rrc.informationelements.InterRAT_UE_RadioAccessCapability_v590ext getUe_RATSpecificCapability_v590ext()
    {
	return (rrc.informationelements.InterRAT_UE_RadioAccessCapability_v590ext)mComponents[2];
    }
    
    public void setUe_RATSpecificCapability_v590ext(rrc.informationelements.InterRAT_UE_RadioAccessCapability_v590ext ue_RATSpecificCapability_v590ext)
    {
	mComponents[2] = ue_RATSpecificCapability_v590ext;
    }
    
    public boolean hasUe_RATSpecificCapability_v590ext()
    {
	return componentIsPresent(2);
    }
    
    public void deleteUe_RATSpecificCapability_v590ext()
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
	    "UECapabilityInformation_v590ext"
	),
	new QName (
	    "PDU-definitions",
	    "UECapabilityInformation-v590ext"
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
				"UE_RadioAccessCapability_v3g0ext"
			    ),
			    new QName (
				"InformationElements",
				"UE-RadioAccessCapability-v3g0ext"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UE_RadioAccessCapability_v3g0ext"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "UE_RadioAccessCapability_v3g0ext"
				)
			    ),
			    0
			)
		    ),
		    "ue-RadioAccessCapability-v3g0ext",
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
				"UE_RadioAccessCapability_v590ext"
			    ),
			    new QName (
				"InformationElements",
				"UE-RadioAccessCapability-v590ext"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UE_RadioAccessCapability_v590ext"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "UE_RadioAccessCapability_v590ext"
				)
			    ),
			    0
			)
		    ),
		    "ue-RadioAccessCapability-v590ext",
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
				"InterRAT_UE_RadioAccessCapability_v590ext"
			    ),
			    new QName (
				"InformationElements",
				"InterRAT-UE-RadioAccessCapability-v590ext"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "InterRAT_UE_RadioAccessCapability_v590ext"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "InterRAT_UE_RadioAccessCapability_v590ext"
				)
			    ),
			    0
			)
		    ),
		    "ue-RATSpecificCapability-v590ext",
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
     * Get the type descriptor (TypeInfo) of 'this' UECapabilityInformation_v590ext object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UECapabilityInformation_v590ext object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UECapabilityInformation_v590ext
