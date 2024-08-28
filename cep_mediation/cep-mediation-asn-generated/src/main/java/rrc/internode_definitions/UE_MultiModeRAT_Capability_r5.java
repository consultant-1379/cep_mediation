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
 * Define the ASN1 Type UE_MultiModeRAT_Capability_r5 from ASN1 Module Internode_definitions.
 * @see Sequence
 */

public class UE_MultiModeRAT_Capability_r5 extends Sequence {
    
    /**
     * The default constructor.
     */
    public UE_MultiModeRAT_Capability_r5()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public UE_MultiModeRAT_Capability_r5(rrc.informationelements.MultiRAT_Capability multiRAT_CapabilityList, 
		    rrc.informationelements.MultiModeCapability multiModeCapability, 
		    BOOLEAN supportOfUTRAN_ToGERAN_NACC)
    {
	setMultiRAT_CapabilityList(multiRAT_CapabilityList);
	setMultiModeCapability(multiModeCapability);
	setSupportOfUTRAN_ToGERAN_NACC(supportOfUTRAN_ToGERAN_NACC);
    }
    
    /**
     * Construct with components.
     */
    public UE_MultiModeRAT_Capability_r5(rrc.informationelements.MultiRAT_Capability multiRAT_CapabilityList, 
		    rrc.informationelements.MultiModeCapability multiModeCapability, 
		    boolean supportOfUTRAN_ToGERAN_NACC)
    {
	this(multiRAT_CapabilityList, multiModeCapability, 
	     new BOOLEAN(supportOfUTRAN_ToGERAN_NACC));
    }
    
    public void initComponents()
    {
	mComponents[0] = new rrc.informationelements.MultiRAT_Capability();
	mComponents[1] = rrc.informationelements.MultiModeCapability.tdd;
	mComponents[2] = new BOOLEAN();
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
		return new rrc.informationelements.MultiRAT_Capability();
	    case 1:
		return rrc.informationelements.MultiModeCapability.tdd;
	    case 2:
		return new BOOLEAN();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "multiRAT_CapabilityList"
    public rrc.informationelements.MultiRAT_Capability getMultiRAT_CapabilityList()
    {
	return (rrc.informationelements.MultiRAT_Capability)mComponents[0];
    }
    
    public void setMultiRAT_CapabilityList(rrc.informationelements.MultiRAT_Capability multiRAT_CapabilityList)
    {
	mComponents[0] = multiRAT_CapabilityList;
    }
    
    
    // Methods for field "multiModeCapability"
    public rrc.informationelements.MultiModeCapability getMultiModeCapability()
    {
	return (rrc.informationelements.MultiModeCapability)mComponents[1];
    }
    
    public void setMultiModeCapability(rrc.informationelements.MultiModeCapability multiModeCapability)
    {
	mComponents[1] = multiModeCapability;
    }
    
    
    // Methods for field "supportOfUTRAN_ToGERAN_NACC"
    public boolean getSupportOfUTRAN_ToGERAN_NACC()
    {
	return ((BOOLEAN)mComponents[2]).booleanValue();
    }
    
    public void setSupportOfUTRAN_ToGERAN_NACC(boolean supportOfUTRAN_ToGERAN_NACC)
    {
	setSupportOfUTRAN_ToGERAN_NACC(new BOOLEAN(supportOfUTRAN_ToGERAN_NACC));
    }
    
    public void setSupportOfUTRAN_ToGERAN_NACC(BOOLEAN supportOfUTRAN_ToGERAN_NACC)
    {
	mComponents[2] = supportOfUTRAN_ToGERAN_NACC;
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
	    "UE_MultiModeRAT_Capability_r5"
	),
	new QName (
	    "Internode-definitions",
	    "UE-MultiModeRAT-Capability-r5"
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
			    rrc.informationelements.MultiModeCapability.tdd
			)
		    ),
		    "multiModeCapability",
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
		    "supportOfUTRAN-ToGERAN-NACC",
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
     * Get the type descriptor (TypeInfo) of 'this' UE_MultiModeRAT_Capability_r5 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UE_MultiModeRAT_Capability_r5 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UE_MultiModeRAT_Capability_r5
