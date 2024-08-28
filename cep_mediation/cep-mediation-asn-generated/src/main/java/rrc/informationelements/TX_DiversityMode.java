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
 * Define the ASN1 Type TX_DiversityMode from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class TX_DiversityMode extends Enumerated {
    
    /**
     * The default constructor.
     */
    private TX_DiversityMode()
    {
	super(cFirstNumber);
    }
    
    protected TX_DiversityMode(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final TX_DiversityMode noDiversity =
	new TX_DiversityMode(0);
    public static final TX_DiversityMode sttd =
	new TX_DiversityMode(1);
    public static final TX_DiversityMode closedLoopMode1 =
	new TX_DiversityMode(2);
    public static final TX_DiversityMode dummy =
	new TX_DiversityMode(3);
    private final static TX_DiversityMode cNamedNumbers[] = {
	 noDiversity, 
	 sttd, 
	 closedLoopMode1, 
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
    
    public static TX_DiversityMode valueOf(long value)
    {
	return (TX_DiversityMode)noDiversity.lookupValue(value);
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
	    "TX_DiversityMode"
	),
	new QName (
	    "InformationElements",
	    "TX-DiversityMode"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "noDiversity",
		    0
		),
		new MemberListElement (
		    "sttd",
		    1
		),
		new MemberListElement (
		    "closedLoopMode1",
		    2
		),
		new MemberListElement (
		    "dummy",
		    3
		)
	    }
	),
	0,
	noDiversity
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' TX_DiversityMode object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' TX_DiversityMode object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for TX_DiversityMode
