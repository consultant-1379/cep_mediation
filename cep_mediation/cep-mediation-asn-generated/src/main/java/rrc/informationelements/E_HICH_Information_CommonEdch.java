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
 * Define the ASN1 Type E_HICH_Information_CommonEdch from ASN1 Module InformationElements.
 * @see Sequence
 */

public class E_HICH_Information_CommonEdch extends Sequence {
    
    /**
     * The default constructor.
     */
    public E_HICH_Information_CommonEdch()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public E_HICH_Information_CommonEdch(E_HICH_ChannelisationCode channelisationCode, 
		    E_HICH_RGCH_SignatureSequence signatureSequence)
    {
	setChannelisationCode(channelisationCode);
	setSignatureSequence(signatureSequence);
    }
    
    public void initComponents()
    {
	mComponents[0] = new E_HICH_ChannelisationCode();
	mComponents[1] = new E_HICH_RGCH_SignatureSequence();
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
		return new E_HICH_ChannelisationCode();
	    case 1:
		return new E_HICH_RGCH_SignatureSequence();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "channelisationCode"
    public E_HICH_ChannelisationCode getChannelisationCode()
    {
	return (E_HICH_ChannelisationCode)mComponents[0];
    }
    
    public void setChannelisationCode(E_HICH_ChannelisationCode channelisationCode)
    {
	mComponents[0] = channelisationCode;
    }
    
    public boolean hasChannelisationCode()
    {
	return componentIsPresent(0);
    }
    
    public void deleteChannelisationCode()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "signatureSequence"
    public E_HICH_RGCH_SignatureSequence getSignatureSequence()
    {
	return (E_HICH_RGCH_SignatureSequence)mComponents[1];
    }
    
    public void setSignatureSequence(E_HICH_RGCH_SignatureSequence signatureSequence)
    {
	mComponents[1] = signatureSequence;
    }
    
    public boolean hasSignatureSequence()
    {
	return componentIsPresent(1);
    }
    
    public void deleteSignatureSequence()
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
	    "E_HICH_Information_CommonEdch"
	),
	new QName (
	    "InformationElements",
	    "E-HICH-Information-CommonEdch"
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
				"E_HICH_ChannelisationCode"
			    ),
			    new QName (
				"InformationElements",
				"E-HICH-ChannelisationCode"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new E_HICH_ChannelisationCode(0), 
				    new E_HICH_ChannelisationCode(127),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(127)
			    ),
			    null
			)
		    ),
		    "channelisationCode",
		    0,
		    3,
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
				"E_HICH_RGCH_SignatureSequence"
			    ),
			    new QName (
				"InformationElements",
				"E-HICH-RGCH-SignatureSequence"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new E_HICH_RGCH_SignatureSequence(0), 
				    new E_HICH_RGCH_SignatureSequence(39),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(39)
			    ),
			    null
			)
		    ),
		    "signatureSequence",
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
			new TagDecoderElement((short)0x8000, 0),
			new TagDecoderElement((short)0x8001, 1)
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
     * Get the type descriptor (TypeInfo) of 'this' E_HICH_Information_CommonEdch object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' E_HICH_Information_CommonEdch object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for E_HICH_Information_CommonEdch
