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
 * Define the ASN1 Type UE_Positioning_OTDOA_ReferenceCellInfo_UEB from ASN1 Module InformationElements.
 * @see Sequence
 */

public class UE_Positioning_OTDOA_ReferenceCellInfo_UEB extends Sequence {
    
    /**
     * The default constructor.
     */
    public UE_Positioning_OTDOA_ReferenceCellInfo_UEB()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public UE_Positioning_OTDOA_ReferenceCellInfo_UEB(INTEGER sfn, 
		    ModeSpecificInfo modeSpecificInfo, 
		    FrequencyInfo frequencyInfo, 
		    ReferenceCellPosition cellPosition, INTEGER roundTripTime, 
		    UE_Positioning_IPDL_Parameters ue_positioning_IPDL_Paremeters)
    {
	setSfn(sfn);
	setModeSpecificInfo(modeSpecificInfo);
	setFrequencyInfo(frequencyInfo);
	setCellPosition(cellPosition);
	setRoundTripTime(roundTripTime);
	setUe_positioning_IPDL_Paremeters(ue_positioning_IPDL_Paremeters);
    }
    
    /**
     * Construct with components.
     */
    public UE_Positioning_OTDOA_ReferenceCellInfo_UEB(long sfn, 
		    ModeSpecificInfo modeSpecificInfo, 
		    FrequencyInfo frequencyInfo, 
		    ReferenceCellPosition cellPosition, long roundTripTime, 
		    UE_Positioning_IPDL_Parameters ue_positioning_IPDL_Paremeters)
    {
	this(new INTEGER(sfn), modeSpecificInfo, frequencyInfo, 
	     cellPosition, new INTEGER(roundTripTime), 
	     ue_positioning_IPDL_Paremeters);
    }
    
    /**
     * Construct with required components.
     */
    public UE_Positioning_OTDOA_ReferenceCellInfo_UEB(ModeSpecificInfo modeSpecificInfo)
    {
	setModeSpecificInfo(modeSpecificInfo);
    }
    
