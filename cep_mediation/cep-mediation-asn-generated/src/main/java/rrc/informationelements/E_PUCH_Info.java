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
 * Define the ASN1 Type E_PUCH_Info from ASN1 Module InformationElements.
 * @see Sequence
 */

public class E_PUCH_Info extends Sequence {
    
    /**
     * The default constructor.
     */
    public E_PUCH_Info()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public E_PUCH_Info(E_TFCS_Info e_TFCS_Info, 
		    ModeSpecificInfo modeSpecificInfo, 
		    INTEGER powerOffsetForSchedInfo)
    {
	setE_TFCS_Info(e_TFCS_Info);
	setModeSpecificInfo(modeSpecificInfo);
	setPowerOffsetForSchedInfo(powerOffsetForSchedInfo);
    }
    
    /**
     * Construct with components.
     */
    public E_PUCH_Info(E_TFCS_Info e_TFCS_Info, 
		    ModeSpecificInfo modeSpecificInfo, 
		    long powerOffsetForSchedInfo)
    {
	this(e_TFCS_Info, modeSpecificInfo, 
	     new INTEGER(powerOffsetForSchedInfo));
    }
    
    /**
     * Construct with required components.
     */
    public E_PUCH_Info(E_TFCS_Info e_TFCS_Info, 
		    ModeSpecificInfo modeSpecificInfo)
    {
	setE_TFCS_Info(e_TFCS_Info);
	setModeSpecificInfo(modeSpecificInfo);
    }
    
