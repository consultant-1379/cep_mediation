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
 * Define the ASN1 Type Event1f from ASN1 Module InformationElements.
 * @see Sequence
 */

public class Event1f extends Sequence {
    
    /**
     * The default constructor.
     */
    public Event1f()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public Event1f(TriggeringCondition1 triggeringCondition, 
		    ThresholdUsedFrequency thresholdUsedFrequency)
    {
	setTriggeringCondition(triggeringCondition);
	setThresholdUsedFrequency(thresholdUsedFrequency);
    }
    
    public void initComponents()
    {
	mComponents[0] = TriggeringCondition1.activeSetCellsOnly;
	mComponents[1] = new ThresholdUsedFrequency();
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
		return TriggeringCondition1.activeSetCellsOnly;
	    case 1:
		return new ThresholdUsedFrequency();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "triggeringCondition"
    public TriggeringCondition1 getTriggeringCondition()
    {
	return (TriggeringCondition1)mComponents[0];
    }
    
    public void setTriggeringCondition(TriggeringCondition1 triggeringCondition)
    {
	mComponents[0] = triggeringCondition;
    }
    
    
    // Methods for field "thresholdUsedFrequency"
    public ThresholdUsedFrequency getThresholdUsedFrequency()
    {
	return (ThresholdUsedFrequency)mComponents[1];
    }
    
    public void setThresholdUsedFrequency(ThresholdUsedFrequency thresholdUsedFrequency)
    {
	mComponents[1] = thresholdUsedFrequency;
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
	    "Event1f"
	),
	new QName (
	    "InformationElements",
	    "Event1f"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"TriggeringCondition1"
			    ),
			    new QName (
				"InformationElements",
				"TriggeringCondition1"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"activeSetCellsOnly",
					0
				    ),
				    new MemberListElement (
					"monitoredSetCellsOnly",
					1
				    ),
				    new MemberListElement (
					"activeSetAndMonitoredSetCells",
					2
				    )
				}
			    ),
			    0,
			    TriggeringCondition1.activeSetCellsOnly
			)
		    ),
		    "triggeringCondition",
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
				"ThresholdUsedFrequency"
			    ),
			    new QName (
				"InformationElements",
				"ThresholdUsedFrequency"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new ThresholdUsedFrequency(-115), 
				    new ThresholdUsedFrequency(165),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(-115),
				new java.lang.Long(165)
			    ),
			    null
			)
		    ),
		    "thresholdUsedFrequency",
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
     * Get the type descriptor (TypeInfo) of 'this' Event1f object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' Event1f object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for Event1f
