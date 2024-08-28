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
 * Define the ASN1 Type DL_TPC_PowerOffsetPerRL from ASN1 Module InformationElements.
 * @see Sequence
 */

public class DL_TPC_PowerOffsetPerRL extends Sequence {
    
    /**
     * The default constructor.
     */
    public DL_TPC_PowerOffsetPerRL()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public DL_TPC_PowerOffsetPerRL(PowerOffsetTPC_pdpdch powerOffsetTPC_pdpdch)
    {
	setPowerOffsetTPC_pdpdch(powerOffsetTPC_pdpdch);
    }
    
    public void initComponents()
    {
	mComponents[0] = new PowerOffsetTPC_pdpdch();
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
		return new PowerOffsetTPC_pdpdch();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "powerOffsetTPC_pdpdch"
    public PowerOffsetTPC_pdpdch getPowerOffsetTPC_pdpdch()
    {
	return (PowerOffsetTPC_pdpdch)mComponents[0];
    }
    
    public void setPowerOffsetTPC_pdpdch(PowerOffsetTPC_pdpdch powerOffsetTPC_pdpdch)
    {
	mComponents[0] = powerOffsetTPC_pdpdch;
    }
    
    public boolean hasPowerOffsetTPC_pdpdch()
    {
	return componentIsPresent(0);
    }
    
    public void deletePowerOffsetTPC_pdpdch()
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
	    "DL_TPC_PowerOffsetPerRL"
	),
	new QName (
	    "InformationElements",
	    "DL-TPC-PowerOffsetPerRL"
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
				"PowerOffsetTPC_pdpdch"
			    ),
			    new QName (
				"InformationElements",
				"PowerOffsetTPC-pdpdch"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new PowerOffsetTPC_pdpdch(0), 
				    new PowerOffsetTPC_pdpdch(24),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(24)
			    ),
			    null
			)
		    ),
		    "powerOffsetTPC-pdpdch",
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
     * Get the type descriptor (TypeInfo) of 'this' DL_TPC_PowerOffsetPerRL object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' DL_TPC_PowerOffsetPerRL object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for DL_TPC_PowerOffsetPerRL
