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
 * Define the ASN1 Type Ganss_Sat_Info_Nav from ASN1 Module InformationElements.
 * @see Sequence
 */

public class Ganss_Sat_Info_Nav extends Sequence {
    
    /**
     * The default constructor.
     */
    public Ganss_Sat_Info_Nav()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public Ganss_Sat_Info_Nav(INTEGER satId, BitString svHealth, 
		    BitString iod, 
		    UE_Positioning_GANSS_ClockModel ganssClockModel, 
		    UE_Positioning_GANSS_OrbitModel ganssOrbitModel)
    {
	setSatId(satId);
	setSvHealth(svHealth);
	setIod(iod);
	setGanssClockModel(ganssClockModel);
	setGanssOrbitModel(ganssOrbitModel);
    }
    
    /**
     * Construct with components.
     */
    public Ganss_Sat_Info_Nav(long satId, BitString svHealth, BitString iod, 
		    UE_Positioning_GANSS_ClockModel ganssClockModel, 
		    UE_Positioning_GANSS_OrbitModel ganssOrbitModel)
    {
	this(new INTEGER(satId), svHealth, iod, ganssClockModel, 
	     ganssOrbitModel);
    }
    
    public void initComponents()
    {
	mComponents[0] = new INTEGER();
	mComponents[1] = new BitString();
	mComponents[2] = new BitString();
	mComponents[3] = new UE_Positioning_GANSS_ClockModel();
	mComponents[4] = new UE_Positioning_GANSS_OrbitModel();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[5];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new INTEGER();
	    case 1:
		return new BitString();
	    case 2:
		return new BitString();
	    case 3:
		return new UE_Positioning_GANSS_ClockModel();
	    case 4:
		return new UE_Positioning_GANSS_OrbitModel();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "satId"
    public long getSatId()
    {
	return ((INTEGER)mComponents[0]).longValue();
    }
    
    public void setSatId(long satId)
    {
	setSatId(new INTEGER(satId));
    }
    
    public void setSatId(INTEGER satId)
    {
	mComponents[0] = satId;
    }
    
    
    // Methods for field "svHealth"
    public BitString getSvHealth()
    {
	return (BitString)mComponents[1];
    }
    
    public void setSvHealth(BitString svHealth)
    {
	mComponents[1] = svHealth;
    }
    
    
    // Methods for field "iod"
    public BitString getIod()
    {
	return (BitString)mComponents[2];
    }
    
    public void setIod(BitString iod)
    {
	mComponents[2] = iod;
    }
    
    
    // Methods for field "ganssClockModel"
    public UE_Positioning_GANSS_ClockModel getGanssClockModel()
    {
	return (UE_Positioning_GANSS_ClockModel)mComponents[3];
    }
    
    public void setGanssClockModel(UE_Positioning_GANSS_ClockModel ganssClockModel)
    {
	mComponents[3] = ganssClockModel;
    }
    
    
    // Methods for field "ganssOrbitModel"
    public UE_Positioning_GANSS_OrbitModel getGanssOrbitModel()
    {
	return (UE_Positioning_GANSS_OrbitModel)mComponents[4];
    }
    
    public void setGanssOrbitModel(UE_Positioning_GANSS_OrbitModel ganssOrbitModel)
    {
	mComponents[4] = ganssOrbitModel;
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
	    "Ganss_Sat_Info_Nav"
	),
	new QName (
	    "InformationElements",
	    "Ganss-Sat-Info-Nav"
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
				    new com.oss.asn1.INTEGER(63),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(63)
			    ),
			    null
			)
		    ),
		    "satId",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
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
				    new com.oss.asn1.INTEGER(5)
				)
			    ),
			    new Bounds (
				new java.lang.Long(5),
				new java.lang.Long(5)
			    ),
			    null
			)
		    ),
		    "svHealth",
		    1,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
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
				    new com.oss.asn1.INTEGER(10)
				)
			    ),
			    new Bounds (
				new java.lang.Long(10),
				new java.lang.Long(10)
			    ),
			    null
			)
		    ),
		    "iod",
		    2,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"UE_Positioning_GANSS_ClockModel"
			    ),
			    new QName (
				"InformationElements",
				"UE-Positioning-GANSS-ClockModel"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_GANSS_ClockModel"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_GANSS_ClockModel"
				)
			    ),
			    0
			)
		    ),
		    "ganssClockModel",
		    3,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8004
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"UE_Positioning_GANSS_OrbitModel"
			    ),
			    new QName (
				"InformationElements",
				"UE-Positioning-GANSS-OrbitModel"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_GANSS_OrbitModel"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_GANSS_OrbitModel"
				)
			    ),
			    0
			)
		    ),
		    "ganssOrbitModel",
		    4,
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
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8004, 4)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' Ganss_Sat_Info_Nav object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' Ganss_Sat_Info_Nav object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for Ganss_Sat_Info_Nav
