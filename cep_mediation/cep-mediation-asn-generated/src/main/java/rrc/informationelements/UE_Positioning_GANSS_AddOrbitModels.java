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
 * Define the ASN1 Type UE_Positioning_GANSS_AddOrbitModels from ASN1 Module InformationElements.
 * @see Sequence
 */

public class UE_Positioning_GANSS_AddOrbitModels extends Sequence {
    
    /**
     * The default constructor.
     */
    public UE_Positioning_GANSS_AddOrbitModels()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public UE_Positioning_GANSS_AddOrbitModels(NavModel_NAVKeplerianSet navKeplerianSet, 
		    NavModel_CNAVKeplerianSet cnavKeplerianSet, 
		    NavModel_GLONASSecef glonassECEF, 
		    NavModel_SBASecef sbasECEF)
    {
	setNavKeplerianSet(navKeplerianSet);
	setCnavKeplerianSet(cnavKeplerianSet);
	setGlonassECEF(glonassECEF);
	setSbasECEF(sbasECEF);
    }
    
    public void initComponents()
    {
	mComponents[0] = new NavModel_NAVKeplerianSet();
	mComponents[1] = new NavModel_CNAVKeplerianSet();
	mComponents[2] = new NavModel_GLONASSecef();
	mComponents[3] = new NavModel_SBASecef();
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
		return new NavModel_NAVKeplerianSet();
	    case 1:
		return new NavModel_CNAVKeplerianSet();
	    case 2:
		return new NavModel_GLONASSecef();
	    case 3:
		return new NavModel_SBASecef();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "navKeplerianSet"
    public NavModel_NAVKeplerianSet getNavKeplerianSet()
    {
	return (NavModel_NAVKeplerianSet)mComponents[0];
    }
    
    public void setNavKeplerianSet(NavModel_NAVKeplerianSet navKeplerianSet)
    {
	mComponents[0] = navKeplerianSet;
    }
    
    public boolean hasNavKeplerianSet()
    {
	return componentIsPresent(0);
    }
    
    public void deleteNavKeplerianSet()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "cnavKeplerianSet"
    public NavModel_CNAVKeplerianSet getCnavKeplerianSet()
    {
	return (NavModel_CNAVKeplerianSet)mComponents[1];
    }
    
    public void setCnavKeplerianSet(NavModel_CNAVKeplerianSet cnavKeplerianSet)
    {
	mComponents[1] = cnavKeplerianSet;
    }
    
    public boolean hasCnavKeplerianSet()
    {
	return componentIsPresent(1);
    }
    
    public void deleteCnavKeplerianSet()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "glonassECEF"
    public NavModel_GLONASSecef getGlonassECEF()
    {
	return (NavModel_GLONASSecef)mComponents[2];
    }
    
    public void setGlonassECEF(NavModel_GLONASSecef glonassECEF)
    {
	mComponents[2] = glonassECEF;
    }
    
    public boolean hasGlonassECEF()
    {
	return componentIsPresent(2);
    }
    
    public void deleteGlonassECEF()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "sbasECEF"
    public NavModel_SBASecef getSbasECEF()
    {
	return (NavModel_SBASecef)mComponents[3];
    }
    
    public void setSbasECEF(NavModel_SBASecef sbasECEF)
    {
	mComponents[3] = sbasECEF;
    }
    
    public boolean hasSbasECEF()
    {
	return componentIsPresent(3);
    }
    
    public void deleteSbasECEF()
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
	    "UE_Positioning_GANSS_AddOrbitModels"
	),
	new QName (
	    "InformationElements",
	    "UE-Positioning-GANSS-AddOrbitModels"
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
				"NavModel_NAVKeplerianSet"
			    ),
			    new QName (
				"InformationElements",
				"NavModel-NAVKeplerianSet"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "NavModel_NAVKeplerianSet"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "NavModel_NAVKeplerianSet"
				)
			    ),
			    0
			)
		    ),
		    "navKeplerianSet",
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
				"NavModel_CNAVKeplerianSet"
			    ),
			    new QName (
				"InformationElements",
				"NavModel-CNAVKeplerianSet"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "NavModel_CNAVKeplerianSet"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "NavModel_CNAVKeplerianSet"
				)
			    ),
			    0
			)
		    ),
		    "cnavKeplerianSet",
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
				"NavModel_GLONASSecef"
			    ),
			    new QName (
				"InformationElements",
				"NavModel-GLONASSecef"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "NavModel_GLONASSecef"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "NavModel_GLONASSecef"
				)
			    ),
			    0
			)
		    ),
		    "glonassECEF",
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
				"NavModel_SBASecef"
			    ),
			    new QName (
				"InformationElements",
				"NavModel-SBASecef"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "NavModel_SBASecef"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "NavModel_SBASecef"
				)
			    ),
			    0
			)
		    ),
		    "sbasECEF",
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
			new TagDecoderElement((short)0x8000, 0),
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3)
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
     * Get the type descriptor (TypeInfo) of 'this' UE_Positioning_GANSS_AddOrbitModels object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UE_Positioning_GANSS_AddOrbitModels object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UE_Positioning_GANSS_AddOrbitModels
