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
 * Define the ASN1 Type MBMSCommonPTMRBInformation_v770ext_IEs from ASN1 Module PDU_definitions.
 * @see Sequence
 */

public class MBMSCommonPTMRBInformation_v770ext_IEs extends Sequence {
    
    /**
     * The default constructor.
     */
    public MBMSCommonPTMRBInformation_v770ext_IEs()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public MBMSCommonPTMRBInformation_v770ext_IEs(rrc.informationelements.MBMS_PhyChInformationList_r7 mbms_PhyChInformationList_r7)
    {
	setMbms_PhyChInformationList_r7(mbms_PhyChInformationList_r7);
    }
    
    public void initComponents()
    {
	mComponents[0] = new rrc.informationelements.MBMS_PhyChInformationList_r7();
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
		return new rrc.informationelements.MBMS_PhyChInformationList_r7();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "mbms_PhyChInformationList_r7"
    public rrc.informationelements.MBMS_PhyChInformationList_r7 getMbms_PhyChInformationList_r7()
    {
	return (rrc.informationelements.MBMS_PhyChInformationList_r7)mComponents[0];
    }
    
    public void setMbms_PhyChInformationList_r7(rrc.informationelements.MBMS_PhyChInformationList_r7 mbms_PhyChInformationList_r7)
    {
	mComponents[0] = mbms_PhyChInformationList_r7;
    }
    
    public boolean hasMbms_PhyChInformationList_r7()
    {
	return componentIsPresent(0);
    }
    
    public void deleteMbms_PhyChInformationList_r7()
    {
	setComponentAbsent(0);
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
	    "MBMSCommonPTMRBInformation_v770ext_IEs"
	),
	new QName (
	    "PDU-definitions",
	    "MBMSCommonPTMRBInformation-v770ext-IEs"
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
				"MBMS_PhyChInformationList_r7"
			    ),
			    new QName (
				"InformationElements",
				"MBMS-PhyChInformationList-r7"
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
				    "MBMS_PhyChInformation_r7"
				)
			    )
			)
		    ),
		    "mbms-PhyChInformationList-r7",
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
     * Get the type descriptor (TypeInfo) of 'this' MBMSCommonPTMRBInformation_v770ext_IEs object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' MBMSCommonPTMRBInformation_v770ext_IEs object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for MBMSCommonPTMRBInformation_v770ext_IEs
