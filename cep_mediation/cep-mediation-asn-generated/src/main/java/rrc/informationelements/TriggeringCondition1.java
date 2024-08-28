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
 * Define the ASN1 Type TriggeringCondition1 from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class TriggeringCondition1 extends Enumerated {
    
    /**
     * The default constructor.
     */
    private TriggeringCondition1()
    {
	super(cFirstNumber);
    }
    
    protected TriggeringCondition1(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final TriggeringCondition1 activeSetCellsOnly =
	new TriggeringCondition1(0);
    public static final TriggeringCondition1 monitoredSetCellsOnly =
	new TriggeringCondition1(1);
    public static final TriggeringCondition1 activeSetAndMonitoredSetCells =
	new TriggeringCondition1(2);
    private final static TriggeringCondition1 cNamedNumbers[] = {
	 activeSetCellsOnly, 
	 monitoredSetCellsOnly, 
	 activeSetAndMonitoredSetCells
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
    
    public static TriggeringCondition1 valueOf(long value)
    {
	return (TriggeringCondition1)activeSetCellsOnly.lookupValue(value);
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
	    "TriggeringCondition1"
	),
	new QName (
	    "InformationElements",
	    "TriggeringCondition1"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "activeSetCellsOnly",
		    0
		),
		new MemberListElement (
		    "monitoredSetCellsOnly",
		    1
		),
		new MemberListElement (
		    "activeSetAndMonitoredSetCells",
		    2
		)
	    }
	),
	0,
	activeSetCellsOnly
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' TriggeringCondition1 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' TriggeringCondition1 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for TriggeringCondition1
