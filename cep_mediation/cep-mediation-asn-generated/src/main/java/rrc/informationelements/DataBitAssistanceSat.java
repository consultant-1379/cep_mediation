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
 * Define the ASN1 Type DataBitAssistanceSat from ASN1 Module InformationElements.
 * @see Sequence
 */

public class DataBitAssistanceSat extends Sequence {
    
    /**
     * The default constructor.
     */
    public DataBitAssistanceSat()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public DataBitAssistanceSat(INTEGER satID, 
		    DataBitAssistanceSgnList dataBitAssistanceSgnList)
    {
	setSatID(satID);
	setDataBitAssistanceSgnList(dataBitAssistanceSgnList);
    }
    
    /**
     * Construct with components.
     */
    public DataBitAssistanceSat(long satID, 
		    DataBitAssistanceSgnList dataBitAssistanceSgnList)
    {
	this(new INTEGER(satID), dataBitAssistanceSgnList);
    }
    
    public void initComponents()
    {
	mComponents[0] = new INTEGER();
	mComponents[1] = new DataBitAssistanceSgnList();
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
		return new INTEGER();
	    case 1:
		return new DataBitAssistanceSgnList();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "satID"
    public long getSatID()
    {
	return ((INTEGER)mComponents[0]).longValue();
    }
    
    public void setSatID(long satID)
    {
	setSatID(new INTEGER(satID));
    }
    
    public void setSatID(INTEGER satID)
    {
	mComponents[0] = satID;
    }
    
    
    // Methods for field "dataBitAssistanceSgnList"
    public DataBitAssistanceSgnList getDataBitAssistanceSgnList()
    {
	return (DataBitAssistanceSgnList)mComponents[1];
    }
    
    public void setDataBitAssistanceSgnList(DataBitAssistanceSgnList dataBitAssistanceSgnList)
    {
	mComponents[1] = dataBitAssistanceSgnList;
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
	    "DataBitAssistanceSat"
	),
	new QName (
	    "InformationElements",
	    "DataBitAssistanceSat"
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
				"com.oss.asn1",
				"INTEGER"
			    ),
			    new QName (
				"builtin",
				"INTEGER"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new com.oss.asn1.INTEGER(0), 
				    new com.oss.asn1.INTEGER(63),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(63)
			    ),
			    null
			)
		    ),
		    "satID",
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
				"DataBitAssistanceSgnList"
			    ),
			    new QName (
				"InformationElements",
				"DataBitAssistanceSgnList"
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
				    "DataBitAssistance"
				)
			    )
			)
		    ),
		    "dataBitAssistanceSgnList",
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
     * Get the type descriptor (TypeInfo) of 'this' DataBitAssistanceSat object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' DataBitAssistanceSat object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for DataBitAssistanceSat
