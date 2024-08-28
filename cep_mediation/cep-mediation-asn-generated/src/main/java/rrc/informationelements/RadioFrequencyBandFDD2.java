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
 * Define the ASN1 Type RadioFrequencyBandFDD2 from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class RadioFrequencyBandFDD2 extends Enumerated {
    
    /**
     * The default constructor.
     */
    private RadioFrequencyBandFDD2()
    {
	super(cFirstNumber);
    }
    
    protected RadioFrequencyBandFDD2(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final RadioFrequencyBandFDD2 bandVIII =
	new RadioFrequencyBandFDD2(0);
    public static final RadioFrequencyBandFDD2 bandIX =
	new RadioFrequencyBandFDD2(1);
    public static final RadioFrequencyBandFDD2 bandX =
	new RadioFrequencyBandFDD2(2);
    public static final RadioFrequencyBandFDD2 bandXI =
	new RadioFrequencyBandFDD2(3);
    public static final RadioFrequencyBandFDD2 bandXII =
	new RadioFrequencyBandFDD2(4);
    public static final RadioFrequencyBandFDD2 bandXIII =
	new RadioFrequencyBandFDD2(5);
    public static final RadioFrequencyBandFDD2 bandXIV =
	new RadioFrequencyBandFDD2(6);
    public static final RadioFrequencyBandFDD2 bandXV =
	new RadioFrequencyBandFDD2(7);
    public static final RadioFrequencyBandFDD2 bandXVI =
	new RadioFrequencyBandFDD2(8);
    public static final RadioFrequencyBandFDD2 bandXVII =
	new RadioFrequencyBandFDD2(9);
    public static final RadioFrequencyBandFDD2 bandXVIII =
	new RadioFrequencyBandFDD2(10);
    public static final RadioFrequencyBandFDD2 bandXIX =
	new RadioFrequencyBandFDD2(11);
    public static final RadioFrequencyBandFDD2 bandXX =
	new RadioFrequencyBandFDD2(12);
    public static final RadioFrequencyBandFDD2 bandXXI =
	new RadioFrequencyBandFDD2(13);
    public static final RadioFrequencyBandFDD2 bandXXII =
	new RadioFrequencyBandFDD2(14);
    public static final RadioFrequencyBandFDD2 extension_indicator =
	new RadioFrequencyBandFDD2(15);
    private final static RadioFrequencyBandFDD2 cNamedNumbers[] = {
	 bandVIII, 
	 bandIX, 
	 bandX, 
	 bandXI, 
	 bandXII, 
	 bandXIII, 
	 bandXIV, 
	 bandXV, 
	 bandXVI, 
	 bandXVII, 
	 bandXVIII, 
	 bandXIX, 
	 bandXX, 
	 bandXXI, 
	 bandXXII, 
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
    
    public static RadioFrequencyBandFDD2 valueOf(long value)
    {
	return (RadioFrequencyBandFDD2)bandVIII.lookupValue(value);
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
	    "RadioFrequencyBandFDD2"
	),
	new QName (
	    "InformationElements",
	    "RadioFrequencyBandFDD2"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "bandVIII",
		    0
		),
		new MemberListElement (
		    "bandIX",
		    1
		),
		new MemberListElement (
		    "bandX",
		    2
		),
		new MemberListElement (
		    "bandXI",
		    3
		),
		new MemberListElement (
		    "bandXII",
		    4
		),
		new MemberListElement (
		    "bandXIII",
		    5
		),
		new MemberListElement (
		    "bandXIV",
		    6
		),
		new MemberListElement (
		    "bandXV",
		    7
		),
		new MemberListElement (
		    "bandXVI",
		    8
		),
		new MemberListElement (
		    "bandXVII",
		    9
		),
		new MemberListElement (
		    "bandXVIII",
		    10
		),
		new MemberListElement (
		    "bandXIX",
		    11
		),
		new MemberListElement (
		    "bandXX",
		    12
		),
		new MemberListElement (
		    "bandXXI",
		    13
		),
		new MemberListElement (
		    "bandXXII",
		    14
		),
		new MemberListElement (
		    "extension-indicator",
		    15
		)
	    }
	),
	0,
	bandVIII
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' RadioFrequencyBandFDD2 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' RadioFrequencyBandFDD2 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for RadioFrequencyBandFDD2
