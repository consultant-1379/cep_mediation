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
 * Define the ASN1 Type PLMNIdentitiesOfNeighbourCells from ASN1 Module InformationElements.
 * @see Sequence
 */

public class PLMNIdentitiesOfNeighbourCells extends Sequence {
    
    /**
     * The default constructor.
     */
    public PLMNIdentitiesOfNeighbourCells()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public PLMNIdentitiesOfNeighbourCells(PLMNsOfIntraFreqCellsList plmnsOfIntraFreqCellsList, 
		    PLMNsOfInterFreqCellsList plmnsOfInterFreqCellsList, 
		    PLMNsOfInterRATCellsList plmnsOfInterRATCellsList)
    {
	setPlmnsOfIntraFreqCellsList(plmnsOfIntraFreqCellsList);
	setPlmnsOfInterFreqCellsList(plmnsOfInterFreqCellsList);
	setPlmnsOfInterRATCellsList(plmnsOfInterRATCellsList);
    }
    
    public void initComponents()
    {
	mComponents[0] = new PLMNsOfIntraFreqCellsList();
	mComponents[1] = new PLMNsOfInterFreqCellsList();
	mComponents[2] = new PLMNsOfInterRATCellsList();
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
		return new PLMNsOfIntraFreqCellsList();
	    case 1:
		return new PLMNsOfInterFreqCellsList();
	    case 2:
		return new PLMNsOfInterRATCellsList();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "plmnsOfIntraFreqCellsList"
    public PLMNsOfIntraFreqCellsList getPlmnsOfIntraFreqCellsList()
    {
	return (PLMNsOfIntraFreqCellsList)mComponents[0];
    }
    
    public void setPlmnsOfIntraFreqCellsList(PLMNsOfIntraFreqCellsList plmnsOfIntraFreqCellsList)
    {
	mComponents[0] = plmnsOfIntraFreqCellsList;
    }
    
    public boolean hasPlmnsOfIntraFreqCellsList()
    {
	return componentIsPresent(0);
    }
    
    public void deletePlmnsOfIntraFreqCellsList()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "plmnsOfInterFreqCellsList"
    public PLMNsOfInterFreqCellsList getPlmnsOfInterFreqCellsList()
    {
	return (PLMNsOfInterFreqCellsList)mComponents[1];
    }
    
    public void setPlmnsOfInterFreqCellsList(PLMNsOfInterFreqCellsList plmnsOfInterFreqCellsList)
    {
	mComponents[1] = plmnsOfInterFreqCellsList;
    }
    
    public boolean hasPlmnsOfInterFreqCellsList()
    {
	return componentIsPresent(1);
    }
    
    public void deletePlmnsOfInterFreqCellsList()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "plmnsOfInterRATCellsList"
    public PLMNsOfInterRATCellsList getPlmnsOfInterRATCellsList()
    {
	return (PLMNsOfInterRATCellsList)mComponents[2];
    }
    
    public void setPlmnsOfInterRATCellsList(PLMNsOfInterRATCellsList plmnsOfInterRATCellsList)
    {
	mComponents[2] = plmnsOfInterRATCellsList;
    }
    
    public boolean hasPlmnsOfInterRATCellsList()
    {
	return componentIsPresent(2);
    }
    
    public void deletePlmnsOfInterRATCellsList()
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
	    "PLMNIdentitiesOfNeighbourCells"
	),
	new QName (
	    "InformationElements",
	    "PLMNIdentitiesOfNeighbourCells"
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
				"PLMNsOfIntraFreqCellsList"
			    ),
			    new QName (
				"InformationElements",
				"PLMNsOfIntraFreqCellsList"
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
				    "PLMNsOfIntraFreqCellsList$Sequence_"
				)
			    )
			)
		    ),
		    "plmnsOfIntraFreqCellsList",
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
				"PLMNsOfInterFreqCellsList"
			    ),
			    new QName (
				"InformationElements",
				"PLMNsOfInterFreqCellsList"
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
				    "PLMNsOfInterFreqCellsList$Sequence_"
				)
			    )
			)
		    ),
		    "plmnsOfInterFreqCellsList",
		    1,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"PLMNsOfInterRATCellsList"
			    ),
			    new QName (
				"InformationElements",
				"PLMNsOfInterRATCellsList"
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
				    "PLMNsOfInterRATCellsList$Sequence_"
				)
			    )
			)
		    ),
		    "plmnsOfInterRATCellsList",
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
			new TagDecoderElement((short)0x8000, 0),
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2)
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
     * Get the type descriptor (TypeInfo) of 'this' PLMNIdentitiesOfNeighbourCells object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' PLMNIdentitiesOfNeighbourCells object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for PLMNIdentitiesOfNeighbourCells
