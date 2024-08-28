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
 * Define the ASN1 Type IntegrityCheckInfo from ASN1 Module InformationElements.
 * @see Sequence
 */

public class IntegrityCheckInfo extends Sequence {
    
    /**
     * The default constructor.
     */
    public IntegrityCheckInfo()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public IntegrityCheckInfo(MessageAuthenticationCode messageAuthenticationCode, 
		    RRC_MessageSequenceNumber rrc_MessageSequenceNumber)
    {
	setMessageAuthenticationCode(messageAuthenticationCode);
	setRrc_MessageSequenceNumber(rrc_MessageSequenceNumber);
    }
    
    public void initComponents()
    {
	mComponents[0] = new MessageAuthenticationCode();
	mComponents[1] = new RRC_MessageSequenceNumber();
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
		return new MessageAuthenticationCode();
	    case 1:
		return new RRC_MessageSequenceNumber();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "messageAuthenticationCode"
    public MessageAuthenticationCode getMessageAuthenticationCode()
    {
	return (MessageAuthenticationCode)mComponents[0];
    }
    
    public void setMessageAuthenticationCode(MessageAuthenticationCode messageAuthenticationCode)
    {
	mComponents[0] = messageAuthenticationCode;
    }
    
    
    // Methods for field "rrc_MessageSequenceNumber"
    public RRC_MessageSequenceNumber getRrc_MessageSequenceNumber()
    {
	return (RRC_MessageSequenceNumber)mComponents[1];
    }
    
    public void setRrc_MessageSequenceNumber(RRC_MessageSequenceNumber rrc_MessageSequenceNumber)
    {
	mComponents[1] = rrc_MessageSequenceNumber;
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
	    "IntegrityCheckInfo"
	),
	new QName (
	    "InformationElements",
	    "IntegrityCheckInfo"
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
				"rrc.informationelements",
				"MessageAuthenticationCode"
			    ),
			    new QName (
				"InformationElements",
				"MessageAuthenticationCode"
			    ),
			    12314,
			    new SizeConstraint (
				new SingleValueConstraint (
				    new com.oss.asn1.INTEGER(32)
				)
			    ),
			    new Bounds (
				new java.lang.Long(32),
				new java.lang.Long(32)
			    ),
			    null
			)
		    ),
		    "messageAuthenticationCode",
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
				"RRC_MessageSequenceNumber"
			    ),
			    new QName (
				"InformationElements",
				"RRC-MessageSequenceNumber"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new RRC_MessageSequenceNumber(0), 
				    new RRC_MessageSequenceNumber(15),
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
		    "rrc-MessageSequenceNumber",
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
     * Get the type descriptor (TypeInfo) of 'this' IntegrityCheckInfo object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' IntegrityCheckInfo object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for IntegrityCheckInfo
