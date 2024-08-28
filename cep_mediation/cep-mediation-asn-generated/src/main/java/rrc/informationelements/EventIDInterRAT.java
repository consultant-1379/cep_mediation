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
 * Define the ASN1 Type EventIDInterRAT from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class EventIDInterRAT extends Enumerated {
    
    /**
     * The default constructor.
     */
    private EventIDInterRAT()
    {
	super(cFirstNumber);
    }
    
    protected EventIDInterRAT(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final EventIDInterRAT e3a =
	new EventIDInterRAT(0);
    public static final EventIDInterRAT e3b =
	new EventIDInterRAT(1);
    public static final EventIDInterRAT e3c =
	new EventIDInterRAT(2);
    public static final EventIDInterRAT e3d =
	new EventIDInterRAT(3);
    private final static EventIDInterRAT cNamedNumbers[] = {
	 e3a, 
	 e3b, 
	 e3c, 
	 e3d
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
    
    public static EventIDInterRAT valueOf(long value)
    {
	return (EventIDInterRAT)e3a.lookupValue(value);
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
	    "EventIDInterRAT"
	),
	new QName (
	    "InformationElements",
	    "EventIDInterRAT"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "e3a",
		    0
		),
		new MemberListElement (
		    "e3b",
		    1
		),
		new MemberListElement (
		    "e3c",
		    2
		),
		new MemberListElement (
		    "e3d",
		    3
		)
	    }
	),
	0,
	e3a
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' EventIDInterRAT object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' EventIDInterRAT object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for EventIDInterRAT
