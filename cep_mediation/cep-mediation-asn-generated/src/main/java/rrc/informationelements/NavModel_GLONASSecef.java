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
 * Define the ASN1 Type NavModel_GLONASSecef from ASN1 Module InformationElements.
 * @see Sequence
 */

public class NavModel_GLONASSecef extends Sequence {
    
    /**
     * The default constructor.
     */
    public NavModel_GLONASSecef()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public NavModel_GLONASSecef(BitString gloEn, BitString gloP1, 
		    BitString gloP2, BitString gloM, BitString gloX, 
		    BitString gloXdot, BitString gloXdotdot, BitString gloY, 
		    BitString gloYdot, BitString gloYdotdot, BitString gloZ, 
		    BitString gloZdot, BitString gloZdotdot)
    {
	setGloEn(gloEn);
	setGloP1(gloP1);
	setGloP2(gloP2);
	setGloM(gloM);
	setGloX(gloX);
	setGloXdot(gloXdot);
	setGloXdotdot(gloXdotdot);
	setGloY(gloY);
	setGloYdot(gloYdot);
	setGloYdotdot(gloYdotdot);
	setGloZ(gloZ);
	setGloZdot(gloZdot);
	setGloZdotdot(gloZdotdot);
    }
    
    /**
     * Construct with required components.
     */
    public NavModel_GLONASSecef(BitString gloEn, BitString gloP1, 
		    BitString gloP2, BitString gloX, BitString gloXdot, 
		    BitString gloXdotdot, BitString gloY, BitString gloYdot, 
		    BitString gloYdotdot, BitString gloZ, BitString gloZdot, 
		    BitString gloZdotdot)
    {
	setGloEn(gloEn);
	setGloP1(gloP1);
	setGloP2(gloP2);
	setGloX(gloX);
	setGloXdot(gloXdot);
	setGloXdotdot(gloXdotdot);
	setGloY(gloY);
	setGloYdot(gloYdot);
	setGloYdotdot(gloYdotdot);
	setGloZ(gloZ);
	setGloZdot(gloZdot);
	setGloZdotdot(gloZdotdot);
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
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[13];
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
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "gloEn"
    public BitString getGloEn()
    {
	return (BitString)mComponents[0];
    }
    
    public void setGloEn(BitString gloEn)
    {
	mComponents[0] = gloEn;
    }
    
    
    // Methods for field "gloP1"
    public BitString getGloP1()
    {
	return (BitString)mComponents[1];
    }
    
    public void setGloP1(BitString gloP1)
    {
	mComponents[1] = gloP1;
    }
    
    
    // Methods for field "gloP2"
    public BitString getGloP2()
    {
	return (BitString)mComponents[2];
    }
    
    public void setGloP2(BitString gloP2)
    {
	mComponents[2] = gloP2;
    }
    
    
    // Methods for field "gloM"
    public BitString getGloM()
    {
	return (BitString)mComponents[3];
    }
    
    public void setGloM(BitString gloM)
    {
	mComponents[3] = gloM;
    }
    
    public boolean hasGloM()
    {
	return componentIsPresent(3);
    }
    
    public void deleteGloM()
    {
	setComponentAbsent(3);
    }
    
    
    // Methods for field "gloX"
    public BitString getGloX()
    {
	return (BitString)mComponents[4];
    }
    
    public void setGloX(BitString gloX)
    {
	mComponents[4] = gloX;
    }
    
    
    // Methods for field "gloXdot"
    public BitString getGloXdot()
    {
	return (BitString)mComponents[5];
    }
    
    public void setGloXdot(BitString gloXdot)
    {
	mComponents[5] = gloXdot;
    }
    
    
    // Methods for field "gloXdotdot"
    public BitString getGloXdotdot()
    {
	return (BitString)mComponents[6];
    }
    
    public void setGloXdotdot(BitString gloXdotdot)
    {
	mComponents[6] = gloXdotdot;
    }
    
    
    // Methods for field "gloY"
    public BitString getGloY()
    {
	return (BitString)mComponents[7];
    }
    
    public void setGloY(BitString gloY)
    {
	mComponents[7] = gloY;
    }
    
    
    // Methods for field "gloYdot"
    public BitString getGloYdot()
    {
	return (BitString)mComponents[8];
    }
    
    public void setGloYdot(BitString gloYdot)
    {
	mComponents[8] = gloYdot;
    }
    
    
    // Methods for field "gloYdotdot"
    public BitString getGloYdotdot()
    {
	return (BitString)mComponents[9];
    }
    
    public void setGloYdotdot(BitString gloYdotdot)
    {
	mComponents[9] = gloYdotdot;
    }
    
    
    // Methods for field "gloZ"
    public BitString getGloZ()
    {
	return (BitString)mComponents[10];
    }
    
    public void setGloZ(BitString gloZ)
    {
	mComponents[10] = gloZ;
    }
    
    
    // Methods for field "gloZdot"
    public BitString getGloZdot()
    {
	return (BitString)mComponents[11];
    }
    
    public void setGloZdot(BitString gloZdot)
    {
	mComponents[11] = gloZdot;
    }
    
    
    // Methods for field "gloZdotdot"
    public BitString getGloZdotdot()
    {
	return (BitString)mComponents[12];
    }
    
    public void setGloZdotdot(BitString gloZdotdot)
    {
	mComponents[12] = gloZdotdot;
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
	    "NavModel_GLONASSecef"
	),
	new QName (
	    "InformationElements",
	    "NavModel-GLONASSecef"
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
		    "gloEn",
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
				    new com.oss.asn1.INTEGER(2)
				)
			    ),
			    new Bounds (
				new java.lang.Long(2),
				new java.lang.Long(2)
			    ),
			    null
			)
		    ),
		    "gloP1",
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
				    new com.oss.asn1.INTEGER(1)
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(1)
			    ),
			    null
			)
		    ),
		    "gloP2",
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
				    new com.oss.asn1.INTEGER(2)
				)
			    ),
			    new Bounds (
				new java.lang.Long(2),
				new java.lang.Long(2)
			    ),
			    null
			)
		    ),
		    "gloM",
		    3,
		    3,
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
				    new com.oss.asn1.INTEGER(27)
				)
			    ),
			    new Bounds (
				new java.lang.Long(27),
				new java.lang.Long(27)
			    ),
			    null
			)
		    ),
		    "gloX",
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
		    "gloXdot",
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
		    "gloXdotdot",
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
				    new com.oss.asn1.INTEGER(27)
				)
			    ),
			    new Bounds (
				new java.lang.Long(27),
				new java.lang.Long(27)
			    ),
			    null
			)
		    ),
		    "gloY",
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
		    "gloYdot",
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
		    "gloYdotdot",
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
				    new com.oss.asn1.INTEGER(27)
				)
			    ),
			    new Bounds (
				new java.lang.Long(27),
				new java.lang.Long(27)
			    ),
			    null
			)
		    ),
		    "gloZ",
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
		    "gloZdot",
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
		    "gloZdotdot",
		    12,
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
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4)
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
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' NavModel_GLONASSecef object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' NavModel_GLONASSecef object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for NavModel_GLONASSecef
