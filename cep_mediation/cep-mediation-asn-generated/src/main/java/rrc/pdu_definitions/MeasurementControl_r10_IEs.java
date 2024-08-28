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


package rrc.pdu_definitions;

import com.oss.asn1.*;
import com.oss.metadata.*;
import rrc.*;

/**
 * Define the ASN1 Type MeasurementControl_r10_IEs from ASN1 Module PDU_definitions.
 * @see Sequence
 */

public class MeasurementControl_r10_IEs extends Sequence {
    
    /**
     * The default constructor.
     */
    public MeasurementControl_r10_IEs()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public MeasurementControl_r10_IEs(rrc.informationelements.MeasurementIdentity measurementIdentity, 
		    rrc.informationelements.MeasurementCommand_r10 measurementCommand, 
		    rrc.informationelements.MeasurementReportingMode measurementReportingMode, 
		    rrc.informationelements.AdditionalMeasurementID_List additionalMeasurementList, 
		    rrc.informationelements.CellDCHMeasOccasionInfo_TDD128_r9 cellDCHMeasOccasionInfo_TDD128, 
		    rrc.informationelements.DPCH_CompressedModeStatusInfo_r10 dpch_CompressedModeStatusInfo)
    {
	setMeasurementIdentity(measurementIdentity);
	setMeasurementCommand(measurementCommand);
	setMeasurementReportingMode(measurementReportingMode);
	setAdditionalMeasurementList(additionalMeasurementList);
	setCellDCHMeasOccasionInfo_TDD128(cellDCHMeasOccasionInfo_TDD128);
	setDpch_CompressedModeStatusInfo(dpch_CompressedModeStatusInfo);
    }
    
    /**
     * Construct with required components.
     */
    public MeasurementControl_r10_IEs(rrc.informationelements.MeasurementIdentity measurementIdentity, 
		    rrc.informationelements.MeasurementCommand_r10 measurementCommand)
    {
	setMeasurementIdentity(measurementIdentity);
	setMeasurementCommand(measurementCommand);
    }
    
