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
 * Define the ASN1 Type IntraFreqCellInfoList_r4 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class IntraFreqCellInfoList_r4 extends Sequence {
    
    /**
     * The default constructor.
     */
    public IntraFreqCellInfoList_r4()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public IntraFreqCellInfoList_r4(RemovedIntraFreqCellList removedIntraFreqCellList, 
		    NewIntraFreqCellList_r4 newIntraFreqCellList, 
		    CellsForIntraFreqMeasList cellsForIntraFreqMeasList)
    {
	setRemovedIntraFreqCellList(removedIntraFreqCellList);
	setNewIntraFreqCellList(newIntraFreqCellList);
	setCellsForIntraFreqMeasList(cellsForIntraFreqMeasList);
    }
    
    public void initComponents()
    {
	mComponents[0] = new RemovedIntraFreqCellList();
	mComponents[1] = new NewIntraFreqCellList_r4();
	mComponents[2] = new CellsForIntraFreqMeasList();
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
		return new RemovedIntraFreqCellList();
	    case 1:
		return new NewIntraFreqCellList_r4();
	    case 2:
		return new CellsForIntraFreqMeasList();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "removedIntraFreqCellList"
    public RemovedIntraFreqCellList getRemovedIntraFreqCellList()
    {
	return (RemovedIntraFreqCellList)mComponents[0];
    }
    
    public void setRemovedIntraFreqCellList(RemovedIntraFreqCellList removedIntraFreqCellList)
    {
	mComponents[0] = removedIntraFreqCellList;
    }
    
    public boolean hasRemovedIntraFreqCellList()
    {
	return componentIsPresent(0);
    }
    
    public void deleteRemovedIntraFreqCellList()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "newIntraFreqCellList"
    public NewIntraFreqCellList_r4 getNewIntraFreqCellList()
    {
	return (NewIntraFreqCellList_r4)mComponents[1];
    }
    
    public void setNewIntraFreqCellList(NewIntraFreqCellList_r4 newIntraFreqCellList)
    {
	mComponents[1] = newIntraFreqCellList;
    }
    
    public boolean hasNewIntraFreqCellList()
    {
	return componentIsPresent(1);
    }
    
    public void deleteNewIntraFreqCellList()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "cellsForIntraFreqMeasList"
    public CellsForIntraFreqMeasList getCellsForIntraFreqMeasList()
    {
	return (CellsForIntraFreqMeasList)mComponents[2];
    }
    
    public void setCellsForIntraFreqMeasList(CellsForIntraFreqMeasList cellsForIntraFreqMeasList)
    {
	mComponents[2] = cellsForIntraFreqMeasList;
    }
    
    public boolean hasCellsForIntraFreqMeasList()
    {
	return componentIsPresent(2);
    }
    
    public void deleteCellsForIntraFreqMeasList()
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
	    "IntraFreqCellInfoList_r4"
	),
	new QName (
	    "InformationElements",
	    "IntraFreqCellInfoList-r4"
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
				"RemovedIntraFreqCellList"
			    ),
			    new QName (
				"InformationElements",
				"RemovedIntraFreqCellList"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "RemovedIntraFreqCellList"
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
		    "removedIntraFreqCellList",
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
				"NewIntraFreqCellList_r4"
			    ),
			    new QName (
				"InformationElements",
				"NewIntraFreqCellList-r4"
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
				    "NewIntraFreqCell_r4"
				)
			    )
			)
		    ),
		    "newIntraFreqCellList",
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
				"CellsForIntraFreqMeasList"
			    ),
			    new QName (
				"InformationElements",
				"CellsForIntraFreqMeasList"
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
				    "IntraFreqCellID"
				)
			    )
			)
		    ),
		    "cellsForIntraFreqMeasList",
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
     * Get the type descriptor (TypeInfo) of 'this' IntraFreqCellInfoList_r4 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' IntraFreqCellInfoList_r4 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for IntraFreqCellInfoList_r4
