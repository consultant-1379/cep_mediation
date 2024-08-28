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
 * Define the ASN1 Type SF256_AndCodeNumber from ASN1 Module InformationElements.
 * @see Choice
 */

public class SF256_AndCodeNumber extends Choice {
    
    /**
     * The default constructor.
     */
    public SF256_AndCodeNumber()
    {
    }
    
    public static final  int  sf4_chosen = 1;
    public static final  int  sf8_chosen = 2;
    public static final  int  sf16_chosen = 3;
    public static final  int  sf32_chosen = 4;
    public static final  int  sf64_chosen = 5;
    public static final  int  sf128_chosen = 6;
    public static final  int  sf256_chosen = 7;
    
    // Methods for field "sf4"
    public static SF256_AndCodeNumber createSF256_AndCodeNumberWithSf4(long sf4)
    {
	return createSF256_AndCodeNumberWithSf4(new INTEGER(sf4));
    }
    
    public static SF256_AndCodeNumber createSF256_AndCodeNumberWithSf4(INTEGER sf4)
    {
	SF256_AndCodeNumber __object = new SF256_AndCodeNumber();

	__object.setSf4(sf4);
	return __object;
    }
    
    public boolean hasSf4()
    {
	return getChosenFlag() == sf4_chosen;
    }
    
    public void setSf4(long sf4)
    {
	setSf4(new INTEGER(sf4));
    }
    
    public void setSf4(INTEGER sf4)
    {
	setChosenValue(sf4);
	setChosenFlag(sf4_chosen);
    }
    
    
    // Methods for field "sf8"
    public static SF256_AndCodeNumber createSF256_AndCodeNumberWithSf8(long sf8)
    {
	return createSF256_AndCodeNumberWithSf8(new INTEGER(sf8));
    }
    
    public static SF256_AndCodeNumber createSF256_AndCodeNumberWithSf8(INTEGER sf8)
    {
	SF256_AndCodeNumber __object = new SF256_AndCodeNumber();

	__object.setSf8(sf8);
	return __object;
    }
    
    public boolean hasSf8()
    {
	return getChosenFlag() == sf8_chosen;
    }
    
    public void setSf8(long sf8)
    {
	setSf8(new INTEGER(sf8));
    }
    
    public void setSf8(INTEGER sf8)
    {
	setChosenValue(sf8);
	setChosenFlag(sf8_chosen);
    }
    
    
    // Methods for field "sf16"
    public static SF256_AndCodeNumber createSF256_AndCodeNumberWithSf16(long sf16)
    {
	return createSF256_AndCodeNumberWithSf16(new INTEGER(sf16));
    }
    
    public static SF256_AndCodeNumber createSF256_AndCodeNumberWithSf16(INTEGER sf16)
    {
	SF256_AndCodeNumber __object = new SF256_AndCodeNumber();

	__object.setSf16(sf16);
	return __object;
    }
    
    public boolean hasSf16()
    {
	return getChosenFlag() == sf16_chosen;
    }
    
    public void setSf16(long sf16)
    {
	setSf16(new INTEGER(sf16));
    }
    
    public void setSf16(INTEGER sf16)
    {
	setChosenValue(sf16);
	setChosenFlag(sf16_chosen);
    }
    
    
    // Methods for field "sf32"
    public static SF256_AndCodeNumber createSF256_AndCodeNumberWithSf32(long sf32)
    {
	return createSF256_AndCodeNumberWithSf32(new INTEGER(sf32));
    }
    
    public static SF256_AndCodeNumber createSF256_AndCodeNumberWithSf32(INTEGER sf32)
    {
	SF256_AndCodeNumber __object = new SF256_AndCodeNumber();

	__object.setSf32(sf32);
	return __object;
    }
    
    public boolean hasSf32()
    {
	return getChosenFlag() == sf32_chosen;
    }
    
    public void setSf32(long sf32)
    {
	setSf32(new INTEGER(sf32));
    }
    
