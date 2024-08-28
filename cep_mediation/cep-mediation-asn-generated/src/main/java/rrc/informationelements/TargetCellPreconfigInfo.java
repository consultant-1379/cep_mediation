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
 * Define the ASN1 Type TargetCellPreconfigInfo from ASN1 Module InformationElements.
 * @see Sequence
 */

public class TargetCellPreconfigInfo extends Sequence {
    
    /**
     * The default constructor.
     */
    public TargetCellPreconfigInfo()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public TargetCellPreconfigInfo(ActivationTimeOffset activationTimeOffset, 
		    H_RNTI new_H_RNTI, E_RNTI newPrimary_E_RNTI, 
		    E_RNTI newSecondary_E_RNTI, 
		    Serving_HSDSCH_CellInformation_r8 serving_HSDSCH_CellInformation, 
		    E_DCH_ReconfigurationInfo_r7 e_dch_ReconfigurationInfo, 
		    DTX_DRX_TimingInfo_r7 dtx_drx_TimingInfo, 
		    DTX_DRX_Info_r7 dtx_drx_Info, 
		    HS_SCCH_LessInfo_r7 hs_scch_LessInfo, 
		    MIMO_Parameters_r8 mimoParameters, 
		    DL_SecondaryCellInfoFDD dl_SecondaryCellInfoFDD)
    {
	setActivationTimeOffset(activationTimeOffset);
	setNew_H_RNTI(new_H_RNTI);
	setNewPrimary_E_RNTI(newPrimary_E_RNTI);
	setNewSecondary_E_RNTI(newSecondary_E_RNTI);
	setServing_HSDSCH_CellInformation(serving_HSDSCH_CellInformation);
	setE_dch_ReconfigurationInfo(e_dch_ReconfigurationInfo);
	setDtx_drx_TimingInfo(dtx_drx_TimingInfo);
	setDtx_drx_Info(dtx_drx_Info);
	setHs_scch_LessInfo(hs_scch_LessInfo);
	setMimoParameters(mimoParameters);
	setDl_SecondaryCellInfoFDD(dl_SecondaryCellInfoFDD);
    }
    
    /**
     * Construct with required components.
     */
    public TargetCellPreconfigInfo(H_RNTI new_H_RNTI, 
		    Serving_HSDSCH_CellInformation_r8 serving_HSDSCH_CellInformation, 
		    E_DCH_ReconfigurationInfo_r7 e_dch_ReconfigurationInfo)
    {
	setNew_H_RNTI(new_H_RNTI);
	setServing_HSDSCH_CellInformation(serving_HSDSCH_CellInformation);
	setE_dch_ReconfigurationInfo(e_dch_ReconfigurationInfo);
    }
    
