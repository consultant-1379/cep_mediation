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
 * Define the ASN1 Type SFN_TimeInfo from ASN1 Module InformationElements.
 * @see Sequence
 */

public class SFN_TimeInfo extends Sequence {
    
    /**
     * The default constructor.
     */
    public SFN_TimeInfo()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public SFN_TimeInfo(INTEGER activationTimeSFN, 
		    DurationTimeInfo physChDuration)
    {
	setActivationTimeSFN(activationTimeSFN);
	setPhysChDuration(physChDuration);
    }
    
    /**
     * Construct with components.
     */
    public SFN_TimeInfo(long activationTimeSFN, 
		    DurationTimeInfo physChDuration)
    {
	this(new INTEGER(activationTimeSFN), physChDuration);
    }
    
    public void initComponents()
    {
	mComponents[0] = new INTEGER();
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
		return new INTEGER();
	    case 1:
		return new DurationTimeInfo();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "activationTimeSFN"
    public long getActivationTimeSFN()
    {
	return ((INTEGER)mComponents[0]).longValue();
    }
    
    public void setActivationTimeSFN(long activationTimeSFN)
    {
	setActivationTimeSFN(new INTEGER(activationTimeSFN));
    }
    
    public void setActivationTimeSFN(INTEGER activationTimeSFN)
    {
	mComponents[0] = activationTimeSFN;
    }
    
    
    // Methods for field "physChDuration"
    public DurationTimeInfo getPhysChDuration()
    {
	return (DurationTimeInfo)mComponents[1];
    }
    
    public void setPhysChDuration(DurationTimeInfo physChDuration)
    {
	mComponents[1] = physChDuration;
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
	    "SFN_TimeInfo"
	),
	new QName (
	    "InformationElements",
	    "SFN-TimeInfo"
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
				    new com.oss.asn1.INTEGER(0), 
				    new com.oss.asn1.INTEGER(4095),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(4095)
			    ),
			    null
			)
		    ),
		    "activationTimeSFN",
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
		    "physChDuration",
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
     * Get the type descriptor (TypeInfo) of 'this' SFN_TimeInfo object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' SFN_TimeInfo object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for SFN_TimeInfo
