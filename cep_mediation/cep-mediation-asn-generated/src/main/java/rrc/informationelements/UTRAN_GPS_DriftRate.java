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
 * Define the ASN1 Type UTRAN_GPS_DriftRate from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class UTRAN_GPS_DriftRate extends Enumerated {
    
    /**
     * The default constructor.
     */
    private UTRAN_GPS_DriftRate()
    {
	super(cFirstNumber);
    }
    
    protected UTRAN_GPS_DriftRate(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final UTRAN_GPS_DriftRate utran_GPSDrift0 =
	new UTRAN_GPS_DriftRate(0);
    public static final UTRAN_GPS_DriftRate utran_GPSDrift1 =
	new UTRAN_GPS_DriftRate(1);
    public static final UTRAN_GPS_DriftRate utran_GPSDrift2 =
	new UTRAN_GPS_DriftRate(2);
    public static final UTRAN_GPS_DriftRate utran_GPSDrift5 =
	new UTRAN_GPS_DriftRate(3);
    public static final UTRAN_GPS_DriftRate utran_GPSDrift10 =
	new UTRAN_GPS_DriftRate(4);
    public static final UTRAN_GPS_DriftRate utran_GPSDrift15 =
	new UTRAN_GPS_DriftRate(5);
    public static final UTRAN_GPS_DriftRate utran_GPSDrift25 =
	new UTRAN_GPS_DriftRate(6);
    public static final UTRAN_GPS_DriftRate utran_GPSDrift50 =
	new UTRAN_GPS_DriftRate(7);
    public static final UTRAN_GPS_DriftRate utran_GPSDrift_1 =
	new UTRAN_GPS_DriftRate(8);
    public static final UTRAN_GPS_DriftRate utran_GPSDrift_2 =
	new UTRAN_GPS_DriftRate(9);
    public static final UTRAN_GPS_DriftRate utran_GPSDrift_5 =
	new UTRAN_GPS_DriftRate(10);
    public static final UTRAN_GPS_DriftRate utran_GPSDrift_10 =
	new UTRAN_GPS_DriftRate(11);
    public static final UTRAN_GPS_DriftRate utran_GPSDrift_15 =
	new UTRAN_GPS_DriftRate(12);
    public static final UTRAN_GPS_DriftRate utran_GPSDrift_25 =
	new UTRAN_GPS_DriftRate(13);
    public static final UTRAN_GPS_DriftRate utran_GPSDrift_50 =
	new UTRAN_GPS_DriftRate(14);
    private final static UTRAN_GPS_DriftRate cNamedNumbers[] = {
	 utran_GPSDrift0, 
	 utran_GPSDrift1, 
	 utran_GPSDrift2, 
	 utran_GPSDrift5, 
	 utran_GPSDrift10, 
	 utran_GPSDrift15, 
	 utran_GPSDrift25, 
	 utran_GPSDrift50, 
	 utran_GPSDrift_1, 
	 utran_GPSDrift_2, 
	 utran_GPSDrift_5, 
	 utran_GPSDrift_10, 
	 utran_GPSDrift_15, 
	 utran_GPSDrift_25, 
	 utran_GPSDrift_50
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
    
    public static UTRAN_GPS_DriftRate valueOf(long value)
    {
	return (UTRAN_GPS_DriftRate)utran_GPSDrift0.lookupValue(value);
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
	    "UTRAN_GPS_DriftRate"
	),
	new QName (
	    "InformationElements",
	    "UTRAN-GPS-DriftRate"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "utran-GPSDrift0",
		    0
		),
		new MemberListElement (
		    "utran-GPSDrift1",
		    1
		),
		new MemberListElement (
		    "utran-GPSDrift2",
		    2
		),
		new MemberListElement (
		    "utran-GPSDrift5",
		    3
		),
		new MemberListElement (
		    "utran-GPSDrift10",
		    4
		),
		new MemberListElement (
		    "utran-GPSDrift15",
		    5
		),
		new MemberListElement (
		    "utran-GPSDrift25",
		    6
		),
		new MemberListElement (
		    "utran-GPSDrift50",
		    7
		),
		new MemberListElement (
		    "utran-GPSDrift-1",
		    8
		),
		new MemberListElement (
		    "utran-GPSDrift-2",
		    9
		),
		new MemberListElement (
		    "utran-GPSDrift-5",
		    10
		),
		new MemberListElement (
		    "utran-GPSDrift-10",
		    11
		),
		new MemberListElement (
		    "utran-GPSDrift-15",
		    12
		),
		new MemberListElement (
		    "utran-GPSDrift-25",
		    13
		),
		new MemberListElement (
		    "utran-GPSDrift-50",
		    14
		)
	    }
	),
	0,
	utran_GPSDrift0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' UTRAN_GPS_DriftRate object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UTRAN_GPS_DriftRate object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UTRAN_GPS_DriftRate
