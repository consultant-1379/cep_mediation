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
 * Define the ASN1 Type ChannelCodingType from ASN1 Module InformationElements.
 * @see Choice
 */

public class ChannelCodingType extends Choice {
    
    /**
     * The default constructor.
     */
    public ChannelCodingType()
    {
    }
    
    public static final  int  noCoding_chosen = 1;
    public static final  int  convolutional_chosen = 2;
    public static final  int  turbo_chosen = 3;
    
    // Methods for field "noCoding"
    public static ChannelCodingType createChannelCodingTypeWithNoCoding(Null noCoding)
    {
	ChannelCodingType __object = new ChannelCodingType();

	__object.setNoCoding(noCoding);
	return __object;
    }
    
    public boolean hasNoCoding()
    {
	return getChosenFlag() == noCoding_chosen;
    }
    
    public void setNoCoding(Null noCoding)
    {
	setChosenValue(noCoding);
	setChosenFlag(noCoding_chosen);
    }
    
    
    // Methods for field "convolutional"
    public static ChannelCodingType createChannelCodingTypeWithConvolutional(CodingRate convolutional)
    {
	ChannelCodingType __object = new ChannelCodingType();

	__object.setConvolutional(convolutional);
	return __object;
    }
    
    public boolean hasConvolutional()
    {
	return getChosenFlag() == convolutional_chosen;
    }
    
    public void setConvolutional(CodingRate convolutional)
    {
	setChosenValue(convolutional);
	setChosenFlag(convolutional_chosen);
    }
    
    
    // Methods for field "turbo"
    public static ChannelCodingType createChannelCodingTypeWithTurbo(Null turbo)
    {
	ChannelCodingType __object = new ChannelCodingType();

	__object.setTurbo(turbo);
	return __object;
    }
    
    public boolean hasTurbo()
    {
	return getChosenFlag() == turbo_chosen;
    }
    
    public void setTurbo(Null turbo)
    {
	setChosenValue(turbo);
	setChosenFlag(turbo_chosen);
    }
    
    
    // Method to create a specific choice instance
    public AbstractData createInstance(int chosen)
    {
	switch (chosen) {
	    case noCoding_chosen:
		return new Null();
	    case convolutional_chosen:
		return CodingRate.half;
	    case turbo_chosen:
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
	    "ChannelCodingType"
	),
	new QName (
	    "InformationElements",
	    "ChannelCodingType"
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
		    "noCoding",
		    0,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"CodingRate"
			    ),
			    new QName (
				"InformationElements",
				"CodingRate"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"half",
					0
				    ),
				    new MemberListElement (
					"third",
					1
				    )
				}
			    ),
			    0,
			    CodingRate.half
			)
		    ),
		    "convolutional",
		    1,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
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
		    "turbo",
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
     * Get the type descriptor (TypeInfo) of 'this' ChannelCodingType object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' ChannelCodingType object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for ChannelCodingType
