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
 * Define the ASN1 Type AuxInfoGANSS_ID3_element from ASN1 Module InformationElements.
 * @see Sequence
 */

public class AuxInfoGANSS_ID3_element extends Sequence {
    
    /**
     * The default constructor.
     */
    public AuxInfoGANSS_ID3_element()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public AuxInfoGANSS_ID3_element(INTEGER svID, BitString signalsAvailable, 
		    INTEGER channelNumber)
    {
	setSvID(svID);
	setSignalsAvailable(signalsAvailable);
	setChannelNumber(channelNumber);
    }
    
    /**
     * Construct with components.
     */
    public AuxInfoGANSS_ID3_element(long svID, BitString signalsAvailable, 
		    long channelNumber)
    {
	this(new INTEGER(svID), signalsAvailable, 
	     new INTEGER(channelNumber));
    }
    
    public void initComponents()
    {
	mComponents[0] = new INTEGER();
	mComponents[1] = new BitString();
	mComponents[2] = new INTEGER();
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
		return new INTEGER();
	    case 1:
		return new BitString();
	    case 2:
		return new INTEGER();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "svID"
    public long getSvID()
    {
	return ((INTEGER)mComponents[0]).longValue();
    }
    
    public void setSvID(long svID)
    {
	setSvID(new INTEGER(svID));
    }
    
    public void setSvID(INTEGER svID)
    {
	mComponents[0] = svID;
    }
    
    
    // Methods for field "signalsAvailable"
    public BitString getSignalsAvailable()
    {
	return (BitString)mComponents[1];
    }
    
    public void setSignalsAvailable(BitString signalsAvailable)
    {
	mComponents[1] = signalsAvailable;
    }
    
    
    // Methods for field "channelNumber"
    public long getChannelNumber()
    {
	return ((INTEGER)mComponents[2]).longValue();
    }
    
    public void setChannelNumber(long channelNumber)
    {
	setChannelNumber(new INTEGER(channelNumber));
    }
    
    public void setChannelNumber(INTEGER channelNumber)
    {
	mComponents[2] = channelNumber;
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
	    "AuxInfoGANSS_ID3_element"
	),
	new QName (
	    "InformationElements",
	    "AuxInfoGANSS-ID3-element"
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
				    new com.oss.asn1.INTEGER(0), 
				    new com.oss.asn1.INTEGER(63),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(63)
			    ),
			    null
			)
		    ),
		    "svID",
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
				    new com.oss.asn1.INTEGER(8)
				)
			    ),
			    new Bounds (
				new java.lang.Long(8),
				new java.lang.Long(8)
			    ),
			    null
			)
		    ),
		    "signalsAvailable",
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
				    new com.oss.asn1.INTEGER(-7), 
				    new com.oss.asn1.INTEGER(13),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(-7),
				new java.lang.Long(13)
			    ),
			    null
			)
		    ),
		    "channelNumber",
		    2,
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
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' AuxInfoGANSS_ID3_element object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' AuxInfoGANSS_ID3_element object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for AuxInfoGANSS_ID3_element
