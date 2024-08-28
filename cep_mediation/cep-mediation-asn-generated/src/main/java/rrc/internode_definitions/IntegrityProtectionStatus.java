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


package rrc.internode_definitions;

import com.oss.asn1.*;
import com.oss.metadata.*;
import rrc.*;

/**
 * Define the ASN1 Type IntegrityProtectionStatus from ASN1 Module Internode_definitions.
 * @see Enumerated
 */

public final class IntegrityProtectionStatus extends Enumerated {
    
    /**
     * The default constructor.
     */
    private IntegrityProtectionStatus()
    {
	super(cFirstNumber);
    }
    
    protected IntegrityProtectionStatus(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final IntegrityProtectionStatus started =
	new IntegrityProtectionStatus(0);
    public static final IntegrityProtectionStatus notStarted =
	new IntegrityProtectionStatus(1);
    private final static IntegrityProtectionStatus cNamedNumbers[] = {
	 started, 
	 notStarted
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
    
    public static IntegrityProtectionStatus valueOf(long value)
    {
	return (IntegrityProtectionStatus)started.lookupValue(value);
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
	    "rrc.internode_definitions",
	    "IntegrityProtectionStatus"
	),
	new QName (
	    "Internode-definitions",
	    "IntegrityProtectionStatus"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "started",
		    0
		),
		new MemberListElement (
		    "notStarted",
		    1
		)
	    }
	),
	0,
	started
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' IntegrityProtectionStatus object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' IntegrityProtectionStatus object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for IntegrityProtectionStatus
