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
 * Define the ASN1 Type MIMO_N_M_Ratio from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class MIMO_N_M_Ratio extends Enumerated {
    
    /**
     * The default constructor.
     */
    private MIMO_N_M_Ratio()
    {
	super(cFirstNumber);
    }
    
    protected MIMO_N_M_Ratio(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final MIMO_N_M_Ratio mnm1_2 =
	new MIMO_N_M_Ratio(0);
    public static final MIMO_N_M_Ratio mnm2_3 =
	new MIMO_N_M_Ratio(1);
    public static final MIMO_N_M_Ratio mnm3_4 =
	new MIMO_N_M_Ratio(2);
    public static final MIMO_N_M_Ratio mnm4_5 =
	new MIMO_N_M_Ratio(3);
    public static final MIMO_N_M_Ratio mnm5_6 =
	new MIMO_N_M_Ratio(4);
    public static final MIMO_N_M_Ratio mnm6_7 =
	new MIMO_N_M_Ratio(5);
    public static final MIMO_N_M_Ratio mnm7_8 =
	new MIMO_N_M_Ratio(6);
    public static final MIMO_N_M_Ratio mnm8_9 =
	new MIMO_N_M_Ratio(7);
    public static final MIMO_N_M_Ratio mnm9_10 =
	new MIMO_N_M_Ratio(8);
    public static final MIMO_N_M_Ratio mnm1_1 =
	new MIMO_N_M_Ratio(9);
    private final static MIMO_N_M_Ratio cNamedNumbers[] = {
	 mnm1_2, 
	 mnm2_3, 
	 mnm3_4, 
	 mnm4_5, 
	 mnm5_6, 
	 mnm6_7, 
	 mnm7_8, 
	 mnm8_9, 
	 mnm9_10, 
	 mnm1_1
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
    
    public static MIMO_N_M_Ratio valueOf(long value)
    {
	return (MIMO_N_M_Ratio)mnm1_2.lookupValue(value);
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
	    "MIMO_N_M_Ratio"
	),
	new QName (
	    "InformationElements",
	    "MIMO-N-M-Ratio"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "mnm1-2",
		    0
		),
		new MemberListElement (
		    "mnm2-3",
		    1
		),
		new MemberListElement (
		    "mnm3-4",
		    2
		),
		new MemberListElement (
		    "mnm4-5",
		    3
		),
		new MemberListElement (
		    "mnm5-6",
		    4
		),
		new MemberListElement (
		    "mnm6-7",
		    5
		),
		new MemberListElement (
		    "mnm7-8",
		    6
		),
		new MemberListElement (
		    "mnm8-9",
		    7
		),
		new MemberListElement (
		    "mnm9-10",
		    8
		),
		new MemberListElement (
		    "mnm1-1",
		    9
		)
	    }
	),
	0,
	mnm1_2
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' MIMO_N_M_Ratio object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' MIMO_N_M_Ratio object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for MIMO_N_M_Ratio
