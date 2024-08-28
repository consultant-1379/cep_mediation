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
 * Define the ASN1 Type Non_ScheduledTransGrantInfoTDD from ASN1 Module InformationElements.
 * @see Choice
 */

public class Non_ScheduledTransGrantInfoTDD extends Choice {
    
    /**
     * The default constructor.
     */
    public Non_ScheduledTransGrantInfoTDD()
    {
    }
    
    public static final  int  tdd384_768_chosen = 1;
    public static final  int  tdd128_chosen = 2;
    
    // Methods for field "tdd384_768"
    public static Non_ScheduledTransGrantInfoTDD createNon_ScheduledTransGrantInfoTDDWithTdd384_768(Tdd384_768 tdd384_768)
    {
	Non_ScheduledTransGrantInfoTDD __object = new Non_ScheduledTransGrantInfoTDD();

	__object.setTdd384_768(tdd384_768);
	return __object;
    }
    
    public boolean hasTdd384_768()
    {
	return getChosenFlag() == tdd384_768_chosen;
    }
    
    public void setTdd384_768(Tdd384_768 tdd384_768)
    {
	setChosenValue(tdd384_768);
	setChosenFlag(tdd384_768_chosen);
    }
    
    
    
    /**
     * Define the ASN1 Type Tdd384_768 from ASN1 Module InformationElements.
     * @see Sequence
     */
    public static class Tdd384_768 extends Sequence {
	
	/**
	 * The default constructor.
	 */
	public Tdd384_768()
	{
	}
	
	/**
	 * Construct with AbstractData components.
	 */
	public Tdd384_768(BitString timeslotResourceRelatedInfo, 
			INTEGER powerResourceRelatedInfo, 
			ActivationTime activationTime, 
			RepetitionPeriodAndLength repetitionPeriodAndLength, 
			UL_TS_ChannelisationCode codeResourceInfo)
	{
	    setTimeslotResourceRelatedInfo(timeslotResourceRelatedInfo);
	    setPowerResourceRelatedInfo(powerResourceRelatedInfo);
	    setActivationTime(activationTime);
	    setRepetitionPeriodAndLength(repetitionPeriodAndLength);
	    setCodeResourceInfo(codeResourceInfo);
	}
	
	/**
	 * Construct with components.
	 */
	public Tdd384_768(BitString timeslotResourceRelatedInfo, 
			long powerResourceRelatedInfo, 
			ActivationTime activationTime, 
			RepetitionPeriodAndLength repetitionPeriodAndLength, 
			UL_TS_ChannelisationCode codeResourceInfo)
	{
	    this(timeslotResourceRelatedInfo, 
		 new INTEGER(powerResourceRelatedInfo), activationTime, 
		 repetitionPeriodAndLength, codeResourceInfo);
	}
	
	/**
	 * Construct with required components.
	 */
	public Tdd384_768(BitString timeslotResourceRelatedInfo, 
			long powerResourceRelatedInfo, 
			ActivationTime activationTime, 
			UL_TS_ChannelisationCode codeResourceInfo)
	{
	    setTimeslotResourceRelatedInfo(timeslotResourceRelatedInfo);
	    setPowerResourceRelatedInfo(powerResourceRelatedInfo);
	    setActivationTime(activationTime);
	    setCodeResourceInfo(codeResourceInfo);
	}
	
	public void initComponents()
	{
	    mComponents[0] = new BitString();
	    mComponents[1] = new INTEGER();
	    mComponents[2] = new ActivationTime();
	    mComponents[3] = new RepetitionPeriodAndLength();
	    mComponents[4] = UL_TS_ChannelisationCode.cc1_1;
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
		    return new BitString();
		case 1:
		    return new INTEGER();
		case 2:
		    return new ActivationTime();
		case 3:
		    return new RepetitionPeriodAndLength();
		case 4:
		    return UL_TS_ChannelisationCode.cc1_1;
		default:
		    throw new InternalError("AbstractCollection.createInstance()");
	    }
	    
	}
	
	
	// Methods for field "timeslotResourceRelatedInfo"
	public BitString getTimeslotResourceRelatedInfo()
	{
	    return (BitString)mComponents[0];
	}
	
	public void setTimeslotResourceRelatedInfo(BitString timeslotResourceRelatedInfo)
	{
	    mComponents[0] = timeslotResourceRelatedInfo;
	}
	
	
	// Methods for field "powerResourceRelatedInfo"
	public long getPowerResourceRelatedInfo()
	{
	    return ((INTEGER)mComponents[1]).longValue();
	}
	
