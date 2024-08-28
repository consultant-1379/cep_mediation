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
 * Define the ASN1 Type UE_MeasurementQuantity from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class UE_MeasurementQuantity extends Enumerated {
    
    /**
     * The default constructor.
     */
    private UE_MeasurementQuantity()
    {
	super(cFirstNumber);
    }
    
    protected UE_MeasurementQuantity(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final UE_MeasurementQuantity ue_TransmittedPower =
	new UE_MeasurementQuantity(0);
    public static final UE_MeasurementQuantity utra_Carrier_RSSI =
	new UE_MeasurementQuantity(1);
    public static final UE_MeasurementQuantity ue_RX_TX_TimeDifference =
	new UE_MeasurementQuantity(2);
    private final static UE_MeasurementQuantity cNamedNumbers[] = {
	 ue_TransmittedPower, 
	 utra_Carrier_RSSI, 
	 ue_RX_TX_TimeDifference
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
    
    public static UE_MeasurementQuantity valueOf(long value)
    {
	return (UE_MeasurementQuantity)ue_TransmittedPower.lookupValue(value);
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
	    "UE_MeasurementQuantity"
	),
	new QName (
	    "InformationElements",
	    "UE-MeasurementQuantity"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "ue-TransmittedPower",
		    0
		),
		new MemberListElement (
		    "utra-Carrier-RSSI",
		    1
		),
		new MemberListElement (
		    "ue-RX-TX-TimeDifference",
		    2
		)
	    }
	),
	0,
	ue_TransmittedPower
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' UE_MeasurementQuantity object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UE_MeasurementQuantity object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UE_MeasurementQuantity