    public void initComponents()
    {
	mComponents[0] = new ActivationTimeOffset();
	mComponents[1] = new H_RNTI();
	mComponents[2] = new E_RNTI();
	mComponents[3] = new E_RNTI();
	mComponents[4] = new Serving_HSDSCH_CellInformation_r8();
	mComponents[5] = new E_DCH_ReconfigurationInfo_r7();
	mComponents[6] = new DTX_DRX_TimingInfo_r7();
	mComponents[7] = new DTX_DRX_Info_r7();
	mComponents[8] = new HS_SCCH_LessInfo_r7();
	mComponents[9] = new MIMO_Parameters_r8();
	mComponents[10] = new DL_SecondaryCellInfoFDD();
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
		return new ActivationTimeOffset();
	    case 1:
		return new H_RNTI();
	    case 2:
		return new E_RNTI();
	    case 3:
		return new E_RNTI();
	    case 4:
		return new Serving_HSDSCH_CellInformation_r8();
	    case 5:
		return new E_DCH_ReconfigurationInfo_r7();
	    case 6:
		return new DTX_DRX_TimingInfo_r7();
	    case 7:
		return new DTX_DRX_Info_r7();
	    case 8:
		return new HS_SCCH_LessInfo_r7();
	    case 9:
		return new MIMO_Parameters_r8();
	    case 10:
		return new DL_SecondaryCellInfoFDD();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "activationTimeOffset"
    public ActivationTimeOffset getActivationTimeOffset()
    {
	return (ActivationTimeOffset)mComponents[0];
    }
    
    public void setActivationTimeOffset(ActivationTimeOffset activationTimeOffset)
    {
	mComponents[0] = activationTimeOffset;
    }
    
    public boolean hasActivationTimeOffset()
    {
	return componentIsPresent(0);
    }
    
    public void deleteActivationTimeOffset()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "new_H_RNTI"
    public H_RNTI getNew_H_RNTI()
    {
	return (H_RNTI)mComponents[1];
    }
    
    public void setNew_H_RNTI(H_RNTI new_H_RNTI)
    {
	mComponents[1] = new_H_RNTI;
    }
    
    
    // Methods for field "newPrimary_E_RNTI"
    public E_RNTI getNewPrimary_E_RNTI()
    {
	return (E_RNTI)mComponents[2];
    }
    
    public void setNewPrimary_E_RNTI(E_RNTI newPrimary_E_RNTI)
    {
	mComponents[2] = newPrimary_E_RNTI;
    }
    
    public boolean hasNewPrimary_E_RNTI()
    {
	return componentIsPresent(2);
    }
    
    public void deleteNewPrimary_E_RNTI()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "newSecondary_E_RNTI"
    public E_RNTI getNewSecondary_E_RNTI()
    {
	return (E_RNTI)mComponents[3];
    }
    
    public void setNewSecondary_E_RNTI(E_RNTI newSecondary_E_RNTI)
    {
	mComponents[3] = newSecondary_E_RNTI;
    }
    
    public boolean hasNewSecondary_E_RNTI()
    {
	return componentIsPresent(3);
    }
    
    public void deleteNewSecondary_E_RNTI()
    {
	setComponentAbsent(3);
    }
    
    
    // Methods for field "serving_HSDSCH_CellInformation"
    public Serving_HSDSCH_CellInformation_r8 getServing_HSDSCH_CellInformation()
    {
	return (Serving_HSDSCH_CellInformation_r8)mComponents[4];
    }
    
    public void setServing_HSDSCH_CellInformation(Serving_HSDSCH_CellInformation_r8 serving_HSDSCH_CellInformation)
    {
	mComponents[4] = serving_HSDSCH_CellInformation;
    }
    
    
    // Methods for field "e_dch_ReconfigurationInfo"
    public E_DCH_ReconfigurationInfo_r7 getE_dch_ReconfigurationInfo()
    {
	return (E_DCH_ReconfigurationInfo_r7)mComponents[5];
    }
    
    public void setE_dch_ReconfigurationInfo(E_DCH_ReconfigurationInfo_r7 e_dch_ReconfigurationInfo)
    {
	mComponents[5] = e_dch_ReconfigurationInfo;
    }
    
    
    // Methods for field "dtx_drx_TimingInfo"
    public DTX_DRX_TimingInfo_r7 getDtx_drx_TimingInfo()
    {
	return (DTX_DRX_TimingInfo_r7)mComponents[6];
    }
    
    public void setDtx_drx_TimingInfo(DTX_DRX_TimingInfo_r7 dtx_drx_TimingInfo)
    {
	mComponents[6] = dtx_drx_TimingInfo;
    }
    
    public boolean hasDtx_drx_TimingInfo()
    {
	return componentIsPresent(6);
    }
    
    public void deleteDtx_drx_TimingInfo()
    {
	setComponentAbsent(6);
    }
    
    
    // Methods for field "dtx_drx_Info"
    public DTX_DRX_Info_r7 getDtx_drx_Info()
    {
	return (DTX_DRX_Info_r7)mComponents[7];
    }
    
    public void setDtx_drx_Info(DTX_DRX_Info_r7 dtx_drx_Info)
    {
	mComponents[7] = dtx_drx_Info;
    }
    
    public boolean hasDtx_drx_Info()
    {
	return componentIsPresent(7);
    }
    
    public void deleteDtx_drx_Info()
    {
	setComponentAbsent(7);
    }
    
    
    // Methods for field "hs_scch_LessInfo"
    public HS_SCCH_LessInfo_r7 getHs_scch_LessInfo()
    {
	return (HS_SCCH_LessInfo_r7)mComponents[8];
    }
    
    public void setHs_scch_LessInfo(HS_SCCH_LessInfo_r7 hs_scch_LessInfo)
    {
	mComponents[8] = hs_scch_LessInfo;
    }
    
    public boolean hasHs_scch_LessInfo()
    {
	return componentIsPresent(8);
    }
    
    public void deleteHs_scch_LessInfo()
    {
	setComponentAbsent(8);
    }
    
    
    // Methods for field "mimoParameters"
    public MIMO_Parameters_r8 getMimoParameters()
    {
	return (MIMO_Parameters_r8)mComponents[9];
    }
    
    public void setMimoParameters(MIMO_Parameters_r8 mimoParameters)
    {
	mComponents[9] = mimoParameters;
    }
    
    public boolean hasMimoParameters()
    {
	return componentIsPresent(9);
    }
    
    public void deleteMimoParameters()
    {
	setComponentAbsent(9);
    }
    
    
    // Methods for field "dl_SecondaryCellInfoFDD"
    public DL_SecondaryCellInfoFDD getDl_SecondaryCellInfoFDD()
    {
	return (DL_SecondaryCellInfoFDD)mComponents[10];
    }
    
    public void setDl_SecondaryCellInfoFDD(DL_SecondaryCellInfoFDD dl_SecondaryCellInfoFDD)
    {
	mComponents[10] = dl_SecondaryCellInfoFDD;
    }
    
    public boolean hasDl_SecondaryCellInfoFDD()
    {
	return componentIsPresent(10);
    }
    
    public void deleteDl_SecondaryCellInfoFDD()
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
	    "rrc.informationelements",
	    "TargetCellPreconfigInfo"
	),
	new QName (
	    "InformationElements",
	    "TargetCellPreconfigInfo"
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
				"ActivationTimeOffset"
			    ),
			    new QName (
				"InformationElements",
				"ActivationTimeOffset"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new ActivationTimeOffset(0), 
				    new ActivationTimeOffset(255),
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
		    "activationTimeOffset",
		    0,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
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
				"E_RNTI"
			    ),
			    new QName (
				"InformationElements",
				"E-RNTI"
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
		    "newPrimary-E-RNTI",
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
				"E_RNTI"
			    ),
			    new QName (
				"InformationElements",
				"E-RNTI"
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
		    "newSecondary-E-RNTI",
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
				"Serving_HSDSCH_CellInformation_r8"
			    ),
			    new QName (
				"InformationElements",
				"Serving-HSDSCH-CellInformation-r8"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "Serving_HSDSCH_CellInformation_r8"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "Serving_HSDSCH_CellInformation_r8"
				)
			    ),
			    0
			)
		    ),
		    "serving-HSDSCH-CellInformation",
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
				"E_DCH_ReconfigurationInfo_r7"
			    ),
			    new QName (
				"InformationElements",
				"E-DCH-ReconfigurationInfo-r7"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "E_DCH_ReconfigurationInfo_r7"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "E_DCH_ReconfigurationInfo_r7"
				)
			    ),
			    0
			)
		    ),
		    "e-dch-ReconfigurationInfo",
		    5,
		    2,
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
				"DTX_DRX_TimingInfo_r7"
			    ),
			    new QName (
				"InformationElements",
				"DTX-DRX-TimingInfo-r7"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "DTX_DRX_TimingInfo_r7"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "DTX_DRX_TimingInfo_r7"
				)
			    ),
			    0
			)
		    ),
		    "dtx-drx-TimingInfo",
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
				"DTX_DRX_Info_r7"
			    ),
			    new QName (
				"InformationElements",
				"DTX-DRX-Info-r7"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "DTX_DRX_Info_r7"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "DTX_DRX_Info_r7"
				)
			    ),
			    0
			)
		    ),
		    "dtx-drx-Info",
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
				"HS_SCCH_LessInfo_r7"
			    ),
			    new QName (
				"InformationElements",
				"HS-SCCH-LessInfo-r7"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "HS_SCCH_LessInfo_r7"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "HS_SCCH_LessInfo_r7"
				)
			    ),
			    0
			)
		    ),
		    "hs-scch-LessInfo",
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
				"MIMO_Parameters_r8"
			    ),
			    new QName (
				"InformationElements",
				"MIMO-Parameters-r8"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "MIMO_Parameters_r8"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "MIMO_Parameters_r8"
				)
			    ),
			    0
			)
		    ),
		    "mimoParameters",
		    9,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x800a
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"DL_SecondaryCellInfoFDD"
			    ),
			    new QName (
				"InformationElements",
				"DL-SecondaryCellInfoFDD"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "DL_SecondaryCellInfoFDD"
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
		    "dl-SecondaryCellInfoFDD",
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
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4)
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
			new TagDecoderElement((short)0x8005, 5)
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
     * Get the type descriptor (TypeInfo) of 'this' TargetCellPreconfigInfo object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' TargetCellPreconfigInfo object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for TargetCellPreconfigInfo
