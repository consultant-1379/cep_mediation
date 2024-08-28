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
 * Define the ASN1 Type TimeInfo from ASN1 Module InformationElements.
 * @see Sequence
 */

public class TimeInfo extends Sequence {
    
    /**
     * The default constructor.
     */
    public TimeInfo()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public TimeInfo(ActivationTime activationTime, 
		    DurationTimeInfo durationTimeInfo)
    {
	setActivationTime(activationTime);
	setDurationTimeInfo(durationTimeInfo);
    }
    
    public void initComponents()
    {
	mComponents[0] = new ActivationTime();
	mComponents[1] = new DurationTimeInfo();
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
		return new ActivationTime();
	    case 1:
		return new DurationTimeInfo();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "activationTime"
    public ActivationTime getActivationTime()
    {
	return (ActivationTime)mComponents[0];
    }
    
    public void setActivationTime(ActivationTime activationTime)
    {
	mComponents[0] = activationTime;
    }
    
    public boolean hasActivationTime()
    {
	return componentIsPresent(0);
    }
    
    public void deleteActivationTime()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "durationTimeInfo"
    public DurationTimeInfo getDurationTimeInfo()
    {
	return (DurationTimeInfo)mComponents[1];
    }
    
    public void setDurationTimeInfo(DurationTimeInfo durationTimeInfo)
    {
	mComponents[1] = durationTimeInfo;
    }
    
    public boolean hasDurationTimeInfo()
    {
	return componentIsPresent(1);
    }
    
    public void deleteDurationTimeInfo()
    {
	setComponentAbsent(1);
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
	    "TimeInfo"
	),
	new QName (
	    "InformationElements",
	    "TimeInfo"
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
				"ActivationTime"
			    ),
			    new QName (
				"InformationElements",
				"ActivationTime"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new ActivationTime(0), 
				    new ActivationTime(255),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(255)
			    ),
			    null
			)
		    ),
		    "activationTime",
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
				"DurationTimeInfo"
			    ),
			    new QName (
				"InformationElements",
				"DurationTimeInfo"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new DurationTimeInfo(1), 
				    new DurationTimeInfo(4096),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(4096)
			    ),
			    null
			)
		    ),
		    "durationTimeInfo",
		    1,
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
			new TagDecoderElement((short)0x8001, 1)
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
     * Get the type descriptor (TypeInfo) of 'this' TimeInfo object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' TimeInfo object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for TimeInfo
