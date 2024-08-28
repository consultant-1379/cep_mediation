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
 * Define the ASN1 Type EUTRA_TargetFreqInfo from ASN1 Module InformationElements.
 * @see Sequence
 */

public class EUTRA_TargetFreqInfo extends Sequence {
    
    /**
     * The default constructor.
     */
    public EUTRA_TargetFreqInfo()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public EUTRA_TargetFreqInfo(EARFCN dlEUTRACarrierFreq, 
		    EUTRA_BlacklistedCellPerFreqList eutraBlacklistedCellPerFreqList)
    {
	setDlEUTRACarrierFreq(dlEUTRACarrierFreq);
	setEutraBlacklistedCellPerFreqList(eutraBlacklistedCellPerFreqList);
    }
    
    /**
     * Construct with required components.
     */
    public EUTRA_TargetFreqInfo(EARFCN dlEUTRACarrierFreq)
    {
	setDlEUTRACarrierFreq(dlEUTRACarrierFreq);
    }
    
    public void initComponents()
    {
	mComponents[0] = new EARFCN();
	mComponents[1] = new EUTRA_BlacklistedCellPerFreqList();
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
		return new EARFCN();
	    case 1:
		return new EUTRA_BlacklistedCellPerFreqList();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "dlEUTRACarrierFreq"
    public EARFCN getDlEUTRACarrierFreq()
    {
	return (EARFCN)mComponents[0];
    }
    
    public void setDlEUTRACarrierFreq(EARFCN dlEUTRACarrierFreq)
    {
	mComponents[0] = dlEUTRACarrierFreq;
    }
    
    
    // Methods for field "eutraBlacklistedCellPerFreqList"
    public EUTRA_BlacklistedCellPerFreqList getEutraBlacklistedCellPerFreqList()
    {
	return (EUTRA_BlacklistedCellPerFreqList)mComponents[1];
    }
    
    public void setEutraBlacklistedCellPerFreqList(EUTRA_BlacklistedCellPerFreqList eutraBlacklistedCellPerFreqList)
    {
	mComponents[1] = eutraBlacklistedCellPerFreqList;
    }
    
    public boolean hasEutraBlacklistedCellPerFreqList()
    {
	return componentIsPresent(1);
    }
    
    public void deleteEutraBlacklistedCellPerFreqList()
    {
	setComponentAbsent(1);
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
	    "EUTRA_TargetFreqInfo"
	),
	new QName (
	    "InformationElements",
	    "EUTRA-TargetFreqInfo"
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
		    "dlEUTRACarrierFreq",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
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
		    "eutraBlacklistedCellPerFreqList",
		    1,
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
			new TagDecoderElement((short)0x8001, 1)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' EUTRA_TargetFreqInfo object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' EUTRA_TargetFreqInfo object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for EUTRA_TargetFreqInfo
