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
 * Define the ASN1 Type Event1b_r4 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class Event1b_r4 extends Sequence {
    
    /**
     * The default constructor.
     */
    public Event1b_r4()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public Event1b_r4(TriggeringCondition1 triggeringCondition, 
		    ReportingRange reportingRange, 
		    ForbiddenAffectCellList_r4 forbiddenAffectCellList, W w)
    {
	setTriggeringCondition(triggeringCondition);
	setReportingRange(reportingRange);
	setForbiddenAffectCellList(forbiddenAffectCellList);
	setW(w);
    }
    
    /**
     * Construct with required components.
     */
    public Event1b_r4(TriggeringCondition1 triggeringCondition, 
		    ReportingRange reportingRange, W w)
    {
	setTriggeringCondition(triggeringCondition);
	setReportingRange(reportingRange);
	setW(w);
    }
    
    public void initComponents()
    {
	mComponents[0] = TriggeringCondition1.activeSetCellsOnly;
	mComponents[1] = new ReportingRange();
	mComponents[2] = new ForbiddenAffectCellList_r4();
	mComponents[3] = new W();
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
		return TriggeringCondition1.activeSetCellsOnly;
	    case 1:
		return new ReportingRange();
	    case 2:
		return new ForbiddenAffectCellList_r4();
	    case 3:
		return new W();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "triggeringCondition"
    public TriggeringCondition1 getTriggeringCondition()
    {
	return (TriggeringCondition1)mComponents[0];
    }
    
    public void setTriggeringCondition(TriggeringCondition1 triggeringCondition)
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
    
    
    // Methods for field "forbiddenAffectCellList"
    public ForbiddenAffectCellList_r4 getForbiddenAffectCellList()
    {
	return (ForbiddenAffectCellList_r4)mComponents[2];
    }
    
    public void setForbiddenAffectCellList(ForbiddenAffectCellList_r4 forbiddenAffectCellList)
    {
	mComponents[2] = forbiddenAffectCellList;
    }
    
    public boolean hasForbiddenAffectCellList()
    {
	return componentIsPresent(2);
    }
    
    public void deleteForbiddenAffectCellList()
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
	    "Event1b_r4"
	),
	new QName (
	    "InformationElements",
	    "Event1b-r4"
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
				"TriggeringCondition1"
			    ),
			    new QName (
				"InformationElements",
				"TriggeringCondition1"
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
				    )
				}
			    ),
			    0,
			    TriggeringCondition1.activeSetCellsOnly
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
				"ForbiddenAffectCellList_r4"
			    ),
			    new QName (
				"InformationElements",
				"ForbiddenAffectCellList-r4"
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
				    "ForbiddenAffectCell_r4"
				)
			    )
			)
		    ),
		    "forbiddenAffectCellList",
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
     * Get the type descriptor (TypeInfo) of 'this' Event1b_r4 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' Event1b_r4 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for Event1b_r4
