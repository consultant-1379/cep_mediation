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
 * Define the ASN1 Type IntegrityProtectionModeCommand from ASN1 Module InformationElements.
 * @see Choice
 */

public class IntegrityProtectionModeCommand extends Choice {
    
    /**
     * The default constructor.
     */
    public IntegrityProtectionModeCommand()
    {
    }
    
    public static final  int  startIntegrityProtection_chosen = 1;
    public static final  int  modify_chosen = 2;
    
    // Methods for field "startIntegrityProtection"
    public static IntegrityProtectionModeCommand createIntegrityProtectionModeCommandWithStartIntegrityProtection(StartIntegrityProtection startIntegrityProtection)
    {
	IntegrityProtectionModeCommand __object = new IntegrityProtectionModeCommand();

	__object.setStartIntegrityProtection(startIntegrityProtection);
	return __object;
    }
    
    public boolean hasStartIntegrityProtection()
    {
	return getChosenFlag() == startIntegrityProtection_chosen;
    }
    
    public void setStartIntegrityProtection(StartIntegrityProtection startIntegrityProtection)
    {
	setChosenValue(startIntegrityProtection);
	setChosenFlag(startIntegrityProtection_chosen);
    }
    
    
    
    /**
     * Define the ASN1 Type StartIntegrityProtection from ASN1 Module InformationElements.
     * @see Sequence
     */
    public static class StartIntegrityProtection extends Sequence {
	
	/**
	 * The default constructor.
	 */
	public StartIntegrityProtection()
	{
	}
	
	/**
	 * Construct with AbstractData components.
	 */
	public StartIntegrityProtection(IntegrityProtInitNumber integrityProtInitNumber)
	{
	    setIntegrityProtInitNumber(integrityProtInitNumber);
	}
	
	public void initComponents()
	{
	    mComponents[0] = new IntegrityProtInitNumber();
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
		    return new IntegrityProtInitNumber();
		default:
		    throw new InternalError("AbstractCollection.createInstance()");
	    }
	    
	}
	
	
	// Methods for field "integrityProtInitNumber"
	public IntegrityProtInitNumber getIntegrityProtInitNumber()
	{
	    return (IntegrityProtInitNumber)mComponents[0];
	}
	
	public void setIntegrityProtInitNumber(IntegrityProtInitNumber integrityProtInitNumber)
	{
	    mComponents[0] = integrityProtInitNumber;
	}
	
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final SequenceInfo c_typeinfo = new SequenceInfo (
	    new Tags (
		new short[] {
		    (short)0x8000
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"IntegrityProtectionModeCommand$StartIntegrityProtection"
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
			    new BitStringInfo (
				new Tags (
				    new short[] {
					(short)0x8000
				    }
				),
				new QName (
				    "rrc.informationelements",
				    "IntegrityProtInitNumber"
				),
				new QName (
				    "InformationElements",
				    "IntegrityProtInitNumber"
				),
				12314,
				new SizeConstraint (
				    new SingleValueConstraint (
					new com.oss.asn1.INTEGER(32)
				    )
				),
				new Bounds (
				    new java.lang.Long(32),
				    new java.lang.Long(32)
				),
				null
			    )
			),
			"integrityProtInitNumber",
			0,
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
		    )
		}
	    ),
	    0
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' StartIntegrityProtection object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' StartIntegrityProtection object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for StartIntegrityProtection

    // Methods for field "modify"
    public static IntegrityProtectionModeCommand createIntegrityProtectionModeCommandWithModify(Modify modify)
    {
	IntegrityProtectionModeCommand __object = new IntegrityProtectionModeCommand();

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
	public Modify(IntegrityProtActivationInfo dl_IntegrityProtActivationInfo)
	{
	    setDl_IntegrityProtActivationInfo(dl_IntegrityProtActivationInfo);
	}
	
	public void initComponents()
	{
	    mComponents[0] = new IntegrityProtActivationInfo();
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
		    return new IntegrityProtActivationInfo();
		default:
		    throw new InternalError("AbstractCollection.createInstance()");
	    }
	    
	}
	
	
	// Methods for field "dl_IntegrityProtActivationInfo"
	public IntegrityProtActivationInfo getDl_IntegrityProtActivationInfo()
	{
	    return (IntegrityProtActivationInfo)mComponents[0];
	}
	
	public void setDl_IntegrityProtActivationInfo(IntegrityProtActivationInfo dl_IntegrityProtActivationInfo)
	{
	    mComponents[0] = dl_IntegrityProtActivationInfo;
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
		"IntegrityProtectionModeCommand$Modify"
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
			    new SequenceInfo (
				new Tags (
				    new short[] {
					(short)0x8000
				    }
				),
				new QName (
				    "rrc.informationelements",
				    "IntegrityProtActivationInfo"
				),
				new QName (
				    "InformationElements",
				    "IntegrityProtActivationInfo"
				),
				12314,
				null,
				new FieldsRef (
				    new QName (
					"rrc.informationelements",
					"IntegrityProtActivationInfo"
				    )
				),
				0,
				new TagDecodersRef (
				    new QName (
					"rrc.informationelements",
					"IntegrityProtActivationInfo"
				    )
				),
				0
			    )
			),
			"dl-IntegrityProtActivationInfo",
			0,
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

    // Method to create a specific choice instance
    public AbstractData createInstance(int chosen)
    {
	switch (chosen) {
	    case startIntegrityProtection_chosen:
		return new StartIntegrityProtection();
	    case modify_chosen:
		return new Modify();
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
	    "IntegrityProtectionModeCommand"
	),
	new QName (
	    "InformationElements",
	    "IntegrityProtectionModeCommand"
	),
	12314,
	null,
	new Fields (
	    new FieldInfo[] {
		new FieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "IntegrityProtectionModeCommand$StartIntegrityProtection"
			)
		    ),
		    "startIntegrityProtection",
		    0,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "IntegrityProtectionModeCommand$Modify"
			)
		    ),
		    "modify",
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
     * Get the type descriptor (TypeInfo) of 'this' IntegrityProtectionModeCommand object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' IntegrityProtectionModeCommand object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for IntegrityProtectionModeCommand
