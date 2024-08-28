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
 * Define the ASN1 Type RLC_Capability_r5_ext from ASN1 Module InformationElements.
 * @see Sequence
 */

public class RLC_Capability_r5_ext extends Sequence {
    
    /**
     * The default constructor.
     */
    public RLC_Capability_r5_ext()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public RLC_Capability_r5_ext(TotalRLC_AM_BufferSize_r5_ext totalRLC_AM_BufferSize)
    {
	setTotalRLC_AM_BufferSize(totalRLC_AM_BufferSize);
    }
    
    public void initComponents()
    {
	mComponents[0] = TotalRLC_AM_BufferSize_r5_ext.kb200;
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[1];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return TotalRLC_AM_BufferSize_r5_ext.kb200;
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "totalRLC_AM_BufferSize"
    public TotalRLC_AM_BufferSize_r5_ext getTotalRLC_AM_BufferSize()
    {
	return (TotalRLC_AM_BufferSize_r5_ext)mComponents[0];
    }
    
    public void setTotalRLC_AM_BufferSize(TotalRLC_AM_BufferSize_r5_ext totalRLC_AM_BufferSize)
    {
	mComponents[0] = totalRLC_AM_BufferSize;
    }
    
    public boolean hasTotalRLC_AM_BufferSize()
    {
	return componentIsPresent(0);
    }
    
    public void deleteTotalRLC_AM_BufferSize()
    {
	setComponentAbsent(0);
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
	    "RLC_Capability_r5_ext"
	),
	new QName (
	    "InformationElements",
	    "RLC-Capability-r5-ext"
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
				"TotalRLC_AM_BufferSize_r5_ext"
			    ),
			    new QName (
				"InformationElements",
				"TotalRLC-AM-BufferSize-r5-ext"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"kb200",
					0
				    ),
				    new MemberListElement (
					"kb300",
					1
				    ),
				    new MemberListElement (
					"kb400",
					2
				    ),
				    new MemberListElement (
					"kb750",
					3
				    )
				}
			    ),
			    0,
			    TotalRLC_AM_BufferSize_r5_ext.kb200
			)
		    ),
		    "totalRLC-AM-BufferSize",
		    0,
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
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' RLC_Capability_r5_ext object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' RLC_Capability_r5_ext object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for RLC_Capability_r5_ext
