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
 * Define the ASN1 Type MIMO_Parameters_v7f0ext from ASN1 Module InformationElements.
 * @see MIMO_PilotConfiguration_v7f0ext
 */

public class MIMO_Parameters_v7f0ext extends MIMO_PilotConfiguration_v7f0ext {
    
    /**
     * The default constructor.
     */
    public MIMO_Parameters_v7f0ext()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public MIMO_Parameters_v7f0ext(S_CPICH_PowerOffset_MIMO s_cpich_PowerOffset_Mimo)
    {
	super(s_cpich_PowerOffset_Mimo);
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
	    "rrc.informationelements",
	    "MIMO_Parameters_v7f0ext"
	),
	new QName (
	    "InformationElements",
	    "MIMO-Parameters-v7f0ext"
	),
	12314,
	null,
	new FieldsRef (
	    new QName (
		"rrc.informationelements",
		"MIMO_PilotConfiguration_v7f0ext"
	    )
	),
	0,
	new TagDecodersRef (
	    new QName (
		"rrc.informationelements",
		"MIMO_PilotConfiguration_v7f0ext"
	    )
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' MIMO_Parameters_v7f0ext object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' MIMO_Parameters_v7f0ext object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for MIMO_Parameters_v7f0ext
