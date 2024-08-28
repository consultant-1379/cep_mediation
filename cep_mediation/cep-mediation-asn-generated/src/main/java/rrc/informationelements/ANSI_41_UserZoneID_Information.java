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
 * Define the ASN1 Type ANSI_41_UserZoneID_Information from ASN1 Module InformationElements.
 * @see ANSI_41_NAS_Parameter
 */

public class ANSI_41_UserZoneID_Information extends ANSI_41_NAS_Parameter {
    
    /**
     * The default constructor.
     */
    public ANSI_41_UserZoneID_Information()
    {
    }
    
    /**
     * Construct Bit String from a byte array.
     * All bits considered significant.
     * @param value the byte array to set this object to.
     */
    public ANSI_41_UserZoneID_Information(byte[] value)
    {
	super(value);
    }
    
    
    /**
     * Construct Bit String from a byte array and significant bits.
     * @param value the byte array to set this object to.
     * @param sigBits the number of significant bits.
     */
    public ANSI_41_UserZoneID_Information(byte[] value, int sigBits)
    {
	super(value, sigBits);
    }
    
    /**
     * Initialize the type descriptor.
     */
    private static final BitStringInfo c_typeinfo = new BitStringInfo (
	new Tags (
	    new short[] {
		0x0003
	    }
	),
	new QName (
	    "rrc.informationelements",
	    "ANSI_41_UserZoneID_Information"
	),
	new QName (
	    "InformationElements",
	    "ANSI-41-UserZoneID-Information"
	),
	12314,
	new SizeConstraint (
	    new ValueRangeConstraint (
		new AbstractBounds(
		    new com.oss.asn1.INTEGER(1), 
		    new com.oss.asn1.INTEGER(2048),
		    0
		)
	    )
	),
	new Bounds (
	    new java.lang.Long(1),
	    new java.lang.Long(2048)
	),
	null
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' ANSI_41_UserZoneID_Information object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' ANSI_41_UserZoneID_Information object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for ANSI_41_UserZoneID_Information
