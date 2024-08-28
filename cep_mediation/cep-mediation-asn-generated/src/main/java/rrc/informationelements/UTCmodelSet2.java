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
 * Define the ASN1 Type UTCmodelSet2 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class UTCmodelSet2 extends Sequence {
    
    /**
     * The default constructor.
     */
    public UTCmodelSet2()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public UTCmodelSet2(BitString nA, BitString tauC, DeltaUT1 deltaUT1, 
		    BitString kp)
    {
	setNA(nA);
	setTauC(tauC);
	setDeltaUT1(deltaUT1);
	setKp(kp);
    }
    
    /**
     * Construct with required components.
     */
    public UTCmodelSet2(BitString nA, BitString tauC)
    {
	setNA(nA);
	setTauC(tauC);
    }
    
    public void initComponents()
    {
	mComponents[0] = new BitString();
	mComponents[1] = new BitString();
	mComponents[2] = new DeltaUT1();
	mComponents[3] = new BitString();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[4];
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
		return new DeltaUT1();
	    case 3:
		return new BitString();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "nA"
    public BitString getNA()
    {
	return (BitString)mComponents[0];
    }
    
    public void setNA(BitString nA)
    {
	mComponents[0] = nA;
    }
    
    
    // Methods for field "tauC"
    public BitString getTauC()
    {
	return (BitString)mComponents[1];
    }
    
    public void setTauC(BitString tauC)
    {
	mComponents[1] = tauC;
    }
    
    
    // Methods for field "deltaUT1"
    public DeltaUT1 getDeltaUT1()
    {
	return (DeltaUT1)mComponents[2];
    }
    
    public void setDeltaUT1(DeltaUT1 deltaUT1)
    {
	mComponents[2] = deltaUT1;
    }
    
    public boolean hasDeltaUT1()
    {
	return componentIsPresent(2);
    }
    
    public void deleteDeltaUT1()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "kp"
    public BitString getKp()
    {
	return (BitString)mComponents[3];
    }
    
    public void setKp(BitString kp)
    {
	mComponents[3] = kp;
    }
    
    public boolean hasKp()
    {
	return componentIsPresent(3);
    }
    
    public void deleteKp()
    {
	setComponentAbsent(3);
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
	    "UTCmodelSet2"
	),
	new QName (
	    "InformationElements",
	    "UTCmodelSet2"
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
		    "nA",
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
				    new com.oss.asn1.INTEGER(32)
				)
			    ),
			    new Bounds (
				new java.lang.Long(32),
				new java.lang.Long(32)
			    ),
			    null
			)
		    ),
		    "tauC",
		    1,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"DeltaUT1"
			    ),
			    new QName (
				"InformationElements",
				"DeltaUT1"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "DeltaUT1"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "DeltaUT1"
				)
			    ),
			    0
			)
		    ),
		    "deltaUT1",
		    2,
		    3,
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
		    "kp",
		    3,
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
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8003, 3)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' UTCmodelSet2 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UTCmodelSet2 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UTCmodelSet2
