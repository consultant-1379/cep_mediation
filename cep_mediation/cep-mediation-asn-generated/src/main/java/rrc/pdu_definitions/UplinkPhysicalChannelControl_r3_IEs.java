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


package rrc.pdu_definitions;

import com.oss.asn1.*;
import com.oss.metadata.*;
import rrc.*;

/**
 * Define the ASN1 Type UplinkPhysicalChannelControl_r3_IEs from ASN1 Module PDU_definitions.
 * @see Sequence
 */

public class UplinkPhysicalChannelControl_r3_IEs extends Sequence {
    
    /**
     * The default constructor.
     */
    public UplinkPhysicalChannelControl_r3_IEs()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public UplinkPhysicalChannelControl_r3_IEs(rrc.informationelements.RRC_TransactionIdentifier rrc_TransactionIdentifier, 
		    rrc.informationelements.CCTrCH_PowerControlInfo ccTrCH_PowerControlInfo, 
		    rrc.informationelements.UL_TimingAdvanceControl timingAdvance, 
		    rrc.informationelements.Alpha alpha, 
		    rrc.informationelements.SpecialBurstScheduling specialBurstScheduling, 
		    rrc.informationelements.ConstantValueTdd prach_ConstantValue, 
		    rrc.informationelements.ConstantValueTdd pusch_ConstantValue)
    {
	setRrc_TransactionIdentifier(rrc_TransactionIdentifier);
	setCcTrCH_PowerControlInfo(ccTrCH_PowerControlInfo);
	setTimingAdvance(timingAdvance);
	setAlpha(alpha);
	setSpecialBurstScheduling(specialBurstScheduling);
	setPrach_ConstantValue(prach_ConstantValue);
	setPusch_ConstantValue(pusch_ConstantValue);
    }
    
    /**
     * Construct with required components.
     */
    public UplinkPhysicalChannelControl_r3_IEs(rrc.informationelements.RRC_TransactionIdentifier rrc_TransactionIdentifier)
    {
	setRrc_TransactionIdentifier(rrc_TransactionIdentifier);
    }
    
