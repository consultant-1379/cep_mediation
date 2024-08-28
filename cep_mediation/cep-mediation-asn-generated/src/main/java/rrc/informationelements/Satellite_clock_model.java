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
 * Define the ASN1 Type Satellite_clock_model from ASN1 Module InformationElements.
 * @see Sequence
 */

public class Satellite_clock_model extends Sequence {
    
    /**
     * The default constructor.
     */
    public Satellite_clock_model()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public Satellite_clock_model(BitString t_oc, BitString af2, BitString af1, 
		    BitString af0, BitString tgd, INTEGER model_id)
    {
	setT_oc(t_oc);
	setAf2(af2);
	setAf1(af1);
	setAf0(af0);
	setTgd(tgd);
	setModel_id(model_id);
    }
    
    /**
     * Construct with components.
     */
    public Satellite_clock_model(BitString t_oc, BitString af2, BitString af1, 
		    BitString af0, BitString tgd, long model_id)
    {
	this(t_oc, af2, af1, af0, tgd, new INTEGER(model_id));
    }
    
    /**
     * Construct with required components.
     */
    public Satellite_clock_model(BitString t_oc, BitString af2, BitString af1, 
		    BitString af0)
    {
	setT_oc(t_oc);
	setAf2(af2);
	setAf1(af1);
	setAf0(af0);
    }
    
    public void initComponents()
    {
	mComponents[0] = new BitString();
	mComponents[1] = new BitString();
	mComponents[2] = new BitString();
	mComponents[3] = new BitString();
	mComponents[4] = new BitString();
	mComponents[5] = new INTEGER();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[6];
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
		return new INTEGER();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "t_oc"
    public BitString getT_oc()
    {
	return (BitString)mComponents[0];
    }
    
    public void setT_oc(BitString t_oc)
    {
	mComponents[0] = t_oc;
    }
    
    
    // Methods for field "af2"
    public BitString getAf2()
    {
	return (BitString)mComponents[1];
    }
    
    public void setAf2(BitString af2)
    {
	mComponents[1] = af2;
    }
    
    
    // Methods for field "af1"
    public BitString getAf1()
    {
	return (BitString)mComponents[2];
    }
    
    public void setAf1(BitString af1)
    {
	mComponents[2] = af1;
    }
    
    
    // Methods for field "af0"
    public BitString getAf0()
    {
	return (BitString)mComponents[3];
    }
    
    public void setAf0(BitString af0)
    {
	mComponents[3] = af0;
    }
    
    
    // Methods for field "tgd"
    public BitString getTgd()
    {
	return (BitString)mComponents[4];
    }
    
    public void setTgd(BitString tgd)
    {
	mComponents[4] = tgd;
    }
    
    public boolean hasTgd()
    {
	return componentIsPresent(4);
    }
    
    public void deleteTgd()
    {
	setComponentAbsent(4);
    }
    
    
    // Methods for field "model_id"
    public long getModel_id()
    {
	return ((INTEGER)mComponents[5]).longValue();
    }
    
    public void setModel_id(long model_id)
    {
	setModel_id(new INTEGER(model_id));
    }
    
    public void setModel_id(INTEGER model_id)
    {
	mComponents[5] = model_id;
    }
    
    public boolean hasModel_id()
    {
	return componentIsPresent(5);
    }
    
    public void deleteModel_id()
    {
	setComponentAbsent(5);
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
	    "Satellite_clock_model"
	),
	new QName (
	    "InformationElements",
	    "Satellite-clock-model"
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
				    new com.oss.asn1.INTEGER(14)
				)
			    ),
			    new Bounds (
				new java.lang.Long(14),
				new java.lang.Long(14)
			    ),
			    null
			)
		    ),
		    "t-oc",
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
				    new com.oss.asn1.INTEGER(12)
				)
			    ),
			    new Bounds (
				new java.lang.Long(12),
				new java.lang.Long(12)
			    ),
			    null
			)
		    ),
		    "af2",
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
		    "af1",
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
				    new com.oss.asn1.INTEGER(28)
				)
			    ),
			    new Bounds (
				new java.lang.Long(28),
				new java.lang.Long(28)
			    ),
			    null
			)
		    ),
		    "af0",
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
		    "tgd",
		    4,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8005
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
				    new com.oss.asn1.INTEGER(1),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(1)
			    ),
			    null
			)
		    ),
		    "model-id",
		    5,
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
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8005, 5)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' Satellite_clock_model object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' Satellite_clock_model object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for Satellite_clock_model
