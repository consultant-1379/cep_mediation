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
 * Define the ASN1 Type UE_Positioning_OTDOA_NeighbourCellInfo from ASN1 Module InformationElements.
 * @see Sequence
 */

public class UE_Positioning_OTDOA_NeighbourCellInfo extends Sequence {
    
    /**
     * The default constructor.
     */
    public UE_Positioning_OTDOA_NeighbourCellInfo()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public UE_Positioning_OTDOA_NeighbourCellInfo(ModeSpecificInfo modeSpecificInfo, 
		    FrequencyInfo frequencyInfo, 
		    UE_Positioning_IPDL_Parameters ue_positioning_IPDL_Paremeters, 
		    SFN_SFN_RelTimeDifference1 sfn_SFN_RelTimeDifference, 
		    SFN_SFN_Drift sfn_SFN_Drift, 
		    OTDOA_SearchWindowSize searchWindowSize, 
		    PositioningMode positioningMode)
    {
	setModeSpecificInfo(modeSpecificInfo);
	setFrequencyInfo(frequencyInfo);
	setUe_positioning_IPDL_Paremeters(ue_positioning_IPDL_Paremeters);
	setSfn_SFN_RelTimeDifference(sfn_SFN_RelTimeDifference);
	setSfn_SFN_Drift(sfn_SFN_Drift);
	setSearchWindowSize(searchWindowSize);
	setPositioningMode(positioningMode);
    }
    
    /**
     * Construct with required components.
     */
    public UE_Positioning_OTDOA_NeighbourCellInfo(ModeSpecificInfo modeSpecificInfo, 
		    SFN_SFN_RelTimeDifference1 sfn_SFN_RelTimeDifference, 
		    OTDOA_SearchWindowSize searchWindowSize, 
		    PositioningMode positioningMode)
    {
	setModeSpecificInfo(modeSpecificInfo);
	setSfn_SFN_RelTimeDifference(sfn_SFN_RelTimeDifference);
	setSearchWindowSize(searchWindowSize);
	setPositioningMode(positioningMode);
    }
    
