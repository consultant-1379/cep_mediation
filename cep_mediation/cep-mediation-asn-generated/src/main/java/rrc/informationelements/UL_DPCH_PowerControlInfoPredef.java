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
 * Define the ASN1 Type UL_DPCH_PowerControlInfoPredef from ASN1 Module InformationElements.
 * @see Choice
 */

public class UL_DPCH_PowerControlInfoPredef extends Choice {
    
    /**
     * The default constructor.
     */
    public UL_DPCH_PowerControlInfoPredef()
    {
    }
    
    public static final  int  fdd_chosen = 1;
    public static final  int  tdd_chosen = 2;
    
    // Methods for field "fdd"
    public static UL_DPCH_PowerControlInfoPredef createUL_DPCH_PowerControlInfoPredefWithFdd(Fdd fdd)
    {
	UL_DPCH_PowerControlInfoPredef __object = new UL_DPCH_PowerControlInfoPredef();

	__object.setFdd(fdd);
	return __object;
    }
    
    public boolean hasFdd()
    {
	return getChosenFlag() == fdd_chosen;
    }
    
    public void setFdd(Fdd fdd)
    {
	setChosenValue(fdd);
	setChosenFlag(fdd_chosen);
    }
    
    
    
    /**
     * Define the ASN1 Type Fdd from ASN1 Module InformationElements.
     * @see Sequence
     */
    public static class Fdd extends Sequence {
	
	/**
	 * The default constructor.
	 */
	public Fdd()
	{
	}
	
	/**
	 * Construct with AbstractData components.
	 */
	public Fdd(PowerControlAlgorithm powerControlAlgorithm)
	{
	    setPowerControlAlgorithm(powerControlAlgorithm);
	}
	
	public void initComponents()
	{
	    mComponents[0] = new PowerControlAlgorithm();
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
		    return new PowerControlAlgorithm();
		default:
		    throw new InternalError("AbstractCollection.createInstance()");
	    }
	    
	}
	
	
	// Methods for field "powerControlAlgorithm"
	public PowerControlAlgorithm getPowerControlAlgorithm()
	{
	    return (PowerControlAlgorithm)mComponents[0];
	}
	
	public void setPowerControlAlgorithm(PowerControlAlgorithm powerControlAlgorithm)
	{
	    mComponents[0] = powerControlAlgorithm;
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
		"UL_DPCH_PowerControlInfoPredef$Fdd"
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
				    "PowerControlAlgorithm"
				),
				new QName (
				    "InformationElements",
				    "PowerControlAlgorithm"
				),
				12314,
				null,
				new FieldsRef (
				    new QName (
					"rrc.informationelements",
					"PowerControlAlgorithm"
				    )
				),
				0,
				new TagDecoder (
				    new TagDecoderElement[] {
					new TagDecoderElement((short)0x8000, 0),
					new TagDecoderElement((short)0x8001, 1)
				    }
				)
			    )
			),
			"powerControlAlgorithm",
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
	 * Get the type descriptor (TypeInfo) of 'this' Fdd object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Fdd object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Fdd

    // Methods for field "tdd"
    public static UL_DPCH_PowerControlInfoPredef createUL_DPCH_PowerControlInfoPredefWithTdd(Tdd tdd)
    {
	UL_DPCH_PowerControlInfoPredef __object = new UL_DPCH_PowerControlInfoPredef();

	__object.setTdd(tdd);
	return __object;
    }
    
    public boolean hasTdd()
    {
	return getChosenFlag() == tdd_chosen;
    }
    
    public void setTdd(Tdd tdd)
    {
	setChosenValue(tdd);
	setChosenFlag(tdd_chosen);
    }
    
    
    
    /**
     * Define the ASN1 Type Tdd from ASN1 Module InformationElements.
     * @see Sequence
     */
    public static class Tdd extends Sequence {
	
	/**
	 * The default constructor.
	 */
	public Tdd()
	{
	}
	
	/**
	 * Construct with AbstractData components.
	 */
	public Tdd(ConstantValueTdd dpch_ConstantValue)
	{
	    setDpch_ConstantValue(dpch_ConstantValue);
	}
	
	public void initComponents()
	{
	    mComponents[0] = new ConstantValueTdd();
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
		    return new ConstantValueTdd();
		default:
		    throw new InternalError("AbstractCollection.createInstance()");
	    }
	    
	}
	
	
	// Methods for field "dpch_ConstantValue"
	public ConstantValueTdd getDpch_ConstantValue()
	{
	    return (ConstantValueTdd)mComponents[0];
	}
	
	public void setDpch_ConstantValue(ConstantValueTdd dpch_ConstantValue)
	{
	    mComponents[0] = dpch_ConstantValue;
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
		"UL_DPCH_PowerControlInfoPredef$Tdd"
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
			    new IntegerInfo (
				new Tags (
				    new short[] {
					(short)0x8000
				    }
				),
				new QName (
				    "rrc.informationelements",
				    "ConstantValueTdd"
				),
				new QName (
				    "InformationElements",
				    "ConstantValueTdd"
				),
				12314,
				new ValueRangeConstraint (
				    new AbstractBounds(
					new ConstantValueTdd(-35), 
					new ConstantValueTdd(10),
					0
				    )
				),
				new Bounds (
				    new java.lang.Long(-35),
				    new java.lang.Long(10)
				),
				null
			    )
			),
			"dpch-ConstantValue",
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
	 * Get the type descriptor (TypeInfo) of 'this' Tdd object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Tdd object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Tdd

    // Method to create a specific choice instance
    public AbstractData createInstance(int chosen)
    {
	switch (chosen) {
	    case fdd_chosen:
		return new Fdd();
	    case tdd_chosen:
		return new Tdd();
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
	    "UL_DPCH_PowerControlInfoPredef"
	),
	new QName (
	    "InformationElements",
	    "UL-DPCH-PowerControlInfoPredef"
	),
	12314,
	null,
	new Fields (
	    new FieldInfo[] {
		new FieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "UL_DPCH_PowerControlInfoPredef$Fdd"
			)
		    ),
		    "fdd",
		    0,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "UL_DPCH_PowerControlInfoPredef$Tdd"
			)
		    ),
		    "tdd",
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
     * Get the type descriptor (TypeInfo) of 'this' UL_DPCH_PowerControlInfoPredef object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UL_DPCH_PowerControlInfoPredef object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UL_DPCH_PowerControlInfoPredef
