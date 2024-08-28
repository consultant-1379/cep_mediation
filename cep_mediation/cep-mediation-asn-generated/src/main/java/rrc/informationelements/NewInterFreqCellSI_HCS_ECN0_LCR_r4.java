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
 * Define the ASN1 Type NewInterFreqCellSI_HCS_ECN0_LCR_r4 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class NewInterFreqCellSI_HCS_ECN0_LCR_r4 extends Sequence {
    
    /**
     * The default constructor.
     */
    public NewInterFreqCellSI_HCS_ECN0_LCR_r4()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public NewInterFreqCellSI_HCS_ECN0_LCR_r4(InterFreqCellID interFreqCellID, 
		    FrequencyInfo frequencyInfo, 
		    CellInfoSI_HCS_ECN0_LCR_r4 cellInfo)
    {
	setInterFreqCellID(interFreqCellID);
	setFrequencyInfo(frequencyInfo);
	setCellInfo(cellInfo);
    }
    
    /**
     * Construct with required components.
     */
    public NewInterFreqCellSI_HCS_ECN0_LCR_r4(CellInfoSI_HCS_ECN0_LCR_r4 cellInfo)
    {
	setCellInfo(cellInfo);
    }
    
    public void initComponents()
    {
	mComponents[0] = new InterFreqCellID();
	mComponents[1] = new FrequencyInfo();
	mComponents[2] = new CellInfoSI_HCS_ECN0_LCR_r4();
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
		return new InterFreqCellID();
	    case 1:
		return new FrequencyInfo();
	    case 2:
		return new CellInfoSI_HCS_ECN0_LCR_r4();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "interFreqCellID"
    public InterFreqCellID getInterFreqCellID()
    {
	return (InterFreqCellID)mComponents[0];
    }
    
    public void setInterFreqCellID(InterFreqCellID interFreqCellID)
    {
	mComponents[0] = interFreqCellID;
    }
    
    public boolean hasInterFreqCellID()
    {
	return componentIsPresent(0);
    }
    
    public void deleteInterFreqCellID()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "frequencyInfo"
    public FrequencyInfo getFrequencyInfo()
    {
	return (FrequencyInfo)mComponents[1];
    }
    
    public void setFrequencyInfo(FrequencyInfo frequencyInfo)
    {
	mComponents[1] = frequencyInfo;
    }
    
    public boolean hasFrequencyInfo()
    {
	return componentIsPresent(1);
    }
    
    public void deleteFrequencyInfo()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "cellInfo"
    public CellInfoSI_HCS_ECN0_LCR_r4 getCellInfo()
    {
	return (CellInfoSI_HCS_ECN0_LCR_r4)mComponents[2];
    }
    
    public void setCellInfo(CellInfoSI_HCS_ECN0_LCR_r4 cellInfo)
    {
	mComponents[2] = cellInfo;
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
	    "NewInterFreqCellSI_HCS_ECN0_LCR_r4"
	),
	new QName (
	    "InformationElements",
	    "NewInterFreqCellSI-HCS-ECN0-LCR-r4"
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
				"InterFreqCellID"
			    ),
			    new QName (
				"InformationElements",
				"InterFreqCellID"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new InterFreqCellID(0), 
				    new InterFreqCellID(31),
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
		    "interFreqCellID",
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
				"FrequencyInfo"
			    ),
			    new QName (
				"InformationElements",
				"FrequencyInfo"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "FrequencyInfo"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "FrequencyInfo"
				)
			    ),
			    0
			)
		    ),
		    "frequencyInfo",
		    1,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"CellInfoSI_HCS_ECN0_LCR_r4"
			    ),
			    new QName (
				"InformationElements",
				"CellInfoSI-HCS-ECN0-LCR-r4"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "CellInfoSI_HCS_ECN0_LCR_r4"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "CellInfoSI_HCS_ECN0_LCR_r4"
				)
			    ),
			    0
			)
		    ),
		    "cellInfo",
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
     * Get the type descriptor (TypeInfo) of 'this' NewInterFreqCellSI_HCS_ECN0_LCR_r4 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' NewInterFreqCellSI_HCS_ECN0_LCR_r4 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for NewInterFreqCellSI_HCS_ECN0_LCR_r4
