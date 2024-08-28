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
 * Define the ASN1 Type DiffCorrectionStatus from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class DiffCorrectionStatus extends Enumerated {
    
    /**
     * The default constructor.
     */
    private DiffCorrectionStatus()
    {
	super(cFirstNumber);
    }
    
    protected DiffCorrectionStatus(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final DiffCorrectionStatus udre_1_0 =
	new DiffCorrectionStatus(0);
    public static final DiffCorrectionStatus udre_0_75 =
	new DiffCorrectionStatus(1);
    public static final DiffCorrectionStatus udre_0_5 =
	new DiffCorrectionStatus(2);
    public static final DiffCorrectionStatus udre_0_3 =
	new DiffCorrectionStatus(3);
    public static final DiffCorrectionStatus udre_0_2 =
	new DiffCorrectionStatus(4);
    public static final DiffCorrectionStatus udre_0_1 =
	new DiffCorrectionStatus(5);
    public static final DiffCorrectionStatus noData =
	new DiffCorrectionStatus(6);
    public static final DiffCorrectionStatus invalidData =
	new DiffCorrectionStatus(7);
    private final static DiffCorrectionStatus cNamedNumbers[] = {
	 udre_1_0, 
	 udre_0_75, 
	 udre_0_5, 
	 udre_0_3, 
	 udre_0_2, 
	 udre_0_1, 
	 noData, 
	 invalidData
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
    
    public static DiffCorrectionStatus valueOf(long value)
    {
	return (DiffCorrectionStatus)udre_1_0.lookupValue(value);
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
	    "DiffCorrectionStatus"
	),
	new QName (
	    "InformationElements",
	    "DiffCorrectionStatus"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "udre-1-0",
		    0
		),
		new MemberListElement (
		    "udre-0-75",
		    1
		),
		new MemberListElement (
		    "udre-0-5",
		    2
		),
		new MemberListElement (
		    "udre-0-3",
		    3
		),
		new MemberListElement (
		    "udre-0-2",
		    4
		),
		new MemberListElement (
		    "udre-0-1",
		    5
		),
		new MemberListElement (
		    "noData",
		    6
		),
		new MemberListElement (
		    "invalidData",
		    7
		)
	    }
	),
	0,
	udre_1_0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' DiffCorrectionStatus object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' DiffCorrectionStatus object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for DiffCorrectionStatus
