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
 * Define the ASN1 Type TFCI_Range from ASN1 Module InformationElements.
 * @see Sequence
 */

public class TFCI_Range extends Sequence {
    
    /**
     * The default constructor.
     */
    public TFCI_Range()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public TFCI_Range(INTEGER maxTFCIField2Value, 
		    TFCS_InfoForDSCH tfcs_InfoForDSCH)
    {
	setMaxTFCIField2Value(maxTFCIField2Value);
	setTfcs_InfoForDSCH(tfcs_InfoForDSCH);
    }
    
    /**
     * Construct with components.
     */
    public TFCI_Range(long maxTFCIField2Value, 
		    TFCS_InfoForDSCH tfcs_InfoForDSCH)
    {
	this(new INTEGER(maxTFCIField2Value), tfcs_InfoForDSCH);
    }
    
    public void initComponents()
    {
	mComponents[0] = new INTEGER();
	mComponents[1] = new TFCS_InfoForDSCH();
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
		return new INTEGER();
	    case 1:
		return new TFCS_InfoForDSCH();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "maxTFCIField2Value"
    public long getMaxTFCIField2Value()
    {
	return ((INTEGER)mComponents[0]).longValue();
    }
    
    public void setMaxTFCIField2Value(long maxTFCIField2Value)
    {
	setMaxTFCIField2Value(new INTEGER(maxTFCIField2Value));
    }
    
    public void setMaxTFCIField2Value(INTEGER maxTFCIField2Value)
    {
	mComponents[0] = maxTFCIField2Value;
    }
    
    
    // Methods for field "tfcs_InfoForDSCH"
    public TFCS_InfoForDSCH getTfcs_InfoForDSCH()
    {
	return (TFCS_InfoForDSCH)mComponents[1];
    }
    
    public void setTfcs_InfoForDSCH(TFCS_InfoForDSCH tfcs_InfoForDSCH)
    {
	mComponents[1] = tfcs_InfoForDSCH;
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
	    "TFCI_Range"
	),
	new QName (
	    "InformationElements",
	    "TFCI-Range"
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
				"com.oss.asn1",
				"INTEGER"
			    ),
			    new QName (
				"builtin",
				"INTEGER"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new com.oss.asn1.INTEGER(1), 
				    new com.oss.asn1.INTEGER(1023),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(1023)
			    ),
			    null
			)
		    ),
		    "maxTFCIField2Value",
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
				"TFCS_InfoForDSCH"
			    ),
			    new QName (
				"InformationElements",
				"TFCS-InfoForDSCH"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "TFCS_InfoForDSCH"
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
		    "tfcs-InfoForDSCH",
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
     * Get the type descriptor (TypeInfo) of 'this' TFCI_Range object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' TFCI_Range object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for TFCI_Range
