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


package rrc.internode_definitions;

import com.oss.asn1.*;
import com.oss.metadata.*;
import rrc.*;

/**
 * Define the ASN1 Type UE_Positioning_LastKnownPos from ASN1 Module Internode_definitions.
 * @see Sequence
 */

public class UE_Positioning_LastKnownPos extends Sequence {
    
    /**
     * The default constructor.
     */
    public UE_Positioning_LastKnownPos()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public UE_Positioning_LastKnownPos(INTEGER sfn, 
		    rrc.informationelements.CellIdentity cell_id, 
		    rrc.informationelements.PositionEstimate positionEstimate)
    {
	setSfn(sfn);
	setCell_id(cell_id);
	setPositionEstimate(positionEstimate);
    }
    
    /**
     * Construct with components.
     */
    public UE_Positioning_LastKnownPos(long sfn, 
		    rrc.informationelements.CellIdentity cell_id, 
		    rrc.informationelements.PositionEstimate positionEstimate)
    {
	this(new INTEGER(sfn), cell_id, positionEstimate);
    }
    
    public void initComponents()
    {
	mComponents[0] = new INTEGER();
	mComponents[1] = new rrc.informationelements.CellIdentity();
	mComponents[2] = new rrc.informationelements.PositionEstimate();
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
		return new rrc.informationelements.CellIdentity();
	    case 2:
		return new rrc.informationelements.PositionEstimate();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "sfn"
    public long getSfn()
    {
	return ((INTEGER)mComponents[0]).longValue();
    }
    
    public void setSfn(long sfn)
    {
	setSfn(new INTEGER(sfn));
    }
    
    public void setSfn(INTEGER sfn)
    {
	mComponents[0] = sfn;
    }
    
    
    // Methods for field "cell_id"
    public rrc.informationelements.CellIdentity getCell_id()
    {
	return (rrc.informationelements.CellIdentity)mComponents[1];
    }
    
    public void setCell_id(rrc.informationelements.CellIdentity cell_id)
    {
	mComponents[1] = cell_id;
    }
    
    
    // Methods for field "positionEstimate"
    public rrc.informationelements.PositionEstimate getPositionEstimate()
    {
	return (rrc.informationelements.PositionEstimate)mComponents[2];
    }
    
    public void setPositionEstimate(rrc.informationelements.PositionEstimate positionEstimate)
    {
	mComponents[2] = positionEstimate;
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
	    "rrc.internode_definitions",
	    "UE_Positioning_LastKnownPos"
	),
	new QName (
	    "Internode-definitions",
	    "UE-Positioning-LastKnownPos"
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
		    "sfn",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"CellIdentity"
			    ),
			    new QName (
				"InformationElements",
				"CellIdentity"
			    ),
			    12314,
			    new SizeConstraint (
				new SingleValueConstraint (
				    new com.oss.asn1.INTEGER(28)
				)
			    ),
			    new Bounds (
				new java.lang.Long(28),
				new java.lang.Long(28)
			    ),
			    null
			)
		    ),
		    "cell-id",
		    1,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"PositionEstimate"
			    ),
			    new QName (
				"InformationElements",
				"PositionEstimate"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "PositionEstimate"
				)
			    ),
			    0,
			    new TagDecoder (
				new TagDecoderElement[] {
				    new TagDecoderElement((short)0x8000, 0),
				    new TagDecoderElement((short)0x8001, 1),
				    new TagDecoderElement((short)0x8002, 2),
				    new TagDecoderElement((short)0x8003, 3),
				    new TagDecoderElement((short)0x8004, 4)
				}
			    )
			)
		    ),
		    "positionEstimate",
		    2,
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
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' UE_Positioning_LastKnownPos object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UE_Positioning_LastKnownPos object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UE_Positioning_LastKnownPos
