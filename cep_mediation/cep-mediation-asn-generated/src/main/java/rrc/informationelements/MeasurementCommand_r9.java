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
 * Define the ASN1 Type MeasurementCommand_r9 from ASN1 Module InformationElements.
 * @see Choice
 */

public class MeasurementCommand_r9 extends Choice {
    
    /**
     * The default constructor.
     */
    public MeasurementCommand_r9()
    {
    }
    
    public static final  int  setup_chosen = 1;
    public static final  int  modify_chosen = 2;
    public static final  int  release_chosen = 3;
    
    // Methods for field "setup"
    public static MeasurementCommand_r9 createMeasurementCommand_r9WithSetup(MeasurementType_r9 setup)
    {
	MeasurementCommand_r9 __object = new MeasurementCommand_r9();

	__object.setSetup(setup);
	return __object;
    }
    
    public boolean hasSetup()
    {
	return getChosenFlag() == setup_chosen;
    }
    
    public void setSetup(MeasurementType_r9 setup)
    {
	setChosenValue(setup);
	setChosenFlag(setup_chosen);
    }
    
    
    // Methods for field "modify"
    public static MeasurementCommand_r9 createMeasurementCommand_r9WithModify(Modify modify)
    {
	MeasurementCommand_r9 __object = new MeasurementCommand_r9();

	__object.setModify(modify);
	return __object;
    }
    
    public boolean hasModify()
    {
	return getChosenFlag() == modify_chosen;
    }
    
    public void setModify(Modify modify)
    {
	setChosenValue(modify);
	setChosenFlag(modify_chosen);
    }
    
    
    
    /**
     * Define the ASN1 Type Modify from ASN1 Module InformationElements.
     * @see Sequence
     */
    public static class Modify extends Sequence {
	
	/**
	 * The default constructor.
	 */
	public Modify()
	{
	}
	
	/**
	 * Construct with AbstractData components.
	 */
	public Modify(MeasurementType_r9 measurementType)
	{
	    setMeasurementType(measurementType);
	}
	
	public void initComponents()
	{
	    mComponents[0] = new MeasurementType_r9();
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
		    return new MeasurementType_r9();
		default:
		    throw new InternalError("AbstractCollection.createInstance()");
	    }
	    
	}
	
	
	// Methods for field "measurementType"
	public MeasurementType_r9 getMeasurementType()
	{
	    return (MeasurementType_r9)mComponents[0];
	}
	
	public void setMeasurementType(MeasurementType_r9 measurementType)
	{
	    mComponents[0] = measurementType;
	}
	
	public boolean hasMeasurementType()
	{
	    return componentIsPresent(0);
	}
	
	public void deleteMeasurementType()
	{
	    setComponentAbsent(0);
	}
	
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final SequenceInfo c_typeinfo = new SequenceInfo (
	    new Tags (
		new short[] {
		    (short)0x8001
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"MeasurementCommand_r9$Modify"
	    ),
	    new QName (
		"builtin",
		"SEQUENCE"
	    ),
	    12314,
	    null,
	    new Fields (
		new SequenceFieldInfo[] {
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new ChoiceInfo (
				new Tags (
				    new short[] {
					(short)0x8000
				    }
				),
				new QName (
				    "rrc.informationelements",
				    "MeasurementType_r9"
				),
				new QName (
				    "InformationElements",
				    "MeasurementType-r9"
				),
				12314,
				null,
				new FieldsRef (
				    new QName (
					"rrc.informationelements",
					"MeasurementType_r9"
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
					new TagDecoderElement((short)0x8006, 6),
					new TagDecoderElement((short)0x8007, 7)
				    }
				)
			    )
			),
			"measurementType",
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
	 * Get the type descriptor (TypeInfo) of 'this' Modify object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Modify object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Modify

    // Methods for field "release"
    public static MeasurementCommand_r9 createMeasurementCommand_r9WithRelease(Null release)
    {
	MeasurementCommand_r9 __object = new MeasurementCommand_r9();

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
		return new MeasurementType_r9();
	    case modify_chosen:
		return new Modify();
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
	    "rrc.informationelements",
	    "MeasurementCommand_r9"
	),
	new QName (
	    "InformationElements",
	    "MeasurementCommand-r9"
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
				"MeasurementType_r9"
			    ),
			    new QName (
				"InformationElements",
				"MeasurementType-r9"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "MeasurementType_r9"
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
				    new TagDecoderElement((short)0x8006, 6),
				    new TagDecoderElement((short)0x8007, 7)
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
			new QName (
			    "rrc.informationelements",
			    "MeasurementCommand_r9$Modify"
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
     * Get the type descriptor (TypeInfo) of 'this' MeasurementCommand_r9 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' MeasurementCommand_r9 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for MeasurementCommand_r9
