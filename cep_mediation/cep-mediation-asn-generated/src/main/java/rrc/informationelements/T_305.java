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
 * Define the ASN1 Type T_305 from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class T_305 extends Enumerated {
    
    /**
     * The default constructor.
     */
    private T_305()
    {
	super(cFirstNumber);
    }
    
    protected T_305(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final T_305 noUpdate =
	new T_305(0);
    public static final T_305 m5 =
	new T_305(1);
    public static final T_305 m10 =
	new T_305(2);
    public static final T_305 m30 =
	new T_305(3);
    public static final T_305 m60 =
	new T_305(4);
    public static final T_305 m120 =
	new T_305(5);
    public static final T_305 m360 =
	new T_305(6);
    public static final T_305 m720 =
	new T_305(7);
    private final static T_305 cNamedNumbers[] = {
	 noUpdate, 
	 m5, 
	 m10, 
	 m30, 
	 m60, 
	 m120, 
	 m360, 
	 m720
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
    
    public static T_305 valueOf(long value)
    {
	return (T_305)noUpdate.lookupValue(value);
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
	    "T_305"
	),
	new QName (
	    "InformationElements",
	    "T-305"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "noUpdate",
		    0
		),
		new MemberListElement (
		    "m5",
		    1
		),
		new MemberListElement (
		    "m10",
		    2
		),
		new MemberListElement (
		    "m30",
		    3
		),
		new MemberListElement (
		    "m60",
		    4
		),
		new MemberListElement (
		    "m120",
		    5
		),
		new MemberListElement (
		    "m360",
		    6
		),
		new MemberListElement (
		    "m720",
		    7
		)
	    }
	),
	0,
	noUpdate
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' T_305 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' T_305 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for T_305
