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
 * Define the ASN1 Type MBMS_L1CombiningTransmTimeDiff from ASN1 Module InformationElements.
 * @see INTEGER
 */

public class MBMS_L1CombiningTransmTimeDiff extends INTEGER {
    
    /**
     * The default constructor.
     */
    public MBMS_L1CombiningTransmTimeDiff()
    {
    }
    
    public MBMS_L1CombiningTransmTimeDiff(short value)
    {
	super(value);
    }
    
    public MBMS_L1CombiningTransmTimeDiff(int value)
    {
	super(value);
    }
    
    public MBMS_L1CombiningTransmTimeDiff(long value)
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
	    "MBMS_L1CombiningTransmTimeDiff"
	),
	new QName (
	    "InformationElements",
	    "MBMS-L1CombiningTransmTimeDiff"
	),
	12314,
	new ValueRangeConstraint (
	    new AbstractBounds(
		new MBMS_L1CombiningTransmTimeDiff(0), 
		new MBMS_L1CombiningTransmTimeDiff(3),
		0
	    )
	),
	new Bounds (
	    new java.lang.Long(0),
	    new java.lang.Long(3)
	),
	null
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' MBMS_L1CombiningTransmTimeDiff object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' MBMS_L1CombiningTransmTimeDiff object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for MBMS_L1CombiningTransmTimeDiff
