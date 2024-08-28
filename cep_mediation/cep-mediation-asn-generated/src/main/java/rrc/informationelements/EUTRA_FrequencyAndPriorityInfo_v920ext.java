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
 * Define the ASN1 Type EUTRA_FrequencyAndPriorityInfo_v920ext from ASN1 Module InformationElements.
 * @see Sequence
 */

public class EUTRA_FrequencyAndPriorityInfo_v920ext extends Sequence {
    
    /**
     * The default constructor.
     */
    public EUTRA_FrequencyAndPriorityInfo_v920ext()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public EUTRA_FrequencyAndPriorityInfo_v920ext(INTEGER qqualMinEUTRA, 
		    INTEGER threshXhigh2, INTEGER threshXlow2)
    {
	setQqualMinEUTRA(qqualMinEUTRA);
	setThreshXhigh2(threshXhigh2);
	setThreshXlow2(threshXlow2);
    }
    
    /**
     * Construct with components.
     */
    public EUTRA_FrequencyAndPriorityInfo_v920ext(long qqualMinEUTRA, 
		    long threshXhigh2, long threshXlow2)
    {
	this(new INTEGER(qqualMinEUTRA), new INTEGER(threshXhigh2), 
	     new INTEGER(threshXlow2));
    }
    
    public void initComponents()
    {
	mComponents[0] = new INTEGER();
	mComponents[1] = new INTEGER();
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
		return new INTEGER();
	    case 2:
		return new INTEGER();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "qqualMinEUTRA"
    public long getQqualMinEUTRA()
    {
	return ((INTEGER)mComponents[0]).longValue();
    }
    
    public void setQqualMinEUTRA(long qqualMinEUTRA)
    {
	setQqualMinEUTRA(new INTEGER(qqualMinEUTRA));
    }
    
    public void setQqualMinEUTRA(INTEGER qqualMinEUTRA)
    {
	mComponents[0] = qqualMinEUTRA;
    }
    
    public boolean hasQqualMinEUTRA()
    {
	return componentIsPresent(0);
    }
    
    public void deleteQqualMinEUTRA()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "threshXhigh2"
    public long getThreshXhigh2()
    {
	return ((INTEGER)mComponents[1]).longValue();
    }
    
    public void setThreshXhigh2(long threshXhigh2)
    {
	setThreshXhigh2(new INTEGER(threshXhigh2));
    }
    
    public void setThreshXhigh2(INTEGER threshXhigh2)
    {
	mComponents[1] = threshXhigh2;
    }
    
    public boolean hasThreshXhigh2()
    {
	return componentIsPresent(1);
    }
    
    public void deleteThreshXhigh2()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "threshXlow2"
    public long getThreshXlow2()
    {
	return ((INTEGER)mComponents[2]).longValue();
    }
    
    public void setThreshXlow2(long threshXlow2)
    {
	setThreshXlow2(new INTEGER(threshXlow2));
    }
    
    public void setThreshXlow2(INTEGER threshXlow2)
    {
	mComponents[2] = threshXlow2;
    }
    
    public boolean hasThreshXlow2()
    {
	return componentIsPresent(2);
    }
    
    public void deleteThreshXlow2()
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
	    "EUTRA_FrequencyAndPriorityInfo_v920ext"
	),
	new QName (
	    "InformationElements",
	    "EUTRA-FrequencyAndPriorityInfo-v920ext"
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
				    new com.oss.asn1.INTEGER(-34), 
				    new com.oss.asn1.INTEGER(-3),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(-34),
				new java.lang.Long(-3)
			    ),
			    null
			)
		    ),
		    "qqualMinEUTRA",
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
				    new com.oss.asn1.INTEGER(31),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(31)
			    ),
			    null
			)
		    ),
		    "threshXhigh2",
		    1,
		    3,
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
				    new com.oss.asn1.INTEGER(0), 
				    new com.oss.asn1.INTEGER(31),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(31)
			    ),
			    null
			)
		    ),
		    "threshXlow2",
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
     * Get the type descriptor (TypeInfo) of 'this' EUTRA_FrequencyAndPriorityInfo_v920ext object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' EUTRA_FrequencyAndPriorityInfo_v920ext object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for EUTRA_FrequencyAndPriorityInfo_v920ext
