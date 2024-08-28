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
 * Define the ASN1 Type TFCS_InfoForDSCH from ASN1 Module InformationElements.
 * @see Choice
 */

public class TFCS_InfoForDSCH extends Choice {
    
    /**
     * The default constructor.
     */
    public TFCS_InfoForDSCH()
    {
    }
    
    public static final  int  ctfc2bit_chosen = 1;
    public static final  int  ctfc4bit_chosen = 2;
    public static final  int  ctfc6bit_chosen = 3;
    public static final  int  ctfc8bit_chosen = 4;
    public static final  int  ctfc12bit_chosen = 5;
    public static final  int  ctfc16bit_chosen = 6;
    public static final  int  ctfc24bit_chosen = 7;
    
    // Methods for field "ctfc2bit"
    public static TFCS_InfoForDSCH createTFCS_InfoForDSCHWithCtfc2bit(long ctfc2bit)
    {
	return createTFCS_InfoForDSCHWithCtfc2bit(new INTEGER(ctfc2bit));
    }
    
    public static TFCS_InfoForDSCH createTFCS_InfoForDSCHWithCtfc2bit(INTEGER ctfc2bit)
    {
	TFCS_InfoForDSCH __object = new TFCS_InfoForDSCH();

	__object.setCtfc2bit(ctfc2bit);
	return __object;
    }
    
    public boolean hasCtfc2bit()
    {
	return getChosenFlag() == ctfc2bit_chosen;
    }
    
    public void setCtfc2bit(long ctfc2bit)
    {
	setCtfc2bit(new INTEGER(ctfc2bit));
    }
    
    public void setCtfc2bit(INTEGER ctfc2bit)
    {
	setChosenValue(ctfc2bit);
	setChosenFlag(ctfc2bit_chosen);
    }
    
    
    // Methods for field "ctfc4bit"
    public static TFCS_InfoForDSCH createTFCS_InfoForDSCHWithCtfc4bit(long ctfc4bit)
    {
	return createTFCS_InfoForDSCHWithCtfc4bit(new INTEGER(ctfc4bit));
    }
    
    public static TFCS_InfoForDSCH createTFCS_InfoForDSCHWithCtfc4bit(INTEGER ctfc4bit)
    {
	TFCS_InfoForDSCH __object = new TFCS_InfoForDSCH();

	__object.setCtfc4bit(ctfc4bit);
	return __object;
    }
    
    public boolean hasCtfc4bit()
    {
	return getChosenFlag() == ctfc4bit_chosen;
    }
    
    public void setCtfc4bit(long ctfc4bit)
    {
	setCtfc4bit(new INTEGER(ctfc4bit));
    }
    
    public void setCtfc4bit(INTEGER ctfc4bit)
    {
	setChosenValue(ctfc4bit);
	setChosenFlag(ctfc4bit_chosen);
    }
    
    
    // Methods for field "ctfc6bit"
    public static TFCS_InfoForDSCH createTFCS_InfoForDSCHWithCtfc6bit(long ctfc6bit)
    {
	return createTFCS_InfoForDSCHWithCtfc6bit(new INTEGER(ctfc6bit));
    }
    
    public static TFCS_InfoForDSCH createTFCS_InfoForDSCHWithCtfc6bit(INTEGER ctfc6bit)
    {
	TFCS_InfoForDSCH __object = new TFCS_InfoForDSCH();

	__object.setCtfc6bit(ctfc6bit);
	return __object;
    }
    
    public boolean hasCtfc6bit()
    {
	return getChosenFlag() == ctfc6bit_chosen;
    }
    
    public void setCtfc6bit(long ctfc6bit)
    {
	setCtfc6bit(new INTEGER(ctfc6bit));
    }
    
    public void setCtfc6bit(INTEGER ctfc6bit)
    {
	setChosenValue(ctfc6bit);
	setChosenFlag(ctfc6bit_chosen);
    }
    
    
    // Methods for field "ctfc8bit"
    public static TFCS_InfoForDSCH createTFCS_InfoForDSCHWithCtfc8bit(long ctfc8bit)
    {
	return createTFCS_InfoForDSCHWithCtfc8bit(new INTEGER(ctfc8bit));
    }
    
    public static TFCS_InfoForDSCH createTFCS_InfoForDSCHWithCtfc8bit(INTEGER ctfc8bit)
    {
	TFCS_InfoForDSCH __object = new TFCS_InfoForDSCH();

	__object.setCtfc8bit(ctfc8bit);
	return __object;
    }
    
    public boolean hasCtfc8bit()
    {
	return getChosenFlag() == ctfc8bit_chosen;
    }
    
    public void setCtfc8bit(long ctfc8bit)
    {
	setCtfc8bit(new INTEGER(ctfc8bit));
    }
    
