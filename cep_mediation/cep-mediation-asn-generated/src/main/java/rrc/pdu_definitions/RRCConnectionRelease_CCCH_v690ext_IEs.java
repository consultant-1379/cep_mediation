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


package rrc.pdu_definitions;

import com.oss.asn1.*;
import com.oss.metadata.*;
import rrc.*;

/**
 * Define the ASN1 Type RRCConnectionRelease_CCCH_v690ext_IEs from ASN1 Module PDU_definitions.
 * @see RRCConnectionRelease_v690ext_IEs
 */

public class RRCConnectionRelease_CCCH_v690ext_IEs extends RRCConnectionRelease_v690ext_IEs {
    
    /**
     * The default constructor.
     */
    public RRCConnectionRelease_CCCH_v690ext_IEs()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public RRCConnectionRelease_CCCH_v690ext_IEs(rrc.informationelements.RedirectionInfo_r6 redirectionInfo_v690ext)
    {
	super(redirectionInfo_v690ext);
    }
    
    /**
     * Initialize the type descriptor.
     */
    private static final SequenceInfo c_typeinfo = new SequenceInfo (
	new Tags (
	    new short[] {
		0x0010
	    }
	),
	new QName (
	    "rrc.pdu_definitions",
	    "RRCConnectionRelease_CCCH_v690ext_IEs"
	),
	new QName (
	    "PDU-definitions",
	    "RRCConnectionRelease-CCCH-v690ext-IEs"
	),
	12314,
	null,
	new FieldsRef (
	    new QName (
		"rrc.pdu_definitions",
		"RRCConnectionRelease_v690ext_IEs"
	    )
	),
	0,
	new TagDecodersRef (
	    new QName (
		"rrc.pdu_definitions",
		"RRCConnectionRelease_v690ext_IEs"
	    )
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' RRCConnectionRelease_CCCH_v690ext_IEs object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' RRCConnectionRelease_CCCH_v690ext_IEs object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for RRCConnectionRelease_CCCH_v690ext_IEs
