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
 * Define the ASN1 Type CommonEDCHSystemInfo from ASN1 Module InformationElements.
 * @see Sequence
 */

public class CommonEDCHSystemInfo extends Sequence {
    
    /**
     * The default constructor.
     */
    public CommonEDCHSystemInfo()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public CommonEDCHSystemInfo(UL_Interference ul_InterferenceForCommonEDCH, 
		    Common_E_DCH_MAC_d_FlowList common_E_DCH_MAC_d_FlowList, 
		    ModeSpecificInfo modeSpecificInfo)
    {
	setUl_InterferenceForCommonEDCH(ul_InterferenceForCommonEDCH);
	setCommon_E_DCH_MAC_d_FlowList(common_E_DCH_MAC_d_FlowList);
	setModeSpecificInfo(modeSpecificInfo);
    }
    
    /**
     * Construct with required components.
     */
    public CommonEDCHSystemInfo(Common_E_DCH_MAC_d_FlowList common_E_DCH_MAC_d_FlowList, 
		    ModeSpecificInfo modeSpecificInfo)
    {
	setCommon_E_DCH_MAC_d_FlowList(common_E_DCH_MAC_d_FlowList);
	setModeSpecificInfo(modeSpecificInfo);
    }
    
    public void initComponents()
    {
	mComponents[0] = new UL_Interference();
	mComponents[1] = new Common_E_DCH_MAC_d_FlowList();
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
		return new UL_Interference();
	    case 1:
		return new Common_E_DCH_MAC_d_FlowList();
	    case 2:
		return new ModeSpecificInfo();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "ul_InterferenceForCommonEDCH"
    public UL_Interference getUl_InterferenceForCommonEDCH()
    {
	return (UL_Interference)mComponents[0];
    }
    
    public void setUl_InterferenceForCommonEDCH(UL_Interference ul_InterferenceForCommonEDCH)
    {
	mComponents[0] = ul_InterferenceForCommonEDCH;
    }
    
    public boolean hasUl_InterferenceForCommonEDCH()
    {
	return componentIsPresent(0);
    }
    
    public void deleteUl_InterferenceForCommonEDCH()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "common_E_DCH_MAC_d_FlowList"
    public Common_E_DCH_MAC_d_FlowList getCommon_E_DCH_MAC_d_FlowList()
    {
	return (Common_E_DCH_MAC_d_FlowList)mComponents[1];
    }
    
    public void setCommon_E_DCH_MAC_d_FlowList(Common_E_DCH_MAC_d_FlowList common_E_DCH_MAC_d_FlowList)
    {
	mComponents[1] = common_E_DCH_MAC_d_FlowList;
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
	
	public static final  int  dummy_chosen = 1;
	public static final  int  tdd_chosen = 2;
	
	// Methods for field "dummy"
	public static ModeSpecificInfo createModeSpecificInfoWithDummy(Dummy dummy)
	{
	    ModeSpecificInfo __object = new ModeSpecificInfo();

	    __object.setDummy(dummy);
	    return __object;
	}
	
	public boolean hasDummy()
	{
	    return getChosenFlag() == dummy_chosen;
	}
	
	public void setDummy(Dummy dummy)
	{
	    setChosenValue(dummy);
	    setChosenFlag(dummy_chosen);
	}
	
	
	
	/**
	 * Define the ASN1 Type Dummy from ASN1 Module InformationElements.
	 * @see Sequence
	 */
	public static class Dummy extends Sequence {
	    
	    /**
	     * The default constructor.
	     */
	    public Dummy()
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
		    "CommonEDCHSystemInfo$ModeSpecificInfo$Dummy"
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
	     * Get the type descriptor (TypeInfo) of 'this' Dummy object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' Dummy object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for Dummy

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
	 * @see Choice
	 */
	public static class Tdd extends Choice {
	    
	    /**
	     * The default constructor.
	     */
	    public Tdd()
	    {
	    }
	    
	    public static final  int  tdd768_chosen = 1;
	    public static final  int  tdd384_chosen = 2;
	    public static final  int  tdd128_chosen = 3;
	    
	    // Methods for field "tdd768"
	    public static Tdd createTddWithTdd768(Null tdd768)
	    {
		Tdd __object = new Tdd();

		__object.setTdd768(tdd768);
		return __object;
	    }
	    
	    public boolean hasTdd768()
	    {
		return getChosenFlag() == tdd768_chosen;
	    }
	    
	    public void setTdd768(Null tdd768)
	    {
		setChosenValue(tdd768);
		setChosenFlag(tdd768_chosen);
	    }
	    
	    
	    // Methods for field "tdd384"
	    public static Tdd createTddWithTdd384(Null tdd384)
	    {
		Tdd __object = new Tdd();

		__object.setTdd384(tdd384);
		return __object;
	    }
	    
	    public boolean hasTdd384()
	    {
		return getChosenFlag() == tdd384_chosen;
	    }
	    
	    public void setTdd384(Null tdd384)
	    {
		setChosenValue(tdd384);
		setChosenFlag(tdd384_chosen);
	    }
	    
	    
	    // Methods for field "tdd128"
	    public static Tdd createTddWithTdd128(Tdd128 tdd128)
	    {
		Tdd __object = new Tdd();

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
		public Tdd128(E_RUCCH_Info_TDD128 e_RUCCH_Info, 
				E_PUCH_Info_TDD128 e_PUCH_Info, 
				E_HICH_Information_TDD128 e_hich_Information, 
				E_AGCH_Information_TDD128 e_agch_Information, 
				Harq_Info harq_Info, 
				Ccch_transmission_Info ccch_transmission_Info)
		{
		    setE_RUCCH_Info(e_RUCCH_Info);
		    setE_PUCH_Info(e_PUCH_Info);
		    setE_hich_Information(e_hich_Information);
		    setE_agch_Information(e_agch_Information);
		    setHarq_Info(harq_Info);
		    setCcch_transmission_Info(ccch_transmission_Info);
		}
		
		public void initComponents()
		{
		    mComponents[0] = new E_RUCCH_Info_TDD128();
		    mComponents[1] = new E_PUCH_Info_TDD128();
		    mComponents[2] = new E_HICH_Information_TDD128();
		    mComponents[3] = new E_AGCH_Information_TDD128();
		    mComponents[4] = Harq_Info.rv0;
		    mComponents[5] = new Ccch_transmission_Info();
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
			    return new E_RUCCH_Info_TDD128();
			case 1:
			    return new E_PUCH_Info_TDD128();
			case 2:
			    return new E_HICH_Information_TDD128();
			case 3:
			    return new E_AGCH_Information_TDD128();
			case 4:
			    return Harq_Info.rv0;
			case 5:
			    return new Ccch_transmission_Info();
			default:
			    throw new InternalError("AbstractCollection.createInstance()");
		    }
		    
		}
		
		
		// Methods for field "e_RUCCH_Info"
		public E_RUCCH_Info_TDD128 getE_RUCCH_Info()
		{
		    return (E_RUCCH_Info_TDD128)mComponents[0];
		}
		
		public void setE_RUCCH_Info(E_RUCCH_Info_TDD128 e_RUCCH_Info)
		{
		    mComponents[0] = e_RUCCH_Info;
		}
		
		
		// Methods for field "e_PUCH_Info"
		public E_PUCH_Info_TDD128 getE_PUCH_Info()
		{
		    return (E_PUCH_Info_TDD128)mComponents[1];
		}
		
		public void setE_PUCH_Info(E_PUCH_Info_TDD128 e_PUCH_Info)
		{
		    mComponents[1] = e_PUCH_Info;
		}
		
		
		// Methods for field "e_hich_Information"
		public E_HICH_Information_TDD128 getE_hich_Information()
		{
		    return (E_HICH_Information_TDD128)mComponents[2];
		}
		
		public void setE_hich_Information(E_HICH_Information_TDD128 e_hich_Information)
		{
		    mComponents[2] = e_hich_Information;
		}
		
		
		// Methods for field "e_agch_Information"
		public E_AGCH_Information_TDD128 getE_agch_Information()
		{
		    return (E_AGCH_Information_TDD128)mComponents[3];
		}
		
		public void setE_agch_Information(E_AGCH_Information_TDD128 e_agch_Information)
		{
		    mComponents[3] = e_agch_Information;
		}
		
		
		// Methods for field "harq_Info"
		public Harq_Info getHarq_Info()
		{
		    return (Harq_Info)mComponents[4];
		}
		
		public void setHarq_Info(Harq_Info harq_Info)
		{
		    mComponents[4] = harq_Info;
		}
		
		
		
		/**
		 * Define the ASN1 Type Harq_Info from ASN1 Module InformationElements.
		 * @see Enumerated
		 */
		public static final class Harq_Info extends Enumerated {
		    
		    /**
		     * The default constructor.
		     */
		    private Harq_Info()
		    {
			super(cFirstNumber);
		    }
		    
		    protected Harq_Info(long value)
		    {
			super(value);
		    }
		    
		    // Named list definitions.
		    public static final Harq_Info rv0 =
			new Harq_Info(0);
		    public static final Harq_Info rvtable =
			new Harq_Info(1);
		    private final static Harq_Info cNamedNumbers[] = {
			 rv0, 
			 rvtable
		    };
		    protected final static long cFirstNumber = 0;
		    protected final static boolean cLinearNumbers = false;
		    
		    public Enumerated[] getNamedNumbers()
		    {
			return cNamedNumbers;
		    }
		    
		    public boolean hasLinearNumbers()
		    {
			return cLinearNumbers;
		    }
		    
		    public long getFirstNumber()
		    {
			return cFirstNumber;
		    }
		    
		    public static Harq_Info valueOf(long value)
		    {
			return (Harq_Info)rv0.lookupValue(value);
		    }
		    
		    /**
		     * Initialize the type descriptor.
		     */
		    private static final EnumeratedInfo c_typeinfo = new EnumeratedInfo (
			new Tags (
			    new short[] {
				(short)0x8004
			    }
			),
			new QName (
			    "rrc.informationelements",
			    "CommonEDCHSystemInfo$ModeSpecificInfo$Tdd$Tdd128$Harq_Info"
			),
			new QName (
			    "builtin",
			    "ENUMERATED"
			),
			12314,
			null,
			new MemberList (
			    new MemberListElement[] {
				new MemberListElement (
				    "rv0",
				    0
				),
				new MemberListElement (
				    "rvtable",
				    1
				)
			    }
			),
			0,
			rv0
		    );
		    
		    /**
		     * Get the type descriptor (TypeInfo) of 'this' Harq_Info object.
		     */
		    public TypeInfo getTypeInfo()
		    {
			return c_typeinfo;
		    }
		    
		    /**
		     * Get the static type descriptor (TypeInfo) of 'this' Harq_Info object.
		     */
		    public static TypeInfo getStaticTypeInfo()
		    {
			return c_typeinfo;
		    }
		    
		} // End class definition for Harq_Info

		// Methods for field "ccch_transmission_Info"
		public Ccch_transmission_Info getCcch_transmission_Info()
		{
		    return (Ccch_transmission_Info)mComponents[5];
		}
		
		public void setCcch_transmission_Info(Ccch_transmission_Info ccch_transmission_Info)
		{
		    mComponents[5] = ccch_transmission_Info;
		}
		
		
		
		/**
		 * Define the ASN1 Type Ccch_transmission_Info from ASN1 Module InformationElements.
		 * @see Sequence
		 */
		public static class Ccch_transmission_Info extends Sequence {
		    
		    /**
		     * The default constructor.
		     */
		    public Ccch_transmission_Info()
		    {
		    }
		    
		    /**
		     * Construct with AbstractData components.
		     */
		    public Ccch_transmission_Info(Common_E_RNTI_Info common_e_rnti_Info, 
				    INTEGER harq_MaximumNumberOfRetransmissions, 
				    Harq_retransmission_timer harq_retransmission_timer, 
				    INTEGER harq_power_offset)
		    {
			setCommon_e_rnti_Info(common_e_rnti_Info);
			setHarq_MaximumNumberOfRetransmissions(harq_MaximumNumberOfRetransmissions);
			setHarq_retransmission_timer(harq_retransmission_timer);
			setHarq_power_offset(harq_power_offset);
		    }
		    
		    /**
		     * Construct with components.
		     */
		    public Ccch_transmission_Info(Common_E_RNTI_Info common_e_rnti_Info, 
				    long harq_MaximumNumberOfRetransmissions, 
				    Harq_retransmission_timer harq_retransmission_timer, 
				    long harq_power_offset)
		    {
			this(common_e_rnti_Info, 
			     new INTEGER(harq_MaximumNumberOfRetransmissions), 
			     harq_retransmission_timer, 
			     new INTEGER(harq_power_offset));
		    }
		    
		    public void initComponents()
		    {
			mComponents[0] = new Common_E_RNTI_Info();
			mComponents[1] = new INTEGER();
			mComponents[2] = Harq_retransmission_timer.ms10;
			mComponents[3] = new INTEGER();
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
				return new Common_E_RNTI_Info();
			    case 1:
				return new INTEGER();
			    case 2:
				return Harq_retransmission_timer.ms10;
			    case 3:
				return new INTEGER();
			    default:
				throw new InternalError("AbstractCollection.createInstance()");
			}
			
		    }
		    
		    
		    // Methods for field "common_e_rnti_Info"
		    public Common_E_RNTI_Info getCommon_e_rnti_Info()
		    {
			return (Common_E_RNTI_Info)mComponents[0];
		    }
		    
		    public void setCommon_e_rnti_Info(Common_E_RNTI_Info common_e_rnti_Info)
		    {
			mComponents[0] = common_e_rnti_Info;
		    }
		    
		    
		    // Methods for field "harq_MaximumNumberOfRetransmissions"
		    public long getHarq_MaximumNumberOfRetransmissions()
		    {
			return ((INTEGER)mComponents[1]).longValue();
		    }
		    
		    public void setHarq_MaximumNumberOfRetransmissions(long harq_MaximumNumberOfRetransmissions)
		    {
			setHarq_MaximumNumberOfRetransmissions(new INTEGER(harq_MaximumNumberOfRetransmissions));
		    }
		    
		    public void setHarq_MaximumNumberOfRetransmissions(INTEGER harq_MaximumNumberOfRetransmissions)
		    {
			mComponents[1] = harq_MaximumNumberOfRetransmissions;
		    }
		    
		    
		    // Methods for field "harq_retransmission_timer"
		    public Harq_retransmission_timer getHarq_retransmission_timer()
		    {
			return (Harq_retransmission_timer)mComponents[2];
		    }
		    
		    public void setHarq_retransmission_timer(Harq_retransmission_timer harq_retransmission_timer)
		    {
			mComponents[2] = harq_retransmission_timer;
		    }
		    
		    
		    
		    /**
		     * Define the ASN1 Type Harq_retransmission_timer from ASN1 Module InformationElements.
		     * @see Enumerated
		     */
		    public static final class Harq_retransmission_timer extends Enumerated {
			
			/**
			 * The default constructor.
			 */
			private Harq_retransmission_timer()
			{
			    super(cFirstNumber);
			}
			
			protected Harq_retransmission_timer(long value)
			{
			    super(value);
			}
			
			// Named list definitions.
			public static final Harq_retransmission_timer ms10 =
			    new Harq_retransmission_timer(0);
			public static final Harq_retransmission_timer ms15 =
			    new Harq_retransmission_timer(1);
			public static final Harq_retransmission_timer ms20 =
			    new Harq_retransmission_timer(2);
			public static final Harq_retransmission_timer ms25 =
			    new Harq_retransmission_timer(3);
			public static final Harq_retransmission_timer ms30 =
			    new Harq_retransmission_timer(4);
			public static final Harq_retransmission_timer ms35 =
			    new Harq_retransmission_timer(5);
			public static final Harq_retransmission_timer ms40 =
			    new Harq_retransmission_timer(6);
			public static final Harq_retransmission_timer ms45 =
			    new Harq_retransmission_timer(7);
			public static final Harq_retransmission_timer ms50 =
			    new Harq_retransmission_timer(8);
			public static final Harq_retransmission_timer ms55 =
			    new Harq_retransmission_timer(9);
			public static final Harq_retransmission_timer ms60 =
			    new Harq_retransmission_timer(10);
			public static final Harq_retransmission_timer ms65 =
			    new Harq_retransmission_timer(11);
			public static final Harq_retransmission_timer ms70 =
			    new Harq_retransmission_timer(12);
			public static final Harq_retransmission_timer ms75 =
			    new Harq_retransmission_timer(13);
			public static final Harq_retransmission_timer ms80 =
			    new Harq_retransmission_timer(14);
			public static final Harq_retransmission_timer ms85 =
			    new Harq_retransmission_timer(15);
			public static final Harq_retransmission_timer ms90 =
			    new Harq_retransmission_timer(16);
			public static final Harq_retransmission_timer ms95 =
			    new Harq_retransmission_timer(17);
			public static final Harq_retransmission_timer ms100 =
			    new Harq_retransmission_timer(18);
			public static final Harq_retransmission_timer ms110 =
			    new Harq_retransmission_timer(19);
			public static final Harq_retransmission_timer ms120 =
			    new Harq_retransmission_timer(20);
			public static final Harq_retransmission_timer ms140 =
			    new Harq_retransmission_timer(21);
			public static final Harq_retransmission_timer ms160 =
			    new Harq_retransmission_timer(22);
			private final static Harq_retransmission_timer cNamedNumbers[] = {
			     ms10, 
			     ms15, 
			     ms20, 
			     ms25, 
			     ms30, 
			     ms35, 
			     ms40, 
			     ms45, 
			     ms50, 
			     ms55, 
			     ms60, 
			     ms65, 
			     ms70, 
			     ms75, 
			     ms80, 
			     ms85, 
			     ms90, 
			     ms95, 
			     ms100, 
			     ms110, 
			     ms120, 
			     ms140, 
			     ms160
			};
			protected final static long cFirstNumber = 0;
			protected final static boolean cLinearNumbers = false;
			
			public Enumerated[] getNamedNumbers()
			{
			    return cNamedNumbers;
			}
			
			public boolean hasLinearNumbers()
			{
			    return cLinearNumbers;
			}
			
			public long getFirstNumber()
			{
			    return cFirstNumber;
			}
			
			public static Harq_retransmission_timer valueOf(long value)
			{
			    return (Harq_retransmission_timer)ms10.lookupValue(value);
			}
			
			/**
			 * Initialize the type descriptor.
			 */
			private static final EnumeratedInfo c_typeinfo = new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"CommonEDCHSystemInfo$ModeSpecificInfo$Tdd$Tdd128$Ccch_transmission_Info$Harq_retransmission_timer"
			    ),
			    new QName (
				"builtin",
				"ENUMERATED"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"ms10",
					0
				    ),
				    new MemberListElement (
					"ms15",
					1
				    ),
				    new MemberListElement (
					"ms20",
					2
				    ),
				    new MemberListElement (
					"ms25",
					3
				    ),
				    new MemberListElement (
					"ms30",
					4
				    ),
				    new MemberListElement (
					"ms35",
					5
				    ),
				    new MemberListElement (
					"ms40",
					6
				    ),
				    new MemberListElement (
					"ms45",
					7
				    ),
				    new MemberListElement (
					"ms50",
					8
				    ),
				    new MemberListElement (
					"ms55",
					9
				    ),
				    new MemberListElement (
					"ms60",
					10
				    ),
				    new MemberListElement (
					"ms65",
					11
				    ),
				    new MemberListElement (
					"ms70",
					12
				    ),
				    new MemberListElement (
					"ms75",
					13
				    ),
				    new MemberListElement (
					"ms80",
					14
				    ),
				    new MemberListElement (
					"ms85",
					15
				    ),
				    new MemberListElement (
					"ms90",
					16
				    ),
				    new MemberListElement (
					"ms95",
					17
				    ),
				    new MemberListElement (
					"ms100",
					18
				    ),
				    new MemberListElement (
					"ms110",
					19
				    ),
				    new MemberListElement (
					"ms120",
					20
				    ),
				    new MemberListElement (
					"ms140",
					21
				    ),
				    new MemberListElement (
					"ms160",
					22
				    )
				}
			    ),
			    0,
			    ms10
			);
			
			/**
			 * Get the type descriptor (TypeInfo) of 'this' Harq_retransmission_timer object.
			 */
			public TypeInfo getTypeInfo()
			{
			    return c_typeinfo;
			}
			
			/**
			 * Get the static type descriptor (TypeInfo) of 'this' Harq_retransmission_timer object.
			 */
			public static TypeInfo getStaticTypeInfo()
			{
			    return c_typeinfo;
			}
			
		    } // End class definition for Harq_retransmission_timer

