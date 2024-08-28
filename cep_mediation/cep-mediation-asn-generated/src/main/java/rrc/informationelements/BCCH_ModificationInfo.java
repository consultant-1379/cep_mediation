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
 * Define the ASN1 Type BCCH_ModificationInfo from ASN1 Module InformationElements.
 * @see Sequence
 */

public class BCCH_ModificationInfo extends Sequence {
    
    /**
     * The default constructor.
     */
    public BCCH_ModificationInfo()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public BCCH_ModificationInfo(MIB_ValueTag mib_ValueTag, 
		    BCCH_ModificationTime bcch_ModificationTime)
    {
	setMib_ValueTag(mib_ValueTag);
	setBcch_ModificationTime(bcch_ModificationTime);
    }
    
    /**
     * Construct with required components.
     */
    public BCCH_ModificationInfo(MIB_ValueTag mib_ValueTag)
    {
	setMib_ValueTag(mib_ValueTag);
    }
    
    public void initComponents()
    {
	mComponents[0] = new MIB_ValueTag();
	mComponents[1] = new BCCH_ModificationTime();
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
		return new MIB_ValueTag();
	    case 1:
		return new BCCH_ModificationTime();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "mib_ValueTag"
    public MIB_ValueTag getMib_ValueTag()
    {
	return (MIB_ValueTag)mComponents[0];
    }
    
    public void setMib_ValueTag(MIB_ValueTag mib_ValueTag)
    {
	mComponents[0] = mib_ValueTag;
    }
    
    
    // Methods for field "bcch_ModificationTime"
    public BCCH_ModificationTime getBcch_ModificationTime()
    {
	return (BCCH_ModificationTime)mComponents[1];
    }
    
    public void setBcch_ModificationTime(BCCH_ModificationTime bcch_ModificationTime)
    {
	mComponents[1] = bcch_ModificationTime;
    }
    
    public boolean hasBcch_ModificationTime()
    {
	return componentIsPresent(1);
    }
    
    public void deleteBcch_ModificationTime()
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
	    "BCCH_ModificationInfo"
	),
	new QName (
	    "InformationElements",
	    "BCCH-ModificationInfo"
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
				"MIB_ValueTag"
			    ),
			    new QName (
				"InformationElements",
				"MIB-ValueTag"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new MIB_ValueTag(1), 
				    new MIB_ValueTag(8),
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
		    "mib-ValueTag",
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
				"BCCH_ModificationTime"
			    ),
			    new QName (
				"InformationElements",
				"BCCH-ModificationTime"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new BCCH_ModificationTime(0), 
				    new BCCH_ModificationTime(511),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(511)
			    ),
			    null
			)
		    ),
		    "bcch-ModificationTime",
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
     * Get the type descriptor (TypeInfo) of 'this' BCCH_ModificationInfo object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' BCCH_ModificationInfo object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for BCCH_ModificationInfo
