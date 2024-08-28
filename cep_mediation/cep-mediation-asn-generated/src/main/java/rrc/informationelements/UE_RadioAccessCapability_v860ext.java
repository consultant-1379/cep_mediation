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
 * Define the ASN1 Type UE_RadioAccessCapability_v860ext from ASN1 Module InformationElements.
 * @see Sequence
 */

public class UE_RadioAccessCapability_v860ext extends Sequence {
    
    /**
     * The default constructor.
     */
    public UE_RadioAccessCapability_v860ext()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public UE_RadioAccessCapability_v860ext(UE_RadioAccessCapabBandFDDList3 ue_RadioAccessCapabBandFDDList3)
    {
	setUe_RadioAccessCapabBandFDDList3(ue_RadioAccessCapabBandFDDList3);
    }
    
    public void initComponents()
    {
	mComponents[0] = new UE_RadioAccessCapabBandFDDList3();
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
		return new UE_RadioAccessCapabBandFDDList3();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "ue_RadioAccessCapabBandFDDList3"
    public UE_RadioAccessCapabBandFDDList3 getUe_RadioAccessCapabBandFDDList3()
    {
	return (UE_RadioAccessCapabBandFDDList3)mComponents[0];
    }
    
    public void setUe_RadioAccessCapabBandFDDList3(UE_RadioAccessCapabBandFDDList3 ue_RadioAccessCapabBandFDDList3)
    {
	mComponents[0] = ue_RadioAccessCapabBandFDDList3;
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
	    "UE_RadioAccessCapability_v860ext"
	),
	new QName (
	    "InformationElements",
	    "UE-RadioAccessCapability-v860ext"
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
				"UE_RadioAccessCapabBandFDDList3"
			    ),
			    new QName (
				"InformationElements",
				"UE-RadioAccessCapabBandFDDList3"
			    ),
			    12314,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new com.oss.asn1.INTEGER(1), 
					new com.oss.asn1.INTEGER(8),
					0
				    )
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(8)
			    ),
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "UE_RadioAccessCapabBandFDD3"
				)
			    )
			)
		    ),
		    "ue-RadioAccessCapabBandFDDList3",
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
     * Get the type descriptor (TypeInfo) of 'this' UE_RadioAccessCapability_v860ext object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UE_RadioAccessCapability_v860ext object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UE_RadioAccessCapability_v860ext
