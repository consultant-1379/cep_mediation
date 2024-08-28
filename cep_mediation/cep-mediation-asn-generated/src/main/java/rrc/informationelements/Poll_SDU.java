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
 * Define the ASN1 Type Poll_SDU from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class Poll_SDU extends Enumerated {
    
    /**
     * The default constructor.
     */
    private Poll_SDU()
    {
	super(cFirstNumber);
    }
    
    protected Poll_SDU(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final Poll_SDU sdu1 =
	new Poll_SDU(0);
    public static final Poll_SDU sdu4 =
	new Poll_SDU(1);
    public static final Poll_SDU sdu16 =
	new Poll_SDU(2);
    public static final Poll_SDU sdu64 =
	new Poll_SDU(3);
    private final static Poll_SDU cNamedNumbers[] = {
	 sdu1, 
	 sdu4, 
	 sdu16, 
	 sdu64
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
    
    public static Poll_SDU valueOf(long value)
    {
	return (Poll_SDU)sdu1.lookupValue(value);
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
	    "Poll_SDU"
	),
	new QName (
	    "InformationElements",
	    "Poll-SDU"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "sdu1",
		    0
		),
		new MemberListElement (
		    "sdu4",
		    1
		),
		new MemberListElement (
		    "sdu16",
		    2
		),
		new MemberListElement (
		    "sdu64",
		    3
		)
	    }
	),
	0,
	sdu1
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' Poll_SDU object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' Poll_SDU object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for Poll_SDU
