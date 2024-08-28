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
 * Define the ASN1 Type GANSSGenericData_va40ext from ASN1 Module InformationElements.
 * @see Sequence
 */

public class GANSSGenericData_va40ext extends Sequence {
    
    /**
     * The default constructor.
     */
    public GANSSGenericData_va40ext()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public GANSSGenericData_va40ext(GANSSTimeModelsList_va40ext ganssTimeModelsList, 
		    UE_Positioning_GANSS_ReferenceMeasurementInfo_va40ext uePositioningGANSSReferenceMeasurementInfo, 
		    UE_Positioning_GANSS_Almanac_va40ext uePositioningGANSSAlmanac)
    {
	setGanssTimeModelsList(ganssTimeModelsList);
	setUePositioningGANSSReferenceMeasurementInfo(uePositioningGANSSReferenceMeasurementInfo);
	setUePositioningGANSSAlmanac(uePositioningGANSSAlmanac);
    }
    
    public void initComponents()
    {
	mComponents[0] = new GANSSTimeModelsList_va40ext();
	mComponents[1] = new UE_Positioning_GANSS_ReferenceMeasurementInfo_va40ext();
	mComponents[2] = new UE_Positioning_GANSS_Almanac_va40ext();
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
		return new GANSSTimeModelsList_va40ext();
	    case 1:
		return new UE_Positioning_GANSS_ReferenceMeasurementInfo_va40ext();
	    case 2:
		return new UE_Positioning_GANSS_Almanac_va40ext();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "ganssTimeModelsList"
    public GANSSTimeModelsList_va40ext getGanssTimeModelsList()
    {
	return (GANSSTimeModelsList_va40ext)mComponents[0];
    }
    
    public void setGanssTimeModelsList(GANSSTimeModelsList_va40ext ganssTimeModelsList)
    {
	mComponents[0] = ganssTimeModelsList;
    }
    
    public boolean hasGanssTimeModelsList()
    {
	return componentIsPresent(0);
    }
    
    public void deleteGanssTimeModelsList()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "uePositioningGANSSReferenceMeasurementInfo"
    public UE_Positioning_GANSS_ReferenceMeasurementInfo_va40ext getUePositioningGANSSReferenceMeasurementInfo()
    {
	return (UE_Positioning_GANSS_ReferenceMeasurementInfo_va40ext)mComponents[1];
    }
    
    public void setUePositioningGANSSReferenceMeasurementInfo(UE_Positioning_GANSS_ReferenceMeasurementInfo_va40ext uePositioningGANSSReferenceMeasurementInfo)
    {
	mComponents[1] = uePositioningGANSSReferenceMeasurementInfo;
    }
    
    public boolean hasUePositioningGANSSReferenceMeasurementInfo()
    {
	return componentIsPresent(1);
    }
    
    public void deleteUePositioningGANSSReferenceMeasurementInfo()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "uePositioningGANSSAlmanac"
    public UE_Positioning_GANSS_Almanac_va40ext getUePositioningGANSSAlmanac()
    {
	return (UE_Positioning_GANSS_Almanac_va40ext)mComponents[2];
    }
    
    public void setUePositioningGANSSAlmanac(UE_Positioning_GANSS_Almanac_va40ext uePositioningGANSSAlmanac)
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
	    "GANSSGenericData_va40ext"
	),
	new QName (
	    "InformationElements",
	    "GANSSGenericData-va40ext"
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
				"GANSSTimeModelsList_va40ext"
			    ),
			    new QName (
				"InformationElements",
				"GANSSTimeModelsList-va40ext"
			    ),
			    12314,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new com.oss.asn1.INTEGER(1), 
					new com.oss.asn1.INTEGER(7),
					0
				    )
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(7)
			    ),
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_GANSS_TimeModel_va40ext"
				)
			    )
			)
		    ),
		    "ganssTimeModelsList",
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
				"UE_Positioning_GANSS_ReferenceMeasurementInfo_va40ext"
			    ),
			    new QName (
				"InformationElements",
				"UE-Positioning-GANSS-ReferenceMeasurementInfo-va40ext"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_GANSS_ReferenceMeasurementInfo_va40ext"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_GANSS_ReferenceMeasurementInfo_va40ext"
				)
			    ),
			    0
			)
		    ),
		    "uePositioningGANSSReferenceMeasurementInfo",
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
				"UE_Positioning_GANSS_Almanac_va40ext"
			    ),
			    new QName (
				"InformationElements",
				"UE-Positioning-GANSS-Almanac-va40ext"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_GANSS_Almanac_va40ext"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_GANSS_Almanac_va40ext"
				)
			    ),
			    0
			)
		    ),
		    "uePositioningGANSSAlmanac",
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
     * Get the type descriptor (TypeInfo) of 'this' GANSSGenericData_va40ext object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' GANSSGenericData_va40ext object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for GANSSGenericData_va40ext
