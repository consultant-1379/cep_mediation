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
 * Define the ASN1 Type UL_PhysChCapabilityInfoTDD_128_v770ext from ASN1 Module InformationElements.
 * @see Sequence
 */

public class UL_PhysChCapabilityInfoTDD_128_v770ext extends Sequence {
    
    /**
     * The default constructor.
     */
    public UL_PhysChCapabilityInfoTDD_128_v770ext()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public UL_PhysChCapabilityInfoTDD_128_v770ext(MaxPhysChPerTimeslot_LCR_r7 maxPhysChPerTimeslot)
    {
	setMaxPhysChPerTimeslot(maxPhysChPerTimeslot);
    }
    
    public void initComponents()
    {
	mComponents[0] = new MaxPhysChPerTimeslot_LCR_r7();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[1];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new MaxPhysChPerTimeslot_LCR_r7();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "maxPhysChPerTimeslot"
    public MaxPhysChPerTimeslot_LCR_r7 getMaxPhysChPerTimeslot()
    {
	return (MaxPhysChPerTimeslot_LCR_r7)mComponents[0];
    }
    
    public void setMaxPhysChPerTimeslot(MaxPhysChPerTimeslot_LCR_r7 maxPhysChPerTimeslot)
    {
	mComponents[0] = maxPhysChPerTimeslot;
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
	    "UL_PhysChCapabilityInfoTDD_128_v770ext"
	),
	new QName (
	    "InformationElements",
	    "UL-PhysChCapabilityInfoTDD-128-v770ext"
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
				"MaxPhysChPerTimeslot_LCR_r7"
			    ),
			    new QName (
				"InformationElements",
				"MaxPhysChPerTimeslot-LCR-r7"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new MaxPhysChPerTimeslot_LCR_r7(1), 
				    new MaxPhysChPerTimeslot_LCR_r7(4),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(4)
			    ),
			    null
			)
		    ),
		    "maxPhysChPerTimeslot",
		    0,
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
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' UL_PhysChCapabilityInfoTDD_128_v770ext object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UL_PhysChCapabilityInfoTDD_128_v770ext object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UL_PhysChCapabilityInfoTDD_128_v770ext
