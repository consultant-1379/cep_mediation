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


package rrc.internode_definitions;

import com.oss.asn1.*;
import com.oss.metadata.*;
import rrc.*;

/**
 * Define the ASN1 Type SRNC_RelocationInfo_v390ext_IEs from ASN1 Module Internode_definitions.
 * @see Sequence
 */

public class SRNC_RelocationInfo_v390ext_IEs extends Sequence {
    
    /**
     * The default constructor.
     */
    public SRNC_RelocationInfo_v390ext_IEs()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public SRNC_RelocationInfo_v390ext_IEs(CN_DomainInformationList_v390ext cn_DomainInformationList_v390ext, 
		    rrc.informationelements.UE_RadioAccessCapability_v370ext ue_RadioAccessCapability_v370ext, 
		    rrc.informationelements.UE_RadioAccessCapability_v380ext ue_RadioAccessCapability_v380ext, 
		    rrc.informationelements.DL_PhysChCapabilityFDD_v380ext dl_PhysChCapabilityFDD_v380ext, 
		    rrc.informationelements.FailureCauseWithProtErr failureCauseWithProtErr)
    {
	setCn_DomainInformationList_v390ext(cn_DomainInformationList_v390ext);
	setUe_RadioAccessCapability_v370ext(ue_RadioAccessCapability_v370ext);
	setUe_RadioAccessCapability_v380ext(ue_RadioAccessCapability_v380ext);
	setDl_PhysChCapabilityFDD_v380ext(dl_PhysChCapabilityFDD_v380ext);
	setFailureCauseWithProtErr(failureCauseWithProtErr);
    }
    
    /**
     * Construct with required components.
     */
    public SRNC_RelocationInfo_v390ext_IEs(rrc.informationelements.DL_PhysChCapabilityFDD_v380ext dl_PhysChCapabilityFDD_v380ext)
    {
	setDl_PhysChCapabilityFDD_v380ext(dl_PhysChCapabilityFDD_v380ext);
    }
    
