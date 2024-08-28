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
 * Define the ASN1 Type SIB_Type from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class SIB_Type extends Enumerated {
    
    /**
     * The default constructor.
     */
    private SIB_Type()
    {
	super(cFirstNumber);
    }
    
    protected SIB_Type(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final SIB_Type masterInformationBlock =
	new SIB_Type(0);
    public static final SIB_Type systemInformationBlockType1 =
	new SIB_Type(1);
    public static final SIB_Type systemInformationBlockType2 =
	new SIB_Type(2);
    public static final SIB_Type systemInformationBlockType3 =
	new SIB_Type(3);
    public static final SIB_Type systemInformationBlockType4 =
	new SIB_Type(4);
    public static final SIB_Type systemInformationBlockType5 =
	new SIB_Type(5);
    public static final SIB_Type systemInformationBlockType6 =
	new SIB_Type(6);
    public static final SIB_Type systemInformationBlockType7 =
	new SIB_Type(7);
    public static final SIB_Type dummy =
	new SIB_Type(8);
    public static final SIB_Type dummy2 =
	new SIB_Type(9);
    public static final SIB_Type dummy3 =
	new SIB_Type(10);
    public static final SIB_Type systemInformationBlockType11 =
	new SIB_Type(11);
    public static final SIB_Type systemInformationBlockType12 =
	new SIB_Type(12);
    public static final SIB_Type systemInformationBlockType13 =
	new SIB_Type(13);
    public static final SIB_Type systemInformationBlockType13_1 =
	new SIB_Type(14);
    public static final SIB_Type systemInformationBlockType13_2 =
	new SIB_Type(15);
    public static final SIB_Type systemInformationBlockType13_3 =
	new SIB_Type(16);
    public static final SIB_Type systemInformationBlockType13_4 =
	new SIB_Type(17);
    public static final SIB_Type systemInformationBlockType14 =
	new SIB_Type(18);
    public static final SIB_Type systemInformationBlockType15 =
	new SIB_Type(19);
    public static final SIB_Type systemInformationBlockType15_1 =
	new SIB_Type(20);
    public static final SIB_Type systemInformationBlockType15_2 =
	new SIB_Type(21);
    public static final SIB_Type systemInformationBlockType15_3 =
	new SIB_Type(22);
    public static final SIB_Type systemInformationBlockType16 =
	new SIB_Type(23);
    public static final SIB_Type systemInformationBlockType17 =
	new SIB_Type(24);
    public static final SIB_Type systemInformationBlockType15_4 =
	new SIB_Type(25);
    public static final SIB_Type systemInformationBlockType18 =
	new SIB_Type(26);
    public static final SIB_Type schedulingBlock1 =
	new SIB_Type(27);
    public static final SIB_Type schedulingBlock2 =
	new SIB_Type(28);
    public static final SIB_Type systemInformationBlockType15_5 =
	new SIB_Type(29);
    public static final SIB_Type systemInformationBlockType5bis =
	new SIB_Type(30);
    public static final SIB_Type extensionType =
	new SIB_Type(31);
    private final static SIB_Type cNamedNumbers[] = {
	 masterInformationBlock, 
	 systemInformationBlockType1, 
	 systemInformationBlockType2, 
	 systemInformationBlockType3, 
	 systemInformationBlockType4, 
	 systemInformationBlockType5, 
	 systemInformationBlockType6, 
	 systemInformationBlockType7, 
	 dummy, 
	 dummy2, 
	 dummy3, 
	 systemInformationBlockType11, 
	 systemInformationBlockType12, 
	 systemInformationBlockType13, 
	 systemInformationBlockType13_1, 
	 systemInformationBlockType13_2, 
	 systemInformationBlockType13_3, 
	 systemInformationBlockType13_4, 
	 systemInformationBlockType14, 
	 systemInformationBlockType15, 
	 systemInformationBlockType15_1, 
	 systemInformationBlockType15_2, 
	 systemInformationBlockType15_3, 
	 systemInformationBlockType16, 
	 systemInformationBlockType17, 
	 systemInformationBlockType15_4, 
	 systemInformationBlockType18, 
	 schedulingBlock1, 
	 schedulingBlock2, 
	 systemInformationBlockType15_5, 
	 systemInformationBlockType5bis, 
	 extensionType
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
    
    public static SIB_Type valueOf(long value)
    {
	return (SIB_Type)masterInformationBlock.lookupValue(value);
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
	    "SIB_Type"
	),
	new QName (
	    "InformationElements",
	    "SIB-Type"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "masterInformationBlock",
		    0
		),
		new MemberListElement (
		    "systemInformationBlockType1",
		    1
		),
		new MemberListElement (
		    "systemInformationBlockType2",
		    2
		),
		new MemberListElement (
		    "systemInformationBlockType3",
		    3
		),
		new MemberListElement (
		    "systemInformationBlockType4",
		    4
		),
		new MemberListElement (
		    "systemInformationBlockType5",
		    5
		),
		new MemberListElement (
		    "systemInformationBlockType6",
		    6
		),
		new MemberListElement (
		    "systemInformationBlockType7",
		    7
		),
		new MemberListElement (
		    "dummy",
		    8
		),
		new MemberListElement (
		    "dummy2",
		    9
		),
		new MemberListElement (
		    "dummy3",
		    10
		),
		new MemberListElement (
		    "systemInformationBlockType11",
		    11
		),
		new MemberListElement (
		    "systemInformationBlockType12",
		    12
		),
		new MemberListElement (
		    "systemInformationBlockType13",
		    13
		),
		new MemberListElement (
		    "systemInformationBlockType13-1",
		    14
		),
		new MemberListElement (
		    "systemInformationBlockType13-2",
		    15
		),
		new MemberListElement (
		    "systemInformationBlockType13-3",
		    16
		),
		new MemberListElement (
		    "systemInformationBlockType13-4",
		    17
		),
		new MemberListElement (
		    "systemInformationBlockType14",
		    18
		),
		new MemberListElement (
		    "systemInformationBlockType15",
		    19
		),
		new MemberListElement (
		    "systemInformationBlockType15-1",
		    20
		),
		new MemberListElement (
		    "systemInformationBlockType15-2",
		    21
		),
		new MemberListElement (
		    "systemInformationBlockType15-3",
		    22
		),
		new MemberListElement (
		    "systemInformationBlockType16",
		    23
		),
		new MemberListElement (
		    "systemInformationBlockType17",
		    24
		),
		new MemberListElement (
		    "systemInformationBlockType15-4",
		    25
		),
		new MemberListElement (
		    "systemInformationBlockType18",
		    26
		),
		new MemberListElement (
		    "schedulingBlock1",
		    27
		),
		new MemberListElement (
		    "schedulingBlock2",
		    28
		),
		new MemberListElement (
		    "systemInformationBlockType15-5",
		    29
		),
		new MemberListElement (
		    "systemInformationBlockType5bis",
		    30
		),
		new MemberListElement (
		    "extensionType",
		    31
		)
	    }
	),
	0,
	masterInformationBlock
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' SIB_Type object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' SIB_Type object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for SIB_Type
