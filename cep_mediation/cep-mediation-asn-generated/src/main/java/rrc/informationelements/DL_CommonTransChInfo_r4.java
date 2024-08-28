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
 * Define the ASN1 Type DL_CommonTransChInfo_r4 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class DL_CommonTransChInfo_r4 extends Sequence {
    
    /**
     * The default constructor.
     */
    public DL_CommonTransChInfo_r4()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public DL_CommonTransChInfo_r4(TFCS sccpch_TFCS, 
		    ModeSpecificInfo modeSpecificInfo)
    {
	setSccpch_TFCS(sccpch_TFCS);
	setModeSpecificInfo(modeSpecificInfo);
    }
    
    public void initComponents()
    {
	mComponents[0] = new TFCS();
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
		return new TFCS();
	    case 1:
		return new ModeSpecificInfo();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "sccpch_TFCS"
    public TFCS getSccpch_TFCS()
    {
	return (TFCS)mComponents[0];
    }
    
    public void setSccpch_TFCS(TFCS sccpch_TFCS)
    {
	mComponents[0] = sccpch_TFCS;
    }
    
    public boolean hasSccpch_TFCS()
    {
	return componentIsPresent(0);
    }
    
    public void deleteSccpch_TFCS()
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
    
    public boolean hasModeSpecificInfo()
    {
	return componentIsPresent(1);
    }
    
    public void deleteModeSpecificInfo()
    {
	setComponentAbsent(1);
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
	    public Fdd(Dl_Parameters dl_Parameters)
	    {
		setDl_Parameters(dl_Parameters);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new Dl_Parameters();
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
			return new Dl_Parameters();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "dl_Parameters"
	    public Dl_Parameters getDl_Parameters()
	    {
		return (Dl_Parameters)mComponents[0];
	    }
	    
	    public void setDl_Parameters(Dl_Parameters dl_Parameters)
	    {
		mComponents[0] = dl_Parameters;
	    }
	    
	    public boolean hasDl_Parameters()
	    {
		return componentIsPresent(0);
	    }
	    
	    public void deleteDl_Parameters()
	    {
		setComponentAbsent(0);
	    }
	    
	    
	    
	    /**
	     * Define the ASN1 Type Dl_Parameters from ASN1 Module InformationElements.
	     * @see Choice
	     */
	    public static class Dl_Parameters extends Choice {
		
		/**
		 * The default constructor.
		 */
		public Dl_Parameters()
		{
		}
		
		public static final  int  dl_DCH_TFCS_chosen = 1;
		public static final  int  sameAsUL_chosen = 2;
		
		// Methods for field "dl_DCH_TFCS"
		public static Dl_Parameters createDl_ParametersWithDl_DCH_TFCS(Dl_DCH_TFCS dl_DCH_TFCS)
		{
		    Dl_Parameters __object = new Dl_Parameters();

		    __object.setDl_DCH_TFCS(dl_DCH_TFCS);
		    return __object;
		}
		
		public boolean hasDl_DCH_TFCS()
		{
		    return getChosenFlag() == dl_DCH_TFCS_chosen;
		}
		
		public void setDl_DCH_TFCS(Dl_DCH_TFCS dl_DCH_TFCS)
		{
		    setChosenValue(dl_DCH_TFCS);
		    setChosenFlag(dl_DCH_TFCS_chosen);
		}
		
		
		
		/**
		 * Define the ASN1 Type Dl_DCH_TFCS from ASN1 Module InformationElements.
		 * @see Sequence
		 */
		public static class Dl_DCH_TFCS extends Sequence {
		    
		    /**
		     * The default constructor.
		     */
		    public Dl_DCH_TFCS()
		    {
		    }
		    
		    /**
		     * Construct with AbstractData components.
		     */
		    public Dl_DCH_TFCS(TFCS tfcs)
		    {
			setTfcs(tfcs);
		    }
		    
		    public void initComponents()
		    {
			mComponents[0] = new TFCS();
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
				return new TFCS();
			    default:
				throw new InternalError("AbstractCollection.createInstance()");
			}
			
		    }
		    
		    
		    // Methods for field "tfcs"
		    public TFCS getTfcs()
		    {
			return (TFCS)mComponents[0];
		    }
		    
		    public void setTfcs(TFCS tfcs)
		    {
			mComponents[0] = tfcs;
		    }
		    
		    public boolean hasTfcs()
		    {
			return componentIsPresent(0);
		    }
		    
		    public void deleteTfcs()
		    {
			setComponentAbsent(0);
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
			    "DL_CommonTransChInfo_r4$ModeSpecificInfo$Fdd$Dl_Parameters$Dl_DCH_TFCS"
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
						"TFCS"
					    ),
					    new QName (
						"InformationElements",
						"TFCS"
					    ),
					    12314,
					    null,
					    new FieldsRef (
						new QName (
						    "rrc.informationelements",
						    "TFCS"
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
				    "tfcs",
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
		     * Get the type descriptor (TypeInfo) of 'this' Dl_DCH_TFCS object.
		     */
		    public TypeInfo getTypeInfo()
		    {
			return c_typeinfo;
		    }
		    
		    /**
		     * Get the static type descriptor (TypeInfo) of 'this' Dl_DCH_TFCS object.
		     */
		    public static TypeInfo getStaticTypeInfo()
		    {
			return c_typeinfo;
		    }
		    
		} // End class definition for Dl_DCH_TFCS

		// Methods for field "sameAsUL"
		public static Dl_Parameters createDl_ParametersWithSameAsUL(Null sameAsUL)
		{
		    Dl_Parameters __object = new Dl_Parameters();

		    __object.setSameAsUL(sameAsUL);
		    return __object;
		}
		
		public boolean hasSameAsUL()
		{
		    return getChosenFlag() == sameAsUL_chosen;
		}
		
		public void setSameAsUL(Null sameAsUL)
		{
		    setChosenValue(sameAsUL);
		    setChosenFlag(sameAsUL_chosen);
		}
		
		
		// Method to create a specific choice instance
		public AbstractData createInstance(int chosen)
		{
		    switch (chosen) {
			case dl_DCH_TFCS_chosen:
			    return new Dl_DCH_TFCS();
			case sameAsUL_chosen:
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
			"DL_CommonTransChInfo_r4$ModeSpecificInfo$Fdd$Dl_Parameters"
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
					"DL_CommonTransChInfo_r4$ModeSpecificInfo$Fdd$Dl_Parameters$Dl_DCH_TFCS"
				    )
				),
				"dl-DCH-TFCS",
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
				"sameAsUL",
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
		 * Get the type descriptor (TypeInfo) of 'this' Dl_Parameters object.
		 */
		public TypeInfo getTypeInfo()
		{
		    return c_typeinfo;
		}
		
		/**
		 * Get the static type descriptor (TypeInfo) of 'this' Dl_Parameters object.
		 */
		public static TypeInfo getStaticTypeInfo()
		{
		    return c_typeinfo;
		}
		
	    } // End class definition for Dl_Parameters

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
		    "DL_CommonTransChInfo_r4$ModeSpecificInfo$Fdd"
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
				    "DL_CommonTransChInfo_r4$ModeSpecificInfo$Fdd$Dl_Parameters"
				)
			    ),
			    "dl-Parameters",
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
	    public Tdd(IndividualDL_CCTrCH_InfoList individualDL_CCTrCH_InfoList)
	    {
		setIndividualDL_CCTrCH_InfoList(individualDL_CCTrCH_InfoList);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new IndividualDL_CCTrCH_InfoList();
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
			return new IndividualDL_CCTrCH_InfoList();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "individualDL_CCTrCH_InfoList"
	    public IndividualDL_CCTrCH_InfoList getIndividualDL_CCTrCH_InfoList()
	    {
		return (IndividualDL_CCTrCH_InfoList)mComponents[0];
	    }
	    
	    public void setIndividualDL_CCTrCH_InfoList(IndividualDL_CCTrCH_InfoList individualDL_CCTrCH_InfoList)
	    {
		mComponents[0] = individualDL_CCTrCH_InfoList;
	    }
	    
	    public boolean hasIndividualDL_CCTrCH_InfoList()
	    {
		return componentIsPresent(0);
	    }
	    
	    public void deleteIndividualDL_CCTrCH_InfoList()
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
		    "DL_CommonTransChInfo_r4$ModeSpecificInfo$Tdd"
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
					"IndividualDL_CCTrCH_InfoList"
				    ),
				    new QName (
					"InformationElements",
					"IndividualDL-CCTrCH-InfoList"
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
					    "IndividualDL_CCTrCH_Info"
					)
				    )
				)
			    ),
			    "individualDL-CCTrCH-InfoList",
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
		"DL_CommonTransChInfo_r4$ModeSpecificInfo"
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
				"DL_CommonTransChInfo_r4$ModeSpecificInfo$Fdd"
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
				"DL_CommonTransChInfo_r4$ModeSpecificInfo$Tdd"
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
	    "DL_CommonTransChInfo_r4"
	),
	new QName (
	    "InformationElements",
	    "DL-CommonTransChInfo-r4"
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
				"TFCS"
			    ),
			    new QName (
				"InformationElements",
				"TFCS"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "TFCS"
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
		    "sccpch-TFCS",
		    0,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "DL_CommonTransChInfo_r4$ModeSpecificInfo"
			)
		    ),
		    "modeSpecificInfo",
		    1,
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
     * Get the type descriptor (TypeInfo) of 'this' DL_CommonTransChInfo_r4 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' DL_CommonTransChInfo_r4 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for DL_CommonTransChInfo_r4
