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
 * Define the ASN1 Type IntraFreqMeasurementSysInfo_HCS_ECN0_LCR_r4 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class IntraFreqMeasurementSysInfo_HCS_ECN0_LCR_r4 extends Sequence {
    
    /**
     * The default constructor.
     */
    public IntraFreqMeasurementSysInfo_HCS_ECN0_LCR_r4()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public IntraFreqMeasurementSysInfo_HCS_ECN0_LCR_r4(MeasurementIdentity intraFreqMeasurementID, 
		    IntraFreqCellInfoSI_List_HCS_ECN0_LCR_r4 intraFreqCellInfoSI_List, 
		    IntraFreqMeasQuantity intraFreqMeasQuantity, 
		    IntraFreqReportingQuantityForRACH intraFreqReportingQuantityForRACH, 
		    MaxReportedCellsOnRACH maxReportedCellsOnRACH, 
		    ReportingInfoForCellDCH_LCR_r4 reportingInfoForCellDCH)
    {
	setIntraFreqMeasurementID(intraFreqMeasurementID);
	setIntraFreqCellInfoSI_List(intraFreqCellInfoSI_List);
	setIntraFreqMeasQuantity(intraFreqMeasQuantity);
	setIntraFreqReportingQuantityForRACH(intraFreqReportingQuantityForRACH);
	setMaxReportedCellsOnRACH(maxReportedCellsOnRACH);
	setReportingInfoForCellDCH(reportingInfoForCellDCH);
    }
    
    public void initComponents()
    {
	mComponents[0] = new MeasurementIdentity();
	mComponents[1] = new IntraFreqCellInfoSI_List_HCS_ECN0_LCR_r4();
	mComponents[2] = new IntraFreqMeasQuantity();
	mComponents[3] = new IntraFreqReportingQuantityForRACH();
	mComponents[4] = MaxReportedCellsOnRACH.noReport;
	mComponents[5] = new ReportingInfoForCellDCH_LCR_r4();
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
		return new MeasurementIdentity();
	    case 1:
		return new IntraFreqCellInfoSI_List_HCS_ECN0_LCR_r4();
	    case 2:
		return new IntraFreqMeasQuantity();
	    case 3:
		return new IntraFreqReportingQuantityForRACH();
	    case 4:
		return MaxReportedCellsOnRACH.noReport;
	    case 5:
		return new ReportingInfoForCellDCH_LCR_r4();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    // Default Values
    public static final MeasurementIdentity intraFreqMeasurementID__default = 
	new MeasurementIdentity(1);
    
    // Methods for field "intraFreqMeasurementID"
    public MeasurementIdentity getIntraFreqMeasurementID()
    {
	if (hasIntraFreqMeasurementID())
	    return (MeasurementIdentity)mComponents[0];
	else
	    return (MeasurementIdentity)intraFreqMeasurementID__default.clone();
    }
    
    public void setIntraFreqMeasurementID(MeasurementIdentity intraFreqMeasurementID)
    {
	mComponents[0] = intraFreqMeasurementID;
    }
    
    public void setIntraFreqMeasurementIDToDefault()
    {
	setIntraFreqMeasurementID(intraFreqMeasurementID__default);
    }
    
    public boolean hasDefaultIntraFreqMeasurementID()
    {
	return true;
    }
    
    public boolean hasIntraFreqMeasurementID()
    {
	return componentIsPresent(0);
    }
    
    public void deleteIntraFreqMeasurementID()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "intraFreqCellInfoSI_List"
    public IntraFreqCellInfoSI_List_HCS_ECN0_LCR_r4 getIntraFreqCellInfoSI_List()
    {
	return (IntraFreqCellInfoSI_List_HCS_ECN0_LCR_r4)mComponents[1];
    }
    
    public void setIntraFreqCellInfoSI_List(IntraFreqCellInfoSI_List_HCS_ECN0_LCR_r4 intraFreqCellInfoSI_List)
    {
	mComponents[1] = intraFreqCellInfoSI_List;
    }
    
    public boolean hasIntraFreqCellInfoSI_List()
    {
	return componentIsPresent(1);
    }
    
    public void deleteIntraFreqCellInfoSI_List()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "intraFreqMeasQuantity"
    public IntraFreqMeasQuantity getIntraFreqMeasQuantity()
    {
	return (IntraFreqMeasQuantity)mComponents[2];
    }
    
    public void setIntraFreqMeasQuantity(IntraFreqMeasQuantity intraFreqMeasQuantity)
    {
	mComponents[2] = intraFreqMeasQuantity;
    }
    
    public boolean hasIntraFreqMeasQuantity()
    {
	return componentIsPresent(2);
    }
    
    public void deleteIntraFreqMeasQuantity()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "intraFreqReportingQuantityForRACH"
    public IntraFreqReportingQuantityForRACH getIntraFreqReportingQuantityForRACH()
    {
	return (IntraFreqReportingQuantityForRACH)mComponents[3];
    }
    
    public void setIntraFreqReportingQuantityForRACH(IntraFreqReportingQuantityForRACH intraFreqReportingQuantityForRACH)
    {
	mComponents[3] = intraFreqReportingQuantityForRACH;
    }
    
    public boolean hasIntraFreqReportingQuantityForRACH()
    {
	return componentIsPresent(3);
    }
    
    public void deleteIntraFreqReportingQuantityForRACH()
    {
	setComponentAbsent(3);
    }
    
    
    // Methods for field "maxReportedCellsOnRACH"
    public MaxReportedCellsOnRACH getMaxReportedCellsOnRACH()
    {
	return (MaxReportedCellsOnRACH)mComponents[4];
    }
    
    public void setMaxReportedCellsOnRACH(MaxReportedCellsOnRACH maxReportedCellsOnRACH)
    {
	mComponents[4] = maxReportedCellsOnRACH;
    }
    
    public boolean hasMaxReportedCellsOnRACH()
    {
	return componentIsPresent(4);
    }
    
    public void deleteMaxReportedCellsOnRACH()
    {
	setComponentAbsent(4);
    }
    
    
    // Methods for field "reportingInfoForCellDCH"
    public ReportingInfoForCellDCH_LCR_r4 getReportingInfoForCellDCH()
    {
	return (ReportingInfoForCellDCH_LCR_r4)mComponents[5];
    }
    
    public void setReportingInfoForCellDCH(ReportingInfoForCellDCH_LCR_r4 reportingInfoForCellDCH)
    {
	mComponents[5] = reportingInfoForCellDCH;
    }
    
    public boolean hasReportingInfoForCellDCH()
    {
	return componentIsPresent(5);
    }
    
    public void deleteReportingInfoForCellDCH()
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
	    "IntraFreqMeasurementSysInfo_HCS_ECN0_LCR_r4"
	),
	new QName (
	    "InformationElements",
	    "IntraFreqMeasurementSysInfo-HCS-ECN0-LCR-r4"
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
				"MeasurementIdentity"
			    ),
			    new QName (
				"InformationElements",
				"MeasurementIdentity"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new MeasurementIdentity(1), 
				    new MeasurementIdentity(16),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(16)
			    ),
			    null
			)
		    ),
		    "intraFreqMeasurementID",
		    0,
		    3,
		    intraFreqMeasurementID__default
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"IntraFreqCellInfoSI_List_HCS_ECN0_LCR_r4"
			    ),
			    new QName (
				"InformationElements",
				"IntraFreqCellInfoSI-List-HCS-ECN0-LCR-r4"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "IntraFreqCellInfoSI_List_HCS_ECN0_LCR_r4"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "IntraFreqCellInfoSI_List_HCS_ECN0_LCR_r4"
				)
			    ),
			    0
			)
		    ),
		    "intraFreqCellInfoSI-List",
		    1,
		    3,
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
				"IntraFreqMeasQuantity"
			    ),
			    new QName (
				"InformationElements",
				"IntraFreqMeasQuantity"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "IntraFreqMeasQuantity"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "IntraFreqMeasQuantity"
				)
			    ),
			    0
			)
		    ),
		    "intraFreqMeasQuantity",
		    2,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"IntraFreqReportingQuantityForRACH"
			    ),
			    new QName (
				"InformationElements",
				"IntraFreqReportingQuantityForRACH"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "IntraFreqReportingQuantityForRACH"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "IntraFreqReportingQuantityForRACH"
				)
			    ),
			    0
			)
		    ),
		    "intraFreqReportingQuantityForRACH",
		    3,
		    3,
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
				"MaxReportedCellsOnRACH"
			    ),
			    new QName (
				"InformationElements",
				"MaxReportedCellsOnRACH"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"noReport",
					0
				    ),
				    new MemberListElement (
					"currentCell",
					1
				    ),
				    new MemberListElement (
					"currentAnd-1-BestNeighbour",
					2
				    ),
				    new MemberListElement (
					"currentAnd-2-BestNeighbour",
					3
				    ),
				    new MemberListElement (
					"currentAnd-3-BestNeighbour",
					4
				    ),
				    new MemberListElement (
					"currentAnd-4-BestNeighbour",
					5
				    ),
				    new MemberListElement (
					"currentAnd-5-BestNeighbour",
					6
				    ),
				    new MemberListElement (
					"currentAnd-6-BestNeighbour",
					7
				    )
				}
			    ),
			    0,
			    MaxReportedCellsOnRACH.noReport
			)
		    ),
		    "maxReportedCellsOnRACH",
		    4,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8005
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"ReportingInfoForCellDCH_LCR_r4"
			    ),
			    new QName (
				"InformationElements",
				"ReportingInfoForCellDCH-LCR-r4"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "ReportingInfoForCellDCH_LCR_r4"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "ReportingInfoForCellDCH_LCR_r4"
				)
			    ),
			    0
			)
		    ),
		    "reportingInfoForCellDCH",
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
			new TagDecoderElement((short)0x8000, 0),
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5)
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
     * Get the type descriptor (TypeInfo) of 'this' IntraFreqMeasurementSysInfo_HCS_ECN0_LCR_r4 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' IntraFreqMeasurementSysInfo_HCS_ECN0_LCR_r4 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for IntraFreqMeasurementSysInfo_HCS_ECN0_LCR_r4
