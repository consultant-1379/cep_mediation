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
 * Define the ASN1 Type UE_RadioAccessCapabBand_va40ext from ASN1 Module InformationElements.
 * @see Sequence
 */

public class UE_RadioAccessCapabBand_va40ext extends Sequence {
    
    /**
     * The default constructor.
     */
    public UE_RadioAccessCapabBand_va40ext()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public UE_RadioAccessCapabBand_va40ext(UE_RadioAccessCapabBandFDDList5 ue_RadioAccessCapabBandFDDList5, 
		    UE_RadioAccessCapabBandFDDList_ext2 ue_RadioAccessCapabBandFDDList_ext2)
    {
	setUe_RadioAccessCapabBandFDDList5(ue_RadioAccessCapabBandFDDList5);
	setUe_RadioAccessCapabBandFDDList_ext2(ue_RadioAccessCapabBandFDDList_ext2);
    }
    
    /**
     * Construct with required components.
     */
    public UE_RadioAccessCapabBand_va40ext(UE_RadioAccessCapabBandFDDList5 ue_RadioAccessCapabBandFDDList5)
    {
	setUe_RadioAccessCapabBandFDDList5(ue_RadioAccessCapabBandFDDList5);
    }
    
    public void initComponents()
    {
	mComponents[0] = new UE_RadioAccessCapabBandFDDList5();
	mComponents[1] = new UE_RadioAccessCapabBandFDDList_ext2();
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
		return new UE_RadioAccessCapabBandFDDList5();
	    case 1:
		return new UE_RadioAccessCapabBandFDDList_ext2();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "ue_RadioAccessCapabBandFDDList5"
    public UE_RadioAccessCapabBandFDDList5 getUe_RadioAccessCapabBandFDDList5()
    {
	return (UE_RadioAccessCapabBandFDDList5)mComponents[0];
    }
    
    public void setUe_RadioAccessCapabBandFDDList5(UE_RadioAccessCapabBandFDDList5 ue_RadioAccessCapabBandFDDList5)
    {
	mComponents[0] = ue_RadioAccessCapabBandFDDList5;
    }
    
    
    // Methods for field "ue_RadioAccessCapabBandFDDList_ext2"
    public UE_RadioAccessCapabBandFDDList_ext2 getUe_RadioAccessCapabBandFDDList_ext2()
    {
	return (UE_RadioAccessCapabBandFDDList_ext2)mComponents[1];
    }
    
    public void setUe_RadioAccessCapabBandFDDList_ext2(UE_RadioAccessCapabBandFDDList_ext2 ue_RadioAccessCapabBandFDDList_ext2)
    {
	mComponents[1] = ue_RadioAccessCapabBandFDDList_ext2;
    }
    
    public boolean hasUe_RadioAccessCapabBandFDDList_ext2()
    {
	return componentIsPresent(1);
    }
    
    public void deleteUe_RadioAccessCapabBandFDDList_ext2()
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
	    "UE_RadioAccessCapabBand_va40ext"
	),
	new QName (
	    "InformationElements",
	    "UE-RadioAccessCapabBand-va40ext"
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
				"UE_RadioAccessCapabBandFDDList5"
			    ),
			    new QName (
				"InformationElements",
				"UE-RadioAccessCapabBandFDDList5"
			    ),
			    12314,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new com.oss.asn1.INTEGER(1), 
					new com.oss.asn1.INTEGER(64),
					0
				    )
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(64)
			    ),
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "UE_RadioAccessCapabBandFDD5"
				)
			    )
			)
		    ),
		    "ue-RadioAccessCapabBandFDDList5",
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
				"UE_RadioAccessCapabBandFDDList_ext2"
			    ),
			    new QName (
				"InformationElements",
				"UE-RadioAccessCapabBandFDDList-ext2"
			    ),
			    12314,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new com.oss.asn1.INTEGER(1), 
					new com.oss.asn1.INTEGER(22),
					0
				    )
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(22)
			    ),
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "UE_RadioAccessCapabBandFDD_ext2"
				)
			    )
			)
		    ),
		    "ue-RadioAccessCapabBandFDDList-ext2",
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
     * Get the type descriptor (TypeInfo) of 'this' UE_RadioAccessCapabBand_va40ext object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UE_RadioAccessCapabBand_va40ext object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UE_RadioAccessCapabBand_va40ext
