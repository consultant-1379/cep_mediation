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
 * Define the ASN1 Type NewIntraFreqCell from ASN1 Module InformationElements.
 * @see Sequence
 */

public class NewIntraFreqCell extends Sequence {
    
    /**
     * The default constructor.
     */
    public NewIntraFreqCell()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public NewIntraFreqCell(IntraFreqCellID intraFreqCellID, 
		    CellInfo cellInfo)
    {
	setIntraFreqCellID(intraFreqCellID);
	setCellInfo(cellInfo);
    }
    
    /**
     * Construct with required components.
     */
    public NewIntraFreqCell(CellInfo cellInfo)
    {
	setCellInfo(cellInfo);
    }
    
    public void initComponents()
    {
	mComponents[0] = new IntraFreqCellID();
	mComponents[1] = new CellInfo();
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
		return new IntraFreqCellID();
	    case 1:
		return new CellInfo();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "intraFreqCellID"
    public IntraFreqCellID getIntraFreqCellID()
    {
	return (IntraFreqCellID)mComponents[0];
    }
    
    public void setIntraFreqCellID(IntraFreqCellID intraFreqCellID)
    {
	mComponents[0] = intraFreqCellID;
    }
    
    public boolean hasIntraFreqCellID()
    {
	return componentIsPresent(0);
    }
    
    public void deleteIntraFreqCellID()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "cellInfo"
    public CellInfo getCellInfo()
    {
	return (CellInfo)mComponents[1];
    }
    
    public void setCellInfo(CellInfo cellInfo)
    {
	mComponents[1] = cellInfo;
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
	    "NewIntraFreqCell"
	),
	new QName (
	    "InformationElements",
	    "NewIntraFreqCell"
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
				"IntraFreqCellID"
			    ),
			    new QName (
				"InformationElements",
				"IntraFreqCellID"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new IntraFreqCellID(0), 
				    new IntraFreqCellID(31),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(31)
			    ),
			    null
			)
		    ),
		    "intraFreqCellID",
		    0,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"CellInfo"
			    ),
			    new QName (
				"InformationElements",
				"CellInfo"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "CellInfo"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "CellInfo"
				)
			    ),
			    0
			)
		    ),
		    "cellInfo",
		    1,
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
     * Get the type descriptor (TypeInfo) of 'this' NewIntraFreqCell object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' NewIntraFreqCell object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for NewIntraFreqCell
