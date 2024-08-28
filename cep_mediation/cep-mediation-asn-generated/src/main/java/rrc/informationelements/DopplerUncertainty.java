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
 * Define the ASN1 Type DopplerUncertainty from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class DopplerUncertainty extends Enumerated {
    
    /**
     * The default constructor.
     */
    private DopplerUncertainty()
    {
	super(cFirstNumber);
    }
    
    protected DopplerUncertainty(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final DopplerUncertainty hz12_5 =
	new DopplerUncertainty(0);
    public static final DopplerUncertainty hz25 =
	new DopplerUncertainty(1);
    public static final DopplerUncertainty hz50 =
	new DopplerUncertainty(2);
    public static final DopplerUncertainty hz100 =
	new DopplerUncertainty(3);
    public static final DopplerUncertainty hz200 =
	new DopplerUncertainty(4);
    public static final DopplerUncertainty spare3 =
	new DopplerUncertainty(5);
    public static final DopplerUncertainty spare2 =
	new DopplerUncertainty(6);
    public static final DopplerUncertainty spare1 =
	new DopplerUncertainty(7);
    private final static DopplerUncertainty cNamedNumbers[] = {
	 hz12_5, 
	 hz25, 
	 hz50, 
	 hz100, 
	 hz200, 
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
    
    public static DopplerUncertainty valueOf(long value)
    {
	return (DopplerUncertainty)hz12_5.lookupValue(value);
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
	    "DopplerUncertainty"
	),
	new QName (
	    "InformationElements",
	    "DopplerUncertainty"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "hz12-5",
		    0
		),
		new MemberListElement (
		    "hz25",
		    1
		),
		new MemberListElement (
		    "hz50",
		    2
		),
		new MemberListElement (
		    "hz100",
		    3
		),
		new MemberListElement (
		    "hz200",
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
	hz12_5
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' DopplerUncertainty object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' DopplerUncertainty object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for DopplerUncertainty
