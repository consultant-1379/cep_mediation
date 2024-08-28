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
 * Define the ASN1 Type CSG_PSCSplitInfo from ASN1 Module InformationElements.
 * @see Sequence
 */

public class CSG_PSCSplitInfo extends Sequence {
    
    /**
     * The default constructor.
     */
    public CSG_PSCSplitInfo()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public CSG_PSCSplitInfo(INTEGER startPSC, NumberOfPSCs numberOfPSCs, 
		    INTEGER pscRange2Offset)
    {
	setStartPSC(startPSC);
	setNumberOfPSCs(numberOfPSCs);
	setPscRange2Offset(pscRange2Offset);
    }
    
    /**
     * Construct with components.
     */
    public CSG_PSCSplitInfo(long startPSC, NumberOfPSCs numberOfPSCs, 
		    long pscRange2Offset)
    {
	this(new INTEGER(startPSC), numberOfPSCs, 
	     new INTEGER(pscRange2Offset));
    }
    
    /**
     * Construct with required components.
     */
    public CSG_PSCSplitInfo(long startPSC, NumberOfPSCs numberOfPSCs)
    {
	setStartPSC(startPSC);
	setNumberOfPSCs(numberOfPSCs);
    }
    
    public void initComponents()
    {
	mComponents[0] = new INTEGER();
	mComponents[1] = NumberOfPSCs.psc5;
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
		return NumberOfPSCs.psc5;
	    case 2:
		return new INTEGER();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "startPSC"
    public long getStartPSC()
    {
	return ((INTEGER)mComponents[0]).longValue();
    }
    
    public void setStartPSC(long startPSC)
    {
	setStartPSC(new INTEGER(startPSC));
    }
    
    public void setStartPSC(INTEGER startPSC)
    {
	mComponents[0] = startPSC;
    }
    
    
    // Methods for field "numberOfPSCs"
    public NumberOfPSCs getNumberOfPSCs()
    {
	return (NumberOfPSCs)mComponents[1];
    }
    
    public void setNumberOfPSCs(NumberOfPSCs numberOfPSCs)
    {
	mComponents[1] = numberOfPSCs;
    }
    
    
    
    /**
     * Define the ASN1 Type NumberOfPSCs from ASN1 Module InformationElements.
     * @see Enumerated
     */
    public static final class NumberOfPSCs extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private NumberOfPSCs()
	{
	    super(cFirstNumber);
	}
	
	protected NumberOfPSCs(long value)
	{
	    super(value);
	}
	
	// Named list definitions.
	public static final NumberOfPSCs psc5 =
	    new NumberOfPSCs(0);
	public static final NumberOfPSCs psc10 =
	    new NumberOfPSCs(1);
	public static final NumberOfPSCs psc15 =
	    new NumberOfPSCs(2);
	public static final NumberOfPSCs psc20 =
	    new NumberOfPSCs(3);
	public static final NumberOfPSCs psc30 =
	    new NumberOfPSCs(4);
	public static final NumberOfPSCs psc40 =
	    new NumberOfPSCs(5);
	public static final NumberOfPSCs psc50 =
	    new NumberOfPSCs(6);
	public static final NumberOfPSCs psc64 =
	    new NumberOfPSCs(7);
	public static final NumberOfPSCs psc80 =
	    new NumberOfPSCs(8);
	public static final NumberOfPSCs psc120 =
	    new NumberOfPSCs(9);
	public static final NumberOfPSCs psc160 =
	    new NumberOfPSCs(10);
	public static final NumberOfPSCs psc256 =
	    new NumberOfPSCs(11);
	public static final NumberOfPSCs alltheRest =
	    new NumberOfPSCs(12);
	public static final NumberOfPSCs spare3 =
	    new NumberOfPSCs(13);
	public static final NumberOfPSCs spare2 =
	    new NumberOfPSCs(14);
	public static final NumberOfPSCs spare1 =
	    new NumberOfPSCs(15);
	private final static NumberOfPSCs cNamedNumbers[] = {
	     psc5, 
	     psc10, 
	     psc15, 
	     psc20, 
	     psc30, 
	     psc40, 
	     psc50, 
	     psc64, 
	     psc80, 
	     psc120, 
	     psc160, 
	     psc256, 
	     alltheRest, 
	     spare3, 
	     spare2, 
	     spare1
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
	
	public static NumberOfPSCs valueOf(long value)
	{
	    return (NumberOfPSCs)psc5.lookupValue(value);
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final EnumeratedInfo c_typeinfo = new EnumeratedInfo (
	    new Tags (
		new short[] {
		    (short)0x8001
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"CSG_PSCSplitInfo$NumberOfPSCs"
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
			"psc5",
			0
		    ),
		    new MemberListElement (
			"psc10",
			1
		    ),
		    new MemberListElement (
			"psc15",
			2
		    ),
		    new MemberListElement (
			"psc20",
			3
		    ),
		    new MemberListElement (
			"psc30",
			4
		    ),
		    new MemberListElement (
			"psc40",
			5
		    ),
		    new MemberListElement (
			"psc50",
			6
		    ),
		    new MemberListElement (
			"psc64",
			7
		    ),
		    new MemberListElement (
			"psc80",
			8
		    ),
		    new MemberListElement (
			"psc120",
			9
		    ),
		    new MemberListElement (
			"psc160",
			10
		    ),
		    new MemberListElement (
			"psc256",
			11
		    ),
		    new MemberListElement (
			"alltheRest",
			12
		    ),
		    new MemberListElement (
			"spare3",
			13
		    ),
		    new MemberListElement (
			"spare2",
			14
		    ),
		    new MemberListElement (
			"spare1",
			15
		    )
		}
	    ),
	    0,
	    psc5
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' NumberOfPSCs object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' NumberOfPSCs object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for NumberOfPSCs

    // Methods for field "pscRange2Offset"
    public long getPscRange2Offset()
    {
	return ((INTEGER)mComponents[2]).longValue();
    }
    
    public void setPscRange2Offset(long pscRange2Offset)
    {
	setPscRange2Offset(new INTEGER(pscRange2Offset));
    }
    
    public void setPscRange2Offset(INTEGER pscRange2Offset)
    {
	mComponents[2] = pscRange2Offset;
    }
    
    public boolean hasPscRange2Offset()
    {
	return componentIsPresent(2);
    }
    
    public void deletePscRange2Offset()
    {
	setComponentAbsent(2);
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
	    "CSG_PSCSplitInfo"
	),
	new QName (
	    "InformationElements",
	    "CSG-PSCSplitInfo"
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
				    new com.oss.asn1.INTEGER(63),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(63)
			    ),
			    null
			)
		    ),
		    "startPSC",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "CSG_PSCSplitInfo$NumberOfPSCs"
			)
		    ),
		    "numberOfPSCs",
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
				    new com.oss.asn1.INTEGER(63),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(63)
			    ),
			    null
			)
		    ),
		    "pscRange2Offset",
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
     * Get the type descriptor (TypeInfo) of 'this' CSG_PSCSplitInfo object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' CSG_PSCSplitInfo object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for CSG_PSCSplitInfo
