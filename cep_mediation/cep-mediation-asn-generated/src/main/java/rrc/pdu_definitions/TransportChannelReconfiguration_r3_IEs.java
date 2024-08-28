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


package rrc.pdu_definitions;

import com.oss.asn1.*;
import com.oss.metadata.*;
import rrc.*;

/**
 * Define the ASN1 Type TransportChannelReconfiguration_r3_IEs from ASN1 Module PDU_definitions.
 * @see Sequence
 */

public class TransportChannelReconfiguration_r3_IEs extends Sequence {
    
    /**
     * The default constructor.
     */
    public TransportChannelReconfiguration_r3_IEs()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public TransportChannelReconfiguration_r3_IEs(rrc.informationelements.RRC_TransactionIdentifier rrc_TransactionIdentifier, 
		    rrc.informationelements.IntegrityProtectionModeInfo integrityProtectionModeInfo, 
		    rrc.informationelements.CipheringModeInfo cipheringModeInfo, 
		    rrc.informationelements.ActivationTime activationTime, 
		    rrc.informationelements.U_RNTI new_U_RNTI, 
		    rrc.informationelements.C_RNTI new_C_RNTI, 
		    rrc.informationelements.RRC_StateIndicator rrc_StateIndicator, 
		    rrc.informationelements.UTRAN_DRX_CycleLengthCoefficient utran_DRX_CycleLengthCoeff, 
		    rrc.informationelements.CN_InformationInfo cn_InformationInfo, 
		    rrc.informationelements.URA_Identity ura_Identity, 
		    rrc.informationelements.DL_CounterSynchronisationInfo dl_CounterSynchronisationInfo, 
		    rrc.informationelements.UL_CommonTransChInfo ul_CommonTransChInfo, 
		    rrc.informationelements.UL_AddReconfTransChInfoList ul_AddReconfTransChInfoList, 
		    Dummy dummy, 
		    rrc.informationelements.DL_CommonTransChInfo dl_CommonTransChInfo, 
		    rrc.informationelements.DL_AddReconfTransChInfoList dl_AddReconfTransChInfoList, 
		    rrc.informationelements.FrequencyInfo frequencyInfo, 
		    rrc.informationelements.MaxAllowedUL_TX_Power maxAllowedUL_TX_Power, 
		    rrc.informationelements.UL_ChannelRequirement ul_ChannelRequirement, 
		    ModeSpecificPhysChInfo modeSpecificPhysChInfo, 
		    rrc.informationelements.DL_CommonInformation dl_CommonInformation, 
		    rrc.informationelements.DL_InformationPerRL_List dl_InformationPerRL_List)
    {
	setRrc_TransactionIdentifier(rrc_TransactionIdentifier);
	setIntegrityProtectionModeInfo(integrityProtectionModeInfo);
	setCipheringModeInfo(cipheringModeInfo);
	setActivationTime(activationTime);
	setNew_U_RNTI(new_U_RNTI);
	setNew_C_RNTI(new_C_RNTI);
	setRrc_StateIndicator(rrc_StateIndicator);
	setUtran_DRX_CycleLengthCoeff(utran_DRX_CycleLengthCoeff);
	setCn_InformationInfo(cn_InformationInfo);
	setUra_Identity(ura_Identity);
	setDl_CounterSynchronisationInfo(dl_CounterSynchronisationInfo);
	setUl_CommonTransChInfo(ul_CommonTransChInfo);
	setUl_AddReconfTransChInfoList(ul_AddReconfTransChInfoList);
	setDummy(dummy);
	setDl_CommonTransChInfo(dl_CommonTransChInfo);
	setDl_AddReconfTransChInfoList(dl_AddReconfTransChInfoList);
	setFrequencyInfo(frequencyInfo);
	setMaxAllowedUL_TX_Power(maxAllowedUL_TX_Power);
	setUl_ChannelRequirement(ul_ChannelRequirement);
	setModeSpecificPhysChInfo(modeSpecificPhysChInfo);
	setDl_CommonInformation(dl_CommonInformation);
	setDl_InformationPerRL_List(dl_InformationPerRL_List);
    }
    
    /**
     * Construct with required components.
     */
    public TransportChannelReconfiguration_r3_IEs(rrc.informationelements.RRC_TransactionIdentifier rrc_TransactionIdentifier, 
		    rrc.informationelements.RRC_StateIndicator rrc_StateIndicator, 
		    ModeSpecificPhysChInfo modeSpecificPhysChInfo)
    {
	setRrc_TransactionIdentifier(rrc_TransactionIdentifier);
	setRrc_StateIndicator(rrc_StateIndicator);
	setModeSpecificPhysChInfo(modeSpecificPhysChInfo);
    }
    
