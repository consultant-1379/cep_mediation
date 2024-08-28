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
 * Define the ASN1 Type PRACH_RACH_Info_VHCR_r7 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class PRACH_RACH_Info_VHCR_r7 extends Sequence {
    
    /**
     * The default constructor.
     */
    public PRACH_RACH_Info_VHCR_r7()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public PRACH_RACH_Info_VHCR_r7(TimeslotNumber timeslot, 
		    TDD768_PRACH_CCodeList channelisationCodeList, 
		    PRACH_Midamble prach_Midamble)
    {
	setTimeslot(timeslot);
	setChannelisationCodeList(channelisationCodeList);
	setPrach_Midamble(prach_Midamble);
    }
    
    public void initComponents()
    {
	mComponents[0] = new TimeslotNumber();
	mComponents[1] = new TDD768_PRACH_CCodeList();
	mComponents[2] = PRACH_Midamble.direct;
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
		return new TimeslotNumber();
	    case 1:
		return new TDD768_PRACH_CCodeList();
	    case 2:
		return PRACH_Midamble.direct;
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "timeslot"
    public TimeslotNumber getTimeslot()
    {
	return (TimeslotNumber)mComponents[0];
    }
    
    public void setTimeslot(TimeslotNumber timeslot)
    {
	mComponents[0] = timeslot;
    }
    
    
    // Methods for field "channelisationCodeList"
    public TDD768_PRACH_CCodeList getChannelisationCodeList()
    {
	return (TDD768_PRACH_CCodeList)mComponents[1];
    }
    
    public void setChannelisationCodeList(TDD768_PRACH_CCodeList channelisationCodeList)
    {
	mComponents[1] = channelisationCodeList;
    }
    
    
    // Methods for field "prach_Midamble"
    public PRACH_Midamble getPrach_Midamble()
    {
	return (PRACH_Midamble)mComponents[2];
    }
    
    public void setPrach_Midamble(PRACH_Midamble prach_Midamble)
    {
	mComponents[2] = prach_Midamble;
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
	    "PRACH_RACH_Info_VHCR_r7"
	),
	new QName (
	    "InformationElements",
	    "PRACH-RACH-Info-VHCR-r7"
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
				"TimeslotNumber"
			    ),
			    new QName (
				"InformationElements",
				"TimeslotNumber"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new TimeslotNumber(0), 
				    new TimeslotNumber(14),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(14)
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
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"TDD768_PRACH_CCodeList"
			    ),
			    new QName (
				"InformationElements",
				"TDD768-PRACH-CCodeList"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "TDD768_PRACH_CCodeList"
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
		    "channelisationCodeList",
		    1,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"PRACH_Midamble"
			    ),
			    new QName (
				"InformationElements",
				"PRACH-Midamble"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"direct",
					0
				    ),
				    new MemberListElement (
					"direct-Inverted",
					1
				    )
				}
			    ),
			    0,
			    PRACH_Midamble.direct
			)
		    ),
		    "prach-Midamble",
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
     * Get the type descriptor (TypeInfo) of 'this' PRACH_RACH_Info_VHCR_r7 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' PRACH_RACH_Info_VHCR_r7 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for PRACH_RACH_Info_VHCR_r7
