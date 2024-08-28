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
 * Define the ASN1 Type PeriodicalReportingCriteria from ASN1 Module InformationElements.
 * @see Sequence
 */

public class PeriodicalReportingCriteria extends Sequence {
    
    /**
     * The default constructor.
     */
    public PeriodicalReportingCriteria()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public PeriodicalReportingCriteria(ReportingAmount reportingAmount, 
		    ReportingIntervalLong reportingInterval)
    {
	setReportingAmount(reportingAmount);
	setReportingInterval(reportingInterval);
    }
    
    /**
     * Construct with required components.
     */
    public PeriodicalReportingCriteria(ReportingIntervalLong reportingInterval)
    {
	setReportingInterval(reportingInterval);
    }
    
    public void initComponents()
    {
	mComponents[0] = ReportingAmount.ra1;
	mComponents[1] = ReportingIntervalLong.ril0;
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
		return ReportingAmount.ra1;
	    case 1:
		return ReportingIntervalLong.ril0;
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    // Default Values
    public static final ReportingAmount reportingAmount__default = 
	ReportingAmount.ra_Infinity;
    
    // Methods for field "reportingAmount"
    public ReportingAmount getReportingAmount()
    {
	if (hasReportingAmount())
	    return (ReportingAmount)mComponents[0];
	else
	    return (ReportingAmount)reportingAmount__default.clone();
    }
    
    public void setReportingAmount(ReportingAmount reportingAmount)
    {
	mComponents[0] = reportingAmount;
    }
    
    public void setReportingAmountToDefault()
    {
	setReportingAmount(reportingAmount__default);
    }
    
    public boolean hasDefaultReportingAmount()
    {
	return true;
    }
    
    public boolean hasReportingAmount()
    {
	return componentIsPresent(0);
    }
    
    public void deleteReportingAmount()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "reportingInterval"
    public ReportingIntervalLong getReportingInterval()
    {
	return (ReportingIntervalLong)mComponents[1];
    }
    
    public void setReportingInterval(ReportingIntervalLong reportingInterval)
    {
	mComponents[1] = reportingInterval;
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
	    "PeriodicalReportingCriteria"
	),
	new QName (
	    "InformationElements",
	    "PeriodicalReportingCriteria"
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
		    0,
		    3,
		    reportingAmount__default
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
				"ReportingIntervalLong"
			    ),
			    new QName (
				"InformationElements",
				"ReportingIntervalLong"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"ril0",
					0
				    ),
				    new MemberListElement (
					"ril0-25",
					1
				    ),
				    new MemberListElement (
					"ril0-5",
					2
				    ),
				    new MemberListElement (
					"ril1",
					3
				    ),
				    new MemberListElement (
					"ril2",
					4
				    ),
				    new MemberListElement (
					"ril3",
					5
				    ),
				    new MemberListElement (
					"ril4",
					6
				    ),
				    new MemberListElement (
					"ril6",
					7
				    ),
				    new MemberListElement (
					"ril8",
					8
				    ),
				    new MemberListElement (
					"ril12",
					9
				    ),
				    new MemberListElement (
					"ril16",
					10
				    ),
				    new MemberListElement (
					"ril20",
					11
				    ),
				    new MemberListElement (
					"ril24",
					12
				    ),
				    new MemberListElement (
					"ril28",
					13
				    ),
				    new MemberListElement (
					"ril32",
					14
				    ),
				    new MemberListElement (
					"ril64",
					15
				    )
				}
			    ),
			    0,
			    ReportingIntervalLong.ril0
			)
		    ),
		    "reportingInterval",
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
			new TagDecoderElement((short)0x8000, 0),
			new TagDecoderElement((short)0x8001, 1)
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
     * Get the type descriptor (TypeInfo) of 'this' PeriodicalReportingCriteria object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' PeriodicalReportingCriteria object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for PeriodicalReportingCriteria
