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
 * Define the ASN1 Type TFC_SubsetList from ASN1 Module InformationElements.
 * @see SequenceOf
 */

public class TFC_SubsetList extends SequenceOf {
    
    /**
     * The default constructor.
     */
    public TFC_SubsetList()
    {
    }
    
    /**
     * Construct from an array of components.
     */
    public TFC_SubsetList(Sequence_[] elements)
    {
	super(elements);
    }
    
    
    /**
     * Define the ASN1 Type Sequence_ from ASN1 Module InformationElements.
     * @see Sequence
     */
    public static class Sequence_ extends Sequence {
	
	/**
	 * The default constructor.
	 */
	public Sequence_()
	{
	}
	
	/**
	 * Construct with AbstractData components.
	 */
	public Sequence_(ModeSpecificInfo modeSpecificInfo, 
			TFC_Subset tfc_Subset)
	{
	    setModeSpecificInfo(modeSpecificInfo);
	    setTfc_Subset(tfc_Subset);
	}
	
	public void initComponents()
	{
	    mComponents[0] = new ModeSpecificInfo();
	    mComponents[1] = new TFC_Subset();
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
		    return new ModeSpecificInfo();
		case 1:
		    return new TFC_Subset();
		default:
		    throw new InternalError("AbstractCollection.createInstance()");
	    }
	    
	}
	
	
	// Methods for field "modeSpecificInfo"
	public ModeSpecificInfo getModeSpecificInfo()
	{
	    return (ModeSpecificInfo)mComponents[0];
	}
	
	public void setModeSpecificInfo(ModeSpecificInfo modeSpecificInfo)
	{
	    mComponents[0] = modeSpecificInfo;
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
	    public static ModeSpecificInfo createModeSpecificInfoWithFdd(Null fdd)
	    {
		ModeSpecificInfo __object = new ModeSpecificInfo();

		__object.setFdd(fdd);
		return __object;
	    }
	    
	    public boolean hasFdd()
	    {
		return getChosenFlag() == fdd_chosen;
	    }
	    
	    public void setFdd(Null fdd)
	    {
		setChosenValue(fdd);
		setChosenFlag(fdd_chosen);
	    }
	    
	    
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
		public Tdd(TFCS_Identity tfcs_ID)
		{
		    setTfcs_ID(tfcs_ID);
		}
		
		public void initComponents()
		{
		    mComponents[0] = new TFCS_Identity();
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
			    return new TFCS_Identity();
			default:
			    throw new InternalError("AbstractCollection.createInstance()");
		    }
		    
		}
		
		
		// Methods for field "tfcs_ID"
		public TFCS_Identity getTfcs_ID()
		{
		    return (TFCS_Identity)mComponents[0];
		}
		
		public void setTfcs_ID(TFCS_Identity tfcs_ID)
		{
		    mComponents[0] = tfcs_ID;
		}
		
		public boolean hasTfcs_ID()
		{
		    return componentIsPresent(0);
		}
		
		public void deleteTfcs_ID()
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
			"TFC_SubsetList$Sequence_$ModeSpecificInfo$Tdd"
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
				    new SequenceInfo (
					new Tags (
					    new short[] {
						(short)0x8000
					    }
					),
					new QName (
					    "rrc.informationelements",
					    "TFCS_Identity"
					),
					new QName (
					    "InformationElements",
					    "TFCS-Identity"
					),
					12314,
					null,
					new FieldsRef (
					    new QName (
						"rrc.informationelements",
						"TFCS_Identity"
					    )
					),
					0,
					new TagDecodersRef (
					    new QName (
						"rrc.informationelements",
						"TFCS_Identity"
					    )
					),
					0
				    )
				),
				"tfcs-ID",
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
			return new Null();
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
			(short)0x8000
		    }
		),
		new QName (
		    "rrc.informationelements",
		    "TFC_SubsetList$Sequence_$ModeSpecificInfo"
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
			    "fdd",
			    0,
			    2
			),
			new FieldInfo (
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "TFC_SubsetList$Sequence_$ModeSpecificInfo$Tdd"
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

	// Methods for field "tfc_Subset"
	public TFC_Subset getTfc_Subset()
	{
	    return (TFC_Subset)mComponents[1];
	}
	
	public void setTfc_Subset(TFC_Subset tfc_Subset)
	{
	    mComponents[1] = tfc_Subset;
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
		"TFC_SubsetList$Sequence_"
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
				"TFC_SubsetList$Sequence_$ModeSpecificInfo"
			    )
			),
			"modeSpecificInfo",
			0,
			2,
			null
		    ),
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new ChoiceInfo (
				new Tags (
				    new short[] {
					(short)0x8001
				    }
				),
				new QName (
				    "rrc.informationelements",
				    "TFC_Subset"
				),
				new QName (
				    "InformationElements",
				    "TFC-Subset"
				),
				12314,
				null,
				new FieldsRef (
				    new QName (
					"rrc.informationelements",
					"TFC_Subset"
				    )
				),
				0,
				new TagDecoder (
				    new TagDecoderElement[] {
					new TagDecoderElement((short)0x8000, 0),
					new TagDecoderElement((short)0x8001, 1),
					new TagDecoderElement((short)0x8002, 2),
					new TagDecoderElement((short)0x8003, 3),
					new TagDecoderElement((short)0x8004, 4)
				    }
				)
			    )
			),
			"tfc-Subset",
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
	 * Get the type descriptor (TypeInfo) of 'this' Sequence_ object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Sequence_ object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Sequence_

    /**
     * Add an Element to the SEQUENCE OF/SET OF.
     */
    public synchronized void add(Sequence_ element)
    {
	super.addElement(element);
    }
    
    /**
     * Set an Element in the SEQUENCE OF/SET OF.
     */
    public synchronized void set(Sequence_ element, int atIndex)
    {
	super.setElement(element, atIndex);
    }
    
    /**
     * Get an Element from the SEQUENCE OF/SET OF.
     */
    public synchronized Sequence_ get(int atIndex)
    {
	return (Sequence_)super.getElement(atIndex);
    }
    
    /**
     * Insert an Element into the SEQUENCE OF/SET OF.
     */
    public synchronized void insert(Sequence_ element, int atIndex)
    {
	super.insertElement(element, atIndex);
    }
    
    /**
     * Remove an Element from the SEQUENCE OF/SET OF.
     */
    public synchronized void remove(Sequence_ element)
    {
	super.removeElement(element);
    }
    
    /**
     * Create an instance of  SEQUENCE OF/SET OF.
     */
    public AbstractData createInstance()
    {
	return (AbstractData)new Sequence_();
    }
    
    /**
     * Initialize the type descriptor.
     */
    private static final ContainerInfo c_typeinfo = new ContainerInfo (
	new Tags (
	    new short[] {
		0x0010
	    }
	),
	new QName (
	    "rrc.informationelements",
	    "TFC_SubsetList"
	),
	new QName (
	    "InformationElements",
	    "TFC-SubsetList"
	),
	12314,
	new SizeConstraint (
	    new ValueRangeConstraint (
		new AbstractBounds(
		    new com.oss.asn1.INTEGER(1), 
		    new com.oss.asn1.INTEGER(1024),
		    0
		)
	    )
	),
	new Bounds (
	    new java.lang.Long(1),
	    new java.lang.Long(1024)
	),
	new TypeInfoRef (
	    new QName (
		"rrc.informationelements",
		"TFC_SubsetList$Sequence_"
	    )
	)
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' TFC_SubsetList object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' TFC_SubsetList object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for TFC_SubsetList
