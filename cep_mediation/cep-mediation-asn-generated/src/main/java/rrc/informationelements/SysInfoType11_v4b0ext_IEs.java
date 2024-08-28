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
 * Define the ASN1 Type SysInfoType11_v4b0ext_IEs from ASN1 Module InformationElements.
 * @see Sequence
 */

public class SysInfoType11_v4b0ext_IEs extends Sequence {
    
    /**
     * The default constructor.
     */
    public SysInfoType11_v4b0ext_IEs()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public SysInfoType11_v4b0ext_IEs(FACH_MeasurementOccasionInfo_LCR_r4_ext fach_MeasurementOccasionInfo_LCR_Ext, 
		    MeasurementControlSysInfo_LCR_r4_ext measurementControlSysInfo_LCR)
    {
	setFach_MeasurementOccasionInfo_LCR_Ext(fach_MeasurementOccasionInfo_LCR_Ext);
	setMeasurementControlSysInfo_LCR(measurementControlSysInfo_LCR);
    }
    
    /**
     * Construct with required components.
     */
    public SysInfoType11_v4b0ext_IEs(MeasurementControlSysInfo_LCR_r4_ext measurementControlSysInfo_LCR)
    {
	setMeasurementControlSysInfo_LCR(measurementControlSysInfo_LCR);
    }
    
    public void initComponents()
    {
	mComponents[0] = new FACH_MeasurementOccasionInfo_LCR_r4_ext();
	mComponents[1] = new MeasurementControlSysInfo_LCR_r4_ext();
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
		return new FACH_MeasurementOccasionInfo_LCR_r4_ext();
	    case 1:
		return new MeasurementControlSysInfo_LCR_r4_ext();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "fach_MeasurementOccasionInfo_LCR_Ext"
    public FACH_MeasurementOccasionInfo_LCR_r4_ext getFach_MeasurementOccasionInfo_LCR_Ext()
    {
	return (FACH_MeasurementOccasionInfo_LCR_r4_ext)mComponents[0];
    }
    
    public void setFach_MeasurementOccasionInfo_LCR_Ext(FACH_MeasurementOccasionInfo_LCR_r4_ext fach_MeasurementOccasionInfo_LCR_Ext)
    {
	mComponents[0] = fach_MeasurementOccasionInfo_LCR_Ext;
    }
    
    public boolean hasFach_MeasurementOccasionInfo_LCR_Ext()
    {
	return componentIsPresent(0);
    }
    
    public void deleteFach_MeasurementOccasionInfo_LCR_Ext()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "measurementControlSysInfo_LCR"
    public MeasurementControlSysInfo_LCR_r4_ext getMeasurementControlSysInfo_LCR()
    {
	return (MeasurementControlSysInfo_LCR_r4_ext)mComponents[1];
    }
    
    public void setMeasurementControlSysInfo_LCR(MeasurementControlSysInfo_LCR_r4_ext measurementControlSysInfo_LCR)
    {
	mComponents[1] = measurementControlSysInfo_LCR;
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
	    "SysInfoType11_v4b0ext_IEs"
	),
	new QName (
	    "InformationElements",
	    "SysInfoType11-v4b0ext-IEs"
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
				"FACH_MeasurementOccasionInfo_LCR_r4_ext"
			    ),
			    new QName (
				"InformationElements",
				"FACH-MeasurementOccasionInfo-LCR-r4-ext"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "FACH_MeasurementOccasionInfo_LCR_r4_ext"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "FACH_MeasurementOccasionInfo_LCR_r4_ext"
				)
			    ),
			    0
			)
		    ),
		    "fach-MeasurementOccasionInfo-LCR-Ext",
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
				"MeasurementControlSysInfo_LCR_r4_ext"
			    ),
			    new QName (
				"InformationElements",
				"MeasurementControlSysInfo-LCR-r4-ext"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "MeasurementControlSysInfo_LCR_r4_ext"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "MeasurementControlSysInfo_LCR_r4_ext"
				)
			    ),
			    0
			)
		    ),
		    "measurementControlSysInfo-LCR",
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
     * Get the type descriptor (TypeInfo) of 'this' SysInfoType11_v4b0ext_IEs object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' SysInfoType11_v4b0ext_IEs object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for SysInfoType11_v4b0ext_IEs
