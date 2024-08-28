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
 * Define the ASN1 Type UE_Positioning_GANSS_IonosphericModel from ASN1 Module InformationElements.
 * @see Sequence
 */

public class UE_Positioning_GANSS_IonosphericModel extends Sequence {
    
    /**
     * The default constructor.
     */
    public UE_Positioning_GANSS_IonosphericModel()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public UE_Positioning_GANSS_IonosphericModel(BitString alpha_zero_ionos, 
		    BitString alpha_one_ionos, BitString alpha_two_ionos, 
		    GANSS_Storm_Flag gANSS_storm_flags)
    {
	setAlpha_zero_ionos(alpha_zero_ionos);
	setAlpha_one_ionos(alpha_one_ionos);
	setAlpha_two_ionos(alpha_two_ionos);
	setGANSS_storm_flags(gANSS_storm_flags);
    }
    
    /**
     * Construct with required components.
     */
    public UE_Positioning_GANSS_IonosphericModel(BitString alpha_zero_ionos, 
		    BitString alpha_one_ionos, BitString alpha_two_ionos)
    {
	setAlpha_zero_ionos(alpha_zero_ionos);
	setAlpha_one_ionos(alpha_one_ionos);
	setAlpha_two_ionos(alpha_two_ionos);
    }
    
    public void initComponents()
    {
	mComponents[0] = new BitString();
	mComponents[1] = new BitString();
	mComponents[2] = new BitString();
	mComponents[3] = new GANSS_Storm_Flag();
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
		return new BitString();
	    case 2:
		return new BitString();
	    case 3:
		return new GANSS_Storm_Flag();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "alpha_zero_ionos"
    public BitString getAlpha_zero_ionos()
    {
	return (BitString)mComponents[0];
    }
    
    public void setAlpha_zero_ionos(BitString alpha_zero_ionos)
    {
	mComponents[0] = alpha_zero_ionos;
    }
    
    
    // Methods for field "alpha_one_ionos"
    public BitString getAlpha_one_ionos()
    {
	return (BitString)mComponents[1];
    }
    
    public void setAlpha_one_ionos(BitString alpha_one_ionos)
    {
	mComponents[1] = alpha_one_ionos;
    }
    
    
    // Methods for field "alpha_two_ionos"
    public BitString getAlpha_two_ionos()
    {
	return (BitString)mComponents[2];
    }
    
    public void setAlpha_two_ionos(BitString alpha_two_ionos)
    {
	mComponents[2] = alpha_two_ionos;
    }
    
    
    // Methods for field "gANSS_storm_flags"
    public GANSS_Storm_Flag getGANSS_storm_flags()
    {
	return (GANSS_Storm_Flag)mComponents[3];
    }
    
    public void setGANSS_storm_flags(GANSS_Storm_Flag gANSS_storm_flags)
    {
	mComponents[3] = gANSS_storm_flags;
    }
    
    public boolean hasGANSS_storm_flags()
    {
	return componentIsPresent(3);
    }
    
    public void deleteGANSS_storm_flags()
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
	    "UE_Positioning_GANSS_IonosphericModel"
	),
	new QName (
	    "InformationElements",
	    "UE-Positioning-GANSS-IonosphericModel"
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
				    new com.oss.asn1.INTEGER(12)
				)
			    ),
			    new Bounds (
				new java.lang.Long(12),
				new java.lang.Long(12)
			    ),
			    null
			)
		    ),
		    "alpha-zero-ionos",
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
				    new com.oss.asn1.INTEGER(12)
				)
			    ),
			    new Bounds (
				new java.lang.Long(12),
				new java.lang.Long(12)
			    ),
			    null
			)
		    ),
		    "alpha-one-ionos",
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
				    new com.oss.asn1.INTEGER(12)
				)
			    ),
			    new Bounds (
				new java.lang.Long(12),
				new java.lang.Long(12)
			    ),
			    null
			)
		    ),
		    "alpha-two-ionos",
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
				"GANSS_Storm_Flag"
			    ),
			    new QName (
				"InformationElements",
				"GANSS-Storm-Flag"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "GANSS_Storm_Flag"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "GANSS_Storm_Flag"
				)
			    ),
			    0
			)
		    ),
		    "gANSS-storm-flags",
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
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' UE_Positioning_GANSS_IonosphericModel object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UE_Positioning_GANSS_IonosphericModel object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UE_Positioning_GANSS_IonosphericModel
