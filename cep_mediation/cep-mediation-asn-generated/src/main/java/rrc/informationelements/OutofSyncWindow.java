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
 * Define the ASN1 Type OutofSyncWindow from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class OutofSyncWindow extends Enumerated {
    
    /**
     * The default constructor.
     */
    private OutofSyncWindow()
    {
	super(cFirstNumber);
    }
    
    protected OutofSyncWindow(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final OutofSyncWindow ms40 =
	new OutofSyncWindow(0);
    public static final OutofSyncWindow ms80 =
	new OutofSyncWindow(1);
    public static final OutofSyncWindow ms160 =
	new OutofSyncWindow(2);
    public static final OutofSyncWindow ms320 =
	new OutofSyncWindow(3);
    public static final OutofSyncWindow ms640 =
	new OutofSyncWindow(4);
    public static final OutofSyncWindow spare3 =
	new OutofSyncWindow(5);
    public static final OutofSyncWindow spare2 =
	new OutofSyncWindow(6);
    public static final OutofSyncWindow spare1 =
	new OutofSyncWindow(7);
    private final static OutofSyncWindow cNamedNumbers[] = {
	 ms40, 
	 ms80, 
	 ms160, 
	 ms320, 
	 ms640, 
	 spare3, 
	 spare2, 
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
    
    public static OutofSyncWindow valueOf(long value)
    {
	return (OutofSyncWindow)ms40.lookupValue(value);
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
	    "OutofSyncWindow"
	),
	new QName (
	    "InformationElements",
	    "OutofSyncWindow"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "ms40",
		    0
		),
		new MemberListElement (
		    "ms80",
		    1
		),
		new MemberListElement (
		    "ms160",
		    2
		),
		new MemberListElement (
		    "ms320",
		    3
		),
		new MemberListElement (
		    "ms640",
		    4
		),
		new MemberListElement (
		    "spare3",
		    5
		),
		new MemberListElement (
		    "spare2",
		    6
		),
		new MemberListElement (
		    "spare1",
		    7
		)
	    }
	),
	0,
	ms40
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' OutofSyncWindow object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' OutofSyncWindow object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for OutofSyncWindow
