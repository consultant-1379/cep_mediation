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
 * Define the ASN1 Type MBMS_MICHConfigurationInfo_r6 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class MBMS_MICHConfigurationInfo_r6 extends Sequence {
    
    /**
     * The default constructor.
     */
    public MBMS_MICHConfigurationInfo_r6()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public MBMS_MICHConfigurationInfo_r6(MBMS_MICHPowerOffset michPowerOffset, 
		    Mode mode)
    {
	setMichPowerOffset(michPowerOffset);
	setMode(mode);
    }
    
    public void initComponents()
    {
	mComponents[0] = new MBMS_MICHPowerOffset();
	mComponents[1] = new Mode();
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
		return new MBMS_MICHPowerOffset();
	    case 1:
		return new Mode();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "michPowerOffset"
    public MBMS_MICHPowerOffset getMichPowerOffset()
    {
	return (MBMS_MICHPowerOffset)mComponents[0];
    }
    
    public void setMichPowerOffset(MBMS_MICHPowerOffset michPowerOffset)
    {
	mComponents[0] = michPowerOffset;
    }
    
    
    // Methods for field "mode"
    public Mode getMode()
    {
	return (Mode)mComponents[1];
    }
    
    public void setMode(Mode mode)
    {
	mComponents[1] = mode;
    }
    
    
    
    /**
     * Define the ASN1 Type Mode from ASN1 Module InformationElements.
     * @see Choice
     */
    public static class Mode extends Choice {
	
	/**
	 * The default constructor.
	 */
	public Mode()
	{
	}
	
	public static final  int  fdd_chosen = 1;
	public static final  int  tdd384_chosen = 2;
	public static final  int  tdd128_chosen = 3;
	
	// Methods for field "fdd"
	public static Mode createModeWithFdd(Fdd fdd)
	{
	    Mode __object = new Mode();

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
	    public Fdd(ChannelisationCode256 channelisationCode256, 
			    MBMS_NI_CountPerFrame ni_CountPerFrame, 
			    BOOLEAN sttd_Indicator)
	    {
		setChannelisationCode256(channelisationCode256);
		setNi_CountPerFrame(ni_CountPerFrame);
		setSttd_Indicator(sttd_Indicator);
	    }
	    
	    /**
	     * Construct with components.
	     */
	    public Fdd(ChannelisationCode256 channelisationCode256, 
			    MBMS_NI_CountPerFrame ni_CountPerFrame, 
			    boolean sttd_Indicator)
	    {
		this(channelisationCode256, ni_CountPerFrame, 
		     new BOOLEAN(sttd_Indicator));
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new ChannelisationCode256();
		mComponents[1] = MBMS_NI_CountPerFrame.ni18;
		mComponents[2] = new BOOLEAN();
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
			return new ChannelisationCode256();
		    case 1:
			return MBMS_NI_CountPerFrame.ni18;
		    case 2:
			return new BOOLEAN();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "channelisationCode256"
	    public ChannelisationCode256 getChannelisationCode256()
	    {
		return (ChannelisationCode256)mComponents[0];
	    }
	    
	    public void setChannelisationCode256(ChannelisationCode256 channelisationCode256)
	    {
		mComponents[0] = channelisationCode256;
	    }
	    
	    
	    // Methods for field "ni_CountPerFrame"
	    public MBMS_NI_CountPerFrame getNi_CountPerFrame()
	    {
		return (MBMS_NI_CountPerFrame)mComponents[1];
	    }
	    
	    public void setNi_CountPerFrame(MBMS_NI_CountPerFrame ni_CountPerFrame)
	    {
		mComponents[1] = ni_CountPerFrame;
	    }
	    
	    
	    // Methods for field "sttd_Indicator"
	    public boolean getSttd_Indicator()
	    {
		return ((BOOLEAN)mComponents[2]).booleanValue();
	    }
	    
	    public void setSttd_Indicator(boolean sttd_Indicator)
	    {
		setSttd_Indicator(new BOOLEAN(sttd_Indicator));
	    }
	    
	    public void setSttd_Indicator(BOOLEAN sttd_Indicator)
	    {
		mComponents[2] = sttd_Indicator;
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
		    "MBMS_MICHConfigurationInfo_r6$Mode$Fdd"
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
					"ChannelisationCode256"
				    ),
				    new QName (
					"InformationElements",
					"ChannelisationCode256"
				    ),
				    12314,
				    new ValueRangeConstraint (
					new AbstractBounds(
					    new ChannelisationCode256(0), 
					    new ChannelisationCode256(255),
					    0
					)
				    ),
				    new Bounds (
					new java.lang.Long(0),
					new java.lang.Long(255)
				    ),
				    null
				)
			    ),
			    "channelisationCode256",
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
					"MBMS_NI_CountPerFrame"
				    ),
				    new QName (
					"InformationElements",
					"MBMS-NI-CountPerFrame"
				    ),
				    12314,
				    null,
				    new MemberList (
					new MemberListElement[] {
					    new MemberListElement (
						"ni18",
						0
					    ),
					    new MemberListElement (
						"ni36",
						1
					    ),
					    new MemberListElement (
						"ni72",
						2
					    ),
					    new MemberListElement (
						"ni144",
						3
					    )
					}
				    ),
				    0,
				    MBMS_NI_CountPerFrame.ni18
				)
			    ),
			    "ni-CountPerFrame",
			    1,
			    2,
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
			    "sttd-Indicator",
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

	// Methods for field "tdd384"
	public static Mode createModeWithTdd384(Tdd384 tdd384)
	{
	    Mode __object = new Mode();

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
	    public Tdd384(TimeslotNumber timeslot, 
			    MidambleShiftAndBurstType midambleShiftAndBurstType, 
			    DL_TS_ChannelisationCode channelisationCode, 
			    RepPerLengthOffset_MICH repetitionPeriodLengthOffset, 
			    MBMS_MICHNotificationIndLength mbmsNotificationIndLength)
	    {
		setTimeslot(timeslot);
		setMidambleShiftAndBurstType(midambleShiftAndBurstType);
		setChannelisationCode(channelisationCode);
		setRepetitionPeriodLengthOffset(repetitionPeriodLengthOffset);
		setMbmsNotificationIndLength(mbmsNotificationIndLength);
	    }
	    
	    /**
	     * Construct with required components.
	     */
	    public Tdd384(TimeslotNumber timeslot, 
			    MidambleShiftAndBurstType midambleShiftAndBurstType, 
			    DL_TS_ChannelisationCode channelisationCode)
	    {
		setTimeslot(timeslot);
		setMidambleShiftAndBurstType(midambleShiftAndBurstType);
		setChannelisationCode(channelisationCode);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new TimeslotNumber();
		mComponents[1] = new MidambleShiftAndBurstType();
		mComponents[2] = DL_TS_ChannelisationCode.cc16_1;
		mComponents[3] = new RepPerLengthOffset_MICH();
		mComponents[4] = MBMS_MICHNotificationIndLength.mn4;
	    }
	    
	    // Instance initializer
	    {
		mComponents = new AbstractData[5];
	    }
	    
	    // Method to create a specific component instance
	    public AbstractData createInstance(int index)
	    {
		switch (index) {
		    case 0:
			return new TimeslotNumber();
		    case 1:
			return new MidambleShiftAndBurstType();
		    case 2:
			return DL_TS_ChannelisationCode.cc16_1;
		    case 3:
			return new RepPerLengthOffset_MICH();
		    case 4:
			return MBMS_MICHNotificationIndLength.mn4;
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    // Default Values
	    public static final MBMS_MICHNotificationIndLength mbmsNotificationIndLength__default = 
		MBMS_MICHNotificationIndLength.mn4;
	    
	    // Methods for field "timeslot"
	    public TimeslotNumber getTimeslot()
	    {
		return (TimeslotNumber)mComponents[0];
	    }
	    
	    public void setTimeslot(TimeslotNumber timeslot)
	    {
		mComponents[0] = timeslot;
	    }
	    
	    
	    // Methods for field "midambleShiftAndBurstType"
	    public MidambleShiftAndBurstType getMidambleShiftAndBurstType()
	    {
		return (MidambleShiftAndBurstType)mComponents[1];
	    }
	    
	    public void setMidambleShiftAndBurstType(MidambleShiftAndBurstType midambleShiftAndBurstType)
	    {
		mComponents[1] = midambleShiftAndBurstType;
	    }
	    
	    
	    // Methods for field "channelisationCode"
	    public DL_TS_ChannelisationCode getChannelisationCode()
	    {
		return (DL_TS_ChannelisationCode)mComponents[2];
	    }
	    
	    public void setChannelisationCode(DL_TS_ChannelisationCode channelisationCode)
	    {
		mComponents[2] = channelisationCode;
	    }
	    
	    
	    // Methods for field "repetitionPeriodLengthOffset"
	    public RepPerLengthOffset_MICH getRepetitionPeriodLengthOffset()
	    {
		return (RepPerLengthOffset_MICH)mComponents[3];
	    }
	    
	    public void setRepetitionPeriodLengthOffset(RepPerLengthOffset_MICH repetitionPeriodLengthOffset)
	    {
		mComponents[3] = repetitionPeriodLengthOffset;
	    }
	    
	    public boolean hasRepetitionPeriodLengthOffset()
	    {
		return componentIsPresent(3);
	    }
	    
	    public void deleteRepetitionPeriodLengthOffset()
	    {
		setComponentAbsent(3);
	    }
	    
	    
	    // Methods for field "mbmsNotificationIndLength"
	    public MBMS_MICHNotificationIndLength getMbmsNotificationIndLength()
	    {
		if (hasMbmsNotificationIndLength())
		    return (MBMS_MICHNotificationIndLength)mComponents[4];
		else
		    return (MBMS_MICHNotificationIndLength)mbmsNotificationIndLength__default.clone();
	    }
	    
	    public void setMbmsNotificationIndLength(MBMS_MICHNotificationIndLength mbmsNotificationIndLength)
	    {
		mComponents[4] = mbmsNotificationIndLength;
	    }
	    
	    public void setMbmsNotificationIndLengthToDefault()
	    {
		setMbmsNotificationIndLength(mbmsNotificationIndLength__default);
	    }
	    
	    public boolean hasDefaultMbmsNotificationIndLength()
	    {
		return true;
	    }
	    
	    public boolean hasMbmsNotificationIndLength()
	    {
		return componentIsPresent(4);
	    }
	    
	    public void deleteMbmsNotificationIndLength()
	    {
		setComponentAbsent(4);
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
		    "MBMS_MICHConfigurationInfo_r6$Mode$Tdd384"
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
					"TimeslotNumber"
				    ),
				    new QName (
					"InformationElements",
					"TimeslotNumber"
				    ),
				    12314,
				    new ValueRangeConstraint (
					new AbstractBounds(
					    new TimeslotNumber(0), 
					    new TimeslotNumber(14),
					    0
					)
				    ),
				    new Bounds (
					new java.lang.Long(0),
					new java.lang.Long(14)
				    ),
				    null
				)
			    ),
			    "timeslot",
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
					"MidambleShiftAndBurstType"
				    ),
				    new QName (
					"InformationElements",
					"MidambleShiftAndBurstType"
				    ),
				    12314,
				    null,
				    new FieldsRef (
					new QName (
					    "rrc.informationelements",
					    "MidambleShiftAndBurstType"
					)
				    ),
				    0,
				    new TagDecodersRef (
					new QName (
					    "rrc.informationelements",
					    "MidambleShiftAndBurstType"
					)
				    ),
				    0
				)
			    ),
			    "midambleShiftAndBurstType",
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
					"DL_TS_ChannelisationCode"
				    ),
				    new QName (
					"InformationElements",
					"DL-TS-ChannelisationCode"
				    ),
				    12314,
				    null,
				    new MemberList (
					new MemberListElement[] {
					    new MemberListElement (
						"cc16-1",
						0
					    ),
					    new MemberListElement (
						"cc16-2",
						1
					    ),
					    new MemberListElement (
						"cc16-3",
						2
					    ),
					    new MemberListElement (
						"cc16-4",
						3
					    ),
					    new MemberListElement (
						"cc16-5",
						4
					    ),
					    new MemberListElement (
						"cc16-6",
						5
					    ),
					    new MemberListElement (
						"cc16-7",
						6
					    ),
					    new MemberListElement (
						"cc16-8",
						7
					    ),
					    new MemberListElement (
						"cc16-9",
						8
					    ),
					    new MemberListElement (
						"cc16-10",
						9
					    ),
					    new MemberListElement (
						"cc16-11",
						10
					    ),
					    new MemberListElement (
						"cc16-12",
						11
					    ),
					    new MemberListElement (
						"cc16-13",
						12
					    ),
					    new MemberListElement (
						"cc16-14",
						13
					    ),
					    new MemberListElement (
						"cc16-15",
						14
					    ),
					    new MemberListElement (
						"cc16-16",
						15
					    )
					}
				    ),
				    0,
				    DL_TS_ChannelisationCode.cc16_1
				)
			    ),
			    "channelisationCode",
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
					"RepPerLengthOffset_MICH"
				    ),
				    new QName (
					"InformationElements",
					"RepPerLengthOffset-MICH"
				    ),
				    12314,
				    null,
				    new FieldsRef (
					new QName (
					    "rrc.informationelements",
					    "RepPerLengthOffset_MICH"
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
					    new TagDecoderElement((short)0x8006, 6),
					    new TagDecoderElement((short)0x8007, 7),
					    new TagDecoderElement((short)0x8008, 8)
					}
				    )
				)
			    ),
			    "repetitionPeriodLengthOffset",
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
					"MBMS_MICHNotificationIndLength"
				    ),
				    new QName (
					"InformationElements",
					"MBMS-MICHNotificationIndLength"
				    ),
				    12314,
				    null,
				    new MemberList (
					new MemberListElement[] {
					    new MemberListElement (
						"mn4",
						0
					    ),
					    new MemberListElement (
						"mn8",
						1
					    ),
					    new MemberListElement (
						"mn16",
						2
					    )
					}
				    ),
				    0,
				    MBMS_MICHNotificationIndLength.mn4
				)
			    ),
			    "mbmsNotificationIndLength",
			    4,
			    3,
			    mbmsNotificationIndLength__default
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
				new TagDecoderElement((short)0x8003, 3),
				new TagDecoderElement((short)0x8004, 4)
			    }
			),
			new TagDecoder (
			    new TagDecoderElement[] {
				new TagDecoderElement((short)0x8004, 4)
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
	public static Mode createModeWithTdd128(Tdd128 tdd128)
	{
	    Mode __object = new Mode();

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
	    public Tdd128(TimeslotNumber_LCR_r4 timeslot, 
			    MidambleShiftAndBurstType_LCR_r4 midambleShiftAndBurstType, 
			    ChannelisationCodeList channelisationCodeList, 
			    RepPerLengthOffset_MICH repetitionPeriodLengthOffset, 
			    MBMS_MICHNotificationIndLength mbmsNotificationIndLength)
	    {
		setTimeslot(timeslot);
		setMidambleShiftAndBurstType(midambleShiftAndBurstType);
		setChannelisationCodeList(channelisationCodeList);
		setRepetitionPeriodLengthOffset(repetitionPeriodLengthOffset);
		setMbmsNotificationIndLength(mbmsNotificationIndLength);
	    }
	    
	    /**
	     * Construct with required components.
	     */
	    public Tdd128(TimeslotNumber_LCR_r4 timeslot, 
			    MidambleShiftAndBurstType_LCR_r4 midambleShiftAndBurstType, 
			    ChannelisationCodeList channelisationCodeList)
	    {
		setTimeslot(timeslot);
		setMidambleShiftAndBurstType(midambleShiftAndBurstType);
		setChannelisationCodeList(channelisationCodeList);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new TimeslotNumber_LCR_r4();
		mComponents[1] = new MidambleShiftAndBurstType_LCR_r4();
		mComponents[2] = new ChannelisationCodeList();
		mComponents[3] = new RepPerLengthOffset_MICH();
		mComponents[4] = MBMS_MICHNotificationIndLength.mn4;
	    }
	    
	    // Instance initializer
	    {
		mComponents = new AbstractData[5];
	    }
	    
	    // Method to create a specific component instance
	    public AbstractData createInstance(int index)
	    {
		switch (index) {
		    case 0:
			return new TimeslotNumber_LCR_r4();
		    case 1:
			return new MidambleShiftAndBurstType_LCR_r4();
		    case 2:
			return new ChannelisationCodeList();
		    case 3:
			return new RepPerLengthOffset_MICH();
		    case 4:
			return MBMS_MICHNotificationIndLength.mn4;
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    // Default Values
	    public static final MBMS_MICHNotificationIndLength mbmsNotificationIndLength__default = 
		MBMS_MICHNotificationIndLength.mn4;
	    
	    // Methods for field "timeslot"
	    public TimeslotNumber_LCR_r4 getTimeslot()
	    {
		return (TimeslotNumber_LCR_r4)mComponents[0];
	    }
	    
	    public void setTimeslot(TimeslotNumber_LCR_r4 timeslot)
	    {
		mComponents[0] = timeslot;
	    }
	    
	    
	    // Methods for field "midambleShiftAndBurstType"
	    public MidambleShiftAndBurstType_LCR_r4 getMidambleShiftAndBurstType()
	    {
		return (MidambleShiftAndBurstType_LCR_r4)mComponents[1];
	    }
	    
	    public void setMidambleShiftAndBurstType(MidambleShiftAndBurstType_LCR_r4 midambleShiftAndBurstType)
	    {
		mComponents[1] = midambleShiftAndBurstType;
	    }
	    
	    
	    // Methods for field "channelisationCodeList"
	    public ChannelisationCodeList getChannelisationCodeList()
	    {
		return (ChannelisationCodeList)mComponents[2];
	    }
	    
	    public void setChannelisationCodeList(ChannelisationCodeList channelisationCodeList)
	    {
		mComponents[2] = channelisationCodeList;
	    }
	    
	    
	    
	    /**
	     * Define the ASN1 Type ChannelisationCodeList from ASN1 Module InformationElements.
	     * @see SequenceOf
	     */
	    public static class ChannelisationCodeList extends SequenceOf {
		
		/**
		 * The default constructor.
		 */
		public ChannelisationCodeList()
		{
		}
		
		/**
		 * Construct from an array of components.
		 */
		public ChannelisationCodeList(DL_TS_ChannelisationCode[] elements)
		{
		    super(elements);
		}
		
		/**
		 * Add an Element to the SEQUENCE OF/SET OF.
		 */
		public synchronized void add(DL_TS_ChannelisationCode element)
		{
		    super.addElement(element);
		}
		
		/**
		 * Set an Element in the SEQUENCE OF/SET OF.
		 */
		public synchronized void set(DL_TS_ChannelisationCode element, int atIndex)
		{
		    super.setElement(element, atIndex);
		}
		
		/**
		 * Get an Element from the SEQUENCE OF/SET OF.
		 */
		public synchronized DL_TS_ChannelisationCode get(int atIndex)
		{
		    return (DL_TS_ChannelisationCode)super.getElement(atIndex);
		}
		
		/**
		 * Insert an Element into the SEQUENCE OF/SET OF.
		 */
		public synchronized void insert(DL_TS_ChannelisationCode element, int atIndex)
		{
		    super.insertElement(element, atIndex);
		}
		
		/**
		 * Remove an Element from the SEQUENCE OF/SET OF.
		 */
		public synchronized void remove(DL_TS_ChannelisationCode element)
		{
		    super.removeElement(element);
		}
		
		/**
		 * Create an instance of  SEQUENCE OF/SET OF.
		 */
		public AbstractData createInstance()
		{
		    return DL_TS_ChannelisationCode.cc16_1;
		}
		
		/**
		 * Initialize the type descriptor.
		 */
		private static final ContainerInfo c_typeinfo = new ContainerInfo (
		    new Tags (
			new short[] {
			    (short)0x8002
			}
		    ),
		    new QName (
			"rrc.informationelements",
			"MBMS_MICHConfigurationInfo_r6$Mode$Tdd128$ChannelisationCodeList"
		    ),
		    new QName (
			"builtin",
			"SEQUENCE OF"
		    ),
		    12314,
		    new SizeConstraint (
			new ValueRangeConstraint (
			    new AbstractBounds(
				new com.oss.asn1.INTEGER(1), 
				new com.oss.asn1.INTEGER(2),
				0
			    )
			)
		    ),
		    new Bounds (
			new java.lang.Long(1),
			new java.lang.Long(2)
		    ),
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "DL_TS_ChannelisationCode"
			)
		    )
		);
		
		/**
		 * Get the type descriptor (TypeInfo) of 'this' ChannelisationCodeList object.
		 */
		public TypeInfo getTypeInfo()
		{
		    return c_typeinfo;
		}
		
		/**
		 * Get the static type descriptor (TypeInfo) of 'this' ChannelisationCodeList object.
		 */
		public static TypeInfo getStaticTypeInfo()
		{
		    return c_typeinfo;
		}
		
	    } // End class definition for ChannelisationCodeList

	    // Methods for field "repetitionPeriodLengthOffset"
	    public RepPerLengthOffset_MICH getRepetitionPeriodLengthOffset()
	    {
		return (RepPerLengthOffset_MICH)mComponents[3];
	    }
	    
	    public void setRepetitionPeriodLengthOffset(RepPerLengthOffset_MICH repetitionPeriodLengthOffset)
	    {
		mComponents[3] = repetitionPeriodLengthOffset;
	    }
	    
	    public boolean hasRepetitionPeriodLengthOffset()
	    {
		return componentIsPresent(3);
	    }
	    
	    public void deleteRepetitionPeriodLengthOffset()
	    {
		setComponentAbsent(3);
	    }
	    
	    
	    // Methods for field "mbmsNotificationIndLength"
	    public MBMS_MICHNotificationIndLength getMbmsNotificationIndLength()
	    {
		if (hasMbmsNotificationIndLength())
		    return (MBMS_MICHNotificationIndLength)mComponents[4];
		else
		    return (MBMS_MICHNotificationIndLength)mbmsNotificationIndLength__default.clone();
	    }
	    
	    public void setMbmsNotificationIndLength(MBMS_MICHNotificationIndLength mbmsNotificationIndLength)
	    {
		mComponents[4] = mbmsNotificationIndLength;
	    }
	    
	    public void setMbmsNotificationIndLengthToDefault()
	    {
		setMbmsNotificationIndLength(mbmsNotificationIndLength__default);
	    }
	    
	    public boolean hasDefaultMbmsNotificationIndLength()
	    {
		return true;
	    }
	    
	    public boolean hasMbmsNotificationIndLength()
	    {
		return componentIsPresent(4);
	    }
	    
	    public void deleteMbmsNotificationIndLength()
	    {
		setComponentAbsent(4);
	    }
	    
	    
	    /**
	     * Initialize the type descriptor.
	     */
	    private static final SequenceInfo c_typeinfo = new SequenceInfo (
		new Tags (
		    new short[] {
			(short)0x8002
		    }
		),
		new QName (
		    "rrc.informationelements",
		    "MBMS_MICHConfigurationInfo_r6$Mode$Tdd128"
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
					"TimeslotNumber_LCR_r4"
				    ),
				    new QName (
					"InformationElements",
					"TimeslotNumber-LCR-r4"
				    ),
				    12314,
				    new ValueRangeConstraint (
					new AbstractBounds(
					    new TimeslotNumber_LCR_r4(0), 
					    new TimeslotNumber_LCR_r4(6),
					    0
					)
				    ),
				    new Bounds (
					new java.lang.Long(0),
					new java.lang.Long(6)
				    ),
				    null
				)
			    ),
			    "timeslot",
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
					"MidambleShiftAndBurstType_LCR_r4"
				    ),
				    new QName (
					"InformationElements",
					"MidambleShiftAndBurstType-LCR-r4"
				    ),
				    12314,
				    null,
				    new FieldsRef (
					new QName (
					    "rrc.informationelements",
					    "MidambleShiftAndBurstType_LCR_r4"
					)
				    ),
				    0,
				    new TagDecodersRef (
					new QName (
					    "rrc.informationelements",
					    "MidambleShiftAndBurstType_LCR_r4"
					)
				    ),
				    0
				)
			    ),
			    "midambleShiftAndBurstType",
			    1,
			    2,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "MBMS_MICHConfigurationInfo_r6$Mode$Tdd128$ChannelisationCodeList"
				)
			    ),
			    "channelisationCodeList",
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
					"RepPerLengthOffset_MICH"
				    ),
				    new QName (
					"InformationElements",
					"RepPerLengthOffset-MICH"
				    ),
				    12314,
				    null,
				    new FieldsRef (
					new QName (
					    "rrc.informationelements",
					    "RepPerLengthOffset_MICH"
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
					    new TagDecoderElement((short)0x8006, 6),
					    new TagDecoderElement((short)0x8007, 7),
					    new TagDecoderElement((short)0x8008, 8)
					}
				    )
				)
			    ),
			    "repetitionPeriodLengthOffset",
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
					"MBMS_MICHNotificationIndLength"
				    ),
				    new QName (
					"InformationElements",
					"MBMS-MICHNotificationIndLength"
				    ),
				    12314,
				    null,
				    new MemberList (
					new MemberListElement[] {
					    new MemberListElement (
						"mn4",
						0
					    ),
					    new MemberListElement (
						"mn8",
						1
					    ),
					    new MemberListElement (
						"mn16",
						2
					    )
					}
				    ),
				    0,
				    MBMS_MICHNotificationIndLength.mn4
				)
			    ),
			    "mbmsNotificationIndLength",
			    4,
			    3,
			    mbmsNotificationIndLength__default
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
				new TagDecoderElement((short)0x8003, 3),
				new TagDecoderElement((short)0x8004, 4)
			    }
			),
			new TagDecoder (
			    new TagDecoderElement[] {
				new TagDecoderElement((short)0x8004, 4)
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
		case fdd_chosen:
		    return new Fdd();
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
		"MBMS_MICHConfigurationInfo_r6$Mode"
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
				"MBMS_MICHConfigurationInfo_r6$Mode$Fdd"
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
				"MBMS_MICHConfigurationInfo_r6$Mode$Tdd384"
			    )
			),
			"tdd384",
			1,
			2
		    ),
		    new FieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.informationelements",
				"MBMS_MICHConfigurationInfo_r6$Mode$Tdd128"
			    )
			),
			"tdd128",
			2,
			2
		    )
		}
	    ),
	    0,
	    new TagDecoder (
		new TagDecoderElement[] {
		    new TagDecoderElement((short)0x8000, 0),
		    new TagDecoderElement((short)0x8001, 1),
		    new TagDecoderElement((short)0x8002, 2)
		}
	    )
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' Mode object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Mode object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Mode

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
	    "MBMS_MICHConfigurationInfo_r6"
	),
	new QName (
	    "InformationElements",
	    "MBMS-MICHConfigurationInfo-r6"
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
				"MBMS_MICHPowerOffset"
			    ),
			    new QName (
				"InformationElements",
				"MBMS-MICHPowerOffset"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new MBMS_MICHPowerOffset(-10), 
				    new MBMS_MICHPowerOffset(5),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(-10),
				new java.lang.Long(5)
			    ),
			    null
			)
		    ),
		    "michPowerOffset",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "MBMS_MICHConfigurationInfo_r6$Mode"
			)
		    ),
		    "mode",
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
			new TagDecoderElement((short)0x8000, 0)
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
     * Get the type descriptor (TypeInfo) of 'this' MBMS_MICHConfigurationInfo_r6 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' MBMS_MICHConfigurationInfo_r6 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for MBMS_MICHConfigurationInfo_r6
