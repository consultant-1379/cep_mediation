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
 * Define the ASN1 Type TransportChannelCapability from ASN1 Module InformationElements.
 * @see Sequence
 */

public class TransportChannelCapability extends Sequence {
    
    /**
     * The default constructor.
     */
    public TransportChannelCapability()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public TransportChannelCapability(DL_TransChCapability dl_TransChCapability, 
		    UL_TransChCapability ul_TransChCapability)
    {
	setDl_TransChCapability(dl_TransChCapability);
	setUl_TransChCapability(ul_TransChCapability);
    }
    
    public void initComponents()
    {
	mComponents[0] = new DL_TransChCapability();
	mComponents[1] = new UL_TransChCapability();
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
		return new DL_TransChCapability();
	    case 1:
		return new UL_TransChCapability();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "dl_TransChCapability"
    public DL_TransChCapability getDl_TransChCapability()
    {
	return (DL_TransChCapability)mComponents[0];
    }
    
    public void setDl_TransChCapability(DL_TransChCapability dl_TransChCapability)
    {
	mComponents[0] = dl_TransChCapability;
    }
    
    
    // Methods for field "ul_TransChCapability"
    public UL_TransChCapability getUl_TransChCapability()
    {
	return (UL_TransChCapability)mComponents[1];
    }
    
    public void setUl_TransChCapability(UL_TransChCapability ul_TransChCapability)
    {
	mComponents[1] = ul_TransChCapability;
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
	    "TransportChannelCapability"
	),
	new QName (
	    "InformationElements",
	    "TransportChannelCapability"
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
				"DL_TransChCapability"
			    ),
			    new QName (
				"InformationElements",
				"DL-TransChCapability"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "DL_TransChCapability"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "DL_TransChCapability"
				)
			    ),
			    0
			)
		    ),
		    "dl-TransChCapability",
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
				"UL_TransChCapability"
			    ),
			    new QName (
				"InformationElements",
				"UL-TransChCapability"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UL_TransChCapability"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "UL_TransChCapability"
				)
			    ),
			    0
			)
		    ),
		    "ul-TransChCapability",
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
     * Get the type descriptor (TypeInfo) of 'this' TransportChannelCapability object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' TransportChannelCapability object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for TransportChannelCapability
