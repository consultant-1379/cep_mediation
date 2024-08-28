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
 * Define the ASN1 Type PRACH_SystemInformation_LCR_r4 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class PRACH_SystemInformation_LCR_r4 extends Sequence {
    
    /**
     * The default constructor.
     */
    public PRACH_SystemInformation_LCR_r4()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public PRACH_SystemInformation_LCR_r4(PRACH_RACH_Info_LCR_r4 prach_RACH_Info_LCR, 
		    TransportFormatSet_LCR rach_TransportFormatSet_LCR, 
		    PRACH_Partitioning_LCR_r4 prach_Partitioning_LCR)
    {
	setPrach_RACH_Info_LCR(prach_RACH_Info_LCR);
	setRach_TransportFormatSet_LCR(rach_TransportFormatSet_LCR);
	setPrach_Partitioning_LCR(prach_Partitioning_LCR);
    }
    
    /**
     * Construct with required components.
     */
    public PRACH_SystemInformation_LCR_r4(PRACH_RACH_Info_LCR_r4 prach_RACH_Info_LCR)
    {
	setPrach_RACH_Info_LCR(prach_RACH_Info_LCR);
    }
    
    public void initComponents()
    {
	mComponents[0] = new PRACH_RACH_Info_LCR_r4();
	mComponents[1] = new TransportFormatSet_LCR();
	mComponents[2] = new PRACH_Partitioning_LCR_r4();
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
		return new PRACH_RACH_Info_LCR_r4();
	    case 1:
		return new TransportFormatSet_LCR();
	    case 2:
		return new PRACH_Partitioning_LCR_r4();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "prach_RACH_Info_LCR"
    public PRACH_RACH_Info_LCR_r4 getPrach_RACH_Info_LCR()
    {
	return (PRACH_RACH_Info_LCR_r4)mComponents[0];
    }
    
    public void setPrach_RACH_Info_LCR(PRACH_RACH_Info_LCR_r4 prach_RACH_Info_LCR)
    {
	mComponents[0] = prach_RACH_Info_LCR;
    }
    
    
    // Methods for field "rach_TransportFormatSet_LCR"
    public TransportFormatSet_LCR getRach_TransportFormatSet_LCR()
    {
	return (TransportFormatSet_LCR)mComponents[1];
    }
    
    public void setRach_TransportFormatSet_LCR(TransportFormatSet_LCR rach_TransportFormatSet_LCR)
    {
	mComponents[1] = rach_TransportFormatSet_LCR;
    }
    
    public boolean hasRach_TransportFormatSet_LCR()
    {
	return componentIsPresent(1);
    }
    
    public void deleteRach_TransportFormatSet_LCR()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "prach_Partitioning_LCR"
    public PRACH_Partitioning_LCR_r4 getPrach_Partitioning_LCR()
    {
	return (PRACH_Partitioning_LCR_r4)mComponents[2];
    }
    
    public void setPrach_Partitioning_LCR(PRACH_Partitioning_LCR_r4 prach_Partitioning_LCR)
    {
	mComponents[2] = prach_Partitioning_LCR;
    }
    
    public boolean hasPrach_Partitioning_LCR()
    {
	return componentIsPresent(2);
    }
    
    public void deletePrach_Partitioning_LCR()
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
	    "PRACH_SystemInformation_LCR_r4"
	),
	new QName (
	    "InformationElements",
	    "PRACH-SystemInformation-LCR-r4"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"PRACH_RACH_Info_LCR_r4"
			    ),
			    new QName (
				"InformationElements",
				"PRACH-RACH-Info-LCR-r4"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "PRACH_RACH_Info_LCR_r4"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "PRACH_RACH_Info_LCR_r4"
				)
			    ),
			    0
			)
		    ),
		    "prach-RACH-Info-LCR",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"TransportFormatSet_LCR"
			    ),
			    new QName (
				"InformationElements",
				"TransportFormatSet-LCR"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "TransportFormatSet_LCR"
				)
			    ),
			    0,
			    new TagDecoder (
				new TagDecoderElement[] {
				    new TagDecoderElement((short)0x8000, 0),
				    new TagDecoderElement((short)0x8001, 1)
				}
			    )
			)
		    ),
		    "rach-TransportFormatSet-LCR",
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
				"PRACH_Partitioning_LCR_r4"
			    ),
			    new QName (
				"InformationElements",
				"PRACH-Partitioning-LCR-r4"
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
				    "ASCSetting_TDD_LCR_r4"
				)
			    )
			)
		    ),
		    "prach-Partitioning-LCR",
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
     * Get the type descriptor (TypeInfo) of 'this' PRACH_SystemInformation_LCR_r4 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' PRACH_SystemInformation_LCR_r4 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for PRACH_SystemInformation_LCR_r4
