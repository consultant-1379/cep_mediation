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
 * Define the ASN1 Type EUTRA_BlacklistedCell from ASN1 Module InformationElements.
 * @see Sequence
 */

public class EUTRA_BlacklistedCell extends Sequence {
    
    /**
     * The default constructor.
     */
    public EUTRA_BlacklistedCell()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public EUTRA_BlacklistedCell(EUTRA_PhysicalCellIdentity physicalCellIdentity)
    {
	setPhysicalCellIdentity(physicalCellIdentity);
    }
    
    public void initComponents()
    {
	mComponents[0] = new EUTRA_PhysicalCellIdentity();
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
		return new EUTRA_PhysicalCellIdentity();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "physicalCellIdentity"
    public EUTRA_PhysicalCellIdentity getPhysicalCellIdentity()
    {
	return (EUTRA_PhysicalCellIdentity)mComponents[0];
    }
    
    public void setPhysicalCellIdentity(EUTRA_PhysicalCellIdentity physicalCellIdentity)
    {
	mComponents[0] = physicalCellIdentity;
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
	    "EUTRA_BlacklistedCell"
	),
	new QName (
	    "InformationElements",
	    "EUTRA-BlacklistedCell"
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
				"EUTRA_PhysicalCellIdentity"
			    ),
			    new QName (
				"InformationElements",
				"EUTRA-PhysicalCellIdentity"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new EUTRA_PhysicalCellIdentity(0), 
				    new EUTRA_PhysicalCellIdentity(503),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(503)
			    ),
			    null
			)
		    ),
		    "physicalCellIdentity",
		    0,
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
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' EUTRA_BlacklistedCell object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' EUTRA_BlacklistedCell object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for EUTRA_BlacklistedCell
