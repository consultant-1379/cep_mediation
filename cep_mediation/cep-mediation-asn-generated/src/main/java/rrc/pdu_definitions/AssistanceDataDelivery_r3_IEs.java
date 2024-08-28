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


package rrc.pdu_definitions;

import com.oss.asn1.*;
import com.oss.metadata.*;
import rrc.*;

/**
 * Define the ASN1 Type AssistanceDataDelivery_r3_IEs from ASN1 Module PDU_definitions.
 * @see Sequence
 */

public class AssistanceDataDelivery_r3_IEs extends Sequence {
    
    /**
     * The default constructor.
     */
    public AssistanceDataDelivery_r3_IEs()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public AssistanceDataDelivery_r3_IEs(rrc.informationelements.RRC_TransactionIdentifier rrc_TransactionIdentifier, 
		    rrc.informationelements.UE_Positioning_GPS_AssistanceData ue_positioning_GPS_AssistanceData, 
		    rrc.informationelements.UE_Positioning_OTDOA_AssistanceData_UEB ue_positioning_OTDOA_AssistanceData_UEB)
    {
	setRrc_TransactionIdentifier(rrc_TransactionIdentifier);
	setUe_positioning_GPS_AssistanceData(ue_positioning_GPS_AssistanceData);
	setUe_positioning_OTDOA_AssistanceData_UEB(ue_positioning_OTDOA_AssistanceData_UEB);
    }
    
    /**
     * Construct with required components.
     */
    public AssistanceDataDelivery_r3_IEs(rrc.informationelements.RRC_TransactionIdentifier rrc_TransactionIdentifier)
    {
	setRrc_TransactionIdentifier(rrc_TransactionIdentifier);
    }
    
    public void initComponents()
    {
	mComponents[0] = new rrc.informationelements.RRC_TransactionIdentifier();
	mComponents[1] = new rrc.informationelements.UE_Positioning_GPS_AssistanceData();
	mComponents[2] = new rrc.informationelements.UE_Positioning_OTDOA_AssistanceData_UEB();
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
		return new rrc.informationelements.RRC_TransactionIdentifier();
	    case 1:
		return new rrc.informationelements.UE_Positioning_GPS_AssistanceData();
	    case 2:
		return new rrc.informationelements.UE_Positioning_OTDOA_AssistanceData_UEB();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "rrc_TransactionIdentifier"
    public rrc.informationelements.RRC_TransactionIdentifier getRrc_TransactionIdentifier()
    {
	return (rrc.informationelements.RRC_TransactionIdentifier)mComponents[0];
    }
    
    public void setRrc_TransactionIdentifier(rrc.informationelements.RRC_TransactionIdentifier rrc_TransactionIdentifier)
    {
	mComponents[0] = rrc_TransactionIdentifier;
    }
    
    
    // Methods for field "ue_positioning_GPS_AssistanceData"
    public rrc.informationelements.UE_Positioning_GPS_AssistanceData getUe_positioning_GPS_AssistanceData()
    {
	return (rrc.informationelements.UE_Positioning_GPS_AssistanceData)mComponents[1];
    }
    
    public void setUe_positioning_GPS_AssistanceData(rrc.informationelements.UE_Positioning_GPS_AssistanceData ue_positioning_GPS_AssistanceData)
    {
	mComponents[1] = ue_positioning_GPS_AssistanceData;
    }
    
    public boolean hasUe_positioning_GPS_AssistanceData()
    {
	return componentIsPresent(1);
    }
    
    public void deleteUe_positioning_GPS_AssistanceData()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "ue_positioning_OTDOA_AssistanceData_UEB"
    public rrc.informationelements.UE_Positioning_OTDOA_AssistanceData_UEB getUe_positioning_OTDOA_AssistanceData_UEB()
    {
	return (rrc.informationelements.UE_Positioning_OTDOA_AssistanceData_UEB)mComponents[2];
    }
    
    public void setUe_positioning_OTDOA_AssistanceData_UEB(rrc.informationelements.UE_Positioning_OTDOA_AssistanceData_UEB ue_positioning_OTDOA_AssistanceData_UEB)
    {
	mComponents[2] = ue_positioning_OTDOA_AssistanceData_UEB;
    }
    
    public boolean hasUe_positioning_OTDOA_AssistanceData_UEB()
    {
	return componentIsPresent(2);
    }
    
    public void deleteUe_positioning_OTDOA_AssistanceData_UEB()
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
	    "rrc.pdu_definitions",
	    "AssistanceDataDelivery_r3_IEs"
	),
	new QName (
	    "PDU-definitions",
	    "AssistanceDataDelivery-r3-IEs"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"RRC_TransactionIdentifier"
			    ),
			    new QName (
				"InformationElements",
				"RRC-TransactionIdentifier"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new rrc.informationelements.RRC_TransactionIdentifier(0), 
				    new rrc.informationelements.RRC_TransactionIdentifier(3),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(3)
			    ),
			    null
			)
		    ),
		    "rrc-TransactionIdentifier",
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
				"UE_Positioning_GPS_AssistanceData"
			    ),
			    new QName (
				"InformationElements",
				"UE-Positioning-GPS-AssistanceData"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_GPS_AssistanceData"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_GPS_AssistanceData"
				)
			    ),
			    0
			)
		    ),
		    "ue-positioning-GPS-AssistanceData",
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
				"UE_Positioning_OTDOA_AssistanceData_UEB"
			    ),
			    new QName (
				"InformationElements",
				"UE-Positioning-OTDOA-AssistanceData-UEB"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_OTDOA_AssistanceData_UEB"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_OTDOA_AssistanceData_UEB"
				)
			    ),
			    0
			)
		    ),
		    "ue-positioning-OTDOA-AssistanceData-UEB",
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
     * Get the type descriptor (TypeInfo) of 'this' AssistanceDataDelivery_r3_IEs object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' AssistanceDataDelivery_r3_IEs object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for AssistanceDataDelivery_r3_IEs
