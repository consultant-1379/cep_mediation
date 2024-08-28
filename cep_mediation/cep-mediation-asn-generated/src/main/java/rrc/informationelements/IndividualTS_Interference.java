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
 * Define the ASN1 Type IndividualTS_Interference from ASN1 Module InformationElements.
 * @see Sequence
 */

public class IndividualTS_Interference extends Sequence {
    
    /**
     * The default constructor.
     */
    public IndividualTS_Interference()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public IndividualTS_Interference(TimeslotNumber timeslot, 
		    TDD_UL_Interference ul_TimeslotInterference)
    {
	setTimeslot(timeslot);
	setUl_TimeslotInterference(ul_TimeslotInterference);
    }
    
    public void initComponents()
    {
	mComponents[0] = new TimeslotNumber();
	mComponents[1] = new TDD_UL_Interference();
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
		return new TimeslotNumber();
	    case 1:
		return new TDD_UL_Interference();
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
    
    
    // Methods for field "ul_TimeslotInterference"
    public TDD_UL_Interference getUl_TimeslotInterference()
    {
	return (TDD_UL_Interference)mComponents[1];
    }
    
    public void setUl_TimeslotInterference(TDD_UL_Interference ul_TimeslotInterference)
    {
	mComponents[1] = ul_TimeslotInterference;
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
	    "IndividualTS_Interference"
	),
	new QName (
	    "InformationElements",
	    "IndividualTS-Interference"
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
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"TDD_UL_Interference"
			    ),
			    new QName (
				"InformationElements",
				"TDD-UL-Interference"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new TDD_UL_Interference(-110), 
				    new TDD_UL_Interference(-52),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(-110),
				new java.lang.Long(-52)
			    ),
			    null
			)
		    ),
		    "ul-TimeslotInterference",
		    1,
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
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' IndividualTS_Interference object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' IndividualTS_Interference object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for IndividualTS_Interference
