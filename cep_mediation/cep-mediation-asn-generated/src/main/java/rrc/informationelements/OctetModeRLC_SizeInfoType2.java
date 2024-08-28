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
 * Define the ASN1 Type OctetModeRLC_SizeInfoType2 from ASN1 Module InformationElements.
 * @see Choice
 */

public class OctetModeRLC_SizeInfoType2 extends Choice {
    
    /**
     * The default constructor.
     */
    public OctetModeRLC_SizeInfoType2()
    {
    }
    
    public static final  int  sizeType1_chosen = 1;
    public static final  int  sizeType2_chosen = 2;
    public static final  int  sizeType3_chosen = 3;
    
    // Methods for field "sizeType1"
    public static OctetModeRLC_SizeInfoType2 createOctetModeRLC_SizeInfoType2WithSizeType1(long sizeType1)
    {
	return createOctetModeRLC_SizeInfoType2WithSizeType1(new INTEGER(sizeType1));
    }
    
    public static OctetModeRLC_SizeInfoType2 createOctetModeRLC_SizeInfoType2WithSizeType1(INTEGER sizeType1)
    {
	OctetModeRLC_SizeInfoType2 __object = new OctetModeRLC_SizeInfoType2();

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
    public static OctetModeRLC_SizeInfoType2 createOctetModeRLC_SizeInfoType2WithSizeType2(long sizeType2)
    {
	return createOctetModeRLC_SizeInfoType2WithSizeType2(new INTEGER(sizeType2));
    }
    
    public static OctetModeRLC_SizeInfoType2 createOctetModeRLC_SizeInfoType2WithSizeType2(INTEGER sizeType2)
    {
	OctetModeRLC_SizeInfoType2 __object = new OctetModeRLC_SizeInfoType2();

	__object.setSizeType2(sizeType2);
	return __object;
    }
    
    public boolean hasSizeType2()
    {
	return getChosenFlag() == sizeType2_chosen;
    }
    
    public void setSizeType2(long sizeType2)
    {
	setSizeType2(new INTEGER(sizeType2));
    }
    
    public void setSizeType2(INTEGER sizeType2)
    {
	setChosenValue(sizeType2);
	setChosenFlag(sizeType2_chosen);
    }
    
    
    // Methods for field "sizeType3"
    public static OctetModeRLC_SizeInfoType2 createOctetModeRLC_SizeInfoType2WithSizeType3(long sizeType3)
    {
	return createOctetModeRLC_SizeInfoType2WithSizeType3(new INTEGER(sizeType3));
    }
    
    public static OctetModeRLC_SizeInfoType2 createOctetModeRLC_SizeInfoType2WithSizeType3(INTEGER sizeType3)
    {
	OctetModeRLC_SizeInfoType2 __object = new OctetModeRLC_SizeInfoType2();

	__object.setSizeType3(sizeType3);
	return __object;
    }
    
    public boolean hasSizeType3()
    {
	return getChosenFlag() == sizeType3_chosen;
    }
    
    public void setSizeType3(long sizeType3)
    {
	setSizeType3(new INTEGER(sizeType3));
    }
    
    public void setSizeType3(INTEGER sizeType3)
    {
	setChosenValue(sizeType3);
	setChosenFlag(sizeType3_chosen);
    }
    
    
    // Method to create a specific choice instance
    public AbstractData createInstance(int chosen)
    {
	switch (chosen) {
	    case sizeType1_chosen:
		return new INTEGER();
	    case sizeType2_chosen:
		return new INTEGER();
	    case sizeType3_chosen:
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
	    "OctetModeRLC_SizeInfoType2"
	),
	new QName (
	    "InformationElements",
	    "OctetModeRLC-SizeInfoType2"
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
		    "sizeType2",
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
				    new com.oss.asn1.INTEGER(56),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(56)
			    ),
			    null
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
     * Get the type descriptor (TypeInfo) of 'this' OctetModeRLC_SizeInfoType2 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' OctetModeRLC_SizeInfoType2 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for OctetModeRLC_SizeInfoType2
