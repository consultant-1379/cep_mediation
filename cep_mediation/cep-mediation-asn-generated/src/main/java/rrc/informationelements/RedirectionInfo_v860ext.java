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
 * Define the ASN1 Type RedirectionInfo_v860ext from ASN1 Module InformationElements.
 * @see Choice
 */

public class RedirectionInfo_v860ext extends Choice {
    
    /**
     * The default constructor.
     */
    public RedirectionInfo_v860ext()
    {
    }
    
    public static final  int  frequencyInfo_chosen = 1;
    public static final  int  interRATInfo_chosen = 2;
    
    // Methods for field "frequencyInfo"
    public static RedirectionInfo_v860ext createRedirectionInfo_v860extWithFrequencyInfo(Null frequencyInfo)
    {
	RedirectionInfo_v860ext __object = new RedirectionInfo_v860ext();

	__object.setFrequencyInfo(frequencyInfo);
	return __object;
    }
    
    public boolean hasFrequencyInfo()
    {
	return getChosenFlag() == frequencyInfo_chosen;
    }
    
    public void setFrequencyInfo(Null frequencyInfo)
    {
	setChosenValue(frequencyInfo);
	setChosenFlag(frequencyInfo_chosen);
    }
    
    
    // Methods for field "interRATInfo"
    public static RedirectionInfo_v860ext createRedirectionInfo_v860extWithInterRATInfo(InterRATInfo_v860ext interRATInfo)
    {
	RedirectionInfo_v860ext __object = new RedirectionInfo_v860ext();

	__object.setInterRATInfo(interRATInfo);
	return __object;
    }
    
    public boolean hasInterRATInfo()
    {
	return getChosenFlag() == interRATInfo_chosen;
    }
    
    public void setInterRATInfo(InterRATInfo_v860ext interRATInfo)
    {
	setChosenValue(interRATInfo);
	setChosenFlag(interRATInfo_chosen);
    }
    
    
    // Method to create a specific choice instance
    public AbstractData createInstance(int chosen)
    {
	switch (chosen) {
	    case frequencyInfo_chosen:
		return new Null();
	    case interRATInfo_chosen:
		return new InterRATInfo_v860ext();
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
	    "RedirectionInfo_v860ext"
	),
	new QName (
	    "InformationElements",
	    "RedirectionInfo-v860ext"
	),
	12314,
	null,
	new Fields (
	    new FieldInfo[] {
		new FieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
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
		    "frequencyInfo",
		    0,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"InterRATInfo_v860ext"
			    ),
			    new QName (
				"InformationElements",
				"InterRATInfo-v860ext"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "InterRATInfo_v860ext"
				)
			    ),
			    0,
			    new TagDecoder (
				new TagDecoderElement[] {
				    new TagDecoderElement((short)0x8000, 0),
				    new TagDecoderElement((short)0x8001, 1)
				}
			    )
			)
		    ),
		    "interRATInfo",
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
     * Get the type descriptor (TypeInfo) of 'this' RedirectionInfo_v860ext object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' RedirectionInfo_v860ext object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for RedirectionInfo_v860ext
