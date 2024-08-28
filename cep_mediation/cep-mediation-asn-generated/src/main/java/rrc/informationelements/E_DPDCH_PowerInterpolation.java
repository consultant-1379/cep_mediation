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
 * Define the ASN1 Type E_DPDCH_PowerInterpolation from ASN1 Module InformationElements.
 * @see BOOLEAN
 */

public class E_DPDCH_PowerInterpolation extends BOOLEAN {
    
    /**
     * The default constructor.
     */
    public E_DPDCH_PowerInterpolation()
    {
    }
    
    /**
     * Construct from a boolean type.
     * @param value the boolean to set this object to.
     */
    public E_DPDCH_PowerInterpolation(boolean value)
    {
	super(value);
    }
    
    /**
     * Initialize the type descriptor.
     */
    private static final TypeInfo c_typeinfo = new TypeInfo (
	new Tags (
	    new short[] {
		0x0001
	    }
	),
	new QName (
	    "rrc.informationelements",
	    "E_DPDCH_PowerInterpolation"
	),
	new QName (
	    "InformationElements",
	    "E-DPDCH-PowerInterpolation"
	),
	12314,
	null
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' E_DPDCH_PowerInterpolation object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' E_DPDCH_PowerInterpolation object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for E_DPDCH_PowerInterpolation
