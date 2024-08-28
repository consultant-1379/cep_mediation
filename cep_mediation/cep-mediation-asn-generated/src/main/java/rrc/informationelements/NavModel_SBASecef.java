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
 * Define the ASN1 Type NavModel_SBASecef from ASN1 Module InformationElements.
 * @see Sequence
 */

public class NavModel_SBASecef extends Sequence {
    
    /**
     * The default constructor.
     */
    public NavModel_SBASecef()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public NavModel_SBASecef(BitString sbasTo, BitString sbasAccuracy, 
		    BitString sbasXg, BitString sbasYg, BitString sbasZg, 
		    BitString sbasXgDot, BitString sbasYgDot, 
		    BitString sbasZgDot, BitString sbasXgDotDot, 
		    BitString sbagYgDotDot, BitString sbasZgDotDot)
    {
	setSbasTo(sbasTo);
	setSbasAccuracy(sbasAccuracy);
	setSbasXg(sbasXg);
	setSbasYg(sbasYg);
	setSbasZg(sbasZg);
	setSbasXgDot(sbasXgDot);
	setSbasYgDot(sbasYgDot);
	setSbasZgDot(sbasZgDot);
	setSbasXgDotDot(sbasXgDotDot);
	setSbagYgDotDot(sbagYgDotDot);
	setSbasZgDotDot(sbasZgDotDot);
    }
    
    /**
     * Construct with required components.
     */
    public NavModel_SBASecef(BitString sbasAccuracy, BitString sbasXg, 
		    BitString sbasYg, BitString sbasZg, BitString sbasXgDot, 
		    BitString sbasYgDot, BitString sbasZgDot, 
		    BitString sbasXgDotDot, BitString sbagYgDotDot, 
		    BitString sbasZgDotDot)
    {
	setSbasAccuracy(sbasAccuracy);
	setSbasXg(sbasXg);
	setSbasYg(sbasYg);
	setSbasZg(sbasZg);
	setSbasXgDot(sbasXgDot);
	setSbasYgDot(sbasYgDot);
	setSbasZgDot(sbasZgDot);
	setSbasXgDotDot(sbasXgDotDot);
	setSbagYgDotDot(sbagYgDotDot);
	setSbasZgDotDot(sbasZgDotDot);
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
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[11];
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
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "sbasTo"
    public BitString getSbasTo()
    {
	return (BitString)mComponents[0];
    }
    
    public void setSbasTo(BitString sbasTo)
    {
	mComponents[0] = sbasTo;
    }
    
    public boolean hasSbasTo()
    {
	return componentIsPresent(0);
    }
    
    public void deleteSbasTo()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "sbasAccuracy"
    public BitString getSbasAccuracy()
    {
	return (BitString)mComponents[1];
    }
    
    public void setSbasAccuracy(BitString sbasAccuracy)
    {
	mComponents[1] = sbasAccuracy;
    }
    
    
    // Methods for field "sbasXg"
    public BitString getSbasXg()
    {
	return (BitString)mComponents[2];
    }
    
    public void setSbasXg(BitString sbasXg)
    {
	mComponents[2] = sbasXg;
    }
    
    
    // Methods for field "sbasYg"
    public BitString getSbasYg()
    {
	return (BitString)mComponents[3];
    }
    
    public void setSbasYg(BitString sbasYg)
    {
	mComponents[3] = sbasYg;
    }
    
    
    // Methods for field "sbasZg"
    public BitString getSbasZg()
    {
	return (BitString)mComponents[4];
    }
    
    public void setSbasZg(BitString sbasZg)
    {
	mComponents[4] = sbasZg;
    }
    
    
    // Methods for field "sbasXgDot"
    public BitString getSbasXgDot()
    {
	return (BitString)mComponents[5];
    }
    
    public void setSbasXgDot(BitString sbasXgDot)
    {
	mComponents[5] = sbasXgDot;
    }
    
    
    // Methods for field "sbasYgDot"
    public BitString getSbasYgDot()
    {
	return (BitString)mComponents[6];
    }
    
    public void setSbasYgDot(BitString sbasYgDot)
    {
	mComponents[6] = sbasYgDot;
    }
    
    
    // Methods for field "sbasZgDot"
    public BitString getSbasZgDot()
    {
	return (BitString)mComponents[7];
    }
    
    public void setSbasZgDot(BitString sbasZgDot)
    {
	mComponents[7] = sbasZgDot;
    }
    
    
    // Methods for field "sbasXgDotDot"
    public BitString getSbasXgDotDot()
    {
	return (BitString)mComponents[8];
    }
    
    public void setSbasXgDotDot(BitString sbasXgDotDot)
    {
	mComponents[8] = sbasXgDotDot;
    }
    
    
    // Methods for field "sbagYgDotDot"
    public BitString getSbagYgDotDot()
    {
	return (BitString)mComponents[9];
    }
    
    public void setSbagYgDotDot(BitString sbagYgDotDot)
    {
	mComponents[9] = sbagYgDotDot;
    }
    
    
    // Methods for field "sbasZgDotDot"
    public BitString getSbasZgDotDot()
    {
	return (BitString)mComponents[10];
    }
    
    public void setSbasZgDotDot(BitString sbasZgDotDot)
    {
	mComponents[10] = sbasZgDotDot;
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
	    "NavModel_SBASecef"
	),
	new QName (
	    "InformationElements",
	    "NavModel-SBASecef"
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
		    "sbasTo",
		    0,
		    3,
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
				    new com.oss.asn1.INTEGER(4)
				)
			    ),
			    new Bounds (
				new java.lang.Long(4),
				new java.lang.Long(4)
			    ),
			    null
			)
		    ),
		    "sbasAccuracy",
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
				    new com.oss.asn1.INTEGER(30)
				)
			    ),
			    new Bounds (
				new java.lang.Long(30),
				new java.lang.Long(30)
			    ),
			    null
			)
		    ),
		    "sbasXg",
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
				    new com.oss.asn1.INTEGER(30)
				)
			    ),
			    new Bounds (
				new java.lang.Long(30),
				new java.lang.Long(30)
			    ),
			    null
			)
		    ),
		    "sbasYg",
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
		    "sbasZg",
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
		    "sbasXgDot",
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
		    "sbasYgDot",
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
				    new com.oss.asn1.INTEGER(18)
				)
			    ),
			    new Bounds (
				new java.lang.Long(18),
				new java.lang.Long(18)
			    ),
			    null
			)
		    ),
		    "sbasZgDot",
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
		    "sbasXgDotDot",
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
		    "sbagYgDotDot",
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
		    "sbasZgDotDot",
		    10,
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
			new TagDecoderElement((short)0x8000, 0),
			new TagDecoderElement((short)0x8001, 1)
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
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' NavModel_SBASecef object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' NavModel_SBASecef object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for NavModel_SBASecef
