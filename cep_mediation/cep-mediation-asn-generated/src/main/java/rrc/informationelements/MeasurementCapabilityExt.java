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
 * Define the ASN1 Type MeasurementCapabilityExt from ASN1 Module InformationElements.
 * @see Sequence
 */

public class MeasurementCapabilityExt extends Sequence {
    
    /**
     * The default constructor.
     */
    public MeasurementCapabilityExt()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public MeasurementCapabilityExt(CompressedModeMeasCapabFDDList compressedModeMeasCapabFDDList, 
		    CompressedModeMeasCapabTDDList compressedModeMeasCapabTDDList, 
		    CompressedModeMeasCapabGSMList compressedModeMeasCapabGSMList, 
		    CompressedModeMeasCapabMC compressedModeMeasCapabMC)
    {
	setCompressedModeMeasCapabFDDList(compressedModeMeasCapabFDDList);
	setCompressedModeMeasCapabTDDList(compressedModeMeasCapabTDDList);
	setCompressedModeMeasCapabGSMList(compressedModeMeasCapabGSMList);
	setCompressedModeMeasCapabMC(compressedModeMeasCapabMC);
    }
    
    /**
     * Construct with required components.
     */
    public MeasurementCapabilityExt(CompressedModeMeasCapabFDDList compressedModeMeasCapabFDDList)
    {
	setCompressedModeMeasCapabFDDList(compressedModeMeasCapabFDDList);
    }
    
    public void initComponents()
    {
	mComponents[0] = new CompressedModeMeasCapabFDDList();
	mComponents[1] = new CompressedModeMeasCapabTDDList();
	mComponents[2] = new CompressedModeMeasCapabGSMList();
	mComponents[3] = new CompressedModeMeasCapabMC();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[4];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new CompressedModeMeasCapabFDDList();
	    case 1:
		return new CompressedModeMeasCapabTDDList();
	    case 2:
		return new CompressedModeMeasCapabGSMList();
	    case 3:
		return new CompressedModeMeasCapabMC();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "compressedModeMeasCapabFDDList"
    public CompressedModeMeasCapabFDDList getCompressedModeMeasCapabFDDList()
    {
	return (CompressedModeMeasCapabFDDList)mComponents[0];
    }
    
    public void setCompressedModeMeasCapabFDDList(CompressedModeMeasCapabFDDList compressedModeMeasCapabFDDList)
    {
	mComponents[0] = compressedModeMeasCapabFDDList;
    }
    
    
    // Methods for field "compressedModeMeasCapabTDDList"
    public CompressedModeMeasCapabTDDList getCompressedModeMeasCapabTDDList()
    {
	return (CompressedModeMeasCapabTDDList)mComponents[1];
    }
    
    public void setCompressedModeMeasCapabTDDList(CompressedModeMeasCapabTDDList compressedModeMeasCapabTDDList)
    {
	mComponents[1] = compressedModeMeasCapabTDDList;
    }
    
    public boolean hasCompressedModeMeasCapabTDDList()
    {
	return componentIsPresent(1);
    }
    
    public void deleteCompressedModeMeasCapabTDDList()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "compressedModeMeasCapabGSMList"
    public CompressedModeMeasCapabGSMList getCompressedModeMeasCapabGSMList()
    {
	return (CompressedModeMeasCapabGSMList)mComponents[2];
    }
    
    public void setCompressedModeMeasCapabGSMList(CompressedModeMeasCapabGSMList compressedModeMeasCapabGSMList)
    {
	mComponents[2] = compressedModeMeasCapabGSMList;
    }
    
    public boolean hasCompressedModeMeasCapabGSMList()
    {
	return componentIsPresent(2);
    }
    
    public void deleteCompressedModeMeasCapabGSMList()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "compressedModeMeasCapabMC"
    public CompressedModeMeasCapabMC getCompressedModeMeasCapabMC()
    {
	return (CompressedModeMeasCapabMC)mComponents[3];
    }
    
    public void setCompressedModeMeasCapabMC(CompressedModeMeasCapabMC compressedModeMeasCapabMC)
    {
	mComponents[3] = compressedModeMeasCapabMC;
    }
    
    public boolean hasCompressedModeMeasCapabMC()
    {
	return componentIsPresent(3);
    }
    
    public void deleteCompressedModeMeasCapabMC()
    {
	setComponentAbsent(3);
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
	    "MeasurementCapabilityExt"
	),
	new QName (
	    "InformationElements",
	    "MeasurementCapabilityExt"
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
				"CompressedModeMeasCapabFDDList"
			    ),
			    new QName (
				"InformationElements",
				"CompressedModeMeasCapabFDDList"
			    ),
			    12314,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new com.oss.asn1.INTEGER(1), 
					new com.oss.asn1.INTEGER(8),
					0
				    )
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(8)
			    ),
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "CompressedModeMeasCapabFDD"
				)
			    )
			)
		    ),
		    "compressedModeMeasCapabFDDList",
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
				"CompressedModeMeasCapabTDDList"
			    ),
			    new QName (
				"InformationElements",
				"CompressedModeMeasCapabTDDList"
			    ),
			    12314,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new com.oss.asn1.INTEGER(1), 
					new com.oss.asn1.INTEGER(4),
					0
				    )
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(4)
			    ),
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "CompressedModeMeasCapabTDD"
				)
			    )
			)
		    ),
		    "compressedModeMeasCapabTDDList",
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
				"CompressedModeMeasCapabGSMList"
			    ),
			    new QName (
				"InformationElements",
				"CompressedModeMeasCapabGSMList"
			    ),
			    12314,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new com.oss.asn1.INTEGER(1), 
					new com.oss.asn1.INTEGER(16),
					0
				    )
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(16)
			    ),
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "CompressedModeMeasCapabGSM"
				)
			    )
			)
		    ),
		    "compressedModeMeasCapabGSMList",
		    2,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"CompressedModeMeasCapabMC"
			    ),
			    new QName (
				"InformationElements",
				"CompressedModeMeasCapabMC"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "CompressedModeMeasCapabMC"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "CompressedModeMeasCapabMC"
				)
			    ),
			    0
			)
		    ),
		    "compressedModeMeasCapabMC",
		    3,
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
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8003, 3)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' MeasurementCapabilityExt object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' MeasurementCapabilityExt object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for MeasurementCapabilityExt
