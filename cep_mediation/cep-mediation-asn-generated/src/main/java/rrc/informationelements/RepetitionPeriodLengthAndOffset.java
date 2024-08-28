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
 * Define the ASN1 Type RepetitionPeriodLengthAndOffset from ASN1 Module InformationElements.
 * @see Choice
 */

public class RepetitionPeriodLengthAndOffset extends Choice {
    
    /**
     * The default constructor.
     */
    public RepetitionPeriodLengthAndOffset()
    {
    }
    
    public static final  int  repetitionPeriod1_chosen = 1;
    public static final  int  repetitionPeriod2_chosen = 2;
    public static final  int  repetitionPeriod4_chosen = 3;
    public static final  int  repetitionPeriod8_chosen = 4;
    public static final  int  repetitionPeriod16_chosen = 5;
    public static final  int  repetitionPeriod32_chosen = 6;
    public static final  int  repetitionPeriod64_chosen = 7;
    
    // Methods for field "repetitionPeriod1"
    public static RepetitionPeriodLengthAndOffset createRepetitionPeriodLengthAndOffsetWithRepetitionPeriod1(Null repetitionPeriod1)
    {
	RepetitionPeriodLengthAndOffset __object = new RepetitionPeriodLengthAndOffset();

	__object.setRepetitionPeriod1(repetitionPeriod1);
	return __object;
    }
    
    public boolean hasRepetitionPeriod1()
    {
	return getChosenFlag() == repetitionPeriod1_chosen;
    }
    
    public void setRepetitionPeriod1(Null repetitionPeriod1)
    {
	setChosenValue(repetitionPeriod1);
	setChosenFlag(repetitionPeriod1_chosen);
    }
    
    
    // Methods for field "repetitionPeriod2"
    public static RepetitionPeriodLengthAndOffset createRepetitionPeriodLengthAndOffsetWithRepetitionPeriod2(RepetitionPeriod2 repetitionPeriod2)
    {
	RepetitionPeriodLengthAndOffset __object = new RepetitionPeriodLengthAndOffset();

	__object.setRepetitionPeriod2(repetitionPeriod2);
	return __object;
    }
    
    public boolean hasRepetitionPeriod2()
    {
	return getChosenFlag() == repetitionPeriod2_chosen;
    }
    
    public void setRepetitionPeriod2(RepetitionPeriod2 repetitionPeriod2)
    {
	setChosenValue(repetitionPeriod2);
	setChosenFlag(repetitionPeriod2_chosen);
    }
    
    
    
    /**
     * Define the ASN1 Type RepetitionPeriod2 from ASN1 Module InformationElements.
     * @see Sequence
     */
    public static class RepetitionPeriod2 extends Sequence {
	
	/**
	 * The default constructor.
	 */
	public RepetitionPeriod2()
	{
	}
	
	/**
	 * Construct with AbstractData components.
	 */
	public RepetitionPeriod2(Null length, INTEGER offset)
	{
	    setLength(length);
	    setOffset(offset);
	}
	
	/**
	 * Construct with components.
	 */
	public RepetitionPeriod2(Null length, long offset)
	{
	    this(length, new INTEGER(offset));
	}
	
	public void initComponents()
	{
	    mComponents[0] = new Null();
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
		    return new Null();
		case 1:
		    return new INTEGER();
		default:
		    throw new InternalError("AbstractCollection.createInstance()");
	    }
	    
	}
	
	
	// Methods for field "length"
	public Null getLength()
	{
	    return (Null)mComponents[0];
	}
	
	public void setLength(Null length)
	{
	    mComponents[0] = length;
	}
	
	
	// Methods for field "offset"
	public long getOffset()
	{
	    return ((INTEGER)mComponents[1]).longValue();
	}
	
	public void setOffset(long offset)
	{
	    setOffset(new INTEGER(offset));
	}
	
