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


package rrc.internode_definitions;

import com.oss.asn1.*;
import com.oss.metadata.*;
import rrc.*;

/**
 * Define the ASN1 Type StoredCompressedModeInfo_r8 from ASN1 Module Internode_definitions.
 * @see Sequence
 */

public class StoredCompressedModeInfo_r8 extends Sequence {
    
    /**
     * The default constructor.
     */
    public StoredCompressedModeInfo_r8()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public StoredCompressedModeInfo_r8(StoredTGP_SequenceList_r8 storedTGP_SequenceList, 
		    CodeChangeStatusList codeChangeStatusList)
    {
	setStoredTGP_SequenceList(storedTGP_SequenceList);
	setCodeChangeStatusList(codeChangeStatusList);
    }
    
    /**
     * Construct with required components.
     */
    public StoredCompressedModeInfo_r8(StoredTGP_SequenceList_r8 storedTGP_SequenceList)
    {
	setStoredTGP_SequenceList(storedTGP_SequenceList);
    }
    
    public void initComponents()
    {
	mComponents[0] = new StoredTGP_SequenceList_r8();
	mComponents[1] = new CodeChangeStatusList();
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
		return new StoredTGP_SequenceList_r8();
	    case 1:
		return new CodeChangeStatusList();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "storedTGP_SequenceList"
    public StoredTGP_SequenceList_r8 getStoredTGP_SequenceList()
    {
	return (StoredTGP_SequenceList_r8)mComponents[0];
    }
    
    public void setStoredTGP_SequenceList(StoredTGP_SequenceList_r8 storedTGP_SequenceList)
    {
	mComponents[0] = storedTGP_SequenceList;
    }
    
    
    // Methods for field "codeChangeStatusList"
    public CodeChangeStatusList getCodeChangeStatusList()
    {
	return (CodeChangeStatusList)mComponents[1];
    }
    
    public void setCodeChangeStatusList(CodeChangeStatusList codeChangeStatusList)
    {
	mComponents[1] = codeChangeStatusList;
    }
    
    public boolean hasCodeChangeStatusList()
    {
	return componentIsPresent(1);
    }
    
    public void deleteCodeChangeStatusList()
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
	    "rrc.internode_definitions",
	    "StoredCompressedModeInfo_r8"
	),
	new QName (
	    "Internode-definitions",
	    "StoredCompressedModeInfo-r8"
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
				"rrc.internode_definitions",
				"StoredTGP_SequenceList_r8"
			    ),
			    new QName (
				"Internode-definitions",
				"StoredTGP-SequenceList-r8"
			    ),
			    12314,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new com.oss.asn1.INTEGER(1), 
					new com.oss.asn1.INTEGER(6),
					0
				    )
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(6)
			    ),
			    new TypeInfoRef (
				new QName (
				    "rrc.internode_definitions",
				    "StoredTGP_Sequence_r8"
				)
			    )
			)
		    ),
		    "storedTGP-SequenceList",
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
				"rrc.internode_definitions",
				"CodeChangeStatusList"
			    ),
			    new QName (
				"Internode-definitions",
				"CodeChangeStatusList"
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
				    "rrc.internode_definitions",
				    "CodeChangeStatus"
				)
			    )
			)
		    ),
		    "codeChangeStatusList",
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
     * Get the type descriptor (TypeInfo) of 'this' StoredCompressedModeInfo_r8 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' StoredCompressedModeInfo_r8 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for StoredCompressedModeInfo_r8
