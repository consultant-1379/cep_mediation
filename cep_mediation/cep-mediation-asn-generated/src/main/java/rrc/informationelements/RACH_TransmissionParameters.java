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
 * Define the ASN1 Type RACH_TransmissionParameters from ASN1 Module InformationElements.
 * @see Sequence
 */

public class RACH_TransmissionParameters extends Sequence {
    
    /**
     * The default constructor.
     */
    public RACH_TransmissionParameters()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public RACH_TransmissionParameters(INTEGER mmax, NB01 nb01Min, 
		    NB01 nb01Max)
    {
	setMmax(mmax);
	setNb01Min(nb01Min);
	setNb01Max(nb01Max);
    }
    
    /**
     * Construct with components.
     */
    public RACH_TransmissionParameters(long mmax, NB01 nb01Min, NB01 nb01Max)
    {
	this(new INTEGER(mmax), nb01Min, nb01Max);
    }
    
    public void initComponents()
    {
	mComponents[0] = new INTEGER();
	mComponents[1] = new NB01();
	mComponents[2] = new NB01();
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
		return new NB01();
	    case 2:
		return new NB01();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "mmax"
    public long getMmax()
    {
	return ((INTEGER)mComponents[0]).longValue();
    }
    
    public void setMmax(long mmax)
    {
	setMmax(new INTEGER(mmax));
    }
    
    public void setMmax(INTEGER mmax)
    {
	mComponents[0] = mmax;
    }
    
    
    // Methods for field "nb01Min"
    public NB01 getNb01Min()
    {
	return (NB01)mComponents[1];
    }
    
    public void setNb01Min(NB01 nb01Min)
    {
	mComponents[1] = nb01Min;
    }
    
    
    // Methods for field "nb01Max"
    public NB01 getNb01Max()
    {
	return (NB01)mComponents[2];
    }
    
    public void setNb01Max(NB01 nb01Max)
    {
	mComponents[2] = nb01Max;
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
	    "RACH_TransmissionParameters"
	),
	new QName (
	    "InformationElements",
	    "RACH-TransmissionParameters"
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
				    new com.oss.asn1.INTEGER(1), 
				    new com.oss.asn1.INTEGER(32),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(32)
			    ),
			    null
			)
		    ),
		    "mmax",
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
				"NB01"
			    ),
			    new QName (
				"InformationElements",
				"NB01"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new NB01(0), 
				    new NB01(50),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(50)
			    ),
			    null
			)
		    ),
		    "nb01Min",
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
				"rrc.informationelements",
				"NB01"
			    ),
			    new QName (
				"InformationElements",
				"NB01"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new NB01(0), 
				    new NB01(50),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(50)
			    ),
			    null
			)
		    ),
		    "nb01Max",
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
     * Get the type descriptor (TypeInfo) of 'this' RACH_TransmissionParameters object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' RACH_TransmissionParameters object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for RACH_TransmissionParameters
