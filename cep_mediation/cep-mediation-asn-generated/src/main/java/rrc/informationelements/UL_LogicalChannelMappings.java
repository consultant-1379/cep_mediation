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
 * Define the ASN1 Type UL_LogicalChannelMappings from ASN1 Module InformationElements.
 * @see Choice
 */

public class UL_LogicalChannelMappings extends Choice {
    
    /**
     * The default constructor.
     */
    public UL_LogicalChannelMappings()
    {
    }
    
    public static final  int  oneLogicalChannel_chosen = 1;
    public static final  int  twoLogicalChannels_chosen = 2;
    
    // Methods for field "oneLogicalChannel"
    public static UL_LogicalChannelMappings createUL_LogicalChannelMappingsWithOneLogicalChannel(UL_LogicalChannelMapping oneLogicalChannel)
    {
	UL_LogicalChannelMappings __object = new UL_LogicalChannelMappings();

	__object.setOneLogicalChannel(oneLogicalChannel);
	return __object;
    }
    
    public boolean hasOneLogicalChannel()
    {
	return getChosenFlag() == oneLogicalChannel_chosen;
    }
    
    public void setOneLogicalChannel(UL_LogicalChannelMapping oneLogicalChannel)
    {
	setChosenValue(oneLogicalChannel);
	setChosenFlag(oneLogicalChannel_chosen);
    }
    
    
    // Methods for field "twoLogicalChannels"
    public static UL_LogicalChannelMappings createUL_LogicalChannelMappingsWithTwoLogicalChannels(UL_LogicalChannelMappingList twoLogicalChannels)
    {
	UL_LogicalChannelMappings __object = new UL_LogicalChannelMappings();

	__object.setTwoLogicalChannels(twoLogicalChannels);
	return __object;
    }
    
    public boolean hasTwoLogicalChannels()
    {
	return getChosenFlag() == twoLogicalChannels_chosen;
    }
    
    public void setTwoLogicalChannels(UL_LogicalChannelMappingList twoLogicalChannels)
    {
	setChosenValue(twoLogicalChannels);
	setChosenFlag(twoLogicalChannels_chosen);
    }
    
    
    // Method to create a specific choice instance
    public AbstractData createInstance(int chosen)
    {
	switch (chosen) {
	    case oneLogicalChannel_chosen:
		return new UL_LogicalChannelMapping();
	    case twoLogicalChannels_chosen:
		return new UL_LogicalChannelMappingList();
	    default:
		throw new InternalError("Choice.createInstance()");
	}
	
    }
    
    /**
     * Initialize the type descriptor.
     */
    private static final ChoiceInfo c_typeinfo = new ChoiceInfo (
	new Tags (
	    null
	),
	new QName (
	    "rrc.informationelements",
	    "UL_LogicalChannelMappings"
	),
	new QName (
	    "InformationElements",
	    "UL-LogicalChannelMappings"
	),
	12314,
	null,
	new Fields (
	    new FieldInfo[] {
		new FieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"UL_LogicalChannelMapping"
			    ),
			    new QName (
				"InformationElements",
				"UL-LogicalChannelMapping"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UL_LogicalChannelMapping"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "UL_LogicalChannelMapping"
				)
			    ),
			    0
			)
		    ),
		    "oneLogicalChannel",
		    0,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"UL_LogicalChannelMappingList"
			    ),
			    new QName (
				"InformationElements",
				"UL-LogicalChannelMappingList"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UL_LogicalChannelMappingList"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "UL_LogicalChannelMappingList"
				)
			    ),
			    0
			)
		    ),
		    "twoLogicalChannels",
		    1,
		    2
		)
	    }
	),
	0,
	new TagDecoder (
	    new TagDecoderElement[] {
		new TagDecoderElement((short)0x8000, 0),
		new TagDecoderElement((short)0x8001, 1)
	    }
	)
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' UL_LogicalChannelMappings object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UL_LogicalChannelMappings object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UL_LogicalChannelMappings
