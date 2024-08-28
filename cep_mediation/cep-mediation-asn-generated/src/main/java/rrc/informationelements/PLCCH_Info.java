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
 * Define the ASN1 Type PLCCH_Info from ASN1 Module InformationElements.
 * @see Sequence
 */

public class PLCCH_Info extends Sequence {
    
    /**
     * The default constructor.
     */
    public PLCCH_Info()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public PLCCH_Info(INTEGER plcchSequenceNumber, 
		    TimeslotNumber_LCR_r4 timeslotNumber, 
		    DL_TS_ChannelisationCode channelisationCode, 
		    TPC_CommandTargetRate tpcCommandTargetRate)
    {
	setPlcchSequenceNumber(plcchSequenceNumber);
	setTimeslotNumber(timeslotNumber);
	setChannelisationCode(channelisationCode);
	setTpcCommandTargetRate(tpcCommandTargetRate);
    }
    
    /**
     * Construct with components.
     */
    public PLCCH_Info(long plcchSequenceNumber, 
		    TimeslotNumber_LCR_r4 timeslotNumber, 
		    DL_TS_ChannelisationCode channelisationCode, 
		    TPC_CommandTargetRate tpcCommandTargetRate)
    {
	this(new INTEGER(plcchSequenceNumber), timeslotNumber, 
	     channelisationCode, tpcCommandTargetRate);
    }
    
    public void initComponents()
    {
	mComponents[0] = new INTEGER();
	mComponents[1] = new TimeslotNumber_LCR_r4();
	mComponents[2] = DL_TS_ChannelisationCode.cc16_1;
	mComponents[3] = new TPC_CommandTargetRate();
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
		return new INTEGER();
	    case 1:
		return new TimeslotNumber_LCR_r4();
	    case 2:
		return DL_TS_ChannelisationCode.cc16_1;
	    case 3:
		return new TPC_CommandTargetRate();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "plcchSequenceNumber"
    public long getPlcchSequenceNumber()
    {
	return ((INTEGER)mComponents[0]).longValue();
    }
    
    public void setPlcchSequenceNumber(long plcchSequenceNumber)
    {
	setPlcchSequenceNumber(new INTEGER(plcchSequenceNumber));
    }
    
    public void setPlcchSequenceNumber(INTEGER plcchSequenceNumber)
    {
	mComponents[0] = plcchSequenceNumber;
    }
    
    
    // Methods for field "timeslotNumber"
    public TimeslotNumber_LCR_r4 getTimeslotNumber()
    {
	return (TimeslotNumber_LCR_r4)mComponents[1];
    }
    
    public void setTimeslotNumber(TimeslotNumber_LCR_r4 timeslotNumber)
    {
	mComponents[1] = timeslotNumber;
    }
    
    
    // Methods for field "channelisationCode"
    public DL_TS_ChannelisationCode getChannelisationCode()
    {
	return (DL_TS_ChannelisationCode)mComponents[2];
    }
    
    public void setChannelisationCode(DL_TS_ChannelisationCode channelisationCode)
    {
	mComponents[2] = channelisationCode;
    }
    
    
    // Methods for field "tpcCommandTargetRate"
    public TPC_CommandTargetRate getTpcCommandTargetRate()
    {
	return (TPC_CommandTargetRate)mComponents[3];
    }
    
    public void setTpcCommandTargetRate(TPC_CommandTargetRate tpcCommandTargetRate)
    {
	mComponents[3] = tpcCommandTargetRate;
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
	    "PLCCH_Info"
	),
	new QName (
	    "InformationElements",
	    "PLCCH-Info"
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
				    new com.oss.asn1.INTEGER(1), 
				    new com.oss.asn1.INTEGER(14),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(14)
			    ),
			    null
			)
		    ),
		    "plcchSequenceNumber",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
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
		    "timeslotNumber",
		    1,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"DL_TS_ChannelisationCode"
			    ),
			    new QName (
				"InformationElements",
				"DL-TS-ChannelisationCode"
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
			    DL_TS_ChannelisationCode.cc16_1
			)
		    ),
		    "channelisationCode",
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
				"TPC_CommandTargetRate"
			    ),
			    new QName (
				"InformationElements",
				"TPC-CommandTargetRate"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new TPC_CommandTargetRate(0), 
				    new TPC_CommandTargetRate(10),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(10)
			    ),
			    null
			)
		    ),
		    "tpcCommandTargetRate",
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
     * Get the type descriptor (TypeInfo) of 'this' PLCCH_Info object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' PLCCH_Info object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for PLCCH_Info
