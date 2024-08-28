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
 * Define the ASN1 Type MBMS_PTM_RBReleaseCause_LCR_r7 from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class MBMS_PTM_RBReleaseCause_LCR_r7 extends Enumerated {
    
    /**
     * The default constructor.
     */
    private MBMS_PTM_RBReleaseCause_LCR_r7()
    {
	super(cFirstNumber);
    }
    
    protected MBMS_PTM_RBReleaseCause_LCR_r7(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final MBMS_PTM_RBReleaseCause_LCR_r7 normalRelease =
	new MBMS_PTM_RBReleaseCause_LCR_r7(0);
    public static final MBMS_PTM_RBReleaseCause_LCR_r7 outOfMBMSServiceCoverageInRAN =
	new MBMS_PTM_RBReleaseCause_LCR_r7(1);
    public static final MBMS_PTM_RBReleaseCause_LCR_r7 networkAbnormalRelease =
	new MBMS_PTM_RBReleaseCause_LCR_r7(2);
    public static final MBMS_PTM_RBReleaseCause_LCR_r7 spare5 =
	new MBMS_PTM_RBReleaseCause_LCR_r7(3);
    public static final MBMS_PTM_RBReleaseCause_LCR_r7 spare4 =
	new MBMS_PTM_RBReleaseCause_LCR_r7(4);
    public static final MBMS_PTM_RBReleaseCause_LCR_r7 spare3 =
	new MBMS_PTM_RBReleaseCause_LCR_r7(5);
    public static final MBMS_PTM_RBReleaseCause_LCR_r7 spare2 =
	new MBMS_PTM_RBReleaseCause_LCR_r7(6);
    public static final MBMS_PTM_RBReleaseCause_LCR_r7 spare1 =
	new MBMS_PTM_RBReleaseCause_LCR_r7(7);
    private final static MBMS_PTM_RBReleaseCause_LCR_r7 cNamedNumbers[] = {
	 normalRelease, 
	 outOfMBMSServiceCoverageInRAN, 
	 networkAbnormalRelease, 
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
    
    public static MBMS_PTM_RBReleaseCause_LCR_r7 valueOf(long value)
    {
	return (MBMS_PTM_RBReleaseCause_LCR_r7)normalRelease.lookupValue(value);
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
	    "MBMS_PTM_RBReleaseCause_LCR_r7"
	),
	new QName (
	    "InformationElements",
	    "MBMS-PTM-RBReleaseCause-LCR-r7"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "normalRelease",
		    0
		),
		new MemberListElement (
		    "outOfMBMSServiceCoverageInRAN",
		    1
		),
		new MemberListElement (
		    "networkAbnormalRelease",
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
	normalRelease
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' MBMS_PTM_RBReleaseCause_LCR_r7 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' MBMS_PTM_RBReleaseCause_LCR_r7 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for MBMS_PTM_RBReleaseCause_LCR_r7
