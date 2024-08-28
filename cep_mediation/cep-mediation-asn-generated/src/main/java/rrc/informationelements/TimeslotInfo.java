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
 * Define the ASN1 Type TimeslotInfo from ASN1 Module InformationElements.
 * @see Sequence
 */

public class TimeslotInfo extends Sequence {
    
    /**
     * The default constructor.
     */
    public TimeslotInfo()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public TimeslotInfo(TimeslotNumber timeslotNumber, BurstType burstType)
    {
	setTimeslotNumber(timeslotNumber);
	setBurstType(burstType);
    }
    
    public void initComponents()
    {
	mComponents[0] = new TimeslotNumber();
	mComponents[1] = BurstType.type1;
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
		return new TimeslotNumber();
	    case 1:
		return BurstType.type1;
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "timeslotNumber"
    public TimeslotNumber getTimeslotNumber()
    {
	return (TimeslotNumber)mComponents[0];
    }
    
    public void setTimeslotNumber(TimeslotNumber timeslotNumber)
    {
	mComponents[0] = timeslotNumber;
    }
    
    
    // Methods for field "burstType"
    public BurstType getBurstType()
    {
	return (BurstType)mComponents[1];
    }
    
    public void setBurstType(BurstType burstType)
    {
	mComponents[1] = burstType;
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
	    "TimeslotInfo"
	),
	new QName (
	    "InformationElements",
	    "TimeslotInfo"
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
				"TimeslotNumber"
			    ),
			    new QName (
				"InformationElements",
				"TimeslotNumber"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new TimeslotNumber(0), 
				    new TimeslotNumber(14),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(14)
			    ),
			    null
			)
		    ),
		    "timeslotNumber",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"BurstType"
			    ),
			    new QName (
				"InformationElements",
				"BurstType"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"type1",
					0
				    ),
				    new MemberListElement (
					"type2",
					1
				    )
				}
			    ),
			    0,
			    BurstType.type1
			)
		    ),
		    "burstType",
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
     * Get the type descriptor (TypeInfo) of 'this' TimeslotInfo object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' TimeslotInfo object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for TimeslotInfo
