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
 * Define the ASN1 Type RepPerLengthOffset_PICH from ASN1 Module InformationElements.
 * @see Choice
 */

public class RepPerLengthOffset_PICH extends Choice {
    
    /**
     * The default constructor.
     */
    public RepPerLengthOffset_PICH()
    {
    }
    
    public static final  int  rpp4_2_chosen = 1;
    public static final  int  rpp8_2_chosen = 2;
    public static final  int  rpp8_4_chosen = 3;
    public static final  int  rpp16_2_chosen = 4;
    public static final  int  rpp16_4_chosen = 5;
    public static final  int  rpp32_2_chosen = 6;
    public static final  int  rpp32_4_chosen = 7;
    public static final  int  rpp64_2_chosen = 8;
    public static final  int  rpp64_4_chosen = 9;
    
    // Methods for field "rpp4_2"
    public static RepPerLengthOffset_PICH createRepPerLengthOffset_PICHWithRpp4_2(long rpp4_2)
    {
	return createRepPerLengthOffset_PICHWithRpp4_2(new INTEGER(rpp4_2));
    }
    
    public static RepPerLengthOffset_PICH createRepPerLengthOffset_PICHWithRpp4_2(INTEGER rpp4_2)
    {
	RepPerLengthOffset_PICH __object = new RepPerLengthOffset_PICH();

	__object.setRpp4_2(rpp4_2);
	return __object;
    }
    
    public boolean hasRpp4_2()
    {
	return getChosenFlag() == rpp4_2_chosen;
    }
    
    public void setRpp4_2(long rpp4_2)
    {
	setRpp4_2(new INTEGER(rpp4_2));
    }
    
    public void setRpp4_2(INTEGER rpp4_2)
    {
	setChosenValue(rpp4_2);
	setChosenFlag(rpp4_2_chosen);
    }
    
    
    // Methods for field "rpp8_2"
    public static RepPerLengthOffset_PICH createRepPerLengthOffset_PICHWithRpp8_2(long rpp8_2)
    {
	return createRepPerLengthOffset_PICHWithRpp8_2(new INTEGER(rpp8_2));
    }
    
    public static RepPerLengthOffset_PICH createRepPerLengthOffset_PICHWithRpp8_2(INTEGER rpp8_2)
    {
	RepPerLengthOffset_PICH __object = new RepPerLengthOffset_PICH();

	__object.setRpp8_2(rpp8_2);
	return __object;
    }
    
    public boolean hasRpp8_2()
    {
	return getChosenFlag() == rpp8_2_chosen;
    }
    
    public void setRpp8_2(long rpp8_2)
    {
	setRpp8_2(new INTEGER(rpp8_2));
    }
    
    public void setRpp8_2(INTEGER rpp8_2)
    {
	setChosenValue(rpp8_2);
	setChosenFlag(rpp8_2_chosen);
    }
    
    
    // Methods for field "rpp8_4"
    public static RepPerLengthOffset_PICH createRepPerLengthOffset_PICHWithRpp8_4(long rpp8_4)
    {
	return createRepPerLengthOffset_PICHWithRpp8_4(new INTEGER(rpp8_4));
    }
    
    public static RepPerLengthOffset_PICH createRepPerLengthOffset_PICHWithRpp8_4(INTEGER rpp8_4)
    {
	RepPerLengthOffset_PICH __object = new RepPerLengthOffset_PICH();

	__object.setRpp8_4(rpp8_4);
	return __object;
    }
    
    public boolean hasRpp8_4()
    {
	return getChosenFlag() == rpp8_4_chosen;
    }
    
    public void setRpp8_4(long rpp8_4)
    {
	setRpp8_4(new INTEGER(rpp8_4));
    }
    
    public void setRpp8_4(INTEGER rpp8_4)
    {
	setChosenValue(rpp8_4);
	setChosenFlag(rpp8_4_chosen);
    }
    
    
    // Methods for field "rpp16_2"
    public static RepPerLengthOffset_PICH createRepPerLengthOffset_PICHWithRpp16_2(long rpp16_2)
    {
	return createRepPerLengthOffset_PICHWithRpp16_2(new INTEGER(rpp16_2));
    }
    
    public static RepPerLengthOffset_PICH createRepPerLengthOffset_PICHWithRpp16_2(INTEGER rpp16_2)
    {
	RepPerLengthOffset_PICH __object = new RepPerLengthOffset_PICH();

	__object.setRpp16_2(rpp16_2);
	return __object;
    }
    
    public boolean hasRpp16_2()
    {
	return getChosenFlag() == rpp16_2_chosen;
    }
    
    public void setRpp16_2(long rpp16_2)
    {
	setRpp16_2(new INTEGER(rpp16_2));
    }
    
    public void setRpp16_2(INTEGER rpp16_2)
    {
	setChosenValue(rpp16_2);
	setChosenFlag(rpp16_2_chosen);
    }
    
    
    // Methods for field "rpp16_4"
    public static RepPerLengthOffset_PICH createRepPerLengthOffset_PICHWithRpp16_4(long rpp16_4)
    {
	return createRepPerLengthOffset_PICHWithRpp16_4(new INTEGER(rpp16_4));
    }
    
    public static RepPerLengthOffset_PICH createRepPerLengthOffset_PICHWithRpp16_4(INTEGER rpp16_4)
    {
	RepPerLengthOffset_PICH __object = new RepPerLengthOffset_PICH();

	__object.setRpp16_4(rpp16_4);
	return __object;
    }
    
    public boolean hasRpp16_4()
    {
	return getChosenFlag() == rpp16_4_chosen;
    }
    
    public void setRpp16_4(long rpp16_4)
    {
	setRpp16_4(new INTEGER(rpp16_4));
    }
    
