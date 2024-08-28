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
 * Define the ASN1 Type UTRANMobilityInformation_r7_IEs from ASN1 Module PDU_definitions.
 * @see Sequence
 */

public class UTRANMobilityInformation_r7_IEs extends Sequence {
    
    /**
     * The default constructor.
     */
    public UTRANMobilityInformation_r7_IEs()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public UTRANMobilityInformation_r7_IEs(rrc.informationelements.IntegrityProtectionModeInfo_r7 integrityProtectionModeInfo, 
		    rrc.informationelements.CipheringModeInfo_r7 cipheringModeInfo, 
		    rrc.informationelements.U_RNTI new_U_RNTI, 
		    rrc.informationelements.C_RNTI new_C_RNTI, 
		    rrc.informationelements.H_RNTI new_H_RNTI, 
		    rrc.informationelements.UE_ConnTimersAndConstants_r5 ue_ConnTimersAndConstants, 
		    rrc.informationelements.CN_InformationInfoFull cn_InformationInfo, 
		    rrc.informationelements.PLMN_Identity primary_plmn_Identity, 
		    rrc.informationelements.URA_Identity ura_Identity, 
		    BOOLEAN supportForChangeOfUE_Capability, 
		    rrc.informationelements.DL_CounterSynchronisationInfo_r5 dl_CounterSynchronisationInfo)
    {
	setIntegrityProtectionModeInfo(integrityProtectionModeInfo);
	setCipheringModeInfo(cipheringModeInfo);
	setNew_U_RNTI(new_U_RNTI);
	setNew_C_RNTI(new_C_RNTI);
	setNew_H_RNTI(new_H_RNTI);
	setUe_ConnTimersAndConstants(ue_ConnTimersAndConstants);
	setCn_InformationInfo(cn_InformationInfo);
	setPrimary_plmn_Identity(primary_plmn_Identity);
	setUra_Identity(ura_Identity);
	setSupportForChangeOfUE_Capability(supportForChangeOfUE_Capability);
	setDl_CounterSynchronisationInfo(dl_CounterSynchronisationInfo);
    }
    
    /**
     * Construct with components.
     */
    public UTRANMobilityInformation_r7_IEs(rrc.informationelements.IntegrityProtectionModeInfo_r7 integrityProtectionModeInfo, 
		    rrc.informationelements.CipheringModeInfo_r7 cipheringModeInfo, 
		    rrc.informationelements.U_RNTI new_U_RNTI, 
		    rrc.informationelements.C_RNTI new_C_RNTI, 
		    rrc.informationelements.H_RNTI new_H_RNTI, 
		    rrc.informationelements.UE_ConnTimersAndConstants_r5 ue_ConnTimersAndConstants, 
		    rrc.informationelements.CN_InformationInfoFull cn_InformationInfo, 
		    rrc.informationelements.PLMN_Identity primary_plmn_Identity, 
		    rrc.informationelements.URA_Identity ura_Identity, 
		    boolean supportForChangeOfUE_Capability, 
		    rrc.informationelements.DL_CounterSynchronisationInfo_r5 dl_CounterSynchronisationInfo)
    {
	this(integrityProtectionModeInfo, cipheringModeInfo, new_U_RNTI, 
	     new_C_RNTI, new_H_RNTI, ue_ConnTimersAndConstants, 
	     cn_InformationInfo, primary_plmn_Identity, ura_Identity, 
	     new BOOLEAN(supportForChangeOfUE_Capability), 
	     dl_CounterSynchronisationInfo);
    }
    
