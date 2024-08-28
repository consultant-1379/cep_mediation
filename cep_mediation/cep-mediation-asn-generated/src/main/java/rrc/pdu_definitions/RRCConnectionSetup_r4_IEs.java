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
 * Define the ASN1 Type RRCConnectionSetup_r4_IEs from ASN1 Module PDU_definitions.
 * @see Sequence
 */

public class RRCConnectionSetup_r4_IEs extends Sequence {
    
    /**
     * The default constructor.
     */
    public RRCConnectionSetup_r4_IEs()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public RRCConnectionSetup_r4_IEs(rrc.informationelements.ActivationTime activationTime, 
		    rrc.informationelements.U_RNTI new_U_RNTI, 
		    rrc.informationelements.C_RNTI new_c_RNTI, 
		    rrc.informationelements.RRC_StateIndicator rrc_StateIndicator, 
		    rrc.informationelements.UTRAN_DRX_CycleLengthCoefficient utran_DRX_CycleLengthCoeff, 
		    rrc.informationelements.CapabilityUpdateRequirement_r4 capabilityUpdateRequirement, 
		    rrc.informationelements.SRB_InformationSetupList2 srb_InformationSetupList, 
		    rrc.informationelements.UL_CommonTransChInfo_r4 ul_CommonTransChInfo, 
		    rrc.informationelements.UL_AddReconfTransChInfoList ul_AddReconfTransChInfoList, 
		    rrc.informationelements.DL_CommonTransChInfo_r4 dl_CommonTransChInfo, 
		    rrc.informationelements.DL_AddReconfTransChInfoList_r4 dl_AddReconfTransChInfoList, 
		    rrc.informationelements.FrequencyInfo frequencyInfo, 
		    rrc.informationelements.MaxAllowedUL_TX_Power maxAllowedUL_TX_Power, 
		    rrc.informationelements.UL_ChannelRequirement_r4 ul_ChannelRequirement, 
		    rrc.informationelements.DL_CommonInformation_r4 dl_CommonInformation, 
		    rrc.informationelements.DL_InformationPerRL_List_r4 dl_InformationPerRL_List)
    {
	setActivationTime(activationTime);
	setNew_U_RNTI(new_U_RNTI);
	setNew_c_RNTI(new_c_RNTI);
	setRrc_StateIndicator(rrc_StateIndicator);
	setUtran_DRX_CycleLengthCoeff(utran_DRX_CycleLengthCoeff);
	setCapabilityUpdateRequirement(capabilityUpdateRequirement);
	setSrb_InformationSetupList(srb_InformationSetupList);
	setUl_CommonTransChInfo(ul_CommonTransChInfo);
	setUl_AddReconfTransChInfoList(ul_AddReconfTransChInfoList);
	setDl_CommonTransChInfo(dl_CommonTransChInfo);
	setDl_AddReconfTransChInfoList(dl_AddReconfTransChInfoList);
	setFrequencyInfo(frequencyInfo);
	setMaxAllowedUL_TX_Power(maxAllowedUL_TX_Power);
	setUl_ChannelRequirement(ul_ChannelRequirement);
	setDl_CommonInformation(dl_CommonInformation);
	setDl_InformationPerRL_List(dl_InformationPerRL_List);
    }
    
    /**
     * Construct with required components.
     */
    public RRCConnectionSetup_r4_IEs(rrc.informationelements.U_RNTI new_U_RNTI, 
		    rrc.informationelements.RRC_StateIndicator rrc_StateIndicator, 
		    rrc.informationelements.UTRAN_DRX_CycleLengthCoefficient utran_DRX_CycleLengthCoeff, 
		    rrc.informationelements.SRB_InformationSetupList2 srb_InformationSetupList)
    {
	setNew_U_RNTI(new_U_RNTI);
	setRrc_StateIndicator(rrc_StateIndicator);
	setUtran_DRX_CycleLengthCoeff(utran_DRX_CycleLengthCoeff);
	setSrb_InformationSetupList(srb_InformationSetupList);
    }
    
