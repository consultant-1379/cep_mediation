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
 * Define the ASN1 Type UE_Positioning_GANSS_EarthOrientPara from ASN1 Module InformationElements.
 * @see Sequence
 */

public class UE_Positioning_GANSS_EarthOrientPara extends Sequence {
    
    /**
     * The default constructor.
     */
    public UE_Positioning_GANSS_EarthOrientPara()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public UE_Positioning_GANSS_EarthOrientPara(BitString teop, BitString pmX, 
		    BitString pmXdot, BitString pmY, BitString pmYdot, 
		    BitString deltaUT1, BitString deltaUT1dot)
    {
	setTeop(teop);
	setPmX(pmX);
	setPmXdot(pmXdot);
	setPmY(pmY);
	setPmYdot(pmYdot);
	setDeltaUT1(deltaUT1);
	setDeltaUT1dot(deltaUT1dot);
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
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[7];
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
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "teop"
    public BitString getTeop()
    {
	return (BitString)mComponents[0];
    }
    
    public void setTeop(BitString teop)
    {
	mComponents[0] = teop;
    }
    
    
    // Methods for field "pmX"
    public BitString getPmX()
    {
	return (BitString)mComponents[1];
    }
    
    public void setPmX(BitString pmX)
    {
	mComponents[1] = pmX;
    }
    
    
    // Methods for field "pmXdot"
    public BitString getPmXdot()
    {
	return (BitString)mComponents[2];
    }
    
    public void setPmXdot(BitString pmXdot)
    {
	mComponents[2] = pmXdot;
    }
    
    
    // Methods for field "pmY"
    public BitString getPmY()
    {
	return (BitString)mComponents[3];
    }
    
    public void setPmY(BitString pmY)
    {
	mComponents[3] = pmY;
    }
    
    
    // Methods for field "pmYdot"
    public BitString getPmYdot()
    {
	return (BitString)mComponents[4];
    }
    
    public void setPmYdot(BitString pmYdot)
    {
	mComponents[4] = pmYdot;
    }
    
    
    // Methods for field "deltaUT1"
    public BitString getDeltaUT1()
    {
	return (BitString)mComponents[5];
    }
    
    public void setDeltaUT1(BitString deltaUT1)
    {
	mComponents[5] = deltaUT1;
    }
    
    
    // Methods for field "deltaUT1dot"
    public BitString getDeltaUT1dot()
    {
	return (BitString)mComponents[6];
    }
    
    public void setDeltaUT1dot(BitString deltaUT1dot)
    {
	mComponents[6] = deltaUT1dot;
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
	    "UE_Positioning_GANSS_EarthOrientPara"
	),
	new QName (
	    "InformationElements",
	    "UE-Positioning-GANSS-EarthOrientPara"
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
		    "teop",
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
		    "pmX",
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
		    "pmXdot",
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
		    "pmY",
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
		    "pmYdot",
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
				    new com.oss.asn1.INTEGER(31)
				)
			    ),
			    new Bounds (
				new java.lang.Long(31),
				new java.lang.Long(31)
			    ),
			    null
			)
		    ),
		    "deltaUT1",
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
				    new com.oss.asn1.INTEGER(19)
				)
			    ),
			    new Bounds (
				new java.lang.Long(19),
				new java.lang.Long(19)
			    ),
			    null
			)
		    ),
		    "deltaUT1dot",
		    6,
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
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' UE_Positioning_GANSS_EarthOrientPara object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UE_Positioning_GANSS_EarthOrientPara object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UE_Positioning_GANSS_EarthOrientPara
