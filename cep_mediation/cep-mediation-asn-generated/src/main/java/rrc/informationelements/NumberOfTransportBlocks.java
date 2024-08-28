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
 * Define the ASN1 Type NumberOfTransportBlocks from ASN1 Module InformationElements.
 * @see Choice
 */

public class NumberOfTransportBlocks extends Choice {
    
    /**
     * The default constructor.
     */
    public NumberOfTransportBlocks()
    {
    }
    
    public static final  int  zero_chosen = 1;
    public static final  int  one_chosen = 2;
    public static final  int  small_chosen = 3;
    public static final  int  large_chosen = 4;
    
    // Methods for field "zero"
    public static NumberOfTransportBlocks createNumberOfTransportBlocksWithZero(Null zero)
    {
	NumberOfTransportBlocks __object = new NumberOfTransportBlocks();

	__object.setZero(zero);
	return __object;
    }
    
    public boolean hasZero()
    {
	return getChosenFlag() == zero_chosen;
    }
    
    public void setZero(Null zero)
    {
	setChosenValue(zero);
	setChosenFlag(zero_chosen);
    }
    
    
    // Methods for field "one"
    public static NumberOfTransportBlocks createNumberOfTransportBlocksWithOne(Null one)
    {
	NumberOfTransportBlocks __object = new NumberOfTransportBlocks();

	__object.setOne(one);
	return __object;
    }
    
    public boolean hasOne()
    {
	return getChosenFlag() == one_chosen;
    }
    
    public void setOne(Null one)
    {
	setChosenValue(one);
	setChosenFlag(one_chosen);
    }
    
    
    // Methods for field "small"
    public static NumberOfTransportBlocks createNumberOfTransportBlocksWithSmall(long small)
    {
	return createNumberOfTransportBlocksWithSmall(new INTEGER(small));
    }
    
    public static NumberOfTransportBlocks createNumberOfTransportBlocksWithSmall(INTEGER small)
    {
	NumberOfTransportBlocks __object = new NumberOfTransportBlocks();

	__object.setSmall(small);
	return __object;
    }
    
    public boolean hasSmall()
    {
	return getChosenFlag() == small_chosen;
    }
    
    public void setSmall(long small)
    {
	setSmall(new INTEGER(small));
    }
    
    public void setSmall(INTEGER small)
    {
	setChosenValue(small);
	setChosenFlag(small_chosen);
    }
    
    
    // Methods for field "large"
    public static NumberOfTransportBlocks createNumberOfTransportBlocksWithLarge(long large)
    {
	return createNumberOfTransportBlocksWithLarge(new INTEGER(large));
    }
    
    public static NumberOfTransportBlocks createNumberOfTransportBlocksWithLarge(INTEGER large)
    {
	NumberOfTransportBlocks __object = new NumberOfTransportBlocks();

	__object.setLarge(large);
	return __object;
    }
    
    public boolean hasLarge()
    {
	return getChosenFlag() == large_chosen;
    }
    
    public void setLarge(long large)
    {
	setLarge(new INTEGER(large));
    }
    
    public void setLarge(INTEGER large)
    {
	setChosenValue(large);
	setChosenFlag(large_chosen);
    }
    
    
    // Method to create a specific choice instance
    public AbstractData createInstance(int chosen)
    {
	switch (chosen) {
	    case zero_chosen:
		return new Null();
	    case one_chosen:
		return new Null();
	    case small_chosen:
		return new INTEGER();
	    case large_chosen:
		return new INTEGER();
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
	    "NumberOfTransportBlocks"
	),
	new QName (
	    "InformationElements",
	    "NumberOfTransportBlocks"
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
		    "zero",
		    0,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
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
		    "one",
		    1,
		    2
		),
		new FieldInfo (
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
				    new com.oss.asn1.INTEGER(2), 
				    new com.oss.asn1.INTEGER(17),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(2),
				new java.lang.Long(17)
			    ),
			    null
			)
		    ),
		    "small",
		    2,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
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
				    new com.oss.asn1.INTEGER(18), 
				    new com.oss.asn1.INTEGER(512),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(18),
				new java.lang.Long(512)
			    ),
			    null
			)
		    ),
		    "large",
		    3,
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
		new TagDecoderElement((short)0x8003, 3)
	    }
	)
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' NumberOfTransportBlocks object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' NumberOfTransportBlocks object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for NumberOfTransportBlocks
