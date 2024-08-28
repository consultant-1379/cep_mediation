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
 * Define the ASN1 Type UE_Positioning_GPS_AssistanceData_va40ext from ASN1 Module InformationElements.
 * @see Sequence
 */

public class UE_Positioning_GPS_AssistanceData_va40ext extends Sequence {
    
    /**
     * The default constructor.
     */
    public UE_Positioning_GPS_AssistanceData_va40ext()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public UE_Positioning_GPS_AssistanceData_va40ext(UE_Positioning_GPS_ReferenceTime_va40ext ue_positioning_GPS_ReferenceTime, 
		    UE_Positioning_GPS_Almanac_va40ext ue_positioning_GPS_Almanac, 
		    UE_Positioning_GPS_AcquisitionAssistance_va40ext ue_positioning_GPS_AcquisitionAssistance)
    {
	setUe_positioning_GPS_ReferenceTime(ue_positioning_GPS_ReferenceTime);
	setUe_positioning_GPS_Almanac(ue_positioning_GPS_Almanac);
	setUe_positioning_GPS_AcquisitionAssistance(ue_positioning_GPS_AcquisitionAssistance);
    }
    
    public void initComponents()
    {
	mComponents[0] = new UE_Positioning_GPS_ReferenceTime_va40ext();
	mComponents[1] = new UE_Positioning_GPS_Almanac_va40ext();
	mComponents[2] = new UE_Positioning_GPS_AcquisitionAssistance_va40ext();
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
		return new UE_Positioning_GPS_ReferenceTime_va40ext();
	    case 1:
		return new UE_Positioning_GPS_Almanac_va40ext();
	    case 2:
		return new UE_Positioning_GPS_AcquisitionAssistance_va40ext();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "ue_positioning_GPS_ReferenceTime"
    public UE_Positioning_GPS_ReferenceTime_va40ext getUe_positioning_GPS_ReferenceTime()
    {
	return (UE_Positioning_GPS_ReferenceTime_va40ext)mComponents[0];
    }
    
    public void setUe_positioning_GPS_ReferenceTime(UE_Positioning_GPS_ReferenceTime_va40ext ue_positioning_GPS_ReferenceTime)
    {
	mComponents[0] = ue_positioning_GPS_ReferenceTime;
    }
    
    public boolean hasUe_positioning_GPS_ReferenceTime()
    {
	return componentIsPresent(0);
    }
    
    public void deleteUe_positioning_GPS_ReferenceTime()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "ue_positioning_GPS_Almanac"
    public UE_Positioning_GPS_Almanac_va40ext getUe_positioning_GPS_Almanac()
    {
	return (UE_Positioning_GPS_Almanac_va40ext)mComponents[1];
    }
    
    public void setUe_positioning_GPS_Almanac(UE_Positioning_GPS_Almanac_va40ext ue_positioning_GPS_Almanac)
    {
	mComponents[1] = ue_positioning_GPS_Almanac;
    }
    
    public boolean hasUe_positioning_GPS_Almanac()
    {
	return componentIsPresent(1);
    }
    
    public void deleteUe_positioning_GPS_Almanac()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "ue_positioning_GPS_AcquisitionAssistance"
    public UE_Positioning_GPS_AcquisitionAssistance_va40ext getUe_positioning_GPS_AcquisitionAssistance()
    {
	return (UE_Positioning_GPS_AcquisitionAssistance_va40ext)mComponents[2];
    }
    
    public void setUe_positioning_GPS_AcquisitionAssistance(UE_Positioning_GPS_AcquisitionAssistance_va40ext ue_positioning_GPS_AcquisitionAssistance)
    {
	mComponents[2] = ue_positioning_GPS_AcquisitionAssistance;
    }
    
    public boolean hasUe_positioning_GPS_AcquisitionAssistance()
    {
	return componentIsPresent(2);
    }
    
    public void deleteUe_positioning_GPS_AcquisitionAssistance()
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
	    "UE_Positioning_GPS_AssistanceData_va40ext"
	),
	new QName (
	    "InformationElements",
	    "UE-Positioning-GPS-AssistanceData-va40ext"
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
				"UE_Positioning_GPS_ReferenceTime_va40ext"
			    ),
			    new QName (
				"InformationElements",
				"UE-Positioning-GPS-ReferenceTime-va40ext"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_GPS_ReferenceTime_va40ext"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_GPS_ReferenceTime_va40ext"
				)
			    ),
			    0
			)
		    ),
		    "ue-positioning-GPS-ReferenceTime",
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
				"UE_Positioning_GPS_Almanac_va40ext"
			    ),
			    new QName (
				"InformationElements",
				"UE-Positioning-GPS-Almanac-va40ext"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_GPS_Almanac_va40ext"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_GPS_Almanac_va40ext"
				)
			    ),
			    0
			)
		    ),
		    "ue-positioning-GPS-Almanac",
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
				"UE_Positioning_GPS_AcquisitionAssistance_va40ext"
			    ),
			    new QName (
				"InformationElements",
				"UE-Positioning-GPS-AcquisitionAssistance-va40ext"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_GPS_AcquisitionAssistance_va40ext"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_GPS_AcquisitionAssistance_va40ext"
				)
			    ),
			    0
			)
		    ),
		    "ue-positioning-GPS-AcquisitionAssistance",
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
     * Get the type descriptor (TypeInfo) of 'this' UE_Positioning_GPS_AssistanceData_va40ext object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UE_Positioning_GPS_AssistanceData_va40ext object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UE_Positioning_GPS_AssistanceData_va40ext
