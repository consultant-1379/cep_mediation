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
 * Define the ASN1 Type Ec_N0forANR from ASN1 Module InformationElements.
 * @see Sequence
 */

public class Ec_N0forANR extends Sequence {
    
    /**
     * The default constructor.
     */
    public Ec_N0forANR()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public Ec_N0forANR(INTEGER ec_N0)
    {
	setEc_N0(ec_N0);
    }
    
    /**
     * Construct with components.
     */
    public Ec_N0forANR(long ec_N0)
    {
	this(new INTEGER(ec_N0));
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
    
    
    // Methods for field "ec_N0"
    public long getEc_N0()
    {
	return ((INTEGER)mComponents[0]).longValue();
    }
    
    public void setEc_N0(long ec_N0)
    {
	setEc_N0(new INTEGER(ec_N0));
    }
    
    public void setEc_N0(INTEGER ec_N0)
    {
	mComponents[0] = ec_N0;
    }
    
    public boolean hasEc_N0()
    {
	return componentIsPresent(0);
    }
    
    public void deleteEc_N0()
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
	    "Ec_N0forANR"
	),
	new QName (
	    "InformationElements",
	    "Ec-N0forANR"
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
		    "ec-N0",
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
     * Get the type descriptor (TypeInfo) of 'this' Ec_N0forANR object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' Ec_N0forANR object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for Ec_N0forANR
