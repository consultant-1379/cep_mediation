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
 * Define the ASN1 Type GANSS_SAT_Info_Almanac_SBASecef from ASN1 Module InformationElements.
 * @see Sequence
 */

public class GANSS_SAT_Info_Almanac_SBASecef extends Sequence {
    
    /**
     * The default constructor.
     */
    public GANSS_SAT_Info_Almanac_SBASecef()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public GANSS_SAT_Info_Almanac_SBASecef(BitString sbasAlmDataID, 
		    INTEGER svID, BitString sbasAlmHealth, 
		    BitString sbasAlmXg, BitString sbasAlmYg, 
		    BitString sbasAlmZg, BitString sbasAlmXgdot, 
		    BitString sbasAlmYgDot, BitString sbasAlmZgDot, 
		    BitString sbasAlmTo)
    {
	setSbasAlmDataID(sbasAlmDataID);
	setSvID(svID);
	setSbasAlmHealth(sbasAlmHealth);
	setSbasAlmXg(sbasAlmXg);
	setSbasAlmYg(sbasAlmYg);
	setSbasAlmZg(sbasAlmZg);
	setSbasAlmXgdot(sbasAlmXgdot);
	setSbasAlmYgDot(sbasAlmYgDot);
	setSbasAlmZgDot(sbasAlmZgDot);
	setSbasAlmTo(sbasAlmTo);
    }
    
    /**
     * Construct with components.
     */
    public GANSS_SAT_Info_Almanac_SBASecef(BitString sbasAlmDataID, long svID, 
		    BitString sbasAlmHealth, BitString sbasAlmXg, 
		    BitString sbasAlmYg, BitString sbasAlmZg, 
		    BitString sbasAlmXgdot, BitString sbasAlmYgDot, 
		    BitString sbasAlmZgDot, BitString sbasAlmTo)
    {
	this(sbasAlmDataID, new INTEGER(svID), sbasAlmHealth, sbasAlmXg, 
	     sbasAlmYg, sbasAlmZg, sbasAlmXgdot, sbasAlmYgDot, 
	     sbasAlmZgDot, sbasAlmTo);
    }
    
    public void initComponents()
    {
	mComponents[0] = new BitString();
	mComponents[1] = new INTEGER();
	mComponents[2] = new BitString();
	mComponents[3] = new BitString();
	mComponents[4] = new BitString();
	mComponents[5] = new BitString();
	mComponents[6] = new BitString();
	mComponents[7] = new BitString();
	mComponents[8] = new BitString();
	mComponents[9] = new BitString();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[10];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new BitString();
	    case 1:
		return new INTEGER();
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
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "sbasAlmDataID"
    public BitString getSbasAlmDataID()
    {
	return (BitString)mComponents[0];
    }
    
    public void setSbasAlmDataID(BitString sbasAlmDataID)
    {
	mComponents[0] = sbasAlmDataID;
    }
    
    
    // Methods for field "svID"
    public long getSvID()
    {
	return ((INTEGER)mComponents[1]).longValue();
    }
    
    public void setSvID(long svID)
    {
	setSvID(new INTEGER(svID));
    }
    
    public void setSvID(INTEGER svID)
    {
	mComponents[1] = svID;
    }
    
    
    // Methods for field "sbasAlmHealth"
    public BitString getSbasAlmHealth()
    {
	return (BitString)mComponents[2];
    }
    
    public void setSbasAlmHealth(BitString sbasAlmHealth)
    {
	mComponents[2] = sbasAlmHealth;
    }
    
    
    // Methods for field "sbasAlmXg"
    public BitString getSbasAlmXg()
    {
	return (BitString)mComponents[3];
    }
    
    public void setSbasAlmXg(BitString sbasAlmXg)
    {
	mComponents[3] = sbasAlmXg;
    }
    
    
    // Methods for field "sbasAlmYg"
    public BitString getSbasAlmYg()
    {
	return (BitString)mComponents[4];
    }
    
    public void setSbasAlmYg(BitString sbasAlmYg)
    {
	mComponents[4] = sbasAlmYg;
    }
    
    
    // Methods for field "sbasAlmZg"
    public BitString getSbasAlmZg()
    {
	return (BitString)mComponents[5];
    }
    
    public void setSbasAlmZg(BitString sbasAlmZg)
    {
	mComponents[5] = sbasAlmZg;
    }
    
    
    // Methods for field "sbasAlmXgdot"
    public BitString getSbasAlmXgdot()
    {
	return (BitString)mComponents[6];
    }
    
    public void setSbasAlmXgdot(BitString sbasAlmXgdot)
    {
	mComponents[6] = sbasAlmXgdot;
    }
    
    
    // Methods for field "sbasAlmYgDot"
    public BitString getSbasAlmYgDot()
    {
	return (BitString)mComponents[7];
    }
    
    public void setSbasAlmYgDot(BitString sbasAlmYgDot)
    {
	mComponents[7] = sbasAlmYgDot;
    }
    
    
    // Methods for field "sbasAlmZgDot"
    public BitString getSbasAlmZgDot()
    {
	return (BitString)mComponents[8];
    }
    
    public void setSbasAlmZgDot(BitString sbasAlmZgDot)
    {
	mComponents[8] = sbasAlmZgDot;
    }
    
    
    // Methods for field "sbasAlmTo"
    public BitString getSbasAlmTo()
    {
	return (BitString)mComponents[9];
    }
    
    public void setSbasAlmTo(BitString sbasAlmTo)
    {
	mComponents[9] = sbasAlmTo;
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
	    "GANSS_SAT_Info_Almanac_SBASecef"
	),
	new QName (
	    "InformationElements",
	    "GANSS-SAT-Info-Almanac-SBASecef"
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
		    "sbasAlmDataID",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
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
		    "svID",
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
				    new com.oss.asn1.INTEGER(8)
				)
			    ),
			    new Bounds (
				new java.lang.Long(8),
				new java.lang.Long(8)
			    ),
			    null
			)
		    ),
		    "sbasAlmHealth",
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
		    "sbasAlmXg",
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
		    "sbasAlmYg",
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
				    new com.oss.asn1.INTEGER(9)
				)
			    ),
			    new Bounds (
				new java.lang.Long(9),
				new java.lang.Long(9)
			    ),
			    null
			)
		    ),
		    "sbasAlmZg",
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
		    "sbasAlmXgdot",
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
		    "sbasAlmYgDot",
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
		    "sbasAlmZgDot",
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
		    "sbasAlmTo",
		    9,
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
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' GANSS_SAT_Info_Almanac_SBASecef object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' GANSS_SAT_Info_Almanac_SBASecef object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for GANSS_SAT_Info_Almanac_SBASecef
