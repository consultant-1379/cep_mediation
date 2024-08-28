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
 * Define the ASN1 Type NewIntraFreqCellOnSecULFreq from ASN1 Module InformationElements.
 * @see Sequence
 */

public class NewIntraFreqCellOnSecULFreq extends Sequence {
    
    /**
     * The default constructor.
     */
    public NewIntraFreqCellOnSecULFreq()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public NewIntraFreqCellOnSecULFreq(IntraFreqCellIDOnSecULFreq intraFreqCellIDOnSecULFreq, 
		    CellInfo_r4 cellInfo)
    {
	setIntraFreqCellIDOnSecULFreq(intraFreqCellIDOnSecULFreq);
	setCellInfo(cellInfo);
    }
    
    /**
     * Construct with required components.
     */
    public NewIntraFreqCellOnSecULFreq(CellInfo_r4 cellInfo)
    {
	setCellInfo(cellInfo);
    }
    
    public void initComponents()
    {
	mComponents[0] = new IntraFreqCellIDOnSecULFreq();
	mComponents[1] = new CellInfo_r4();
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
		return new IntraFreqCellIDOnSecULFreq();
	    case 1:
		return new CellInfo_r4();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "intraFreqCellIDOnSecULFreq"
    public IntraFreqCellIDOnSecULFreq getIntraFreqCellIDOnSecULFreq()
    {
	return (IntraFreqCellIDOnSecULFreq)mComponents[0];
    }
    
    public void setIntraFreqCellIDOnSecULFreq(IntraFreqCellIDOnSecULFreq intraFreqCellIDOnSecULFreq)
    {
	mComponents[0] = intraFreqCellIDOnSecULFreq;
    }
    
    public boolean hasIntraFreqCellIDOnSecULFreq()
    {
	return componentIsPresent(0);
    }
    
    public void deleteIntraFreqCellIDOnSecULFreq()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "cellInfo"
    public CellInfo_r4 getCellInfo()
    {
	return (CellInfo_r4)mComponents[1];
    }
    
    public void setCellInfo(CellInfo_r4 cellInfo)
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
	    "NewIntraFreqCellOnSecULFreq"
	),
	new QName (
	    "InformationElements",
	    "NewIntraFreqCellOnSecULFreq"
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
				"IntraFreqCellIDOnSecULFreq"
			    ),
			    new QName (
				"InformationElements",
				"IntraFreqCellIDOnSecULFreq"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new IntraFreqCellIDOnSecULFreq(0), 
				    new IntraFreqCellIDOnSecULFreq(31),
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
		    "intraFreqCellIDOnSecULFreq",
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
				"CellInfo_r4"
			    ),
			    new QName (
				"InformationElements",
				"CellInfo-r4"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "CellInfo_r4"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "CellInfo_r4"
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
     * Get the type descriptor (TypeInfo) of 'this' NewIntraFreqCellOnSecULFreq object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' NewIntraFreqCellOnSecULFreq object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for NewIntraFreqCellOnSecULFreq
