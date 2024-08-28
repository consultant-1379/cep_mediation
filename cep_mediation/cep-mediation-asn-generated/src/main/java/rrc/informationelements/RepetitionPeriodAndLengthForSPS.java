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
 * Define the ASN1 Type RepetitionPeriodAndLengthForSPS from ASN1 Module InformationElements.
 * @see Choice
 */

public class RepetitionPeriodAndLengthForSPS extends Choice {
    
    /**
     * The default constructor.
     */
    public RepetitionPeriodAndLengthForSPS()
    {
    }
    
    public static final  int  repetitionPeriod1_chosen = 1;
    public static final  int  repetitionPeriod2_chosen = 2;
    public static final  int  repetitionPeriod4_chosen = 3;
    public static final  int  repetitionPeriod8_chosen = 4;
    public static final  int  repetitionPeriod16_chosen = 5;
    public static final  int  repetitionPeriod32_chosen = 6;
    
    // Methods for field "repetitionPeriod1"
    public static RepetitionPeriodAndLengthForSPS createRepetitionPeriodAndLengthForSPSWithRepetitionPeriod1(Null repetitionPeriod1)
    {
	RepetitionPeriodAndLengthForSPS __object = new RepetitionPeriodAndLengthForSPS();

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
    public static RepetitionPeriodAndLengthForSPS createRepetitionPeriodAndLengthForSPSWithRepetitionPeriod2(long repetitionPeriod2)
    {
	return createRepetitionPeriodAndLengthForSPSWithRepetitionPeriod2(new INTEGER(repetitionPeriod2));
    }
    
    public static RepetitionPeriodAndLengthForSPS createRepetitionPeriodAndLengthForSPSWithRepetitionPeriod2(INTEGER repetitionPeriod2)
    {
	RepetitionPeriodAndLengthForSPS __object = new RepetitionPeriodAndLengthForSPS();

	__object.setRepetitionPeriod2(repetitionPeriod2);
	return __object;
    }
    
    public boolean hasRepetitionPeriod2()
    {
	return getChosenFlag() == repetitionPeriod2_chosen;
    }
    
    public void setRepetitionPeriod2(long repetitionPeriod2)
    {
	setRepetitionPeriod2(new INTEGER(repetitionPeriod2));
    }
    
    public void setRepetitionPeriod2(INTEGER repetitionPeriod2)
    {
	setChosenValue(repetitionPeriod2);
	setChosenFlag(repetitionPeriod2_chosen);
    }
    
    
    // Methods for field "repetitionPeriod4"
    public static RepetitionPeriodAndLengthForSPS createRepetitionPeriodAndLengthForSPSWithRepetitionPeriod4(long repetitionPeriod4)
    {
	return createRepetitionPeriodAndLengthForSPSWithRepetitionPeriod4(new INTEGER(repetitionPeriod4));
    }
    
    public static RepetitionPeriodAndLengthForSPS createRepetitionPeriodAndLengthForSPSWithRepetitionPeriod4(INTEGER repetitionPeriod4)
    {
	RepetitionPeriodAndLengthForSPS __object = new RepetitionPeriodAndLengthForSPS();

	__object.setRepetitionPeriod4(repetitionPeriod4);
	return __object;
    }
    
    public boolean hasRepetitionPeriod4()
    {
	return getChosenFlag() == repetitionPeriod4_chosen;
    }
    
    public void setRepetitionPeriod4(long repetitionPeriod4)
    {
	setRepetitionPeriod4(new INTEGER(repetitionPeriod4));
    }
    
    public void setRepetitionPeriod4(INTEGER repetitionPeriod4)
    {
	setChosenValue(repetitionPeriod4);
	setChosenFlag(repetitionPeriod4_chosen);
    }
    
    
    // Methods for field "repetitionPeriod8"
    public static RepetitionPeriodAndLengthForSPS createRepetitionPeriodAndLengthForSPSWithRepetitionPeriod8(long repetitionPeriod8)
    {
	return createRepetitionPeriodAndLengthForSPSWithRepetitionPeriod8(new INTEGER(repetitionPeriod8));
    }
    
    public static RepetitionPeriodAndLengthForSPS createRepetitionPeriodAndLengthForSPSWithRepetitionPeriod8(INTEGER repetitionPeriod8)
    {
	RepetitionPeriodAndLengthForSPS __object = new RepetitionPeriodAndLengthForSPS();

	__object.setRepetitionPeriod8(repetitionPeriod8);
	return __object;
    }
    
    public boolean hasRepetitionPeriod8()
    {
	return getChosenFlag() == repetitionPeriod8_chosen;
    }
    
    public void setRepetitionPeriod8(long repetitionPeriod8)
    {
	setRepetitionPeriod8(new INTEGER(repetitionPeriod8));
    }
    
    public void setRepetitionPeriod8(INTEGER repetitionPeriod8)
    {
	setChosenValue(repetitionPeriod8);
	setChosenFlag(repetitionPeriod8_chosen);
    }
    
    
    // Methods for field "repetitionPeriod16"
    public static RepetitionPeriodAndLengthForSPS createRepetitionPeriodAndLengthForSPSWithRepetitionPeriod16(long repetitionPeriod16)
    {
	return createRepetitionPeriodAndLengthForSPSWithRepetitionPeriod16(new INTEGER(repetitionPeriod16));
    }
    
    public static RepetitionPeriodAndLengthForSPS createRepetitionPeriodAndLengthForSPSWithRepetitionPeriod16(INTEGER repetitionPeriod16)
    {
	RepetitionPeriodAndLengthForSPS __object = new RepetitionPeriodAndLengthForSPS();

	__object.setRepetitionPeriod16(repetitionPeriod16);
	return __object;
    }
    
    public boolean hasRepetitionPeriod16()
    {
	return getChosenFlag() == repetitionPeriod16_chosen;
    }
    
    public void setRepetitionPeriod16(long repetitionPeriod16)
    {
	setRepetitionPeriod16(new INTEGER(repetitionPeriod16));
    }
    
    public void setRepetitionPeriod16(INTEGER repetitionPeriod16)
    {
	setChosenValue(repetitionPeriod16);
	setChosenFlag(repetitionPeriod16_chosen);
    }
    
    
    // Methods for field "repetitionPeriod32"
    public static RepetitionPeriodAndLengthForSPS createRepetitionPeriodAndLengthForSPSWithRepetitionPeriod32(long repetitionPeriod32)
    {
	return createRepetitionPeriodAndLengthForSPSWithRepetitionPeriod32(new INTEGER(repetitionPeriod32));
    }
    
    public static RepetitionPeriodAndLengthForSPS createRepetitionPeriodAndLengthForSPSWithRepetitionPeriod32(INTEGER repetitionPeriod32)
    {
	RepetitionPeriodAndLengthForSPS __object = new RepetitionPeriodAndLengthForSPS();

	__object.setRepetitionPeriod32(repetitionPeriod32);
	return __object;
    }
    
    public boolean hasRepetitionPeriod32()
    {
	return getChosenFlag() == repetitionPeriod32_chosen;
    }
    
    public void setRepetitionPeriod32(long repetitionPeriod32)
    {
	setRepetitionPeriod32(new INTEGER(repetitionPeriod32));
    }
    
    public void setRepetitionPeriod32(INTEGER repetitionPeriod32)
    {
	setChosenValue(repetitionPeriod32);
	setChosenFlag(repetitionPeriod32_chosen);
    }
    
    
    // Method to create a specific choice instance
    public AbstractData createInstance(int chosen)
    {
	switch (chosen) {
	    case repetitionPeriod1_chosen:
		return new Null();
	    case repetitionPeriod2_chosen:
		return new INTEGER();
	    case repetitionPeriod4_chosen:
		return new INTEGER();
	    case repetitionPeriod8_chosen:
		return new INTEGER();
	    case repetitionPeriod16_chosen:
		return new INTEGER();
	    case repetitionPeriod32_chosen:
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
	    "RepetitionPeriodAndLengthForSPS"
	),
	new QName (
	    "InformationElements",
	    "RepetitionPeriodAndLengthForSPS"
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
				    new com.oss.asn1.INTEGER(1),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(1)
			    ),
			    null
			)
		    ),
		    "repetitionPeriod2",
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
		    "repetitionPeriod4",
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
		    "repetitionPeriod8",
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
		    "repetitionPeriod16",
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
		    "repetitionPeriod32",
		    5,
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
		new TagDecoderElement((short)0x8005, 5)
	    }
	)
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' RepetitionPeriodAndLengthForSPS object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' RepetitionPeriodAndLengthForSPS object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for RepetitionPeriodAndLengthForSPS