    public void initComponents()
    {
	mComponents[0] = new rrc.informationelements.IntegrityProtectionModeInfo_r7();
	mComponents[1] = new rrc.informationelements.CipheringModeInfo_r7();
	mComponents[2] = new rrc.informationelements.U_RNTI();
	mComponents[3] = new rrc.informationelements.C_RNTI();
	mComponents[4] = new rrc.informationelements.H_RNTI();
	mComponents[5] = new rrc.informationelements.UE_ConnTimersAndConstants_r5();
	mComponents[6] = new rrc.informationelements.CN_InformationInfoFull();
	mComponents[7] = new rrc.informationelements.PLMN_Identity();
	mComponents[8] = new rrc.informationelements.URA_Identity();
	mComponents[9] = new BOOLEAN();
	mComponents[10] = new rrc.informationelements.DL_CounterSynchronisationInfo_r5();
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
		return new rrc.informationelements.IntegrityProtectionModeInfo_r7();
	    case 1:
		return new rrc.informationelements.CipheringModeInfo_r7();
	    case 2:
		return new rrc.informationelements.U_RNTI();
	    case 3:
		return new rrc.informationelements.C_RNTI();
	    case 4:
		return new rrc.informationelements.H_RNTI();
	    case 5:
		return new rrc.informationelements.UE_ConnTimersAndConstants_r5();
	    case 6:
		return new rrc.informationelements.CN_InformationInfoFull();
	    case 7:
		return new rrc.informationelements.PLMN_Identity();
	    case 8:
		return new rrc.informationelements.URA_Identity();
	    case 9:
		return new BOOLEAN();
	    case 10:
		return new rrc.informationelements.DL_CounterSynchronisationInfo_r5();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "integrityProtectionModeInfo"
    public rrc.informationelements.IntegrityProtectionModeInfo_r7 getIntegrityProtectionModeInfo()
    {
	return (rrc.informationelements.IntegrityProtectionModeInfo_r7)mComponents[0];
    }
    
    public void setIntegrityProtectionModeInfo(rrc.informationelements.IntegrityProtectionModeInfo_r7 integrityProtectionModeInfo)
    {
	mComponents[0] = integrityProtectionModeInfo;
    }
    
    public boolean hasIntegrityProtectionModeInfo()
    {
	return componentIsPresent(0);
    }
    
    public void deleteIntegrityProtectionModeInfo()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "cipheringModeInfo"
    public rrc.informationelements.CipheringModeInfo_r7 getCipheringModeInfo()
    {
	return (rrc.informationelements.CipheringModeInfo_r7)mComponents[1];
    }
    
    public void setCipheringModeInfo(rrc.informationelements.CipheringModeInfo_r7 cipheringModeInfo)
    {
	mComponents[1] = cipheringModeInfo;
    }
    
    public boolean hasCipheringModeInfo()
    {
	return componentIsPresent(1);
    }
    
    public void deleteCipheringModeInfo()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "new_U_RNTI"
    public rrc.informationelements.U_RNTI getNew_U_RNTI()
    {
	return (rrc.informationelements.U_RNTI)mComponents[2];
    }
    
    public void setNew_U_RNTI(rrc.informationelements.U_RNTI new_U_RNTI)
    {
	mComponents[2] = new_U_RNTI;
    }
    
    public boolean hasNew_U_RNTI()
    {
	return componentIsPresent(2);
    }
    
    public void deleteNew_U_RNTI()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "new_C_RNTI"
    public rrc.informationelements.C_RNTI getNew_C_RNTI()
    {
	return (rrc.informationelements.C_RNTI)mComponents[3];
    }
    
    public void setNew_C_RNTI(rrc.informationelements.C_RNTI new_C_RNTI)
    {
	mComponents[3] = new_C_RNTI;
    }
    
    public boolean hasNew_C_RNTI()
    {
	return componentIsPresent(3);
    }
    
    public void deleteNew_C_RNTI()
    {
	setComponentAbsent(3);
    }
    
    
    // Methods for field "new_H_RNTI"
    public rrc.informationelements.H_RNTI getNew_H_RNTI()
    {
	return (rrc.informationelements.H_RNTI)mComponents[4];
    }
    
    public void setNew_H_RNTI(rrc.informationelements.H_RNTI new_H_RNTI)
    {
	mComponents[4] = new_H_RNTI;
    }
    
    public boolean hasNew_H_RNTI()
    {
	return componentIsPresent(4);
    }
    
    public void deleteNew_H_RNTI()
    {
	setComponentAbsent(4);
    }
    
    
    // Methods for field "ue_ConnTimersAndConstants"
    public rrc.informationelements.UE_ConnTimersAndConstants_r5 getUe_ConnTimersAndConstants()
    {
	return (rrc.informationelements.UE_ConnTimersAndConstants_r5)mComponents[5];
    }
    
    public void setUe_ConnTimersAndConstants(rrc.informationelements.UE_ConnTimersAndConstants_r5 ue_ConnTimersAndConstants)
    {
	mComponents[5] = ue_ConnTimersAndConstants;
    }
    
    public boolean hasUe_ConnTimersAndConstants()
    {
	return componentIsPresent(5);
    }
    
    public void deleteUe_ConnTimersAndConstants()
    {
	setComponentAbsent(5);
    }
    
    
    // Methods for field "cn_InformationInfo"
    public rrc.informationelements.CN_InformationInfoFull getCn_InformationInfo()
    {
	return (rrc.informationelements.CN_InformationInfoFull)mComponents[6];
    }
    
    public void setCn_InformationInfo(rrc.informationelements.CN_InformationInfoFull cn_InformationInfo)
    {
	mComponents[6] = cn_InformationInfo;
    }
    
    public boolean hasCn_InformationInfo()
    {
	return componentIsPresent(6);
    }
    
    public void deleteCn_InformationInfo()
    {
	setComponentAbsent(6);
    }
    
    
    // Methods for field "primary_plmn_Identity"
    public rrc.informationelements.PLMN_Identity getPrimary_plmn_Identity()
    {
	return (rrc.informationelements.PLMN_Identity)mComponents[7];
    }
    
    public void setPrimary_plmn_Identity(rrc.informationelements.PLMN_Identity primary_plmn_Identity)
    {
	mComponents[7] = primary_plmn_Identity;
    }
    
    public boolean hasPrimary_plmn_Identity()
    {
	return componentIsPresent(7);
    }
    
    public void deletePrimary_plmn_Identity()
    {
	setComponentAbsent(7);
    }
    
    
    // Methods for field "ura_Identity"
    public rrc.informationelements.URA_Identity getUra_Identity()
    {
	return (rrc.informationelements.URA_Identity)mComponents[8];
    }
    
    public void setUra_Identity(rrc.informationelements.URA_Identity ura_Identity)
    {
	mComponents[8] = ura_Identity;
    }
    
    public boolean hasUra_Identity()
    {
	return componentIsPresent(8);
    }
    
    public void deleteUra_Identity()
    {
	setComponentAbsent(8);
    }
    
    
    // Methods for field "supportForChangeOfUE_Capability"
    public boolean getSupportForChangeOfUE_Capability()
    {
	return ((BOOLEAN)mComponents[9]).booleanValue();
    }
    
    public void setSupportForChangeOfUE_Capability(boolean supportForChangeOfUE_Capability)
    {
	setSupportForChangeOfUE_Capability(new BOOLEAN(supportForChangeOfUE_Capability));
    }
    
    public void setSupportForChangeOfUE_Capability(BOOLEAN supportForChangeOfUE_Capability)
    {
	mComponents[9] = supportForChangeOfUE_Capability;
    }
    
    public boolean hasSupportForChangeOfUE_Capability()
    {
	return componentIsPresent(9);
    }
    
    public void deleteSupportForChangeOfUE_Capability()
    {
	setComponentAbsent(9);
    }
    
    
    // Methods for field "dl_CounterSynchronisationInfo"
    public rrc.informationelements.DL_CounterSynchronisationInfo_r5 getDl_CounterSynchronisationInfo()
    {
	return (rrc.informationelements.DL_CounterSynchronisationInfo_r5)mComponents[10];
    }
    
    public void setDl_CounterSynchronisationInfo(rrc.informationelements.DL_CounterSynchronisationInfo_r5 dl_CounterSynchronisationInfo)
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
	    "UTRANMobilityInformation_r7_IEs"
	),
	new QName (
	    "PDU-definitions",
	    "UTRANMobilityInformation-r7-IEs"
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
				"IntegrityProtectionModeInfo_r7"
			    ),
			    new QName (
				"InformationElements",
				"IntegrityProtectionModeInfo-r7"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "IntegrityProtectionModeInfo_r7"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "IntegrityProtectionModeInfo_r7"
				)
			    ),
			    0
			)
		    ),
		    "integrityProtectionModeInfo",
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
				"CipheringModeInfo_r7"
			    ),
			    new QName (
				"InformationElements",
				"CipheringModeInfo-r7"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "CipheringModeInfo_r7"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "CipheringModeInfo_r7"
				)
			    ),
			    0
			)
		    ),
		    "cipheringModeInfo",
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
		    2,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
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
		    3,
		    3,
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
				"H_RNTI"
			    ),
			    new QName (
				"InformationElements",
				"H-RNTI"
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
		    "new-H-RNTI",
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
				"UE_ConnTimersAndConstants_r5"
			    ),
			    new QName (
				"InformationElements",
				"UE-ConnTimersAndConstants-r5"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UE_ConnTimersAndConstants_r5"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "UE_ConnTimersAndConstants_r5"
				)
			    ),
			    0
			)
		    ),
		    "ue-ConnTimersAndConstants",
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
				"CN_InformationInfoFull"
			    ),
			    new QName (
				"InformationElements",
				"CN-InformationInfoFull"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "CN_InformationInfoFull"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "CN_InformationInfoFull"
				)
			    ),
			    0
			)
		    ),
		    "cn-InformationInfo",
		    6,
		    3,
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
				"PLMN_Identity"
			    ),
			    new QName (
				"InformationElements",
				"PLMN-Identity"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "PLMN_Identity"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "PLMN_Identity"
				)
			    ),
			    0
			)
		    ),
		    "primary-plmn-Identity",
		    7,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8008
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
		    8,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8009
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
		    "supportForChangeOfUE-Capability",
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
				"DL_CounterSynchronisationInfo_r5"
			    ),
			    new QName (
				"InformationElements",
				"DL-CounterSynchronisationInfo-r5"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "DL_CounterSynchronisationInfo_r5"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "DL_CounterSynchronisationInfo_r5"
				)
			    ),
			    0
			)
		    ),
		    "dl-CounterSynchronisationInfo",
		    10,
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
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6),
			new TagDecoderElement((short)0x8007, 7),
			new TagDecoderElement((short)0x8008, 8),
			new TagDecoderElement((short)0x8009, 9),
			new TagDecoderElement((short)0x800a, 10)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6),
			new TagDecoderElement((short)0x8007, 7),
			new TagDecoderElement((short)0x8008, 8),
			new TagDecoderElement((short)0x8009, 9),
			new TagDecoderElement((short)0x800a, 10)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6),
			new TagDecoderElement((short)0x8007, 7),
			new TagDecoderElement((short)0x8008, 8),
			new TagDecoderElement((short)0x8009, 9),
			new TagDecoderElement((short)0x800a, 10)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6),
			new TagDecoderElement((short)0x8007, 7),
			new TagDecoderElement((short)0x8008, 8),
			new TagDecoderElement((short)0x8009, 9),
			new TagDecoderElement((short)0x800a, 10)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6),
			new TagDecoderElement((short)0x8007, 7),
			new TagDecoderElement((short)0x8008, 8),
			new TagDecoderElement((short)0x8009, 9),
			new TagDecoderElement((short)0x800a, 10)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6),
			new TagDecoderElement((short)0x8007, 7),
			new TagDecoderElement((short)0x8008, 8),
			new TagDecoderElement((short)0x8009, 9),
			new TagDecoderElement((short)0x800a, 10)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8006, 6),
			new TagDecoderElement((short)0x8007, 7),
			new TagDecoderElement((short)0x8008, 8),
			new TagDecoderElement((short)0x8009, 9),
			new TagDecoderElement((short)0x800a, 10)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8007, 7),
			new TagDecoderElement((short)0x8008, 8),
			new TagDecoderElement((short)0x8009, 9),
			new TagDecoderElement((short)0x800a, 10)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8008, 8),
			new TagDecoderElement((short)0x8009, 9),
			new TagDecoderElement((short)0x800a, 10)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8009, 9),
			new TagDecoderElement((short)0x800a, 10)
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
     * Get the type descriptor (TypeInfo) of 'this' UTRANMobilityInformation_r7_IEs object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UTRANMobilityInformation_r7_IEs object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UTRANMobilityInformation_r7_IEs
