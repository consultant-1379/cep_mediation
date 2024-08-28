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
 * Define the ASN1 Type E_RUCCH_AccessServiceClass from ASN1 Module InformationElements.
 * @see PRACH_Partitioning_LCR_r4
 */

public class E_RUCCH_AccessServiceClass extends PRACH_Partitioning_LCR_r4 {
    
    /**
     * The default constructor.
     */
    public E_RUCCH_AccessServiceClass()
    {
    }
    
    /**
     * Construct from an array of components.
     */
    public E_RUCCH_AccessServiceClass(ASCSetting_TDD_LCR_r4[] elements)
    {
	super(elements);
    }
    
    /**
     * Initialize the type descriptor.
     */
    private static final ContainerInfo c_typeinfo = new ContainerInfo (
	new Tags (
	    new short[] {
		0x0010
	    }
	),
	new QName (
	    "rrc.informationelements",
	    "E_RUCCH_AccessServiceClass"
	),
	new QName (
	    "InformationElements",
	    "E-RUCCH-AccessServiceClass"
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
		"ASCSetting_TDD_LCR_r4"
	    )
	)
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' E_RUCCH_AccessServiceClass object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' E_RUCCH_AccessServiceClass object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for E_RUCCH_AccessServiceClass
