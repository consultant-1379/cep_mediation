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
 * Define the ASN1 Type SRB_SpecificIntegrityProtInfo from ASN1 Module Internode_definitions.
 * @see Sequence
 */

public class SRB_SpecificIntegrityProtInfo extends Sequence {
    
    /**
     * The default constructor.
     */
    public SRB_SpecificIntegrityProtInfo()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public SRB_SpecificIntegrityProtInfo(BitString ul_RRC_HFN, 
		    BitString dl_RRC_HFN, 
		    rrc.informationelements.RRC_MessageSequenceNumber ul_RRC_SequenceNumber, 
		    rrc.informationelements.RRC_MessageSequenceNumber dl_RRC_SequenceNumber)
    {
	setUl_RRC_HFN(ul_RRC_HFN);
	setDl_RRC_HFN(dl_RRC_HFN);
	setUl_RRC_SequenceNumber(ul_RRC_SequenceNumber);
	setDl_RRC_SequenceNumber(dl_RRC_SequenceNumber);
    }
    
    public void initComponents()
    {
	mComponents[0] = new BitString();
	mComponents[1] = new BitString();
	mComponents[2] = new rrc.informationelements.RRC_MessageSequenceNumber();
	mComponents[3] = new rrc.informationelements.RRC_MessageSequenceNumber();
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
		return new BitString();
	    case 1:
		return new BitString();
	    case 2:
		return new rrc.informationelements.RRC_MessageSequenceNumber();
	    case 3:
		return new rrc.informationelements.RRC_MessageSequenceNumber();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "ul_RRC_HFN"
    public BitString getUl_RRC_HFN()
    {
	return (BitString)mComponents[0];
    }
    
    public void setUl_RRC_HFN(BitString ul_RRC_HFN)
    {
	mComponents[0] = ul_RRC_HFN;
    }
    
    
    // Methods for field "dl_RRC_HFN"
    public BitString getDl_RRC_HFN()
    {
	return (BitString)mComponents[1];
    }
    
    public void setDl_RRC_HFN(BitString dl_RRC_HFN)
    {
	mComponents[1] = dl_RRC_HFN;
    }
    
    
    // Methods for field "ul_RRC_SequenceNumber"
    public rrc.informationelements.RRC_MessageSequenceNumber getUl_RRC_SequenceNumber()
    {
	return (rrc.informationelements.RRC_MessageSequenceNumber)mComponents[2];
    }
    
    public void setUl_RRC_SequenceNumber(rrc.informationelements.RRC_MessageSequenceNumber ul_RRC_SequenceNumber)
    {
	mComponents[2] = ul_RRC_SequenceNumber;
    }
    
    
    // Methods for field "dl_RRC_SequenceNumber"
    public rrc.informationelements.RRC_MessageSequenceNumber getDl_RRC_SequenceNumber()
    {
	return (rrc.informationelements.RRC_MessageSequenceNumber)mComponents[3];
    }
    
    public void setDl_RRC_SequenceNumber(rrc.informationelements.RRC_MessageSequenceNumber dl_RRC_SequenceNumber)
    {
	mComponents[3] = dl_RRC_SequenceNumber;
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
	    "SRB_SpecificIntegrityProtInfo"
	),
	new QName (
	    "Internode-definitions",
	    "SRB-SpecificIntegrityProtInfo"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"BitString"
			    ),
			    new QName (
				"builtin",
				"BIT STRING"
			    ),
			    12314,
			    new SizeConstraint (
				new SingleValueConstraint (
				    new com.oss.asn1.INTEGER(28)
				)
			    ),
			    new Bounds (
				new java.lang.Long(28),
				new java.lang.Long(28)
			    ),
			    null
			)
		    ),
		    "ul-RRC-HFN",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"BitString"
			    ),
			    new QName (
				"builtin",
				"BIT STRING"
			    ),
			    12314,
			    new SizeConstraint (
				new SingleValueConstraint (
				    new com.oss.asn1.INTEGER(28)
				)
			    ),
			    new Bounds (
				new java.lang.Long(28),
				new java.lang.Long(28)
			    ),
			    null
			)
		    ),
		    "dl-RRC-HFN",
		    1,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"RRC_MessageSequenceNumber"
			    ),
			    new QName (
				"InformationElements",
				"RRC-MessageSequenceNumber"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new rrc.informationelements.RRC_MessageSequenceNumber(0), 
				    new rrc.informationelements.RRC_MessageSequenceNumber(15),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(15)
			    ),
			    null
			)
		    ),
		    "ul-RRC-SequenceNumber",
		    2,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"RRC_MessageSequenceNumber"
			    ),
			    new QName (
				"InformationElements",
				"RRC-MessageSequenceNumber"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new rrc.informationelements.RRC_MessageSequenceNumber(0), 
				    new rrc.informationelements.RRC_MessageSequenceNumber(15),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(15)
			    ),
			    null
			)
		    ),
		    "dl-RRC-SequenceNumber",
		    3,
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
     * Get the type descriptor (TypeInfo) of 'this' SRB_SpecificIntegrityProtInfo object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' SRB_SpecificIntegrityProtInfo object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for SRB_SpecificIntegrityProtInfo
