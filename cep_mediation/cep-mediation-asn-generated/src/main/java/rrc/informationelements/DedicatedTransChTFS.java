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
 * Define the ASN1 Type DedicatedTransChTFS from ASN1 Module InformationElements.
 * @see Sequence
 */

public class DedicatedTransChTFS extends Sequence {
    
    /**
     * The default constructor.
     */
    public DedicatedTransChTFS()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public DedicatedTransChTFS(Tti tti, 
		    SemistaticTF_Information semistaticTF_Information)
    {
	setTti(tti);
	setSemistaticTF_Information(semistaticTF_Information);
    }
    
    public void initComponents()
    {
	mComponents[0] = new Tti();
	mComponents[1] = new SemistaticTF_Information();
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
		return new Tti();
	    case 1:
		return new SemistaticTF_Information();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "tti"
    public Tti getTti()
    {
	return (Tti)mComponents[0];
    }
    
    public void setTti(Tti tti)
    {
	mComponents[0] = tti;
    }
    
    
    
    /**
     * Define the ASN1 Type Tti from ASN1 Module InformationElements.
     * @see Choice
     */
    public static class Tti extends Choice {
	
	/**
	 * The default constructor.
	 */
	public Tti()
	{
	}
	
	public static final  int  tti10_chosen = 1;
	public static final  int  tti20_chosen = 2;
	public static final  int  tti40_chosen = 3;
	public static final  int  tti80_chosen = 4;
	public static final  int  dynamic_chosen = 5;
	
	// Methods for field "tti10"
	public static Tti createTtiWithTti10(DedicatedDynamicTF_InfoList tti10)
	{
	    Tti __object = new Tti();

	    __object.setTti10(tti10);
	    return __object;
	}
	
	public boolean hasTti10()
	{
	    return getChosenFlag() == tti10_chosen;
	}
	
	public void setTti10(DedicatedDynamicTF_InfoList tti10)
	{
	    setChosenValue(tti10);
	    setChosenFlag(tti10_chosen);
	}
	
	
	// Methods for field "tti20"
	public static Tti createTtiWithTti20(DedicatedDynamicTF_InfoList tti20)
	{
	    Tti __object = new Tti();

	    __object.setTti20(tti20);
	    return __object;
	}
	
	public boolean hasTti20()
	{
	    return getChosenFlag() == tti20_chosen;
	}
	
	public void setTti20(DedicatedDynamicTF_InfoList tti20)
	{
	    setChosenValue(tti20);
	    setChosenFlag(tti20_chosen);
	}
	
	
	// Methods for field "tti40"
	public static Tti createTtiWithTti40(DedicatedDynamicTF_InfoList tti40)
	{
	    Tti __object = new Tti();

	    __object.setTti40(tti40);
	    return __object;
	}
	
	public boolean hasTti40()
	{
	    return getChosenFlag() == tti40_chosen;
	}
	
	public void setTti40(DedicatedDynamicTF_InfoList tti40)
	{
	    setChosenValue(tti40);
	    setChosenFlag(tti40_chosen);
	}
	
	
	// Methods for field "tti80"
	public static Tti createTtiWithTti80(DedicatedDynamicTF_InfoList tti80)
	{
	    Tti __object = new Tti();

	    __object.setTti80(tti80);
	    return __object;
	}
	
	public boolean hasTti80()
	{
	    return getChosenFlag() == tti80_chosen;
	}
	
	public void setTti80(DedicatedDynamicTF_InfoList tti80)
	{
	    setChosenValue(tti80);
	    setChosenFlag(tti80_chosen);
	}
	
	
	// Methods for field "dynamic"
	public static Tti createTtiWithDynamic(DedicatedDynamicTF_InfoList_DynamicTTI dynamic)
	{
	    Tti __object = new Tti();

	    __object.setDynamic(dynamic);
	    return __object;
	}
	
	public boolean hasDynamic()
	{
	    return getChosenFlag() == dynamic_chosen;
	}
	
	public void setDynamic(DedicatedDynamicTF_InfoList_DynamicTTI dynamic)
	{
	    setChosenValue(dynamic);
	    setChosenFlag(dynamic_chosen);
	}
	
	
	// Method to create a specific choice instance
	public AbstractData createInstance(int chosen)
	{
	    switch (chosen) {
		case tti10_chosen:
		    return new DedicatedDynamicTF_InfoList();
		case tti20_chosen:
		    return new DedicatedDynamicTF_InfoList();
		case tti40_chosen:
		    return new DedicatedDynamicTF_InfoList();
		case tti80_chosen:
		    return new DedicatedDynamicTF_InfoList();
		case dynamic_chosen:
		    return new DedicatedDynamicTF_InfoList_DynamicTTI();
		default:
		    throw new InternalError("Choice.createInstance()");
	    }
	    
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final ChoiceInfo c_typeinfo = new ChoiceInfo (
	    new Tags (
		new short[] {
		    (short)0x8000
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"DedicatedTransChTFS$Tti"
	    ),
	    new QName (
		"builtin",
		"CHOICE"
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
				    "DedicatedDynamicTF_InfoList"
				),
				new QName (
				    "InformationElements",
				    "DedicatedDynamicTF-InfoList"
				),
				12314,
				new SizeConstraint (
				    new ValueRangeConstraint (
					new AbstractBounds(
					    new com.oss.asn1.INTEGER(1), 
					    new com.oss.asn1.INTEGER(32),
					    0
					)
				    )
				),
				new Bounds (
				    new java.lang.Long(1),
				    new java.lang.Long(32)
				),
				new TypeInfoRef (
				    new QName (
					"rrc.informationelements",
					"DedicatedDynamicTF_Info"
				    )
				)
			    )
			),
			"tti10",
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
				    "DedicatedDynamicTF_InfoList"
				),
				new QName (
				    "InformationElements",
				    "DedicatedDynamicTF-InfoList"
				),
				12314,
				new SizeConstraint (
				    new ValueRangeConstraint (
					new AbstractBounds(
					    new com.oss.asn1.INTEGER(1), 
					    new com.oss.asn1.INTEGER(32),
					    0
					)
				    )
				),
				new Bounds (
				    new java.lang.Long(1),
				    new java.lang.Long(32)
				),
				new TypeInfoRef (
				    new QName (
					"rrc.informationelements",
					"DedicatedDynamicTF_Info"
				    )
				)
			    )
			),
			"tti20",
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
				    "DedicatedDynamicTF_InfoList"
				),
				new QName (
				    "InformationElements",
				    "DedicatedDynamicTF-InfoList"
				),
				12314,
				new SizeConstraint (
				    new ValueRangeConstraint (
					new AbstractBounds(
					    new com.oss.asn1.INTEGER(1), 
					    new com.oss.asn1.INTEGER(32),
					    0
					)
				    )
				),
				new Bounds (
				    new java.lang.Long(1),
				    new java.lang.Long(32)
				),
				new TypeInfoRef (
				    new QName (
					"rrc.informationelements",
					"DedicatedDynamicTF_Info"
				    )
				)
			    )
			),
			"tti40",
			2,
			2
		    ),
		    new FieldInfo (
			new TypeInfoRef (
			    new ContainerInfo (
				new Tags (
				    new short[] {
					(short)0x8003
				    }
				),
				new QName (
				    "rrc.informationelements",
				    "DedicatedDynamicTF_InfoList"
				),
				new QName (
				    "InformationElements",
				    "DedicatedDynamicTF-InfoList"
				),
				12314,
				new SizeConstraint (
				    new ValueRangeConstraint (
					new AbstractBounds(
					    new com.oss.asn1.INTEGER(1), 
					    new com.oss.asn1.INTEGER(32),
					    0
					)
				    )
				),
				new Bounds (
				    new java.lang.Long(1),
				    new java.lang.Long(32)
				),
				new TypeInfoRef (
				    new QName (
					"rrc.informationelements",
					"DedicatedDynamicTF_Info"
				    )
				)
			    )
			),
			"tti80",
			3,
			2
		    ),
		    new FieldInfo (
			new TypeInfoRef (
			    new ContainerInfo (
				new Tags (
				    new short[] {
					(short)0x8004
				    }
				),
				new QName (
				    "rrc.informationelements",
				    "DedicatedDynamicTF_InfoList_DynamicTTI"
				),
				new QName (
				    "InformationElements",
				    "DedicatedDynamicTF-InfoList-DynamicTTI"
				),
				12314,
				new SizeConstraint (
				    new ValueRangeConstraint (
					new AbstractBounds(
					    new com.oss.asn1.INTEGER(1), 
					    new com.oss.asn1.INTEGER(32),
					    0
					)
				    )
				),
				new Bounds (
				    new java.lang.Long(1),
				    new java.lang.Long(32)
				),
				new TypeInfoRef (
				    new QName (
					"rrc.informationelements",
					"DedicatedDynamicTF_Info_DynamicTTI"
				    )
				)
			    )
			),
			"dynamic",
			4,
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
		    new TagDecoderElement((short)0x8003, 3),
		    new TagDecoderElement((short)0x8004, 4)
		}
	    )
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' Tti object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Tti object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Tti

    // Methods for field "semistaticTF_Information"
    public SemistaticTF_Information getSemistaticTF_Information()
    {
	return (SemistaticTF_Information)mComponents[1];
    }
    
    public void setSemistaticTF_Information(SemistaticTF_Information semistaticTF_Information)
    {
	mComponents[1] = semistaticTF_Information;
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
	    "DedicatedTransChTFS"
	),
	new QName (
	    "InformationElements",
	    "DedicatedTransChTFS"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "DedicatedTransChTFS$Tti"
			)
		    ),
		    "tti",
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
				"SemistaticTF_Information"
			    ),
			    new QName (
				"InformationElements",
				"SemistaticTF-Information"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "SemistaticTF_Information"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "SemistaticTF_Information"
				)
			    ),
			    0
			)
		    ),
		    "semistaticTF-Information",
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
     * Get the type descriptor (TypeInfo) of 'this' DedicatedTransChTFS object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' DedicatedTransChTFS object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for DedicatedTransChTFS
