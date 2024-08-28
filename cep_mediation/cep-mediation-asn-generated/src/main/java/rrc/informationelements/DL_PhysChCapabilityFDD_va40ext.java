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
 * Define the ASN1 Type DL_PhysChCapabilityFDD_va40ext from ASN1 Module InformationElements.
 * @see Sequence
 */

public class DL_PhysChCapabilityFDD_va40ext extends Sequence {
    
    /**
     * The default constructor.
     */
    public DL_PhysChCapabilityFDD_va40ext()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public DL_PhysChCapabilityFDD_va40ext(HSDSCH_physical_layer_category_ext4 hsdsch_physical_layer_category_ext4, 
		    HSDSCH_physical_layer_category_ext5 hsdsch_physical_layer_category_ext5)
    {
	setHsdsch_physical_layer_category_ext4(hsdsch_physical_layer_category_ext4);
	setHsdsch_physical_layer_category_ext5(hsdsch_physical_layer_category_ext5);
    }
    
    public void initComponents()
    {
	mComponents[0] = new HSDSCH_physical_layer_category_ext4();
	mComponents[1] = new HSDSCH_physical_layer_category_ext5();
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
		return new HSDSCH_physical_layer_category_ext4();
	    case 1:
		return new HSDSCH_physical_layer_category_ext5();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "hsdsch_physical_layer_category_ext4"
    public HSDSCH_physical_layer_category_ext4 getHsdsch_physical_layer_category_ext4()
    {
	return (HSDSCH_physical_layer_category_ext4)mComponents[0];
    }
    
    public void setHsdsch_physical_layer_category_ext4(HSDSCH_physical_layer_category_ext4 hsdsch_physical_layer_category_ext4)
    {
	mComponents[0] = hsdsch_physical_layer_category_ext4;
    }
    
    public boolean hasHsdsch_physical_layer_category_ext4()
    {
	return componentIsPresent(0);
    }
    
    public void deleteHsdsch_physical_layer_category_ext4()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "hsdsch_physical_layer_category_ext5"
    public HSDSCH_physical_layer_category_ext5 getHsdsch_physical_layer_category_ext5()
    {
	return (HSDSCH_physical_layer_category_ext5)mComponents[1];
    }
    
    public void setHsdsch_physical_layer_category_ext5(HSDSCH_physical_layer_category_ext5 hsdsch_physical_layer_category_ext5)
    {
	mComponents[1] = hsdsch_physical_layer_category_ext5;
    }
    
    public boolean hasHsdsch_physical_layer_category_ext5()
    {
	return componentIsPresent(1);
    }
    
    public void deleteHsdsch_physical_layer_category_ext5()
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
	    "DL_PhysChCapabilityFDD_va40ext"
	),
	new QName (
	    "InformationElements",
	    "DL-PhysChCapabilityFDD-va40ext"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"HSDSCH_physical_layer_category_ext4"
			    ),
			    new QName (
				"InformationElements",
				"HSDSCH-physical-layer-category-ext4"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new HSDSCH_physical_layer_category_ext4(29), 
				    new HSDSCH_physical_layer_category_ext4(30),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(29),
				new java.lang.Long(30)
			    ),
			    null
			)
		    ),
		    "hsdsch-physical-layer-category-ext4",
		    0,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"HSDSCH_physical_layer_category_ext5"
			    ),
			    new QName (
				"InformationElements",
				"HSDSCH-physical-layer-category-ext5"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new HSDSCH_physical_layer_category_ext5(31), 
				    new HSDSCH_physical_layer_category_ext5(32),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(31),
				new java.lang.Long(32)
			    ),
			    null
			)
		    ),
		    "hsdsch-physical-layer-category-ext5",
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
			new TagDecoderElement((short)0x8000, 0),
			new TagDecoderElement((short)0x8001, 1)
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
     * Get the type descriptor (TypeInfo) of 'this' DL_PhysChCapabilityFDD_va40ext object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' DL_PhysChCapabilityFDD_va40ext object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for DL_PhysChCapabilityFDD_va40ext
