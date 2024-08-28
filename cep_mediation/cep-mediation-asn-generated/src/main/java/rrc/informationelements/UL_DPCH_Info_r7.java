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
 * Define the ASN1 Type UL_DPCH_Info_r7 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class UL_DPCH_Info_r7 extends Sequence {
    
    /**
     * The default constructor.
     */
    public UL_DPCH_Info_r7()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public UL_DPCH_Info_r7(UL_DPCH_PowerControlInfo_r7 ul_DPCH_PowerControlInfo, 
		    ModeSpecificInfo modeSpecificInfo)
    {
	setUl_DPCH_PowerControlInfo(ul_DPCH_PowerControlInfo);
	setModeSpecificInfo(modeSpecificInfo);
    }
    
    /**
     * Construct with required components.
     */
    public UL_DPCH_Info_r7(ModeSpecificInfo modeSpecificInfo)
    {
	setModeSpecificInfo(modeSpecificInfo);
    }
    
    public void initComponents()
    {
	mComponents[0] = new UL_DPCH_PowerControlInfo_r7();
	mComponents[1] = new ModeSpecificInfo();
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
		return new UL_DPCH_PowerControlInfo_r7();
	    case 1:
		return new ModeSpecificInfo();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "ul_DPCH_PowerControlInfo"
    public UL_DPCH_PowerControlInfo_r7 getUl_DPCH_PowerControlInfo()
    {
	return (UL_DPCH_PowerControlInfo_r7)mComponents[0];
    }
    
    public void setUl_DPCH_PowerControlInfo(UL_DPCH_PowerControlInfo_r7 ul_DPCH_PowerControlInfo)
    {
	mComponents[0] = ul_DPCH_PowerControlInfo;
    }
    
    public boolean hasUl_DPCH_PowerControlInfo()
    {
	return componentIsPresent(0);
    }
    
    public void deleteUl_DPCH_PowerControlInfo()
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
	    public Fdd(ScramblingCodeType scramblingCodeType, 
			    UL_ScramblingCode scramblingCode, 
			    DpdchPresence dpdchPresence)
	    {
		setScramblingCodeType(scramblingCodeType);
		setScramblingCode(scramblingCode);
		setDpdchPresence(dpdchPresence);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = ScramblingCodeType.shortSC;
		mComponents[1] = new UL_ScramblingCode();
		mComponents[2] = new DpdchPresence();
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
			return ScramblingCodeType.shortSC;
		    case 1:
			return new UL_ScramblingCode();
		    case 2:
			return new DpdchPresence();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "scramblingCodeType"
	    public ScramblingCodeType getScramblingCodeType()
	    {
		return (ScramblingCodeType)mComponents[0];
	    }
	    
	    public void setScramblingCodeType(ScramblingCodeType scramblingCodeType)
	    {
		mComponents[0] = scramblingCodeType;
	    }
	    
	    
	    // Methods for field "scramblingCode"
	    public UL_ScramblingCode getScramblingCode()
	    {
		return (UL_ScramblingCode)mComponents[1];
	    }
	    
	    public void setScramblingCode(UL_ScramblingCode scramblingCode)
	    {
		mComponents[1] = scramblingCode;
	    }
	    
	    
	    // Methods for field "dpdchPresence"
	    public DpdchPresence getDpdchPresence()
	    {
		return (DpdchPresence)mComponents[2];
	    }
	    
	    public void setDpdchPresence(DpdchPresence dpdchPresence)
	    {
		mComponents[2] = dpdchPresence;
	    }
	    
	    
	    
	    /**
	     * Define the ASN1 Type DpdchPresence from ASN1 Module InformationElements.
	     * @see Choice
	     */
	    public static class DpdchPresence extends Choice {
		
		/**
		 * The default constructor.
		 */
		public DpdchPresence()
		{
		}
		
		public static final  int  present_chosen = 1;
		public static final  int  notPresent_chosen = 2;
		
		// Methods for field "present"
		public static DpdchPresence createDpdchPresenceWithPresent(Present present)
		{
		    DpdchPresence __object = new DpdchPresence();

		    __object.setPresent(present);
		    return __object;
		}
		
		public boolean hasPresent()
		{
		    return getChosenFlag() == present_chosen;
		}
		
		public void setPresent(Present present)
		{
		    setChosenValue(present);
		    setChosenFlag(present_chosen);
		}
		
		
		
		/**
		 * Define the ASN1 Type Present from ASN1 Module InformationElements.
		 * @see Sequence
		 */
		public static class Present extends Sequence {
		    
		    /**
		     * The default constructor.
		     */
		    public Present()
		    {
		    }
		    
		    /**
		     * Construct with AbstractData components.
		     */
		    public Present(NumberOfDPDCH numberOfDPDCH, 
				    SpreadingFactor spreadingFactor, 
				    BOOLEAN tfci_Existence, 
				    NumberOfFBI_Bits numberOfFBI_Bits, 
				    NumberOfTPC_Bits numberOfTPC_Bits, 
				    PuncturingLimit puncturingLimit)
		    {
			setNumberOfDPDCH(numberOfDPDCH);
			setSpreadingFactor(spreadingFactor);
			setTfci_Existence(tfci_Existence);
			setNumberOfFBI_Bits(numberOfFBI_Bits);
			setNumberOfTPC_Bits(numberOfTPC_Bits);
			setPuncturingLimit(puncturingLimit);
		    }
		    
		    /**
		     * Construct with components.
		     */
		    public Present(NumberOfDPDCH numberOfDPDCH, 
				    SpreadingFactor spreadingFactor, 
				    boolean tfci_Existence, 
				    NumberOfFBI_Bits numberOfFBI_Bits, 
				    NumberOfTPC_Bits numberOfTPC_Bits, 
				    PuncturingLimit puncturingLimit)
		    {
			this(numberOfDPDCH, spreadingFactor, 
			     new BOOLEAN(tfci_Existence), numberOfFBI_Bits, 
			     numberOfTPC_Bits, puncturingLimit);
		    }
		    
		    /**
		     * Construct with required components.
		     */
		    public Present(SpreadingFactor spreadingFactor, 
				    boolean tfci_Existence, 
				    PuncturingLimit puncturingLimit)
		    {
			setSpreadingFactor(spreadingFactor);
			setTfci_Existence(tfci_Existence);
			setPuncturingLimit(puncturingLimit);
		    }
		    
		    public void initComponents()
		    {
			mComponents[0] = new NumberOfDPDCH();
			mComponents[1] = SpreadingFactor.sf4;
			mComponents[2] = new BOOLEAN();
			mComponents[3] = new NumberOfFBI_Bits();
			mComponents[4] = NumberOfTPC_Bits.tpc4;
			mComponents[5] = PuncturingLimit.pl0_40;
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
				return new NumberOfDPDCH();
			    case 1:
				return SpreadingFactor.sf4;
			    case 2:
				return new BOOLEAN();
			    case 3:
				return new NumberOfFBI_Bits();
			    case 4:
				return NumberOfTPC_Bits.tpc4;
			    case 5:
				return PuncturingLimit.pl0_40;
			    default:
				throw new InternalError("AbstractCollection.createInstance()");
			}
			
		    }
		    
		    // Default Values
		    public static final NumberOfDPDCH numberOfDPDCH__default = 
			new NumberOfDPDCH(1);
		    
		    // Methods for field "numberOfDPDCH"
		    public NumberOfDPDCH getNumberOfDPDCH()
		    {
			if (hasNumberOfDPDCH())
			    return (NumberOfDPDCH)mComponents[0];
			else
			    return (NumberOfDPDCH)numberOfDPDCH__default.clone();
		    }
		    
		    public void setNumberOfDPDCH(NumberOfDPDCH numberOfDPDCH)
		    {
			mComponents[0] = numberOfDPDCH;
		    }
		    
		    public void setNumberOfDPDCHToDefault()
		    {
			setNumberOfDPDCH(numberOfDPDCH__default);
		    }
		    
		    public boolean hasDefaultNumberOfDPDCH()
		    {
			return true;
		    }
		    
		    public boolean hasNumberOfDPDCH()
		    {
			return componentIsPresent(0);
		    }
		    
		    public void deleteNumberOfDPDCH()
		    {
			setComponentAbsent(0);
		    }
		    
		    
		    // Methods for field "spreadingFactor"
		    public SpreadingFactor getSpreadingFactor()
		    {
			return (SpreadingFactor)mComponents[1];
		    }
		    
		    public void setSpreadingFactor(SpreadingFactor spreadingFactor)
		    {
			mComponents[1] = spreadingFactor;
		    }
		    
		    
		    // Methods for field "tfci_Existence"
		    public boolean getTfci_Existence()
		    {
			return ((BOOLEAN)mComponents[2]).booleanValue();
		    }
		    
		    public void setTfci_Existence(boolean tfci_Existence)
		    {
			setTfci_Existence(new BOOLEAN(tfci_Existence));
		    }
		    
		    public void setTfci_Existence(BOOLEAN tfci_Existence)
		    {
			mComponents[2] = tfci_Existence;
		    }
		    
		    
		    // Methods for field "numberOfFBI_Bits"
		    public NumberOfFBI_Bits getNumberOfFBI_Bits()
		    {
			return (NumberOfFBI_Bits)mComponents[3];
		    }
		    
		    public void setNumberOfFBI_Bits(NumberOfFBI_Bits numberOfFBI_Bits)
		    {
			mComponents[3] = numberOfFBI_Bits;
		    }
		    
		    public boolean hasNumberOfFBI_Bits()
		    {
			return componentIsPresent(3);
		    }
		    
		    public void deleteNumberOfFBI_Bits()
		    {
			setComponentAbsent(3);
		    }
		    
		    
		    // Methods for field "numberOfTPC_Bits"
		    public NumberOfTPC_Bits getNumberOfTPC_Bits()
		    {
			return (NumberOfTPC_Bits)mComponents[4];
		    }
		    
		    public void setNumberOfTPC_Bits(NumberOfTPC_Bits numberOfTPC_Bits)
		    {
			mComponents[4] = numberOfTPC_Bits;
		    }
		    
		    public boolean hasNumberOfTPC_Bits()
		    {
			return componentIsPresent(4);
		    }
		    
		    public void deleteNumberOfTPC_Bits()
		    {
			setComponentAbsent(4);
		    }
		    
		    
		    // Methods for field "puncturingLimit"
		    public PuncturingLimit getPuncturingLimit()
		    {
			return (PuncturingLimit)mComponents[5];
		    }
		    
		    public void setPuncturingLimit(PuncturingLimit puncturingLimit)
		    {
			mComponents[5] = puncturingLimit;
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
			    "UL_DPCH_Info_r7$ModeSpecificInfo$Fdd$DpdchPresence$Present"
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
						"NumberOfDPDCH"
					    ),
					    new QName (
						"InformationElements",
						"NumberOfDPDCH"
					    ),
					    12314,
					    new ValueRangeConstraint (
						new AbstractBounds(
						    new NumberOfDPDCH(1), 
						    new NumberOfDPDCH(6),
						    0
						)
					    ),
					    new Bounds (
						new java.lang.Long(1),
						new java.lang.Long(6)
					    ),
					    null
					)
				    ),
				    "numberOfDPDCH",
				    0,
				    3,
				    numberOfDPDCH__default
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
						"SpreadingFactor"
					    ),
					    new QName (
						"InformationElements",
						"SpreadingFactor"
					    ),
					    12314,
					    null,
					    new MemberList (
						new MemberListElement[] {
						    new MemberListElement (
							"sf4",
							0
						    ),
						    new MemberListElement (
							"sf8",
							1
						    ),
						    new MemberListElement (
							"sf16",
							2
						    ),
						    new MemberListElement (
							"sf32",
							3
						    ),
						    new MemberListElement (
							"sf64",
							4
						    ),
						    new MemberListElement (
							"sf128",
							5
						    ),
						    new MemberListElement (
							"sf256",
							6
						    )
						}
					    ),
					    0,
					    SpreadingFactor.sf4
					)
				    ),
				    "spreadingFactor",
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
				    "tfci-Existence",
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
						"NumberOfFBI_Bits"
					    ),
					    new QName (
						"InformationElements",
						"NumberOfFBI-Bits"
					    ),
					    12314,
					    new ValueRangeConstraint (
						new AbstractBounds(
						    new NumberOfFBI_Bits(1), 
						    new NumberOfFBI_Bits(2),
						    0
						)
					    ),
					    new Bounds (
						new java.lang.Long(1),
						new java.lang.Long(2)
					    ),
					    null
					)
				    ),
				    "numberOfFBI-Bits",
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
						"NumberOfTPC_Bits"
					    ),
					    new QName (
						"InformationElements",
						"NumberOfTPC-Bits"
					    ),
					    12314,
					    null,
					    new MemberList (
						new MemberListElement[] {
						    new MemberListElement (
							"tpc4",
							0
						    )
						}
					    ),
					    0,
					    NumberOfTPC_Bits.tpc4
					)
				    ),
				    "numberOfTPC-Bits",
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
				    5,
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
		     * Get the type descriptor (TypeInfo) of 'this' Present object.
		     */
		    public TypeInfo getTypeInfo()
		    {
			return c_typeinfo;
		    }
		    
		    /**
		     * Get the static type descriptor (TypeInfo) of 'this' Present object.
		     */
		    public static TypeInfo getStaticTypeInfo()
		    {
			return c_typeinfo;
		    }
		    
		} // End class definition for Present

		// Methods for field "notPresent"
		public static DpdchPresence createDpdchPresenceWithNotPresent(NotPresent notPresent)
		{
		    DpdchPresence __object = new DpdchPresence();

		    __object.setNotPresent(notPresent);
		    return __object;
		}
		
		public boolean hasNotPresent()
		{
		    return getChosenFlag() == notPresent_chosen;
		}
		
		public void setNotPresent(NotPresent notPresent)
		{
		    setChosenValue(notPresent);
		    setChosenFlag(notPresent_chosen);
		}
		
		
		
		/**
		 * Define the ASN1 Type NotPresent from ASN1 Module InformationElements.
		 * @see Sequence
		 */
		public static class NotPresent extends Sequence {
		    
		    /**
		     * The default constructor.
		     */
		    public NotPresent()
		    {
		    }
		    
		    /**
		     * Construct with AbstractData components.
		     */
		    public NotPresent(BOOLEAN tfci_Existence, 
				    NumberOfFBI_Bits numberOfFBI_Bits, 
				    NumberOfTPC_Bits numberOfTPC_Bits)
		    {
			setTfci_Existence(tfci_Existence);
			setNumberOfFBI_Bits(numberOfFBI_Bits);
			setNumberOfTPC_Bits(numberOfTPC_Bits);
		    }
		    
		    /**
		     * Construct with components.
		     */
		    public NotPresent(boolean tfci_Existence, 
				    NumberOfFBI_Bits numberOfFBI_Bits, 
				    NumberOfTPC_Bits numberOfTPC_Bits)
		    {
			this(new BOOLEAN(tfci_Existence), numberOfFBI_Bits, 
			     numberOfTPC_Bits);
		    }
		    
		    /**
		     * Construct with required components.
		     */
		    public NotPresent(boolean tfci_Existence)
		    {
			setTfci_Existence(tfci_Existence);
		    }
		    
		    public void initComponents()
		    {
			mComponents[0] = new BOOLEAN();
			mComponents[1] = new NumberOfFBI_Bits();
			mComponents[2] = NumberOfTPC_Bits.tpc4;
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
				return new BOOLEAN();
			    case 1:
				return new NumberOfFBI_Bits();
			    case 2:
				return NumberOfTPC_Bits.tpc4;
			    default:
				throw new InternalError("AbstractCollection.createInstance()");
			}
			
		    }
		    
		    
		    // Methods for field "tfci_Existence"
		    public boolean getTfci_Existence()
		    {
			return ((BOOLEAN)mComponents[0]).booleanValue();
		    }
		    
		    public void setTfci_Existence(boolean tfci_Existence)
		    {
			setTfci_Existence(new BOOLEAN(tfci_Existence));
		    }
		    
		    public void setTfci_Existence(BOOLEAN tfci_Existence)
		    {
			mComponents[0] = tfci_Existence;
		    }
		    
		    
		    // Methods for field "numberOfFBI_Bits"
		    public NumberOfFBI_Bits getNumberOfFBI_Bits()
		    {
			return (NumberOfFBI_Bits)mComponents[1];
		    }
		    
		    public void setNumberOfFBI_Bits(NumberOfFBI_Bits numberOfFBI_Bits)
		    {
			mComponents[1] = numberOfFBI_Bits;
		    }
		    
		    public boolean hasNumberOfFBI_Bits()
		    {
			return componentIsPresent(1);
		    }
		    
		    public void deleteNumberOfFBI_Bits()
		    {
			setComponentAbsent(1);
		    }
		    
		    
		    // Methods for field "numberOfTPC_Bits"
		    public NumberOfTPC_Bits getNumberOfTPC_Bits()
		    {
			return (NumberOfTPC_Bits)mComponents[2];
		    }
		    
		    public void setNumberOfTPC_Bits(NumberOfTPC_Bits numberOfTPC_Bits)
		    {
			mComponents[2] = numberOfTPC_Bits;
		    }
		    
		    public boolean hasNumberOfTPC_Bits()
		    {
			return componentIsPresent(2);
		    }
		    
		    public void deleteNumberOfTPC_Bits()
		    {
			setComponentAbsent(2);
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
			    "UL_DPCH_Info_r7$ModeSpecificInfo$Fdd$DpdchPresence$NotPresent"
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
					new TypeInfo (
					    new Tags (
						new short[] {
						    (short)0x8000
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
						"NumberOfFBI_Bits"
					    ),
					    new QName (
						"InformationElements",
						"NumberOfFBI-Bits"
					    ),
					    12314,
					    new ValueRangeConstraint (
						new AbstractBounds(
						    new NumberOfFBI_Bits(1), 
						    new NumberOfFBI_Bits(2),
						    0
						)
					    ),
					    new Bounds (
						new java.lang.Long(1),
						new java.lang.Long(2)
					    ),
					    null
					)
				    ),
				    "numberOfFBI-Bits",
				    1,
				    3,
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
						"NumberOfTPC_Bits"
					    ),
					    new QName (
						"InformationElements",
						"NumberOfTPC-Bits"
					    ),
					    12314,
					    null,
					    new MemberList (
						new MemberListElement[] {
						    new MemberListElement (
							"tpc4",
							0
						    )
						}
					    ),
					    0,
					    NumberOfTPC_Bits.tpc4
					)
				    ),
				    "numberOfTPC-Bits",
				    2,
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
		     * Get the type descriptor (TypeInfo) of 'this' NotPresent object.
		     */
		    public TypeInfo getTypeInfo()
		    {
			return c_typeinfo;
		    }
		    
		    /**
		     * Get the static type descriptor (TypeInfo) of 'this' NotPresent object.
		     */
		    public static TypeInfo getStaticTypeInfo()
		    {
			return c_typeinfo;
		    }
		    
		} // End class definition for NotPresent

		// Method to create a specific choice instance
		public AbstractData createInstance(int chosen)
		{
		    switch (chosen) {
			case present_chosen:
			    return new Present();
			case notPresent_chosen:
			    return new NotPresent();
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
			"UL_DPCH_Info_r7$ModeSpecificInfo$Fdd$DpdchPresence"
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
					"UL_DPCH_Info_r7$ModeSpecificInfo$Fdd$DpdchPresence$Present"
				    )
				),
				"present",
				0,
				2
			    ),
			    new FieldInfo (
				new TypeInfoRef (
				    new QName (
					"rrc.informationelements",
					"UL_DPCH_Info_r7$ModeSpecificInfo$Fdd$DpdchPresence$NotPresent"
				    )
				),
				"notPresent",
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
		 * Get the type descriptor (TypeInfo) of 'this' DpdchPresence object.
		 */
		public TypeInfo getTypeInfo()
		{
		    return c_typeinfo;
		}
		
		/**
		 * Get the static type descriptor (TypeInfo) of 'this' DpdchPresence object.
		 */
		public static TypeInfo getStaticTypeInfo()
		{
		    return c_typeinfo;
		}
		
	    } // End class definition for DpdchPresence

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
		    "UL_DPCH_Info_r7$ModeSpecificInfo$Fdd"
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
					"ScramblingCodeType"
				    ),
				    new QName (
					"InformationElements",
					"ScramblingCodeType"
				    ),
				    12314,
				    null,
				    new MemberList (
					new MemberListElement[] {
					    new MemberListElement (
						"shortSC",
						0
					    ),
					    new MemberListElement (
						"longSC",
						1
					    )
					}
				    ),
				    0,
				    ScramblingCodeType.shortSC
				)
			    ),
			    "scramblingCodeType",
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
					"UL_ScramblingCode"
				    ),
				    new QName (
					"InformationElements",
					"UL-ScramblingCode"
				    ),
				    12314,
				    new ValueRangeConstraint (
					new AbstractBounds(
					    new UL_ScramblingCode(0), 
					    new UL_ScramblingCode(16777215),
					    0
					)
				    ),
				    new Bounds (
					new java.lang.Long(0),
					new java.lang.Long(16777215)
				    ),
				    null
				)
			    ),
			    "scramblingCode",
			    1,
			    2,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "UL_DPCH_Info_r7$ModeSpecificInfo$Fdd$DpdchPresence"
				)
			    ),
			    "dpdchPresence",
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
	    public Tdd(UL_TimingAdvanceControl_r7 ul_TimingAdvance, 
			    UL_CCTrCHList_r7 ul_CCTrCHList, 
			    UL_CCTrCHListToRemove ul_CCTrCHListToRemove)
	    {
		setUl_TimingAdvance(ul_TimingAdvance);
		setUl_CCTrCHList(ul_CCTrCHList);
		setUl_CCTrCHListToRemove(ul_CCTrCHListToRemove);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new UL_TimingAdvanceControl_r7();
		mComponents[1] = new UL_CCTrCHList_r7();
		mComponents[2] = new UL_CCTrCHListToRemove();
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
			return new UL_TimingAdvanceControl_r7();
		    case 1:
			return new UL_CCTrCHList_r7();
		    case 2:
			return new UL_CCTrCHListToRemove();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "ul_TimingAdvance"
	    public UL_TimingAdvanceControl_r7 getUl_TimingAdvance()
	    {
		return (UL_TimingAdvanceControl_r7)mComponents[0];
	    }
	    
	    public void setUl_TimingAdvance(UL_TimingAdvanceControl_r7 ul_TimingAdvance)
	    {
		mComponents[0] = ul_TimingAdvance;
	    }
	    
	    public boolean hasUl_TimingAdvance()
	    {
		return componentIsPresent(0);
	    }
	    
	    public void deleteUl_TimingAdvance()
	    {
		setComponentAbsent(0);
	    }
	    
	    
	    // Methods for field "ul_CCTrCHList"
	    public UL_CCTrCHList_r7 getUl_CCTrCHList()
	    {
		return (UL_CCTrCHList_r7)mComponents[1];
	    }
	    
	    public void setUl_CCTrCHList(UL_CCTrCHList_r7 ul_CCTrCHList)
	    {
		mComponents[1] = ul_CCTrCHList;
	    }
	    
	    public boolean hasUl_CCTrCHList()
	    {
		return componentIsPresent(1);
	    }
	    
	    public void deleteUl_CCTrCHList()
	    {
		setComponentAbsent(1);
	    }
	    
	    
	    // Methods for field "ul_CCTrCHListToRemove"
	    public UL_CCTrCHListToRemove getUl_CCTrCHListToRemove()
	    {
		return (UL_CCTrCHListToRemove)mComponents[2];
	    }
	    
	    public void setUl_CCTrCHListToRemove(UL_CCTrCHListToRemove ul_CCTrCHListToRemove)
	    {
		mComponents[2] = ul_CCTrCHListToRemove;
	    }
	    
	    public boolean hasUl_CCTrCHListToRemove()
	    {
		return componentIsPresent(2);
	    }
	    
	    public void deleteUl_CCTrCHListToRemove()
	    {
		setComponentAbsent(2);
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
		    "UL_DPCH_Info_r7$ModeSpecificInfo$Tdd"
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
					"UL_TimingAdvanceControl_r7"
				    ),
				    new QName (
					"InformationElements",
					"UL-TimingAdvanceControl-r7"
				    ),
				    12314,
				    null,
				    new FieldsRef (
					new QName (
					    "rrc.informationelements",
					    "UL_TimingAdvanceControl_r7"
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
			    "ul-TimingAdvance",
			    0,
			    3,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new ContainerInfo (
				    new Tags (
					new short[] {
					    (short)0x8001
					}
				    ),
				    new QName (
					"rrc.informationelements",
					"UL_CCTrCHList_r7"
				    ),
				    new QName (
					"InformationElements",
					"UL-CCTrCHList-r7"
				    ),
				    12314,
				    new SizeConstraint (
					new ValueRangeConstraint (
					    new AbstractBounds(
						new com.oss.asn1.INTEGER(1), 
						new com.oss.asn1.INTEGER(8),
						0
					    )
					)
				    ),
				    new Bounds (
					new java.lang.Long(1),
					new java.lang.Long(8)
				    ),
				    new TypeInfoRef (
					new QName (
					    "rrc.informationelements",
					    "UL_CCTrCH_r7"
					)
				    )
				)
			    ),
			    "ul-CCTrCHList",
			    1,
			    3,
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
					"UL_CCTrCHListToRemove"
				    ),
				    new QName (
					"InformationElements",
					"UL-CCTrCHListToRemove"
				    ),
				    12314,
				    new SizeConstraint (
					new ValueRangeConstraint (
					    new AbstractBounds(
						new com.oss.asn1.INTEGER(1), 
						new com.oss.asn1.INTEGER(8),
						0
					    )
					)
				    ),
				    new Bounds (
					new java.lang.Long(1),
					new java.lang.Long(8)
				    ),
				    new TypeInfoRef (
					new QName (
					    "rrc.informationelements",
					    "TFCS_IdentityPlain"
					)
				    )
				)
			    ),
			    "ul-CCTrCHListToRemove",
			    2,
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
		"UL_DPCH_Info_r7$ModeSpecificInfo"
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
				"UL_DPCH_Info_r7$ModeSpecificInfo$Fdd"
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
				"UL_DPCH_Info_r7$ModeSpecificInfo$Tdd"
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
	    "UL_DPCH_Info_r7"
	),
	new QName (
	    "InformationElements",
	    "UL-DPCH-Info-r7"
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
				"UL_DPCH_PowerControlInfo_r7"
			    ),
			    new QName (
				"InformationElements",
				"UL-DPCH-PowerControlInfo-r7"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UL_DPCH_PowerControlInfo_r7"
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
		    "ul-DPCH-PowerControlInfo",
		    0,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "UL_DPCH_Info_r7$ModeSpecificInfo"
			)
		    ),
		    "modeSpecificInfo",
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
			new TagDecoderElement((short)0x8000, 0),
			new TagDecoderElement((short)0x8001, 1)
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
     * Get the type descriptor (TypeInfo) of 'this' UL_DPCH_Info_r7 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UL_DPCH_Info_r7 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UL_DPCH_Info_r7
