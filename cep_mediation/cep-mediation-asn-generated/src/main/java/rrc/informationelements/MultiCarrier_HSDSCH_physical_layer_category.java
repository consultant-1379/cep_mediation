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
 * Define the ASN1 Type MultiCarrier_HSDSCH_physical_layer_category from ASN1 Module InformationElements.
 * @see INTEGER
 */

public class MultiCarrier_HSDSCH_physical_layer_category extends INTEGER {
    
    /**
     * The default constructor.
     */
    public MultiCarrier_HSDSCH_physical_layer_category()
    {
    }
    
    public MultiCarrier_HSDSCH_physical_layer_category(short value)
    {
	super(value);
    }
    
    public MultiCarrier_HSDSCH_physical_layer_category(int value)
    {
	super(value);
    }
    
    public MultiCarrier_HSDSCH_physical_layer_category(long value)
    {
	super(value);
    }
    
    /**
     * Initialize the type descriptor.
     */
    private static final IntegerInfo c_typeinfo = new IntegerInfo (
	new Tags (
	    new short[] {
		0x0002
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
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' MultiCarrier_HSDSCH_physical_layer_category object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' MultiCarrier_HSDSCH_physical_layer_category object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for MultiCarrier_HSDSCH_physical_layer_category
