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
 * Define the ASN1 Type CBS_DRX_Level1Information from ASN1 Module InformationElements.
 * @see Sequence
 */

public class CBS_DRX_Level1Information extends Sequence {
    
    /**
     * The default constructor.
     */
    public CBS_DRX_Level1Information()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public CBS_DRX_Level1Information(INTEGER ctch_AllocationPeriod, 
		    INTEGER cbs_FrameOffset)
    {
	setCtch_AllocationPeriod(ctch_AllocationPeriod);
	setCbs_FrameOffset(cbs_FrameOffset);
    }
    
    /**
     * Construct with components.
     */
    public CBS_DRX_Level1Information(long ctch_AllocationPeriod, 
		    long cbs_FrameOffset)
    {
	this(new INTEGER(ctch_AllocationPeriod), 
	     new INTEGER(cbs_FrameOffset));
    }
    
    public void initComponents()
    {
	mComponents[0] = new INTEGER();
	mComponents[1] = new INTEGER();
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
		return new INTEGER();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "ctch_AllocationPeriod"
    public long getCtch_AllocationPeriod()
    {
	return ((INTEGER)mComponents[0]).longValue();
    }
    
    public void setCtch_AllocationPeriod(long ctch_AllocationPeriod)
    {
	setCtch_AllocationPeriod(new INTEGER(ctch_AllocationPeriod));
    }
    
    public void setCtch_AllocationPeriod(INTEGER ctch_AllocationPeriod)
    {
	mComponents[0] = ctch_AllocationPeriod;
    }
    
    
    // Methods for field "cbs_FrameOffset"
    public long getCbs_FrameOffset()
    {
	return ((INTEGER)mComponents[1]).longValue();
    }
    
    public void setCbs_FrameOffset(long cbs_FrameOffset)
    {
	setCbs_FrameOffset(new INTEGER(cbs_FrameOffset));
    }
    
    public void setCbs_FrameOffset(INTEGER cbs_FrameOffset)
    {
	mComponents[1] = cbs_FrameOffset;
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
	    "CBS_DRX_Level1Information"
	),
	new QName (
	    "InformationElements",
	    "CBS-DRX-Level1Information"
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
				    new com.oss.asn1.INTEGER(1), 
				    new com.oss.asn1.INTEGER(256),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(256)
			    ),
			    null
			)
		    ),
		    "ctch-AllocationPeriod",
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
				    new com.oss.asn1.INTEGER(255),
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
		    "cbs-FrameOffset",
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
     * Get the type descriptor (TypeInfo) of 'this' CBS_DRX_Level1Information object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' CBS_DRX_Level1Information object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for CBS_DRX_Level1Information
