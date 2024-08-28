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
 * Define the ASN1 Type URA_UpdateCause from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class URA_UpdateCause extends Enumerated {
    
    /**
     * The default constructor.
     */
    private URA_UpdateCause()
    {
	super(cFirstNumber);
    }
    
    protected URA_UpdateCause(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final URA_UpdateCause changeOfURA =
	new URA_UpdateCause(0);
    public static final URA_UpdateCause periodicURAUpdate =
	new URA_UpdateCause(1);
    public static final URA_UpdateCause dummy =
	new URA_UpdateCause(2);
    public static final URA_UpdateCause spare1 =
	new URA_UpdateCause(3);
    private final static URA_UpdateCause cNamedNumbers[] = {
	 changeOfURA, 
	 periodicURAUpdate, 
	 dummy, 
	 spare1
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
    
    public static URA_UpdateCause valueOf(long value)
    {
	return (URA_UpdateCause)changeOfURA.lookupValue(value);
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
	    "URA_UpdateCause"
	),
	new QName (
	    "InformationElements",
	    "URA-UpdateCause"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "changeOfURA",
		    0
		),
		new MemberListElement (
		    "periodicURAUpdate",
		    1
		),
		new MemberListElement (
		    "dummy",
		    2
		),
		new MemberListElement (
		    "spare1",
		    3
		)
	    }
	),
	0,
	changeOfURA
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' URA_UpdateCause object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' URA_UpdateCause object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for URA_UpdateCause
