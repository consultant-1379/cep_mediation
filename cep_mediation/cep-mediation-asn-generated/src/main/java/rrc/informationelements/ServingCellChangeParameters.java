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
 * Define the ASN1 Type ServingCellChangeParameters from ASN1 Module InformationElements.
 * @see Sequence
 */

public class ServingCellChangeParameters extends Sequence {
    
    /**
     * The default constructor.
     */
    public ServingCellChangeParameters()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public ServingCellChangeParameters(ServingCellChangeMACreset servingCellChangeMACreset, 
		    ServingCellChangeMsgType servingCellChangeMsgType, 
		    ServingCellChangeTrId servingCellChangeTrId)
    {
	setServingCellChangeMACreset(servingCellChangeMACreset);
	setServingCellChangeMsgType(servingCellChangeMsgType);
	setServingCellChangeTrId(servingCellChangeTrId);
    }
    
    public void initComponents()
    {
	mComponents[0] = new ServingCellChangeMACreset();
	mComponents[1] = ServingCellChangeMsgType.radioBearerSetup;
	mComponents[2] = new ServingCellChangeTrId();
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
		return new ServingCellChangeMACreset();
	    case 1:
		return ServingCellChangeMsgType.radioBearerSetup;
	    case 2:
		return new ServingCellChangeTrId();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "servingCellChangeMACreset"
    public ServingCellChangeMACreset getServingCellChangeMACreset()
    {
	return (ServingCellChangeMACreset)mComponents[0];
    }
    
    public void setServingCellChangeMACreset(ServingCellChangeMACreset servingCellChangeMACreset)
    {
	mComponents[0] = servingCellChangeMACreset;
    }
    
    
    // Methods for field "servingCellChangeMsgType"
    public ServingCellChangeMsgType getServingCellChangeMsgType()
    {
	return (ServingCellChangeMsgType)mComponents[1];
    }
    
    public void setServingCellChangeMsgType(ServingCellChangeMsgType servingCellChangeMsgType)
    {
	mComponents[1] = servingCellChangeMsgType;
    }
    
    
    // Methods for field "servingCellChangeTrId"
    public ServingCellChangeTrId getServingCellChangeTrId()
    {
	return (ServingCellChangeTrId)mComponents[2];
    }
    
    public void setServingCellChangeTrId(ServingCellChangeTrId servingCellChangeTrId)
    {
	mComponents[2] = servingCellChangeTrId;
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
	    "ServingCellChangeParameters"
	),
	new QName (
	    "InformationElements",
	    "ServingCellChangeParameters"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"ServingCellChangeMACreset"
			    ),
			    new QName (
				"InformationElements",
				"ServingCellChangeMACreset"
			    ),
			    12314,
			    null
			)
		    ),
		    "servingCellChangeMACreset",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"ServingCellChangeMsgType"
			    ),
			    new QName (
				"InformationElements",
				"ServingCellChangeMsgType"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"radioBearerSetup",
					0
				    ),
				    new MemberListElement (
					"radioBearerReconfiguration",
					1
				    ),
				    new MemberListElement (
					"transportChannelReconfiguration",
					2
				    ),
				    new MemberListElement (
					"physicalChannelReconfiguration",
					3
				    )
				}
			    ),
			    0,
			    ServingCellChangeMsgType.radioBearerSetup
			)
		    ),
		    "servingCellChangeMsgType",
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
				"ServingCellChangeTrId"
			    ),
			    new QName (
				"InformationElements",
				"ServingCellChangeTrId"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new ServingCellChangeTrId(0), 
				    new ServingCellChangeTrId(3),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(3)
			    ),
			    null
			)
		    ),
		    "servingCellChangeTrId",
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
     * Get the type descriptor (TypeInfo) of 'this' ServingCellChangeParameters object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' ServingCellChangeParameters object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for ServingCellChangeParameters
