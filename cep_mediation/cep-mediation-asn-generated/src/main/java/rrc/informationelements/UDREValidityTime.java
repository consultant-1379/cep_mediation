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
 * Define the ASN1 Type UDREValidityTime from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class UDREValidityTime extends Enumerated {
    
    /**
     * The default constructor.
     */
    private UDREValidityTime()
    {
	super(cFirstNumber);
    }
    
    protected UDREValidityTime(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final UDREValidityTime val_20sec =
	new UDREValidityTime(0);
    public static final UDREValidityTime val_40sec =
	new UDREValidityTime(1);
    public static final UDREValidityTime val_80sec =
	new UDREValidityTime(2);
    public static final UDREValidityTime val_160sec =
	new UDREValidityTime(3);
    public static final UDREValidityTime val_320sec =
	new UDREValidityTime(4);
    public static final UDREValidityTime val_640sec =
	new UDREValidityTime(5);
    public static final UDREValidityTime val_1280sec =
	new UDREValidityTime(6);
    public static final UDREValidityTime val_2560sec =
	new UDREValidityTime(7);
    private final static UDREValidityTime cNamedNumbers[] = {
	 val_20sec, 
	 val_40sec, 
	 val_80sec, 
	 val_160sec, 
	 val_320sec, 
	 val_640sec, 
	 val_1280sec, 
	 val_2560sec
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
    
    public static UDREValidityTime valueOf(long value)
    {
	return (UDREValidityTime)val_20sec.lookupValue(value);
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
	    "UDREValidityTime"
	),
	new QName (
	    "InformationElements",
	    "UDREValidityTime"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "val-20sec",
		    0
		),
		new MemberListElement (
		    "val-40sec",
		    1
		),
		new MemberListElement (
		    "val-80sec",
		    2
		),
		new MemberListElement (
		    "val-160sec",
		    3
		),
		new MemberListElement (
		    "val-320sec",
		    4
		),
		new MemberListElement (
		    "val-640sec",
		    5
		),
		new MemberListElement (
		    "val-1280sec",
		    6
		),
		new MemberListElement (
		    "val-2560sec",
		    7
		)
	    }
	),
	0,
	val_20sec
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' UDREValidityTime object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UDREValidityTime object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UDREValidityTime
