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
 * Define the ASN1 Type CNAVclockModel from ASN1 Module InformationElements.
 * @see Sequence
 */

public class CNAVclockModel extends Sequence {
    
    /**
     * The default constructor.
     */
    public CNAVclockModel()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public CNAVclockModel(BitString cnavToc, BitString cnavTop, 
		    BitString cnavURA0, BitString cnavURA1, 
		    BitString cnavURA2, BitString cnavAf2, BitString cnavAf1, 
		    BitString cnavAf0, BitString cnavTgd, 
		    BitString cnavISCl1cp, BitString cnavISCl1cd, 
		    BitString cnavISCl1ca, BitString cnavISCl2c, 
		    BitString cnavISCl5i5, BitString cnavISCl5q5)
    {
	setCnavToc(cnavToc);
	setCnavTop(cnavTop);
	setCnavURA0(cnavURA0);
	setCnavURA1(cnavURA1);
	setCnavURA2(cnavURA2);
	setCnavAf2(cnavAf2);
	setCnavAf1(cnavAf1);
	setCnavAf0(cnavAf0);
	setCnavTgd(cnavTgd);
	setCnavISCl1cp(cnavISCl1cp);
	setCnavISCl1cd(cnavISCl1cd);
	setCnavISCl1ca(cnavISCl1ca);
	setCnavISCl2c(cnavISCl2c);
	setCnavISCl5i5(cnavISCl5i5);
	setCnavISCl5q5(cnavISCl5q5);
    }
    
    /**
     * Construct with required components.
     */
    public CNAVclockModel(BitString cnavToc, BitString cnavTop, 
		    BitString cnavURA0, BitString cnavURA1, 
		    BitString cnavURA2, BitString cnavAf2, BitString cnavAf1, 
		    BitString cnavAf0, BitString cnavTgd)
    {
	setCnavToc(cnavToc);
	setCnavTop(cnavTop);
	setCnavURA0(cnavURA0);
	setCnavURA1(cnavURA1);
	setCnavURA2(cnavURA2);
	setCnavAf2(cnavAf2);
	setCnavAf1(cnavAf1);
	setCnavAf0(cnavAf0);
	setCnavTgd(cnavTgd);
    }
    
