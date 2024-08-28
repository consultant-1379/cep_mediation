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
 * Define the ASN1 Type UE_Positioning_GANSS_SBAS_ID from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class UE_Positioning_GANSS_SBAS_ID extends Enumerated {
    
    /**
     * The default constructor.
     */
    private UE_Positioning_GANSS_SBAS_ID()
    {
	super(cFirstNumber);
    }
    
    protected UE_Positioning_GANSS_SBAS_ID(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final UE_Positioning_GANSS_SBAS_ID waas =
	new UE_Positioning_GANSS_SBAS_ID(0);
    public static final UE_Positioning_GANSS_SBAS_ID egnos =
	new UE_Positioning_GANSS_SBAS_ID(1);
    public static final UE_Positioning_GANSS_SBAS_ID msas =
	new UE_Positioning_GANSS_SBAS_ID(2);
    public static final UE_Positioning_GANSS_SBAS_ID gagan =
	new UE_Positioning_GANSS_SBAS_ID(3);
    public static final UE_Positioning_GANSS_SBAS_ID spare4 =
	new UE_Positioning_GANSS_SBAS_ID(4);
    public static final UE_Positioning_GANSS_SBAS_ID spare3 =
	new UE_Positioning_GANSS_SBAS_ID(5);
    public static final UE_Positioning_GANSS_SBAS_ID spare2 =
	new UE_Positioning_GANSS_SBAS_ID(6);
    public static final UE_Positioning_GANSS_SBAS_ID spare1 =
	new UE_Positioning_GANSS_SBAS_ID(7);
    private final static UE_Positioning_GANSS_SBAS_ID cNamedNumbers[] = {
	 waas, 
	 egnos, 
	 msas, 
	 gagan, 
	 spare4, 
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
    
    public static UE_Positioning_GANSS_SBAS_ID valueOf(long value)
    {
	return (UE_Positioning_GANSS_SBAS_ID)waas.lookupValue(value);
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
	    "UE_Positioning_GANSS_SBAS_ID"
	),
	new QName (
	    "InformationElements",
	    "UE-Positioning-GANSS-SBAS-ID"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "waas",
		    0
		),
		new MemberListElement (
		    "egnos",
		    1
		),
		new MemberListElement (
		    "msas",
		    2
		),
		new MemberListElement (
		    "gagan",
		    3
		),
		new MemberListElement (
		    "spare4",
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
	waas
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' UE_Positioning_GANSS_SBAS_ID object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UE_Positioning_GANSS_SBAS_ID object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UE_Positioning_GANSS_SBAS_ID
