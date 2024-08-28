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
 * Define the ASN1 Type AlmanacSatInfo from ASN1 Module InformationElements.
 * @see Sequence
 */

public class AlmanacSatInfo extends Sequence {
    
    /**
     * The default constructor.
     */
    public AlmanacSatInfo()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public AlmanacSatInfo(INTEGER dataID, SatID satID, BitString e, 
		    BitString t_oa, BitString deltaI, BitString omegaDot, 
		    BitString satHealth, BitString a_Sqrt, BitString omega0, 
		    BitString m0, BitString omega, BitString af0, 
		    BitString af1)
    {
	setDataID(dataID);
	setSatID(satID);
	setE(e);
	setT_oa(t_oa);
	setDeltaI(deltaI);
	setOmegaDot(omegaDot);
	setSatHealth(satHealth);
	setA_Sqrt(a_Sqrt);
	setOmega0(omega0);
	setM0(m0);
	setOmega(omega);
	setAf0(af0);
	setAf1(af1);
    }
    
    /**
     * Construct with components.
     */
    public AlmanacSatInfo(long dataID, SatID satID, BitString e, 
		    BitString t_oa, BitString deltaI, BitString omegaDot, 
		    BitString satHealth, BitString a_Sqrt, BitString omega0, 
		    BitString m0, BitString omega, BitString af0, 
		    BitString af1)
    {
	this(new INTEGER(dataID), satID, e, t_oa, deltaI, omegaDot, 
	     satHealth, a_Sqrt, omega0, m0, omega, af0, af1);
    }
    
    public void initComponents()
    {
	mComponents[0] = new INTEGER();
	mComponents[1] = new SatID();
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
		return new INTEGER();
	    case 1:
		return new SatID();
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
    
    
    // Methods for field "dataID"
    public long getDataID()
    {
	return ((INTEGER)mComponents[0]).longValue();
    }
    
    public void setDataID(long dataID)
    {
	setDataID(new INTEGER(dataID));
    }
    
    public void setDataID(INTEGER dataID)
    {
	mComponents[0] = dataID;
    }
    
    
    // Methods for field "satID"
    public SatID getSatID()
    {
	return (SatID)mComponents[1];
    }
    
    public void setSatID(SatID satID)
    {
	mComponents[1] = satID;
    }
    
    
    // Methods for field "e"
    public BitString getE()
    {
	return (BitString)mComponents[2];
    }
    
    public void setE(BitString e)
    {
	mComponents[2] = e;
    }
    
    
    // Methods for field "t_oa"
    public BitString getT_oa()
    {
	return (BitString)mComponents[3];
    }
    
    public void setT_oa(BitString t_oa)
    {
	mComponents[3] = t_oa;
    }
    
    
    // Methods for field "deltaI"
    public BitString getDeltaI()
    {
	return (BitString)mComponents[4];
    }
    
    public void setDeltaI(BitString deltaI)
    {
	mComponents[4] = deltaI;
    }
    
    
    // Methods for field "omegaDot"
    public BitString getOmegaDot()
    {
	return (BitString)mComponents[5];
    }
    
    public void setOmegaDot(BitString omegaDot)
    {
	mComponents[5] = omegaDot;
    }
    
    
    // Methods for field "satHealth"
    public BitString getSatHealth()
    {
	return (BitString)mComponents[6];
    }
    
    public void setSatHealth(BitString satHealth)
    {
	mComponents[6] = satHealth;
    }
    
    
    // Methods for field "a_Sqrt"
    public BitString getA_Sqrt()
    {
	return (BitString)mComponents[7];
    }
    
    public void setA_Sqrt(BitString a_Sqrt)
    {
	mComponents[7] = a_Sqrt;
    }
    
    
    // Methods for field "omega0"
    public BitString getOmega0()
    {
	return (BitString)mComponents[8];
    }
    
    public void setOmega0(BitString omega0)
    {
	mComponents[8] = omega0;
    }
    
    
    // Methods for field "m0"
    public BitString getM0()
    {
	return (BitString)mComponents[9];
    }
    
    public void setM0(BitString m0)
    {
	mComponents[9] = m0;
    }
    
    
    // Methods for field "omega"
    public BitString getOmega()
    {
	return (BitString)mComponents[10];
    }
    
    public void setOmega(BitString omega)
    {
	mComponents[10] = omega;
    }
    
    
    // Methods for field "af0"
    public BitString getAf0()
    {
	return (BitString)mComponents[11];
    }
    
    public void setAf0(BitString af0)
    {
	mComponents[11] = af0;
    }
    
    
    // Methods for field "af1"
    public BitString getAf1()
    {
	return (BitString)mComponents[12];
    }
    
    public void setAf1(BitString af1)
    {
	mComponents[12] = af1;
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
	    "AlmanacSatInfo"
	),
	new QName (
	    "InformationElements",
	    "AlmanacSatInfo"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
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
		    "dataID",
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
				"rrc.informationelements",
				"SatID"
			    ),
			    new QName (
				"InformationElements",
				"SatID"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new SatID(0), 
				    new SatID(63),
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
		    "satID",
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
		    "e",
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
		    "t-oa",
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
		    "deltaI",
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
		    "omegaDot",
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
		    "satHealth",
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
		    "a-Sqrt",
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
		    "omega0",
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
		    "m0",
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
		    "omega",
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
		    "af0",
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
		    "af1",
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
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' AlmanacSatInfo object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' AlmanacSatInfo object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for AlmanacSatInfo
