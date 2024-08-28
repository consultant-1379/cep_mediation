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
 * Define the ASN1 Type DL_RLC_Mode_r7 from ASN1 Module InformationElements.
 * @see Choice
 */

public class DL_RLC_Mode_r7 extends Choice {
    
    /**
     * The default constructor.
     */
    public DL_RLC_Mode_r7()
    {
    }
    
    public static final  int  dl_AM_RLC_Mode_chosen = 1;
    public static final  int  dl_UM_RLC_Mode_chosen = 2;
    public static final  int  dl_TM_RLC_Mode_chosen = 3;
    
    // Methods for field "dl_AM_RLC_Mode"
    public static DL_RLC_Mode_r7 createDL_RLC_Mode_r7WithDl_AM_RLC_Mode(DL_AM_RLC_Mode_r7 dl_AM_RLC_Mode)
    {
	DL_RLC_Mode_r7 __object = new DL_RLC_Mode_r7();

	__object.setDl_AM_RLC_Mode(dl_AM_RLC_Mode);
	return __object;
    }
    
    public boolean hasDl_AM_RLC_Mode()
    {
	return getChosenFlag() == dl_AM_RLC_Mode_chosen;
    }
    
    public void setDl_AM_RLC_Mode(DL_AM_RLC_Mode_r7 dl_AM_RLC_Mode)
    {
	setChosenValue(dl_AM_RLC_Mode);
	setChosenFlag(dl_AM_RLC_Mode_chosen);
    }
    
    
    // Methods for field "dl_UM_RLC_Mode"
    public static DL_RLC_Mode_r7 createDL_RLC_Mode_r7WithDl_UM_RLC_Mode(DL_UM_RLC_Mode_r6 dl_UM_RLC_Mode)
    {
	DL_RLC_Mode_r7 __object = new DL_RLC_Mode_r7();

	__object.setDl_UM_RLC_Mode(dl_UM_RLC_Mode);
	return __object;
    }
    
    public boolean hasDl_UM_RLC_Mode()
    {
	return getChosenFlag() == dl_UM_RLC_Mode_chosen;
    }
    
    public void setDl_UM_RLC_Mode(DL_UM_RLC_Mode_r6 dl_UM_RLC_Mode)
    {
	setChosenValue(dl_UM_RLC_Mode);
	setChosenFlag(dl_UM_RLC_Mode_chosen);
    }
    
    
    // Methods for field "dl_TM_RLC_Mode"
    public static DL_RLC_Mode_r7 createDL_RLC_Mode_r7WithDl_TM_RLC_Mode(DL_TM_RLC_Mode dl_TM_RLC_Mode)
    {
	DL_RLC_Mode_r7 __object = new DL_RLC_Mode_r7();

	__object.setDl_TM_RLC_Mode(dl_TM_RLC_Mode);
	return __object;
    }
    
    public boolean hasDl_TM_RLC_Mode()
    {
	return getChosenFlag() == dl_TM_RLC_Mode_chosen;
    }
    
    public void setDl_TM_RLC_Mode(DL_TM_RLC_Mode dl_TM_RLC_Mode)
    {
	setChosenValue(dl_TM_RLC_Mode);
	setChosenFlag(dl_TM_RLC_Mode_chosen);
    }
    
    
    // Method to create a specific choice instance
    public AbstractData createInstance(int chosen)
    {
	switch (chosen) {
	    case dl_AM_RLC_Mode_chosen:
		return new DL_AM_RLC_Mode_r7();
	    case dl_UM_RLC_Mode_chosen:
		return new DL_UM_RLC_Mode_r6();
	    case dl_TM_RLC_Mode_chosen:
		return new DL_TM_RLC_Mode();
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
	    "DL_RLC_Mode_r7"
	),
	new QName (
	    "InformationElements",
	    "DL-RLC-Mode-r7"
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
				"DL_AM_RLC_Mode_r7"
			    ),
			    new QName (
				"InformationElements",
				"DL-AM-RLC-Mode-r7"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "DL_AM_RLC_Mode_r7"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "DL_AM_RLC_Mode_r7"
				)
			    ),
			    0
			)
		    ),
		    "dl-AM-RLC-Mode",
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
				"DL_UM_RLC_Mode_r6"
			    ),
			    new QName (
				"InformationElements",
				"DL-UM-RLC-Mode-r6"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "DL_UM_RLC_Mode_r6"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "DL_UM_RLC_Mode_r6"
				)
			    ),
			    0
			)
		    ),
		    "dl-UM-RLC-Mode",
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
				"DL_TM_RLC_Mode"
			    ),
			    new QName (
				"InformationElements",
				"DL-TM-RLC-Mode"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "DL_TM_RLC_Mode"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "DL_TM_RLC_Mode"
				)
			    ),
			    0
			)
		    ),
		    "dl-TM-RLC-Mode",
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
     * Get the type descriptor (TypeInfo) of 'this' DL_RLC_Mode_r7 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' DL_RLC_Mode_r7 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for DL_RLC_Mode_r7
