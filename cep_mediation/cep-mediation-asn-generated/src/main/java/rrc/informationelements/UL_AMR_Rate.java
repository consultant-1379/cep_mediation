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
 * Define the ASN1 Type UL_AMR_Rate from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class UL_AMR_Rate extends Enumerated {
    
    /**
     * The default constructor.
     */
    private UL_AMR_Rate()
    {
	super(cFirstNumber);
    }
    
    protected UL_AMR_Rate(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final UL_AMR_Rate t0 =
	new UL_AMR_Rate(0);
    public static final UL_AMR_Rate t1 =
	new UL_AMR_Rate(1);
    public static final UL_AMR_Rate t2 =
	new UL_AMR_Rate(2);
    public static final UL_AMR_Rate t3 =
	new UL_AMR_Rate(3);
    public static final UL_AMR_Rate t4 =
	new UL_AMR_Rate(4);
    public static final UL_AMR_Rate t5 =
	new UL_AMR_Rate(5);
    public static final UL_AMR_Rate t6 =
	new UL_AMR_Rate(6);
    public static final UL_AMR_Rate t7 =
	new UL_AMR_Rate(7);
    public static final UL_AMR_Rate t8 =
	new UL_AMR_Rate(8);
    public static final UL_AMR_Rate spare7 =
	new UL_AMR_Rate(9);
    public static final UL_AMR_Rate spare6 =
	new UL_AMR_Rate(10);
    public static final UL_AMR_Rate spare5 =
	new UL_AMR_Rate(11);
    public static final UL_AMR_Rate spare4 =
	new UL_AMR_Rate(12);
    public static final UL_AMR_Rate spare3 =
	new UL_AMR_Rate(13);
    public static final UL_AMR_Rate spare2 =
	new UL_AMR_Rate(14);
    public static final UL_AMR_Rate spare1 =
	new UL_AMR_Rate(15);
    private final static UL_AMR_Rate cNamedNumbers[] = {
	 t0, 
	 t1, 
	 t2, 
	 t3, 
	 t4, 
	 t5, 
	 t6, 
	 t7, 
	 t8, 
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
    
    public static UL_AMR_Rate valueOf(long value)
    {
	return (UL_AMR_Rate)t0.lookupValue(value);
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
	    "UL_AMR_Rate"
	),
	new QName (
	    "InformationElements",
	    "UL-AMR-Rate"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "t0",
		    0
		),
		new MemberListElement (
		    "t1",
		    1
		),
		new MemberListElement (
		    "t2",
		    2
		),
		new MemberListElement (
		    "t3",
		    3
		),
		new MemberListElement (
		    "t4",
		    4
		),
		new MemberListElement (
		    "t5",
		    5
		),
		new MemberListElement (
		    "t6",
		    6
		),
		new MemberListElement (
		    "t7",
		    7
		),
		new MemberListElement (
		    "t8",
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
	t0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' UL_AMR_Rate object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UL_AMR_Rate object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UL_AMR_Rate
