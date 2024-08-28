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
 * Define the ASN1 Type SysInfoType15_3bis_v860ext_IEs from ASN1 Module InformationElements.
 * @see Sequence
 */

public class SysInfoType15_3bis_v860ext_IEs extends Sequence {
    
    /**
     * The default constructor.
     */
    public SysInfoType15_3bis_v860ext_IEs()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public SysInfoType15_3bis_v860ext_IEs(UE_Positioning_GANSS_Almanac_v860ext ue_Positioning_GANSS_Almanac, 
		    UE_Positioning_GANSS_AddUTCModels ue_Positioning_GANSS_AddUTCModels, 
		    UE_Positioning_GANSS_AuxiliaryInfo ue_Positioning_GANSS_AuxiliaryInfo)
    {
	setUe_Positioning_GANSS_Almanac(ue_Positioning_GANSS_Almanac);
	setUe_Positioning_GANSS_AddUTCModels(ue_Positioning_GANSS_AddUTCModels);
	setUe_Positioning_GANSS_AuxiliaryInfo(ue_Positioning_GANSS_AuxiliaryInfo);
    }
    
    public void initComponents()
    {
	mComponents[0] = new UE_Positioning_GANSS_Almanac_v860ext();
	mComponents[1] = new UE_Positioning_GANSS_AddUTCModels();
	mComponents[2] = new UE_Positioning_GANSS_AuxiliaryInfo();
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
		return new UE_Positioning_GANSS_Almanac_v860ext();
	    case 1:
		return new UE_Positioning_GANSS_AddUTCModels();
	    case 2:
		return new UE_Positioning_GANSS_AuxiliaryInfo();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "ue_Positioning_GANSS_Almanac"
    public UE_Positioning_GANSS_Almanac_v860ext getUe_Positioning_GANSS_Almanac()
    {
	return (UE_Positioning_GANSS_Almanac_v860ext)mComponents[0];
    }
    
    public void setUe_Positioning_GANSS_Almanac(UE_Positioning_GANSS_Almanac_v860ext ue_Positioning_GANSS_Almanac)
    {
	mComponents[0] = ue_Positioning_GANSS_Almanac;
    }
    
    public boolean hasUe_Positioning_GANSS_Almanac()
    {
	return componentIsPresent(0);
    }
    
    public void deleteUe_Positioning_GANSS_Almanac()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "ue_Positioning_GANSS_AddUTCModels"
    public UE_Positioning_GANSS_AddUTCModels getUe_Positioning_GANSS_AddUTCModels()
    {
	return (UE_Positioning_GANSS_AddUTCModels)mComponents[1];
    }
    
    public void setUe_Positioning_GANSS_AddUTCModels(UE_Positioning_GANSS_AddUTCModels ue_Positioning_GANSS_AddUTCModels)
    {
	mComponents[1] = ue_Positioning_GANSS_AddUTCModels;
    }
    
    public boolean hasUe_Positioning_GANSS_AddUTCModels()
    {
	return componentIsPresent(1);
    }
    
    public void deleteUe_Positioning_GANSS_AddUTCModels()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "ue_Positioning_GANSS_AuxiliaryInfo"
    public UE_Positioning_GANSS_AuxiliaryInfo getUe_Positioning_GANSS_AuxiliaryInfo()
    {
	return (UE_Positioning_GANSS_AuxiliaryInfo)mComponents[2];
    }
    
    public void setUe_Positioning_GANSS_AuxiliaryInfo(UE_Positioning_GANSS_AuxiliaryInfo ue_Positioning_GANSS_AuxiliaryInfo)
    {
	mComponents[2] = ue_Positioning_GANSS_AuxiliaryInfo;
    }
    
    public boolean hasUe_Positioning_GANSS_AuxiliaryInfo()
    {
	return componentIsPresent(2);
    }
    
    public void deleteUe_Positioning_GANSS_AuxiliaryInfo()
    {
	setComponentAbsent(2);
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
	    "SysInfoType15_3bis_v860ext_IEs"
	),
	new QName (
	    "InformationElements",
	    "SysInfoType15-3bis-v860ext-IEs"
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
				"UE_Positioning_GANSS_Almanac_v860ext"
			    ),
			    new QName (
				"InformationElements",
				"UE-Positioning-GANSS-Almanac-v860ext"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_GANSS_Almanac_v860ext"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_GANSS_Almanac_v860ext"
				)
			    ),
			    0
			)
		    ),
		    "ue-Positioning-GANSS-Almanac",
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
				"UE_Positioning_GANSS_AddUTCModels"
			    ),
			    new QName (
				"InformationElements",
				"UE-Positioning-GANSS-AddUTCModels"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_GANSS_AddUTCModels"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_GANSS_AddUTCModels"
				)
			    ),
			    0
			)
		    ),
		    "ue-Positioning-GANSS-AddUTCModels",
		    1,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"UE_Positioning_GANSS_AuxiliaryInfo"
			    ),
			    new QName (
				"InformationElements",
				"UE-Positioning-GANSS-AuxiliaryInfo"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_GANSS_AuxiliaryInfo"
				)
			    ),
			    0,
			    new TagDecoder (
				new TagDecoderElement[] {
				    new TagDecoderElement((short)0x8000, 0),
				    new TagDecoderElement((short)0x8001, 1)
				}
			    )
			)
		    ),
		    "ue-Positioning-GANSS-AuxiliaryInfo",
		    2,
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
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2)
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
     * Get the type descriptor (TypeInfo) of 'this' SysInfoType15_3bis_v860ext_IEs object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' SysInfoType15_3bis_v860ext_IEs object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for SysInfoType15_3bis_v860ext_IEs
