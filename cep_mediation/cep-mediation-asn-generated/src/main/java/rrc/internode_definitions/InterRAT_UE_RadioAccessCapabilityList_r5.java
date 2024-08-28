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
 * Define the ASN1 Type InterRAT_UE_RadioAccessCapabilityList_r5 from ASN1 Module Internode_definitions.
 * @see Sequence
 */

public class InterRAT_UE_RadioAccessCapabilityList_r5 extends Sequence {
    
    /**
     * The default constructor.
     */
    public InterRAT_UE_RadioAccessCapabilityList_r5()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public InterRAT_UE_RadioAccessCapabilityList_r5(rrc.informationelements.InterRAT_UE_RadioAccessCapabilityList interRAT_UE_RadioAccessCapability, 
		    rrc.informationelements.GERANIu_RadioAccessCapability geranIu_RadioAccessCapability)
    {
	setInterRAT_UE_RadioAccessCapability(interRAT_UE_RadioAccessCapability);
	setGeranIu_RadioAccessCapability(geranIu_RadioAccessCapability);
    }
    
    /**
     * Construct with required components.
     */
    public InterRAT_UE_RadioAccessCapabilityList_r5(rrc.informationelements.InterRAT_UE_RadioAccessCapabilityList interRAT_UE_RadioAccessCapability)
    {
	setInterRAT_UE_RadioAccessCapability(interRAT_UE_RadioAccessCapability);
    }
    
    public void initComponents()
    {
	mComponents[0] = new rrc.informationelements.InterRAT_UE_RadioAccessCapabilityList();
	mComponents[1] = new rrc.informationelements.GERANIu_RadioAccessCapability();
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
		return new rrc.informationelements.InterRAT_UE_RadioAccessCapabilityList();
	    case 1:
		return new rrc.informationelements.GERANIu_RadioAccessCapability();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "interRAT_UE_RadioAccessCapability"
    public rrc.informationelements.InterRAT_UE_RadioAccessCapabilityList getInterRAT_UE_RadioAccessCapability()
    {
	return (rrc.informationelements.InterRAT_UE_RadioAccessCapabilityList)mComponents[0];
    }
    
    public void setInterRAT_UE_RadioAccessCapability(rrc.informationelements.InterRAT_UE_RadioAccessCapabilityList interRAT_UE_RadioAccessCapability)
    {
	mComponents[0] = interRAT_UE_RadioAccessCapability;
    }
    
    
    // Methods for field "geranIu_RadioAccessCapability"
    public rrc.informationelements.GERANIu_RadioAccessCapability getGeranIu_RadioAccessCapability()
    {
	return (rrc.informationelements.GERANIu_RadioAccessCapability)mComponents[1];
    }
    
    public void setGeranIu_RadioAccessCapability(rrc.informationelements.GERANIu_RadioAccessCapability geranIu_RadioAccessCapability)
    {
	mComponents[1] = geranIu_RadioAccessCapability;
    }
    
    public boolean hasGeranIu_RadioAccessCapability()
    {
	return componentIsPresent(1);
    }
    
    public void deleteGeranIu_RadioAccessCapability()
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
	    "InterRAT_UE_RadioAccessCapabilityList_r5"
	),
	new QName (
	    "Internode-definitions",
	    "InterRAT-UE-RadioAccessCapabilityList-r5"
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
				"rrc.informationelements",
				"InterRAT_UE_RadioAccessCapabilityList"
			    ),
			    new QName (
				"InformationElements",
				"InterRAT-UE-RadioAccessCapabilityList"
			    ),
			    12314,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new com.oss.asn1.INTEGER(1), 
					new com.oss.asn1.INTEGER(4),
					0
				    )
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(4)
			    ),
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "InterRAT_UE_RadioAccessCapability"
				)
			    )
			)
		    ),
		    "interRAT-UE-RadioAccessCapability",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"GERANIu_RadioAccessCapability"
			    ),
			    new QName (
				"InformationElements",
				"GERANIu-RadioAccessCapability"
			    ),
			    12314,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new com.oss.asn1.INTEGER(1), 
					new com.oss.asn1.INTEGER(170),
					0
				    )
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(170)
			    ),
			    null
			)
		    ),
		    "geranIu-RadioAccessCapability",
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
     * Get the type descriptor (TypeInfo) of 'this' InterRAT_UE_RadioAccessCapabilityList_r5 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' InterRAT_UE_RadioAccessCapabilityList_r5 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for InterRAT_UE_RadioAccessCapabilityList_r5
