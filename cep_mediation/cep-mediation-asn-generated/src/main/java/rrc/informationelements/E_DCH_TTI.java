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
 * Define the ASN1 Type E_DCH_TTI from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class E_DCH_TTI extends Enumerated {
    
    /**
     * The default constructor.
     */
    private E_DCH_TTI()
    {
	super(cFirstNumber);
    }
    
    protected E_DCH_TTI(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final E_DCH_TTI tti2 =
	new E_DCH_TTI(0);
    public static final E_DCH_TTI tti10 =
	new E_DCH_TTI(1);
    private final static E_DCH_TTI cNamedNumbers[] = {
	 tti2, 
	 tti10
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
    
    public static E_DCH_TTI valueOf(long value)
    {
	return (E_DCH_TTI)tti2.lookupValue(value);
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
	    "E_DCH_TTI"
	),
	new QName (
	    "InformationElements",
	    "E-DCH-TTI"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "tti2",
		    0
		),
		new MemberListElement (
		    "tti10",
		    1
		)
	    }
	),
	0,
	tti2
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' E_DCH_TTI object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' E_DCH_TTI object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for E_DCH_TTI
