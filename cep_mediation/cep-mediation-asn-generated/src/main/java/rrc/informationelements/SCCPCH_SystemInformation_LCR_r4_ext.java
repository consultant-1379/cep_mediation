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
 * Define the ASN1 Type SCCPCH_SystemInformation_LCR_r4_ext from ASN1 Module InformationElements.
 * @see Sequence
 */

public class SCCPCH_SystemInformation_LCR_r4_ext extends Sequence {
    
    /**
     * The default constructor.
     */
    public SCCPCH_SystemInformation_LCR_r4_ext()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public SCCPCH_SystemInformation_LCR_r4_ext(SecondaryCCPCH_Info_LCR_r4_ext secondaryCCPCH_LCR_Extensions, 
		    PICH_Info_LCR_r4 pich_Info)
    {
	setSecondaryCCPCH_LCR_Extensions(secondaryCCPCH_LCR_Extensions);
	setPich_Info(pich_Info);
    }
    
    /**
     * Construct with required components.
     */
    public SCCPCH_SystemInformation_LCR_r4_ext(SecondaryCCPCH_Info_LCR_r4_ext secondaryCCPCH_LCR_Extensions)
    {
	setSecondaryCCPCH_LCR_Extensions(secondaryCCPCH_LCR_Extensions);
    }
    
    public void initComponents()
    {
	mComponents[0] = new SecondaryCCPCH_Info_LCR_r4_ext();
	mComponents[1] = new PICH_Info_LCR_r4();
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
		return new SecondaryCCPCH_Info_LCR_r4_ext();
	    case 1:
		return new PICH_Info_LCR_r4();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "secondaryCCPCH_LCR_Extensions"
    public SecondaryCCPCH_Info_LCR_r4_ext getSecondaryCCPCH_LCR_Extensions()
    {
	return (SecondaryCCPCH_Info_LCR_r4_ext)mComponents[0];
    }
    
    public void setSecondaryCCPCH_LCR_Extensions(SecondaryCCPCH_Info_LCR_r4_ext secondaryCCPCH_LCR_Extensions)
    {
	mComponents[0] = secondaryCCPCH_LCR_Extensions;
    }
    
    
    // Methods for field "pich_Info"
    public PICH_Info_LCR_r4 getPich_Info()
    {
	return (PICH_Info_LCR_r4)mComponents[1];
    }
    
    public void setPich_Info(PICH_Info_LCR_r4 pich_Info)
    {
	mComponents[1] = pich_Info;
    }
    
    public boolean hasPich_Info()
    {
	return componentIsPresent(1);
    }
    
    public void deletePich_Info()
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
	    "rrc.informationelements",
	    "SCCPCH_SystemInformation_LCR_r4_ext"
	),
	new QName (
	    "InformationElements",
	    "SCCPCH-SystemInformation-LCR-r4-ext"
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
				"SecondaryCCPCH_Info_LCR_r4_ext"
			    ),
			    new QName (
				"InformationElements",
				"SecondaryCCPCH-Info-LCR-r4-ext"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "SecondaryCCPCH_Info_LCR_r4_ext"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "SecondaryCCPCH_Info_LCR_r4_ext"
				)
			    ),
			    0
			)
		    ),
		    "secondaryCCPCH-LCR-Extensions",
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
				"PICH_Info_LCR_r4"
			    ),
			    new QName (
				"InformationElements",
				"PICH-Info-LCR-r4"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "PICH_Info_LCR_r4"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "PICH_Info_LCR_r4"
				)
			    ),
			    0
			)
		    ),
		    "pich-Info",
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
			new TagDecoderElement((short)0x8000, 0)
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
     * Get the type descriptor (TypeInfo) of 'this' SCCPCH_SystemInformation_LCR_r4_ext object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' SCCPCH_SystemInformation_LCR_r4_ext object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for SCCPCH_SystemInformation_LCR_r4_ext
