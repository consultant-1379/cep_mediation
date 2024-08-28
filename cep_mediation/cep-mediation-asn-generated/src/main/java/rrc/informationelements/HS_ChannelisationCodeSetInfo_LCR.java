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
 * Define the ASN1 Type HS_ChannelisationCodeSetInfo_LCR from ASN1 Module InformationElements.
 * @see Sequence
 */

public class HS_ChannelisationCodeSetInfo_LCR extends Sequence {
    
    /**
     * The default constructor.
     */
    public HS_ChannelisationCodeSetInfo_LCR()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public HS_ChannelisationCodeSetInfo_LCR(HS_ChannelisationCode_LCR startCode, 
		    HS_ChannelisationCode_LCR stopCode)
    {
	setStartCode(startCode);
	setStopCode(stopCode);
    }
    
    public void initComponents()
    {
	mComponents[0] = HS_ChannelisationCode_LCR.cc16_1;
	mComponents[1] = HS_ChannelisationCode_LCR.cc16_1;
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
		return HS_ChannelisationCode_LCR.cc16_1;
	    case 1:
		return HS_ChannelisationCode_LCR.cc16_1;
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "startCode"
    public HS_ChannelisationCode_LCR getStartCode()
    {
	return (HS_ChannelisationCode_LCR)mComponents[0];
    }
    
    public void setStartCode(HS_ChannelisationCode_LCR startCode)
    {
	mComponents[0] = startCode;
    }
    
    
    // Methods for field "stopCode"
    public HS_ChannelisationCode_LCR getStopCode()
    {
	return (HS_ChannelisationCode_LCR)mComponents[1];
    }
    
    public void setStopCode(HS_ChannelisationCode_LCR stopCode)
    {
	mComponents[1] = stopCode;
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
	    "HS_ChannelisationCodeSetInfo_LCR"
	),
	new QName (
	    "InformationElements",
	    "HS-ChannelisationCodeSetInfo-LCR"
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
				"HS_ChannelisationCode_LCR"
			    ),
			    new QName (
				"InformationElements",
				"HS-ChannelisationCode-LCR"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"cc16-1",
					0
				    ),
				    new MemberListElement (
					"cc16-2",
					1
				    ),
				    new MemberListElement (
					"cc16-3",
					2
				    ),
				    new MemberListElement (
					"cc16-4",
					3
				    ),
				    new MemberListElement (
					"cc16-5",
					4
				    ),
				    new MemberListElement (
					"cc16-6",
					5
				    ),
				    new MemberListElement (
					"cc16-7",
					6
				    ),
				    new MemberListElement (
					"cc16-8",
					7
				    ),
				    new MemberListElement (
					"cc16-9",
					8
				    ),
				    new MemberListElement (
					"cc16-10",
					9
				    ),
				    new MemberListElement (
					"cc16-11",
					10
				    ),
				    new MemberListElement (
					"cc16-12",
					11
				    ),
				    new MemberListElement (
					"cc16-13",
					12
				    ),
				    new MemberListElement (
					"cc16-14",
					13
				    ),
				    new MemberListElement (
					"cc16-15",
					14
				    ),
				    new MemberListElement (
					"cc16-16",
					15
				    )
				}
			    ),
			    0,
			    HS_ChannelisationCode_LCR.cc16_1
			)
		    ),
		    "startCode",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"HS_ChannelisationCode_LCR"
			    ),
			    new QName (
				"InformationElements",
				"HS-ChannelisationCode-LCR"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"cc16-1",
					0
				    ),
				    new MemberListElement (
					"cc16-2",
					1
				    ),
				    new MemberListElement (
					"cc16-3",
					2
				    ),
				    new MemberListElement (
					"cc16-4",
					3
				    ),
				    new MemberListElement (
					"cc16-5",
					4
				    ),
				    new MemberListElement (
					"cc16-6",
					5
				    ),
				    new MemberListElement (
					"cc16-7",
					6
				    ),
				    new MemberListElement (
					"cc16-8",
					7
				    ),
				    new MemberListElement (
					"cc16-9",
					8
				    ),
				    new MemberListElement (
					"cc16-10",
					9
				    ),
				    new MemberListElement (
					"cc16-11",
					10
				    ),
				    new MemberListElement (
					"cc16-12",
					11
				    ),
				    new MemberListElement (
					"cc16-13",
					12
				    ),
				    new MemberListElement (
					"cc16-14",
					13
				    ),
				    new MemberListElement (
					"cc16-15",
					14
				    ),
				    new MemberListElement (
					"cc16-16",
					15
				    )
				}
			    ),
			    0,
			    HS_ChannelisationCode_LCR.cc16_1
			)
		    ),
		    "stopCode",
		    1,
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
     * Get the type descriptor (TypeInfo) of 'this' HS_ChannelisationCodeSetInfo_LCR object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' HS_ChannelisationCodeSetInfo_LCR object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for HS_ChannelisationCodeSetInfo_LCR
