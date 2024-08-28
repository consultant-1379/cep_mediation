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
 * Define the ASN1 Type IntraFreqMeasQuantity from ASN1 Module InformationElements.
 * @see Sequence
 */

public class IntraFreqMeasQuantity extends Sequence {
    
    /**
     * The default constructor.
     */
    public IntraFreqMeasQuantity()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public IntraFreqMeasQuantity(FilterCoefficient filterCoefficient, 
		    ModeSpecificInfo modeSpecificInfo)
    {
	setFilterCoefficient(filterCoefficient);
	setModeSpecificInfo(modeSpecificInfo);
    }
    
    /**
     * Construct with required components.
     */
    public IntraFreqMeasQuantity(ModeSpecificInfo modeSpecificInfo)
    {
	setModeSpecificInfo(modeSpecificInfo);
    }
    
    public void initComponents()
    {
	mComponents[0] = FilterCoefficient.fc0;
	mComponents[1] = new ModeSpecificInfo();
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
		return FilterCoefficient.fc0;
	    case 1:
		return new ModeSpecificInfo();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    // Default Values
    public static final FilterCoefficient filterCoefficient__default = 
	FilterCoefficient.fc0;
    
    // Methods for field "filterCoefficient"
    public FilterCoefficient getFilterCoefficient()
    {
	if (hasFilterCoefficient())
	    return (FilterCoefficient)mComponents[0];
	else
	    return (FilterCoefficient)filterCoefficient__default.clone();
    }
    
    public void setFilterCoefficient(FilterCoefficient filterCoefficient)
    {
	mComponents[0] = filterCoefficient;
    }
    
    public void setFilterCoefficientToDefault()
    {
	setFilterCoefficient(filterCoefficient__default);
    }
    
    public boolean hasDefaultFilterCoefficient()
    {
	return true;
    }
    
    public boolean hasFilterCoefficient()
    {
	return componentIsPresent(0);
    }
    
    public void deleteFilterCoefficient()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "modeSpecificInfo"
    public ModeSpecificInfo getModeSpecificInfo()
    {
	return (ModeSpecificInfo)mComponents[1];
    }
    
    public void setModeSpecificInfo(ModeSpecificInfo modeSpecificInfo)
    {
	mComponents[1] = modeSpecificInfo;
    }
    
    
    
    /**
     * Define the ASN1 Type ModeSpecificInfo from ASN1 Module InformationElements.
     * @see Choice
     */
    public static class ModeSpecificInfo extends Choice {
	
	/**
	 * The default constructor.
	 */
	public ModeSpecificInfo()
	{
	}
	
	public static final  int  fdd_chosen = 1;
	public static final  int  tdd_chosen = 2;
	
	// Methods for field "fdd"
	public static ModeSpecificInfo createModeSpecificInfoWithFdd(Fdd fdd)
	{
	    ModeSpecificInfo __object = new ModeSpecificInfo();

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
	    public Fdd(IntraFreqMeasQuantity_FDD intraFreqMeasQuantity_FDD)
	    {
		setIntraFreqMeasQuantity_FDD(intraFreqMeasQuantity_FDD);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = IntraFreqMeasQuantity_FDD.cpich_Ec_N0;
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
			return IntraFreqMeasQuantity_FDD.cpich_Ec_N0;
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "intraFreqMeasQuantity_FDD"
	    public IntraFreqMeasQuantity_FDD getIntraFreqMeasQuantity_FDD()
	    {
		return (IntraFreqMeasQuantity_FDD)mComponents[0];
	    }
	    
	    public void setIntraFreqMeasQuantity_FDD(IntraFreqMeasQuantity_FDD intraFreqMeasQuantity_FDD)
	    {
		mComponents[0] = intraFreqMeasQuantity_FDD;
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
		    "IntraFreqMeasQuantity$ModeSpecificInfo$Fdd"
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
					"IntraFreqMeasQuantity_FDD"
				    ),
				    new QName (
					"InformationElements",
					"IntraFreqMeasQuantity-FDD"
				    ),
				    12314,
				    null,
				    new MemberList (
					new MemberListElement[] {
					    new MemberListElement (
						"cpich-Ec-N0",
						0
					    ),
					    new MemberListElement (
						"cpich-RSCP",
						1
					    ),
					    new MemberListElement (
						"pathloss",
						2
					    ),
					    new MemberListElement (
						"dummy",
						3
					    )
					}
				    ),
				    0,
				    IntraFreqMeasQuantity_FDD.cpich_Ec_N0
				)
			    ),
			    "intraFreqMeasQuantity-FDD",
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
	public static ModeSpecificInfo createModeSpecificInfoWithTdd(Tdd tdd)
	{
	    ModeSpecificInfo __object = new ModeSpecificInfo();

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
	    public Tdd(IntraFreqMeasQuantity_TDDList intraFreqMeasQuantity_TDDList)
	    {
		setIntraFreqMeasQuantity_TDDList(intraFreqMeasQuantity_TDDList);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new IntraFreqMeasQuantity_TDDList();
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
			return new IntraFreqMeasQuantity_TDDList();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "intraFreqMeasQuantity_TDDList"
	    public IntraFreqMeasQuantity_TDDList getIntraFreqMeasQuantity_TDDList()
	    {
		return (IntraFreqMeasQuantity_TDDList)mComponents[0];
	    }
	    
	    public void setIntraFreqMeasQuantity_TDDList(IntraFreqMeasQuantity_TDDList intraFreqMeasQuantity_TDDList)
	    {
		mComponents[0] = intraFreqMeasQuantity_TDDList;
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
		    "IntraFreqMeasQuantity$ModeSpecificInfo$Tdd"
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
					"IntraFreqMeasQuantity_TDDList"
				    ),
				    new QName (
					"InformationElements",
					"IntraFreqMeasQuantity-TDDList"
				    ),
				    12314,
				    new SizeConstraint (
					new ValueRangeConstraint (
					    new AbstractBounds(
						new com.oss.asn1.INTEGER(1), 
						new com.oss.asn1.INTEGER(4),
						0
					    )
					)
				    ),
				    new Bounds (
					new java.lang.Long(1),
					new java.lang.Long(4)
				    ),
				    new TypeInfoRef (
					new QName (
					    "rrc.informationelements",
					    "IntraFreqMeasQuantity_TDD"
					)
				    )
				)
			    ),
			    "intraFreqMeasQuantity-TDDList",
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
		new short[] {
		    (short)0x8001
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"IntraFreqMeasQuantity$ModeSpecificInfo"
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
				"IntraFreqMeasQuantity$ModeSpecificInfo$Fdd"
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
				"IntraFreqMeasQuantity$ModeSpecificInfo$Tdd"
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
	 * Get the type descriptor (TypeInfo) of 'this' ModeSpecificInfo object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' ModeSpecificInfo object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for ModeSpecificInfo

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
	    "IntraFreqMeasQuantity"
	),
	new QName (
	    "InformationElements",
	    "IntraFreqMeasQuantity"
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
				"FilterCoefficient"
			    ),
			    new QName (
				"InformationElements",
				"FilterCoefficient"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"fc0",
					0
				    ),
				    new MemberListElement (
					"fc1",
					1
				    ),
				    new MemberListElement (
					"fc2",
					2
				    ),
				    new MemberListElement (
					"fc3",
					3
				    ),
				    new MemberListElement (
					"fc4",
					4
				    ),
				    new MemberListElement (
					"fc5",
					5
				    ),
				    new MemberListElement (
					"fc6",
					6
				    ),
				    new MemberListElement (
					"fc7",
					7
				    ),
				    new MemberListElement (
					"fc8",
					8
				    ),
				    new MemberListElement (
					"fc9",
					9
				    ),
				    new MemberListElement (
					"fc11",
					10
				    ),
				    new MemberListElement (
					"fc13",
					11
				    ),
				    new MemberListElement (
					"fc15",
					12
				    ),
				    new MemberListElement (
					"fc17",
					13
				    ),
				    new MemberListElement (
					"fc19",
					14
				    ),
				    new MemberListElement (
					"spare1",
					15
				    )
				}
			    ),
			    0,
			    FilterCoefficient.fc0
			)
		    ),
		    "filterCoefficient",
		    0,
		    3,
		    filterCoefficient__default
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "IntraFreqMeasQuantity$ModeSpecificInfo"
			)
		    ),
		    "modeSpecificInfo",
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
			new TagDecoderElement((short)0x8000, 0),
			new TagDecoderElement((short)0x8001, 1)
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
     * Get the type descriptor (TypeInfo) of 'this' IntraFreqMeasQuantity object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' IntraFreqMeasQuantity object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for IntraFreqMeasQuantity
