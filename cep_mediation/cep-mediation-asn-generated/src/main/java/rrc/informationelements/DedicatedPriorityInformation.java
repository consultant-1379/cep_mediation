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
 * Define the ASN1 Type DedicatedPriorityInformation from ASN1 Module InformationElements.
 * @see Sequence
 */

public class DedicatedPriorityInformation extends Sequence {
    
    /**
     * The default constructor.
     */
    public DedicatedPriorityInformation()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public DedicatedPriorityInformation(Action action)
    {
	setAction(action);
    }
    
    public void initComponents()
    {
	mComponents[0] = new Action();
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
		return new Action();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "action"
    public Action getAction()
    {
	return (Action)mComponents[0];
    }
    
    public void setAction(Action action)
    {
	mComponents[0] = action;
    }
    
    
    
    /**
     * Define the ASN1 Type Action from ASN1 Module InformationElements.
     * @see Choice
     */
    public static class Action extends Choice {
	
	/**
	 * The default constructor.
	 */
	public Action()
	{
	}
	
	public static final  int  clearDedicatedPriorities_chosen = 1;
	public static final  int  configureDedicatedPriorities_chosen = 2;
	
	// Methods for field "clearDedicatedPriorities"
	public static Action createActionWithClearDedicatedPriorities(Null clearDedicatedPriorities)
	{
	    Action __object = new Action();

	    __object.setClearDedicatedPriorities(clearDedicatedPriorities);
	    return __object;
	}
	
	public boolean hasClearDedicatedPriorities()
	{
	    return getChosenFlag() == clearDedicatedPriorities_chosen;
	}
	
	public void setClearDedicatedPriorities(Null clearDedicatedPriorities)
	{
	    setChosenValue(clearDedicatedPriorities);
	    setChosenFlag(clearDedicatedPriorities_chosen);
	}
	
	
	// Methods for field "configureDedicatedPriorities"
	public static Action createActionWithConfigureDedicatedPriorities(ConfigureDedicatedPriorities configureDedicatedPriorities)
	{
	    Action __object = new Action();

	    __object.setConfigureDedicatedPriorities(configureDedicatedPriorities);
	    return __object;
	}
	
	public boolean hasConfigureDedicatedPriorities()
	{
	    return getChosenFlag() == configureDedicatedPriorities_chosen;
	}
	
	public void setConfigureDedicatedPriorities(ConfigureDedicatedPriorities configureDedicatedPriorities)
	{
	    setChosenValue(configureDedicatedPriorities);
	    setChosenFlag(configureDedicatedPriorities_chosen);
	}
	
	
	
	/**
	 * Define the ASN1 Type ConfigureDedicatedPriorities from ASN1 Module InformationElements.
	 * @see Sequence
	 */
	public static class ConfigureDedicatedPriorities extends Sequence {
	    
	    /**
	     * The default constructor.
	     */
	    public ConfigureDedicatedPriorities()
	    {
	    }
	    
	    /**
	     * Construct with AbstractData components.
	     */
	    public ConfigureDedicatedPriorities(T_322 t_322, 
			    PriorityLevelList priorityLevelList, 
			    BOOLEAN eutraDetection)
	    {
		setT_322(t_322);
		setPriorityLevelList(priorityLevelList);
		setEutraDetection(eutraDetection);
	    }
	    
	    /**
	     * Construct with components.
	     */
	    public ConfigureDedicatedPriorities(T_322 t_322, 
			    PriorityLevelList priorityLevelList, 
			    boolean eutraDetection)
	    {
		this(t_322, priorityLevelList, new BOOLEAN(eutraDetection));
	    }
	    
	    /**
	     * Construct with required components.
	     */
	    public ConfigureDedicatedPriorities(boolean eutraDetection)
	    {
		setEutraDetection(eutraDetection);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = T_322.m5;
		mComponents[1] = new PriorityLevelList();
		mComponents[2] = new BOOLEAN();
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
			return T_322.m5;
		    case 1:
			return new PriorityLevelList();
		    case 2:
			return new BOOLEAN();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "t_322"
	    public T_322 getT_322()
	    {
		return (T_322)mComponents[0];
	    }
	    
	    public void setT_322(T_322 t_322)
	    {
		mComponents[0] = t_322;
	    }
	    
	    public boolean hasT_322()
	    {
		return componentIsPresent(0);
	    }
	    
	    public void deleteT_322()
	    {
		setComponentAbsent(0);
	    }
	    
	    
	    // Methods for field "priorityLevelList"
	    public PriorityLevelList getPriorityLevelList()
	    {
		return (PriorityLevelList)mComponents[1];
	    }
	    
	    public void setPriorityLevelList(PriorityLevelList priorityLevelList)
	    {
		mComponents[1] = priorityLevelList;
	    }
	    
	    public boolean hasPriorityLevelList()
	    {
		return componentIsPresent(1);
	    }
	    
	    public void deletePriorityLevelList()
	    {
		setComponentAbsent(1);
	    }
	    
	    
	    // Methods for field "eutraDetection"
	    public boolean getEutraDetection()
	    {
		return ((BOOLEAN)mComponents[2]).booleanValue();
	    }
	    
	    public void setEutraDetection(boolean eutraDetection)
	    {
		setEutraDetection(new BOOLEAN(eutraDetection));
	    }
	    
	    public void setEutraDetection(BOOLEAN eutraDetection)
	    {
		mComponents[2] = eutraDetection;
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
		    "DedicatedPriorityInformation$Action$ConfigureDedicatedPriorities"
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
					"T_322"
				    ),
				    new QName (
					"InformationElements",
					"T-322"
				    ),
				    12314,
				    null,
				    new MemberList (
					new MemberListElement[] {
					    new MemberListElement (
						"m5",
						0
					    ),
					    new MemberListElement (
						"m10",
						1
					    ),
					    new MemberListElement (
						"m20",
						2
					    ),
					    new MemberListElement (
						"m30",
						3
					    ),
					    new MemberListElement (
						"m60",
						4
					    ),
					    new MemberListElement (
						"m120",
						5
					    ),
					    new MemberListElement (
						"m180",
						6
					    ),
					    new MemberListElement (
						"spare1",
						7
					    )
					}
				    ),
				    0,
				    T_322.m5
				)
			    ),
			    "t-322",
			    0,
			    3,
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
					"PriorityLevelList"
				    ),
				    new QName (
					"InformationElements",
					"PriorityLevelList"
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
					    "PriorityLevel"
					)
				    )
				)
			    ),
			    "priorityLevelList",
			    1,
			    3,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new TypeInfo (
				    new Tags (
					new short[] {
					    (short)0x8002
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
			    "eutraDetection",
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
			)
		    }
		),
		0
	    );
	    
	    /**
	     * Get the type descriptor (TypeInfo) of 'this' ConfigureDedicatedPriorities object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' ConfigureDedicatedPriorities object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for ConfigureDedicatedPriorities

	// Method to create a specific choice instance
	public AbstractData createInstance(int chosen)
	{
	    switch (chosen) {
		case clearDedicatedPriorities_chosen:
		    return new Null();
		case configureDedicatedPriorities_chosen:
		    return new ConfigureDedicatedPriorities();
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
		"DedicatedPriorityInformation$Action"
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
			"clearDedicatedPriorities",
			0,
			2
		    ),
		    new FieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.informationelements",
				"DedicatedPriorityInformation$Action$ConfigureDedicatedPriorities"
			    )
			),
			"configureDedicatedPriorities",
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
	 * Get the type descriptor (TypeInfo) of 'this' Action object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Action object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Action

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
	    "DedicatedPriorityInformation"
	),
	new QName (
	    "InformationElements",
	    "DedicatedPriorityInformation"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "DedicatedPriorityInformation$Action"
			)
		    ),
		    "action",
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
     * Get the type descriptor (TypeInfo) of 'this' DedicatedPriorityInformation object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' DedicatedPriorityInformation object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for DedicatedPriorityInformation
