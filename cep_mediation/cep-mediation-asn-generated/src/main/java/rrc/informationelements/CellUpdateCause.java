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
 * Define the ASN1 Type CellUpdateCause from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class CellUpdateCause extends Enumerated {
    
    /**
     * The default constructor.
     */
    private CellUpdateCause()
    {
	super(cFirstNumber);
    }
    
    protected CellUpdateCause(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final CellUpdateCause cellReselection =
	new CellUpdateCause(0);
    public static final CellUpdateCause periodicalCellUpdate =
	new CellUpdateCause(1);
    public static final CellUpdateCause uplinkDataTransmission =
	new CellUpdateCause(2);
    public static final CellUpdateCause utran_pagingResponse =
	new CellUpdateCause(3);
    public static final CellUpdateCause re_enteredServiceArea =
	new CellUpdateCause(4);
    public static final CellUpdateCause radiolinkFailure =
	new CellUpdateCause(5);
    public static final CellUpdateCause rlc_unrecoverableError =
	new CellUpdateCause(6);
    public static final CellUpdateCause cellUpdateCause_ext =
	new CellUpdateCause(7);
    private final static CellUpdateCause cNamedNumbers[] = {
	 cellReselection, 
	 periodicalCellUpdate, 
	 uplinkDataTransmission, 
	 utran_pagingResponse, 
	 re_enteredServiceArea, 
	 radiolinkFailure, 
	 rlc_unrecoverableError, 
	 cellUpdateCause_ext
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
    
    public static CellUpdateCause valueOf(long value)
    {
	return (CellUpdateCause)cellReselection.lookupValue(value);
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
	    "CellUpdateCause"
	),
	new QName (
	    "InformationElements",
	    "CellUpdateCause"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "cellReselection",
		    0
		),
		new MemberListElement (
		    "periodicalCellUpdate",
		    1
		),
		new MemberListElement (
		    "uplinkDataTransmission",
		    2
		),
		new MemberListElement (
		    "utran-pagingResponse",
		    3
		),
		new MemberListElement (
		    "re-enteredServiceArea",
		    4
		),
		new MemberListElement (
		    "radiolinkFailure",
		    5
		),
		new MemberListElement (
		    "rlc-unrecoverableError",
		    6
		),
		new MemberListElement (
		    "cellUpdateCause-ext",
		    7
		)
	    }
	),
	0,
	cellReselection
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' CellUpdateCause object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' CellUpdateCause object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for CellUpdateCause