    public void initComponents()
    {
	mComponents[0] = new rrc.informationelements.ActivationTime();
	mComponents[1] = new rrc.informationelements.U_RNTI();
	mComponents[2] = new rrc.informationelements.C_RNTI();
	mComponents[3] = rrc.informationelements.RRC_StateIndicator.cell_DCH;
	mComponents[4] = new rrc.informationelements.UTRAN_DRX_CycleLengthCoefficient();
	mComponents[5] = new rrc.informationelements.CapabilityUpdateRequirement_r4();
	mComponents[6] = new rrc.informationelements.SRB_InformationSetupList2();
	mComponents[7] = new rrc.informationelements.UL_CommonTransChInfo_r4();
	mComponents[8] = new rrc.informationelements.UL_AddReconfTransChInfoList();
	mComponents[9] = new rrc.informationelements.DL_CommonTransChInfo_r4();
	mComponents[10] = new rrc.informationelements.DL_AddReconfTransChInfoList_r4();
	mComponents[11] = new rrc.informationelements.FrequencyInfo();
	mComponents[12] = new rrc.informationelements.MaxAllowedUL_TX_Power();
	mComponents[13] = new rrc.informationelements.UL_ChannelRequirement_r4();
	mComponents[14] = new rrc.informationelements.DL_CommonInformation_r4();
	mComponents[15] = new rrc.informationelements.DL_InformationPerRL_List_r4();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[16];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new rrc.informationelements.ActivationTime();
	    case 1:
		return new rrc.informationelements.U_RNTI();
	    case 2:
		return new rrc.informationelements.C_RNTI();
	    case 3:
		return rrc.informationelements.RRC_StateIndicator.cell_DCH;
	    case 4:
		return new rrc.informationelements.UTRAN_DRX_CycleLengthCoefficient();
	    case 5:
		return new rrc.informationelements.CapabilityUpdateRequirement_r4();
	    case 6:
		return new rrc.informationelements.SRB_InformationSetupList2();
	    case 7:
		return new rrc.informationelements.UL_CommonTransChInfo_r4();
	    case 8:
		return new rrc.informationelements.UL_AddReconfTransChInfoList();
	    case 9:
		return new rrc.informationelements.DL_CommonTransChInfo_r4();
	    case 10:
		return new rrc.informationelements.DL_AddReconfTransChInfoList_r4();
	    case 11:
		return new rrc.informationelements.FrequencyInfo();
	    case 12:
		return new rrc.informationelements.MaxAllowedUL_TX_Power();
	    case 13:
		return new rrc.informationelements.UL_ChannelRequirement_r4();
	    case 14:
		return new rrc.informationelements.DL_CommonInformation_r4();
	    case 15:
		return new rrc.informationelements.DL_InformationPerRL_List_r4();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "activationTime"
    public rrc.informationelements.ActivationTime getActivationTime()
    {
	return (rrc.informationelements.ActivationTime)mComponents[0];
    }
    
    public void setActivationTime(rrc.informationelements.ActivationTime activationTime)
    {
	mComponents[0] = activationTime;
    }
    
    public boolean hasActivationTime()
    {
	return componentIsPresent(0);
    }
    
    public void deleteActivationTime()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "new_U_RNTI"
    public rrc.informationelements.U_RNTI getNew_U_RNTI()
    {
	return (rrc.informationelements.U_RNTI)mComponents[1];
    }
    
    public void setNew_U_RNTI(rrc.informationelements.U_RNTI new_U_RNTI)
    {
	mComponents[1] = new_U_RNTI;
    }
    
    
    // Methods for field "new_c_RNTI"
    public rrc.informationelements.C_RNTI getNew_c_RNTI()
    {
	return (rrc.informationelements.C_RNTI)mComponents[2];
    }
    
    public void setNew_c_RNTI(rrc.informationelements.C_RNTI new_c_RNTI)
    {
	mComponents[2] = new_c_RNTI;
    }
    
    public boolean hasNew_c_RNTI()
    {
	return componentIsPresent(2);
    }
    
    public void deleteNew_c_RNTI()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "rrc_StateIndicator"
    public rrc.informationelements.RRC_StateIndicator getRrc_StateIndicator()
    {
	return (rrc.informationelements.RRC_StateIndicator)mComponents[3];
    }
    
    public void setRrc_StateIndicator(rrc.informationelements.RRC_StateIndicator rrc_StateIndicator)
    {
	mComponents[3] = rrc_StateIndicator;
    }
    
    
    // Methods for field "utran_DRX_CycleLengthCoeff"
    public rrc.informationelements.UTRAN_DRX_CycleLengthCoefficient getUtran_DRX_CycleLengthCoeff()
    {
	return (rrc.informationelements.UTRAN_DRX_CycleLengthCoefficient)mComponents[4];
    }
    
    public void setUtran_DRX_CycleLengthCoeff(rrc.informationelements.UTRAN_DRX_CycleLengthCoefficient utran_DRX_CycleLengthCoeff)
    {
	mComponents[4] = utran_DRX_CycleLengthCoeff;
    }
    
    
    // Methods for field "capabilityUpdateRequirement"
    public rrc.informationelements.CapabilityUpdateRequirement_r4 getCapabilityUpdateRequirement()
    {
	return (rrc.informationelements.CapabilityUpdateRequirement_r4)mComponents[5];
    }
    
    public void setCapabilityUpdateRequirement(rrc.informationelements.CapabilityUpdateRequirement_r4 capabilityUpdateRequirement)
    {
	mComponents[5] = capabilityUpdateRequirement;
    }
    
    public boolean hasCapabilityUpdateRequirement()
    {
	return componentIsPresent(5);
    }
    
    public void deleteCapabilityUpdateRequirement()
    {
	setComponentAbsent(5);
    }
    
    
    // Methods for field "srb_InformationSetupList"
    public rrc.informationelements.SRB_InformationSetupList2 getSrb_InformationSetupList()
    {
	return (rrc.informationelements.SRB_InformationSetupList2)mComponents[6];
    }
    
    public void setSrb_InformationSetupList(rrc.informationelements.SRB_InformationSetupList2 srb_InformationSetupList)
    {
	mComponents[6] = srb_InformationSetupList;
    }
    
    
    // Methods for field "ul_CommonTransChInfo"
    public rrc.informationelements.UL_CommonTransChInfo_r4 getUl_CommonTransChInfo()
    {
	return (rrc.informationelements.UL_CommonTransChInfo_r4)mComponents[7];
    }
    
    public void setUl_CommonTransChInfo(rrc.informationelements.UL_CommonTransChInfo_r4 ul_CommonTransChInfo)
    {
	mComponents[7] = ul_CommonTransChInfo;
    }
    
    public boolean hasUl_CommonTransChInfo()
    {
	return componentIsPresent(7);
    }
    
    public void deleteUl_CommonTransChInfo()
    {
	setComponentAbsent(7);
    }
    
    
    // Methods for field "ul_AddReconfTransChInfoList"
    public rrc.informationelements.UL_AddReconfTransChInfoList getUl_AddReconfTransChInfoList()
    {
	return (rrc.informationelements.UL_AddReconfTransChInfoList)mComponents[8];
    }
    
    public void setUl_AddReconfTransChInfoList(rrc.informationelements.UL_AddReconfTransChInfoList ul_AddReconfTransChInfoList)
    {
	mComponents[8] = ul_AddReconfTransChInfoList;
    }
    
    public boolean hasUl_AddReconfTransChInfoList()
    {
	return componentIsPresent(8);
    }
    
    public void deleteUl_AddReconfTransChInfoList()
    {
	setComponentAbsent(8);
    }
    
    
    // Methods for field "dl_CommonTransChInfo"
    public rrc.informationelements.DL_CommonTransChInfo_r4 getDl_CommonTransChInfo()
    {
	return (rrc.informationelements.DL_CommonTransChInfo_r4)mComponents[9];
    }
    
    public void setDl_CommonTransChInfo(rrc.informationelements.DL_CommonTransChInfo_r4 dl_CommonTransChInfo)
    {
	mComponents[9] = dl_CommonTransChInfo;
    }
    
    public boolean hasDl_CommonTransChInfo()
    {
	return componentIsPresent(9);
    }
    
    public void deleteDl_CommonTransChInfo()
    {
	setComponentAbsent(9);
    }
    
    
    // Methods for field "dl_AddReconfTransChInfoList"
    public rrc.informationelements.DL_AddReconfTransChInfoList_r4 getDl_AddReconfTransChInfoList()
    {
	return (rrc.informationelements.DL_AddReconfTransChInfoList_r4)mComponents[10];
    }
    
    public void setDl_AddReconfTransChInfoList(rrc.informationelements.DL_AddReconfTransChInfoList_r4 dl_AddReconfTransChInfoList)
    {
	mComponents[10] = dl_AddReconfTransChInfoList;
    }
    
    public boolean hasDl_AddReconfTransChInfoList()
    {
	return componentIsPresent(10);
    }
    
    public void deleteDl_AddReconfTransChInfoList()
    {
	setComponentAbsent(10);
    }
    
    
    // Methods for field "frequencyInfo"
    public rrc.informationelements.FrequencyInfo getFrequencyInfo()
    {
	return (rrc.informationelements.FrequencyInfo)mComponents[11];
    }
    
    public void setFrequencyInfo(rrc.informationelements.FrequencyInfo frequencyInfo)
    {
	mComponents[11] = frequencyInfo;
    }
    
    public boolean hasFrequencyInfo()
    {
	return componentIsPresent(11);
    }
    
    public void deleteFrequencyInfo()
    {
	setComponentAbsent(11);
    }
    
    
    // Methods for field "maxAllowedUL_TX_Power"
    public rrc.informationelements.MaxAllowedUL_TX_Power getMaxAllowedUL_TX_Power()
    {
	return (rrc.informationelements.MaxAllowedUL_TX_Power)mComponents[12];
    }
    
    public void setMaxAllowedUL_TX_Power(rrc.informationelements.MaxAllowedUL_TX_Power maxAllowedUL_TX_Power)
    {
	mComponents[12] = maxAllowedUL_TX_Power;
    }
    
    public boolean hasMaxAllowedUL_TX_Power()
    {
	return componentIsPresent(12);
    }
    
    public void deleteMaxAllowedUL_TX_Power()
    {
	setComponentAbsent(12);
    }
    
    
    // Methods for field "ul_ChannelRequirement"
    public rrc.informationelements.UL_ChannelRequirement_r4 getUl_ChannelRequirement()
    {
	return (rrc.informationelements.UL_ChannelRequirement_r4)mComponents[13];
    }
    
    public void setUl_ChannelRequirement(rrc.informationelements.UL_ChannelRequirement_r4 ul_ChannelRequirement)
    {
	mComponents[13] = ul_ChannelRequirement;
    }
    
    public boolean hasUl_ChannelRequirement()
    {
	return componentIsPresent(13);
    }
    
    public void deleteUl_ChannelRequirement()
    {
	setComponentAbsent(13);
    }
    
    
    // Methods for field "dl_CommonInformation"
    public rrc.informationelements.DL_CommonInformation_r4 getDl_CommonInformation()
    {
	return (rrc.informationelements.DL_CommonInformation_r4)mComponents[14];
    }
    
    public void setDl_CommonInformation(rrc.informationelements.DL_CommonInformation_r4 dl_CommonInformation)
    {
	mComponents[14] = dl_CommonInformation;
    }
    
    public boolean hasDl_CommonInformation()
    {
	return componentIsPresent(14);
    }
    
    public void deleteDl_CommonInformation()
    {
	setComponentAbsent(14);
    }
    
    
    // Methods for field "dl_InformationPerRL_List"
    public rrc.informationelements.DL_InformationPerRL_List_r4 getDl_InformationPerRL_List()
    {
	return (rrc.informationelements.DL_InformationPerRL_List_r4)mComponents[15];
    }
    
    public void setDl_InformationPerRL_List(rrc.informationelements.DL_InformationPerRL_List_r4 dl_InformationPerRL_List)
    {
	mComponents[15] = dl_InformationPerRL_List;
    }
    
    public boolean hasDl_InformationPerRL_List()
    {
	return componentIsPresent(15);
    }
    
    public void deleteDl_InformationPerRL_List()
    {
	setComponentAbsent(15);
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
	    "RRCConnectionSetup_r4_IEs"
	),
	new QName (
	    "PDU-definitions",
	    "RRCConnectionSetup-r4-IEs"
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
		    0,
		    3,
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
		    1,
		    2,
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
		    "new-c-RNTI",
		    2,
		    3,
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
				"CapabilityUpdateRequirement_r4"
			    ),
			    new QName (
				"InformationElements",
				"CapabilityUpdateRequirement-r4"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "CapabilityUpdateRequirement_r4"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "CapabilityUpdateRequirement_r4"
				)
			    ),
			    0
			)
		    ),
		    "capabilityUpdateRequirement",
		    5,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8006
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"SRB_InformationSetupList2"
			    ),
			    new QName (
				"InformationElements",
				"SRB-InformationSetupList2"
			    ),
			    12314,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new com.oss.asn1.INTEGER(3), 
					new com.oss.asn1.INTEGER(4),
					0
				    )
				)
			    ),
			    new Bounds (
				new java.lang.Long(3),
				new java.lang.Long(4)
			    ),
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "SRB_InformationSetup"
				)
			    )
			)
		    ),
		    "srb-InformationSetupList",
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
				"UL_CommonTransChInfo_r4"
			    ),
			    new QName (
				"InformationElements",
				"UL-CommonTransChInfo-r4"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UL_CommonTransChInfo_r4"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "UL_CommonTransChInfo_r4"
				)
			    ),
			    0
			)
		    ),
		    "ul-CommonTransChInfo",
		    7,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8008
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
		    8,
		    3,
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
				"DL_CommonTransChInfo_r4"
			    ),
			    new QName (
				"InformationElements",
				"DL-CommonTransChInfo-r4"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "DL_CommonTransChInfo_r4"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "DL_CommonTransChInfo_r4"
				)
			    ),
			    0
			)
		    ),
		    "dl-CommonTransChInfo",
		    9,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x800a
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"DL_AddReconfTransChInfoList_r4"
			    ),
			    new QName (
				"InformationElements",
				"DL-AddReconfTransChInfoList-r4"
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
				    "DL_AddReconfTransChInformation_r4"
				)
			    )
			)
		    ),
		    "dl-AddReconfTransChInfoList",
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
		    11,
		    3,
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
		    12,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x800d
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"UL_ChannelRequirement_r4"
			    ),
			    new QName (
				"InformationElements",
				"UL-ChannelRequirement-r4"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UL_ChannelRequirement_r4"
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
				"DL_CommonInformation_r4"
			    ),
			    new QName (
				"InformationElements",
				"DL-CommonInformation-r4"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "DL_CommonInformation_r4"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "DL_CommonInformation_r4"
				)
			    ),
			    0
			)
		    ),
		    "dl-CommonInformation",
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
				"DL_InformationPerRL_List_r4"
			    ),
			    new QName (
				"InformationElements",
				"DL-InformationPerRL-List-r4"
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
				    "DL_InformationPerRL_r4"
				)
			    )
			)
		    ),
		    "dl-InformationPerRL-List",
		    15,
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
			new TagDecoderElement((short)0x8004, 4)
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
			new TagDecoderElement((short)0x800f, 15)
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
			new TagDecoderElement((short)0x800f, 15)
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
			new TagDecoderElement((short)0x800f, 15)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800a, 10),
			new TagDecoderElement((short)0x800b, 11),
			new TagDecoderElement((short)0x800c, 12),
			new TagDecoderElement((short)0x800d, 13),
			new TagDecoderElement((short)0x800e, 14),
			new TagDecoderElement((short)0x800f, 15)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800b, 11),
			new TagDecoderElement((short)0x800c, 12),
			new TagDecoderElement((short)0x800d, 13),
			new TagDecoderElement((short)0x800e, 14),
			new TagDecoderElement((short)0x800f, 15)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800c, 12),
			new TagDecoderElement((short)0x800d, 13),
			new TagDecoderElement((short)0x800e, 14),
			new TagDecoderElement((short)0x800f, 15)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800d, 13),
			new TagDecoderElement((short)0x800e, 14),
			new TagDecoderElement((short)0x800f, 15)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800e, 14),
			new TagDecoderElement((short)0x800f, 15)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800f, 15)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' RRCConnectionSetup_r4_IEs object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' RRCConnectionSetup_r4_IEs object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for RRCConnectionSetup_r4_IEs
