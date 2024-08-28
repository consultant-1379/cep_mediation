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
 * Define the ASN1 Type CommonEDCHSystemInfoFDD from ASN1 Module InformationElements.
 * @see Sequence
 */

public class CommonEDCHSystemInfoFDD extends Sequence {
    
    /**
     * The default constructor.
     */
    public CommonEDCHSystemInfoFDD()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public CommonEDCHSystemInfoFDD(UL_Interference ul_InterferenceForCommonEDCH, 
		    Common_E_DCH_MAC_d_FlowList common_E_DCH_MAC_d_FlowList, 
		    PRACH_PreambleForEnhancedUplink prach_PreambleForEnhancedUplink, 
		    INTEGER initialServingGrantValue, E_DCH_TTI e_dch_TTI, 
		    E_AGCH_Information e_agch_Information, 
		    Harq_Info harq_Info, 
		    UL_DPCHpowerControlInfoForCommonEDCH ul_DPCHpowerControlInfoForCommonEDCH, 
		    E_DPCCH_Info_r7 e_dpcch_Info, 
		    E_DPDCH_Info_r8 e_dpdch_Info, 
		    INTEGER dl_FDPCH_TPCcommandErrorRate, 
		    INTEGER additional_E_DCH_TransmitBackoff, 
		    Max_CCCH_ResourceAllocation max_CCCH_ResourceAllocation, 
		    INTEGER max_PeriodForCollisionResolution, 
		    E_dch_TransmitContinuationOffset e_dch_TransmitContinuationOffset, 
		    BOOLEAN ack_nack_support_on_HS_DPCCH, 
		    Measurement_Feedback_Info_r7 measurement_Feedback_Info, 
		    Common_E_DCH_ResourceInfoList common_E_DCH_ResourceInfoList)
    {
	setUl_InterferenceForCommonEDCH(ul_InterferenceForCommonEDCH);
	setCommon_E_DCH_MAC_d_FlowList(common_E_DCH_MAC_d_FlowList);
	setPrach_PreambleForEnhancedUplink(prach_PreambleForEnhancedUplink);
	setInitialServingGrantValue(initialServingGrantValue);
	setE_dch_TTI(e_dch_TTI);
	setE_agch_Information(e_agch_Information);
	setHarq_Info(harq_Info);
	setUl_DPCHpowerControlInfoForCommonEDCH(ul_DPCHpowerControlInfoForCommonEDCH);
	setE_dpcch_Info(e_dpcch_Info);
	setE_dpdch_Info(e_dpdch_Info);
	setDl_FDPCH_TPCcommandErrorRate(dl_FDPCH_TPCcommandErrorRate);
	setAdditional_E_DCH_TransmitBackoff(additional_E_DCH_TransmitBackoff);
	setMax_CCCH_ResourceAllocation(max_CCCH_ResourceAllocation);
	setMax_PeriodForCollisionResolution(max_PeriodForCollisionResolution);
	setE_dch_TransmitContinuationOffset(e_dch_TransmitContinuationOffset);
	setAck_nack_support_on_HS_DPCCH(ack_nack_support_on_HS_DPCCH);
	setMeasurement_Feedback_Info(measurement_Feedback_Info);
	setCommon_E_DCH_ResourceInfoList(common_E_DCH_ResourceInfoList);
    }
    
