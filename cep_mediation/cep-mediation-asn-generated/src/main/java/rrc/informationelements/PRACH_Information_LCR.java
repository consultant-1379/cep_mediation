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
 * Define the ASN1 Type PRACH_Information_LCR from ASN1 Module InformationElements.
 * @see Sequence
 */

public class PRACH_Information_LCR extends Sequence {
    
    /**
     * The default constructor.
     */
    public PRACH_Information_LCR()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public PRACH_Information_LCR(TimeslotNumber_PRACH_LCR_r4 timeslot, 
		    PRACH_ChanCodes_List_LCR prach_ChanCodes_list_LCR, 
		    MidambleShiftAndBurstType_LCR_r4 midambleShiftAndBurstType, 
		    FPACH_Info_r4 fpach_Info)
    {
	setTimeslot(timeslot);
	setPrach_ChanCodes_list_LCR(prach_ChanCodes_list_LCR);
	setMidambleShiftAndBurstType(midambleShiftAndBurstType);
	setFpach_Info(fpach_Info);
    }
    
    /**
     * Construct with required components.
     */
    public PRACH_Information_LCR(TimeslotNumber_PRACH_LCR_r4 timeslot, 
		    PRACH_ChanCodes_List_LCR prach_ChanCodes_list_LCR, 
		    MidambleShiftAndBurstType_LCR_r4 midambleShiftAndBurstType)
    {
	setTimeslot(timeslot);
	setPrach_ChanCodes_list_LCR(prach_ChanCodes_list_LCR);
	setMidambleShiftAndBurstType(midambleShiftAndBurstType);
    }
    
    public void initComponents()
    {
	mComponents[0] = new TimeslotNumber_PRACH_LCR_r4();
	mComponents[1] = new PRACH_ChanCodes_List_LCR();
	mComponents[2] = new MidambleShiftAndBurstType_LCR_r4();
	mComponents[3] = new FPACH_Info_r4();
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
		return new TimeslotNumber_PRACH_LCR_r4();
	    case 1:
		return new PRACH_ChanCodes_List_LCR();
	    case 2:
		return new MidambleShiftAndBurstType_LCR_r4();
	    case 3:
		return new FPACH_Info_r4();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "timeslot"
    public TimeslotNumber_PRACH_LCR_r4 getTimeslot()
    {
	return (TimeslotNumber_PRACH_LCR_r4)mComponents[0];
    }
    
    public void setTimeslot(TimeslotNumber_PRACH_LCR_r4 timeslot)
    {
	mComponents[0] = timeslot;
    }
    
    
    // Methods for field "prach_ChanCodes_list_LCR"
    public PRACH_ChanCodes_List_LCR getPrach_ChanCodes_list_LCR()
    {
	return (PRACH_ChanCodes_List_LCR)mComponents[1];
    }
    
    public void setPrach_ChanCodes_list_LCR(PRACH_ChanCodes_List_LCR prach_ChanCodes_list_LCR)
    {
	mComponents[1] = prach_ChanCodes_list_LCR;
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
    
    
    // Methods for field "fpach_Info"
    public FPACH_Info_r4 getFpach_Info()
    {
	return (FPACH_Info_r4)mComponents[3];
    }
    
    public void setFpach_Info(FPACH_Info_r4 fpach_Info)
    {
	mComponents[3] = fpach_Info;
    }
    
    public boolean hasFpach_Info()
    {
	return componentIsPresent(3);
    }
    
    public void deleteFpach_Info()
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
	    "PRACH_Information_LCR"
	),
	new QName (
	    "InformationElements",
	    "PRACH-Information-LCR"
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
				"TimeslotNumber_PRACH_LCR_r4"
			    ),
			    new QName (
				"InformationElements",
				"TimeslotNumber-PRACH-LCR-r4"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new TimeslotNumber_PRACH_LCR_r4(1), 
				    new TimeslotNumber_PRACH_LCR_r4(6),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(6)
			    ),
			    null
			)
		    ),
		    "timeslot",
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
				"PRACH_ChanCodes_List_LCR"
			    ),
			    new QName (
				"InformationElements",
				"PRACH-ChanCodes-List-LCR"
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
				    "TDD_PRACH_CCode_LCR_r4"
				)
			    )
			)
		    ),
		    "prach-ChanCodes-list-LCR",
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
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"FPACH_Info_r4"
			    ),
			    new QName (
				"InformationElements",
				"FPACH-Info-r4"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "FPACH_Info_r4"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "FPACH_Info_r4"
				)
			    ),
			    0
			)
		    ),
		    "fpach-Info",
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
     * Get the type descriptor (TypeInfo) of 'this' PRACH_Information_LCR object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' PRACH_Information_LCR object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for PRACH_Information_LCR
