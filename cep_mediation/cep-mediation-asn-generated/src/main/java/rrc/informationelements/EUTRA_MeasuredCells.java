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
 * Define the ASN1 Type EUTRA_MeasuredCells from ASN1 Module InformationElements.
 * @see Sequence
 */

public class EUTRA_MeasuredCells extends Sequence {
    
    /**
     * The default constructor.
     */
    public EUTRA_MeasuredCells()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public EUTRA_MeasuredCells(EUTRA_PhysicalCellIdentity physicalCellIdentity, 
		    INTEGER rSRP, INTEGER rSRQ)
    {
	setPhysicalCellIdentity(physicalCellIdentity);
	setRSRP(rSRP);
	setRSRQ(rSRQ);
    }
    
    /**
     * Construct with components.
     */
    public EUTRA_MeasuredCells(EUTRA_PhysicalCellIdentity physicalCellIdentity, 
		    long rSRP, long rSRQ)
    {
	this(physicalCellIdentity, new INTEGER(rSRP), new INTEGER(rSRQ));
    }
    
    /**
     * Construct with required components.
     */
    public EUTRA_MeasuredCells(EUTRA_PhysicalCellIdentity physicalCellIdentity)
    {
	setPhysicalCellIdentity(physicalCellIdentity);
    }
    
    public void initComponents()
    {
	mComponents[0] = new EUTRA_PhysicalCellIdentity();
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
		return new EUTRA_PhysicalCellIdentity();
	    case 1:
		return new INTEGER();
	    case 2:
		return new INTEGER();
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
    
    
    // Methods for field "rSRP"
    public long getRSRP()
    {
	return ((INTEGER)mComponents[1]).longValue();
    }
    
    public void setRSRP(long rSRP)
    {
	setRSRP(new INTEGER(rSRP));
    }
    
    public void setRSRP(INTEGER rSRP)
    {
	mComponents[1] = rSRP;
    }
    
    public boolean hasRSRP()
    {
	return componentIsPresent(1);
    }
    
    public void deleteRSRP()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "rSRQ"
    public long getRSRQ()
    {
	return ((INTEGER)mComponents[2]).longValue();
    }
    
    public void setRSRQ(long rSRQ)
    {
	setRSRQ(new INTEGER(rSRQ));
    }
    
    public void setRSRQ(INTEGER rSRQ)
    {
	mComponents[2] = rSRQ;
    }
    
    public boolean hasRSRQ()
    {
	return componentIsPresent(2);
    }
    
    public void deleteRSRQ()
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
	    "EUTRA_MeasuredCells"
	),
	new QName (
	    "InformationElements",
	    "EUTRA-MeasuredCells"
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
				    new com.oss.asn1.INTEGER(97),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(97)
			    ),
			    null
			)
		    ),
		    "rSRP",
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
				    new com.oss.asn1.INTEGER(33),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(33)
			    ),
			    null
			)
		    ),
		    "rSRQ",
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
			new TagDecoderElement((short)0x8000, 0)
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
     * Get the type descriptor (TypeInfo) of 'this' EUTRA_MeasuredCells object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' EUTRA_MeasuredCells object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for EUTRA_MeasuredCells
