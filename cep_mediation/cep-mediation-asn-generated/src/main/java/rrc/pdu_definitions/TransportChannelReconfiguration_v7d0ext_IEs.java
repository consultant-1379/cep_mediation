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
 * Define the ASN1 Type TransportChannelReconfiguration_v7d0ext_IEs from ASN1 Module PDU_definitions.
 * @see Sequence
 */

public class TransportChannelReconfiguration_v7d0ext_IEs extends Sequence {
    
    /**
     * The default constructor.
     */
    public TransportChannelReconfiguration_v7d0ext_IEs()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public TransportChannelReconfiguration_v7d0ext_IEs(rrc.informationelements.UL_EDCH_Information_ext ul_EDCH_Information)
    {
	setUl_EDCH_Information(ul_EDCH_Information);
    }
    
    public void initComponents()
    {
	mComponents[0] = new rrc.informationelements.UL_EDCH_Information_ext();
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
		return new rrc.informationelements.UL_EDCH_Information_ext();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "ul_EDCH_Information"
    public rrc.informationelements.UL_EDCH_Information_ext getUl_EDCH_Information()
    {
	return (rrc.informationelements.UL_EDCH_Information_ext)mComponents[0];
    }
    
    public void setUl_EDCH_Information(rrc.informationelements.UL_EDCH_Information_ext ul_EDCH_Information)
    {
	mComponents[0] = ul_EDCH_Information;
    }
    
    public boolean hasUl_EDCH_Information()
    {
	return componentIsPresent(0);
    }
    
    public void deleteUl_EDCH_Information()
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
	    "TransportChannelReconfiguration_v7d0ext_IEs"
	),
	new QName (
	    "PDU-definitions",
	    "TransportChannelReconfiguration-v7d0ext-IEs"
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
				"UL_EDCH_Information_ext"
			    ),
			    new QName (
				"InformationElements",
				"UL-EDCH-Information-ext"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UL_EDCH_Information_ext"
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
		    "ul-EDCH-Information",
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
     * Get the type descriptor (TypeInfo) of 'this' TransportChannelReconfiguration_v7d0ext_IEs object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' TransportChannelReconfiguration_v7d0ext_IEs object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for TransportChannelReconfiguration_v7d0ext_IEs
