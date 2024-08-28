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
 * Define the ASN1 Type SysInfoType15_v770ext_IEs from ASN1 Module InformationElements.
 * @see Sequence
 */

public class SysInfoType15_v770ext_IEs extends Sequence {
    
    /**
     * The default constructor.
     */
    public SysInfoType15_v770ext_IEs()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public SysInfoType15_v770ext_IEs(UE_Positioning_GPS_ReferenceTime_v770ext ue_Positioning_GPS_ReferenceTime)
    {
	setUe_Positioning_GPS_ReferenceTime(ue_Positioning_GPS_ReferenceTime);
    }
    
    public void initComponents()
    {
	mComponents[0] = new UE_Positioning_GPS_ReferenceTime_v770ext();
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
		return new UE_Positioning_GPS_ReferenceTime_v770ext();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "ue_Positioning_GPS_ReferenceTime"
    public UE_Positioning_GPS_ReferenceTime_v770ext getUe_Positioning_GPS_ReferenceTime()
    {
	return (UE_Positioning_GPS_ReferenceTime_v770ext)mComponents[0];
    }
    
    public void setUe_Positioning_GPS_ReferenceTime(UE_Positioning_GPS_ReferenceTime_v770ext ue_Positioning_GPS_ReferenceTime)
    {
	mComponents[0] = ue_Positioning_GPS_ReferenceTime;
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
	    "SysInfoType15_v770ext_IEs"
	),
	new QName (
	    "InformationElements",
	    "SysInfoType15-v770ext-IEs"
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
				"UE_Positioning_GPS_ReferenceTime_v770ext"
			    ),
			    new QName (
				"InformationElements",
				"UE-Positioning-GPS-ReferenceTime-v770ext"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_GPS_ReferenceTime_v770ext"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_GPS_ReferenceTime_v770ext"
				)
			    ),
			    0
			)
		    ),
		    "ue-Positioning-GPS-ReferenceTime",
		    0,
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
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' SysInfoType15_v770ext_IEs object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' SysInfoType15_v770ext_IEs object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for SysInfoType15_v770ext_IEs
