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
 * Define the ASN1 Type UE_Positioning_EventParam_r7 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class UE_Positioning_EventParam_r7 extends Sequence {
    
    /**
     * The default constructor.
     */
    public UE_Positioning_EventParam_r7()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public UE_Positioning_EventParam_r7(ReportingAmount reportingAmount, 
		    BOOLEAN reportFirstFix, 
		    UE_Positioning_MeasurementInterval measurementInterval, 
		    UE_Positioning_EventSpecificInfo_r7 eventSpecificInfo)
    {
	setReportingAmount(reportingAmount);
	setReportFirstFix(reportFirstFix);
	setMeasurementInterval(measurementInterval);
	setEventSpecificInfo(eventSpecificInfo);
    }
    
    /**
     * Construct with components.
     */
    public UE_Positioning_EventParam_r7(ReportingAmount reportingAmount, 
		    boolean reportFirstFix, 
		    UE_Positioning_MeasurementInterval measurementInterval, 
		    UE_Positioning_EventSpecificInfo_r7 eventSpecificInfo)
    {
	this(reportingAmount, new BOOLEAN(reportFirstFix), 
	     measurementInterval, eventSpecificInfo);
    }
    
    public void initComponents()
    {
	mComponents[0] = ReportingAmount.ra1;
	mComponents[1] = new BOOLEAN();
	mComponents[2] = UE_Positioning_MeasurementInterval.e5;
	mComponents[3] = new UE_Positioning_EventSpecificInfo_r7();
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
		return ReportingAmount.ra1;
	    case 1:
		return new BOOLEAN();
	    case 2:
		return UE_Positioning_MeasurementInterval.e5;
	    case 3:
		return new UE_Positioning_EventSpecificInfo_r7();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "reportingAmount"
    public ReportingAmount getReportingAmount()
    {
	return (ReportingAmount)mComponents[0];
    }
    
    public void setReportingAmount(ReportingAmount reportingAmount)
    {
	mComponents[0] = reportingAmount;
    }
    
    
    // Methods for field "reportFirstFix"
    public boolean getReportFirstFix()
    {
	return ((BOOLEAN)mComponents[1]).booleanValue();
    }
    
    public void setReportFirstFix(boolean reportFirstFix)
    {
	setReportFirstFix(new BOOLEAN(reportFirstFix));
    }
    
    public void setReportFirstFix(BOOLEAN reportFirstFix)
    {
	mComponents[1] = reportFirstFix;
    }
    
    
    // Methods for field "measurementInterval"
    public UE_Positioning_MeasurementInterval getMeasurementInterval()
    {
	return (UE_Positioning_MeasurementInterval)mComponents[2];
    }
    
    public void setMeasurementInterval(UE_Positioning_MeasurementInterval measurementInterval)
    {
	mComponents[2] = measurementInterval;
    }
    
    
    // Methods for field "eventSpecificInfo"
    public UE_Positioning_EventSpecificInfo_r7 getEventSpecificInfo()
    {
	return (UE_Positioning_EventSpecificInfo_r7)mComponents[3];
    }
    
    public void setEventSpecificInfo(UE_Positioning_EventSpecificInfo_r7 eventSpecificInfo)
    {
	mComponents[3] = eventSpecificInfo;
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
	    "UE_Positioning_EventParam_r7"
	),
	new QName (
	    "InformationElements",
	    "UE-Positioning-EventParam-r7"
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
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"BOOLEAN"
			    ),
			    new QName (
				"builtin",
				"BOOLEAN"
			    ),
			    12314,
			    null
			)
		    ),
		    "reportFirstFix",
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
				"UE_Positioning_MeasurementInterval"
			    ),
			    new QName (
				"InformationElements",
				"UE-Positioning-MeasurementInterval"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"e5",
					0
				    ),
				    new MemberListElement (
					"e15",
					1
				    ),
				    new MemberListElement (
					"e60",
					2
				    ),
				    new MemberListElement (
					"e300",
					3
				    ),
				    new MemberListElement (
					"e900",
					4
				    ),
				    new MemberListElement (
					"e1800",
					5
				    ),
				    new MemberListElement (
					"e3600",
					6
				    ),
				    new MemberListElement (
					"e7200",
					7
				    )
				}
			    ),
			    0,
			    UE_Positioning_MeasurementInterval.e5
			)
		    ),
		    "measurementInterval",
		    2,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"UE_Positioning_EventSpecificInfo_r7"
			    ),
			    new QName (
				"InformationElements",
				"UE-Positioning-EventSpecificInfo-r7"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_EventSpecificInfo_r7"
				)
			    ),
			    0,
			    new TagDecoder (
				new TagDecoderElement[] {
				    new TagDecoderElement((short)0x8000, 0),
				    new TagDecoderElement((short)0x8001, 1),
				    new TagDecoderElement((short)0x8002, 2),
				    new TagDecoderElement((short)0x8003, 3)
				}
			    )
			)
		    ),
		    "eventSpecificInfo",
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
     * Get the type descriptor (TypeInfo) of 'this' UE_Positioning_EventParam_r7 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UE_Positioning_EventParam_r7 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UE_Positioning_EventParam_r7
