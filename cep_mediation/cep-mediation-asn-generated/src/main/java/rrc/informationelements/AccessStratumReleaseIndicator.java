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
 * Define the ASN1 Type AccessStratumReleaseIndicator from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class AccessStratumReleaseIndicator extends Enumerated {
    
    /**
     * The default constructor.
     */
    private AccessStratumReleaseIndicator()
    {
	super(cFirstNumber);
    }
    
    protected AccessStratumReleaseIndicator(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final AccessStratumReleaseIndicator rel_4 =
	new AccessStratumReleaseIndicator(0);
    public static final AccessStratumReleaseIndicator rel_5 =
	new AccessStratumReleaseIndicator(1);
    public static final AccessStratumReleaseIndicator rel_6 =
	new AccessStratumReleaseIndicator(2);
    public static final AccessStratumReleaseIndicator rel_7 =
	new AccessStratumReleaseIndicator(3);
    public static final AccessStratumReleaseIndicator rel_8 =
	new AccessStratumReleaseIndicator(4);
    public static final AccessStratumReleaseIndicator rel_9 =
	new AccessStratumReleaseIndicator(5);
    public static final AccessStratumReleaseIndicator rel_10 =
	new AccessStratumReleaseIndicator(6);
    public static final AccessStratumReleaseIndicator spare9 =
	new AccessStratumReleaseIndicator(7);
    public static final AccessStratumReleaseIndicator spare8 =
	new AccessStratumReleaseIndicator(8);
    public static final AccessStratumReleaseIndicator spare7 =
	new AccessStratumReleaseIndicator(9);
    public static final AccessStratumReleaseIndicator spare6 =
	new AccessStratumReleaseIndicator(10);
    public static final AccessStratumReleaseIndicator spare5 =
	new AccessStratumReleaseIndicator(11);
    public static final AccessStratumReleaseIndicator spare4 =
	new AccessStratumReleaseIndicator(12);
    public static final AccessStratumReleaseIndicator spare3 =
	new AccessStratumReleaseIndicator(13);
    public static final AccessStratumReleaseIndicator spare2 =
	new AccessStratumReleaseIndicator(14);
    public static final AccessStratumReleaseIndicator spare1 =
	new AccessStratumReleaseIndicator(15);
    private final static AccessStratumReleaseIndicator cNamedNumbers[] = {
	 rel_4, 
	 rel_5, 
	 rel_6, 
	 rel_7, 
	 rel_8, 
	 rel_9, 
	 rel_10, 
	 spare9, 
	 spare8, 
	 spare7, 
	 spare6, 
	 spare5, 
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
    
    public static AccessStratumReleaseIndicator valueOf(long value)
    {
	return (AccessStratumReleaseIndicator)rel_4.lookupValue(value);
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
	    "AccessStratumReleaseIndicator"
	),
	new QName (
	    "InformationElements",
	    "AccessStratumReleaseIndicator"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "rel-4",
		    0
		),
		new MemberListElement (
		    "rel-5",
		    1
		),
		new MemberListElement (
		    "rel-6",
		    2
		),
		new MemberListElement (
		    "rel-7",
		    3
		),
		new MemberListElement (
		    "rel-8",
		    4
		),
		new MemberListElement (
		    "rel-9",
		    5
		),
		new MemberListElement (
		    "rel-10",
		    6
		),
		new MemberListElement (
		    "spare9",
		    7
		),
		new MemberListElement (
		    "spare8",
		    8
		),
		new MemberListElement (
		    "spare7",
		    9
		),
		new MemberListElement (
		    "spare6",
		    10
		),
		new MemberListElement (
		    "spare5",
		    11
		),
		new MemberListElement (
		    "spare4",
		    12
		),
		new MemberListElement (
		    "spare3",
		    13
		),
		new MemberListElement (
		    "spare2",
		    14
		),
		new MemberListElement (
		    "spare1",
		    15
		)
	    }
	),
	0,
	rel_4
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' AccessStratumReleaseIndicator object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' AccessStratumReleaseIndicator object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for AccessStratumReleaseIndicator
