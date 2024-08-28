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
 * Define the ASN1 Type MBMS_MICHNotificationIndLength from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class MBMS_MICHNotificationIndLength extends Enumerated {
    
    /**
     * The default constructor.
     */
    private MBMS_MICHNotificationIndLength()
    {
	super(cFirstNumber);
    }
    
    protected MBMS_MICHNotificationIndLength(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final MBMS_MICHNotificationIndLength mn4 =
	new MBMS_MICHNotificationIndLength(0);
    public static final MBMS_MICHNotificationIndLength mn8 =
	new MBMS_MICHNotificationIndLength(1);
    public static final MBMS_MICHNotificationIndLength mn16 =
	new MBMS_MICHNotificationIndLength(2);
    private final static MBMS_MICHNotificationIndLength cNamedNumbers[] = {
	 mn4, 
	 mn8, 
	 mn16
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
    
    public static MBMS_MICHNotificationIndLength valueOf(long value)
    {
	return (MBMS_MICHNotificationIndLength)mn4.lookupValue(value);
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
	    "MBMS_MICHNotificationIndLength"
	),
	new QName (
	    "InformationElements",
	    "MBMS-MICHNotificationIndLength"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "mn4",
		    0
		),
		new MemberListElement (
		    "mn8",
		    1
		),
		new MemberListElement (
		    "mn16",
		    2
		)
	    }
	),
	0,
	mn4
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' MBMS_MICHNotificationIndLength object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' MBMS_MICHNotificationIndLength object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for MBMS_MICHNotificationIndLength
