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
 * Define the ASN1 Type SRNC_RelocationInfo_v3d0ext_IEs from ASN1 Module Internode_definitions.
 * @see Sequence
 */

public class SRNC_RelocationInfo_v3d0ext_IEs extends Sequence {
    
    /**
     * The default constructor.
     */
    public SRNC_RelocationInfo_v3d0ext_IEs()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public SRNC_RelocationInfo_v3d0ext_IEs(rrc.informationelements.UESpecificBehaviourInformation1idle uESpecificBehaviourInformation1idle, 
		    rrc.informationelements.UESpecificBehaviourInformation1interRAT uESpecificBehaviourInformation1interRAT)
    {
	setUESpecificBehaviourInformation1idle(uESpecificBehaviourInformation1idle);
	setUESpecificBehaviourInformation1interRAT(uESpecificBehaviourInformation1interRAT);
    }
    
    public void initComponents()
    {
	mComponents[0] = new rrc.informationelements.UESpecificBehaviourInformation1idle();
	mComponents[1] = new rrc.informationelements.UESpecificBehaviourInformation1interRAT();
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
		return new rrc.informationelements.UESpecificBehaviourInformation1idle();
	    case 1:
		return new rrc.informationelements.UESpecificBehaviourInformation1interRAT();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "uESpecificBehaviourInformation1idle"
    public rrc.informationelements.UESpecificBehaviourInformation1idle getUESpecificBehaviourInformation1idle()
    {
	return (rrc.informationelements.UESpecificBehaviourInformation1idle)mComponents[0];
    }
    
    public void setUESpecificBehaviourInformation1idle(rrc.informationelements.UESpecificBehaviourInformation1idle uESpecificBehaviourInformation1idle)
    {
	mComponents[0] = uESpecificBehaviourInformation1idle;
    }
    
    public boolean hasUESpecificBehaviourInformation1idle()
    {
	return componentIsPresent(0);
    }
    
    public void deleteUESpecificBehaviourInformation1idle()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "uESpecificBehaviourInformation1interRAT"
    public rrc.informationelements.UESpecificBehaviourInformation1interRAT getUESpecificBehaviourInformation1interRAT()
    {
	return (rrc.informationelements.UESpecificBehaviourInformation1interRAT)mComponents[1];
    }
    
    public void setUESpecificBehaviourInformation1interRAT(rrc.informationelements.UESpecificBehaviourInformation1interRAT uESpecificBehaviourInformation1interRAT)
    {
	mComponents[1] = uESpecificBehaviourInformation1interRAT;
    }
    
    public boolean hasUESpecificBehaviourInformation1interRAT()
    {
	return componentIsPresent(1);
    }
    
    public void deleteUESpecificBehaviourInformation1interRAT()
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
	    "SRNC_RelocationInfo_v3d0ext_IEs"
	),
	new QName (
	    "Internode-definitions",
	    "SRNC-RelocationInfo-v3d0ext-IEs"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"UESpecificBehaviourInformation1idle"
			    ),
			    new QName (
				"InformationElements",
				"UESpecificBehaviourInformation1idle"
			    ),
			    12314,
			    new SizeConstraint (
				new SingleValueConstraint (
				    new com.oss.asn1.INTEGER(4)
				)
			    ),
			    new Bounds (
				new java.lang.Long(4),
				new java.lang.Long(4)
			    ),
			    null
			)
		    ),
		    "uESpecificBehaviourInformation1idle",
		    0,
		    3,
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
				"UESpecificBehaviourInformation1interRAT"
			    ),
			    new QName (
				"InformationElements",
				"UESpecificBehaviourInformation1interRAT"
			    ),
			    12314,
			    new SizeConstraint (
				new SingleValueConstraint (
				    new com.oss.asn1.INTEGER(8)
				)
			    ),
			    new Bounds (
				new java.lang.Long(8),
				new java.lang.Long(8)
			    ),
			    null
			)
		    ),
		    "uESpecificBehaviourInformation1interRAT",
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
			new TagDecoderElement((short)0x8000, 0),
			new TagDecoderElement((short)0x8001, 1)
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
     * Get the type descriptor (TypeInfo) of 'this' SRNC_RelocationInfo_v3d0ext_IEs object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' SRNC_RelocationInfo_v3d0ext_IEs object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for SRNC_RelocationInfo_v3d0ext_IEs
