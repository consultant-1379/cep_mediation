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
 * Define the ASN1 Type DRAC_SysInfo from ASN1 Module InformationElements.
 * @see Sequence
 */

public class DRAC_SysInfo extends Sequence {
    
    /**
     * The default constructor.
     */
    public DRAC_SysInfo()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public DRAC_SysInfo(TransmissionProbability transmissionProbability, 
		    MaximumBitRate maximumBitRate)
    {
	setTransmissionProbability(transmissionProbability);
	setMaximumBitRate(maximumBitRate);
    }
    
    public void initComponents()
    {
	mComponents[0] = new TransmissionProbability();
	mComponents[1] = new MaximumBitRate();
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
		return new TransmissionProbability();
	    case 1:
		return new MaximumBitRate();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "transmissionProbability"
    public TransmissionProbability getTransmissionProbability()
    {
	return (TransmissionProbability)mComponents[0];
    }
    
    public void setTransmissionProbability(TransmissionProbability transmissionProbability)
    {
	mComponents[0] = transmissionProbability;
    }
    
    
    // Methods for field "maximumBitRate"
    public MaximumBitRate getMaximumBitRate()
    {
	return (MaximumBitRate)mComponents[1];
    }
    
    public void setMaximumBitRate(MaximumBitRate maximumBitRate)
    {
	mComponents[1] = maximumBitRate;
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
	    "DRAC_SysInfo"
	),
	new QName (
	    "InformationElements",
	    "DRAC-SysInfo"
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
				"TransmissionProbability"
			    ),
			    new QName (
				"InformationElements",
				"TransmissionProbability"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new TransmissionProbability(1), 
				    new TransmissionProbability(8),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(8)
			    ),
			    null
			)
		    ),
		    "transmissionProbability",
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
				"MaximumBitRate"
			    ),
			    new QName (
				"InformationElements",
				"MaximumBitRate"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new MaximumBitRate(0), 
				    new MaximumBitRate(32),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(32)
			    ),
			    null
			)
		    ),
		    "maximumBitRate",
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
     * Get the type descriptor (TypeInfo) of 'this' DRAC_SysInfo object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' DRAC_SysInfo object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for DRAC_SysInfo
