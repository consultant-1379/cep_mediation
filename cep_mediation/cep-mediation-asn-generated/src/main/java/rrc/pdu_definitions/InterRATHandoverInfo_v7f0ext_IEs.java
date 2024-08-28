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
 * Define the ASN1 Type InterRATHandoverInfo_v7f0ext_IEs from ASN1 Module PDU_definitions.
 * @see Sequence
 */

public class InterRATHandoverInfo_v7f0ext_IEs extends Sequence {
    
    /**
     * The default constructor.
     */
    public InterRATHandoverInfo_v7f0ext_IEs()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public InterRATHandoverInfo_v7f0ext_IEs(rrc.informationelements.UE_RadioAccessCapability_v7f0ext ue_RadioAccessCapability, 
		    rrc.informationelements.UE_RadioAccessCapabilityComp2_v7f0ext ue_RadioAccessCapabilityComp2)
    {
	setUe_RadioAccessCapability(ue_RadioAccessCapability);
	setUe_RadioAccessCapabilityComp2(ue_RadioAccessCapabilityComp2);
    }
    
    public void initComponents()
    {
	mComponents[0] = new rrc.informationelements.UE_RadioAccessCapability_v7f0ext();
	mComponents[1] = new rrc.informationelements.UE_RadioAccessCapabilityComp2_v7f0ext();
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
		return new rrc.informationelements.UE_RadioAccessCapability_v7f0ext();
	    case 1:
		return new rrc.informationelements.UE_RadioAccessCapabilityComp2_v7f0ext();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "ue_RadioAccessCapability"
    public rrc.informationelements.UE_RadioAccessCapability_v7f0ext getUe_RadioAccessCapability()
    {
	return (rrc.informationelements.UE_RadioAccessCapability_v7f0ext)mComponents[0];
    }
    
    public void setUe_RadioAccessCapability(rrc.informationelements.UE_RadioAccessCapability_v7f0ext ue_RadioAccessCapability)
    {
	mComponents[0] = ue_RadioAccessCapability;
    }
    
    public boolean hasUe_RadioAccessCapability()
    {
	return componentIsPresent(0);
    }
    
    public void deleteUe_RadioAccessCapability()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "ue_RadioAccessCapabilityComp2"
    public rrc.informationelements.UE_RadioAccessCapabilityComp2_v7f0ext getUe_RadioAccessCapabilityComp2()
    {
	return (rrc.informationelements.UE_RadioAccessCapabilityComp2_v7f0ext)mComponents[1];
    }
    
    public void setUe_RadioAccessCapabilityComp2(rrc.informationelements.UE_RadioAccessCapabilityComp2_v7f0ext ue_RadioAccessCapabilityComp2)
    {
	mComponents[1] = ue_RadioAccessCapabilityComp2;
    }
    
    public boolean hasUe_RadioAccessCapabilityComp2()
    {
	return componentIsPresent(1);
    }
    
    public void deleteUe_RadioAccessCapabilityComp2()
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
	    "InterRATHandoverInfo_v7f0ext_IEs"
	),
	new QName (
	    "PDU-definitions",
	    "InterRATHandoverInfo-v7f0ext-IEs"
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
				"UE_RadioAccessCapability_v7f0ext"
			    ),
			    new QName (
				"InformationElements",
				"UE-RadioAccessCapability-v7f0ext"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UE_RadioAccessCapability_v7f0ext"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "UE_RadioAccessCapability_v7f0ext"
				)
			    ),
			    0
			)
		    ),
		    "ue-RadioAccessCapability",
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
				"UE_RadioAccessCapabilityComp2_v7f0ext"
			    ),
			    new QName (
				"InformationElements",
				"UE-RadioAccessCapabilityComp2-v7f0ext"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UE_RadioAccessCapabilityComp2_v7f0ext"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "UE_RadioAccessCapabilityComp2_v7f0ext"
				)
			    ),
			    0
			)
		    ),
		    "ue-RadioAccessCapabilityComp2",
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
     * Get the type descriptor (TypeInfo) of 'this' InterRATHandoverInfo_v7f0ext_IEs object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' InterRATHandoverInfo_v7f0ext_IEs object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for InterRATHandoverInfo_v7f0ext_IEs
