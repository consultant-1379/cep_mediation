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
 * Define the ASN1 Type CellInfo_r4 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class CellInfo_r4 extends Sequence {
    
    /**
     * The default constructor.
     */
    public CellInfo_r4()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public CellInfo_r4(CellIndividualOffset cellIndividualOffset, 
		    ReferenceTimeDifferenceToCell referenceTimeDifferenceToCell, 
		    ModeSpecificInfo modeSpecificInfo)
    {
	setCellIndividualOffset(cellIndividualOffset);
	setReferenceTimeDifferenceToCell(referenceTimeDifferenceToCell);
	setModeSpecificInfo(modeSpecificInfo);
    }
    
    /**
     * Construct with required components.
     */
    public CellInfo_r4(ModeSpecificInfo modeSpecificInfo)
    {
	setModeSpecificInfo(modeSpecificInfo);
    }
    
    public void initComponents()
    {
	mComponents[0] = new CellIndividualOffset();
	mComponents[1] = new ReferenceTimeDifferenceToCell();
	mComponents[2] = new ModeSpecificInfo();
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
		return new CellIndividualOffset();
	    case 1:
		return new ReferenceTimeDifferenceToCell();
	    case 2:
		return new ModeSpecificInfo();
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
    
    
    // Methods for field "modeSpecificInfo"
    public ModeSpecificInfo getModeSpecificInfo()
    {
	return (ModeSpecificInfo)mComponents[2];
    }
    
    public void setModeSpecificInfo(ModeSpecificInfo modeSpecificInfo)
    {
	mComponents[2] = modeSpecificInfo;
    }
    
    
    
    /**
     * Define the ASN1 Type ModeSpecificInfo from ASN1 Module InformationElements.
     * @see Choice
     */
    public static class ModeSpecificInfo extends Choice {
	
	/**
	 * The default constructor.
	 */
	public ModeSpecificInfo()
	{
	}
	
	public static final  int  fdd_chosen = 1;
	public static final  int  tdd_chosen = 2;
	
	// Methods for field "fdd"
	public static ModeSpecificInfo createModeSpecificInfoWithFdd(Fdd fdd)
	{
	    ModeSpecificInfo __object = new ModeSpecificInfo();

	    __object.setFdd(fdd);
	    return __object;
	}
	
	public boolean hasFdd()
	{
	    return getChosenFlag() == fdd_chosen;
	}
	
	public void setFdd(Fdd fdd)
	{
	    setChosenValue(fdd);
	    setChosenFlag(fdd_chosen);
	}
	
	
	
	/**
	 * Define the ASN1 Type Fdd from ASN1 Module InformationElements.
	 * @see Sequence
	 */
	public static class Fdd extends Sequence {
	    
	    /**
	     * The default constructor.
	     */
	    public Fdd()
	    {
	    }
	    
	    /**
	     * Construct with AbstractData components.
	     */
	    public Fdd(PrimaryCPICH_Info primaryCPICH_Info, 
			    PrimaryCPICH_TX_Power primaryCPICH_TX_Power, 
			    BOOLEAN readSFN_Indicator, 
			    BOOLEAN tx_DiversityIndicator)
	    {
		setPrimaryCPICH_Info(primaryCPICH_Info);
		setPrimaryCPICH_TX_Power(primaryCPICH_TX_Power);
		setReadSFN_Indicator(readSFN_Indicator);
		setTx_DiversityIndicator(tx_DiversityIndicator);
	    }
	    
	    /**
	     * Construct with components.
	     */
	    public Fdd(PrimaryCPICH_Info primaryCPICH_Info, 
			    PrimaryCPICH_TX_Power primaryCPICH_TX_Power, 
			    boolean readSFN_Indicator, 
			    boolean tx_DiversityIndicator)
	    {
		this(primaryCPICH_Info, primaryCPICH_TX_Power, 
		     new BOOLEAN(readSFN_Indicator), 
		     new BOOLEAN(tx_DiversityIndicator));
	    }
	    
	    /**
	     * Construct with required components.
	     */
	    public Fdd(boolean readSFN_Indicator, 
			    boolean tx_DiversityIndicator)
	    {
		setReadSFN_Indicator(readSFN_Indicator);
		setTx_DiversityIndicator(tx_DiversityIndicator);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new PrimaryCPICH_Info();
		mComponents[1] = new PrimaryCPICH_TX_Power();
		mComponents[2] = new BOOLEAN();
		mComponents[3] = new BOOLEAN();
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
			return new PrimaryCPICH_Info();
		    case 1:
			return new PrimaryCPICH_TX_Power();
		    case 2:
			return new BOOLEAN();
		    case 3:
			return new BOOLEAN();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "primaryCPICH_Info"
	    public PrimaryCPICH_Info getPrimaryCPICH_Info()
	    {
		return (PrimaryCPICH_Info)mComponents[0];
	    }
	    
	    public void setPrimaryCPICH_Info(PrimaryCPICH_Info primaryCPICH_Info)
	    {
		mComponents[0] = primaryCPICH_Info;
	    }
	    
	    public boolean hasPrimaryCPICH_Info()
	    {
		return componentIsPresent(0);
	    }
	    
	    public void deletePrimaryCPICH_Info()
	    {
		setComponentAbsent(0);
	    }
	    
	    
	    // Methods for field "primaryCPICH_TX_Power"
	    public PrimaryCPICH_TX_Power getPrimaryCPICH_TX_Power()
	    {
		return (PrimaryCPICH_TX_Power)mComponents[1];
	    }
	    
	    public void setPrimaryCPICH_TX_Power(PrimaryCPICH_TX_Power primaryCPICH_TX_Power)
	    {
		mComponents[1] = primaryCPICH_TX_Power;
	    }
	    
	    public boolean hasPrimaryCPICH_TX_Power()
	    {
		return componentIsPresent(1);
	    }
	    
	    public void deletePrimaryCPICH_TX_Power()
	    {
		setComponentAbsent(1);
	    }
	    
	    
	    // Methods for field "readSFN_Indicator"
	    public boolean getReadSFN_Indicator()
	    {
		return ((BOOLEAN)mComponents[2]).booleanValue();
	    }
	    
	    public void setReadSFN_Indicator(boolean readSFN_Indicator)
	    {
		setReadSFN_Indicator(new BOOLEAN(readSFN_Indicator));
	    }
	    
	    public void setReadSFN_Indicator(BOOLEAN readSFN_Indicator)
	    {
		mComponents[2] = readSFN_Indicator;
	    }
	    
	    
	    // Methods for field "tx_DiversityIndicator"
	    public boolean getTx_DiversityIndicator()
	    {
		return ((BOOLEAN)mComponents[3]).booleanValue();
	    }
	    
	    public void setTx_DiversityIndicator(boolean tx_DiversityIndicator)
	    {
		setTx_DiversityIndicator(new BOOLEAN(tx_DiversityIndicator));
	    }
	    
	    public void setTx_DiversityIndicator(BOOLEAN tx_DiversityIndicator)
	    {
		mComponents[3] = tx_DiversityIndicator;
	    }
	    
	    
	    /**
	     * Initialize the type descriptor.
	     */
	    private static final SequenceInfo c_typeinfo = new SequenceInfo (
		new Tags (
		    new short[] {
			(short)0x8000
		    }
		),
		new QName (
		    "rrc.informationelements",
		    "CellInfo_r4$ModeSpecificInfo$Fdd"
		),
		new QName (
		    "builtin",
		    "SEQUENCE"
		),
		12314,
		null,
		new Fields (
		    new SequenceFieldInfo[] {
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new SequenceInfo (
				    new Tags (
					new short[] {
					    (short)0x8000
					}
				    ),
				    new QName (
					"rrc.informationelements",
					"PrimaryCPICH_Info"
				    ),
				    new QName (
					"InformationElements",
					"PrimaryCPICH-Info"
				    ),
				    12314,
				    null,
				    new FieldsRef (
					new QName (
					    "rrc.informationelements",
					    "PrimaryCPICH_Info"
					)
				    ),
				    0,
				    new TagDecodersRef (
					new QName (
					    "rrc.informationelements",
					    "PrimaryCPICH_Info"
					)
				    ),
				    0
				)
			    ),
			    "primaryCPICH-Info",
			    0,
			    3,
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
					"PrimaryCPICH_TX_Power"
				    ),
				    new QName (
					"InformationElements",
					"PrimaryCPICH-TX-Power"
				    ),
				    12314,
				    new ValueRangeConstraint (
					new AbstractBounds(
					    new PrimaryCPICH_TX_Power(-10), 
					    new PrimaryCPICH_TX_Power(50),
					    0
					)
				    ),
				    new Bounds (
					new java.lang.Long(-10),
					new java.lang.Long(50)
				    ),
				    null
				)
			    ),
			    "primaryCPICH-TX-Power",
			    1,
			    3,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new TypeInfo (
				    new Tags (
					new short[] {
					    (short)0x8002
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
			    2,
			    2,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new TypeInfo (
				    new Tags (
					new short[] {
					    (short)0x8003
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
			    "tx-DiversityIndicator",
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
				new TagDecoderElement((short)0x8003, 3)
			    }
			)
		    }
		),
		0
	    );
	    
	    /**
	     * Get the type descriptor (TypeInfo) of 'this' Fdd object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' Fdd object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for Fdd

	// Methods for field "tdd"
	public static ModeSpecificInfo createModeSpecificInfoWithTdd(Tdd tdd)
	{
	    ModeSpecificInfo __object = new ModeSpecificInfo();

	    __object.setTdd(tdd);
	    return __object;
	}
	
	public boolean hasTdd()
	{
	    return getChosenFlag() == tdd_chosen;
	}
	
	public void setTdd(Tdd tdd)
	{
	    setChosenValue(tdd);
	    setChosenFlag(tdd_chosen);
	}
	
	
	
	/**
	 * Define the ASN1 Type Tdd from ASN1 Module InformationElements.
	 * @see Sequence
	 */
	public static class Tdd extends Sequence {
	    
	    /**
	     * The default constructor.
	     */
	    public Tdd()
	    {
	    }
	    
	    /**
	     * Construct with AbstractData components.
	     */
	    public Tdd(PrimaryCCPCH_Info_r4 primaryCCPCH_Info, 
			    PrimaryCCPCH_TX_Power primaryCCPCH_TX_Power, 
			    TimeslotInfoList_r4 timeslotInfoList, 
			    BOOLEAN readSFN_Indicator)
	    {
		setPrimaryCCPCH_Info(primaryCCPCH_Info);
		setPrimaryCCPCH_TX_Power(primaryCCPCH_TX_Power);
		setTimeslotInfoList(timeslotInfoList);
		setReadSFN_Indicator(readSFN_Indicator);
	    }
	    
	    /**
	     * Construct with components.
	     */
	    public Tdd(PrimaryCCPCH_Info_r4 primaryCCPCH_Info, 
			    PrimaryCCPCH_TX_Power primaryCCPCH_TX_Power, 
			    TimeslotInfoList_r4 timeslotInfoList, 
			    boolean readSFN_Indicator)
	    {
		this(primaryCCPCH_Info, primaryCCPCH_TX_Power, 
		     timeslotInfoList, new BOOLEAN(readSFN_Indicator));
	    }
	    
	    /**
	     * Construct with required components.
	     */
	    public Tdd(PrimaryCCPCH_Info_r4 primaryCCPCH_Info, 
			    boolean readSFN_Indicator)
	    {
		setPrimaryCCPCH_Info(primaryCCPCH_Info);
		setReadSFN_Indicator(readSFN_Indicator);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new PrimaryCCPCH_Info_r4();
		mComponents[1] = new PrimaryCCPCH_TX_Power();
		mComponents[2] = new TimeslotInfoList_r4();
		mComponents[3] = new BOOLEAN();
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
			return new PrimaryCCPCH_Info_r4();
		    case 1:
			return new PrimaryCCPCH_TX_Power();
		    case 2:
			return new TimeslotInfoList_r4();
		    case 3:
			return new BOOLEAN();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "primaryCCPCH_Info"
	    public PrimaryCCPCH_Info_r4 getPrimaryCCPCH_Info()
	    {
		return (PrimaryCCPCH_Info_r4)mComponents[0];
	    }
	    
	    public void setPrimaryCCPCH_Info(PrimaryCCPCH_Info_r4 primaryCCPCH_Info)
	    {
		mComponents[0] = primaryCCPCH_Info;
	    }
	    
	    
	    // Methods for field "primaryCCPCH_TX_Power"
	    public PrimaryCCPCH_TX_Power getPrimaryCCPCH_TX_Power()
	    {
		return (PrimaryCCPCH_TX_Power)mComponents[1];
	    }
	    
	    public void setPrimaryCCPCH_TX_Power(PrimaryCCPCH_TX_Power primaryCCPCH_TX_Power)
	    {
		mComponents[1] = primaryCCPCH_TX_Power;
	    }
	    
	    public boolean hasPrimaryCCPCH_TX_Power()
	    {
		return componentIsPresent(1);
	    }
	    
	    public void deletePrimaryCCPCH_TX_Power()
	    {
		setComponentAbsent(1);
	    }
	    
	    
	    // Methods for field "timeslotInfoList"
	    public TimeslotInfoList_r4 getTimeslotInfoList()
	    {
		return (TimeslotInfoList_r4)mComponents[2];
	    }
	    
	    public void setTimeslotInfoList(TimeslotInfoList_r4 timeslotInfoList)
	    {
		mComponents[2] = timeslotInfoList;
	    }
	    
	    public boolean hasTimeslotInfoList()
	    {
		return componentIsPresent(2);
	    }
	    
	    public void deleteTimeslotInfoList()
	    {
		setComponentAbsent(2);
	    }
	    
	    
	    // Methods for field "readSFN_Indicator"
	    public boolean getReadSFN_Indicator()
	    {
		return ((BOOLEAN)mComponents[3]).booleanValue();
	    }
	    
	    public void setReadSFN_Indicator(boolean readSFN_Indicator)
	    {
		setReadSFN_Indicator(new BOOLEAN(readSFN_Indicator));
	    }
	    
	    public void setReadSFN_Indicator(BOOLEAN readSFN_Indicator)
	    {
		mComponents[3] = readSFN_Indicator;
	    }
	    
	    
	    /**
	     * Initialize the type descriptor.
	     */
	    private static final SequenceInfo c_typeinfo = new SequenceInfo (
		new Tags (
		    new short[] {
			(short)0x8001
		    }
		),
		new QName (
		    "rrc.informationelements",
		    "CellInfo_r4$ModeSpecificInfo$Tdd"
		),
		new QName (
		    "builtin",
		    "SEQUENCE"
		),
		12314,
		null,
		new Fields (
		    new SequenceFieldInfo[] {
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new ChoiceInfo (
				    new Tags (
					new short[] {
					    (short)0x8000
					}
				    ),
				    new QName (
					"rrc.informationelements",
					"PrimaryCCPCH_Info_r4"
				    ),
				    new QName (
					"InformationElements",
					"PrimaryCCPCH-Info-r4"
				    ),
				    12314,
				    null,
				    new FieldsRef (
					new QName (
					    "rrc.informationelements",
					    "PrimaryCCPCH_Info_r4"
					)
				    ),
				    0,
				    new TagDecoder (
					new TagDecoderElement[] {
					    new TagDecoderElement((short)0x8000, 0),
					    new TagDecoderElement((short)0x8001, 1)
					}
				    )
				)
			    ),
			    "primaryCCPCH-Info",
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
			    1,
			    3,
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
					"TimeslotInfoList_r4"
				    ),
				    new QName (
					"InformationElements",
					"TimeslotInfoList-r4"
				    ),
				    12314,
				    null,
				    new FieldsRef (
					new QName (
					    "rrc.informationelements",
					    "TimeslotInfoList_r4"
					)
				    ),
				    0,
				    new TagDecoder (
					new TagDecoderElement[] {
					    new TagDecoderElement((short)0x8000, 0),
					    new TagDecoderElement((short)0x8001, 1)
					}
				    )
				)
			    ),
			    "timeslotInfoList",
			    2,
			    3,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new TypeInfo (
				    new Tags (
					new short[] {
					    (short)0x8003
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
				new TagDecoderElement((short)0x8001, 1),
				new TagDecoderElement((short)0x8002, 2),
				new TagDecoderElement((short)0x8003, 3)
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
	     * Get the type descriptor (TypeInfo) of 'this' Tdd object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' Tdd object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for Tdd

	// Method to create a specific choice instance
	public AbstractData createInstance(int chosen)
	{
	    switch (chosen) {
		case fdd_chosen:
		    return new Fdd();
		case tdd_chosen:
		    return new Tdd();
		default:
		    throw new InternalError("Choice.createInstance()");
	    }
	    
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final ChoiceInfo c_typeinfo = new ChoiceInfo (
	    new Tags (
		new short[] {
		    (short)0x8002
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"CellInfo_r4$ModeSpecificInfo"
	    ),
	    new QName (
		"builtin",
		"CHOICE"
	    ),
	    12314,
	    null,
	    new Fields (
		new FieldInfo[] {
		    new FieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.informationelements",
				"CellInfo_r4$ModeSpecificInfo$Fdd"
			    )
			),
			"fdd",
			0,
			2
		    ),
		    new FieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.informationelements",
				"CellInfo_r4$ModeSpecificInfo$Tdd"
			    )
			),
			"tdd",
			1,
			2
		    )
		}
	    ),
	    0,
	    new TagDecoder (
		new TagDecoderElement[] {
		    new TagDecoderElement((short)0x8000, 0),
		    new TagDecoderElement((short)0x8001, 1)
		}
	    )
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' ModeSpecificInfo object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' ModeSpecificInfo object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for ModeSpecificInfo

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
	    "CellInfo_r4"
	),
	new QName (
	    "InformationElements",
	    "CellInfo-r4"
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
			new QName (
			    "rrc.informationelements",
			    "CellInfo_r4$ModeSpecificInfo"
			)
		    ),
		    "modeSpecificInfo",
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
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' CellInfo_r4 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' CellInfo_r4 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for CellInfo_r4
