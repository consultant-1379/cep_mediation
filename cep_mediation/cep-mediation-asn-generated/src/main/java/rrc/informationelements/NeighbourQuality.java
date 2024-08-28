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
 * Define the ASN1 Type NeighbourQuality from ASN1 Module InformationElements.
 * @see Sequence
 */

public class NeighbourQuality extends Sequence {
    
    /**
     * The default constructor.
     */
    public NeighbourQuality()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public NeighbourQuality(UE_Positioning_OTDOA_Quality ue_Positioning_OTDOA_Quality)
    {
	setUe_Positioning_OTDOA_Quality(ue_Positioning_OTDOA_Quality);
    }
    
    public void initComponents()
    {
	mComponents[0] = new UE_Positioning_OTDOA_Quality();
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
		return new UE_Positioning_OTDOA_Quality();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "ue_Positioning_OTDOA_Quality"
    public UE_Positioning_OTDOA_Quality getUe_Positioning_OTDOA_Quality()
    {
	return (UE_Positioning_OTDOA_Quality)mComponents[0];
    }
    
    public void setUe_Positioning_OTDOA_Quality(UE_Positioning_OTDOA_Quality ue_Positioning_OTDOA_Quality)
    {
	mComponents[0] = ue_Positioning_OTDOA_Quality;
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
	    "NeighbourQuality"
	),
	new QName (
	    "InformationElements",
	    "NeighbourQuality"
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
				"UE_Positioning_OTDOA_Quality"
			    ),
			    new QName (
				"InformationElements",
				"UE-Positioning-OTDOA-Quality"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_OTDOA_Quality"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_OTDOA_Quality"
				)
			    ),
			    0
			)
		    ),
		    "ue-Positioning-OTDOA-Quality",
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
     * Get the type descriptor (TypeInfo) of 'this' NeighbourQuality object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' NeighbourQuality object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for NeighbourQuality
