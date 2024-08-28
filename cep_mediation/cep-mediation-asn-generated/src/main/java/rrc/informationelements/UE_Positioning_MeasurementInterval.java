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
 * Define the ASN1 Type UE_Positioning_MeasurementInterval from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class UE_Positioning_MeasurementInterval extends Enumerated {
    
    /**
     * The default constructor.
     */
    private UE_Positioning_MeasurementInterval()
    {
	super(cFirstNumber);
    }
    
    protected UE_Positioning_MeasurementInterval(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final UE_Positioning_MeasurementInterval e5 =
	new UE_Positioning_MeasurementInterval(0);
    public static final UE_Positioning_MeasurementInterval e15 =
	new UE_Positioning_MeasurementInterval(1);
    public static final UE_Positioning_MeasurementInterval e60 =
	new UE_Positioning_MeasurementInterval(2);
    public static final UE_Positioning_MeasurementInterval e300 =
	new UE_Positioning_MeasurementInterval(3);
    public static final UE_Positioning_MeasurementInterval e900 =
	new UE_Positioning_MeasurementInterval(4);
    public static final UE_Positioning_MeasurementInterval e1800 =
	new UE_Positioning_MeasurementInterval(5);
    public static final UE_Positioning_MeasurementInterval e3600 =
	new UE_Positioning_MeasurementInterval(6);
    public static final UE_Positioning_MeasurementInterval e7200 =
	new UE_Positioning_MeasurementInterval(7);
    private final static UE_Positioning_MeasurementInterval cNamedNumbers[] = {
	 e5, 
	 e15, 
	 e60, 
	 e300, 
	 e900, 
	 e1800, 
	 e3600, 
	 e7200
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
    
    public static UE_Positioning_MeasurementInterval valueOf(long value)
    {
	return (UE_Positioning_MeasurementInterval)e5.lookupValue(value);
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
	    "UE_Positioning_MeasurementInterval"
	),
	new QName (
	    "InformationElements",
	    "UE-Positioning-MeasurementInterval"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "e5",
		    0
		),
		new MemberListElement (
		    "e15",
		    1
		),
		new MemberListElement (
		    "e60",
		    2
		),
		new MemberListElement (
		    "e300",
		    3
		),
		new MemberListElement (
		    "e900",
		    4
		),
		new MemberListElement (
		    "e1800",
		    5
		),
		new MemberListElement (
		    "e3600",
		    6
		),
		new MemberListElement (
		    "e7200",
		    7
		)
	    }
	),
	0,
	e5
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' UE_Positioning_MeasurementInterval object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UE_Positioning_MeasurementInterval object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UE_Positioning_MeasurementInterval
