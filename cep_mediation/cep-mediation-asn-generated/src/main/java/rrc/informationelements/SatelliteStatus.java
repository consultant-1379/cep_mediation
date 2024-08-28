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
 * Define the ASN1 Type SatelliteStatus from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class SatelliteStatus extends Enumerated {
    
    /**
     * The default constructor.
     */
    private SatelliteStatus()
    {
	super(cFirstNumber);
    }
    
    protected SatelliteStatus(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final SatelliteStatus ns_NN_U =
	new SatelliteStatus(0);
    public static final SatelliteStatus es_SN =
	new SatelliteStatus(1);
    public static final SatelliteStatus es_NN_U =
	new SatelliteStatus(2);
    public static final SatelliteStatus rev2 =
	new SatelliteStatus(3);
    public static final SatelliteStatus rev =
	new SatelliteStatus(4);
    private final static SatelliteStatus cNamedNumbers[] = {
	 ns_NN_U, 
	 es_SN, 
	 es_NN_U, 
	 rev2, 
	 rev
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
    
    public static SatelliteStatus valueOf(long value)
    {
	return (SatelliteStatus)ns_NN_U.lookupValue(value);
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
	    "SatelliteStatus"
	),
	new QName (
	    "InformationElements",
	    "SatelliteStatus"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "ns-NN-U",
		    0
		),
		new MemberListElement (
		    "es-SN",
		    1
		),
		new MemberListElement (
		    "es-NN-U",
		    2
		),
		new MemberListElement (
		    "rev2",
		    3
		),
		new MemberListElement (
		    "rev",
		    4
		)
	    }
	),
	0,
	ns_NN_U
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' SatelliteStatus object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' SatelliteStatus object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for SatelliteStatus
