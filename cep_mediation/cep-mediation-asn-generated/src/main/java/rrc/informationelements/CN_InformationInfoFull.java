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
 * Define the ASN1 Type CN_InformationInfoFull from ASN1 Module InformationElements.
 * @see Sequence
 */

public class CN_InformationInfoFull extends Sequence {
    
    /**
     * The default constructor.
     */
    public CN_InformationInfoFull()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public CN_InformationInfoFull(PLMN_Identity plmn_Identity, 
		    NAS_SystemInformationGSM_MAP cn_CommonGSM_MAP_NAS_SysInfo, 
		    CN_DomainInformationListFull cn_DomainInformationListFull)
    {
	setPlmn_Identity(plmn_Identity);
	setCn_CommonGSM_MAP_NAS_SysInfo(cn_CommonGSM_MAP_NAS_SysInfo);
	setCn_DomainInformationListFull(cn_DomainInformationListFull);
    }
    
    public void initComponents()
    {
	mComponents[0] = new PLMN_Identity();
	mComponents[1] = new NAS_SystemInformationGSM_MAP();
	mComponents[2] = new CN_DomainInformationListFull();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[3];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new PLMN_Identity();
	    case 1:
		return new NAS_SystemInformationGSM_MAP();
	    case 2:
		return new CN_DomainInformationListFull();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "plmn_Identity"
    public PLMN_Identity getPlmn_Identity()
    {
	return (PLMN_Identity)mComponents[0];
    }
    
    public void setPlmn_Identity(PLMN_Identity plmn_Identity)
    {
	mComponents[0] = plmn_Identity;
    }
    
    public boolean hasPlmn_Identity()
    {
	return componentIsPresent(0);
    }
    
    public void deletePlmn_Identity()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "cn_CommonGSM_MAP_NAS_SysInfo"
    public NAS_SystemInformationGSM_MAP getCn_CommonGSM_MAP_NAS_SysInfo()
    {
	return (NAS_SystemInformationGSM_MAP)mComponents[1];
    }
    
    public void setCn_CommonGSM_MAP_NAS_SysInfo(NAS_SystemInformationGSM_MAP cn_CommonGSM_MAP_NAS_SysInfo)
    {
	mComponents[1] = cn_CommonGSM_MAP_NAS_SysInfo;
    }
    
    public boolean hasCn_CommonGSM_MAP_NAS_SysInfo()
    {
	return componentIsPresent(1);
    }
    
    public void deleteCn_CommonGSM_MAP_NAS_SysInfo()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "cn_DomainInformationListFull"
    public CN_DomainInformationListFull getCn_DomainInformationListFull()
    {
	return (CN_DomainInformationListFull)mComponents[2];
    }
    
    public void setCn_DomainInformationListFull(CN_DomainInformationListFull cn_DomainInformationListFull)
    {
	mComponents[2] = cn_DomainInformationListFull;
    }
    
    public boolean hasCn_DomainInformationListFull()
    {
	return componentIsPresent(2);
    }
    
    public void deleteCn_DomainInformationListFull()
    {
	setComponentAbsent(2);
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
	    "CN_InformationInfoFull"
	),
	new QName (
	    "InformationElements",
	    "CN-InformationInfoFull"
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
		    "plmn-Identity",
		    0,
		    3,
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
				"NAS_SystemInformationGSM_MAP"
			    ),
			    new QName (
				"InformationElements",
				"NAS-SystemInformationGSM-MAP"
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
			    )
			)
		    ),
		    "cn-CommonGSM-MAP-NAS-SysInfo",
		    1,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"CN_DomainInformationListFull"
			    ),
			    new QName (
				"InformationElements",
				"CN-DomainInformationListFull"
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
				    "CN_DomainInformationFull"
				)
			    )
			)
		    ),
		    "cn-DomainInformationListFull",
		    2,
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
			new TagDecoderElement((short)0x8002, 2)
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
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' CN_InformationInfoFull object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' CN_InformationInfoFull object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for CN_InformationInfoFull
