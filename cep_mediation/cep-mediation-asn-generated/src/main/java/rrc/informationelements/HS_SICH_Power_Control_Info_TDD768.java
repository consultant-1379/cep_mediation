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
 * Define the ASN1 Type HS_SICH_Power_Control_Info_TDD768 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class HS_SICH_Power_Control_Info_TDD768 extends Sequence {
    
    /**
     * The default constructor.
     */
    public HS_SICH_Power_Control_Info_TDD768()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public HS_SICH_Power_Control_Info_TDD768(INTEGER ul_target_SIR, 
		    ConstantValue hs_sich_ConstantValue)
    {
	setUl_target_SIR(ul_target_SIR);
	setHs_sich_ConstantValue(hs_sich_ConstantValue);
    }
    
    /**
     * Construct with components.
     */
    public HS_SICH_Power_Control_Info_TDD768(long ul_target_SIR, 
		    ConstantValue hs_sich_ConstantValue)
    {
	this(new INTEGER(ul_target_SIR), hs_sich_ConstantValue);
    }
    
    public void initComponents()
    {
	mComponents[0] = new INTEGER();
	mComponents[1] = new ConstantValue();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[2];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new INTEGER();
	    case 1:
		return new ConstantValue();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "ul_target_SIR"
    public long getUl_target_SIR()
    {
	return ((INTEGER)mComponents[0]).longValue();
    }
    
    public void setUl_target_SIR(long ul_target_SIR)
    {
	setUl_target_SIR(new INTEGER(ul_target_SIR));
    }
    
    public void setUl_target_SIR(INTEGER ul_target_SIR)
    {
	mComponents[0] = ul_target_SIR;
    }
    
    
    // Methods for field "hs_sich_ConstantValue"
    public ConstantValue getHs_sich_ConstantValue()
    {
	return (ConstantValue)mComponents[1];
    }
    
    public void setHs_sich_ConstantValue(ConstantValue hs_sich_ConstantValue)
    {
	mComponents[1] = hs_sich_ConstantValue;
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
	    "HS_SICH_Power_Control_Info_TDD768"
	),
	new QName (
	    "InformationElements",
	    "HS-SICH-Power-Control-Info-TDD768"
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
				    new com.oss.asn1.INTEGER(-22), 
				    new com.oss.asn1.INTEGER(40),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(-22),
				new java.lang.Long(40)
			    ),
			    null
			)
		    ),
		    "ul-target-SIR",
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
				"ConstantValue"
			    ),
			    new QName (
				"InformationElements",
				"ConstantValue"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new ConstantValue(-35), 
				    new ConstantValue(-10),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(-35),
				new java.lang.Long(-10)
			    ),
			    null
			)
		    ),
		    "hs-sich-ConstantValue",
		    1,
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
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' HS_SICH_Power_Control_Info_TDD768 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' HS_SICH_Power_Control_Info_TDD768 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for HS_SICH_Power_Control_Info_TDD768
