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
 * Define the ASN1 Type N_GAP from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class N_GAP extends Enumerated {
    
    /**
     * The default constructor.
     */
    private N_GAP()
    {
	super(cFirstNumber);
    }
    
    protected N_GAP(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final N_GAP f2 =
	new N_GAP(0);
    public static final N_GAP f4 =
	new N_GAP(1);
    public static final N_GAP f8 =
	new N_GAP(2);
    private final static N_GAP cNamedNumbers[] = {
	 f2, 
	 f4, 
	 f8
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
    
    public static N_GAP valueOf(long value)
    {
	return (N_GAP)f2.lookupValue(value);
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
	    "N_GAP"
	),
	new QName (
	    "InformationElements",
	    "N-GAP"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "f2",
		    0
		),
		new MemberListElement (
		    "f4",
		    1
		),
		new MemberListElement (
		    "f8",
		    2
		)
	    }
	),
	0,
	f2
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' N_GAP object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' N_GAP object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for N_GAP
