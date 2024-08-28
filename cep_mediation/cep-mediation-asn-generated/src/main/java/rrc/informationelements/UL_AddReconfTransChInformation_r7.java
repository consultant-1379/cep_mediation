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
 * Define the ASN1 Type UL_AddReconfTransChInformation_r7 from ASN1 Module InformationElements.
 * @see Choice
 */

public class UL_AddReconfTransChInformation_r7 extends Choice {
    
    /**
     * The default constructor.
     */
    public UL_AddReconfTransChInformation_r7()
    {
    }
    
    public static final  int  dch_usch_chosen = 1;
    public static final  int  e_dch_chosen = 2;
    
    // Methods for field "dch_usch"
    public static UL_AddReconfTransChInformation_r7 createUL_AddReconfTransChInformation_r7WithDch_usch(Dch_usch dch_usch)
    {
	UL_AddReconfTransChInformation_r7 __object = new UL_AddReconfTransChInformation_r7();

	__object.setDch_usch(dch_usch);
	return __object;
    }
    
    public boolean hasDch_usch()
    {
	return getChosenFlag() == dch_usch_chosen;
    }
    
    public void setDch_usch(Dch_usch dch_usch)
    {
	setChosenValue(dch_usch);
	setChosenFlag(dch_usch_chosen);
    }
    
    
    
    /**
     * Define the ASN1 Type Dch_usch from ASN1 Module InformationElements.
     * @see Sequence
     */
    public static class Dch_usch extends Sequence {
	
	/**
	 * The default constructor.
	 */
	public Dch_usch()
	{
	}
	
	/**
	 * Construct with AbstractData components.
	 */
	public Dch_usch(UL_TrCH_Type ul_TransportChannelType, 
			TransportChannelIdentity transportChannelIdentity, 
			TransportFormatSet transportFormatSet)
	{
	    setUl_TransportChannelType(ul_TransportChannelType);
	    setTransportChannelIdentity(transportChannelIdentity);
	    setTransportFormatSet(transportFormatSet);
	}
	
	public void initComponents()
	{
	    mComponents[0] = UL_TrCH_Type.dch;
	    mComponents[1] = new TransportChannelIdentity();
	    mComponents[2] = new TransportFormatSet();
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
		    return UL_TrCH_Type.dch;
		case 1:
		    return new TransportChannelIdentity();
		case 2:
		    return new TransportFormatSet();
		default:
		    throw new InternalError("AbstractCollection.createInstance()");
	    }
	    
	}
	
	
	// Methods for field "ul_TransportChannelType"
	public UL_TrCH_Type getUl_TransportChannelType()
	{
	    return (UL_TrCH_Type)mComponents[0];
	}
	
	public void setUl_TransportChannelType(UL_TrCH_Type ul_TransportChannelType)
	{
	    mComponents[0] = ul_TransportChannelType;
	}
	
	
	// Methods for field "transportChannelIdentity"
	public TransportChannelIdentity getTransportChannelIdentity()
	{
	    return (TransportChannelIdentity)mComponents[1];
	}
	
	public void setTransportChannelIdentity(TransportChannelIdentity transportChannelIdentity)
	{
	    mComponents[1] = transportChannelIdentity;
	}
	
	
	// Methods for field "transportFormatSet"
	public TransportFormatSet getTransportFormatSet()
	{
	    return (TransportFormatSet)mComponents[2];
	}
	
