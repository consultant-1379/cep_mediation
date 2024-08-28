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
 * Define the ASN1 Type UE_Positioning_GPS_ReferenceTime_va40ext from ASN1 Module InformationElements.
 * @see Sequence
 */

public class UE_Positioning_GPS_ReferenceTime_va40ext extends Sequence {
    
    /**
     * The default constructor.
     */
    public UE_Positioning_GPS_ReferenceTime_va40ext()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public UE_Positioning_GPS_ReferenceTime_va40ext(INTEGER gps_Week_Cycle_Number)
    {
	setGps_Week_Cycle_Number(gps_Week_Cycle_Number);
    }
    
    /**
     * Construct with components.
     */
    public UE_Positioning_GPS_ReferenceTime_va40ext(long gps_Week_Cycle_Number)
    {
	this(new INTEGER(gps_Week_Cycle_Number));
    }
    
    public void initComponents()
    {
	mComponents[0] = new INTEGER();
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
		return new INTEGER();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "gps_Week_Cycle_Number"
    public long getGps_Week_Cycle_Number()
    {
	return ((INTEGER)mComponents[0]).longValue();
    }
    
    public void setGps_Week_Cycle_Number(long gps_Week_Cycle_Number)
    {
	setGps_Week_Cycle_Number(new INTEGER(gps_Week_Cycle_Number));
    }
    
    public void setGps_Week_Cycle_Number(INTEGER gps_Week_Cycle_Number)
    {
	mComponents[0] = gps_Week_Cycle_Number;
    }
    
    public boolean hasGps_Week_Cycle_Number()
    {
	return componentIsPresent(0);
    }
    
    public void deleteGps_Week_Cycle_Number()
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
	    "UE_Positioning_GPS_ReferenceTime_va40ext"
	),
	new QName (
	    "InformationElements",
	    "UE-Positioning-GPS-ReferenceTime-va40ext"
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
				"com.oss.asn1",
				"INTEGER"
			    ),
			    new QName (
				"builtin",
				"INTEGER"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new com.oss.asn1.INTEGER(0), 
				    new com.oss.asn1.INTEGER(7),
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
		    "gps-Week-Cycle-Number",
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
     * Get the type descriptor (TypeInfo) of 'this' UE_Positioning_GPS_ReferenceTime_va40ext object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UE_Positioning_GPS_ReferenceTime_va40ext object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UE_Positioning_GPS_ReferenceTime_va40ext
