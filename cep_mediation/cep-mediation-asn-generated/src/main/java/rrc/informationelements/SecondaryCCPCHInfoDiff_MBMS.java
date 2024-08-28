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
 * Define the ASN1 Type SecondaryCCPCHInfoDiff_MBMS from ASN1 Module InformationElements.
 * @see Sequence
 */

public class SecondaryCCPCHInfoDiff_MBMS extends Sequence {
    
    /**
     * The default constructor.
     */
    public SecondaryCCPCHInfoDiff_MBMS()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public SecondaryCCPCHInfoDiff_MBMS(SecondaryScramblingCode secondaryScramblingCode, 
		    BOOLEAN sttd_Indicator, 
		    SF256_AndCodeNumber sf_AndCodeNumber, 
		    TimingOffset timingOffset)
    {
	setSecondaryScramblingCode(secondaryScramblingCode);
	setSttd_Indicator(sttd_Indicator);
	setSf_AndCodeNumber(sf_AndCodeNumber);
	setTimingOffset(timingOffset);
    }
    
    /**
     * Construct with components.
     */
    public SecondaryCCPCHInfoDiff_MBMS(SecondaryScramblingCode secondaryScramblingCode, 
		    boolean sttd_Indicator, 
		    SF256_AndCodeNumber sf_AndCodeNumber, 
		    TimingOffset timingOffset)
    {
	this(secondaryScramblingCode, new BOOLEAN(sttd_Indicator), 
	     sf_AndCodeNumber, timingOffset);
    }
    
    /**
     * Construct with required components.
     */
    public SecondaryCCPCHInfoDiff_MBMS(boolean sttd_Indicator)
    {
	setSttd_Indicator(sttd_Indicator);
    }
    
    public void initComponents()
    {
	mComponents[0] = new SecondaryScramblingCode();
	mComponents[1] = new BOOLEAN();
	mComponents[2] = new SF256_AndCodeNumber();
	mComponents[3] = new TimingOffset();
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
		return new SecondaryScramblingCode();
	    case 1:
		return new BOOLEAN();
	    case 2:
		return new SF256_AndCodeNumber();
	    case 3:
		return new TimingOffset();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "secondaryScramblingCode"
    public SecondaryScramblingCode getSecondaryScramblingCode()
    {
	return (SecondaryScramblingCode)mComponents[0];
    }
    
    public void setSecondaryScramblingCode(SecondaryScramblingCode secondaryScramblingCode)
    {
	mComponents[0] = secondaryScramblingCode;
    }
    
    public boolean hasSecondaryScramblingCode()
    {
	return componentIsPresent(0);
    }
    
    public void deleteSecondaryScramblingCode()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "sttd_Indicator"
    public boolean getSttd_Indicator()
    {
	return ((BOOLEAN)mComponents[1]).booleanValue();
    }
    
    public void setSttd_Indicator(boolean sttd_Indicator)
    {
	setSttd_Indicator(new BOOLEAN(sttd_Indicator));
    }
    
    public void setSttd_Indicator(BOOLEAN sttd_Indicator)
    {
	mComponents[1] = sttd_Indicator;
    }
    
    
    // Methods for field "sf_AndCodeNumber"
    public SF256_AndCodeNumber getSf_AndCodeNumber()
    {
	return (SF256_AndCodeNumber)mComponents[2];
    }
    
    public void setSf_AndCodeNumber(SF256_AndCodeNumber sf_AndCodeNumber)
    {
	mComponents[2] = sf_AndCodeNumber;
    }
    
    public boolean hasSf_AndCodeNumber()
    {
	return componentIsPresent(2);
    }
    
    public void deleteSf_AndCodeNumber()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "timingOffset"
    public TimingOffset getTimingOffset()
    {
	return (TimingOffset)mComponents[3];
    }
    
    public void setTimingOffset(TimingOffset timingOffset)
    {
	mComponents[3] = timingOffset;
    }
    
    public boolean hasTimingOffset()
    {
	return componentIsPresent(3);
    }
    
    public void deleteTimingOffset()
    {
	setComponentAbsent(3);
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
	    "SecondaryCCPCHInfoDiff_MBMS"
	),
	new QName (
	    "InformationElements",
	    "SecondaryCCPCHInfoDiff-MBMS"
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
				"SecondaryScramblingCode"
			    ),
			    new QName (
				"InformationElements",
				"SecondaryScramblingCode"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new SecondaryScramblingCode(1), 
				    new SecondaryScramblingCode(15),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(15)
			    ),
			    null
			)
		    ),
		    "secondaryScramblingCode",
		    0,
		    3,
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
		    "sttd-Indicator",
		    1,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"SF256_AndCodeNumber"
			    ),
			    new QName (
				"InformationElements",
				"SF256-AndCodeNumber"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "SF256_AndCodeNumber"
				)
			    ),
			    0,
			    new TagDecoder (
				new TagDecoderElement[] {
				    new TagDecoderElement((short)0x8000, 0),
				    new TagDecoderElement((short)0x8001, 1),
				    new TagDecoderElement((short)0x8002, 2),
				    new TagDecoderElement((short)0x8003, 3),
				    new TagDecoderElement((short)0x8004, 4),
				    new TagDecoderElement((short)0x8005, 5),
				    new TagDecoderElement((short)0x8006, 6)
				}
			    )
			)
		    ),
		    "sf-AndCodeNumber",
		    2,
		    3,
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
				"rrc.informationelements",
				"TimingOffset"
			    ),
			    new QName (
				"InformationElements",
				"TimingOffset"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new TimingOffset(0), 
				    new TimingOffset(149),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(149)
			    ),
			    null
			)
		    ),
		    "timingOffset",
		    3,
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
			new TagDecoderElement((short)0x8000, 0),
			new TagDecoderElement((short)0x8001, 1)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8001, 1)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3)
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
     * Get the type descriptor (TypeInfo) of 'this' SecondaryCCPCHInfoDiff_MBMS object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' SecondaryCCPCHInfoDiff_MBMS object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for SecondaryCCPCHInfoDiff_MBMS
