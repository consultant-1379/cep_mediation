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
 * Define the ASN1 Type BurstModeParameters from ASN1 Module InformationElements.
 * @see Sequence
 */

public class BurstModeParameters extends Sequence {
    
    /**
     * The default constructor.
     */
    public BurstModeParameters()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public BurstModeParameters(INTEGER burstStart, INTEGER burstLength, 
		    INTEGER burstFreq)
    {
	setBurstStart(burstStart);
	setBurstLength(burstLength);
	setBurstFreq(burstFreq);
    }
    
    /**
     * Construct with components.
     */
    public BurstModeParameters(long burstStart, long burstLength, 
		    long burstFreq)
    {
	this(new INTEGER(burstStart), new INTEGER(burstLength), 
	     new INTEGER(burstFreq));
    }
    
    public void initComponents()
    {
	mComponents[0] = new INTEGER();
	mComponents[1] = new INTEGER();
	mComponents[2] = new INTEGER();
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
		return new INTEGER();
	    case 1:
		return new INTEGER();
	    case 2:
		return new INTEGER();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "burstStart"
    public long getBurstStart()
    {
	return ((INTEGER)mComponents[0]).longValue();
    }
    
    public void setBurstStart(long burstStart)
    {
	setBurstStart(new INTEGER(burstStart));
    }
    
    public void setBurstStart(INTEGER burstStart)
    {
	mComponents[0] = burstStart;
    }
    
    
    // Methods for field "burstLength"
    public long getBurstLength()
    {
	return ((INTEGER)mComponents[1]).longValue();
    }
    
    public void setBurstLength(long burstLength)
    {
	setBurstLength(new INTEGER(burstLength));
    }
    
    public void setBurstLength(INTEGER burstLength)
    {
	mComponents[1] = burstLength;
    }
    
    
    // Methods for field "burstFreq"
    public long getBurstFreq()
    {
	return ((INTEGER)mComponents[2]).longValue();
    }
    
    public void setBurstFreq(long burstFreq)
    {
	setBurstFreq(new INTEGER(burstFreq));
    }
    
    public void setBurstFreq(INTEGER burstFreq)
    {
	mComponents[2] = burstFreq;
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
	    "BurstModeParameters"
	),
	new QName (
	    "InformationElements",
	    "BurstModeParameters"
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
				    new com.oss.asn1.INTEGER(15),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(15)
			    ),
			    null
			)
		    ),
		    "burstStart",
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
				    new com.oss.asn1.INTEGER(10), 
				    new com.oss.asn1.INTEGER(25),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(10),
				new java.lang.Long(25)
			    ),
			    null
			)
		    ),
		    "burstLength",
		    1,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
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
				    new com.oss.asn1.INTEGER(1), 
				    new com.oss.asn1.INTEGER(16),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(16)
			    ),
			    null
			)
		    ),
		    "burstFreq",
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
			new TagDecoderElement((short)0x8001, 1)
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
     * Get the type descriptor (TypeInfo) of 'this' BurstModeParameters object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' BurstModeParameters object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for BurstModeParameters
