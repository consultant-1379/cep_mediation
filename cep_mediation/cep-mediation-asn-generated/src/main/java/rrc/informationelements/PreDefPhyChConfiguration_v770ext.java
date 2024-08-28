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
 * Define the ASN1 Type PreDefPhyChConfiguration_v770ext from ASN1 Module InformationElements.
 * @see Sequence
 */

public class PreDefPhyChConfiguration_v770ext extends Sequence {
    
    /**
     * The default constructor.
     */
    public PreDefPhyChConfiguration_v770ext()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public PreDefPhyChConfiguration_v770ext(UL_DPCH_InfoPredef_v770ext ul_DPCH_InfoPredef)
    {
	setUl_DPCH_InfoPredef(ul_DPCH_InfoPredef);
    }
    
    public void initComponents()
    {
	mComponents[0] = new UL_DPCH_InfoPredef_v770ext();
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
		return new UL_DPCH_InfoPredef_v770ext();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "ul_DPCH_InfoPredef"
    public UL_DPCH_InfoPredef_v770ext getUl_DPCH_InfoPredef()
    {
	return (UL_DPCH_InfoPredef_v770ext)mComponents[0];
    }
    
    public void setUl_DPCH_InfoPredef(UL_DPCH_InfoPredef_v770ext ul_DPCH_InfoPredef)
    {
	mComponents[0] = ul_DPCH_InfoPredef;
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
	    "PreDefPhyChConfiguration_v770ext"
	),
	new QName (
	    "InformationElements",
	    "PreDefPhyChConfiguration-v770ext"
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
				"UL_DPCH_InfoPredef_v770ext"
			    ),
			    new QName (
				"InformationElements",
				"UL-DPCH-InfoPredef-v770ext"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UL_DPCH_InfoPredef_v770ext"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "UL_DPCH_InfoPredef_v770ext"
				)
			    ),
			    0
			)
		    ),
		    "ul-DPCH-InfoPredef",
		    0,
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
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' PreDefPhyChConfiguration_v770ext object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' PreDefPhyChConfiguration_v770ext object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for PreDefPhyChConfiguration_v770ext
