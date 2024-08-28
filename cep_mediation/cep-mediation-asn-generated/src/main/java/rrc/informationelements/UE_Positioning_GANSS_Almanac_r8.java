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
 * Define the ASN1 Type UE_Positioning_GANSS_Almanac_r8 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class UE_Positioning_GANSS_Almanac_r8 extends Sequence {
    
    /**
     * The default constructor.
     */
    public UE_Positioning_GANSS_Almanac_r8()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public UE_Positioning_GANSS_Almanac_r8(INTEGER ganss_wk_number, 
		    ALM_keplerianParameters alm_keplerianParameters, 
		    ALM_NAVKeplerianSet alm_keplerianNAVAlmanac, 
		    ALM_ReducedKeplerianSet alm_keplerianReducedAlmanac, 
		    ALM_MidiAlmanacSet alm_keplerianMidiAlmanac, 
		    ALM_GlonassAlmanacSet alm_keplerianGLONASS, 
		    ALM_ECEFsbasAlmanacSet alm_ecefSBASAlmanac)
    {
	setGanss_wk_number(ganss_wk_number);
	setAlm_keplerianParameters(alm_keplerianParameters);
	setAlm_keplerianNAVAlmanac(alm_keplerianNAVAlmanac);
	setAlm_keplerianReducedAlmanac(alm_keplerianReducedAlmanac);
	setAlm_keplerianMidiAlmanac(alm_keplerianMidiAlmanac);
	setAlm_keplerianGLONASS(alm_keplerianGLONASS);
	setAlm_ecefSBASAlmanac(alm_ecefSBASAlmanac);
    }
    
    /**
     * Construct with components.
     */
    public UE_Positioning_GANSS_Almanac_r8(long ganss_wk_number, 
		    ALM_keplerianParameters alm_keplerianParameters, 
		    ALM_NAVKeplerianSet alm_keplerianNAVAlmanac, 
		    ALM_ReducedKeplerianSet alm_keplerianReducedAlmanac, 
		    ALM_MidiAlmanacSet alm_keplerianMidiAlmanac, 
		    ALM_GlonassAlmanacSet alm_keplerianGLONASS, 
		    ALM_ECEFsbasAlmanacSet alm_ecefSBASAlmanac)
    {
	this(new INTEGER(ganss_wk_number), alm_keplerianParameters, 
	     alm_keplerianNAVAlmanac, alm_keplerianReducedAlmanac, 
	     alm_keplerianMidiAlmanac, alm_keplerianGLONASS, 
	     alm_ecefSBASAlmanac);
    }
    
    /**
     * Construct with required components.
     */
    public UE_Positioning_GANSS_Almanac_r8(long ganss_wk_number)
    {
	setGanss_wk_number(ganss_wk_number);
    }
    
    public void initComponents()
    {
	mComponents[0] = new INTEGER();
	mComponents[1] = new ALM_keplerianParameters();
	mComponents[2] = new ALM_NAVKeplerianSet();
	mComponents[3] = new ALM_ReducedKeplerianSet();
	mComponents[4] = new ALM_MidiAlmanacSet();
	mComponents[5] = new ALM_GlonassAlmanacSet();
	mComponents[6] = new ALM_ECEFsbasAlmanacSet();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[7];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new INTEGER();
	    case 1:
		return new ALM_keplerianParameters();
	    case 2:
		return new ALM_NAVKeplerianSet();
	    case 3:
		return new ALM_ReducedKeplerianSet();
	    case 4:
		return new ALM_MidiAlmanacSet();
	    case 5:
		return new ALM_GlonassAlmanacSet();
	    case 6:
		return new ALM_ECEFsbasAlmanacSet();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "ganss_wk_number"
    public long getGanss_wk_number()
    {
	return ((INTEGER)mComponents[0]).longValue();
    }
    
    public void setGanss_wk_number(long ganss_wk_number)
    {
	setGanss_wk_number(new INTEGER(ganss_wk_number));
    }
    
    public void setGanss_wk_number(INTEGER ganss_wk_number)
    {
	mComponents[0] = ganss_wk_number;
    }
    
    
    // Methods for field "alm_keplerianParameters"
    public ALM_keplerianParameters getAlm_keplerianParameters()
    {
	return (ALM_keplerianParameters)mComponents[1];
    }
    
    public void setAlm_keplerianParameters(ALM_keplerianParameters alm_keplerianParameters)
    {
	mComponents[1] = alm_keplerianParameters;
    }
    
    public boolean hasAlm_keplerianParameters()
    {
	return componentIsPresent(1);
    }
    
    public void deleteAlm_keplerianParameters()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "alm_keplerianNAVAlmanac"
    public ALM_NAVKeplerianSet getAlm_keplerianNAVAlmanac()
    {
	return (ALM_NAVKeplerianSet)mComponents[2];
    }
    
    public void setAlm_keplerianNAVAlmanac(ALM_NAVKeplerianSet alm_keplerianNAVAlmanac)
    {
	mComponents[2] = alm_keplerianNAVAlmanac;
    }
    
    public boolean hasAlm_keplerianNAVAlmanac()
    {
	return componentIsPresent(2);
    }
    
    public void deleteAlm_keplerianNAVAlmanac()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "alm_keplerianReducedAlmanac"
    public ALM_ReducedKeplerianSet getAlm_keplerianReducedAlmanac()
    {
	return (ALM_ReducedKeplerianSet)mComponents[3];
    }
    
    public void setAlm_keplerianReducedAlmanac(ALM_ReducedKeplerianSet alm_keplerianReducedAlmanac)
    {
	mComponents[3] = alm_keplerianReducedAlmanac;
    }
    
    public boolean hasAlm_keplerianReducedAlmanac()
    {
	return componentIsPresent(3);
    }
    
    public void deleteAlm_keplerianReducedAlmanac()
    {
	setComponentAbsent(3);
    }
    
    
    // Methods for field "alm_keplerianMidiAlmanac"
    public ALM_MidiAlmanacSet getAlm_keplerianMidiAlmanac()
    {
	return (ALM_MidiAlmanacSet)mComponents[4];
    }
    
    public void setAlm_keplerianMidiAlmanac(ALM_MidiAlmanacSet alm_keplerianMidiAlmanac)
    {
	mComponents[4] = alm_keplerianMidiAlmanac;
    }
    
    public boolean hasAlm_keplerianMidiAlmanac()
    {
	return componentIsPresent(4);
    }
    
    public void deleteAlm_keplerianMidiAlmanac()
    {
	setComponentAbsent(4);
    }
    
    
    // Methods for field "alm_keplerianGLONASS"
    public ALM_GlonassAlmanacSet getAlm_keplerianGLONASS()
    {
	return (ALM_GlonassAlmanacSet)mComponents[5];
    }
    
    public void setAlm_keplerianGLONASS(ALM_GlonassAlmanacSet alm_keplerianGLONASS)
    {
	mComponents[5] = alm_keplerianGLONASS;
    }
    
    public boolean hasAlm_keplerianGLONASS()
    {
	return componentIsPresent(5);
    }
    
    public void deleteAlm_keplerianGLONASS()
    {
	setComponentAbsent(5);
    }
    
    
    // Methods for field "alm_ecefSBASAlmanac"
    public ALM_ECEFsbasAlmanacSet getAlm_ecefSBASAlmanac()
    {
	return (ALM_ECEFsbasAlmanacSet)mComponents[6];
    }
    
    public void setAlm_ecefSBASAlmanac(ALM_ECEFsbasAlmanacSet alm_ecefSBASAlmanac)
    {
	mComponents[6] = alm_ecefSBASAlmanac;
    }
    
    public boolean hasAlm_ecefSBASAlmanac()
    {
	return componentIsPresent(6);
    }
    
    public void deleteAlm_ecefSBASAlmanac()
    {
	setComponentAbsent(6);
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
	    "UE_Positioning_GANSS_Almanac_r8"
	),
	new QName (
	    "InformationElements",
	    "UE-Positioning-GANSS-Almanac-r8"
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
				    new com.oss.asn1.INTEGER(255),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(255)
			    ),
			    null
			)
		    ),
		    "ganss-wk-number",
		    0,
		    2,
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
				"ALM_keplerianParameters"
			    ),
			    new QName (
				"InformationElements",
				"ALM-keplerianParameters"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "ALM_keplerianParameters"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "ALM_keplerianParameters"
				)
			    ),
			    0
			)
		    ),
		    "alm-keplerianParameters",
		    1,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"ALM_NAVKeplerianSet"
			    ),
			    new QName (
				"InformationElements",
				"ALM-NAVKeplerianSet"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "ALM_NAVKeplerianSet"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "ALM_NAVKeplerianSet"
				)
			    ),
			    0
			)
		    ),
		    "alm-keplerianNAVAlmanac",
		    2,
		    3,
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
				"ALM_ReducedKeplerianSet"
			    ),
			    new QName (
				"InformationElements",
				"ALM-ReducedKeplerianSet"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "ALM_ReducedKeplerianSet"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "ALM_ReducedKeplerianSet"
				)
			    ),
			    0
			)
		    ),
		    "alm-keplerianReducedAlmanac",
		    3,
		    3,
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
				"ALM_MidiAlmanacSet"
			    ),
			    new QName (
				"InformationElements",
				"ALM-MidiAlmanacSet"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "ALM_MidiAlmanacSet"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "ALM_MidiAlmanacSet"
				)
			    ),
			    0
			)
		    ),
		    "alm-keplerianMidiAlmanac",
		    4,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8005
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"ALM_GlonassAlmanacSet"
			    ),
			    new QName (
				"InformationElements",
				"ALM-GlonassAlmanacSet"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "ALM_GlonassAlmanacSet"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "ALM_GlonassAlmanacSet"
				)
			    ),
			    0
			)
		    ),
		    "alm-keplerianGLONASS",
		    5,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8006
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"ALM_ECEFsbasAlmanacSet"
			    ),
			    new QName (
				"InformationElements",
				"ALM-ECEFsbasAlmanacSet"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "ALM_ECEFsbasAlmanacSet"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "ALM_ECEFsbasAlmanacSet"
				)
			    ),
			    0
			)
		    ),
		    "alm-ecefSBASAlmanac",
		    6,
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
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8006, 6)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' UE_Positioning_GANSS_Almanac_r8 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UE_Positioning_GANSS_Almanac_r8 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UE_Positioning_GANSS_Almanac_r8