    /**
     * Construct with components.
     */
    public CommonEDCHSystemInfoFDD(UL_Interference ul_InterferenceForCommonEDCH, 
		    Common_E_DCH_MAC_d_FlowList common_E_DCH_MAC_d_FlowList, 
		    PRACH_PreambleForEnhancedUplink prach_PreambleForEnhancedUplink, 
		    long initialServingGrantValue, E_DCH_TTI e_dch_TTI, 
		    E_AGCH_Information e_agch_Information, 
		    Harq_Info harq_Info, 
		    UL_DPCHpowerControlInfoForCommonEDCH ul_DPCHpowerControlInfoForCommonEDCH, 
		    E_DPCCH_Info_r7 e_dpcch_Info, 
		    E_DPDCH_Info_r8 e_dpdch_Info, 
		    long dl_FDPCH_TPCcommandErrorRate, 
		    long additional_E_DCH_TransmitBackoff, 
		    Max_CCCH_ResourceAllocation max_CCCH_ResourceAllocation, 
		    long max_PeriodForCollisionResolution, 
		    E_dch_TransmitContinuationOffset e_dch_TransmitContinuationOffset, 
		    boolean ack_nack_support_on_HS_DPCCH, 
		    Measurement_Feedback_Info_r7 measurement_Feedback_Info, 
		    Common_E_DCH_ResourceInfoList common_E_DCH_ResourceInfoList)
    {
	this(ul_InterferenceForCommonEDCH, common_E_DCH_MAC_d_FlowList, 
	     prach_PreambleForEnhancedUplink, 
	     new INTEGER(initialServingGrantValue), e_dch_TTI, 
	     e_agch_Information, harq_Info, 
	     ul_DPCHpowerControlInfoForCommonEDCH, e_dpcch_Info, 
	     e_dpdch_Info, new INTEGER(dl_FDPCH_TPCcommandErrorRate), 
	     new INTEGER(additional_E_DCH_TransmitBackoff), 
	     max_CCCH_ResourceAllocation, 
	     new INTEGER(max_PeriodForCollisionResolution), 
	     e_dch_TransmitContinuationOffset, 
	     new BOOLEAN(ack_nack_support_on_HS_DPCCH), 
	     measurement_Feedback_Info, common_E_DCH_ResourceInfoList);
    }
    
    /**
     * Construct with required components.
     */
    public CommonEDCHSystemInfoFDD(Common_E_DCH_MAC_d_FlowList common_E_DCH_MAC_d_FlowList, 
		    PRACH_PreambleForEnhancedUplink prach_PreambleForEnhancedUplink, 
		    long initialServingGrantValue, E_DCH_TTI e_dch_TTI, 
		    E_AGCH_Information e_agch_Information, 
		    Harq_Info harq_Info, 
		    UL_DPCHpowerControlInfoForCommonEDCH ul_DPCHpowerControlInfoForCommonEDCH, 
		    E_DPCCH_Info_r7 e_dpcch_Info, 
		    E_DPDCH_Info_r8 e_dpdch_Info, 
		    long dl_FDPCH_TPCcommandErrorRate, 
		    long additional_E_DCH_TransmitBackoff, 
		    Max_CCCH_ResourceAllocation max_CCCH_ResourceAllocation, 
		    long max_PeriodForCollisionResolution, 
		    E_dch_TransmitContinuationOffset e_dch_TransmitContinuationOffset, 
		    boolean ack_nack_support_on_HS_DPCCH, 
		    Common_E_DCH_ResourceInfoList common_E_DCH_ResourceInfoList)
    {
	setCommon_E_DCH_MAC_d_FlowList(common_E_DCH_MAC_d_FlowList);
	setPrach_PreambleForEnhancedUplink(prach_PreambleForEnhancedUplink);
	setInitialServingGrantValue(initialServingGrantValue);
	setE_dch_TTI(e_dch_TTI);
	setE_agch_Information(e_agch_Information);
	setHarq_Info(harq_Info);
	setUl_DPCHpowerControlInfoForCommonEDCH(ul_DPCHpowerControlInfoForCommonEDCH);
	setE_dpcch_Info(e_dpcch_Info);
	setE_dpdch_Info(e_dpdch_Info);
	setDl_FDPCH_TPCcommandErrorRate(dl_FDPCH_TPCcommandErrorRate);
	setAdditional_E_DCH_TransmitBackoff(additional_E_DCH_TransmitBackoff);
	setMax_CCCH_ResourceAllocation(max_CCCH_ResourceAllocation);
	setMax_PeriodForCollisionResolution(max_PeriodForCollisionResolution);
	setE_dch_TransmitContinuationOffset(e_dch_TransmitContinuationOffset);
	setAck_nack_support_on_HS_DPCCH(ack_nack_support_on_HS_DPCCH);
	setCommon_E_DCH_ResourceInfoList(common_E_DCH_ResourceInfoList);
    }
    
