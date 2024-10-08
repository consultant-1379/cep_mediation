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
 * Define the ASN1 Type UDRE from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class UDRE extends Enumerated {
    
    /**
     * The default constructor.
     */
    private UDRE()
    {
	super(cFirstNumber);
    }
    
    protected UDRE(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final UDRE lessThan1 =
	new UDRE(0);
    public static final UDRE between1_and_4 =
	new UDRE(1);
    public static final UDRE between4_and_8 =
	new UDRE(2);
    public static final UDRE over8 =
	new UDRE(3);
    private final static UDRE cNamedNumbers[] = {
	 lessThan1, 
	 between1_and_4, 
	 between4_and_8, 
	 over8
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
    
    public static UDRE valueOf(long value)
    {
	return (UDRE)lessThan1.lookupValue(value);
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
	    "UDRE"
	),
	new QName (
	    "InformationElements",
	    "UDRE"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "lessThan1",
		    0
		),
		new MemberListElement (
		    "between1-and-4",
		    1
		),
		new MemberListElement (
		    "between4-and-8",
		    2
		),
		new MemberListElement (
		    "over8",
		    3
		)
	    }
	),
	0,
	lessThan1
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' UDRE object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UDRE object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UDRE
