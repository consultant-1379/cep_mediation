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
 * Define the ASN1 Type E_DCH_MAC_d_FlowMultiplexingList from ASN1 Module InformationElements.
 * @see BitString
 */

public class E_DCH_MAC_d_FlowMultiplexingList extends BitString {
    
    /**
     * The default constructor.
     */
    public E_DCH_MAC_d_FlowMultiplexingList()
    {
    }
    
    /**
     * Construct Bit String from a byte array.
     * All bits considered significant.
     * @param value the byte array to set this object to.
     */
    public E_DCH_MAC_d_FlowMultiplexingList(byte[] value)
    {
	super(value);
    }
    
    
    /**
     * Construct Bit String from a byte array and significant bits.
     * @param value the byte array to set this object to.
     * @param sigBits the number of significant bits.
     */
    public E_DCH_MAC_d_FlowMultiplexingList(byte[] value, int sigBits)
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
	    "E_DCH_MAC_d_FlowMultiplexingList"
	),
	new QName (
	    "InformationElements",
	    "E-DCH-MAC-d-FlowMultiplexingList"
	),
	12314,
	new SizeConstraint (
	    new SingleValueConstraint (
		new com.oss.asn1.INTEGER(8)
	    )
	),
	new Bounds (
	    new java.lang.Long(8),
	    new java.lang.Long(8)
	),
	null
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' E_DCH_MAC_d_FlowMultiplexingList object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' E_DCH_MAC_d_FlowMultiplexingList object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for E_DCH_MAC_d_FlowMultiplexingList
