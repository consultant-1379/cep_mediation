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
 * Define the ASN1 Type GANSSGenericData_v920ext from ASN1 Module InformationElements.
 * @see Sequence
 */

public class GANSSGenericData_v920ext extends Sequence {
    
    /**
     * The default constructor.
     */
    public GANSSGenericData_v920ext()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public GANSSGenericData_v920ext(UE_Positioning_DGANSSCorrections_v920ext uePositioningDGANSSCorrections)
    {
	setUePositioningDGANSSCorrections(uePositioningDGANSSCorrections);
    }
    
    public void initComponents()
    {
	mComponents[0] = new UE_Positioning_DGANSSCorrections_v920ext();
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
		return new UE_Positioning_DGANSSCorrections_v920ext();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "uePositioningDGANSSCorrections"
    public UE_Positioning_DGANSSCorrections_v920ext getUePositioningDGANSSCorrections()
    {
	return (UE_Positioning_DGANSSCorrections_v920ext)mComponents[0];
    }
    
    public void setUePositioningDGANSSCorrections(UE_Positioning_DGANSSCorrections_v920ext uePositioningDGANSSCorrections)
    {
	mComponents[0] = uePositioningDGANSSCorrections;
    }
    
    public boolean hasUePositioningDGANSSCorrections()
    {
	return componentIsPresent(0);
    }
    
    public void deleteUePositioningDGANSSCorrections()
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
	    "GANSSGenericData_v920ext"
	),
	new QName (
	    "InformationElements",
	    "GANSSGenericData-v920ext"
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
				"UE_Positioning_DGANSSCorrections_v920ext"
			    ),
			    new QName (
				"InformationElements",
				"UE-Positioning-DGANSSCorrections-v920ext"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_DGANSSCorrections_v920ext"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_DGANSSCorrections_v920ext"
				)
			    ),
			    0
			)
		    ),
		    "uePositioningDGANSSCorrections",
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
     * Get the type descriptor (TypeInfo) of 'this' GANSSGenericData_v920ext object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' GANSSGenericData_v920ext object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for GANSSGenericData_v920ext