    public void setSf32(INTEGER sf32)
    {
	setChosenValue(sf32);
	setChosenFlag(sf32_chosen);
    }
    
    
    // Methods for field "sf64"
    public static SF256_AndCodeNumber createSF256_AndCodeNumberWithSf64(long sf64)
    {
	return createSF256_AndCodeNumberWithSf64(new INTEGER(sf64));
    }
    
    public static SF256_AndCodeNumber createSF256_AndCodeNumberWithSf64(INTEGER sf64)
    {
	SF256_AndCodeNumber __object = new SF256_AndCodeNumber();

	__object.setSf64(sf64);
	return __object;
    }
    
    public boolean hasSf64()
    {
	return getChosenFlag() == sf64_chosen;
    }
    
    public void setSf64(long sf64)
    {
	setSf64(new INTEGER(sf64));
    }
    
    public void setSf64(INTEGER sf64)
    {
	setChosenValue(sf64);
	setChosenFlag(sf64_chosen);
    }
    
    
    // Methods for field "sf128"
    public static SF256_AndCodeNumber createSF256_AndCodeNumberWithSf128(long sf128)
    {
	return createSF256_AndCodeNumberWithSf128(new INTEGER(sf128));
    }
    
    public static SF256_AndCodeNumber createSF256_AndCodeNumberWithSf128(INTEGER sf128)
    {
	SF256_AndCodeNumber __object = new SF256_AndCodeNumber();

	__object.setSf128(sf128);
	return __object;
    }
    
    public boolean hasSf128()
    {
	return getChosenFlag() == sf128_chosen;
    }
    
    public void setSf128(long sf128)
    {
	setSf128(new INTEGER(sf128));
    }
    
    public void setSf128(INTEGER sf128)
    {
	setChosenValue(sf128);
	setChosenFlag(sf128_chosen);
    }
    
    
    // Methods for field "sf256"
    public static SF256_AndCodeNumber createSF256_AndCodeNumberWithSf256(long sf256)
    {
	return createSF256_AndCodeNumberWithSf256(new INTEGER(sf256));
    }
    
    public static SF256_AndCodeNumber createSF256_AndCodeNumberWithSf256(INTEGER sf256)
    {
	SF256_AndCodeNumber __object = new SF256_AndCodeNumber();

	__object.setSf256(sf256);
	return __object;
    }
    
    public boolean hasSf256()
    {
	return getChosenFlag() == sf256_chosen;
    }
    
    public void setSf256(long sf256)
    {
	setSf256(new INTEGER(sf256));
    }
    
    public void setSf256(INTEGER sf256)
    {
	setChosenValue(sf256);
	setChosenFlag(sf256_chosen);
    }
    
    
    // Method to create a specific choice instance
    public AbstractData createInstance(int chosen)
    {
	switch (chosen) {
	    case sf4_chosen:
		return new INTEGER();
	    case sf8_chosen:
		return new INTEGER();
	    case sf16_chosen:
		return new INTEGER();
	    case sf32_chosen:
		return new INTEGER();
	    case sf64_chosen:
		return new INTEGER();
	    case sf128_chosen:
		return new INTEGER();
	    case sf256_chosen:
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
	    "SF256_AndCodeNumber"
	),
	new QName (
	    "InformationElements",
	    "SF256-AndCodeNumber"
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
		    "sf4",
		    0,
		    2
		),
		new FieldInfo (
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
		    "sf8",
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
		    "sf16",
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
		    "sf32",
		    3,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8004
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
		    "sf64",
		    4,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8005
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
				    new com.oss.asn1.INTEGER(127),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(127)
			    ),
			    null
			)
		    ),
		    "sf128",
		    5,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8006
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
				    new com.oss.asn1.INTEGER(255),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(255)
			    ),
			    null
			)
		    ),
		    "sf256",
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
     * Get the type descriptor (TypeInfo) of 'this' SF256_AndCodeNumber object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' SF256_AndCodeNumber object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for SF256_AndCodeNumber
