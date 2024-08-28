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
 * Define the ASN1 Type AdditionalPRACH_TF_and_TFCS_CCCH from ASN1 Module InformationElements.
 * @see Sequence
 */

public class AdditionalPRACH_TF_and_TFCS_CCCH extends Sequence {
    
    /**
     * The default constructor.
     */
    public AdditionalPRACH_TF_and_TFCS_CCCH()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public AdditionalPRACH_TF_and_TFCS_CCCH(AdditionalPRACH_TF_and_TFCS_CCCH_IEs additionalPRACH_TF_and_TFCS_CCCH_IEs)
    {
	setAdditionalPRACH_TF_and_TFCS_CCCH_IEs(additionalPRACH_TF_and_TFCS_CCCH_IEs);
    }
    
    public void initComponents()
    {
	mComponents[0] = new AdditionalPRACH_TF_and_TFCS_CCCH_IEs();
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
		return new AdditionalPRACH_TF_and_TFCS_CCCH_IEs();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "additionalPRACH_TF_and_TFCS_CCCH_IEs"
    public AdditionalPRACH_TF_and_TFCS_CCCH_IEs getAdditionalPRACH_TF_and_TFCS_CCCH_IEs()
    {
	return (AdditionalPRACH_TF_and_TFCS_CCCH_IEs)mComponents[0];
    }
    
    public void setAdditionalPRACH_TF_and_TFCS_CCCH_IEs(AdditionalPRACH_TF_and_TFCS_CCCH_IEs additionalPRACH_TF_and_TFCS_CCCH_IEs)
    {
	mComponents[0] = additionalPRACH_TF_and_TFCS_CCCH_IEs;
    }
    
    public boolean hasAdditionalPRACH_TF_and_TFCS_CCCH_IEs()
    {
	return componentIsPresent(0);
    }
    
    public void deleteAdditionalPRACH_TF_and_TFCS_CCCH_IEs()
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
	    "AdditionalPRACH_TF_and_TFCS_CCCH"
	),
	new QName (
	    "InformationElements",
	    "AdditionalPRACH-TF-and-TFCS-CCCH"
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
				"AdditionalPRACH_TF_and_TFCS_CCCH_IEs"
			    ),
			    new QName (
				"InformationElements",
				"AdditionalPRACH-TF-and-TFCS-CCCH-IEs"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "AdditionalPRACH_TF_and_TFCS_CCCH_IEs"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "AdditionalPRACH_TF_and_TFCS_CCCH_IEs"
				)
			    ),
			    0
			)
		    ),
		    "additionalPRACH-TF-and-TFCS-CCCH-IEs",
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
     * Get the type descriptor (TypeInfo) of 'this' AdditionalPRACH_TF_and_TFCS_CCCH object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' AdditionalPRACH_TF_and_TFCS_CCCH object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for AdditionalPRACH_TF_and_TFCS_CCCH
