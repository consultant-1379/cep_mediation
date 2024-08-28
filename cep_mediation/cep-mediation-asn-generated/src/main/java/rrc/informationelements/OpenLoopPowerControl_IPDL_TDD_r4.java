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
 * Define the ASN1 Type OpenLoopPowerControl_IPDL_TDD_r4 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class OpenLoopPowerControl_IPDL_TDD_r4 extends Sequence {
    
    /**
     * The default constructor.
     */
    public OpenLoopPowerControl_IPDL_TDD_r4()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public OpenLoopPowerControl_IPDL_TDD_r4(Alpha ipdl_alpha, 
		    MaxPowerIncrease_r4 maxPowerIncrease)
    {
	setIpdl_alpha(ipdl_alpha);
	setMaxPowerIncrease(maxPowerIncrease);
    }
    
    public void initComponents()
    {
	mComponents[0] = new Alpha();
	mComponents[1] = new MaxPowerIncrease_r4();
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
		return new Alpha();
	    case 1:
		return new MaxPowerIncrease_r4();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "ipdl_alpha"
    public Alpha getIpdl_alpha()
    {
	return (Alpha)mComponents[0];
    }
    
    public void setIpdl_alpha(Alpha ipdl_alpha)
    {
	mComponents[0] = ipdl_alpha;
    }
    
    
    // Methods for field "maxPowerIncrease"
    public MaxPowerIncrease_r4 getMaxPowerIncrease()
    {
	return (MaxPowerIncrease_r4)mComponents[1];
    }
    
    public void setMaxPowerIncrease(MaxPowerIncrease_r4 maxPowerIncrease)
    {
	mComponents[1] = maxPowerIncrease;
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
	    "OpenLoopPowerControl_IPDL_TDD_r4"
	),
	new QName (
	    "InformationElements",
	    "OpenLoopPowerControl-IPDL-TDD-r4"
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
				"Alpha"
			    ),
			    new QName (
				"InformationElements",
				"Alpha"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new Alpha(0), 
				    new Alpha(8),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(8)
			    ),
			    null
			)
		    ),
		    "ipdl-alpha",
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
				"MaxPowerIncrease_r4"
			    ),
			    new QName (
				"InformationElements",
				"MaxPowerIncrease-r4"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new MaxPowerIncrease_r4(0), 
				    new MaxPowerIncrease_r4(3),
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
		    "maxPowerIncrease",
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
     * Get the type descriptor (TypeInfo) of 'this' OpenLoopPowerControl_IPDL_TDD_r4 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' OpenLoopPowerControl_IPDL_TDD_r4 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for OpenLoopPowerControl_IPDL_TDD_r4
