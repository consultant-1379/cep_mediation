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
 * Define the ASN1 Type EUTRA_FrequencyInfo from ASN1 Module InformationElements.
 * @see Sequence
 */

public class EUTRA_FrequencyInfo extends Sequence {
    
    /**
     * The default constructor.
     */
    public EUTRA_FrequencyInfo()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public EUTRA_FrequencyInfo(EARFCN earfcn, 
		    EUTRA_MeasurementBandwidth measurementBandwidth, 
		    EUTRA_BlacklistedCellPerFreqList eutra_blackListedCellList)
    {
	setEarfcn(earfcn);
	setMeasurementBandwidth(measurementBandwidth);
	setEutra_blackListedCellList(eutra_blackListedCellList);
    }
    
    /**
     * Construct with required components.
     */
    public EUTRA_FrequencyInfo(EARFCN earfcn)
    {
	setEarfcn(earfcn);
    }
    
    public void initComponents()
    {
	mComponents[0] = new EARFCN();
	mComponents[1] = EUTRA_MeasurementBandwidth.mbw6;
	mComponents[2] = new EUTRA_BlacklistedCellPerFreqList();
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
		return new EARFCN();
	    case 1:
		return EUTRA_MeasurementBandwidth.mbw6;
	    case 2:
		return new EUTRA_BlacklistedCellPerFreqList();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "earfcn"
    public EARFCN getEarfcn()
    {
	return (EARFCN)mComponents[0];
    }
    
    public void setEarfcn(EARFCN earfcn)
    {
	mComponents[0] = earfcn;
    }
    
    
    // Methods for field "measurementBandwidth"
    public EUTRA_MeasurementBandwidth getMeasurementBandwidth()
    {
	return (EUTRA_MeasurementBandwidth)mComponents[1];
    }
    
    public void setMeasurementBandwidth(EUTRA_MeasurementBandwidth measurementBandwidth)
    {
	mComponents[1] = measurementBandwidth;
    }
    
    public boolean hasMeasurementBandwidth()
    {
	return componentIsPresent(1);
    }
    
    public void deleteMeasurementBandwidth()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "eutra_blackListedCellList"
    public EUTRA_BlacklistedCellPerFreqList getEutra_blackListedCellList()
    {
	return (EUTRA_BlacklistedCellPerFreqList)mComponents[2];
    }
    
    public void setEutra_blackListedCellList(EUTRA_BlacklistedCellPerFreqList eutra_blackListedCellList)
    {
	mComponents[2] = eutra_blackListedCellList;
    }
    
    public boolean hasEutra_blackListedCellList()
    {
	return componentIsPresent(2);
    }
    
    public void deleteEutra_blackListedCellList()
    {
	setComponentAbsent(2);
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
	    "EUTRA_FrequencyInfo"
	),
	new QName (
	    "InformationElements",
	    "EUTRA-FrequencyInfo"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"EARFCN"
			    ),
			    new QName (
				"InformationElements",
				"EARFCN"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new EARFCN(0), 
				    new EARFCN(65535),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(65535)
			    ),
			    null
			)
		    ),
		    "earfcn",
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
			    EUTRA_MeasurementBandwidth.mbw6
			)
		    ),
		    "measurementBandwidth",
		    1,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"EUTRA_BlacklistedCellPerFreqList"
			    ),
			    new QName (
				"InformationElements",
				"EUTRA-BlacklistedCellPerFreqList"
			    ),
			    12314,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new com.oss.asn1.INTEGER(1), 
					new com.oss.asn1.INTEGER(16),
					0
				    )
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(16)
			    ),
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "EUTRA_BlacklistedCell"
				)
			    )
			)
		    ),
		    "eutra-blackListedCellList",
		    2,
		    3,
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
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2)
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
     * Get the type descriptor (TypeInfo) of 'this' EUTRA_FrequencyInfo object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' EUTRA_FrequencyInfo object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for EUTRA_FrequencyInfo