    public void initComponents()
    {
	mComponents[0] = new ModeSpecificInfo();
	mComponents[1] = new FrequencyInfo();
	mComponents[2] = new UE_Positioning_IPDL_Parameters();
	mComponents[3] = new SFN_SFN_RelTimeDifference1();
	mComponents[4] = SFN_SFN_Drift.sfnsfndrift0;
	mComponents[5] = OTDOA_SearchWindowSize.c20;
	mComponents[6] = new PositioningMode();
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
		return new ModeSpecificInfo();
	    case 1:
		return new FrequencyInfo();
	    case 2:
		return new UE_Positioning_IPDL_Parameters();
	    case 3:
		return new SFN_SFN_RelTimeDifference1();
	    case 4:
		return SFN_SFN_Drift.sfnsfndrift0;
	    case 5:
		return OTDOA_SearchWindowSize.c20;
	    case 6:
		return new PositioningMode();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "modeSpecificInfo"
    public ModeSpecificInfo getModeSpecificInfo()
    {
	return (ModeSpecificInfo)mComponents[0];
    }
    
    public void setModeSpecificInfo(ModeSpecificInfo modeSpecificInfo)
    {
	mComponents[0] = modeSpecificInfo;
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
		    "UE_Positioning_OTDOA_NeighbourCellInfo$ModeSpecificInfo$Fdd"
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
		    "UE_Positioning_OTDOA_NeighbourCellInfo$ModeSpecificInfo$Tdd"
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
		    (short)0x8000
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"UE_Positioning_OTDOA_NeighbourCellInfo$ModeSpecificInfo"
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
				"UE_Positioning_OTDOA_NeighbourCellInfo$ModeSpecificInfo$Fdd"
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
				"UE_Positioning_OTDOA_NeighbourCellInfo$ModeSpecificInfo$Tdd"
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
	return (FrequencyInfo)mComponents[1];
    }
    
    public void setFrequencyInfo(FrequencyInfo frequencyInfo)
    {
	mComponents[1] = frequencyInfo;
    }
    
    public boolean hasFrequencyInfo()
    {
	return componentIsPresent(1);
    }
    
    public void deleteFrequencyInfo()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "ue_positioning_IPDL_Paremeters"
    public UE_Positioning_IPDL_Parameters getUe_positioning_IPDL_Paremeters()
    {
	return (UE_Positioning_IPDL_Parameters)mComponents[2];
    }
    
    public void setUe_positioning_IPDL_Paremeters(UE_Positioning_IPDL_Parameters ue_positioning_IPDL_Paremeters)
    {
	mComponents[2] = ue_positioning_IPDL_Paremeters;
    }
    
    public boolean hasUe_positioning_IPDL_Paremeters()
    {
	return componentIsPresent(2);
    }
    
    public void deleteUe_positioning_IPDL_Paremeters()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "sfn_SFN_RelTimeDifference"
    public SFN_SFN_RelTimeDifference1 getSfn_SFN_RelTimeDifference()
    {
	return (SFN_SFN_RelTimeDifference1)mComponents[3];
    }
    
    public void setSfn_SFN_RelTimeDifference(SFN_SFN_RelTimeDifference1 sfn_SFN_RelTimeDifference)
    {
	mComponents[3] = sfn_SFN_RelTimeDifference;
    }
    
    
    // Methods for field "sfn_SFN_Drift"
    public SFN_SFN_Drift getSfn_SFN_Drift()
    {
	return (SFN_SFN_Drift)mComponents[4];
    }
    
    public void setSfn_SFN_Drift(SFN_SFN_Drift sfn_SFN_Drift)
    {
	mComponents[4] = sfn_SFN_Drift;
    }
    
    public boolean hasSfn_SFN_Drift()
    {
	return componentIsPresent(4);
    }
    
    public void deleteSfn_SFN_Drift()
    {
	setComponentAbsent(4);
    }
    
    
    // Methods for field "searchWindowSize"
    public OTDOA_SearchWindowSize getSearchWindowSize()
    {
	return (OTDOA_SearchWindowSize)mComponents[5];
    }
    
    public void setSearchWindowSize(OTDOA_SearchWindowSize searchWindowSize)
    {
	mComponents[5] = searchWindowSize;
    }
    
    
    // Methods for field "positioningMode"
    public PositioningMode getPositioningMode()
    {
	return (PositioningMode)mComponents[6];
    }
    
    public void setPositioningMode(PositioningMode positioningMode)
    {
	mComponents[6] = positioningMode;
    }
    
    
    
    /**
     * Define the ASN1 Type PositioningMode from ASN1 Module InformationElements.
     * @see Choice
     */
    public static class PositioningMode extends Choice {
	
	/**
	 * The default constructor.
	 */
	public PositioningMode()
	{
	}
	
	public static final  int  ueBased_chosen = 1;
	public static final  int  ueAssisted_chosen = 2;
	
	// Methods for field "ueBased"
	public static PositioningMode createPositioningModeWithUeBased(UeBased ueBased)
	{
	    PositioningMode __object = new PositioningMode();

	    __object.setUeBased(ueBased);
	    return __object;
	}
	
	public boolean hasUeBased()
	{
	    return getChosenFlag() == ueBased_chosen;
	}
	
	public void setUeBased(UeBased ueBased)
	{
	    setChosenValue(ueBased);
	    setChosenFlag(ueBased_chosen);
	}
	
	
	
	/**
	 * Define the ASN1 Type UeBased from ASN1 Module InformationElements.
	 * @see Sequence
	 */
	public static class UeBased extends Sequence {
	    
	    /**
	     * The default constructor.
	     */
	    public UeBased()
	    {
	    }
	    
	    public void initComponents()
	    {
		
	    }
	    
	    // Instance initializer
	    {
		mComponents = new AbstractData[0];
	    }
	    
	    // Method to create a specific component instance
	    public AbstractData createInstance(int index)
	    {
		return null;
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
		    "UE_Positioning_OTDOA_NeighbourCellInfo$PositioningMode$UeBased"
		),
		new QName (
		    "builtin",
		    "SEQUENCE"
		),
		12314,
		null,
		new Fields (
		    new SequenceFieldInfo[] {
		    }
		),
		0,
		null,
		0
	    );
	    
	    /**
	     * Get the type descriptor (TypeInfo) of 'this' UeBased object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' UeBased object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for UeBased

	// Methods for field "ueAssisted"
	public static PositioningMode createPositioningModeWithUeAssisted(UeAssisted ueAssisted)
	{
	    PositioningMode __object = new PositioningMode();

	    __object.setUeAssisted(ueAssisted);
	    return __object;
	}
	
	public boolean hasUeAssisted()
	{
	    return getChosenFlag() == ueAssisted_chosen;
	}
	
	public void setUeAssisted(UeAssisted ueAssisted)
	{
	    setChosenValue(ueAssisted);
	    setChosenFlag(ueAssisted_chosen);
	}
	
	
	
	/**
	 * Define the ASN1 Type UeAssisted from ASN1 Module InformationElements.
	 * @see Sequence
	 */
	public static class UeAssisted extends Sequence {
	    
	    /**
	     * The default constructor.
	     */
	    public UeAssisted()
	    {
	    }
	    
	    public void initComponents()
	    {
		
	    }
	    
	    // Instance initializer
	    {
		mComponents = new AbstractData[0];
	    }
	    
	    // Method to create a specific component instance
	    public AbstractData createInstance(int index)
	    {
		return null;
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
		    "UE_Positioning_OTDOA_NeighbourCellInfo$PositioningMode$UeAssisted"
		),
		new QName (
		    "builtin",
		    "SEQUENCE"
		),
		12314,
		null,
		new Fields (
		    new SequenceFieldInfo[] {
		    }
		),
		0,
		null,
		0
	    );
	    
	    /**
	     * Get the type descriptor (TypeInfo) of 'this' UeAssisted object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' UeAssisted object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for UeAssisted

	// Method to create a specific choice instance
	public AbstractData createInstance(int chosen)
	{
	    switch (chosen) {
		case ueBased_chosen:
		    return new UeBased();
		case ueAssisted_chosen:
		    return new UeAssisted();
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
		    (short)0x8006
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"UE_Positioning_OTDOA_NeighbourCellInfo$PositioningMode"
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
				"UE_Positioning_OTDOA_NeighbourCellInfo$PositioningMode$UeBased"
			    )
			),
			"ueBased",
			0,
			2
		    ),
		    new FieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.informationelements",
				"UE_Positioning_OTDOA_NeighbourCellInfo$PositioningMode$UeAssisted"
			    )
			),
			"ueAssisted",
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
	 * Get the type descriptor (TypeInfo) of 'this' PositioningMode object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' PositioningMode object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for PositioningMode

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
	    "UE_Positioning_OTDOA_NeighbourCellInfo"
	),
	new QName (
	    "InformationElements",
	    "UE-Positioning-OTDOA-NeighbourCellInfo"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "UE_Positioning_OTDOA_NeighbourCellInfo$ModeSpecificInfo"
			)
		    ),
		    "modeSpecificInfo",
		    0,
		    2,
		    null
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
				"SFN_SFN_RelTimeDifference1"
			    ),
			    new QName (
				"InformationElements",
				"SFN-SFN-RelTimeDifference1"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "SFN_SFN_RelTimeDifference1"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "SFN_SFN_RelTimeDifference1"
				)
			    ),
			    0
			)
		    ),
		    "sfn-SFN-RelTimeDifference",
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
				"SFN_SFN_Drift"
			    ),
			    new QName (
				"InformationElements",
				"SFN-SFN-Drift"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"sfnsfndrift0",
					0
				    ),
				    new MemberListElement (
					"sfnsfndrift1",
					1
				    ),
				    new MemberListElement (
					"sfnsfndrift2",
					2
				    ),
				    new MemberListElement (
					"sfnsfndrift3",
					3
				    ),
				    new MemberListElement (
					"sfnsfndrift4",
					4
				    ),
				    new MemberListElement (
					"sfnsfndrift5",
					5
				    ),
				    new MemberListElement (
					"sfnsfndrift8",
					6
				    ),
				    new MemberListElement (
					"sfnsfndrift10",
					7
				    ),
				    new MemberListElement (
					"sfnsfndrift15",
					8
				    ),
				    new MemberListElement (
					"sfnsfndrift25",
					9
				    ),
				    new MemberListElement (
					"sfnsfndrift35",
					10
				    ),
				    new MemberListElement (
					"sfnsfndrift50",
					11
				    ),
				    new MemberListElement (
					"sfnsfndrift65",
					12
				    ),
				    new MemberListElement (
					"sfnsfndrift80",
					13
				    ),
				    new MemberListElement (
					"sfnsfndrift100",
					14
				    ),
				    new MemberListElement (
					"sfnsfndrift-1",
					15
				    ),
				    new MemberListElement (
					"sfnsfndrift-2",
					16
				    ),
				    new MemberListElement (
					"sfnsfndrift-3",
					17
				    ),
				    new MemberListElement (
					"sfnsfndrift-4",
					18
				    ),
				    new MemberListElement (
					"sfnsfndrift-5",
					19
				    ),
				    new MemberListElement (
					"sfnsfndrift-8",
					20
				    ),
				    new MemberListElement (
					"sfnsfndrift-10",
					21
				    ),
				    new MemberListElement (
					"sfnsfndrift-15",
					22
				    ),
				    new MemberListElement (
					"sfnsfndrift-25",
					23
				    ),
				    new MemberListElement (
					"sfnsfndrift-35",
					24
				    ),
				    new MemberListElement (
					"sfnsfndrift-50",
					25
				    ),
				    new MemberListElement (
					"sfnsfndrift-65",
					26
				    ),
				    new MemberListElement (
					"sfnsfndrift-80",
					27
				    ),
				    new MemberListElement (
					"sfnsfndrift-100",
					28
				    )
				}
			    ),
			    0,
			    SFN_SFN_Drift.sfnsfndrift0
			)
		    ),
		    "sfn-SFN-Drift",
		    4,
		    3,
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
				"OTDOA_SearchWindowSize"
			    ),
			    new QName (
				"InformationElements",
				"OTDOA-SearchWindowSize"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"c20",
					0
				    ),
				    new MemberListElement (
					"c40",
					1
				    ),
				    new MemberListElement (
					"c80",
					2
				    ),
				    new MemberListElement (
					"c160",
					3
				    ),
				    new MemberListElement (
					"c320",
					4
				    ),
				    new MemberListElement (
					"c640",
					5
				    ),
				    new MemberListElement (
					"c1280",
					6
				    ),
				    new MemberListElement (
					"moreThan1280",
					7
				    )
				}
			    ),
			    0,
			    OTDOA_SearchWindowSize.c20
			)
		    ),
		    "searchWindowSize",
		    5,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "UE_Positioning_OTDOA_NeighbourCellInfo$PositioningMode"
			)
		    ),
		    "positioningMode",
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
     * Get the type descriptor (TypeInfo) of 'this' UE_Positioning_OTDOA_NeighbourCellInfo object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UE_Positioning_OTDOA_NeighbourCellInfo object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UE_Positioning_OTDOA_NeighbourCellInfo
