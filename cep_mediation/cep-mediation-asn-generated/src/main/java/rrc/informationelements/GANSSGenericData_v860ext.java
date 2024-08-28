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
 * Define the ASN1 Type GANSSGenericData_v860ext from ASN1 Module InformationElements.
 * @see Sequence
 */

public class GANSSGenericData_v860ext extends Sequence {
    
    /**
     * The default constructor.
     */
    public GANSSGenericData_v860ext()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public GANSSGenericData_v860ext(UE_Positioning_GANSS_SBAS_ID uePositiningGANSSsbasID, 
		    UE_Positioning_GANSS_AddNavigationModels uePositioningGANSSAddNavigationModels, 
		    UE_Positioning_GANSS_Almanac_v860ext uePositioningGANSSAlmanac, 
		    UE_Positioning_GANSS_AddUTCModels uePositioningGANSSAddUTCModels, 
		    UE_Positioning_GANSS_AuxiliaryInfo uePositioningGANSSAuxiliaryInfo)
    {
	setUePositiningGANSSsbasID(uePositiningGANSSsbasID);
	setUePositioningGANSSAddNavigationModels(uePositioningGANSSAddNavigationModels);
	setUePositioningGANSSAlmanac(uePositioningGANSSAlmanac);
	setUePositioningGANSSAddUTCModels(uePositioningGANSSAddUTCModels);
	setUePositioningGANSSAuxiliaryInfo(uePositioningGANSSAuxiliaryInfo);
    }
    
    public void initComponents()
    {
	mComponents[0] = UE_Positioning_GANSS_SBAS_ID.waas;
	mComponents[1] = new UE_Positioning_GANSS_AddNavigationModels();
	mComponents[2] = new UE_Positioning_GANSS_Almanac_v860ext();
	mComponents[3] = new UE_Positioning_GANSS_AddUTCModels();
	mComponents[4] = new UE_Positioning_GANSS_AuxiliaryInfo();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[5];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return UE_Positioning_GANSS_SBAS_ID.waas;
	    case 1:
		return new UE_Positioning_GANSS_AddNavigationModels();
	    case 2:
		return new UE_Positioning_GANSS_Almanac_v860ext();
	    case 3:
		return new UE_Positioning_GANSS_AddUTCModels();
	    case 4:
		return new UE_Positioning_GANSS_AuxiliaryInfo();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "uePositiningGANSSsbasID"
    public UE_Positioning_GANSS_SBAS_ID getUePositiningGANSSsbasID()
    {
	return (UE_Positioning_GANSS_SBAS_ID)mComponents[0];
    }
    
    public void setUePositiningGANSSsbasID(UE_Positioning_GANSS_SBAS_ID uePositiningGANSSsbasID)
    {
	mComponents[0] = uePositiningGANSSsbasID;
    }
    
    public boolean hasUePositiningGANSSsbasID()
    {
	return componentIsPresent(0);
    }
    
    public void deleteUePositiningGANSSsbasID()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "uePositioningGANSSAddNavigationModels"
    public UE_Positioning_GANSS_AddNavigationModels getUePositioningGANSSAddNavigationModels()
    {
	return (UE_Positioning_GANSS_AddNavigationModels)mComponents[1];
    }
    
    public void setUePositioningGANSSAddNavigationModels(UE_Positioning_GANSS_AddNavigationModels uePositioningGANSSAddNavigationModels)
    {
	mComponents[1] = uePositioningGANSSAddNavigationModels;
    }
    
    public boolean hasUePositioningGANSSAddNavigationModels()
    {
	return componentIsPresent(1);
    }
    
    public void deleteUePositioningGANSSAddNavigationModels()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "uePositioningGANSSAlmanac"
    public UE_Positioning_GANSS_Almanac_v860ext getUePositioningGANSSAlmanac()
    {
	return (UE_Positioning_GANSS_Almanac_v860ext)mComponents[2];
    }
    
    public void setUePositioningGANSSAlmanac(UE_Positioning_GANSS_Almanac_v860ext uePositioningGANSSAlmanac)
    {
	mComponents[2] = uePositioningGANSSAlmanac;
    }
    
    public boolean hasUePositioningGANSSAlmanac()
    {
	return componentIsPresent(2);
    }
    
    public void deleteUePositioningGANSSAlmanac()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "uePositioningGANSSAddUTCModels"
    public UE_Positioning_GANSS_AddUTCModels getUePositioningGANSSAddUTCModels()
    {
	return (UE_Positioning_GANSS_AddUTCModels)mComponents[3];
    }
    
    public void setUePositioningGANSSAddUTCModels(UE_Positioning_GANSS_AddUTCModels uePositioningGANSSAddUTCModels)
    {
	mComponents[3] = uePositioningGANSSAddUTCModels;
    }
    
    public boolean hasUePositioningGANSSAddUTCModels()
    {
	return componentIsPresent(3);
    }
    
    public void deleteUePositioningGANSSAddUTCModels()
    {
	setComponentAbsent(3);
    }
    
    
    // Methods for field "uePositioningGANSSAuxiliaryInfo"
    public UE_Positioning_GANSS_AuxiliaryInfo getUePositioningGANSSAuxiliaryInfo()
    {
	return (UE_Positioning_GANSS_AuxiliaryInfo)mComponents[4];
    }
    
    public void setUePositioningGANSSAuxiliaryInfo(UE_Positioning_GANSS_AuxiliaryInfo uePositioningGANSSAuxiliaryInfo)
    {
	mComponents[4] = uePositioningGANSSAuxiliaryInfo;
    }
    
    public boolean hasUePositioningGANSSAuxiliaryInfo()
    {
	return componentIsPresent(4);
    }
    
    public void deleteUePositioningGANSSAuxiliaryInfo()
    {
	setComponentAbsent(4);
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
	    "GANSSGenericData_v860ext"
	),
	new QName (
	    "InformationElements",
	    "GANSSGenericData-v860ext"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"UE_Positioning_GANSS_SBAS_ID"
			    ),
			    new QName (
				"InformationElements",
				"UE-Positioning-GANSS-SBAS-ID"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"waas",
					0
				    ),
				    new MemberListElement (
					"egnos",
					1
				    ),
				    new MemberListElement (
					"msas",
					2
				    ),
				    new MemberListElement (
					"gagan",
					3
				    ),
				    new MemberListElement (
					"spare4",
					4
				    ),
				    new MemberListElement (
					"spare3",
					5
				    ),
				    new MemberListElement (
					"spare2",
					6
				    ),
				    new MemberListElement (
					"spare1",
					7
				    )
				}
			    ),
			    0,
			    UE_Positioning_GANSS_SBAS_ID.waas
			)
		    ),
		    "uePositiningGANSSsbasID",
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
				"UE_Positioning_GANSS_AddNavigationModels"
			    ),
			    new QName (
				"InformationElements",
				"UE-Positioning-GANSS-AddNavigationModels"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_GANSS_AddNavigationModels"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_GANSS_AddNavigationModels"
				)
			    ),
			    0
			)
		    ),
		    "uePositioningGANSSAddNavigationModels",
		    1,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
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
		    "uePositioningGANSSAlmanac",
		    2,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
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
		    "uePositioningGANSSAddUTCModels",
		    3,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x8004
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
		    "uePositioningGANSSAuxiliaryInfo",
		    4,
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
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8004, 4)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' GANSSGenericData_v860ext object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' GANSSGenericData_v860ext object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for GANSSGenericData_v860ext
