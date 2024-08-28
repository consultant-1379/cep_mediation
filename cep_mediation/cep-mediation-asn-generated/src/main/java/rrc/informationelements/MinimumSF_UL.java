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
 * Define the ASN1 Type MinimumSF_UL from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class MinimumSF_UL extends Enumerated {
    
    /**
     * The default constructor.
     */
    private MinimumSF_UL()
    {
	super(cFirstNumber);
    }
    
    protected MinimumSF_UL(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final MinimumSF_UL sf1 =
	new MinimumSF_UL(0);
    public static final MinimumSF_UL sf2 =
	new MinimumSF_UL(1);
    public static final MinimumSF_UL sf4 =
	new MinimumSF_UL(2);
    public static final MinimumSF_UL sf8 =
	new MinimumSF_UL(3);
    public static final MinimumSF_UL dummy =
	new MinimumSF_UL(4);
    private final static MinimumSF_UL cNamedNumbers[] = {
	 sf1, 
	 sf2, 
	 sf4, 
	 sf8, 
	 dummy
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
    
    public static MinimumSF_UL valueOf(long value)
    {
	return (MinimumSF_UL)sf1.lookupValue(value);
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
	    "MinimumSF_UL"
	),
	new QName (
	    "InformationElements",
	    "MinimumSF-UL"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "sf1",
		    0
		),
		new MemberListElement (
		    "sf2",
		    1
		),
		new MemberListElement (
		    "sf4",
		    2
		),
		new MemberListElement (
		    "sf8",
		    3
		),
		new MemberListElement (
		    "dummy",
		    4
		)
	    }
	),
	0,
	sf1
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' MinimumSF_UL object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' MinimumSF_UL object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for MinimumSF_UL
