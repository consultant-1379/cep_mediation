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
 * Define the ASN1 Type Event1a_OnSecUlFreq_r9 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class Event1a_OnSecUlFreq_r9 extends Sequence {
    
    /**
     * The default constructor.
     */
    public Event1a_OnSecUlFreq_r9()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public Event1a_OnSecUlFreq_r9(TriggeringCondition2 triggeringCondition, 
		    ReportingRange reportingRange, 
		    ForbiddenAffectCellListOnSecULFreq forbiddenAffectCellListOnSecULFreq, 
		    W w, 
		    ReportDeactivationThreshold reportDeactivationThreshold, 
		    ReportingAmount reportingAmount, 
		    ReportingInterval reportingInterval)
    {
	setTriggeringCondition(triggeringCondition);
	setReportingRange(reportingRange);
	setForbiddenAffectCellListOnSecULFreq(forbiddenAffectCellListOnSecULFreq);
	setW(w);
	setReportDeactivationThreshold(reportDeactivationThreshold);
	setReportingAmount(reportingAmount);
	setReportingInterval(reportingInterval);
    }
    
    /**
     * Construct with required components.
     */
    public Event1a_OnSecUlFreq_r9(TriggeringCondition2 triggeringCondition, 
		    ReportingRange reportingRange, W w, 
		    ReportDeactivationThreshold reportDeactivationThreshold, 
		    ReportingAmount reportingAmount, 
		    ReportingInterval reportingInterval)
    {
	setTriggeringCondition(triggeringCondition);
	setReportingRange(reportingRange);
	setW(w);
	setReportDeactivationThreshold(reportDeactivationThreshold);
	setReportingAmount(reportingAmount);
	setReportingInterval(reportingInterval);
    }
    
    public void initComponents()
    {
	mComponents[0] = TriggeringCondition2.activeSetCellsOnly;
	mComponents[1] = new ReportingRange();
	mComponents[2] = new ForbiddenAffectCellListOnSecULFreq();
	mComponents[3] = new W();
	mComponents[4] = ReportDeactivationThreshold.notApplicable;
	mComponents[5] = ReportingAmount.ra1;
	mComponents[6] = ReportingInterval.noPeriodicalreporting;
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[7];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return TriggeringCondition2.activeSetCellsOnly;
	    case 1:
		return new ReportingRange();
	    case 2:
		return new ForbiddenAffectCellListOnSecULFreq();
	    case 3:
		return new W();
	    case 4:
		return ReportDeactivationThreshold.notApplicable;
	    case 5:
		return ReportingAmount.ra1;
	    case 6:
		return ReportingInterval.noPeriodicalreporting;
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "triggeringCondition"
    public TriggeringCondition2 getTriggeringCondition()
    {
	return (TriggeringCondition2)mComponents[0];
    }
    
    public void setTriggeringCondition(TriggeringCondition2 triggeringCondition)
    {
	mComponents[0] = triggeringCondition;
    }
    
    
    // Methods for field "reportingRange"
    public ReportingRange getReportingRange()
    {
	return (ReportingRange)mComponents[1];
    }
    
    public void setReportingRange(ReportingRange reportingRange)
    {
	mComponents[1] = reportingRange;
    }
    
    
    // Methods for field "forbiddenAffectCellListOnSecULFreq"
    public ForbiddenAffectCellListOnSecULFreq getForbiddenAffectCellListOnSecULFreq()
    {
	return (ForbiddenAffectCellListOnSecULFreq)mComponents[2];
    }
    
    public void setForbiddenAffectCellListOnSecULFreq(ForbiddenAffectCellListOnSecULFreq forbiddenAffectCellListOnSecULFreq)
    {
	mComponents[2] = forbiddenAffectCellListOnSecULFreq;
    }
    
    public boolean hasForbiddenAffectCellListOnSecULFreq()
    {
	return componentIsPresent(2);
    }
    
    public void deleteForbiddenAffectCellListOnSecULFreq()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "w"
    public W getW()
    {
	return (W)mComponents[3];
    }
    
    public void setW(W w)
    {
	mComponents[3] = w;
    }
    
    
    // Methods for field "reportDeactivationThreshold"
    public ReportDeactivationThreshold getReportDeactivationThreshold()
    {
	return (ReportDeactivationThreshold)mComponents[4];
    }
    
    public void setReportDeactivationThreshold(ReportDeactivationThreshold reportDeactivationThreshold)
    {
	mComponents[4] = reportDeactivationThreshold;
    }
    
    
    // Methods for field "reportingAmount"
    public ReportingAmount getReportingAmount()
    {
	return (ReportingAmount)mComponents[5];
    }
    
    public void setReportingAmount(ReportingAmount reportingAmount)
    {
	mComponents[5] = reportingAmount;
    }
    
    
    // Methods for field "reportingInterval"
    public ReportingInterval getReportingInterval()
    {
	return (ReportingInterval)mComponents[6];
    }
    
    public void setReportingInterval(ReportingInterval reportingInterval)
    {
	mComponents[6] = reportingInterval;
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
	    "Event1a_OnSecUlFreq_r9"
	),
	new QName (
	    "InformationElements",
	    "Event1a-OnSecUlFreq-r9"
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
				"TriggeringCondition2"
			    ),
			    new QName (
				"InformationElements",
				"TriggeringCondition2"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"activeSetCellsOnly",
					0
				    ),
				    new MemberListElement (
					"monitoredSetCellsOnly",
					1
				    ),
				    new MemberListElement (
					"activeSetAndMonitoredSetCells",
					2
				    ),
				    new MemberListElement (
					"detectedSetCellsOnly",
					3
				    ),
				    new MemberListElement (
					"detectedSetAndMonitoredSetCells",
					4
				    )
				}
			    ),
			    0,
			    TriggeringCondition2.activeSetCellsOnly
			)
		    ),
		    "triggeringCondition",
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
				"ReportingRange"
			    ),
			    new QName (
				"InformationElements",
				"ReportingRange"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new ReportingRange(0), 
				    new ReportingRange(29),
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
		    "reportingRange",
		    1,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"ForbiddenAffectCellListOnSecULFreq"
			    ),
			    new QName (
				"InformationElements",
				"ForbiddenAffectCellListOnSecULFreq"
			    ),
			    12314,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new com.oss.asn1.INTEGER(1), 
					new com.oss.asn1.INTEGER(32),
					0
				    )
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(32)
			    ),
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "ForbiddenAffectCellOnSecULFreq"
				)
			    )
			)
		    ),
		    "forbiddenAffectCellListOnSecULFreq",
		    2,
		    3,
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
		    "w",
		    3,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8004
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"ReportDeactivationThreshold"
			    ),
			    new QName (
				"InformationElements",
				"ReportDeactivationThreshold"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"notApplicable",
					0
				    ),
				    new MemberListElement (
					"t1",
					1
				    ),
				    new MemberListElement (
					"t2",
					2
				    ),
				    new MemberListElement (
					"t3",
					3
				    ),
				    new MemberListElement (
					"t4",
					4
				    ),
				    new MemberListElement (
					"t5",
					5
				    ),
				    new MemberListElement (
					"t6",
					6
				    ),
				    new MemberListElement (
					"t7",
					7
				    )
				}
			    ),
			    0,
			    ReportDeactivationThreshold.notApplicable
			)
		    ),
		    "reportDeactivationThreshold",
		    4,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8005
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"ReportingAmount"
			    ),
			    new QName (
				"InformationElements",
				"ReportingAmount"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"ra1",
					0
				    ),
				    new MemberListElement (
					"ra2",
					1
				    ),
				    new MemberListElement (
					"ra4",
					2
				    ),
				    new MemberListElement (
					"ra8",
					3
				    ),
				    new MemberListElement (
					"ra16",
					4
				    ),
				    new MemberListElement (
					"ra32",
					5
				    ),
				    new MemberListElement (
					"ra64",
					6
				    ),
				    new MemberListElement (
					"ra-Infinity",
					7
				    )
				}
			    ),
			    0,
			    ReportingAmount.ra1
			)
		    ),
		    "reportingAmount",
		    5,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8006
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"ReportingInterval"
			    ),
			    new QName (
				"InformationElements",
				"ReportingInterval"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"noPeriodicalreporting",
					0
				    ),
				    new MemberListElement (
					"ri0-25",
					1
				    ),
				    new MemberListElement (
					"ri0-5",
					2
				    ),
				    new MemberListElement (
					"ri1",
					3
				    ),
				    new MemberListElement (
					"ri2",
					4
				    ),
				    new MemberListElement (
					"ri4",
					5
				    ),
				    new MemberListElement (
					"ri8",
					6
				    ),
				    new MemberListElement (
					"ri16",
					7
				    )
				}
			    ),
			    0,
			    ReportingInterval.noPeriodicalreporting
			)
		    ),
		    "reportingInterval",
		    6,
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
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8003, 3)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8004, 4)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8005, 5)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8006, 6)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' Event1a_OnSecUlFreq_r9 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' Event1a_OnSecUlFreq_r9 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for Event1a_OnSecUlFreq_r9
