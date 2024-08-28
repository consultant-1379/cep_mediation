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
 * Define the ASN1 Type UL_LogicalChannelMapping from ASN1 Module InformationElements.
 * @see Sequence
 */

public class UL_LogicalChannelMapping extends Sequence {
    
    /**
     * The default constructor.
     */
    public UL_LogicalChannelMapping()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public UL_LogicalChannelMapping(UL_TransportChannelType ul_TransportChannelType, 
		    LogicalChannelIdentity logicalChannelIdentity, 
		    Rlc_SizeList rlc_SizeList, 
		    MAC_LogicalChannelPriority mac_LogicalChannelPriority)
    {
	setUl_TransportChannelType(ul_TransportChannelType);
	setLogicalChannelIdentity(logicalChannelIdentity);
	setRlc_SizeList(rlc_SizeList);
	setMac_LogicalChannelPriority(mac_LogicalChannelPriority);
    }
    
    /**
     * Construct with required components.
     */
    public UL_LogicalChannelMapping(UL_TransportChannelType ul_TransportChannelType, 
		    Rlc_SizeList rlc_SizeList, 
		    MAC_LogicalChannelPriority mac_LogicalChannelPriority)
    {
	setUl_TransportChannelType(ul_TransportChannelType);
	setRlc_SizeList(rlc_SizeList);
	setMac_LogicalChannelPriority(mac_LogicalChannelPriority);
    }
    
    public void initComponents()
    {
	mComponents[0] = new UL_TransportChannelType();
	mComponents[1] = new LogicalChannelIdentity();
	mComponents[2] = new Rlc_SizeList();
	mComponents[3] = new MAC_LogicalChannelPriority();
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
		return new UL_TransportChannelType();
	    case 1:
		return new LogicalChannelIdentity();
	    case 2:
		return new Rlc_SizeList();
	    case 3:
		return new MAC_LogicalChannelPriority();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "ul_TransportChannelType"
    public UL_TransportChannelType getUl_TransportChannelType()
    {
	return (UL_TransportChannelType)mComponents[0];
    }
    
    public void setUl_TransportChannelType(UL_TransportChannelType ul_TransportChannelType)
    {
	mComponents[0] = ul_TransportChannelType;
    }
    
    
    // Methods for field "logicalChannelIdentity"
    public LogicalChannelIdentity getLogicalChannelIdentity()
    {
	return (LogicalChannelIdentity)mComponents[1];
    }
    
    public void setLogicalChannelIdentity(LogicalChannelIdentity logicalChannelIdentity)
    {
	mComponents[1] = logicalChannelIdentity;
    }
    
    public boolean hasLogicalChannelIdentity()
    {
	return componentIsPresent(1);
    }
    
    public void deleteLogicalChannelIdentity()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "rlc_SizeList"
    public Rlc_SizeList getRlc_SizeList()
    {
	return (Rlc_SizeList)mComponents[2];
    }
    
    public void setRlc_SizeList(Rlc_SizeList rlc_SizeList)
    {
	mComponents[2] = rlc_SizeList;
    }
    
    
    
    /**
     * Define the ASN1 Type Rlc_SizeList from ASN1 Module InformationElements.
     * @see Choice
     */
    public static class Rlc_SizeList extends Choice {
	
	/**
	 * The default constructor.
	 */
	public Rlc_SizeList()
	{
	}
	
	public static final  int  allSizes_chosen = 1;
	public static final  int  configured_chosen = 2;
	public static final  int  explicitList_chosen = 3;
	
	// Methods for field "allSizes"
	public static Rlc_SizeList createRlc_SizeListWithAllSizes(Null allSizes)
	{
	    Rlc_SizeList __object = new Rlc_SizeList();

	    __object.setAllSizes(allSizes);
	    return __object;
	}
	
	public boolean hasAllSizes()
	{
	    return getChosenFlag() == allSizes_chosen;
	}
	
	public void setAllSizes(Null allSizes)
	{
	    setChosenValue(allSizes);
	    setChosenFlag(allSizes_chosen);
	}
	
	
	// Methods for field "configured"
	public static Rlc_SizeList createRlc_SizeListWithConfigured(Null configured)
	{
	    Rlc_SizeList __object = new Rlc_SizeList();

	    __object.setConfigured(configured);
	    return __object;
	}
	
	public boolean hasConfigured()
	{
	    return getChosenFlag() == configured_chosen;
	}
	
	public void setConfigured(Null configured)
	{
	    setChosenValue(configured);
	    setChosenFlag(configured_chosen);
	}
	
	
	// Methods for field "explicitList"
	public static Rlc_SizeList createRlc_SizeListWithExplicitList(RLC_SizeExplicitList explicitList)
	{
	    Rlc_SizeList __object = new Rlc_SizeList();

	    __object.setExplicitList(explicitList);
	    return __object;
	}
	
	public boolean hasExplicitList()
	{
	    return getChosenFlag() == explicitList_chosen;
	}
	
	public void setExplicitList(RLC_SizeExplicitList explicitList)
	{
	    setChosenValue(explicitList);
	    setChosenFlag(explicitList_chosen);
	}
	
	
	// Method to create a specific choice instance
	public AbstractData createInstance(int chosen)
	{
	    switch (chosen) {
		case allSizes_chosen:
		    return new Null();
		case configured_chosen:
		    return new Null();
		case explicitList_chosen:
		    return new RLC_SizeExplicitList();
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
		"UL_LogicalChannelMapping$Rlc_SizeList"
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
			"allSizes",
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
			"configured",
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
				    "RLC_SizeExplicitList"
				),
				new QName (
				    "InformationElements",
				    "RLC-SizeExplicitList"
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
					"RLC_SizeInfo"
				    )
				)
			    )
			),
			"explicitList",
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
	 * Get the type descriptor (TypeInfo) of 'this' Rlc_SizeList object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Rlc_SizeList object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Rlc_SizeList

    // Methods for field "mac_LogicalChannelPriority"
    public MAC_LogicalChannelPriority getMac_LogicalChannelPriority()
    {
	return (MAC_LogicalChannelPriority)mComponents[3];
    }
    
    public void setMac_LogicalChannelPriority(MAC_LogicalChannelPriority mac_LogicalChannelPriority)
    {
	mComponents[3] = mac_LogicalChannelPriority;
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
	    "UL_LogicalChannelMapping"
	),
	new QName (
	    "InformationElements",
	    "UL-LogicalChannelMapping"
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
				"UL_TransportChannelType"
			    ),
			    new QName (
				"InformationElements",
				"UL-TransportChannelType"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UL_TransportChannelType"
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
		    "ul-TransportChannelType",
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
				"rrc.informationelements",
				"LogicalChannelIdentity"
			    ),
			    new QName (
				"InformationElements",
				"LogicalChannelIdentity"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new LogicalChannelIdentity(1), 
				    new LogicalChannelIdentity(15),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(15)
			    ),
			    null
			)
		    ),
		    "logicalChannelIdentity",
		    1,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "UL_LogicalChannelMapping$Rlc_SizeList"
			)
		    ),
		    "rlc-SizeList",
		    2,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"MAC_LogicalChannelPriority"
			    ),
			    new QName (
				"InformationElements",
				"MAC-LogicalChannelPriority"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new MAC_LogicalChannelPriority(1), 
				    new MAC_LogicalChannelPriority(8),
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
		    "mac-LogicalChannelPriority",
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
			new TagDecoderElement((short)0x8000, 0)
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
     * Get the type descriptor (TypeInfo) of 'this' UL_LogicalChannelMapping object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UL_LogicalChannelMapping object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UL_LogicalChannelMapping
