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
 * Define the ASN1 Type HARQMemorySize from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class HARQMemorySize extends Enumerated {
    
    /**
     * The default constructor.
     */
    private HARQMemorySize()
    {
	super(cFirstNumber);
    }
    
    protected HARQMemorySize(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final HARQMemorySize hms800 =
	new HARQMemorySize(0);
    public static final HARQMemorySize hms1600 =
	new HARQMemorySize(1);
    public static final HARQMemorySize hms2400 =
	new HARQMemorySize(2);
    public static final HARQMemorySize hms3200 =
	new HARQMemorySize(3);
    public static final HARQMemorySize hms4000 =
	new HARQMemorySize(4);
    public static final HARQMemorySize hms4800 =
	new HARQMemorySize(5);
    public static final HARQMemorySize hms5600 =
	new HARQMemorySize(6);
    public static final HARQMemorySize hms6400 =
	new HARQMemorySize(7);
    public static final HARQMemorySize hms7200 =
	new HARQMemorySize(8);
    public static final HARQMemorySize hms8000 =
	new HARQMemorySize(9);
    public static final HARQMemorySize hms8800 =
	new HARQMemorySize(10);
    public static final HARQMemorySize hms9600 =
	new HARQMemorySize(11);
    public static final HARQMemorySize hms10400 =
	new HARQMemorySize(12);
    public static final HARQMemorySize hms11200 =
	new HARQMemorySize(13);
    public static final HARQMemorySize hms12000 =
	new HARQMemorySize(14);
    public static final HARQMemorySize hms12800 =
	new HARQMemorySize(15);
    public static final HARQMemorySize hms13600 =
	new HARQMemorySize(16);
    public static final HARQMemorySize hms14400 =
	new HARQMemorySize(17);
    public static final HARQMemorySize hms15200 =
	new HARQMemorySize(18);
    public static final HARQMemorySize hms16000 =
	new HARQMemorySize(19);
    public static final HARQMemorySize hms17600 =
	new HARQMemorySize(20);
    public static final HARQMemorySize hms19200 =
	new HARQMemorySize(21);
    public static final HARQMemorySize hms20800 =
	new HARQMemorySize(22);
    public static final HARQMemorySize hms22400 =
	new HARQMemorySize(23);
    public static final HARQMemorySize hms24000 =
	new HARQMemorySize(24);
    public static final HARQMemorySize hms25600 =
	new HARQMemorySize(25);
    public static final HARQMemorySize hms27200 =
	new HARQMemorySize(26);
    public static final HARQMemorySize hms28800 =
	new HARQMemorySize(27);
    public static final HARQMemorySize hms30400 =
	new HARQMemorySize(28);
    public static final HARQMemorySize hms32000 =
	new HARQMemorySize(29);
    public static final HARQMemorySize hms36000 =
	new HARQMemorySize(30);
    public static final HARQMemorySize hms40000 =
	new HARQMemorySize(31);
    public static final HARQMemorySize hms44000 =
	new HARQMemorySize(32);
    public static final HARQMemorySize hms48000 =
	new HARQMemorySize(33);
    public static final HARQMemorySize hms52000 =
	new HARQMemorySize(34);
    public static final HARQMemorySize hms56000 =
	new HARQMemorySize(35);
    public static final HARQMemorySize hms60000 =
	new HARQMemorySize(36);
    public static final HARQMemorySize hms64000 =
	new HARQMemorySize(37);
    public static final HARQMemorySize hms68000 =
	new HARQMemorySize(38);
    public static final HARQMemorySize hms72000 =
	new HARQMemorySize(39);
    public static final HARQMemorySize hms76000 =
	new HARQMemorySize(40);
    public static final HARQMemorySize hms80000 =
	new HARQMemorySize(41);
    public static final HARQMemorySize hms88000 =
	new HARQMemorySize(42);
    public static final HARQMemorySize hms96000 =
	new HARQMemorySize(43);
    public static final HARQMemorySize hms104000 =
	new HARQMemorySize(44);
    public static final HARQMemorySize hms112000 =
	new HARQMemorySize(45);
    public static final HARQMemorySize hms120000 =
	new HARQMemorySize(46);
    public static final HARQMemorySize hms128000 =
	new HARQMemorySize(47);
    public static final HARQMemorySize hms136000 =
	new HARQMemorySize(48);
    public static final HARQMemorySize hms144000 =
	new HARQMemorySize(49);
    public static final HARQMemorySize hms152000 =
	new HARQMemorySize(50);
    public static final HARQMemorySize hms160000 =
	new HARQMemorySize(51);
    public static final HARQMemorySize hms176000 =
	new HARQMemorySize(52);
    public static final HARQMemorySize hms192000 =
	new HARQMemorySize(53);
    public static final HARQMemorySize hms208000 =
	new HARQMemorySize(54);
    public static final HARQMemorySize hms224000 =
	new HARQMemorySize(55);
    public static final HARQMemorySize hms240000 =
	new HARQMemorySize(56);
    public static final HARQMemorySize hms256000 =
	new HARQMemorySize(57);
    public static final HARQMemorySize hms272000 =
	new HARQMemorySize(58);
    public static final HARQMemorySize hms288000 =
	new HARQMemorySize(59);
    public static final HARQMemorySize hms304000 =
	new HARQMemorySize(60);
    private final static HARQMemorySize cNamedNumbers[] = {
	 hms800, 
	 hms1600, 
	 hms2400, 
	 hms3200, 
	 hms4000, 
	 hms4800, 
	 hms5600, 
	 hms6400, 
	 hms7200, 
	 hms8000, 
	 hms8800, 
	 hms9600, 
	 hms10400, 
	 hms11200, 
	 hms12000, 
	 hms12800, 
	 hms13600, 
	 hms14400, 
	 hms15200, 
	 hms16000, 
	 hms17600, 
	 hms19200, 
	 hms20800, 
	 hms22400, 
	 hms24000, 
	 hms25600, 
	 hms27200, 
	 hms28800, 
	 hms30400, 
	 hms32000, 
	 hms36000, 
	 hms40000, 
	 hms44000, 
	 hms48000, 
	 hms52000, 
	 hms56000, 
	 hms60000, 
	 hms64000, 
	 hms68000, 
	 hms72000, 
	 hms76000, 
	 hms80000, 
	 hms88000, 
	 hms96000, 
	 hms104000, 
	 hms112000, 
	 hms120000, 
	 hms128000, 
	 hms136000, 
	 hms144000, 
	 hms152000, 
	 hms160000, 
	 hms176000, 
	 hms192000, 
	 hms208000, 
	 hms224000, 
	 hms240000, 
	 hms256000, 
	 hms272000, 
	 hms288000, 
	 hms304000
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
    
    public static HARQMemorySize valueOf(long value)
    {
	return (HARQMemorySize)hms800.lookupValue(value);
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
	    "HARQMemorySize"
	),
	new QName (
	    "InformationElements",
	    "HARQMemorySize"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "hms800",
		    0
		),
		new MemberListElement (
		    "hms1600",
		    1
		),
		new MemberListElement (
		    "hms2400",
		    2
		),
		new MemberListElement (
		    "hms3200",
		    3
		),
		new MemberListElement (
		    "hms4000",
		    4
		),
		new MemberListElement (
		    "hms4800",
		    5
		),
		new MemberListElement (
		    "hms5600",
		    6
		),
		new MemberListElement (
		    "hms6400",
		    7
		),
		new MemberListElement (
		    "hms7200",
		    8
		),
		new MemberListElement (
		    "hms8000",
		    9
		),
		new MemberListElement (
		    "hms8800",
		    10
		),
		new MemberListElement (
		    "hms9600",
		    11
		),
		new MemberListElement (
		    "hms10400",
		    12
		),
		new MemberListElement (
		    "hms11200",
		    13
		),
		new MemberListElement (
		    "hms12000",
		    14
		),
		new MemberListElement (
		    "hms12800",
		    15
		),
		new MemberListElement (
		    "hms13600",
		    16
		),
		new MemberListElement (
		    "hms14400",
		    17
		),
		new MemberListElement (
		    "hms15200",
		    18
		),
		new MemberListElement (
		    "hms16000",
		    19
		),
		new MemberListElement (
		    "hms17600",
		    20
		),
		new MemberListElement (
		    "hms19200",
		    21
		),
		new MemberListElement (
		    "hms20800",
		    22
		),
		new MemberListElement (
		    "hms22400",
		    23
		),
		new MemberListElement (
		    "hms24000",
		    24
		),
		new MemberListElement (
		    "hms25600",
		    25
		),
		new MemberListElement (
		    "hms27200",
		    26
		),
		new MemberListElement (
		    "hms28800",
		    27
		),
		new MemberListElement (
		    "hms30400",
		    28
		),
		new MemberListElement (
		    "hms32000",
		    29
		),
		new MemberListElement (
		    "hms36000",
		    30
		),
		new MemberListElement (
		    "hms40000",
		    31
		),
		new MemberListElement (
		    "hms44000",
		    32
		),
		new MemberListElement (
		    "hms48000",
		    33
		),
		new MemberListElement (
		    "hms52000",
		    34
		),
		new MemberListElement (
		    "hms56000",
		    35
		),
		new MemberListElement (
		    "hms60000",
		    36
		),
		new MemberListElement (
		    "hms64000",
		    37
		),
		new MemberListElement (
		    "hms68000",
		    38
		),
		new MemberListElement (
		    "hms72000",
		    39
		),
		new MemberListElement (
		    "hms76000",
		    40
		),
		new MemberListElement (
		    "hms80000",
		    41
		),
		new MemberListElement (
		    "hms88000",
		    42
		),
		new MemberListElement (
		    "hms96000",
		    43
		),
		new MemberListElement (
		    "hms104000",
		    44
		),
		new MemberListElement (
		    "hms112000",
		    45
		),
		new MemberListElement (
		    "hms120000",
		    46
		),
		new MemberListElement (
		    "hms128000",
		    47
		),
		new MemberListElement (
		    "hms136000",
		    48
		),
		new MemberListElement (
		    "hms144000",
		    49
		),
		new MemberListElement (
		    "hms152000",
		    50
		),
		new MemberListElement (
		    "hms160000",
		    51
		),
		new MemberListElement (
		    "hms176000",
		    52
		),
		new MemberListElement (
		    "hms192000",
		    53
		),
		new MemberListElement (
		    "hms208000",
		    54
		),
		new MemberListElement (
		    "hms224000",
		    55
		),
		new MemberListElement (
		    "hms240000",
		    56
		),
		new MemberListElement (
		    "hms256000",
		    57
		),
		new MemberListElement (
		    "hms272000",
		    58
		),
		new MemberListElement (
		    "hms288000",
		    59
		),
		new MemberListElement (
		    "hms304000",
		    60
		)
	    }
	),
	0,
	hms800
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' HARQMemorySize object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' HARQMemorySize object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for HARQMemorySize
