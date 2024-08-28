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
 * Define the ASN1 Type GANSS_SAT_Info_Almanac_REDkp from ASN1 Module InformationElements.
 * @see Sequence
 */

public class GANSS_SAT_Info_Almanac_REDkp extends Sequence {
    
    /**
     * The default constructor.
     */
    public GANSS_SAT_Info_Almanac_REDkp()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public GANSS_SAT_Info_Almanac_REDkp(INTEGER svID, BitString redAlmDeltaA, 
		    BitString redAlmOmega0, BitString redAlmPhi0, 
		    BitString redAlmL1Health, BitString redAlmL2Health, 
		    BitString redAlmL5Health)
    {
	setSvID(svID);
	setRedAlmDeltaA(redAlmDeltaA);
	setRedAlmOmega0(redAlmOmega0);
	setRedAlmPhi0(redAlmPhi0);
	setRedAlmL1Health(redAlmL1Health);
	setRedAlmL2Health(redAlmL2Health);
	setRedAlmL5Health(redAlmL5Health);
    }
    
    /**
     * Construct with components.
     */
    public GANSS_SAT_Info_Almanac_REDkp(long svID, BitString redAlmDeltaA, 
		    BitString redAlmOmega0, BitString redAlmPhi0, 
		    BitString redAlmL1Health, BitString redAlmL2Health, 
		    BitString redAlmL5Health)
    {
	this(new INTEGER(svID), redAlmDeltaA, redAlmOmega0, redAlmPhi0, 
	     redAlmL1Health, redAlmL2Health, redAlmL5Health);
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
    
    
    // Methods for field "redAlmDeltaA"
    public BitString getRedAlmDeltaA()
    {
	return (BitString)mComponents[1];
    }
    
    public void setRedAlmDeltaA(BitString redAlmDeltaA)
    {
	mComponents[1] = redAlmDeltaA;
    }
    
    
    // Methods for field "redAlmOmega0"
    public BitString getRedAlmOmega0()
    {
	return (BitString)mComponents[2];
    }
    
    public void setRedAlmOmega0(BitString redAlmOmega0)
    {
	mComponents[2] = redAlmOmega0;
    }
    
    
    // Methods for field "redAlmPhi0"
    public BitString getRedAlmPhi0()
    {
	return (BitString)mComponents[3];
    }
    
    public void setRedAlmPhi0(BitString redAlmPhi0)
    {
	mComponents[3] = redAlmPhi0;
    }
    
    
    // Methods for field "redAlmL1Health"
    public BitString getRedAlmL1Health()
    {
	return (BitString)mComponents[4];
    }
    
    public void setRedAlmL1Health(BitString redAlmL1Health)
    {
	mComponents[4] = redAlmL1Health;
    }
    
    
    // Methods for field "redAlmL2Health"
    public BitString getRedAlmL2Health()
    {
	return (BitString)mComponents[5];
    }
    
    public void setRedAlmL2Health(BitString redAlmL2Health)
    {
	mComponents[5] = redAlmL2Health;
    }
    
    
    // Methods for field "redAlmL5Health"
    public BitString getRedAlmL5Health()
    {
	return (BitString)mComponents[6];
    }
    
    public void setRedAlmL5Health(BitString redAlmL5Health)
    {
	mComponents[6] = redAlmL5Health;
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
	    "GANSS_SAT_Info_Almanac_REDkp"
	),
	new QName (
	    "InformationElements",
	    "GANSS-SAT-Info-Almanac-REDkp"
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
		    "redAlmDeltaA",
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
		    "redAlmOmega0",
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
		    "redAlmPhi0",
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
		    "redAlmL1Health",
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
		    "redAlmL2Health",
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
		    "redAlmL5Health",
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
     * Get the type descriptor (TypeInfo) of 'this' GANSS_SAT_Info_Almanac_REDkp object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' GANSS_SAT_Info_Almanac_REDkp object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for GANSS_SAT_Info_Almanac_REDkp
