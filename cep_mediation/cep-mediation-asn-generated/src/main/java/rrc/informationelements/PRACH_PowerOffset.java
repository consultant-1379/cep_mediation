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
 * Define the ASN1 Type PRACH_PowerOffset from ASN1 Module InformationElements.
 * @see Sequence
 */

public class PRACH_PowerOffset extends Sequence {
    
    /**
     * The default constructor.
     */
    public PRACH_PowerOffset()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public PRACH_PowerOffset(PowerRampStep powerRampStep, 
		    PreambleRetransMax preambleRetransMax)
    {
	setPowerRampStep(powerRampStep);
	setPreambleRetransMax(preambleRetransMax);
    }
    
    public void initComponents()
    {
	mComponents[0] = new PowerRampStep();
	mComponents[1] = new PreambleRetransMax();
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
		return new PowerRampStep();
	    case 1:
		return new PreambleRetransMax();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "powerRampStep"
    public PowerRampStep getPowerRampStep()
    {
	return (PowerRampStep)mComponents[0];
    }
    
    public void setPowerRampStep(PowerRampStep powerRampStep)
    {
	mComponents[0] = powerRampStep;
    }
    
    
    // Methods for field "preambleRetransMax"
    public PreambleRetransMax getPreambleRetransMax()
    {
	return (PreambleRetransMax)mComponents[1];
    }
    
    public void setPreambleRetransMax(PreambleRetransMax preambleRetransMax)
    {
	mComponents[1] = preambleRetransMax;
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
	    "PRACH_PowerOffset"
	),
	new QName (
	    "InformationElements",
	    "PRACH-PowerOffset"
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
				"PowerRampStep"
			    ),
			    new QName (
				"InformationElements",
				"PowerRampStep"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new PowerRampStep(1), 
				    new PowerRampStep(8),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(8)
			    ),
			    null
			)
		    ),
		    "powerRampStep",
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
				"PreambleRetransMax"
			    ),
			    new QName (
				"InformationElements",
				"PreambleRetransMax"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new PreambleRetransMax(1), 
				    new PreambleRetransMax(64),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(64)
			    ),
			    null
			)
		    ),
		    "preambleRetransMax",
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
     * Get the type descriptor (TypeInfo) of 'this' PRACH_PowerOffset object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' PRACH_PowerOffset object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for PRACH_PowerOffset
