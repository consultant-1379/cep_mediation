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
 * Define the ASN1 Type PICH_Info from ASN1 Module InformationElements.
 * @see Choice
 */

public class PICH_Info extends Choice {
    
    /**
     * The default constructor.
     */
    public PICH_Info()
    {
    }
    
    public static final  int  fdd_chosen = 1;
    public static final  int  tdd_chosen = 2;
    
    // Methods for field "fdd"
    public static PICH_Info createPICH_InfoWithFdd(Fdd fdd)
    {
	PICH_Info __object = new PICH_Info();

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
			PI_CountPerFrame pi_CountPerFrame, 
			BOOLEAN sttd_Indicator)
	{
	    setChannelisationCode256(channelisationCode256);
	    setPi_CountPerFrame(pi_CountPerFrame);
	    setSttd_Indicator(sttd_Indicator);
	}
	
	/**
	 * Construct with components.
	 */
	public Fdd(ChannelisationCode256 channelisationCode256, 
			PI_CountPerFrame pi_CountPerFrame, 
			boolean sttd_Indicator)
	{
	    this(channelisationCode256, pi_CountPerFrame, 
		 new BOOLEAN(sttd_Indicator));
	}
	
	public void initComponents()
	{
	    mComponents[0] = new ChannelisationCode256();
	    mComponents[1] = PI_CountPerFrame.e18;
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
		    return PI_CountPerFrame.e18;
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
	
	
	// Methods for field "pi_CountPerFrame"
	public PI_CountPerFrame getPi_CountPerFrame()
	{
	    return (PI_CountPerFrame)mComponents[1];
	}
	
	public void setPi_CountPerFrame(PI_CountPerFrame pi_CountPerFrame)
	{
	    mComponents[1] = pi_CountPerFrame;
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
		"PICH_Info$Fdd"
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
				    "PI_CountPerFrame"
				),
				new QName (
				    "InformationElements",
				    "PI-CountPerFrame"
				),
				12314,
				null,
				new MemberList (
				    new MemberListElement[] {
					new MemberListElement (
					    "e18",
					    0
					),
					new MemberListElement (
					    "e36",
					    1
					),
					new MemberListElement (
					    "e72",
					    2
					),
					new MemberListElement (
					    "e144",
					    3
					)
				    }
				),
				0,
				PI_CountPerFrame.e18
			    )
			),
			"pi-CountPerFrame",
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

    // Methods for field "tdd"
    public static PICH_Info createPICH_InfoWithTdd(Tdd tdd)
    {
	PICH_Info __object = new PICH_Info();

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
	public Tdd(TDD_PICH_CCode channelisationCode, TimeslotNumber timeslot, 
			MidambleShiftAndBurstType midambleShiftAndBurstType, 
			RepPerLengthOffset_PICH repetitionPeriodLengthOffset, 
			PagingIndicatorLength pagingIndicatorLength, 
			N_GAP n_GAP, N_PCH n_PCH)
	{
	    setChannelisationCode(channelisationCode);
	    setTimeslot(timeslot);
	    setMidambleShiftAndBurstType(midambleShiftAndBurstType);
	    setRepetitionPeriodLengthOffset(repetitionPeriodLengthOffset);
	    setPagingIndicatorLength(pagingIndicatorLength);
	    setN_GAP(n_GAP);
	    setN_PCH(n_PCH);
	}
	
	/**
	 * Construct with required components.
	 */
	public Tdd(MidambleShiftAndBurstType midambleShiftAndBurstType)
	{
	    setMidambleShiftAndBurstType(midambleShiftAndBurstType);
	}
	
	public void initComponents()
	{
	    mComponents[0] = TDD_PICH_CCode.cc16_1;
	    mComponents[1] = new TimeslotNumber();
	    mComponents[2] = new MidambleShiftAndBurstType();
	    mComponents[3] = new RepPerLengthOffset_PICH();
	    mComponents[4] = PagingIndicatorLength.pi4;
	    mComponents[5] = N_GAP.f2;
	    mComponents[6] = new N_PCH();
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
		    return TDD_PICH_CCode.cc16_1;
		case 1:
		    return new TimeslotNumber();
		case 2:
		    return new MidambleShiftAndBurstType();
		case 3:
		    return new RepPerLengthOffset_PICH();
		case 4:
		    return PagingIndicatorLength.pi4;
		case 5:
		    return N_GAP.f2;
		case 6:
		    return new N_PCH();
		default:
		    throw new InternalError("AbstractCollection.createInstance()");
	    }
	    
	}
	
	// Default Values
	public static final PagingIndicatorLength pagingIndicatorLength__default = 
	    PagingIndicatorLength.pi4;
	public static final N_GAP n_GAP__default = 
	    N_GAP.f4;
	public static final N_PCH n_PCH__default = 
	    new N_PCH(2);
	
	// Methods for field "channelisationCode"
	public TDD_PICH_CCode getChannelisationCode()
	{
	    return (TDD_PICH_CCode)mComponents[0];
	}
	
	public void setChannelisationCode(TDD_PICH_CCode channelisationCode)
	{
	    mComponents[0] = channelisationCode;
	}
	
	public boolean hasChannelisationCode()
	{
	    return componentIsPresent(0);
	}
	
	public void deleteChannelisationCode()
	{
	    setComponentAbsent(0);
	}
	
	
	// Methods for field "timeslot"
	public TimeslotNumber getTimeslot()
	{
	    return (TimeslotNumber)mComponents[1];
	}
	
	public void setTimeslot(TimeslotNumber timeslot)
	{
	    mComponents[1] = timeslot;
	}
	
	public boolean hasTimeslot()
	{
	    return componentIsPresent(1);
	}
	
	public void deleteTimeslot()
	{
	    setComponentAbsent(1);
	}
	
	
	// Methods for field "midambleShiftAndBurstType"
	public MidambleShiftAndBurstType getMidambleShiftAndBurstType()
	{
	    return (MidambleShiftAndBurstType)mComponents[2];
	}
	
	public void setMidambleShiftAndBurstType(MidambleShiftAndBurstType midambleShiftAndBurstType)
	{
	    mComponents[2] = midambleShiftAndBurstType;
	}
	
	
	// Methods for field "repetitionPeriodLengthOffset"
	public RepPerLengthOffset_PICH getRepetitionPeriodLengthOffset()
	{
	    return (RepPerLengthOffset_PICH)mComponents[3];
	}
	
	public void setRepetitionPeriodLengthOffset(RepPerLengthOffset_PICH repetitionPeriodLengthOffset)
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
	
	
	// Methods for field "pagingIndicatorLength"
	public PagingIndicatorLength getPagingIndicatorLength()
	{
	    if (hasPagingIndicatorLength())
		return (PagingIndicatorLength)mComponents[4];
	    else
		return (PagingIndicatorLength)pagingIndicatorLength__default.clone();
	}
	
	public void setPagingIndicatorLength(PagingIndicatorLength pagingIndicatorLength)
	{
	    mComponents[4] = pagingIndicatorLength;
	}
	
	public void setPagingIndicatorLengthToDefault()
	{
	    setPagingIndicatorLength(pagingIndicatorLength__default);
	}
	
	public boolean hasDefaultPagingIndicatorLength()
	{
	    return true;
	}
	
	public boolean hasPagingIndicatorLength()
	{
	    return componentIsPresent(4);
	}
	
	public void deletePagingIndicatorLength()
	{
	    setComponentAbsent(4);
	}
	
	
	// Methods for field "n_GAP"
	public N_GAP getN_GAP()
	{
	    if (hasN_GAP())
		return (N_GAP)mComponents[5];
	    else
		return (N_GAP)n_GAP__default.clone();
	}
	
	public void setN_GAP(N_GAP n_GAP)
	{
	    mComponents[5] = n_GAP;
	}
	
	public void setN_GAPToDefault()
	{
	    setN_GAP(n_GAP__default);
	}
	
	public boolean hasDefaultN_GAP()
	{
	    return true;
	}
	
	public boolean hasN_GAP()
	{
	    return componentIsPresent(5);
	}
	
	public void deleteN_GAP()
	{
	    setComponentAbsent(5);
	}
	
	
	// Methods for field "n_PCH"
	public N_PCH getN_PCH()
	{
	    if (hasN_PCH())
		return (N_PCH)mComponents[6];
	    else
		return (N_PCH)n_PCH__default.clone();
	}
	
	public void setN_PCH(N_PCH n_PCH)
	{
	    mComponents[6] = n_PCH;
	}
	
	public void setN_PCHToDefault()
	{
	    setN_PCH(n_PCH__default);
	}
	
	public boolean hasDefaultN_PCH()
	{
	    return true;
	}
	
	public boolean hasN_PCH()
	{
	    return componentIsPresent(6);
	}
	
	public void deleteN_PCH()
	{
	    setComponentAbsent(6);
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
		"PICH_Info$Tdd"
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
			    new EnumeratedInfo (
				new Tags (
				    new short[] {
					(short)0x8000
				    }
				),
				new QName (
				    "rrc.informationelements",
				    "TDD_PICH_CCode"
				),
				new QName (
				    "InformationElements",
				    "TDD-PICH-CCode"
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
				TDD_PICH_CCode.cc16_1
			    )
			),
			"channelisationCode",
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
				    "RepPerLengthOffset_PICH"
				),
				new QName (
				    "InformationElements",
				    "RepPerLengthOffset-PICH"
				),
				12314,
				null,
				new FieldsRef (
				    new QName (
					"rrc.informationelements",
					"RepPerLengthOffset_PICH"
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
				    "PagingIndicatorLength"
				),
				new QName (
				    "InformationElements",
				    "PagingIndicatorLength"
				),
				12314,
				null,
				new MemberList (
				    new MemberListElement[] {
					new MemberListElement (
					    "pi4",
					    0
					),
					new MemberListElement (
					    "pi8",
					    1
					),
					new MemberListElement (
					    "pi16",
					    2
					)
				    }
				),
				0,
				PagingIndicatorLength.pi4
			    )
			),
			"pagingIndicatorLength",
			4,
			3,
			pagingIndicatorLength__default
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
				    "N_GAP"
				),
				new QName (
				    "InformationElements",
				    "N-GAP"
				),
				12314,
				null,
				new MemberList (
				    new MemberListElement[] {
					new MemberListElement (
					    "f2",
					    0
					),
					new MemberListElement (
					    "f4",
					    1
					),
					new MemberListElement (
					    "f8",
					    2
					)
				    }
				),
				0,
				N_GAP.f2
			    )
			),
			"n-GAP",
			5,
			3,
			n_GAP__default
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
				    "N_PCH"
				),
				new QName (
				    "InformationElements",
				    "N-PCH"
				),
				12314,
				new ValueRangeConstraint (
				    new AbstractBounds(
					new N_PCH(1), 
					new N_PCH(8),
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
			"n-PCH",
			6,
			3,
			n_PCH__default
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
			    new TagDecoderElement((short)0x8005, 5),
			    new TagDecoderElement((short)0x8006, 6)
			}
		    ),
		    new TagDecoder (
			new TagDecoderElement[] {
			    new TagDecoderElement((short)0x8004, 4),
			    new TagDecoderElement((short)0x8005, 5),
			    new TagDecoderElement((short)0x8006, 6)
			}
		    ),
		    new TagDecoder (
			new TagDecoderElement[] {
			    new TagDecoderElement((short)0x8005, 5),
			    new TagDecoderElement((short)0x8006, 6)
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
	    null
	),
	new QName (
	    "rrc.informationelements",
	    "PICH_Info"
	),
	new QName (
	    "InformationElements",
	    "PICH-Info"
	),
	12314,
	null,
	new Fields (
	    new FieldInfo[] {
		new FieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "PICH_Info$Fdd"
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
			    "PICH_Info$Tdd"
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
     * Get the type descriptor (TypeInfo) of 'this' PICH_Info object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' PICH_Info object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for PICH_Info
