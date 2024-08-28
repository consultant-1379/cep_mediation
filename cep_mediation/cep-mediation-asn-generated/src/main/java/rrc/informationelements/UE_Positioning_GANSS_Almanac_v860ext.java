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
 * Define the ASN1 Type UE_Positioning_GANSS_Almanac_v860ext from ASN1 Module InformationElements.
 * @see Sequence
 */

public class UE_Positioning_GANSS_Almanac_v860ext extends Sequence {
    
    /**
     * The default constructor.
     */
    public UE_Positioning_GANSS_Almanac_v860ext()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public UE_Positioning_GANSS_Almanac_v860ext(ALM_NAVKeplerianSet alm_keplerianNAVAlmanac, 
		    ALM_ReducedKeplerianSet alm_keplerianReducedAlmanac, 
		    ALM_MidiAlmanacSet alm_keplerianMidiAlmanac, 
		    ALM_GlonassAlmanacSet alm_keplerianGLONASS, 
		    ALM_ECEFsbasAlmanacSet alm_ecefSBASAlmanac)
    {
	setAlm_keplerianNAVAlmanac(alm_keplerianNAVAlmanac);
	setAlm_keplerianReducedAlmanac(alm_keplerianReducedAlmanac);
	setAlm_keplerianMidiAlmanac(alm_keplerianMidiAlmanac);
	setAlm_keplerianGLONASS(alm_keplerianGLONASS);
	setAlm_ecefSBASAlmanac(alm_ecefSBASAlmanac);
    }
    
    public void initComponents()
    {
	mComponents[0] = new ALM_NAVKeplerianSet();
	mComponents[1] = new ALM_ReducedKeplerianSet();
	mComponents[2] = new ALM_MidiAlmanacSet();
	mComponents[3] = new ALM_GlonassAlmanacSet();
	mComponents[4] = new ALM_ECEFsbasAlmanacSet();
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
		return new ALM_NAVKeplerianSet();
	    case 1:
		return new ALM_ReducedKeplerianSet();
	    case 2:
		return new ALM_MidiAlmanacSet();
	    case 3:
		return new ALM_GlonassAlmanacSet();
	    case 4:
		return new ALM_ECEFsbasAlmanacSet();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "alm_keplerianNAVAlmanac"
    public ALM_NAVKeplerianSet getAlm_keplerianNAVAlmanac()
    {
	return (ALM_NAVKeplerianSet)mComponents[0];
    }
    
    public void setAlm_keplerianNAVAlmanac(ALM_NAVKeplerianSet alm_keplerianNAVAlmanac)
    {
	mComponents[0] = alm_keplerianNAVAlmanac;
    }
    
    public boolean hasAlm_keplerianNAVAlmanac()
    {
	return componentIsPresent(0);
    }
    
    public void deleteAlm_keplerianNAVAlmanac()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "alm_keplerianReducedAlmanac"
    public ALM_ReducedKeplerianSet getAlm_keplerianReducedAlmanac()
    {
	return (ALM_ReducedKeplerianSet)mComponents[1];
    }
    
    public void setAlm_keplerianReducedAlmanac(ALM_ReducedKeplerianSet alm_keplerianReducedAlmanac)
    {
	mComponents[1] = alm_keplerianReducedAlmanac;
    }
    
    public boolean hasAlm_keplerianReducedAlmanac()
    {
	return componentIsPresent(1);
    }
    
    public void deleteAlm_keplerianReducedAlmanac()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "alm_keplerianMidiAlmanac"
    public ALM_MidiAlmanacSet getAlm_keplerianMidiAlmanac()
    {
	return (ALM_MidiAlmanacSet)mComponents[2];
    }
    
    public void setAlm_keplerianMidiAlmanac(ALM_MidiAlmanacSet alm_keplerianMidiAlmanac)
    {
	mComponents[2] = alm_keplerianMidiAlmanac;
    }
    
    public boolean hasAlm_keplerianMidiAlmanac()
    {
	return componentIsPresent(2);
    }
    
    public void deleteAlm_keplerianMidiAlmanac()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "alm_keplerianGLONASS"
    public ALM_GlonassAlmanacSet getAlm_keplerianGLONASS()
    {
	return (ALM_GlonassAlmanacSet)mComponents[3];
    }
    
    public void setAlm_keplerianGLONASS(ALM_GlonassAlmanacSet alm_keplerianGLONASS)
    {
	mComponents[3] = alm_keplerianGLONASS;
    }
    
    public boolean hasAlm_keplerianGLONASS()
    {
	return componentIsPresent(3);
    }
    
    public void deleteAlm_keplerianGLONASS()
    {
	setComponentAbsent(3);
    }
    
    
    // Methods for field "alm_ecefSBASAlmanac"
    public ALM_ECEFsbasAlmanacSet getAlm_ecefSBASAlmanac()
    {
	return (ALM_ECEFsbasAlmanacSet)mComponents[4];
    }
    
    public void setAlm_ecefSBASAlmanac(ALM_ECEFsbasAlmanacSet alm_ecefSBASAlmanac)
    {
	mComponents[4] = alm_ecefSBASAlmanac;
    }
    
    public boolean hasAlm_ecefSBASAlmanac()
    {
	return componentIsPresent(4);
    }
    
    public void deleteAlm_ecefSBASAlmanac()
    {
	setComponentAbsent(4);
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
	    "UE_Positioning_GANSS_Almanac_v860ext"
	),
	new QName (
	    "InformationElements",
	    "UE-Positioning-GANSS-Almanac-v860ext"
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
		    4,
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
			new TagDecoderElement((short)0x8000, 0),
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4)
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
     * Get the type descriptor (TypeInfo) of 'this' UE_Positioning_GANSS_Almanac_v860ext object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UE_Positioning_GANSS_Almanac_v860ext object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UE_Positioning_GANSS_Almanac_v860ext
