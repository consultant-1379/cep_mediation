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
 * Define the ASN1 Type PositioningMethod from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class PositioningMethod extends Enumerated {
    
    /**
     * The default constructor.
     */
    private PositioningMethod()
    {
	super(cFirstNumber);
    }
    
    protected PositioningMethod(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final PositioningMethod otdoa =
	new PositioningMethod(0);
    public static final PositioningMethod gps =
	new PositioningMethod(1);
    public static final PositioningMethod otdoaOrGPS =
	new PositioningMethod(2);
    public static final PositioningMethod cellID =
	new PositioningMethod(3);
    private final static PositioningMethod cNamedNumbers[] = {
	 otdoa, 
	 gps, 
	 otdoaOrGPS, 
	 cellID
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
    
    public static PositioningMethod valueOf(long value)
    {
	return (PositioningMethod)otdoa.lookupValue(value);
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
	    "PositioningMethod"
	),
	new QName (
	    "InformationElements",
	    "PositioningMethod"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "otdoa",
		    0
		),
		new MemberListElement (
		    "gps",
		    1
		),
		new MemberListElement (
		    "otdoaOrGPS",
		    2
		),
		new MemberListElement (
		    "cellID",
		    3
		)
	    }
	),
	0,
	otdoa
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' PositioningMethod object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' PositioningMethod object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for PositioningMethod
