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
 * Define the ASN1 Type GANSS_SAT_Info_Almanac_GLOkp from ASN1 Module InformationElements.
 * @see Sequence
 */

public class GANSS_SAT_Info_Almanac_GLOkp extends Sequence {
    
    /**
     * The default constructor.
     */
    public GANSS_SAT_Info_Almanac_GLOkp()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public GANSS_SAT_Info_Almanac_GLOkp(BitString gloAlmNA_1, 
		    BitString gloAlmnA_2, BitString gloAlmHA, 
		    BitString gloAlmLambdaA, BitString gloAlmTlambdaA, 
		    BitString gloAlmDeltaIA, BitString gloAkmDeltaTA, 
		    BitString gloAlmDeltaTdotA, BitString gloAlmEpsilonA, 
		    BitString gloAlmOmegaA, BitString gloAlmTauA, 
		    BitString gloAlmCA, BitString gloAlmMA)
    {
	setGloAlmNA_1(gloAlmNA_1);
	setGloAlmnA_2(gloAlmnA_2);
	setGloAlmHA(gloAlmHA);
	setGloAlmLambdaA(gloAlmLambdaA);
	setGloAlmTlambdaA(gloAlmTlambdaA);
	setGloAlmDeltaIA(gloAlmDeltaIA);
	setGloAkmDeltaTA(gloAkmDeltaTA);
	setGloAlmDeltaTdotA(gloAlmDeltaTdotA);
	setGloAlmEpsilonA(gloAlmEpsilonA);
	setGloAlmOmegaA(gloAlmOmegaA);
	setGloAlmTauA(gloAlmTauA);
	setGloAlmCA(gloAlmCA);
	setGloAlmMA(gloAlmMA);
    }
    
