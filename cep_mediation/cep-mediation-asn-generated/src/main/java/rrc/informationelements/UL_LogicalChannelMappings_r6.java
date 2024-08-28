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
 * Define the ASN1 Type UL_LogicalChannelMappings_r6 from ASN1 Module InformationElements.
 * @see Choice
 */

public class UL_LogicalChannelMappings_r6 extends Choice {
    
    /**
     * The default constructor.
     */
    public UL_LogicalChannelMappings_r6()
    {
    }
    
    public static final  int  oneLogicalChannel_chosen = 1;
    public static final  int  twoLogicalChannels_chosen = 2;
    
    // Methods for field "oneLogicalChannel"
    public static UL_LogicalChannelMappings_r6 createUL_LogicalChannelMappings_r6WithOneLogicalChannel(UL_LogicalChannelMapping_r6 oneLogicalChannel)
    {
	UL_LogicalChannelMappings_r6 __object = new UL_LogicalChannelMappings_r6();

	__object.setOneLogicalChannel(oneLogicalChannel);
	return __object;
    }
    
    public boolean hasOneLogicalChannel()
    {
	return getChosenFlag() == oneLogicalChannel_chosen;
    }
    
    public void setOneLogicalChannel(UL_LogicalChannelMapping_r6 oneLogicalChannel)
    {
	setChosenValue(oneLogicalChannel);
	setChosenFlag(oneLogicalChannel_chosen);
    }
    
    
    // Methods for field "twoLogicalChannels"
    public static UL_LogicalChannelMappings_r6 createUL_LogicalChannelMappings_r6WithTwoLogicalChannels(UL_LogicalChannelMappingList_r6 twoLogicalChannels)
    {
	UL_LogicalChannelMappings_r6 __object = new UL_LogicalChannelMappings_r6();

	__object.setTwoLogicalChannels(twoLogicalChannels);
	return __object;
    }
    
    public boolean hasTwoLogicalChannels()
    {
	return getChosenFlag() == twoLogicalChannels_chosen;
    }
    
    public void setTwoLogicalChannels(UL_LogicalChannelMappingList_r6 twoLogicalChannels)
    {
	setChosenValue(twoLogicalChannels);
	setChosenFlag(twoLogicalChannels_chosen);
    }
    
    
    // Method to create a specific choice instance
    public AbstractData createInstance(int chosen)
    {
	switch (chosen) {
	    case oneLogicalChannel_chosen:
		return new UL_LogicalChannelMapping_r6();
	    case twoLogicalChannels_chosen:
		return new UL_LogicalChannelMappingList_r6();
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
	    "UL_LogicalChannelMappings_r6"
	),
	new QName (
	    "InformationElements",
	    "UL-LogicalChannelMappings-r6"
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
				"UL_LogicalChannelMapping_r6"
			    ),
			    new QName (
				"InformationElements",
				"UL-LogicalChannelMapping-r6"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UL_LogicalChannelMapping_r6"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "UL_LogicalChannelMapping_r6"
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
				"UL_LogicalChannelMappingList_r6"
			    ),
			    new QName (
				"InformationElements",
				"UL-LogicalChannelMappingList-r6"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UL_LogicalChannelMappingList_r6"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "UL_LogicalChannelMappingList_r6"
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
     * Get the type descriptor (TypeInfo) of 'this' UL_LogicalChannelMappings_r6 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UL_LogicalChannelMappings_r6 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UL_LogicalChannelMappings_r6
