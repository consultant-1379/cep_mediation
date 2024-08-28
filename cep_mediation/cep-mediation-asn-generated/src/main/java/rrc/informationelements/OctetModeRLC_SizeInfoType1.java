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
 * Define the ASN1 Type OctetModeRLC_SizeInfoType1 from ASN1 Module InformationElements.
 * @see Choice
 */

public class OctetModeRLC_SizeInfoType1 extends Choice {
    
    /**
     * The default constructor.
     */
    public OctetModeRLC_SizeInfoType1()
    {
    }
    
    public static final  int  sizeType1_chosen = 1;
    public static final  int  sizeType2_chosen = 2;
    public static final  int  sizeType3_chosen = 3;
    
    // Methods for field "sizeType1"
    public static OctetModeRLC_SizeInfoType1 createOctetModeRLC_SizeInfoType1WithSizeType1(long sizeType1)
    {
	return createOctetModeRLC_SizeInfoType1WithSizeType1(new INTEGER(sizeType1));
    }
    
    public static OctetModeRLC_SizeInfoType1 createOctetModeRLC_SizeInfoType1WithSizeType1(INTEGER sizeType1)
    {
	OctetModeRLC_SizeInfoType1 __object = new OctetModeRLC_SizeInfoType1();

	__object.setSizeType1(sizeType1);
	return __object;
    }
    
    public boolean hasSizeType1()
    {
	return getChosenFlag() == sizeType1_chosen;
    }
    
    public void setSizeType1(long sizeType1)
    {
	setSizeType1(new INTEGER(sizeType1));
    }
    
    public void setSizeType1(INTEGER sizeType1)
    {
	setChosenValue(sizeType1);
	setChosenFlag(sizeType1_chosen);
    }
    
    
    // Methods for field "sizeType2"
    public static OctetModeRLC_SizeInfoType1 createOctetModeRLC_SizeInfoType1WithSizeType2(SizeType2 sizeType2)
    {
	OctetModeRLC_SizeInfoType1 __object = new OctetModeRLC_SizeInfoType1();

	__object.setSizeType2(sizeType2);
	return __object;
    }
    
    public boolean hasSizeType2()
    {
	return getChosenFlag() == sizeType2_chosen;
    }
    
    public void setSizeType2(SizeType2 sizeType2)
    {
	setChosenValue(sizeType2);
	setChosenFlag(sizeType2_chosen);
    }
    
    
    
    /**
     * Define the ASN1 Type SizeType2 from ASN1 Module InformationElements.
     * @see Sequence
     */
    public static class SizeType2 extends Sequence {
	
	/**
	 * The default constructor.
	 */
	public SizeType2()
	{
	}
	
	/**
	 * Construct with AbstractData components.
	 */
	public SizeType2(INTEGER part1, INTEGER part2)
	{
	    setPart1(part1);
	    setPart2(part2);
	}
	
	/**
	 * Construct with components.
	 */
	public SizeType2(long part1, long part2)
	{
	    this(new INTEGER(part1), new INTEGER(part2));
	}
	