    /**
     * Construct with required components.
     */
    public GANSS_SAT_Info_Almanac_GLOkp(BitString gloAlmNA_1, 
		    BitString gloAlmnA_2, BitString gloAlmHA, 
		    BitString gloAlmLambdaA, BitString gloAlmTlambdaA, 
		    BitString gloAlmDeltaIA, BitString gloAkmDeltaTA, 
		    BitString gloAlmDeltaTdotA, BitString gloAlmEpsilonA, 
		    BitString gloAlmOmegaA, BitString gloAlmTauA, 
		    BitString gloAlmCA)
    {
	setGloAlmNA_1(gloAlmNA_1);
	setGloAlmnA_2(gloAlmnA_2);
	setGloAlmHA(gloAlmHA);
	setGloAlmLambdaA(gloAlmLambdaA);
	setGloAlmTlambdaA(gloAlmTlambdaA);
	setGloAlmDeltaIA(gloAlmDeltaIA);
	setGloAkmDeltaTA(gloAkmDeltaTA);
	setGloAlmDeltaTdotA(gloAlmDeltaTdotA);
	setGloAlmEpsilonA(gloAlmEpsilonA);
	setGloAlmOmegaA(gloAlmOmegaA);
	setGloAlmTauA(gloAlmTauA);
	setGloAlmCA(gloAlmCA);
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
    
    
    // Methods for field "gloAlmNA_1"
    public BitString getGloAlmNA_1()
    {
	return (BitString)mComponents[0];
    }
    
    public void setGloAlmNA_1(BitString gloAlmNA_1)
    {
	mComponents[0] = gloAlmNA_1;
    }
    
    
    // Methods for field "gloAlmnA_2"
    public BitString getGloAlmnA_2()
    {
	return (BitString)mComponents[1];
    }
    
    public void setGloAlmnA_2(BitString gloAlmnA_2)
    {
	mComponents[1] = gloAlmnA_2;
    }
    
    
    // Methods for field "gloAlmHA"
    public BitString getGloAlmHA()
    {
	return (BitString)mComponents[2];
    }
    
    public void setGloAlmHA(BitString gloAlmHA)
    {
	mComponents[2] = gloAlmHA;
    }
    
    
    // Methods for field "gloAlmLambdaA"
    public BitString getGloAlmLambdaA()
    {
	return (BitString)mComponents[3];
    }
    
    public void setGloAlmLambdaA(BitString gloAlmLambdaA)
    {
	mComponents[3] = gloAlmLambdaA;
    }
    
    
    // Methods for field "gloAlmTlambdaA"
    public BitString getGloAlmTlambdaA()
    {
	return (BitString)mComponents[4];
    }
    
    public void setGloAlmTlambdaA(BitString gloAlmTlambdaA)
    {
	mComponents[4] = gloAlmTlambdaA;
    }
    
    
    // Methods for field "gloAlmDeltaIA"
    public BitString getGloAlmDeltaIA()
    {
	return (BitString)mComponents[5];
    }
    
    public void setGloAlmDeltaIA(BitString gloAlmDeltaIA)
    {
	mComponents[5] = gloAlmDeltaIA;
    }
    
    
    // Methods for field "gloAkmDeltaTA"
    public BitString getGloAkmDeltaTA()
    {
	return (BitString)mComponents[6];
    }
    
    public void setGloAkmDeltaTA(BitString gloAkmDeltaTA)
    {
	mComponents[6] = gloAkmDeltaTA;
    }
    
    
    // Methods for field "gloAlmDeltaTdotA"
    public BitString getGloAlmDeltaTdotA()
    {
	return (BitString)mComponents[7];
    }
    
    public void setGloAlmDeltaTdotA(BitString gloAlmDeltaTdotA)
    {
	mComponents[7] = gloAlmDeltaTdotA;
    }
    
    
    // Methods for field "gloAlmEpsilonA"
    public BitString getGloAlmEpsilonA()
    {
	return (BitString)mComponents[8];
    }
    
    public void setGloAlmEpsilonA(BitString gloAlmEpsilonA)
    {
	mComponents[8] = gloAlmEpsilonA;
    }
    
    
    // Methods for field "gloAlmOmegaA"
    public BitString getGloAlmOmegaA()
    {
	return (BitString)mComponents[9];
    }
    
    public void setGloAlmOmegaA(BitString gloAlmOmegaA)
    {
	mComponents[9] = gloAlmOmegaA;
    }
    
    
    // Methods for field "gloAlmTauA"
    public BitString getGloAlmTauA()
    {
	return (BitString)mComponents[10];
    }
    
    public void setGloAlmTauA(BitString gloAlmTauA)
    {
	mComponents[10] = gloAlmTauA;
    }
    
    
    // Methods for field "gloAlmCA"
    public BitString getGloAlmCA()
    {
	return (BitString)mComponents[11];
    }
    
    public void setGloAlmCA(BitString gloAlmCA)
    {
	mComponents[11] = gloAlmCA;
    }
    
    
    // Methods for field "gloAlmMA"
    public BitString getGloAlmMA()
    {
	return (BitString)mComponents[12];
    }
    
    public void setGloAlmMA(BitString gloAlmMA)
    {
	mComponents[12] = gloAlmMA;
    }
    
    public boolean hasGloAlmMA()
    {
	return componentIsPresent(12);
    }
    
    public void deleteGloAlmMA()
    {
	setComponentAbsent(12);
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
	    "GANSS_SAT_Info_Almanac_GLOkp"
	),
	new QName (
	    "InformationElements",
	    "GANSS-SAT-Info-Almanac-GLOkp"
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
		    "gloAlmNA",
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
		    "gloAlmnA",
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
		    "gloAlmHA",
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
		    "gloAlmLambdaA",
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
		    "gloAlmTlambdaA",
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
		    "gloAlmDeltaIA",
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
				    new com.oss.asn1.INTEGER(22)
				)
			    ),
			    new Bounds (
				new java.lang.Long(22),
				new java.lang.Long(22)
			    ),
			    null
			)
		    ),
		    "gloAkmDeltaTA",
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
				    new com.oss.asn1.INTEGER(7)
				)
			    ),
			    new Bounds (
				new java.lang.Long(7),
				new java.lang.Long(7)
			    ),
			    null
			)
		    ),
		    "gloAlmDeltaTdotA",
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
		    "gloAlmEpsilonA",
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
		    "gloAlmOmegaA",
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
		    "gloAlmTauA",
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
		    "gloAlmCA",
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
		    "gloAlmMA",
		    12,
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
     * Get the type descriptor (TypeInfo) of 'this' GANSS_SAT_Info_Almanac_GLOkp object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' GANSS_SAT_Info_Almanac_GLOkp object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for GANSS_SAT_Info_Almanac_GLOkp
