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
 * Define the ASN1 Type UE_Positioning_GPS_Almanac_r10 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class UE_Positioning_GPS_Almanac_r10 extends Sequence {
    
    /**
     * The default constructor.
     */
    public UE_Positioning_GPS_Almanac_r10()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public UE_Positioning_GPS_Almanac_r10(BitString wn_a, 
		    BOOLEAN complete_Almanac_Provided, 
		    AlmanacSatInfoList almanacSatInfoList, 
		    BitString sv_GlobalHealth)
    {
	setWn_a(wn_a);
	setComplete_Almanac_Provided(complete_Almanac_Provided);
	setAlmanacSatInfoList(almanacSatInfoList);
	setSv_GlobalHealth(sv_GlobalHealth);
    }
    
    /**
     * Construct with components.
     */
    public UE_Positioning_GPS_Almanac_r10(BitString wn_a, 
		    boolean complete_Almanac_Provided, 
		    AlmanacSatInfoList almanacSatInfoList, 
		    BitString sv_GlobalHealth)
    {
	this(wn_a, new BOOLEAN(complete_Almanac_Provided), 
	     almanacSatInfoList, sv_GlobalHealth);
    }
    
    /**
     * Construct with required components.
     */
    public UE_Positioning_GPS_Almanac_r10(BitString wn_a, 
		    AlmanacSatInfoList almanacSatInfoList)
    {
	setWn_a(wn_a);
	setAlmanacSatInfoList(almanacSatInfoList);
    }
    
    public void initComponents()
    {
	mComponents[0] = new BitString();
	mComponents[1] = new BOOLEAN();
	mComponents[2] = new AlmanacSatInfoList();
	mComponents[3] = new BitString();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[4];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new BitString();
	    case 1:
		return new BOOLEAN();
	    case 2:
		return new AlmanacSatInfoList();
	    case 3:
		return new BitString();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "wn_a"
    public BitString getWn_a()
    {
	return (BitString)mComponents[0];
    }
    
    public void setWn_a(BitString wn_a)
    {
	mComponents[0] = wn_a;
    }
    
    
    // Methods for field "complete_Almanac_Provided"
    public boolean getComplete_Almanac_Provided()
    {
	return ((BOOLEAN)mComponents[1]).booleanValue();
    }
    
    public void setComplete_Almanac_Provided(boolean complete_Almanac_Provided)
    {
	setComplete_Almanac_Provided(new BOOLEAN(complete_Almanac_Provided));
    }
    
    public void setComplete_Almanac_Provided(BOOLEAN complete_Almanac_Provided)
    {
	mComponents[1] = complete_Almanac_Provided;
    }
    
    public boolean hasComplete_Almanac_Provided()
    {
	return componentIsPresent(1);
    }
    
    public void deleteComplete_Almanac_Provided()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "almanacSatInfoList"
    public AlmanacSatInfoList getAlmanacSatInfoList()
    {
	return (AlmanacSatInfoList)mComponents[2];
    }
    
    public void setAlmanacSatInfoList(AlmanacSatInfoList almanacSatInfoList)
    {
	mComponents[2] = almanacSatInfoList;
    }
    
    
    // Methods for field "sv_GlobalHealth"
    public BitString getSv_GlobalHealth()
    {
	return (BitString)mComponents[3];
    }
    
    public void setSv_GlobalHealth(BitString sv_GlobalHealth)
    {
	mComponents[3] = sv_GlobalHealth;
    }
    
    public boolean hasSv_GlobalHealth()
    {
	return componentIsPresent(3);
    }
    
    public void deleteSv_GlobalHealth()
    {
	setComponentAbsent(3);
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
	    "UE_Positioning_GPS_Almanac_r10"
	),
	new QName (
	    "InformationElements",
	    "UE-Positioning-GPS-Almanac-r10"
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
				    new com.oss.asn1.INTEGER(8)
				)
			    ),
			    new Bounds (
				new java.lang.Long(8),
				new java.lang.Long(8)
			    ),
			    null
			)
		    ),
		    "wn-a",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"BOOLEAN"
			    ),
			    new QName (
				"builtin",
				"BOOLEAN"
			    ),
			    12314,
			    null
			)
		    ),
		    "complete-Almanac-Provided",
		    1,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"AlmanacSatInfoList"
			    ),
			    new QName (
				"InformationElements",
				"AlmanacSatInfoList"
			    ),
			    12314,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new com.oss.asn1.INTEGER(1), 
					new com.oss.asn1.INTEGER(16),
					0
				    )
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(16)
			    ),
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "AlmanacSatInfo"
				)
			    )
			)
		    ),
		    "almanacSatInfoList",
		    2,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
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
				    new com.oss.asn1.INTEGER(364)
				)
			    ),
			    new Bounds (
				new java.lang.Long(364),
				new java.lang.Long(364)
			    ),
			    null
			)
		    ),
		    "sv-GlobalHealth",
		    3,
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
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8003, 3)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' UE_Positioning_GPS_Almanac_r10 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UE_Positioning_GPS_Almanac_r10 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UE_Positioning_GPS_Almanac_r10
