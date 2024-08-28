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
 * Define the ASN1 Type T_308 from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class T_308 extends Enumerated {
    
    /**
     * The default constructor.
     */
    private T_308()
    {
	super(cFirstNumber);
    }
    
    protected T_308(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final T_308 ms40 =
	new T_308(0);
    public static final T_308 ms80 =
	new T_308(1);
    public static final T_308 ms160 =
	new T_308(2);
    public static final T_308 ms320 =
	new T_308(3);
    private final static T_308 cNamedNumbers[] = {
	 ms40, 
	 ms80, 
	 ms160, 
	 ms320
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
    
    public static T_308 valueOf(long value)
    {
	return (T_308)ms40.lookupValue(value);
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
	    "T_308"
	),
	new QName (
	    "InformationElements",
	    "T-308"
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
		)
	    }
	),
	0,
	ms40
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' T_308 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' T_308 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for T_308
