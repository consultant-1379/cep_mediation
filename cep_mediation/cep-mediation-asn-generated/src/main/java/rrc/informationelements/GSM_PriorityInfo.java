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
 * Define the ASN1 Type GSM_PriorityInfo from ASN1 Module InformationElements.
 * @see Sequence
 */

public class GSM_PriorityInfo extends Sequence {
    
    /**
     * The default constructor.
     */
    public GSM_PriorityInfo()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public GSM_PriorityInfo(GSM_CellGroup gsmCellGroup, INTEGER priority, 
		    INTEGER qRxLevMinGSM, INTEGER threshXhigh, 
		    INTEGER threshXlow)
    {
	setGsmCellGroup(gsmCellGroup);
	setPriority(priority);
	setQRxLevMinGSM(qRxLevMinGSM);
	setThreshXhigh(threshXhigh);
	setThreshXlow(threshXlow);
    }
    
    /**
     * Construct with components.
     */
    public GSM_PriorityInfo(GSM_CellGroup gsmCellGroup, long priority, 
		    long qRxLevMinGSM, long threshXhigh, long threshXlow)
    {
	this(gsmCellGroup, new INTEGER(priority), 
	     new INTEGER(qRxLevMinGSM), new INTEGER(threshXhigh), 
	     new INTEGER(threshXlow));
    }
    
    public void initComponents()
    {
	mComponents[0] = new GSM_CellGroup();
	mComponents[1] = new INTEGER();
	mComponents[2] = new INTEGER();
	mComponents[3] = new INTEGER();
	mComponents[4] = new INTEGER();
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
		return new GSM_CellGroup();
	    case 1:
		return new INTEGER();
	    case 2:
		return new INTEGER();
	    case 3:
		return new INTEGER();
	    case 4:
		return new INTEGER();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "gsmCellGroup"
    public GSM_CellGroup getGsmCellGroup()
    {
	return (GSM_CellGroup)mComponents[0];
    }
    
    public void setGsmCellGroup(GSM_CellGroup gsmCellGroup)
    {
	mComponents[0] = gsmCellGroup;
    }
    
    
    // Methods for field "priority"
    public long getPriority()
    {
	return ((INTEGER)mComponents[1]).longValue();
    }
    
    public void setPriority(long priority)
    {
	setPriority(new INTEGER(priority));
    }
    
    public void setPriority(INTEGER priority)
    {
	mComponents[1] = priority;
    }
    
    
    // Methods for field "qRxLevMinGSM"
    public long getQRxLevMinGSM()
    {
	return ((INTEGER)mComponents[2]).longValue();
    }
    
    public void setQRxLevMinGSM(long qRxLevMinGSM)
    {
	setQRxLevMinGSM(new INTEGER(qRxLevMinGSM));
    }
    
    public void setQRxLevMinGSM(INTEGER qRxLevMinGSM)
    {
	mComponents[2] = qRxLevMinGSM;
    }
    
    
    // Methods for field "threshXhigh"
    public long getThreshXhigh()
    {
	return ((INTEGER)mComponents[3]).longValue();
    }
    
    public void setThreshXhigh(long threshXhigh)
    {
	setThreshXhigh(new INTEGER(threshXhigh));
    }
    
    public void setThreshXhigh(INTEGER threshXhigh)
    {
	mComponents[3] = threshXhigh;
    }
    
    
    // Methods for field "threshXlow"
    public long getThreshXlow()
    {
	return ((INTEGER)mComponents[4]).longValue();
    }
    
    public void setThreshXlow(long threshXlow)
    {
	setThreshXlow(new INTEGER(threshXlow));
    }
    
    public void setThreshXlow(INTEGER threshXlow)
    {
	mComponents[4] = threshXlow;
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
	    "GSM_PriorityInfo"
	),
	new QName (
	    "InformationElements",
	    "GSM-PriorityInfo"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"GSM_CellGroup"
			    ),
			    new QName (
				"InformationElements",
				"GSM-CellGroup"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "GSM_CellGroup"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "GSM_CellGroup"
				)
			    ),
			    0
			)
		    ),
		    "gsmCellGroup",
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
				    new com.oss.asn1.INTEGER(0), 
				    new com.oss.asn1.INTEGER(7),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(7)
			    ),
			    null
			)
		    ),
		    "priority",
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
				    new com.oss.asn1.INTEGER(-58), 
				    new com.oss.asn1.INTEGER(-13),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(-58),
				new java.lang.Long(-13)
			    ),
			    null
			)
		    ),
		    "qRxLevMinGSM",
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
				    new com.oss.asn1.INTEGER(0), 
				    new com.oss.asn1.INTEGER(31),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(31)
			    ),
			    null
			)
		    ),
		    "threshXhigh",
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
				    new com.oss.asn1.INTEGER(31),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(31)
			    ),
			    null
			)
		    ),
		    "threshXlow",
		    4,
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
     * Get the type descriptor (TypeInfo) of 'this' GSM_PriorityInfo object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' GSM_PriorityInfo object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for GSM_PriorityInfo
