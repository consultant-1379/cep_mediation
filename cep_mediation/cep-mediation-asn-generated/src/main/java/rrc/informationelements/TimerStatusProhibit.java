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
 * Define the ASN1 Type TimerStatusProhibit from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class TimerStatusProhibit extends Enumerated {
    
    /**
     * The default constructor.
     */
    private TimerStatusProhibit()
    {
	super(cFirstNumber);
    }
    
    protected TimerStatusProhibit(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final TimerStatusProhibit tsp10 =
	new TimerStatusProhibit(0);
    public static final TimerStatusProhibit tsp20 =
	new TimerStatusProhibit(1);
    public static final TimerStatusProhibit tsp30 =
	new TimerStatusProhibit(2);
    public static final TimerStatusProhibit tsp40 =
	new TimerStatusProhibit(3);
    public static final TimerStatusProhibit tsp50 =
	new TimerStatusProhibit(4);
    public static final TimerStatusProhibit tsp60 =
	new TimerStatusProhibit(5);
    public static final TimerStatusProhibit tsp70 =
	new TimerStatusProhibit(6);
    public static final TimerStatusProhibit tsp80 =
	new TimerStatusProhibit(7);
    public static final TimerStatusProhibit tsp90 =
	new TimerStatusProhibit(8);
    public static final TimerStatusProhibit tsp100 =
	new TimerStatusProhibit(9);
    public static final TimerStatusProhibit tsp110 =
	new TimerStatusProhibit(10);
    public static final TimerStatusProhibit tsp120 =
	new TimerStatusProhibit(11);
    public static final TimerStatusProhibit tsp130 =
	new TimerStatusProhibit(12);
    public static final TimerStatusProhibit tsp140 =
	new TimerStatusProhibit(13);
    public static final TimerStatusProhibit tsp150 =
	new TimerStatusProhibit(14);
    public static final TimerStatusProhibit tsp160 =
	new TimerStatusProhibit(15);
    public static final TimerStatusProhibit tsp170 =
	new TimerStatusProhibit(16);
    public static final TimerStatusProhibit tsp180 =
	new TimerStatusProhibit(17);
    public static final TimerStatusProhibit tsp190 =
	new TimerStatusProhibit(18);
    public static final TimerStatusProhibit tsp200 =
	new TimerStatusProhibit(19);
    public static final TimerStatusProhibit tsp210 =
	new TimerStatusProhibit(20);
    public static final TimerStatusProhibit tsp220 =
	new TimerStatusProhibit(21);
    public static final TimerStatusProhibit tsp230 =
	new TimerStatusProhibit(22);
    public static final TimerStatusProhibit tsp240 =
	new TimerStatusProhibit(23);
    public static final TimerStatusProhibit tsp250 =
	new TimerStatusProhibit(24);
    public static final TimerStatusProhibit tsp260 =
	new TimerStatusProhibit(25);
    public static final TimerStatusProhibit tsp270 =
	new TimerStatusProhibit(26);
    public static final TimerStatusProhibit tsp280 =
	new TimerStatusProhibit(27);
    public static final TimerStatusProhibit tsp290 =
	new TimerStatusProhibit(28);
    public static final TimerStatusProhibit tsp300 =
	new TimerStatusProhibit(29);
    public static final TimerStatusProhibit tsp310 =
	new TimerStatusProhibit(30);
    public static final TimerStatusProhibit tsp320 =
	new TimerStatusProhibit(31);
    public static final TimerStatusProhibit tsp330 =
	new TimerStatusProhibit(32);
    public static final TimerStatusProhibit tsp340 =
	new TimerStatusProhibit(33);
    public static final TimerStatusProhibit tsp350 =
	new TimerStatusProhibit(34);
    public static final TimerStatusProhibit tsp360 =
	new TimerStatusProhibit(35);
    public static final TimerStatusProhibit tsp370 =
	new TimerStatusProhibit(36);
    public static final TimerStatusProhibit tsp380 =
	new TimerStatusProhibit(37);
    public static final TimerStatusProhibit tsp390 =
	new TimerStatusProhibit(38);
    public static final TimerStatusProhibit tsp400 =
	new TimerStatusProhibit(39);
    public static final TimerStatusProhibit tsp410 =
	new TimerStatusProhibit(40);
    public static final TimerStatusProhibit tsp420 =
	new TimerStatusProhibit(41);
    public static final TimerStatusProhibit tsp430 =
	new TimerStatusProhibit(42);
    public static final TimerStatusProhibit tsp440 =
	new TimerStatusProhibit(43);
    public static final TimerStatusProhibit tsp450 =
	new TimerStatusProhibit(44);
    public static final TimerStatusProhibit tsp460 =
	new TimerStatusProhibit(45);
    public static final TimerStatusProhibit tsp470 =
	new TimerStatusProhibit(46);
    public static final TimerStatusProhibit tsp480 =
	new TimerStatusProhibit(47);
    public static final TimerStatusProhibit tsp490 =
	new TimerStatusProhibit(48);
    public static final TimerStatusProhibit tsp500 =
	new TimerStatusProhibit(49);
    public static final TimerStatusProhibit tsp510 =
	new TimerStatusProhibit(50);
    public static final TimerStatusProhibit tsp520 =
	new TimerStatusProhibit(51);
    public static final TimerStatusProhibit tsp530 =
	new TimerStatusProhibit(52);
    public static final TimerStatusProhibit tsp540 =
	new TimerStatusProhibit(53);
    public static final TimerStatusProhibit tsp550 =
	new TimerStatusProhibit(54);
    public static final TimerStatusProhibit tsp600 =
	new TimerStatusProhibit(55);
    public static final TimerStatusProhibit tsp650 =
	new TimerStatusProhibit(56);
    public static final TimerStatusProhibit tsp700 =
	new TimerStatusProhibit(57);
    public static final TimerStatusProhibit tsp750 =
	new TimerStatusProhibit(58);
    public static final TimerStatusProhibit tsp800 =
	new TimerStatusProhibit(59);
    public static final TimerStatusProhibit tsp850 =
	new TimerStatusProhibit(60);
    public static final TimerStatusProhibit tsp900 =
	new TimerStatusProhibit(61);
    public static final TimerStatusProhibit tsp950 =
	new TimerStatusProhibit(62);
    public static final TimerStatusProhibit tsp1000 =
	new TimerStatusProhibit(63);
    private final static TimerStatusProhibit cNamedNumbers[] = {
	 tsp10, 
	 tsp20, 
	 tsp30, 
	 tsp40, 
	 tsp50, 
	 tsp60, 
	 tsp70, 
	 tsp80, 
	 tsp90, 
	 tsp100, 
	 tsp110, 
	 tsp120, 
	 tsp130, 
	 tsp140, 
	 tsp150, 
	 tsp160, 
	 tsp170, 
	 tsp180, 
	 tsp190, 
	 tsp200, 
	 tsp210, 
	 tsp220, 
	 tsp230, 
	 tsp240, 
	 tsp250, 
	 tsp260, 
	 tsp270, 
	 tsp280, 
	 tsp290, 
	 tsp300, 
	 tsp310, 
	 tsp320, 
	 tsp330, 
	 tsp340, 
	 tsp350, 
	 tsp360, 
	 tsp370, 
	 tsp380, 
	 tsp390, 
	 tsp400, 
	 tsp410, 
	 tsp420, 
	 tsp430, 
	 tsp440, 
	 tsp450, 
	 tsp460, 
	 tsp470, 
	 tsp480, 
	 tsp490, 
	 tsp500, 
	 tsp510, 
	 tsp520, 
	 tsp530, 
	 tsp540, 
	 tsp550, 
	 tsp600, 
	 tsp650, 
	 tsp700, 
	 tsp750, 
	 tsp800, 
	 tsp850, 
	 tsp900, 
	 tsp950, 
	 tsp1000
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
    
    public static TimerStatusProhibit valueOf(long value)
    {
	return (TimerStatusProhibit)tsp10.lookupValue(value);
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
	    "TimerStatusProhibit"
	),
	new QName (
	    "InformationElements",
	    "TimerStatusProhibit"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "tsp10",
		    0
		),
		new MemberListElement (
		    "tsp20",
		    1
		),
		new MemberListElement (
		    "tsp30",
		    2
		),
		new MemberListElement (
		    "tsp40",
		    3
		),
		new MemberListElement (
		    "tsp50",
		    4
		),
		new MemberListElement (
		    "tsp60",
		    5
		),
		new MemberListElement (
		    "tsp70",
		    6
		),
		new MemberListElement (
		    "tsp80",
		    7
		),
		new MemberListElement (
		    "tsp90",
		    8
		),
		new MemberListElement (
		    "tsp100",
		    9
		),
		new MemberListElement (
		    "tsp110",
		    10
		),
		new MemberListElement (
		    "tsp120",
		    11
		),
		new MemberListElement (
		    "tsp130",
		    12
		),
		new MemberListElement (
		    "tsp140",
		    13
		),
		new MemberListElement (
		    "tsp150",
		    14
		),
		new MemberListElement (
		    "tsp160",
		    15
		),
		new MemberListElement (
		    "tsp170",
		    16
		),
		new MemberListElement (
		    "tsp180",
		    17
		),
		new MemberListElement (
		    "tsp190",
		    18
		),
		new MemberListElement (
		    "tsp200",
		    19
		),
		new MemberListElement (
		    "tsp210",
		    20
		),
		new MemberListElement (
		    "tsp220",
		    21
		),
		new MemberListElement (
		    "tsp230",
		    22
		),
		new MemberListElement (
		    "tsp240",
		    23
		),
		new MemberListElement (
		    "tsp250",
		    24
		),
		new MemberListElement (
		    "tsp260",
		    25
		),
		new MemberListElement (
		    "tsp270",
		    26
		),
		new MemberListElement (
		    "tsp280",
		    27
		),
		new MemberListElement (
		    "tsp290",
		    28
		),
		new MemberListElement (
		    "tsp300",
		    29
		),
		new MemberListElement (
		    "tsp310",
		    30
		),
		new MemberListElement (
		    "tsp320",
		    31
		),
		new MemberListElement (
		    "tsp330",
		    32
		),
		new MemberListElement (
		    "tsp340",
		    33
		),
		new MemberListElement (
		    "tsp350",
		    34
		),
		new MemberListElement (
		    "tsp360",
		    35
		),
		new MemberListElement (
		    "tsp370",
		    36
		),
		new MemberListElement (
		    "tsp380",
		    37
		),
		new MemberListElement (
		    "tsp390",
		    38
		),
		new MemberListElement (
		    "tsp400",
		    39
		),
		new MemberListElement (
		    "tsp410",
		    40
		),
		new MemberListElement (
		    "tsp420",
		    41
		),
		new MemberListElement (
		    "tsp430",
		    42
		),
		new MemberListElement (
		    "tsp440",
		    43
		),
		new MemberListElement (
		    "tsp450",
		    44
		),
		new MemberListElement (
		    "tsp460",
		    45
		),
		new MemberListElement (
		    "tsp470",
		    46
		),
		new MemberListElement (
		    "tsp480",
		    47
		),
		new MemberListElement (
		    "tsp490",
		    48
		),
		new MemberListElement (
		    "tsp500",
		    49
		),
		new MemberListElement (
		    "tsp510",
		    50
		),
		new MemberListElement (
		    "tsp520",
		    51
		),
		new MemberListElement (
		    "tsp530",
		    52
		),
		new MemberListElement (
		    "tsp540",
		    53
		),
		new MemberListElement (
		    "tsp550",
		    54
		),
		new MemberListElement (
		    "tsp600",
		    55
		),
		new MemberListElement (
		    "tsp650",
		    56
		),
		new MemberListElement (
		    "tsp700",
		    57
		),
		new MemberListElement (
		    "tsp750",
		    58
		),
		new MemberListElement (
		    "tsp800",
		    59
		),
		new MemberListElement (
		    "tsp850",
		    60
		),
		new MemberListElement (
		    "tsp900",
		    61
		),
		new MemberListElement (
		    "tsp950",
		    62
		),
		new MemberListElement (
		    "tsp1000",
		    63
		)
	    }
	),
	0,
	tsp10
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' TimerStatusProhibit object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' TimerStatusProhibit object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for TimerStatusProhibit
