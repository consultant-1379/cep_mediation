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
 * Define the ASN1 Type QualityReportingCriteriaSingle from ASN1 Module InformationElements.
 * @see Sequence
 */

public class QualityReportingCriteriaSingle extends Sequence {
    
    /**
     * The default constructor.
     */
    public QualityReportingCriteriaSingle()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public QualityReportingCriteriaSingle(TransportChannelIdentity transportChannelIdentity, 
		    INTEGER totalCRC, INTEGER badCRC, 
		    INTEGER pendingAfterTrigger)
    {
	setTransportChannelIdentity(transportChannelIdentity);
	setTotalCRC(totalCRC);
	setBadCRC(badCRC);
	setPendingAfterTrigger(pendingAfterTrigger);
    }
    
    /**
     * Construct with components.
     */
    public QualityReportingCriteriaSingle(TransportChannelIdentity transportChannelIdentity, 
		    long totalCRC, long badCRC, long pendingAfterTrigger)
    {
	this(transportChannelIdentity, new INTEGER(totalCRC), 
	     new INTEGER(badCRC), new INTEGER(pendingAfterTrigger));
    }
    
    public void initComponents()
    {
	mComponents[0] = new TransportChannelIdentity();
	mComponents[1] = new INTEGER();
	mComponents[2] = new INTEGER();
	mComponents[3] = new INTEGER();
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
		return new TransportChannelIdentity();
	    case 1:
		return new INTEGER();
	    case 2:
		return new INTEGER();
	    case 3:
		return new INTEGER();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "transportChannelIdentity"
    public TransportChannelIdentity getTransportChannelIdentity()
    {
	return (TransportChannelIdentity)mComponents[0];
    }
    
    public void setTransportChannelIdentity(TransportChannelIdentity transportChannelIdentity)
    {
	mComponents[0] = transportChannelIdentity;
    }
    
    
    // Methods for field "totalCRC"
    public long getTotalCRC()
    {
	return ((INTEGER)mComponents[1]).longValue();
    }
    
    public void setTotalCRC(long totalCRC)
    {
	setTotalCRC(new INTEGER(totalCRC));
    }
    
    public void setTotalCRC(INTEGER totalCRC)
    {
	mComponents[1] = totalCRC;
    }
    
    
    // Methods for field "badCRC"
    public long getBadCRC()
    {
	return ((INTEGER)mComponents[2]).longValue();
    }
    
    public void setBadCRC(long badCRC)
    {
	setBadCRC(new INTEGER(badCRC));
    }
    
    public void setBadCRC(INTEGER badCRC)
    {
	mComponents[2] = badCRC;
    }
    
    
    // Methods for field "pendingAfterTrigger"
    public long getPendingAfterTrigger()
    {
	return ((INTEGER)mComponents[3]).longValue();
    }
    
    public void setPendingAfterTrigger(long pendingAfterTrigger)
    {
	setPendingAfterTrigger(new INTEGER(pendingAfterTrigger));
    }
    
    public void setPendingAfterTrigger(INTEGER pendingAfterTrigger)
    {
	mComponents[3] = pendingAfterTrigger;
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
	    "QualityReportingCriteriaSingle"
	),
	new QName (
	    "InformationElements",
	    "QualityReportingCriteriaSingle"
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
				"TransportChannelIdentity"
			    ),
			    new QName (
				"InformationElements",
				"TransportChannelIdentity"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new TransportChannelIdentity(1), 
				    new TransportChannelIdentity(32),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(32)
			    ),
			    null
			)
		    ),
		    "transportChannelIdentity",
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
				    new com.oss.asn1.INTEGER(1), 
				    new com.oss.asn1.INTEGER(512),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(512)
			    ),
			    null
			)
		    ),
		    "totalCRC",
		    1,
		    2,
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
				    new com.oss.asn1.INTEGER(1), 
				    new com.oss.asn1.INTEGER(512),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(512)
			    ),
			    null
			)
		    ),
		    "badCRC",
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
				    new com.oss.asn1.INTEGER(1), 
				    new com.oss.asn1.INTEGER(512),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(512)
			    ),
			    null
			)
		    ),
		    "pendingAfterTrigger",
		    3,
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
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' QualityReportingCriteriaSingle object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' QualityReportingCriteriaSingle object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for QualityReportingCriteriaSingle
