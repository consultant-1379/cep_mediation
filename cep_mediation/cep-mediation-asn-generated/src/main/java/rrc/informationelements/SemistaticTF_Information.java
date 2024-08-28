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
 * Define the ASN1 Type SemistaticTF_Information from ASN1 Module InformationElements.
 * @see Sequence
 */

public class SemistaticTF_Information extends Sequence {
    
    /**
     * The default constructor.
     */
    public SemistaticTF_Information()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public SemistaticTF_Information(ChannelCodingType channelCodingType, 
		    RateMatchingAttribute rateMatchingAttribute, 
		    CRC_Size crc_Size)
    {
	setChannelCodingType(channelCodingType);
	setRateMatchingAttribute(rateMatchingAttribute);
	setCrc_Size(crc_Size);
    }
    
    public void initComponents()
    {
	mComponents[0] = new ChannelCodingType();
	mComponents[1] = new RateMatchingAttribute();
	mComponents[2] = CRC_Size.crc0;
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[3];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new ChannelCodingType();
	    case 1:
		return new RateMatchingAttribute();
	    case 2:
		return CRC_Size.crc0;
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "channelCodingType"
    public ChannelCodingType getChannelCodingType()
    {
	return (ChannelCodingType)mComponents[0];
    }
    
    public void setChannelCodingType(ChannelCodingType channelCodingType)
    {
	mComponents[0] = channelCodingType;
    }
    
    
    // Methods for field "rateMatchingAttribute"
    public RateMatchingAttribute getRateMatchingAttribute()
    {
	return (RateMatchingAttribute)mComponents[1];
    }
    
    public void setRateMatchingAttribute(RateMatchingAttribute rateMatchingAttribute)
    {
	mComponents[1] = rateMatchingAttribute;
    }
    
    
    // Methods for field "crc_Size"
    public CRC_Size getCrc_Size()
    {
	return (CRC_Size)mComponents[2];
    }
    
    public void setCrc_Size(CRC_Size crc_Size)
    {
	mComponents[2] = crc_Size;
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
	    "SemistaticTF_Information"
	),
	new QName (
	    "InformationElements",
	    "SemistaticTF-Information"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"ChannelCodingType"
			    ),
			    new QName (
				"InformationElements",
				"ChannelCodingType"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "ChannelCodingType"
				)
			    ),
			    0,
			    new TagDecoder (
				new TagDecoderElement[] {
				    new TagDecoderElement((short)0x8000, 0),
				    new TagDecoderElement((short)0x8001, 1),
				    new TagDecoderElement((short)0x8002, 2)
				}
			    )
			)
		    ),
		    "channelCodingType",
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
				"RateMatchingAttribute"
			    ),
			    new QName (
				"InformationElements",
				"RateMatchingAttribute"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new RateMatchingAttribute(1), 
				    new RateMatchingAttribute(256),
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
		    "rateMatchingAttribute",
		    1,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"CRC_Size"
			    ),
			    new QName (
				"InformationElements",
				"CRC-Size"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"crc0",
					0
				    ),
				    new MemberListElement (
					"crc8",
					1
				    ),
				    new MemberListElement (
					"crc12",
					2
				    ),
				    new MemberListElement (
					"crc16",
					3
				    ),
				    new MemberListElement (
					"crc24",
					4
				    )
				}
			    ),
			    0,
			    CRC_Size.crc0
			)
		    ),
		    "crc-Size",
		    2,
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
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' SemistaticTF_Information object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' SemistaticTF_Information object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for SemistaticTF_Information
