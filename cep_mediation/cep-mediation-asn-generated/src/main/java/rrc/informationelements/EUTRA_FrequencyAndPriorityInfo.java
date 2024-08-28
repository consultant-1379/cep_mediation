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
 * Define the ASN1 Type EUTRA_FrequencyAndPriorityInfo from ASN1 Module InformationElements.
 * @see Sequence
 */

public class EUTRA_FrequencyAndPriorityInfo extends Sequence {
    
    /**
     * The default constructor.
     */
    public EUTRA_FrequencyAndPriorityInfo()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public EUTRA_FrequencyAndPriorityInfo(EARFCN earfcn, 
		    EUTRA_MeasurementBandwidth measurementBandwidth, 
		    INTEGER priority, INTEGER qRxLevMinEUTRA, 
		    INTEGER threshXhigh, INTEGER threshXlow, 
		    EUTRA_BlacklistedCellPerFreqList eutra_blackListedCellList, 
		    BOOLEAN eutraDetection)
    {
	setEarfcn(earfcn);
	setMeasurementBandwidth(measurementBandwidth);
	setPriority(priority);
	setQRxLevMinEUTRA(qRxLevMinEUTRA);
	setThreshXhigh(threshXhigh);
	setThreshXlow(threshXlow);
	setEutra_blackListedCellList(eutra_blackListedCellList);
	setEutraDetection(eutraDetection);
    }
    
    /**
     * Construct with components.
     */
    public EUTRA_FrequencyAndPriorityInfo(EARFCN earfcn, 
		    EUTRA_MeasurementBandwidth measurementBandwidth, 
		    long priority, long qRxLevMinEUTRA, long threshXhigh, 
		    long threshXlow, 
		    EUTRA_BlacklistedCellPerFreqList eutra_blackListedCellList, 
		    boolean eutraDetection)
    {
	this(earfcn, measurementBandwidth, new INTEGER(priority), 
	     new INTEGER(qRxLevMinEUTRA), new INTEGER(threshXhigh), 
	     new INTEGER(threshXlow), eutra_blackListedCellList, 
	     new BOOLEAN(eutraDetection));
    }
    
    /**
     * Construct with required components.
     */
    public EUTRA_FrequencyAndPriorityInfo(EARFCN earfcn, long priority, 
		    long qRxLevMinEUTRA, long threshXhigh, long threshXlow, 
		    boolean eutraDetection)
    {
	setEarfcn(earfcn);
	setPriority(priority);
	setQRxLevMinEUTRA(qRxLevMinEUTRA);
	setThreshXhigh(threshXhigh);
	setThreshXlow(threshXlow);
	setEutraDetection(eutraDetection);
    }
    
