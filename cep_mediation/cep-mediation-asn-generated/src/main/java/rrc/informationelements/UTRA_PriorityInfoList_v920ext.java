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
 * Define the ASN1 Type UTRA_PriorityInfoList_v920ext from ASN1 Module InformationElements.
 * @see Sequence
 */

public class UTRA_PriorityInfoList_v920ext extends Sequence {
    
    /**
     * The default constructor.
     */
    public UTRA_PriorityInfoList_v920ext()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public UTRA_PriorityInfoList_v920ext(INTEGER threshServingLow2)
    {
	setThreshServingLow2(threshServingLow2);
    }
    
    /**
     * Construct with components.
     */
    public UTRA_PriorityInfoList_v920ext(long threshServingLow2)
    {
	this(new INTEGER(threshServingLow2));
    }
    
    public void initComponents()
    {
	mComponents[0] = new INTEGER();
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
		return new INTEGER();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "threshServingLow2"
    public long getThreshServingLow2()
    {
	return ((INTEGER)mComponents[0]).longValue();
    }
    
    public void setThreshServingLow2(long threshServingLow2)
    {
	setThreshServingLow2(new INTEGER(threshServingLow2));
    }
    
    public void setThreshServingLow2(INTEGER threshServingLow2)
    {
	mComponents[0] = threshServingLow2;
    }
    
    public boolean hasThreshServingLow2()
    {
	return componentIsPresent(0);
    }
    
    public void deleteThreshServingLow2()
    {
	setComponentAbsent(0);
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
	    "UTRA_PriorityInfoList_v920ext"
	),
	new QName (
	    "InformationElements",
	    "UTRA-PriorityInfoList-v920ext"
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
		    "threshServingLow2",
		    0,
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
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' UTRA_PriorityInfoList_v920ext object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UTRA_PriorityInfoList_v920ext object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UTRA_PriorityInfoList_v920ext
