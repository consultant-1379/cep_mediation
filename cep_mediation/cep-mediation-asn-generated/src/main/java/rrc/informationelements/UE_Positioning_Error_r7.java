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
 * Define the ASN1 Type UE_Positioning_Error_r7 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class UE_Positioning_Error_r7 extends Sequence {
    
    /**
     * The default constructor.
     */
    public UE_Positioning_Error_r7()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public UE_Positioning_Error_r7(UE_Positioning_ErrorCause_r7 errorReason, 
		    UE_Positioning_GPS_AdditionalAssistanceDataRequest ue_positioning_GPS_additionalAssistanceDataRequest, 
		    UE_Positioning_GANSS_AdditionalAssistanceDataRequest ue_positioning_GANSS_additionalAssistanceDataRequest)
    {
	setErrorReason(errorReason);
	setUe_positioning_GPS_additionalAssistanceDataRequest(ue_positioning_GPS_additionalAssistanceDataRequest);
	setUe_positioning_GANSS_additionalAssistanceDataRequest(ue_positioning_GANSS_additionalAssistanceDataRequest);
    }
    
    /**
     * Construct with required components.
     */
    public UE_Positioning_Error_r7(UE_Positioning_ErrorCause_r7 errorReason)
    {
	setErrorReason(errorReason);
    }
    
    public void initComponents()
    {
	mComponents[0] = UE_Positioning_ErrorCause_r7.notEnoughOTDOA_Cells;
	mComponents[1] = new UE_Positioning_GPS_AdditionalAssistanceDataRequest();
	mComponents[2] = new UE_Positioning_GANSS_AdditionalAssistanceDataRequest();
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
		return UE_Positioning_ErrorCause_r7.notEnoughOTDOA_Cells;
	    case 1:
		return new UE_Positioning_GPS_AdditionalAssistanceDataRequest();
	    case 2:
		return new UE_Positioning_GANSS_AdditionalAssistanceDataRequest();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "errorReason"
    public UE_Positioning_ErrorCause_r7 getErrorReason()
    {
	return (UE_Positioning_ErrorCause_r7)mComponents[0];
    }
    
    public void setErrorReason(UE_Positioning_ErrorCause_r7 errorReason)
    {
	mComponents[0] = errorReason;
    }
    
    
    // Methods for field "ue_positioning_GPS_additionalAssistanceDataRequest"
    public UE_Positioning_GPS_AdditionalAssistanceDataRequest getUe_positioning_GPS_additionalAssistanceDataRequest()
    {
	return (UE_Positioning_GPS_AdditionalAssistanceDataRequest)mComponents[1];
    }
    
    public void setUe_positioning_GPS_additionalAssistanceDataRequest(UE_Positioning_GPS_AdditionalAssistanceDataRequest ue_positioning_GPS_additionalAssistanceDataRequest)
    {
	mComponents[1] = ue_positioning_GPS_additionalAssistanceDataRequest;
    }
    
    public boolean hasUe_positioning_GPS_additionalAssistanceDataRequest()
    {
	return componentIsPresent(1);
    }
    
    public void deleteUe_positioning_GPS_additionalAssistanceDataRequest()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "ue_positioning_GANSS_additionalAssistanceDataRequest"
    public UE_Positioning_GANSS_AdditionalAssistanceDataRequest getUe_positioning_GANSS_additionalAssistanceDataRequest()
    {
	return (UE_Positioning_GANSS_AdditionalAssistanceDataRequest)mComponents[2];
    }
    
    public void setUe_positioning_GANSS_additionalAssistanceDataRequest(UE_Positioning_GANSS_AdditionalAssistanceDataRequest ue_positioning_GANSS_additionalAssistanceDataRequest)
    {
	mComponents[2] = ue_positioning_GANSS_additionalAssistanceDataRequest;
    }
    
    public boolean hasUe_positioning_GANSS_additionalAssistanceDataRequest()
    {
	return componentIsPresent(2);
    }
    
    public void deleteUe_positioning_GANSS_additionalAssistanceDataRequest()
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
	    "UE_Positioning_Error_r7"
	),
	new QName (
	    "InformationElements",
	    "UE-Positioning-Error-r7"
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
				"UE_Positioning_ErrorCause_r7"
			    ),
			    new QName (
				"InformationElements",
				"UE-Positioning-ErrorCause-r7"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"notEnoughOTDOA-Cells",
					0
				    ),
				    new MemberListElement (
					"notEnoughGPS-Satellites",
					1
				    ),
				    new MemberListElement (
					"assistanceDataMissing",
					2
				    ),
				    new MemberListElement (
					"notAccomplishedGPS-TimingOfCellFrames",
					3
				    ),
				    new MemberListElement (
					"undefinedError",
					4
				    ),
				    new MemberListElement (
					"requestDeniedByUser",
					5
				    ),
				    new MemberListElement (
					"notProcessedAndTimeout",
					6
				    ),
				    new MemberListElement (
					"referenceCellNotServingCell",
					7
				    ),
				    new MemberListElement (
					"notEnoughGANSS-Satellites",
					8
				    ),
				    new MemberListElement (
					"notAccomplishedGANSS-TimingOfCellFrames",
					9
				    ),
				    new MemberListElement (
					"spare6",
					10
				    ),
				    new MemberListElement (
					"spare5",
					11
				    ),
				    new MemberListElement (
					"spare4",
					12
				    ),
				    new MemberListElement (
					"spare3",
					13
				    ),
				    new MemberListElement (
					"spare2",
					14
				    ),
				    new MemberListElement (
					"spare1",
					15
				    )
				}
			    ),
			    0,
			    UE_Positioning_ErrorCause_r7.notEnoughOTDOA_Cells
			)
		    ),
		    "errorReason",
		    0,
		    2,
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
				"UE_Positioning_GPS_AdditionalAssistanceDataRequest"
			    ),
			    new QName (
				"InformationElements",
				"UE-Positioning-GPS-AdditionalAssistanceDataRequest"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_GPS_AdditionalAssistanceDataRequest"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_GPS_AdditionalAssistanceDataRequest"
				)
			    ),
			    0
			)
		    ),
		    "ue-positioning-GPS-additionalAssistanceDataRequest",
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
				"UE_Positioning_GANSS_AdditionalAssistanceDataRequest"
			    ),
			    new QName (
				"InformationElements",
				"UE-Positioning-GANSS-AdditionalAssistanceDataRequest"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_GANSS_AdditionalAssistanceDataRequest"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_GANSS_AdditionalAssistanceDataRequest"
				)
			    ),
			    0
			)
		    ),
		    "ue-positioning-GANSS-additionalAssistanceDataRequest",
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
			new TagDecoderElement((short)0x8000, 0)
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
     * Get the type descriptor (TypeInfo) of 'this' UE_Positioning_Error_r7 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UE_Positioning_Error_r7 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UE_Positioning_Error_r7
