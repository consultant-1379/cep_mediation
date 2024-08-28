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
 * Define the ASN1 Type E_RGCH_Combination_Info from ASN1 Module Internode_definitions.
 * @see Sequence
 */

public class E_RGCH_Combination_Info extends Sequence {
    
    /**
     * The default constructor.
     */
    public E_RGCH_Combination_Info()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public E_RGCH_Combination_Info(rrc.informationelements.PrimaryCPICH_Info primaryCPICH_Info, 
		    INTEGER rg_CombinationIndex)
    {
	setPrimaryCPICH_Info(primaryCPICH_Info);
	setRg_CombinationIndex(rg_CombinationIndex);
    }
    
    /**
     * Construct with components.
     */
    public E_RGCH_Combination_Info(rrc.informationelements.PrimaryCPICH_Info primaryCPICH_Info, 
		    long rg_CombinationIndex)
    {
	this(primaryCPICH_Info, new INTEGER(rg_CombinationIndex));
    }
    
    public void initComponents()
    {
	mComponents[0] = new rrc.informationelements.PrimaryCPICH_Info();
	mComponents[1] = new INTEGER();
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
		return new rrc.informationelements.PrimaryCPICH_Info();
	    case 1:
		return new INTEGER();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "primaryCPICH_Info"
    public rrc.informationelements.PrimaryCPICH_Info getPrimaryCPICH_Info()
    {
	return (rrc.informationelements.PrimaryCPICH_Info)mComponents[0];
    }
    
    public void setPrimaryCPICH_Info(rrc.informationelements.PrimaryCPICH_Info primaryCPICH_Info)
    {
	mComponents[0] = primaryCPICH_Info;
    }
    
    
    // Methods for field "rg_CombinationIndex"
    public long getRg_CombinationIndex()
    {
	return ((INTEGER)mComponents[1]).longValue();
    }
    
    public void setRg_CombinationIndex(long rg_CombinationIndex)
    {
	setRg_CombinationIndex(new INTEGER(rg_CombinationIndex));
    }
    
    public void setRg_CombinationIndex(INTEGER rg_CombinationIndex)
    {
	mComponents[1] = rg_CombinationIndex;
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
	    "E_RGCH_Combination_Info"
	),
	new QName (
	    "Internode-definitions",
	    "E-RGCH-Combination-Info"
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
				"PrimaryCPICH_Info"
			    ),
			    new QName (
				"InformationElements",
				"PrimaryCPICH-Info"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "PrimaryCPICH_Info"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "PrimaryCPICH_Info"
				)
			    ),
			    0
			)
		    ),
		    "primaryCPICH-Info",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"INTEGER"
			    ),
			    new QName (
				"builtin",
				"INTEGER"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new com.oss.asn1.INTEGER(0), 
				    new com.oss.asn1.INTEGER(5),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(5)
			    ),
			    null
			)
		    ),
		    "rg-CombinationIndex",
		    1,
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
			new TagDecoderElement((short)0x8001, 1)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' E_RGCH_Combination_Info object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' E_RGCH_Combination_Info object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for E_RGCH_Combination_Info