	public void setOffset(INTEGER offset)
	{
	    mComponents[1] = offset;
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
		"RepetitionPeriodLengthAndOffset$RepetitionPeriod2"
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
			    new TypeInfo (
				new Tags (
				    new short[] {
					(short)0x8000
				    }
				),
				new QName (
				    "com.oss.asn1",
				    "Null"
				),
				new QName (
				    "builtin",
				    "NULL"
				),
				12314,
				null
			    )
			),
			"length",
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
					new com.oss.asn1.INTEGER(0), 
					new com.oss.asn1.INTEGER(1),
					0
				    )
				),
				new Bounds (
				    new java.lang.Long(0),
				    new java.lang.Long(1)
				),
				null
			    )
			),
			"offset",
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
	 * Get the type descriptor (TypeInfo) of 'this' RepetitionPeriod2 object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' RepetitionPeriod2 object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for RepetitionPeriod2

    // Methods for field "repetitionPeriod4"
    public static RepetitionPeriodLengthAndOffset createRepetitionPeriodLengthAndOffsetWithRepetitionPeriod4(RepetitionPeriod4 repetitionPeriod4)
    {
	RepetitionPeriodLengthAndOffset __object = new RepetitionPeriodLengthAndOffset();

	__object.setRepetitionPeriod4(repetitionPeriod4);
	return __object;
    }
    
    public boolean hasRepetitionPeriod4()
    {
	return getChosenFlag() == repetitionPeriod4_chosen;
    }
    
    public void setRepetitionPeriod4(RepetitionPeriod4 repetitionPeriod4)
    {
	setChosenValue(repetitionPeriod4);
	setChosenFlag(repetitionPeriod4_chosen);
    }
    
    
    
    /**
     * Define the ASN1 Type RepetitionPeriod4 from ASN1 Module InformationElements.
     * @see Sequence
     */
    public static class RepetitionPeriod4 extends Sequence {
	
	/**
	 * The default constructor.
	 */
	public RepetitionPeriod4()
	{
	}
	
	/**
	 * Construct with AbstractData components.
	 */
	public RepetitionPeriod4(INTEGER length, INTEGER offset)
	{
	    setLength(length);
	    setOffset(offset);
	}
	
	/**
	 * Construct with components.
	 */
	public RepetitionPeriod4(long length, long offset)
	{
	    this(new INTEGER(length), new INTEGER(offset));
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
	
	
	// Methods for field "length"
	public long getLength()
	{
	    return ((INTEGER)mComponents[0]).longValue();
	}
	
	public void setLength(long length)
	{
	    setLength(new INTEGER(length));
	}
	
	public void setLength(INTEGER length)
	{
	    mComponents[0] = length;
	}
	
	
	// Methods for field "offset"
	public long getOffset()
	{
	    return ((INTEGER)mComponents[1]).longValue();
	}
	
	public void setOffset(long offset)
	{
	    setOffset(new INTEGER(offset));
	}
	
	public void setOffset(INTEGER offset)
	{
	    mComponents[1] = offset;
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
		"RepetitionPeriodLengthAndOffset$RepetitionPeriod4"
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
			"length",
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
					new com.oss.asn1.INTEGER(0), 
					new com.oss.asn1.INTEGER(3),
					0
				    )
				),
				new Bounds (
				    new java.lang.Long(0),
				    new java.lang.Long(3)
				),
				null
			    )
			),
			"offset",
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
	 * Get the type descriptor (TypeInfo) of 'this' RepetitionPeriod4 object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' RepetitionPeriod4 object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for RepetitionPeriod4

    // Methods for field "repetitionPeriod8"
    public static RepetitionPeriodLengthAndOffset createRepetitionPeriodLengthAndOffsetWithRepetitionPeriod8(RepetitionPeriod8 repetitionPeriod8)
    {
	RepetitionPeriodLengthAndOffset __object = new RepetitionPeriodLengthAndOffset();

	__object.setRepetitionPeriod8(repetitionPeriod8);
	return __object;
    }
    
    public boolean hasRepetitionPeriod8()
    {
	return getChosenFlag() == repetitionPeriod8_chosen;
    }
    
    public void setRepetitionPeriod8(RepetitionPeriod8 repetitionPeriod8)
    {
	setChosenValue(repetitionPeriod8);
	setChosenFlag(repetitionPeriod8_chosen);
    }
    
    
    
    /**
     * Define the ASN1 Type RepetitionPeriod8 from ASN1 Module InformationElements.
     * @see Sequence
     */
    public static class RepetitionPeriod8 extends Sequence {
	
	/**
	 * The default constructor.
	 */
	public RepetitionPeriod8()
	{
	}
	
	/**
	 * Construct with AbstractData components.
	 */
	public RepetitionPeriod8(INTEGER length, INTEGER offset)
	{
	    setLength(length);
	    setOffset(offset);
	}
	
	/**
	 * Construct with components.
	 */
	public RepetitionPeriod8(long length, long offset)
	{
	    this(new INTEGER(length), new INTEGER(offset));
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
	
	
	// Methods for field "length"
	public long getLength()
	{
	    return ((INTEGER)mComponents[0]).longValue();
	}
	
	public void setLength(long length)
	{
	    setLength(new INTEGER(length));
	}
	
	public void setLength(INTEGER length)
	{
	    mComponents[0] = length;
	}
	
	
	// Methods for field "offset"
	public long getOffset()
	{
	    return ((INTEGER)mComponents[1]).longValue();
	}
	
	public void setOffset(long offset)
	{
	    setOffset(new INTEGER(offset));
	}
	
	public void setOffset(INTEGER offset)
	{
	    mComponents[1] = offset;
	}
	
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final SequenceInfo c_typeinfo = new SequenceInfo (
	    new Tags (
		new short[] {
		    (short)0x8003
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"RepetitionPeriodLengthAndOffset$RepetitionPeriod8"
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
			"length",
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
					new com.oss.asn1.INTEGER(0), 
					new com.oss.asn1.INTEGER(7),
					0
				    )
				),
				new Bounds (
				    new java.lang.Long(0),
				    new java.lang.Long(7)
				),
				null
			    )
			),
			"offset",
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
	 * Get the type descriptor (TypeInfo) of 'this' RepetitionPeriod8 object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' RepetitionPeriod8 object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for RepetitionPeriod8

    // Methods for field "repetitionPeriod16"
    public static RepetitionPeriodLengthAndOffset createRepetitionPeriodLengthAndOffsetWithRepetitionPeriod16(RepetitionPeriod16 repetitionPeriod16)
    {
	RepetitionPeriodLengthAndOffset __object = new RepetitionPeriodLengthAndOffset();

	__object.setRepetitionPeriod16(repetitionPeriod16);
	return __object;
    }
    
    public boolean hasRepetitionPeriod16()
    {
	return getChosenFlag() == repetitionPeriod16_chosen;
    }
    
    public void setRepetitionPeriod16(RepetitionPeriod16 repetitionPeriod16)
    {
	setChosenValue(repetitionPeriod16);
	setChosenFlag(repetitionPeriod16_chosen);
    }
    
    
    
    /**
     * Define the ASN1 Type RepetitionPeriod16 from ASN1 Module InformationElements.
     * @see Sequence
     */
    public static class RepetitionPeriod16 extends Sequence {
	
	/**
	 * The default constructor.
	 */
	public RepetitionPeriod16()
	{
	}
	
	/**
	 * Construct with AbstractData components.
	 */
	public RepetitionPeriod16(INTEGER length, INTEGER offset)
	{
	    setLength(length);
	    setOffset(offset);
	}
	
	/**
	 * Construct with components.
	 */
	public RepetitionPeriod16(long length, long offset)
	{
	    this(new INTEGER(length), new INTEGER(offset));
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
	
	
	// Methods for field "length"
	public long getLength()
	{
	    return ((INTEGER)mComponents[0]).longValue();
	}
	
	public void setLength(long length)
	{
	    setLength(new INTEGER(length));
	}
	
	public void setLength(INTEGER length)
	{
	    mComponents[0] = length;
	}
	
	
	// Methods for field "offset"
	public long getOffset()
	{
	    return ((INTEGER)mComponents[1]).longValue();
	}
	
	public void setOffset(long offset)
	{
	    setOffset(new INTEGER(offset));
	}
	
	public void setOffset(INTEGER offset)
	{
	    mComponents[1] = offset;
	}
	
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final SequenceInfo c_typeinfo = new SequenceInfo (
	    new Tags (
		new short[] {
		    (short)0x8004
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"RepetitionPeriodLengthAndOffset$RepetitionPeriod16"
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
					new com.oss.asn1.INTEGER(1), 
					new com.oss.asn1.INTEGER(15),
					0
				    )
				),
				new Bounds (
				    new java.lang.Long(1),
				    new java.lang.Long(15)
				),
				null
			    )
			),
			"length",
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
			"offset",
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
	 * Get the type descriptor (TypeInfo) of 'this' RepetitionPeriod16 object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' RepetitionPeriod16 object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for RepetitionPeriod16

    // Methods for field "repetitionPeriod32"
    public static RepetitionPeriodLengthAndOffset createRepetitionPeriodLengthAndOffsetWithRepetitionPeriod32(RepetitionPeriod32 repetitionPeriod32)
    {
	RepetitionPeriodLengthAndOffset __object = new RepetitionPeriodLengthAndOffset();

	__object.setRepetitionPeriod32(repetitionPeriod32);
	return __object;
    }
    
    public boolean hasRepetitionPeriod32()
    {
	return getChosenFlag() == repetitionPeriod32_chosen;
    }
    
    public void setRepetitionPeriod32(RepetitionPeriod32 repetitionPeriod32)
    {
	setChosenValue(repetitionPeriod32);
	setChosenFlag(repetitionPeriod32_chosen);
    }
    
    
    
    /**
     * Define the ASN1 Type RepetitionPeriod32 from ASN1 Module InformationElements.
     * @see Sequence
     */
    public static class RepetitionPeriod32 extends Sequence {
	
	/**
	 * The default constructor.
	 */
	public RepetitionPeriod32()
	{
	}
	
	/**
	 * Construct with AbstractData components.
	 */
	public RepetitionPeriod32(INTEGER length, INTEGER offset)
	{
	    setLength(length);
	    setOffset(offset);
	}
	
	/**
	 * Construct with components.
	 */
	public RepetitionPeriod32(long length, long offset)
	{
	    this(new INTEGER(length), new INTEGER(offset));
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
	
	
	// Methods for field "length"
	public long getLength()
	{
	    return ((INTEGER)mComponents[0]).longValue();
	}
	
	public void setLength(long length)
	{
	    setLength(new INTEGER(length));
	}
	
	public void setLength(INTEGER length)
	{
	    mComponents[0] = length;
	}
	
	
	// Methods for field "offset"
	public long getOffset()
	{
	    return ((INTEGER)mComponents[1]).longValue();
	}
	
	public void setOffset(long offset)
	{
	    setOffset(new INTEGER(offset));
	}
	
	public void setOffset(INTEGER offset)
	{
	    mComponents[1] = offset;
	}
	
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final SequenceInfo c_typeinfo = new SequenceInfo (
	    new Tags (
		new short[] {
		    (short)0x8005
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"RepetitionPeriodLengthAndOffset$RepetitionPeriod32"
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
					new com.oss.asn1.INTEGER(1), 
					new com.oss.asn1.INTEGER(31),
					0
				    )
				),
				new Bounds (
				    new java.lang.Long(1),
				    new java.lang.Long(31)
				),
				null
			    )
			),
			"length",
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
			"offset",
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
	 * Get the type descriptor (TypeInfo) of 'this' RepetitionPeriod32 object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' RepetitionPeriod32 object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for RepetitionPeriod32

    // Methods for field "repetitionPeriod64"
    public static RepetitionPeriodLengthAndOffset createRepetitionPeriodLengthAndOffsetWithRepetitionPeriod64(RepetitionPeriod64 repetitionPeriod64)
    {
	RepetitionPeriodLengthAndOffset __object = new RepetitionPeriodLengthAndOffset();

	__object.setRepetitionPeriod64(repetitionPeriod64);
	return __object;
    }
    
    public boolean hasRepetitionPeriod64()
    {
	return getChosenFlag() == repetitionPeriod64_chosen;
    }
    
    public void setRepetitionPeriod64(RepetitionPeriod64 repetitionPeriod64)
    {
	setChosenValue(repetitionPeriod64);
	setChosenFlag(repetitionPeriod64_chosen);
    }
    
    
    
    /**
     * Define the ASN1 Type RepetitionPeriod64 from ASN1 Module InformationElements.
     * @see Sequence
     */
    public static class RepetitionPeriod64 extends Sequence {
	
	/**
	 * The default constructor.
	 */
	public RepetitionPeriod64()
	{
	}
	
	/**
	 * Construct with AbstractData components.
	 */
	public RepetitionPeriod64(INTEGER length, INTEGER offset)
	{
	    setLength(length);
	    setOffset(offset);
	}
	
	/**
	 * Construct with components.
	 */
	public RepetitionPeriod64(long length, long offset)
	{
	    this(new INTEGER(length), new INTEGER(offset));
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
	
	
	// Methods for field "length"
	public long getLength()
	{
	    return ((INTEGER)mComponents[0]).longValue();
	}
	
	public void setLength(long length)
	{
	    setLength(new INTEGER(length));
	}
	
	public void setLength(INTEGER length)
	{
	    mComponents[0] = length;
	}
	
	
	// Methods for field "offset"
	public long getOffset()
	{
	    return ((INTEGER)mComponents[1]).longValue();
	}
	
	public void setOffset(long offset)
	{
	    setOffset(new INTEGER(offset));
	}
	
	public void setOffset(INTEGER offset)
	{
	    mComponents[1] = offset;
	}
	
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final SequenceInfo c_typeinfo = new SequenceInfo (
	    new Tags (
		new short[] {
		    (short)0x8006
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"RepetitionPeriodLengthAndOffset$RepetitionPeriod64"
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
			"length",
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
			"offset",
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
	 * Get the type descriptor (TypeInfo) of 'this' RepetitionPeriod64 object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' RepetitionPeriod64 object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for RepetitionPeriod64

    // Method to create a specific choice instance
    public AbstractData createInstance(int chosen)
    {
	switch (chosen) {
	    case repetitionPeriod1_chosen:
		return new Null();
	    case repetitionPeriod2_chosen:
		return new RepetitionPeriod2();
	    case repetitionPeriod4_chosen:
		return new RepetitionPeriod4();
	    case repetitionPeriod8_chosen:
		return new RepetitionPeriod8();
	    case repetitionPeriod16_chosen:
		return new RepetitionPeriod16();
	    case repetitionPeriod32_chosen:
		return new RepetitionPeriod32();
	    case repetitionPeriod64_chosen:
		return new RepetitionPeriod64();
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
	    "RepetitionPeriodLengthAndOffset"
	),
	new QName (
	    "InformationElements",
	    "RepetitionPeriodLengthAndOffset"
	),
	12314,
	null,
	new Fields (
	    new FieldInfo[] {
		new FieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"Null"
			    ),
			    new QName (
				"builtin",
				"NULL"
			    ),
			    12314,
			    null
			)
		    ),
		    "repetitionPeriod1",
		    0,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "RepetitionPeriodLengthAndOffset$RepetitionPeriod2"
			)
		    ),
		    "repetitionPeriod2",
		    1,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "RepetitionPeriodLengthAndOffset$RepetitionPeriod4"
			)
		    ),
		    "repetitionPeriod4",
		    2,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "RepetitionPeriodLengthAndOffset$RepetitionPeriod8"
			)
		    ),
		    "repetitionPeriod8",
		    3,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "RepetitionPeriodLengthAndOffset$RepetitionPeriod16"
			)
		    ),
		    "repetitionPeriod16",
		    4,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "RepetitionPeriodLengthAndOffset$RepetitionPeriod32"
			)
		    ),
		    "repetitionPeriod32",
		    5,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "RepetitionPeriodLengthAndOffset$RepetitionPeriod64"
			)
		    ),
		    "repetitionPeriod64",
		    6,
		    2
		)
	    }
	),
	0,
	new TagDecoder (
	    new TagDecoderElement[] {
		new TagDecoderElement((short)0x8000, 0),
		new TagDecoderElement((short)0x8001, 1),
		new TagDecoderElement((short)0x8002, 2),
		new TagDecoderElement((short)0x8003, 3),
		new TagDecoderElement((short)0x8004, 4),
		new TagDecoderElement((short)0x8005, 5),
		new TagDecoderElement((short)0x8006, 6)
	    }
	)
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' RepetitionPeriodLengthAndOffset object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' RepetitionPeriodLengthAndOffset object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for RepetitionPeriodLengthAndOffset