    public void initComponents()
    {
	mComponents[0] = new BitString();
	mComponents[1] = new BitString();
	mComponents[2] = new BitString();
	mComponents[3] = new BitString();
	mComponents[4] = new BitString();
	mComponents[5] = new BitString();
	mComponents[6] = new BitString();
	mComponents[7] = new BitString();
	mComponents[8] = new BitString();
	mComponents[9] = new BitString();
	mComponents[10] = new BitString();
	mComponents[11] = new BitString();
	mComponents[12] = new BitString();
	mComponents[13] = new BitString();
	mComponents[14] = new BitString();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[15];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new BitString();
	    case 1:
		return new BitString();
	    case 2:
		return new BitString();
	    case 3:
		return new BitString();
	    case 4:
		return new BitString();
	    case 5:
		return new BitString();
	    case 6:
		return new BitString();
	    case 7:
		return new BitString();
	    case 8:
		return new BitString();
	    case 9:
		return new BitString();
	    case 10:
		return new BitString();
	    case 11:
		return new BitString();
	    case 12:
		return new BitString();
	    case 13:
		return new BitString();
	    case 14:
		return new BitString();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "cnavToc"
    public BitString getCnavToc()
    {
	return (BitString)mComponents[0];
    }
    
    public void setCnavToc(BitString cnavToc)
    {
	mComponents[0] = cnavToc;
    }
    
    
    // Methods for field "cnavTop"
    public BitString getCnavTop()
    {
	return (BitString)mComponents[1];
    }
    
    public void setCnavTop(BitString cnavTop)
    {
	mComponents[1] = cnavTop;
    }
    
    
    // Methods for field "cnavURA0"
    public BitString getCnavURA0()
    {
	return (BitString)mComponents[2];
    }
    
    public void setCnavURA0(BitString cnavURA0)
    {
	mComponents[2] = cnavURA0;
    }
    
    
    // Methods for field "cnavURA1"
    public BitString getCnavURA1()
    {
	return (BitString)mComponents[3];
    }
    
    public void setCnavURA1(BitString cnavURA1)
    {
	mComponents[3] = cnavURA1;
    }
    
    
    // Methods for field "cnavURA2"
    public BitString getCnavURA2()
    {
	return (BitString)mComponents[4];
    }
    
    public void setCnavURA2(BitString cnavURA2)
    {
	mComponents[4] = cnavURA2;
    }
    
    
    // Methods for field "cnavAf2"
    public BitString getCnavAf2()
    {
	return (BitString)mComponents[5];
    }
    
    public void setCnavAf2(BitString cnavAf2)
    {
	mComponents[5] = cnavAf2;
    }
    
    
    // Methods for field "cnavAf1"
    public BitString getCnavAf1()
    {
	return (BitString)mComponents[6];
    }
    
    public void setCnavAf1(BitString cnavAf1)
    {
	mComponents[6] = cnavAf1;
    }
    
    
    // Methods for field "cnavAf0"
    public BitString getCnavAf0()
    {
	return (BitString)mComponents[7];
    }
    
    public void setCnavAf0(BitString cnavAf0)
    {
	mComponents[7] = cnavAf0;
    }
    
    
    // Methods for field "cnavTgd"
    public BitString getCnavTgd()
    {
	return (BitString)mComponents[8];
    }
    
    public void setCnavTgd(BitString cnavTgd)
    {
	mComponents[8] = cnavTgd;
    }
    
    
    // Methods for field "cnavISCl1cp"
    public BitString getCnavISCl1cp()
    {
	return (BitString)mComponents[9];
    }
    
    public void setCnavISCl1cp(BitString cnavISCl1cp)
    {
	mComponents[9] = cnavISCl1cp;
    }
    
    public boolean hasCnavISCl1cp()
    {
	return componentIsPresent(9);
    }
    
    public void deleteCnavISCl1cp()
    {
	setComponentAbsent(9);
    }
    
    
    // Methods for field "cnavISCl1cd"
    public BitString getCnavISCl1cd()
    {
	return (BitString)mComponents[10];
    }
    
    public void setCnavISCl1cd(BitString cnavISCl1cd)
    {
	mComponents[10] = cnavISCl1cd;
    }
    
    public boolean hasCnavISCl1cd()
    {
	return componentIsPresent(10);
    }
    
    public void deleteCnavISCl1cd()
    {
	setComponentAbsent(10);
    }
    
    
    // Methods for field "cnavISCl1ca"
    public BitString getCnavISCl1ca()
    {
	return (BitString)mComponents[11];
    }
    
    public void setCnavISCl1ca(BitString cnavISCl1ca)
    {
	mComponents[11] = cnavISCl1ca;
    }
    
    public boolean hasCnavISCl1ca()
    {
	return componentIsPresent(11);
    }
    
    public void deleteCnavISCl1ca()
    {
	setComponentAbsent(11);
    }
    
    
    // Methods for field "cnavISCl2c"
    public BitString getCnavISCl2c()
    {
	return (BitString)mComponents[12];
    }
    
    public void setCnavISCl2c(BitString cnavISCl2c)
    {
	mComponents[12] = cnavISCl2c;
    }
    
    public boolean hasCnavISCl2c()
    {
	return componentIsPresent(12);
    }
    
    public void deleteCnavISCl2c()
    {
	setComponentAbsent(12);
    }
    
    
    // Methods for field "cnavISCl5i5"
    public BitString getCnavISCl5i5()
    {
	return (BitString)mComponents[13];
    }
    
    public void setCnavISCl5i5(BitString cnavISCl5i5)
    {
	mComponents[13] = cnavISCl5i5;
    }
    
    public boolean hasCnavISCl5i5()
    {
	return componentIsPresent(13);
    }
    
    public void deleteCnavISCl5i5()
    {
	setComponentAbsent(13);
    }
    
    
    // Methods for field "cnavISCl5q5"
    public BitString getCnavISCl5q5()
    {
	return (BitString)mComponents[14];
    }
    
    public void setCnavISCl5q5(BitString cnavISCl5q5)
    {
	mComponents[14] = cnavISCl5q5;
    }
    
    public boolean hasCnavISCl5q5()
    {
	return componentIsPresent(14);
    }
    
    public void deleteCnavISCl5q5()
    {
	setComponentAbsent(14);
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
	    "CNAVclockModel"
	),
	new QName (
	    "InformationElements",
	    "CNAVclockModel"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"BitString"
			    ),
			    new QName (
				"builtin",
				"BIT STRING"
			    ),
			    12314,
			    new SizeConstraint (
				new SingleValueConstraint (
				    new com.oss.asn1.INTEGER(11)
				)
			    ),
			    new Bounds (
				new java.lang.Long(11),
				new java.lang.Long(11)
			    ),
			    null
			)
		    ),
		    "cnavToc",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"BitString"
			    ),
			    new QName (
				"builtin",
				"BIT STRING"
			    ),
			    12314,
			    new SizeConstraint (
				new SingleValueConstraint (
				    new com.oss.asn1.INTEGER(11)
				)
			    ),
			    new Bounds (
				new java.lang.Long(11),
				new java.lang.Long(11)
			    ),
			    null
			)
		    ),
		    "cnavTop",
		    1,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"BitString"
			    ),
			    new QName (
				"builtin",
				"BIT STRING"
			    ),
			    12314,
			    new SizeConstraint (
				new SingleValueConstraint (
				    new com.oss.asn1.INTEGER(5)
				)
			    ),
			    new Bounds (
				new java.lang.Long(5),
				new java.lang.Long(5)
			    ),
			    null
			)
		    ),
		    "cnavURA0",
		    2,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"BitString"
			    ),
			    new QName (
				"builtin",
				"BIT STRING"
			    ),
			    12314,
			    new SizeConstraint (
				new SingleValueConstraint (
				    new com.oss.asn1.INTEGER(3)
				)
			    ),
			    new Bounds (
				new java.lang.Long(3),
				new java.lang.Long(3)
			    ),
			    null
			)
		    ),
		    "cnavURA1",
		    3,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8004
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"BitString"
			    ),
			    new QName (
				"builtin",
				"BIT STRING"
			    ),
			    12314,
			    new SizeConstraint (
				new SingleValueConstraint (
				    new com.oss.asn1.INTEGER(3)
				)
			    ),
			    new Bounds (
				new java.lang.Long(3),
				new java.lang.Long(3)
			    ),
			    null
			)
		    ),
		    "cnavURA2",
		    4,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8005
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"BitString"
			    ),
			    new QName (
				"builtin",
				"BIT STRING"
			    ),
			    12314,
			    new SizeConstraint (
				new SingleValueConstraint (
				    new com.oss.asn1.INTEGER(10)
				)
			    ),
			    new Bounds (
				new java.lang.Long(10),
				new java.lang.Long(10)
			    ),
			    null
			)
		    ),
		    "cnavAf2",
		    5,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8006
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"BitString"
			    ),
			    new QName (
				"builtin",
				"BIT STRING"
			    ),
			    12314,
			    new SizeConstraint (
				new SingleValueConstraint (
				    new com.oss.asn1.INTEGER(20)
				)
			    ),
			    new Bounds (
				new java.lang.Long(20),
				new java.lang.Long(20)
			    ),
			    null
			)
		    ),
		    "cnavAf1",
		    6,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8007
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"BitString"
			    ),
			    new QName (
				"builtin",
				"BIT STRING"
			    ),
			    12314,
			    new SizeConstraint (
				new SingleValueConstraint (
				    new com.oss.asn1.INTEGER(26)
				)
			    ),
			    new Bounds (
				new java.lang.Long(26),
				new java.lang.Long(26)
			    ),
			    null
			)
		    ),
		    "cnavAf0",
		    7,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8008
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"BitString"
			    ),
			    new QName (
				"builtin",
				"BIT STRING"
			    ),
			    12314,
			    new SizeConstraint (
				new SingleValueConstraint (
				    new com.oss.asn1.INTEGER(13)
				)
			    ),
			    new Bounds (
				new java.lang.Long(13),
				new java.lang.Long(13)
			    ),
			    null
			)
		    ),
		    "cnavTgd",
		    8,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8009
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"BitString"
			    ),
			    new QName (
				"builtin",
				"BIT STRING"
			    ),
			    12314,
			    new SizeConstraint (
				new SingleValueConstraint (
				    new com.oss.asn1.INTEGER(13)
				)
			    ),
			    new Bounds (
				new java.lang.Long(13),
				new java.lang.Long(13)
			    ),
			    null
			)
		    ),
		    "cnavISCl1cp",
		    9,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x800a
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"BitString"
			    ),
			    new QName (
				"builtin",
				"BIT STRING"
			    ),
			    12314,
			    new SizeConstraint (
				new SingleValueConstraint (
				    new com.oss.asn1.INTEGER(13)
				)
			    ),
			    new Bounds (
				new java.lang.Long(13),
				new java.lang.Long(13)
			    ),
			    null
			)
		    ),
		    "cnavISCl1cd",
		    10,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x800b
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"BitString"
			    ),
			    new QName (
				"builtin",
				"BIT STRING"
			    ),
			    12314,
			    new SizeConstraint (
				new SingleValueConstraint (
				    new com.oss.asn1.INTEGER(13)
				)
			    ),
			    new Bounds (
				new java.lang.Long(13),
				new java.lang.Long(13)
			    ),
			    null
			)
		    ),
		    "cnavISCl1ca",
		    11,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x800c
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"BitString"
			    ),
			    new QName (
				"builtin",
				"BIT STRING"
			    ),
			    12314,
			    new SizeConstraint (
				new SingleValueConstraint (
				    new com.oss.asn1.INTEGER(13)
				)
			    ),
			    new Bounds (
				new java.lang.Long(13),
				new java.lang.Long(13)
			    ),
			    null
			)
		    ),
		    "cnavISCl2c",
		    12,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x800d
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"BitString"
			    ),
			    new QName (
				"builtin",
				"BIT STRING"
			    ),
			    12314,
			    new SizeConstraint (
				new SingleValueConstraint (
				    new com.oss.asn1.INTEGER(13)
				)
			    ),
			    new Bounds (
				new java.lang.Long(13),
				new java.lang.Long(13)
			    ),
			    null
			)
		    ),
		    "cnavISCl5i5",
		    13,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x800e
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"BitString"
			    ),
			    new QName (
				"builtin",
				"BIT STRING"
			    ),
			    12314,
			    new SizeConstraint (
				new SingleValueConstraint (
				    new com.oss.asn1.INTEGER(13)
				)
			    ),
			    new Bounds (
				new java.lang.Long(13),
				new java.lang.Long(13)
			    ),
			    null
			)
		    ),
		    "cnavISCl5q5",
		    14,
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
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8003, 3)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8004, 4)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8005, 5)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8006, 6)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8007, 7)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8008, 8)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8009, 9),
			new TagDecoderElement((short)0x800a, 10),
			new TagDecoderElement((short)0x800b, 11),
			new TagDecoderElement((short)0x800c, 12),
			new TagDecoderElement((short)0x800d, 13),
			new TagDecoderElement((short)0x800e, 14)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800a, 10),
			new TagDecoderElement((short)0x800b, 11),
			new TagDecoderElement((short)0x800c, 12),
			new TagDecoderElement((short)0x800d, 13),
			new TagDecoderElement((short)0x800e, 14)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800b, 11),
			new TagDecoderElement((short)0x800c, 12),
			new TagDecoderElement((short)0x800d, 13),
			new TagDecoderElement((short)0x800e, 14)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800c, 12),
			new TagDecoderElement((short)0x800d, 13),
			new TagDecoderElement((short)0x800e, 14)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800d, 13),
			new TagDecoderElement((short)0x800e, 14)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800e, 14)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' CNAVclockModel object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' CNAVclockModel object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for CNAVclockModel
