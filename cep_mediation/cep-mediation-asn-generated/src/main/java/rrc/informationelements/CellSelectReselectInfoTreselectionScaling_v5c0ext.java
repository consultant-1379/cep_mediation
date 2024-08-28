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
 * Define the ASN1 Type CellSelectReselectInfoTreselectionScaling_v5c0ext from ASN1 Module InformationElements.
 * @see Sequence
 */

public class CellSelectReselectInfoTreselectionScaling_v5c0ext extends Sequence {
    
    /**
     * The default constructor.
     */
    public CellSelectReselectInfoTreselectionScaling_v5c0ext()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public CellSelectReselectInfoTreselectionScaling_v5c0ext(T_CRMax non_HCS_t_CR_Max, 
		    SpeedDependentScalingFactor speedDependentScalingFactor, 
		    TreselectionScalingFactor interFrequencyTreselectionScalingFactor, 
		    TreselectionScalingFactor interRATTreselectionScalingFactor)
    {
	setNon_HCS_t_CR_Max(non_HCS_t_CR_Max);
	setSpeedDependentScalingFactor(speedDependentScalingFactor);
	setInterFrequencyTreselectionScalingFactor(interFrequencyTreselectionScalingFactor);
	setInterRATTreselectionScalingFactor(interRATTreselectionScalingFactor);
    }
    
    public void initComponents()
    {
	mComponents[0] = new T_CRMax();
	mComponents[1] = new SpeedDependentScalingFactor();
	mComponents[2] = new TreselectionScalingFactor();
	mComponents[3] = new TreselectionScalingFactor();
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
		return new T_CRMax();
	    case 1:
		return new SpeedDependentScalingFactor();
	    case 2:
		return new TreselectionScalingFactor();
	    case 3:
		return new TreselectionScalingFactor();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "non_HCS_t_CR_Max"
    public T_CRMax getNon_HCS_t_CR_Max()
    {
	return (T_CRMax)mComponents[0];
    }
    
    public void setNon_HCS_t_CR_Max(T_CRMax non_HCS_t_CR_Max)
    {
	mComponents[0] = non_HCS_t_CR_Max;
    }
    
    public boolean hasNon_HCS_t_CR_Max()
    {
	return componentIsPresent(0);
    }
    
    public void deleteNon_HCS_t_CR_Max()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "speedDependentScalingFactor"
    public SpeedDependentScalingFactor getSpeedDependentScalingFactor()
    {
	return (SpeedDependentScalingFactor)mComponents[1];
    }
    
    public void setSpeedDependentScalingFactor(SpeedDependentScalingFactor speedDependentScalingFactor)
    {
	mComponents[1] = speedDependentScalingFactor;
    }
    
    public boolean hasSpeedDependentScalingFactor()
    {
	return componentIsPresent(1);
    }
    
    public void deleteSpeedDependentScalingFactor()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "interFrequencyTreselectionScalingFactor"
    public TreselectionScalingFactor getInterFrequencyTreselectionScalingFactor()
    {
	return (TreselectionScalingFactor)mComponents[2];
    }
    
    public void setInterFrequencyTreselectionScalingFactor(TreselectionScalingFactor interFrequencyTreselectionScalingFactor)
    {
	mComponents[2] = interFrequencyTreselectionScalingFactor;
    }
    
    public boolean hasInterFrequencyTreselectionScalingFactor()
    {
	return componentIsPresent(2);
    }
    
    public void deleteInterFrequencyTreselectionScalingFactor()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "interRATTreselectionScalingFactor"
    public TreselectionScalingFactor getInterRATTreselectionScalingFactor()
    {
	return (TreselectionScalingFactor)mComponents[3];
    }
    
    public void setInterRATTreselectionScalingFactor(TreselectionScalingFactor interRATTreselectionScalingFactor)
    {
	mComponents[3] = interRATTreselectionScalingFactor;
    }
    
    public boolean hasInterRATTreselectionScalingFactor()
    {
	return componentIsPresent(3);
    }
    
    public void deleteInterRATTreselectionScalingFactor()
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
	    "CellSelectReselectInfoTreselectionScaling_v5c0ext"
	),
	new QName (
	    "InformationElements",
	    "CellSelectReselectInfoTreselectionScaling-v5c0ext"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"T_CRMax"
			    ),
			    new QName (
				"InformationElements",
				"T-CRMax"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "T_CRMax"
				)
			    ),
			    0,
			    new TagDecoder (
				new TagDecoderElement[] {
				    new TagDecoderElement((short)0x8000, 0),
				    new TagDecoderElement((short)0x8001, 1),
				    new TagDecoderElement((short)0x8002, 2),
				    new TagDecoderElement((short)0x8003, 3),
				    new TagDecoderElement((short)0x8004, 4),
				    new TagDecoderElement((short)0x8005, 5)
				}
			    )
			)
		    ),
		    "non-HCS-t-CR-Max",
		    0,
		    3,
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
				"SpeedDependentScalingFactor"
			    ),
			    new QName (
				"InformationElements",
				"SpeedDependentScalingFactor"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new SpeedDependentScalingFactor(0), 
				    new SpeedDependentScalingFactor(10),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(10)
			    ),
			    null
			)
		    ),
		    "speedDependentScalingFactor",
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
				"TreselectionScalingFactor"
			    ),
			    new QName (
				"InformationElements",
				"TreselectionScalingFactor"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new TreselectionScalingFactor(4), 
				    new TreselectionScalingFactor(19),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(4),
				new java.lang.Long(19)
			    ),
			    null
			)
		    ),
		    "interFrequencyTreselectionScalingFactor",
		    2,
		    3,
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
				"TreselectionScalingFactor"
			    ),
			    new QName (
				"InformationElements",
				"TreselectionScalingFactor"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new TreselectionScalingFactor(4), 
				    new TreselectionScalingFactor(19),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(4),
				new java.lang.Long(19)
			    ),
			    null
			)
		    ),
		    "interRATTreselectionScalingFactor",
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
			new TagDecoderElement((short)0x8000, 0),
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3)
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
     * Get the type descriptor (TypeInfo) of 'this' CellSelectReselectInfoTreselectionScaling_v5c0ext object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' CellSelectReselectInfoTreselectionScaling_v5c0ext object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for CellSelectReselectInfoTreselectionScaling_v5c0ext
