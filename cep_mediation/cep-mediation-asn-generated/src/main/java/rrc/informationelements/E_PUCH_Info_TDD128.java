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
 * Define the ASN1 Type E_PUCH_Info_TDD128 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class E_PUCH_Info_TDD128 extends Sequence {
    
    /**
     * The default constructor.
     */
    public E_PUCH_Info_TDD128()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public E_PUCH_Info_TDD128(E_TFCS_Info e_TFCS_Info, 
		    Snpl_ReportType snpl_ReportType, INTEGER prxdes_base, 
		    BOOLEAN beaconPLEst, TPC_StepSizeTDD tpc_StepSize, 
		    INTEGER pebase_PowerControlGAP, 
		    UL_SynchronisationParameters_r4 ul_SynchronisationParameters, 
		    E_PUCH_TS_ConfigurationList e_PUCH_TS_ConfigurationList, 
		    INTEGER minimum_Allowed_Code_Rate, 
		    INTEGER maximum_Allowed_Code_Rate, 
		    INTEGER maximumNumOfRetransSchedInfo, 
		    RetransTimerForSchedInfo retransTimerForSchedInfo, 
		    INTEGER dummy)
    {
	setE_TFCS_Info(e_TFCS_Info);
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
	setDummy(dummy);
    }
    
    /**
     * Construct with components.
     */
    public E_PUCH_Info_TDD128(E_TFCS_Info e_TFCS_Info, 
		    Snpl_ReportType snpl_ReportType, long prxdes_base, 
		    boolean beaconPLEst, TPC_StepSizeTDD tpc_StepSize, 
		    long pebase_PowerControlGAP, 
		    UL_SynchronisationParameters_r4 ul_SynchronisationParameters, 
		    E_PUCH_TS_ConfigurationList e_PUCH_TS_ConfigurationList, 
		    long minimum_Allowed_Code_Rate, 
		    long maximum_Allowed_Code_Rate, 
		    long maximumNumOfRetransSchedInfo, 
		    RetransTimerForSchedInfo retransTimerForSchedInfo, 
		    long dummy)
    {
	this(e_TFCS_Info, snpl_ReportType, new INTEGER(prxdes_base), 
	     new BOOLEAN(beaconPLEst), tpc_StepSize, 
	     new INTEGER(pebase_PowerControlGAP), 
	     ul_SynchronisationParameters, e_PUCH_TS_ConfigurationList, 
	     new INTEGER(minimum_Allowed_Code_Rate), 
	     new INTEGER(maximum_Allowed_Code_Rate), 
	     new INTEGER(maximumNumOfRetransSchedInfo), 
	     retransTimerForSchedInfo, new INTEGER(dummy));
    }
    
    /**
     * Construct with required components.
     */
    public E_PUCH_Info_TDD128(E_TFCS_Info e_TFCS_Info, long prxdes_base, 
		    TPC_StepSizeTDD tpc_StepSize, 
		    E_PUCH_TS_ConfigurationList e_PUCH_TS_ConfigurationList, 
		    long minimum_Allowed_Code_Rate, 
		    long maximum_Allowed_Code_Rate, 
		    long maximumNumOfRetransSchedInfo, 
		    RetransTimerForSchedInfo retransTimerForSchedInfo)
    {
	setE_TFCS_Info(e_TFCS_Info);
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
	mComponents[0] = new E_TFCS_Info();
	mComponents[1] = Snpl_ReportType.type1;
	mComponents[2] = new INTEGER();
	mComponents[3] = new BOOLEAN();
	mComponents[4] = new TPC_StepSizeTDD();
	mComponents[5] = new INTEGER();
	mComponents[6] = new UL_SynchronisationParameters_r4();
	mComponents[7] = new E_PUCH_TS_ConfigurationList();
	mComponents[8] = new INTEGER();
	mComponents[9] = new INTEGER();
	mComponents[10] = new INTEGER();
	mComponents[11] = RetransTimerForSchedInfo.ms10;
	mComponents[12] = new INTEGER();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[13];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new E_TFCS_Info();
	    case 1:
		return Snpl_ReportType.type1;
	    case 2:
		return new INTEGER();
	    case 3:
		return new BOOLEAN();
	    case 4:
		return new TPC_StepSizeTDD();
	    case 5:
		return new INTEGER();
	    case 6:
		return new UL_SynchronisationParameters_r4();
	    case 7:
		return new E_PUCH_TS_ConfigurationList();
	    case 8:
		return new INTEGER();
	    case 9:
		return new INTEGER();
	    case 10:
		return new INTEGER();
	    case 11:
		return RetransTimerForSchedInfo.ms10;
	    case 12:
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
    
    
    // Methods for field "snpl_ReportType"
    public Snpl_ReportType getSnpl_ReportType()
    {
	return (Snpl_ReportType)mComponents[1];
    }
    
    public void setSnpl_ReportType(Snpl_ReportType snpl_ReportType)
    {
	mComponents[1] = snpl_ReportType;
    }
    
    public boolean hasSnpl_ReportType()
    {
	return componentIsPresent(1);
    }
    
    public void deleteSnpl_ReportType()
    {
	setComponentAbsent(1);
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
		    (short)0x8001
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"E_PUCH_Info_TDD128$Snpl_ReportType"
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
	return ((INTEGER)mComponents[2]).longValue();
    }
    
    public void setPrxdes_base(long prxdes_base)
    {
	setPrxdes_base(new INTEGER(prxdes_base));
    }
    
    public void setPrxdes_base(INTEGER prxdes_base)
    {
	mComponents[2] = prxdes_base;
    }
    
    
    // Methods for field "beaconPLEst"
    public boolean getBeaconPLEst()
    {
	return ((BOOLEAN)mComponents[3]).booleanValue();
    }
    
    public void setBeaconPLEst(boolean beaconPLEst)
    {
	setBeaconPLEst(new BOOLEAN(beaconPLEst));
    }
    
    public void setBeaconPLEst(BOOLEAN beaconPLEst)
    {
	mComponents[3] = beaconPLEst;
    }
    
    public boolean hasBeaconPLEst()
    {
	return componentIsPresent(3);
    }
    
    public void deleteBeaconPLEst()
    {
	setComponentAbsent(3);
    }
    
    
    // Methods for field "tpc_StepSize"
    public TPC_StepSizeTDD getTpc_StepSize()
    {
	return (TPC_StepSizeTDD)mComponents[4];
    }
    
    public void setTpc_StepSize(TPC_StepSizeTDD tpc_StepSize)
    {
	mComponents[4] = tpc_StepSize;
    }
    
    
    // Methods for field "pebase_PowerControlGAP"
    public long getPebase_PowerControlGAP()
    {
	return ((INTEGER)mComponents[5]).longValue();
    }
    
    public void setPebase_PowerControlGAP(long pebase_PowerControlGAP)
    {
	setPebase_PowerControlGAP(new INTEGER(pebase_PowerControlGAP));
    }
    
    public void setPebase_PowerControlGAP(INTEGER pebase_PowerControlGAP)
    {
	mComponents[5] = pebase_PowerControlGAP;
    }
    
    public boolean hasPebase_PowerControlGAP()
    {
	return componentIsPresent(5);
    }
    
    public void deletePebase_PowerControlGAP()
    {
	setComponentAbsent(5);
    }
    
    
    // Methods for field "ul_SynchronisationParameters"
    public UL_SynchronisationParameters_r4 getUl_SynchronisationParameters()
    {
	return (UL_SynchronisationParameters_r4)mComponents[6];
    }
    
    public void setUl_SynchronisationParameters(UL_SynchronisationParameters_r4 ul_SynchronisationParameters)
    {
	mComponents[6] = ul_SynchronisationParameters;
    }
    
    public boolean hasUl_SynchronisationParameters()
    {
	return componentIsPresent(6);
    }
    
    public void deleteUl_SynchronisationParameters()
    {
	setComponentAbsent(6);
    }
    
    
    // Methods for field "e_PUCH_TS_ConfigurationList"
    public E_PUCH_TS_ConfigurationList getE_PUCH_TS_ConfigurationList()
    {
	return (E_PUCH_TS_ConfigurationList)mComponents[7];
    }
    
    public void setE_PUCH_TS_ConfigurationList(E_PUCH_TS_ConfigurationList e_PUCH_TS_ConfigurationList)
    {
	mComponents[7] = e_PUCH_TS_ConfigurationList;
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
		    (short)0x8007
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"E_PUCH_Info_TDD128$E_PUCH_TS_ConfigurationList"
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
	return ((INTEGER)mComponents[8]).longValue();
    }
    
    public void setMinimum_Allowed_Code_Rate(long minimum_Allowed_Code_Rate)
    {
	setMinimum_Allowed_Code_Rate(new INTEGER(minimum_Allowed_Code_Rate));
    }
    
    public void setMinimum_Allowed_Code_Rate(INTEGER minimum_Allowed_Code_Rate)
    {
	mComponents[8] = minimum_Allowed_Code_Rate;
    }
    
    
    // Methods for field "maximum_Allowed_Code_Rate"
    public long getMaximum_Allowed_Code_Rate()
    {
	return ((INTEGER)mComponents[9]).longValue();
    }
    
    public void setMaximum_Allowed_Code_Rate(long maximum_Allowed_Code_Rate)
    {
	setMaximum_Allowed_Code_Rate(new INTEGER(maximum_Allowed_Code_Rate));
    }
    
    public void setMaximum_Allowed_Code_Rate(INTEGER maximum_Allowed_Code_Rate)
    {
	mComponents[9] = maximum_Allowed_Code_Rate;
    }
    
    
    // Methods for field "maximumNumOfRetransSchedInfo"
    public long getMaximumNumOfRetransSchedInfo()
    {
	return ((INTEGER)mComponents[10]).longValue();
    }
    
    public void setMaximumNumOfRetransSchedInfo(long maximumNumOfRetransSchedInfo)
    {
	setMaximumNumOfRetransSchedInfo(new INTEGER(maximumNumOfRetransSchedInfo));
    }
    
    public void setMaximumNumOfRetransSchedInfo(INTEGER maximumNumOfRetransSchedInfo)
    {
	mComponents[10] = maximumNumOfRetransSchedInfo;
    }
    
    
    // Methods for field "retransTimerForSchedInfo"
    public RetransTimerForSchedInfo getRetransTimerForSchedInfo()
    {
	return (RetransTimerForSchedInfo)mComponents[11];
    }
    
    public void setRetransTimerForSchedInfo(RetransTimerForSchedInfo retransTimerForSchedInfo)
    {
	mComponents[11] = retransTimerForSchedInfo;
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
		    (short)0x800b
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"E_PUCH_Info_TDD128$RetransTimerForSchedInfo"
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

    // Methods for field "dummy"
    public long getDummy()
    {
	return ((INTEGER)mComponents[12]).longValue();
    }
    
    public void setDummy(long dummy)
    {
	setDummy(new INTEGER(dummy));
    }
    
    public void setDummy(INTEGER dummy)
    {
	mComponents[12] = dummy;
    }
    
    public boolean hasDummy()
    {
	return componentIsPresent(12);
    }
    
    public void deleteDummy()
    {
	setComponentAbsent(12);
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
	    "E_PUCH_Info_TDD128"
	),
	new QName (
	    "InformationElements",
	    "E-PUCH-Info-TDD128"
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
			    "E_PUCH_Info_TDD128$Snpl_ReportType"
			)
		    ),
		    "snpl-ReportType",
		    1,
		    3,
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
		    "beaconPLEst",
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
				    new com.oss.asn1.INTEGER(1), 
				    new com.oss.asn1.INTEGER(255),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(255)
			    ),
			    null
			)
		    ),
		    "pebase-PowerControlGAP",
		    5,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8006
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
		    6,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "E_PUCH_Info_TDD128$E_PUCH_TS_ConfigurationList"
			)
		    ),
		    "e-PUCH-TS-ConfigurationList",
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
		    "minimum-Allowed-Code-Rate",
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
		    9,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x800a
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
		    10,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "E_PUCH_Info_TDD128$RetransTimerForSchedInfo"
			)
		    ),
		    "retransTimerForSchedInfo",
		    11,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x800c
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
		    "dummy",
		    12,
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
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6),
			new TagDecoderElement((short)0x8007, 7)
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
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800b, 11)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800c, 12)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' E_PUCH_Info_TDD128 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' E_PUCH_Info_TDD128 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for E_PUCH_Info_TDD128
