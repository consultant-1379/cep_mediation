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
 * Define the ASN1 Type NonUsedFreqParameter_r10 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class NonUsedFreqParameter_r10 extends Sequence {
    
    /**
     * The default constructor.
     */
    public NonUsedFreqParameter_r10()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public NonUsedFreqParameter_r10(Threshold_r6 nonUsedFreqThreshold, 
		    W nonUsedFreqW, 
		    NonUsedFreqTriggeringConditionDetectedCells nonUsedFreqTriggeringConditionDetectedCells)
    {
	setNonUsedFreqThreshold(nonUsedFreqThreshold);
	setNonUsedFreqW(nonUsedFreqW);
	setNonUsedFreqTriggeringConditionDetectedCells(nonUsedFreqTriggeringConditionDetectedCells);
    }
    
    /**
     * Construct with required components.
     */
    public NonUsedFreqParameter_r10(Threshold_r6 nonUsedFreqThreshold, 
		    W nonUsedFreqW)
    {
	setNonUsedFreqThreshold(nonUsedFreqThreshold);
	setNonUsedFreqW(nonUsedFreqW);
    }
    
    public void initComponents()
    {
	mComponents[0] = new Threshold_r6();
	mComponents[1] = new W();
	mComponents[2] = NonUsedFreqTriggeringConditionDetectedCells._true;
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
		return new Threshold_r6();
	    case 1:
		return new W();
	    case 2:
		return NonUsedFreqTriggeringConditionDetectedCells._true;
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "nonUsedFreqThreshold"
    public Threshold_r6 getNonUsedFreqThreshold()
    {
	return (Threshold_r6)mComponents[0];
    }
    
    public void setNonUsedFreqThreshold(Threshold_r6 nonUsedFreqThreshold)
    {
	mComponents[0] = nonUsedFreqThreshold;
    }
    
    
    // Methods for field "nonUsedFreqW"
    public W getNonUsedFreqW()
    {
	return (W)mComponents[1];
    }
    
    public void setNonUsedFreqW(W nonUsedFreqW)
    {
	mComponents[1] = nonUsedFreqW;
    }
    
    
    // Methods for field "nonUsedFreqTriggeringConditionDetectedCells"
    public NonUsedFreqTriggeringConditionDetectedCells getNonUsedFreqTriggeringConditionDetectedCells()
    {
	return (NonUsedFreqTriggeringConditionDetectedCells)mComponents[2];
    }
    
    public void setNonUsedFreqTriggeringConditionDetectedCells(NonUsedFreqTriggeringConditionDetectedCells nonUsedFreqTriggeringConditionDetectedCells)
    {
	mComponents[2] = nonUsedFreqTriggeringConditionDetectedCells;
    }
    
    public boolean hasNonUsedFreqTriggeringConditionDetectedCells()
    {
	return componentIsPresent(2);
    }
    
    public void deleteNonUsedFreqTriggeringConditionDetectedCells()
    {
	setComponentAbsent(2);
    }
    
    
    
    /**
     * Define the ASN1 Type NonUsedFreqTriggeringConditionDetectedCells from ASN1 Module InformationElements.
     * @see Enumerated
     */
    public static final class NonUsedFreqTriggeringConditionDetectedCells extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private NonUsedFreqTriggeringConditionDetectedCells()
	{
	    super(cFirstNumber);
	}
	
	protected NonUsedFreqTriggeringConditionDetectedCells(long value)
	{
	    super(value);
	}
	
	// Named list definitions.
	public static final NonUsedFreqTriggeringConditionDetectedCells _true =
	    new NonUsedFreqTriggeringConditionDetectedCells(0);
	private final static NonUsedFreqTriggeringConditionDetectedCells cNamedNumbers[] = {
	     _true
	};
	protected final static long cFirstNumber = 0;
	protected final static boolean cLinearNumbers = false;
	
	public Enumerated[] getNamedNumbers()
	{
	    return cNamedNumbers;
	}
	
	public boolean hasLinearNumbers()
	{
	    return cLinearNumbers;
	}
	
	public long getFirstNumber()
	{
	    return cFirstNumber;
	}
	
	public static NonUsedFreqTriggeringConditionDetectedCells valueOf(long value)
	{
	    return (NonUsedFreqTriggeringConditionDetectedCells)_true.lookupValue(value);
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final EnumeratedInfo c_typeinfo = new EnumeratedInfo (
	    new Tags (
		new short[] {
		    (short)0x8002
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"NonUsedFreqParameter_r10$NonUsedFreqTriggeringConditionDetectedCells"
	    ),
	    new QName (
		"builtin",
		"ENUMERATED"
	    ),
	    12314,
	    null,
	    new MemberList (
		new MemberListElement[] {
		    new MemberListElement (
			"true",
			0
		    )
		}
	    ),
	    0,
	    _true
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' NonUsedFreqTriggeringConditionDetectedCells object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' NonUsedFreqTriggeringConditionDetectedCells object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for NonUsedFreqTriggeringConditionDetectedCells

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
	    "NonUsedFreqParameter_r10"
	),
	new QName (
	    "InformationElements",
	    "NonUsedFreqParameter-r10"
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
				"Threshold_r6"
			    ),
			    new QName (
				"InformationElements",
				"Threshold-r6"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new Threshold_r6(-120), 
				    new Threshold_r6(0),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(-120),
				new java.lang.Long(0)
			    ),
			    null
			)
		    ),
		    "nonUsedFreqThreshold",
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
				"W"
			    ),
			    new QName (
				"InformationElements",
				"W"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new W(0), 
				    new W(20),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(20)
			    ),
			    null
			)
		    ),
		    "nonUsedFreqW",
		    1,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "NonUsedFreqParameter_r10$NonUsedFreqTriggeringConditionDetectedCells"
			)
		    ),
		    "nonUsedFreqTriggeringConditionDetectedCells",
		    2,
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
     * Get the type descriptor (TypeInfo) of 'this' NonUsedFreqParameter_r10 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' NonUsedFreqParameter_r10 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for NonUsedFreqParameter_r10
