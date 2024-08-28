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
 * Define the ASN1 Type PagingRecordTypeID from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class PagingRecordTypeID extends Enumerated {
    
    /**
     * The default constructor.
     */
    private PagingRecordTypeID()
    {
	super(cFirstNumber);
    }
    
    protected PagingRecordTypeID(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final PagingRecordTypeID imsi_GSM_MAP =
	new PagingRecordTypeID(0);
    public static final PagingRecordTypeID tmsi_GSM_MAP_P_TMSI =
	new PagingRecordTypeID(1);
    public static final PagingRecordTypeID imsi_DS_41 =
	new PagingRecordTypeID(2);
    public static final PagingRecordTypeID tmsi_DS_41 =
	new PagingRecordTypeID(3);
    private final static PagingRecordTypeID cNamedNumbers[] = {
	 imsi_GSM_MAP, 
	 tmsi_GSM_MAP_P_TMSI, 
	 imsi_DS_41, 
	 tmsi_DS_41
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
    
    public static PagingRecordTypeID valueOf(long value)
    {
	return (PagingRecordTypeID)imsi_GSM_MAP.lookupValue(value);
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
	    "PagingRecordTypeID"
	),
	new QName (
	    "InformationElements",
	    "PagingRecordTypeID"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "imsi-GSM-MAP",
		    0
		),
		new MemberListElement (
		    "tmsi-GSM-MAP-P-TMSI",
		    1
		),
		new MemberListElement (
		    "imsi-DS-41",
		    2
		),
		new MemberListElement (
		    "tmsi-DS-41",
		    3
		)
	    }
	),
	0,
	imsi_GSM_MAP
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' PagingRecordTypeID object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' PagingRecordTypeID object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for PagingRecordTypeID
