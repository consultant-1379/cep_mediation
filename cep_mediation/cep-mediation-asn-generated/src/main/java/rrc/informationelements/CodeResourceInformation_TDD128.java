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
 * Define the ASN1 Type CodeResourceInformation_TDD128 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class CodeResourceInformation_TDD128 extends Sequence {
    
    /**
     * The default constructor.
     */
    public CodeResourceInformation_TDD128()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public CodeResourceInformation_TDD128(HS_ChannelisationCode_LCR start_code, 
		    HS_ChannelisationCode_LCR stop_code)
    {
	setStart_code(start_code);
	setStop_code(stop_code);
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
    
    
    // Methods for field "start_code"
    public HS_ChannelisationCode_LCR getStart_code()
    {
	return (HS_ChannelisationCode_LCR)mComponents[0];
    }
    
    public void setStart_code(HS_ChannelisationCode_LCR start_code)
    {
	mComponents[0] = start_code;
    }
    
    
    // Methods for field "stop_code"
    public HS_ChannelisationCode_LCR getStop_code()
    {
	return (HS_ChannelisationCode_LCR)mComponents[1];
    }
    
    public void setStop_code(HS_ChannelisationCode_LCR stop_code)
    {
	mComponents[1] = stop_code;
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
	    "CodeResourceInformation_TDD128"
	),
	new QName (
	    "InformationElements",
	    "CodeResourceInformation-TDD128"
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
		    "start-code",
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
		    "stop-code",
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
     * Get the type descriptor (TypeInfo) of 'this' CodeResourceInformation_TDD128 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' CodeResourceInformation_TDD128 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for CodeResourceInformation_TDD128
