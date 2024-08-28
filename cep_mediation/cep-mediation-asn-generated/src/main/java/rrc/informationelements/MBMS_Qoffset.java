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
 * Define the ASN1 Type MBMS_Qoffset from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class MBMS_Qoffset extends Enumerated {
    
    /**
     * The default constructor.
     */
    private MBMS_Qoffset()
    {
	super(cFirstNumber);
    }
    
    protected MBMS_Qoffset(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final MBMS_Qoffset q4 =
	new MBMS_Qoffset(0);
    public static final MBMS_Qoffset q8 =
	new MBMS_Qoffset(1);
    public static final MBMS_Qoffset q12 =
	new MBMS_Qoffset(2);
    public static final MBMS_Qoffset q16 =
	new MBMS_Qoffset(3);
    public static final MBMS_Qoffset q20 =
	new MBMS_Qoffset(4);
    public static final MBMS_Qoffset q30 =
	new MBMS_Qoffset(5);
    public static final MBMS_Qoffset q40 =
	new MBMS_Qoffset(6);
    public static final MBMS_Qoffset qInfinity =
	new MBMS_Qoffset(7);
    private final static MBMS_Qoffset cNamedNumbers[] = {
	 q4, 
	 q8, 
	 q12, 
	 q16, 
	 q20, 
	 q30, 
	 q40, 
	 qInfinity
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
    
    public static MBMS_Qoffset valueOf(long value)
    {
	return (MBMS_Qoffset)q4.lookupValue(value);
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
	    "MBMS_Qoffset"
	),
	new QName (
	    "InformationElements",
	    "MBMS-Qoffset"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "q4",
		    0
		),
		new MemberListElement (
		    "q8",
		    1
		),
		new MemberListElement (
		    "q12",
		    2
		),
		new MemberListElement (
		    "q16",
		    3
		),
		new MemberListElement (
		    "q20",
		    4
		),
		new MemberListElement (
		    "q30",
		    5
		),
		new MemberListElement (
		    "q40",
		    6
		),
		new MemberListElement (
		    "qInfinity",
		    7
		)
	    }
	),
	0,
	q4
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' MBMS_Qoffset object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' MBMS_Qoffset object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for MBMS_Qoffset
