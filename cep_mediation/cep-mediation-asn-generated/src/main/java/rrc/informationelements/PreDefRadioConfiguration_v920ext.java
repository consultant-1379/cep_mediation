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
 * Define the ASN1 Type PreDefRadioConfiguration_v920ext from ASN1 Module InformationElements.
 * @see Sequence
 */

public class PreDefRadioConfiguration_v920ext extends Sequence {
    
    /**
     * The default constructor.
     */
    public PreDefRadioConfiguration_v920ext()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public PreDefRadioConfiguration_v920ext(MAC_hs_WindowSize_r9 mac_ehsWindowSize)
    {
	setMac_ehsWindowSize(mac_ehsWindowSize);
    }
    
    public void initComponents()
    {
	mComponents[0] = MAC_hs_WindowSize_r9.mws4;
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[1];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return MAC_hs_WindowSize_r9.mws4;
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "mac_ehsWindowSize"
    public MAC_hs_WindowSize_r9 getMac_ehsWindowSize()
    {
	return (MAC_hs_WindowSize_r9)mComponents[0];
    }
    
    public void setMac_ehsWindowSize(MAC_hs_WindowSize_r9 mac_ehsWindowSize)
    {
	mComponents[0] = mac_ehsWindowSize;
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
	    "PreDefRadioConfiguration_v920ext"
	),
	new QName (
	    "InformationElements",
	    "PreDefRadioConfiguration-v920ext"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"MAC_hs_WindowSize_r9"
			    ),
			    new QName (
				"InformationElements",
				"MAC-hs-WindowSize-r9"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"mws4",
					0
				    ),
				    new MemberListElement (
					"mws6",
					1
				    ),
				    new MemberListElement (
					"mws8",
					2
				    ),
				    new MemberListElement (
					"mws12",
					3
				    ),
				    new MemberListElement (
					"mws16",
					4
				    ),
				    new MemberListElement (
					"mws24",
					5
				    ),
				    new MemberListElement (
					"mws32",
					6
				    ),
				    new MemberListElement (
					"mw64",
					7
				    ),
				    new MemberListElement (
					"mw128",
					8
				    )
				}
			    ),
			    0,
			    MAC_hs_WindowSize_r9.mws4
			)
		    ),
		    "mac-ehsWindowSize",
		    0,
		    2,
		    null
		)
	    }
	),
	0,
	new TagDecoders (
	    new TagDecoder[] {
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8000, 0)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' PreDefRadioConfiguration_v920ext object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' PreDefRadioConfiguration_v920ext object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for PreDefRadioConfiguration_v920ext
