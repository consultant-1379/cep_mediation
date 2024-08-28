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
 * Define the ASN1 Type MBSFN_TDM_Info from ASN1 Module InformationElements.
 * @see Sequence
 */

public class MBSFN_TDM_Info extends Sequence {
    
    /**
     * The default constructor.
     */
    public MBSFN_TDM_Info()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public MBSFN_TDM_Info(MBMS_ShortTransmissionID shortTransmissionID, 
		    INTEGER tDMPeriod, INTEGER tDMOffset, INTEGER tDMLength)
    {
	setShortTransmissionID(shortTransmissionID);
	setTDMPeriod(tDMPeriod);
	setTDMOffset(tDMOffset);
	setTDMLength(tDMLength);
    }
    
    /**
     * Construct with components.
     */
    public MBSFN_TDM_Info(MBMS_ShortTransmissionID shortTransmissionID, 
		    long tDMPeriod, long tDMOffset, long tDMLength)
    {
	this(shortTransmissionID, new INTEGER(tDMPeriod), 
	     new INTEGER(tDMOffset), new INTEGER(tDMLength));
    }
    
    public void initComponents()
    {
	mComponents[0] = new MBMS_ShortTransmissionID();
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
		return new MBMS_ShortTransmissionID();
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
    
    
    // Methods for field "shortTransmissionID"
    public MBMS_ShortTransmissionID getShortTransmissionID()
    {
	return (MBMS_ShortTransmissionID)mComponents[0];
    }
    
    public void setShortTransmissionID(MBMS_ShortTransmissionID shortTransmissionID)
    {
	mComponents[0] = shortTransmissionID;
    }
    
    
    // Methods for field "tDMPeriod"
    public long getTDMPeriod()
    {
	return ((INTEGER)mComponents[1]).longValue();
    }
    
    public void setTDMPeriod(long tDMPeriod)
    {
	setTDMPeriod(new INTEGER(tDMPeriod));
    }
    
    public void setTDMPeriod(INTEGER tDMPeriod)
    {
	mComponents[1] = tDMPeriod;
    }
    
    
    // Methods for field "tDMOffset"
    public long getTDMOffset()
    {
	return ((INTEGER)mComponents[2]).longValue();
    }
    
    public void setTDMOffset(long tDMOffset)
    {
	setTDMOffset(new INTEGER(tDMOffset));
    }
    
    public void setTDMOffset(INTEGER tDMOffset)
    {
	mComponents[2] = tDMOffset;
    }
    
    
    // Methods for field "tDMLength"
    public long getTDMLength()
    {
	return ((INTEGER)mComponents[3]).longValue();
    }
    
    public void setTDMLength(long tDMLength)
    {
	setTDMLength(new INTEGER(tDMLength));
    }
    
    public void setTDMLength(INTEGER tDMLength)
    {
	mComponents[3] = tDMLength;
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
	    "MBSFN_TDM_Info"
	),
	new QName (
	    "InformationElements",
	    "MBSFN-TDM-Info"
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
				"MBMS_ShortTransmissionID"
			    ),
			    new QName (
				"InformationElements",
				"MBMS-ShortTransmissionID"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new MBMS_ShortTransmissionID(1), 
				    new MBMS_ShortTransmissionID(64),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(64)
			    ),
			    null
			)
		    ),
		    "shortTransmissionID",
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
				    new com.oss.asn1.INTEGER(2), 
				    new com.oss.asn1.INTEGER(9),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(2),
				new java.lang.Long(9)
			    ),
			    null
			)
		    ),
		    "tDMPeriod",
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
				    new com.oss.asn1.INTEGER(0), 
				    new com.oss.asn1.INTEGER(8),
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
		    "tDMOffset",
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
				    new com.oss.asn1.INTEGER(8),
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
		    "tDMLength",
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
     * Get the type descriptor (TypeInfo) of 'this' MBSFN_TDM_Info object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' MBSFN_TDM_Info object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for MBSFN_TDM_Info
