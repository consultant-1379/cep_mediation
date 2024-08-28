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
 * Define the ASN1 Type CellInfoSI_HCS_RSCP_LCR_r4 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class CellInfoSI_HCS_RSCP_LCR_r4 extends Sequence {
    
    /**
     * The default constructor.
     */
    public CellInfoSI_HCS_RSCP_LCR_r4()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public CellInfoSI_HCS_RSCP_LCR_r4(CellIndividualOffset cellIndividualOffset, 
		    ReferenceTimeDifferenceToCell referenceTimeDifferenceToCell, 
		    PrimaryCCPCH_Info_LCR_r4 primaryCCPCH_Info, 
		    PrimaryCCPCH_TX_Power primaryCCPCH_TX_Power, 
		    TimeslotInfoList_LCR_r4 timeslotInfoList, 
		    BOOLEAN readSFN_Indicator, 
		    CellSelectReselectInfoSIB_11_12_HCS_RSCP cellSelectionReselectionInfo)
    {
	setCellIndividualOffset(cellIndividualOffset);
	setReferenceTimeDifferenceToCell(referenceTimeDifferenceToCell);
	setPrimaryCCPCH_Info(primaryCCPCH_Info);
	setPrimaryCCPCH_TX_Power(primaryCCPCH_TX_Power);
	setTimeslotInfoList(timeslotInfoList);
	setReadSFN_Indicator(readSFN_Indicator);
	setCellSelectionReselectionInfo(cellSelectionReselectionInfo);
    }
    
    /**
     * Construct with components.
     */
    public CellInfoSI_HCS_RSCP_LCR_r4(CellIndividualOffset cellIndividualOffset, 
		    ReferenceTimeDifferenceToCell referenceTimeDifferenceToCell, 
		    PrimaryCCPCH_Info_LCR_r4 primaryCCPCH_Info, 
		    PrimaryCCPCH_TX_Power primaryCCPCH_TX_Power, 
		    TimeslotInfoList_LCR_r4 timeslotInfoList, 
		    boolean readSFN_Indicator, 
		    CellSelectReselectInfoSIB_11_12_HCS_RSCP cellSelectionReselectionInfo)
    {
	this(cellIndividualOffset, referenceTimeDifferenceToCell, 
	     primaryCCPCH_Info, primaryCCPCH_TX_Power, timeslotInfoList, 
	     new BOOLEAN(readSFN_Indicator), cellSelectionReselectionInfo);
    }
    
    /**
     * Construct with required components.
     */
    public CellInfoSI_HCS_RSCP_LCR_r4(PrimaryCCPCH_Info_LCR_r4 primaryCCPCH_Info, 
		    boolean readSFN_Indicator)
    {
	setPrimaryCCPCH_Info(primaryCCPCH_Info);
	setReadSFN_Indicator(readSFN_Indicator);
    }
    
    public void initComponents()
    {
	mComponents[0] = new CellIndividualOffset();
	mComponents[1] = new ReferenceTimeDifferenceToCell();
	mComponents[2] = new PrimaryCCPCH_Info_LCR_r4();
	mComponents[3] = new PrimaryCCPCH_TX_Power();
	mComponents[4] = new TimeslotInfoList_LCR_r4();
	mComponents[5] = new BOOLEAN();
	mComponents[6] = new CellSelectReselectInfoSIB_11_12_HCS_RSCP();
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
		return new CellIndividualOffset();
	    case 1:
		return new ReferenceTimeDifferenceToCell();
	    case 2:
		return new PrimaryCCPCH_Info_LCR_r4();
	    case 3:
		return new PrimaryCCPCH_TX_Power();
	    case 4:
		return new TimeslotInfoList_LCR_r4();
	    case 5:
		return new BOOLEAN();
	    case 6:
		return new CellSelectReselectInfoSIB_11_12_HCS_RSCP();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    // Default Values
    public static final CellIndividualOffset cellIndividualOffset__default = 
	new CellIndividualOffset(0);
    
    // Methods for field "cellIndividualOffset"
    public CellIndividualOffset getCellIndividualOffset()
    {
	if (hasCellIndividualOffset())
	    return (CellIndividualOffset)mComponents[0];
	else
	    return (CellIndividualOffset)cellIndividualOffset__default.clone();
    }
    
    public void setCellIndividualOffset(CellIndividualOffset cellIndividualOffset)
    {
	mComponents[0] = cellIndividualOffset;
    }
    
    public void setCellIndividualOffsetToDefault()
    {
	setCellIndividualOffset(cellIndividualOffset__default);
    }
    
    public boolean hasDefaultCellIndividualOffset()
    {
	return true;
    }
    
    public boolean hasCellIndividualOffset()
    {
	return componentIsPresent(0);
    }
    
    public void deleteCellIndividualOffset()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "referenceTimeDifferenceToCell"
    public ReferenceTimeDifferenceToCell getReferenceTimeDifferenceToCell()
    {
	return (ReferenceTimeDifferenceToCell)mComponents[1];
    }
    
    public void setReferenceTimeDifferenceToCell(ReferenceTimeDifferenceToCell referenceTimeDifferenceToCell)
    {
	mComponents[1] = referenceTimeDifferenceToCell;
    }
    
    public boolean hasReferenceTimeDifferenceToCell()
    {
	return componentIsPresent(1);
    }
    
    public void deleteReferenceTimeDifferenceToCell()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "primaryCCPCH_Info"
    public PrimaryCCPCH_Info_LCR_r4 getPrimaryCCPCH_Info()
    {
	return (PrimaryCCPCH_Info_LCR_r4)mComponents[2];
    }
    
    public void setPrimaryCCPCH_Info(PrimaryCCPCH_Info_LCR_r4 primaryCCPCH_Info)
    {
	mComponents[2] = primaryCCPCH_Info;
    }
    
    
    // Methods for field "primaryCCPCH_TX_Power"
    public PrimaryCCPCH_TX_Power getPrimaryCCPCH_TX_Power()
    {
	return (PrimaryCCPCH_TX_Power)mComponents[3];
    }
    
    public void setPrimaryCCPCH_TX_Power(PrimaryCCPCH_TX_Power primaryCCPCH_TX_Power)
    {
	mComponents[3] = primaryCCPCH_TX_Power;
    }
    
    public boolean hasPrimaryCCPCH_TX_Power()
    {
	return componentIsPresent(3);
    }
    
    public void deletePrimaryCCPCH_TX_Power()
    {
	setComponentAbsent(3);
    }
    
    
    // Methods for field "timeslotInfoList"
    public TimeslotInfoList_LCR_r4 getTimeslotInfoList()
    {
	return (TimeslotInfoList_LCR_r4)mComponents[4];
    }
    
    public void setTimeslotInfoList(TimeslotInfoList_LCR_r4 timeslotInfoList)
    {
	mComponents[4] = timeslotInfoList;
    }
    
    public boolean hasTimeslotInfoList()
    {
	return componentIsPresent(4);
    }
    
    public void deleteTimeslotInfoList()
    {
	setComponentAbsent(4);
    }
    
    
    // Methods for field "readSFN_Indicator"
    public boolean getReadSFN_Indicator()
    {
	return ((BOOLEAN)mComponents[5]).booleanValue();
    }
    
    public void setReadSFN_Indicator(boolean readSFN_Indicator)
    {
	setReadSFN_Indicator(new BOOLEAN(readSFN_Indicator));
    }
    
    public void setReadSFN_Indicator(BOOLEAN readSFN_Indicator)
    {
	mComponents[5] = readSFN_Indicator;
    }
    
    
    // Methods for field "cellSelectionReselectionInfo"
    public CellSelectReselectInfoSIB_11_12_HCS_RSCP getCellSelectionReselectionInfo()
    {
	return (CellSelectReselectInfoSIB_11_12_HCS_RSCP)mComponents[6];
    }
    
    public void setCellSelectionReselectionInfo(CellSelectReselectInfoSIB_11_12_HCS_RSCP cellSelectionReselectionInfo)
    {
	mComponents[6] = cellSelectionReselectionInfo;
    }
    
    public boolean hasCellSelectionReselectionInfo()
    {
	return componentIsPresent(6);
    }
    
    public void deleteCellSelectionReselectionInfo()
    {
	setComponentAbsent(6);
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
	    "CellInfoSI_HCS_RSCP_LCR_r4"
	),
	new QName (
	    "InformationElements",
	    "CellInfoSI-HCS-RSCP-LCR-r4"
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
				"CellIndividualOffset"
			    ),
			    new QName (
				"InformationElements",
				"CellIndividualOffset"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new CellIndividualOffset(-20), 
				    new CellIndividualOffset(20),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(-20),
				new java.lang.Long(20)
			    ),
			    null
			)
		    ),
		    "cellIndividualOffset",
		    0,
		    3,
		    cellIndividualOffset__default
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
				"ReferenceTimeDifferenceToCell"
			    ),
			    new QName (
				"InformationElements",
				"ReferenceTimeDifferenceToCell"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "ReferenceTimeDifferenceToCell"
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
		    "referenceTimeDifferenceToCell",
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
				"PrimaryCCPCH_Info_LCR_r4"
			    ),
			    new QName (
				"InformationElements",
				"PrimaryCCPCH-Info-LCR-r4"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "PrimaryCCPCH_Info_LCR_r4"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "PrimaryCCPCH_Info_LCR_r4"
				)
			    ),
			    0
			)
		    ),
		    "primaryCCPCH-Info",
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
				"PrimaryCCPCH_TX_Power"
			    ),
			    new QName (
				"InformationElements",
				"PrimaryCCPCH-TX-Power"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new PrimaryCCPCH_TX_Power(6), 
				    new PrimaryCCPCH_TX_Power(43),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(6),
				new java.lang.Long(43)
			    ),
			    null
			)
		    ),
		    "primaryCCPCH-TX-Power",
		    3,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8004
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"TimeslotInfoList_LCR_r4"
			    ),
			    new QName (
				"InformationElements",
				"TimeslotInfoList-LCR-r4"
			    ),
			    12314,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new com.oss.asn1.INTEGER(1), 
					new com.oss.asn1.INTEGER(6),
					0
				    )
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(6)
			    ),
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "TimeslotInfo_LCR_r4"
				)
			    )
			)
		    ),
		    "timeslotInfoList",
		    4,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8005
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
		    "readSFN-Indicator",
		    5,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8006
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"CellSelectReselectInfoSIB_11_12_HCS_RSCP"
			    ),
			    new QName (
				"InformationElements",
				"CellSelectReselectInfoSIB-11-12-HCS-RSCP"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "CellSelectReselectInfoSIB_11_12_HCS_RSCP"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "CellSelectReselectInfoSIB_11_12_HCS_RSCP"
				)
			    ),
			    0
			)
		    ),
		    "cellSelectionReselectionInfo",
		    6,
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
			new TagDecoderElement((short)0x8002, 2)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8002, 2)
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
     * Get the type descriptor (TypeInfo) of 'this' CellInfoSI_HCS_RSCP_LCR_r4 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' CellInfoSI_HCS_RSCP_LCR_r4 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for CellInfoSI_HCS_RSCP_LCR_r4
