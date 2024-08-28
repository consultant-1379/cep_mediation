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


package rrc.pdu_definitions;

import com.oss.asn1.*;
import com.oss.metadata.*;
import rrc.*;

/**
 * Define the ASN1 Type MeasurementControl_v8a0ext_IEs from ASN1 Module PDU_definitions.
 * @see Sequence
 */

public class MeasurementControl_v8a0ext_IEs extends Sequence {
    
    /**
     * The default constructor.
     */
    public MeasurementControl_v8a0ext_IEs()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public MeasurementControl_v8a0ext_IEs(rrc.informationelements.NewIntraFreqCellList_LCR_v8a0ext newIntraFreqCellList, 
		    rrc.informationelements.NewInterFreqCellList_LCR_v8a0ext newInterFreqCellList)
    {
	setNewIntraFreqCellList(newIntraFreqCellList);
	setNewInterFreqCellList(newInterFreqCellList);
    }
    
    public void initComponents()
    {
	mComponents[0] = new rrc.informationelements.NewIntraFreqCellList_LCR_v8a0ext();
	mComponents[1] = new rrc.informationelements.NewInterFreqCellList_LCR_v8a0ext();
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
		return new rrc.informationelements.NewIntraFreqCellList_LCR_v8a0ext();
	    case 1:
		return new rrc.informationelements.NewInterFreqCellList_LCR_v8a0ext();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "newIntraFreqCellList"
    public rrc.informationelements.NewIntraFreqCellList_LCR_v8a0ext getNewIntraFreqCellList()
    {
	return (rrc.informationelements.NewIntraFreqCellList_LCR_v8a0ext)mComponents[0];
    }
    
    public void setNewIntraFreqCellList(rrc.informationelements.NewIntraFreqCellList_LCR_v8a0ext newIntraFreqCellList)
    {
	mComponents[0] = newIntraFreqCellList;
    }
    
    public boolean hasNewIntraFreqCellList()
    {
	return componentIsPresent(0);
    }
    
    public void deleteNewIntraFreqCellList()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "newInterFreqCellList"
    public rrc.informationelements.NewInterFreqCellList_LCR_v8a0ext getNewInterFreqCellList()
    {
	return (rrc.informationelements.NewInterFreqCellList_LCR_v8a0ext)mComponents[1];
    }
    
    public void setNewInterFreqCellList(rrc.informationelements.NewInterFreqCellList_LCR_v8a0ext newInterFreqCellList)
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
	    "rrc.pdu_definitions",
	    "MeasurementControl_v8a0ext_IEs"
	),
	new QName (
	    "PDU-definitions",
	    "MeasurementControl-v8a0ext-IEs"
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
				"NewIntraFreqCellList_LCR_v8a0ext"
			    ),
			    new QName (
				"InformationElements",
				"NewIntraFreqCellList-LCR-v8a0ext"
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
				    "NewIntraFreqCell_LCR_v8a0ext"
				)
			    )
			)
		    ),
		    "newIntraFreqCellList",
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
				"NewInterFreqCellList_LCR_v8a0ext"
			    ),
			    new QName (
				"InformationElements",
				"NewInterFreqCellList-LCR-v8a0ext"
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
				    "NewInterFreqCell_LCR_v8a0ext"
				)
			    )
			)
		    ),
		    "newInterFreqCellList",
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
     * Get the type descriptor (TypeInfo) of 'this' MeasurementControl_v8a0ext_IEs object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' MeasurementControl_v8a0ext_IEs object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for MeasurementControl_v8a0ext_IEs
