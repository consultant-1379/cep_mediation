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
 * Define the ASN1 Type NewInterFreqCell_r8 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class NewInterFreqCell_r8 extends Sequence {
    
    /**
     * The default constructor.
     */
    public NewInterFreqCell_r8()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public NewInterFreqCell_r8(InterFreqCellID interFreqCellID, 
		    FrequencyInfo frequencyInfo, CellInfo_r4 cellInfo, 
		    ModeSpecificInfo modeSpecificInfo)
    {
	setInterFreqCellID(interFreqCellID);
	setFrequencyInfo(frequencyInfo);
	setCellInfo(cellInfo);
	setModeSpecificInfo(modeSpecificInfo);
    }
    
    /**
     * Construct with required components.
     */
    public NewInterFreqCell_r8(CellInfo_r4 cellInfo, 
		    ModeSpecificInfo modeSpecificInfo)
    {
	setCellInfo(cellInfo);
	setModeSpecificInfo(modeSpecificInfo);
    }
    
    public void initComponents()
    {
	mComponents[0] = new InterFreqCellID();
	mComponents[1] = new FrequencyInfo();
	mComponents[2] = new CellInfo_r4();
	mComponents[3] = new ModeSpecificInfo();
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
		return new InterFreqCellID();
	    case 1:
		return new FrequencyInfo();
	    case 2:
		return new CellInfo_r4();
	    case 3:
		return new ModeSpecificInfo();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "interFreqCellID"
    public InterFreqCellID getInterFreqCellID()
    {
	return (InterFreqCellID)mComponents[0];
    }
    
    public void setInterFreqCellID(InterFreqCellID interFreqCellID)
    {
	mComponents[0] = interFreqCellID;
    }
    
    public boolean hasInterFreqCellID()
    {
	return componentIsPresent(0);
    }
    
    public void deleteInterFreqCellID()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "frequencyInfo"
    public FrequencyInfo getFrequencyInfo()
    {
	return (FrequencyInfo)mComponents[1];
    }
    
    public void setFrequencyInfo(FrequencyInfo frequencyInfo)
    {
	mComponents[1] = frequencyInfo;
    }
    
    public boolean hasFrequencyInfo()
    {
	return componentIsPresent(1);
    }
    
    public void deleteFrequencyInfo()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "cellInfo"
    public CellInfo_r4 getCellInfo()
    {
	return (CellInfo_r4)mComponents[2];
    }
    
    public void setCellInfo(CellInfo_r4 cellInfo)
    {
	mComponents[2] = cellInfo;
    }
    
    
    // Methods for field "modeSpecificInfo"
    public ModeSpecificInfo getModeSpecificInfo()
    {
	return (ModeSpecificInfo)mComponents[3];
    }
    
    public void setModeSpecificInfo(ModeSpecificInfo modeSpecificInfo)
    {
	mComponents[3] = modeSpecificInfo;
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
	
	public static final  int  noInfo_chosen = 1;
	public static final  int  tdd128_chosen = 2;
	
	// Methods for field "noInfo"
	public static ModeSpecificInfo createModeSpecificInfoWithNoInfo(Null noInfo)
	{
	    ModeSpecificInfo __object = new ModeSpecificInfo();

	    __object.setNoInfo(noInfo);
	    return __object;
	}
	
	public boolean hasNoInfo()
	{
	    return getChosenFlag() == noInfo_chosen;
	}
	
	public void setNoInfo(Null noInfo)
	{
	    setChosenValue(noInfo);
	    setChosenFlag(noInfo_chosen);
	}
	
	
	// Methods for field "tdd128"
	public static ModeSpecificInfo createModeSpecificInfoWithTdd128(Tdd128 tdd128)
	{
	    ModeSpecificInfo __object = new ModeSpecificInfo();

	    __object.setTdd128(tdd128);
	    return __object;
	}
	
	public boolean hasTdd128()
	{
	    return getChosenFlag() == tdd128_chosen;
	}
	
	public void setTdd128(Tdd128 tdd128)
	{
	    setChosenValue(tdd128);
	    setChosenFlag(tdd128_chosen);
	}
	
	
	
	/**
	 * Define the ASN1 Type Tdd128 from ASN1 Module InformationElements.
	 * @see Sequence
	 */
	public static class Tdd128 extends Sequence {
	    
	    /**
	     * The default constructor.
	     */
	    public Tdd128()
	    {
	    }
	    
	    /**
	     * Construct with AbstractData components.
	     */
	    public Tdd128(BOOLEAN intraSecondaryFreqIndicator)
	    {
		setIntraSecondaryFreqIndicator(intraSecondaryFreqIndicator);
	    }
	    
	    /**
	     * Construct with components.
	     */
	    public Tdd128(boolean intraSecondaryFreqIndicator)
	    {
		this(new BOOLEAN(intraSecondaryFreqIndicator));
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new BOOLEAN();
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
			return new BOOLEAN();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "intraSecondaryFreqIndicator"
	    public boolean getIntraSecondaryFreqIndicator()
	    {
		return ((BOOLEAN)mComponents[0]).booleanValue();
	    }
	    
	    public void setIntraSecondaryFreqIndicator(boolean intraSecondaryFreqIndicator)
	    {
		setIntraSecondaryFreqIndicator(new BOOLEAN(intraSecondaryFreqIndicator));
	    }
	    
	    public void setIntraSecondaryFreqIndicator(BOOLEAN intraSecondaryFreqIndicator)
	    {
		mComponents[0] = intraSecondaryFreqIndicator;
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
		    "NewInterFreqCell_r8$ModeSpecificInfo$Tdd128"
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
				new TypeInfo (
				    new Tags (
					new short[] {
					    (short)0x8000
					}
				    ),
				    new QName (
					"com.oss.asn1",
					"BOOLEAN"
				    ),
				    new QName (
					"builtin",
					"BOOLEAN"
				    ),
				    12314,
				    null
				)
			    ),
			    "intraSecondaryFreqIndicator",
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
	     * Get the type descriptor (TypeInfo) of 'this' Tdd128 object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' Tdd128 object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for Tdd128

	// Method to create a specific choice instance
	public AbstractData createInstance(int chosen)
	{
	    switch (chosen) {
		case noInfo_chosen:
		    return new Null();
		case tdd128_chosen:
		    return new Tdd128();
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
		    (short)0x8003
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"NewInterFreqCell_r8$ModeSpecificInfo"
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
			"noInfo",
			0,
			2
		    ),
		    new FieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.informationelements",
				"NewInterFreqCell_r8$ModeSpecificInfo$Tdd128"
			    )
			),
			"tdd128",
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
	    "NewInterFreqCell_r8"
	),
	new QName (
	    "InformationElements",
	    "NewInterFreqCell-r8"
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
				"InterFreqCellID"
			    ),
			    new QName (
				"InformationElements",
				"InterFreqCellID"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new InterFreqCellID(0), 
				    new InterFreqCellID(31),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(31)
			    ),
			    null
			)
		    ),
		    "interFreqCellID",
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
				"FrequencyInfo"
			    ),
			    new QName (
				"InformationElements",
				"FrequencyInfo"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "FrequencyInfo"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "FrequencyInfo"
				)
			    ),
			    0
			)
		    ),
		    "frequencyInfo",
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
				"CellInfo_r4"
			    ),
			    new QName (
				"InformationElements",
				"CellInfo-r4"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "CellInfo_r4"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "CellInfo_r4"
				)
			    ),
			    0
			)
		    ),
		    "cellInfo",
		    2,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "NewInterFreqCell_r8$ModeSpecificInfo"
			)
		    ),
		    "modeSpecificInfo",
		    3,
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
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8002, 2)
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
     * Get the type descriptor (TypeInfo) of 'this' NewInterFreqCell_r8 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' NewInterFreqCell_r8 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for NewInterFreqCell_r8
