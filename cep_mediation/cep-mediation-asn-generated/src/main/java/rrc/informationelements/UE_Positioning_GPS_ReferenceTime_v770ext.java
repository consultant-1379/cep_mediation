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
 * Define the ASN1 Type UE_Positioning_GPS_ReferenceTime_v770ext from ASN1 Module InformationElements.
 * @see Sequence
 */

public class UE_Positioning_GPS_ReferenceTime_v770ext extends Sequence {
    
    /**
     * The default constructor.
     */
    public UE_Positioning_GPS_ReferenceTime_v770ext()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public UE_Positioning_GPS_ReferenceTime_v770ext(UE_Positioning_GPS_ReferenceTimeUncertainty ue_Positioning_GPS_ReferenceTimeUncertainty)
    {
	setUe_Positioning_GPS_ReferenceTimeUncertainty(ue_Positioning_GPS_ReferenceTimeUncertainty);
    }
    
    public void initComponents()
    {
	mComponents[0] = new UE_Positioning_GPS_ReferenceTimeUncertainty();
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
		return new UE_Positioning_GPS_ReferenceTimeUncertainty();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "ue_Positioning_GPS_ReferenceTimeUncertainty"
    public UE_Positioning_GPS_ReferenceTimeUncertainty getUe_Positioning_GPS_ReferenceTimeUncertainty()
    {
	return (UE_Positioning_GPS_ReferenceTimeUncertainty)mComponents[0];
    }
    
    public void setUe_Positioning_GPS_ReferenceTimeUncertainty(UE_Positioning_GPS_ReferenceTimeUncertainty ue_Positioning_GPS_ReferenceTimeUncertainty)
    {
	mComponents[0] = ue_Positioning_GPS_ReferenceTimeUncertainty;
    }
    
    public boolean hasUe_Positioning_GPS_ReferenceTimeUncertainty()
    {
	return componentIsPresent(0);
    }
    
    public void deleteUe_Positioning_GPS_ReferenceTimeUncertainty()
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
	    "UE_Positioning_GPS_ReferenceTime_v770ext"
	),
	new QName (
	    "InformationElements",
	    "UE-Positioning-GPS-ReferenceTime-v770ext"
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
				"UE_Positioning_GPS_ReferenceTimeUncertainty"
			    ),
			    new QName (
				"InformationElements",
				"UE-Positioning-GPS-ReferenceTimeUncertainty"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new UE_Positioning_GPS_ReferenceTimeUncertainty(0), 
				    new UE_Positioning_GPS_ReferenceTimeUncertainty(127),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(127)
			    ),
			    null
			)
		    ),
		    "ue-Positioning-GPS-ReferenceTimeUncertainty",
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
     * Get the type descriptor (TypeInfo) of 'this' UE_Positioning_GPS_ReferenceTime_v770ext object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UE_Positioning_GPS_ReferenceTime_v770ext object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UE_Positioning_GPS_ReferenceTime_v770ext
