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
 * Define the ASN1 Type IndividualTimeslotInfo from ASN1 Module InformationElements.
 * @see Sequence
 */

public class IndividualTimeslotInfo extends Sequence {
    
    /**
     * The default constructor.
     */
    public IndividualTimeslotInfo()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public IndividualTimeslotInfo(TimeslotNumber timeslotNumber, 
		    BOOLEAN tfci_Existence, 
		    MidambleShiftAndBurstType midambleShiftAndBurstType)
    {
	setTimeslotNumber(timeslotNumber);
	setTfci_Existence(tfci_Existence);
	setMidambleShiftAndBurstType(midambleShiftAndBurstType);
    }
    
    /**
     * Construct with components.
     */
    public IndividualTimeslotInfo(TimeslotNumber timeslotNumber, 
		    boolean tfci_Existence, 
		    MidambleShiftAndBurstType midambleShiftAndBurstType)
    {
	this(timeslotNumber, new BOOLEAN(tfci_Existence), 
	     midambleShiftAndBurstType);
    }
    
    public void initComponents()
    {
	mComponents[0] = new TimeslotNumber();
	mComponents[1] = new BOOLEAN();
	mComponents[2] = new MidambleShiftAndBurstType();
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
		return new BOOLEAN();
	    case 2:
		return new MidambleShiftAndBurstType();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "timeslotNumber"
    public TimeslotNumber getTimeslotNumber()
    {
	return (TimeslotNumber)mComponents[0];
    }
    
    public void setTimeslotNumber(TimeslotNumber timeslotNumber)
    {
	mComponents[0] = timeslotNumber;
    }
    
    
    // Methods for field "tfci_Existence"
    public boolean getTfci_Existence()
    {
	return ((BOOLEAN)mComponents[1]).booleanValue();
    }
    
    public void setTfci_Existence(boolean tfci_Existence)
    {
	setTfci_Existence(new BOOLEAN(tfci_Existence));
    }
    
    public void setTfci_Existence(BOOLEAN tfci_Existence)
    {
	mComponents[1] = tfci_Existence;
    }
    
    
    // Methods for field "midambleShiftAndBurstType"
    public MidambleShiftAndBurstType getMidambleShiftAndBurstType()
    {
	return (MidambleShiftAndBurstType)mComponents[2];
    }
    
    public void setMidambleShiftAndBurstType(MidambleShiftAndBurstType midambleShiftAndBurstType)
    {
	mComponents[2] = midambleShiftAndBurstType;
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
	    "IndividualTimeslotInfo"
	),
	new QName (
	    "InformationElements",
	    "IndividualTimeslotInfo"
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
		    "timeslotNumber",
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
		    "tfci-Existence",
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
				"MidambleShiftAndBurstType"
			    ),
			    new QName (
				"InformationElements",
				"MidambleShiftAndBurstType"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "MidambleShiftAndBurstType"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "MidambleShiftAndBurstType"
				)
			    ),
			    0
			)
		    ),
		    "midambleShiftAndBurstType",
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
     * Get the type descriptor (TypeInfo) of 'this' IndividualTimeslotInfo object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' IndividualTimeslotInfo object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for IndividualTimeslotInfo
