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
 * Define the ASN1 Type NavModel_CNAVKeplerianSet from ASN1 Module InformationElements.
 * @see Sequence
 */

public class NavModel_CNAVKeplerianSet extends Sequence {
    
    /**
     * The default constructor.
     */
    public NavModel_CNAVKeplerianSet()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public NavModel_CNAVKeplerianSet(BitString cnavTop, 
		    BitString cnavURAindex, BitString cnavDeltaA, 
		    BitString cnavAdot, BitString cnavDeltaNo, 
		    BitString cnavDeltaNoDot, BitString cnavMo, 
		    BitString cnavE, BitString cnavOmega, 
		    BitString cnavOMEGA0, BitString cnavDeltaOmegaDot, 
		    BitString cnavIo, BitString cnavIoDot, BitString cnavCis, 
		    BitString cnavCic, BitString cnavCrs, BitString cnavCrc, 
		    BitString cnavCus, BitString cnavCuc)
    {
	setCnavTop(cnavTop);
	setCnavURAindex(cnavURAindex);
	setCnavDeltaA(cnavDeltaA);
	setCnavAdot(cnavAdot);
	setCnavDeltaNo(cnavDeltaNo);
	setCnavDeltaNoDot(cnavDeltaNoDot);
	setCnavMo(cnavMo);
	setCnavE(cnavE);
	setCnavOmega(cnavOmega);
	setCnavOMEGA0(cnavOMEGA0);
	setCnavDeltaOmegaDot(cnavDeltaOmegaDot);
	setCnavIo(cnavIo);
	setCnavIoDot(cnavIoDot);
	setCnavCis(cnavCis);
	setCnavCic(cnavCic);
	setCnavCrs(cnavCrs);
	setCnavCrc(cnavCrc);
	setCnavCus(cnavCus);
	setCnavCuc(cnavCuc);
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
	mComponents[15] = new BitString();
	mComponents[16] = new BitString();
	mComponents[17] = new BitString();
	mComponents[18] = new BitString();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[19];
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
	    case 15:
		return new BitString();
	    case 16:
		return new BitString();
	    case 17:
		return new BitString();
	    case 18:
		return new BitString();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "cnavTop"
    public BitString getCnavTop()
    {
	return (BitString)mComponents[0];
    }
    
    public void setCnavTop(BitString cnavTop)
    {
	mComponents[0] = cnavTop;
    }
    
    
    // Methods for field "cnavURAindex"
    public BitString getCnavURAindex()
    {
	return (BitString)mComponents[1];
    }
    
    public void setCnavURAindex(BitString cnavURAindex)
    {
	mComponents[1] = cnavURAindex;
    }
    
    
    // Methods for field "cnavDeltaA"
    public BitString getCnavDeltaA()
    {
	return (BitString)mComponents[2];
    }
    
    public void setCnavDeltaA(BitString cnavDeltaA)
    {
	mComponents[2] = cnavDeltaA;
    }
    
    
    // Methods for field "cnavAdot"
    public BitString getCnavAdot()
    {
	return (BitString)mComponents[3];
    }
    
    public void setCnavAdot(BitString cnavAdot)
    {
	mComponents[3] = cnavAdot;
    }
    
    
    // Methods for field "cnavDeltaNo"
    public BitString getCnavDeltaNo()
    {
	return (BitString)mComponents[4];
    }
    
    public void setCnavDeltaNo(BitString cnavDeltaNo)
    {
	mComponents[4] = cnavDeltaNo;
    }
    
    
    // Methods for field "cnavDeltaNoDot"
    public BitString getCnavDeltaNoDot()
    {
	return (BitString)mComponents[5];
    }
    
    public void setCnavDeltaNoDot(BitString cnavDeltaNoDot)
    {
	mComponents[5] = cnavDeltaNoDot;
    }
    
    
    // Methods for field "cnavMo"
    public BitString getCnavMo()
    {
	return (BitString)mComponents[6];
    }
    
    public void setCnavMo(BitString cnavMo)
    {
	mComponents[6] = cnavMo;
    }
    
    
    // Methods for field "cnavE"
    public BitString getCnavE()
    {
	return (BitString)mComponents[7];
    }
    
    public void setCnavE(BitString cnavE)
    {
	mComponents[7] = cnavE;
    }
    
    
    // Methods for field "cnavOmega"
    public BitString getCnavOmega()
    {
	return (BitString)mComponents[8];
    }
    
    public void setCnavOmega(BitString cnavOmega)
    {
	mComponents[8] = cnavOmega;
    }
    
    
    // Methods for field "cnavOMEGA0"
    public BitString getCnavOMEGA0()
    {
	return (BitString)mComponents[9];
    }
    
    public void setCnavOMEGA0(BitString cnavOMEGA0)
    {
	mComponents[9] = cnavOMEGA0;
    }
    
    
    // Methods for field "cnavDeltaOmegaDot"
    public BitString getCnavDeltaOmegaDot()
    {
	return (BitString)mComponents[10];
    }
    
    public void setCnavDeltaOmegaDot(BitString cnavDeltaOmegaDot)
    {
	mComponents[10] = cnavDeltaOmegaDot;
    }
    
    
    // Methods for field "cnavIo"
    public BitString getCnavIo()
    {
	return (BitString)mComponents[11];
    }
    
    public void setCnavIo(BitString cnavIo)
    {
	mComponents[11] = cnavIo;
    }
    
    
    // Methods for field "cnavIoDot"
    public BitString getCnavIoDot()
    {
	return (BitString)mComponents[12];
    }
    
    public void setCnavIoDot(BitString cnavIoDot)
    {
	mComponents[12] = cnavIoDot;
    }
    
    
    // Methods for field "cnavCis"
    public BitString getCnavCis()
    {
	return (BitString)mComponents[13];
    }
    
    public void setCnavCis(BitString cnavCis)
    {
	mComponents[13] = cnavCis;
    }
    
    
    // Methods for field "cnavCic"
    public BitString getCnavCic()
    {
	return (BitString)mComponents[14];
    }
    
    public void setCnavCic(BitString cnavCic)
    {
	mComponents[14] = cnavCic;
    }
    
    
    // Methods for field "cnavCrs"
    public BitString getCnavCrs()
    {
	return (BitString)mComponents[15];
    }
    
    public void setCnavCrs(BitString cnavCrs)
    {
	mComponents[15] = cnavCrs;
    }
    
    
    // Methods for field "cnavCrc"
    public BitString getCnavCrc()
    {
	return (BitString)mComponents[16];
    }
    
    public void setCnavCrc(BitString cnavCrc)
    {
	mComponents[16] = cnavCrc;
    }
    
    
    // Methods for field "cnavCus"
    public BitString getCnavCus()
    {
	return (BitString)mComponents[17];
    }
    
    public void setCnavCus(BitString cnavCus)
    {
	mComponents[17] = cnavCus;
    }
    
    
    // Methods for field "cnavCuc"
    public BitString getCnavCuc()
    {
	return (BitString)mComponents[18];
    }
    
    public void setCnavCuc(BitString cnavCuc)
    {
	mComponents[18] = cnavCuc;
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
	    "NavModel_CNAVKeplerianSet"
	),
	new QName (
	    "InformationElements",
	    "NavModel-CNAVKeplerianSet"
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
		    "cnavTop",
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
		    "cnavURAindex",
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
		    "cnavDeltaA",
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
				    new com.oss.asn1.INTEGER(25)
				)
			    ),
			    new Bounds (
				new java.lang.Long(25),
				new java.lang.Long(25)
			    ),
			    null
			)
		    ),
		    "cnavAdot",
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
				    new com.oss.asn1.INTEGER(17)
				)
			    ),
			    new Bounds (
				new java.lang.Long(17),
				new java.lang.Long(17)
			    ),
			    null
			)
		    ),
		    "cnavDeltaNo",
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
				    new com.oss.asn1.INTEGER(23)
				)
			    ),
			    new Bounds (
				new java.lang.Long(23),
				new java.lang.Long(23)
			    ),
			    null
			)
		    ),
		    "cnavDeltaNoDot",
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
				    new com.oss.asn1.INTEGER(33)
				)
			    ),
			    new Bounds (
				new java.lang.Long(33),
				new java.lang.Long(33)
			    ),
			    null
			)
		    ),
		    "cnavMo",
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
				    new com.oss.asn1.INTEGER(33)
				)
			    ),
			    new Bounds (
				new java.lang.Long(33),
				new java.lang.Long(33)
			    ),
			    null
			)
		    ),
		    "cnavE",
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
				    new com.oss.asn1.INTEGER(33)
				)
			    ),
			    new Bounds (
				new java.lang.Long(33),
				new java.lang.Long(33)
			    ),
			    null
			)
		    ),
		    "cnavOmega",
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
				    new com.oss.asn1.INTEGER(33)
				)
			    ),
			    new Bounds (
				new java.lang.Long(33),
				new java.lang.Long(33)
			    ),
			    null
			)
		    ),
		    "cnavOMEGA0",
		    9,
		    2,
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
				    new com.oss.asn1.INTEGER(17)
				)
			    ),
			    new Bounds (
				new java.lang.Long(17),
				new java.lang.Long(17)
			    ),
			    null
			)
		    ),
		    "cnavDeltaOmegaDot",
		    10,
		    2,
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
				    new com.oss.asn1.INTEGER(33)
				)
			    ),
			    new Bounds (
				new java.lang.Long(33),
				new java.lang.Long(33)
			    ),
			    null
			)
		    ),
		    "cnavIo",
		    11,
		    2,
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
				    new com.oss.asn1.INTEGER(15)
				)
			    ),
			    new Bounds (
				new java.lang.Long(15),
				new java.lang.Long(15)
			    ),
			    null
			)
		    ),
		    "cnavIoDot",
		    12,
		    2,
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
				    new com.oss.asn1.INTEGER(16)
				)
			    ),
			    new Bounds (
				new java.lang.Long(16),
				new java.lang.Long(16)
			    ),
			    null
			)
		    ),
		    "cnavCis",
		    13,
		    2,
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
				    new com.oss.asn1.INTEGER(16)
				)
			    ),
			    new Bounds (
				new java.lang.Long(16),
				new java.lang.Long(16)
			    ),
			    null
			)
		    ),
		    "cnavCic",
		    14,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x800f
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
				    new com.oss.asn1.INTEGER(24)
				)
			    ),
			    new Bounds (
				new java.lang.Long(24),
				new java.lang.Long(24)
			    ),
			    null
			)
		    ),
		    "cnavCrs",
		    15,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8010
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
				    new com.oss.asn1.INTEGER(24)
				)
			    ),
			    new Bounds (
				new java.lang.Long(24),
				new java.lang.Long(24)
			    ),
			    null
			)
		    ),
		    "cnavCrc",
		    16,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8011
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
				    new com.oss.asn1.INTEGER(21)
				)
			    ),
			    new Bounds (
				new java.lang.Long(21),
				new java.lang.Long(21)
			    ),
			    null
			)
		    ),
		    "cnavCus",
		    17,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8012
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
				    new com.oss.asn1.INTEGER(21)
				)
			    ),
			    new Bounds (
				new java.lang.Long(21),
				new java.lang.Long(21)
			    ),
			    null
			)
		    ),
		    "cnavCuc",
		    18,
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
			new TagDecoderElement((short)0x8009, 9)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800a, 10)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800b, 11)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800c, 12)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800d, 13)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800e, 14)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800f, 15)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8010, 16)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8011, 17)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8012, 18)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' NavModel_CNAVKeplerianSet object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' NavModel_CNAVKeplerianSet object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for NavModel_CNAVKeplerianSet
