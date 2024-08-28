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
 * Define the ASN1 Type UE_MultiModeRAT_Capability from ASN1 Module InformationElements.
 * @see Sequence
 */

public class UE_MultiModeRAT_Capability extends Sequence {
    
    /**
     * The default constructor.
     */
    public UE_MultiModeRAT_Capability()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public UE_MultiModeRAT_Capability(MultiRAT_Capability multiRAT_CapabilityList, 
		    MultiModeCapability multiModeCapability)
    {
	setMultiRAT_CapabilityList(multiRAT_CapabilityList);
	setMultiModeCapability(multiModeCapability);
    }
    
    public void initComponents()
    {
	mComponents[0] = new MultiRAT_Capability();
	mComponents[1] = MultiModeCapability.tdd;
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
		return new MultiRAT_Capability();
	    case 1:
		return MultiModeCapability.tdd;
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "multiRAT_CapabilityList"
    public MultiRAT_Capability getMultiRAT_CapabilityList()
    {
	return (MultiRAT_Capability)mComponents[0];
    }
    
    public void setMultiRAT_CapabilityList(MultiRAT_Capability multiRAT_CapabilityList)
    {
	mComponents[0] = multiRAT_CapabilityList;
    }
    
    
    // Methods for field "multiModeCapability"
    public MultiModeCapability getMultiModeCapability()
    {
	return (MultiModeCapability)mComponents[1];
    }
    
    public void setMultiModeCapability(MultiModeCapability multiModeCapability)
    {
	mComponents[1] = multiModeCapability;
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
	    "UE_MultiModeRAT_Capability"
	),
	new QName (
	    "InformationElements",
	    "UE-MultiModeRAT-Capability"
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
				"MultiRAT_Capability"
			    ),
			    new QName (
				"InformationElements",
				"MultiRAT-Capability"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "MultiRAT_Capability"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "MultiRAT_Capability"
				)
			    ),
			    0
			)
		    ),
		    "multiRAT-CapabilityList",
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
				"MultiModeCapability"
			    ),
			    new QName (
				"InformationElements",
				"MultiModeCapability"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"tdd",
					0
				    ),
				    new MemberListElement (
					"fdd",
					1
				    ),
				    new MemberListElement (
					"fdd-tdd",
					2
				    )
				}
			    ),
			    0,
			    MultiModeCapability.tdd
			)
		    ),
		    "multiModeCapability",
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
     * Get the type descriptor (TypeInfo) of 'this' UE_MultiModeRAT_Capability object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UE_MultiModeRAT_Capability object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UE_MultiModeRAT_Capability