	public void setTransportFormatSet(TransportFormatSet transportFormatSet)
	{
	    mComponents[2] = transportFormatSet;
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
		"UL_AddReconfTransChInformation_r7$Dch_usch"
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
				    "UL_TrCH_Type"
				),
				new QName (
				    "InformationElements",
				    "UL-TrCH-Type"
				),
				12314,
				null,
				new MemberList (
				    new MemberListElement[] {
					new MemberListElement (
					    "dch",
					    0
					),
					new MemberListElement (
					    "usch",
					    1
					)
				    }
				),
				0,
				UL_TrCH_Type.dch
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
				    "TransportChannelIdentity"
				),
				new QName (
				    "InformationElements",
				    "TransportChannelIdentity"
				),
				12314,
				new ValueRangeConstraint (
				    new AbstractBounds(
					new TransportChannelIdentity(1), 
					new TransportChannelIdentity(32),
					0
				    )
				),
				new Bounds (
				    new java.lang.Long(1),
				    new java.lang.Long(32)
				),
				null
			    )
			),
			"transportChannelIdentity",
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
				    "TransportFormatSet"
				),
				new QName (
				    "InformationElements",
				    "TransportFormatSet"
				),
				12314,
				null,
				new FieldsRef (
				    new QName (
					"rrc.informationelements",
					"TransportFormatSet"
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
			"transportFormatSet",
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
	 * Get the type descriptor (TypeInfo) of 'this' Dch_usch object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Dch_usch object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Dch_usch

    // Methods for field "e_dch"
    public static UL_AddReconfTransChInformation_r7 createUL_AddReconfTransChInformation_r7WithE_dch(E_dch e_dch)
    {
	UL_AddReconfTransChInformation_r7 __object = new UL_AddReconfTransChInformation_r7();

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
	public E_dch(ModeSpecific modeSpecific, Harq_Info harq_Info, 
			E_DCH_AddReconf_MAC_d_FlowList_r7 addReconf_MAC_d_FlowList)
	{
	    setModeSpecific(modeSpecific);
	    setHarq_Info(harq_Info);
	    setAddReconf_MAC_d_FlowList(addReconf_MAC_d_FlowList);
	}
	
	/**
	 * Construct with required components.
	 */
	public E_dch(ModeSpecific modeSpecific, Harq_Info harq_Info)
	{
	    setModeSpecific(modeSpecific);
	    setHarq_Info(harq_Info);
	}
	
	public void initComponents()
	{
	    mComponents[0] = new ModeSpecific();
	    mComponents[1] = Harq_Info.rv0;
	    mComponents[2] = new E_DCH_AddReconf_MAC_d_FlowList_r7();
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
		    return new ModeSpecific();
		case 1:
		    return Harq_Info.rv0;
		case 2:
		    return new E_DCH_AddReconf_MAC_d_FlowList_r7();
		default:
		    throw new InternalError("AbstractCollection.createInstance()");
	    }
	    
	}
	
	
	// Methods for field "modeSpecific"
	public ModeSpecific getModeSpecific()
	{
	    return (ModeSpecific)mComponents[0];
	}
	
	public void setModeSpecific(ModeSpecific modeSpecific)
	{
	    mComponents[0] = modeSpecific;
	}
	
	
	
	/**
	 * Define the ASN1 Type ModeSpecific from ASN1 Module InformationElements.
	 * @see Choice
	 */
	public static class ModeSpecific extends Choice {
	    
	    /**
	     * The default constructor.
	     */
	    public ModeSpecific()
	    {
	    }
	    
	    public static final  int  fdd_chosen = 1;
	    public static final  int  tdd_chosen = 2;
	    
	    // Methods for field "fdd"
	    public static ModeSpecific createModeSpecificWithFdd(Fdd fdd)
	    {
		ModeSpecific __object = new ModeSpecific();

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
		public Fdd(E_DCH_TTI tti)
		{
		    setTti(tti);
		}
		
		public void initComponents()
		{
		    mComponents[0] = E_DCH_TTI.tti2;
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
			    return E_DCH_TTI.tti2;
			default:
			    throw new InternalError("AbstractCollection.createInstance()");
		    }
		    
		}
		
		
		// Methods for field "tti"
		public E_DCH_TTI getTti()
		{
		    return (E_DCH_TTI)mComponents[0];
		}
		
		public void setTti(E_DCH_TTI tti)
		{
		    mComponents[0] = tti;
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
			"UL_AddReconfTransChInformation_r7$E_dch$ModeSpecific$Fdd"
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
					    "E_DCH_TTI"
					),
					new QName (
					    "InformationElements",
					    "E-DCH-TTI"
					),
					12314,
					null,
					new MemberList (
					    new MemberListElement[] {
						new MemberListElement (
						    "tti2",
						    0
						),
						new MemberListElement (
						    "tti10",
						    1
						)
					    }
					),
					0,
					E_DCH_TTI.tti2
				    )
				),
				"tti",
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
	    public static ModeSpecific createModeSpecificWithTdd(Null tdd)
	    {
		ModeSpecific __object = new ModeSpecific();

		__object.setTdd(tdd);
		return __object;
	    }
	    
	    public boolean hasTdd()
	    {
		return getChosenFlag() == tdd_chosen;
	    }
	    
	    public void setTdd(Null tdd)
	    {
		setChosenValue(tdd);
		setChosenFlag(tdd_chosen);
	    }
	    
	    
	    // Method to create a specific choice instance
	    public AbstractData createInstance(int chosen)
	    {
		switch (chosen) {
		    case fdd_chosen:
			return new Fdd();
		    case tdd_chosen:
			return new Null();
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
		    "UL_AddReconfTransChInformation_r7$E_dch$ModeSpecific"
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
				    "UL_AddReconfTransChInformation_r7$E_dch$ModeSpecific$Fdd"
				)
			    ),
			    "fdd",
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
	     * Get the type descriptor (TypeInfo) of 'this' ModeSpecific object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' ModeSpecific object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for ModeSpecific

	// Methods for field "harq_Info"
	public Harq_Info getHarq_Info()
	{
	    return (Harq_Info)mComponents[1];
	}
	
	public void setHarq_Info(Harq_Info harq_Info)
	{
	    mComponents[1] = harq_Info;
	}
	
	
	
	/**
	 * Define the ASN1 Type Harq_Info from ASN1 Module InformationElements.
	 * @see Enumerated
	 */
	public static final class Harq_Info extends Enumerated {
	    
	    /**
	     * The default constructor.
	     */
	    private Harq_Info()
	    {
		super(cFirstNumber);
	    }
	    
	    protected Harq_Info(long value)
	    {
		super(value);
	    }
	    
	    // Named list definitions.
	    public static final Harq_Info rv0 =
		new Harq_Info(0);
	    public static final Harq_Info rvtable =
		new Harq_Info(1);
	    private final static Harq_Info cNamedNumbers[] = {
		 rv0, 
		 rvtable
	    };
	    protected final static long cFirstNumber = 0;
	    protected final static boolean cLinearNumbers = false;
	    
	    public Enumerated[] getNamedNumbers()
	    {
		return cNamedNumbers;
	    }
	    
	    public boolean hasLinearNumbers()
	    {
		return cLinearNumbers;
	    }
	    
	    public long getFirstNumber()
	    {
		return cFirstNumber;
	    }
	    
	    public static Harq_Info valueOf(long value)
	    {
		return (Harq_Info)rv0.lookupValue(value);
	    }
	    
	    /**
	     * Initialize the type descriptor.
	     */
	    private static final EnumeratedInfo c_typeinfo = new EnumeratedInfo (
		new Tags (
		    new short[] {
			(short)0x8001
		    }
		),
		new QName (
		    "rrc.informationelements",
		    "UL_AddReconfTransChInformation_r7$E_dch$Harq_Info"
		),
		new QName (
		    "builtin",
		    "ENUMERATED"
		),
		12314,
		null,
		new MemberList (
		    new MemberListElement[] {
			new MemberListElement (
			    "rv0",
			    0
			),
			new MemberListElement (
			    "rvtable",
			    1
			)
		    }
		),
		0,
		rv0
	    );
	    
	    /**
	     * Get the type descriptor (TypeInfo) of 'this' Harq_Info object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' Harq_Info object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for Harq_Info

	// Methods for field "addReconf_MAC_d_FlowList"
	public E_DCH_AddReconf_MAC_d_FlowList_r7 getAddReconf_MAC_d_FlowList()
	{
	    return (E_DCH_AddReconf_MAC_d_FlowList_r7)mComponents[2];
	}
	
	public void setAddReconf_MAC_d_FlowList(E_DCH_AddReconf_MAC_d_FlowList_r7 addReconf_MAC_d_FlowList)
	{
	    mComponents[2] = addReconf_MAC_d_FlowList;
	}
	
	public boolean hasAddReconf_MAC_d_FlowList()
	{
	    return componentIsPresent(2);
	}
	
	public void deleteAddReconf_MAC_d_FlowList()
	{
	    setComponentAbsent(2);
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
		"UL_AddReconfTransChInformation_r7$E_dch"
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
			    new QName (
				"rrc.informationelements",
				"UL_AddReconfTransChInformation_r7$E_dch$ModeSpecific"
			    )
			),
			"modeSpecific",
			0,
			2,
			null
		    ),
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.informationelements",
				"UL_AddReconfTransChInformation_r7$E_dch$Harq_Info"
			    )
			),
			"harq-Info",
			1,
			2,
			null
		    ),
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new ContainerInfo (
				new Tags (
				    new short[] {
					(short)0x8002
				    }
				),
				new QName (
				    "rrc.informationelements",
				    "E_DCH_AddReconf_MAC_d_FlowList_r7"
				),
				new QName (
				    "InformationElements",
				    "E-DCH-AddReconf-MAC-d-FlowList-r7"
				),
				12314,
				new SizeConstraint (
				    new ValueRangeConstraint (
					new AbstractBounds(
					    new com.oss.asn1.INTEGER(1), 
					    new com.oss.asn1.INTEGER(8),
					    0
					)
				    )
				),
				new Bounds (
				    new java.lang.Long(1),
				    new java.lang.Long(8)
				),
				new TypeInfoRef (
				    new QName (
					"rrc.informationelements",
					"E_DCH_AddReconf_MAC_d_Flow_r7"
				    )
				)
			    )
			),
			"addReconf-MAC-d-FlowList",
			2,
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
	    case dch_usch_chosen:
		return new Dch_usch();
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
	    null
	),
	new QName (
	    "rrc.informationelements",
	    "UL_AddReconfTransChInformation_r7"
	),
	new QName (
	    "InformationElements",
	    "UL-AddReconfTransChInformation-r7"
	),
	12314,
	null,
	new Fields (
	    new FieldInfo[] {
		new FieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "UL_AddReconfTransChInformation_r7$Dch_usch"
			)
		    ),
		    "dch-usch",
		    0,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "UL_AddReconfTransChInformation_r7$E_dch"
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
     * Get the type descriptor (TypeInfo) of 'this' UL_AddReconfTransChInformation_r7 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UL_AddReconfTransChInformation_r7 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UL_AddReconfTransChInformation_r7