		    // Methods for field "harq_power_offset"
		    public long getHarq_power_offset()
		    {
			return ((INTEGER)mComponents[3]).longValue();
		    }
		    
		    public void setHarq_power_offset(long harq_power_offset)
		    {
			setHarq_power_offset(new INTEGER(harq_power_offset));
		    }
		    
		    public void setHarq_power_offset(INTEGER harq_power_offset)
		    {
			mComponents[3] = harq_power_offset;
		    }
		    
		    
		    /**
		     * Initialize the type descriptor.
		     */
		    private static final SequenceInfo c_typeinfo = new SequenceInfo (
			new Tags (
			    new short[] {
				(short)0x8005
			    }
			),
			new QName (
			    "rrc.informationelements",
			    "CommonEDCHSystemInfo$ModeSpecificInfo$Tdd$Tdd128$Ccch_transmission_Info"
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
					new ContainerInfo (
					    new Tags (
						new short[] {
						    (short)0x8000
						}
					    ),
					    new QName (
						"rrc.informationelements",
						"Common_E_RNTI_Info"
					    ),
					    new QName (
						"InformationElements",
						"Common-E-RNTI-Info"
					    ),
					    12314,
					    new SizeConstraint (
						new ValueRangeConstraint (
						    new AbstractBounds(
							new com.oss.asn1.INTEGER(1), 
							new com.oss.asn1.INTEGER(256),
							0
						    )
						)
					    ),
					    new Bounds (
						new java.lang.Long(1),
						new java.lang.Long(256)
					    ),
					    new TypeInfoRef (
						new QName (
						    "rrc.informationelements",
						    "Common_E_RNTI_Info$Sequence_"
						)
					    )
					)
				    ),
				    "common-e-rnti-Info",
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
						    new com.oss.asn1.INTEGER(0), 
						    new com.oss.asn1.INTEGER(7),
						    0
						)
					    ),
					    new Bounds (
						new java.lang.Long(0),
						new java.lang.Long(7)
					    ),
					    null
					)
				    ),
				    "harq-MaximumNumberOfRetransmissions",
				    1,
				    2,
				    null
				),
				new SequenceFieldInfo (
				    new TypeInfoRef (
					new QName (
					    "rrc.informationelements",
					    "CommonEDCHSystemInfo$ModeSpecificInfo$Tdd$Tdd128$Ccch_transmission_Info$Harq_retransmission_timer"
					)
				    ),
				    "harq-retransmission-timer",
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
						    new com.oss.asn1.INTEGER(0), 
						    new com.oss.asn1.INTEGER(6),
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
				    "harq-power-offset",
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
				)
			    }
			),
			0
		    );
		    
		    /**
		     * Get the type descriptor (TypeInfo) of 'this' Ccch_transmission_Info object.
		     */
		    public TypeInfo getTypeInfo()
		    {
			return c_typeinfo;
		    }
		    
		    /**
		     * Get the static type descriptor (TypeInfo) of 'this' Ccch_transmission_Info object.
		     */
		    public static TypeInfo getStaticTypeInfo()
		    {
			return c_typeinfo;
		    }
		    
		} // End class definition for Ccch_transmission_Info

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
			"CommonEDCHSystemInfo$ModeSpecificInfo$Tdd$Tdd128"
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
					    "E_RUCCH_Info_TDD128"
					),
					new QName (
					    "InformationElements",
					    "E-RUCCH-Info-TDD128"
					),
					12314,
					null,
					new FieldsRef (
					    new QName (
						"rrc.informationelements",
						"E_RUCCH_Info_TDD128"
					    )
					),
					0,
					new TagDecodersRef (
					    new QName (
						"rrc.informationelements",
						"E_RUCCH_Info_TDD128"
					    )
					),
					0
				    )
				),
				"e-RUCCH-Info",
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
					    "E_PUCH_Info_TDD128"
					),
					new QName (
					    "InformationElements",
					    "E-PUCH-Info-TDD128"
					),
					12314,
					null,
					new FieldsRef (
					    new QName (
						"rrc.informationelements",
						"E_PUCH_Info_TDD128"
					    )
					),
					0,
					new TagDecodersRef (
					    new QName (
						"rrc.informationelements",
						"E_PUCH_Info_TDD128"
					    )
					),
					0
				    )
				),
				"e-PUCH-Info",
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
					    "E_HICH_Information_TDD128"
					),
					new QName (
					    "InformationElements",
					    "E-HICH-Information-TDD128"
					),
					12314,
					null,
					new FieldsRef (
					    new QName (
						"rrc.informationelements",
						"E_HICH_Information_TDD128"
					    )
					),
					0,
					new TagDecodersRef (
					    new QName (
						"rrc.informationelements",
						"E_HICH_Information_TDD128"
					    )
					),
					0
				    )
				),
				"e-hich-Information",
				2,
				2,
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
					    "E_AGCH_Information_TDD128"
					),
					new QName (
					    "InformationElements",
					    "E-AGCH-Information-TDD128"
					),
					12314,
					null,
					new FieldsRef (
					    new QName (
						"rrc.informationelements",
						"E_AGCH_Information_TDD128"
					    )
					),
					0,
					new TagDecodersRef (
					    new QName (
						"rrc.informationelements",
						"E_AGCH_Information_TDD128"
					    )
					),
					0
				    )
				),
				"e-agch-Information",
				3,
				2,
				null
			    ),
			    new SequenceFieldInfo (
				new TypeInfoRef (
				    new QName (
					"rrc.informationelements",
					"CommonEDCHSystemInfo$ModeSpecificInfo$Tdd$Tdd128$Harq_Info"
				    )
				),
				"harq-Info",
				4,
				2,
				null
			    ),
			    new SequenceFieldInfo (
				new TypeInfoRef (
				    new QName (
					"rrc.informationelements",
					"CommonEDCHSystemInfo$ModeSpecificInfo$Tdd$Tdd128$Ccch_transmission_Info"
				    )
				),
				"ccch-transmission-Info",
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
		    case tdd768_chosen:
			return new Null();
		    case tdd384_chosen:
			return new Null();
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
		    "CommonEDCHSystemInfo$ModeSpecificInfo$Tdd"
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
			    "tdd768",
			    0,
			    2
			),
			new FieldInfo (
			    new TypeInfoRef (
				new TypeInfo (
				    new Tags (
					new short[] {
					    (short)0x8001
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
			    "tdd384",
			    1,
			    2
			),
			new FieldInfo (
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "CommonEDCHSystemInfo$ModeSpecificInfo$Tdd$Tdd128"
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
		case dummy_chosen:
		    return new Dummy();
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
		"CommonEDCHSystemInfo$ModeSpecificInfo"
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
				"CommonEDCHSystemInfo$ModeSpecificInfo$Dummy"
			    )
			),
			"dummy",
			0,
			2
		    ),
		    new FieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.informationelements",
				"CommonEDCHSystemInfo$ModeSpecificInfo$Tdd"
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
	    "CommonEDCHSystemInfo"
	),
	new QName (
	    "InformationElements",
	    "CommonEDCHSystemInfo"
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
				"UL_Interference"
			    ),
			    new QName (
				"InformationElements",
				"UL-Interference"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new UL_Interference(-110), 
				    new UL_Interference(-70),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(-110),
				new java.lang.Long(-70)
			    ),
			    null
			)
		    ),
		    "ul-InterferenceForCommonEDCH",
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
				"Common_E_DCH_MAC_d_FlowList"
			    ),
			    new QName (
				"InformationElements",
				"Common-E-DCH-MAC-d-FlowList"
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
				    "Common_E_DCH_MAC_d_Flow"
				)
			    )
			)
		    ),
		    "common-E-DCH-MAC-d-FlowList",
		    1,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "CommonEDCHSystemInfo$ModeSpecificInfo"
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
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' CommonEDCHSystemInfo object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' CommonEDCHSystemInfo object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for CommonEDCHSystemInfo
