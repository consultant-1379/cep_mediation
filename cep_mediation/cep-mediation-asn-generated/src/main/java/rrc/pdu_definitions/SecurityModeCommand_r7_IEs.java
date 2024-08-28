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
 * Define the ASN1 Type SecurityModeCommand_r7_IEs from ASN1 Module PDU_definitions.
 * @see Sequence
 */

public class SecurityModeCommand_r7_IEs extends Sequence {
    
    /**
     * The default constructor.
     */
    public SecurityModeCommand_r7_IEs()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public SecurityModeCommand_r7_IEs(rrc.informationelements.SecurityCapability securityCapability, 
		    rrc.informationelements.CipheringModeInfo_r7 cipheringModeInfo, 
		    rrc.informationelements.IntegrityProtectionModeInfo_r7 integrityProtectionModeInfo, 
		    rrc.informationelements.CN_DomainIdentity cn_DomainIdentity, 
		    rrc.informationelements.InterRAT_UE_SecurityCapList ue_SystemSpecificSecurityCap)
    {
	setSecurityCapability(securityCapability);
	setCipheringModeInfo(cipheringModeInfo);
	setIntegrityProtectionModeInfo(integrityProtectionModeInfo);
	setCn_DomainIdentity(cn_DomainIdentity);
	setUe_SystemSpecificSecurityCap(ue_SystemSpecificSecurityCap);
    }
    
    /**
     * Construct with required components.
     */
    public SecurityModeCommand_r7_IEs(rrc.informationelements.SecurityCapability securityCapability, 
		    rrc.informationelements.CN_DomainIdentity cn_DomainIdentity)
    {
	setSecurityCapability(securityCapability);
	setCn_DomainIdentity(cn_DomainIdentity);
    }
    
    public void initComponents()
    {
	mComponents[0] = new rrc.informationelements.SecurityCapability();
	mComponents[1] = new rrc.informationelements.CipheringModeInfo_r7();
	mComponents[2] = new rrc.informationelements.IntegrityProtectionModeInfo_r7();
	mComponents[3] = rrc.informationelements.CN_DomainIdentity.cs_domain;
	mComponents[4] = new rrc.informationelements.InterRAT_UE_SecurityCapList();
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
		return new rrc.informationelements.SecurityCapability();
	    case 1:
		return new rrc.informationelements.CipheringModeInfo_r7();
	    case 2:
		return new rrc.informationelements.IntegrityProtectionModeInfo_r7();
	    case 3:
		return rrc.informationelements.CN_DomainIdentity.cs_domain;
	    case 4:
		return new rrc.informationelements.InterRAT_UE_SecurityCapList();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "securityCapability"
    public rrc.informationelements.SecurityCapability getSecurityCapability()
    {
	return (rrc.informationelements.SecurityCapability)mComponents[0];
    }
    
    public void setSecurityCapability(rrc.informationelements.SecurityCapability securityCapability)
    {
	mComponents[0] = securityCapability;
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
    
    
    // Methods for field "integrityProtectionModeInfo"
    public rrc.informationelements.IntegrityProtectionModeInfo_r7 getIntegrityProtectionModeInfo()
    {
	return (rrc.informationelements.IntegrityProtectionModeInfo_r7)mComponents[2];
    }
    
    public void setIntegrityProtectionModeInfo(rrc.informationelements.IntegrityProtectionModeInfo_r7 integrityProtectionModeInfo)
    {
	mComponents[2] = integrityProtectionModeInfo;
    }
    
    public boolean hasIntegrityProtectionModeInfo()
    {
	return componentIsPresent(2);
    }
    
    public void deleteIntegrityProtectionModeInfo()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "cn_DomainIdentity"
    public rrc.informationelements.CN_DomainIdentity getCn_DomainIdentity()
    {
	return (rrc.informationelements.CN_DomainIdentity)mComponents[3];
    }
    
    public void setCn_DomainIdentity(rrc.informationelements.CN_DomainIdentity cn_DomainIdentity)
    {
	mComponents[3] = cn_DomainIdentity;
    }
    
    
    // Methods for field "ue_SystemSpecificSecurityCap"
    public rrc.informationelements.InterRAT_UE_SecurityCapList getUe_SystemSpecificSecurityCap()
    {
	return (rrc.informationelements.InterRAT_UE_SecurityCapList)mComponents[4];
    }
    
    public void setUe_SystemSpecificSecurityCap(rrc.informationelements.InterRAT_UE_SecurityCapList ue_SystemSpecificSecurityCap)
    {
	mComponents[4] = ue_SystemSpecificSecurityCap;
    }
    
    public boolean hasUe_SystemSpecificSecurityCap()
    {
	return componentIsPresent(4);
    }
    
    public void deleteUe_SystemSpecificSecurityCap()
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
	    "rrc.pdu_definitions",
	    "SecurityModeCommand_r7_IEs"
	),
	new QName (
	    "PDU-definitions",
	    "SecurityModeCommand-r7-IEs"
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
				"SecurityCapability"
			    ),
			    new QName (
				"InformationElements",
				"SecurityCapability"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "SecurityCapability"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "SecurityCapability"
				)
			    ),
			    0
			)
		    ),
		    "securityCapability",
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
				"CN_DomainIdentity"
			    ),
			    new QName (
				"InformationElements",
				"CN-DomainIdentity"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"cs-domain",
					0
				    ),
				    new MemberListElement (
					"ps-domain",
					1
				    )
				}
			    ),
			    0,
			    rrc.informationelements.CN_DomainIdentity.cs_domain
			)
		    ),
		    "cn-DomainIdentity",
		    3,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8004
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"InterRAT_UE_SecurityCapList"
			    ),
			    new QName (
				"InformationElements",
				"InterRAT-UE-SecurityCapList"
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
				    "rrc.informationelements",
				    "InterRAT_UE_SecurityCapability"
				)
			    )
			)
		    ),
		    "ue-SystemSpecificSecurityCap",
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
			new TagDecoderElement((short)0x8000, 0)
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
     * Get the type descriptor (TypeInfo) of 'this' SecurityModeCommand_r7_IEs object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' SecurityModeCommand_r7_IEs object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for SecurityModeCommand_r7_IEs
