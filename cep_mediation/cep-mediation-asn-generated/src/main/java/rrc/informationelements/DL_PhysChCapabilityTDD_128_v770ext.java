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
 * Define the ASN1 Type DL_PhysChCapabilityTDD_128_v770ext from ASN1 Module InformationElements.
 * @see Sequence
 */

public class DL_PhysChCapabilityTDD_128_v770ext extends Sequence {
    
    /**
     * The default constructor.
     */
    public DL_PhysChCapabilityTDD_128_v770ext()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public DL_PhysChCapabilityTDD_128_v770ext(MultiCarrier_HSDSCH_physical_layer_category multiCarrier_physical_layer_category)
    {
	setMultiCarrier_physical_layer_category(multiCarrier_physical_layer_category);
    }
    
    public void initComponents()
    {
	mComponents[0] = new MultiCarrier_HSDSCH_physical_layer_category();
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
		return new MultiCarrier_HSDSCH_physical_layer_category();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "multiCarrier_physical_layer_category"
    public MultiCarrier_HSDSCH_physical_layer_category getMultiCarrier_physical_layer_category()
    {
	return (MultiCarrier_HSDSCH_physical_layer_category)mComponents[0];
    }
    
    public void setMultiCarrier_physical_layer_category(MultiCarrier_HSDSCH_physical_layer_category multiCarrier_physical_layer_category)
    {
	mComponents[0] = multiCarrier_physical_layer_category;
    }
    
    public boolean hasMultiCarrier_physical_layer_category()
    {
	return componentIsPresent(0);
    }
    
    public void deleteMultiCarrier_physical_layer_category()
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
	    "rrc.informationelements",
	    "DL_PhysChCapabilityTDD_128_v770ext"
	),
	new QName (
	    "InformationElements",
	    "DL-PhysChCapabilityTDD-128-v770ext"
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
				"MultiCarrier_HSDSCH_physical_layer_category"
			    ),
			    new QName (
				"InformationElements",
				"MultiCarrier-HSDSCH-physical-layer-category"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new MultiCarrier_HSDSCH_physical_layer_category(1), 
				    new MultiCarrier_HSDSCH_physical_layer_category(64),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(64)
			    ),
			    null
			)
		    ),
		    "multiCarrier-physical-layer-category",
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
     * Get the type descriptor (TypeInfo) of 'this' DL_PhysChCapabilityTDD_128_v770ext object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' DL_PhysChCapabilityTDD_128_v770ext object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for DL_PhysChCapabilityTDD_128_v770ext
