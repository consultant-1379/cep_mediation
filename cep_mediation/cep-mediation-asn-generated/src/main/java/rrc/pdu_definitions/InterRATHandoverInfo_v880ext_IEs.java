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
 * Define the ASN1 Type InterRATHandoverInfo_v880ext_IEs from ASN1 Module PDU_definitions.
 * @see Sequence
 */

public class InterRATHandoverInfo_v880ext_IEs extends Sequence {
    
    /**
     * The default constructor.
     */
    public InterRATHandoverInfo_v880ext_IEs()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public InterRATHandoverInfo_v880ext_IEs(rrc.informationelements.UE_RadioAccessCapability_v880ext ue_RadioAccessCapabilityInfo, 
		    rrc.informationelements.UE_RadioAccessCapabilityComp_TDD128 ue_RadioAccessCapabilityInfo_TDD128)
    {
	setUe_RadioAccessCapabilityInfo(ue_RadioAccessCapabilityInfo);
	setUe_RadioAccessCapabilityInfo_TDD128(ue_RadioAccessCapabilityInfo_TDD128);
    }
    
    public void initComponents()
    {
	mComponents[0] = new rrc.informationelements.UE_RadioAccessCapability_v880ext();
	mComponents[1] = new rrc.informationelements.UE_RadioAccessCapabilityComp_TDD128();
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
		return new rrc.informationelements.UE_RadioAccessCapability_v880ext();
	    case 1:
		return new rrc.informationelements.UE_RadioAccessCapabilityComp_TDD128();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "ue_RadioAccessCapabilityInfo"
    public rrc.informationelements.UE_RadioAccessCapability_v880ext getUe_RadioAccessCapabilityInfo()
    {
	return (rrc.informationelements.UE_RadioAccessCapability_v880ext)mComponents[0];
    }
    
    public void setUe_RadioAccessCapabilityInfo(rrc.informationelements.UE_RadioAccessCapability_v880ext ue_RadioAccessCapabilityInfo)
    {
	mComponents[0] = ue_RadioAccessCapabilityInfo;
    }
    
    public boolean hasUe_RadioAccessCapabilityInfo()
    {
	return componentIsPresent(0);
    }
    
    public void deleteUe_RadioAccessCapabilityInfo()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "ue_RadioAccessCapabilityInfo_TDD128"
    public rrc.informationelements.UE_RadioAccessCapabilityComp_TDD128 getUe_RadioAccessCapabilityInfo_TDD128()
    {
	return (rrc.informationelements.UE_RadioAccessCapabilityComp_TDD128)mComponents[1];
    }
    
    public void setUe_RadioAccessCapabilityInfo_TDD128(rrc.informationelements.UE_RadioAccessCapabilityComp_TDD128 ue_RadioAccessCapabilityInfo_TDD128)
    {
	mComponents[1] = ue_RadioAccessCapabilityInfo_TDD128;
    }
    
    public boolean hasUe_RadioAccessCapabilityInfo_TDD128()
    {
	return componentIsPresent(1);
    }
    
    public void deleteUe_RadioAccessCapabilityInfo_TDD128()
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
	    "InterRATHandoverInfo_v880ext_IEs"
	),
	new QName (
	    "PDU-definitions",
	    "InterRATHandoverInfo-v880ext-IEs"
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
				"UE_RadioAccessCapability_v880ext"
			    ),
			    new QName (
				"InformationElements",
				"UE-RadioAccessCapability-v880ext"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UE_RadioAccessCapability_v880ext"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "UE_RadioAccessCapability_v880ext"
				)
			    ),
			    0
			)
		    ),
		    "ue-RadioAccessCapabilityInfo",
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
				"UE_RadioAccessCapabilityComp_TDD128"
			    ),
			    new QName (
				"InformationElements",
				"UE-RadioAccessCapabilityComp-TDD128"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UE_RadioAccessCapabilityComp_TDD128"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "UE_RadioAccessCapabilityComp_TDD128"
				)
			    ),
			    0
			)
		    ),
		    "ue-RadioAccessCapabilityInfo-TDD128",
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
     * Get the type descriptor (TypeInfo) of 'this' InterRATHandoverInfo_v880ext_IEs object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' InterRATHandoverInfo_v880ext_IEs object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for InterRATHandoverInfo_v880ext_IEs