    public void setRpp16_4(INTEGER rpp16_4)
    {
	setChosenValue(rpp16_4);
	setChosenFlag(rpp16_4_chosen);
    }
    
    
    // Methods for field "rpp32_2"
    public static RepPerLengthOffset_PICH createRepPerLengthOffset_PICHWithRpp32_2(long rpp32_2)
    {
	return createRepPerLengthOffset_PICHWithRpp32_2(new INTEGER(rpp32_2));
    }
    
    public static RepPerLengthOffset_PICH createRepPerLengthOffset_PICHWithRpp32_2(INTEGER rpp32_2)
    {
	RepPerLengthOffset_PICH __object = new RepPerLengthOffset_PICH();

	__object.setRpp32_2(rpp32_2);
	return __object;
    }
    
    public boolean hasRpp32_2()
    {
	return getChosenFlag() == rpp32_2_chosen;
    }
    
    public void setRpp32_2(long rpp32_2)
    {
	setRpp32_2(new INTEGER(rpp32_2));
    }
    
    public void setRpp32_2(INTEGER rpp32_2)
    {
	setChosenValue(rpp32_2);
	setChosenFlag(rpp32_2_chosen);
    }
    
    
    // Methods for field "rpp32_4"
    public static RepPerLengthOffset_PICH createRepPerLengthOffset_PICHWithRpp32_4(long rpp32_4)
    {
	return createRepPerLengthOffset_PICHWithRpp32_4(new INTEGER(rpp32_4));
    }
    
    public static RepPerLengthOffset_PICH createRepPerLengthOffset_PICHWithRpp32_4(INTEGER rpp32_4)
    {
	RepPerLengthOffset_PICH __object = new RepPerLengthOffset_PICH();

	__object.setRpp32_4(rpp32_4);
	return __object;
    }
    
    public boolean hasRpp32_4()
    {
	return getChosenFlag() == rpp32_4_chosen;
    }
    
    public void setRpp32_4(long rpp32_4)
    {
	setRpp32_4(new INTEGER(rpp32_4));
    }
    
    public void setRpp32_4(INTEGER rpp32_4)
    {
	setChosenValue(rpp32_4);
	setChosenFlag(rpp32_4_chosen);
    }
    
    
    // Methods for field "rpp64_2"
    public static RepPerLengthOffset_PICH createRepPerLengthOffset_PICHWithRpp64_2(long rpp64_2)
    {
	return createRepPerLengthOffset_PICHWithRpp64_2(new INTEGER(rpp64_2));
    }
    
    public static RepPerLengthOffset_PICH createRepPerLengthOffset_PICHWithRpp64_2(INTEGER rpp64_2)
    {
	RepPerLengthOffset_PICH __object = new RepPerLengthOffset_PICH();

	__object.setRpp64_2(rpp64_2);
	return __object;
    }
    
    public boolean hasRpp64_2()
    {
	return getChosenFlag() == rpp64_2_chosen;
    }
    
    public void setRpp64_2(long rpp64_2)
    {
	setRpp64_2(new INTEGER(rpp64_2));
    }
    
    public void setRpp64_2(INTEGER rpp64_2)
    {
	setChosenValue(rpp64_2);
	setChosenFlag(rpp64_2_chosen);
    }
    
    
    // Methods for field "rpp64_4"
    public static RepPerLengthOffset_PICH createRepPerLengthOffset_PICHWithRpp64_4(long rpp64_4)
    {
	return createRepPerLengthOffset_PICHWithRpp64_4(new INTEGER(rpp64_4));
    }
    
    public static RepPerLengthOffset_PICH createRepPerLengthOffset_PICHWithRpp64_4(INTEGER rpp64_4)
    {
	RepPerLengthOffset_PICH __object = new RepPerLengthOffset_PICH();

	__object.setRpp64_4(rpp64_4);
	return __object;
    }
    
    public boolean hasRpp64_4()
    {
	return getChosenFlag() == rpp64_4_chosen;
    }
    
    public void setRpp64_4(long rpp64_4)
    {
	setRpp64_4(new INTEGER(rpp64_4));
    }
    
    public void setRpp64_4(INTEGER rpp64_4)
    {
	setChosenValue(rpp64_4);
	setChosenFlag(rpp64_4_chosen);
    }
    
    
    // Method to create a specific choice instance
    public AbstractData createInstance(int chosen)
    {
	switch (chosen) {
	    case rpp4_2_chosen:
		return new INTEGER();
	    case rpp8_2_chosen:
		return new INTEGER();
	    case rpp8_4_chosen:
		return new INTEGER();
	    case rpp16_2_chosen:
		return new INTEGER();
	    case rpp16_4_chosen:
		return new INTEGER();
	    case rpp32_2_chosen:
		return new INTEGER();
	    case rpp32_4_chosen:
		return new INTEGER();
	    case rpp64_2_chosen:
		return new INTEGER();
	    case rpp64_4_chosen:
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
	    "RepPerLengthOffset_PICH"
	),
	new QName (
	    "InformationElements",
	    "RepPerLengthOffset-PICH"
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
		    "rpp4-2",
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
		    "rpp8-2",
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
		    "rpp8-4",
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
		    "rpp16-2",
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
		    "rpp16-4",
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
		    "rpp32-2",
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
		    "rpp32-4",
		    6,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8007
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
		    "rpp64-2",
		    7,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8008
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
		    "rpp64-4",
		    8,
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
		new TagDecoderElement((short)0x8006, 6),
		new TagDecoderElement((short)0x8007, 7),
		new TagDecoderElement((short)0x8008, 8)
	    }
	)
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' RepPerLengthOffset_PICH object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' RepPerLengthOffset_PICH object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for RepPerLengthOffset_PICH
