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
 * Define the ASN1 Type RAB_InformationReconfig_r8 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class RAB_InformationReconfig_r8 extends Sequence {
    
    /**
     * The default constructor.
     */
    public RAB_InformationReconfig_r8()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public RAB_InformationReconfig_r8(RAB_Identity rab_Identity, 
		    CN_DomainIdentity cn_DomainIdentity, 
		    NAS_Synchronisation_Indicator nas_Synchronisation_Indicator, 
		    CS_HSPA_Information cs_HSPA_Information)
    {
	setRab_Identity(rab_Identity);
	setCn_DomainIdentity(cn_DomainIdentity);
	setNas_Synchronisation_Indicator(nas_Synchronisation_Indicator);
	setCs_HSPA_Information(cs_HSPA_Information);
    }
    
    /**
     * Construct with required components.
     */
    public RAB_InformationReconfig_r8(RAB_Identity rab_Identity, 
		    CN_DomainIdentity cn_DomainIdentity, 
		    NAS_Synchronisation_Indicator nas_Synchronisation_Indicator)
    {
	setRab_Identity(rab_Identity);
	setCn_DomainIdentity(cn_DomainIdentity);
	setNas_Synchronisation_Indicator(nas_Synchronisation_Indicator);
    }
    
    public void initComponents()
    {
	mComponents[0] = new RAB_Identity();
	mComponents[1] = CN_DomainIdentity.cs_domain;
	mComponents[2] = new NAS_Synchronisation_Indicator();
	mComponents[3] = new CS_HSPA_Information();
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
		return new RAB_Identity();
	    case 1:
		return CN_DomainIdentity.cs_domain;
	    case 2:
		return new NAS_Synchronisation_Indicator();
	    case 3:
		return new CS_HSPA_Information();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "rab_Identity"
    public RAB_Identity getRab_Identity()
    {
	return (RAB_Identity)mComponents[0];
    }
    
    public void setRab_Identity(RAB_Identity rab_Identity)
    {
	mComponents[0] = rab_Identity;
    }
    
    
    // Methods for field "cn_DomainIdentity"
    public CN_DomainIdentity getCn_DomainIdentity()
    {
	return (CN_DomainIdentity)mComponents[1];
    }
    
    public void setCn_DomainIdentity(CN_DomainIdentity cn_DomainIdentity)
    {
	mComponents[1] = cn_DomainIdentity;
    }
    
    
    // Methods for field "nas_Synchronisation_Indicator"
    public NAS_Synchronisation_Indicator getNas_Synchronisation_Indicator()
    {
	return (NAS_Synchronisation_Indicator)mComponents[2];
    }
    
    public void setNas_Synchronisation_Indicator(NAS_Synchronisation_Indicator nas_Synchronisation_Indicator)
    {
	mComponents[2] = nas_Synchronisation_Indicator;
    }
    
    
    // Methods for field "cs_HSPA_Information"
    public CS_HSPA_Information getCs_HSPA_Information()
    {
	return (CS_HSPA_Information)mComponents[3];
    }
    
    public void setCs_HSPA_Information(CS_HSPA_Information cs_HSPA_Information)
    {
	mComponents[3] = cs_HSPA_Information;
    }
    
    public boolean hasCs_HSPA_Information()
    {
	return componentIsPresent(3);
    }
    
    public void deleteCs_HSPA_Information()
    {
	setComponentAbsent(3);
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
	    "RAB_InformationReconfig_r8"
	),
	new QName (
	    "InformationElements",
	    "RAB-InformationReconfig-r8"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"RAB_Identity"
			    ),
			    new QName (
				"InformationElements",
				"RAB-Identity"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "RAB_Identity"
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
		    "rab-Identity",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
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
			    CN_DomainIdentity.cs_domain
			)
		    ),
		    "cn-DomainIdentity",
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
				"NAS_Synchronisation_Indicator"
			    ),
			    new QName (
				"InformationElements",
				"NAS-Synchronisation-Indicator"
			    ),
			    12314,
			    new SizeConstraint (
				new SingleValueConstraint (
				    new com.oss.asn1.INTEGER(4)
				)
			    ),
			    new Bounds (
				new java.lang.Long(4),
				new java.lang.Long(4)
			    ),
			    null
			)
		    ),
		    "nas-Synchronisation-Indicator",
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
				"CS_HSPA_Information"
			    ),
			    new QName (
				"InformationElements",
				"CS-HSPA-Information"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "CS_HSPA_Information"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "CS_HSPA_Information"
				)
			    ),
			    0
			)
		    ),
		    "cs-HSPA-Information",
		    3,
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
     * Get the type descriptor (TypeInfo) of 'this' RAB_InformationReconfig_r8 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' RAB_InformationReconfig_r8 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for RAB_InformationReconfig_r8
