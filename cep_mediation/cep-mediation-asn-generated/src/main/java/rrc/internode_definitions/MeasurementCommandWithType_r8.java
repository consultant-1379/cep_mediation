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


package rrc.internode_definitions;

import com.oss.asn1.*;
import com.oss.metadata.*;
import rrc.*;

/**
 * Define the ASN1 Type MeasurementCommandWithType_r8 from ASN1 Module Internode_definitions.
 * @see Choice
 */

public class MeasurementCommandWithType_r8 extends Choice {
    
    /**
     * The default constructor.
     */
    public MeasurementCommandWithType_r8()
    {
    }
    
    public static final  int  setup_chosen = 1;
    public static final  int  modify_chosen = 2;
    public static final  int  release_chosen = 3;
    
    // Methods for field "setup"
    public static MeasurementCommandWithType_r8 createMeasurementCommandWithType_r8WithSetup(rrc.informationelements.MeasurementType_r8 setup)
    {
	MeasurementCommandWithType_r8 __object = new MeasurementCommandWithType_r8();

	__object.setSetup(setup);
	return __object;
    }
    
    public boolean hasSetup()
    {
	return getChosenFlag() == setup_chosen;
    }
    
    public void setSetup(rrc.informationelements.MeasurementType_r8 setup)
    {
	setChosenValue(setup);
	setChosenFlag(setup_chosen);
    }
    
    
    // Methods for field "modify"
    public static MeasurementCommandWithType_r8 createMeasurementCommandWithType_r8WithModify(Null modify)
    {
	MeasurementCommandWithType_r8 __object = new MeasurementCommandWithType_r8();

	__object.setModify(modify);
	return __object;
    }
    
    public boolean hasModify()
    {
	return getChosenFlag() == modify_chosen;
    }
    
    public void setModify(Null modify)
    {
	setChosenValue(modify);
	setChosenFlag(modify_chosen);
    }
    
    
    // Methods for field "release"
    public static MeasurementCommandWithType_r8 createMeasurementCommandWithType_r8WithRelease(Null release)
    {
	MeasurementCommandWithType_r8 __object = new MeasurementCommandWithType_r8();

	__object.setRelease(release);
	return __object;
    }
    
    public boolean hasRelease()
    {
	return getChosenFlag() == release_chosen;
    }
    
    public void setRelease(Null release)
    {
	setChosenValue(release);
	setChosenFlag(release_chosen);
    }
    
    
    // Method to create a specific choice instance
    public AbstractData createInstance(int chosen)
    {
	switch (chosen) {
	    case setup_chosen:
		return new rrc.informationelements.MeasurementType_r8();
	    case modify_chosen:
		return new Null();
	    case release_chosen:
		return new Null();
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
	    "rrc.internode_definitions",
	    "MeasurementCommandWithType_r8"
	),
	new QName (
	    "Internode-definitions",
	    "MeasurementCommandWithType-r8"
	),
	12314,
	null,
	new Fields (
	    new FieldInfo[] {
		new FieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"MeasurementType_r8"
			    ),
			    new QName (
				"InformationElements",
				"MeasurementType-r8"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "MeasurementType_r8"
				)
			    ),
			    0,
			    new TagDecoder (
				new TagDecoderElement[] {
				    new TagDecoderElement((short)0x8000, 0),
				    new TagDecoderElement((short)0x8001, 1),
				    new TagDecoderElement((short)0x8002, 2),
				    new TagDecoderElement((short)0x8003, 3),
				    new TagDecoderElement((short)0x8004, 4),
				    new TagDecoderElement((short)0x8005, 5),
				    new TagDecoderElement((short)0x8006, 6)
				}
			    )
			)
		    ),
		    "setup",
		    0,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"Null"
			    ),
			    new QName (
				"builtin",
				"NULL"
			    ),
			    12314,
			    null
			)
		    ),
		    "modify",
		    1,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"Null"
			    ),
			    new QName (
				"builtin",
				"NULL"
			    ),
			    12314,
			    null
			)
		    ),
		    "release",
		    2,
		    2
		)
	    }
	),
	0,
	new TagDecoder (
	    new TagDecoderElement[] {
		new TagDecoderElement((short)0x8000, 0),
		new TagDecoderElement((short)0x8001, 1),
		new TagDecoderElement((short)0x8002, 2)
	    }
	)
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' MeasurementCommandWithType_r8 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' MeasurementCommandWithType_r8 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for MeasurementCommandWithType_r8
