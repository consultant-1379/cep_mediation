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
 * Define the ASN1 Type PICH_Info_LCR_r4 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class PICH_Info_LCR_r4 extends Sequence {
    
    /**
     * The default constructor.
     */
    public PICH_Info_LCR_r4()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public PICH_Info_LCR_r4(TimeslotNumber_LCR_r4 timeslot, 
		    PichChannelisationCodeList_LCR_r4 pichChannelisationCodeList_LCR_r4, 
		    MidambleShiftAndBurstType_LCR_r4 midambleShiftAndBurstType, 
		    RepPerLengthOffset_PICH repetitionPeriodLengthOffset, 
		    PagingIndicatorLength pagingIndicatorLength, N_GAP n_GAP, 
		    N_PCH n_PCH)
    {
	setTimeslot(timeslot);
	setPichChannelisationCodeList_LCR_r4(pichChannelisationCodeList_LCR_r4);
	setMidambleShiftAndBurstType(midambleShiftAndBurstType);
	setRepetitionPeriodLengthOffset(repetitionPeriodLengthOffset);
	setPagingIndicatorLength(pagingIndicatorLength);
	setN_GAP(n_GAP);
	setN_PCH(n_PCH);
    }
    
    /**
     * Construct with required components.
     */
    public PICH_Info_LCR_r4(PichChannelisationCodeList_LCR_r4 pichChannelisationCodeList_LCR_r4, 
		    MidambleShiftAndBurstType_LCR_r4 midambleShiftAndBurstType)
    {
	setPichChannelisationCodeList_LCR_r4(pichChannelisationCodeList_LCR_r4);
	setMidambleShiftAndBurstType(midambleShiftAndBurstType);
    }
    
    public void initComponents()
    {
	mComponents[0] = new TimeslotNumber_LCR_r4();
	mComponents[1] = new PichChannelisationCodeList_LCR_r4();
	mComponents[2] = new MidambleShiftAndBurstType_LCR_r4();
	mComponents[3] = new RepPerLengthOffset_PICH();
	mComponents[4] = PagingIndicatorLength.pi4;
	mComponents[5] = N_GAP.f2;
	mComponents[6] = new N_PCH();
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
		return new TimeslotNumber_LCR_r4();
	    case 1:
		return new PichChannelisationCodeList_LCR_r4();
	    case 2:
		return new MidambleShiftAndBurstType_LCR_r4();
	    case 3:
		return new RepPerLengthOffset_PICH();
	    case 4:
		return PagingIndicatorLength.pi4;
	    case 5:
		return N_GAP.f2;
	    case 6:
		return new N_PCH();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    // Default Values
    public static final PagingIndicatorLength pagingIndicatorLength__default = 
	PagingIndicatorLength.pi4;
    public static final N_GAP n_GAP__default = 
	N_GAP.f4;
    public static final N_PCH n_PCH__default = 
	new N_PCH(2);
    
    // Methods for field "timeslot"
    public TimeslotNumber_LCR_r4 getTimeslot()
    {
	return (TimeslotNumber_LCR_r4)mComponents[0];
    }
    
    public void setTimeslot(TimeslotNumber_LCR_r4 timeslot)
    {
	mComponents[0] = timeslot;
    }
    
    public boolean hasTimeslot()
    {
	return componentIsPresent(0);
    }
    
    public void deleteTimeslot()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "pichChannelisationCodeList_LCR_r4"
    public PichChannelisationCodeList_LCR_r4 getPichChannelisationCodeList_LCR_r4()
    {
	return (PichChannelisationCodeList_LCR_r4)mComponents[1];
    }
    
    public void setPichChannelisationCodeList_LCR_r4(PichChannelisationCodeList_LCR_r4 pichChannelisationCodeList_LCR_r4)
    {
	mComponents[1] = pichChannelisationCodeList_LCR_r4;
    }
    
    
    // Methods for field "midambleShiftAndBurstType"
    public MidambleShiftAndBurstType_LCR_r4 getMidambleShiftAndBurstType()
    {
	return (MidambleShiftAndBurstType_LCR_r4)mComponents[2];
    }
    
    public void setMidambleShiftAndBurstType(MidambleShiftAndBurstType_LCR_r4 midambleShiftAndBurstType)
    {
	mComponents[2] = midambleShiftAndBurstType;
    }
    
    
    // Methods for field "repetitionPeriodLengthOffset"
    public RepPerLengthOffset_PICH getRepetitionPeriodLengthOffset()
    {
	return (RepPerLengthOffset_PICH)mComponents[3];
    }
    
    public void setRepetitionPeriodLengthOffset(RepPerLengthOffset_PICH repetitionPeriodLengthOffset)
    {
	mComponents[3] = repetitionPeriodLengthOffset;
    }
    
    public boolean hasRepetitionPeriodLengthOffset()
    {
	return componentIsPresent(3);
    }
    
    public void deleteRepetitionPeriodLengthOffset()
    {
	setComponentAbsent(3);
    }
    
    
    // Methods for field "pagingIndicatorLength"
    public PagingIndicatorLength getPagingIndicatorLength()
    {
	if (hasPagingIndicatorLength())
	    return (PagingIndicatorLength)mComponents[4];
	else
	    return (PagingIndicatorLength)pagingIndicatorLength__default.clone();
    }
    
    public void setPagingIndicatorLength(PagingIndicatorLength pagingIndicatorLength)
    {
	mComponents[4] = pagingIndicatorLength;
    }
    
    public void setPagingIndicatorLengthToDefault()
    {
	setPagingIndicatorLength(pagingIndicatorLength__default);
    }
    
    public boolean hasDefaultPagingIndicatorLength()
    {
	return true;
    }
    
    public boolean hasPagingIndicatorLength()
    {
	return componentIsPresent(4);
    }
    
    public void deletePagingIndicatorLength()
    {
	setComponentAbsent(4);
    }
    
    
    // Methods for field "n_GAP"
    public N_GAP getN_GAP()
    {
	if (hasN_GAP())
	    return (N_GAP)mComponents[5];
	else
	    return (N_GAP)n_GAP__default.clone();
    }
    
    public void setN_GAP(N_GAP n_GAP)
    {
	mComponents[5] = n_GAP;
    }
    
    public void setN_GAPToDefault()
    {
	setN_GAP(n_GAP__default);
    }
    
    public boolean hasDefaultN_GAP()
    {
	return true;
    }
    
    public boolean hasN_GAP()
    {
	return componentIsPresent(5);
    }
    
    public void deleteN_GAP()
    {
	setComponentAbsent(5);
    }
    
    
    // Methods for field "n_PCH"
    public N_PCH getN_PCH()
    {
	if (hasN_PCH())
	    return (N_PCH)mComponents[6];
	else
	    return (N_PCH)n_PCH__default.clone();
    }
    
    public void setN_PCH(N_PCH n_PCH)
    {
	mComponents[6] = n_PCH;
    }
    
    public void setN_PCHToDefault()
    {
	setN_PCH(n_PCH__default);
    }
    
    public boolean hasDefaultN_PCH()
    {
	return true;
    }
    
    public boolean hasN_PCH()
    {
	return componentIsPresent(6);
    }
    
    public void deleteN_PCH()
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
	    "rrc.informationelements",
	    "PICH_Info_LCR_r4"
	),
	new QName (
	    "InformationElements",
	    "PICH-Info-LCR-r4"
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
				"TimeslotNumber_LCR_r4"
			    ),
			    new QName (
				"InformationElements",
				"TimeslotNumber-LCR-r4"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new TimeslotNumber_LCR_r4(0), 
				    new TimeslotNumber_LCR_r4(6),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(6)
			    ),
			    null
			)
		    ),
		    "timeslot",
		    0,
		    3,
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
				"PichChannelisationCodeList_LCR_r4"
			    ),
			    new QName (
				"InformationElements",
				"PichChannelisationCodeList-LCR-r4"
			    ),
			    12314,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new com.oss.asn1.INTEGER(1), 
					new com.oss.asn1.INTEGER(2),
					0
				    )
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(2)
			    ),
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "DL_TS_ChannelisationCode"
				)
			    )
			)
		    ),
		    "pichChannelisationCodeList-LCR-r4",
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
				"MidambleShiftAndBurstType_LCR_r4"
			    ),
			    new QName (
				"InformationElements",
				"MidambleShiftAndBurstType-LCR-r4"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "MidambleShiftAndBurstType_LCR_r4"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "MidambleShiftAndBurstType_LCR_r4"
				)
			    ),
			    0
			)
		    ),
		    "midambleShiftAndBurstType",
		    2,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"RepPerLengthOffset_PICH"
			    ),
			    new QName (
				"InformationElements",
				"RepPerLengthOffset-PICH"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "RepPerLengthOffset_PICH"
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
				    new TagDecoderElement((short)0x8006, 6),
				    new TagDecoderElement((short)0x8007, 7),
				    new TagDecoderElement((short)0x8008, 8)
				}
			    )
			)
		    ),
		    "repetitionPeriodLengthOffset",
		    3,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8004
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"PagingIndicatorLength"
			    ),
			    new QName (
				"InformationElements",
				"PagingIndicatorLength"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"pi4",
					0
				    ),
				    new MemberListElement (
					"pi8",
					1
				    ),
				    new MemberListElement (
					"pi16",
					2
				    )
				}
			    ),
			    0,
			    PagingIndicatorLength.pi4
			)
		    ),
		    "pagingIndicatorLength",
		    4,
		    3,
		    pagingIndicatorLength__default
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8005
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"N_GAP"
			    ),
			    new QName (
				"InformationElements",
				"N-GAP"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"f2",
					0
				    ),
				    new MemberListElement (
					"f4",
					1
				    ),
				    new MemberListElement (
					"f8",
					2
				    )
				}
			    ),
			    0,
			    N_GAP.f2
			)
		    ),
		    "n-GAP",
		    5,
		    3,
		    n_GAP__default
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
				"N_PCH"
			    ),
			    new QName (
				"InformationElements",
				"N-PCH"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new N_PCH(1), 
				    new N_PCH(8),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(8)
			    ),
			    null
			)
		    ),
		    "n-PCH",
		    6,
		    3,
		    n_PCH__default
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
			new TagDecoderElement((short)0x8002, 2)
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
     * Get the type descriptor (TypeInfo) of 'this' PICH_Info_LCR_r4 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' PICH_Info_LCR_r4 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for PICH_Info_LCR_r4
