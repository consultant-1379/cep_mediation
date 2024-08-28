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
 * Define the ASN1 Type Inter_FreqEventCriteria_v590ext from ASN1 Module InformationElements.
 * @see Sequence
 */

public class Inter_FreqEventCriteria_v590ext extends Sequence {
    
    /**
     * The default constructor.
     */
    public Inter_FreqEventCriteria_v590ext()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public Inter_FreqEventCriteria_v590ext(DeltaRSCP threholdUsedFrequency_delta, 
		    ThreholdNonUsedFrequency_deltaList threholdNonUsedFrequency_deltaList)
    {
	setThreholdUsedFrequency_delta(threholdUsedFrequency_delta);
	setThreholdNonUsedFrequency_deltaList(threholdNonUsedFrequency_deltaList);
    }
    
    /**
     * Construct with required components.
     */
    public Inter_FreqEventCriteria_v590ext(DeltaRSCP threholdUsedFrequency_delta)
    {
	setThreholdUsedFrequency_delta(threholdUsedFrequency_delta);
    }
    
    public void initComponents()
    {
	mComponents[0] = new DeltaRSCP();
	mComponents[1] = new ThreholdNonUsedFrequency_deltaList();
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
		return new DeltaRSCP();
	    case 1:
		return new ThreholdNonUsedFrequency_deltaList();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "threholdUsedFrequency_delta"
    public DeltaRSCP getThreholdUsedFrequency_delta()
    {
	return (DeltaRSCP)mComponents[0];
    }
    
    public void setThreholdUsedFrequency_delta(DeltaRSCP threholdUsedFrequency_delta)
    {
	mComponents[0] = threholdUsedFrequency_delta;
    }
    
    
    // Methods for field "threholdNonUsedFrequency_deltaList"
    public ThreholdNonUsedFrequency_deltaList getThreholdNonUsedFrequency_deltaList()
    {
	return (ThreholdNonUsedFrequency_deltaList)mComponents[1];
    }
    
    public void setThreholdNonUsedFrequency_deltaList(ThreholdNonUsedFrequency_deltaList threholdNonUsedFrequency_deltaList)
    {
	mComponents[1] = threholdNonUsedFrequency_deltaList;
    }
    
    public boolean hasThreholdNonUsedFrequency_deltaList()
    {
	return componentIsPresent(1);
    }
    
    public void deleteThreholdNonUsedFrequency_deltaList()
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
	    "Inter_FreqEventCriteria_v590ext"
	),
	new QName (
	    "InformationElements",
	    "Inter-FreqEventCriteria-v590ext"
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
				"DeltaRSCP"
			    ),
			    new QName (
				"InformationElements",
				"DeltaRSCP"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new DeltaRSCP(-5), 
				    new DeltaRSCP(-1),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(-5),
				new java.lang.Long(-1)
			    ),
			    null
			)
		    ),
		    "threholdUsedFrequency-delta",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"ThreholdNonUsedFrequency_deltaList"
			    ),
			    new QName (
				"InformationElements",
				"ThreholdNonUsedFrequency-deltaList"
			    ),
			    12314,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new com.oss.asn1.INTEGER(1), 
					new com.oss.asn1.INTEGER(8),
					0
				    )
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(8)
			    ),
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "DeltaRSCPPerCell"
				)
			    )
			)
		    ),
		    "threholdNonUsedFrequency-deltaList",
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
     * Get the type descriptor (TypeInfo) of 'this' Inter_FreqEventCriteria_v590ext object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' Inter_FreqEventCriteria_v590ext object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for Inter_FreqEventCriteria_v590ext
