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
 * Define the ASN1 Type EUTRA_MeasurementBandwidth from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class EUTRA_MeasurementBandwidth extends Enumerated {
    
    /**
     * The default constructor.
     */
    private EUTRA_MeasurementBandwidth()
    {
	super(cFirstNumber);
    }
    
    protected EUTRA_MeasurementBandwidth(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final EUTRA_MeasurementBandwidth mbw6 =
	new EUTRA_MeasurementBandwidth(0);
    public static final EUTRA_MeasurementBandwidth mbw15 =
	new EUTRA_MeasurementBandwidth(1);
    public static final EUTRA_MeasurementBandwidth mbw25 =
	new EUTRA_MeasurementBandwidth(2);
    public static final EUTRA_MeasurementBandwidth mbw50 =
	new EUTRA_MeasurementBandwidth(3);
    public static final EUTRA_MeasurementBandwidth mbw75 =
	new EUTRA_MeasurementBandwidth(4);
    public static final EUTRA_MeasurementBandwidth mbw100 =
	new EUTRA_MeasurementBandwidth(5);
    private final static EUTRA_MeasurementBandwidth cNamedNumbers[] = {
	 mbw6, 
	 mbw15, 
	 mbw25, 
	 mbw50, 
	 mbw75, 
	 mbw100
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
    
    public static EUTRA_MeasurementBandwidth valueOf(long value)
    {
	return (EUTRA_MeasurementBandwidth)mbw6.lookupValue(value);
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
	    "EUTRA_MeasurementBandwidth"
	),
	new QName (
	    "InformationElements",
	    "EUTRA-MeasurementBandwidth"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "mbw6",
		    0
		),
		new MemberListElement (
		    "mbw15",
		    1
		),
		new MemberListElement (
		    "mbw25",
		    2
		),
		new MemberListElement (
		    "mbw50",
		    3
		),
		new MemberListElement (
		    "mbw75",
		    4
		),
		new MemberListElement (
		    "mbw100",
		    5
		)
	    }
	),
	0,
	mbw6
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' EUTRA_MeasurementBandwidth object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' EUTRA_MeasurementBandwidth object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for EUTRA_MeasurementBandwidth
