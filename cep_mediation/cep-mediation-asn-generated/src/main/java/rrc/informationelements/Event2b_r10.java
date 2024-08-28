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
 * Define the ASN1 Type Event2b_r10 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class Event2b_r10 extends Sequence {
    
    /**
     * The default constructor.
     */
    public Event2b_r10()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public Event2b_r10(Threshold_r6 usedFreqThreshold, W usedFreqW, 
		    HysteresisInterFreq hysteresis, 
		    TimeToTrigger timeToTrigger, 
		    ReportingCellStatus_r10 reportingCellStatus, 
		    NonUsedFreqParameterList_r10 nonUsedFreqParameterList)
    {
	setUsedFreqThreshold(usedFreqThreshold);
	setUsedFreqW(usedFreqW);
	setHysteresis(hysteresis);
	setTimeToTrigger(timeToTrigger);
	setReportingCellStatus(reportingCellStatus);
	setNonUsedFreqParameterList(nonUsedFreqParameterList);
    }
    
    /**
     * Construct with required components.
     */
    public Event2b_r10(Threshold_r6 usedFreqThreshold, W usedFreqW, 
		    HysteresisInterFreq hysteresis, 
		    TimeToTrigger timeToTrigger)
    {
	setUsedFreqThreshold(usedFreqThreshold);
	setUsedFreqW(usedFreqW);
	setHysteresis(hysteresis);
	setTimeToTrigger(timeToTrigger);
    }
    
    public void initComponents()
    {
	mComponents[0] = new Threshold_r6();
	mComponents[1] = new W();
	mComponents[2] = new HysteresisInterFreq();
	mComponents[3] = TimeToTrigger.ttt0;
	mComponents[4] = new ReportingCellStatus_r10();
	mComponents[5] = new NonUsedFreqParameterList_r10();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[6];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new Threshold_r6();
	    case 1:
		return new W();
	    case 2:
		return new HysteresisInterFreq();
	    case 3:
		return TimeToTrigger.ttt0;
	    case 4:
		return new ReportingCellStatus_r10();
	    case 5:
		return new NonUsedFreqParameterList_r10();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "usedFreqThreshold"
    public Threshold_r6 getUsedFreqThreshold()
    {
	return (Threshold_r6)mComponents[0];
    }
    
    public void setUsedFreqThreshold(Threshold_r6 usedFreqThreshold)
    {
	mComponents[0] = usedFreqThreshold;
    }
    
    
    // Methods for field "usedFreqW"
    public W getUsedFreqW()
    {
	return (W)mComponents[1];
    }
    
    public void setUsedFreqW(W usedFreqW)
    {
	mComponents[1] = usedFreqW;
    }
    
    
    // Methods for field "hysteresis"
    public HysteresisInterFreq getHysteresis()
    {
	return (HysteresisInterFreq)mComponents[2];
    }
    
    public void setHysteresis(HysteresisInterFreq hysteresis)
    {
	mComponents[2] = hysteresis;
    }
    
    
    // Methods for field "timeToTrigger"
    public TimeToTrigger getTimeToTrigger()
    {
	return (TimeToTrigger)mComponents[3];
    }
    
    public void setTimeToTrigger(TimeToTrigger timeToTrigger)
    {
	mComponents[3] = timeToTrigger;
    }
    
    
    // Methods for field "reportingCellStatus"
    public ReportingCellStatus_r10 getReportingCellStatus()
    {
	return (ReportingCellStatus_r10)mComponents[4];
    }
    
    public void setReportingCellStatus(ReportingCellStatus_r10 reportingCellStatus)
    {
	mComponents[4] = reportingCellStatus;
    }
    
    public boolean hasReportingCellStatus()
    {
	return componentIsPresent(4);
    }
    
    public void deleteReportingCellStatus()
    {
	setComponentAbsent(4);
    }
    
    
    // Methods for field "nonUsedFreqParameterList"
    public NonUsedFreqParameterList_r10 getNonUsedFreqParameterList()
    {
	return (NonUsedFreqParameterList_r10)mComponents[5];
    }
    
    public void setNonUsedFreqParameterList(NonUsedFreqParameterList_r10 nonUsedFreqParameterList)
    {
	mComponents[5] = nonUsedFreqParameterList;
    }
    
    public boolean hasNonUsedFreqParameterList()
    {
	return componentIsPresent(5);
    }
    
    public void deleteNonUsedFreqParameterList()
    {
	setComponentAbsent(5);
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
	    "Event2b_r10"
	),
	new QName (
	    "InformationElements",
	    "Event2b-r10"
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
				"Threshold_r6"
			    ),
			    new QName (
				"InformationElements",
				"Threshold-r6"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new Threshold_r6(-120), 
				    new Threshold_r6(0),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(-120),
				new java.lang.Long(0)
			    ),
			    null
			)
		    ),
		    "usedFreqThreshold",
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
				"W"
			    ),
			    new QName (
				"InformationElements",
				"W"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new W(0), 
				    new W(20),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(20)
			    ),
			    null
			)
		    ),
		    "usedFreqW",
		    1,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"HysteresisInterFreq"
			    ),
			    new QName (
				"InformationElements",
				"HysteresisInterFreq"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new HysteresisInterFreq(0), 
				    new HysteresisInterFreq(29),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(29)
			    ),
			    null
			)
		    ),
		    "hysteresis",
		    2,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"TimeToTrigger"
			    ),
			    new QName (
				"InformationElements",
				"TimeToTrigger"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"ttt0",
					0
				    ),
				    new MemberListElement (
					"ttt10",
					1
				    ),
				    new MemberListElement (
					"ttt20",
					2
				    ),
				    new MemberListElement (
					"ttt40",
					3
				    ),
				    new MemberListElement (
					"ttt60",
					4
				    ),
				    new MemberListElement (
					"ttt80",
					5
				    ),
				    new MemberListElement (
					"ttt100",
					6
				    ),
				    new MemberListElement (
					"ttt120",
					7
				    ),
				    new MemberListElement (
					"ttt160",
					8
				    ),
				    new MemberListElement (
					"ttt200",
					9
				    ),
				    new MemberListElement (
					"ttt240",
					10
				    ),
				    new MemberListElement (
					"tt320",
					11
				    ),
				    new MemberListElement (
					"ttt640",
					12
				    ),
				    new MemberListElement (
					"ttt1280",
					13
				    ),
				    new MemberListElement (
					"ttt2560",
					14
				    ),
				    new MemberListElement (
					"ttt5000",
					15
				    )
				}
			    ),
			    0,
			    TimeToTrigger.ttt0
			)
		    ),
		    "timeToTrigger",
		    3,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x8004
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"ReportingCellStatus_r10"
			    ),
			    new QName (
				"InformationElements",
				"ReportingCellStatus-r10"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "ReportingCellStatus_r10"
				)
			    ),
			    0,
			    new TagDecoder (
				new TagDecoderElement[] {
				    new TagDecoderElement((short)0x8000, 0),
				    new TagDecoderElement((short)0x8001, 1),
				    new TagDecoderElement((short)0x8002, 2),
				    new TagDecoderElement((short)0x8003, 3),
				    new TagDecoderElement((short)0x8004, 4),
				    new TagDecoderElement((short)0x8005, 5),
				    new TagDecoderElement((short)0x8006, 6),
				    new TagDecoderElement((short)0x8007, 7),
				    new TagDecoderElement((short)0x8008, 8),
				    new TagDecoderElement((short)0x8009, 9),
				    new TagDecoderElement((short)0x800a, 10),
				    new TagDecoderElement((short)0x800b, 11),
				    new TagDecoderElement((short)0x800c, 12),
				    new TagDecoderElement((short)0x800d, 13),
				    new TagDecoderElement((short)0x800e, 14)
				}
			    )
			)
		    ),
		    "reportingCellStatus",
		    4,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8005
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"NonUsedFreqParameterList_r10"
			    ),
			    new QName (
				"InformationElements",
				"NonUsedFreqParameterList-r10"
			    ),
			    12314,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new com.oss.asn1.INTEGER(1), 
					new com.oss.asn1.INTEGER(8),
					0
				    )
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(8)
			    ),
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "NonUsedFreqParameter_r10"
				)
			    )
			)
		    ),
		    "nonUsedFreqParameterList",
		    5,
		    3,
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
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8005, 5)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' Event2b_r10 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' Event2b_r10 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for Event2b_r10
