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
 * Define the ASN1 Type PowerOffsetInformation from ASN1 Module InformationElements.
 * @see Sequence
 */

public class PowerOffsetInformation extends Sequence {
    
    /**
     * The default constructor.
     */
    public PowerOffsetInformation()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public PowerOffsetInformation(GainFactorInformation gainFactorInformation, 
		    PowerOffsetPp_m powerOffsetPp_m)
    {
	setGainFactorInformation(gainFactorInformation);
	setPowerOffsetPp_m(powerOffsetPp_m);
    }
    
    /**
     * Construct with required components.
     */
    public PowerOffsetInformation(GainFactorInformation gainFactorInformation)
    {
	setGainFactorInformation(gainFactorInformation);
    }
    
    public void initComponents()
    {
	mComponents[0] = new GainFactorInformation();
	mComponents[1] = new PowerOffsetPp_m();
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
		return new GainFactorInformation();
	    case 1:
		return new PowerOffsetPp_m();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "gainFactorInformation"
    public GainFactorInformation getGainFactorInformation()
    {
	return (GainFactorInformation)mComponents[0];
    }
    
    public void setGainFactorInformation(GainFactorInformation gainFactorInformation)
    {
	mComponents[0] = gainFactorInformation;
    }
    
    
    // Methods for field "powerOffsetPp_m"
    public PowerOffsetPp_m getPowerOffsetPp_m()
    {
	return (PowerOffsetPp_m)mComponents[1];
    }
    
    public void setPowerOffsetPp_m(PowerOffsetPp_m powerOffsetPp_m)
    {
	mComponents[1] = powerOffsetPp_m;
    }
    
    public boolean hasPowerOffsetPp_m()
    {
	return componentIsPresent(1);
    }
    
    public void deletePowerOffsetPp_m()
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
	    "PowerOffsetInformation"
	),
	new QName (
	    "InformationElements",
	    "PowerOffsetInformation"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"GainFactorInformation"
			    ),
			    new QName (
				"InformationElements",
				"GainFactorInformation"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "GainFactorInformation"
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
		    "gainFactorInformation",
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
				"PowerOffsetPp_m"
			    ),
			    new QName (
				"InformationElements",
				"PowerOffsetPp-m"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new PowerOffsetPp_m(-5), 
				    new PowerOffsetPp_m(10),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(-5),
				new java.lang.Long(10)
			    ),
			    null
			)
		    ),
		    "powerOffsetPp-m",
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
     * Get the type descriptor (TypeInfo) of 'this' PowerOffsetInformation object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' PowerOffsetInformation object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for PowerOffsetInformation
