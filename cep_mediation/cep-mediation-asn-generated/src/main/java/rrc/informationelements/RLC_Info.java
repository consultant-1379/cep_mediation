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
 * Define the ASN1 Type RLC_Info from ASN1 Module InformationElements.
 * @see Sequence
 */

public class RLC_Info extends Sequence {
    
    /**
     * The default constructor.
     */
    public RLC_Info()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public RLC_Info(UL_RLC_Mode ul_RLC_Mode, DL_RLC_Mode dl_RLC_Mode)
    {
	setUl_RLC_Mode(ul_RLC_Mode);
	setDl_RLC_Mode(dl_RLC_Mode);
    }
    
    public void initComponents()
    {
	mComponents[0] = new UL_RLC_Mode();
	mComponents[1] = new DL_RLC_Mode();
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
		return new UL_RLC_Mode();
	    case 1:
		return new DL_RLC_Mode();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "ul_RLC_Mode"
    public UL_RLC_Mode getUl_RLC_Mode()
    {
	return (UL_RLC_Mode)mComponents[0];
    }
    
    public void setUl_RLC_Mode(UL_RLC_Mode ul_RLC_Mode)
    {
	mComponents[0] = ul_RLC_Mode;
    }
    
    public boolean hasUl_RLC_Mode()
    {
	return componentIsPresent(0);
    }
    
    public void deleteUl_RLC_Mode()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "dl_RLC_Mode"
    public DL_RLC_Mode getDl_RLC_Mode()
    {
	return (DL_RLC_Mode)mComponents[1];
    }
    
    public void setDl_RLC_Mode(DL_RLC_Mode dl_RLC_Mode)
    {
	mComponents[1] = dl_RLC_Mode;
    }
    
    public boolean hasDl_RLC_Mode()
    {
	return componentIsPresent(1);
    }
    
    public void deleteDl_RLC_Mode()
    {
	setComponentAbsent(1);
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
	    "RLC_Info"
	),
	new QName (
	    "InformationElements",
	    "RLC-Info"
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
				"UL_RLC_Mode"
			    ),
			    new QName (
				"InformationElements",
				"UL-RLC-Mode"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UL_RLC_Mode"
				)
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
			)
		    ),
		    "ul-RLC-Mode",
		    0,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"DL_RLC_Mode"
			    ),
			    new QName (
				"InformationElements",
				"DL-RLC-Mode"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "DL_RLC_Mode"
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
		    "dl-RLC-Mode",
		    1,
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
			new TagDecoderElement((short)0x8000, 0),
			new TagDecoderElement((short)0x8001, 1)
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
     * Get the type descriptor (TypeInfo) of 'this' RLC_Info object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' RLC_Info object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for RLC_Info
