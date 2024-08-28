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
 * Define the ASN1 Type SysInfoType15bis_v860ext_IEs from ASN1 Module InformationElements.
 * @see Sequence
 */

public class SysInfoType15bis_v860ext_IEs extends Sequence {
    
    /**
     * The default constructor.
     */
    public SysInfoType15bis_v860ext_IEs()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public SysInfoType15bis_v860ext_IEs(UE_Positioning_GANSS_AddIonoModel ue_Positioning_GANSS_AddIonoModel, 
		    UE_Positioning_GANSS_EarthOrientPara ue_Positioning_GANSS_EarthOrientationPara)
    {
	setUe_Positioning_GANSS_AddIonoModel(ue_Positioning_GANSS_AddIonoModel);
	setUe_Positioning_GANSS_EarthOrientationPara(ue_Positioning_GANSS_EarthOrientationPara);
    }
    
    public void initComponents()
    {
	mComponents[0] = new UE_Positioning_GANSS_AddIonoModel();
	mComponents[1] = new UE_Positioning_GANSS_EarthOrientPara();
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
		return new UE_Positioning_GANSS_AddIonoModel();
	    case 1:
		return new UE_Positioning_GANSS_EarthOrientPara();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "ue_Positioning_GANSS_AddIonoModel"
    public UE_Positioning_GANSS_AddIonoModel getUe_Positioning_GANSS_AddIonoModel()
    {
	return (UE_Positioning_GANSS_AddIonoModel)mComponents[0];
    }
    
    public void setUe_Positioning_GANSS_AddIonoModel(UE_Positioning_GANSS_AddIonoModel ue_Positioning_GANSS_AddIonoModel)
    {
	mComponents[0] = ue_Positioning_GANSS_AddIonoModel;
    }
    
    public boolean hasUe_Positioning_GANSS_AddIonoModel()
    {
	return componentIsPresent(0);
    }
    
    public void deleteUe_Positioning_GANSS_AddIonoModel()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "ue_Positioning_GANSS_EarthOrientationPara"
    public UE_Positioning_GANSS_EarthOrientPara getUe_Positioning_GANSS_EarthOrientationPara()
    {
	return (UE_Positioning_GANSS_EarthOrientPara)mComponents[1];
    }
    
    public void setUe_Positioning_GANSS_EarthOrientationPara(UE_Positioning_GANSS_EarthOrientPara ue_Positioning_GANSS_EarthOrientationPara)
    {
	mComponents[1] = ue_Positioning_GANSS_EarthOrientationPara;
    }
    
    public boolean hasUe_Positioning_GANSS_EarthOrientationPara()
    {
	return componentIsPresent(1);
    }
    
    public void deleteUe_Positioning_GANSS_EarthOrientationPara()
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
	    "rrc.informationelements",
	    "SysInfoType15bis_v860ext_IEs"
	),
	new QName (
	    "InformationElements",
	    "SysInfoType15bis-v860ext-IEs"
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
				"UE_Positioning_GANSS_AddIonoModel"
			    ),
			    new QName (
				"InformationElements",
				"UE-Positioning-GANSS-AddIonoModel"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_GANSS_AddIonoModel"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_GANSS_AddIonoModel"
				)
			    ),
			    0
			)
		    ),
		    "ue-Positioning-GANSS-AddIonoModel",
		    0,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"UE_Positioning_GANSS_EarthOrientPara"
			    ),
			    new QName (
				"InformationElements",
				"UE-Positioning-GANSS-EarthOrientPara"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_GANSS_EarthOrientPara"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_GANSS_EarthOrientPara"
				)
			    ),
			    0
			)
		    ),
		    "ue-Positioning-GANSS-EarthOrientationPara",
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
     * Get the type descriptor (TypeInfo) of 'this' SysInfoType15bis_v860ext_IEs object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' SysInfoType15bis_v860ext_IEs object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for SysInfoType15bis_v860ext_IEs
