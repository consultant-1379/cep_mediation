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
 * Define the ASN1 Type TimerPoll from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class TimerPoll extends Enumerated {
    
    /**
     * The default constructor.
     */
    private TimerPoll()
    {
	super(cFirstNumber);
    }
    
    protected TimerPoll(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final TimerPoll tp10 =
	new TimerPoll(0);
    public static final TimerPoll tp20 =
	new TimerPoll(1);
    public static final TimerPoll tp30 =
	new TimerPoll(2);
    public static final TimerPoll tp40 =
	new TimerPoll(3);
    public static final TimerPoll tp50 =
	new TimerPoll(4);
    public static final TimerPoll tp60 =
	new TimerPoll(5);
    public static final TimerPoll tp70 =
	new TimerPoll(6);
    public static final TimerPoll tp80 =
	new TimerPoll(7);
    public static final TimerPoll tp90 =
	new TimerPoll(8);
    public static final TimerPoll tp100 =
	new TimerPoll(9);
    public static final TimerPoll tp110 =
	new TimerPoll(10);
    public static final TimerPoll tp120 =
	new TimerPoll(11);
    public static final TimerPoll tp130 =
	new TimerPoll(12);
    public static final TimerPoll tp140 =
	new TimerPoll(13);
    public static final TimerPoll tp150 =
	new TimerPoll(14);
    public static final TimerPoll tp160 =
	new TimerPoll(15);
    public static final TimerPoll tp170 =
	new TimerPoll(16);
    public static final TimerPoll tp180 =
	new TimerPoll(17);
    public static final TimerPoll tp190 =
	new TimerPoll(18);
    public static final TimerPoll tp200 =
	new TimerPoll(19);
    public static final TimerPoll tp210 =
	new TimerPoll(20);
    public static final TimerPoll tp220 =
	new TimerPoll(21);
    public static final TimerPoll tp230 =
	new TimerPoll(22);
    public static final TimerPoll tp240 =
	new TimerPoll(23);
    public static final TimerPoll tp250 =
	new TimerPoll(24);
    public static final TimerPoll tp260 =
	new TimerPoll(25);
    public static final TimerPoll tp270 =
	new TimerPoll(26);
    public static final TimerPoll tp280 =
	new TimerPoll(27);
    public static final TimerPoll tp290 =
	new TimerPoll(28);
    public static final TimerPoll tp300 =
	new TimerPoll(29);
    public static final TimerPoll tp310 =
	new TimerPoll(30);
    public static final TimerPoll tp320 =
	new TimerPoll(31);
    public static final TimerPoll tp330 =
	new TimerPoll(32);
    public static final TimerPoll tp340 =
	new TimerPoll(33);
    public static final TimerPoll tp350 =
	new TimerPoll(34);
    public static final TimerPoll tp360 =
	new TimerPoll(35);
    public static final TimerPoll tp370 =
	new TimerPoll(36);
    public static final TimerPoll tp380 =
	new TimerPoll(37);
    public static final TimerPoll tp390 =
	new TimerPoll(38);
    public static final TimerPoll tp400 =
	new TimerPoll(39);
    public static final TimerPoll tp410 =
	new TimerPoll(40);
    public static final TimerPoll tp420 =
	new TimerPoll(41);
    public static final TimerPoll tp430 =
	new TimerPoll(42);
    public static final TimerPoll tp440 =
	new TimerPoll(43);
    public static final TimerPoll tp450 =
	new TimerPoll(44);
    public static final TimerPoll tp460 =
	new TimerPoll(45);
    public static final TimerPoll tp470 =
	new TimerPoll(46);
    public static final TimerPoll tp480 =
	new TimerPoll(47);
    public static final TimerPoll tp490 =
	new TimerPoll(48);
    public static final TimerPoll tp500 =
	new TimerPoll(49);
    public static final TimerPoll tp510 =
	new TimerPoll(50);
    public static final TimerPoll tp520 =
	new TimerPoll(51);
    public static final TimerPoll tp530 =
	new TimerPoll(52);
    public static final TimerPoll tp540 =
	new TimerPoll(53);
    public static final TimerPoll tp550 =
	new TimerPoll(54);
    public static final TimerPoll tp600 =
	new TimerPoll(55);
    public static final TimerPoll tp650 =
	new TimerPoll(56);
    public static final TimerPoll tp700 =
	new TimerPoll(57);
    public static final TimerPoll tp750 =
	new TimerPoll(58);
    public static final TimerPoll tp800 =
	new TimerPoll(59);
    public static final TimerPoll tp850 =
	new TimerPoll(60);
    public static final TimerPoll tp900 =
	new TimerPoll(61);
    public static final TimerPoll tp950 =
	new TimerPoll(62);
    public static final TimerPoll tp1000 =
	new TimerPoll(63);
    private final static TimerPoll cNamedNumbers[] = {
	 tp10, 
	 tp20, 
	 tp30, 
	 tp40, 
	 tp50, 
	 tp60, 
	 tp70, 
	 tp80, 
	 tp90, 
	 tp100, 
	 tp110, 
	 tp120, 
	 tp130, 
	 tp140, 
	 tp150, 
	 tp160, 
	 tp170, 
	 tp180, 
	 tp190, 
	 tp200, 
	 tp210, 
	 tp220, 
	 tp230, 
	 tp240, 
	 tp250, 
	 tp260, 
	 tp270, 
	 tp280, 
	 tp290, 
	 tp300, 
	 tp310, 
	 tp320, 
	 tp330, 
	 tp340, 
	 tp350, 
	 tp360, 
	 tp370, 
	 tp380, 
	 tp390, 
	 tp400, 
	 tp410, 
	 tp420, 
	 tp430, 
	 tp440, 
	 tp450, 
	 tp460, 
	 tp470, 
	 tp480, 
	 tp490, 
	 tp500, 
	 tp510, 
	 tp520, 
	 tp530, 
	 tp540, 
	 tp550, 
	 tp600, 
	 tp650, 
	 tp700, 
	 tp750, 
	 tp800, 
	 tp850, 
	 tp900, 
	 tp950, 
	 tp1000
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
    
    public static TimerPoll valueOf(long value)
    {
	return (TimerPoll)tp10.lookupValue(value);
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
	    "TimerPoll"
	),
	new QName (
	    "InformationElements",
	    "TimerPoll"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "tp10",
		    0
		),
		new MemberListElement (
		    "tp20",
		    1
		),
		new MemberListElement (
		    "tp30",
		    2
		),
		new MemberListElement (
		    "tp40",
		    3
		),
		new MemberListElement (
		    "tp50",
		    4
		),
		new MemberListElement (
		    "tp60",
		    5
		),
		new MemberListElement (
		    "tp70",
		    6
		),
		new MemberListElement (
		    "tp80",
		    7
		),
		new MemberListElement (
		    "tp90",
		    8
		),
		new MemberListElement (
		    "tp100",
		    9
		),
		new MemberListElement (
		    "tp110",
		    10
		),
		new MemberListElement (
		    "tp120",
		    11
		),
		new MemberListElement (
		    "tp130",
		    12
		),
		new MemberListElement (
		    "tp140",
		    13
		),
		new MemberListElement (
		    "tp150",
		    14
		),
		new MemberListElement (
		    "tp160",
		    15
		),
		new MemberListElement (
		    "tp170",
		    16
		),
		new MemberListElement (
		    "tp180",
		    17
		),
		new MemberListElement (
		    "tp190",
		    18
		),
		new MemberListElement (
		    "tp200",
		    19
		),
		new MemberListElement (
		    "tp210",
		    20
		),
		new MemberListElement (
		    "tp220",
		    21
		),
		new MemberListElement (
		    "tp230",
		    22
		),
		new MemberListElement (
		    "tp240",
		    23
		),
		new MemberListElement (
		    "tp250",
		    24
		),
		new MemberListElement (
		    "tp260",
		    25
		),
		new MemberListElement (
		    "tp270",
		    26
		),
		new MemberListElement (
		    "tp280",
		    27
		),
		new MemberListElement (
		    "tp290",
		    28
		),
		new MemberListElement (
		    "tp300",
		    29
		),
		new MemberListElement (
		    "tp310",
		    30
		),
		new MemberListElement (
		    "tp320",
		    31
		),
		new MemberListElement (
		    "tp330",
		    32
		),
		new MemberListElement (
		    "tp340",
		    33
		),
		new MemberListElement (
		    "tp350",
		    34
		),
		new MemberListElement (
		    "tp360",
		    35
		),
		new MemberListElement (
		    "tp370",
		    36
		),
		new MemberListElement (
		    "tp380",
		    37
		),
		new MemberListElement (
		    "tp390",
		    38
		),
		new MemberListElement (
		    "tp400",
		    39
		),
		new MemberListElement (
		    "tp410",
		    40
		),
		new MemberListElement (
		    "tp420",
		    41
		),
		new MemberListElement (
		    "tp430",
		    42
		),
		new MemberListElement (
		    "tp440",
		    43
		),
		new MemberListElement (
		    "tp450",
		    44
		),
		new MemberListElement (
		    "tp460",
		    45
		),
		new MemberListElement (
		    "tp470",
		    46
		),
		new MemberListElement (
		    "tp480",
		    47
		),
		new MemberListElement (
		    "tp490",
		    48
		),
		new MemberListElement (
		    "tp500",
		    49
		),
		new MemberListElement (
		    "tp510",
		    50
		),
		new MemberListElement (
		    "tp520",
		    51
		),
		new MemberListElement (
		    "tp530",
		    52
		),
		new MemberListElement (
		    "tp540",
		    53
		),
		new MemberListElement (
		    "tp550",
		    54
		),
		new MemberListElement (
		    "tp600",
		    55
		),
		new MemberListElement (
		    "tp650",
		    56
		),
		new MemberListElement (
		    "tp700",
		    57
		),
		new MemberListElement (
		    "tp750",
		    58
		),
		new MemberListElement (
		    "tp800",
		    59
		),
		new MemberListElement (
		    "tp850",
		    60
		),
		new MemberListElement (
		    "tp900",
		    61
		),
		new MemberListElement (
		    "tp950",
		    62
		),
		new MemberListElement (
		    "tp1000",
		    63
		)
	    }
	),
	0,
	tp10
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' TimerPoll object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' TimerPoll object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for TimerPoll
