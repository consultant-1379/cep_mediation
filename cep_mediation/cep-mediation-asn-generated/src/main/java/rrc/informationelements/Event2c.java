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
 * Define the ASN1 Type Event2c from ASN1 Module InformationElements.
 * @see Sequence
 */

public class Event2c extends Sequence {
    
    /**
     * The default constructor.
     */
    public Event2c()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public Event2c(HysteresisInterFreq hysteresis, 
		    TimeToTrigger timeToTrigger, 
		    ReportingCellStatus reportingCellStatus, 
		    NonUsedFreqParameterList nonUsedFreqParameterList)
    {
	setHysteresis(hysteresis);
	setTimeToTrigger(timeToTrigger);
	setReportingCellStatus(reportingCellStatus);
	setNonUsedFreqParameterList(nonUsedFreqParameterList);
    }
    
    /**
     * Construct with required components.
     */
    public Event2c(HysteresisInterFreq hysteresis, 
		    TimeToTrigger timeToTrigger)
    {
	setHysteresis(hysteresis);
	setTimeToTrigger(timeToTrigger);
    }
    
    public void initComponents()
    {
	mComponents[0] = new HysteresisInterFreq();
	mComponents[1] = TimeToTrigger.ttt0;
	mComponents[2] = new ReportingCellStatus();
	mComponents[3] = new NonUsedFreqParameterList();
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
		return new HysteresisInterFreq();
	    case 1:
		return TimeToTrigger.ttt0;
	    case 2:
		return new ReportingCellStatus();
	    case 3:
		return new NonUsedFreqParameterList();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "hysteresis"
    public HysteresisInterFreq getHysteresis()
    {
	return (HysteresisInterFreq)mComponents[0];
    }
    
    public void setHysteresis(HysteresisInterFreq hysteresis)
    {
	mComponents[0] = hysteresis;
    }
    
    
    // Methods for field "timeToTrigger"
    public TimeToTrigger getTimeToTrigger()
    {
	return (TimeToTrigger)mComponents[1];
    }
    
    public void setTimeToTrigger(TimeToTrigger timeToTrigger)
    {
	mComponents[1] = timeToTrigger;
    }
    
    
    // Methods for field "reportingCellStatus"
    public ReportingCellStatus getReportingCellStatus()
    {
	return (ReportingCellStatus)mComponents[2];
    }
    
    public void setReportingCellStatus(ReportingCellStatus reportingCellStatus)
    {
	mComponents[2] = reportingCellStatus;
    }
    
    public boolean hasReportingCellStatus()
    {
	return componentIsPresent(2);
    }
    
    public void deleteReportingCellStatus()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "nonUsedFreqParameterList"
    public NonUsedFreqParameterList getNonUsedFreqParameterList()
    {
	return (NonUsedFreqParameterList)mComponents[3];
    }
    
    public void setNonUsedFreqParameterList(NonUsedFreqParameterList nonUsedFreqParameterList)
    {
	mComponents[3] = nonUsedFreqParameterList;
    }
    
    public boolean hasNonUsedFreqParameterList()
    {
	return componentIsPresent(3);
    }
    
    public void deleteNonUsedFreqParameterList()
    {
	setComponentAbsent(3);
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
	    "Event2c"
	),
	new QName (
	    "InformationElements",
	    "Event2c"
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
		    1,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"ReportingCellStatus"
			    ),
			    new QName (
				"InformationElements",
				"ReportingCellStatus"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "ReportingCellStatus"
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
				    new TagDecoderElement((short)0x800d, 13)
				}
			    )
			)
		    ),
		    "reportingCellStatus",
		    2,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"NonUsedFreqParameterList"
			    ),
			    new QName (
				"InformationElements",
				"NonUsedFreqParameterList"
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
				    "NonUsedFreqParameter"
				)
			    )
			)
		    ),
		    "nonUsedFreqParameterList",
		    3,
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
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3)
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
     * Get the type descriptor (TypeInfo) of 'this' Event2c object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' Event2c object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for Event2c
