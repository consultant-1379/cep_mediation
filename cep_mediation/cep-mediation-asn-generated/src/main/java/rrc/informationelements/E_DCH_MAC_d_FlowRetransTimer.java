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
 * Define the ASN1 Type E_DCH_MAC_d_FlowRetransTimer from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class E_DCH_MAC_d_FlowRetransTimer extends Enumerated {
    
    /**
     * The default constructor.
     */
    private E_DCH_MAC_d_FlowRetransTimer()
    {
	super(cFirstNumber);
    }
    
    protected E_DCH_MAC_d_FlowRetransTimer(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final E_DCH_MAC_d_FlowRetransTimer ms10 =
	new E_DCH_MAC_d_FlowRetransTimer(0);
    public static final E_DCH_MAC_d_FlowRetransTimer ms15 =
	new E_DCH_MAC_d_FlowRetransTimer(1);
    public static final E_DCH_MAC_d_FlowRetransTimer ms20 =
	new E_DCH_MAC_d_FlowRetransTimer(2);
    public static final E_DCH_MAC_d_FlowRetransTimer ms25 =
	new E_DCH_MAC_d_FlowRetransTimer(3);
    public static final E_DCH_MAC_d_FlowRetransTimer ms30 =
	new E_DCH_MAC_d_FlowRetransTimer(4);
    public static final E_DCH_MAC_d_FlowRetransTimer ms35 =
	new E_DCH_MAC_d_FlowRetransTimer(5);
    public static final E_DCH_MAC_d_FlowRetransTimer ms40 =
	new E_DCH_MAC_d_FlowRetransTimer(6);
    public static final E_DCH_MAC_d_FlowRetransTimer ms45 =
	new E_DCH_MAC_d_FlowRetransTimer(7);
    public static final E_DCH_MAC_d_FlowRetransTimer ms50 =
	new E_DCH_MAC_d_FlowRetransTimer(8);
    public static final E_DCH_MAC_d_FlowRetransTimer ms55 =
	new E_DCH_MAC_d_FlowRetransTimer(9);
    public static final E_DCH_MAC_d_FlowRetransTimer ms60 =
	new E_DCH_MAC_d_FlowRetransTimer(10);
    public static final E_DCH_MAC_d_FlowRetransTimer ms65 =
	new E_DCH_MAC_d_FlowRetransTimer(11);
    public static final E_DCH_MAC_d_FlowRetransTimer ms70 =
	new E_DCH_MAC_d_FlowRetransTimer(12);
    public static final E_DCH_MAC_d_FlowRetransTimer ms75 =
	new E_DCH_MAC_d_FlowRetransTimer(13);
    public static final E_DCH_MAC_d_FlowRetransTimer ms80 =
	new E_DCH_MAC_d_FlowRetransTimer(14);
    public static final E_DCH_MAC_d_FlowRetransTimer ms85 =
	new E_DCH_MAC_d_FlowRetransTimer(15);
    public static final E_DCH_MAC_d_FlowRetransTimer ms90 =
	new E_DCH_MAC_d_FlowRetransTimer(16);
    public static final E_DCH_MAC_d_FlowRetransTimer ms95 =
	new E_DCH_MAC_d_FlowRetransTimer(17);
    public static final E_DCH_MAC_d_FlowRetransTimer ms100 =
	new E_DCH_MAC_d_FlowRetransTimer(18);
    public static final E_DCH_MAC_d_FlowRetransTimer ms110 =
	new E_DCH_MAC_d_FlowRetransTimer(19);
    public static final E_DCH_MAC_d_FlowRetransTimer ms120 =
	new E_DCH_MAC_d_FlowRetransTimer(20);
    public static final E_DCH_MAC_d_FlowRetransTimer ms140 =
	new E_DCH_MAC_d_FlowRetransTimer(21);
    public static final E_DCH_MAC_d_FlowRetransTimer ms160 =
	new E_DCH_MAC_d_FlowRetransTimer(22);
    public static final E_DCH_MAC_d_FlowRetransTimer ms200 =
	new E_DCH_MAC_d_FlowRetransTimer(23);
    public static final E_DCH_MAC_d_FlowRetransTimer ms240 =
	new E_DCH_MAC_d_FlowRetransTimer(24);
    public static final E_DCH_MAC_d_FlowRetransTimer ms280 =
	new E_DCH_MAC_d_FlowRetransTimer(25);
    public static final E_DCH_MAC_d_FlowRetransTimer ms320 =
	new E_DCH_MAC_d_FlowRetransTimer(26);
    public static final E_DCH_MAC_d_FlowRetransTimer ms400 =
	new E_DCH_MAC_d_FlowRetransTimer(27);
    public static final E_DCH_MAC_d_FlowRetransTimer ms480 =
	new E_DCH_MAC_d_FlowRetransTimer(28);
    public static final E_DCH_MAC_d_FlowRetransTimer ms560 =
	new E_DCH_MAC_d_FlowRetransTimer(29);
    private final static E_DCH_MAC_d_FlowRetransTimer cNamedNumbers[] = {
	 ms10, 
	 ms15, 
	 ms20, 
	 ms25, 
	 ms30, 
	 ms35, 
	 ms40, 
	 ms45, 
	 ms50, 
	 ms55, 
	 ms60, 
	 ms65, 
	 ms70, 
	 ms75, 
	 ms80, 
	 ms85, 
	 ms90, 
	 ms95, 
	 ms100, 
	 ms110, 
	 ms120, 
	 ms140, 
	 ms160, 
	 ms200, 
	 ms240, 
	 ms280, 
	 ms320, 
	 ms400, 
	 ms480, 
	 ms560
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
    
    public static E_DCH_MAC_d_FlowRetransTimer valueOf(long value)
    {
	return (E_DCH_MAC_d_FlowRetransTimer)ms10.lookupValue(value);
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
	    "E_DCH_MAC_d_FlowRetransTimer"
	),
	new QName (
	    "InformationElements",
	    "E-DCH-MAC-d-FlowRetransTimer"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "ms10",
		    0
		),
		new MemberListElement (
		    "ms15",
		    1
		),
		new MemberListElement (
		    "ms20",
		    2
		),
		new MemberListElement (
		    "ms25",
		    3
		),
		new MemberListElement (
		    "ms30",
		    4
		),
		new MemberListElement (
		    "ms35",
		    5
		),
		new MemberListElement (
		    "ms40",
		    6
		),
		new MemberListElement (
		    "ms45",
		    7
		),
		new MemberListElement (
		    "ms50",
		    8
		),
		new MemberListElement (
		    "ms55",
		    9
		),
		new MemberListElement (
		    "ms60",
		    10
		),
		new MemberListElement (
		    "ms65",
		    11
		),
		new MemberListElement (
		    "ms70",
		    12
		),
		new MemberListElement (
		    "ms75",
		    13
		),
		new MemberListElement (
		    "ms80",
		    14
		),
		new MemberListElement (
		    "ms85",
		    15
		),
		new MemberListElement (
		    "ms90",
		    16
		),
		new MemberListElement (
		    "ms95",
		    17
		),
		new MemberListElement (
		    "ms100",
		    18
		),
		new MemberListElement (
		    "ms110",
		    19
		),
		new MemberListElement (
		    "ms120",
		    20
		),
		new MemberListElement (
		    "ms140",
		    21
		),
		new MemberListElement (
		    "ms160",
		    22
		),
		new MemberListElement (
		    "ms200",
		    23
		),
		new MemberListElement (
		    "ms240",
		    24
		),
		new MemberListElement (
		    "ms280",
		    25
		),
		new MemberListElement (
		    "ms320",
		    26
		),
		new MemberListElement (
		    "ms400",
		    27
		),
		new MemberListElement (
		    "ms480",
		    28
		),
		new MemberListElement (
		    "ms560",
		    29
		)
	    }
	),
	0,
	ms10
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' E_DCH_MAC_d_FlowRetransTimer object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' E_DCH_MAC_d_FlowRetransTimer object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for E_DCH_MAC_d_FlowRetransTimer
