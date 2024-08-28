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
 * Define the ASN1 Type UE_Positioning_GANSS_AddIonoModel from ASN1 Module InformationElements.
 * @see Sequence
 */

public class UE_Positioning_GANSS_AddIonoModel extends Sequence {
    
    /**
     * The default constructor.
     */
    public UE_Positioning_GANSS_AddIonoModel()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public UE_Positioning_GANSS_AddIonoModel(BitString dataID, 
		    UE_Positioning_GPS_IonosphericModel alpha_beta_parameters)
    {
	setDataID(dataID);
	setAlpha_beta_parameters(alpha_beta_parameters);
    }
    
    public void initComponents()
    {
	mComponents[0] = new BitString();
	mComponents[1] = new UE_Positioning_GPS_IonosphericModel();
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
		return new BitString();
	    case 1:
		return new UE_Positioning_GPS_IonosphericModel();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "dataID"
    public BitString getDataID()
    {
	return (BitString)mComponents[0];
    }
    
    public void setDataID(BitString dataID)
    {
	mComponents[0] = dataID;
    }
    
    
    // Methods for field "alpha_beta_parameters"
    public UE_Positioning_GPS_IonosphericModel getAlpha_beta_parameters()
    {
	return (UE_Positioning_GPS_IonosphericModel)mComponents[1];
    }
    
    public void setAlpha_beta_parameters(UE_Positioning_GPS_IonosphericModel alpha_beta_parameters)
    {
	mComponents[1] = alpha_beta_parameters;
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
	    "UE_Positioning_GANSS_AddIonoModel"
	),
	new QName (
	    "InformationElements",
	    "UE-Positioning-GANSS-AddIonoModel"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"BitString"
			    ),
			    new QName (
				"builtin",
				"BIT STRING"
			    ),
			    12314,
			    new SizeConstraint (
				new SingleValueConstraint (
				    new com.oss.asn1.INTEGER(2)
				)
			    ),
			    new Bounds (
				new java.lang.Long(2),
				new java.lang.Long(2)
			    ),
			    null
			)
		    ),
		    "dataID",
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
				"UE_Positioning_GPS_IonosphericModel"
			    ),
			    new QName (
				"InformationElements",
				"UE-Positioning-GPS-IonosphericModel"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_GPS_IonosphericModel"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_GPS_IonosphericModel"
				)
			    ),
			    0
			)
		    ),
		    "alpha-beta-parameters",
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
			new TagDecoderElement((short)0x8000, 0)
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
     * Get the type descriptor (TypeInfo) of 'this' UE_Positioning_GANSS_AddIonoModel object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UE_Positioning_GANSS_AddIonoModel object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UE_Positioning_GANSS_AddIonoModel
