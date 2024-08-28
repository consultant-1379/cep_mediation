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
 * Define the ASN1 Type FPACH_Info_r4 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class FPACH_Info_r4 extends Sequence {
    
    /**
     * The default constructor.
     */
    public FPACH_Info_r4()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public FPACH_Info_r4(TimeslotNumber_LCR_r4 timeslot, 
		    TDD_FPACH_CCode16_r4 channelisationCode, 
		    MidambleShiftAndBurstType_LCR_r4 midambleShiftAndBurstType, 
		    Wi_LCR wi)
    {
	setTimeslot(timeslot);
	setChannelisationCode(channelisationCode);
	setMidambleShiftAndBurstType(midambleShiftAndBurstType);
	setWi(wi);
    }
    
    public void initComponents()
    {
	mComponents[0] = new TimeslotNumber_LCR_r4();
	mComponents[1] = TDD_FPACH_CCode16_r4.cc16_1;
	mComponents[2] = new MidambleShiftAndBurstType_LCR_r4();
	mComponents[3] = new Wi_LCR();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[4];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new TimeslotNumber_LCR_r4();
	    case 1:
		return TDD_FPACH_CCode16_r4.cc16_1;
	    case 2:
		return new MidambleShiftAndBurstType_LCR_r4();
	    case 3:
		return new Wi_LCR();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "timeslot"
    public TimeslotNumber_LCR_r4 getTimeslot()
    {
	return (TimeslotNumber_LCR_r4)mComponents[0];
    }
    
    public void setTimeslot(TimeslotNumber_LCR_r4 timeslot)
    {
	mComponents[0] = timeslot;
    }
    
    
    // Methods for field "channelisationCode"
    public TDD_FPACH_CCode16_r4 getChannelisationCode()
    {
	return (TDD_FPACH_CCode16_r4)mComponents[1];
    }
    
    public void setChannelisationCode(TDD_FPACH_CCode16_r4 channelisationCode)
    {
	mComponents[1] = channelisationCode;
    }
    
    
    // Methods for field "midambleShiftAndBurstType"
    public MidambleShiftAndBurstType_LCR_r4 getMidambleShiftAndBurstType()
    {
	return (MidambleShiftAndBurstType_LCR_r4)mComponents[2];
    }
    
    public void setMidambleShiftAndBurstType(MidambleShiftAndBurstType_LCR_r4 midambleShiftAndBurstType)
    {
	mComponents[2] = midambleShiftAndBurstType;
    }
    
    
    // Methods for field "wi"
    public Wi_LCR getWi()
    {
	return (Wi_LCR)mComponents[3];
    }
    
    public void setWi(Wi_LCR wi)
    {
	mComponents[3] = wi;
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
	    "FPACH_Info_r4"
	),
	new QName (
	    "InformationElements",
	    "FPACH-Info-r4"
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
				"rrc.informationelements",
				"TimeslotNumber_LCR_r4"
			    ),
			    new QName (
				"InformationElements",
				"TimeslotNumber-LCR-r4"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new TimeslotNumber_LCR_r4(0), 
				    new TimeslotNumber_LCR_r4(6),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(6)
			    ),
			    null
			)
		    ),
		    "timeslot",
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
				"TDD_FPACH_CCode16_r4"
			    ),
			    new QName (
				"InformationElements",
				"TDD-FPACH-CCode16-r4"
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
			    TDD_FPACH_CCode16_r4.cc16_1
			)
		    ),
		    "channelisationCode",
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
				"MidambleShiftAndBurstType_LCR_r4"
			    ),
			    new QName (
				"InformationElements",
				"MidambleShiftAndBurstType-LCR-r4"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "MidambleShiftAndBurstType_LCR_r4"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "MidambleShiftAndBurstType_LCR_r4"
				)
			    ),
			    0
			)
		    ),
		    "midambleShiftAndBurstType",
		    2,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"Wi_LCR"
			    ),
			    new QName (
				"InformationElements",
				"Wi-LCR"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new Wi_LCR(1), 
				    new Wi_LCR(4),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(4)
			    ),
			    null
			)
		    ),
		    "wi",
		    3,
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
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8003, 3)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' FPACH_Info_r4 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' FPACH_Info_r4 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for FPACH_Info_r4
