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
 * Define the ASN1 Type MidambleShiftAndBurstType_DL from ASN1 Module InformationElements.
 * @see Sequence
 */

public class MidambleShiftAndBurstType_DL extends Sequence {
    
    /**
     * The default constructor.
     */
    public MidambleShiftAndBurstType_DL()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public MidambleShiftAndBurstType_DL(BurstType burstType)
    {
	setBurstType(burstType);
    }
    
    public void initComponents()
    {
	mComponents[0] = new BurstType();
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
		return new BurstType();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "burstType"
    public BurstType getBurstType()
    {
	return (BurstType)mComponents[0];
    }
    
    public void setBurstType(BurstType burstType)
    {
	mComponents[0] = burstType;
    }
    
    
    
    /**
     * Define the ASN1 Type BurstType from ASN1 Module InformationElements.
     * @see Choice
     */
    public static class BurstType extends Choice {
	
	/**
	 * The default constructor.
	 */
	public BurstType()
	{
	}
	
	public static final  int  type1_chosen = 1;
	public static final  int  type2_chosen = 2;
	
	// Methods for field "type1"
	public static BurstType createBurstTypeWithType1(Type1 type1)
	{
	    BurstType __object = new BurstType();

	    __object.setType1(type1);
	    return __object;
	}
	
	public boolean hasType1()
	{
	    return getChosenFlag() == type1_chosen;
	}
	
	public void setType1(Type1 type1)
	{
	    setChosenValue(type1);
	    setChosenFlag(type1_chosen);
	}
	
	
	
	/**
	 * Define the ASN1 Type Type1 from ASN1 Module InformationElements.
	 * @see Sequence
	 */
	public static class Type1 extends Sequence {
	    
	    /**
	     * The default constructor.
	     */
	    public Type1()
	    {
	    }
	    
	    /**
	     * Construct with AbstractData components.
	     */
	    public Type1(MidambleConfigurationBurstType1and3 midambleConfigurationBurstType1and3, 
			    MidambleAllocationMode midambleAllocationMode)
	    {
		setMidambleConfigurationBurstType1and3(midambleConfigurationBurstType1and3);
		setMidambleAllocationMode(midambleAllocationMode);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = MidambleConfigurationBurstType1and3.ms4;
		mComponents[1] = new MidambleAllocationMode();
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
			return MidambleConfigurationBurstType1and3.ms4;
		    case 1:
			return new MidambleAllocationMode();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "midambleConfigurationBurstType1and3"
	    public MidambleConfigurationBurstType1and3 getMidambleConfigurationBurstType1and3()
	    {
		return (MidambleConfigurationBurstType1and3)mComponents[0];
	    }
	    
	    public void setMidambleConfigurationBurstType1and3(MidambleConfigurationBurstType1and3 midambleConfigurationBurstType1and3)
	    {
		mComponents[0] = midambleConfigurationBurstType1and3;
	    }
	    
	    
	    // Methods for field "midambleAllocationMode"
	    public MidambleAllocationMode getMidambleAllocationMode()
	    {
		return (MidambleAllocationMode)mComponents[1];
	    }
	    
	    public void setMidambleAllocationMode(MidambleAllocationMode midambleAllocationMode)
	    {
		mComponents[1] = midambleAllocationMode;
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
		    public UeSpecificMidamble(MidambleShiftLong midambleShift)
		    {
			setMidambleShift(midambleShift);
		    }
		    
		    public void initComponents()
		    {
			mComponents[0] = new MidambleShiftLong();
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
				return new MidambleShiftLong();
			    default:
				throw new InternalError("AbstractCollection.createInstance()");
			}
			
		    }
		    
		    
		    // Methods for field "midambleShift"
		    public MidambleShiftLong getMidambleShift()
		    {
			return (MidambleShiftLong)mComponents[0];
		    }
		    
		    public void setMidambleShift(MidambleShiftLong midambleShift)
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
			    "MidambleShiftAndBurstType_DL$BurstType$Type1$MidambleAllocationMode$UeSpecificMidamble"
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
						"MidambleShiftLong"
					    ),
					    new QName (
						"InformationElements",
						"MidambleShiftLong"
					    ),
					    12314,
					    new ValueRangeConstraint (
						new AbstractBounds(
						    new MidambleShiftLong(0), 
						    new MidambleShiftLong(15),
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
			    (short)0x8001
			}
		    ),
		    new QName (
			"rrc.informationelements",
			"MidambleShiftAndBurstType_DL$BurstType$Type1$MidambleAllocationMode"
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
					"MidambleShiftAndBurstType_DL$BurstType$Type1$MidambleAllocationMode$UeSpecificMidamble"
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
		    "MidambleShiftAndBurstType_DL$BurstType$Type1"
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
				new EnumeratedInfo (
				    new Tags (
					new short[] {
					    (short)0x8000
					}
				    ),
				    new QName (
					"rrc.informationelements",
					"MidambleConfigurationBurstType1and3"
				    ),
				    new QName (
					"InformationElements",
					"MidambleConfigurationBurstType1and3"
				    ),
				    12314,
				    null,
				    new MemberList (
					new MemberListElement[] {
					    new MemberListElement (
						"ms4",
						0
					    ),
					    new MemberListElement (
						"ms8",
						1
					    ),
					    new MemberListElement (
						"ms16",
						2
					    )
					}
				    ),
				    0,
				    MidambleConfigurationBurstType1and3.ms4
				)
			    ),
			    "midambleConfigurationBurstType1and3",
			    0,
			    2,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "MidambleShiftAndBurstType_DL$BurstType$Type1$MidambleAllocationMode"
				)
			    ),
			    "midambleAllocationMode",
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
	     * Get the type descriptor (TypeInfo) of 'this' Type1 object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' Type1 object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for Type1

	// Methods for field "type2"
	public static BurstType createBurstTypeWithType2(Type2 type2)
	{
	    BurstType __object = new BurstType();

	    __object.setType2(type2);
	    return __object;
	}
	
	public boolean hasType2()
	{
	    return getChosenFlag() == type2_chosen;
	}
	
	public void setType2(Type2 type2)
	{
	    setChosenValue(type2);
	    setChosenFlag(type2_chosen);
	}
	
	
	
	/**
	 * Define the ASN1 Type Type2 from ASN1 Module InformationElements.
	 * @see Sequence
	 */
	public static class Type2 extends Sequence {
	    
	    /**
	     * The default constructor.
	     */
	    public Type2()
	    {
	    }
	    
	    /**
	     * Construct with AbstractData components.
	     */
	    public Type2(MidambleConfigurationBurstType2 midambleConfigurationBurstType2, 
			    MidambleAllocationMode midambleAllocationMode)
	    {
		setMidambleConfigurationBurstType2(midambleConfigurationBurstType2);
		setMidambleAllocationMode(midambleAllocationMode);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = MidambleConfigurationBurstType2.ms3;
		mComponents[1] = new MidambleAllocationMode();
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
			return MidambleConfigurationBurstType2.ms3;
		    case 1:
			return new MidambleAllocationMode();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "midambleConfigurationBurstType2"
	    public MidambleConfigurationBurstType2 getMidambleConfigurationBurstType2()
	    {
		return (MidambleConfigurationBurstType2)mComponents[0];
	    }
	    
	    public void setMidambleConfigurationBurstType2(MidambleConfigurationBurstType2 midambleConfigurationBurstType2)
	    {
		mComponents[0] = midambleConfigurationBurstType2;
	    }
	    
	    
	    // Methods for field "midambleAllocationMode"
	    public MidambleAllocationMode getMidambleAllocationMode()
	    {
		return (MidambleAllocationMode)mComponents[1];
	    }
	    
	    public void setMidambleAllocationMode(MidambleAllocationMode midambleAllocationMode)
	    {
		mComponents[1] = midambleAllocationMode;
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
		    public UeSpecificMidamble(MidambleShiftShort midambleShift)
		    {
			setMidambleShift(midambleShift);
		    }
		    
		    public void initComponents()
		    {
			mComponents[0] = new MidambleShiftShort();
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
				return new MidambleShiftShort();
			    default:
				throw new InternalError("AbstractCollection.createInstance()");
			}
			
		    }
		    
		    
		    // Methods for field "midambleShift"
		    public MidambleShiftShort getMidambleShift()
		    {
			return (MidambleShiftShort)mComponents[0];
		    }
		    
		    public void setMidambleShift(MidambleShiftShort midambleShift)
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
			    "MidambleShiftAndBurstType_DL$BurstType$Type2$MidambleAllocationMode$UeSpecificMidamble"
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
						"MidambleShiftShort"
					    ),
					    new QName (
						"InformationElements",
						"MidambleShiftShort"
					    ),
					    12314,
					    new ValueRangeConstraint (
						new AbstractBounds(
						    new MidambleShiftShort(0), 
						    new MidambleShiftShort(5),
						    0
						)
					    ),
					    new Bounds (
						new java.lang.Long(0),
						new java.lang.Long(5)
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
			    (short)0x8001
			}
		    ),
		    new QName (
			"rrc.informationelements",
			"MidambleShiftAndBurstType_DL$BurstType$Type2$MidambleAllocationMode"
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
					"MidambleShiftAndBurstType_DL$BurstType$Type2$MidambleAllocationMode$UeSpecificMidamble"
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
		    "MidambleShiftAndBurstType_DL$BurstType$Type2"
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
				new EnumeratedInfo (
				    new Tags (
					new short[] {
					    (short)0x8000
					}
				    ),
				    new QName (
					"rrc.informationelements",
					"MidambleConfigurationBurstType2"
				    ),
				    new QName (
					"InformationElements",
					"MidambleConfigurationBurstType2"
				    ),
				    12314,
				    null,
				    new MemberList (
					new MemberListElement[] {
					    new MemberListElement (
						"ms3",
						0
					    ),
					    new MemberListElement (
						"ms6",
						1
					    )
					}
				    ),
				    0,
				    MidambleConfigurationBurstType2.ms3
				)
			    ),
			    "midambleConfigurationBurstType2",
			    0,
			    2,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "MidambleShiftAndBurstType_DL$BurstType$Type2$MidambleAllocationMode"
				)
			    ),
			    "midambleAllocationMode",
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
	     * Get the type descriptor (TypeInfo) of 'this' Type2 object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' Type2 object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for Type2

	// Method to create a specific choice instance
	public AbstractData createInstance(int chosen)
	{
	    switch (chosen) {
		case type1_chosen:
		    return new Type1();
		case type2_chosen:
		    return new Type2();
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
		"MidambleShiftAndBurstType_DL$BurstType"
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
			    new QName (
				"rrc.informationelements",
				"MidambleShiftAndBurstType_DL$BurstType$Type1"
			    )
			),
			"type1",
			0,
			2
		    ),
		    new FieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.informationelements",
				"MidambleShiftAndBurstType_DL$BurstType$Type2"
			    )
			),
			"type2",
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
	 * Get the type descriptor (TypeInfo) of 'this' BurstType object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' BurstType object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for BurstType

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
	    "MidambleShiftAndBurstType_DL"
	),
	new QName (
	    "InformationElements",
	    "MidambleShiftAndBurstType-DL"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "MidambleShiftAndBurstType_DL$BurstType"
			)
		    ),
		    "burstType",
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
     * Get the type descriptor (TypeInfo) of 'this' MidambleShiftAndBurstType_DL object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' MidambleShiftAndBurstType_DL object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for MidambleShiftAndBurstType_DL