    public void setCtfc8bit(INTEGER ctfc8bit)
    {
	setChosenValue(ctfc8bit);
	setChosenFlag(ctfc8bit_chosen);
    }
    
    
    // Methods for field "ctfc12bit"
    public static TFCS_InfoForDSCH createTFCS_InfoForDSCHWithCtfc12bit(long ctfc12bit)
    {
	return createTFCS_InfoForDSCHWithCtfc12bit(new INTEGER(ctfc12bit));
    }
    
    public static TFCS_InfoForDSCH createTFCS_InfoForDSCHWithCtfc12bit(INTEGER ctfc12bit)
    {
	TFCS_InfoForDSCH __object = new TFCS_InfoForDSCH();

	__object.setCtfc12bit(ctfc12bit);
	return __object;
    }
    
    public boolean hasCtfc12bit()
    {
	return getChosenFlag() == ctfc12bit_chosen;
    }
    
    public void setCtfc12bit(long ctfc12bit)
    {
	setCtfc12bit(new INTEGER(ctfc12bit));
    }
    
    public void setCtfc12bit(INTEGER ctfc12bit)
    {
	setChosenValue(ctfc12bit);
	setChosenFlag(ctfc12bit_chosen);
    }
    
    
    // Methods for field "ctfc16bit"
    public static TFCS_InfoForDSCH createTFCS_InfoForDSCHWithCtfc16bit(long ctfc16bit)
    {
	return createTFCS_InfoForDSCHWithCtfc16bit(new INTEGER(ctfc16bit));
    }
    
    public static TFCS_InfoForDSCH createTFCS_InfoForDSCHWithCtfc16bit(INTEGER ctfc16bit)
    {
	TFCS_InfoForDSCH __object = new TFCS_InfoForDSCH();

	__object.setCtfc16bit(ctfc16bit);
	return __object;
    }
    
    public boolean hasCtfc16bit()
    {
	return getChosenFlag() == ctfc16bit_chosen;
    }
    
    public void setCtfc16bit(long ctfc16bit)
    {
	setCtfc16bit(new INTEGER(ctfc16bit));
    }
    
    public void setCtfc16bit(INTEGER ctfc16bit)
    {
	setChosenValue(ctfc16bit);
	setChosenFlag(ctfc16bit_chosen);
    }
    
    
    // Methods for field "ctfc24bit"
    public static TFCS_InfoForDSCH createTFCS_InfoForDSCHWithCtfc24bit(long ctfc24bit)
    {
	return createTFCS_InfoForDSCHWithCtfc24bit(new INTEGER(ctfc24bit));
    }
    
    public static TFCS_InfoForDSCH createTFCS_InfoForDSCHWithCtfc24bit(INTEGER ctfc24bit)
    {
	TFCS_InfoForDSCH __object = new TFCS_InfoForDSCH();

	__object.setCtfc24bit(ctfc24bit);
	return __object;
    }
    
    public boolean hasCtfc24bit()
    {
	return getChosenFlag() == ctfc24bit_chosen;
    }
    
    public void setCtfc24bit(long ctfc24bit)
    {
	setCtfc24bit(new INTEGER(ctfc24bit));
    }
    
    public void setCtfc24bit(INTEGER ctfc24bit)
    {
	setChosenValue(ctfc24bit);
	setChosenFlag(ctfc24bit_chosen);
    }
    
    
    // Method to create a specific choice instance
    public AbstractData createInstance(int chosen)
    {
	switch (chosen) {
	    case ctfc2bit_chosen:
		return new INTEGER();
	    case ctfc4bit_chosen:
		return new INTEGER();
	    case ctfc6bit_chosen:
		return new INTEGER();
	    case ctfc8bit_chosen:
		return new INTEGER();
	    case ctfc12bit_chosen:
		return new INTEGER();
	    case ctfc16bit_chosen:
		return new INTEGER();
	    case ctfc24bit_chosen:
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
	    "TFCS_InfoForDSCH"
	),
	new QName (
	    "InformationElements",
	    "TFCS-InfoForDSCH"
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
		    "ctfc2bit",
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
		    "ctfc4bit",
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
		    "ctfc6bit",
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
		    "ctfc8bit",
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
				    new com.oss.asn1.INTEGER(4095),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(4095)
			    ),
			    null
			)
		    ),
		    "ctfc12bit",
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
				    new com.oss.asn1.INTEGER(65535),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(65535)
			    ),
			    null
			)
		    ),
		    "ctfc16bit",
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
				    new com.oss.asn1.INTEGER(16777215),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(16777215)
			    ),
			    null
			)
		    ),
		    "ctfc24bit",
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
     * Get the type descriptor (TypeInfo) of 'this' TFCS_InfoForDSCH object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' TFCS_InfoForDSCH object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for TFCS_InfoForDSCH
