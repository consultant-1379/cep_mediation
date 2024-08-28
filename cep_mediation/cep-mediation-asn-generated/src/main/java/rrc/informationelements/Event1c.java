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
 * Define the ASN1 Type Event1c from ASN1 Module InformationElements.
 * @see Sequence
 */

public class Event1c extends Sequence {
    
    /**
     * The default constructor.
     */
    public Event1c()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public Event1c(ReplacementActivationThreshold replacementActivationThreshold, 
		    ReportingAmount reportingAmount, 
		    ReportingInterval reportingInterval)
    {
	setReplacementActivationThreshold(replacementActivationThreshold);
	setReportingAmount(reportingAmount);
	setReportingInterval(reportingInterval);
    }
    
    public void initComponents()
    {
	mComponents[0] = ReplacementActivationThreshold.notApplicable;
	mComponents[1] = ReportingAmount.ra1;
	mComponents[2] = ReportingInterval.noPeriodicalreporting;
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
		return ReplacementActivationThreshold.notApplicable;
	    case 1:
		return ReportingAmount.ra1;
	    case 2:
		return ReportingInterval.noPeriodicalreporting;
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "replacementActivationThreshold"
    public ReplacementActivationThreshold getReplacementActivationThreshold()
    {
	return (ReplacementActivationThreshold)mComponents[0];
    }
    
    public void setReplacementActivationThreshold(ReplacementActivationThreshold replacementActivationThreshold)
    {
	mComponents[0] = replacementActivationThreshold;
    }
    
    
    // Methods for field "reportingAmount"
    public ReportingAmount getReportingAmount()
    {
	return (ReportingAmount)mComponents[1];
    }
    
    public void setReportingAmount(ReportingAmount reportingAmount)
    {
	mComponents[1] = reportingAmount;
    }
    
    
    // Methods for field "reportingInterval"
    public ReportingInterval getReportingInterval()
    {
	return (ReportingInterval)mComponents[2];
    }
    
    public void setReportingInterval(ReportingInterval reportingInterval)
    {
	mComponents[2] = reportingInterval;
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
	    "Event1c"
	),
	new QName (
	    "InformationElements",
	    "Event1c"
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
				"ReplacementActivationThreshold"
			    ),
			    new QName (
				"InformationElements",
				"ReplacementActivationThreshold"
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
			    ReplacementActivationThreshold.notApplicable
			)
		    ),
		    "replacementActivationThreshold",
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
     * Get the type descriptor (TypeInfo) of 'this' Event1c object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' Event1c object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for Event1c
