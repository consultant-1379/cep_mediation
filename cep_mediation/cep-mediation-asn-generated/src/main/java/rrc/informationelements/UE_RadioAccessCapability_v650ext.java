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
 * Define the ASN1 Type UE_RadioAccessCapability_v650ext from ASN1 Module InformationElements.
 * @see Sequence
 */

public class UE_RadioAccessCapability_v650ext extends Sequence {
    
    /**
     * The default constructor.
     */
    public UE_RadioAccessCapability_v650ext()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public UE_RadioAccessCapability_v650ext(UE_RadioAccessCapabBandFDDList2 ue_RadioAccessCapabBandFDDList2, 
		    UE_RadioAccessCapabBandFDDList_ext ue_RadioAccessCapabBandFDDList_ext)
    {
	setUe_RadioAccessCapabBandFDDList2(ue_RadioAccessCapabBandFDDList2);
	setUe_RadioAccessCapabBandFDDList_ext(ue_RadioAccessCapabBandFDDList_ext);
    }
    
    /**
     * Construct with required components.
     */
    public UE_RadioAccessCapability_v650ext(UE_RadioAccessCapabBandFDDList2 ue_RadioAccessCapabBandFDDList2)
    {
	setUe_RadioAccessCapabBandFDDList2(ue_RadioAccessCapabBandFDDList2);
    }
    
    public void initComponents()
    {
	mComponents[0] = new UE_RadioAccessCapabBandFDDList2();
	mComponents[1] = new UE_RadioAccessCapabBandFDDList_ext();
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
		return new UE_RadioAccessCapabBandFDDList2();
	    case 1:
		return new UE_RadioAccessCapabBandFDDList_ext();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "ue_RadioAccessCapabBandFDDList2"
    public UE_RadioAccessCapabBandFDDList2 getUe_RadioAccessCapabBandFDDList2()
    {
	return (UE_RadioAccessCapabBandFDDList2)mComponents[0];
    }
    
    public void setUe_RadioAccessCapabBandFDDList2(UE_RadioAccessCapabBandFDDList2 ue_RadioAccessCapabBandFDDList2)
    {
	mComponents[0] = ue_RadioAccessCapabBandFDDList2;
    }
    
    
    // Methods for field "ue_RadioAccessCapabBandFDDList_ext"
    public UE_RadioAccessCapabBandFDDList_ext getUe_RadioAccessCapabBandFDDList_ext()
    {
	return (UE_RadioAccessCapabBandFDDList_ext)mComponents[1];
    }
    
    public void setUe_RadioAccessCapabBandFDDList_ext(UE_RadioAccessCapabBandFDDList_ext ue_RadioAccessCapabBandFDDList_ext)
    {
	mComponents[1] = ue_RadioAccessCapabBandFDDList_ext;
    }
    
    public boolean hasUe_RadioAccessCapabBandFDDList_ext()
    {
	return componentIsPresent(1);
    }
    
    public void deleteUe_RadioAccessCapabBandFDDList_ext()
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
	    "UE_RadioAccessCapability_v650ext"
	),
	new QName (
	    "InformationElements",
	    "UE-RadioAccessCapability-v650ext"
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
				"UE_RadioAccessCapabBandFDDList2"
			    ),
			    new QName (
				"InformationElements",
				"UE-RadioAccessCapabBandFDDList2"
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
				    "UE_RadioAccessCapabBandFDD2"
				)
			    )
			)
		    ),
		    "ue-RadioAccessCapabBandFDDList2",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"UE_RadioAccessCapabBandFDDList_ext"
			    ),
			    new QName (
				"InformationElements",
				"UE-RadioAccessCapabBandFDDList-ext"
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
				    "UE_RadioAccessCapabBandFDD_ext"
				)
			    )
			)
		    ),
		    "ue-RadioAccessCapabBandFDDList-ext",
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
     * Get the type descriptor (TypeInfo) of 'this' UE_RadioAccessCapability_v650ext object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UE_RadioAccessCapability_v650ext object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UE_RadioAccessCapability_v650ext
