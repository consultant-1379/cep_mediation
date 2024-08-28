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
 * Define the ASN1 Type FilterCoefficient from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class FilterCoefficient extends Enumerated {
    
    /**
     * The default constructor.
     */
    private FilterCoefficient()
    {
	super(cFirstNumber);
    }
    
    protected FilterCoefficient(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final FilterCoefficient fc0 =
	new FilterCoefficient(0);
    public static final FilterCoefficient fc1 =
	new FilterCoefficient(1);
    public static final FilterCoefficient fc2 =
	new FilterCoefficient(2);
    public static final FilterCoefficient fc3 =
	new FilterCoefficient(3);
    public static final FilterCoefficient fc4 =
	new FilterCoefficient(4);
    public static final FilterCoefficient fc5 =
	new FilterCoefficient(5);
    public static final FilterCoefficient fc6 =
	new FilterCoefficient(6);
    public static final FilterCoefficient fc7 =
	new FilterCoefficient(7);
    public static final FilterCoefficient fc8 =
	new FilterCoefficient(8);
    public static final FilterCoefficient fc9 =
	new FilterCoefficient(9);
    public static final FilterCoefficient fc11 =
	new FilterCoefficient(10);
    public static final FilterCoefficient fc13 =
	new FilterCoefficient(11);
    public static final FilterCoefficient fc15 =
	new FilterCoefficient(12);
    public static final FilterCoefficient fc17 =
	new FilterCoefficient(13);
    public static final FilterCoefficient fc19 =
	new FilterCoefficient(14);
    public static final FilterCoefficient spare1 =
	new FilterCoefficient(15);
    private final static FilterCoefficient cNamedNumbers[] = {
	 fc0, 
	 fc1, 
	 fc2, 
	 fc3, 
	 fc4, 
	 fc5, 
	 fc6, 
	 fc7, 
	 fc8, 
	 fc9, 
	 fc11, 
	 fc13, 
	 fc15, 
	 fc17, 
	 fc19, 
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
    
    public static FilterCoefficient valueOf(long value)
    {
	return (FilterCoefficient)fc0.lookupValue(value);
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
	    "FilterCoefficient"
	),
	new QName (
	    "InformationElements",
	    "FilterCoefficient"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "fc0",
		    0
		),
		new MemberListElement (
		    "fc1",
		    1
		),
		new MemberListElement (
		    "fc2",
		    2
		),
		new MemberListElement (
		    "fc3",
		    3
		),
		new MemberListElement (
		    "fc4",
		    4
		),
		new MemberListElement (
		    "fc5",
		    5
		),
		new MemberListElement (
		    "fc6",
		    6
		),
		new MemberListElement (
		    "fc7",
		    7
		),
		new MemberListElement (
		    "fc8",
		    8
		),
		new MemberListElement (
		    "fc9",
		    9
		),
		new MemberListElement (
		    "fc11",
		    10
		),
		new MemberListElement (
		    "fc13",
		    11
		),
		new MemberListElement (
		    "fc15",
		    12
		),
		new MemberListElement (
		    "fc17",
		    13
		),
		new MemberListElement (
		    "fc19",
		    14
		),
		new MemberListElement (
		    "spare1",
		    15
		)
	    }
	),
	0,
	fc0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' FilterCoefficient object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' FilterCoefficient object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for FilterCoefficient
