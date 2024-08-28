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
 * Define the ASN1 Type InterFreqCellInfoList_r8 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class InterFreqCellInfoList_r8 extends Sequence {
    
    /**
     * The default constructor.
     */
    public InterFreqCellInfoList_r8()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public InterFreqCellInfoList_r8(RemovedInterFreqCellList removedInterFreqCellList, 
		    NewInterFreqCellList_r8 newInterFreqCellList, 
		    CellsForInterFreqMeasList cellsForInterFreqMeasList)
    {
	setRemovedInterFreqCellList(removedInterFreqCellList);
	setNewInterFreqCellList(newInterFreqCellList);
	setCellsForInterFreqMeasList(cellsForInterFreqMeasList);
    }
    
    public void initComponents()
    {
	mComponents[0] = new RemovedInterFreqCellList();
	mComponents[1] = new NewInterFreqCellList_r8();
	mComponents[2] = new CellsForInterFreqMeasList();
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
		return new RemovedInterFreqCellList();
	    case 1:
		return new NewInterFreqCellList_r8();
	    case 2:
		return new CellsForInterFreqMeasList();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "removedInterFreqCellList"
    public RemovedInterFreqCellList getRemovedInterFreqCellList()
    {
	return (RemovedInterFreqCellList)mComponents[0];
    }
    
    public void setRemovedInterFreqCellList(RemovedInterFreqCellList removedInterFreqCellList)
    {
	mComponents[0] = removedInterFreqCellList;
    }
    
    public boolean hasRemovedInterFreqCellList()
    {
	return componentIsPresent(0);
    }
    
    public void deleteRemovedInterFreqCellList()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "newInterFreqCellList"
    public NewInterFreqCellList_r8 getNewInterFreqCellList()
    {
	return (NewInterFreqCellList_r8)mComponents[1];
    }
    
    public void setNewInterFreqCellList(NewInterFreqCellList_r8 newInterFreqCellList)
    {
	mComponents[1] = newInterFreqCellList;
    }
    
    public boolean hasNewInterFreqCellList()
    {
	return componentIsPresent(1);
    }
    
    public void deleteNewInterFreqCellList()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "cellsForInterFreqMeasList"
    public CellsForInterFreqMeasList getCellsForInterFreqMeasList()
    {
	return (CellsForInterFreqMeasList)mComponents[2];
    }
    
    public void setCellsForInterFreqMeasList(CellsForInterFreqMeasList cellsForInterFreqMeasList)
    {
	mComponents[2] = cellsForInterFreqMeasList;
    }
    
    public boolean hasCellsForInterFreqMeasList()
    {
	return componentIsPresent(2);
    }
    
    public void deleteCellsForInterFreqMeasList()
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
	    "InterFreqCellInfoList_r8"
	),
	new QName (
	    "InformationElements",
	    "InterFreqCellInfoList-r8"
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
				"RemovedInterFreqCellList"
			    ),
			    new QName (
				"InformationElements",
				"RemovedInterFreqCellList"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "RemovedInterFreqCellList"
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
		    "removedInterFreqCellList",
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
				"NewInterFreqCellList_r8"
			    ),
			    new QName (
				"InformationElements",
				"NewInterFreqCellList-r8"
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
				    "NewInterFreqCell_r8"
				)
			    )
			)
		    ),
		    "newInterFreqCellList",
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
				"CellsForInterFreqMeasList"
			    ),
			    new QName (
				"InformationElements",
				"CellsForInterFreqMeasList"
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
				    "InterFreqCellID"
				)
			    )
			)
		    ),
		    "cellsForInterFreqMeasList",
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
     * Get the type descriptor (TypeInfo) of 'this' InterFreqCellInfoList_r8 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' InterFreqCellInfoList_r8 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for InterFreqCellInfoList_r8
