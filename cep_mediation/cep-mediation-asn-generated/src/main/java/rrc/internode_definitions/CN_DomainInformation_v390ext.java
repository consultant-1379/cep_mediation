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


package rrc.internode_definitions;

import com.oss.asn1.*;
import com.oss.metadata.*;
import rrc.*;

/**
 * Define the ASN1 Type CN_DomainInformation_v390ext from ASN1 Module Internode_definitions.
 * @see Sequence
 */

public class CN_DomainInformation_v390ext extends Sequence {
    
    /**
     * The default constructor.
     */
    public CN_DomainInformation_v390ext()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public CN_DomainInformation_v390ext(rrc.informationelements.CN_DRX_CycleLengthCoefficient cn_DRX_CycleLengthCoeff)
    {
	setCn_DRX_CycleLengthCoeff(cn_DRX_CycleLengthCoeff);
    }
    
    public void initComponents()
    {
	mComponents[0] = new rrc.informationelements.CN_DRX_CycleLengthCoefficient();
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
		return new rrc.informationelements.CN_DRX_CycleLengthCoefficient();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "cn_DRX_CycleLengthCoeff"
    public rrc.informationelements.CN_DRX_CycleLengthCoefficient getCn_DRX_CycleLengthCoeff()
    {
	return (rrc.informationelements.CN_DRX_CycleLengthCoefficient)mComponents[0];
    }
    
    public void setCn_DRX_CycleLengthCoeff(rrc.informationelements.CN_DRX_CycleLengthCoefficient cn_DRX_CycleLengthCoeff)
    {
	mComponents[0] = cn_DRX_CycleLengthCoeff;
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
	    "rrc.internode_definitions",
	    "CN_DomainInformation_v390ext"
	),
	new QName (
	    "Internode-definitions",
	    "CN-DomainInformation-v390ext"
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
				"CN_DRX_CycleLengthCoefficient"
			    ),
			    new QName (
				"InformationElements",
				"CN-DRX-CycleLengthCoefficient"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new rrc.informationelements.CN_DRX_CycleLengthCoefficient(6), 
				    new rrc.informationelements.CN_DRX_CycleLengthCoefficient(9),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(6),
				new java.lang.Long(9)
			    ),
			    null
			)
		    ),
		    "cn-DRX-CycleLengthCoeff",
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
     * Get the type descriptor (TypeInfo) of 'this' CN_DomainInformation_v390ext object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' CN_DomainInformation_v390ext object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for CN_DomainInformation_v390ext
