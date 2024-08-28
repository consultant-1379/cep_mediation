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
 * Define the ASN1 Type TimeSlotLCR_ext from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class TimeSlotLCR_ext extends Enumerated {
    
    /**
     * The default constructor.
     */
    private TimeSlotLCR_ext()
    {
	super(cFirstNumber);
    }
    
    protected TimeSlotLCR_ext(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final TimeSlotLCR_ext ts7 =
	new TimeSlotLCR_ext(0);
    public static final TimeSlotLCR_ext spare3 =
	new TimeSlotLCR_ext(1);
    public static final TimeSlotLCR_ext spare2 =
	new TimeSlotLCR_ext(2);
    public static final TimeSlotLCR_ext spare1 =
	new TimeSlotLCR_ext(3);
    private final static TimeSlotLCR_ext cNamedNumbers[] = {
	 ts7, 
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
    
    public static TimeSlotLCR_ext valueOf(long value)
    {
	return (TimeSlotLCR_ext)ts7.lookupValue(value);
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
	    "TimeSlotLCR_ext"
	),
	new QName (
	    "InformationElements",
	    "TimeSlotLCR-ext"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "ts7",
		    0
		),
		new MemberListElement (
		    "spare3",
		    1
		),
		new MemberListElement (
		    "spare2",
		    2
		),
		new MemberListElement (
		    "spare1",
		    3
		)
	    }
	),
	0,
	ts7
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' TimeSlotLCR_ext object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' TimeSlotLCR_ext object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for TimeSlotLCR_ext
