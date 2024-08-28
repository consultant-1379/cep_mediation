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
 * Define the ASN1 Type RB_COUNT_C_MSB_Information from ASN1 Module InformationElements.
 * @see Sequence
 */

public class RB_COUNT_C_MSB_Information extends Sequence {
    
    /**
     * The default constructor.
     */
    public RB_COUNT_C_MSB_Information()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public RB_COUNT_C_MSB_Information(RB_Identity rb_Identity, 
		    COUNT_C_MSB count_C_MSB_UL, COUNT_C_MSB count_C_MSB_DL)
    {
	setRb_Identity(rb_Identity);
	setCount_C_MSB_UL(count_C_MSB_UL);
	setCount_C_MSB_DL(count_C_MSB_DL);
    }
    
    public void initComponents()
    {
	mComponents[0] = new RB_Identity();
	mComponents[1] = new COUNT_C_MSB();
	mComponents[2] = new COUNT_C_MSB();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[3];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new RB_Identity();
	    case 1:
		return new COUNT_C_MSB();
	    case 2:
		return new COUNT_C_MSB();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "rb_Identity"
    public RB_Identity getRb_Identity()
    {
	return (RB_Identity)mComponents[0];
    }
    
    public void setRb_Identity(RB_Identity rb_Identity)
    {
	mComponents[0] = rb_Identity;
    }
    
    
    // Methods for field "count_C_MSB_UL"
    public COUNT_C_MSB getCount_C_MSB_UL()
    {
	return (COUNT_C_MSB)mComponents[1];
    }
    
    public void setCount_C_MSB_UL(COUNT_C_MSB count_C_MSB_UL)
    {
	mComponents[1] = count_C_MSB_UL;
    }
    
    
    // Methods for field "count_C_MSB_DL"
    public COUNT_C_MSB getCount_C_MSB_DL()
    {
	return (COUNT_C_MSB)mComponents[2];
    }
    
    public void setCount_C_MSB_DL(COUNT_C_MSB count_C_MSB_DL)
    {
	mComponents[2] = count_C_MSB_DL;
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
	    "RB_COUNT_C_MSB_Information"
	),
	new QName (
	    "InformationElements",
	    "RB-COUNT-C-MSB-Information"
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
				"rrc.informationelements",
				"RB_Identity"
			    ),
			    new QName (
				"InformationElements",
				"RB-Identity"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new RB_Identity(1), 
				    new RB_Identity(32),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(32)
			    ),
			    null
			)
		    ),
		    "rb-Identity",
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
				"COUNT_C_MSB"
			    ),
			    new QName (
				"InformationElements",
				"COUNT-C-MSB"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new COUNT_C_MSB(0), 
				    new COUNT_C_MSB(33554431),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(33554431)
			    ),
			    null
			)
		    ),
		    "count-C-MSB-UL",
		    1,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"COUNT_C_MSB"
			    ),
			    new QName (
				"InformationElements",
				"COUNT-C-MSB"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new COUNT_C_MSB(0), 
				    new COUNT_C_MSB(33554431),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(33554431)
			    ),
			    null
			)
		    ),
		    "count-C-MSB-DL",
		    2,
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
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' RB_COUNT_C_MSB_Information object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' RB_COUNT_C_MSB_Information object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for RB_COUNT_C_MSB_Information
