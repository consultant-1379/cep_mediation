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
 * Define the ASN1 Type UL_ChannelRequirement_r5 from ASN1 Module InformationElements.
 * @see Choice
 */

public class UL_ChannelRequirement_r5 extends Choice {
    
    /**
     * The default constructor.
     */
    public UL_ChannelRequirement_r5()
    {
    }
    
    public static final  int  ul_DPCH_Info_chosen = 1;
    public static final  int  dummy_chosen = 2;
    
    // Methods for field "ul_DPCH_Info"
    public static UL_ChannelRequirement_r5 createUL_ChannelRequirement_r5WithUl_DPCH_Info(UL_DPCH_Info_r5 ul_DPCH_Info)
    {
	UL_ChannelRequirement_r5 __object = new UL_ChannelRequirement_r5();

	__object.setUl_DPCH_Info(ul_DPCH_Info);
	return __object;
    }
    
    public boolean hasUl_DPCH_Info()
    {
	return getChosenFlag() == ul_DPCH_Info_chosen;
    }
    
    public void setUl_DPCH_Info(UL_DPCH_Info_r5 ul_DPCH_Info)
    {
	setChosenValue(ul_DPCH_Info);
	setChosenFlag(ul_DPCH_Info_chosen);
    }
    
    
    // Methods for field "dummy"
    public static UL_ChannelRequirement_r5 createUL_ChannelRequirement_r5WithDummy(CPCH_SetInfo dummy)
    {
	UL_ChannelRequirement_r5 __object = new UL_ChannelRequirement_r5();

	__object.setDummy(dummy);
	return __object;
    }
    
    public boolean hasDummy()
    {
	return getChosenFlag() == dummy_chosen;
    }
    
    public void setDummy(CPCH_SetInfo dummy)
    {
	setChosenValue(dummy);
	setChosenFlag(dummy_chosen);
    }
    
    
    // Method to create a specific choice instance
    public AbstractData createInstance(int chosen)
    {
	switch (chosen) {
	    case ul_DPCH_Info_chosen:
		return new UL_DPCH_Info_r5();
	    case dummy_chosen:
		return new CPCH_SetInfo();
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
	    "UL_ChannelRequirement_r5"
	),
	new QName (
	    "InformationElements",
	    "UL-ChannelRequirement-r5"
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
				"UL_DPCH_Info_r5"
			    ),
			    new QName (
				"InformationElements",
				"UL-DPCH-Info-r5"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UL_DPCH_Info_r5"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "UL_DPCH_Info_r5"
				)
			    ),
			    0
			)
		    ),
		    "ul-DPCH-Info",
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
				"CPCH_SetInfo"
			    ),
			    new QName (
				"InformationElements",
				"CPCH-SetInfo"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "CPCH_SetInfo"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "CPCH_SetInfo"
				)
			    ),
			    0
			)
		    ),
		    "dummy",
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
     * Get the type descriptor (TypeInfo) of 'this' UL_ChannelRequirement_r5 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UL_ChannelRequirement_r5 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UL_ChannelRequirement_r5
