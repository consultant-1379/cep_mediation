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
 * Define the ASN1 Type CompressedModeMeasCapability_LCR_r4 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class CompressedModeMeasCapability_LCR_r4 extends Sequence {
    
    /**
     * The default constructor.
     */
    public CompressedModeMeasCapability_LCR_r4()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public CompressedModeMeasCapability_LCR_r4(BOOLEAN tdd128_Measurements)
    {
	setTdd128_Measurements(tdd128_Measurements);
    }
    
    /**
     * Construct with components.
     */
    public CompressedModeMeasCapability_LCR_r4(boolean tdd128_Measurements)
    {
	this(new BOOLEAN(tdd128_Measurements));
    }
    
    public void initComponents()
    {
	mComponents[0] = new BOOLEAN();
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
		return new BOOLEAN();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "tdd128_Measurements"
    public boolean getTdd128_Measurements()
    {
	return ((BOOLEAN)mComponents[0]).booleanValue();
    }
    
    public void setTdd128_Measurements(boolean tdd128_Measurements)
    {
	setTdd128_Measurements(new BOOLEAN(tdd128_Measurements));
    }
    
    public void setTdd128_Measurements(BOOLEAN tdd128_Measurements)
    {
	mComponents[0] = tdd128_Measurements;
    }
    
    public boolean hasTdd128_Measurements()
    {
	return componentIsPresent(0);
    }
    
    public void deleteTdd128_Measurements()
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
	    "CompressedModeMeasCapability_LCR_r4"
	),
	new QName (
	    "InformationElements",
	    "CompressedModeMeasCapability-LCR-r4"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"BOOLEAN"
			    ),
			    new QName (
				"builtin",
				"BOOLEAN"
			    ),
			    12314,
			    null
			)
		    ),
		    "tdd128-Measurements",
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
     * Get the type descriptor (TypeInfo) of 'this' CompressedModeMeasCapability_LCR_r4 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' CompressedModeMeasCapability_LCR_r4 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for CompressedModeMeasCapability_LCR_r4
