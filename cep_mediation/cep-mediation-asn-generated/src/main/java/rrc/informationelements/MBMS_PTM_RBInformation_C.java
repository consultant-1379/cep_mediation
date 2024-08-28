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
 * Define the ASN1 Type MBMS_PTM_RBInformation_C from ASN1 Module InformationElements.
 * @see Sequence
 */

public class MBMS_PTM_RBInformation_C extends Sequence {
    
    /**
     * The default constructor.
     */
    public MBMS_PTM_RBInformation_C()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public MBMS_PTM_RBInformation_C(MBMS_CommonRBIdentity rbInformation, 
		    MBMS_ShortTransmissionID shortTransmissionID, 
		    MBMS_LogicalChIdentity logicalChIdentity)
    {
	setRbInformation(rbInformation);
	setShortTransmissionID(shortTransmissionID);
	setLogicalChIdentity(logicalChIdentity);
    }
    
    public void initComponents()
    {
	mComponents[0] = new MBMS_CommonRBIdentity();
	mComponents[1] = new MBMS_ShortTransmissionID();
	mComponents[2] = new MBMS_LogicalChIdentity();
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
		return new MBMS_CommonRBIdentity();
	    case 1:
		return new MBMS_ShortTransmissionID();
	    case 2:
		return new MBMS_LogicalChIdentity();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "rbInformation"
    public MBMS_CommonRBIdentity getRbInformation()
    {
	return (MBMS_CommonRBIdentity)mComponents[0];
    }
    
    public void setRbInformation(MBMS_CommonRBIdentity rbInformation)
    {
	mComponents[0] = rbInformation;
    }
    
    
    // Methods for field "shortTransmissionID"
    public MBMS_ShortTransmissionID getShortTransmissionID()
    {
	return (MBMS_ShortTransmissionID)mComponents[1];
    }
    
    public void setShortTransmissionID(MBMS_ShortTransmissionID shortTransmissionID)
    {
	mComponents[1] = shortTransmissionID;
    }
    
    
    // Methods for field "logicalChIdentity"
    public MBMS_LogicalChIdentity getLogicalChIdentity()
    {
	return (MBMS_LogicalChIdentity)mComponents[2];
    }
    
    public void setLogicalChIdentity(MBMS_LogicalChIdentity logicalChIdentity)
    {
	mComponents[2] = logicalChIdentity;
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
	    "MBMS_PTM_RBInformation_C"
	),
	new QName (
	    "InformationElements",
	    "MBMS-PTM-RBInformation-C"
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
				"MBMS_CommonRBIdentity"
			    ),
			    new QName (
				"InformationElements",
				"MBMS-CommonRBIdentity"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new MBMS_CommonRBIdentity(1), 
				    new MBMS_CommonRBIdentity(32),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(32)
			    ),
			    null
			)
		    ),
		    "rbInformation",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"MBMS_ShortTransmissionID"
			    ),
			    new QName (
				"InformationElements",
				"MBMS-ShortTransmissionID"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new MBMS_ShortTransmissionID(1), 
				    new MBMS_ShortTransmissionID(64),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(64)
			    ),
			    null
			)
		    ),
		    "shortTransmissionID",
		    1,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"MBMS_LogicalChIdentity"
			    ),
			    new QName (
				"InformationElements",
				"MBMS-LogicalChIdentity"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new MBMS_LogicalChIdentity(1), 
				    new MBMS_LogicalChIdentity(15),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(15)
			    ),
			    null
			)
		    ),
		    "logicalChIdentity",
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
			new TagDecoderElement((short)0x8000, 0)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8001, 1)
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
     * Get the type descriptor (TypeInfo) of 'this' MBMS_PTM_RBInformation_C object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' MBMS_PTM_RBInformation_C object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for MBMS_PTM_RBInformation_C
