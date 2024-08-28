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
 * Define the ASN1 Type IS_2000SpecificMeasInfo from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class IS_2000SpecificMeasInfo extends Enumerated {
    
    /**
     * The default constructor.
     */
    private IS_2000SpecificMeasInfo()
    {
	super(cFirstNumber);
    }
    
    protected IS_2000SpecificMeasInfo(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final IS_2000SpecificMeasInfo frequency =
	new IS_2000SpecificMeasInfo(0);
    public static final IS_2000SpecificMeasInfo timeslot =
	new IS_2000SpecificMeasInfo(1);
    public static final IS_2000SpecificMeasInfo colourcode =
	new IS_2000SpecificMeasInfo(2);
    public static final IS_2000SpecificMeasInfo outputpower =
	new IS_2000SpecificMeasInfo(3);
    public static final IS_2000SpecificMeasInfo pn_Offset =
	new IS_2000SpecificMeasInfo(4);
    private final static IS_2000SpecificMeasInfo cNamedNumbers[] = {
	 frequency, 
	 timeslot, 
	 colourcode, 
	 outputpower, 
	 pn_Offset
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
    
    public static IS_2000SpecificMeasInfo valueOf(long value)
    {
	return (IS_2000SpecificMeasInfo)frequency.lookupValue(value);
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
	    "IS_2000SpecificMeasInfo"
	),
	new QName (
	    "InformationElements",
	    "IS-2000SpecificMeasInfo"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "frequency",
		    0
		),
		new MemberListElement (
		    "timeslot",
		    1
		),
		new MemberListElement (
		    "colourcode",
		    2
		),
		new MemberListElement (
		    "outputpower",
		    3
		),
		new MemberListElement (
		    "pn-Offset",
		    4
		)
	    }
	),
	0,
	frequency
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' IS_2000SpecificMeasInfo object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' IS_2000SpecificMeasInfo object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for IS_2000SpecificMeasInfo