    public void initComponents()
    {
	mComponents[0] = new rrc.informationelements.RRC_TransactionIdentifier();
	mComponents[1] = new rrc.informationelements.CCTrCH_PowerControlInfo();
	mComponents[2] = new rrc.informationelements.UL_TimingAdvanceControl();
	mComponents[3] = new rrc.informationelements.Alpha();
	mComponents[4] = new rrc.informationelements.SpecialBurstScheduling();
	mComponents[5] = new rrc.informationelements.ConstantValueTdd();
	mComponents[6] = new rrc.informationelements.ConstantValueTdd();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[7];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new rrc.informationelements.RRC_TransactionIdentifier();
	    case 1:
		return new rrc.informationelements.CCTrCH_PowerControlInfo();
	    case 2:
		return new rrc.informationelements.UL_TimingAdvanceControl();
	    case 3:
		return new rrc.informationelements.Alpha();
	    case 4:
		return new rrc.informationelements.SpecialBurstScheduling();
	    case 5:
		return new rrc.informationelements.ConstantValueTdd();
	    case 6:
		return new rrc.informationelements.ConstantValueTdd();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "rrc_TransactionIdentifier"
    public rrc.informationelements.RRC_TransactionIdentifier getRrc_TransactionIdentifier()
    {
	return (rrc.informationelements.RRC_TransactionIdentifier)mComponents[0];
    }
    
    public void setRrc_TransactionIdentifier(rrc.informationelements.RRC_TransactionIdentifier rrc_TransactionIdentifier)
    {
	mComponents[0] = rrc_TransactionIdentifier;
    }
    
    
    // Methods for field "ccTrCH_PowerControlInfo"
    public rrc.informationelements.CCTrCH_PowerControlInfo getCcTrCH_PowerControlInfo()
    {
	return (rrc.informationelements.CCTrCH_PowerControlInfo)mComponents[1];
    }
    
    public void setCcTrCH_PowerControlInfo(rrc.informationelements.CCTrCH_PowerControlInfo ccTrCH_PowerControlInfo)
    {
	mComponents[1] = ccTrCH_PowerControlInfo;
    }
    
    public boolean hasCcTrCH_PowerControlInfo()
    {
	return componentIsPresent(1);
    }
    
    public void deleteCcTrCH_PowerControlInfo()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "timingAdvance"
    public rrc.informationelements.UL_TimingAdvanceControl getTimingAdvance()
    {
	return (rrc.informationelements.UL_TimingAdvanceControl)mComponents[2];
    }
    
    public void setTimingAdvance(rrc.informationelements.UL_TimingAdvanceControl timingAdvance)
    {
	mComponents[2] = timingAdvance;
    }
    
    public boolean hasTimingAdvance()
    {
	return componentIsPresent(2);
    }
    
    public void deleteTimingAdvance()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "alpha"
    public rrc.informationelements.Alpha getAlpha()
    {
	return (rrc.informationelements.Alpha)mComponents[3];
    }
    
    public void setAlpha(rrc.informationelements.Alpha alpha)
    {
	mComponents[3] = alpha;
    }
    
    public boolean hasAlpha()
    {
	return componentIsPresent(3);
    }
    
    public void deleteAlpha()
    {
	setComponentAbsent(3);
    }
    
    
    // Methods for field "specialBurstScheduling"
    public rrc.informationelements.SpecialBurstScheduling getSpecialBurstScheduling()
    {
	return (rrc.informationelements.SpecialBurstScheduling)mComponents[4];
    }
    
    public void setSpecialBurstScheduling(rrc.informationelements.SpecialBurstScheduling specialBurstScheduling)
    {
	mComponents[4] = specialBurstScheduling;
    }
    
    public boolean hasSpecialBurstScheduling()
    {
	return componentIsPresent(4);
    }
    
    public void deleteSpecialBurstScheduling()
    {
	setComponentAbsent(4);
    }
    
    
    // Methods for field "prach_ConstantValue"
    public rrc.informationelements.ConstantValueTdd getPrach_ConstantValue()
    {
	return (rrc.informationelements.ConstantValueTdd)mComponents[5];
    }
    
    public void setPrach_ConstantValue(rrc.informationelements.ConstantValueTdd prach_ConstantValue)
    {
	mComponents[5] = prach_ConstantValue;
    }
    
    public boolean hasPrach_ConstantValue()
    {
	return componentIsPresent(5);
    }
    
    public void deletePrach_ConstantValue()
    {
	setComponentAbsent(5);
    }
    
    
    // Methods for field "pusch_ConstantValue"
    public rrc.informationelements.ConstantValueTdd getPusch_ConstantValue()
    {
	return (rrc.informationelements.ConstantValueTdd)mComponents[6];
    }
    
    public void setPusch_ConstantValue(rrc.informationelements.ConstantValueTdd pusch_ConstantValue)
    {
	mComponents[6] = pusch_ConstantValue;
    }
    
    public boolean hasPusch_ConstantValue()
    {
	return componentIsPresent(6);
    }
    
    public void deletePusch_ConstantValue()
    {
	setComponentAbsent(6);
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
	    "rrc.pdu_definitions",
	    "UplinkPhysicalChannelControl_r3_IEs"
	),
	new QName (
	    "PDU-definitions",
	    "UplinkPhysicalChannelControl-r3-IEs"
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
				"RRC_TransactionIdentifier"
			    ),
			    new QName (
				"InformationElements",
				"RRC-TransactionIdentifier"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new rrc.informationelements.RRC_TransactionIdentifier(0), 
				    new rrc.informationelements.RRC_TransactionIdentifier(3),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(3)
			    ),
			    null
			)
		    ),
		    "rrc-TransactionIdentifier",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"CCTrCH_PowerControlInfo"
			    ),
			    new QName (
				"InformationElements",
				"CCTrCH-PowerControlInfo"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "CCTrCH_PowerControlInfo"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "CCTrCH_PowerControlInfo"
				)
			    ),
			    0
			)
		    ),
		    "ccTrCH-PowerControlInfo",
		    1,
		    3,
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
				"UL_TimingAdvanceControl"
			    ),
			    new QName (
				"InformationElements",
				"UL-TimingAdvanceControl"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UL_TimingAdvanceControl"
				)
			    ),
			    0,
			    new TagDecoder (
				new TagDecoderElement[] {
				    new TagDecoderElement((short)0x8000, 0),
				    new TagDecoderElement((short)0x8001, 1)
				}
			    )
			)
		    ),
		    "timingAdvance",
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
				"Alpha"
			    ),
			    new QName (
				"InformationElements",
				"Alpha"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new rrc.informationelements.Alpha(0), 
				    new rrc.informationelements.Alpha(8),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(8)
			    ),
			    null
			)
		    ),
		    "alpha",
		    3,
		    3,
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
				"rrc.informationelements",
				"SpecialBurstScheduling"
			    ),
			    new QName (
				"InformationElements",
				"SpecialBurstScheduling"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new rrc.informationelements.SpecialBurstScheduling(0), 
				    new rrc.informationelements.SpecialBurstScheduling(7),
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
		    "specialBurstScheduling",
		    4,
		    3,
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
				"rrc.informationelements",
				"ConstantValueTdd"
			    ),
			    new QName (
				"InformationElements",
				"ConstantValueTdd"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new rrc.informationelements.ConstantValueTdd(-35), 
				    new rrc.informationelements.ConstantValueTdd(10),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(-35),
				new java.lang.Long(10)
			    ),
			    null
			)
		    ),
		    "prach-ConstantValue",
		    5,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8006
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"ConstantValueTdd"
			    ),
			    new QName (
				"InformationElements",
				"ConstantValueTdd"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new rrc.informationelements.ConstantValueTdd(-35), 
				    new rrc.informationelements.ConstantValueTdd(10),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(-35),
				new java.lang.Long(10)
			    ),
			    null
			)
		    ),
		    "pusch-ConstantValue",
		    6,
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
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8006, 6)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' UplinkPhysicalChannelControl_r3_IEs object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UplinkPhysicalChannelControl_r3_IEs object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UplinkPhysicalChannelControl_r3_IEs
