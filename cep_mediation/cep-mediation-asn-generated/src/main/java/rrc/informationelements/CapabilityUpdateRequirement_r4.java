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
 * Define the ASN1 Type CapabilityUpdateRequirement_r4 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class CapabilityUpdateRequirement_r4 extends Sequence {
    
    /**
     * The default constructor.
     */
    public CapabilityUpdateRequirement_r4()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public CapabilityUpdateRequirement_r4(BOOLEAN ue_RadioCapabilityFDDUpdateRequirement_FDD, 
		    BOOLEAN ue_RadioCapabilityTDDUpdateRequirement_TDD384, 
		    BOOLEAN ue_RadioCapabilityTDDUpdateRequirement_TDD128, 
		    SystemSpecificCapUpdateReqList systemSpecificCapUpdateReqList)
    {
	setUe_RadioCapabilityFDDUpdateRequirement_FDD(ue_RadioCapabilityFDDUpdateRequirement_FDD);
	setUe_RadioCapabilityTDDUpdateRequirement_TDD384(ue_RadioCapabilityTDDUpdateRequirement_TDD384);
	setUe_RadioCapabilityTDDUpdateRequirement_TDD128(ue_RadioCapabilityTDDUpdateRequirement_TDD128);
	setSystemSpecificCapUpdateReqList(systemSpecificCapUpdateReqList);
    }
    
    /**
     * Construct with components.
     */
    public CapabilityUpdateRequirement_r4(boolean ue_RadioCapabilityFDDUpdateRequirement_FDD, 
		    boolean ue_RadioCapabilityTDDUpdateRequirement_TDD384, 
		    boolean ue_RadioCapabilityTDDUpdateRequirement_TDD128, 
		    SystemSpecificCapUpdateReqList systemSpecificCapUpdateReqList)
    {
	this(new BOOLEAN(ue_RadioCapabilityFDDUpdateRequirement_FDD), 
	     new BOOLEAN(ue_RadioCapabilityTDDUpdateRequirement_TDD384), 
	     new BOOLEAN(ue_RadioCapabilityTDDUpdateRequirement_TDD128), 
	     systemSpecificCapUpdateReqList);
    }
    
    /**
     * Construct with required components.
     */
    public CapabilityUpdateRequirement_r4(boolean ue_RadioCapabilityFDDUpdateRequirement_FDD, 
		    boolean ue_RadioCapabilityTDDUpdateRequirement_TDD384, 
		    boolean ue_RadioCapabilityTDDUpdateRequirement_TDD128)
    {
	setUe_RadioCapabilityFDDUpdateRequirement_FDD(ue_RadioCapabilityFDDUpdateRequirement_FDD);
	setUe_RadioCapabilityTDDUpdateRequirement_TDD384(ue_RadioCapabilityTDDUpdateRequirement_TDD384);
	setUe_RadioCapabilityTDDUpdateRequirement_TDD128(ue_RadioCapabilityTDDUpdateRequirement_TDD128);
    }
    
    public void initComponents()
    {
	mComponents[0] = new BOOLEAN();
	mComponents[1] = new BOOLEAN();
	mComponents[2] = new BOOLEAN();
	mComponents[3] = new SystemSpecificCapUpdateReqList();
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
		return new BOOLEAN();
	    case 1:
		return new BOOLEAN();
	    case 2:
		return new BOOLEAN();
	    case 3:
		return new SystemSpecificCapUpdateReqList();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "ue_RadioCapabilityFDDUpdateRequirement_FDD"
    public boolean getUe_RadioCapabilityFDDUpdateRequirement_FDD()
    {
	return ((BOOLEAN)mComponents[0]).booleanValue();
    }
    
    public void setUe_RadioCapabilityFDDUpdateRequirement_FDD(boolean ue_RadioCapabilityFDDUpdateRequirement_FDD)
    {
	setUe_RadioCapabilityFDDUpdateRequirement_FDD(new BOOLEAN(ue_RadioCapabilityFDDUpdateRequirement_FDD));
    }
    
    public void setUe_RadioCapabilityFDDUpdateRequirement_FDD(BOOLEAN ue_RadioCapabilityFDDUpdateRequirement_FDD)
    {
	mComponents[0] = ue_RadioCapabilityFDDUpdateRequirement_FDD;
    }
    
    
    // Methods for field "ue_RadioCapabilityTDDUpdateRequirement_TDD384"
    public boolean getUe_RadioCapabilityTDDUpdateRequirement_TDD384()
    {
	return ((BOOLEAN)mComponents[1]).booleanValue();
    }
    
    public void setUe_RadioCapabilityTDDUpdateRequirement_TDD384(boolean ue_RadioCapabilityTDDUpdateRequirement_TDD384)
    {
	setUe_RadioCapabilityTDDUpdateRequirement_TDD384(new BOOLEAN(ue_RadioCapabilityTDDUpdateRequirement_TDD384));
    }
    
    public void setUe_RadioCapabilityTDDUpdateRequirement_TDD384(BOOLEAN ue_RadioCapabilityTDDUpdateRequirement_TDD384)
    {
	mComponents[1] = ue_RadioCapabilityTDDUpdateRequirement_TDD384;
    }
    
    
    // Methods for field "ue_RadioCapabilityTDDUpdateRequirement_TDD128"
    public boolean getUe_RadioCapabilityTDDUpdateRequirement_TDD128()
    {
	return ((BOOLEAN)mComponents[2]).booleanValue();
    }
    
    public void setUe_RadioCapabilityTDDUpdateRequirement_TDD128(boolean ue_RadioCapabilityTDDUpdateRequirement_TDD128)
    {
	setUe_RadioCapabilityTDDUpdateRequirement_TDD128(new BOOLEAN(ue_RadioCapabilityTDDUpdateRequirement_TDD128));
    }
    
    public void setUe_RadioCapabilityTDDUpdateRequirement_TDD128(BOOLEAN ue_RadioCapabilityTDDUpdateRequirement_TDD128)
    {
	mComponents[2] = ue_RadioCapabilityTDDUpdateRequirement_TDD128;
    }
    
    
    // Methods for field "systemSpecificCapUpdateReqList"
    public SystemSpecificCapUpdateReqList getSystemSpecificCapUpdateReqList()
    {
	return (SystemSpecificCapUpdateReqList)mComponents[3];
    }
    
    public void setSystemSpecificCapUpdateReqList(SystemSpecificCapUpdateReqList systemSpecificCapUpdateReqList)
    {
	mComponents[3] = systemSpecificCapUpdateReqList;
    }
    
    public boolean hasSystemSpecificCapUpdateReqList()
    {
	return componentIsPresent(3);
    }
    
    public void deleteSystemSpecificCapUpdateReqList()
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
	    "CapabilityUpdateRequirement_r4"
	),
	new QName (
	    "InformationElements",
	    "CapabilityUpdateRequirement-r4"
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
				"com.oss.asn1",
				"BOOLEAN"
			    ),
			    new QName (
				"builtin",
				"BOOLEAN"
			    ),
			    12314,
			    null
			)
		    ),
		    "ue-RadioCapabilityFDDUpdateRequirement-FDD",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"BOOLEAN"
			    ),
			    new QName (
				"builtin",
				"BOOLEAN"
			    ),
			    12314,
			    null
			)
		    ),
		    "ue-RadioCapabilityTDDUpdateRequirement-TDD384",
		    1,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"BOOLEAN"
			    ),
			    new QName (
				"builtin",
				"BOOLEAN"
			    ),
			    12314,
			    null
			)
		    ),
		    "ue-RadioCapabilityTDDUpdateRequirement-TDD128",
		    2,
		    2,
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
				"SystemSpecificCapUpdateReqList"
			    ),
			    new QName (
				"InformationElements",
				"SystemSpecificCapUpdateReqList"
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
				    "SystemSpecificCapUpdateReq"
				)
			    )
			)
		    ),
		    "systemSpecificCapUpdateReqList",
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
			new TagDecoderElement((short)0x8001, 1)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8002, 2)
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
     * Get the type descriptor (TypeInfo) of 'this' CapabilityUpdateRequirement_r4 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' CapabilityUpdateRequirement_r4 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for CapabilityUpdateRequirement_r4