    public void initComponents()
    {
	mComponents[0] = new UL_Interference();
	mComponents[1] = new Common_E_DCH_MAC_d_FlowList();
	mComponents[2] = new PRACH_PreambleForEnhancedUplink();
	mComponents[3] = new INTEGER();
	mComponents[4] = E_DCH_TTI.tti2;
	mComponents[5] = new E_AGCH_Information();
	mComponents[6] = Harq_Info.rv0;
	mComponents[7] = new UL_DPCHpowerControlInfoForCommonEDCH();
	mComponents[8] = new E_DPCCH_Info_r7();
	mComponents[9] = new E_DPDCH_Info_r8();
	mComponents[10] = new INTEGER();
	mComponents[11] = new INTEGER();
	mComponents[12] = Max_CCCH_ResourceAllocation.tti8;
	mComponents[13] = new INTEGER();
	mComponents[14] = E_dch_TransmitContinuationOffset.tti0;
	mComponents[15] = new BOOLEAN();
	mComponents[16] = new Measurement_Feedback_Info_r7();
	mComponents[17] = new Common_E_DCH_ResourceInfoList();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[18];
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
		return new PRACH_PreambleForEnhancedUplink();
	    case 3:
		return new INTEGER();
	    case 4:
		return E_DCH_TTI.tti2;
	    case 5:
		return new E_AGCH_Information();
	    case 6:
		return Harq_Info.rv0;
	    case 7:
		return new UL_DPCHpowerControlInfoForCommonEDCH();
	    case 8:
		return new E_DPCCH_Info_r7();
	    case 9:
		return new E_DPDCH_Info_r8();
	    case 10:
		return new INTEGER();
	    case 11:
		return new INTEGER();
	    case 12:
		return Max_CCCH_ResourceAllocation.tti8;
	    case 13:
		return new INTEGER();
	    case 14:
		return E_dch_TransmitContinuationOffset.tti0;
	    case 15:
		return new BOOLEAN();
	    case 16:
		return new Measurement_Feedback_Info_r7();
	    case 17:
		return new Common_E_DCH_ResourceInfoList();
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
    
    
    // Methods for field "prach_PreambleForEnhancedUplink"
    public PRACH_PreambleForEnhancedUplink getPrach_PreambleForEnhancedUplink()
    {
	return (PRACH_PreambleForEnhancedUplink)mComponents[2];
    }
    
    public void setPrach_PreambleForEnhancedUplink(PRACH_PreambleForEnhancedUplink prach_PreambleForEnhancedUplink)
    {
	mComponents[2] = prach_PreambleForEnhancedUplink;
    }
    
    
    // Methods for field "initialServingGrantValue"
    public long getInitialServingGrantValue()
    {
	return ((INTEGER)mComponents[3]).longValue();
    }
    
    public void setInitialServingGrantValue(long initialServingGrantValue)
    {
	setInitialServingGrantValue(new INTEGER(initialServingGrantValue));
    }
    
    public void setInitialServingGrantValue(INTEGER initialServingGrantValue)
    {
	mComponents[3] = initialServingGrantValue;
    }
    
    
    // Methods for field "e_dch_TTI"
    public E_DCH_TTI getE_dch_TTI()
    {
	return (E_DCH_TTI)mComponents[4];
    }
    
    public void setE_dch_TTI(E_DCH_TTI e_dch_TTI)
    {
	mComponents[4] = e_dch_TTI;
    }
    
    
    // Methods for field "e_agch_Information"
    public E_AGCH_Information getE_agch_Information()
    {
	return (E_AGCH_Information)mComponents[5];
    }
    
    public void setE_agch_Information(E_AGCH_Information e_agch_Information)
    {
	mComponents[5] = e_agch_Information;
    }
    
    
    // Methods for field "harq_Info"
    public Harq_Info getHarq_Info()
    {
	return (Harq_Info)mComponents[6];
    }
    
    public void setHarq_Info(Harq_Info harq_Info)
    {
	mComponents[6] = harq_Info;
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
		    (short)0x8006
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"CommonEDCHSystemInfoFDD$Harq_Info"
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

    // Methods for field "ul_DPCHpowerControlInfoForCommonEDCH"
    public UL_DPCHpowerControlInfoForCommonEDCH getUl_DPCHpowerControlInfoForCommonEDCH()
    {
	return (UL_DPCHpowerControlInfoForCommonEDCH)mComponents[7];
    }
    
    public void setUl_DPCHpowerControlInfoForCommonEDCH(UL_DPCHpowerControlInfoForCommonEDCH ul_DPCHpowerControlInfoForCommonEDCH)
    {
	mComponents[7] = ul_DPCHpowerControlInfoForCommonEDCH;
    }
    
    
    // Methods for field "e_dpcch_Info"
    public E_DPCCH_Info_r7 getE_dpcch_Info()
    {
	return (E_DPCCH_Info_r7)mComponents[8];
    }
    
    public void setE_dpcch_Info(E_DPCCH_Info_r7 e_dpcch_Info)
    {
	mComponents[8] = e_dpcch_Info;
    }
    
    
    // Methods for field "e_dpdch_Info"
    public E_DPDCH_Info_r8 getE_dpdch_Info()
    {
	return (E_DPDCH_Info_r8)mComponents[9];
    }
    
    public void setE_dpdch_Info(E_DPDCH_Info_r8 e_dpdch_Info)
    {
	mComponents[9] = e_dpdch_Info;
    }
    
    
    // Methods for field "dl_FDPCH_TPCcommandErrorRate"
    public long getDl_FDPCH_TPCcommandErrorRate()
    {
	return ((INTEGER)mComponents[10]).longValue();
    }
    
    public void setDl_FDPCH_TPCcommandErrorRate(long dl_FDPCH_TPCcommandErrorRate)
    {
	setDl_FDPCH_TPCcommandErrorRate(new INTEGER(dl_FDPCH_TPCcommandErrorRate));
    }
    
    public void setDl_FDPCH_TPCcommandErrorRate(INTEGER dl_FDPCH_TPCcommandErrorRate)
    {
	mComponents[10] = dl_FDPCH_TPCcommandErrorRate;
    }
    
    
    // Methods for field "additional_E_DCH_TransmitBackoff"
    public long getAdditional_E_DCH_TransmitBackoff()
    {
	return ((INTEGER)mComponents[11]).longValue();
    }
    
    public void setAdditional_E_DCH_TransmitBackoff(long additional_E_DCH_TransmitBackoff)
    {
	setAdditional_E_DCH_TransmitBackoff(new INTEGER(additional_E_DCH_TransmitBackoff));
    }
    
    public void setAdditional_E_DCH_TransmitBackoff(INTEGER additional_E_DCH_TransmitBackoff)
    {
	mComponents[11] = additional_E_DCH_TransmitBackoff;
    }
    
    
    // Methods for field "max_CCCH_ResourceAllocation"
    public Max_CCCH_ResourceAllocation getMax_CCCH_ResourceAllocation()
    {
	return (Max_CCCH_ResourceAllocation)mComponents[12];
    }
    
    public void setMax_CCCH_ResourceAllocation(Max_CCCH_ResourceAllocation max_CCCH_ResourceAllocation)
    {
	mComponents[12] = max_CCCH_ResourceAllocation;
    }
    
    
    
    /**
     * Define the ASN1 Type Max_CCCH_ResourceAllocation from ASN1 Module InformationElements.
     * @see Enumerated
     */
    public static final class Max_CCCH_ResourceAllocation extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private Max_CCCH_ResourceAllocation()
	{
	    super(cFirstNumber);
	}
	
	protected Max_CCCH_ResourceAllocation(long value)
	{
	    super(value);
	}
	
	// Named list definitions.
	public static final Max_CCCH_ResourceAllocation tti8 =
	    new Max_CCCH_ResourceAllocation(0);
	public static final Max_CCCH_ResourceAllocation tti12 =
	    new Max_CCCH_ResourceAllocation(1);
	public static final Max_CCCH_ResourceAllocation tti16 =
	    new Max_CCCH_ResourceAllocation(2);
	public static final Max_CCCH_ResourceAllocation tti20 =
	    new Max_CCCH_ResourceAllocation(3);
	public static final Max_CCCH_ResourceAllocation tti24 =
	    new Max_CCCH_ResourceAllocation(4);
	public static final Max_CCCH_ResourceAllocation tti32 =
	    new Max_CCCH_ResourceAllocation(5);
	public static final Max_CCCH_ResourceAllocation tti40 =
	    new Max_CCCH_ResourceAllocation(6);
	public static final Max_CCCH_ResourceAllocation tti80 =
	    new Max_CCCH_ResourceAllocation(7);
	private final static Max_CCCH_ResourceAllocation cNamedNumbers[] = {
	     tti8, 
	     tti12, 
	     tti16, 
	     tti20, 
	     tti24, 
	     tti32, 
	     tti40, 
	     tti80
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
	
	public static Max_CCCH_ResourceAllocation valueOf(long value)
	{
	    return (Max_CCCH_ResourceAllocation)tti8.lookupValue(value);
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final EnumeratedInfo c_typeinfo = new EnumeratedInfo (
	    new Tags (
		new short[] {
		    (short)0x800c
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"CommonEDCHSystemInfoFDD$Max_CCCH_ResourceAllocation"
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
			"tti8",
			0
		    ),
		    new MemberListElement (
			"tti12",
			1
		    ),
		    new MemberListElement (
			"tti16",
			2
		    ),
		    new MemberListElement (
			"tti20",
			3
		    ),
		    new MemberListElement (
			"tti24",
			4
		    ),
		    new MemberListElement (
			"tti32",
			5
		    ),
		    new MemberListElement (
			"tti40",
			6
		    ),
		    new MemberListElement (
			"tti80",
			7
		    )
		}
	    ),
	    0,
	    tti8
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' Max_CCCH_ResourceAllocation object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Max_CCCH_ResourceAllocation object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Max_CCCH_ResourceAllocation

    // Methods for field "max_PeriodForCollisionResolution"
    public long getMax_PeriodForCollisionResolution()
    {
	return ((INTEGER)mComponents[13]).longValue();
    }
    
    public void setMax_PeriodForCollisionResolution(long max_PeriodForCollisionResolution)
    {
	setMax_PeriodForCollisionResolution(new INTEGER(max_PeriodForCollisionResolution));
    }
    
    public void setMax_PeriodForCollisionResolution(INTEGER max_PeriodForCollisionResolution)
    {
	mComponents[13] = max_PeriodForCollisionResolution;
    }
    
    
    // Methods for field "e_dch_TransmitContinuationOffset"
    public E_dch_TransmitContinuationOffset getE_dch_TransmitContinuationOffset()
    {
	return (E_dch_TransmitContinuationOffset)mComponents[14];
    }
    
    public void setE_dch_TransmitContinuationOffset(E_dch_TransmitContinuationOffset e_dch_TransmitContinuationOffset)
    {
	mComponents[14] = e_dch_TransmitContinuationOffset;
    }
    
    
    
    /**
     * Define the ASN1 Type E_dch_TransmitContinuationOffset from ASN1 Module InformationElements.
     * @see Enumerated
     */
    public static final class E_dch_TransmitContinuationOffset extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private E_dch_TransmitContinuationOffset()
	{
	    super(cFirstNumber);
	}
	
	protected E_dch_TransmitContinuationOffset(long value)
	{
	    super(value);
	}
	
	// Named list definitions.
	public static final E_dch_TransmitContinuationOffset tti0 =
	    new E_dch_TransmitContinuationOffset(0);
	public static final E_dch_TransmitContinuationOffset tti4 =
	    new E_dch_TransmitContinuationOffset(1);
	public static final E_dch_TransmitContinuationOffset tti8 =
	    new E_dch_TransmitContinuationOffset(2);
	public static final E_dch_TransmitContinuationOffset tti16 =
	    new E_dch_TransmitContinuationOffset(3);
	public static final E_dch_TransmitContinuationOffset tti24 =
	    new E_dch_TransmitContinuationOffset(4);
	public static final E_dch_TransmitContinuationOffset tti40 =
	    new E_dch_TransmitContinuationOffset(5);
	public static final E_dch_TransmitContinuationOffset tti80 =
	    new E_dch_TransmitContinuationOffset(6);
	public static final E_dch_TransmitContinuationOffset infinity =
	    new E_dch_TransmitContinuationOffset(7);
	private final static E_dch_TransmitContinuationOffset cNamedNumbers[] = {
	     tti0, 
	     tti4, 
	     tti8, 
	     tti16, 
	     tti24, 
	     tti40, 
	     tti80, 
	     infinity
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
	
	public static E_dch_TransmitContinuationOffset valueOf(long value)
	{
	    return (E_dch_TransmitContinuationOffset)tti0.lookupValue(value);
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final EnumeratedInfo c_typeinfo = new EnumeratedInfo (
	    new Tags (
		new short[] {
		    (short)0x800e
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"CommonEDCHSystemInfoFDD$E_dch_TransmitContinuationOffset"
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
			"tti0",
			0
		    ),
		    new MemberListElement (
			"tti4",
			1
		    ),
		    new MemberListElement (
			"tti8",
			2
		    ),
		    new MemberListElement (
			"tti16",
			3
		    ),
		    new MemberListElement (
			"tti24",
			4
		    ),
		    new MemberListElement (
			"tti40",
			5
		    ),
		    new MemberListElement (
			"tti80",
			6
		    ),
		    new MemberListElement (
			"infinity",
			7
		    )
		}
	    ),
	    0,
	    tti0
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' E_dch_TransmitContinuationOffset object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' E_dch_TransmitContinuationOffset object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for E_dch_TransmitContinuationOffset

    // Methods for field "ack_nack_support_on_HS_DPCCH"
    public boolean getAck_nack_support_on_HS_DPCCH()
    {
	return ((BOOLEAN)mComponents[15]).booleanValue();
    }
    
    public void setAck_nack_support_on_HS_DPCCH(boolean ack_nack_support_on_HS_DPCCH)
    {
	setAck_nack_support_on_HS_DPCCH(new BOOLEAN(ack_nack_support_on_HS_DPCCH));
    }
    
    public void setAck_nack_support_on_HS_DPCCH(BOOLEAN ack_nack_support_on_HS_DPCCH)
    {
	mComponents[15] = ack_nack_support_on_HS_DPCCH;
    }
    
    
    // Methods for field "measurement_Feedback_Info"
    public Measurement_Feedback_Info_r7 getMeasurement_Feedback_Info()
    {
	return (Measurement_Feedback_Info_r7)mComponents[16];
    }
    
    public void setMeasurement_Feedback_Info(Measurement_Feedback_Info_r7 measurement_Feedback_Info)
    {
	mComponents[16] = measurement_Feedback_Info;
    }
    
    public boolean hasMeasurement_Feedback_Info()
    {
	return componentIsPresent(16);
    }
    
    public void deleteMeasurement_Feedback_Info()
    {
	setComponentAbsent(16);
    }
    
    
    // Methods for field "common_E_DCH_ResourceInfoList"
    public Common_E_DCH_ResourceInfoList getCommon_E_DCH_ResourceInfoList()
    {
	return (Common_E_DCH_ResourceInfoList)mComponents[17];
    }
    
    public void setCommon_E_DCH_ResourceInfoList(Common_E_DCH_ResourceInfoList common_E_DCH_ResourceInfoList)
    {
	mComponents[17] = common_E_DCH_ResourceInfoList;
    }
    
    
    
    /**
     * Define the ASN1 Type Common_E_DCH_ResourceInfoList from ASN1 Module InformationElements.
     * @see SequenceOf
     */
    public static class Common_E_DCH_ResourceInfoList extends SequenceOf {
	
	/**
	 * The default constructor.
	 */
	public Common_E_DCH_ResourceInfoList()
	{
	}
	
	/**
	 * Construct from an array of components.
	 */
	public Common_E_DCH_ResourceInfoList(rrc.informationelements.Common_E_DCH_ResourceInfoList[] elements)
	{
	    super(elements);
	}
	
	/**
	 * Add an Element to the SEQUENCE OF/SET OF.
	 */
	public synchronized void add(rrc.informationelements.Common_E_DCH_ResourceInfoList element)
	{
	    super.addElement(element);
	}
	
	/**
	 * Set an Element in the SEQUENCE OF/SET OF.
	 */
	public synchronized void set(rrc.informationelements.Common_E_DCH_ResourceInfoList element, int atIndex)
	{
	    super.setElement(element, atIndex);
	}
	
	/**
	 * Get an Element from the SEQUENCE OF/SET OF.
	 */
	public synchronized rrc.informationelements.Common_E_DCH_ResourceInfoList get(int atIndex)
	{
	    return (rrc.informationelements.Common_E_DCH_ResourceInfoList)super.getElement(atIndex);
	}
	
	/**
	 * Insert an Element into the SEQUENCE OF/SET OF.
	 */
	public synchronized void insert(rrc.informationelements.Common_E_DCH_ResourceInfoList element, int atIndex)
	{
	    super.insertElement(element, atIndex);
	}
	
	/**
	 * Remove an Element from the SEQUENCE OF/SET OF.
	 */
	public synchronized void remove(rrc.informationelements.Common_E_DCH_ResourceInfoList element)
	{
	    super.removeElement(element);
	}
	
	/**
	 * Create an instance of  SEQUENCE OF/SET OF.
	 */
	public AbstractData createInstance()
	{
	    return (AbstractData)new rrc.informationelements.Common_E_DCH_ResourceInfoList();
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final ContainerInfo c_typeinfo = new ContainerInfo (
	    new Tags (
		new short[] {
		    (short)0x8011
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"CommonEDCHSystemInfoFDD$Common_E_DCH_ResourceInfoList"
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
			new com.oss.asn1.INTEGER(32),
			0
		    )
		)
	    ),
	    new Bounds (
		new java.lang.Long(1),
		new java.lang.Long(32)
	    ),
	    new TypeInfoRef (
		new QName (
		    "rrc.informationelements",
		    "Common_E_DCH_ResourceInfoList"
		)
	    )
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' Common_E_DCH_ResourceInfoList object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Common_E_DCH_ResourceInfoList object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Common_E_DCH_ResourceInfoList

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
	    "CommonEDCHSystemInfoFDD"
	),
	new QName (
	    "InformationElements",
	    "CommonEDCHSystemInfoFDD"
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
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"PRACH_PreambleForEnhancedUplink"
			    ),
			    new QName (
				"InformationElements",
				"PRACH-PreambleForEnhancedUplink"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "PRACH_PreambleForEnhancedUplink"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "PRACH_PreambleForEnhancedUplink"
				)
			    ),
			    0
			)
		    ),
		    "prach-PreambleForEnhancedUplink",
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
				    new com.oss.asn1.INTEGER(37),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(37)
			    ),
			    null
			)
		    ),
		    "initialServingGrantValue",
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
				"E_DCH_TTI"
			    ),
			    new QName (
				"InformationElements",
				"E-DCH-TTI"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"tti2",
					0
				    ),
				    new MemberListElement (
					"tti10",
					1
				    )
				}
			    ),
			    0,
			    E_DCH_TTI.tti2
			)
		    ),
		    "e-dch-TTI",
		    4,
		    2,
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
				"E_AGCH_Information"
			    ),
			    new QName (
				"InformationElements",
				"E-AGCH-Information"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "E_AGCH_Information"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "E_AGCH_Information"
				)
			    ),
			    0
			)
		    ),
		    "e-agch-Information",
		    5,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "CommonEDCHSystemInfoFDD$Harq_Info"
			)
		    ),
		    "harq-Info",
		    6,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8007
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"UL_DPCHpowerControlInfoForCommonEDCH"
			    ),
			    new QName (
				"InformationElements",
				"UL-DPCHpowerControlInfoForCommonEDCH"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UL_DPCHpowerControlInfoForCommonEDCH"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "UL_DPCHpowerControlInfoForCommonEDCH"
				)
			    ),
			    0
			)
		    ),
		    "ul-DPCHpowerControlInfoForCommonEDCH",
		    7,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8008
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"E_DPCCH_Info_r7"
			    ),
			    new QName (
				"InformationElements",
				"E-DPCCH-Info-r7"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "E_DPCCH_Info_r7"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "E_DPCCH_Info_r7"
				)
			    ),
			    0
			)
		    ),
		    "e-dpcch-Info",
		    8,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8009
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"E_DPDCH_Info_r8"
			    ),
			    new QName (
				"InformationElements",
				"E-DPDCH-Info-r8"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "E_DPDCH_Info_r8"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "E_DPDCH_Info_r8"
				)
			    ),
			    0
			)
		    ),
		    "e-dpdch-Info",
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
				    new com.oss.asn1.INTEGER(1), 
				    new com.oss.asn1.INTEGER(10),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(10)
			    ),
			    null
			)
		    ),
		    "dl-FDPCH-TPCcommandErrorRate",
		    10,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x800b
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
		    "additional-E-DCH-TransmitBackoff",
		    11,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "CommonEDCHSystemInfoFDD$Max_CCCH_ResourceAllocation"
			)
		    ),
		    "max-CCCH-ResourceAllocation",
		    12,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x800d
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
				    new com.oss.asn1.INTEGER(8), 
				    new com.oss.asn1.INTEGER(24),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(8),
				new java.lang.Long(24)
			    ),
			    null
			)
		    ),
		    "max-PeriodForCollisionResolution",
		    13,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "CommonEDCHSystemInfoFDD$E_dch_TransmitContinuationOffset"
			)
		    ),
		    "e-dch-TransmitContinuationOffset",
		    14,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x800f
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
		    "ack-nack-support-on-HS-DPCCH",
		    15,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8010
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"Measurement_Feedback_Info_r7"
			    ),
			    new QName (
				"InformationElements",
				"Measurement-Feedback-Info-r7"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "Measurement_Feedback_Info_r7"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "Measurement_Feedback_Info_r7"
				)
			    ),
			    0
			)
		    ),
		    "measurement-Feedback-Info",
		    16,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "CommonEDCHSystemInfoFDD$Common_E_DCH_ResourceInfoList"
			)
		    ),
		    "common-E-DCH-ResourceInfoList",
		    17,
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
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800d, 13)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800e, 14)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800f, 15)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8010, 16),
			new TagDecoderElement((short)0x8011, 17)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8011, 17)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' CommonEDCHSystemInfoFDD object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' CommonEDCHSystemInfoFDD object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for CommonEDCHSystemInfoFDD
