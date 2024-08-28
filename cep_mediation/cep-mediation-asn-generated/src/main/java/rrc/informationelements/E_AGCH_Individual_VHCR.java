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
 * Define the ASN1 Type E_AGCH_Individual_VHCR from ASN1 Module InformationElements.
 * @see Sequence
 */

public class E_AGCH_Individual_VHCR extends Sequence {
    
    /**
     * The default constructor.
     */
    public E_AGCH_Individual_VHCR()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public E_AGCH_Individual_VHCR(INTEGER tS_number, 
		    DL_TS_ChannelisationCode_VHCR channelisation_code, 
		    MidambleShiftAndBurstType_EDCH midambleShiftAndBurstType)
    {
	setTS_number(tS_number);
	setChannelisation_code(channelisation_code);
	setMidambleShiftAndBurstType(midambleShiftAndBurstType);
    }
    
    /**
     * Construct with components.
     */
    public E_AGCH_Individual_VHCR(long tS_number, 
		    DL_TS_ChannelisationCode_VHCR channelisation_code, 
		    MidambleShiftAndBurstType_EDCH midambleShiftAndBurstType)
    {
	this(new INTEGER(tS_number), channelisation_code, 
	     midambleShiftAndBurstType);
    }
    
    public void initComponents()
    {
	mComponents[0] = new INTEGER();
	mComponents[1] = DL_TS_ChannelisationCode_VHCR.cc32_1;
	mComponents[2] = new MidambleShiftAndBurstType_EDCH();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[3];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new INTEGER();
	    case 1:
		return DL_TS_ChannelisationCode_VHCR.cc32_1;
	    case 2:
		return new MidambleShiftAndBurstType_EDCH();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "tS_number"
    public long getTS_number()
    {
	return ((INTEGER)mComponents[0]).longValue();
    }
    
    public void setTS_number(long tS_number)
    {
	setTS_number(new INTEGER(tS_number));
    }
    
    public void setTS_number(INTEGER tS_number)
    {
	mComponents[0] = tS_number;
    }
    
    
    // Methods for field "channelisation_code"
    public DL_TS_ChannelisationCode_VHCR getChannelisation_code()
    {
	return (DL_TS_ChannelisationCode_VHCR)mComponents[1];
    }
    
    public void setChannelisation_code(DL_TS_ChannelisationCode_VHCR channelisation_code)
    {
	mComponents[1] = channelisation_code;
    }
    
    
    // Methods for field "midambleShiftAndBurstType"
    public MidambleShiftAndBurstType_EDCH getMidambleShiftAndBurstType()
    {
	return (MidambleShiftAndBurstType_EDCH)mComponents[2];
    }
    
    public void setMidambleShiftAndBurstType(MidambleShiftAndBurstType_EDCH midambleShiftAndBurstType)
    {
	mComponents[2] = midambleShiftAndBurstType;
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
	    "E_AGCH_Individual_VHCR"
	),
	new QName (
	    "InformationElements",
	    "E-AGCH-Individual-VHCR"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"INTEGER"
			    ),
			    new QName (
				"builtin",
				"INTEGER"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new com.oss.asn1.INTEGER(0), 
				    new com.oss.asn1.INTEGER(14),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(14)
			    ),
			    null
			)
		    ),
		    "tS-number",
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
				"DL_TS_ChannelisationCode_VHCR"
			    ),
			    new QName (
				"InformationElements",
				"DL-TS-ChannelisationCode-VHCR"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"cc32-1",
					0
				    ),
				    new MemberListElement (
					"cc32-2",
					1
				    ),
				    new MemberListElement (
					"cc32-3",
					2
				    ),
				    new MemberListElement (
					"cc32-4",
					3
				    ),
				    new MemberListElement (
					"cc132-5",
					4
				    ),
				    new MemberListElement (
					"cc32-6",
					5
				    ),
				    new MemberListElement (
					"cc32-7",
					6
				    ),
				    new MemberListElement (
					"cc32-8",
					7
				    ),
				    new MemberListElement (
					"cc32-9",
					8
				    ),
				    new MemberListElement (
					"cc32-10",
					9
				    ),
				    new MemberListElement (
					"cc32-11",
					10
				    ),
				    new MemberListElement (
					"cc32-12",
					11
				    ),
				    new MemberListElement (
					"cc32-13",
					12
				    ),
				    new MemberListElement (
					"cc32-14",
					13
				    ),
				    new MemberListElement (
					"cc32-15",
					14
				    ),
				    new MemberListElement (
					"cc32-16",
					15
				    ),
				    new MemberListElement (
					"cc32-17",
					16
				    ),
				    new MemberListElement (
					"cc32-18",
					17
				    ),
				    new MemberListElement (
					"cc32-19",
					18
				    ),
				    new MemberListElement (
					"cc32-20",
					19
				    ),
				    new MemberListElement (
					"cc32-21",
					20
				    ),
				    new MemberListElement (
					"cc32-22",
					21
				    ),
				    new MemberListElement (
					"cc32-23",
					22
				    ),
				    new MemberListElement (
					"cc32-24",
					23
				    ),
				    new MemberListElement (
					"cc32-25",
					24
				    ),
				    new MemberListElement (
					"cc32-26",
					25
				    ),
				    new MemberListElement (
					"cc32-27",
					26
				    ),
				    new MemberListElement (
					"cc32-28",
					27
				    ),
				    new MemberListElement (
					"cc32-29",
					28
				    ),
				    new MemberListElement (
					"cc32-30",
					29
				    ),
				    new MemberListElement (
					"cc32-31",
					30
				    ),
				    new MemberListElement (
					"cc32-32",
					31
				    )
				}
			    ),
			    0,
			    DL_TS_ChannelisationCode_VHCR.cc32_1
			)
		    ),
		    "channelisation-code",
		    1,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"MidambleShiftAndBurstType_EDCH"
			    ),
			    new QName (
				"InformationElements",
				"MidambleShiftAndBurstType-EDCH"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "MidambleShiftAndBurstType_EDCH"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "MidambleShiftAndBurstType_EDCH"
				)
			    ),
			    0
			)
		    ),
		    "midambleShiftAndBurstType",
		    2,
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
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8002, 2)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' E_AGCH_Individual_VHCR object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' E_AGCH_Individual_VHCR object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for E_AGCH_Individual_VHCR
