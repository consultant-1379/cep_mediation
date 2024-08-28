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


package rrc.internode_definitions;

import com.oss.asn1.*;
import com.oss.metadata.*;
import rrc.*;

/**
 * Define the ASN1 Type MaxHcContextSpace_r5 from ASN1 Module Internode_definitions.
 * @see Enumerated
 */

public final class MaxHcContextSpace_r5 extends Enumerated {
    
    /**
     * The default constructor.
     */
    private MaxHcContextSpace_r5()
    {
	super(cFirstNumber);
    }
    
    protected MaxHcContextSpace_r5(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final MaxHcContextSpace_r5 dummy =
	new MaxHcContextSpace_r5(0);
    public static final MaxHcContextSpace_r5 by1024 =
	new MaxHcContextSpace_r5(1);
    public static final MaxHcContextSpace_r5 by2048 =
	new MaxHcContextSpace_r5(2);
    public static final MaxHcContextSpace_r5 by4096 =
	new MaxHcContextSpace_r5(3);
    public static final MaxHcContextSpace_r5 by8192 =
	new MaxHcContextSpace_r5(4);
    public static final MaxHcContextSpace_r5 by16384 =
	new MaxHcContextSpace_r5(5);
    public static final MaxHcContextSpace_r5 by32768 =
	new MaxHcContextSpace_r5(6);
    public static final MaxHcContextSpace_r5 by65536 =
	new MaxHcContextSpace_r5(7);
    public static final MaxHcContextSpace_r5 by131072 =
	new MaxHcContextSpace_r5(8);
    private final static MaxHcContextSpace_r5 cNamedNumbers[] = {
	 dummy, 
	 by1024, 
	 by2048, 
	 by4096, 
	 by8192, 
	 by16384, 
	 by32768, 
	 by65536, 
	 by131072
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
    
    public static MaxHcContextSpace_r5 valueOf(long value)
    {
	return (MaxHcContextSpace_r5)dummy.lookupValue(value);
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
	    "rrc.internode_definitions",
	    "MaxHcContextSpace_r5"
	),
	new QName (
	    "Internode-definitions",
	    "MaxHcContextSpace-r5"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "dummy",
		    0
		),
		new MemberListElement (
		    "by1024",
		    1
		),
		new MemberListElement (
		    "by2048",
		    2
		),
		new MemberListElement (
		    "by4096",
		    3
		),
		new MemberListElement (
		    "by8192",
		    4
		),
		new MemberListElement (
		    "by16384",
		    5
		),
		new MemberListElement (
		    "by32768",
		    6
		),
		new MemberListElement (
		    "by65536",
		    7
		),
		new MemberListElement (
		    "by131072",
		    8
		)
	    }
	),
	0,
	dummy
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' MaxHcContextSpace_r5 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' MaxHcContextSpace_r5 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for MaxHcContextSpace_r5
