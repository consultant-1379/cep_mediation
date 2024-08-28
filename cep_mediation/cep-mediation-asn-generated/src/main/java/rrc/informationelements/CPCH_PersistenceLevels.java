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
 * Define the ASN1 Type CPCH_PersistenceLevels from ASN1 Module InformationElements.
 * @see Sequence
 */

public class CPCH_PersistenceLevels extends Sequence {
    
    /**
     * The default constructor.
     */
    public CPCH_PersistenceLevels()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public CPCH_PersistenceLevels(CPCH_SetID cpch_SetID, 
		    DynamicPersistenceLevelTF_List dynamicPersistenceLevelTF_List)
    {
	setCpch_SetID(cpch_SetID);
	setDynamicPersistenceLevelTF_List(dynamicPersistenceLevelTF_List);
    }
    
    public void initComponents()
    {
	mComponents[0] = new CPCH_SetID();
	mComponents[1] = new DynamicPersistenceLevelTF_List();
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
		return new CPCH_SetID();
	    case 1:
		return new DynamicPersistenceLevelTF_List();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "cpch_SetID"
    public CPCH_SetID getCpch_SetID()
    {
	return (CPCH_SetID)mComponents[0];
    }
    
    public void setCpch_SetID(CPCH_SetID cpch_SetID)
    {
	mComponents[0] = cpch_SetID;
    }
    
    
    // Methods for field "dynamicPersistenceLevelTF_List"
    public DynamicPersistenceLevelTF_List getDynamicPersistenceLevelTF_List()
    {
	return (DynamicPersistenceLevelTF_List)mComponents[1];
    }
    
    public void setDynamicPersistenceLevelTF_List(DynamicPersistenceLevelTF_List dynamicPersistenceLevelTF_List)
    {
	mComponents[1] = dynamicPersistenceLevelTF_List;
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
	    "CPCH_PersistenceLevels"
	),
	new QName (
	    "InformationElements",
	    "CPCH-PersistenceLevels"
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
				"CPCH_SetID"
			    ),
			    new QName (
				"InformationElements",
				"CPCH-SetID"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new CPCH_SetID(1), 
				    new CPCH_SetID(16),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(16)
			    ),
			    null
			)
		    ),
		    "cpch-SetID",
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
				"DynamicPersistenceLevelTF_List"
			    ),
			    new QName (
				"InformationElements",
				"DynamicPersistenceLevelTF-List"
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
				    "DynamicPersistenceLevel"
				)
			    )
			)
		    ),
		    "dynamicPersistenceLevelTF-List",
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
     * Get the type descriptor (TypeInfo) of 'this' CPCH_PersistenceLevels object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' CPCH_PersistenceLevels object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for CPCH_PersistenceLevels
