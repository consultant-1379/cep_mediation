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
 * Define the ASN1 Type UL_DPCHpowerControlInfoForCommonEDCH from ASN1 Module InformationElements.
 * @see Sequence
 */

public class UL_DPCHpowerControlInfoForCommonEDCH extends Sequence {
    
    /**
     * The default constructor.
     */
    public UL_DPCHpowerControlInfoForCommonEDCH()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public UL_DPCHpowerControlInfoForCommonEDCH(PowerControlAlgorithm powerControlAlgorithm, 
		    DeltaACK deltaACK, DeltaNACK deltaNACK, 
		    ACK_NACK_repetitionFactor ack_NACK_repetition_factor)
    {
	setPowerControlAlgorithm(powerControlAlgorithm);
	setDeltaACK(deltaACK);
	setDeltaNACK(deltaNACK);
	setAck_NACK_repetition_factor(ack_NACK_repetition_factor);
    }
    
    /**
     * Construct with required components.
     */
    public UL_DPCHpowerControlInfoForCommonEDCH(PowerControlAlgorithm powerControlAlgorithm)
    {
	setPowerControlAlgorithm(powerControlAlgorithm);
    }
    
    public void initComponents()
    {
	mComponents[0] = new PowerControlAlgorithm();
	mComponents[1] = new DeltaACK();
	mComponents[2] = new DeltaNACK();
	mComponents[3] = new ACK_NACK_repetitionFactor();
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
		return new PowerControlAlgorithm();
	    case 1:
		return new DeltaACK();
	    case 2:
		return new DeltaNACK();
	    case 3:
		return new ACK_NACK_repetitionFactor();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "powerControlAlgorithm"
    public PowerControlAlgorithm getPowerControlAlgorithm()
    {
	return (PowerControlAlgorithm)mComponents[0];
    }
    
    public void setPowerControlAlgorithm(PowerControlAlgorithm powerControlAlgorithm)
    {
	mComponents[0] = powerControlAlgorithm;
    }
    
    
    // Methods for field "deltaACK"
    public DeltaACK getDeltaACK()
    {
	return (DeltaACK)mComponents[1];
    }
    
    public void setDeltaACK(DeltaACK deltaACK)
    {
	mComponents[1] = deltaACK;
    }
    
    public boolean hasDeltaACK()
    {
	return componentIsPresent(1);
    }
    
    public void deleteDeltaACK()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "deltaNACK"
    public DeltaNACK getDeltaNACK()
    {
	return (DeltaNACK)mComponents[2];
    }
    
    public void setDeltaNACK(DeltaNACK deltaNACK)
    {
	mComponents[2] = deltaNACK;
    }
    
    public boolean hasDeltaNACK()
    {
	return componentIsPresent(2);
    }
    
    public void deleteDeltaNACK()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "ack_NACK_repetition_factor"
    public ACK_NACK_repetitionFactor getAck_NACK_repetition_factor()
    {
	return (ACK_NACK_repetitionFactor)mComponents[3];
    }
    
    public void setAck_NACK_repetition_factor(ACK_NACK_repetitionFactor ack_NACK_repetition_factor)
    {
	mComponents[3] = ack_NACK_repetition_factor;
    }
    
    public boolean hasAck_NACK_repetition_factor()
    {
	return componentIsPresent(3);
    }
    
    public void deleteAck_NACK_repetition_factor()
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
	    "UL_DPCHpowerControlInfoForCommonEDCH"
	),
	new QName (
	    "InformationElements",
	    "UL-DPCHpowerControlInfoForCommonEDCH"
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
				"PowerControlAlgorithm"
			    ),
			    new QName (
				"InformationElements",
				"PowerControlAlgorithm"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "PowerControlAlgorithm"
				)
			    ),
			    0,
			    new TagDecoder (
				new TagDecoderElement[] {
				    new TagDecoderElement((short)0x8000, 0),
				    new TagDecoderElement((short)0x8001, 1)
				}
			    )
			)
		    ),
		    "powerControlAlgorithm",
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
				"DeltaACK"
			    ),
			    new QName (
				"InformationElements",
				"DeltaACK"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new DeltaACK(0), 
				    new DeltaACK(8),
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
		    "deltaACK",
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
				"DeltaNACK"
			    ),
			    new QName (
				"InformationElements",
				"DeltaNACK"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new DeltaNACK(0), 
				    new DeltaNACK(8),
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
		    "deltaNACK",
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
				"ACK_NACK_repetitionFactor"
			    ),
			    new QName (
				"InformationElements",
				"ACK-NACK-repetitionFactor"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new ACK_NACK_repetitionFactor(1), 
				    new ACK_NACK_repetitionFactor(4),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(4)
			    ),
			    null
			)
		    ),
		    "ack-NACK-repetition-factor",
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
     * Get the type descriptor (TypeInfo) of 'this' UL_DPCHpowerControlInfoForCommonEDCH object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UL_DPCHpowerControlInfoForCommonEDCH object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UL_DPCHpowerControlInfoForCommonEDCH
