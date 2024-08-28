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
 * Define the ASN1 Type UTRAN_FDD_Frequency from ASN1 Module InformationElements.
 * @see Sequence
 */

public class UTRAN_FDD_Frequency extends Sequence {
    
    /**
     * The default constructor.
     */
    public UTRAN_FDD_Frequency()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public UTRAN_FDD_Frequency(UARFCN uarfcn, INTEGER priority, 
		    INTEGER threshXhigh, INTEGER threshXlow, 
		    INTEGER qQualMinFDD, INTEGER qRxLevMinFDD)
    {
	setUarfcn(uarfcn);
	setPriority(priority);
	setThreshXhigh(threshXhigh);
	setThreshXlow(threshXlow);
	setQQualMinFDD(qQualMinFDD);
	setQRxLevMinFDD(qRxLevMinFDD);
    }
    
    /**
     * Construct with components.
     */
    public UTRAN_FDD_Frequency(UARFCN uarfcn, long priority, long threshXhigh, 
		    long threshXlow, long qQualMinFDD, long qRxLevMinFDD)
    {
	this(uarfcn, new INTEGER(priority), new INTEGER(threshXhigh), 
	     new INTEGER(threshXlow), new INTEGER(qQualMinFDD), 
	     new INTEGER(qRxLevMinFDD));
    }
    
    /**
     * Construct with required components.
     */
    public UTRAN_FDD_Frequency(UARFCN uarfcn, long priority, long threshXhigh, 
		    long threshXlow)
    {
	setUarfcn(uarfcn);
	setPriority(priority);
	setThreshXhigh(threshXhigh);
	setThreshXlow(threshXlow);
    }
    
    public void initComponents()
    {
	mComponents[0] = new UARFCN();
	mComponents[1] = new INTEGER();
	mComponents[2] = new INTEGER();
	mComponents[3] = new INTEGER();
	mComponents[4] = new INTEGER();
	mComponents[5] = new INTEGER();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[6];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new UARFCN();
	    case 1:
		return new INTEGER();
	    case 2:
		return new INTEGER();
	    case 3:
		return new INTEGER();
	    case 4:
		return new INTEGER();
	    case 5:
		return new INTEGER();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "uarfcn"
    public UARFCN getUarfcn()
    {
	return (UARFCN)mComponents[0];
    }
    
    public void setUarfcn(UARFCN uarfcn)
    {
	mComponents[0] = uarfcn;
    }
    
    
    // Methods for field "priority"
    public long getPriority()
    {
	return ((INTEGER)mComponents[1]).longValue();
    }
    
    public void setPriority(long priority)
    {
	setPriority(new INTEGER(priority));
    }
    
    public void setPriority(INTEGER priority)
    {
	mComponents[1] = priority;
    }
    
    
    // Methods for field "threshXhigh"
    public long getThreshXhigh()
    {
	return ((INTEGER)mComponents[2]).longValue();
    }
    
    public void setThreshXhigh(long threshXhigh)
    {
	setThreshXhigh(new INTEGER(threshXhigh));
    }
    
    public void setThreshXhigh(INTEGER threshXhigh)
    {
	mComponents[2] = threshXhigh;
    }
    
    
    // Methods for field "threshXlow"
    public long getThreshXlow()
    {
	return ((INTEGER)mComponents[3]).longValue();
    }
    
    public void setThreshXlow(long threshXlow)
    {
	setThreshXlow(new INTEGER(threshXlow));
    }
    
    public void setThreshXlow(INTEGER threshXlow)
    {
	mComponents[3] = threshXlow;
    }
    
    
    // Methods for field "qQualMinFDD"
    public long getQQualMinFDD()
    {
	return ((INTEGER)mComponents[4]).longValue();
    }
    
    public void setQQualMinFDD(long qQualMinFDD)
    {
	setQQualMinFDD(new INTEGER(qQualMinFDD));
    }
    
    public void setQQualMinFDD(INTEGER qQualMinFDD)
    {
	mComponents[4] = qQualMinFDD;
    }
    
    public boolean hasQQualMinFDD()
    {
	return componentIsPresent(4);
    }
    
    public void deleteQQualMinFDD()
    {
	setComponentAbsent(4);
    }
    
    
    // Methods for field "qRxLevMinFDD"
    public long getQRxLevMinFDD()
    {
	return ((INTEGER)mComponents[5]).longValue();
    }
    
    public void setQRxLevMinFDD(long qRxLevMinFDD)
    {
	setQRxLevMinFDD(new INTEGER(qRxLevMinFDD));
    }
    
    public void setQRxLevMinFDD(INTEGER qRxLevMinFDD)
    {
	mComponents[5] = qRxLevMinFDD;
    }
    
    public boolean hasQRxLevMinFDD()
    {
	return componentIsPresent(5);
    }
    
    public void deleteQRxLevMinFDD()
    {
	setComponentAbsent(5);
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
	    "UTRAN_FDD_Frequency"
	),
	new QName (
	    "InformationElements",
	    "UTRAN-FDD-Frequency"
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
				"UARFCN"
			    ),
			    new QName (
				"InformationElements",
				"UARFCN"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new UARFCN(0), 
				    new UARFCN(16383),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(16383)
			    ),
			    null
			)
		    ),
		    "uarfcn",
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
				    new com.oss.asn1.INTEGER(7),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(7)
			    ),
			    null
			)
		    ),
		    "priority",
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
		    "threshXhigh",
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
		    "threshXlow",
		    3,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8004
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
				    new com.oss.asn1.INTEGER(-24), 
				    new com.oss.asn1.INTEGER(0),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(-24),
				new java.lang.Long(0)
			    ),
			    null
			)
		    ),
		    "qQualMinFDD",
		    4,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8005
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
				    new com.oss.asn1.INTEGER(-60), 
				    new com.oss.asn1.INTEGER(-13),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(-60),
				new java.lang.Long(-13)
			    ),
			    null
			)
		    ),
		    "qRxLevMinFDD",
		    5,
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
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8005, 5)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' UTRAN_FDD_Frequency object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UTRAN_FDD_Frequency object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UTRAN_FDD_Frequency
