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
 * Define the ASN1 Type N_315ext from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class N_315ext extends Enumerated {
    
    /**
     * The default constructor.
     */
    private N_315ext()
    {
	super(cFirstNumber);
    }
    
    protected N_315ext(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final N_315ext s2 =
	new N_315ext(0);
    public static final N_315ext s4 =
	new N_315ext(1);
    public static final N_315ext s10 =
	new N_315ext(2);
    public static final N_315ext s20 =
	new N_315ext(3);
    private final static N_315ext cNamedNumbers[] = {
	 s2, 
	 s4, 
	 s10, 
	 s20
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
    
    public static N_315ext valueOf(long value)
    {
	return (N_315ext)s2.lookupValue(value);
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
	    "N_315ext"
	),
	new QName (
	    "InformationElements",
	    "N-315ext"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "s2",
		    0
		),
		new MemberListElement (
		    "s4",
		    1
		),
		new MemberListElement (
		    "s10",
		    2
		),
		new MemberListElement (
		    "s20",
		    3
		)
	    }
	),
	0,
	s2
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' N_315ext object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' N_315ext object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for N_315ext
