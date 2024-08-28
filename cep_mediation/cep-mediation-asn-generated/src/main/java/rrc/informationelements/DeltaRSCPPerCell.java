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
 * Define the ASN1 Type DeltaRSCPPerCell from ASN1 Module InformationElements.
 * @see Sequence
 */

public class DeltaRSCPPerCell extends Sequence {
    
    /**
     * The default constructor.
     */
    public DeltaRSCPPerCell()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public DeltaRSCPPerCell(DeltaRSCP deltaRSCP)
    {
	setDeltaRSCP(deltaRSCP);
    }
    
    public void initComponents()
    {
	mComponents[0] = new DeltaRSCP();
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
		return new DeltaRSCP();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "deltaRSCP"
    public DeltaRSCP getDeltaRSCP()
    {
	return (DeltaRSCP)mComponents[0];
    }
    
    public void setDeltaRSCP(DeltaRSCP deltaRSCP)
    {
	mComponents[0] = deltaRSCP;
    }
    
    public boolean hasDeltaRSCP()
    {
	return componentIsPresent(0);
    }
    
    public void deleteDeltaRSCP()
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
	    "DeltaRSCPPerCell"
	),
	new QName (
	    "InformationElements",
	    "DeltaRSCPPerCell"
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
				"DeltaRSCP"
			    ),
			    new QName (
				"InformationElements",
				"DeltaRSCP"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new DeltaRSCP(-5), 
				    new DeltaRSCP(-1),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(-5),
				new java.lang.Long(-1)
			    ),
			    null
			)
		    ),
		    "deltaRSCP",
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
     * Get the type descriptor (TypeInfo) of 'this' DeltaRSCPPerCell object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' DeltaRSCPPerCell object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for DeltaRSCPPerCell
