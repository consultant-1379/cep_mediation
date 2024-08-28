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
 * Define the ASN1 Type AdditionalPRACH_TF_and_TFCS_CCCH_IEs from ASN1 Module InformationElements.
 * @see Sequence
 */

public class AdditionalPRACH_TF_and_TFCS_CCCH_IEs extends Sequence {
    
    /**
     * The default constructor.
     */
    public AdditionalPRACH_TF_and_TFCS_CCCH_IEs()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public AdditionalPRACH_TF_and_TFCS_CCCH_IEs(PowerOffsetInformation powerOffsetInformation, 
		    DynamicTFInformationCCCH dynamicTFInformationCCCH)
    {
	setPowerOffsetInformation(powerOffsetInformation);
	setDynamicTFInformationCCCH(dynamicTFInformationCCCH);
    }
    
    public void initComponents()
    {
	mComponents[0] = new PowerOffsetInformation();
	mComponents[1] = new DynamicTFInformationCCCH();
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
		return new PowerOffsetInformation();
	    case 1:
		return new DynamicTFInformationCCCH();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "powerOffsetInformation"
    public PowerOffsetInformation getPowerOffsetInformation()
    {
	return (PowerOffsetInformation)mComponents[0];
    }
    
    public void setPowerOffsetInformation(PowerOffsetInformation powerOffsetInformation)
    {
	mComponents[0] = powerOffsetInformation;
    }
    
    
    // Methods for field "dynamicTFInformationCCCH"
    public DynamicTFInformationCCCH getDynamicTFInformationCCCH()
    {
	return (DynamicTFInformationCCCH)mComponents[1];
    }
    
    public void setDynamicTFInformationCCCH(DynamicTFInformationCCCH dynamicTFInformationCCCH)
    {
	mComponents[1] = dynamicTFInformationCCCH;
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
	    "AdditionalPRACH_TF_and_TFCS_CCCH_IEs"
	),
	new QName (
	    "InformationElements",
	    "AdditionalPRACH-TF-and-TFCS-CCCH-IEs"
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
				"PowerOffsetInformation"
			    ),
			    new QName (
				"InformationElements",
				"PowerOffsetInformation"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "PowerOffsetInformation"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "PowerOffsetInformation"
				)
			    ),
			    0
			)
		    ),
		    "powerOffsetInformation",
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
				"DynamicTFInformationCCCH"
			    ),
			    new QName (
				"InformationElements",
				"DynamicTFInformationCCCH"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "DynamicTFInformationCCCH"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "DynamicTFInformationCCCH"
				)
			    ),
			    0
			)
		    ),
		    "dynamicTFInformationCCCH",
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
			new TagDecoderElement((short)0x8000, 0)
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
     * Get the type descriptor (TypeInfo) of 'this' AdditionalPRACH_TF_and_TFCS_CCCH_IEs object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' AdditionalPRACH_TF_and_TFCS_CCCH_IEs object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for AdditionalPRACH_TF_and_TFCS_CCCH_IEs
