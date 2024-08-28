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
 * Define the ASN1 Type TFCS from ASN1 Module InformationElements.
 * @see Choice
 */

public class TFCS extends Choice {
    
    /**
     * The default constructor.
     */
    public TFCS()
    {
    }
    
    public static final  int  normalTFCI_Signalling_chosen = 1;
    public static final  int  dummy_chosen = 2;
    
    // Methods for field "normalTFCI_Signalling"
    public static TFCS createTFCSWithNormalTFCI_Signalling(ExplicitTFCS_Configuration normalTFCI_Signalling)
    {
	TFCS __object = new TFCS();

	__object.setNormalTFCI_Signalling(normalTFCI_Signalling);
	return __object;
    }
    
    public boolean hasNormalTFCI_Signalling()
    {
	return getChosenFlag() == normalTFCI_Signalling_chosen;
    }
    
    public void setNormalTFCI_Signalling(ExplicitTFCS_Configuration normalTFCI_Signalling)
    {
	setChosenValue(normalTFCI_Signalling);
	setChosenFlag(normalTFCI_Signalling_chosen);
    }
    
    
    // Methods for field "dummy"
    public static TFCS createTFCSWithDummy(SplitTFCI_Signalling dummy)
    {
	TFCS __object = new TFCS();

	__object.setDummy(dummy);
	return __object;
    }
    
    public boolean hasDummy()
    {
	return getChosenFlag() == dummy_chosen;
    }
    
    public void setDummy(SplitTFCI_Signalling dummy)
    {
	setChosenValue(dummy);
	setChosenFlag(dummy_chosen);
    }
    
    
    // Method to create a specific choice instance
    public AbstractData createInstance(int chosen)
    {
	switch (chosen) {
	    case normalTFCI_Signalling_chosen:
		return new ExplicitTFCS_Configuration();
	    case dummy_chosen:
		return new SplitTFCI_Signalling();
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
	    "TFCS"
	),
	new QName (
	    "InformationElements",
	    "TFCS"
	),
	12314,
	null,
	new Fields (
	    new FieldInfo[] {
		new FieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"ExplicitTFCS_Configuration"
			    ),
			    new QName (
				"InformationElements",
				"ExplicitTFCS-Configuration"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "ExplicitTFCS_Configuration"
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
		    "normalTFCI-Signalling",
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
				"SplitTFCI_Signalling"
			    ),
			    new QName (
				"InformationElements",
				"SplitTFCI-Signalling"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "SplitTFCI_Signalling"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "SplitTFCI_Signalling"
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
     * Get the type descriptor (TypeInfo) of 'this' TFCS object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' TFCS object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for TFCS
