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
 * Define the ASN1 Type RadioFrequencyBandFDD from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class RadioFrequencyBandFDD extends Enumerated {
    
    /**
     * The default constructor.
     */
    private RadioFrequencyBandFDD()
    {
	super(cFirstNumber);
    }
    
    protected RadioFrequencyBandFDD(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final RadioFrequencyBandFDD fdd2100 =
	new RadioFrequencyBandFDD(0);
    public static final RadioFrequencyBandFDD fdd1900 =
	new RadioFrequencyBandFDD(1);
    public static final RadioFrequencyBandFDD fdd1800 =
	new RadioFrequencyBandFDD(2);
    public static final RadioFrequencyBandFDD bandVI =
	new RadioFrequencyBandFDD(3);
    public static final RadioFrequencyBandFDD bandIV =
	new RadioFrequencyBandFDD(4);
    public static final RadioFrequencyBandFDD bandV =
	new RadioFrequencyBandFDD(5);
    public static final RadioFrequencyBandFDD bandVII =
	new RadioFrequencyBandFDD(6);
    public static final RadioFrequencyBandFDD extension_indicator =
	new RadioFrequencyBandFDD(7);
    private final static RadioFrequencyBandFDD cNamedNumbers[] = {
	 fdd2100, 
	 fdd1900, 
	 fdd1800, 
	 bandVI, 
	 bandIV, 
	 bandV, 
	 bandVII, 
	 extension_indicator
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
    
    public static RadioFrequencyBandFDD valueOf(long value)
    {
	return (RadioFrequencyBandFDD)fdd2100.lookupValue(value);
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
	    "RadioFrequencyBandFDD"
	),
	new QName (
	    "InformationElements",
	    "RadioFrequencyBandFDD"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "fdd2100",
		    0
		),
		new MemberListElement (
		    "fdd1900",
		    1
		),
		new MemberListElement (
		    "fdd1800",
		    2
		),
		new MemberListElement (
		    "bandVI",
		    3
		),
		new MemberListElement (
		    "bandIV",
		    4
		),
		new MemberListElement (
		    "bandV",
		    5
		),
		new MemberListElement (
		    "bandVII",
		    6
		),
		new MemberListElement (
		    "extension-indicator",
		    7
		)
	    }
	),
	0,
	fdd2100
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' RadioFrequencyBandFDD object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' RadioFrequencyBandFDD object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for RadioFrequencyBandFDD
