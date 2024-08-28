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
 * Define the ASN1 Type LosslessSRNS_RelocSupport from ASN1 Module InformationElements.
 * @see Choice
 */

public class LosslessSRNS_RelocSupport extends Choice {
    
    /**
     * The default constructor.
     */
    public LosslessSRNS_RelocSupport()
    {
    }
    
    public static final  int  supported_chosen = 1;
    public static final  int  notSupported_chosen = 2;
    
    // Methods for field "supported"
    public static LosslessSRNS_RelocSupport createLosslessSRNS_RelocSupportWithSupported(MaxPDCP_SN_WindowSize supported)
    {
	LosslessSRNS_RelocSupport __object = new LosslessSRNS_RelocSupport();

	__object.setSupported(supported);
	return __object;
    }
    
    public boolean hasSupported()
    {
	return getChosenFlag() == supported_chosen;
    }
    
    public void setSupported(MaxPDCP_SN_WindowSize supported)
    {
	setChosenValue(supported);
	setChosenFlag(supported_chosen);
    }
    
    
    // Methods for field "notSupported"
    public static LosslessSRNS_RelocSupport createLosslessSRNS_RelocSupportWithNotSupported(Null notSupported)
    {
	LosslessSRNS_RelocSupport __object = new LosslessSRNS_RelocSupport();

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
    
    
    // Method to create a specific choice instance
    public AbstractData createInstance(int chosen)
    {
	switch (chosen) {
	    case supported_chosen:
		return MaxPDCP_SN_WindowSize.sn255;
	    case notSupported_chosen:
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
	    "LosslessSRNS_RelocSupport"
	),
	new QName (
	    "InformationElements",
	    "LosslessSRNS-RelocSupport"
	),
	12314,
	null,
	new Fields (
	    new FieldInfo[] {
		new FieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"MaxPDCP_SN_WindowSize"
			    ),
			    new QName (
				"InformationElements",
				"MaxPDCP-SN-WindowSize"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"sn255",
					0
				    ),
				    new MemberListElement (
					"sn65535",
					1
				    )
				}
			    ),
			    0,
			    MaxPDCP_SN_WindowSize.sn255
			)
		    ),
		    "supported",
		    0,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
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
     * Get the type descriptor (TypeInfo) of 'this' LosslessSRNS_RelocSupport object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' LosslessSRNS_RelocSupport object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for LosslessSRNS_RelocSupport
