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
 * Define the ASN1 Type RF_Capability_v860ext from ASN1 Module InformationElements.
 * @see Sequence
 */

public class RF_Capability_v860ext extends Sequence {
    
    /**
     * The default constructor.
     */
    public RF_Capability_v860ext()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public RF_Capability_v860ext(RadioFrequencyBandTDDextList tdd128RF_Capability, 
		    RadioFrequencyBandTDDextList tdd384RF_Capability, 
		    RadioFrequencyBandTDDextList tdd768RF_Capability)
    {
	setTdd128RF_Capability(tdd128RF_Capability);
	setTdd384RF_Capability(tdd384RF_Capability);
	setTdd768RF_Capability(tdd768RF_Capability);
    }
    
    public void initComponents()
    {
	mComponents[0] = new RadioFrequencyBandTDDextList();
	mComponents[1] = new RadioFrequencyBandTDDextList();
	mComponents[2] = new RadioFrequencyBandTDDextList();
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
		return new RadioFrequencyBandTDDextList();
	    case 1:
		return new RadioFrequencyBandTDDextList();
	    case 2:
		return new RadioFrequencyBandTDDextList();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "tdd128RF_Capability"
    public RadioFrequencyBandTDDextList getTdd128RF_Capability()
    {
	return (RadioFrequencyBandTDDextList)mComponents[0];
    }
    
    public void setTdd128RF_Capability(RadioFrequencyBandTDDextList tdd128RF_Capability)
    {
	mComponents[0] = tdd128RF_Capability;
    }
    
    public boolean hasTdd128RF_Capability()
    {
	return componentIsPresent(0);
    }
    
    public void deleteTdd128RF_Capability()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "tdd384RF_Capability"
    public RadioFrequencyBandTDDextList getTdd384RF_Capability()
    {
	return (RadioFrequencyBandTDDextList)mComponents[1];
    }
    
    public void setTdd384RF_Capability(RadioFrequencyBandTDDextList tdd384RF_Capability)
    {
	mComponents[1] = tdd384RF_Capability;
    }
    
    public boolean hasTdd384RF_Capability()
    {
	return componentIsPresent(1);
    }
    
    public void deleteTdd384RF_Capability()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "tdd768RF_Capability"
    public RadioFrequencyBandTDDextList getTdd768RF_Capability()
    {
	return (RadioFrequencyBandTDDextList)mComponents[2];
    }
    
    public void setTdd768RF_Capability(RadioFrequencyBandTDDextList tdd768RF_Capability)
    {
	mComponents[2] = tdd768RF_Capability;
    }
    
    public boolean hasTdd768RF_Capability()
    {
	return componentIsPresent(2);
    }
    
    public void deleteTdd768RF_Capability()
    {
	setComponentAbsent(2);
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
	    "RF_Capability_v860ext"
	),
	new QName (
	    "InformationElements",
	    "RF-Capability-v860ext"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"RadioFrequencyBandTDDextList"
			    ),
			    new QName (
				"InformationElements",
				"RadioFrequencyBandTDDextList"
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
				    "RadioFrequencyBandTDDext"
				)
			    )
			)
		    ),
		    "tdd128RF-Capability",
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
				"RadioFrequencyBandTDDextList"
			    ),
			    new QName (
				"InformationElements",
				"RadioFrequencyBandTDDextList"
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
				    "RadioFrequencyBandTDDext"
				)
			    )
			)
		    ),
		    "tdd384RF-Capability",
		    1,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"RadioFrequencyBandTDDextList"
			    ),
			    new QName (
				"InformationElements",
				"RadioFrequencyBandTDDextList"
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
				    "RadioFrequencyBandTDDext"
				)
			    )
			)
		    ),
		    "tdd768RF-Capability",
		    2,
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
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2)
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
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' RF_Capability_v860ext object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' RF_Capability_v860ext object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for RF_Capability_v860ext
