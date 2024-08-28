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
 * Define the ASN1 Type NewIntraFreqCell_r10 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class NewIntraFreqCell_r10 extends Sequence {
    
    /**
     * The default constructor.
     */
    public NewIntraFreqCell_r10()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public NewIntraFreqCell_r10(IntraFreqCellID intraFreqCellID, 
		    CellInfo_r9 cellInfo, ModeSpecificInfo modeSpecificInfo)
    {
	setIntraFreqCellID(intraFreqCellID);
	setCellInfo(cellInfo);
	setModeSpecificInfo(modeSpecificInfo);
    }
    
    /**
     * Construct with required components.
     */
    public NewIntraFreqCell_r10(CellInfo_r9 cellInfo, 
		    ModeSpecificInfo modeSpecificInfo)
    {
	setCellInfo(cellInfo);
	setModeSpecificInfo(modeSpecificInfo);
    }
    
    public void initComponents()
    {
	mComponents[0] = new IntraFreqCellID();
	mComponents[1] = new CellInfo_r9();
	mComponents[2] = new ModeSpecificInfo();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[3];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new IntraFreqCellID();
	    case 1:
		return new CellInfo_r9();
	    case 2:
		return new ModeSpecificInfo();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "intraFreqCellID"
    public IntraFreqCellID getIntraFreqCellID()
    {
	return (IntraFreqCellID)mComponents[0];
    }
    
    public void setIntraFreqCellID(IntraFreqCellID intraFreqCellID)
    {
	mComponents[0] = intraFreqCellID;
    }
    
    public boolean hasIntraFreqCellID()
    {
	return componentIsPresent(0);
    }
    
    public void deleteIntraFreqCellID()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "cellInfo"
    public CellInfo_r9 getCellInfo()
    {
	return (CellInfo_r9)mComponents[1];
    }
    
    public void setCellInfo(CellInfo_r9 cellInfo)
    {
	mComponents[1] = cellInfo;
    }
    
    
    // Methods for field "modeSpecificInfo"
    public ModeSpecificInfo getModeSpecificInfo()
    {
	return (ModeSpecificInfo)mComponents[2];
    }
    
    public void setModeSpecificInfo(ModeSpecificInfo modeSpecificInfo)
    {
	mComponents[2] = modeSpecificInfo;
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
	    public Tdd128(BitString sNPLMonitorSetIndicator_TDD128)
	    {
		setSNPLMonitorSetIndicator_TDD128(sNPLMonitorSetIndicator_TDD128);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new BitString();
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
			return new BitString();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "sNPLMonitorSetIndicator_TDD128"
	    public BitString getSNPLMonitorSetIndicator_TDD128()
	    {
		return (BitString)mComponents[0];
	    }
	    
	    public void setSNPLMonitorSetIndicator_TDD128(BitString sNPLMonitorSetIndicator_TDD128)
	    {
		mComponents[0] = sNPLMonitorSetIndicator_TDD128;
	    }
	    
	    public boolean hasSNPLMonitorSetIndicator_TDD128()
	    {
		return componentIsPresent(0);
	    }
	    
	    public void deleteSNPLMonitorSetIndicator_TDD128()
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
		    "NewIntraFreqCell_r10$ModeSpecificInfo$Tdd128"
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
					"com.oss.asn1",
					"BitString"
				    ),
				    new QName (
					"builtin",
					"BIT STRING"
				    ),
				    12314,
				    new SizeConstraint (
					new SingleValueConstraint (
					    new com.oss.asn1.INTEGER(5)
					)
				    ),
				    new Bounds (
					new java.lang.Long(5),
					new java.lang.Long(5)
				    ),
				    null
				)
			    ),
			    "sNPLMonitorSetIndicator-TDD128",
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
		    (short)0x8002
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"NewIntraFreqCell_r10$ModeSpecificInfo"
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
				"NewIntraFreqCell_r10$ModeSpecificInfo$Tdd128"
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
	    "NewIntraFreqCell_r10"
	),
	new QName (
	    "InformationElements",
	    "NewIntraFreqCell-r10"
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
				"IntraFreqCellID"
			    ),
			    new QName (
				"InformationElements",
				"IntraFreqCellID"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new IntraFreqCellID(0), 
				    new IntraFreqCellID(31),
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
		    "intraFreqCellID",
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
				"CellInfo_r9"
			    ),
			    new QName (
				"InformationElements",
				"CellInfo-r9"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "CellInfo_r9"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "CellInfo_r9"
				)
			    ),
			    0
			)
		    ),
		    "cellInfo",
		    1,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "NewIntraFreqCell_r10$ModeSpecificInfo"
			)
		    ),
		    "modeSpecificInfo",
		    2,
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
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8002, 2)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' NewIntraFreqCell_r10 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' NewIntraFreqCell_r10 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for NewIntraFreqCell_r10
