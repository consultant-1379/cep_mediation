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
 * Define the ASN1 Type PRACH_RACH_Info from ASN1 Module InformationElements.
 * @see Sequence
 */

public class PRACH_RACH_Info extends Sequence {
    
    /**
     * The default constructor.
     */
    public PRACH_RACH_Info()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public PRACH_RACH_Info(ModeSpecificInfo modeSpecificInfo)
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
	    public Fdd(AvailableSignatures availableSignatures, 
			    SF_PRACH availableSF, 
			    PreambleScramblingCodeWordNumber preambleScramblingCodeWordNumber, 
			    PuncturingLimit puncturingLimit, 
			    AvailableSubChannelNumbers availableSubChannelNumbers)
	    {
		setAvailableSignatures(availableSignatures);
		setAvailableSF(availableSF);
		setPreambleScramblingCodeWordNumber(preambleScramblingCodeWordNumber);
		setPuncturingLimit(puncturingLimit);
		setAvailableSubChannelNumbers(availableSubChannelNumbers);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new AvailableSignatures();
		mComponents[1] = SF_PRACH.sfpr32;
		mComponents[2] = new PreambleScramblingCodeWordNumber();
		mComponents[3] = PuncturingLimit.pl0_40;
		mComponents[4] = new AvailableSubChannelNumbers();
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
			return new AvailableSignatures();
		    case 1:
			return SF_PRACH.sfpr32;
		    case 2:
			return new PreambleScramblingCodeWordNumber();
		    case 3:
			return PuncturingLimit.pl0_40;
		    case 4:
			return new AvailableSubChannelNumbers();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "availableSignatures"
	    public AvailableSignatures getAvailableSignatures()
	    {
		return (AvailableSignatures)mComponents[0];
	    }
	    
	    public void setAvailableSignatures(AvailableSignatures availableSignatures)
	    {
		mComponents[0] = availableSignatures;
	    }
	    
	    
	    // Methods for field "availableSF"
	    public SF_PRACH getAvailableSF()
	    {
		return (SF_PRACH)mComponents[1];
	    }
	    
	    public void setAvailableSF(SF_PRACH availableSF)
	    {
		mComponents[1] = availableSF;
	    }
	    
	    
	    // Methods for field "preambleScramblingCodeWordNumber"
	    public PreambleScramblingCodeWordNumber getPreambleScramblingCodeWordNumber()
	    {
		return (PreambleScramblingCodeWordNumber)mComponents[2];
	    }
	    
	    public void setPreambleScramblingCodeWordNumber(PreambleScramblingCodeWordNumber preambleScramblingCodeWordNumber)
	    {
		mComponents[2] = preambleScramblingCodeWordNumber;
	    }
	    
	    
	    // Methods for field "puncturingLimit"
	    public PuncturingLimit getPuncturingLimit()
	    {
		return (PuncturingLimit)mComponents[3];
	    }
	    
	    public void setPuncturingLimit(PuncturingLimit puncturingLimit)
	    {
		mComponents[3] = puncturingLimit;
	    }
	    
	    
	    // Methods for field "availableSubChannelNumbers"
	    public AvailableSubChannelNumbers getAvailableSubChannelNumbers()
	    {
		return (AvailableSubChannelNumbers)mComponents[4];
	    }
	    
	    public void setAvailableSubChannelNumbers(AvailableSubChannelNumbers availableSubChannelNumbers)
	    {
		mComponents[4] = availableSubChannelNumbers;
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
		    "PRACH_RACH_Info$ModeSpecificInfo$Fdd"
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
					"rrc.informationelements",
					"AvailableSignatures"
				    ),
				    new QName (
					"InformationElements",
					"AvailableSignatures"
				    ),
				    12314,
				    new SizeConstraint (
					new SingleValueConstraint (
					    new com.oss.asn1.INTEGER(16)
					)
				    ),
				    new Bounds (
					new java.lang.Long(16),
					new java.lang.Long(16)
				    ),
				    new MemberList (
					new MemberListElement[] {
					    new MemberListElement (
						"signature15",
						0
					    ),
					    new MemberListElement (
						"signature14",
						1
					    ),
					    new MemberListElement (
						"signature13",
						2
					    ),
					    new MemberListElement (
						"signature12",
						3
					    ),
					    new MemberListElement (
						"signature11",
						4
					    ),
					    new MemberListElement (
						"signature10",
						5
					    ),
					    new MemberListElement (
						"signature9",
						6
					    ),
					    new MemberListElement (
						"signature8",
						7
					    ),
					    new MemberListElement (
						"signature7",
						8
					    ),
					    new MemberListElement (
						"signature6",
						9
					    ),
					    new MemberListElement (
						"signature5",
						10
					    ),
					    new MemberListElement (
						"signature4",
						11
					    ),
					    new MemberListElement (
						"signature3",
						12
					    ),
					    new MemberListElement (
						"signature2",
						13
					    ),
					    new MemberListElement (
						"signature1",
						14
					    ),
					    new MemberListElement (
						"signature0",
						15
					    )
					}
				    )
				)
			    ),
			    "availableSignatures",
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
					"SF_PRACH"
				    ),
				    new QName (
					"InformationElements",
					"SF-PRACH"
				    ),
				    12314,
				    null,
				    new MemberList (
					new MemberListElement[] {
					    new MemberListElement (
						"sfpr32",
						0
					    ),
					    new MemberListElement (
						"sfpr64",
						1
					    ),
					    new MemberListElement (
						"sfpr128",
						2
					    ),
					    new MemberListElement (
						"sfpr256",
						3
					    )
					}
				    ),
				    0,
				    SF_PRACH.sfpr32
				)
			    ),
			    "availableSF",
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
					"PreambleScramblingCodeWordNumber"
				    ),
				    new QName (
					"InformationElements",
					"PreambleScramblingCodeWordNumber"
				    ),
				    12314,
				    new ValueRangeConstraint (
					new AbstractBounds(
					    new PreambleScramblingCodeWordNumber(0), 
					    new PreambleScramblingCodeWordNumber(15),
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
			    "preambleScramblingCodeWordNumber",
			    2,
			    2,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new EnumeratedInfo (
				    new Tags (
					new short[] {
					    (short)0x8003
					}
				    ),
				    new QName (
					"rrc.informationelements",
					"PuncturingLimit"
				    ),
				    new QName (
					"InformationElements",
					"PuncturingLimit"
				    ),
				    12314,
				    null,
				    new MemberList (
					new MemberListElement[] {
					    new MemberListElement (
						"pl0-40",
						0
					    ),
					    new MemberListElement (
						"pl0-44",
						1
					    ),
					    new MemberListElement (
						"pl0-48",
						2
					    ),
					    new MemberListElement (
						"pl0-52",
						3
					    ),
					    new MemberListElement (
						"pl0-56",
						4
					    ),
					    new MemberListElement (
						"pl0-60",
						5
					    ),
					    new MemberListElement (
						"pl0-64",
						6
					    ),
					    new MemberListElement (
						"pl0-68",
						7
					    ),
					    new MemberListElement (
						"pl0-72",
						8
					    ),
					    new MemberListElement (
						"pl0-76",
						9
					    ),
					    new MemberListElement (
						"pl0-80",
						10
					    ),
					    new MemberListElement (
						"pl0-84",
						11
					    ),
					    new MemberListElement (
						"pl0-88",
						12
					    ),
					    new MemberListElement (
						"pl0-92",
						13
					    ),
					    new MemberListElement (
						"pl0-96",
						14
					    ),
					    new MemberListElement (
						"pl1",
						15
					    )
					}
				    ),
				    0,
				    PuncturingLimit.pl0_40
				)
			    ),
			    "puncturingLimit",
			    3,
			    2,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new BitStringInfo (
				    new Tags (
					new short[] {
					    (short)0x8004
					}
				    ),
				    new QName (
					"rrc.informationelements",
					"AvailableSubChannelNumbers"
				    ),
				    new QName (
					"InformationElements",
					"AvailableSubChannelNumbers"
				    ),
				    12314,
				    new SizeConstraint (
					new SingleValueConstraint (
					    new com.oss.asn1.INTEGER(12)
					)
				    ),
				    new Bounds (
					new java.lang.Long(12),
					new java.lang.Long(12)
				    ),
				    new MemberList (
					new MemberListElement[] {
					    new MemberListElement (
						"subCh11",
						0
					    ),
					    new MemberListElement (
						"subCh10",
						1
					    ),
					    new MemberListElement (
						"subCh9",
						2
					    ),
					    new MemberListElement (
						"subCh8",
						3
					    ),
					    new MemberListElement (
						"subCh7",
						4
					    ),
					    new MemberListElement (
						"subCh6",
						5
					    ),
					    new MemberListElement (
						"subCh5",
						6
					    ),
					    new MemberListElement (
						"subCh4",
						7
					    ),
					    new MemberListElement (
						"subCh3",
						8
					    ),
					    new MemberListElement (
						"subCh2",
						9
					    ),
					    new MemberListElement (
						"subCh1",
						10
					    ),
					    new MemberListElement (
						"subCh0",
						11
					    )
					}
				    )
				)
			    ),
			    "availableSubChannelNumbers",
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
	    public Tdd(TimeslotNumber timeslot, 
			    TDD_PRACH_CCodeList channelisationCodeList, 
			    PRACH_Midamble prach_Midamble)
	    {
		setTimeslot(timeslot);
		setChannelisationCodeList(channelisationCodeList);
		setPrach_Midamble(prach_Midamble);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new TimeslotNumber();
		mComponents[1] = new TDD_PRACH_CCodeList();
		mComponents[2] = PRACH_Midamble.direct;
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
			return new TimeslotNumber();
		    case 1:
			return new TDD_PRACH_CCodeList();
		    case 2:
			return PRACH_Midamble.direct;
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "timeslot"
	    public TimeslotNumber getTimeslot()
	    {
		return (TimeslotNumber)mComponents[0];
	    }
	    
	    public void setTimeslot(TimeslotNumber timeslot)
	    {
		mComponents[0] = timeslot;
	    }
	    
	    
	    // Methods for field "channelisationCodeList"
	    public TDD_PRACH_CCodeList getChannelisationCodeList()
	    {
		return (TDD_PRACH_CCodeList)mComponents[1];
	    }
	    
	    public void setChannelisationCodeList(TDD_PRACH_CCodeList channelisationCodeList)
	    {
		mComponents[1] = channelisationCodeList;
	    }
	    
	    
	    // Methods for field "prach_Midamble"
	    public PRACH_Midamble getPrach_Midamble()
	    {
		return (PRACH_Midamble)mComponents[2];
	    }
	    
	    public void setPrach_Midamble(PRACH_Midamble prach_Midamble)
	    {
		mComponents[2] = prach_Midamble;
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
		    "PRACH_RACH_Info$ModeSpecificInfo$Tdd"
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
				new ChoiceInfo (
				    new Tags (
					new short[] {
					    (short)0x8001
					}
				    ),
				    new QName (
					"rrc.informationelements",
					"TDD_PRACH_CCodeList"
				    ),
				    new QName (
					"InformationElements",
					"TDD-PRACH-CCodeList"
				    ),
				    12314,
				    null,
				    new FieldsRef (
					new QName (
					    "rrc.informationelements",
					    "TDD_PRACH_CCodeList"
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
			    "channelisationCodeList",
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
					"PRACH_Midamble"
				    ),
				    new QName (
					"InformationElements",
					"PRACH-Midamble"
				    ),
				    12314,
				    null,
				    new MemberList (
					new MemberListElement[] {
					    new MemberListElement (
						"direct",
						0
					    ),
					    new MemberListElement (
						"direct-Inverted",
						1
					    )
					}
				    ),
				    0,
				    PRACH_Midamble.direct
				)
			    ),
			    "prach-Midamble",
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
		"PRACH_RACH_Info$ModeSpecificInfo"
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
				"PRACH_RACH_Info$ModeSpecificInfo$Fdd"
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
				"PRACH_RACH_Info$ModeSpecificInfo$Tdd"
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
	    "PRACH_RACH_Info"
	),
	new QName (
	    "InformationElements",
	    "PRACH-RACH-Info"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "PRACH_RACH_Info$ModeSpecificInfo"
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
     * Get the type descriptor (TypeInfo) of 'this' PRACH_RACH_Info object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' PRACH_RACH_Info object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for PRACH_RACH_Info
