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
 * Define the ASN1 Type OpenLoopPowerControl_TDD from ASN1 Module InformationElements.
 * @see Sequence
 */

public class OpenLoopPowerControl_TDD extends Sequence {
    
    /**
     * The default constructor.
     */
    public OpenLoopPowerControl_TDD()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public OpenLoopPowerControl_TDD(PrimaryCCPCH_TX_Power primaryCCPCH_TX_Power, 
		    Alpha alpha, ConstantValueTdd prach_ConstantValue, 
		    ConstantValueTdd dpch_ConstantValue, 
		    ConstantValueTdd pusch_ConstantValue)
    {
	setPrimaryCCPCH_TX_Power(primaryCCPCH_TX_Power);
	setAlpha(alpha);
	setPrach_ConstantValue(prach_ConstantValue);
	setDpch_ConstantValue(dpch_ConstantValue);
	setPusch_ConstantValue(pusch_ConstantValue);
    }
    
    /**
     * Construct with required components.
     */
    public OpenLoopPowerControl_TDD(PrimaryCCPCH_TX_Power primaryCCPCH_TX_Power, 
		    ConstantValueTdd prach_ConstantValue, 
		    ConstantValueTdd dpch_ConstantValue)
    {
	setPrimaryCCPCH_TX_Power(primaryCCPCH_TX_Power);
	setPrach_ConstantValue(prach_ConstantValue);
	setDpch_ConstantValue(dpch_ConstantValue);
    }
    
    public void initComponents()
    {
	mComponents[0] = new PrimaryCCPCH_TX_Power();
	mComponents[1] = new Alpha();
	mComponents[2] = new ConstantValueTdd();
	mComponents[3] = new ConstantValueTdd();
	mComponents[4] = new ConstantValueTdd();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[5];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new PrimaryCCPCH_TX_Power();
	    case 1:
		return new Alpha();
	    case 2:
		return new ConstantValueTdd();
	    case 3:
		return new ConstantValueTdd();
	    case 4:
		return new ConstantValueTdd();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "primaryCCPCH_TX_Power"
    public PrimaryCCPCH_TX_Power getPrimaryCCPCH_TX_Power()
    {
	return (PrimaryCCPCH_TX_Power)mComponents[0];
    }
    
    public void setPrimaryCCPCH_TX_Power(PrimaryCCPCH_TX_Power primaryCCPCH_TX_Power)
    {
	mComponents[0] = primaryCCPCH_TX_Power;
    }
    
    
    // Methods for field "alpha"
    public Alpha getAlpha()
    {
	return (Alpha)mComponents[1];
    }
    
    public void setAlpha(Alpha alpha)
    {
	mComponents[1] = alpha;
    }
    
    public boolean hasAlpha()
    {
	return componentIsPresent(1);
    }
    
    public void deleteAlpha()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "prach_ConstantValue"
    public ConstantValueTdd getPrach_ConstantValue()
    {
	return (ConstantValueTdd)mComponents[2];
    }
    
    public void setPrach_ConstantValue(ConstantValueTdd prach_ConstantValue)
    {
	mComponents[2] = prach_ConstantValue;
    }
    
    
    // Methods for field "dpch_ConstantValue"
    public ConstantValueTdd getDpch_ConstantValue()
    {
	return (ConstantValueTdd)mComponents[3];
    }
    
    public void setDpch_ConstantValue(ConstantValueTdd dpch_ConstantValue)
    {
	mComponents[3] = dpch_ConstantValue;
    }
    
    
    // Methods for field "pusch_ConstantValue"
    public ConstantValueTdd getPusch_ConstantValue()
    {
	return (ConstantValueTdd)mComponents[4];
    }
    
    public void setPusch_ConstantValue(ConstantValueTdd pusch_ConstantValue)
    {
	mComponents[4] = pusch_ConstantValue;
    }
    
    public boolean hasPusch_ConstantValue()
    {
	return componentIsPresent(4);
    }
    
    public void deletePusch_ConstantValue()
    {
	setComponentAbsent(4);
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
	    "OpenLoopPowerControl_TDD"
	),
	new QName (
	    "InformationElements",
	    "OpenLoopPowerControl-TDD"
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
				"PrimaryCCPCH_TX_Power"
			    ),
			    new QName (
				"InformationElements",
				"PrimaryCCPCH-TX-Power"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new PrimaryCCPCH_TX_Power(6), 
				    new PrimaryCCPCH_TX_Power(43),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(6),
				new java.lang.Long(43)
			    ),
			    null
			)
		    ),
		    "primaryCCPCH-TX-Power",
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
		    "alpha",
		    1,
		    3,
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
				"ConstantValueTdd"
			    ),
			    new QName (
				"InformationElements",
				"ConstantValueTdd"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new ConstantValueTdd(-35), 
				    new ConstantValueTdd(10),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(-35),
				new java.lang.Long(10)
			    ),
			    null
			)
		    ),
		    "prach-ConstantValue",
		    2,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"ConstantValueTdd"
			    ),
			    new QName (
				"InformationElements",
				"ConstantValueTdd"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new ConstantValueTdd(-35), 
				    new ConstantValueTdd(10),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(-35),
				new java.lang.Long(10)
			    ),
			    null
			)
		    ),
		    "dpch-ConstantValue",
		    3,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8004
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"ConstantValueTdd"
			    ),
			    new QName (
				"InformationElements",
				"ConstantValueTdd"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new ConstantValueTdd(-35), 
				    new ConstantValueTdd(10),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(-35),
				new java.lang.Long(10)
			    ),
			    null
			)
		    ),
		    "pusch-ConstantValue",
		    4,
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
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2)
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
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' OpenLoopPowerControl_TDD object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' OpenLoopPowerControl_TDD object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for OpenLoopPowerControl_TDD
