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
 * Define the ASN1 Type NonContiguousMultiCell from ASN1 Module InformationElements.
 * @see Sequence
 */

public class NonContiguousMultiCell extends Sequence {
    
    /**
     * The default constructor.
     */
    public NonContiguousMultiCell()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public NonContiguousMultiCell(AggregatedCells aggregatedCells, 
		    GapSize gapSize, 
		    NonContiguousMultiCellCombination22 nonContiguousMultiCellCombination22, 
		    NonContiguousMultiCellCombination31_13 nonContiguousMultiCellCombination31_13)
    {
	setAggregatedCells(aggregatedCells);
	setGapSize(gapSize);
	setNonContiguousMultiCellCombination22(nonContiguousMultiCellCombination22);
	setNonContiguousMultiCellCombination31_13(nonContiguousMultiCellCombination31_13);
    }
    
    /**
     * Construct with required components.
     */
    public NonContiguousMultiCell(AggregatedCells aggregatedCells, 
		    GapSize gapSize)
    {
	setAggregatedCells(aggregatedCells);
	setGapSize(gapSize);
    }
    
    public void initComponents()
    {
	mComponents[0] = AggregatedCells.nc_2c;
	mComponents[1] = GapSize.fiveMHz;
	mComponents[2] = NonContiguousMultiCellCombination22._true;
	mComponents[3] = NonContiguousMultiCellCombination31_13._true;
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[4];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return AggregatedCells.nc_2c;
	    case 1:
		return GapSize.fiveMHz;
	    case 2:
		return NonContiguousMultiCellCombination22._true;
	    case 3:
		return NonContiguousMultiCellCombination31_13._true;
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "aggregatedCells"
    public AggregatedCells getAggregatedCells()
    {
	return (AggregatedCells)mComponents[0];
    }
    
    public void setAggregatedCells(AggregatedCells aggregatedCells)
    {
	mComponents[0] = aggregatedCells;
    }
    
    
    
    /**
     * Define the ASN1 Type AggregatedCells from ASN1 Module InformationElements.
     * @see Enumerated
     */
    public static final class AggregatedCells extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private AggregatedCells()
	{
	    super(cFirstNumber);
	}
	
	protected AggregatedCells(long value)
	{
	    super(value);
	}
	
	// Named list definitions.
	public static final AggregatedCells nc_2c =
	    new AggregatedCells(0);
	public static final AggregatedCells nc_3c =
	    new AggregatedCells(1);
	public static final AggregatedCells nc_4c =
	    new AggregatedCells(2);
	private final static AggregatedCells cNamedNumbers[] = {
	     nc_2c, 
	     nc_3c, 
	     nc_4c
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
	
	public static AggregatedCells valueOf(long value)
	{
	    return (AggregatedCells)nc_2c.lookupValue(value);
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
		"NonContiguousMultiCell$AggregatedCells"
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
			"nc-2c",
			0
		    ),
		    new MemberListElement (
			"nc-3c",
			1
		    ),
		    new MemberListElement (
			"nc-4c",
			2
		    )
		}
	    ),
	    0,
	    nc_2c
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' AggregatedCells object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' AggregatedCells object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for AggregatedCells

    // Methods for field "gapSize"
    public GapSize getGapSize()
    {
	return (GapSize)mComponents[1];
    }
    
    public void setGapSize(GapSize gapSize)
    {
	mComponents[1] = gapSize;
    }
    
    
    
    /**
     * Define the ASN1 Type GapSize from ASN1 Module InformationElements.
     * @see Enumerated
     */
    public static final class GapSize extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private GapSize()
	{
	    super(cFirstNumber);
	}
	
	protected GapSize(long value)
	{
	    super(value);
	}
	
