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
 * Define the ASN1 Type UE_Positioning_GANSS_AuxiliaryInfo from ASN1 Module InformationElements.
 * @see Choice
 */

public class UE_Positioning_GANSS_AuxiliaryInfo extends Choice {
    
    /**
     * The default constructor.
     */
    public UE_Positioning_GANSS_AuxiliaryInfo()
    {
    }
    
    public static final  int  ganssID1_chosen = 1;
    public static final  int  ganssID3_chosen = 2;
    
    // Methods for field "ganssID1"
    public static UE_Positioning_GANSS_AuxiliaryInfo createUE_Positioning_GANSS_AuxiliaryInfoWithGanssID1(AuxInfoGANSS_ID1 ganssID1)
    {
	UE_Positioning_GANSS_AuxiliaryInfo __object = new UE_Positioning_GANSS_AuxiliaryInfo();

	__object.setGanssID1(ganssID1);
	return __object;
    }
    
    public boolean hasGanssID1()
    {
	return getChosenFlag() == ganssID1_chosen;
    }
    
    public void setGanssID1(AuxInfoGANSS_ID1 ganssID1)
    {
	setChosenValue(ganssID1);
	setChosenFlag(ganssID1_chosen);
    }
    
    
    // Methods for field "ganssID3"
    public static UE_Positioning_GANSS_AuxiliaryInfo createUE_Positioning_GANSS_AuxiliaryInfoWithGanssID3(AuxInfoGANSS_ID3 ganssID3)
    {
	UE_Positioning_GANSS_AuxiliaryInfo __object = new UE_Positioning_GANSS_AuxiliaryInfo();

	__object.setGanssID3(ganssID3);
	return __object;
    }
    
    public boolean hasGanssID3()
    {
	return getChosenFlag() == ganssID3_chosen;
    }
    
    public void setGanssID3(AuxInfoGANSS_ID3 ganssID3)
    {
	setChosenValue(ganssID3);
	setChosenFlag(ganssID3_chosen);
    }
    
    
    // Method to create a specific choice instance
    public AbstractData createInstance(int chosen)
    {
	switch (chosen) {
	    case ganssID1_chosen:
		return new AuxInfoGANSS_ID1();
	    case ganssID3_chosen:
		return new AuxInfoGANSS_ID3();
	    default:
		throw new InternalError("Choice.createInstance()");
	}
	
    }
    
    /**
     * Initialize the type descriptor.
     */
    private static final ChoiceInfo c_typeinfo = new ChoiceInfo (
	new Tags (
	    null
	),
	new QName (
	    "rrc.informationelements",
	    "UE_Positioning_GANSS_AuxiliaryInfo"
	),
	new QName (
	    "InformationElements",
	    "UE-Positioning-GANSS-AuxiliaryInfo"
	),
	12314,
	null,
	new Fields (
	    new FieldInfo[] {
		new FieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"AuxInfoGANSS_ID1"
			    ),
			    new QName (
				"InformationElements",
				"AuxInfoGANSS-ID1"
			    ),
			    12314,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new com.oss.asn1.INTEGER(1), 
					new com.oss.asn1.INTEGER(64),
					0
				    )
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(64)
			    ),
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "AuxInfoGANSS_ID1_element"
				)
			    )
			)
		    ),
		    "ganssID1",
		    0,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"AuxInfoGANSS_ID3"
			    ),
			    new QName (
				"InformationElements",
				"AuxInfoGANSS-ID3"
			    ),
			    12314,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new com.oss.asn1.INTEGER(1), 
					new com.oss.asn1.INTEGER(64),
					0
				    )
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(64)
			    ),
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "AuxInfoGANSS_ID3_element"
				)
			    )
			)
		    ),
		    "ganssID3",
		    1,
		    2
		)
	    }
	),
	0,
	new TagDecoder (
	    new TagDecoderElement[] {
		new TagDecoderElement((short)0x8000, 0),
		new TagDecoderElement((short)0x8001, 1)
	    }
	)
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' UE_Positioning_GANSS_AuxiliaryInfo object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UE_Positioning_GANSS_AuxiliaryInfo object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UE_Positioning_GANSS_AuxiliaryInfo
