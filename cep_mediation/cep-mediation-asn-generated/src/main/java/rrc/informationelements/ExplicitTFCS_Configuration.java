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
 * Define the ASN1 Type ExplicitTFCS_Configuration from ASN1 Module InformationElements.
 * @see Choice
 */

public class ExplicitTFCS_Configuration extends Choice {
    
    /**
     * The default constructor.
     */
    public ExplicitTFCS_Configuration()
    {
    }
    
    public static final  int  complete_chosen = 1;
    public static final  int  addition_chosen = 2;
    public static final  int  removal_chosen = 3;
    public static final  int  replacement_chosen = 4;
    
    // Methods for field "complete"
    public static ExplicitTFCS_Configuration createExplicitTFCS_ConfigurationWithComplete(TFCS_ReconfAdd complete)
    {
	ExplicitTFCS_Configuration __object = new ExplicitTFCS_Configuration();

	__object.setComplete(complete);
	return __object;
    }
    
    public boolean hasComplete()
    {
	return getChosenFlag() == complete_chosen;
    }
    
    public void setComplete(TFCS_ReconfAdd complete)
    {
	setChosenValue(complete);
	setChosenFlag(complete_chosen);
    }
    
    
    // Methods for field "addition"
    public static ExplicitTFCS_Configuration createExplicitTFCS_ConfigurationWithAddition(TFCS_ReconfAdd addition)
    {
	ExplicitTFCS_Configuration __object = new ExplicitTFCS_Configuration();

	__object.setAddition(addition);
	return __object;
    }
    
    public boolean hasAddition()
    {
	return getChosenFlag() == addition_chosen;
    }
    
    public void setAddition(TFCS_ReconfAdd addition)
    {
	setChosenValue(addition);
	setChosenFlag(addition_chosen);
    }
    
    
    // Methods for field "removal"
    public static ExplicitTFCS_Configuration createExplicitTFCS_ConfigurationWithRemoval(TFCS_RemovalList removal)
    {
	ExplicitTFCS_Configuration __object = new ExplicitTFCS_Configuration();

	__object.setRemoval(removal);
	return __object;
    }
    
    public boolean hasRemoval()
    {
	return getChosenFlag() == removal_chosen;
    }
    
    public void setRemoval(TFCS_RemovalList removal)
    {
	setChosenValue(removal);
	setChosenFlag(removal_chosen);
    }
    
    
    // Methods for field "replacement"
    public static ExplicitTFCS_Configuration createExplicitTFCS_ConfigurationWithReplacement(Replacement replacement)
    {
	ExplicitTFCS_Configuration __object = new ExplicitTFCS_Configuration();

	__object.setReplacement(replacement);
	return __object;
    }
    
    public boolean hasReplacement()
    {
	return getChosenFlag() == replacement_chosen;
    }
    
    public void setReplacement(Replacement replacement)
    {
	setChosenValue(replacement);
	setChosenFlag(replacement_chosen);
    }
    
    
    
    /**
     * Define the ASN1 Type Replacement from ASN1 Module InformationElements.
     * @see Sequence
     */
    public static class Replacement extends Sequence {
	
	/**
	 * The default constructor.
	 */
	public Replacement()
	{
	}
	
	/**
	 * Construct with AbstractData components.
	 */
	public Replacement(TFCS_RemovalList tfcsRemoval, 
			TFCS_ReconfAdd tfcsAdd)
	{
	    setTfcsRemoval(tfcsRemoval);
	    setTfcsAdd(tfcsAdd);
	}
	
	public void initComponents()
	{
	    mComponents[0] = new TFCS_RemovalList();
	    mComponents[1] = new TFCS_ReconfAdd();
	}
	
	// Instance initializer
	{
	    mComponents = new AbstractData[2];
	}
	
	// Method to create a specific component instance
	public AbstractData createInstance(int index)
	{
	    switch (index) {
		case 0:
		    return new TFCS_RemovalList();
		case 1:
		    return new TFCS_ReconfAdd();
		default:
		    throw new InternalError("AbstractCollection.createInstance()");
	    }
	    
	}
	
	
	// Methods for field "tfcsRemoval"
	public TFCS_RemovalList getTfcsRemoval()
	{
	    return (TFCS_RemovalList)mComponents[0];
	}
	
