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
 * Define the ASN1 Type Reference_Beta_16QAM from ASN1 Module InformationElements.
 * @see Sequence
 */

public class Reference_Beta_16QAM extends Sequence {
    
    /**
     * The default constructor.
     */
    public Reference_Beta_16QAM()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public Reference_Beta_16QAM(INTEGER reference_Code_Rate, 
		    INTEGER reference_Beta)
    {
	setReference_Code_Rate(reference_Code_Rate);
	setReference_Beta(reference_Beta);
    }
    
    /**
     * Construct with components.
     */
    public Reference_Beta_16QAM(long reference_Code_Rate, long reference_Beta)
    {
	this(new INTEGER(reference_Code_Rate), new INTEGER(reference_Beta));
    }
    
    public void initComponents()
    {
	mComponents[0] = new INTEGER();
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
		return new INTEGER();
	    case 1:
		return new INTEGER();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "reference_Code_Rate"
    public long getReference_Code_Rate()
    {
	return ((INTEGER)mComponents[0]).longValue();
    }
    
    public void setReference_Code_Rate(long reference_Code_Rate)
    {
	setReference_Code_Rate(new INTEGER(reference_Code_Rate));
    }
    
    public void setReference_Code_Rate(INTEGER reference_Code_Rate)
    {
	mComponents[0] = reference_Code_Rate;
    }
    
    
    // Methods for field "reference_Beta"
    public long getReference_Beta()
    {
	return ((INTEGER)mComponents[1]).longValue();
    }
    
    public void setReference_Beta(long reference_Beta)
    {
	setReference_Beta(new INTEGER(reference_Beta));
    }
    
    public void setReference_Beta(INTEGER reference_Beta)
    {
	mComponents[1] = reference_Beta;
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
	    "Reference_Beta_16QAM"
	),
	new QName (
	    "InformationElements",
	    "Reference-Beta-16QAM"
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
				    new com.oss.asn1.INTEGER(10),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(10)
			    ),
			    null
			)
		    ),
		    "reference-Code-Rate",
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
				    new com.oss.asn1.INTEGER(-15), 
				    new com.oss.asn1.INTEGER(16),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(-15),
				new java.lang.Long(16)
			    ),
			    null
			)
		    ),
		    "reference-Beta",
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
     * Get the type descriptor (TypeInfo) of 'this' Reference_Beta_16QAM object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' Reference_Beta_16QAM object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for Reference_Beta_16QAM