    public void initComponents()
    {
	mComponents[0] = new E_TFCS_Info();
	mComponents[1] = new ModeSpecificInfo();
	mComponents[2] = new INTEGER();
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
		return new E_TFCS_Info();
	    case 1:
		return new ModeSpecificInfo();
	    case 2:
		return new INTEGER();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "e_TFCS_Info"
    public E_TFCS_Info getE_TFCS_Info()
    {
	return (E_TFCS_Info)mComponents[0];
    }
    
    public void setE_TFCS_Info(E_TFCS_Info e_TFCS_Info)
    {
	mComponents[0] = e_TFCS_Info;
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
	
	public static final  int  tdd348_tdd768_chosen = 1;
	public static final  int  tdd128_chosen = 2;
	
	// Methods for field "tdd348_tdd768"
	public static ModeSpecificInfo createModeSpecificInfoWithTdd348_tdd768(Tdd348_tdd768 tdd348_tdd768)
	{
	    ModeSpecificInfo __object = new ModeSpecificInfo();

	    __object.setTdd348_tdd768(tdd348_tdd768);
	    return __object;
	}
	
	public boolean hasTdd348_tdd768()
	{
	    return getChosenFlag() == tdd348_tdd768_chosen;
	}
	
	public void setTdd348_tdd768(Tdd348_tdd768 tdd348_tdd768)
	{
	    setChosenValue(tdd348_tdd768);
	    setChosenFlag(tdd348_tdd768_chosen);
	}
	
	
	
	/**
	 * Define the ASN1 Type Tdd348_tdd768 from ASN1 Module InformationElements.
	 * @see Sequence
	 */
	public static class Tdd348_tdd768 extends Sequence {
	    
	    /**
	     * The default constructor.
	     */
	    public Tdd348_tdd768()
	    {
	    }
	    
	    /**
	     * Construct with AbstractData components.
	     */
	    public Tdd348_tdd768(INTEGER noSlotsForTFCIandTPC, 
			    INTEGER e_PUCH_ContantValue, 
			    E_PUCH_TS_ConfigurationList e_PUCH_TS_ConfigurationList, 
			    BOOLEAN e_PUCH_CodeHopping, 
			    INTEGER e_PUCH_TPC_Step_Size, 
			    INTEGER minimum_Allowed_Code_Rate, 
			    INTEGER maximum_Allowed_Code_Rate)
	    {
		setNoSlotsForTFCIandTPC(noSlotsForTFCIandTPC);
		setE_PUCH_ContantValue(e_PUCH_ContantValue);
		setE_PUCH_TS_ConfigurationList(e_PUCH_TS_ConfigurationList);
		setE_PUCH_CodeHopping(e_PUCH_CodeHopping);
		setE_PUCH_TPC_Step_Size(e_PUCH_TPC_Step_Size);
		setMinimum_Allowed_Code_Rate(minimum_Allowed_Code_Rate);
		setMaximum_Allowed_Code_Rate(maximum_Allowed_Code_Rate);
	    }
	    
	    /**
	     * Construct with components.
	     */
	    public Tdd348_tdd768(long noSlotsForTFCIandTPC, 
			    long e_PUCH_ContantValue, 
			    E_PUCH_TS_ConfigurationList e_PUCH_TS_ConfigurationList, 
			    boolean e_PUCH_CodeHopping, 
			    long e_PUCH_TPC_Step_Size, 
			    long minimum_Allowed_Code_Rate, 
			    long maximum_Allowed_Code_Rate)
	    {
		this(new INTEGER(noSlotsForTFCIandTPC), 
		     new INTEGER(e_PUCH_ContantValue), 
		     e_PUCH_TS_ConfigurationList, 
		     new BOOLEAN(e_PUCH_CodeHopping), 
		     new INTEGER(e_PUCH_TPC_Step_Size), 
		     new INTEGER(minimum_Allowed_Code_Rate), 
		     new INTEGER(maximum_Allowed_Code_Rate));
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new INTEGER();
		mComponents[1] = new INTEGER();
		mComponents[2] = new E_PUCH_TS_ConfigurationList();
		mComponents[3] = new BOOLEAN();
		mComponents[4] = new INTEGER();
		mComponents[5] = new INTEGER();
		mComponents[6] = new INTEGER();
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
			return new INTEGER();
		    case 1:
			return new INTEGER();
		    case 2:
			return new E_PUCH_TS_ConfigurationList();
		    case 3:
			return new BOOLEAN();
		    case 4:
			return new INTEGER();
		    case 5:
			return new INTEGER();
		    case 6:
			return new INTEGER();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "noSlotsForTFCIandTPC"
	    public long getNoSlotsForTFCIandTPC()
	    {
		return ((INTEGER)mComponents[0]).longValue();
	    }
	    
	    public void setNoSlotsForTFCIandTPC(long noSlotsForTFCIandTPC)
	    {
		setNoSlotsForTFCIandTPC(new INTEGER(noSlotsForTFCIandTPC));
	    }
	    
	    public void setNoSlotsForTFCIandTPC(INTEGER noSlotsForTFCIandTPC)
	    {
		mComponents[0] = noSlotsForTFCIandTPC;
	    }
	    
	    
	    // Methods for field "e_PUCH_ContantValue"
	    public long getE_PUCH_ContantValue()
	    {
		return ((INTEGER)mComponents[1]).longValue();
	    }
	    
	    public void setE_PUCH_ContantValue(long e_PUCH_ContantValue)
	    {
		setE_PUCH_ContantValue(new INTEGER(e_PUCH_ContantValue));
	    }
	    
	    public void setE_PUCH_ContantValue(INTEGER e_PUCH_ContantValue)
	    {
		mComponents[1] = e_PUCH_ContantValue;
	    }
	    
	    
	    // Methods for field "e_PUCH_TS_ConfigurationList"
	    public E_PUCH_TS_ConfigurationList getE_PUCH_TS_ConfigurationList()
	    {
		return (E_PUCH_TS_ConfigurationList)mComponents[2];
	    }
	    
	    public void setE_PUCH_TS_ConfigurationList(E_PUCH_TS_ConfigurationList e_PUCH_TS_ConfigurationList)
	    {
		mComponents[2] = e_PUCH_TS_ConfigurationList;
	    }
	    
	    
	    
	    /**
	     * Define the ASN1 Type E_PUCH_TS_ConfigurationList from ASN1 Module InformationElements.
	     * @see SequenceOf
	     */
	    public static class E_PUCH_TS_ConfigurationList extends SequenceOf {
		
		/**
		 * The default constructor.
		 */
		public E_PUCH_TS_ConfigurationList()
		{
		}
		
		/**
		 * Construct from an array of components.
		 */
		public E_PUCH_TS_ConfigurationList(E_PUCH_TS_Slots[] elements)
		{
		    super(elements);
		}
		
		/**
		 * Add an Element to the SEQUENCE OF/SET OF.
		 */
		public synchronized void add(E_PUCH_TS_Slots element)
		{
		    super.addElement(element);
		}
		
		/**
		 * Set an Element in the SEQUENCE OF/SET OF.
		 */
		public synchronized void set(E_PUCH_TS_Slots element, int atIndex)
		{
		    super.setElement(element, atIndex);
		}
		
		/**
		 * Get an Element from the SEQUENCE OF/SET OF.
		 */
		public synchronized E_PUCH_TS_Slots get(int atIndex)
		{
		    return (E_PUCH_TS_Slots)super.getElement(atIndex);
		}
		
		/**
		 * Insert an Element into the SEQUENCE OF/SET OF.
		 */
		public synchronized void insert(E_PUCH_TS_Slots element, int atIndex)
		{
		    super.insertElement(element, atIndex);
		}
		
		/**
		 * Remove an Element from the SEQUENCE OF/SET OF.
		 */
		public synchronized void remove(E_PUCH_TS_Slots element)
		{
		    super.removeElement(element);
		}
		
		/**
		 * Create an instance of  SEQUENCE OF/SET OF.
		 */
		public AbstractData createInstance()
		{
		    return (AbstractData)new E_PUCH_TS_Slots();
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
			"E_PUCH_Info$ModeSpecificInfo$Tdd348_tdd768$E_PUCH_TS_ConfigurationList"
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
				new com.oss.asn1.INTEGER(12),
				0
			    )
			)
		    ),
		    new Bounds (
			new java.lang.Long(1),
			new java.lang.Long(12)
		    ),
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "E_PUCH_TS_Slots"
			)
		    )
		);
		
		/**
		 * Get the type descriptor (TypeInfo) of 'this' E_PUCH_TS_ConfigurationList object.
		 */
		public TypeInfo getTypeInfo()
		{
		    return c_typeinfo;
		}
		
