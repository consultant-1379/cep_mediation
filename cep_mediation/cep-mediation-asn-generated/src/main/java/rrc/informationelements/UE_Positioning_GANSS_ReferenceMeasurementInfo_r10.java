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
 * Define the ASN1 Type UE_Positioning_GANSS_ReferenceMeasurementInfo_r10 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class UE_Positioning_GANSS_ReferenceMeasurementInfo_r10 extends Sequence {
    
    /**
     * The default constructor.
     */
    public UE_Positioning_GANSS_ReferenceMeasurementInfo_r10()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public UE_Positioning_GANSS_ReferenceMeasurementInfo_r10(GANSS_Signal_Id ganssSignalId, 
		    GANSSSatelliteInformationList_r10 satelliteInformationList)
    {
	setGanssSignalId(ganssSignalId);
	setSatelliteInformationList(satelliteInformationList);
    }
    
    /**
     * Construct with required components.
     */
    public UE_Positioning_GANSS_ReferenceMeasurementInfo_r10(GANSSSatelliteInformationList_r10 satelliteInformationList)
    {
	setSatelliteInformationList(satelliteInformationList);
    }
    
    public void initComponents()
    {
	mComponents[0] = new GANSS_Signal_Id();
	mComponents[1] = new GANSSSatelliteInformationList_r10();
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
		return new GANSS_Signal_Id();
	    case 1:
		return new GANSSSatelliteInformationList_r10();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "ganssSignalId"
    public GANSS_Signal_Id getGanssSignalId()
    {
	return (GANSS_Signal_Id)mComponents[0];
    }
    
    public void setGanssSignalId(GANSS_Signal_Id ganssSignalId)
    {
	mComponents[0] = ganssSignalId;
    }
    
    public boolean hasGanssSignalId()
    {
	return componentIsPresent(0);
    }
    
    public void deleteGanssSignalId()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "satelliteInformationList"
    public GANSSSatelliteInformationList_r10 getSatelliteInformationList()
    {
	return (GANSSSatelliteInformationList_r10)mComponents[1];
    }
    
    public void setSatelliteInformationList(GANSSSatelliteInformationList_r10 satelliteInformationList)
    {
	mComponents[1] = satelliteInformationList;
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
	    "UE_Positioning_GANSS_ReferenceMeasurementInfo_r10"
	),
	new QName (
	    "InformationElements",
	    "UE-Positioning-GANSS-ReferenceMeasurementInfo-r10"
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
				"GANSS_Signal_Id"
			    ),
			    new QName (
				"InformationElements",
				"GANSS-Signal-Id"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new GANSS_Signal_Id(0), 
				    new GANSS_Signal_Id(7),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(7)
			    ),
			    null
			)
		    ),
		    "ganssSignalId",
		    0,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"GANSSSatelliteInformationList_r10"
			    ),
			    new QName (
				"InformationElements",
				"GANSSSatelliteInformationList-r10"
			    ),
			    12314,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new com.oss.asn1.INTEGER(1), 
					new com.oss.asn1.INTEGER(64),
					0
				    )
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(64)
			    ),
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "GANSSSatelliteInformation_r10"
				)
			    )
			)
		    ),
		    "satelliteInformationList",
		    1,
		    2,
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
     * Get the type descriptor (TypeInfo) of 'this' UE_Positioning_GANSS_ReferenceMeasurementInfo_r10 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UE_Positioning_GANSS_ReferenceMeasurementInfo_r10 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UE_Positioning_GANSS_ReferenceMeasurementInfo_r10
