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
 * Define the ASN1 Type UE_InternalMeasurementSysInfo from ASN1 Module InformationElements.
 * @see Sequence
 */

public class UE_InternalMeasurementSysInfo extends Sequence {
    
    /**
     * The default constructor.
     */
    public UE_InternalMeasurementSysInfo()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public UE_InternalMeasurementSysInfo(MeasurementIdentity ue_InternalMeasurementID, 
		    UE_InternalMeasQuantity ue_InternalMeasQuantity)
    {
	setUe_InternalMeasurementID(ue_InternalMeasurementID);
	setUe_InternalMeasQuantity(ue_InternalMeasQuantity);
    }
    
    /**
     * Construct with required components.
     */
    public UE_InternalMeasurementSysInfo(UE_InternalMeasQuantity ue_InternalMeasQuantity)
    {
	setUe_InternalMeasQuantity(ue_InternalMeasQuantity);
    }
    
    public void initComponents()
    {
	mComponents[0] = new MeasurementIdentity();
	mComponents[1] = new UE_InternalMeasQuantity();
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
		return new MeasurementIdentity();
	    case 1:
		return new UE_InternalMeasQuantity();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    // Default Values
    public static final MeasurementIdentity ue_InternalMeasurementID__default = 
	new MeasurementIdentity(5);
    
    // Methods for field "ue_InternalMeasurementID"
    public MeasurementIdentity getUe_InternalMeasurementID()
    {
	if (hasUe_InternalMeasurementID())
	    return (MeasurementIdentity)mComponents[0];
	else
	    return (MeasurementIdentity)ue_InternalMeasurementID__default.clone();
    }
    
    public void setUe_InternalMeasurementID(MeasurementIdentity ue_InternalMeasurementID)
    {
	mComponents[0] = ue_InternalMeasurementID;
    }
    
    public void setUe_InternalMeasurementIDToDefault()
    {
	setUe_InternalMeasurementID(ue_InternalMeasurementID__default);
    }
    
    public boolean hasDefaultUe_InternalMeasurementID()
    {
	return true;
    }
    
    public boolean hasUe_InternalMeasurementID()
    {
	return componentIsPresent(0);
    }
    
    public void deleteUe_InternalMeasurementID()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "ue_InternalMeasQuantity"
    public UE_InternalMeasQuantity getUe_InternalMeasQuantity()
    {
	return (UE_InternalMeasQuantity)mComponents[1];
    }
    
    public void setUe_InternalMeasQuantity(UE_InternalMeasQuantity ue_InternalMeasQuantity)
    {
	mComponents[1] = ue_InternalMeasQuantity;
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
	    "UE_InternalMeasurementSysInfo"
	),
	new QName (
	    "InformationElements",
	    "UE-InternalMeasurementSysInfo"
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
				"MeasurementIdentity"
			    ),
			    new QName (
				"InformationElements",
				"MeasurementIdentity"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new MeasurementIdentity(1), 
				    new MeasurementIdentity(16),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(16)
			    ),
			    null
			)
		    ),
		    "ue-InternalMeasurementID",
		    0,
		    3,
		    ue_InternalMeasurementID__default
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
				"UE_InternalMeasQuantity"
			    ),
			    new QName (
				"InformationElements",
				"UE-InternalMeasQuantity"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UE_InternalMeasQuantity"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "UE_InternalMeasQuantity"
				)
			    ),
			    0
			)
		    ),
		    "ue-InternalMeasQuantity",
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
     * Get the type descriptor (TypeInfo) of 'this' UE_InternalMeasurementSysInfo object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UE_InternalMeasurementSysInfo object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UE_InternalMeasurementSysInfo
