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
 * Define the ASN1 Type MU_MIMO_Operation from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class MU_MIMO_Operation extends Enumerated {
    
    /**
     * The default constructor.
     */
    private MU_MIMO_Operation()
    {
	super(cFirstNumber);
    }
    
    protected MU_MIMO_Operation(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final MU_MIMO_Operation uL =
	new MU_MIMO_Operation(0);
    public static final MU_MIMO_Operation dL =
	new MU_MIMO_Operation(1);
    public static final MU_MIMO_Operation uLandDL =
	new MU_MIMO_Operation(2);
    public static final MU_MIMO_Operation spare =
	new MU_MIMO_Operation(3);
    private final static MU_MIMO_Operation cNamedNumbers[] = {
	 uL, 
	 dL, 
	 uLandDL, 
	 spare
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
    
    public static MU_MIMO_Operation valueOf(long value)
    {
	return (MU_MIMO_Operation)uL.lookupValue(value);
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
	    "MU_MIMO_Operation"
	),
	new QName (
	    "InformationElements",
	    "MU-MIMO-Operation"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "uL",
		    0
		),
		new MemberListElement (
		    "dL",
		    1
		),
		new MemberListElement (
		    "uLandDL",
		    2
		),
		new MemberListElement (
		    "spare",
		    3
		)
	    }
	),
	0,
	uL
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' MU_MIMO_Operation object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' MU_MIMO_Operation object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for MU_MIMO_Operation