	public void setTfcsRemoval(TFCS_RemovalList tfcsRemoval)
	{
	    mComponents[0] = tfcsRemoval;
	}
	
	
	// Methods for field "tfcsAdd"
	public TFCS_ReconfAdd getTfcsAdd()
	{
	    return (TFCS_ReconfAdd)mComponents[1];
	}
	
	public void setTfcsAdd(TFCS_ReconfAdd tfcsAdd)
	{
	    mComponents[1] = tfcsAdd;
	}
	
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final SequenceInfo c_typeinfo = new SequenceInfo (
	    new Tags (
		new short[] {
		    (short)0x8003
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"ExplicitTFCS_Configuration$Replacement"
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
			    new ContainerInfo (
				new Tags (
				    new short[] {
					(short)0x8000
				    }
				),
				new QName (
				    "rrc.informationelements",
				    "TFCS_RemovalList"
				),
				new QName (
				    "InformationElements",
				    "TFCS-RemovalList"
				),
				12314,
				new SizeConstraint (
				    new ValueRangeConstraint (
					new AbstractBounds(
					    new com.oss.asn1.INTEGER(1), 
					    new com.oss.asn1.INTEGER(1024),
					    0
					)
				    )
				),
				new Bounds (
				    new java.lang.Long(1),
				    new java.lang.Long(1024)
				),
				new TypeInfoRef (
				    new QName (
					"rrc.informationelements",
					"TFCS_Removal"
				    )
				)
			    )
			),
			"tfcsRemoval",
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
				    "TFCS_ReconfAdd"
				),
				new QName (
				    "InformationElements",
				    "TFCS-ReconfAdd"
				),
				12314,
				null,
				new FieldsRef (
				    new QName (
					"rrc.informationelements",
					"TFCS_ReconfAdd"
				    )
				),
				0,
				new TagDecodersRef (
				    new QName (
					"rrc.informationelements",
					"TFCS_ReconfAdd"
				    )
				),
				0
			    )
			),
			"tfcsAdd",
			1,
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
		    )
		}
	    ),
	    0
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' Replacement object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Replacement object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Replacement

    // Method to create a specific choice instance
    public AbstractData createInstance(int chosen)
    {
	switch (chosen) {
	    case complete_chosen:
		return new TFCS_ReconfAdd();
	    case addition_chosen:
		return new TFCS_ReconfAdd();
	    case removal_chosen:
		return new TFCS_RemovalList();
	    case replacement_chosen:
		return new Replacement();
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
	    "ExplicitTFCS_Configuration"
	),
	new QName (
	    "InformationElements",
	    "ExplicitTFCS-Configuration"
	),
	12314,
	null,
	new Fields (
	    new FieldInfo[] {
		new FieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"TFCS_ReconfAdd"
			    ),
			    new QName (
				"InformationElements",
				"TFCS-ReconfAdd"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "TFCS_ReconfAdd"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "TFCS_ReconfAdd"
				)
			    ),
			    0
			)
		    ),
		    "complete",
		    0,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"TFCS_ReconfAdd"
			    ),
			    new QName (
				"InformationElements",
				"TFCS-ReconfAdd"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "TFCS_ReconfAdd"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "TFCS_ReconfAdd"
				)
			    ),
			    0
			)
		    ),
		    "addition",
		    1,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"TFCS_RemovalList"
			    ),
			    new QName (
				"InformationElements",
				"TFCS-RemovalList"
			    ),
			    12314,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new com.oss.asn1.INTEGER(1), 
					new com.oss.asn1.INTEGER(1024),
					0
				    )
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(1024)
			    ),
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "TFCS_Removal"
				)
			    )
			)
		    ),
		    "removal",
		    2,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "ExplicitTFCS_Configuration$Replacement"
			)
		    ),
		    "replacement",
		    3,
		    2
		)
	    }
	),
	0,
	new TagDecoder (
	    new TagDecoderElement[] {
		new TagDecoderElement((short)0x8000, 0),
		new TagDecoderElement((short)0x8001, 1),
		new TagDecoderElement((short)0x8002, 2),
		new TagDecoderElement((short)0x8003, 3)
	    }
	)
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' ExplicitTFCS_Configuration object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' ExplicitTFCS_Configuration object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for ExplicitTFCS_Configuration
