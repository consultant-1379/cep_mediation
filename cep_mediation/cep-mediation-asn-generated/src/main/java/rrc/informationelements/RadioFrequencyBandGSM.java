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
 * Define the ASN1 Type RadioFrequencyBandGSM from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class RadioFrequencyBandGSM extends Enumerated {
    
    /**
     * The default constructor.
     */
    private RadioFrequencyBandGSM()
    {
	super(cFirstNumber);
    }
    
    protected RadioFrequencyBandGSM(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final RadioFrequencyBandGSM gsm450 =
	new RadioFrequencyBandGSM(0);
    public static final RadioFrequencyBandGSM gsm480 =
	new RadioFrequencyBandGSM(1);
    public static final RadioFrequencyBandGSM gsm850 =
	new RadioFrequencyBandGSM(2);
    public static final RadioFrequencyBandGSM gsm900P =
	new RadioFrequencyBandGSM(3);
    public static final RadioFrequencyBandGSM gsm900E =
	new RadioFrequencyBandGSM(4);
    public static final RadioFrequencyBandGSM gsm1800 =
	new RadioFrequencyBandGSM(5);
    public static final RadioFrequencyBandGSM gsm1900 =
	new RadioFrequencyBandGSM(6);
    public static final RadioFrequencyBandGSM spare9 =
	new RadioFrequencyBandGSM(7);
    public static final RadioFrequencyBandGSM spare8 =
	new RadioFrequencyBandGSM(8);
    public static final RadioFrequencyBandGSM spare7 =
	new RadioFrequencyBandGSM(9);
    public static final RadioFrequencyBandGSM spare6 =
	new RadioFrequencyBandGSM(10);
    public static final RadioFrequencyBandGSM spare5 =
	new RadioFrequencyBandGSM(11);
    public static final RadioFrequencyBandGSM spare4 =
	new RadioFrequencyBandGSM(12);
    public static final RadioFrequencyBandGSM spare3 =
	new RadioFrequencyBandGSM(13);
    public static final RadioFrequencyBandGSM spare2 =
	new RadioFrequencyBandGSM(14);
    public static final RadioFrequencyBandGSM spare1 =
	new RadioFrequencyBandGSM(15);
    private final static RadioFrequencyBandGSM cNamedNumbers[] = {
	 gsm450, 
	 gsm480, 
	 gsm850, 
	 gsm900P, 
	 gsm900E, 
	 gsm1800, 
	 gsm1900, 
	 spare9, 
	 spare8, 
	 spare7, 
	 spare6, 
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
    
    public static RadioFrequencyBandGSM valueOf(long value)
    {
	return (RadioFrequencyBandGSM)gsm450.lookupValue(value);
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
	    "RadioFrequencyBandGSM"
	),
	new QName (
	    "InformationElements",
	    "RadioFrequencyBandGSM"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "gsm450",
		    0
		),
		new MemberListElement (
		    "gsm480",
		    1
		),
		new MemberListElement (
		    "gsm850",
		    2
		),
		new MemberListElement (
		    "gsm900P",
		    3
		),
		new MemberListElement (
		    "gsm900E",
		    4
		),
		new MemberListElement (
		    "gsm1800",
		    5
		),
		new MemberListElement (
		    "gsm1900",
		    6
		),
		new MemberListElement (
		    "spare9",
		    7
		),
		new MemberListElement (
		    "spare8",
		    8
		),
		new MemberListElement (
		    "spare7",
		    9
		),
		new MemberListElement (
		    "spare6",
		    10
		),
		new MemberListElement (
		    "spare5",
		    11
		),
		new MemberListElement (
		    "spare4",
		    12
		),
		new MemberListElement (
		    "spare3",
		    13
		),
		new MemberListElement (
		    "spare2",
		    14
		),
		new MemberListElement (
		    "spare1",
		    15
		)
	    }
	),
	0,
	gsm450
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' RadioFrequencyBandGSM object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' RadioFrequencyBandGSM object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for RadioFrequencyBandGSM
