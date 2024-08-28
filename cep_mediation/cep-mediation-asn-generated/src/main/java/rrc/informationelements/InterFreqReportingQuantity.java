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
 * Define the ASN1 Type InterFreqReportingQuantity from ASN1 Module InformationElements.
 * @see Sequence
 */

public class InterFreqReportingQuantity extends Sequence {
    
    /**
     * The default constructor.
     */
    public InterFreqReportingQuantity()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public InterFreqReportingQuantity(BOOLEAN utra_Carrier_RSSI, 
		    BOOLEAN frequencyQualityEstimate, 
		    CellReportingQuantities nonFreqRelatedQuantities)
    {
	setUtra_Carrier_RSSI(utra_Carrier_RSSI);
	setFrequencyQualityEstimate(frequencyQualityEstimate);
	setNonFreqRelatedQuantities(nonFreqRelatedQuantities);
    }
    
    /**
     * Construct with components.
     */
    public InterFreqReportingQuantity(boolean utra_Carrier_RSSI, 
		    boolean frequencyQualityEstimate, 
		    CellReportingQuantities nonFreqRelatedQuantities)
    {
	this(new BOOLEAN(utra_Carrier_RSSI), 
	     new BOOLEAN(frequencyQualityEstimate), 
	     nonFreqRelatedQuantities);
    }
    
    public void initComponents()
    {
	mComponents[0] = new BOOLEAN();
	mComponents[1] = new BOOLEAN();
	mComponents[2] = new CellReportingQuantities();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[3];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new BOOLEAN();
	    case 1:
		return new BOOLEAN();
	    case 2:
		return new CellReportingQuantities();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "utra_Carrier_RSSI"
    public boolean getUtra_Carrier_RSSI()
    {
	return ((BOOLEAN)mComponents[0]).booleanValue();
    }
    
    public void setUtra_Carrier_RSSI(boolean utra_Carrier_RSSI)
    {
	setUtra_Carrier_RSSI(new BOOLEAN(utra_Carrier_RSSI));
    }
    
    public void setUtra_Carrier_RSSI(BOOLEAN utra_Carrier_RSSI)
    {
	mComponents[0] = utra_Carrier_RSSI;
    }
    
    
    // Methods for field "frequencyQualityEstimate"
    public boolean getFrequencyQualityEstimate()
    {
	return ((BOOLEAN)mComponents[1]).booleanValue();
    }
    
    public void setFrequencyQualityEstimate(boolean frequencyQualityEstimate)
    {
	setFrequencyQualityEstimate(new BOOLEAN(frequencyQualityEstimate));
    }
    
    public void setFrequencyQualityEstimate(BOOLEAN frequencyQualityEstimate)
    {
	mComponents[1] = frequencyQualityEstimate;
    }
    
    
    // Methods for field "nonFreqRelatedQuantities"
    public CellReportingQuantities getNonFreqRelatedQuantities()
    {
	return (CellReportingQuantities)mComponents[2];
    }
    
    public void setNonFreqRelatedQuantities(CellReportingQuantities nonFreqRelatedQuantities)
    {
	mComponents[2] = nonFreqRelatedQuantities;
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
	    "InterFreqReportingQuantity"
	),
	new QName (
	    "InformationElements",
	    "InterFreqReportingQuantity"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"BOOLEAN"
			    ),
			    new QName (
				"builtin",
				"BOOLEAN"
			    ),
			    12314,
			    null
			)
		    ),
		    "utra-Carrier-RSSI",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"BOOLEAN"
			    ),
			    new QName (
				"builtin",
				"BOOLEAN"
			    ),
			    12314,
			    null
			)
		    ),
		    "frequencyQualityEstimate",
		    1,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"CellReportingQuantities"
			    ),
			    new QName (
				"InformationElements",
				"CellReportingQuantities"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "CellReportingQuantities"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "CellReportingQuantities"
				)
			    ),
			    0
			)
		    ),
		    "nonFreqRelatedQuantities",
		    2,
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
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8002, 2)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' InterFreqReportingQuantity object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' InterFreqReportingQuantity object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for InterFreqReportingQuantity
