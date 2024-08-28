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
 * Define the ASN1 Type LoggedMeasGSMNeighbourCellsinfo from ASN1 Module InformationElements.
 * @see Sequence
 */

public class LoggedMeasGSMNeighbourCellsinfo extends Sequence {
    
    /**
     * The default constructor.
     */
    public LoggedMeasGSMNeighbourCellsinfo()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public LoggedMeasGSMNeighbourCellsinfo(BSIC bsic, 
		    Frequency_Band frequency_band, BCCH_ARFCN bcch_ARFCN, 
		    GSM_CarrierRSSI gsm_CarrierRSSI)
    {
	setBsic(bsic);
	setFrequency_band(frequency_band);
	setBcch_ARFCN(bcch_ARFCN);
	setGsm_CarrierRSSI(gsm_CarrierRSSI);
    }
    
    public void initComponents()
    {
	mComponents[0] = new BSIC();
	mComponents[1] = Frequency_Band.dcs1800BandUsed;
	mComponents[2] = new BCCH_ARFCN();
	mComponents[3] = new GSM_CarrierRSSI();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[4];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new BSIC();
	    case 1:
		return Frequency_Band.dcs1800BandUsed;
	    case 2:
		return new BCCH_ARFCN();
	    case 3:
		return new GSM_CarrierRSSI();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "bsic"
    public BSIC getBsic()
    {
	return (BSIC)mComponents[0];
    }
    
    public void setBsic(BSIC bsic)
    {
	mComponents[0] = bsic;
    }
    
    
    // Methods for field "frequency_band"
    public Frequency_Band getFrequency_band()
    {
	return (Frequency_Band)mComponents[1];
    }
    
    public void setFrequency_band(Frequency_Band frequency_band)
    {
	mComponents[1] = frequency_band;
    }
    
    
    // Methods for field "bcch_ARFCN"
    public BCCH_ARFCN getBcch_ARFCN()
    {
	return (BCCH_ARFCN)mComponents[2];
    }
    
    public void setBcch_ARFCN(BCCH_ARFCN bcch_ARFCN)
    {
	mComponents[2] = bcch_ARFCN;
    }
    
    
    // Methods for field "gsm_CarrierRSSI"
    public GSM_CarrierRSSI getGsm_CarrierRSSI()
    {
	return (GSM_CarrierRSSI)mComponents[3];
    }
    
    public void setGsm_CarrierRSSI(GSM_CarrierRSSI gsm_CarrierRSSI)
    {
	mComponents[3] = gsm_CarrierRSSI;
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
	    "LoggedMeasGSMNeighbourCellsinfo"
	),
	new QName (
	    "InformationElements",
	    "LoggedMeasGSMNeighbourCellsinfo"
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
				"BSIC"
			    ),
			    new QName (
				"InformationElements",
				"BSIC"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "BSIC"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "BSIC"
				)
			    ),
			    0
			)
		    ),
		    "bsic",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"Frequency_Band"
			    ),
			    new QName (
				"InformationElements",
				"Frequency-Band"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"dcs1800BandUsed",
					0
				    ),
				    new MemberListElement (
					"pcs1900BandUsed",
					1
				    )
				}
			    ),
			    0,
			    Frequency_Band.dcs1800BandUsed
			)
		    ),
		    "frequency-band",
		    1,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"BCCH_ARFCN"
			    ),
			    new QName (
				"InformationElements",
				"BCCH-ARFCN"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new BCCH_ARFCN(0), 
				    new BCCH_ARFCN(1023),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(1023)
			    ),
			    null
			)
		    ),
		    "bcch-ARFCN",
		    2,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"GSM_CarrierRSSI"
			    ),
			    new QName (
				"InformationElements",
				"GSM-CarrierRSSI"
			    ),
			    12314,
			    new SizeConstraint (
				new SingleValueConstraint (
				    new com.oss.asn1.INTEGER(6)
				)
			    ),
			    new Bounds (
				new java.lang.Long(6),
				new java.lang.Long(6)
			    ),
			    null
			)
		    ),
		    "gsm-CarrierRSSI",
		    3,
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
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8003, 3)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' LoggedMeasGSMNeighbourCellsinfo object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' LoggedMeasGSMNeighbourCellsinfo object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for LoggedMeasGSMNeighbourCellsinfo
