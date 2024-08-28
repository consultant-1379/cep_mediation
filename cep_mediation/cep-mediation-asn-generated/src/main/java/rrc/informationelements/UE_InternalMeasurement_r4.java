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
 * Define the ASN1 Type UE_InternalMeasurement_r4 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class UE_InternalMeasurement_r4 extends Sequence {
    
    /**
     * The default constructor.
     */
    public UE_InternalMeasurement_r4()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public UE_InternalMeasurement_r4(UE_InternalMeasQuantity ue_InternalMeasQuantity, 
		    UE_InternalReportingQuantity_r4 ue_InternalReportingQuantity, 
		    UE_InternalReportCriteria reportCriteria)
    {
	setUe_InternalMeasQuantity(ue_InternalMeasQuantity);
	setUe_InternalReportingQuantity(ue_InternalReportingQuantity);
	setReportCriteria(reportCriteria);
    }
    
    /**
     * Construct with required components.
     */
    public UE_InternalMeasurement_r4(UE_InternalReportCriteria reportCriteria)
    {
	setReportCriteria(reportCriteria);
    }
    
    public void initComponents()
    {
	mComponents[0] = new UE_InternalMeasQuantity();
	mComponents[1] = new UE_InternalReportingQuantity_r4();
	mComponents[2] = new UE_InternalReportCriteria();
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
		return new UE_InternalMeasQuantity();
	    case 1:
		return new UE_InternalReportingQuantity_r4();
	    case 2:
		return new UE_InternalReportCriteria();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "ue_InternalMeasQuantity"
    public UE_InternalMeasQuantity getUe_InternalMeasQuantity()
    {
	return (UE_InternalMeasQuantity)mComponents[0];
    }
    
    public void setUe_InternalMeasQuantity(UE_InternalMeasQuantity ue_InternalMeasQuantity)
    {
	mComponents[0] = ue_InternalMeasQuantity;
    }
    
    public boolean hasUe_InternalMeasQuantity()
    {
	return componentIsPresent(0);
    }
    
    public void deleteUe_InternalMeasQuantity()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "ue_InternalReportingQuantity"
    public UE_InternalReportingQuantity_r4 getUe_InternalReportingQuantity()
    {
	return (UE_InternalReportingQuantity_r4)mComponents[1];
    }
    
    public void setUe_InternalReportingQuantity(UE_InternalReportingQuantity_r4 ue_InternalReportingQuantity)
    {
	mComponents[1] = ue_InternalReportingQuantity;
    }
    
    public boolean hasUe_InternalReportingQuantity()
    {
	return componentIsPresent(1);
    }
    
    public void deleteUe_InternalReportingQuantity()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "reportCriteria"
    public UE_InternalReportCriteria getReportCriteria()
    {
	return (UE_InternalReportCriteria)mComponents[2];
    }
    
    public void setReportCriteria(UE_InternalReportCriteria reportCriteria)
    {
	mComponents[2] = reportCriteria;
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
	    "UE_InternalMeasurement_r4"
	),
	new QName (
	    "InformationElements",
	    "UE-InternalMeasurement-r4"
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
				"UE_InternalReportingQuantity_r4"
			    ),
			    new QName (
				"InformationElements",
				"UE-InternalReportingQuantity-r4"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UE_InternalReportingQuantity_r4"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "UE_InternalReportingQuantity_r4"
				)
			    ),
			    0
			)
		    ),
		    "ue-InternalReportingQuantity",
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
				"UE_InternalReportCriteria"
			    ),
			    new QName (
				"InformationElements",
				"UE-InternalReportCriteria"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UE_InternalReportCriteria"
				)
			    ),
			    0,
			    new TagDecoder (
				new TagDecoderElement[] {
				    new TagDecoderElement((short)0x8000, 0),
				    new TagDecoderElement((short)0x8001, 1),
				    new TagDecoderElement((short)0x8002, 2)
				}
			    )
			)
		    ),
		    "reportCriteria",
		    2,
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
     * Get the type descriptor (TypeInfo) of 'this' UE_InternalMeasurement_r4 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UE_InternalMeasurement_r4 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UE_InternalMeasurement_r4
