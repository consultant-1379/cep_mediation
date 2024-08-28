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
 * Define the ASN1 Type PI_CountPerFrame from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class PI_CountPerFrame extends Enumerated {
    
    /**
     * The default constructor.
     */
    private PI_CountPerFrame()
    {
	super(cFirstNumber);
    }
    
    protected PI_CountPerFrame(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final PI_CountPerFrame e18 =
	new PI_CountPerFrame(0);
    public static final PI_CountPerFrame e36 =
	new PI_CountPerFrame(1);
    public static final PI_CountPerFrame e72 =
	new PI_CountPerFrame(2);
    public static final PI_CountPerFrame e144 =
	new PI_CountPerFrame(3);
    private final static PI_CountPerFrame cNamedNumbers[] = {
	 e18, 
	 e36, 
	 e72, 
	 e144
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
    
    public static PI_CountPerFrame valueOf(long value)
    {
	return (PI_CountPerFrame)e18.lookupValue(value);
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
	    "PI_CountPerFrame"
	),
	new QName (
	    "InformationElements",
	    "PI-CountPerFrame"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "e18",
		    0
		),
		new MemberListElement (
		    "e36",
		    1
		),
		new MemberListElement (
		    "e72",
		    2
		),
		new MemberListElement (
		    "e144",
		    3
		)
	    }
	),
	0,
	e18
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' PI_CountPerFrame object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' PI_CountPerFrame object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for PI_CountPerFrame
