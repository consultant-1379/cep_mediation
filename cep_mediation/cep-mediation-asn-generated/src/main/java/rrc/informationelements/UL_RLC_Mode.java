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
 * Define the ASN1 Type UL_RLC_Mode from ASN1 Module InformationElements.
 * @see Choice
 */

public class UL_RLC_Mode extends Choice {
    
    /**
     * The default constructor.
     */
    public UL_RLC_Mode()
    {
    }
    
    public static final  int  ul_AM_RLC_Mode_chosen = 1;
    public static final  int  ul_UM_RLC_Mode_chosen = 2;
    public static final  int  ul_TM_RLC_Mode_chosen = 3;
    public static final  int  spare_chosen = 4;
    
    // Methods for field "ul_AM_RLC_Mode"
    public static UL_RLC_Mode createUL_RLC_ModeWithUl_AM_RLC_Mode(UL_AM_RLC_Mode ul_AM_RLC_Mode)
    {
	UL_RLC_Mode __object = new UL_RLC_Mode();

	__object.setUl_AM_RLC_Mode(ul_AM_RLC_Mode);
	return __object;
    }
    
    public boolean hasUl_AM_RLC_Mode()
    {
	return getChosenFlag() == ul_AM_RLC_Mode_chosen;
    }
    
    public void setUl_AM_RLC_Mode(UL_AM_RLC_Mode ul_AM_RLC_Mode)
    {
	setChosenValue(ul_AM_RLC_Mode);
	setChosenFlag(ul_AM_RLC_Mode_chosen);
    }
    
    
    // Methods for field "ul_UM_RLC_Mode"
    public static UL_RLC_Mode createUL_RLC_ModeWithUl_UM_RLC_Mode(UL_UM_RLC_Mode ul_UM_RLC_Mode)
    {
	UL_RLC_Mode __object = new UL_RLC_Mode();

	__object.setUl_UM_RLC_Mode(ul_UM_RLC_Mode);
	return __object;
    }
    
    public boolean hasUl_UM_RLC_Mode()
    {
	return getChosenFlag() == ul_UM_RLC_Mode_chosen;
    }
    
    public void setUl_UM_RLC_Mode(UL_UM_RLC_Mode ul_UM_RLC_Mode)
    {
	setChosenValue(ul_UM_RLC_Mode);
	setChosenFlag(ul_UM_RLC_Mode_chosen);
    }
    
    
    // Methods for field "ul_TM_RLC_Mode"
    public static UL_RLC_Mode createUL_RLC_ModeWithUl_TM_RLC_Mode(UL_TM_RLC_Mode ul_TM_RLC_Mode)
    {
	UL_RLC_Mode __object = new UL_RLC_Mode();

	__object.setUl_TM_RLC_Mode(ul_TM_RLC_Mode);
	return __object;
    }
    
    public boolean hasUl_TM_RLC_Mode()
    {
	return getChosenFlag() == ul_TM_RLC_Mode_chosen;
    }
    
    public void setUl_TM_RLC_Mode(UL_TM_RLC_Mode ul_TM_RLC_Mode)
    {
	setChosenValue(ul_TM_RLC_Mode);
	setChosenFlag(ul_TM_RLC_Mode_chosen);
    }
    
    
    // Methods for field "spare"
    public static UL_RLC_Mode createUL_RLC_ModeWithSpare(Null spare)
    {
	UL_RLC_Mode __object = new UL_RLC_Mode();

	__object.setSpare(spare);
	return __object;
    }
    
    public boolean hasSpare()
    {
	return getChosenFlag() == spare_chosen;
    }
    
    public void setSpare(Null spare)
    {
	setChosenValue(spare);
	setChosenFlag(spare_chosen);
    }
    
    
    // Method to create a specific choice instance
    public AbstractData createInstance(int chosen)
    {
	switch (chosen) {
	    case ul_AM_RLC_Mode_chosen:
		return new UL_AM_RLC_Mode();
	    case ul_UM_RLC_Mode_chosen:
		return new UL_UM_RLC_Mode();
	    case ul_TM_RLC_Mode_chosen:
		return new UL_TM_RLC_Mode();
	    case spare_chosen:
		return new Null();
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
	    "UL_RLC_Mode"
	),
	new QName (
	    "InformationElements",
	    "UL-RLC-Mode"
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
				"UL_AM_RLC_Mode"
			    ),
			    new QName (
				"InformationElements",
				"UL-AM-RLC-Mode"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UL_AM_RLC_Mode"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "UL_AM_RLC_Mode"
				)
			    ),
			    0
			)
		    ),
		    "ul-AM-RLC-Mode",
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
				"UL_UM_RLC_Mode"
			    ),
			    new QName (
				"InformationElements",
				"UL-UM-RLC-Mode"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UL_UM_RLC_Mode"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "UL_UM_RLC_Mode"
				)
			    ),
			    0
			)
		    ),
		    "ul-UM-RLC-Mode",
		    1,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"UL_TM_RLC_Mode"
			    ),
			    new QName (
				"InformationElements",
				"UL-TM-RLC-Mode"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UL_TM_RLC_Mode"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "UL_TM_RLC_Mode"
				)
			    ),
			    0
			)
		    ),
		    "ul-TM-RLC-Mode",
		    2,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"Null"
			    ),
			    new QName (
				"builtin",
				"NULL"
			    ),
			    12314,
			    null
			)
		    ),
		    "spare",
		    3,
		    2
		)
	    }
	),
	0,
	new TagDecoder (
	    new TagDecoderElement[] {
		new TagDecoderElement((short)0x8000, 0),
		new TagDecoderElement((short)0x8001, 1),
		new TagDecoderElement((short)0x8002, 2),
		new TagDecoderElement((short)0x8003, 3)
	    }
	)
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' UL_RLC_Mode object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UL_RLC_Mode object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UL_RLC_Mode
