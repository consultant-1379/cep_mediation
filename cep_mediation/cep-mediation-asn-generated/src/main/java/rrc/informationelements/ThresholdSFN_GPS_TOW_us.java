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
 * Define the ASN1 Type ThresholdSFN_GPS_TOW_us from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class ThresholdSFN_GPS_TOW_us extends Enumerated {
    
    /**
     * The default constructor.
     */
    private ThresholdSFN_GPS_TOW_us()
    {
	super(cFirstNumber);
    }
    
    protected ThresholdSFN_GPS_TOW_us(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final ThresholdSFN_GPS_TOW_us us1 =
	new ThresholdSFN_GPS_TOW_us(0);
    public static final ThresholdSFN_GPS_TOW_us us2 =
	new ThresholdSFN_GPS_TOW_us(1);
    public static final ThresholdSFN_GPS_TOW_us us3 =
	new ThresholdSFN_GPS_TOW_us(2);
    public static final ThresholdSFN_GPS_TOW_us us5 =
	new ThresholdSFN_GPS_TOW_us(3);
    public static final ThresholdSFN_GPS_TOW_us us10 =
	new ThresholdSFN_GPS_TOW_us(4);
    public static final ThresholdSFN_GPS_TOW_us us20 =
	new ThresholdSFN_GPS_TOW_us(5);
    public static final ThresholdSFN_GPS_TOW_us us50 =
	new ThresholdSFN_GPS_TOW_us(6);
    public static final ThresholdSFN_GPS_TOW_us us100 =
	new ThresholdSFN_GPS_TOW_us(7);
    private final static ThresholdSFN_GPS_TOW_us cNamedNumbers[] = {
	 us1, 
	 us2, 
	 us3, 
	 us5, 
	 us10, 
	 us20, 
	 us50, 
	 us100
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
    
    public static ThresholdSFN_GPS_TOW_us valueOf(long value)
    {
	return (ThresholdSFN_GPS_TOW_us)us1.lookupValue(value);
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
	    "ThresholdSFN_GPS_TOW_us"
	),
	new QName (
	    "InformationElements",
	    "ThresholdSFN-GPS-TOW-us"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "us1",
		    0
		),
		new MemberListElement (
		    "us2",
		    1
		),
		new MemberListElement (
		    "us3",
		    2
		),
		new MemberListElement (
		    "us5",
		    3
		),
		new MemberListElement (
		    "us10",
		    4
		),
		new MemberListElement (
		    "us20",
		    5
		),
		new MemberListElement (
		    "us50",
		    6
		),
		new MemberListElement (
		    "us100",
		    7
		)
	    }
	),
	0,
	us1
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' ThresholdSFN_GPS_TOW_us object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' ThresholdSFN_GPS_TOW_us object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for ThresholdSFN_GPS_TOW_us
