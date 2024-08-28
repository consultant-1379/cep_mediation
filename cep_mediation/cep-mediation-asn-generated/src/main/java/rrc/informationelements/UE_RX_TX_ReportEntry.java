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
 * Define the ASN1 Type UE_RX_TX_ReportEntry from ASN1 Module InformationElements.
 * @see Sequence
 */

public class UE_RX_TX_ReportEntry extends Sequence {
    
    /**
     * The default constructor.
     */
    public UE_RX_TX_ReportEntry()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public UE_RX_TX_ReportEntry(PrimaryCPICH_Info primaryCPICH_Info, 
		    UE_RX_TX_TimeDifferenceType1 ue_RX_TX_TimeDifferenceType1)
    {
	setPrimaryCPICH_Info(primaryCPICH_Info);
	setUe_RX_TX_TimeDifferenceType1(ue_RX_TX_TimeDifferenceType1);
    }
    
    public void initComponents()
    {
	mComponents[0] = new PrimaryCPICH_Info();
	mComponents[1] = new UE_RX_TX_TimeDifferenceType1();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[2];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new PrimaryCPICH_Info();
	    case 1:
		return new UE_RX_TX_TimeDifferenceType1();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "primaryCPICH_Info"
    public PrimaryCPICH_Info getPrimaryCPICH_Info()
    {
	return (PrimaryCPICH_Info)mComponents[0];
    }
    
    public void setPrimaryCPICH_Info(PrimaryCPICH_Info primaryCPICH_Info)
    {
	mComponents[0] = primaryCPICH_Info;
    }
    
    
    // Methods for field "ue_RX_TX_TimeDifferenceType1"
    public UE_RX_TX_TimeDifferenceType1 getUe_RX_TX_TimeDifferenceType1()
    {
	return (UE_RX_TX_TimeDifferenceType1)mComponents[1];
    }
    
    public void setUe_RX_TX_TimeDifferenceType1(UE_RX_TX_TimeDifferenceType1 ue_RX_TX_TimeDifferenceType1)
    {
	mComponents[1] = ue_RX_TX_TimeDifferenceType1;
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
	    "UE_RX_TX_ReportEntry"
	),
	new QName (
	    "InformationElements",
	    "UE-RX-TX-ReportEntry"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"PrimaryCPICH_Info"
			    ),
			    new QName (
				"InformationElements",
				"PrimaryCPICH-Info"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "PrimaryCPICH_Info"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "PrimaryCPICH_Info"
				)
			    ),
			    0
			)
		    ),
		    "primaryCPICH-Info",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"UE_RX_TX_TimeDifferenceType1"
			    ),
			    new QName (
				"InformationElements",
				"UE-RX-TX-TimeDifferenceType1"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new UE_RX_TX_TimeDifferenceType1(768), 
				    new UE_RX_TX_TimeDifferenceType1(1791),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(768),
				new java.lang.Long(1791)
			    ),
			    null
			)
		    ),
		    "ue-RX-TX-TimeDifferenceType1",
		    1,
		    2,
		    null
		)
	    }
	),
	0,
	new TagDecoders (
	    new TagDecoder[] {
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8000, 0)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8001, 1)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' UE_RX_TX_ReportEntry object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UE_RX_TX_ReportEntry object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UE_RX_TX_ReportEntry
