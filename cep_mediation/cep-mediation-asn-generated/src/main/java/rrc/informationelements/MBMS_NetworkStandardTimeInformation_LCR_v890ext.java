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
 * Define the ASN1 Type MBMS_NetworkStandardTimeInformation_LCR_v890ext from ASN1 Module InformationElements.
 * @see Sequence
 */

public class MBMS_NetworkStandardTimeInformation_LCR_v890ext extends Sequence {
    
    /**
     * The default constructor.
     */
    public MBMS_NetworkStandardTimeInformation_LCR_v890ext()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public MBMS_NetworkStandardTimeInformation_LCR_v890ext(BitString networkStandardTime, 
		    INTEGER correlativeSFN)
    {
	setNetworkStandardTime(networkStandardTime);
	setCorrelativeSFN(correlativeSFN);
    }
    
    /**
     * Construct with components.
     */
    public MBMS_NetworkStandardTimeInformation_LCR_v890ext(BitString networkStandardTime, 
		    long correlativeSFN)
    {
	this(networkStandardTime, new INTEGER(correlativeSFN));
    }
    
    /**
     * Construct with required components.
     */
    public MBMS_NetworkStandardTimeInformation_LCR_v890ext(BitString networkStandardTime)
    {
	setNetworkStandardTime(networkStandardTime);
    }
    
    public void initComponents()
    {
	mComponents[0] = new BitString();
	mComponents[1] = new INTEGER();
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
		return new BitString();
	    case 1:
		return new INTEGER();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "networkStandardTime"
    public BitString getNetworkStandardTime()
    {
	return (BitString)mComponents[0];
    }
    
    public void setNetworkStandardTime(BitString networkStandardTime)
    {
	mComponents[0] = networkStandardTime;
    }
    
    
    // Methods for field "correlativeSFN"
    public long getCorrelativeSFN()
    {
	return ((INTEGER)mComponents[1]).longValue();
    }
    
    public void setCorrelativeSFN(long correlativeSFN)
    {
	setCorrelativeSFN(new INTEGER(correlativeSFN));
    }
    
    public void setCorrelativeSFN(INTEGER correlativeSFN)
    {
	mComponents[1] = correlativeSFN;
    }
    
    public boolean hasCorrelativeSFN()
    {
	return componentIsPresent(1);
    }
    
    public void deleteCorrelativeSFN()
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
	    "MBMS_NetworkStandardTimeInformation_LCR_v890ext"
	),
	new QName (
	    "InformationElements",
	    "MBMS-NetworkStandardTimeInformation-LCR-v890ext"
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
				    new com.oss.asn1.INTEGER(40)
				)
			    ),
			    new Bounds (
				new java.lang.Long(40),
				new java.lang.Long(40)
			    ),
			    null
			)
		    ),
		    "networkStandardTime",
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
				    new com.oss.asn1.INTEGER(4095),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(4095)
			    ),
			    null
			)
		    ),
		    "correlativeSFN",
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
     * Get the type descriptor (TypeInfo) of 'this' MBMS_NetworkStandardTimeInformation_LCR_v890ext object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' MBMS_NetworkStandardTimeInformation_LCR_v890ext object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for MBMS_NetworkStandardTimeInformation_LCR_v890ext