		/**
		 * Get the static type descriptor (TypeInfo) of 'this' E_PUCH_TS_ConfigurationList object.
		 */
		public static TypeInfo getStaticTypeInfo()
		{
		    return c_typeinfo;
		}
		
	    } // End class definition for E_PUCH_TS_ConfigurationList

	    // Methods for field "e_PUCH_CodeHopping"
	    public boolean getE_PUCH_CodeHopping()
	    {
		return ((BOOLEAN)mComponents[3]).booleanValue();
	    }
	    
	    public void setE_PUCH_CodeHopping(boolean e_PUCH_CodeHopping)
	    {
		setE_PUCH_CodeHopping(new BOOLEAN(e_PUCH_CodeHopping));
	    }
	    
	    public void setE_PUCH_CodeHopping(BOOLEAN e_PUCH_CodeHopping)
	    {
		mComponents[3] = e_PUCH_CodeHopping;
	    }
	    
	    
	    // Methods for field "e_PUCH_TPC_Step_Size"
	    public long getE_PUCH_TPC_Step_Size()
	    {
		return ((INTEGER)mComponents[4]).longValue();
	    }
	    
	    public void setE_PUCH_TPC_Step_Size(long e_PUCH_TPC_Step_Size)
	    {
		setE_PUCH_TPC_Step_Size(new INTEGER(e_PUCH_TPC_Step_Size));
	    }
	    
	    public void setE_PUCH_TPC_Step_Size(INTEGER e_PUCH_TPC_Step_Size)
	    {
		mComponents[4] = e_PUCH_TPC_Step_Size;
	    }
	    
	    
	    // Methods for field "minimum_Allowed_Code_Rate"
	    public long getMinimum_Allowed_Code_Rate()
	    {
		return ((INTEGER)mComponents[5]).longValue();
	    }
	    
	    public void setMinimum_Allowed_Code_Rate(long minimum_Allowed_Code_Rate)
	    {
		setMinimum_Allowed_Code_Rate(new INTEGER(minimum_Allowed_Code_Rate));
	    }
	    
	    public void setMinimum_Allowed_Code_Rate(INTEGER minimum_Allowed_Code_Rate)
	    {
		mComponents[5] = minimum_Allowed_Code_Rate;
	    }
	    
	    
	    // Methods for field "maximum_Allowed_Code_Rate"
	    public long getMaximum_Allowed_Code_Rate()
	    {
		return ((INTEGER)mComponents[6]).longValue();
	    }
	    
	    public void setMaximum_Allowed_Code_Rate(long maximum_Allowed_Code_Rate)
	    {
		setMaximum_Allowed_Code_Rate(new INTEGER(maximum_Allowed_Code_Rate));
	    }
	    
	    public void setMaximum_Allowed_Code_Rate(INTEGER maximum_Allowed_Code_Rate)
	    {
		mComponents[6] = maximum_Allowed_Code_Rate;
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
		    "E_PUCH_Info$ModeSpecificInfo$Tdd348_tdd768"
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
					    new com.oss.asn1.INTEGER(12),
					    0
					)
				    ),
				    new Bounds (
					new java.lang.Long(1),
					new java.lang.Long(12)
				    ),
				    null
				)
			    ),
			    "noSlotsForTFCIandTPC",
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
					    new com.oss.asn1.INTEGER(-35), 
					    new com.oss.asn1.INTEGER(10),
					    0
					)
				    ),
				    new Bounds (
					new java.lang.Long(-35),
					new java.lang.Long(10)
				    ),
				    null
				)
			    ),
			    "e-PUCH-ContantValue",
			    1,
			    2,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "E_PUCH_Info$ModeSpecificInfo$Tdd348_tdd768$E_PUCH_TS_ConfigurationList"
				)
			    ),
			    "e-PUCH-TS-ConfigurationList",
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
			    "e-PUCH-CodeHopping",
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
					    new com.oss.asn1.INTEGER(1), 
					    new com.oss.asn1.INTEGER(3),
					    0
					)
				    ),
				    new Bounds (
					new java.lang.Long(1),
					new java.lang.Long(3)
				    ),
				    null
				)
			    ),
			    "e-PUCH-TPC-Step-Size",
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
					    new com.oss.asn1.INTEGER(63),
					    0
					)
				    ),
				    new Bounds (
					new java.lang.Long(0),
					new java.lang.Long(63)
				    ),
				    null
				)
			    ),
			    "minimum-Allowed-Code-Rate",
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
					    new com.oss.asn1.INTEGER(63),
					    0
					)
				    ),
				    new Bounds (
					new java.lang.Long(0),
					new java.lang.Long(63)
				    ),
				    null
				)
			    ),
			    "maximum-Allowed-Code-Rate",
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
	     * Get the type descriptor (TypeInfo) of 'this' Tdd348_tdd768 object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' Tdd348_tdd768 object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for Tdd348_tdd768

	// Methods for field "tdd128"
	public static ModeSpecificInfo createModeSpecificInfoWithTdd128(Tdd128 tdd128)
	{
	    ModeSpecificInfo __object = new ModeSpecificInfo();

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
	    public Tdd128(Snpl_ReportType snpl_ReportType, 
			    INTEGER prxdes_base, BOOLEAN beaconPLEst, 
			    TPC_StepSizeTDD tpc_StepSize, 
			    PowerControlGAP pebase_PowerControlGAP, 
			    UL_SynchronisationParameters_r4 ul_SynchronisationParameters, 
			    E_PUCH_TS_ConfigurationList e_PUCH_TS_ConfigurationList, 
			    INTEGER minimum_Allowed_Code_Rate, 
			    INTEGER maximum_Allowed_Code_Rate, 
			    INTEGER maximumNumOfRetransSchedInfo, 
			    RetransTimerForSchedInfo retransTimerForSchedInfo)
	    {
		setSnpl_ReportType(snpl_ReportType);
		setPrxdes_base(prxdes_base);
		setBeaconPLEst(beaconPLEst);
		setTpc_StepSize(tpc_StepSize);
		setPebase_PowerControlGAP(pebase_PowerControlGAP);
		setUl_SynchronisationParameters(ul_SynchronisationParameters);
		setE_PUCH_TS_ConfigurationList(e_PUCH_TS_ConfigurationList);
		setMinimum_Allowed_Code_Rate(minimum_Allowed_Code_Rate);
		setMaximum_Allowed_Code_Rate(maximum_Allowed_Code_Rate);
		setMaximumNumOfRetransSchedInfo(maximumNumOfRetransSchedInfo);
		setRetransTimerForSchedInfo(retransTimerForSchedInfo);
	    }
	    
	    /**
	     * Construct with components.
	     */
	    public Tdd128(Snpl_ReportType snpl_ReportType, long prxdes_base, 
			    boolean beaconPLEst, TPC_StepSizeTDD tpc_StepSize, 
			    PowerControlGAP pebase_PowerControlGAP, 
			    UL_SynchronisationParameters_r4 ul_SynchronisationParameters, 
			    E_PUCH_TS_ConfigurationList e_PUCH_TS_ConfigurationList, 
			    long minimum_Allowed_Code_Rate, 
			    long maximum_Allowed_Code_Rate, 
			    long maximumNumOfRetransSchedInfo, 
			    RetransTimerForSchedInfo retransTimerForSchedInfo)
	    {
		this(snpl_ReportType, new INTEGER(prxdes_base), 
		     new BOOLEAN(beaconPLEst), tpc_StepSize, 
		     pebase_PowerControlGAP, ul_SynchronisationParameters, 
		     e_PUCH_TS_ConfigurationList, 
		     new INTEGER(minimum_Allowed_Code_Rate), 
		     new INTEGER(maximum_Allowed_Code_Rate), 
		     new INTEGER(maximumNumOfRetransSchedInfo), 
		     retransTimerForSchedInfo);
	    }
	    
	    /**
	     * Construct with required components.
	     */
	    public Tdd128(long prxdes_base, TPC_StepSizeTDD tpc_StepSize, 
			    E_PUCH_TS_ConfigurationList e_PUCH_TS_ConfigurationList, 
			    long minimum_Allowed_Code_Rate, 
			    long maximum_Allowed_Code_Rate, 
			    long maximumNumOfRetransSchedInfo, 
			    RetransTimerForSchedInfo retransTimerForSchedInfo)
	    {
		setPrxdes_base(prxdes_base);
		setTpc_StepSize(tpc_StepSize);
		setE_PUCH_TS_ConfigurationList(e_PUCH_TS_ConfigurationList);
		setMinimum_Allowed_Code_Rate(minimum_Allowed_Code_Rate);
		setMaximum_Allowed_Code_Rate(maximum_Allowed_Code_Rate);
		setMaximumNumOfRetransSchedInfo(maximumNumOfRetransSchedInfo);
		setRetransTimerForSchedInfo(retransTimerForSchedInfo);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = Snpl_ReportType.type1;
		mComponents[1] = new INTEGER();
		mComponents[2] = new BOOLEAN();
		mComponents[3] = new TPC_StepSizeTDD();
		mComponents[4] = new PowerControlGAP();
		mComponents[5] = new UL_SynchronisationParameters_r4();
		mComponents[6] = new E_PUCH_TS_ConfigurationList();
		mComponents[7] = new INTEGER();
		mComponents[8] = new INTEGER();
		mComponents[9] = new INTEGER();
		mComponents[10] = RetransTimerForSchedInfo.ms10;
	    }
	    
	    // Instance initializer
	    {
		mComponents = new AbstractData[11];
	    }
	    
	    // Method to create a specific component instance
	    public AbstractData createInstance(int index)
	    {
		switch (index) {
		    case 0:
			return Snpl_ReportType.type1;
		    case 1:
			return new INTEGER();
		    case 2:
			return new BOOLEAN();
		    case 3:
			return new TPC_StepSizeTDD();
		    case 4:
			return new PowerControlGAP();
		    case 5:
			return new UL_SynchronisationParameters_r4();
		    case 6:
			return new E_PUCH_TS_ConfigurationList();
		    case 7:
			return new INTEGER();
		    case 8:
			return new INTEGER();
		    case 9:
			return new INTEGER();
		    case 10:
			return RetransTimerForSchedInfo.ms10;
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "snpl_ReportType"
	    public Snpl_ReportType getSnpl_ReportType()
	    {
		return (Snpl_ReportType)mComponents[0];
	    }
	    
	    public void setSnpl_ReportType(Snpl_ReportType snpl_ReportType)
	    {
		mComponents[0] = snpl_ReportType;
	    }
	    
	    public boolean hasSnpl_ReportType()
	    {
		return componentIsPresent(0);
	    }
	    
	    public void deleteSnpl_ReportType()
	    {
		setComponentAbsent(0);
	    }
	    
	    
	    
	    /**
	     * Define the ASN1 Type Snpl_ReportType from ASN1 Module InformationElements.
	     * @see Enumerated
	     */
	    public static final class Snpl_ReportType extends Enumerated {
		
		/**
		 * The default constructor.
		 */
		private Snpl_ReportType()
		{
		    super(cFirstNumber);
		}
		
		protected Snpl_ReportType(long value)
		{
		    super(value);
		}
		
		// Named list definitions.
		public static final Snpl_ReportType type1 =
		    new Snpl_ReportType(0);
		public static final Snpl_ReportType type2 =
		    new Snpl_ReportType(1);
		private final static Snpl_ReportType cNamedNumbers[] = {
		     type1, 
		     type2
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
		
		public static Snpl_ReportType valueOf(long value)
		{
		    return (Snpl_ReportType)type1.lookupValue(value);
		}
		
		/**
		 * Initialize the type descriptor.
		 */
		private static final EnumeratedInfo c_typeinfo = new EnumeratedInfo (
		    new Tags (
			new short[] {
			    (short)0x8000
			}
		    ),
		    new QName (
			"rrc.informationelements",
			"E_PUCH_Info$ModeSpecificInfo$Tdd128$Snpl_ReportType"
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
				"type1",
				0
			    ),
			    new MemberListElement (
				"type2",
				1
			    )
			}
		    ),
		    0,
		    type1
		);
		
		/**
		 * Get the type descriptor (TypeInfo) of 'this' Snpl_ReportType object.
		 */
		public TypeInfo getTypeInfo()
		{
		    return c_typeinfo;
		}
		
		/**
		 * Get the static type descriptor (TypeInfo) of 'this' Snpl_ReportType object.
		 */
		public static TypeInfo getStaticTypeInfo()
		{
		    return c_typeinfo;
		}
		
	    } // End class definition for Snpl_ReportType

	    // Methods for field "prxdes_base"
	    public long getPrxdes_base()
	    {
		return ((INTEGER)mComponents[1]).longValue();
	    }
	    
	    public void setPrxdes_base(long prxdes_base)
	    {
		setPrxdes_base(new INTEGER(prxdes_base));
	    }
	    
	    public void setPrxdes_base(INTEGER prxdes_base)
	    {
		mComponents[1] = prxdes_base;
	    }
	    
	    
	    // Methods for field "beaconPLEst"
	    public boolean getBeaconPLEst()
	    {
		return ((BOOLEAN)mComponents[2]).booleanValue();
	    }
	    
	    public void setBeaconPLEst(boolean beaconPLEst)
	    {
		setBeaconPLEst(new BOOLEAN(beaconPLEst));
	    }
	    
	    public void setBeaconPLEst(BOOLEAN beaconPLEst)
	    {
		mComponents[2] = beaconPLEst;
	    }
	    
	    public boolean hasBeaconPLEst()
	    {
		return componentIsPresent(2);
	    }
	    
	    public void deleteBeaconPLEst()
	    {
		setComponentAbsent(2);
	    }
	    
	    
	    // Methods for field "tpc_StepSize"
	    public TPC_StepSizeTDD getTpc_StepSize()
	    {
		return (TPC_StepSizeTDD)mComponents[3];
	    }
	    
	    public void setTpc_StepSize(TPC_StepSizeTDD tpc_StepSize)
	    {
		mComponents[3] = tpc_StepSize;
	    }
	    
	    
	    // Methods for field "pebase_PowerControlGAP"
	    public PowerControlGAP getPebase_PowerControlGAP()
	    {
		return (PowerControlGAP)mComponents[4];
	    }
	    
	    public void setPebase_PowerControlGAP(PowerControlGAP pebase_PowerControlGAP)
	    {
		mComponents[4] = pebase_PowerControlGAP;
	    }
	    
	    public boolean hasPebase_PowerControlGAP()
	    {
		return componentIsPresent(4);
	    }
	    
	    public void deletePebase_PowerControlGAP()
	    {
		setComponentAbsent(4);
	    }
	    
	    
	    // Methods for field "ul_SynchronisationParameters"
	    public UL_SynchronisationParameters_r4 getUl_SynchronisationParameters()
	    {
		return (UL_SynchronisationParameters_r4)mComponents[5];
	    }
	    
	    public void setUl_SynchronisationParameters(UL_SynchronisationParameters_r4 ul_SynchronisationParameters)
	    {
		mComponents[5] = ul_SynchronisationParameters;
	    }
	    
	    public boolean hasUl_SynchronisationParameters()
	    {
		return componentIsPresent(5);
	    }
	    
	    public void deleteUl_SynchronisationParameters()
	    {
		setComponentAbsent(5);
	    }
	    
	    
	    // Methods for field "e_PUCH_TS_ConfigurationList"
	    public E_PUCH_TS_ConfigurationList getE_PUCH_TS_ConfigurationList()
	    {
		return (E_PUCH_TS_ConfigurationList)mComponents[6];
	    }
	    
	    public void setE_PUCH_TS_ConfigurationList(E_PUCH_TS_ConfigurationList e_PUCH_TS_ConfigurationList)
	    {
		mComponents[6] = e_PUCH_TS_ConfigurationList;
	    }
	    
	    
	    
	    /**
	     * Define the ASN1 Type E_PUCH_TS_ConfigurationList from ASN1 Module InformationElements.
	     * @see SequenceOf
	     */
	    public static class E_PUCH_TS_ConfigurationList extends SequenceOf {
		
		/**
		 * The default constructor.
		 */
		public E_PUCH_TS_ConfigurationList()
		{
		}
		
		/**
		 * Construct from an array of components.
		 */
		public E_PUCH_TS_ConfigurationList(E_PUCH_TS_Slots_LCR[] elements)
		{
		    super(elements);
		}
		
		/**
		 * Add an Element to the SEQUENCE OF/SET OF.
		 */
		public synchronized void add(E_PUCH_TS_Slots_LCR element)
		{
		    super.addElement(element);
		}
		
		/**
		 * Set an Element in the SEQUENCE OF/SET OF.
		 */
		public synchronized void set(E_PUCH_TS_Slots_LCR element, int atIndex)
		{
		    super.setElement(element, atIndex);
		}
		
		/**
		 * Get an Element from the SEQUENCE OF/SET OF.
		 */
		public synchronized E_PUCH_TS_Slots_LCR get(int atIndex)
		{
		    return (E_PUCH_TS_Slots_LCR)super.getElement(atIndex);
		}
		
		/**
		 * Insert an Element into the SEQUENCE OF/SET OF.
		 */
		public synchronized void insert(E_PUCH_TS_Slots_LCR element, int atIndex)
		{
		    super.insertElement(element, atIndex);
		}
		
		/**
		 * Remove an Element from the SEQUENCE OF/SET OF.
		 */
		public synchronized void remove(E_PUCH_TS_Slots_LCR element)
		{
		    super.removeElement(element);
		}
		
		/**
		 * Create an instance of  SEQUENCE OF/SET OF.
		 */
		public AbstractData createInstance()
		{
		    return (AbstractData)new E_PUCH_TS_Slots_LCR();
		}
		
		/**
		 * Initialize the type descriptor.
		 */
		private static final ContainerInfo c_typeinfo = new ContainerInfo (
		    new Tags (
			new short[] {
			    (short)0x8006
			}
		    ),
		    new QName (
			"rrc.informationelements",
			"E_PUCH_Info$ModeSpecificInfo$Tdd128$E_PUCH_TS_ConfigurationList"
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
				new com.oss.asn1.INTEGER(5),
				0
			    )
			)
		    ),
		    new Bounds (
			new java.lang.Long(1),
			new java.lang.Long(5)
		    ),
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "E_PUCH_TS_Slots_LCR"
			)
		    )
		);
		
		/**
		 * Get the type descriptor (TypeInfo) of 'this' E_PUCH_TS_ConfigurationList object.
		 */
		public TypeInfo getTypeInfo()
		{
		    return c_typeinfo;
		}
		
		/**
		 * Get the static type descriptor (TypeInfo) of 'this' E_PUCH_TS_ConfigurationList object.
		 */
		public static TypeInfo getStaticTypeInfo()
		{
		    return c_typeinfo;
		}
		
	    } // End class definition for E_PUCH_TS_ConfigurationList

	    // Methods for field "minimum_Allowed_Code_Rate"
	    public long getMinimum_Allowed_Code_Rate()
	    {
		return ((INTEGER)mComponents[7]).longValue();
	    }
	    
	    public void setMinimum_Allowed_Code_Rate(long minimum_Allowed_Code_Rate)
	    {
		setMinimum_Allowed_Code_Rate(new INTEGER(minimum_Allowed_Code_Rate));
	    }
	    
	    public void setMinimum_Allowed_Code_Rate(INTEGER minimum_Allowed_Code_Rate)
	    {
		mComponents[7] = minimum_Allowed_Code_Rate;
	    }
	    
	    
	    // Methods for field "maximum_Allowed_Code_Rate"
	    public long getMaximum_Allowed_Code_Rate()
	    {
		return ((INTEGER)mComponents[8]).longValue();
	    }
	    
	    public void setMaximum_Allowed_Code_Rate(long maximum_Allowed_Code_Rate)
	    {
		setMaximum_Allowed_Code_Rate(new INTEGER(maximum_Allowed_Code_Rate));
	    }
	    
	    public void setMaximum_Allowed_Code_Rate(INTEGER maximum_Allowed_Code_Rate)
	    {
		mComponents[8] = maximum_Allowed_Code_Rate;
	    }
	    
	    
	    // Methods for field "maximumNumOfRetransSchedInfo"
	    public long getMaximumNumOfRetransSchedInfo()
	    {
		return ((INTEGER)mComponents[9]).longValue();
	    }
	    
	    public void setMaximumNumOfRetransSchedInfo(long maximumNumOfRetransSchedInfo)
	    {
		setMaximumNumOfRetransSchedInfo(new INTEGER(maximumNumOfRetransSchedInfo));
	    }
	    
	    public void setMaximumNumOfRetransSchedInfo(INTEGER maximumNumOfRetransSchedInfo)
	    {
		mComponents[9] = maximumNumOfRetransSchedInfo;
	    }
	    
	    
	    // Methods for field "retransTimerForSchedInfo"
	    public RetransTimerForSchedInfo getRetransTimerForSchedInfo()
	    {
		return (RetransTimerForSchedInfo)mComponents[10];
	    }
	    
	    public void setRetransTimerForSchedInfo(RetransTimerForSchedInfo retransTimerForSchedInfo)
	    {
		mComponents[10] = retransTimerForSchedInfo;
	    }
	    
	    
	    
	    /**
	     * Define the ASN1 Type RetransTimerForSchedInfo from ASN1 Module InformationElements.
	     * @see Enumerated
	     */
	    public static final class RetransTimerForSchedInfo extends Enumerated {
		
		/**
		 * The default constructor.
		 */
		private RetransTimerForSchedInfo()
		{
		    super(cFirstNumber);
		}
		
		protected RetransTimerForSchedInfo(long value)
		{
		    super(value);
		}
		
		// Named list definitions.
		public static final RetransTimerForSchedInfo ms10 =
		    new RetransTimerForSchedInfo(0);
		public static final RetransTimerForSchedInfo ms15 =
		    new RetransTimerForSchedInfo(1);
		public static final RetransTimerForSchedInfo ms20 =
		    new RetransTimerForSchedInfo(2);
		public static final RetransTimerForSchedInfo ms25 =
		    new RetransTimerForSchedInfo(3);
		public static final RetransTimerForSchedInfo ms30 =
		    new RetransTimerForSchedInfo(4);
		public static final RetransTimerForSchedInfo ms35 =
		    new RetransTimerForSchedInfo(5);
		public static final RetransTimerForSchedInfo ms40 =
		    new RetransTimerForSchedInfo(6);
		public static final RetransTimerForSchedInfo ms45 =
		    new RetransTimerForSchedInfo(7);
		public static final RetransTimerForSchedInfo ms50 =
		    new RetransTimerForSchedInfo(8);
		public static final RetransTimerForSchedInfo ms55 =
		    new RetransTimerForSchedInfo(9);
		public static final RetransTimerForSchedInfo ms60 =
		    new RetransTimerForSchedInfo(10);
		public static final RetransTimerForSchedInfo ms65 =
		    new RetransTimerForSchedInfo(11);
		public static final RetransTimerForSchedInfo ms70 =
		    new RetransTimerForSchedInfo(12);
		public static final RetransTimerForSchedInfo ms75 =
		    new RetransTimerForSchedInfo(13);
		public static final RetransTimerForSchedInfo ms80 =
		    new RetransTimerForSchedInfo(14);
		public static final RetransTimerForSchedInfo ms85 =
		    new RetransTimerForSchedInfo(15);
		public static final RetransTimerForSchedInfo ms90 =
		    new RetransTimerForSchedInfo(16);
		public static final RetransTimerForSchedInfo ms95 =
		    new RetransTimerForSchedInfo(17);
		public static final RetransTimerForSchedInfo ms100 =
		    new RetransTimerForSchedInfo(18);
		public static final RetransTimerForSchedInfo ms110 =
		    new RetransTimerForSchedInfo(19);
		public static final RetransTimerForSchedInfo ms120 =
		    new RetransTimerForSchedInfo(20);
		public static final RetransTimerForSchedInfo ms140 =
		    new RetransTimerForSchedInfo(21);
		public static final RetransTimerForSchedInfo ms160 =
		    new RetransTimerForSchedInfo(22);
		public static final RetransTimerForSchedInfo ms200 =
		    new RetransTimerForSchedInfo(23);
		public static final RetransTimerForSchedInfo ms240 =
		    new RetransTimerForSchedInfo(24);
		public static final RetransTimerForSchedInfo ms280 =
		    new RetransTimerForSchedInfo(25);
		public static final RetransTimerForSchedInfo ms320 =
		    new RetransTimerForSchedInfo(26);
		public static final RetransTimerForSchedInfo ms400 =
		    new RetransTimerForSchedInfo(27);
		public static final RetransTimerForSchedInfo ms480 =
		    new RetransTimerForSchedInfo(28);
		public static final RetransTimerForSchedInfo ms560 =
		    new RetransTimerForSchedInfo(29);
		private final static RetransTimerForSchedInfo cNamedNumbers[] = {
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
		     ms160, 
		     ms200, 
		     ms240, 
		     ms280, 
		     ms320, 
		     ms400, 
		     ms480, 
		     ms560
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
		
		public static RetransTimerForSchedInfo valueOf(long value)
		{
		    return (RetransTimerForSchedInfo)ms10.lookupValue(value);
		}
		
		/**
		 * Initialize the type descriptor.
		 */
		private static final EnumeratedInfo c_typeinfo = new EnumeratedInfo (
		    new Tags (
			new short[] {
			    (short)0x800a
			}
		    ),
		    new QName (
			"rrc.informationelements",
			"E_PUCH_Info$ModeSpecificInfo$Tdd128$RetransTimerForSchedInfo"
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
			    ),
			    new MemberListElement (
				"ms200",
				23
			    ),
			    new MemberListElement (
				"ms240",
				24
			    ),
			    new MemberListElement (
				"ms280",
				25
			    ),
			    new MemberListElement (
				"ms320",
				26
			    ),
			    new MemberListElement (
				"ms400",
				27
			    ),
			    new MemberListElement (
				"ms480",
				28
			    ),
			    new MemberListElement (
				"ms560",
				29
			    )
			}
		    ),
		    0,
		    ms10
		);
		
		/**
		 * Get the type descriptor (TypeInfo) of 'this' RetransTimerForSchedInfo object.
		 */
		public TypeInfo getTypeInfo()
		{
		    return c_typeinfo;
		}
		
		/**
		 * Get the static type descriptor (TypeInfo) of 'this' RetransTimerForSchedInfo object.
		 */
		public static TypeInfo getStaticTypeInfo()
		{
		    return c_typeinfo;
		}
		
	    } // End class definition for RetransTimerForSchedInfo

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
		    "E_PUCH_Info$ModeSpecificInfo$Tdd128"
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
				new QName (
				    "rrc.informationelements",
				    "E_PUCH_Info$ModeSpecificInfo$Tdd128$Snpl_ReportType"
				)
			    ),
			    "snpl-ReportType",
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
					    new com.oss.asn1.INTEGER(-112), 
					    new com.oss.asn1.INTEGER(-50),
					    0
					)
				    ),
				    new Bounds (
					new java.lang.Long(-112),
					new java.lang.Long(-50)
				    ),
				    null
				)
			    ),
			    "prxdes-base",
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
			    "beaconPLEst",
			    2,
			    3,
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
					"TPC_StepSizeTDD"
				    ),
				    new QName (
					"InformationElements",
					"TPC-StepSizeTDD"
				    ),
				    12314,
				    new ValueRangeConstraint (
					new AbstractBounds(
					    new TPC_StepSizeTDD(1), 
					    new TPC_StepSizeTDD(3),
					    0
					)
				    ),
				    new Bounds (
					new java.lang.Long(1),
					new java.lang.Long(3)
				    ),
				    null
				)
			    ),
			    "tpc-StepSize",
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
					"PowerControlGAP"
				    ),
				    new QName (
					"InformationElements",
					"PowerControlGAP"
				    ),
				    12314,
				    new ValueRangeConstraint (
					new AbstractBounds(
					    new PowerControlGAP(0), 
					    new PowerControlGAP(255),
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
			    "pebase-PowerControlGAP",
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
					"UL_SynchronisationParameters_r4"
				    ),
				    new QName (
					"InformationElements",
					"UL-SynchronisationParameters-r4"
				    ),
				    12314,
				    null,
				    new FieldsRef (
					new QName (
					    "rrc.informationelements",
					    "UL_SynchronisationParameters_r4"
					)
				    ),
				    0,
				    new TagDecodersRef (
					new QName (
					    "rrc.informationelements",
					    "UL_SynchronisationParameters_r4"
					)
				    ),
				    0
				)
			    ),
			    "ul-SynchronisationParameters",
			    5,
			    3,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "E_PUCH_Info$ModeSpecificInfo$Tdd128$E_PUCH_TS_ConfigurationList"
				)
			    ),
			    "e-PUCH-TS-ConfigurationList",
			    6,
			    2,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new IntegerInfo (
				    new Tags (
					new short[] {
					    (short)0x8007
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
					    new com.oss.asn1.INTEGER(63),
					    0
					)
				    ),
				    new Bounds (
					new java.lang.Long(0),
					new java.lang.Long(63)
				    ),
				    null
				)
			    ),
			    "minimum-Allowed-Code-Rate",
			    7,
			    2,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new IntegerInfo (
				    new Tags (
					new short[] {
					    (short)0x8008
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
					    new com.oss.asn1.INTEGER(63),
					    0
					)
				    ),
				    new Bounds (
					new java.lang.Long(0),
					new java.lang.Long(63)
				    ),
				    null
				)
			    ),
			    "maximum-Allowed-Code-Rate",
			    8,
			    2,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new IntegerInfo (
				    new Tags (
					new short[] {
					    (short)0x8009
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
			    "maximumNumOfRetransSchedInfo",
			    9,
			    2,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "E_PUCH_Info$ModeSpecificInfo$Tdd128$RetransTimerForSchedInfo"
				)
			    ),
			    "retransTimerForSchedInfo",
			    10,
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
			),
			new TagDecoder (
			    new TagDecoderElement[] {
				new TagDecoderElement((short)0x8009, 9)
			    }
			),
			new TagDecoder (
			    new TagDecoderElement[] {
				new TagDecoderElement((short)0x800a, 10)
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
		case tdd348_tdd768_chosen:
		    return new Tdd348_tdd768();
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
		"E_PUCH_Info$ModeSpecificInfo"
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
				"E_PUCH_Info$ModeSpecificInfo$Tdd348_tdd768"
			    )
			),
			"tdd348-tdd768",
			0,
			2
		    ),
		    new FieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.informationelements",
				"E_PUCH_Info$ModeSpecificInfo$Tdd128"
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

    // Methods for field "powerOffsetForSchedInfo"
    public long getPowerOffsetForSchedInfo()
    {
	return ((INTEGER)mComponents[2]).longValue();
    }
    
    public void setPowerOffsetForSchedInfo(long powerOffsetForSchedInfo)
    {
	setPowerOffsetForSchedInfo(new INTEGER(powerOffsetForSchedInfo));
    }
    
    public void setPowerOffsetForSchedInfo(INTEGER powerOffsetForSchedInfo)
    {
	mComponents[2] = powerOffsetForSchedInfo;
    }
    
    public boolean hasPowerOffsetForSchedInfo()
    {
	return componentIsPresent(2);
    }
    
    public void deletePowerOffsetForSchedInfo()
    {
	setComponentAbsent(2);
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
	    "E_PUCH_Info"
	),
	new QName (
	    "InformationElements",
	    "E-PUCH-Info"
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
				"E_TFCS_Info"
			    ),
			    new QName (
				"InformationElements",
				"E-TFCS-Info"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "E_TFCS_Info"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "E_TFCS_Info"
				)
			    ),
			    0
			)
		    ),
		    "e-TFCS-Info",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "E_PUCH_Info$ModeSpecificInfo"
			)
		    ),
		    "modeSpecificInfo",
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
		    "powerOffsetForSchedInfo",
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
     * Get the type descriptor (TypeInfo) of 'this' E_PUCH_Info object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' E_PUCH_Info object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for E_PUCH_Info
