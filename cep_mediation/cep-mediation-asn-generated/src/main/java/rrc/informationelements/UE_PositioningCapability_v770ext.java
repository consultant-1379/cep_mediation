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
 * Define the ASN1 Type UE_PositioningCapability_v770ext from ASN1 Module InformationElements.
 * @see Sequence
 */

public class UE_PositioningCapability_v770ext extends Sequence {
    
    /**
     * The default constructor.
     */
    public UE_PositioningCapability_v770ext()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public UE_PositioningCapability_v770ext(UE_GANSSPositioning_Capability ue_GANSSPositioning_Capability)
    {
	setUe_GANSSPositioning_Capability(ue_GANSSPositioning_Capability);
    }
    
    public void initComponents()
    {
	mComponents[0] = new UE_GANSSPositioning_Capability();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[1];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new UE_GANSSPositioning_Capability();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "ue_GANSSPositioning_Capability"
    public UE_GANSSPositioning_Capability getUe_GANSSPositioning_Capability()
    {
	return (UE_GANSSPositioning_Capability)mComponents[0];
    }
    
    public void setUe_GANSSPositioning_Capability(UE_GANSSPositioning_Capability ue_GANSSPositioning_Capability)
    {
	mComponents[0] = ue_GANSSPositioning_Capability;
    }
    
    public boolean hasUe_GANSSPositioning_Capability()
    {
	return componentIsPresent(0);
    }
    
    public void deleteUe_GANSSPositioning_Capability()
    {
	setComponentAbsent(0);
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
	    "UE_PositioningCapability_v770ext"
	),
	new QName (
	    "InformationElements",
	    "UE-PositioningCapability-v770ext"
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
				"UE_GANSSPositioning_Capability"
			    ),
			    new QName (
				"InformationElements",
				"UE-GANSSPositioning-Capability"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UE_GANSSPositioning_Capability"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "UE_GANSSPositioning_Capability"
				)
			    ),
			    0
			)
		    ),
		    "ue-GANSSPositioning-Capability",
		    0,
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
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' UE_PositioningCapability_v770ext object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UE_PositioningCapability_v770ext object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UE_PositioningCapability_v770ext
