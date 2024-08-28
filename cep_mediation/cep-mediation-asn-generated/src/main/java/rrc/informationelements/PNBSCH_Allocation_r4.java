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
 * Define the ASN1 Type PNBSCH_Allocation_r4 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class PNBSCH_Allocation_r4 extends Sequence {
    
    /**
     * The default constructor.
     */
    public PNBSCH_Allocation_r4()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public PNBSCH_Allocation_r4(NumberOfRepetitionsPerSFNPeriod numberOfRepetitionsPerSFNPeriod)
    {
	setNumberOfRepetitionsPerSFNPeriod(numberOfRepetitionsPerSFNPeriod);
    }
    
    public void initComponents()
    {
	mComponents[0] = NumberOfRepetitionsPerSFNPeriod.c2;
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[1];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return NumberOfRepetitionsPerSFNPeriod.c2;
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "numberOfRepetitionsPerSFNPeriod"
    public NumberOfRepetitionsPerSFNPeriod getNumberOfRepetitionsPerSFNPeriod()
    {
	return (NumberOfRepetitionsPerSFNPeriod)mComponents[0];
    }
    
    public void setNumberOfRepetitionsPerSFNPeriod(NumberOfRepetitionsPerSFNPeriod numberOfRepetitionsPerSFNPeriod)
    {
	mComponents[0] = numberOfRepetitionsPerSFNPeriod;
    }
    
    
    
    /**
     * Define the ASN1 Type NumberOfRepetitionsPerSFNPeriod from ASN1 Module InformationElements.
     * @see Enumerated
     */
    public static final class NumberOfRepetitionsPerSFNPeriod extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private NumberOfRepetitionsPerSFNPeriod()
	{
	    super(cFirstNumber);
	}
	
	protected NumberOfRepetitionsPerSFNPeriod(long value)
	{
	    super(value);
	}
	
	// Named list definitions.
	public static final NumberOfRepetitionsPerSFNPeriod c2 =
	    new NumberOfRepetitionsPerSFNPeriod(0);
	public static final NumberOfRepetitionsPerSFNPeriod c3 =
	    new NumberOfRepetitionsPerSFNPeriod(1);
	public static final NumberOfRepetitionsPerSFNPeriod c4 =
	    new NumberOfRepetitionsPerSFNPeriod(2);
	public static final NumberOfRepetitionsPerSFNPeriod c5 =
	    new NumberOfRepetitionsPerSFNPeriod(3);
	public static final NumberOfRepetitionsPerSFNPeriod c6 =
	    new NumberOfRepetitionsPerSFNPeriod(4);
	public static final NumberOfRepetitionsPerSFNPeriod c7 =
	    new NumberOfRepetitionsPerSFNPeriod(5);
	public static final NumberOfRepetitionsPerSFNPeriod c8 =
	    new NumberOfRepetitionsPerSFNPeriod(6);
	public static final NumberOfRepetitionsPerSFNPeriod c9 =
	    new NumberOfRepetitionsPerSFNPeriod(7);
	public static final NumberOfRepetitionsPerSFNPeriod c10 =
	    new NumberOfRepetitionsPerSFNPeriod(8);
	public static final NumberOfRepetitionsPerSFNPeriod c12 =
	    new NumberOfRepetitionsPerSFNPeriod(9);
	public static final NumberOfRepetitionsPerSFNPeriod c14 =
	    new NumberOfRepetitionsPerSFNPeriod(10);
	public static final NumberOfRepetitionsPerSFNPeriod c16 =
	    new NumberOfRepetitionsPerSFNPeriod(11);
	public static final NumberOfRepetitionsPerSFNPeriod c18 =
	    new NumberOfRepetitionsPerSFNPeriod(12);
	public static final NumberOfRepetitionsPerSFNPeriod c20 =
	    new NumberOfRepetitionsPerSFNPeriod(13);
	public static final NumberOfRepetitionsPerSFNPeriod c24 =
	    new NumberOfRepetitionsPerSFNPeriod(14);
	public static final NumberOfRepetitionsPerSFNPeriod c28 =
	    new NumberOfRepetitionsPerSFNPeriod(15);
	public static final NumberOfRepetitionsPerSFNPeriod c32 =
	    new NumberOfRepetitionsPerSFNPeriod(16);
	public static final NumberOfRepetitionsPerSFNPeriod c36 =
	    new NumberOfRepetitionsPerSFNPeriod(17);
	public static final NumberOfRepetitionsPerSFNPeriod c40 =
	    new NumberOfRepetitionsPerSFNPeriod(18);
	public static final NumberOfRepetitionsPerSFNPeriod c48 =
	    new NumberOfRepetitionsPerSFNPeriod(19);
	public static final NumberOfRepetitionsPerSFNPeriod c56 =
	    new NumberOfRepetitionsPerSFNPeriod(20);
	public static final NumberOfRepetitionsPerSFNPeriod c64 =
	    new NumberOfRepetitionsPerSFNPeriod(21);
	public static final NumberOfRepetitionsPerSFNPeriod c72 =
	    new NumberOfRepetitionsPerSFNPeriod(22);
	public static final NumberOfRepetitionsPerSFNPeriod c80 =
	    new NumberOfRepetitionsPerSFNPeriod(23);
	private final static NumberOfRepetitionsPerSFNPeriod cNamedNumbers[] = {
	     c2, 
	     c3, 
	     c4, 
	     c5, 
	     c6, 
	     c7, 
	     c8, 
	     c9, 
	     c10, 
	     c12, 
	     c14, 
	     c16, 
	     c18, 
	     c20, 
	     c24, 
	     c28, 
	     c32, 
	     c36, 
	     c40, 
	     c48, 
	     c56, 
	     c64, 
	     c72, 
	     c80
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
	
	public static NumberOfRepetitionsPerSFNPeriod valueOf(long value)
	{
	    return (NumberOfRepetitionsPerSFNPeriod)c2.lookupValue(value);
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final EnumeratedInfo c_typeinfo = new EnumeratedInfo (
	    new Tags (
		new short[] {
		    (short)0x8000
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"PNBSCH_Allocation_r4$NumberOfRepetitionsPerSFNPeriod"
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
			"c2",
			0
		    ),
		    new MemberListElement (
			"c3",
			1
		    ),
		    new MemberListElement (
			"c4",
			2
		    ),
		    new MemberListElement (
			"c5",
			3
		    ),
		    new MemberListElement (
			"c6",
			4
		    ),
		    new MemberListElement (
			"c7",
			5
		    ),
		    new MemberListElement (
			"c8",
			6
		    ),
		    new MemberListElement (
			"c9",
			7
		    ),
		    new MemberListElement (
			"c10",
			8
		    ),
		    new MemberListElement (
			"c12",
			9
		    ),
		    new MemberListElement (
			"c14",
			10
		    ),
		    new MemberListElement (
			"c16",
			11
		    ),
		    new MemberListElement (
			"c18",
			12
		    ),
		    new MemberListElement (
			"c20",
			13
		    ),
		    new MemberListElement (
			"c24",
			14
		    ),
		    new MemberListElement (
			"c28",
			15
		    ),
		    new MemberListElement (
			"c32",
			16
		    ),
		    new MemberListElement (
			"c36",
			17
		    ),
		    new MemberListElement (
			"c40",
			18
		    ),
		    new MemberListElement (
			"c48",
			19
		    ),
		    new MemberListElement (
			"c56",
			20
		    ),
		    new MemberListElement (
			"c64",
			21
		    ),
		    new MemberListElement (
			"c72",
			22
		    ),
		    new MemberListElement (
			"c80",
			23
		    )
		}
	    ),
	    0,
	    c2
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' NumberOfRepetitionsPerSFNPeriod object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' NumberOfRepetitionsPerSFNPeriod object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for NumberOfRepetitionsPerSFNPeriod

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
	    "PNBSCH_Allocation_r4"
	),
	new QName (
	    "InformationElements",
	    "PNBSCH-Allocation-r4"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "PNBSCH_Allocation_r4$NumberOfRepetitionsPerSFNPeriod"
			)
		    ),
		    "numberOfRepetitionsPerSFNPeriod",
		    0,
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
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' PNBSCH_Allocation_r4 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' PNBSCH_Allocation_r4 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for PNBSCH_Allocation_r4
