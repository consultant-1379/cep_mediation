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
 * Define the ASN1 Type PollWindow from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class PollWindow extends Enumerated {
    
    /**
     * The default constructor.
     */
    private PollWindow()
    {
	super(cFirstNumber);
    }
    
    protected PollWindow(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final PollWindow pw50 =
	new PollWindow(0);
    public static final PollWindow pw60 =
	new PollWindow(1);
    public static final PollWindow pw70 =
	new PollWindow(2);
    public static final PollWindow pw80 =
	new PollWindow(3);
    public static final PollWindow pw85 =
	new PollWindow(4);
    public static final PollWindow pw90 =
	new PollWindow(5);
    public static final PollWindow pw95 =
	new PollWindow(6);
    public static final PollWindow pw99 =
	new PollWindow(7);
    private final static PollWindow cNamedNumbers[] = {
	 pw50, 
	 pw60, 
	 pw70, 
	 pw80, 
	 pw85, 
	 pw90, 
	 pw95, 
	 pw99
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
    
    public static PollWindow valueOf(long value)
    {
	return (PollWindow)pw50.lookupValue(value);
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
	    "PollWindow"
	),
	new QName (
	    "InformationElements",
	    "PollWindow"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "pw50",
		    0
		),
		new MemberListElement (
		    "pw60",
		    1
		),
		new MemberListElement (
		    "pw70",
		    2
		),
		new MemberListElement (
		    "pw80",
		    3
		),
		new MemberListElement (
		    "pw85",
		    4
		),
		new MemberListElement (
		    "pw90",
		    5
		),
		new MemberListElement (
		    "pw95",
		    6
		),
		new MemberListElement (
		    "pw99",
		    7
		)
	    }
	),
	0,
	pw50
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' PollWindow object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' PollWindow object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for PollWindow
