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
 * Define the ASN1 Type MeasurementCapabilityExt4 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class MeasurementCapabilityExt4 extends Sequence {
    
    /**
     * The default constructor.
     */
    public MeasurementCapabilityExt4()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public MeasurementCapabilityExt4(CompressedModeMeasCapabFDDList2 compressedModeMeasCapabFDDList2, 
		    CompressedModeMeasCapabFDDList3 compressedModeMeasCapabFDDList3, 
		    CompressedModeMeasCapabTDDList compressedModeMeasCapabTDDList, 
		    CompressedModeMeasCapabGSMList compressedModeMeasCapabGSMList, 
		    CompressedModeMeasCapabMC compressedModeMeasCapabMC, 
		    CompressedModeMeasCapabEUTRAList compressedModeMeasCapabEUTRAList)
    {
	setCompressedModeMeasCapabFDDList2(compressedModeMeasCapabFDDList2);
	setCompressedModeMeasCapabFDDList3(compressedModeMeasCapabFDDList3);
	setCompressedModeMeasCapabTDDList(compressedModeMeasCapabTDDList);
	setCompressedModeMeasCapabGSMList(compressedModeMeasCapabGSMList);
	setCompressedModeMeasCapabMC(compressedModeMeasCapabMC);
	setCompressedModeMeasCapabEUTRAList(compressedModeMeasCapabEUTRAList);
    }
    
    public void initComponents()
    {
	mComponents[0] = new CompressedModeMeasCapabFDDList2();
	mComponents[1] = new CompressedModeMeasCapabFDDList3();
	mComponents[2] = new CompressedModeMeasCapabTDDList();
	mComponents[3] = new CompressedModeMeasCapabGSMList();
	mComponents[4] = new CompressedModeMeasCapabMC();
	mComponents[5] = new CompressedModeMeasCapabEUTRAList();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[6];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new CompressedModeMeasCapabFDDList2();
	    case 1:
		return new CompressedModeMeasCapabFDDList3();
	    case 2:
		return new CompressedModeMeasCapabTDDList();
	    case 3:
		return new CompressedModeMeasCapabGSMList();
	    case 4:
		return new CompressedModeMeasCapabMC();
	    case 5:
		return new CompressedModeMeasCapabEUTRAList();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "compressedModeMeasCapabFDDList2"
    public CompressedModeMeasCapabFDDList2 getCompressedModeMeasCapabFDDList2()
    {
	return (CompressedModeMeasCapabFDDList2)mComponents[0];
    }
    
    public void setCompressedModeMeasCapabFDDList2(CompressedModeMeasCapabFDDList2 compressedModeMeasCapabFDDList2)
    {
	mComponents[0] = compressedModeMeasCapabFDDList2;
    }
    
    public boolean hasCompressedModeMeasCapabFDDList2()
    {
	return componentIsPresent(0);
    }
    
    public void deleteCompressedModeMeasCapabFDDList2()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "compressedModeMeasCapabFDDList3"
    public CompressedModeMeasCapabFDDList3 getCompressedModeMeasCapabFDDList3()
    {
	return (CompressedModeMeasCapabFDDList3)mComponents[1];
    }
    
    public void setCompressedModeMeasCapabFDDList3(CompressedModeMeasCapabFDDList3 compressedModeMeasCapabFDDList3)
    {
	mComponents[1] = compressedModeMeasCapabFDDList3;
    }
    
    public boolean hasCompressedModeMeasCapabFDDList3()
    {
	return componentIsPresent(1);
    }
    
    public void deleteCompressedModeMeasCapabFDDList3()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "compressedModeMeasCapabTDDList"
    public CompressedModeMeasCapabTDDList getCompressedModeMeasCapabTDDList()
    {
	return (CompressedModeMeasCapabTDDList)mComponents[2];
    }
    
    public void setCompressedModeMeasCapabTDDList(CompressedModeMeasCapabTDDList compressedModeMeasCapabTDDList)
    {
	mComponents[2] = compressedModeMeasCapabTDDList;
    }
    
    public boolean hasCompressedModeMeasCapabTDDList()
    {
	return componentIsPresent(2);
    }
    
    public void deleteCompressedModeMeasCapabTDDList()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "compressedModeMeasCapabGSMList"
    public CompressedModeMeasCapabGSMList getCompressedModeMeasCapabGSMList()
    {
	return (CompressedModeMeasCapabGSMList)mComponents[3];
    }
    
    public void setCompressedModeMeasCapabGSMList(CompressedModeMeasCapabGSMList compressedModeMeasCapabGSMList)
    {
	mComponents[3] = compressedModeMeasCapabGSMList;
    }
    
    public boolean hasCompressedModeMeasCapabGSMList()
    {
	return componentIsPresent(3);
    }
    
    public void deleteCompressedModeMeasCapabGSMList()
    {
	setComponentAbsent(3);
    }
    
    
    // Methods for field "compressedModeMeasCapabMC"
    public CompressedModeMeasCapabMC getCompressedModeMeasCapabMC()
    {
	return (CompressedModeMeasCapabMC)mComponents[4];
    }
    
    public void setCompressedModeMeasCapabMC(CompressedModeMeasCapabMC compressedModeMeasCapabMC)
    {
	mComponents[4] = compressedModeMeasCapabMC;
    }
    
    public boolean hasCompressedModeMeasCapabMC()
    {
	return componentIsPresent(4);
    }
    
    public void deleteCompressedModeMeasCapabMC()
    {
	setComponentAbsent(4);
    }
    
    
    // Methods for field "compressedModeMeasCapabEUTRAList"
    public CompressedModeMeasCapabEUTRAList getCompressedModeMeasCapabEUTRAList()
    {
	return (CompressedModeMeasCapabEUTRAList)mComponents[5];
    }
    
    public void setCompressedModeMeasCapabEUTRAList(CompressedModeMeasCapabEUTRAList compressedModeMeasCapabEUTRAList)
    {
	mComponents[5] = compressedModeMeasCapabEUTRAList;
    }
    
    public boolean hasCompressedModeMeasCapabEUTRAList()
    {
	return componentIsPresent(5);
    }
    
    public void deleteCompressedModeMeasCapabEUTRAList()
    {
	setComponentAbsent(5);
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
	    "MeasurementCapabilityExt4"
	),
	new QName (
	    "InformationElements",
	    "MeasurementCapabilityExt4"
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
				"CompressedModeMeasCapabFDDList2"
			    ),
			    new QName (
				"InformationElements",
				"CompressedModeMeasCapabFDDList2"
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
				    "CompressedModeMeasCapabFDD2"
				)
			    )
			)
		    ),
		    "compressedModeMeasCapabFDDList2",
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
				"CompressedModeMeasCapabFDDList3"
			    ),
			    new QName (
				"InformationElements",
				"CompressedModeMeasCapabFDDList3"
			    ),
			    12314,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new com.oss.asn1.INTEGER(1), 
					new com.oss.asn1.INTEGER(64),
					0
				    )
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(64)
			    ),
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "CompressedModeMeasCapabFDD3"
				)
			    )
			)
		    ),
		    "compressedModeMeasCapabFDDList3",
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
		    2,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
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
		    3,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8004
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
		    4,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8005
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"CompressedModeMeasCapabEUTRAList"
			    ),
			    new QName (
				"InformationElements",
				"CompressedModeMeasCapabEUTRAList"
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
				    "CompressedModeMeasCapabEUTRA"
				)
			    )
			)
		    ),
		    "compressedModeMeasCapabEUTRAList",
		    5,
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
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8005, 5)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' MeasurementCapabilityExt4 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' MeasurementCapabilityExt4 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for MeasurementCapabilityExt4
