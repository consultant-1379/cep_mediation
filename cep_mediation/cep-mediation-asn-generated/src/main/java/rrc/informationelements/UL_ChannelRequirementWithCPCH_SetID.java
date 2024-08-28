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
 * Define the ASN1 Type UL_ChannelRequirementWithCPCH_SetID from ASN1 Module InformationElements.
 * @see Choice
 */

public class UL_ChannelRequirementWithCPCH_SetID extends Choice {
    
    /**
     * The default constructor.
     */
    public UL_ChannelRequirementWithCPCH_SetID()
    {
    }
    
    public static final  int  ul_DPCH_Info_chosen = 1;
    public static final  int  dummy1_chosen = 2;
    public static final  int  dummy2_chosen = 3;
    
    // Methods for field "ul_DPCH_Info"
    public static UL_ChannelRequirementWithCPCH_SetID createUL_ChannelRequirementWithCPCH_SetIDWithUl_DPCH_Info(UL_DPCH_Info ul_DPCH_Info)
    {
	UL_ChannelRequirementWithCPCH_SetID __object = new UL_ChannelRequirementWithCPCH_SetID();

	__object.setUl_DPCH_Info(ul_DPCH_Info);
	return __object;
    }
    
    public boolean hasUl_DPCH_Info()
    {
	return getChosenFlag() == ul_DPCH_Info_chosen;
    }
    
    public void setUl_DPCH_Info(UL_DPCH_Info ul_DPCH_Info)
    {
	setChosenValue(ul_DPCH_Info);
	setChosenFlag(ul_DPCH_Info_chosen);
    }
    
    
    // Methods for field "dummy1"
    public static UL_ChannelRequirementWithCPCH_SetID createUL_ChannelRequirementWithCPCH_SetIDWithDummy1(CPCH_SetInfo dummy1)
    {
	UL_ChannelRequirementWithCPCH_SetID __object = new UL_ChannelRequirementWithCPCH_SetID();

	__object.setDummy1(dummy1);
	return __object;
    }
    
    public boolean hasDummy1()
    {
	return getChosenFlag() == dummy1_chosen;
    }
    
    public void setDummy1(CPCH_SetInfo dummy1)
    {
	setChosenValue(dummy1);
	setChosenFlag(dummy1_chosen);
    }
    
    
    // Methods for field "dummy2"
    public static UL_ChannelRequirementWithCPCH_SetID createUL_ChannelRequirementWithCPCH_SetIDWithDummy2(long dummy2)
    {
	return createUL_ChannelRequirementWithCPCH_SetIDWithDummy2(new CPCH_SetID(dummy2));
    }
    
    public static UL_ChannelRequirementWithCPCH_SetID createUL_ChannelRequirementWithCPCH_SetIDWithDummy2(CPCH_SetID dummy2)
    {
	UL_ChannelRequirementWithCPCH_SetID __object = new UL_ChannelRequirementWithCPCH_SetID();

	__object.setDummy2(dummy2);
	return __object;
    }
    
    public boolean hasDummy2()
    {
	return getChosenFlag() == dummy2_chosen;
    }
    
    public void setDummy2(long dummy2)
    {
	setDummy2(new CPCH_SetID(dummy2));
    }
    
    public void setDummy2(CPCH_SetID dummy2)
    {
	setChosenValue(dummy2);
	setChosenFlag(dummy2_chosen);
    }
    
    
    // Method to create a specific choice instance
    public AbstractData createInstance(int chosen)
    {
	switch (chosen) {
	    case ul_DPCH_Info_chosen:
		return new UL_DPCH_Info();
	    case dummy1_chosen:
		return new CPCH_SetInfo();
	    case dummy2_chosen:
		return new CPCH_SetID();
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
	    "UL_ChannelRequirementWithCPCH_SetID"
	),
	new QName (
	    "InformationElements",
	    "UL-ChannelRequirementWithCPCH-SetID"
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
				"UL_DPCH_Info"
			    ),
			    new QName (
				"InformationElements",
				"UL-DPCH-Info"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UL_DPCH_Info"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "UL_DPCH_Info"
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
		    "dummy1",
		    1,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"CPCH_SetID"
			    ),
			    new QName (
				"InformationElements",
				"CPCH-SetID"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new CPCH_SetID(1), 
				    new CPCH_SetID(16),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(16)
			    ),
			    null
			)
		    ),
		    "dummy2",
		    2,
		    2
		)
	    }
	),
	0,
	new TagDecoder (
	    new TagDecoderElement[] {
		new TagDecoderElement((short)0x8000, 0),
		new TagDecoderElement((short)0x8001, 1),
		new TagDecoderElement((short)0x8002, 2)
	    }
	)
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' UL_ChannelRequirementWithCPCH_SetID object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UL_ChannelRequirementWithCPCH_SetID object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UL_ChannelRequirementWithCPCH_SetID
