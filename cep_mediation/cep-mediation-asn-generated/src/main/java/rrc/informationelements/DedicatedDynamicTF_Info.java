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
 * Define the ASN1 Type DedicatedDynamicTF_Info from ASN1 Module InformationElements.
 * @see Sequence
 */

public class DedicatedDynamicTF_Info extends Sequence {
    
    /**
     * The default constructor.
     */
    public DedicatedDynamicTF_Info()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public DedicatedDynamicTF_Info(Rlc_Size rlc_Size, 
		    NumberOfTbSizeList numberOfTbSizeList, 
		    LogicalChannelList logicalChannelList)
    {
	setRlc_Size(rlc_Size);
	setNumberOfTbSizeList(numberOfTbSizeList);
	setLogicalChannelList(logicalChannelList);
    }
    
    public void initComponents()
    {
	mComponents[0] = new Rlc_Size();
	mComponents[1] = new NumberOfTbSizeList();
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
		return new Rlc_Size();
	    case 1:
		return new NumberOfTbSizeList();
	    case 2:
		return new LogicalChannelList();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "rlc_Size"
    public Rlc_Size getRlc_Size()
    {
	return (Rlc_Size)mComponents[0];
    }
    
    public void setRlc_Size(Rlc_Size rlc_Size)
    {
	mComponents[0] = rlc_Size;
    }
    
    
    
    /**
     * Define the ASN1 Type Rlc_Size from ASN1 Module InformationElements.
     * @see Choice
     */
    public static class Rlc_Size extends Choice {
	
	/**
	 * The default constructor.
	 */
	public Rlc_Size()
	{
	}
	
	public static final  int  bitMode_chosen = 1;
	public static final  int  octetModeType1_chosen = 2;
	
	// Methods for field "bitMode"
	public static Rlc_Size createRlc_SizeWithBitMode(BitModeRLC_SizeInfo bitMode)
	{
	    Rlc_Size __object = new Rlc_Size();

	    __object.setBitMode(bitMode);
	    return __object;
	}
	
	public boolean hasBitMode()
	{
	    return getChosenFlag() == bitMode_chosen;
	}
	
	public void setBitMode(BitModeRLC_SizeInfo bitMode)
	{
	    setChosenValue(bitMode);
	    setChosenFlag(bitMode_chosen);
	}
	
	
	// Methods for field "octetModeType1"
	public static Rlc_Size createRlc_SizeWithOctetModeType1(OctetModeRLC_SizeInfoType1 octetModeType1)
	{
	    Rlc_Size __object = new Rlc_Size();

	    __object.setOctetModeType1(octetModeType1);
	    return __object;
	}
	
	public boolean hasOctetModeType1()
	{
	    return getChosenFlag() == octetModeType1_chosen;
	}
	
	public void setOctetModeType1(OctetModeRLC_SizeInfoType1 octetModeType1)
	{
	    setChosenValue(octetModeType1);
	    setChosenFlag(octetModeType1_chosen);
	}
	
	
	// Method to create a specific choice instance
	public AbstractData createInstance(int chosen)
	{
	    switch (chosen) {
		case bitMode_chosen:
		    return new BitModeRLC_SizeInfo();
		case octetModeType1_chosen:
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
		"DedicatedDynamicTF_Info$Rlc_Size"
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
			"bitMode",
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
			"octetModeType1",
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
	 * Get the type descriptor (TypeInfo) of 'this' Rlc_Size object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Rlc_Size object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Rlc_Size

    // Methods for field "numberOfTbSizeList"
    public NumberOfTbSizeList getNumberOfTbSizeList()
    {
	return (NumberOfTbSizeList)mComponents[1];
    }
    
    public void setNumberOfTbSizeList(NumberOfTbSizeList numberOfTbSizeList)
    {
	mComponents[1] = numberOfTbSizeList;
    }
    
    
    
    /**
     * Define the ASN1 Type NumberOfTbSizeList from ASN1 Module InformationElements.
     * @see SequenceOf
     */
    public static class NumberOfTbSizeList extends SequenceOf {
	
	/**
	 * The default constructor.
	 */
	public NumberOfTbSizeList()
	{
	}
	
	/**
	 * Construct from an array of components.
	 */
	public NumberOfTbSizeList(NumberOfTransportBlocks[] elements)
	{
	    super(elements);
	}
	
	/**
	 * Add an Element to the SEQUENCE OF/SET OF.
	 */
	public synchronized void add(NumberOfTransportBlocks element)
	{
	    super.addElement(element);
	}
	
	/**
	 * Set an Element in the SEQUENCE OF/SET OF.
	 */
	public synchronized void set(NumberOfTransportBlocks element, int atIndex)
	{
	    super.setElement(element, atIndex);
	}
	
	/**
	 * Get an Element from the SEQUENCE OF/SET OF.
	 */
	public synchronized NumberOfTransportBlocks get(int atIndex)
	{
	    return (NumberOfTransportBlocks)super.getElement(atIndex);
	}
	
	/**
	 * Insert an Element into the SEQUENCE OF/SET OF.
	 */
	public synchronized void insert(NumberOfTransportBlocks element, int atIndex)
	{
	    super.insertElement(element, atIndex);
	}
	
	/**
	 * Remove an Element from the SEQUENCE OF/SET OF.
	 */
	public synchronized void remove(NumberOfTransportBlocks element)
	{
	    super.removeElement(element);
	}
	
	/**
	 * Create an instance of  SEQUENCE OF/SET OF.
	 */
	public AbstractData createInstance()
	{
	    return (AbstractData)new NumberOfTransportBlocks();
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final ContainerInfo c_typeinfo = new ContainerInfo (
	    new Tags (
		new short[] {
		    (short)0x8001
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"DedicatedDynamicTF_Info$NumberOfTbSizeList"
	    ),
	    new QName (
		"builtin",
		"SEQUENCE OF"
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
		    "NumberOfTransportBlocks"
		)
	    )
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' NumberOfTbSizeList object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' NumberOfTbSizeList object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for NumberOfTbSizeList

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
	    "DedicatedDynamicTF_Info"
	),
	new QName (
	    "InformationElements",
	    "DedicatedDynamicTF-Info"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "DedicatedDynamicTF_Info$Rlc_Size"
			)
		    ),
		    "rlc-Size",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "DedicatedDynamicTF_Info$NumberOfTbSizeList"
			)
		    ),
		    "numberOfTbSizeList",
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
     * Get the type descriptor (TypeInfo) of 'this' DedicatedDynamicTF_Info object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' DedicatedDynamicTF_Info object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for DedicatedDynamicTF_Info
