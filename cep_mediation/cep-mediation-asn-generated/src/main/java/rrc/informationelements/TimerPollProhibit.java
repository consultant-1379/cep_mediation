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
 * Define the ASN1 Type TimerPollProhibit from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class TimerPollProhibit extends Enumerated {
    
    /**
     * The default constructor.
     */
    private TimerPollProhibit()
    {
	super(cFirstNumber);
    }
    
    protected TimerPollProhibit(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final TimerPollProhibit tpp10 =
	new TimerPollProhibit(0);
    public static final TimerPollProhibit tpp20 =
	new TimerPollProhibit(1);
    public static final TimerPollProhibit tpp30 =
	new TimerPollProhibit(2);
    public static final TimerPollProhibit tpp40 =
	new TimerPollProhibit(3);
    public static final TimerPollProhibit tpp50 =
	new TimerPollProhibit(4);
    public static final TimerPollProhibit tpp60 =
	new TimerPollProhibit(5);
    public static final TimerPollProhibit tpp70 =
	new TimerPollProhibit(6);
    public static final TimerPollProhibit tpp80 =
	new TimerPollProhibit(7);
    public static final TimerPollProhibit tpp90 =
	new TimerPollProhibit(8);
    public static final TimerPollProhibit tpp100 =
	new TimerPollProhibit(9);
    public static final TimerPollProhibit tpp110 =
	new TimerPollProhibit(10);
    public static final TimerPollProhibit tpp120 =
	new TimerPollProhibit(11);
    public static final TimerPollProhibit tpp130 =
	new TimerPollProhibit(12);
    public static final TimerPollProhibit tpp140 =
	new TimerPollProhibit(13);
    public static final TimerPollProhibit tpp150 =
	new TimerPollProhibit(14);
    public static final TimerPollProhibit tpp160 =
	new TimerPollProhibit(15);
    public static final TimerPollProhibit tpp170 =
	new TimerPollProhibit(16);
    public static final TimerPollProhibit tpp180 =
	new TimerPollProhibit(17);
    public static final TimerPollProhibit tpp190 =
	new TimerPollProhibit(18);
    public static final TimerPollProhibit tpp200 =
	new TimerPollProhibit(19);
    public static final TimerPollProhibit tpp210 =
	new TimerPollProhibit(20);
    public static final TimerPollProhibit tpp220 =
	new TimerPollProhibit(21);
    public static final TimerPollProhibit tpp230 =
	new TimerPollProhibit(22);
    public static final TimerPollProhibit tpp240 =
	new TimerPollProhibit(23);
    public static final TimerPollProhibit tpp250 =
	new TimerPollProhibit(24);
    public static final TimerPollProhibit tpp260 =
	new TimerPollProhibit(25);
    public static final TimerPollProhibit tpp270 =
	new TimerPollProhibit(26);
    public static final TimerPollProhibit tpp280 =
	new TimerPollProhibit(27);
    public static final TimerPollProhibit tpp290 =
	new TimerPollProhibit(28);
    public static final TimerPollProhibit tpp300 =
	new TimerPollProhibit(29);
    public static final TimerPollProhibit tpp310 =
	new TimerPollProhibit(30);
    public static final TimerPollProhibit tpp320 =
	new TimerPollProhibit(31);
    public static final TimerPollProhibit tpp330 =
	new TimerPollProhibit(32);
    public static final TimerPollProhibit tpp340 =
	new TimerPollProhibit(33);
    public static final TimerPollProhibit tpp350 =
	new TimerPollProhibit(34);
    public static final TimerPollProhibit tpp360 =
	new TimerPollProhibit(35);
    public static final TimerPollProhibit tpp370 =
	new TimerPollProhibit(36);
    public static final TimerPollProhibit tpp380 =
	new TimerPollProhibit(37);
    public static final TimerPollProhibit tpp390 =
	new TimerPollProhibit(38);
    public static final TimerPollProhibit tpp400 =
	new TimerPollProhibit(39);
    public static final TimerPollProhibit tpp410 =
	new TimerPollProhibit(40);
    public static final TimerPollProhibit tpp420 =
	new TimerPollProhibit(41);
    public static final TimerPollProhibit tpp430 =
	new TimerPollProhibit(42);
    public static final TimerPollProhibit tpp440 =
	new TimerPollProhibit(43);
    public static final TimerPollProhibit tpp450 =
	new TimerPollProhibit(44);
    public static final TimerPollProhibit tpp460 =
	new TimerPollProhibit(45);
    public static final TimerPollProhibit tpp470 =
	new TimerPollProhibit(46);
    public static final TimerPollProhibit tpp480 =
	new TimerPollProhibit(47);
    public static final TimerPollProhibit tpp490 =
	new TimerPollProhibit(48);
    public static final TimerPollProhibit tpp500 =
	new TimerPollProhibit(49);
    public static final TimerPollProhibit tpp510 =
	new TimerPollProhibit(50);
    public static final TimerPollProhibit tpp520 =
	new TimerPollProhibit(51);
    public static final TimerPollProhibit tpp530 =
	new TimerPollProhibit(52);
    public static final TimerPollProhibit tpp540 =
	new TimerPollProhibit(53);
    public static final TimerPollProhibit tpp550 =
	new TimerPollProhibit(54);
    public static final TimerPollProhibit tpp600 =
	new TimerPollProhibit(55);
    public static final TimerPollProhibit tpp650 =
	new TimerPollProhibit(56);
    public static final TimerPollProhibit tpp700 =
	new TimerPollProhibit(57);
    public static final TimerPollProhibit tpp750 =
	new TimerPollProhibit(58);
    public static final TimerPollProhibit tpp800 =
	new TimerPollProhibit(59);
    public static final TimerPollProhibit tpp850 =
	new TimerPollProhibit(60);
    public static final TimerPollProhibit tpp900 =
	new TimerPollProhibit(61);
    public static final TimerPollProhibit tpp950 =
	new TimerPollProhibit(62);
    public static final TimerPollProhibit tpp1000 =
	new TimerPollProhibit(63);
    private final static TimerPollProhibit cNamedNumbers[] = {
	 tpp10, 
	 tpp20, 
	 tpp30, 
	 tpp40, 
	 tpp50, 
	 tpp60, 
	 tpp70, 
	 tpp80, 
	 tpp90, 
	 tpp100, 
	 tpp110, 
	 tpp120, 
	 tpp130, 
	 tpp140, 
	 tpp150, 
	 tpp160, 
	 tpp170, 
	 tpp180, 
	 tpp190, 
	 tpp200, 
	 tpp210, 
	 tpp220, 
	 tpp230, 
	 tpp240, 
	 tpp250, 
	 tpp260, 
	 tpp270, 
	 tpp280, 
	 tpp290, 
	 tpp300, 
	 tpp310, 
	 tpp320, 
	 tpp330, 
	 tpp340, 
	 tpp350, 
	 tpp360, 
	 tpp370, 
	 tpp380, 
	 tpp390, 
	 tpp400, 
	 tpp410, 
	 tpp420, 
	 tpp430, 
	 tpp440, 
	 tpp450, 
	 tpp460, 
	 tpp470, 
	 tpp480, 
	 tpp490, 
	 tpp500, 
	 tpp510, 
	 tpp520, 
	 tpp530, 
	 tpp540, 
	 tpp550, 
	 tpp600, 
	 tpp650, 
	 tpp700, 
	 tpp750, 
	 tpp800, 
	 tpp850, 
	 tpp900, 
	 tpp950, 
	 tpp1000
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
    
    public static TimerPollProhibit valueOf(long value)
    {
	return (TimerPollProhibit)tpp10.lookupValue(value);
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
	    "TimerPollProhibit"
	),
	new QName (
	    "InformationElements",
	    "TimerPollProhibit"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "tpp10",
		    0
		),
		new MemberListElement (
		    "tpp20",
		    1
		),
		new MemberListElement (
		    "tpp30",
		    2
		),
		new MemberListElement (
		    "tpp40",
		    3
		),
		new MemberListElement (
		    "tpp50",
		    4
		),
		new MemberListElement (
		    "tpp60",
		    5
		),
		new MemberListElement (
		    "tpp70",
		    6
		),
		new MemberListElement (
		    "tpp80",
		    7
		),
		new MemberListElement (
		    "tpp90",
		    8
		),
		new MemberListElement (
		    "tpp100",
		    9
		),
		new MemberListElement (
		    "tpp110",
		    10
		),
		new MemberListElement (
		    "tpp120",
		    11
		),
		new MemberListElement (
		    "tpp130",
		    12
		),
		new MemberListElement (
		    "tpp140",
		    13
		),
		new MemberListElement (
		    "tpp150",
		    14
		),
		new MemberListElement (
		    "tpp160",
		    15
		),
		new MemberListElement (
		    "tpp170",
		    16
		),
		new MemberListElement (
		    "tpp180",
		    17
		),
		new MemberListElement (
		    "tpp190",
		    18
		),
		new MemberListElement (
		    "tpp200",
		    19
		),
		new MemberListElement (
		    "tpp210",
		    20
		),
		new MemberListElement (
		    "tpp220",
		    21
		),
		new MemberListElement (
		    "tpp230",
		    22
		),
		new MemberListElement (
		    "tpp240",
		    23
		),
		new MemberListElement (
		    "tpp250",
		    24
		),
		new MemberListElement (
		    "tpp260",
		    25
		),
		new MemberListElement (
		    "tpp270",
		    26
		),
		new MemberListElement (
		    "tpp280",
		    27
		),
		new MemberListElement (
		    "tpp290",
		    28
		),
		new MemberListElement (
		    "tpp300",
		    29
		),
		new MemberListElement (
		    "tpp310",
		    30
		),
		new MemberListElement (
		    "tpp320",
		    31
		),
		new MemberListElement (
		    "tpp330",
		    32
		),
		new MemberListElement (
		    "tpp340",
		    33
		),
		new MemberListElement (
		    "tpp350",
		    34
		),
		new MemberListElement (
		    "tpp360",
		    35
		),
		new MemberListElement (
		    "tpp370",
		    36
		),
		new MemberListElement (
		    "tpp380",
		    37
		),
		new MemberListElement (
		    "tpp390",
		    38
		),
		new MemberListElement (
		    "tpp400",
		    39
		),
		new MemberListElement (
		    "tpp410",
		    40
		),
		new MemberListElement (
		    "tpp420",
		    41
		),
		new MemberListElement (
		    "tpp430",
		    42
		),
		new MemberListElement (
		    "tpp440",
		    43
		),
		new MemberListElement (
		    "tpp450",
		    44
		),
		new MemberListElement (
		    "tpp460",
		    45
		),
		new MemberListElement (
		    "tpp470",
		    46
		),
		new MemberListElement (
		    "tpp480",
		    47
		),
		new MemberListElement (
		    "tpp490",
		    48
		),
		new MemberListElement (
		    "tpp500",
		    49
		),
		new MemberListElement (
		    "tpp510",
		    50
		),
		new MemberListElement (
		    "tpp520",
		    51
		),
		new MemberListElement (
		    "tpp530",
		    52
		),
		new MemberListElement (
		    "tpp540",
		    53
		),
		new MemberListElement (
		    "tpp550",
		    54
		),
		new MemberListElement (
		    "tpp600",
		    55
		),
		new MemberListElement (
		    "tpp650",
		    56
		),
		new MemberListElement (
		    "tpp700",
		    57
		),
		new MemberListElement (
		    "tpp750",
		    58
		),
		new MemberListElement (
		    "tpp800",
		    59
		),
		new MemberListElement (
		    "tpp850",
		    60
		),
		new MemberListElement (
		    "tpp900",
		    61
		),
		new MemberListElement (
		    "tpp950",
		    62
		),
		new MemberListElement (
		    "tpp1000",
		    63
		)
	    }
	),
	0,
	tpp10
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' TimerPollProhibit object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' TimerPollProhibit object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for TimerPollProhibit
