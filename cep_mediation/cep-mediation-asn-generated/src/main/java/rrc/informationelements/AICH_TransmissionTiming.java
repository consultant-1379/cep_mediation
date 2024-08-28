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
 * Define the ASN1 Type AICH_TransmissionTiming from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class AICH_TransmissionTiming extends Enumerated {
    
    /**
     * The default constructor.
     */
    private AICH_TransmissionTiming()
    {
	super(cFirstNumber);
    }
    
    protected AICH_TransmissionTiming(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final AICH_TransmissionTiming e0 =
	new AICH_TransmissionTiming(0);
    public static final AICH_TransmissionTiming e1 =
	new AICH_TransmissionTiming(1);
    private final static AICH_TransmissionTiming cNamedNumbers[] = {
	 e0, 
	 e1
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
    
    public static AICH_TransmissionTiming valueOf(long value)
    {
	return (AICH_TransmissionTiming)e0.lookupValue(value);
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
	    "AICH_TransmissionTiming"
	),
	new QName (
	    "InformationElements",
	    "AICH-TransmissionTiming"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "e0",
		    0
		),
		new MemberListElement (
		    "e1",
		    1
		)
	    }
	),
	0,
	e0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' AICH_TransmissionTiming object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' AICH_TransmissionTiming object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for AICH_TransmissionTiming
