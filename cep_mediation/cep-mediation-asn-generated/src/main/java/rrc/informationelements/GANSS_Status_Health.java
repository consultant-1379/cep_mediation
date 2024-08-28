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
 * Define the ASN1 Type GANSS_Status_Health from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class GANSS_Status_Health extends Enumerated {
    
    /**
     * The default constructor.
     */
    private GANSS_Status_Health()
    {
	super(cFirstNumber);
    }
    
    protected GANSS_Status_Health(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final GANSS_Status_Health udre_scale_1dot0 =
	new GANSS_Status_Health(0);
    public static final GANSS_Status_Health udre_scale_0dot75 =
	new GANSS_Status_Health(1);
    public static final GANSS_Status_Health udre_scale_0dot5 =
	new GANSS_Status_Health(2);
    public static final GANSS_Status_Health udre_scale_0dot3 =
	new GANSS_Status_Health(3);
    public static final GANSS_Status_Health udre_scale_0dot2 =
	new GANSS_Status_Health(4);
    public static final GANSS_Status_Health udre_scale_0dot1 =
	new GANSS_Status_Health(5);
    public static final GANSS_Status_Health no_data =
	new GANSS_Status_Health(6);
    public static final GANSS_Status_Health invalid_data =
	new GANSS_Status_Health(7);
    private final static GANSS_Status_Health cNamedNumbers[] = {
	 udre_scale_1dot0, 
	 udre_scale_0dot75, 
	 udre_scale_0dot5, 
	 udre_scale_0dot3, 
	 udre_scale_0dot2, 
	 udre_scale_0dot1, 
	 no_data, 
	 invalid_data
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
    
    public static GANSS_Status_Health valueOf(long value)
    {
	return (GANSS_Status_Health)udre_scale_1dot0.lookupValue(value);
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
	    "GANSS_Status_Health"
	),
	new QName (
	    "InformationElements",
	    "GANSS-Status-Health"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "udre-scale-1dot0",
		    0
		),
		new MemberListElement (
		    "udre-scale-0dot75",
		    1
		),
		new MemberListElement (
		    "udre-scale-0dot5",
		    2
		),
		new MemberListElement (
		    "udre-scale-0dot3",
		    3
		),
		new MemberListElement (
		    "udre-scale-0dot2",
		    4
		),
		new MemberListElement (
		    "udre-scale-0dot1",
		    5
		),
		new MemberListElement (
		    "no-data",
		    6
		),
		new MemberListElement (
		    "invalid-data",
		    7
		)
	    }
	),
	0,
	udre_scale_1dot0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' GANSS_Status_Health object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' GANSS_Status_Health object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for GANSS_Status_Health
