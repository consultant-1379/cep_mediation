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
 * Define the ASN1 Type T_322 from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class T_322 extends Enumerated {
    
    /**
     * The default constructor.
     */
    private T_322()
    {
	super(cFirstNumber);
    }
    
    protected T_322(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final T_322 m5 =
	new T_322(0);
    public static final T_322 m10 =
	new T_322(1);
    public static final T_322 m20 =
	new T_322(2);
    public static final T_322 m30 =
	new T_322(3);
    public static final T_322 m60 =
	new T_322(4);
    public static final T_322 m120 =
	new T_322(5);
    public static final T_322 m180 =
	new T_322(6);
    public static final T_322 spare1 =
	new T_322(7);
    private final static T_322 cNamedNumbers[] = {
	 m5, 
	 m10, 
	 m20, 
	 m30, 
	 m60, 
	 m120, 
	 m180, 
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
    
    public static T_322 valueOf(long value)
    {
	return (T_322)m5.lookupValue(value);
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
	    "T_322"
	),
	new QName (
	    "InformationElements",
	    "T-322"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "m5",
		    0
		),
		new MemberListElement (
		    "m10",
		    1
		),
		new MemberListElement (
		    "m20",
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
		    "m180",
		    6
		),
		new MemberListElement (
		    "spare1",
		    7
		)
	    }
	),
	0,
	m5
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' T_322 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' T_322 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for T_322
