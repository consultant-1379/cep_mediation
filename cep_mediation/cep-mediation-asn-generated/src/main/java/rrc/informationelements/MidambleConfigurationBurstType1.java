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
 * Define the ASN1 Type MidambleConfigurationBurstType1 from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class MidambleConfigurationBurstType1 extends Enumerated {
    
    /**
     * The default constructor.
     */
    private MidambleConfigurationBurstType1()
    {
	super(cFirstNumber);
    }
    
    protected MidambleConfigurationBurstType1(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final MidambleConfigurationBurstType1 ms4 =
	new MidambleConfigurationBurstType1(0);
    public static final MidambleConfigurationBurstType1 ms8 =
	new MidambleConfigurationBurstType1(1);
    public static final MidambleConfigurationBurstType1 ms16 =
	new MidambleConfigurationBurstType1(2);
    private final static MidambleConfigurationBurstType1 cNamedNumbers[] = {
	 ms4, 
	 ms8, 
	 ms16
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
    
    public static MidambleConfigurationBurstType1 valueOf(long value)
    {
	return (MidambleConfigurationBurstType1)ms4.lookupValue(value);
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
	    "MidambleConfigurationBurstType1"
	),
	new QName (
	    "InformationElements",
	    "MidambleConfigurationBurstType1"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "ms4",
		    0
		),
		new MemberListElement (
		    "ms8",
		    1
		),
		new MemberListElement (
		    "ms16",
		    2
		)
	    }
	),
	0,
	ms4
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' MidambleConfigurationBurstType1 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' MidambleConfigurationBurstType1 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for MidambleConfigurationBurstType1
