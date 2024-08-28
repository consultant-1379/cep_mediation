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
 * Define the ASN1 Type MidambleShiftAndBurstType_LCR_r4 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class MidambleShiftAndBurstType_LCR_r4 extends Sequence {
    
    /**
     * The default constructor.
     */
    public MidambleShiftAndBurstType_LCR_r4()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public MidambleShiftAndBurstType_LCR_r4(MidambleAllocationMode midambleAllocationMode, 
		    INTEGER midambleConfiguration)
    {
	setMidambleAllocationMode(midambleAllocationMode);
	setMidambleConfiguration(midambleConfiguration);
    }
    
    /**
     * Construct with components.
     */
    public MidambleShiftAndBurstType_LCR_r4(MidambleAllocationMode midambleAllocationMode, 
		    long midambleConfiguration)
    {
	this(midambleAllocationMode, new INTEGER(midambleConfiguration));
    }
    
    public void initComponents()
    {
	mComponents[0] = new MidambleAllocationMode();
	mComponents[1] = new INTEGER();
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
		return new MidambleAllocationMode();
	    case 1:
		return new INTEGER();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "midambleAllocationMode"
    public MidambleAllocationMode getMidambleAllocationMode()
    {
	return (MidambleAllocationMode)mComponents[0];
    }
    
    public void setMidambleAllocationMode(MidambleAllocationMode midambleAllocationMode)
    {
	mComponents[0] = midambleAllocationMode;
    }
    
    
    
    /**
     * Define the ASN1 Type MidambleAllocationMode from ASN1 Module InformationElements.
     * @see Choice
     */
    public static class MidambleAllocationMode extends Choice {
	
	/**
	 * The default constructor.
	 */
	public MidambleAllocationMode()
	{
	}
	
	public static final  int  defaultMidamble_chosen = 1;
	public static final  int  commonMidamble_chosen = 2;
	public static final  int  ueSpecificMidamble_chosen = 3;
	
	// Methods for field "defaultMidamble"
	public static MidambleAllocationMode createMidambleAllocationModeWithDefaultMidamble(Null defaultMidamble)
	{
	    MidambleAllocationMode __object = new MidambleAllocationMode();

	    __object.setDefaultMidamble(defaultMidamble);
	    return __object;
	}
	
	public boolean hasDefaultMidamble()
	{
	    return getChosenFlag() == defaultMidamble_chosen;
	}
	
	public void setDefaultMidamble(Null defaultMidamble)
	{
	    setChosenValue(defaultMidamble);
	    setChosenFlag(defaultMidamble_chosen);
	}
	
	
	// Methods for field "commonMidamble"
	public static MidambleAllocationMode createMidambleAllocationModeWithCommonMidamble(Null commonMidamble)
	{
	    MidambleAllocationMode __object = new MidambleAllocationMode();

	    __object.setCommonMidamble(commonMidamble);
	    return __object;
	}
	
	public boolean hasCommonMidamble()
	{
	    return getChosenFlag() == commonMidamble_chosen;
	}
	
	public void setCommonMidamble(Null commonMidamble)
	{
	    setChosenValue(commonMidamble);
	    setChosenFlag(commonMidamble_chosen);
	}
	
	
	// Methods for field "ueSpecificMidamble"
	public static MidambleAllocationMode createMidambleAllocationModeWithUeSpecificMidamble(UeSpecificMidamble ueSpecificMidamble)
	{
	    MidambleAllocationMode __object = new MidambleAllocationMode();

	    __object.setUeSpecificMidamble(ueSpecificMidamble);
	    return __object;
	}
	
	public boolean hasUeSpecificMidamble()
	{
	    return getChosenFlag() == ueSpecificMidamble_chosen;
	}
	
	public void setUeSpecificMidamble(UeSpecificMidamble ueSpecificMidamble)
	{
	    setChosenValue(ueSpecificMidamble);
	    setChosenFlag(ueSpecificMidamble_chosen);
	}
	
	
	
	/**
	 * Define the ASN1 Type UeSpecificMidamble from ASN1 Module InformationElements.
	 * @see Sequence
	 */
	public static class UeSpecificMidamble extends Sequence {
	    
	    /**
	     * The default constructor.
	     */
	    public UeSpecificMidamble()
	    {
	    }
	    
	    /**
	     * Construct with AbstractData components.
	     */
	    public UeSpecificMidamble(INTEGER midambleShift)
	    {
		setMidambleShift(midambleShift);
	    }
	    
	    /**
	     * Construct with components.
	     */
	    public UeSpecificMidamble(long midambleShift)
	    {
		this(new INTEGER(midambleShift));
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new INTEGER();
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
			return new INTEGER();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "midambleShift"
	    public long getMidambleShift()
	    {
		return ((INTEGER)mComponents[0]).longValue();
	    }
	    
	    public void setMidambleShift(long midambleShift)
	    {
		setMidambleShift(new INTEGER(midambleShift));
	    }
	    
	    public void setMidambleShift(INTEGER midambleShift)
	    {
		mComponents[0] = midambleShift;
	    }
	    
	    
	    /**
	     * Initialize the type descriptor.
	     */
	    private static final SequenceInfo c_typeinfo = new SequenceInfo (
		new Tags (
		    new short[] {
			(short)0x8002
		    }
		),
		new QName (
		    "rrc.informationelements",
		    "MidambleShiftAndBurstType_LCR_r4$MidambleAllocationMode$UeSpecificMidamble"
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
					    new com.oss.asn1.INTEGER(15),
					    0
					)
				    ),
				    new Bounds (
					new java.lang.Long(0),
					new java.lang.Long(15)
				    ),
				    null
				)
			    ),
			    "midambleShift",
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
	     * Get the type descriptor (TypeInfo) of 'this' UeSpecificMidamble object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' UeSpecificMidamble object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for UeSpecificMidamble

	// Method to create a specific choice instance
	public AbstractData createInstance(int chosen)
	{
	    switch (chosen) {
		case defaultMidamble_chosen:
		    return new Null();
		case commonMidamble_chosen:
		    return new Null();
		case ueSpecificMidamble_chosen:
		    return new UeSpecificMidamble();
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
		"MidambleShiftAndBurstType_LCR_r4$MidambleAllocationMode"
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
			    new TypeInfo (
				new Tags (
				    new short[] {
					(short)0x8000
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
			"defaultMidamble",
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
			"commonMidamble",
			1,
			2
		    ),
		    new FieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.informationelements",
				"MidambleShiftAndBurstType_LCR_r4$MidambleAllocationMode$UeSpecificMidamble"
			    )
			),
			"ueSpecificMidamble",
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
	 * Get the type descriptor (TypeInfo) of 'this' MidambleAllocationMode object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' MidambleAllocationMode object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for MidambleAllocationMode

    // Methods for field "midambleConfiguration"
    public long getMidambleConfiguration()
    {
	return ((INTEGER)mComponents[1]).longValue();
    }
    
    public void setMidambleConfiguration(long midambleConfiguration)
    {
	setMidambleConfiguration(new INTEGER(midambleConfiguration));
    }
    
    public void setMidambleConfiguration(INTEGER midambleConfiguration)
    {
	mComponents[1] = midambleConfiguration;
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
	    "MidambleShiftAndBurstType_LCR_r4"
	),
	new QName (
	    "InformationElements",
	    "MidambleShiftAndBurstType-LCR-r4"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "MidambleShiftAndBurstType_LCR_r4$MidambleAllocationMode"
			)
		    ),
		    "midambleAllocationMode",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
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
				    new com.oss.asn1.INTEGER(1), 
				    new com.oss.asn1.INTEGER(8),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(8)
			    ),
			    null
			)
		    ),
		    "midambleConfiguration",
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
     * Get the type descriptor (TypeInfo) of 'this' MidambleShiftAndBurstType_LCR_r4 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' MidambleShiftAndBurstType_LCR_r4 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for MidambleShiftAndBurstType_LCR_r4
