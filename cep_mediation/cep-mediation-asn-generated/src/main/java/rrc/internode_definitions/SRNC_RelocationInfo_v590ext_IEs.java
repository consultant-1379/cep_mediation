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


package rrc.internode_definitions;

import com.oss.asn1.*;
import com.oss.metadata.*;
import rrc.*;

/**
 * Define the ASN1 Type SRNC_RelocationInfo_v590ext_IEs from ASN1 Module Internode_definitions.
 * @see Sequence
 */

public class SRNC_RelocationInfo_v590ext_IEs extends Sequence {
    
    /**
     * The default constructor.
     */
    public SRNC_RelocationInfo_v590ext_IEs()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public SRNC_RelocationInfo_v590ext_IEs(rrc.informationelements.UE_RadioAccessCapability_v590ext ue_RadioAccessCapability_v590ext, 
		    rrc.informationelements.InterRAT_UE_RadioAccessCapability_v590ext ue_RATSpecificCapability_v590ext)
    {
	setUe_RadioAccessCapability_v590ext(ue_RadioAccessCapability_v590ext);
	setUe_RATSpecificCapability_v590ext(ue_RATSpecificCapability_v590ext);
    }
    
    public void initComponents()
    {
	mComponents[0] = new rrc.informationelements.UE_RadioAccessCapability_v590ext();
	mComponents[1] = new rrc.informationelements.InterRAT_UE_RadioAccessCapability_v590ext();
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
		return new rrc.informationelements.UE_RadioAccessCapability_v590ext();
	    case 1:
		return new rrc.informationelements.InterRAT_UE_RadioAccessCapability_v590ext();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "ue_RadioAccessCapability_v590ext"
    public rrc.informationelements.UE_RadioAccessCapability_v590ext getUe_RadioAccessCapability_v590ext()
    {
	return (rrc.informationelements.UE_RadioAccessCapability_v590ext)mComponents[0];
    }
    
    public void setUe_RadioAccessCapability_v590ext(rrc.informationelements.UE_RadioAccessCapability_v590ext ue_RadioAccessCapability_v590ext)
    {
	mComponents[0] = ue_RadioAccessCapability_v590ext;
    }
    
    public boolean hasUe_RadioAccessCapability_v590ext()
    {
	return componentIsPresent(0);
    }
    
    public void deleteUe_RadioAccessCapability_v590ext()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "ue_RATSpecificCapability_v590ext"
    public rrc.informationelements.InterRAT_UE_RadioAccessCapability_v590ext getUe_RATSpecificCapability_v590ext()
    {
	return (rrc.informationelements.InterRAT_UE_RadioAccessCapability_v590ext)mComponents[1];
    }
    
    public void setUe_RATSpecificCapability_v590ext(rrc.informationelements.InterRAT_UE_RadioAccessCapability_v590ext ue_RATSpecificCapability_v590ext)
    {
	mComponents[1] = ue_RATSpecificCapability_v590ext;
    }
    
    public boolean hasUe_RATSpecificCapability_v590ext()
    {
	return componentIsPresent(1);
    }
    
    public void deleteUe_RATSpecificCapability_v590ext()
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
	    "rrc.internode_definitions",
	    "SRNC_RelocationInfo_v590ext_IEs"
	),
	new QName (
	    "Internode-definitions",
	    "SRNC-RelocationInfo-v590ext-IEs"
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
     * Get the type descriptor (TypeInfo) of 'this' SRNC_RelocationInfo_v590ext_IEs object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' SRNC_RelocationInfo_v590ext_IEs object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for SRNC_RelocationInfo_v590ext_IEs
