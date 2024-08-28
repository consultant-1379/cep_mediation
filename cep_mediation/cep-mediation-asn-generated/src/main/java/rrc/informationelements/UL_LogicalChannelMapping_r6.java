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
 * Define the ASN1 Type UL_LogicalChannelMapping_r6 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class UL_LogicalChannelMapping_r6 extends Sequence {
    
    /**
     * The default constructor.
     */
    public UL_LogicalChannelMapping_r6()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public UL_LogicalChannelMapping_r6(Ul_TrCH_Type ul_TrCH_Type, 
		    MAC_LogicalChannelPriority mac_LogicalChannelPriority)
    {
	setUl_TrCH_Type(ul_TrCH_Type);
	setMac_LogicalChannelPriority(mac_LogicalChannelPriority);
    }
    
    public void initComponents()
    {
	mComponents[0] = new Ul_TrCH_Type();
	mComponents[1] = new MAC_LogicalChannelPriority();
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
		return new Ul_TrCH_Type();
	    case 1:
		return new MAC_LogicalChannelPriority();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "ul_TrCH_Type"
    public Ul_TrCH_Type getUl_TrCH_Type()
    {
	return (Ul_TrCH_Type)mComponents[0];
    }
    
    public void setUl_TrCH_Type(Ul_TrCH_Type ul_TrCH_Type)
    {
	mComponents[0] = ul_TrCH_Type;
    }
    
    
    
    /**
     * Define the ASN1 Type Ul_TrCH_Type from ASN1 Module InformationElements.
     * @see Choice
     */
    public static class Ul_TrCH_Type extends Choice {
	
	/**
	 * The default constructor.
	 */
	public Ul_TrCH_Type()
	{
	}
	
	public static final  int  dch_rach_usch_chosen = 1;
	public static final  int  e_dch_chosen = 2;
	
	// Methods for field "dch_rach_usch"
	public static Ul_TrCH_Type createUl_TrCH_TypeWithDch_rach_usch(Dch_rach_usch dch_rach_usch)
	{
	    Ul_TrCH_Type __object = new Ul_TrCH_Type();

	    __object.setDch_rach_usch(dch_rach_usch);
	    return __object;
	}
	
	public boolean hasDch_rach_usch()
	{
	    return getChosenFlag() == dch_rach_usch_chosen;
	}
	
	public void setDch_rach_usch(Dch_rach_usch dch_rach_usch)
	{
	    setChosenValue(dch_rach_usch);
	    setChosenFlag(dch_rach_usch_chosen);
	}
	
	
	
	/**
	 * Define the ASN1 Type Dch_rach_usch from ASN1 Module InformationElements.
	 * @see Sequence
	 */
	public static class Dch_rach_usch extends Sequence {
	    
	    /**
	     * The default constructor.
	     */
	    public Dch_rach_usch()
	    {
	    }
	    
	    /**
	     * Construct with AbstractData components.
	     */
	    public Dch_rach_usch(UL_TransportChannelType ul_TransportChannelType, 
			    LogicalChannelIdentity logicalChannelIdentity, 
			    Rlc_SizeList rlc_SizeList)
	    {
		setUl_TransportChannelType(ul_TransportChannelType);
		setLogicalChannelIdentity(logicalChannelIdentity);
		setRlc_SizeList(rlc_SizeList);
	    }
	    
	    /**
	     * Construct with required components.
	     */
	    public Dch_rach_usch(UL_TransportChannelType ul_TransportChannelType, 
			    Rlc_SizeList rlc_SizeList)
	    {
		setUl_TransportChannelType(ul_TransportChannelType);
		setRlc_SizeList(rlc_SizeList);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new UL_TransportChannelType();
		mComponents[1] = new LogicalChannelIdentity();
		mComponents[2] = new Rlc_SizeList();
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
			return new UL_TransportChannelType();
		    case 1:
			return new LogicalChannelIdentity();
		    case 2:
			return new Rlc_SizeList();
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
			"UL_LogicalChannelMapping_r6$Ul_TrCH_Type$Dch_rach_usch$Rlc_SizeList"
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
		    "UL_LogicalChannelMapping_r6$Ul_TrCH_Type$Dch_rach_usch"
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
				    "UL_LogicalChannelMapping_r6$Ul_TrCH_Type$Dch_rach_usch$Rlc_SizeList"
				)
			    ),
			    "rlc-SizeList",
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
				new TagDecoderElement((short)0x8001, 1),
				new TagDecoderElement((short)0x8002, 2)
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
	     * Get the type descriptor (TypeInfo) of 'this' Dch_rach_usch object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' Dch_rach_usch object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for Dch_rach_usch

	// Methods for field "e_dch"
	public static Ul_TrCH_Type createUl_TrCH_TypeWithE_dch(E_dch e_dch)
	{
	    Ul_TrCH_Type __object = new Ul_TrCH_Type();

	    __object.setE_dch(e_dch);
	    return __object;
	}
	
	public boolean hasE_dch()
	{
	    return getChosenFlag() == e_dch_chosen;
	}
	
	public void setE_dch(E_dch e_dch)
	{
	    setChosenValue(e_dch);
	    setChosenFlag(e_dch_chosen);
	}
	
	
	
	/**
	 * Define the ASN1 Type E_dch from ASN1 Module InformationElements.
	 * @see Sequence
	 */
	public static class E_dch extends Sequence {
	    
	    /**
	     * The default constructor.
	     */
	    public E_dch()
	    {
	    }
	    
	    /**
	     * Construct with AbstractData components.
	     */
	    public E_dch(LogicalChannelIdentity logicalChannelIdentity, 
			    E_DCH_MAC_d_FlowIdentity e_DCH_MAC_d_FlowIdentity, 
			    DDI ddi, RLC_PDU_SizeList rlc_PDU_SizeList, 
			    BOOLEAN includeInSchedulingInfo)
	    {
		setLogicalChannelIdentity(logicalChannelIdentity);
		setE_DCH_MAC_d_FlowIdentity(e_DCH_MAC_d_FlowIdentity);
		setDdi(ddi);
		setRlc_PDU_SizeList(rlc_PDU_SizeList);
		setIncludeInSchedulingInfo(includeInSchedulingInfo);
	    }
	    
	    /**
	     * Construct with components.
	     */
	    public E_dch(LogicalChannelIdentity logicalChannelIdentity, 
			    E_DCH_MAC_d_FlowIdentity e_DCH_MAC_d_FlowIdentity, 
			    DDI ddi, RLC_PDU_SizeList rlc_PDU_SizeList, 
			    boolean includeInSchedulingInfo)
	    {
		this(logicalChannelIdentity, e_DCH_MAC_d_FlowIdentity, ddi, 
		     rlc_PDU_SizeList, new BOOLEAN(includeInSchedulingInfo));
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new LogicalChannelIdentity();
		mComponents[1] = new E_DCH_MAC_d_FlowIdentity();
		mComponents[2] = new DDI();
		mComponents[3] = new RLC_PDU_SizeList();
		mComponents[4] = new BOOLEAN();
	    }
	    
	    // Instance initializer
	    {
		mComponents = new AbstractData[5];
	    }
	    
	    // Method to create a specific component instance
	    public AbstractData createInstance(int index)
	    {
		switch (index) {
		    case 0:
			return new LogicalChannelIdentity();
		    case 1:
			return new E_DCH_MAC_d_FlowIdentity();
		    case 2:
			return new DDI();
		    case 3:
			return new RLC_PDU_SizeList();
		    case 4:
			return new BOOLEAN();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "logicalChannelIdentity"
	    public LogicalChannelIdentity getLogicalChannelIdentity()
	    {
		return (LogicalChannelIdentity)mComponents[0];
	    }
	    
	    public void setLogicalChannelIdentity(LogicalChannelIdentity logicalChannelIdentity)
	    {
		mComponents[0] = logicalChannelIdentity;
	    }
	    
	    
	    // Methods for field "e_DCH_MAC_d_FlowIdentity"
	    public E_DCH_MAC_d_FlowIdentity getE_DCH_MAC_d_FlowIdentity()
	    {
		return (E_DCH_MAC_d_FlowIdentity)mComponents[1];
	    }
	    
	    public void setE_DCH_MAC_d_FlowIdentity(E_DCH_MAC_d_FlowIdentity e_DCH_MAC_d_FlowIdentity)
	    {
		mComponents[1] = e_DCH_MAC_d_FlowIdentity;
	    }
	    
	    
	    // Methods for field "ddi"
	    public DDI getDdi()
	    {
		return (DDI)mComponents[2];
	    }
	    
	    public void setDdi(DDI ddi)
	    {
		mComponents[2] = ddi;
	    }
	    
	    
	    // Methods for field "rlc_PDU_SizeList"
	    public RLC_PDU_SizeList getRlc_PDU_SizeList()
	    {
		return (RLC_PDU_SizeList)mComponents[3];
	    }
	    
	    public void setRlc_PDU_SizeList(RLC_PDU_SizeList rlc_PDU_SizeList)
	    {
		mComponents[3] = rlc_PDU_SizeList;
	    }
	    
	    
	    // Methods for field "includeInSchedulingInfo"
	    public boolean getIncludeInSchedulingInfo()
	    {
		return ((BOOLEAN)mComponents[4]).booleanValue();
	    }
	    
	    public void setIncludeInSchedulingInfo(boolean includeInSchedulingInfo)
	    {
		setIncludeInSchedulingInfo(new BOOLEAN(includeInSchedulingInfo));
	    }
	    
	    public void setIncludeInSchedulingInfo(BOOLEAN includeInSchedulingInfo)
	    {
		mComponents[4] = includeInSchedulingInfo;
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
		    "UL_LogicalChannelMapping_r6$Ul_TrCH_Type$E_dch"
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
					"E_DCH_MAC_d_FlowIdentity"
				    ),
				    new QName (
					"InformationElements",
					"E-DCH-MAC-d-FlowIdentity"
				    ),
				    12314,
				    new ValueRangeConstraint (
					new AbstractBounds(
					    new E_DCH_MAC_d_FlowIdentity(0), 
					    new E_DCH_MAC_d_FlowIdentity(7),
					    0
					)
				    ),
				    new Bounds (
					new java.lang.Long(0),
					new java.lang.Long(7)
				    ),
				    null
				)
			    ),
			    "e-DCH-MAC-d-FlowIdentity",
			    1,
			    2,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new IntegerInfo (
				    new Tags (
					new short[] {
					    (short)0x8002
					}
				    ),
				    new QName (
					"rrc.informationelements",
					"DDI"
				    ),
				    new QName (
					"InformationElements",
					"DDI"
				    ),
				    12314,
				    new ValueRangeConstraint (
					new AbstractBounds(
					    new DDI(0), 
					    new DDI(62),
					    0
					)
				    ),
				    new Bounds (
					new java.lang.Long(0),
					new java.lang.Long(62)
				    ),
				    null
				)
			    ),
			    "ddi",
			    2,
			    2,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new ContainerInfo (
				    new Tags (
					new short[] {
					    (short)0x8003
					}
				    ),
				    new QName (
					"rrc.informationelements",
					"RLC_PDU_SizeList"
				    ),
				    new QName (
					"InformationElements",
					"RLC-PDU-SizeList"
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
					    "RLC_PDU_Size"
					)
				    )
				)
			    ),
			    "rlc-PDU-SizeList",
			    3,
			    2,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new TypeInfo (
				    new Tags (
					new short[] {
					    (short)0x8004
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
			    "includeInSchedulingInfo",
			    4,
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
			),
			new TagDecoder (
			    new TagDecoderElement[] {
				new TagDecoderElement((short)0x8003, 3)
			    }
			),
			new TagDecoder (
			    new TagDecoderElement[] {
				new TagDecoderElement((short)0x8004, 4)
			    }
			)
		    }
		),
		0
	    );
	    
	    /**
	     * Get the type descriptor (TypeInfo) of 'this' E_dch object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' E_dch object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for E_dch

	// Method to create a specific choice instance
	public AbstractData createInstance(int chosen)
	{
	    switch (chosen) {
		case dch_rach_usch_chosen:
		    return new Dch_rach_usch();
		case e_dch_chosen:
		    return new E_dch();
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
		"UL_LogicalChannelMapping_r6$Ul_TrCH_Type"
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
				"UL_LogicalChannelMapping_r6$Ul_TrCH_Type$Dch_rach_usch"
			    )
			),
			"dch-rach-usch",
			0,
			2
		    ),
		    new FieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.informationelements",
				"UL_LogicalChannelMapping_r6$Ul_TrCH_Type$E_dch"
			    )
			),
			"e-dch",
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
	 * Get the type descriptor (TypeInfo) of 'this' Ul_TrCH_Type object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Ul_TrCH_Type object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Ul_TrCH_Type

    // Methods for field "mac_LogicalChannelPriority"
    public MAC_LogicalChannelPriority getMac_LogicalChannelPriority()
    {
	return (MAC_LogicalChannelPriority)mComponents[1];
    }
    
    public void setMac_LogicalChannelPriority(MAC_LogicalChannelPriority mac_LogicalChannelPriority)
    {
	mComponents[1] = mac_LogicalChannelPriority;
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
	    "UL_LogicalChannelMapping_r6"
	),
	new QName (
	    "InformationElements",
	    "UL-LogicalChannelMapping-r6"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "UL_LogicalChannelMapping_r6$Ul_TrCH_Type"
			)
		    ),
		    "ul-TrCH-Type",
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
     * Get the type descriptor (TypeInfo) of 'this' UL_LogicalChannelMapping_r6 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UL_LogicalChannelMapping_r6 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UL_LogicalChannelMapping_r6