    public void initComponents()
    {
	mComponents[0] = new rrc.informationelements.MeasurementIdentity();
	mComponents[1] = new rrc.informationelements.MeasurementCommand_r10();
	mComponents[2] = new rrc.informationelements.MeasurementReportingMode();
	mComponents[3] = new rrc.informationelements.AdditionalMeasurementID_List();
	mComponents[4] = new rrc.informationelements.CellDCHMeasOccasionInfo_TDD128_r9();
	mComponents[5] = new rrc.informationelements.DPCH_CompressedModeStatusInfo_r10();
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
		return new rrc.informationelements.MeasurementIdentity();
	    case 1:
		return new rrc.informationelements.MeasurementCommand_r10();
	    case 2:
		return new rrc.informationelements.MeasurementReportingMode();
	    case 3:
		return new rrc.informationelements.AdditionalMeasurementID_List();
	    case 4:
		return new rrc.informationelements.CellDCHMeasOccasionInfo_TDD128_r9();
	    case 5:
		return new rrc.informationelements.DPCH_CompressedModeStatusInfo_r10();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "measurementIdentity"
    public rrc.informationelements.MeasurementIdentity getMeasurementIdentity()
    {
	return (rrc.informationelements.MeasurementIdentity)mComponents[0];
    }
    
    public void setMeasurementIdentity(rrc.informationelements.MeasurementIdentity measurementIdentity)
    {
	mComponents[0] = measurementIdentity;
    }
    
    
    // Methods for field "measurementCommand"
    public rrc.informationelements.MeasurementCommand_r10 getMeasurementCommand()
    {
	return (rrc.informationelements.MeasurementCommand_r10)mComponents[1];
    }
    
    public void setMeasurementCommand(rrc.informationelements.MeasurementCommand_r10 measurementCommand)
    {
	mComponents[1] = measurementCommand;
    }
    
    
    // Methods for field "measurementReportingMode"
    public rrc.informationelements.MeasurementReportingMode getMeasurementReportingMode()
    {
	return (rrc.informationelements.MeasurementReportingMode)mComponents[2];
    }
    
    public void setMeasurementReportingMode(rrc.informationelements.MeasurementReportingMode measurementReportingMode)
    {
	mComponents[2] = measurementReportingMode;
    }
    
    public boolean hasMeasurementReportingMode()
    {
	return componentIsPresent(2);
    }
    
    public void deleteMeasurementReportingMode()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "additionalMeasurementList"
    public rrc.informationelements.AdditionalMeasurementID_List getAdditionalMeasurementList()
    {
	return (rrc.informationelements.AdditionalMeasurementID_List)mComponents[3];
    }
    
    public void setAdditionalMeasurementList(rrc.informationelements.AdditionalMeasurementID_List additionalMeasurementList)
    {
	mComponents[3] = additionalMeasurementList;
    }
    
    public boolean hasAdditionalMeasurementList()
    {
	return componentIsPresent(3);
    }
    
    public void deleteAdditionalMeasurementList()
    {
	setComponentAbsent(3);
    }
    
    
    // Methods for field "cellDCHMeasOccasionInfo_TDD128"
    public rrc.informationelements.CellDCHMeasOccasionInfo_TDD128_r9 getCellDCHMeasOccasionInfo_TDD128()
    {
	return (rrc.informationelements.CellDCHMeasOccasionInfo_TDD128_r9)mComponents[4];
    }
    
    public void setCellDCHMeasOccasionInfo_TDD128(rrc.informationelements.CellDCHMeasOccasionInfo_TDD128_r9 cellDCHMeasOccasionInfo_TDD128)
    {
	mComponents[4] = cellDCHMeasOccasionInfo_TDD128;
    }
    
    public boolean hasCellDCHMeasOccasionInfo_TDD128()
    {
	return componentIsPresent(4);
    }
    
    public void deleteCellDCHMeasOccasionInfo_TDD128()
    {
	setComponentAbsent(4);
    }
    
    
    // Methods for field "dpch_CompressedModeStatusInfo"
    public rrc.informationelements.DPCH_CompressedModeStatusInfo_r10 getDpch_CompressedModeStatusInfo()
    {
	return (rrc.informationelements.DPCH_CompressedModeStatusInfo_r10)mComponents[5];
    }
    
    public void setDpch_CompressedModeStatusInfo(rrc.informationelements.DPCH_CompressedModeStatusInfo_r10 dpch_CompressedModeStatusInfo)
    {
	mComponents[5] = dpch_CompressedModeStatusInfo;
    }
    
    public boolean hasDpch_CompressedModeStatusInfo()
    {
	return componentIsPresent(5);
    }
    
    public void deleteDpch_CompressedModeStatusInfo()
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
	    "rrc.pdu_definitions",
	    "MeasurementControl_r10_IEs"
	),
	new QName (
	    "PDU-definitions",
	    "MeasurementControl-r10-IEs"
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
				    new rrc.informationelements.MeasurementIdentity(1), 
				    new rrc.informationelements.MeasurementIdentity(16),
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
		    "measurementIdentity",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"MeasurementCommand_r10"
			    ),
			    new QName (
				"InformationElements",
				"MeasurementCommand-r10"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "MeasurementCommand_r10"
				)
			    ),
			    0,
			    new TagDecoder (
				new TagDecoderElement[] {
				    new TagDecoderElement((short)0x8000, 0),
				    new TagDecoderElement((short)0x8001, 1),
				    new TagDecoderElement((short)0x8002, 2)
				}
			    )
			)
		    ),
		    "measurementCommand",
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
				"MeasurementReportingMode"
			    ),
			    new QName (
				"InformationElements",
				"MeasurementReportingMode"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "MeasurementReportingMode"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "MeasurementReportingMode"
				)
			    ),
			    0
			)
		    ),
		    "measurementReportingMode",
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
				"AdditionalMeasurementID_List"
			    ),
			    new QName (
				"InformationElements",
				"AdditionalMeasurementID-List"
			    ),
			    12314,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new com.oss.asn1.INTEGER(1), 
					new com.oss.asn1.INTEGER(4),
					0
				    )
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(4)
			    ),
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "MeasurementIdentity"
				)
			    )
			)
		    ),
		    "additionalMeasurementList",
		    3,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8004
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"CellDCHMeasOccasionInfo_TDD128_r9"
			    ),
			    new QName (
				"InformationElements",
				"CellDCHMeasOccasionInfo-TDD128-r9"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "CellDCHMeasOccasionInfo_TDD128_r9"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "CellDCHMeasOccasionInfo_TDD128_r9"
				)
			    ),
			    0
			)
		    ),
		    "cellDCHMeasOccasionInfo-TDD128",
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
				"DPCH_CompressedModeStatusInfo_r10"
			    ),
			    new QName (
				"InformationElements",
				"DPCH-CompressedModeStatusInfo-r10"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "DPCH_CompressedModeStatusInfo_r10"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "DPCH_CompressedModeStatusInfo_r10"
				)
			    ),
			    0
			)
		    ),
		    "dpch-CompressedModeStatusInfo",
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
     * Get the type descriptor (TypeInfo) of 'this' MeasurementControl_r10_IEs object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' MeasurementControl_r10_IEs object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for MeasurementControl_r10_IEs
