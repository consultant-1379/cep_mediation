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
 * Define the ASN1 Type RAB_Info_r6 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class RAB_Info_r6 extends Sequence {
    
    /**
     * The default constructor.
     */
    public RAB_Info_r6()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public RAB_Info_r6(RAB_Identity rab_Identity, 
		    MBMS_SessionIdentity mbms_SessionIdentity, 
		    CN_DomainIdentity cn_DomainIdentity, 
		    NAS_Synchronisation_Indicator nas_Synchronisation_Indicator, 
		    Re_EstablishmentTimer re_EstablishmentTimer)
    {
	setRab_Identity(rab_Identity);
	setMbms_SessionIdentity(mbms_SessionIdentity);
	setCn_DomainIdentity(cn_DomainIdentity);
	setNas_Synchronisation_Indicator(nas_Synchronisation_Indicator);
	setRe_EstablishmentTimer(re_EstablishmentTimer);
    }
    
    /**
     * Construct with required components.
     */
    public RAB_Info_r6(RAB_Identity rab_Identity, 
		    CN_DomainIdentity cn_DomainIdentity, 
		    Re_EstablishmentTimer re_EstablishmentTimer)
    {
	setRab_Identity(rab_Identity);
	setCn_DomainIdentity(cn_DomainIdentity);
	setRe_EstablishmentTimer(re_EstablishmentTimer);
    }
    
    public void initComponents()
    {
	mComponents[0] = new RAB_Identity();
	mComponents[1] = new MBMS_SessionIdentity();
	mComponents[2] = CN_DomainIdentity.cs_domain;
	mComponents[3] = new NAS_Synchronisation_Indicator();
	mComponents[4] = Re_EstablishmentTimer.useT314;
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
		return new RAB_Identity();
	    case 1:
		return new MBMS_SessionIdentity();
	    case 2:
		return CN_DomainIdentity.cs_domain;
	    case 3:
		return new NAS_Synchronisation_Indicator();
	    case 4:
		return Re_EstablishmentTimer.useT314;
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
    
    
    // Methods for field "mbms_SessionIdentity"
    public MBMS_SessionIdentity getMbms_SessionIdentity()
    {
	return (MBMS_SessionIdentity)mComponents[1];
    }
    
    public void setMbms_SessionIdentity(MBMS_SessionIdentity mbms_SessionIdentity)
    {
	mComponents[1] = mbms_SessionIdentity;
    }
    
    public boolean hasMbms_SessionIdentity()
    {
	return componentIsPresent(1);
    }
    
    public void deleteMbms_SessionIdentity()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "cn_DomainIdentity"
    public CN_DomainIdentity getCn_DomainIdentity()
    {
	return (CN_DomainIdentity)mComponents[2];
    }
    
    public void setCn_DomainIdentity(CN_DomainIdentity cn_DomainIdentity)
    {
	mComponents[2] = cn_DomainIdentity;
    }
    
    
    // Methods for field "nas_Synchronisation_Indicator"
    public NAS_Synchronisation_Indicator getNas_Synchronisation_Indicator()
    {
	return (NAS_Synchronisation_Indicator)mComponents[3];
    }
    
    public void setNas_Synchronisation_Indicator(NAS_Synchronisation_Indicator nas_Synchronisation_Indicator)
    {
	mComponents[3] = nas_Synchronisation_Indicator;
    }
    
    public boolean hasNas_Synchronisation_Indicator()
    {
	return componentIsPresent(3);
    }
    
    public void deleteNas_Synchronisation_Indicator()
    {
	setComponentAbsent(3);
    }
    
    
    // Methods for field "re_EstablishmentTimer"
    public Re_EstablishmentTimer getRe_EstablishmentTimer()
    {
	return (Re_EstablishmentTimer)mComponents[4];
    }
    
    public void setRe_EstablishmentTimer(Re_EstablishmentTimer re_EstablishmentTimer)
    {
	mComponents[4] = re_EstablishmentTimer;
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
	    "RAB_Info_r6"
	),
	new QName (
	    "InformationElements",
	    "RAB-Info-r6"
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
			new VectorInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"MBMS_SessionIdentity"
			    ),
			    new QName (
				"InformationElements",
				"MBMS-SessionIdentity"
			    ),
			    12314,
			    new SizeConstraint (
				new SingleValueConstraint (
				    new com.oss.asn1.INTEGER(1)
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(1)
			    )
			)
		    ),
		    "mbms-SessionIdentity",
		    1,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
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
		    2,
		    2,
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
		    3,
		    3,
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
				"Re_EstablishmentTimer"
			    ),
			    new QName (
				"InformationElements",
				"Re-EstablishmentTimer"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"useT314",
					0
				    ),
				    new MemberListElement (
					"useT315",
					1
				    )
				}
			    ),
			    0,
			    Re_EstablishmentTimer.useT314
			)
		    ),
		    "re-EstablishmentTimer",
		    4,
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
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' RAB_Info_r6 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' RAB_Info_r6 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for RAB_Info_r6