    public void initComponents()
    {
	mComponents[0] = new CN_DomainInformationList_v390ext();
	mComponents[1] = new rrc.informationelements.UE_RadioAccessCapability_v370ext();
	mComponents[2] = new rrc.informationelements.UE_RadioAccessCapability_v380ext();
	mComponents[3] = new rrc.informationelements.DL_PhysChCapabilityFDD_v380ext();
	mComponents[4] = new rrc.informationelements.FailureCauseWithProtErr();
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
		return new CN_DomainInformationList_v390ext();
	    case 1:
		return new rrc.informationelements.UE_RadioAccessCapability_v370ext();
	    case 2:
		return new rrc.informationelements.UE_RadioAccessCapability_v380ext();
	    case 3:
		return new rrc.informationelements.DL_PhysChCapabilityFDD_v380ext();
	    case 4:
		return new rrc.informationelements.FailureCauseWithProtErr();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "cn_DomainInformationList_v390ext"
    public CN_DomainInformationList_v390ext getCn_DomainInformationList_v390ext()
    {
	return (CN_DomainInformationList_v390ext)mComponents[0];
    }
    
    public void setCn_DomainInformationList_v390ext(CN_DomainInformationList_v390ext cn_DomainInformationList_v390ext)
    {
	mComponents[0] = cn_DomainInformationList_v390ext;
    }
    
    public boolean hasCn_DomainInformationList_v390ext()
    {
	return componentIsPresent(0);
    }
    
    public void deleteCn_DomainInformationList_v390ext()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "ue_RadioAccessCapability_v370ext"
    public rrc.informationelements.UE_RadioAccessCapability_v370ext getUe_RadioAccessCapability_v370ext()
    {
	return (rrc.informationelements.UE_RadioAccessCapability_v370ext)mComponents[1];
    }
    
    public void setUe_RadioAccessCapability_v370ext(rrc.informationelements.UE_RadioAccessCapability_v370ext ue_RadioAccessCapability_v370ext)
    {
	mComponents[1] = ue_RadioAccessCapability_v370ext;
    }
    
    public boolean hasUe_RadioAccessCapability_v370ext()
    {
	return componentIsPresent(1);
    }
    
    public void deleteUe_RadioAccessCapability_v370ext()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "ue_RadioAccessCapability_v380ext"
    public rrc.informationelements.UE_RadioAccessCapability_v380ext getUe_RadioAccessCapability_v380ext()
    {
	return (rrc.informationelements.UE_RadioAccessCapability_v380ext)mComponents[2];
    }
    
    public void setUe_RadioAccessCapability_v380ext(rrc.informationelements.UE_RadioAccessCapability_v380ext ue_RadioAccessCapability_v380ext)
    {
	mComponents[2] = ue_RadioAccessCapability_v380ext;
    }
    
    public boolean hasUe_RadioAccessCapability_v380ext()
    {
	return componentIsPresent(2);
    }
    
    public void deleteUe_RadioAccessCapability_v380ext()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "dl_PhysChCapabilityFDD_v380ext"
    public rrc.informationelements.DL_PhysChCapabilityFDD_v380ext getDl_PhysChCapabilityFDD_v380ext()
    {
	return (rrc.informationelements.DL_PhysChCapabilityFDD_v380ext)mComponents[3];
    }
    
    public void setDl_PhysChCapabilityFDD_v380ext(rrc.informationelements.DL_PhysChCapabilityFDD_v380ext dl_PhysChCapabilityFDD_v380ext)
    {
	mComponents[3] = dl_PhysChCapabilityFDD_v380ext;
    }
    
    
    // Methods for field "failureCauseWithProtErr"
    public rrc.informationelements.FailureCauseWithProtErr getFailureCauseWithProtErr()
    {
	return (rrc.informationelements.FailureCauseWithProtErr)mComponents[4];
    }
    
    public void setFailureCauseWithProtErr(rrc.informationelements.FailureCauseWithProtErr failureCauseWithProtErr)
    {
	mComponents[4] = failureCauseWithProtErr;
    }
    
    public boolean hasFailureCauseWithProtErr()
    {
	return componentIsPresent(4);
    }
    
    public void deleteFailureCauseWithProtErr()
    {
	setComponentAbsent(4);
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
	    "rrc.internode_definitions",
	    "SRNC_RelocationInfo_v390ext_IEs"
	),
	new QName (
	    "Internode-definitions",
	    "SRNC-RelocationInfo-v390ext-IEs"
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
				"rrc.internode_definitions",
				"CN_DomainInformationList_v390ext"
			    ),
			    new QName (
				"Internode-definitions",
				"CN-DomainInformationList-v390ext"
			    ),
			    12314,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new com.oss.asn1.INTEGER(1), 
					new com.oss.asn1.INTEGER(4),
					0
				    )
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(4)
			    ),
			    new TypeInfoRef (
				new QName (
				    "rrc.internode_definitions",
				    "CN_DomainInformation_v390ext"
				)
			    )
			)
		    ),
		    "cn-DomainInformationList-v390ext",
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
				"UE_RadioAccessCapability_v370ext"
			    ),
			    new QName (
				"InformationElements",
				"UE-RadioAccessCapability-v370ext"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UE_RadioAccessCapability_v370ext"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "UE_RadioAccessCapability_v370ext"
				)
			    ),
			    0
			)
		    ),
		    "ue-RadioAccessCapability-v370ext",
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
				"UE_RadioAccessCapability_v380ext"
			    ),
			    new QName (
				"InformationElements",
				"UE-RadioAccessCapability-v380ext"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UE_RadioAccessCapability_v380ext"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "UE_RadioAccessCapability_v380ext"
				)
			    ),
			    0
			)
		    ),
		    "ue-RadioAccessCapability-v380ext",
		    2,
		    3,
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
				"DL_PhysChCapabilityFDD_v380ext"
			    ),
			    new QName (
				"InformationElements",
				"DL-PhysChCapabilityFDD-v380ext"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "DL_PhysChCapabilityFDD_v380ext"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "DL_PhysChCapabilityFDD_v380ext"
				)
			    ),
			    0
			)
		    ),
		    "dl-PhysChCapabilityFDD-v380ext",
		    3,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x8004
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"FailureCauseWithProtErr"
			    ),
			    new QName (
				"InformationElements",
				"FailureCauseWithProtErr"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "FailureCauseWithProtErr"
				)
			    ),
			    0,
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
				    new TagDecoderElement((short)0x800a, 10),
				    new TagDecoderElement((short)0x800b, 11),
				    new TagDecoderElement((short)0x800c, 12),
				    new TagDecoderElement((short)0x800d, 13),
				    new TagDecoderElement((short)0x800e, 14),
				    new TagDecoderElement((short)0x800f, 15)
				}
			    )
			)
		    ),
		    "failureCauseWithProtErr",
		    4,
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
			new TagDecoderElement((short)0x8003, 3)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3)
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
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' SRNC_RelocationInfo_v390ext_IEs object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' SRNC_RelocationInfo_v390ext_IEs object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for SRNC_RelocationInfo_v390ext_IEs
