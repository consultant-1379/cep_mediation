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
 * Define the ASN1 Type InterRATCellInfoList_r4 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class InterRATCellInfoList_r4 extends Sequence {
    
    /**
     * The default constructor.
     */
    public InterRATCellInfoList_r4()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public InterRATCellInfoList_r4(RemovedInterRATCellList removedInterRATCellList, 
		    NewInterRATCellList newInterRATCellList, 
		    CellsForInterRATMeasList cellsForInterRATMeasList)
    {
	setRemovedInterRATCellList(removedInterRATCellList);
	setNewInterRATCellList(newInterRATCellList);
	setCellsForInterRATMeasList(cellsForInterRATMeasList);
    }
    
    /**
     * Construct with required components.
     */
    public InterRATCellInfoList_r4(RemovedInterRATCellList removedInterRATCellList)
    {
	setRemovedInterRATCellList(removedInterRATCellList);
    }
    
    public void initComponents()
    {
	mComponents[0] = new RemovedInterRATCellList();
	mComponents[1] = new NewInterRATCellList();
	mComponents[2] = new CellsForInterRATMeasList();
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
		return new RemovedInterRATCellList();
	    case 1:
		return new NewInterRATCellList();
	    case 2:
		return new CellsForInterRATMeasList();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "removedInterRATCellList"
    public RemovedInterRATCellList getRemovedInterRATCellList()
    {
	return (RemovedInterRATCellList)mComponents[0];
    }
    
    public void setRemovedInterRATCellList(RemovedInterRATCellList removedInterRATCellList)
    {
	mComponents[0] = removedInterRATCellList;
    }
    
    
    // Methods for field "newInterRATCellList"
    public NewInterRATCellList getNewInterRATCellList()
    {
	return (NewInterRATCellList)mComponents[1];
    }
    
    public void setNewInterRATCellList(NewInterRATCellList newInterRATCellList)
    {
	mComponents[1] = newInterRATCellList;
    }
    
    public boolean hasNewInterRATCellList()
    {
	return componentIsPresent(1);
    }
    
    public void deleteNewInterRATCellList()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "cellsForInterRATMeasList"
    public CellsForInterRATMeasList getCellsForInterRATMeasList()
    {
	return (CellsForInterRATMeasList)mComponents[2];
    }
    
    public void setCellsForInterRATMeasList(CellsForInterRATMeasList cellsForInterRATMeasList)
    {
	mComponents[2] = cellsForInterRATMeasList;
    }
    
    public boolean hasCellsForInterRATMeasList()
    {
	return componentIsPresent(2);
    }
    
    public void deleteCellsForInterRATMeasList()
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
	    "InterRATCellInfoList_r4"
	),
	new QName (
	    "InformationElements",
	    "InterRATCellInfoList-r4"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"RemovedInterRATCellList"
			    ),
			    new QName (
				"InformationElements",
				"RemovedInterRATCellList"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "RemovedInterRATCellList"
				)
			    ),
			    0,
			    new TagDecoder (
				new TagDecoderElement[] {
				    new TagDecoderElement((short)0x8000, 0),
				    new TagDecoderElement((short)0x8001, 1),
				    new TagDecoderElement((short)0x8002, 2)
				}
			    )
			)
		    ),
		    "removedInterRATCellList",
		    0,
		    2,
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
				"NewInterRATCellList"
			    ),
			    new QName (
				"InformationElements",
				"NewInterRATCellList"
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
				    "NewInterRATCell"
				)
			    )
			)
		    ),
		    "newInterRATCellList",
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
				"CellsForInterRATMeasList"
			    ),
			    new QName (
				"InformationElements",
				"CellsForInterRATMeasList"
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
				    "InterRATCellID"
				)
			    )
			)
		    ),
		    "cellsForInterRATMeasList",
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
     * Get the type descriptor (TypeInfo) of 'this' InterRATCellInfoList_r4 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' InterRATCellInfoList_r4 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for InterRATCellInfoList_r4