    public void initComponents()
    {
	mComponents[0] = new rrc.informationelements.RRC_TransactionIdentifier();
	mComponents[1] = new rrc.informationelements.IntegrityProtectionModeInfo();
	mComponents[2] = new rrc.informationelements.CipheringModeInfo();
	mComponents[3] = new rrc.informationelements.ActivationTime();
	mComponents[4] = new rrc.informationelements.U_RNTI();
	mComponents[5] = new rrc.informationelements.C_RNTI();
	mComponents[6] = rrc.informationelements.RRC_StateIndicator.cell_DCH;
	mComponents[7] = new rrc.informationelements.UTRAN_DRX_CycleLengthCoefficient();
	mComponents[8] = new rrc.informationelements.CN_InformationInfo();
	mComponents[9] = new rrc.informationelements.URA_Identity();
	mComponents[10] = new rrc.informationelements.DL_CounterSynchronisationInfo();
	mComponents[11] = new rrc.informationelements.UL_CommonTransChInfo();
	mComponents[12] = new rrc.informationelements.UL_AddReconfTransChInfoList();
	mComponents[13] = new Dummy();
	mComponents[14] = new rrc.informationelements.DL_CommonTransChInfo();
	mComponents[15] = new rrc.informationelements.DL_AddReconfTransChInfoList();
	mComponents[16] = new rrc.informationelements.FrequencyInfo();
	mComponents[17] = new rrc.informationelements.MaxAllowedUL_TX_Power();
	mComponents[18] = new rrc.informationelements.UL_ChannelRequirement();
	mComponents[19] = new ModeSpecificPhysChInfo();
	mComponents[20] = new rrc.informationelements.DL_CommonInformation();
	mComponents[21] = new rrc.informationelements.DL_InformationPerRL_List();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[22];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new rrc.informationelements.RRC_TransactionIdentifier();
	    case 1:
		return new rrc.informationelements.IntegrityProtectionModeInfo();
	    case 2:
		return new rrc.informationelements.CipheringModeInfo();
	    case 3:
		return new rrc.informationelements.ActivationTime();
	    case 4:
		return new rrc.informationelements.U_RNTI();
	    case 5:
		return new rrc.informationelements.C_RNTI();
	    case 6:
		return rrc.informationelements.RRC_StateIndicator.cell_DCH;
	    case 7:
		return new rrc.informationelements.UTRAN_DRX_CycleLengthCoefficient();
	    case 8:
		return new rrc.informationelements.CN_InformationInfo();
	    case 9:
		return new rrc.informationelements.URA_Identity();
	    case 10:
		return new rrc.informationelements.DL_CounterSynchronisationInfo();
	    case 11:
		return new rrc.informationelements.UL_CommonTransChInfo();
	    case 12:
		return new rrc.informationelements.UL_AddReconfTransChInfoList();
	    case 13:
		return new Dummy();
	    case 14:
		return new rrc.informationelements.DL_CommonTransChInfo();
	    case 15:
		return new rrc.informationelements.DL_AddReconfTransChInfoList();
	    case 16:
		return new rrc.informationelements.FrequencyInfo();
	    case 17:
		return new rrc.informationelements.MaxAllowedUL_TX_Power();
	    case 18:
		return new rrc.informationelements.UL_ChannelRequirement();
	    case 19:
		return new ModeSpecificPhysChInfo();
	    case 20:
		return new rrc.informationelements.DL_CommonInformation();
	    case 21:
		return new rrc.informationelements.DL_InformationPerRL_List();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "rrc_TransactionIdentifier"
    public rrc.informationelements.RRC_TransactionIdentifier getRrc_TransactionIdentifier()
    {
	return (rrc.informationelements.RRC_TransactionIdentifier)mComponents[0];
    }
    
    public void setRrc_TransactionIdentifier(rrc.informationelements.RRC_TransactionIdentifier rrc_TransactionIdentifier)
    {
	mComponents[0] = rrc_TransactionIdentifier;
    }
    
    
    // Methods for field "integrityProtectionModeInfo"
    public rrc.informationelements.IntegrityProtectionModeInfo getIntegrityProtectionModeInfo()
    {
	return (rrc.informationelements.IntegrityProtectionModeInfo)mComponents[1];
    }
    
    public void setIntegrityProtectionModeInfo(rrc.informationelements.IntegrityProtectionModeInfo integrityProtectionModeInfo)
    {
	mComponents[1] = integrityProtectionModeInfo;
    }
    
    public boolean hasIntegrityProtectionModeInfo()
    {
	return componentIsPresent(1);
    }
    
    public void deleteIntegrityProtectionModeInfo()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "cipheringModeInfo"
    public rrc.informationelements.CipheringModeInfo getCipheringModeInfo()
    {
	return (rrc.informationelements.CipheringModeInfo)mComponents[2];
    }
    
    public void setCipheringModeInfo(rrc.informationelements.CipheringModeInfo cipheringModeInfo)
    {
	mComponents[2] = cipheringModeInfo;
    }
    
    public boolean hasCipheringModeInfo()
    {
	return componentIsPresent(2);
    }
    
    public void deleteCipheringModeInfo()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "activationTime"
    public rrc.informationelements.ActivationTime getActivationTime()
    {
	return (rrc.informationelements.ActivationTime)mComponents[3];
    }
    
    public void setActivationTime(rrc.informationelements.ActivationTime activationTime)
    {
	mComponents[3] = activationTime;
    }
    
    public boolean hasActivationTime()
    {
	return componentIsPresent(3);
    }
    
    public void deleteActivationTime()
    {
	setComponentAbsent(3);
    }
    
    
    // Methods for field "new_U_RNTI"
    public rrc.informationelements.U_RNTI getNew_U_RNTI()
    {
	return (rrc.informationelements.U_RNTI)mComponents[4];
    }
    
    public void setNew_U_RNTI(rrc.informationelements.U_RNTI new_U_RNTI)
    {
	mComponents[4] = new_U_RNTI;
    }
    
    public boolean hasNew_U_RNTI()
    {
	return componentIsPresent(4);
    }
    
    public void deleteNew_U_RNTI()
    {
	setComponentAbsent(4);
    }
    
    
    // Methods for field "new_C_RNTI"
    public rrc.informationelements.C_RNTI getNew_C_RNTI()
    {
	return (rrc.informationelements.C_RNTI)mComponents[5];
    }
    
    public void setNew_C_RNTI(rrc.informationelements.C_RNTI new_C_RNTI)
    {
	mComponents[5] = new_C_RNTI;
    }
    
    public boolean hasNew_C_RNTI()
    {
	return componentIsPresent(5);
    }
    
    public void deleteNew_C_RNTI()
    {
	setComponentAbsent(5);
    }
    
    
    // Methods for field "rrc_StateIndicator"
    public rrc.informationelements.RRC_StateIndicator getRrc_StateIndicator()
    {
	return (rrc.informationelements.RRC_StateIndicator)mComponents[6];
    }
    
    public void setRrc_StateIndicator(rrc.informationelements.RRC_StateIndicator rrc_StateIndicator)
    {
	mComponents[6] = rrc_StateIndicator;
    }
    
    
    // Methods for field "utran_DRX_CycleLengthCoeff"
    public rrc.informationelements.UTRAN_DRX_CycleLengthCoefficient getUtran_DRX_CycleLengthCoeff()
    {
	return (rrc.informationelements.UTRAN_DRX_CycleLengthCoefficient)mComponents[7];
    }
    
    public void setUtran_DRX_CycleLengthCoeff(rrc.informationelements.UTRAN_DRX_CycleLengthCoefficient utran_DRX_CycleLengthCoeff)
    {
	mComponents[7] = utran_DRX_CycleLengthCoeff;
    }
    
    public boolean hasUtran_DRX_CycleLengthCoeff()
    {
	return componentIsPresent(7);
    }
    
    public void deleteUtran_DRX_CycleLengthCoeff()
    {
	setComponentAbsent(7);
    }
    
    
    // Methods for field "cn_InformationInfo"
    public rrc.informationelements.CN_InformationInfo getCn_InformationInfo()
    {
	return (rrc.informationelements.CN_InformationInfo)mComponents[8];
    }
    
    public void setCn_InformationInfo(rrc.informationelements.CN_InformationInfo cn_InformationInfo)
    {
	mComponents[8] = cn_InformationInfo;
    }
    
    public boolean hasCn_InformationInfo()
    {
	return componentIsPresent(8);
    }
    
    public void deleteCn_InformationInfo()
    {
	setComponentAbsent(8);
    }
    
    
    // Methods for field "ura_Identity"
    public rrc.informationelements.URA_Identity getUra_Identity()
    {
	return (rrc.informationelements.URA_Identity)mComponents[9];
    }
    
    public void setUra_Identity(rrc.informationelements.URA_Identity ura_Identity)
    {
	mComponents[9] = ura_Identity;
    }
    
    public boolean hasUra_Identity()
    {
	return componentIsPresent(9);
    }
    
    public void deleteUra_Identity()
    {
	setComponentAbsent(9);
    }
    
    
    // Methods for field "dl_CounterSynchronisationInfo"
    public rrc.informationelements.DL_CounterSynchronisationInfo getDl_CounterSynchronisationInfo()
    {
	return (rrc.informationelements.DL_CounterSynchronisationInfo)mComponents[10];
    }
    
    public void setDl_CounterSynchronisationInfo(rrc.informationelements.DL_CounterSynchronisationInfo dl_CounterSynchronisationInfo)
    {
	mComponents[10] = dl_CounterSynchronisationInfo;
    }
    
    public boolean hasDl_CounterSynchronisationInfo()
    {
	return componentIsPresent(10);
    }
    
    public void deleteDl_CounterSynchronisationInfo()
    {
	setComponentAbsent(10);
    }
    
    
    // Methods for field "ul_CommonTransChInfo"
    public rrc.informationelements.UL_CommonTransChInfo getUl_CommonTransChInfo()
    {
	return (rrc.informationelements.UL_CommonTransChInfo)mComponents[11];
    }
    
    public void setUl_CommonTransChInfo(rrc.informationelements.UL_CommonTransChInfo ul_CommonTransChInfo)
    {
	mComponents[11] = ul_CommonTransChInfo;
    }
    
    public boolean hasUl_CommonTransChInfo()
    {
	return componentIsPresent(11);
    }
    
    public void deleteUl_CommonTransChInfo()
    {
	setComponentAbsent(11);
    }
    
    
    // Methods for field "ul_AddReconfTransChInfoList"
    public rrc.informationelements.UL_AddReconfTransChInfoList getUl_AddReconfTransChInfoList()
    {
	return (rrc.informationelements.UL_AddReconfTransChInfoList)mComponents[12];
    }
    
    public void setUl_AddReconfTransChInfoList(rrc.informationelements.UL_AddReconfTransChInfoList ul_AddReconfTransChInfoList)
    {
	mComponents[12] = ul_AddReconfTransChInfoList;
    }
    
    public boolean hasUl_AddReconfTransChInfoList()
    {
	return componentIsPresent(12);
    }
    
    public void deleteUl_AddReconfTransChInfoList()
    {
	setComponentAbsent(12);
    }
    
    
    // Methods for field "dummy"
    public Dummy getDummy()
    {
	return (Dummy)mComponents[13];
    }
    
    public void setDummy(Dummy dummy)
    {
	mComponents[13] = dummy;
    }
    
    public boolean hasDummy()
    {
	return componentIsPresent(13);
    }
    
    public void deleteDummy()
    {
	setComponentAbsent(13);
    }
    
    
    
    /**
     * Define the ASN1 Type Dummy from ASN1 Module PDU_definitions.
     * @see Choice
     */
    public static class Dummy extends Choice {
	
	/**
	 * The default constructor.
	 */
	public Dummy()
	{
	}
	
	public static final  int  fdd_chosen = 1;
	public static final  int  tdd_chosen = 2;
	
	// Methods for field "fdd"
	public static Dummy createDummyWithFdd(Fdd fdd)
	{
	    Dummy __object = new Dummy();

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
	 * Define the ASN1 Type Fdd from ASN1 Module PDU_definitions.
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
	    public Fdd(rrc.informationelements.CPCH_SetID dummy1, 
			    rrc.informationelements.DRAC_StaticInformationList dummy2)
	    {
		setDummy1(dummy1);
		setDummy2(dummy2);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new rrc.informationelements.CPCH_SetID();
		mComponents[1] = new rrc.informationelements.DRAC_StaticInformationList();
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
			return new rrc.informationelements.CPCH_SetID();
		    case 1:
			return new rrc.informationelements.DRAC_StaticInformationList();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "dummy1"
	    public rrc.informationelements.CPCH_SetID getDummy1()
	    {
		return (rrc.informationelements.CPCH_SetID)mComponents[0];
	    }
	    
	    public void setDummy1(rrc.informationelements.CPCH_SetID dummy1)
	    {
		mComponents[0] = dummy1;
	    }
	    
	    public boolean hasDummy1()
	    {
		return componentIsPresent(0);
	    }
	    
	    public void deleteDummy1()
	    {
		setComponentAbsent(0);
	    }
	    
	    
	    // Methods for field "dummy2"
	    public rrc.informationelements.DRAC_StaticInformationList getDummy2()
	    {
		return (rrc.informationelements.DRAC_StaticInformationList)mComponents[1];
	    }
	    
	    public void setDummy2(rrc.informationelements.DRAC_StaticInformationList dummy2)
	    {
		mComponents[1] = dummy2;
	    }
	    
	    public boolean hasDummy2()
	    {
		return componentIsPresent(1);
	    }
	    
	    public void deleteDummy2()
	    {
		setComponentAbsent(1);
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
		    "rrc.pdu_definitions",
		    "TransportChannelReconfiguration_r3_IEs$Dummy$Fdd"
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
					"CPCH_SetID"
				    ),
				    new QName (
					"InformationElements",
					"CPCH-SetID"
				    ),
				    12314,
				    new ValueRangeConstraint (
					new AbstractBounds(
					    new rrc.informationelements.CPCH_SetID(1), 
					    new rrc.informationelements.CPCH_SetID(16),
					    0
					)
				    ),
				    new Bounds (
					new java.lang.Long(1),
					new java.lang.Long(16)
				    ),
				    null
				)
			    ),
			    "dummy1",
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
					"DRAC_StaticInformationList"
				    ),
				    new QName (
					"InformationElements",
					"DRAC-StaticInformationList"
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
					    "DRAC_StaticInformation"
					)
				    )
				)
			    ),
			    "dummy2",
			    1,
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
	public static Dummy createDummyWithTdd(Null tdd)
	{
	    Dummy __object = new Dummy();

	    __object.setTdd(tdd);
	    return __object;
	}
	
	public boolean hasTdd()
	{
	    return getChosenFlag() == tdd_chosen;
	}
	
	public void setTdd(Null tdd)
	{
	    setChosenValue(tdd);
	    setChosenFlag(tdd_chosen);
	}
	
	
	// Method to create a specific choice instance
	public AbstractData createInstance(int chosen)
	{
	    switch (chosen) {
		case fdd_chosen:
		    return new Fdd();
		case tdd_chosen:
		    return new Null();
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
		    (short)0x800d
		}
	    ),
	    new QName (
		"rrc.pdu_definitions",
		"TransportChannelReconfiguration_r3_IEs$Dummy"
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
				"rrc.pdu_definitions",
				"TransportChannelReconfiguration_r3_IEs$Dummy$Fdd"
			    )
			),
			"fdd",
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

    // Methods for field "dl_CommonTransChInfo"
    public rrc.informationelements.DL_CommonTransChInfo getDl_CommonTransChInfo()
    {
	return (rrc.informationelements.DL_CommonTransChInfo)mComponents[14];
    }
    
    public void setDl_CommonTransChInfo(rrc.informationelements.DL_CommonTransChInfo dl_CommonTransChInfo)
    {
	mComponents[14] = dl_CommonTransChInfo;
    }
    
    public boolean hasDl_CommonTransChInfo()
    {
	return componentIsPresent(14);
    }
    
    public void deleteDl_CommonTransChInfo()
    {
	setComponentAbsent(14);
    }
    
    
    // Methods for field "dl_AddReconfTransChInfoList"
    public rrc.informationelements.DL_AddReconfTransChInfoList getDl_AddReconfTransChInfoList()
    {
	return (rrc.informationelements.DL_AddReconfTransChInfoList)mComponents[15];
    }
    
    public void setDl_AddReconfTransChInfoList(rrc.informationelements.DL_AddReconfTransChInfoList dl_AddReconfTransChInfoList)
    {
	mComponents[15] = dl_AddReconfTransChInfoList;
    }
    
    public boolean hasDl_AddReconfTransChInfoList()
    {
	return componentIsPresent(15);
    }
    
    public void deleteDl_AddReconfTransChInfoList()
    {
	setComponentAbsent(15);
    }
    
    
    // Methods for field "frequencyInfo"
    public rrc.informationelements.FrequencyInfo getFrequencyInfo()
    {
	return (rrc.informationelements.FrequencyInfo)mComponents[16];
    }
    
    public void setFrequencyInfo(rrc.informationelements.FrequencyInfo frequencyInfo)
    {
	mComponents[16] = frequencyInfo;
    }
    
    public boolean hasFrequencyInfo()
    {
	return componentIsPresent(16);
    }
    
    public void deleteFrequencyInfo()
    {
	setComponentAbsent(16);
    }
    
    
    // Methods for field "maxAllowedUL_TX_Power"
    public rrc.informationelements.MaxAllowedUL_TX_Power getMaxAllowedUL_TX_Power()
    {
	return (rrc.informationelements.MaxAllowedUL_TX_Power)mComponents[17];
    }
    
    public void setMaxAllowedUL_TX_Power(rrc.informationelements.MaxAllowedUL_TX_Power maxAllowedUL_TX_Power)
    {
	mComponents[17] = maxAllowedUL_TX_Power;
    }
    
    public boolean hasMaxAllowedUL_TX_Power()
    {
	return componentIsPresent(17);
    }
    
    public void deleteMaxAllowedUL_TX_Power()
    {
	setComponentAbsent(17);
    }
    
    
    // Methods for field "ul_ChannelRequirement"
    public rrc.informationelements.UL_ChannelRequirement getUl_ChannelRequirement()
    {
	return (rrc.informationelements.UL_ChannelRequirement)mComponents[18];
    }
    
    public void setUl_ChannelRequirement(rrc.informationelements.UL_ChannelRequirement ul_ChannelRequirement)
    {
	mComponents[18] = ul_ChannelRequirement;
    }
    
    public boolean hasUl_ChannelRequirement()
    {
	return componentIsPresent(18);
    }
    
    public void deleteUl_ChannelRequirement()
    {
	setComponentAbsent(18);
    }
    
    
    // Methods for field "modeSpecificPhysChInfo"
    public ModeSpecificPhysChInfo getModeSpecificPhysChInfo()
    {
	return (ModeSpecificPhysChInfo)mComponents[19];
    }
    
    public void setModeSpecificPhysChInfo(ModeSpecificPhysChInfo modeSpecificPhysChInfo)
    {
	mComponents[19] = modeSpecificPhysChInfo;
    }
    
    
    
    /**
     * Define the ASN1 Type ModeSpecificPhysChInfo from ASN1 Module PDU_definitions.
     * @see Choice
     */
    public static class ModeSpecificPhysChInfo extends Choice {
	
	/**
	 * The default constructor.
	 */
	public ModeSpecificPhysChInfo()
	{
	}
	
	public static final  int  fdd_chosen = 1;
	public static final  int  tdd_chosen = 2;
	
	// Methods for field "fdd"
	public static ModeSpecificPhysChInfo createModeSpecificPhysChInfoWithFdd(Fdd fdd)
	{
	    ModeSpecificPhysChInfo __object = new ModeSpecificPhysChInfo();

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
	 * Define the ASN1 Type Fdd from ASN1 Module PDU_definitions.
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
	    public Fdd(rrc.informationelements.DL_PDSCH_Information dummy)
	    {
		setDummy(dummy);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new rrc.informationelements.DL_PDSCH_Information();
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
			return new rrc.informationelements.DL_PDSCH_Information();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "dummy"
	    public rrc.informationelements.DL_PDSCH_Information getDummy()
	    {
		return (rrc.informationelements.DL_PDSCH_Information)mComponents[0];
	    }
	    
	    public void setDummy(rrc.informationelements.DL_PDSCH_Information dummy)
	    {
		mComponents[0] = dummy;
	    }
	    
	    public boolean hasDummy()
	    {
		return componentIsPresent(0);
	    }
	    
	    public void deleteDummy()
	    {
		setComponentAbsent(0);
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
		    "rrc.pdu_definitions",
		    "TransportChannelReconfiguration_r3_IEs$ModeSpecificPhysChInfo$Fdd"
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
					"DL_PDSCH_Information"
				    ),
				    new QName (
					"InformationElements",
					"DL-PDSCH-Information"
				    ),
				    12314,
				    null,
				    new FieldsRef (
					new QName (
					    "rrc.informationelements",
					    "DL_PDSCH_Information"
					)
				    ),
				    0,
				    new TagDecodersRef (
					new QName (
					    "rrc.informationelements",
					    "DL_PDSCH_Information"
					)
				    ),
				    0
				)
			    ),
			    "dummy",
			    0,
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
	public static ModeSpecificPhysChInfo createModeSpecificPhysChInfoWithTdd(Null tdd)
	{
	    ModeSpecificPhysChInfo __object = new ModeSpecificPhysChInfo();

	    __object.setTdd(tdd);
	    return __object;
	}
	
	public boolean hasTdd()
	{
	    return getChosenFlag() == tdd_chosen;
	}
	
	public void setTdd(Null tdd)
	{
	    setChosenValue(tdd);
	    setChosenFlag(tdd_chosen);
	}
	
	
	// Method to create a specific choice instance
	public AbstractData createInstance(int chosen)
	{
	    switch (chosen) {
		case fdd_chosen:
		    return new Fdd();
		case tdd_chosen:
		    return new Null();
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
		    (short)0x8013
		}
	    ),
	    new QName (
		"rrc.pdu_definitions",
		"TransportChannelReconfiguration_r3_IEs$ModeSpecificPhysChInfo"
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
				"rrc.pdu_definitions",
				"TransportChannelReconfiguration_r3_IEs$ModeSpecificPhysChInfo$Fdd"
			    )
			),
			"fdd",
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
	 * Get the type descriptor (TypeInfo) of 'this' ModeSpecificPhysChInfo object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' ModeSpecificPhysChInfo object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for ModeSpecificPhysChInfo

    // Methods for field "dl_CommonInformation"
    public rrc.informationelements.DL_CommonInformation getDl_CommonInformation()
    {
	return (rrc.informationelements.DL_CommonInformation)mComponents[20];
    }
    
    public void setDl_CommonInformation(rrc.informationelements.DL_CommonInformation dl_CommonInformation)
    {
	mComponents[20] = dl_CommonInformation;
    }
    
    public boolean hasDl_CommonInformation()
    {
	return componentIsPresent(20);
    }
    
    public void deleteDl_CommonInformation()
    {
	setComponentAbsent(20);
    }
    
    
    // Methods for field "dl_InformationPerRL_List"
    public rrc.informationelements.DL_InformationPerRL_List getDl_InformationPerRL_List()
    {
	return (rrc.informationelements.DL_InformationPerRL_List)mComponents[21];
    }
    
    public void setDl_InformationPerRL_List(rrc.informationelements.DL_InformationPerRL_List dl_InformationPerRL_List)
    {
	mComponents[21] = dl_InformationPerRL_List;
    }
    
    public boolean hasDl_InformationPerRL_List()
    {
	return componentIsPresent(21);
    }
    
    public void deleteDl_InformationPerRL_List()
    {
	setComponentAbsent(21);
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
	    "rrc.pdu_definitions",
	    "TransportChannelReconfiguration_r3_IEs"
	),
	new QName (
	    "PDU-definitions",
	    "TransportChannelReconfiguration-r3-IEs"
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
				"RRC_TransactionIdentifier"
			    ),
			    new QName (
				"InformationElements",
				"RRC-TransactionIdentifier"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new rrc.informationelements.RRC_TransactionIdentifier(0), 
				    new rrc.informationelements.RRC_TransactionIdentifier(3),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(3)
			    ),
			    null
			)
		    ),
		    "rrc-TransactionIdentifier",
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
				"IntegrityProtectionModeInfo"
			    ),
			    new QName (
				"InformationElements",
				"IntegrityProtectionModeInfo"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "IntegrityProtectionModeInfo"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "IntegrityProtectionModeInfo"
				)
			    ),
			    0
			)
		    ),
		    "integrityProtectionModeInfo",
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
				"CipheringModeInfo"
			    ),
			    new QName (
				"InformationElements",
				"CipheringModeInfo"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "CipheringModeInfo"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "CipheringModeInfo"
				)
			    ),
			    0
			)
		    ),
		    "cipheringModeInfo",
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
				"ActivationTime"
			    ),
			    new QName (
				"InformationElements",
				"ActivationTime"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new rrc.informationelements.ActivationTime(0), 
				    new rrc.informationelements.ActivationTime(255),
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
		    3,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8004
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"U_RNTI"
			    ),
			    new QName (
				"InformationElements",
				"U-RNTI"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "U_RNTI"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "U_RNTI"
				)
			    ),
			    0
			)
		    ),
		    "new-U-RNTI",
		    4,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8005
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"C_RNTI"
			    ),
			    new QName (
				"InformationElements",
				"C-RNTI"
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
			    null
			)
		    ),
		    "new-C-RNTI",
		    5,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8006
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"RRC_StateIndicator"
			    ),
			    new QName (
				"InformationElements",
				"RRC-StateIndicator"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"cell-DCH",
					0
				    ),
				    new MemberListElement (
					"cell-FACH",
					1
				    ),
				    new MemberListElement (
					"cell-PCH",
					2
				    ),
				    new MemberListElement (
					"ura-PCH",
					3
				    )
				}
			    ),
			    0,
			    rrc.informationelements.RRC_StateIndicator.cell_DCH
			)
		    ),
		    "rrc-StateIndicator",
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
				"rrc.informationelements",
				"UTRAN_DRX_CycleLengthCoefficient"
			    ),
			    new QName (
				"InformationElements",
				"UTRAN-DRX-CycleLengthCoefficient"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new rrc.informationelements.UTRAN_DRX_CycleLengthCoefficient(3), 
				    new rrc.informationelements.UTRAN_DRX_CycleLengthCoefficient(9),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(3),
				new java.lang.Long(9)
			    ),
			    null
			)
		    ),
		    "utran-DRX-CycleLengthCoeff",
		    7,
		    3,
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
				"CN_InformationInfo"
			    ),
			    new QName (
				"InformationElements",
				"CN-InformationInfo"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "CN_InformationInfo"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "CN_InformationInfo"
				)
			    ),
			    0
			)
		    ),
		    "cn-InformationInfo",
		    8,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8009
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"URA_Identity"
			    ),
			    new QName (
				"InformationElements",
				"URA-Identity"
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
			    null
			)
		    ),
		    "ura-Identity",
		    9,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x800a
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"DL_CounterSynchronisationInfo"
			    ),
			    new QName (
				"InformationElements",
				"DL-CounterSynchronisationInfo"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "DL_CounterSynchronisationInfo"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "DL_CounterSynchronisationInfo"
				)
			    ),
			    0
			)
		    ),
		    "dl-CounterSynchronisationInfo",
		    10,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x800b
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"UL_CommonTransChInfo"
			    ),
			    new QName (
				"InformationElements",
				"UL-CommonTransChInfo"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UL_CommonTransChInfo"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "UL_CommonTransChInfo"
				)
			    ),
			    0
			)
		    ),
		    "ul-CommonTransChInfo",
		    11,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x800c
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"UL_AddReconfTransChInfoList"
			    ),
			    new QName (
				"InformationElements",
				"UL-AddReconfTransChInfoList"
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
				    "UL_AddReconfTransChInformation"
				)
			    )
			)
		    ),
		    "ul-AddReconfTransChInfoList",
		    12,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.pdu_definitions",
			    "TransportChannelReconfiguration_r3_IEs$Dummy"
			)
		    ),
		    "dummy",
		    13,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x800e
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"DL_CommonTransChInfo"
			    ),
			    new QName (
				"InformationElements",
				"DL-CommonTransChInfo"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "DL_CommonTransChInfo"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "DL_CommonTransChInfo"
				)
			    ),
			    0
			)
		    ),
		    "dl-CommonTransChInfo",
		    14,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x800f
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"DL_AddReconfTransChInfoList"
			    ),
			    new QName (
				"InformationElements",
				"DL-AddReconfTransChInfoList"
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
				    "DL_AddReconfTransChInformation"
				)
			    )
			)
		    ),
		    "dl-AddReconfTransChInfoList",
		    15,
		    3,
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
				"FrequencyInfo"
			    ),
			    new QName (
				"InformationElements",
				"FrequencyInfo"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "FrequencyInfo"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "FrequencyInfo"
				)
			    ),
			    0
			)
		    ),
		    "frequencyInfo",
		    16,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8011
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"MaxAllowedUL_TX_Power"
			    ),
			    new QName (
				"InformationElements",
				"MaxAllowedUL-TX-Power"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new rrc.informationelements.MaxAllowedUL_TX_Power(-50), 
				    new rrc.informationelements.MaxAllowedUL_TX_Power(33),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(-50),
				new java.lang.Long(33)
			    ),
			    null
			)
		    ),
		    "maxAllowedUL-TX-Power",
		    17,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x8012
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"UL_ChannelRequirement"
			    ),
			    new QName (
				"InformationElements",
				"UL-ChannelRequirement"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UL_ChannelRequirement"
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
		    "ul-ChannelRequirement",
		    18,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.pdu_definitions",
			    "TransportChannelReconfiguration_r3_IEs$ModeSpecificPhysChInfo"
			)
		    ),
		    "modeSpecificPhysChInfo",
		    19,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8014
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"DL_CommonInformation"
			    ),
			    new QName (
				"InformationElements",
				"DL-CommonInformation"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "DL_CommonInformation"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "DL_CommonInformation"
				)
			    ),
			    0
			)
		    ),
		    "dl-CommonInformation",
		    20,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8015
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"DL_InformationPerRL_List"
			    ),
			    new QName (
				"InformationElements",
				"DL-InformationPerRL-List"
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
				    "DL_InformationPerRL"
				)
			    )
			)
		    ),
		    "dl-InformationPerRL-List",
		    21,
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
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6)
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
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8007, 7),
			new TagDecoderElement((short)0x8008, 8),
			new TagDecoderElement((short)0x8009, 9),
			new TagDecoderElement((short)0x800a, 10),
			new TagDecoderElement((short)0x800b, 11),
			new TagDecoderElement((short)0x800c, 12),
			new TagDecoderElement((short)0x800d, 13),
			new TagDecoderElement((short)0x800e, 14),
			new TagDecoderElement((short)0x800f, 15),
			new TagDecoderElement((short)0x8010, 16),
			new TagDecoderElement((short)0x8011, 17),
			new TagDecoderElement((short)0x8012, 18),
			new TagDecoderElement((short)0x8013, 19)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8008, 8),
			new TagDecoderElement((short)0x8009, 9),
			new TagDecoderElement((short)0x800a, 10),
			new TagDecoderElement((short)0x800b, 11),
			new TagDecoderElement((short)0x800c, 12),
			new TagDecoderElement((short)0x800d, 13),
			new TagDecoderElement((short)0x800e, 14),
			new TagDecoderElement((short)0x800f, 15),
			new TagDecoderElement((short)0x8010, 16),
			new TagDecoderElement((short)0x8011, 17),
			new TagDecoderElement((short)0x8012, 18),
			new TagDecoderElement((short)0x8013, 19)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8009, 9),
			new TagDecoderElement((short)0x800a, 10),
			new TagDecoderElement((short)0x800b, 11),
			new TagDecoderElement((short)0x800c, 12),
			new TagDecoderElement((short)0x800d, 13),
			new TagDecoderElement((short)0x800e, 14),
			new TagDecoderElement((short)0x800f, 15),
			new TagDecoderElement((short)0x8010, 16),
			new TagDecoderElement((short)0x8011, 17),
			new TagDecoderElement((short)0x8012, 18),
			new TagDecoderElement((short)0x8013, 19)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800a, 10),
			new TagDecoderElement((short)0x800b, 11),
			new TagDecoderElement((short)0x800c, 12),
			new TagDecoderElement((short)0x800d, 13),
			new TagDecoderElement((short)0x800e, 14),
			new TagDecoderElement((short)0x800f, 15),
			new TagDecoderElement((short)0x8010, 16),
			new TagDecoderElement((short)0x8011, 17),
			new TagDecoderElement((short)0x8012, 18),
			new TagDecoderElement((short)0x8013, 19)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800b, 11),
			new TagDecoderElement((short)0x800c, 12),
			new TagDecoderElement((short)0x800d, 13),
			new TagDecoderElement((short)0x800e, 14),
			new TagDecoderElement((short)0x800f, 15),
			new TagDecoderElement((short)0x8010, 16),
			new TagDecoderElement((short)0x8011, 17),
			new TagDecoderElement((short)0x8012, 18),
			new TagDecoderElement((short)0x8013, 19)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800c, 12),
			new TagDecoderElement((short)0x800d, 13),
			new TagDecoderElement((short)0x800e, 14),
			new TagDecoderElement((short)0x800f, 15),
			new TagDecoderElement((short)0x8010, 16),
			new TagDecoderElement((short)0x8011, 17),
			new TagDecoderElement((short)0x8012, 18),
			new TagDecoderElement((short)0x8013, 19)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800d, 13),
			new TagDecoderElement((short)0x800e, 14),
			new TagDecoderElement((short)0x800f, 15),
			new TagDecoderElement((short)0x8010, 16),
			new TagDecoderElement((short)0x8011, 17),
			new TagDecoderElement((short)0x8012, 18),
			new TagDecoderElement((short)0x8013, 19)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800e, 14),
			new TagDecoderElement((short)0x800f, 15),
			new TagDecoderElement((short)0x8010, 16),
			new TagDecoderElement((short)0x8011, 17),
			new TagDecoderElement((short)0x8012, 18),
			new TagDecoderElement((short)0x8013, 19)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800f, 15),
			new TagDecoderElement((short)0x8010, 16),
			new TagDecoderElement((short)0x8011, 17),
			new TagDecoderElement((short)0x8012, 18),
			new TagDecoderElement((short)0x8013, 19)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8010, 16),
			new TagDecoderElement((short)0x8011, 17),
			new TagDecoderElement((short)0x8012, 18),
			new TagDecoderElement((short)0x8013, 19)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8011, 17),
			new TagDecoderElement((short)0x8012, 18),
			new TagDecoderElement((short)0x8013, 19)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8012, 18),
			new TagDecoderElement((short)0x8013, 19)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8013, 19)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8014, 20),
			new TagDecoderElement((short)0x8015, 21)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8015, 21)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' TransportChannelReconfiguration_r3_IEs object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' TransportChannelReconfiguration_r3_IEs object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for TransportChannelReconfiguration_r3_IEs
