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
 * Define the ASN1 Type MBMS_RequiredUEAction_Mod from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class MBMS_RequiredUEAction_Mod extends Enumerated {
    
    /**
     * The default constructor.
     */
    private MBMS_RequiredUEAction_Mod()
    {
	super(cFirstNumber);
    }
    
    protected MBMS_RequiredUEAction_Mod(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final MBMS_RequiredUEAction_Mod none =
	new MBMS_RequiredUEAction_Mod(0);
    public static final MBMS_RequiredUEAction_Mod acquireCountingInfo =
	new MBMS_RequiredUEAction_Mod(1);
    public static final MBMS_RequiredUEAction_Mod acquireCountingInfoPTM_RBsUnmodified =
	new MBMS_RequiredUEAction_Mod(2);
    public static final MBMS_RequiredUEAction_Mod acquirePTM_RBInfo =
	new MBMS_RequiredUEAction_Mod(3);
    public static final MBMS_RequiredUEAction_Mod requestPTPRB =
	new MBMS_RequiredUEAction_Mod(4);
    public static final MBMS_RequiredUEAction_Mod releasePTM_RB =
	new MBMS_RequiredUEAction_Mod(5);
    private final static MBMS_RequiredUEAction_Mod cNamedNumbers[] = {
	 none, 
	 acquireCountingInfo, 
	 acquireCountingInfoPTM_RBsUnmodified, 
	 acquirePTM_RBInfo, 
	 requestPTPRB, 
	 releasePTM_RB
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
    
    public static MBMS_RequiredUEAction_Mod valueOf(long value)
    {
	return (MBMS_RequiredUEAction_Mod)none.lookupValue(value);
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
	    "MBMS_RequiredUEAction_Mod"
	),
	new QName (
	    "InformationElements",
	    "MBMS-RequiredUEAction-Mod"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "none",
		    0
		),
		new MemberListElement (
		    "acquireCountingInfo",
		    1
		),
		new MemberListElement (
		    "acquireCountingInfoPTM-RBsUnmodified",
		    2
		),
		new MemberListElement (
		    "acquirePTM-RBInfo",
		    3
		),
		new MemberListElement (
		    "requestPTPRB",
		    4
		),
		new MemberListElement (
		    "releasePTM-RB",
		    5
		)
	    }
	),
	0,
	none
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' MBMS_RequiredUEAction_Mod object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' MBMS_RequiredUEAction_Mod object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for MBMS_RequiredUEAction_Mod