	// Named list definitions.
	public static final GapSize fiveMHz =
	    new GapSize(0);
	public static final GapSize tenMHz =
	    new GapSize(1);
	public static final GapSize anyGapSize =
	    new GapSize(2);
	public static final GapSize spare5 =
	    new GapSize(3);
	public static final GapSize spare4 =
	    new GapSize(4);
	public static final GapSize spare3 =
	    new GapSize(5);
	public static final GapSize spare2 =
	    new GapSize(6);
	public static final GapSize spare1 =
	    new GapSize(7);
	private final static GapSize cNamedNumbers[] = {
	     fiveMHz, 
	     tenMHz, 
	     anyGapSize, 
	     spare5, 
	     spare4, 
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
	
	public static GapSize valueOf(long value)
	{
	    return (GapSize)fiveMHz.lookupValue(value);
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
		"NonContiguousMultiCell$GapSize"
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
			"fiveMHz",
			0
		    ),
		    new MemberListElement (
			"tenMHz",
			1
		    ),
		    new MemberListElement (
			"anyGapSize",
			2
		    ),
		    new MemberListElement (
			"spare5",
			3
		    ),
		    new MemberListElement (
			"spare4",
			4
		    ),
		    new MemberListElement (
			"spare3",
			5
		    ),
		    new MemberListElement (
			"spare2",
			6
		    ),
		    new MemberListElement (
			"spare1",
			7
		    )
		}
	    ),
	    0,
	    fiveMHz
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' GapSize object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' GapSize object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for GapSize

    // Methods for field "nonContiguousMultiCellCombination22"
    public NonContiguousMultiCellCombination22 getNonContiguousMultiCellCombination22()
    {
	return (NonContiguousMultiCellCombination22)mComponents[2];
    }
    
    public void setNonContiguousMultiCellCombination22(NonContiguousMultiCellCombination22 nonContiguousMultiCellCombination22)
    {
	mComponents[2] = nonContiguousMultiCellCombination22;
    }
    
    public boolean hasNonContiguousMultiCellCombination22()
    {
	return componentIsPresent(2);
    }
    
    public void deleteNonContiguousMultiCellCombination22()
    {
	setComponentAbsent(2);
    }
    
    
    
    /**
     * Define the ASN1 Type NonContiguousMultiCellCombination22 from ASN1 Module InformationElements.
     * @see Enumerated
     */
    public static final class NonContiguousMultiCellCombination22 extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private NonContiguousMultiCellCombination22()
	{
	    super(cFirstNumber);
	}
	
	protected NonContiguousMultiCellCombination22(long value)
	{
	    super(value);
	}
	
	// Named list definitions.
	public static final NonContiguousMultiCellCombination22 _true =
	    new NonContiguousMultiCellCombination22(0);
	private final static NonContiguousMultiCellCombination22 cNamedNumbers[] = {
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
	
	public static NonContiguousMultiCellCombination22 valueOf(long value)
	{
	    return (NonContiguousMultiCellCombination22)_true.lookupValue(value);
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
		"NonContiguousMultiCell$NonContiguousMultiCellCombination22"
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
	 * Get the type descriptor (TypeInfo) of 'this' NonContiguousMultiCellCombination22 object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' NonContiguousMultiCellCombination22 object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for NonContiguousMultiCellCombination22

    // Methods for field "nonContiguousMultiCellCombination31_13"
    public NonContiguousMultiCellCombination31_13 getNonContiguousMultiCellCombination31_13()
    {
	return (NonContiguousMultiCellCombination31_13)mComponents[3];
    }
    
    public void setNonContiguousMultiCellCombination31_13(NonContiguousMultiCellCombination31_13 nonContiguousMultiCellCombination31_13)
    {
	mComponents[3] = nonContiguousMultiCellCombination31_13;
    }
    
    public boolean hasNonContiguousMultiCellCombination31_13()
    {
	return componentIsPresent(3);
    }
    
    public void deleteNonContiguousMultiCellCombination31_13()
    {
	setComponentAbsent(3);
    }
    
    
    
    /**
     * Define the ASN1 Type NonContiguousMultiCellCombination31_13 from ASN1 Module InformationElements.
     * @see Enumerated
     */
    public static final class NonContiguousMultiCellCombination31_13 extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private NonContiguousMultiCellCombination31_13()
	{
	    super(cFirstNumber);
	}
	
	protected NonContiguousMultiCellCombination31_13(long value)
	{
	    super(value);
	}
	
	// Named list definitions.
	public static final NonContiguousMultiCellCombination31_13 _true =
	    new NonContiguousMultiCellCombination31_13(0);
	private final static NonContiguousMultiCellCombination31_13 cNamedNumbers[] = {
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
	
	public static NonContiguousMultiCellCombination31_13 valueOf(long value)
	{
	    return (NonContiguousMultiCellCombination31_13)_true.lookupValue(value);
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final EnumeratedInfo c_typeinfo = new EnumeratedInfo (
	    new Tags (
		new short[] {
		    (short)0x8003
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"NonContiguousMultiCell$NonContiguousMultiCellCombination31_13"
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
	 * Get the type descriptor (TypeInfo) of 'this' NonContiguousMultiCellCombination31_13 object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' NonContiguousMultiCellCombination31_13 object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for NonContiguousMultiCellCombination31_13

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
	    "NonContiguousMultiCell"
	),
	new QName (
	    "InformationElements",
	    "NonContiguousMultiCell"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "NonContiguousMultiCell$AggregatedCells"
			)
		    ),
		    "aggregatedCells",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "NonContiguousMultiCell$GapSize"
			)
		    ),
		    "gapSize",
		    1,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "NonContiguousMultiCell$NonContiguousMultiCellCombination22"
			)
		    ),
		    "nonContiguousMultiCellCombination22",
		    2,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "NonContiguousMultiCell$NonContiguousMultiCellCombination31_13"
			)
		    ),
		    "nonContiguousMultiCellCombination31-13",
		    3,
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
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8003, 3)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' NonContiguousMultiCell object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' NonContiguousMultiCell object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for NonContiguousMultiCell