	/**
	 * Construct with required components.
	 */
	public SizeType2(long part1)
	{
	    setPart1(part1);
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
	
	
	// Methods for field "part1"
	public long getPart1()
	{
	    return ((INTEGER)mComponents[0]).longValue();
	}
	
	public void setPart1(long part1)
	{
	    setPart1(new INTEGER(part1));
	}
	
	public void setPart1(INTEGER part1)
	{
	    mComponents[0] = part1;
	}
	
	
	// Methods for field "part2"
	public long getPart2()
	{
	    return ((INTEGER)mComponents[1]).longValue();
	}
	
	public void setPart2(long part2)
	{
	    setPart2(new INTEGER(part2));
	}
	
	public void setPart2(INTEGER part2)
	{
	    mComponents[1] = part2;
	}
	
	public boolean hasPart2()
	{
	    return componentIsPresent(1);
	}
	
	public void deletePart2()
	{
	    setComponentAbsent(1);
	}
	
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final SequenceInfo c_typeinfo = new SequenceInfo (
	    new Tags (
		new short[] {
		    (short)0x8001
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"OctetModeRLC_SizeInfoType1$SizeType2"
	    ),
	    new QName (
		"builtin",
		"SEQUENCE"
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
					new com.oss.asn1.INTEGER(23),
					0
				    )
				),
				new Bounds (
				    new java.lang.Long(0),
				    new java.lang.Long(23)
				),
				null
			    )
			),
			"part1",
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
					new com.oss.asn1.INTEGER(1), 
					new com.oss.asn1.INTEGER(3),
					0
				    )
				),
				new Bounds (
				    new java.lang.Long(1),
				    new java.lang.Long(3)
				),
				null
			    )
			),
			"part2",
			1,
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
		    )
		}
	    ),
	    0
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' SizeType2 object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' SizeType2 object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for SizeType2

    // Methods for field "sizeType3"
    public static OctetModeRLC_SizeInfoType1 createOctetModeRLC_SizeInfoType1WithSizeType3(SizeType3 sizeType3)
    {
	OctetModeRLC_SizeInfoType1 __object = new OctetModeRLC_SizeInfoType1();

	__object.setSizeType3(sizeType3);
	return __object;
    }
    
    public boolean hasSizeType3()
    {
	return getChosenFlag() == sizeType3_chosen;
    }
    
    public void setSizeType3(SizeType3 sizeType3)
    {
	setChosenValue(sizeType3);
	setChosenFlag(sizeType3_chosen);
    }
    
    
    
    /**
     * Define the ASN1 Type SizeType3 from ASN1 Module InformationElements.
     * @see Sequence
     */
    public static class SizeType3 extends Sequence {
	
	/**
	 * The default constructor.
	 */
	public SizeType3()
	{
	}
	
	/**
	 * Construct with AbstractData components.
	 */
	public SizeType3(INTEGER part1, INTEGER part2)
	{
	    setPart1(part1);
	    setPart2(part2);
	}
	
	/**
	 * Construct with components.
	 */
	public SizeType3(long part1, long part2)
	{
	    this(new INTEGER(part1), new INTEGER(part2));
	}
	
	/**
	 * Construct with required components.
	 */
	public SizeType3(long part1)
	{
	    setPart1(part1);
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
	
	
	// Methods for field "part1"
	public long getPart1()
	{
	    return ((INTEGER)mComponents[0]).longValue();
	}
	
	public void setPart1(long part1)
	{
	    setPart1(new INTEGER(part1));
	}
	
	public void setPart1(INTEGER part1)
	{
	    mComponents[0] = part1;
	}
	
	
	// Methods for field "part2"
	public long getPart2()
	{
	    return ((INTEGER)mComponents[1]).longValue();
	}
	
	public void setPart2(long part2)
	{
	    setPart2(new INTEGER(part2));
	}
	
	public void setPart2(INTEGER part2)
	{
	    mComponents[1] = part2;
	}
	
	public boolean hasPart2()
	{
	    return componentIsPresent(1);
	}
	
	public void deletePart2()
	{
	    setComponentAbsent(1);
	}
	
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final SequenceInfo c_typeinfo = new SequenceInfo (
	    new Tags (
		new short[] {
		    (short)0x8002
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"OctetModeRLC_SizeInfoType1$SizeType3"
	    ),
	    new QName (
		"builtin",
		"SEQUENCE"
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
					new com.oss.asn1.INTEGER(61),
					0
				    )
				),
				new Bounds (
				    new java.lang.Long(0),
				    new java.lang.Long(61)
				),
				null
			    )
			),
			"part1",
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
					new com.oss.asn1.INTEGER(1), 
					new com.oss.asn1.INTEGER(7),
					0
				    )
				),
				new Bounds (
				    new java.lang.Long(1),
				    new java.lang.Long(7)
				),
				null
			    )
			),
			"part2",
			1,
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
		    )
		}
	    ),
	    0
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' SizeType3 object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' SizeType3 object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for SizeType3

    // Method to create a specific choice instance
    public AbstractData createInstance(int chosen)
    {
	switch (chosen) {
	    case sizeType1_chosen:
		return new INTEGER();
	    case sizeType2_chosen:
		return new SizeType2();
	    case sizeType3_chosen:
		return new SizeType3();
	    default:
		throw new InternalError("Choice.createInstance()");
	}
	
    }
    
    /**
     * Initialize the type descriptor.
     */
    private static final ChoiceInfo c_typeinfo = new ChoiceInfo (
	new Tags (
	    null
	),
	new QName (
	    "rrc.informationelements",
	    "OctetModeRLC_SizeInfoType1"
	),
	new QName (
	    "InformationElements",
	    "OctetModeRLC-SizeInfoType1"
	),
	12314,
	null,
	new Fields (
	    new FieldInfo[] {
		new FieldInfo (
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
				    new com.oss.asn1.INTEGER(31),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(31)
			    ),
			    null
			)
		    ),
		    "sizeType1",
		    0,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "OctetModeRLC_SizeInfoType1$SizeType2"
			)
		    ),
		    "sizeType2",
		    1,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "OctetModeRLC_SizeInfoType1$SizeType3"
			)
		    ),
		    "sizeType3",
		    2,
		    2
		)
	    }
	),
	0,
	new TagDecoder (
	    new TagDecoderElement[] {
		new TagDecoderElement((short)0x8000, 0),
		new TagDecoderElement((short)0x8001, 1),
		new TagDecoderElement((short)0x8002, 2)
	    }
	)
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' OctetModeRLC_SizeInfoType1 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' OctetModeRLC_SizeInfoType1 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for OctetModeRLC_SizeInfoType1
