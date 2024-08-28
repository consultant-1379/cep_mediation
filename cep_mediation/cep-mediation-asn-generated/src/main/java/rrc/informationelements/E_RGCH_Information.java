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
 * Define the ASN1 Type E_RGCH_Information from ASN1 Module InformationElements.
 * @see Sequence
 */

public class E_RGCH_Information extends Sequence {
    
    /**
     * The default constructor.
     */
    public E_RGCH_Information()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public E_RGCH_Information(E_HICH_RGCH_SignatureSequence signatureSequence, 
		    E_RGCH_CombinationIndex rg_CombinationIndex)
    {
	setSignatureSequence(signatureSequence);
	setRg_CombinationIndex(rg_CombinationIndex);
    }
    
    public void initComponents()
    {
	mComponents[0] = new E_HICH_RGCH_SignatureSequence();
	mComponents[1] = new E_RGCH_CombinationIndex();
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
		return new E_HICH_RGCH_SignatureSequence();
	    case 1:
		return new E_RGCH_CombinationIndex();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "signatureSequence"
    public E_HICH_RGCH_SignatureSequence getSignatureSequence()
    {
	return (E_HICH_RGCH_SignatureSequence)mComponents[0];
    }
    
    public void setSignatureSequence(E_HICH_RGCH_SignatureSequence signatureSequence)
    {
	mComponents[0] = signatureSequence;
    }
    
    
    // Methods for field "rg_CombinationIndex"
    public E_RGCH_CombinationIndex getRg_CombinationIndex()
    {
	return (E_RGCH_CombinationIndex)mComponents[1];
    }
    
    public void setRg_CombinationIndex(E_RGCH_CombinationIndex rg_CombinationIndex)
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
	    "rrc.informationelements",
	    "E_RGCH_Information"
	),
	new QName (
	    "InformationElements",
	    "E-RGCH-Information"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"E_HICH_RGCH_SignatureSequence"
			    ),
			    new QName (
				"InformationElements",
				"E-HICH-RGCH-SignatureSequence"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new E_HICH_RGCH_SignatureSequence(0), 
				    new E_HICH_RGCH_SignatureSequence(39),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(39)
			    ),
			    null
			)
		    ),
		    "signatureSequence",
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
				"rrc.informationelements",
				"E_RGCH_CombinationIndex"
			    ),
			    new QName (
				"InformationElements",
				"E-RGCH-CombinationIndex"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new E_RGCH_CombinationIndex(0), 
				    new E_RGCH_CombinationIndex(5),
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
     * Get the type descriptor (TypeInfo) of 'this' E_RGCH_Information object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' E_RGCH_Information object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for E_RGCH_Information
