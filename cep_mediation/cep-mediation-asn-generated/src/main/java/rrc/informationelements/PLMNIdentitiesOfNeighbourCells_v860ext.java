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
 * Define the ASN1 Type PLMNIdentitiesOfNeighbourCells_v860ext from ASN1 Module InformationElements.
 * @see Sequence
 */

public class PLMNIdentitiesOfNeighbourCells_v860ext extends Sequence {
    
    /**
     * The default constructor.
     */
    public PLMNIdentitiesOfNeighbourCells_v860ext()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public PLMNIdentitiesOfNeighbourCells_v860ext(MultiplePLMNsOfIntraFreqCellsList multipleplmnsOfIntraFreqCellsList, 
		    MultiplePLMNsOfInterFreqCellsList multipleplmnsOfInterFreqCellsList)
    {
	setMultipleplmnsOfIntraFreqCellsList(multipleplmnsOfIntraFreqCellsList);
	setMultipleplmnsOfInterFreqCellsList(multipleplmnsOfInterFreqCellsList);
    }
    
    public void initComponents()
    {
	mComponents[0] = new MultiplePLMNsOfIntraFreqCellsList();
	mComponents[1] = new MultiplePLMNsOfInterFreqCellsList();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[2];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new MultiplePLMNsOfIntraFreqCellsList();
	    case 1:
		return new MultiplePLMNsOfInterFreqCellsList();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "multipleplmnsOfIntraFreqCellsList"
    public MultiplePLMNsOfIntraFreqCellsList getMultipleplmnsOfIntraFreqCellsList()
    {
	return (MultiplePLMNsOfIntraFreqCellsList)mComponents[0];
    }
    
    public void setMultipleplmnsOfIntraFreqCellsList(MultiplePLMNsOfIntraFreqCellsList multipleplmnsOfIntraFreqCellsList)
    {
	mComponents[0] = multipleplmnsOfIntraFreqCellsList;
    }
    
    public boolean hasMultipleplmnsOfIntraFreqCellsList()
    {
	return componentIsPresent(0);
    }
    
    public void deleteMultipleplmnsOfIntraFreqCellsList()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "multipleplmnsOfInterFreqCellsList"
    public MultiplePLMNsOfInterFreqCellsList getMultipleplmnsOfInterFreqCellsList()
    {
	return (MultiplePLMNsOfInterFreqCellsList)mComponents[1];
    }
    
    public void setMultipleplmnsOfInterFreqCellsList(MultiplePLMNsOfInterFreqCellsList multipleplmnsOfInterFreqCellsList)
    {
	mComponents[1] = multipleplmnsOfInterFreqCellsList;
    }
    
    public boolean hasMultipleplmnsOfInterFreqCellsList()
    {
	return componentIsPresent(1);
    }
    
    public void deleteMultipleplmnsOfInterFreqCellsList()
    {
	setComponentAbsent(1);
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
	    "PLMNIdentitiesOfNeighbourCells_v860ext"
	),
	new QName (
	    "InformationElements",
	    "PLMNIdentitiesOfNeighbourCells-v860ext"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"MultiplePLMNsOfIntraFreqCellsList"
			    ),
			    new QName (
				"InformationElements",
				"MultiplePLMNsOfIntraFreqCellsList"
			    ),
			    12314,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new com.oss.asn1.INTEGER(1), 
					new com.oss.asn1.INTEGER(32),
					0
				    )
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(32)
			    ),
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "MultiplePLMNsOfIntraFreqCellsList$Sequence_"
				)
			    )
			)
		    ),
		    "multipleplmnsOfIntraFreqCellsList",
		    0,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"MultiplePLMNsOfInterFreqCellsList"
			    ),
			    new QName (
				"InformationElements",
				"MultiplePLMNsOfInterFreqCellsList"
			    ),
			    12314,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new com.oss.asn1.INTEGER(1), 
					new com.oss.asn1.INTEGER(32),
					0
				    )
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(32)
			    ),
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "MultiplePLMNsOfInterFreqCellsList$Sequence_"
				)
			    )
			)
		    ),
		    "multipleplmnsOfInterFreqCellsList",
		    1,
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
			new TagDecoderElement((short)0x8001, 1)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8001, 1)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' PLMNIdentitiesOfNeighbourCells_v860ext object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' PLMNIdentitiesOfNeighbourCells_v860ext object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for PLMNIdentitiesOfNeighbourCells_v860ext
