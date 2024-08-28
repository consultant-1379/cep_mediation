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
 * Define the ASN1 Type TFCI_Field2_Information from ASN1 Module InformationElements.
 * @see Choice
 */

public class TFCI_Field2_Information extends Choice {
    
    /**
     * The default constructor.
     */
    public TFCI_Field2_Information()
    {
    }
    
    public static final  int  tfci_Range_chosen = 1;
    public static final  int  explicit_config_chosen = 2;
    
    // Methods for field "tfci_Range"
    public static TFCI_Field2_Information createTFCI_Field2_InformationWithTfci_Range(TFCI_RangeList tfci_Range)
    {
	TFCI_Field2_Information __object = new TFCI_Field2_Information();

	__object.setTfci_Range(tfci_Range);
	return __object;
    }
    
    public boolean hasTfci_Range()
    {
	return getChosenFlag() == tfci_Range_chosen;
    }
    
    public void setTfci_Range(TFCI_RangeList tfci_Range)
    {
	setChosenValue(tfci_Range);
	setChosenFlag(tfci_Range_chosen);
    }
    
    
    // Methods for field "explicit_config"
    public static TFCI_Field2_Information createTFCI_Field2_InformationWithExplicit_config(ExplicitTFCS_Configuration explicit_config)
    {
	TFCI_Field2_Information __object = new TFCI_Field2_Information();

	__object.setExplicit_config(explicit_config);
	return __object;
    }
    
    public boolean hasExplicit_config()
    {
	return getChosenFlag() == explicit_config_chosen;
    }
    
    public void setExplicit_config(ExplicitTFCS_Configuration explicit_config)
    {
	setChosenValue(explicit_config);
	setChosenFlag(explicit_config_chosen);
    }
    
    
    // Method to create a specific choice instance
    public AbstractData createInstance(int chosen)
    {
	switch (chosen) {
	    case tfci_Range_chosen:
		return new TFCI_RangeList();
	    case explicit_config_chosen:
		return new ExplicitTFCS_Configuration();
	    default:
		throw new InternalError("Choice.createInstance()");
	}
	
    }
    
    /**
     * Initialize the type descriptor.
     */
    private static final ChoiceInfo c_typeinfo = new ChoiceInfo (
	new Tags (
	    null
	),
	new QName (
	    "rrc.informationelements",
	    "TFCI_Field2_Information"
	),
	new QName (
	    "InformationElements",
	    "TFCI-Field2-Information"
	),
	12314,
	null,
	new Fields (
	    new FieldInfo[] {
		new FieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"TFCI_RangeList"
			    ),
			    new QName (
				"InformationElements",
				"TFCI-RangeList"
			    ),
			    12314,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new com.oss.asn1.INTEGER(1), 
					new com.oss.asn1.INTEGER(256),
					0
				    )
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(256)
			    ),
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "TFCI_Range"
				)
			    )
			)
		    ),
		    "tfci-Range",
		    0,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"ExplicitTFCS_Configuration"
			    ),
			    new QName (
				"InformationElements",
				"ExplicitTFCS-Configuration"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "ExplicitTFCS_Configuration"
				)
			    ),
			    0,
			    new TagDecoder (
				new TagDecoderElement[] {
				    new TagDecoderElement((short)0x8000, 0),
				    new TagDecoderElement((short)0x8001, 1),
				    new TagDecoderElement((short)0x8002, 2),
				    new TagDecoderElement((short)0x8003, 3)
				}
			    )
			)
		    ),
		    "explicit-config",
		    1,
		    2
		)
	    }
	),
	0,
	new TagDecoder (
	    new TagDecoderElement[] {
		new TagDecoderElement((short)0x8000, 0),
		new TagDecoderElement((short)0x8001, 1)
	    }
	)
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' TFCI_Field2_Information object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' TFCI_Field2_Information object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for TFCI_Field2_Information
