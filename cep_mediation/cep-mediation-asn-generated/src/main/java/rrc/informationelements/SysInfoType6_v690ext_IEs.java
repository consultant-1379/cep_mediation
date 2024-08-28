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
 * Define the ASN1 Type SysInfoType6_v690ext_IEs from ASN1 Module InformationElements.
 * @see Sequence
 */

public class SysInfoType6_v690ext_IEs extends Sequence {
    
    /**
     * The default constructor.
     */
    public SysInfoType6_v690ext_IEs()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public SysInfoType6_v690ext_IEs(AdditionalPRACH_TF_and_TFCS_CCCH_List additionalPRACH_TF_and_TFCS_CCCH_List)
    {
	setAdditionalPRACH_TF_and_TFCS_CCCH_List(additionalPRACH_TF_and_TFCS_CCCH_List);
    }
    
    public void initComponents()
    {
	mComponents[0] = new AdditionalPRACH_TF_and_TFCS_CCCH_List();
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
		return new AdditionalPRACH_TF_and_TFCS_CCCH_List();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "additionalPRACH_TF_and_TFCS_CCCH_List"
    public AdditionalPRACH_TF_and_TFCS_CCCH_List getAdditionalPRACH_TF_and_TFCS_CCCH_List()
    {
	return (AdditionalPRACH_TF_and_TFCS_CCCH_List)mComponents[0];
    }
    
    public void setAdditionalPRACH_TF_and_TFCS_CCCH_List(AdditionalPRACH_TF_and_TFCS_CCCH_List additionalPRACH_TF_and_TFCS_CCCH_List)
    {
	mComponents[0] = additionalPRACH_TF_and_TFCS_CCCH_List;
    }
    
    public boolean hasAdditionalPRACH_TF_and_TFCS_CCCH_List()
    {
	return componentIsPresent(0);
    }
    
    public void deleteAdditionalPRACH_TF_and_TFCS_CCCH_List()
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
	    "rrc.informationelements",
	    "SysInfoType6_v690ext_IEs"
	),
	new QName (
	    "InformationElements",
	    "SysInfoType6-v690ext-IEs"
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
				"AdditionalPRACH_TF_and_TFCS_CCCH_List"
			    ),
			    new QName (
				"InformationElements",
				"AdditionalPRACH-TF-and-TFCS-CCCH-List"
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
				    "AdditionalPRACH_TF_and_TFCS_CCCH"
				)
			    )
			)
		    ),
		    "additionalPRACH-TF-and-TFCS-CCCH-List",
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
     * Get the type descriptor (TypeInfo) of 'this' SysInfoType6_v690ext_IEs object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' SysInfoType6_v690ext_IEs object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for SysInfoType6_v690ext_IEs