	public void setPowerResourceRelatedInfo(long powerResourceRelatedInfo)
	{
	    setPowerResourceRelatedInfo(new INTEGER(powerResourceRelatedInfo));
	}
	
	public void setPowerResourceRelatedInfo(INTEGER powerResourceRelatedInfo)
	{
	    mComponents[1] = powerResourceRelatedInfo;
	}
	
	
	// Methods for field "activationTime"
	public ActivationTime getActivationTime()
	{
	    return (ActivationTime)mComponents[2];
	}
	
	public void setActivationTime(ActivationTime activationTime)
	{
	    mComponents[2] = activationTime;
	}
	
	
	// Methods for field "repetitionPeriodAndLength"
	public RepetitionPeriodAndLength getRepetitionPeriodAndLength()
	{
	    return (RepetitionPeriodAndLength)mComponents[3];
	}
	
	public void setRepetitionPeriodAndLength(RepetitionPeriodAndLength repetitionPeriodAndLength)
	{
	    mComponents[3] = repetitionPeriodAndLength;
	}
	
	public boolean hasRepetitionPeriodAndLength()
	{
	    return componentIsPresent(3);
	}
	
	public void deleteRepetitionPeriodAndLength()
	{
	    setComponentAbsent(3);
	}
	
	
	// Methods for field "codeResourceInfo"
	public UL_TS_ChannelisationCode getCodeResourceInfo()
	{
	    return (UL_TS_ChannelisationCode)mComponents[4];
	}
	
