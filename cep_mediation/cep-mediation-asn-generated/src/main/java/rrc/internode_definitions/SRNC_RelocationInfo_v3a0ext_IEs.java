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
 * Define the ASN1 Type SRNC_RelocationInfo_v3a0ext_IEs from ASN1 Module Internode_definitions.
 * @see Sequence
 */

public class SRNC_RelocationInfo_v3a0ext_IEs extends Sequence {
    
    /**
     * The default constructor.
     */
    public SRNC_RelocationInfo_v3a0ext_IEs()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public SRNC_RelocationInfo_v3a0ext_IEs(CipheringInfoPerRB_List_v3a0ext cipheringInfoForSRB1_v3a0ext, 
		    rrc.informationelements.UE_RadioAccessCapability_v3a0ext ue_RadioAccessCapability_v3a0ext, 
		    rrc.informationelements.START_Value startValueForCiphering_v3a0ext)
    {
	setCipheringInfoForSRB1_v3a0ext(cipheringInfoForSRB1_v3a0ext);
	setUe_RadioAccessCapability_v3a0ext(ue_RadioAccessCapability_v3a0ext);
	setStartValueForCiphering_v3a0ext(startValueForCiphering_v3a0ext);
    }
    
    /**
     * Construct with required components.
     */
    public SRNC_RelocationInfo_v3a0ext_IEs(CipheringInfoPerRB_List_v3a0ext cipheringInfoForSRB1_v3a0ext, 
		    rrc.informationelements.START_Value startValueForCiphering_v3a0ext)
    {
	setCipheringInfoForSRB1_v3a0ext(cipheringInfoForSRB1_v3a0ext);
	setStartValueForCiphering_v3a0ext(startValueForCiphering_v3a0ext);
    }
    
    public void initComponents()
    {
	mComponents[0] = new CipheringInfoPerRB_List_v3a0ext();
	mComponents[1] = new rrc.informationelements.UE_RadioAccessCapability_v3a0ext();
	mComponents[2] = new rrc.informationelements.START_Value();
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
		return new CipheringInfoPerRB_List_v3a0ext();
	    case 1:
		return new rrc.informationelements.UE_RadioAccessCapability_v3a0ext();
	    case 2:
		return new rrc.informationelements.START_Value();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "cipheringInfoForSRB1_v3a0ext"
    public CipheringInfoPerRB_List_v3a0ext getCipheringInfoForSRB1_v3a0ext()
    {
	return (CipheringInfoPerRB_List_v3a0ext)mComponents[0];
    }
    
    public void setCipheringInfoForSRB1_v3a0ext(CipheringInfoPerRB_List_v3a0ext cipheringInfoForSRB1_v3a0ext)
    {
	mComponents[0] = cipheringInfoForSRB1_v3a0ext;
    }
    
    
    // Methods for field "ue_RadioAccessCapability_v3a0ext"
    public rrc.informationelements.UE_RadioAccessCapability_v3a0ext getUe_RadioAccessCapability_v3a0ext()
    {
	return (rrc.informationelements.UE_RadioAccessCapability_v3a0ext)mComponents[1];
    }
    
    public void setUe_RadioAccessCapability_v3a0ext(rrc.informationelements.UE_RadioAccessCapability_v3a0ext ue_RadioAccessCapability_v3a0ext)
    {
	mComponents[1] = ue_RadioAccessCapability_v3a0ext;
    }
    
    public boolean hasUe_RadioAccessCapability_v3a0ext()
    {
	return componentIsPresent(1);
    }
    
    public void deleteUe_RadioAccessCapability_v3a0ext()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "startValueForCiphering_v3a0ext"
    public rrc.informationelements.START_Value getStartValueForCiphering_v3a0ext()
    {
	return (rrc.informationelements.START_Value)mComponents[2];
    }
    
    public void setStartValueForCiphering_v3a0ext(rrc.informationelements.START_Value startValueForCiphering_v3a0ext)
    {
	mComponents[2] = startValueForCiphering_v3a0ext;
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
	    "SRNC_RelocationInfo_v3a0ext_IEs"
	),
	new QName (
	    "Internode-definitions",
	    "SRNC-RelocationInfo-v3a0ext-IEs"
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
				"rrc.internode_definitions",
				"CipheringInfoPerRB_List_v3a0ext"
			    ),
			    new QName (
				"Internode-definitions",
				"CipheringInfoPerRB-List-v3a0ext"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.internode_definitions",
				    "CipheringInfoPerRB_List_v3a0ext"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.internode_definitions",
				    "CipheringInfoPerRB_List_v3a0ext"
				)
			    ),
			    0
			)
		    ),
		    "cipheringInfoForSRB1-v3a0ext",
		    0,
		    2,
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
				"UE_RadioAccessCapability_v3a0ext"
			    ),
			    new QName (
				"InformationElements",
				"UE-RadioAccessCapability-v3a0ext"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UE_RadioAccessCapability_v3a0ext"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "UE_RadioAccessCapability_v3a0ext"
				)
			    ),
			    0
			)
		    ),
		    "ue-RadioAccessCapability-v3a0ext",
		    1,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"START_Value"
			    ),
			    new QName (
				"InformationElements",
				"START-Value"
			    ),
			    12314,
			    new SizeConstraint (
				new SingleValueConstraint (
				    new com.oss.asn1.INTEGER(20)
				)
			    ),
			    new Bounds (
				new java.lang.Long(20),
				new java.lang.Long(20)
			    ),
			    null
			)
		    ),
		    "startValueForCiphering-v3a0ext",
		    2,
		    2,
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
     * Get the type descriptor (TypeInfo) of 'this' SRNC_RelocationInfo_v3a0ext_IEs object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' SRNC_RelocationInfo_v3a0ext_IEs object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for SRNC_RelocationInfo_v3a0ext_IEs