    public void initComponents()
    {
	mComponents[0] = new INTEGER();
	mComponents[1] = new ModeSpecificInfo();
	mComponents[2] = new FrequencyInfo();
	mComponents[3] = new ReferenceCellPosition();
	mComponents[4] = new INTEGER();
	mComponents[5] = new UE_Positioning_IPDL_Parameters();
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
		return new INTEGER();
	    case 1:
		return new ModeSpecificInfo();
	    case 2:
		return new FrequencyInfo();
	    case 3:
		return new ReferenceCellPosition();
	    case 4:
		return new INTEGER();
	    case 5:
		return new UE_Positioning_IPDL_Parameters();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "sfn"
    public long getSfn()
    {
	return ((INTEGER)mComponents[0]).longValue();
    }
    
    public void setSfn(long sfn)
    {
	setSfn(new INTEGER(sfn));
    }
    
    public void setSfn(INTEGER sfn)
    {
	mComponents[0] = sfn;
    }
    
    public boolean hasSfn()
    {
	return componentIsPresent(0);
    }
    
    public void deleteSfn()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "modeSpecificInfo"
    public ModeSpecificInfo getModeSpecificInfo()
    {
	return (ModeSpecificInfo)mComponents[1];
    }
    
    public void setModeSpecificInfo(ModeSpecificInfo modeSpecificInfo)
    {
	mComponents[1] = modeSpecificInfo;
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
	    public Fdd(PrimaryCPICH_Info primaryCPICH_Info)
	    {
		setPrimaryCPICH_Info(primaryCPICH_Info);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new PrimaryCPICH_Info();
	    }
	    
	    // Instance initializer
	    {
		mComponents = new AbstractData[1];
	    }
	    
	    // Method to create a specific component instance
	    public AbstractData createInstance(int index)
	    {
		switch (index) {
		    case 0:
			return new PrimaryCPICH_Info();
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
		    "UE_Positioning_OTDOA_ReferenceCellInfo_UEB$ModeSpecificInfo$Fdd"
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
	    public Tdd(CellAndChannelIdentity cellAndChannelIdentity)
	    {
		setCellAndChannelIdentity(cellAndChannelIdentity);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new CellAndChannelIdentity();
	    }
	    
	    // Instance initializer
	    {
		mComponents = new AbstractData[1];
	    }
	    
	    // Method to create a specific component instance
	    public AbstractData createInstance(int index)
	    {
		switch (index) {
		    case 0:
			return new CellAndChannelIdentity();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "cellAndChannelIdentity"
	    public CellAndChannelIdentity getCellAndChannelIdentity()
	    {
		return (CellAndChannelIdentity)mComponents[0];
	    }
	    
	    public void setCellAndChannelIdentity(CellAndChannelIdentity cellAndChannelIdentity)
	    {
		mComponents[0] = cellAndChannelIdentity;
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
		    "UE_Positioning_OTDOA_ReferenceCellInfo_UEB$ModeSpecificInfo$Tdd"
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
					"CellAndChannelIdentity"
				    ),
				    new QName (
					"InformationElements",
					"CellAndChannelIdentity"
				    ),
				    12314,
				    null,
				    new FieldsRef (
					new QName (
					    "rrc.informationelements",
					    "CellAndChannelIdentity"
					)
				    ),
				    0,
				    new TagDecodersRef (
					new QName (
					    "rrc.informationelements",
					    "CellAndChannelIdentity"
					)
				    ),
				    0
				)
			    ),
			    "cellAndChannelIdentity",
			    0,
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
		    (short)0x8001
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"UE_Positioning_OTDOA_ReferenceCellInfo_UEB$ModeSpecificInfo"
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
				"UE_Positioning_OTDOA_ReferenceCellInfo_UEB$ModeSpecificInfo$Fdd"
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
				"UE_Positioning_OTDOA_ReferenceCellInfo_UEB$ModeSpecificInfo$Tdd"
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

    // Methods for field "frequencyInfo"
    public FrequencyInfo getFrequencyInfo()
    {
	return (FrequencyInfo)mComponents[2];
    }
    
    public void setFrequencyInfo(FrequencyInfo frequencyInfo)
    {
	mComponents[2] = frequencyInfo;
    }
    
    public boolean hasFrequencyInfo()
    {
	return componentIsPresent(2);
    }
    
    public void deleteFrequencyInfo()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "cellPosition"
    public ReferenceCellPosition getCellPosition()
    {
	return (ReferenceCellPosition)mComponents[3];
    }
    
    public void setCellPosition(ReferenceCellPosition cellPosition)
    {
	mComponents[3] = cellPosition;
    }
    
    public boolean hasCellPosition()
    {
	return componentIsPresent(3);
    }
    
    public void deleteCellPosition()
    {
	setComponentAbsent(3);
    }
    
    
    // Methods for field "roundTripTime"
    public long getRoundTripTime()
    {
	return ((INTEGER)mComponents[4]).longValue();
    }
    
    public void setRoundTripTime(long roundTripTime)
    {
	setRoundTripTime(new INTEGER(roundTripTime));
    }
    
    public void setRoundTripTime(INTEGER roundTripTime)
    {
	mComponents[4] = roundTripTime;
    }
    
    public boolean hasRoundTripTime()
    {
	return componentIsPresent(4);
    }
    
    public void deleteRoundTripTime()
    {
	setComponentAbsent(4);
    }
    
    
    // Methods for field "ue_positioning_IPDL_Paremeters"
    public UE_Positioning_IPDL_Parameters getUe_positioning_IPDL_Paremeters()
    {
	return (UE_Positioning_IPDL_Parameters)mComponents[5];
    }
    
    public void setUe_positioning_IPDL_Paremeters(UE_Positioning_IPDL_Parameters ue_positioning_IPDL_Paremeters)
    {
	mComponents[5] = ue_positioning_IPDL_Paremeters;
    }
    
    public boolean hasUe_positioning_IPDL_Paremeters()
    {
	return componentIsPresent(5);
    }
    
    public void deleteUe_positioning_IPDL_Paremeters()
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
	    "UE_Positioning_OTDOA_ReferenceCellInfo_UEB"
	),
	new QName (
	    "InformationElements",
	    "UE-Positioning-OTDOA-ReferenceCellInfo-UEB"
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
				"com.oss.asn1",
				"INTEGER"
			    ),
			    new QName (
				"builtin",
				"INTEGER"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new com.oss.asn1.INTEGER(0), 
				    new com.oss.asn1.INTEGER(4095),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(4095)
			    ),
			    null
			)
		    ),
		    "sfn",
		    0,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "UE_Positioning_OTDOA_ReferenceCellInfo_UEB$ModeSpecificInfo"
			)
		    ),
		    "modeSpecificInfo",
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
				"FrequencyInfo"
			    ),
			    new QName (
				"InformationElements",
				"FrequencyInfo"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "FrequencyInfo"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "FrequencyInfo"
				)
			    ),
			    0
			)
		    ),
		    "frequencyInfo",
		    2,
		    3,
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
				"ReferenceCellPosition"
			    ),
			    new QName (
				"InformationElements",
				"ReferenceCellPosition"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "ReferenceCellPosition"
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
		    "cellPosition",
		    3,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8004
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"INTEGER"
			    ),
			    new QName (
				"builtin",
				"INTEGER"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new com.oss.asn1.INTEGER(0), 
				    new com.oss.asn1.INTEGER(32766),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(32766)
			    ),
			    null
			)
		    ),
		    "roundTripTime",
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
				"UE_Positioning_IPDL_Parameters"
			    ),
			    new QName (
				"InformationElements",
				"UE-Positioning-IPDL-Parameters"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_IPDL_Parameters"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_IPDL_Parameters"
				)
			    ),
			    0
			)
		    ),
		    "ue-positioning-IPDL-Paremeters",
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
			new TagDecoderElement((short)0x8001, 1)
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
     * Get the type descriptor (TypeInfo) of 'this' UE_Positioning_OTDOA_ReferenceCellInfo_UEB object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UE_Positioning_OTDOA_ReferenceCellInfo_UEB object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UE_Positioning_OTDOA_ReferenceCellInfo_UEB
