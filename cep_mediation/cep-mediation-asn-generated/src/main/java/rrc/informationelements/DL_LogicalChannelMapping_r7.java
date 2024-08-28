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
 * Define the ASN1 Type DL_LogicalChannelMapping_r7 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class DL_LogicalChannelMapping_r7 extends Sequence {
    
    /**
     * The default constructor.
     */
    public DL_LogicalChannelMapping_r7()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public DL_LogicalChannelMapping_r7(DL_TransportChannelType_r7 dl_TransportChannelType, 
		    LogicalChannelIdentity logicalChannelIdentity)
    {
	setDl_TransportChannelType(dl_TransportChannelType);
	setLogicalChannelIdentity(logicalChannelIdentity);
    }
    
    /**
     * Construct with required components.
     */
    public DL_LogicalChannelMapping_r7(DL_TransportChannelType_r7 dl_TransportChannelType)
    {
	setDl_TransportChannelType(dl_TransportChannelType);
    }
    
    public void initComponents()
    {
	mComponents[0] = new DL_TransportChannelType_r7();
	mComponents[1] = new LogicalChannelIdentity();
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
		return new DL_TransportChannelType_r7();
	    case 1:
		return new LogicalChannelIdentity();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "dl_TransportChannelType"
    public DL_TransportChannelType_r7 getDl_TransportChannelType()
    {
	return (DL_TransportChannelType_r7)mComponents[0];
    }
    
    public void setDl_TransportChannelType(DL_TransportChannelType_r7 dl_TransportChannelType)
    {
	mComponents[0] = dl_TransportChannelType;
    }
    
    
    // Methods for field "logicalChannelIdentity"
    public LogicalChannelIdentity getLogicalChannelIdentity()
    {
	return (LogicalChannelIdentity)mComponents[1];
    }
    
    public void setLogicalChannelIdentity(LogicalChannelIdentity logicalChannelIdentity)
    {
	mComponents[1] = logicalChannelIdentity;
    }
    
    public boolean hasLogicalChannelIdentity()
    {
	return componentIsPresent(1);
    }
    
    public void deleteLogicalChannelIdentity()
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
	    "rrc.informationelements",
	    "DL_LogicalChannelMapping_r7"
	),
	new QName (
	    "InformationElements",
	    "DL-LogicalChannelMapping-r7"
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
				"DL_TransportChannelType_r7"
			    ),
			    new QName (
				"InformationElements",
				"DL-TransportChannelType-r7"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "DL_TransportChannelType_r7"
				)
			    ),
			    0,
			    new TagDecoder (
				new TagDecoderElement[] {
				    new TagDecoderElement((short)0x8000, 0),
				    new TagDecoderElement((short)0x8001, 1),
				    new TagDecoderElement((short)0x8002, 2),
				    new TagDecoderElement((short)0x8003, 3),
				    new TagDecoderElement((short)0x8004, 4),
				    new TagDecoderElement((short)0x8005, 5)
				}
			    )
			)
		    ),
		    "dl-TransportChannelType",
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
				"LogicalChannelIdentity"
			    ),
			    new QName (
				"InformationElements",
				"LogicalChannelIdentity"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new LogicalChannelIdentity(1), 
				    new LogicalChannelIdentity(15),
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
		    "logicalChannelIdentity",
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
			new TagDecoderElement((short)0x8000, 0)
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
     * Get the type descriptor (TypeInfo) of 'this' DL_LogicalChannelMapping_r7 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' DL_LogicalChannelMapping_r7 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for DL_LogicalChannelMapping_r7
