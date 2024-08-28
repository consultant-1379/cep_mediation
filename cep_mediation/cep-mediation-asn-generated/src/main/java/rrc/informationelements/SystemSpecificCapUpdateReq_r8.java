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
 * Define the ASN1 Type SystemSpecificCapUpdateReq_r8 from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class SystemSpecificCapUpdateReq_r8 extends Enumerated {
    
    /**
     * The default constructor.
     */
    private SystemSpecificCapUpdateReq_r8()
    {
	super(cFirstNumber);
    }
    
    protected SystemSpecificCapUpdateReq_r8(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final SystemSpecificCapUpdateReq_r8 gsm =
	new SystemSpecificCapUpdateReq_r8(0);
    public static final SystemSpecificCapUpdateReq_r8 geranIu =
	new SystemSpecificCapUpdateReq_r8(1);
    public static final SystemSpecificCapUpdateReq_r8 eutra =
	new SystemSpecificCapUpdateReq_r8(2);
    public static final SystemSpecificCapUpdateReq_r8 spare5 =
	new SystemSpecificCapUpdateReq_r8(3);
    public static final SystemSpecificCapUpdateReq_r8 spare4 =
	new SystemSpecificCapUpdateReq_r8(4);
    public static final SystemSpecificCapUpdateReq_r8 spare3 =
	new SystemSpecificCapUpdateReq_r8(5);
    public static final SystemSpecificCapUpdateReq_r8 spare2 =
	new SystemSpecificCapUpdateReq_r8(6);
    public static final SystemSpecificCapUpdateReq_r8 spare1 =
	new SystemSpecificCapUpdateReq_r8(7);
    private final static SystemSpecificCapUpdateReq_r8 cNamedNumbers[] = {
	 gsm, 
	 geranIu, 
	 eutra, 
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
    
    public static SystemSpecificCapUpdateReq_r8 valueOf(long value)
    {
	return (SystemSpecificCapUpdateReq_r8)gsm.lookupValue(value);
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
	    "SystemSpecificCapUpdateReq_r8"
	),
	new QName (
	    "InformationElements",
	    "SystemSpecificCapUpdateReq-r8"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "gsm",
		    0
		),
		new MemberListElement (
		    "geranIu",
		    1
		),
		new MemberListElement (
		    "eutra",
		    2
		),
		new MemberListElement (
		    "spare5",
		    3
		),
		new MemberListElement (
		    "spare4",
		    4
		),
		new MemberListElement (
		    "spare3",
		    5
		),
		new MemberListElement (
		    "spare2",
		    6
		),
		new MemberListElement (
		    "spare1",
		    7
		)
	    }
	),
	0,
	gsm
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' SystemSpecificCapUpdateReq_r8 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' SystemSpecificCapUpdateReq_r8 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for SystemSpecificCapUpdateReq_r8
