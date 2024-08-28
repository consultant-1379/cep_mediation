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
 * Define the ASN1 Type IntegrityProtActivationInfo from ASN1 Module InformationElements.
 * @see Sequence
 */

public class IntegrityProtActivationInfo extends Sequence {
    
    /**
     * The default constructor.
     */
    public IntegrityProtActivationInfo()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public IntegrityProtActivationInfo(RRC_MessageSequenceNumberList rrc_MessageSequenceNumberList)
    {
	setRrc_MessageSequenceNumberList(rrc_MessageSequenceNumberList);
    }
    
    public void initComponents()
    {
	mComponents[0] = new RRC_MessageSequenceNumberList();
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
		return new RRC_MessageSequenceNumberList();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "rrc_MessageSequenceNumberList"
    public RRC_MessageSequenceNumberList getRrc_MessageSequenceNumberList()
    {
	return (RRC_MessageSequenceNumberList)mComponents[0];
    }
    
    public void setRrc_MessageSequenceNumberList(RRC_MessageSequenceNumberList rrc_MessageSequenceNumberList)
    {
	mComponents[0] = rrc_MessageSequenceNumberList;
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
	    "IntegrityProtActivationInfo"
	),
	new QName (
	    "InformationElements",
	    "IntegrityProtActivationInfo"
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
				"RRC_MessageSequenceNumberList"
			    ),
			    new QName (
				"InformationElements",
				"RRC-MessageSequenceNumberList"
			    ),
			    12314,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new com.oss.asn1.INTEGER(4), 
					new com.oss.asn1.INTEGER(5),
					0
				    )
				)
			    ),
			    new Bounds (
				new java.lang.Long(4),
				new java.lang.Long(5)
			    ),
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "RRC_MessageSequenceNumber"
				)
			    )
			)
		    ),
		    "rrc-MessageSequenceNumberList",
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
     * Get the type descriptor (TypeInfo) of 'this' IntegrityProtActivationInfo object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' IntegrityProtActivationInfo object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for IntegrityProtActivationInfo
