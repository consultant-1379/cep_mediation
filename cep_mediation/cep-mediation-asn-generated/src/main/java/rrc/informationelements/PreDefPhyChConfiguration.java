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
 * Define the ASN1 Type PreDefPhyChConfiguration from ASN1 Module InformationElements.
 * @see Sequence
 */

public class PreDefPhyChConfiguration extends Sequence {
    
    /**
     * The default constructor.
     */
    public PreDefPhyChConfiguration()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public PreDefPhyChConfiguration(UL_DPCH_InfoPredef ul_DPCH_InfoPredef, 
		    DL_CommonInformationPredef dl_CommonInformationPredef)
    {
	setUl_DPCH_InfoPredef(ul_DPCH_InfoPredef);
	setDl_CommonInformationPredef(dl_CommonInformationPredef);
    }
    
    /**
     * Construct with required components.
     */
    public PreDefPhyChConfiguration(UL_DPCH_InfoPredef ul_DPCH_InfoPredef)
    {
	setUl_DPCH_InfoPredef(ul_DPCH_InfoPredef);
    }
    
    public void initComponents()
    {
	mComponents[0] = new UL_DPCH_InfoPredef();
	mComponents[1] = new DL_CommonInformationPredef();
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
		return new UL_DPCH_InfoPredef();
	    case 1:
		return new DL_CommonInformationPredef();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "ul_DPCH_InfoPredef"
    public UL_DPCH_InfoPredef getUl_DPCH_InfoPredef()
    {
	return (UL_DPCH_InfoPredef)mComponents[0];
    }
    
    public void setUl_DPCH_InfoPredef(UL_DPCH_InfoPredef ul_DPCH_InfoPredef)
    {
	mComponents[0] = ul_DPCH_InfoPredef;
    }
    
    
    // Methods for field "dl_CommonInformationPredef"
    public DL_CommonInformationPredef getDl_CommonInformationPredef()
    {
	return (DL_CommonInformationPredef)mComponents[1];
    }
    
    public void setDl_CommonInformationPredef(DL_CommonInformationPredef dl_CommonInformationPredef)
    {
	mComponents[1] = dl_CommonInformationPredef;
    }
    
    public boolean hasDl_CommonInformationPredef()
    {
	return componentIsPresent(1);
    }
    
    public void deleteDl_CommonInformationPredef()
    {
	setComponentAbsent(1);
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
	    "PreDefPhyChConfiguration"
	),
	new QName (
	    "InformationElements",
	    "PreDefPhyChConfiguration"
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
				"UL_DPCH_InfoPredef"
			    ),
			    new QName (
				"InformationElements",
				"UL-DPCH-InfoPredef"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UL_DPCH_InfoPredef"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "UL_DPCH_InfoPredef"
				)
			    ),
			    0
			)
		    ),
		    "ul-DPCH-InfoPredef",
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
				"DL_CommonInformationPredef"
			    ),
			    new QName (
				"InformationElements",
				"DL-CommonInformationPredef"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "DL_CommonInformationPredef"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "DL_CommonInformationPredef"
				)
			    ),
			    0
			)
		    ),
		    "dl-CommonInformationPredef",
		    1,
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
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' PreDefPhyChConfiguration object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' PreDefPhyChConfiguration object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for PreDefPhyChConfiguration
