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
 * Define the ASN1 Type UTRAN_DRX_CycleLengthCoefficient from ASN1 Module InformationElements.
 * @see INTEGER
 */

public class UTRAN_DRX_CycleLengthCoefficient extends INTEGER {
    
    /**
     * The default constructor.
     */
    public UTRAN_DRX_CycleLengthCoefficient()
    {
    }
    
    public UTRAN_DRX_CycleLengthCoefficient(short value)
    {
	super(value);
    }
    
    public UTRAN_DRX_CycleLengthCoefficient(int value)
    {
	super(value);
    }
    
    public UTRAN_DRX_CycleLengthCoefficient(long value)
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
	    "UTRAN_DRX_CycleLengthCoefficient"
	),
	new QName (
	    "InformationElements",
	    "UTRAN-DRX-CycleLengthCoefficient"
	),
	12314,
	new ValueRangeConstraint (
	    new AbstractBounds(
		new UTRAN_DRX_CycleLengthCoefficient(3), 
		new UTRAN_DRX_CycleLengthCoefficient(9),
		0
	    )
	),
	new Bounds (
	    new java.lang.Long(3),
	    new java.lang.Long(9)
	),
	null
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' UTRAN_DRX_CycleLengthCoefficient object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UTRAN_DRX_CycleLengthCoefficient object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UTRAN_DRX_CycleLengthCoefficient
