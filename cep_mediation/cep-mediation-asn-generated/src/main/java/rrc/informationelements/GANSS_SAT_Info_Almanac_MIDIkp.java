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
 * Define the ASN1 Type GANSS_SAT_Info_Almanac_MIDIkp from ASN1 Module InformationElements.
 * @see Sequence
 */

public class GANSS_SAT_Info_Almanac_MIDIkp extends Sequence {
    
    /**
     * The default constructor.
     */
    public GANSS_SAT_Info_Almanac_MIDIkp()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public GANSS_SAT_Info_Almanac_MIDIkp(INTEGER svID, BitString midiAlmE, 
		    BitString midiAlmDeltaI, BitString midiAlmOmegaDot, 
		    BitString midiAlmSqrtA, BitString midiAlmOmega0, 
		    BitString midiAlmOmega, BitString midiAlmMo, 
		    BitString midiAlmaf0, BitString midiAlmaf1, 
		    BitString midiAlmL1Health, BitString midiAlmL2Health, 
		    BitString midiAlmL5Health)
    {
	setSvID(svID);
	setMidiAlmE(midiAlmE);
	setMidiAlmDeltaI(midiAlmDeltaI);
	setMidiAlmOmegaDot(midiAlmOmegaDot);
	setMidiAlmSqrtA(midiAlmSqrtA);
	setMidiAlmOmega0(midiAlmOmega0);
	setMidiAlmOmega(midiAlmOmega);
	setMidiAlmMo(midiAlmMo);
	setMidiAlmaf0(midiAlmaf0);
	setMidiAlmaf1(midiAlmaf1);
	setMidiAlmL1Health(midiAlmL1Health);
	setMidiAlmL2Health(midiAlmL2Health);
	setMidiAlmL5Health(midiAlmL5Health);
    }
    
    /**
     * Construct with components.
     */
    public GANSS_SAT_Info_Almanac_MIDIkp(long svID, BitString midiAlmE, 
		    BitString midiAlmDeltaI, BitString midiAlmOmegaDot, 
		    BitString midiAlmSqrtA, BitString midiAlmOmega0, 
		    BitString midiAlmOmega, BitString midiAlmMo, 
		    BitString midiAlmaf0, BitString midiAlmaf1, 
		    BitString midiAlmL1Health, BitString midiAlmL2Health, 
		    BitString midiAlmL5Health)
    {
	this(new INTEGER(svID), midiAlmE, midiAlmDeltaI, midiAlmOmegaDot, 
	     midiAlmSqrtA, midiAlmOmega0, midiAlmOmega, midiAlmMo, 
	     midiAlmaf0, midiAlmaf1, midiAlmL1Health, midiAlmL2Health, 
	     midiAlmL5Health);
    }
    
    public void initComponents()
    {
	mComponents[0] = new INTEGER();
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
		return new INTEGER();
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
    
    
    // Methods for field "svID"
    public long getSvID()
    {
	return ((INTEGER)mComponents[0]).longValue();
    }
    
    public void setSvID(long svID)
    {
	setSvID(new INTEGER(svID));
    }
    
    public void setSvID(INTEGER svID)
    {
	mComponents[0] = svID;
    }
    
    
    // Methods for field "midiAlmE"
    public BitString getMidiAlmE()
    {
	return (BitString)mComponents[1];
    }
    
    public void setMidiAlmE(BitString midiAlmE)
    {
	mComponents[1] = midiAlmE;
    }
    
    
    // Methods for field "midiAlmDeltaI"
    public BitString getMidiAlmDeltaI()
    {
	return (BitString)mComponents[2];
    }
    
    public void setMidiAlmDeltaI(BitString midiAlmDeltaI)
    {
	mComponents[2] = midiAlmDeltaI;
    }
    
    
    // Methods for field "midiAlmOmegaDot"
    public BitString getMidiAlmOmegaDot()
    {
	return (BitString)mComponents[3];
    }
    
    public void setMidiAlmOmegaDot(BitString midiAlmOmegaDot)
    {
	mComponents[3] = midiAlmOmegaDot;
    }
    
    
    // Methods for field "midiAlmSqrtA"
    public BitString getMidiAlmSqrtA()
    {
	return (BitString)mComponents[4];
    }
    
    public void setMidiAlmSqrtA(BitString midiAlmSqrtA)
    {
	mComponents[4] = midiAlmSqrtA;
    }
    
    
    // Methods for field "midiAlmOmega0"
    public BitString getMidiAlmOmega0()
    {
	return (BitString)mComponents[5];
    }
    
    public void setMidiAlmOmega0(BitString midiAlmOmega0)
    {
	mComponents[5] = midiAlmOmega0;
    }
    
    
    // Methods for field "midiAlmOmega"
    public BitString getMidiAlmOmega()
    {
	return (BitString)mComponents[6];
    }
    
    public void setMidiAlmOmega(BitString midiAlmOmega)
    {
	mComponents[6] = midiAlmOmega;
    }
    
    
    // Methods for field "midiAlmMo"
    public BitString getMidiAlmMo()
    {
	return (BitString)mComponents[7];
    }
    
    public void setMidiAlmMo(BitString midiAlmMo)
    {
	mComponents[7] = midiAlmMo;
    }
    
    
    // Methods for field "midiAlmaf0"
    public BitString getMidiAlmaf0()
    {
	return (BitString)mComponents[8];
    }
    
    public void setMidiAlmaf0(BitString midiAlmaf0)
    {
	mComponents[8] = midiAlmaf0;
    }
    
    
    // Methods for field "midiAlmaf1"
    public BitString getMidiAlmaf1()
    {
	return (BitString)mComponents[9];
    }
    
    public void setMidiAlmaf1(BitString midiAlmaf1)
    {
	mComponents[9] = midiAlmaf1;
    }
    
    
    // Methods for field "midiAlmL1Health"
    public BitString getMidiAlmL1Health()
    {
	return (BitString)mComponents[10];
    }
    
    public void setMidiAlmL1Health(BitString midiAlmL1Health)
    {
	mComponents[10] = midiAlmL1Health;
    }
    
    
    // Methods for field "midiAlmL2Health"
    public BitString getMidiAlmL2Health()
    {
	return (BitString)mComponents[11];
    }
    
    public void setMidiAlmL2Health(BitString midiAlmL2Health)
    {
	mComponents[11] = midiAlmL2Health;
    }
    
    
    // Methods for field "midiAlmL5Health"
    public BitString getMidiAlmL5Health()
    {
	return (BitString)mComponents[12];
    }
    
    public void setMidiAlmL5Health(BitString midiAlmL5Health)
    {
	mComponents[12] = midiAlmL5Health;
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
	    "GANSS_SAT_Info_Almanac_MIDIkp"
	),
	new QName (
	    "InformationElements",
	    "GANSS-SAT-Info-Almanac-MIDIkp"
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
		    "midiAlmE",
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
		    "midiAlmDeltaI",
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
		    "midiAlmOmegaDot",
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
		    "midiAlmSqrtA",
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
		    "midiAlmOmega0",
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
		    "midiAlmOmega",
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
		    "midiAlmMo",
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
		    "midiAlmaf0",
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
		    "midiAlmaf1",
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
		    "midiAlmL1Health",
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
		    "midiAlmL2Health",
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
		    "midiAlmL5Health",
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
     * Get the type descriptor (TypeInfo) of 'this' GANSS_SAT_Info_Almanac_MIDIkp object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' GANSS_SAT_Info_Almanac_MIDIkp object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for GANSS_SAT_Info_Almanac_MIDIkp
