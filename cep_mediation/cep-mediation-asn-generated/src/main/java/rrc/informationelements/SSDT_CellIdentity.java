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
 * Define the ASN1 Type SSDT_CellIdentity from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class SSDT_CellIdentity extends Enumerated {
    
    /**
     * The default constructor.
     */
    private SSDT_CellIdentity()
    {
	super(cFirstNumber);
    }
    
    protected SSDT_CellIdentity(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final SSDT_CellIdentity ssdt_id_a =
	new SSDT_CellIdentity(0);
    public static final SSDT_CellIdentity ssdt_id_b =
	new SSDT_CellIdentity(1);
    public static final SSDT_CellIdentity ssdt_id_c =
	new SSDT_CellIdentity(2);
    public static final SSDT_CellIdentity ssdt_id_d =
	new SSDT_CellIdentity(3);
    public static final SSDT_CellIdentity ssdt_id_e =
	new SSDT_CellIdentity(4);
    public static final SSDT_CellIdentity ssdt_id_f =
	new SSDT_CellIdentity(5);
    public static final SSDT_CellIdentity ssdt_id_g =
	new SSDT_CellIdentity(6);
    public static final SSDT_CellIdentity ssdt_id_h =
	new SSDT_CellIdentity(7);
    private final static SSDT_CellIdentity cNamedNumbers[] = {
	 ssdt_id_a, 
	 ssdt_id_b, 
	 ssdt_id_c, 
	 ssdt_id_d, 
	 ssdt_id_e, 
	 ssdt_id_f, 
	 ssdt_id_g, 
	 ssdt_id_h
    };
    protected final static long cFirstNumber = 0;
    protected final static boolean cLinearNumbers = false;
    
    public Enumerated[] getNamedNumbers()
    {
	return cNamedNumbers;
    }
    
    public boolean hasLinearNumbers()
    {
	return cLinearNumbers;
    }
    
    public long getFirstNumber()
    {
	return cFirstNumber;
    }
    
    public static SSDT_CellIdentity valueOf(long value)
    {
	return (SSDT_CellIdentity)ssdt_id_a.lookupValue(value);
    }
    
    /**
     * Initialize the type descriptor.
     */
    private static final EnumeratedInfo c_typeinfo = new EnumeratedInfo (
	new Tags (
	    new short[] {
		0x000a
	    }
	),
	new QName (
	    "rrc.informationelements",
	    "SSDT_CellIdentity"
	),
	new QName (
	    "InformationElements",
	    "SSDT-CellIdentity"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "ssdt-id-a",
		    0
		),
		new MemberListElement (
		    "ssdt-id-b",
		    1
		),
		new MemberListElement (
		    "ssdt-id-c",
		    2
		),
		new MemberListElement (
		    "ssdt-id-d",
		    3
		),
		new MemberListElement (
		    "ssdt-id-e",
		    4
		),
		new MemberListElement (
		    "ssdt-id-f",
		    5
		),
		new MemberListElement (
		    "ssdt-id-g",
		    6
		),
		new MemberListElement (
		    "ssdt-id-h",
		    7
		)
	    }
	),
	0,
	ssdt_id_a
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' SSDT_CellIdentity object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' SSDT_CellIdentity object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for SSDT_CellIdentity