	public void setCodeResourceInfo(UL_TS_ChannelisationCode codeResourceInfo)
	{
	    mComponents[4] = codeResourceInfo;
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
		"Non_ScheduledTransGrantInfoTDD$Tdd384_768"
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
			    new BitStringInfo (
				new Tags (
				    new short[] {
					(short)0x8000
				    }
				),
				new QName (
				    "com.oss.asn1",
				    "BitString"
				),
				new QName (
				    "builtin",
				    "BIT STRING"
				),
				12314,
				new SizeConstraint (
				    new SingleValueConstraint (
					new com.oss.asn1.INTEGER(13)
				    )
				),
				new Bounds (
				    new java.lang.Long(13),
				    new java.lang.Long(13)
				),
				null
			    )
			),
			"timeslotResourceRelatedInfo",
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
					new com.oss.asn1.INTEGER(1), 
					new com.oss.asn1.INTEGER(32),
					0
				    )
				),
				new Bounds (
				    new java.lang.Long(1),
				    new java.lang.Long(32)
				),
				null
			    )
			),
			"powerResourceRelatedInfo",
			1,
			2,
			null
		    ),
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new IntegerInfo (
				new Tags (
				    new short[] {
					(short)0x8002
				    }
				),
				new QName (
				    "rrc.informationelements",
				    "ActivationTime"
				),
				new QName (
				    "InformationElements",
				    "ActivationTime"
				),
				12314,
				new ValueRangeConstraint (
				    new AbstractBounds(
					new ActivationTime(0), 
					new ActivationTime(255),
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
			"activationTime",
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
				    "RepetitionPeriodAndLength"
				),
				new QName (
				    "InformationElements",
				    "RepetitionPeriodAndLength"
				),
				12314,
				null,
				new FieldsRef (
				    new QName (
					"rrc.informationelements",
					"RepetitionPeriodAndLength"
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
			"repetitionPeriodAndLength",
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
				    "UL_TS_ChannelisationCode"
				),
				new QName (
				    "InformationElements",
				    "UL-TS-ChannelisationCode"
				),
				12314,
				null,
				new MemberList (
				    new MemberListElement[] {
					new MemberListElement (
					    "cc1-1",
					    0
					),
					new MemberListElement (
					    "cc2-1",
					    1
					),
					new MemberListElement (
					    "cc2-2",
					    2
					),
					new MemberListElement (
					    "cc4-1",
					    3
					),
					new MemberListElement (
					    "cc4-2",
					    4
					),
					new MemberListElement (
					    "cc4-3",
					    5
					),
					new MemberListElement (
					    "cc4-4",
					    6
					),
					new MemberListElement (
					    "cc8-1",
					    7
					),
					new MemberListElement (
					    "cc8-2",
					    8
					),
					new MemberListElement (
					    "cc8-3",
					    9
					),
					new MemberListElement (
					    "cc8-4",
					    10
					),
					new MemberListElement (
					    "cc8-5",
					    11
					),
					new MemberListElement (
					    "cc8-6",
					    12
					),
					new MemberListElement (
					    "cc8-7",
					    13
					),
					new MemberListElement (
					    "cc8-8",
					    14
					),
					new MemberListElement (
					    "cc16-1",
					    15
					),
					new MemberListElement (
					    "cc16-2",
					    16
					),
					new MemberListElement (
					    "cc16-3",
					    17
					),
					new MemberListElement (
					    "cc16-4",
					    18
					),
					new MemberListElement (
					    "cc16-5",
					    19
					),
					new MemberListElement (
					    "cc16-6",
					    20
					),
					new MemberListElement (
					    "cc16-7",
					    21
					),
					new MemberListElement (
					    "cc16-8",
					    22
					),
					new MemberListElement (
					    "cc16-9",
					    23
					),
					new MemberListElement (
					    "cc16-10",
					    24
					),
					new MemberListElement (
					    "cc16-11",
					    25
					),
					new MemberListElement (
					    "cc16-12",
					    26
					),
					new MemberListElement (
					    "cc16-13",
					    27
					),
					new MemberListElement (
					    "cc16-14",
					    28
					),
					new MemberListElement (
					    "cc16-15",
					    29
					),
					new MemberListElement (
					    "cc16-16",
					    30
					)
				    }
				),
				0,
				UL_TS_ChannelisationCode.cc1_1
			    )
			),
			"codeResourceInfo",
			4,
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
	 * Get the type descriptor (TypeInfo) of 'this' Tdd384_768 object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Tdd384_768 object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Tdd384_768

    // Methods for field "tdd128"
    public static Non_ScheduledTransGrantInfoTDD createNon_ScheduledTransGrantInfoTDDWithTdd128(Tdd128 tdd128)
    {
	Non_ScheduledTransGrantInfoTDD __object = new Non_ScheduledTransGrantInfoTDD();

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
	public Tdd128(INTEGER n_E_UCCH, INTEGER n_E_HICH, 
			BitString timeslotResourceRelatedInfo, 
			INTEGER powerResourceRelatedInfo, 
			ActivationTime activationTime, INTEGER sfnNum, 
			RepetitionPeriodAndLength repetitionPeriodAndLength, 
			UL_TS_ChannelisationCode codeResourceInfo, 
			E_HICH_Info e_HICH_Info)
	{
	    setN_E_UCCH(n_E_UCCH);
	    setN_E_HICH(n_E_HICH);
	    setTimeslotResourceRelatedInfo(timeslotResourceRelatedInfo);
	    setPowerResourceRelatedInfo(powerResourceRelatedInfo);
	    setActivationTime(activationTime);
	    setSfnNum(sfnNum);
	    setRepetitionPeriodAndLength(repetitionPeriodAndLength);
	    setCodeResourceInfo(codeResourceInfo);
	    setE_HICH_Info(e_HICH_Info);
	}
	
	/**
	 * Construct with components.
	 */
	public Tdd128(long n_E_UCCH, long n_E_HICH, 
			BitString timeslotResourceRelatedInfo, 
			long powerResourceRelatedInfo, 
			ActivationTime activationTime, long sfnNum, 
			RepetitionPeriodAndLength repetitionPeriodAndLength, 
			UL_TS_ChannelisationCode codeResourceInfo, 
			E_HICH_Info e_HICH_Info)
	{
	    this(new INTEGER(n_E_UCCH), new INTEGER(n_E_HICH), 
		 timeslotResourceRelatedInfo, 
		 new INTEGER(powerResourceRelatedInfo), activationTime, 
		 new INTEGER(sfnNum), repetitionPeriodAndLength, 
		 codeResourceInfo, e_HICH_Info);
	}
	
	/**
	 * Construct with required components.
	 */
	public Tdd128(BitString timeslotResourceRelatedInfo, 
			long powerResourceRelatedInfo, 
			ActivationTime activationTime, long sfnNum, 
			UL_TS_ChannelisationCode codeResourceInfo, 
			E_HICH_Info e_HICH_Info)
	{
	    setTimeslotResourceRelatedInfo(timeslotResourceRelatedInfo);
	    setPowerResourceRelatedInfo(powerResourceRelatedInfo);
	    setActivationTime(activationTime);
	    setSfnNum(sfnNum);
	    setCodeResourceInfo(codeResourceInfo);
	    setE_HICH_Info(e_HICH_Info);
	}
	
	public void initComponents()
	{
	    mComponents[0] = new INTEGER();
	    mComponents[1] = new INTEGER();
	    mComponents[2] = new BitString();
	    mComponents[3] = new INTEGER();
	    mComponents[4] = new ActivationTime();
	    mComponents[5] = new INTEGER();
	    mComponents[6] = new RepetitionPeriodAndLength();
	    mComponents[7] = UL_TS_ChannelisationCode.cc1_1;
	    mComponents[8] = new E_HICH_Info();
	}
	
	// Instance initializer
	{
	    mComponents = new AbstractData[9];
	}
	
	// Method to create a specific component instance
	public AbstractData createInstance(int index)
	{
	    switch (index) {
		case 0:
		    return new INTEGER();
		case 1:
		    return new INTEGER();
		case 2:
		    return new BitString();
		case 3:
		    return new INTEGER();
		case 4:
		    return new ActivationTime();
		case 5:
		    return new INTEGER();
		case 6:
		    return new RepetitionPeriodAndLength();
		case 7:
		    return UL_TS_ChannelisationCode.cc1_1;
		case 8:
		    return new E_HICH_Info();
		default:
		    throw new InternalError("AbstractCollection.createInstance()");
	    }
	    
	}
	
	
	// Methods for field "n_E_UCCH"
	public long getN_E_UCCH()
	{
	    return ((INTEGER)mComponents[0]).longValue();
	}
	
	public void setN_E_UCCH(long n_E_UCCH)
	{
	    setN_E_UCCH(new INTEGER(n_E_UCCH));
	}
	
	public void setN_E_UCCH(INTEGER n_E_UCCH)
	{
	    mComponents[0] = n_E_UCCH;
	}
	
	public boolean hasN_E_UCCH()
	{
	    return componentIsPresent(0);
	}
	
	public void deleteN_E_UCCH()
	{
	    setComponentAbsent(0);
	}
	
	
	// Methods for field "n_E_HICH"
	public long getN_E_HICH()
	{
	    return ((INTEGER)mComponents[1]).longValue();
	}
	
	public void setN_E_HICH(long n_E_HICH)
	{
	    setN_E_HICH(new INTEGER(n_E_HICH));
	}
	
	public void setN_E_HICH(INTEGER n_E_HICH)
	{
	    mComponents[1] = n_E_HICH;
	}
	
	public boolean hasN_E_HICH()
	{
	    return componentIsPresent(1);
	}
	
	public void deleteN_E_HICH()
	{
	    setComponentAbsent(1);
	}
	
	
	// Methods for field "timeslotResourceRelatedInfo"
	public BitString getTimeslotResourceRelatedInfo()
	{
	    return (BitString)mComponents[2];
	}
	
	public void setTimeslotResourceRelatedInfo(BitString timeslotResourceRelatedInfo)
	{
	    mComponents[2] = timeslotResourceRelatedInfo;
	}
	
	
	// Methods for field "powerResourceRelatedInfo"
	public long getPowerResourceRelatedInfo()
	{
	    return ((INTEGER)mComponents[3]).longValue();
	}
	
	public void setPowerResourceRelatedInfo(long powerResourceRelatedInfo)
	{
	    setPowerResourceRelatedInfo(new INTEGER(powerResourceRelatedInfo));
	}
	
	public void setPowerResourceRelatedInfo(INTEGER powerResourceRelatedInfo)
	{
	    mComponents[3] = powerResourceRelatedInfo;
	}
	
	
	// Methods for field "activationTime"
	public ActivationTime getActivationTime()
	{
	    return (ActivationTime)mComponents[4];
	}
	
	public void setActivationTime(ActivationTime activationTime)
	{
	    mComponents[4] = activationTime;
	}
	
	
	// Methods for field "sfnNum"
	public long getSfnNum()
	{
	    return ((INTEGER)mComponents[5]).longValue();
	}
	
	public void setSfnNum(long sfnNum)
	{
	    setSfnNum(new INTEGER(sfnNum));
	}
	
	public void setSfnNum(INTEGER sfnNum)
	{
	    mComponents[5] = sfnNum;
	}
	
	
	// Methods for field "repetitionPeriodAndLength"
	public RepetitionPeriodAndLength getRepetitionPeriodAndLength()
	{
	    return (RepetitionPeriodAndLength)mComponents[6];
	}
	
	public void setRepetitionPeriodAndLength(RepetitionPeriodAndLength repetitionPeriodAndLength)
	{
	    mComponents[6] = repetitionPeriodAndLength;
	}
	
	public boolean hasRepetitionPeriodAndLength()
	{
	    return componentIsPresent(6);
	}
	
	public void deleteRepetitionPeriodAndLength()
	{
	    setComponentAbsent(6);
	}
	
	
	// Methods for field "codeResourceInfo"
	public UL_TS_ChannelisationCode getCodeResourceInfo()
	{
	    return (UL_TS_ChannelisationCode)mComponents[7];
	}
	
	public void setCodeResourceInfo(UL_TS_ChannelisationCode codeResourceInfo)
	{
	    mComponents[7] = codeResourceInfo;
	}
	
	
	// Methods for field "e_HICH_Info"
	public E_HICH_Info getE_HICH_Info()
	{
	    return (E_HICH_Info)mComponents[8];
	}
	
	public void setE_HICH_Info(E_HICH_Info e_HICH_Info)
	{
	    mComponents[8] = e_HICH_Info;
	}
	
	
	
	/**
	 * Define the ASN1 Type E_HICH_Info from ASN1 Module InformationElements.
	 * @see Sequence
	 */
	public static class E_HICH_Info extends Sequence {
	    
	    /**
	     * The default constructor.
	     */
	    public E_HICH_Info()
	    {
	    }
	    
	    /**
	     * Construct with AbstractData components.
	     */
	    public E_HICH_Info(TimeslotNumber_LCR_r4 timeslotNumber, 
			    HS_ChannelisationCode_LCR channelisation_Code, 
			    MidambleAllocationMode midambleAllocationMode, 
			    INTEGER midambleConfiguration, 
			    INTEGER signatureSequenceGroupIndex)
	    {
		setTimeslotNumber(timeslotNumber);
		setChannelisation_Code(channelisation_Code);
		setMidambleAllocationMode(midambleAllocationMode);
		setMidambleConfiguration(midambleConfiguration);
		setSignatureSequenceGroupIndex(signatureSequenceGroupIndex);
	    }
	    
	    /**
	     * Construct with components.
	     */
	    public E_HICH_Info(TimeslotNumber_LCR_r4 timeslotNumber, 
			    HS_ChannelisationCode_LCR channelisation_Code, 
			    MidambleAllocationMode midambleAllocationMode, 
			    long midambleConfiguration, 
			    long signatureSequenceGroupIndex)
	    {
		this(timeslotNumber, channelisation_Code, 
		     midambleAllocationMode, 
		     new INTEGER(midambleConfiguration), 
		     new INTEGER(signatureSequenceGroupIndex));
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new TimeslotNumber_LCR_r4();
		mComponents[1] = HS_ChannelisationCode_LCR.cc16_1;
		mComponents[2] = new MidambleAllocationMode();
		mComponents[3] = new INTEGER();
		mComponents[4] = new INTEGER();
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
			return HS_ChannelisationCode_LCR.cc16_1;
		    case 2:
			return new MidambleAllocationMode();
		    case 3:
			return new INTEGER();
		    case 4:
			return new INTEGER();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "timeslotNumber"
	    public TimeslotNumber_LCR_r4 getTimeslotNumber()
	    {
		return (TimeslotNumber_LCR_r4)mComponents[0];
	    }
	    
	    public void setTimeslotNumber(TimeslotNumber_LCR_r4 timeslotNumber)
	    {
		mComponents[0] = timeslotNumber;
	    }
	    
	    
	    // Methods for field "channelisation_Code"
	    public HS_ChannelisationCode_LCR getChannelisation_Code()
	    {
		return (HS_ChannelisationCode_LCR)mComponents[1];
	    }
	    
	    public void setChannelisation_Code(HS_ChannelisationCode_LCR channelisation_Code)
	    {
		mComponents[1] = channelisation_Code;
	    }
	    
	    
	    // Methods for field "midambleAllocationMode"
	    public MidambleAllocationMode getMidambleAllocationMode()
	    {
		return (MidambleAllocationMode)mComponents[2];
	    }
	    
	    public void setMidambleAllocationMode(MidambleAllocationMode midambleAllocationMode)
	    {
		mComponents[2] = midambleAllocationMode;
	    }
	    
	    
	    
	    /**
	     * Define the ASN1 Type MidambleAllocationMode from ASN1 Module InformationElements.
	     * @see Choice
	     */
	    public static class MidambleAllocationMode extends Choice {
		
		/**
		 * The default constructor.
		 */
		public MidambleAllocationMode()
		{
		}
		
		public static final  int  defaultMidamble_chosen = 1;
		public static final  int  ueSpecificMidamble_chosen = 2;
		
		// Methods for field "defaultMidamble"
		public static MidambleAllocationMode createMidambleAllocationModeWithDefaultMidamble(Null defaultMidamble)
		{
		    MidambleAllocationMode __object = new MidambleAllocationMode();

		    __object.setDefaultMidamble(defaultMidamble);
		    return __object;
		}
		
		public boolean hasDefaultMidamble()
		{
		    return getChosenFlag() == defaultMidamble_chosen;
		}
		
		public void setDefaultMidamble(Null defaultMidamble)
		{
		    setChosenValue(defaultMidamble);
		    setChosenFlag(defaultMidamble_chosen);
		}
		
		
		// Methods for field "ueSpecificMidamble"
		public static MidambleAllocationMode createMidambleAllocationModeWithUeSpecificMidamble(long ueSpecificMidamble)
		{
		    return createMidambleAllocationModeWithUeSpecificMidamble(new INTEGER(ueSpecificMidamble));
		}
		
		public static MidambleAllocationMode createMidambleAllocationModeWithUeSpecificMidamble(INTEGER ueSpecificMidamble)
		{
		    MidambleAllocationMode __object = new MidambleAllocationMode();

		    __object.setUeSpecificMidamble(ueSpecificMidamble);
		    return __object;
		}
		
		public boolean hasUeSpecificMidamble()
		{
		    return getChosenFlag() == ueSpecificMidamble_chosen;
		}
		
		public void setUeSpecificMidamble(long ueSpecificMidamble)
		{
		    setUeSpecificMidamble(new INTEGER(ueSpecificMidamble));
		}
		
		public void setUeSpecificMidamble(INTEGER ueSpecificMidamble)
		{
		    setChosenValue(ueSpecificMidamble);
		    setChosenFlag(ueSpecificMidamble_chosen);
		}
		
		
		// Method to create a specific choice instance
		public AbstractData createInstance(int chosen)
		{
		    switch (chosen) {
			case defaultMidamble_chosen:
			    return new Null();
			case ueSpecificMidamble_chosen:
			    return new INTEGER();
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
			"Non_ScheduledTransGrantInfoTDD$Tdd128$E_HICH_Info$MidambleAllocationMode"
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
				    new TypeInfo (
					new Tags (
					    new short[] {
						(short)0x8000
					    }
					),
					new QName (
					    "com.oss.asn1",
					    "Null"
					),
					new QName (
					    "builtin",
					    "NULL"
					),
					12314,
					null
				    )
				),
				"defaultMidamble",
				0,
				2
			    ),
			    new FieldInfo (
				new TypeInfoRef (
				    new IntegerInfo (
					new Tags (
					    new short[] {
						(short)0x8001
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
						new com.oss.asn1.INTEGER(15),
						0
					    )
					),
					new Bounds (
					    new java.lang.Long(0),
					    new java.lang.Long(15)
					),
					null
				    )
				),
				"ueSpecificMidamble",
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
		 * Get the type descriptor (TypeInfo) of 'this' MidambleAllocationMode object.
		 */
		public TypeInfo getTypeInfo()
		{
		    return c_typeinfo;
		}
		
		/**
		 * Get the static type descriptor (TypeInfo) of 'this' MidambleAllocationMode object.
		 */
		public static TypeInfo getStaticTypeInfo()
		{
		    return c_typeinfo;
		}
		
	    } // End class definition for MidambleAllocationMode

	    // Methods for field "midambleConfiguration"
	    public long getMidambleConfiguration()
	    {
		return ((INTEGER)mComponents[3]).longValue();
	    }
	    
	    public void setMidambleConfiguration(long midambleConfiguration)
	    {
		setMidambleConfiguration(new INTEGER(midambleConfiguration));
	    }
	    
	    public void setMidambleConfiguration(INTEGER midambleConfiguration)
	    {
		mComponents[3] = midambleConfiguration;
	    }
	    
	    
	    // Methods for field "signatureSequenceGroupIndex"
	    public long getSignatureSequenceGroupIndex()
	    {
		return ((INTEGER)mComponents[4]).longValue();
	    }
	    
	    public void setSignatureSequenceGroupIndex(long signatureSequenceGroupIndex)
	    {
		setSignatureSequenceGroupIndex(new INTEGER(signatureSequenceGroupIndex));
	    }
	    
	    public void setSignatureSequenceGroupIndex(INTEGER signatureSequenceGroupIndex)
	    {
		mComponents[4] = signatureSequenceGroupIndex;
	    }
	    
	    
	    /**
	     * Initialize the type descriptor.
	     */
	    private static final SequenceInfo c_typeinfo = new SequenceInfo (
		new Tags (
		    new short[] {
			(short)0x8008
		    }
		),
		new QName (
		    "rrc.informationelements",
		    "Non_ScheduledTransGrantInfoTDD$Tdd128$E_HICH_Info"
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
			    "timeslotNumber",
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
					"HS_ChannelisationCode_LCR"
				    ),
				    new QName (
					"InformationElements",
					"HS-ChannelisationCode-LCR"
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
				    HS_ChannelisationCode_LCR.cc16_1
				)
			    ),
			    "channelisation-Code",
			    1,
			    2,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "Non_ScheduledTransGrantInfoTDD$Tdd128$E_HICH_Info$MidambleAllocationMode"
				)
			    ),
			    "midambleAllocationMode",
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
					    new com.oss.asn1.INTEGER(1), 
					    new com.oss.asn1.INTEGER(8),
					    0
					)
				    ),
				    new Bounds (
					new java.lang.Long(1),
					new java.lang.Long(8)
				    ),
				    null
				)
			    ),
			    "midambleConfiguration",
			    3,
			    2,
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
					    new com.oss.asn1.INTEGER(19),
					    0
					)
				    ),
				    new Bounds (
					new java.lang.Long(0),
					new java.lang.Long(19)
				    ),
				    null
				)
			    ),
			    "signatureSequenceGroupIndex",
			    4,
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
	     * Get the type descriptor (TypeInfo) of 'this' E_HICH_Info object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' E_HICH_Info object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for E_HICH_Info

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
		"Non_ScheduledTransGrantInfoTDD$Tdd128"
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
					new com.oss.asn1.INTEGER(1), 
					new com.oss.asn1.INTEGER(8),
					0
				    )
				),
				new Bounds (
				    new java.lang.Long(1),
				    new java.lang.Long(8)
				),
				null
			    )
			),
			"n-E-UCCH",
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
					new com.oss.asn1.INTEGER(4), 
					new com.oss.asn1.INTEGER(15),
					0
				    )
				),
				new Bounds (
				    new java.lang.Long(4),
				    new java.lang.Long(15)
				),
				null
			    )
			),
			"n-E-HICH",
			1,
			3,
			null
		    ),
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new BitStringInfo (
				new Tags (
				    new short[] {
					(short)0x8002
				    }
				),
				new QName (
				    "com.oss.asn1",
				    "BitString"
				),
				new QName (
				    "builtin",
				    "BIT STRING"
				),
				12314,
				new SizeConstraint (
				    new SingleValueConstraint (
					new com.oss.asn1.INTEGER(5)
				    )
				),
				new Bounds (
				    new java.lang.Long(5),
				    new java.lang.Long(5)
				),
				null
			    )
			),
			"timeslotResourceRelatedInfo",
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
					new com.oss.asn1.INTEGER(1), 
					new com.oss.asn1.INTEGER(32),
					0
				    )
				),
				new Bounds (
				    new java.lang.Long(1),
				    new java.lang.Long(32)
				),
				null
			    )
			),
			"powerResourceRelatedInfo",
			3,
			2,
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
				    "rrc.informationelements",
				    "ActivationTime"
				),
				new QName (
				    "InformationElements",
				    "ActivationTime"
				),
				12314,
				new ValueRangeConstraint (
				    new AbstractBounds(
					new ActivationTime(0), 
					new ActivationTime(255),
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
			"activationTime",
			4,
			2,
			null
		    ),
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new IntegerInfo (
				new Tags (
				    new short[] {
					(short)0x8005
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
					new com.oss.asn1.INTEGER(1),
					0
				    )
				),
				new Bounds (
				    new java.lang.Long(0),
				    new java.lang.Long(1)
				),
				null
			    )
			),
			"sfnNum",
			5,
			2,
			null
		    ),
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new ChoiceInfo (
				new Tags (
				    new short[] {
					(short)0x8006
				    }
				),
				new QName (
				    "rrc.informationelements",
				    "RepetitionPeriodAndLength"
				),
				new QName (
				    "InformationElements",
				    "RepetitionPeriodAndLength"
				),
				12314,
				null,
				new FieldsRef (
				    new QName (
					"rrc.informationelements",
					"RepetitionPeriodAndLength"
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
			"repetitionPeriodAndLength",
			6,
			3,
			null
		    ),
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new EnumeratedInfo (
				new Tags (
				    new short[] {
					(short)0x8007
				    }
				),
				new QName (
				    "rrc.informationelements",
				    "UL_TS_ChannelisationCode"
				),
				new QName (
				    "InformationElements",
				    "UL-TS-ChannelisationCode"
				),
				12314,
				null,
				new MemberList (
				    new MemberListElement[] {
					new MemberListElement (
					    "cc1-1",
					    0
					),
					new MemberListElement (
					    "cc2-1",
					    1
					),
					new MemberListElement (
					    "cc2-2",
					    2
					),
					new MemberListElement (
					    "cc4-1",
					    3
					),
					new MemberListElement (
					    "cc4-2",
					    4
					),
					new MemberListElement (
					    "cc4-3",
					    5
					),
					new MemberListElement (
					    "cc4-4",
					    6
					),
					new MemberListElement (
					    "cc8-1",
					    7
					),
					new MemberListElement (
					    "cc8-2",
					    8
					),
					new MemberListElement (
					    "cc8-3",
					    9
					),
					new MemberListElement (
					    "cc8-4",
					    10
					),
					new MemberListElement (
					    "cc8-5",
					    11
					),
					new MemberListElement (
					    "cc8-6",
					    12
					),
					new MemberListElement (
					    "cc8-7",
					    13
					),
					new MemberListElement (
					    "cc8-8",
					    14
					),
					new MemberListElement (
					    "cc16-1",
					    15
					),
					new MemberListElement (
					    "cc16-2",
					    16
					),
					new MemberListElement (
					    "cc16-3",
					    17
					),
					new MemberListElement (
					    "cc16-4",
					    18
					),
					new MemberListElement (
					    "cc16-5",
					    19
					),
					new MemberListElement (
					    "cc16-6",
					    20
					),
					new MemberListElement (
					    "cc16-7",
					    21
					),
					new MemberListElement (
					    "cc16-8",
					    22
					),
					new MemberListElement (
					    "cc16-9",
					    23
					),
					new MemberListElement (
					    "cc16-10",
					    24
					),
					new MemberListElement (
					    "cc16-11",
					    25
					),
					new MemberListElement (
					    "cc16-12",
					    26
					),
					new MemberListElement (
					    "cc16-13",
					    27
					),
					new MemberListElement (
					    "cc16-14",
					    28
					),
					new MemberListElement (
					    "cc16-15",
					    29
					),
					new MemberListElement (
					    "cc16-16",
					    30
					)
				    }
				),
				0,
				UL_TS_ChannelisationCode.cc1_1
			    )
			),
			"codeResourceInfo",
			7,
			2,
			null
		    ),
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.informationelements",
				"Non_ScheduledTransGrantInfoTDD$Tdd128$E_HICH_Info"
			    )
			),
			"e-HICH-Info",
			8,
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
			    new TagDecoderElement((short)0x8006, 6),
			    new TagDecoderElement((short)0x8007, 7)
			}
		    ),
		    new TagDecoder (
			new TagDecoderElement[] {
			    new TagDecoderElement((short)0x8007, 7)
			}
		    ),
		    new TagDecoder (
			new TagDecoderElement[] {
			    new TagDecoderElement((short)0x8008, 8)
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
	    case tdd384_768_chosen:
		return new Tdd384_768();
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
	    null
	),
	new QName (
	    "rrc.informationelements",
	    "Non_ScheduledTransGrantInfoTDD"
	),
	new QName (
	    "InformationElements",
	    "Non-ScheduledTransGrantInfoTDD"
	),
	12314,
	null,
	new Fields (
	    new FieldInfo[] {
		new FieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "Non_ScheduledTransGrantInfoTDD$Tdd384_768"
			)
		    ),
		    "tdd384-768",
		    0,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "Non_ScheduledTransGrantInfoTDD$Tdd128"
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
     * Get the type descriptor (TypeInfo) of 'this' Non_ScheduledTransGrantInfoTDD object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' Non_ScheduledTransGrantInfoTDD object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for Non_ScheduledTransGrantInfoTDD
