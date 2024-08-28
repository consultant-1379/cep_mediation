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
 * Define the ASN1 Type SecondaryCCPCH_Info_r4 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class SecondaryCCPCH_Info_r4 extends Sequence {
    
    /**
     * The default constructor.
     */
    public SecondaryCCPCH_Info_r4()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public SecondaryCCPCH_Info_r4(ModeSpecificInfo modeSpecificInfo)
    {
	setModeSpecificInfo(modeSpecificInfo);
    }
    
    public void initComponents()
    {
	mComponents[0] = new ModeSpecificInfo();
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
		return new ModeSpecificInfo();
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
	    public Fdd(SecondaryScramblingCode secondaryScramblingCode, 
			    BOOLEAN sttd_Indicator, 
			    SF256_AndCodeNumber sf_AndCodeNumber, 
			    BOOLEAN pilotSymbolExistence, 
			    BOOLEAN tfci_Existence, 
			    PositionFixedOrFlexible positionFixedOrFlexible, 
			    TimingOffset timingOffset)
	    {
		setSecondaryScramblingCode(secondaryScramblingCode);
		setSttd_Indicator(sttd_Indicator);
		setSf_AndCodeNumber(sf_AndCodeNumber);
		setPilotSymbolExistence(pilotSymbolExistence);
		setTfci_Existence(tfci_Existence);
		setPositionFixedOrFlexible(positionFixedOrFlexible);
		setTimingOffset(timingOffset);
	    }
	    
	    /**
	     * Construct with components.
	     */
	    public Fdd(SecondaryScramblingCode secondaryScramblingCode, 
			    boolean sttd_Indicator, 
			    SF256_AndCodeNumber sf_AndCodeNumber, 
			    boolean pilotSymbolExistence, 
			    boolean tfci_Existence, 
			    PositionFixedOrFlexible positionFixedOrFlexible, 
			    TimingOffset timingOffset)
	    {
		this(secondaryScramblingCode, new BOOLEAN(sttd_Indicator), 
		     sf_AndCodeNumber, new BOOLEAN(pilotSymbolExistence), 
		     new BOOLEAN(tfci_Existence), positionFixedOrFlexible, 
		     timingOffset);
	    }
	    
	    /**
	     * Construct with required components.
	     */
	    public Fdd(boolean sttd_Indicator, 
			    SF256_AndCodeNumber sf_AndCodeNumber, 
			    boolean pilotSymbolExistence, 
			    boolean tfci_Existence, 
			    PositionFixedOrFlexible positionFixedOrFlexible)
	    {
		setSttd_Indicator(sttd_Indicator);
		setSf_AndCodeNumber(sf_AndCodeNumber);
		setPilotSymbolExistence(pilotSymbolExistence);
		setTfci_Existence(tfci_Existence);
		setPositionFixedOrFlexible(positionFixedOrFlexible);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new SecondaryScramblingCode();
		mComponents[1] = new BOOLEAN();
		mComponents[2] = new SF256_AndCodeNumber();
		mComponents[3] = new BOOLEAN();
		mComponents[4] = new BOOLEAN();
		mComponents[5] = PositionFixedOrFlexible.fixed;
		mComponents[6] = new TimingOffset();
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
			return new SecondaryScramblingCode();
		    case 1:
			return new BOOLEAN();
		    case 2:
			return new SF256_AndCodeNumber();
		    case 3:
			return new BOOLEAN();
		    case 4:
			return new BOOLEAN();
		    case 5:
			return PositionFixedOrFlexible.fixed;
		    case 6:
			return new TimingOffset();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    // Default Values
	    public static final TimingOffset timingOffset__default = 
		new TimingOffset(0);
	    
	    // Methods for field "secondaryScramblingCode"
	    public SecondaryScramblingCode getSecondaryScramblingCode()
	    {
		return (SecondaryScramblingCode)mComponents[0];
	    }
	    
	    public void setSecondaryScramblingCode(SecondaryScramblingCode secondaryScramblingCode)
	    {
		mComponents[0] = secondaryScramblingCode;
	    }
	    
	    public boolean hasSecondaryScramblingCode()
	    {
		return componentIsPresent(0);
	    }
	    
	    public void deleteSecondaryScramblingCode()
	    {
		setComponentAbsent(0);
	    }
	    
	    
	    // Methods for field "sttd_Indicator"
	    public boolean getSttd_Indicator()
	    {
		return ((BOOLEAN)mComponents[1]).booleanValue();
	    }
	    
	    public void setSttd_Indicator(boolean sttd_Indicator)
	    {
		setSttd_Indicator(new BOOLEAN(sttd_Indicator));
	    }
	    
	    public void setSttd_Indicator(BOOLEAN sttd_Indicator)
	    {
		mComponents[1] = sttd_Indicator;
	    }
	    
	    
	    // Methods for field "sf_AndCodeNumber"
	    public SF256_AndCodeNumber getSf_AndCodeNumber()
	    {
		return (SF256_AndCodeNumber)mComponents[2];
	    }
	    
	    public void setSf_AndCodeNumber(SF256_AndCodeNumber sf_AndCodeNumber)
	    {
		mComponents[2] = sf_AndCodeNumber;
	    }
	    
	    
	    // Methods for field "pilotSymbolExistence"
	    public boolean getPilotSymbolExistence()
	    {
		return ((BOOLEAN)mComponents[3]).booleanValue();
	    }
	    
	    public void setPilotSymbolExistence(boolean pilotSymbolExistence)
	    {
		setPilotSymbolExistence(new BOOLEAN(pilotSymbolExistence));
	    }
	    
	    public void setPilotSymbolExistence(BOOLEAN pilotSymbolExistence)
	    {
		mComponents[3] = pilotSymbolExistence;
	    }
	    
	    
	    // Methods for field "tfci_Existence"
	    public boolean getTfci_Existence()
	    {
		return ((BOOLEAN)mComponents[4]).booleanValue();
	    }
	    
	    public void setTfci_Existence(boolean tfci_Existence)
	    {
		setTfci_Existence(new BOOLEAN(tfci_Existence));
	    }
	    
	    public void setTfci_Existence(BOOLEAN tfci_Existence)
	    {
		mComponents[4] = tfci_Existence;
	    }
	    
	    
	    // Methods for field "positionFixedOrFlexible"
	    public PositionFixedOrFlexible getPositionFixedOrFlexible()
	    {
		return (PositionFixedOrFlexible)mComponents[5];
	    }
	    
	    public void setPositionFixedOrFlexible(PositionFixedOrFlexible positionFixedOrFlexible)
	    {
		mComponents[5] = positionFixedOrFlexible;
	    }
	    
	    
	    // Methods for field "timingOffset"
	    public TimingOffset getTimingOffset()
	    {
		if (hasTimingOffset())
		    return (TimingOffset)mComponents[6];
		else
		    return (TimingOffset)timingOffset__default.clone();
	    }
	    
	    public void setTimingOffset(TimingOffset timingOffset)
	    {
		mComponents[6] = timingOffset;
	    }
	    
	    public void setTimingOffsetToDefault()
	    {
		setTimingOffset(timingOffset__default);
	    }
	    
	    public boolean hasDefaultTimingOffset()
	    {
		return true;
	    }
	    
	    public boolean hasTimingOffset()
	    {
		return componentIsPresent(6);
	    }
	    
	    public void deleteTimingOffset()
	    {
		setComponentAbsent(6);
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
		    "SecondaryCCPCH_Info_r4$ModeSpecificInfo$Fdd"
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
				new IntegerInfo (
				    new Tags (
					new short[] {
					    (short)0x8000
					}
				    ),
				    new QName (
					"rrc.informationelements",
					"SecondaryScramblingCode"
				    ),
				    new QName (
					"InformationElements",
					"SecondaryScramblingCode"
				    ),
				    12314,
				    new ValueRangeConstraint (
					new AbstractBounds(
					    new SecondaryScramblingCode(1), 
					    new SecondaryScramblingCode(15),
					    0
					)
				    ),
				    new Bounds (
					new java.lang.Long(1),
					new java.lang.Long(15)
				    ),
				    null
				)
			    ),
			    "secondaryScramblingCode",
			    0,
			    3,
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
			    "sttd-Indicator",
			    1,
			    2,
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
					"SF256_AndCodeNumber"
				    ),
				    new QName (
					"InformationElements",
					"SF256-AndCodeNumber"
				    ),
				    12314,
				    null,
				    new FieldsRef (
					new QName (
					    "rrc.informationelements",
					    "SF256_AndCodeNumber"
					)
				    ),
				    0,
				    new TagDecoder (
					new TagDecoderElement[] {
					    new TagDecoderElement((short)0x8000, 0),
					    new TagDecoderElement((short)0x8001, 1),
					    new TagDecoderElement((short)0x8002, 2),
					    new TagDecoderElement((short)0x8003, 3),
					    new TagDecoderElement((short)0x8004, 4),
					    new TagDecoderElement((short)0x8005, 5),
					    new TagDecoderElement((short)0x8006, 6)
					}
				    )
				)
			    ),
			    "sf-AndCodeNumber",
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
			    "pilotSymbolExistence",
			    3,
			    2,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new TypeInfo (
				    new Tags (
					new short[] {
					    (short)0x8004
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
			    "tfci-Existence",
			    4,
			    2,
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
					"PositionFixedOrFlexible"
				    ),
				    new QName (
					"InformationElements",
					"PositionFixedOrFlexible"
				    ),
				    12314,
				    null,
				    new MemberList (
					new MemberListElement[] {
					    new MemberListElement (
						"fixed",
						0
					    ),
					    new MemberListElement (
						"flexible",
						1
					    )
					}
				    ),
				    0,
				    PositionFixedOrFlexible.fixed
				)
			    ),
			    "positionFixedOrFlexible",
			    5,
			    2,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new IntegerInfo (
				    new Tags (
					new short[] {
					    (short)0x8006
					}
				    ),
				    new QName (
					"rrc.informationelements",
					"TimingOffset"
				    ),
				    new QName (
					"InformationElements",
					"TimingOffset"
				    ),
				    12314,
				    new ValueRangeConstraint (
					new AbstractBounds(
					    new TimingOffset(0), 
					    new TimingOffset(149),
					    0
					)
				    ),
				    new Bounds (
					new java.lang.Long(0),
					new java.lang.Long(149)
				    ),
				    null
				)
			    ),
			    "timingOffset",
			    6,
			    3,
			    timingOffset__default
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
				new TagDecoderElement((short)0x8002, 2)
			    }
			),
			new TagDecoder (
			    new TagDecoderElement[] {
				new TagDecoderElement((short)0x8003, 3)
			    }
			),
			new TagDecoder (
			    new TagDecoderElement[] {
				new TagDecoderElement((short)0x8004, 4)
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
	    public Tdd(CommonTimeslotInfoSCCPCH commonTimeslotInfo, 
			    TddOption tddOption, 
			    SCCPCH_ChannelisationCodeList channelisationCode)
	    {
		setCommonTimeslotInfo(commonTimeslotInfo);
		setTddOption(tddOption);
		setChannelisationCode(channelisationCode);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new CommonTimeslotInfoSCCPCH();
		mComponents[1] = new TddOption();
		mComponents[2] = new SCCPCH_ChannelisationCodeList();
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
			return new CommonTimeslotInfoSCCPCH();
		    case 1:
			return new TddOption();
		    case 2:
			return new SCCPCH_ChannelisationCodeList();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "commonTimeslotInfo"
	    public CommonTimeslotInfoSCCPCH getCommonTimeslotInfo()
	    {
		return (CommonTimeslotInfoSCCPCH)mComponents[0];
	    }
	    
	    public void setCommonTimeslotInfo(CommonTimeslotInfoSCCPCH commonTimeslotInfo)
	    {
		mComponents[0] = commonTimeslotInfo;
	    }
	    
	    
	    // Methods for field "tddOption"
	    public TddOption getTddOption()
	    {
		return (TddOption)mComponents[1];
	    }
	    
	    public void setTddOption(TddOption tddOption)
	    {
		mComponents[1] = tddOption;
	    }
	    
	    
	    
	    /**
	     * Define the ASN1 Type TddOption from ASN1 Module InformationElements.
	     * @see Choice
	     */
	    public static class TddOption extends Choice {
		
		/**
		 * The default constructor.
		 */
		public TddOption()
		{
		}
		
		public static final  int  tdd384_chosen = 1;
		public static final  int  tdd128_chosen = 2;
		
		// Methods for field "tdd384"
		public static TddOption createTddOptionWithTdd384(Tdd384 tdd384)
		{
		    TddOption __object = new TddOption();

		    __object.setTdd384(tdd384);
		    return __object;
		}
		
		public boolean hasTdd384()
		{
		    return getChosenFlag() == tdd384_chosen;
		}
		
		public void setTdd384(Tdd384 tdd384)
		{
		    setChosenValue(tdd384);
		    setChosenFlag(tdd384_chosen);
		}
		
		
		
		/**
		 * Define the ASN1 Type Tdd384 from ASN1 Module InformationElements.
		 * @see Sequence
		 */
		public static class Tdd384 extends Sequence {
		    
		    /**
		     * The default constructor.
		     */
		    public Tdd384()
		    {
		    }
		    
		    /**
		     * Construct with AbstractData components.
		     */
		    public Tdd384(IndividualTimeslotInfo individualTimeslotInfo)
		    {
			setIndividualTimeslotInfo(individualTimeslotInfo);
		    }
		    
		    public void initComponents()
		    {
			mComponents[0] = new IndividualTimeslotInfo();
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
				return new IndividualTimeslotInfo();
			    default:
				throw new InternalError("AbstractCollection.createInstance()");
			}
			
		    }
		    
		    
		    // Methods for field "individualTimeslotInfo"
		    public IndividualTimeslotInfo getIndividualTimeslotInfo()
		    {
			return (IndividualTimeslotInfo)mComponents[0];
		    }
		    
		    public void setIndividualTimeslotInfo(IndividualTimeslotInfo individualTimeslotInfo)
		    {
			mComponents[0] = individualTimeslotInfo;
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
			    "SecondaryCCPCH_Info_r4$ModeSpecificInfo$Tdd$TddOption$Tdd384"
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
						"IndividualTimeslotInfo"
					    ),
					    new QName (
						"InformationElements",
						"IndividualTimeslotInfo"
					    ),
					    12314,
					    null,
					    new FieldsRef (
						new QName (
						    "rrc.informationelements",
						    "IndividualTimeslotInfo"
						)
					    ),
					    0,
					    new TagDecodersRef (
						new QName (
						    "rrc.informationelements",
						    "IndividualTimeslotInfo"
						)
					    ),
					    0
					)
				    ),
				    "individualTimeslotInfo",
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
		     * Get the type descriptor (TypeInfo) of 'this' Tdd384 object.
		     */
		    public TypeInfo getTypeInfo()
		    {
			return c_typeinfo;
		    }
		    
		    /**
		     * Get the static type descriptor (TypeInfo) of 'this' Tdd384 object.
		     */
		    public static TypeInfo getStaticTypeInfo()
		    {
			return c_typeinfo;
		    }
		    
		} // End class definition for Tdd384

		// Methods for field "tdd128"
		public static TddOption createTddOptionWithTdd128(Tdd128 tdd128)
		{
		    TddOption __object = new TddOption();

		    __object.setTdd128(tdd128);
		    return __object;
		}
		
		public boolean hasTdd128()
		{
		    return getChosenFlag() == tdd128_chosen;
		}
		
		public void setTdd128(Tdd128 tdd128)
		{
		    setChosenValue(tdd128);
		    setChosenFlag(tdd128_chosen);
		}
		
		
		
		/**
		 * Define the ASN1 Type Tdd128 from ASN1 Module InformationElements.
		 * @see Sequence
		 */
		public static class Tdd128 extends Sequence {
		    
		    /**
		     * The default constructor.
		     */
		    public Tdd128()
		    {
		    }
		    
		    /**
		     * Construct with AbstractData components.
		     */
		    public Tdd128(IndividualTimeslotInfo_LCR_r4 individualTimeslotInfo)
		    {
			setIndividualTimeslotInfo(individualTimeslotInfo);
		    }
		    
		    public void initComponents()
		    {
			mComponents[0] = new IndividualTimeslotInfo_LCR_r4();
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
				return new IndividualTimeslotInfo_LCR_r4();
			    default:
				throw new InternalError("AbstractCollection.createInstance()");
			}
			
		    }
		    
		    
		    // Methods for field "individualTimeslotInfo"
		    public IndividualTimeslotInfo_LCR_r4 getIndividualTimeslotInfo()
		    {
			return (IndividualTimeslotInfo_LCR_r4)mComponents[0];
		    }
		    
		    public void setIndividualTimeslotInfo(IndividualTimeslotInfo_LCR_r4 individualTimeslotInfo)
		    {
			mComponents[0] = individualTimeslotInfo;
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
			    "SecondaryCCPCH_Info_r4$ModeSpecificInfo$Tdd$TddOption$Tdd128"
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
						"IndividualTimeslotInfo_LCR_r4"
					    ),
					    new QName (
						"InformationElements",
						"IndividualTimeslotInfo-LCR-r4"
					    ),
					    12314,
					    null,
					    new FieldsRef (
						new QName (
						    "rrc.informationelements",
						    "IndividualTimeslotInfo_LCR_r4"
						)
					    ),
					    0,
					    new TagDecodersRef (
						new QName (
						    "rrc.informationelements",
						    "IndividualTimeslotInfo_LCR_r4"
						)
					    ),
					    0
					)
				    ),
				    "individualTimeslotInfo",
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
		     * Get the type descriptor (TypeInfo) of 'this' Tdd128 object.
		     */
		    public TypeInfo getTypeInfo()
		    {
			return c_typeinfo;
		    }
		    
		    /**
		     * Get the static type descriptor (TypeInfo) of 'this' Tdd128 object.
		     */
		    public static TypeInfo getStaticTypeInfo()
		    {
			return c_typeinfo;
		    }
		    
		} // End class definition for Tdd128

		// Method to create a specific choice instance
		public AbstractData createInstance(int chosen)
		{
		    switch (chosen) {
			case tdd384_chosen:
			    return new Tdd384();
			case tdd128_chosen:
			    return new Tdd128();
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
			"SecondaryCCPCH_Info_r4$ModeSpecificInfo$Tdd$TddOption"
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
					"SecondaryCCPCH_Info_r4$ModeSpecificInfo$Tdd$TddOption$Tdd384"
				    )
				),
				"tdd384",
				0,
				2
			    ),
			    new FieldInfo (
				new TypeInfoRef (
				    new QName (
					"rrc.informationelements",
					"SecondaryCCPCH_Info_r4$ModeSpecificInfo$Tdd$TddOption$Tdd128"
				    )
				),
				"tdd128",
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
		 * Get the type descriptor (TypeInfo) of 'this' TddOption object.
		 */
		public TypeInfo getTypeInfo()
		{
		    return c_typeinfo;
		}
		
		/**
		 * Get the static type descriptor (TypeInfo) of 'this' TddOption object.
		 */
		public static TypeInfo getStaticTypeInfo()
		{
		    return c_typeinfo;
		}
		
	    } // End class definition for TddOption

	    // Methods for field "channelisationCode"
	    public SCCPCH_ChannelisationCodeList getChannelisationCode()
	    {
		return (SCCPCH_ChannelisationCodeList)mComponents[2];
	    }
	    
	    public void setChannelisationCode(SCCPCH_ChannelisationCodeList channelisationCode)
	    {
		mComponents[2] = channelisationCode;
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
		    "SecondaryCCPCH_Info_r4$ModeSpecificInfo$Tdd"
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
					"CommonTimeslotInfoSCCPCH"
				    ),
				    new QName (
					"InformationElements",
					"CommonTimeslotInfoSCCPCH"
				    ),
				    12314,
				    null,
				    new FieldsRef (
					new QName (
					    "rrc.informationelements",
					    "CommonTimeslotInfoSCCPCH"
					)
				    ),
				    0,
				    new TagDecodersRef (
					new QName (
					    "rrc.informationelements",
					    "CommonTimeslotInfoSCCPCH"
					)
				    ),
				    0
				)
			    ),
			    "commonTimeslotInfo",
			    0,
			    2,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "SecondaryCCPCH_Info_r4$ModeSpecificInfo$Tdd$TddOption"
				)
			    ),
			    "tddOption",
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
					"SCCPCH_ChannelisationCodeList"
				    ),
				    new QName (
					"InformationElements",
					"SCCPCH-ChannelisationCodeList"
				    ),
				    12314,
				    new SizeConstraint (
					new ValueRangeConstraint (
					    new AbstractBounds(
						new com.oss.asn1.INTEGER(1), 
						new com.oss.asn1.INTEGER(16),
						0
					    )
					)
				    ),
				    new Bounds (
					new java.lang.Long(1),
					new java.lang.Long(16)
				    ),
				    new TypeInfoRef (
					new QName (
					    "rrc.informationelements",
					    "SCCPCH_ChannelisationCode"
					)
				    )
				)
			    ),
			    "channelisationCode",
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
		"SecondaryCCPCH_Info_r4$ModeSpecificInfo"
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
				"SecondaryCCPCH_Info_r4$ModeSpecificInfo$Fdd"
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
				"SecondaryCCPCH_Info_r4$ModeSpecificInfo$Tdd"
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
	    "SecondaryCCPCH_Info_r4"
	),
	new QName (
	    "InformationElements",
	    "SecondaryCCPCH-Info-r4"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "SecondaryCCPCH_Info_r4$ModeSpecificInfo"
			)
		    ),
		    "modeSpecificInfo",
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
     * Get the type descriptor (TypeInfo) of 'this' SecondaryCCPCH_Info_r4 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' SecondaryCCPCH_Info_r4 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for SecondaryCCPCH_Info_r4
