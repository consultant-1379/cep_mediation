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
 * Define the ASN1 Type CommonDynamicTF_Info_DynamicTTI from ASN1 Module InformationElements.
 * @see Sequence
 */

public class CommonDynamicTF_Info_DynamicTTI extends Sequence {
    
    /**
     * The default constructor.
     */
    public CommonDynamicTF_Info_DynamicTTI()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public CommonDynamicTF_Info_DynamicTTI(CommonTDD_Choice commonTDD_Choice, 
		    NumberOfTbSizeAndTTIList numberOfTbSizeAndTTIList, 
		    LogicalChannelList logicalChannelList)
    {
	setCommonTDD_Choice(commonTDD_Choice);
	setNumberOfTbSizeAndTTIList(numberOfTbSizeAndTTIList);
	setLogicalChannelList(logicalChannelList);
    }
    
    public void initComponents()
    {
	mComponents[0] = new CommonTDD_Choice();
	mComponents[1] = new NumberOfTbSizeAndTTIList();
	mComponents[2] = new LogicalChannelList();
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
		return new CommonTDD_Choice();
	    case 1:
		return new NumberOfTbSizeAndTTIList();
	    case 2:
		return new LogicalChannelList();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "commonTDD_Choice"
    public CommonTDD_Choice getCommonTDD_Choice()
    {
	return (CommonTDD_Choice)mComponents[0];
    }
    
    public void setCommonTDD_Choice(CommonTDD_Choice commonTDD_Choice)
    {
	mComponents[0] = commonTDD_Choice;
    }
    
    
    
    /**
     * Define the ASN1 Type CommonTDD_Choice from ASN1 Module InformationElements.
     * @see Choice
     */
    public static class CommonTDD_Choice extends Choice {
	
	/**
	 * The default constructor.
	 */
	public CommonTDD_Choice()
	{
	}
	
	public static final  int  bitModeRLC_SizeInfo_chosen = 1;
	public static final  int  octetModeRLC_SizeInfoType1_chosen = 2;
	
	// Methods for field "bitModeRLC_SizeInfo"
	public static CommonTDD_Choice createCommonTDD_ChoiceWithBitModeRLC_SizeInfo(BitModeRLC_SizeInfo bitModeRLC_SizeInfo)
	{
	    CommonTDD_Choice __object = new CommonTDD_Choice();

	    __object.setBitModeRLC_SizeInfo(bitModeRLC_SizeInfo);
	    return __object;
	}
	
	public boolean hasBitModeRLC_SizeInfo()
	{
	    return getChosenFlag() == bitModeRLC_SizeInfo_chosen;
	}
	
	public void setBitModeRLC_SizeInfo(BitModeRLC_SizeInfo bitModeRLC_SizeInfo)
	{
	    setChosenValue(bitModeRLC_SizeInfo);
	    setChosenFlag(bitModeRLC_SizeInfo_chosen);
	}
	
	
	// Methods for field "octetModeRLC_SizeInfoType1"
	public static CommonTDD_Choice createCommonTDD_ChoiceWithOctetModeRLC_SizeInfoType1(OctetModeRLC_SizeInfoType1 octetModeRLC_SizeInfoType1)
	{
	    CommonTDD_Choice __object = new CommonTDD_Choice();

	    __object.setOctetModeRLC_SizeInfoType1(octetModeRLC_SizeInfoType1);
	    return __object;
	}
	
	public boolean hasOctetModeRLC_SizeInfoType1()
	{
	    return getChosenFlag() == octetModeRLC_SizeInfoType1_chosen;
	}
	
	public void setOctetModeRLC_SizeInfoType1(OctetModeRLC_SizeInfoType1 octetModeRLC_SizeInfoType1)
	{
	    setChosenValue(octetModeRLC_SizeInfoType1);
	    setChosenFlag(octetModeRLC_SizeInfoType1_chosen);
	}
	
	
	// Method to create a specific choice instance
	public AbstractData createInstance(int chosen)
	{
	    switch (chosen) {
		case bitModeRLC_SizeInfo_chosen:
		    return new BitModeRLC_SizeInfo();
		case octetModeRLC_SizeInfoType1_chosen:
		    return new OctetModeRLC_SizeInfoType1();
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
		"CommonDynamicTF_Info_DynamicTTI$CommonTDD_Choice"
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
			    new ChoiceInfo (
				new Tags (
				    new short[] {
					(short)0x8000
				    }
				),
				new QName (
				    "rrc.informationelements",
				    "BitModeRLC_SizeInfo"
				),
				new QName (
				    "InformationElements",
				    "BitModeRLC-SizeInfo"
				),
				12314,
				null,
				new FieldsRef (
				    new QName (
					"rrc.informationelements",
					"BitModeRLC_SizeInfo"
				    )
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
			    )
			),
			"bitModeRLC-SizeInfo",
			0,
			2
		    ),
		    new FieldInfo (
			new TypeInfoRef (
			    new ChoiceInfo (
				new Tags (
				    new short[] {
					(short)0x8001
				    }
				),
				new QName (
				    "rrc.informationelements",
				    "OctetModeRLC_SizeInfoType1"
				),
				new QName (
				    "InformationElements",
				    "OctetModeRLC-SizeInfoType1"
				),
				12314,
				null,
				new FieldsRef (
				    new QName (
					"rrc.informationelements",
					"OctetModeRLC_SizeInfoType1"
				    )
				),
				0,
				new TagDecoder (
				    new TagDecoderElement[] {
					new TagDecoderElement((short)0x8000, 0),
					new TagDecoderElement((short)0x8001, 1),
					new TagDecoderElement((short)0x8002, 2)
				    }
				)
			    )
			),
			"octetModeRLC-SizeInfoType1",
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
	 * Get the type descriptor (TypeInfo) of 'this' CommonTDD_Choice object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' CommonTDD_Choice object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for CommonTDD_Choice

    // Methods for field "numberOfTbSizeAndTTIList"
    public NumberOfTbSizeAndTTIList getNumberOfTbSizeAndTTIList()
    {
	return (NumberOfTbSizeAndTTIList)mComponents[1];
    }
    
    public void setNumberOfTbSizeAndTTIList(NumberOfTbSizeAndTTIList numberOfTbSizeAndTTIList)
    {
	mComponents[1] = numberOfTbSizeAndTTIList;
    }
    
    
    // Methods for field "logicalChannelList"
    public LogicalChannelList getLogicalChannelList()
    {
	return (LogicalChannelList)mComponents[2];
    }
    
    public void setLogicalChannelList(LogicalChannelList logicalChannelList)
    {
	mComponents[2] = logicalChannelList;
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
	    "CommonDynamicTF_Info_DynamicTTI"
	),
	new QName (
	    "InformationElements",
	    "CommonDynamicTF-Info-DynamicTTI"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "CommonDynamicTF_Info_DynamicTTI$CommonTDD_Choice"
			)
		    ),
		    "commonTDD-Choice",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"NumberOfTbSizeAndTTIList"
			    ),
			    new QName (
				"InformationElements",
				"NumberOfTbSizeAndTTIList"
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
				    "NumberOfTbSizeAndTTIList$Sequence_"
				)
			    )
			)
		    ),
		    "numberOfTbSizeAndTTIList",
		    1,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"LogicalChannelList"
			    ),
			    new QName (
				"InformationElements",
				"LogicalChannelList"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "LogicalChannelList"
				)
			    ),
			    0,
			    new TagDecoder (
				new TagDecoderElement[] {
				    new TagDecoderElement((short)0x8000, 0),
				    new TagDecoderElement((short)0x8001, 1),
				    new TagDecoderElement((short)0x8002, 2)
				}
			    )
			)
		    ),
		    "logicalChannelList",
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
			new TagDecoderElement((short)0x8000, 0)
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
     * Get the type descriptor (TypeInfo) of 'this' CommonDynamicTF_Info_DynamicTTI object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' CommonDynamicTF_Info_DynamicTTI object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for CommonDynamicTF_Info_DynamicTTI
