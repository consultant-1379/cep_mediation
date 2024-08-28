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
 * Define the ASN1 Type SRNC_RelocationInfo_v6b0ext_IEs from ASN1 Module Internode_definitions.
 * @see Sequence
 */

public class SRNC_RelocationInfo_v6b0ext_IEs extends Sequence {
    
    /**
     * The default constructor.
     */
    public SRNC_RelocationInfo_v6b0ext_IEs()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public SRNC_RelocationInfo_v6b0ext_IEs(rrc.informationelements.RAB_InformationSetupList_v6b0ext rab_InformationSetupListExt, 
		    rrc.informationelements.MBMS_SelectedServiceInfo mbmsSelectedServiceInfo)
    {
	setRab_InformationSetupListExt(rab_InformationSetupListExt);
	setMbmsSelectedServiceInfo(mbmsSelectedServiceInfo);
    }
    
    /**
     * Construct with required components.
     */
    public SRNC_RelocationInfo_v6b0ext_IEs(rrc.informationelements.MBMS_SelectedServiceInfo mbmsSelectedServiceInfo)
    {
	setMbmsSelectedServiceInfo(mbmsSelectedServiceInfo);
    }
    
    public void initComponents()
    {
	mComponents[0] = new rrc.informationelements.RAB_InformationSetupList_v6b0ext();
	mComponents[1] = new rrc.informationelements.MBMS_SelectedServiceInfo();
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
		return new rrc.informationelements.RAB_InformationSetupList_v6b0ext();
	    case 1:
		return new rrc.informationelements.MBMS_SelectedServiceInfo();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "rab_InformationSetupListExt"
    public rrc.informationelements.RAB_InformationSetupList_v6b0ext getRab_InformationSetupListExt()
    {
	return (rrc.informationelements.RAB_InformationSetupList_v6b0ext)mComponents[0];
    }
    
    public void setRab_InformationSetupListExt(rrc.informationelements.RAB_InformationSetupList_v6b0ext rab_InformationSetupListExt)
    {
	mComponents[0] = rab_InformationSetupListExt;
    }
    
    public boolean hasRab_InformationSetupListExt()
    {
	return componentIsPresent(0);
    }
    
    public void deleteRab_InformationSetupListExt()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "mbmsSelectedServiceInfo"
    public rrc.informationelements.MBMS_SelectedServiceInfo getMbmsSelectedServiceInfo()
    {
	return (rrc.informationelements.MBMS_SelectedServiceInfo)mComponents[1];
    }
    
    public void setMbmsSelectedServiceInfo(rrc.informationelements.MBMS_SelectedServiceInfo mbmsSelectedServiceInfo)
    {
	mComponents[1] = mbmsSelectedServiceInfo;
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
	    "SRNC_RelocationInfo_v6b0ext_IEs"
	),
	new QName (
	    "Internode-definitions",
	    "SRNC-RelocationInfo-v6b0ext-IEs"
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
				"rrc.informationelements",
				"RAB_InformationSetupList_v6b0ext"
			    ),
			    new QName (
				"InformationElements",
				"RAB-InformationSetupList-v6b0ext"
			    ),
			    12314,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new com.oss.asn1.INTEGER(1), 
					new com.oss.asn1.INTEGER(16),
					0
				    )
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(16)
			    ),
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "RAB_InformationSetup_v6b0ext"
				)
			    )
			)
		    ),
		    "rab-InformationSetupListExt",
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
				"MBMS_SelectedServiceInfo"
			    ),
			    new QName (
				"InformationElements",
				"MBMS-SelectedServiceInfo"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "MBMS_SelectedServiceInfo"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "MBMS_SelectedServiceInfo"
				)
			    ),
			    0
			)
		    ),
		    "mbmsSelectedServiceInfo",
		    1,
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
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' SRNC_RelocationInfo_v6b0ext_IEs object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' SRNC_RelocationInfo_v6b0ext_IEs object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for SRNC_RelocationInfo_v6b0ext_IEs
