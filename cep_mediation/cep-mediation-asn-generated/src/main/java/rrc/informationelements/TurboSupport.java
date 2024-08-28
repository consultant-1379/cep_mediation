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
 * Define the ASN1 Type TurboSupport from ASN1 Module InformationElements.
 * @see Choice
 */

public class TurboSupport extends Choice {
    
    /**
     * The default constructor.
     */
    public TurboSupport()
    {
    }
    
    public static final  int  notSupported_chosen = 1;
    public static final  int  supported_chosen = 2;
    
    // Methods for field "notSupported"
    public static TurboSupport createTurboSupportWithNotSupported(Null notSupported)
    {
	TurboSupport __object = new TurboSupport();

	__object.setNotSupported(notSupported);
	return __object;
    }
    
    public boolean hasNotSupported()
    {
	return getChosenFlag() == notSupported_chosen;
    }
    
    public void setNotSupported(Null notSupported)
    {
	setChosenValue(notSupported);
	setChosenFlag(notSupported_chosen);
    }
    
    
    // Methods for field "supported"
    public static TurboSupport createTurboSupportWithSupported(MaxNoBits supported)
    {
	TurboSupport __object = new TurboSupport();

	__object.setSupported(supported);
	return __object;
    }
    
    public boolean hasSupported()
    {
	return getChosenFlag() == supported_chosen;
    }
    
    public void setSupported(MaxNoBits supported)
    {
	setChosenValue(supported);
	setChosenFlag(supported_chosen);
    }
    
    
    // Method to create a specific choice instance
    public AbstractData createInstance(int chosen)
    {
	switch (chosen) {
	    case notSupported_chosen:
		return new Null();
	    case supported_chosen:
		return MaxNoBits.b640;
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
	    "TurboSupport"
	),
	new QName (
	    "InformationElements",
	    "TurboSupport"
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
		    "notSupported",
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
				"MaxNoBits"
			    ),
			    new QName (
				"InformationElements",
				"MaxNoBits"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"b640",
					0
				    ),
				    new MemberListElement (
					"b1280",
					1
				    ),
				    new MemberListElement (
					"b2560",
					2
				    ),
				    new MemberListElement (
					"b3840",
					3
				    ),
				    new MemberListElement (
					"b5120",
					4
				    ),
				    new MemberListElement (
					"b6400",
					5
				    ),
				    new MemberListElement (
					"b7680",
					6
				    ),
				    new MemberListElement (
					"b8960",
					7
				    ),
				    new MemberListElement (
					"b10240",
					8
				    ),
				    new MemberListElement (
					"b20480",
					9
				    ),
				    new MemberListElement (
					"b40960",
					10
				    ),
				    new MemberListElement (
					"b81920",
					11
				    ),
				    new MemberListElement (
					"b163840",
					12
				    )
				}
			    ),
			    0,
			    MaxNoBits.b640
			)
		    ),
		    "supported",
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
     * Get the type descriptor (TypeInfo) of 'this' TurboSupport object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' TurboSupport object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for TurboSupport