    public void initComponents()
    {
	mComponents[0] = new EARFCN();
	mComponents[1] = EUTRA_MeasurementBandwidth.mbw6;
	mComponents[2] = new INTEGER();
	mComponents[3] = new INTEGER();
	mComponents[4] = new INTEGER();
	mComponents[5] = new INTEGER();
	mComponents[6] = new EUTRA_BlacklistedCellPerFreqList();
	mComponents[7] = new BOOLEAN();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[8];
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
		return new INTEGER();
	    case 3:
		return new INTEGER();
	    case 4:
		return new INTEGER();
	    case 5:
		return new INTEGER();
	    case 6:
		return new EUTRA_BlacklistedCellPerFreqList();
	    case 7:
		return new BOOLEAN();
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
    
    
    // Methods for field "priority"
    public long getPriority()
    {
	return ((INTEGER)mComponents[2]).longValue();
    }
    
    public void setPriority(long priority)
    {
	setPriority(new INTEGER(priority));
    }
    
    public void setPriority(INTEGER priority)
    {
	mComponents[2] = priority;
    }
    
    
    // Methods for field "qRxLevMinEUTRA"
    public long getQRxLevMinEUTRA()
    {
	return ((INTEGER)mComponents[3]).longValue();
    }
    
    public void setQRxLevMinEUTRA(long qRxLevMinEUTRA)
    {
	setQRxLevMinEUTRA(new INTEGER(qRxLevMinEUTRA));
    }
    
    public void setQRxLevMinEUTRA(INTEGER qRxLevMinEUTRA)
    {
	mComponents[3] = qRxLevMinEUTRA;
    }
    
    
    // Methods for field "threshXhigh"
    public long getThreshXhigh()
    {
	return ((INTEGER)mComponents[4]).longValue();
    }
    
    public void setThreshXhigh(long threshXhigh)
    {
	setThreshXhigh(new INTEGER(threshXhigh));
    }
    
    public void setThreshXhigh(INTEGER threshXhigh)
    {
	mComponents[4] = threshXhigh;
    }
    
    
    // Methods for field "threshXlow"
    public long getThreshXlow()
    {
	return ((INTEGER)mComponents[5]).longValue();
    }
    
    public void setThreshXlow(long threshXlow)
    {
	setThreshXlow(new INTEGER(threshXlow));
    }
    
    public void setThreshXlow(INTEGER threshXlow)
    {
	mComponents[5] = threshXlow;
    }
    
    
    // Methods for field "eutra_blackListedCellList"
    public EUTRA_BlacklistedCellPerFreqList getEutra_blackListedCellList()
    {
	return (EUTRA_BlacklistedCellPerFreqList)mComponents[6];
    }
    
    public void setEutra_blackListedCellList(EUTRA_BlacklistedCellPerFreqList eutra_blackListedCellList)
    {
	mComponents[6] = eutra_blackListedCellList;
    }
    
    public boolean hasEutra_blackListedCellList()
    {
	return componentIsPresent(6);
    }
    
    public void deleteEutra_blackListedCellList()
    {
	setComponentAbsent(6);
    }
    
    
    // Methods for field "eutraDetection"
    public boolean getEutraDetection()
    {
	return ((BOOLEAN)mComponents[7]).booleanValue();
    }
    
    public void setEutraDetection(boolean eutraDetection)
    {
	setEutraDetection(new BOOLEAN(eutraDetection));
    }
    
    public void setEutraDetection(BOOLEAN eutraDetection)
    {
	mComponents[7] = eutraDetection;
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
	    "EUTRA_FrequencyAndPriorityInfo"
	),
	new QName (
	    "InformationElements",
	    "EUTRA-FrequencyAndPriorityInfo"
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
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"INTEGER"
			    ),
			    new QName (
				"builtin",
				"INTEGER"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new com.oss.asn1.INTEGER(0), 
				    new com.oss.asn1.INTEGER(7),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(7)
			    ),
			    null
			)
		    ),
		    "priority",
		    2,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"INTEGER"
			    ),
			    new QName (
				"builtin",
				"INTEGER"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new com.oss.asn1.INTEGER(-70), 
				    new com.oss.asn1.INTEGER(-22),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(-70),
				new java.lang.Long(-22)
			    ),
			    null
			)
		    ),
		    "qRxLevMinEUTRA",
		    3,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8004
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"INTEGER"
			    ),
			    new QName (
				"builtin",
				"INTEGER"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new com.oss.asn1.INTEGER(0), 
				    new com.oss.asn1.INTEGER(31),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(31)
			    ),
			    null
			)
		    ),
		    "threshXhigh",
		    4,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8005
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"INTEGER"
			    ),
			    new QName (
				"builtin",
				"INTEGER"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new com.oss.asn1.INTEGER(0), 
				    new com.oss.asn1.INTEGER(31),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(31)
			    ),
			    null
			)
		    ),
		    "threshXlow",
		    5,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8006
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
		    6,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8007
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
		    "eutraDetection",
		    7,
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
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2)
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
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8004, 4)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8005, 5)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8006, 6),
			new TagDecoderElement((short)0x8007, 7)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8007, 7)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' EUTRA_FrequencyAndPriorityInfo object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' EUTRA_FrequencyAndPriorityInfo object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for EUTRA_FrequencyAndPriorityInfo
