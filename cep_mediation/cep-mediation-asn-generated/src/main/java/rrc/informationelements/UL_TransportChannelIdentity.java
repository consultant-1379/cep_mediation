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
 * Define the ASN1 Type UL_TransportChannelIdentity from ASN1 Module InformationElements.
 * @see Sequence
 */

public class UL_TransportChannelIdentity extends Sequence {
    
    /**
     * The default constructor.
     */
    public UL_TransportChannelIdentity()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public UL_TransportChannelIdentity(UL_TrCH_Type ul_TransportChannelType, 
		    TransportChannelIdentity ul_TransportChannelIdentity)
    {
	setUl_TransportChannelType(ul_TransportChannelType);
	setUl_TransportChannelIdentity(ul_TransportChannelIdentity);
    }
    
    public void initComponents()
    {
	mComponents[0] = UL_TrCH_Type.dch;
	mComponents[1] = new TransportChannelIdentity();
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
		return UL_TrCH_Type.dch;
	    case 1:
		return new TransportChannelIdentity();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "ul_TransportChannelType"
    public UL_TrCH_Type getUl_TransportChannelType()
    {
	return (UL_TrCH_Type)mComponents[0];
    }
    
    public void setUl_TransportChannelType(UL_TrCH_Type ul_TransportChannelType)
    {
	mComponents[0] = ul_TransportChannelType;
    }
    
    
    // Methods for field "ul_TransportChannelIdentity"
    public TransportChannelIdentity getUl_TransportChannelIdentity()
    {
	return (TransportChannelIdentity)mComponents[1];
    }
    
    public void setUl_TransportChannelIdentity(TransportChannelIdentity ul_TransportChannelIdentity)
    {
	mComponents[1] = ul_TransportChannelIdentity;
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
	    "UL_TransportChannelIdentity"
	),
	new QName (
	    "InformationElements",
	    "UL-TransportChannelIdentity"
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
				"UL_TrCH_Type"
			    ),
			    new QName (
				"InformationElements",
				"UL-TrCH-Type"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"dch",
					0
				    ),
				    new MemberListElement (
					"usch",
					1
				    )
				}
			    ),
			    0,
			    UL_TrCH_Type.dch
			)
		    ),
		    "ul-TransportChannelType",
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
		    "ul-TransportChannelIdentity",
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
     * Get the type descriptor (TypeInfo) of 'this' UL_TransportChannelIdentity object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UL_TransportChannelIdentity object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UL_TransportChannelIdentity
