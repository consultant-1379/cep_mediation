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
 * Define the ASN1 Type UE_Positioning_GANSS_AddClockModels from ASN1 Module InformationElements.
 * @see Sequence
 */

public class UE_Positioning_GANSS_AddClockModels extends Sequence {
    
    /**
     * The default constructor.
     */
    public UE_Positioning_GANSS_AddClockModels()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public UE_Positioning_GANSS_AddClockModels(NAVclockModel navClockModel, 
		    CNAVclockModel cnavClockModel, 
		    GLONASSclockModel glonassClockModel, 
		    SBASclockModel sbasClockModel)
    {
	setNavClockModel(navClockModel);
	setCnavClockModel(cnavClockModel);
	setGlonassClockModel(glonassClockModel);
	setSbasClockModel(sbasClockModel);
    }
    
    public void initComponents()
    {
	mComponents[0] = new NAVclockModel();
	mComponents[1] = new CNAVclockModel();
	mComponents[2] = new GLONASSclockModel();
	mComponents[3] = new SBASclockModel();
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
		return new NAVclockModel();
	    case 1:
		return new CNAVclockModel();
	    case 2:
		return new GLONASSclockModel();
	    case 3:
		return new SBASclockModel();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "navClockModel"
    public NAVclockModel getNavClockModel()
    {
	return (NAVclockModel)mComponents[0];
    }
    
    public void setNavClockModel(NAVclockModel navClockModel)
    {
	mComponents[0] = navClockModel;
    }
    
    public boolean hasNavClockModel()
    {
	return componentIsPresent(0);
    }
    
    public void deleteNavClockModel()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "cnavClockModel"
    public CNAVclockModel getCnavClockModel()
    {
	return (CNAVclockModel)mComponents[1];
    }
    
    public void setCnavClockModel(CNAVclockModel cnavClockModel)
    {
	mComponents[1] = cnavClockModel;
    }
    
    public boolean hasCnavClockModel()
    {
	return componentIsPresent(1);
    }
    
    public void deleteCnavClockModel()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "glonassClockModel"
    public GLONASSclockModel getGlonassClockModel()
    {
	return (GLONASSclockModel)mComponents[2];
    }
    
    public void setGlonassClockModel(GLONASSclockModel glonassClockModel)
    {
	mComponents[2] = glonassClockModel;
    }
    
    public boolean hasGlonassClockModel()
    {
	return componentIsPresent(2);
    }
    
    public void deleteGlonassClockModel()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "sbasClockModel"
    public SBASclockModel getSbasClockModel()
    {
	return (SBASclockModel)mComponents[3];
    }
    
    public void setSbasClockModel(SBASclockModel sbasClockModel)
    {
	mComponents[3] = sbasClockModel;
    }
    
    public boolean hasSbasClockModel()
    {
	return componentIsPresent(3);
    }
    
    public void deleteSbasClockModel()
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
	    "UE_Positioning_GANSS_AddClockModels"
	),
	new QName (
	    "InformationElements",
	    "UE-Positioning-GANSS-AddClockModels"
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
				"NAVclockModel"
			    ),
			    new QName (
				"InformationElements",
				"NAVclockModel"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "NAVclockModel"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "NAVclockModel"
				)
			    ),
			    0
			)
		    ),
		    "navClockModel",
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
				"CNAVclockModel"
			    ),
			    new QName (
				"InformationElements",
				"CNAVclockModel"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "CNAVclockModel"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "CNAVclockModel"
				)
			    ),
			    0
			)
		    ),
		    "cnavClockModel",
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
				"GLONASSclockModel"
			    ),
			    new QName (
				"InformationElements",
				"GLONASSclockModel"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "GLONASSclockModel"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "GLONASSclockModel"
				)
			    ),
			    0
			)
		    ),
		    "glonassClockModel",
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
				"SBASclockModel"
			    ),
			    new QName (
				"InformationElements",
				"SBASclockModel"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "SBASclockModel"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "SBASclockModel"
				)
			    ),
			    0
			)
		    ),
		    "sbasClockModel",
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
     * Get the type descriptor (TypeInfo) of 'this' UE_Positioning_GANSS_AddClockModels object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UE_Positioning_GANSS_AddClockModels object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UE_Positioning_GANSS_AddClockModels
