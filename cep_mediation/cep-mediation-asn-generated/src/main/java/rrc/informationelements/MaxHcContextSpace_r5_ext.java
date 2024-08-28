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
 * Define the ASN1 Type MaxHcContextSpace_r5_ext from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class MaxHcContextSpace_r5_ext extends Enumerated {
    
    /**
     * The default constructor.
     */
    private MaxHcContextSpace_r5_ext()
    {
	super(cFirstNumber);
    }
    
    protected MaxHcContextSpace_r5_ext(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final MaxHcContextSpace_r5_ext by16384 =
	new MaxHcContextSpace_r5_ext(0);
    public static final MaxHcContextSpace_r5_ext by32768 =
	new MaxHcContextSpace_r5_ext(1);
    public static final MaxHcContextSpace_r5_ext by65536 =
	new MaxHcContextSpace_r5_ext(2);
    public static final MaxHcContextSpace_r5_ext by131072 =
	new MaxHcContextSpace_r5_ext(3);
    private final static MaxHcContextSpace_r5_ext cNamedNumbers[] = {
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
    
    public static MaxHcContextSpace_r5_ext valueOf(long value)
    {
	return (MaxHcContextSpace_r5_ext)by16384.lookupValue(value);
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
	    "MaxHcContextSpace_r5_ext"
	),
	new QName (
	    "InformationElements",
	    "MaxHcContextSpace-r5-ext"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "by16384",
		    0
		),
		new MemberListElement (
		    "by32768",
		    1
		),
		new MemberListElement (
		    "by65536",
		    2
		),
		new MemberListElement (
		    "by131072",
		    3
		)
	    }
	),
	0,
	by16384
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' MaxHcContextSpace_r5_ext object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' MaxHcContextSpace_r5_ext object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for MaxHcContextSpace_r5_ext
