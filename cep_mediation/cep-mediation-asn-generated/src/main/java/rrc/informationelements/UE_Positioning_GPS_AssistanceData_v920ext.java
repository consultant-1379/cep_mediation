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
 * Define the ASN1 Type UE_Positioning_GPS_AssistanceData_v920ext from ASN1 Module InformationElements.
 * @see Sequence
 */

public class UE_Positioning_GPS_AssistanceData_v920ext extends Sequence {
    
    /**
     * The default constructor.
     */
    public UE_Positioning_GPS_AssistanceData_v920ext()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public UE_Positioning_GPS_AssistanceData_v920ext(UE_Positioning_GPS_DGPS_Corrections_v920ext ue_positioning_GPS_DGPS_Corrections)
    {
	setUe_positioning_GPS_DGPS_Corrections(ue_positioning_GPS_DGPS_Corrections);
    }
    
    public void initComponents()
    {
	mComponents[0] = new UE_Positioning_GPS_DGPS_Corrections_v920ext();
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
		return new UE_Positioning_GPS_DGPS_Corrections_v920ext();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "ue_positioning_GPS_DGPS_Corrections"
    public UE_Positioning_GPS_DGPS_Corrections_v920ext getUe_positioning_GPS_DGPS_Corrections()
    {
	return (UE_Positioning_GPS_DGPS_Corrections_v920ext)mComponents[0];
    }
    
    public void setUe_positioning_GPS_DGPS_Corrections(UE_Positioning_GPS_DGPS_Corrections_v920ext ue_positioning_GPS_DGPS_Corrections)
    {
	mComponents[0] = ue_positioning_GPS_DGPS_Corrections;
    }
    
    public boolean hasUe_positioning_GPS_DGPS_Corrections()
    {
	return componentIsPresent(0);
    }
    
    public void deleteUe_positioning_GPS_DGPS_Corrections()
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
	    "UE_Positioning_GPS_AssistanceData_v920ext"
	),
	new QName (
	    "InformationElements",
	    "UE-Positioning-GPS-AssistanceData-v920ext"
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
				"UE_Positioning_GPS_DGPS_Corrections_v920ext"
			    ),
			    new QName (
				"InformationElements",
				"UE-Positioning-GPS-DGPS-Corrections-v920ext"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_GPS_DGPS_Corrections_v920ext"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_GPS_DGPS_Corrections_v920ext"
				)
			    ),
			    0
			)
		    ),
		    "ue-positioning-GPS-DGPS-Corrections",
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
     * Get the type descriptor (TypeInfo) of 'this' UE_Positioning_GPS_AssistanceData_v920ext object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UE_Positioning_GPS_AssistanceData_v920ext object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UE_Positioning_GPS_AssistanceData_v920ext
