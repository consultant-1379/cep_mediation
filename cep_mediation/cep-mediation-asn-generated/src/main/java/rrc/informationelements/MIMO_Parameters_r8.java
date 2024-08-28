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
 * Define the ASN1 Type MIMO_Parameters_r8 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class MIMO_Parameters_r8 extends Sequence {
    
    /**
     * The default constructor.
     */
    public MIMO_Parameters_r8()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public MIMO_Parameters_r8(MIMO_Operation mimoOperation, 
		    ModeSpecificInfo modeSpecificInfo)
    {
	setMimoOperation(mimoOperation);
	setModeSpecificInfo(modeSpecificInfo);
    }
    
    public void initComponents()
    {
	mComponents[0] = MIMO_Operation.start;
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
		return MIMO_Operation.start;
	    case 1:
		return new ModeSpecificInfo();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "mimoOperation"
    public MIMO_Operation getMimoOperation()
    {
	return (MIMO_Operation)mComponents[0];
    }
    
    public void setMimoOperation(MIMO_Operation mimoOperation)
    {
	mComponents[0] = mimoOperation;
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
	    public Fdd(MIMO_N_M_Ratio mimoN_M_Ratio, 
			    MIMO_PilotConfiguration mimoPilotConfiguration)
	    {
		setMimoN_M_Ratio(mimoN_M_Ratio);
		setMimoPilotConfiguration(mimoPilotConfiguration);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = MIMO_N_M_Ratio.mnm1_2;
		mComponents[1] = new MIMO_PilotConfiguration();
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
			return MIMO_N_M_Ratio.mnm1_2;
		    case 1:
			return new MIMO_PilotConfiguration();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "mimoN_M_Ratio"
	    public MIMO_N_M_Ratio getMimoN_M_Ratio()
	    {
		return (MIMO_N_M_Ratio)mComponents[0];
	    }
	    
	    public void setMimoN_M_Ratio(MIMO_N_M_Ratio mimoN_M_Ratio)
	    {
		mComponents[0] = mimoN_M_Ratio;
	    }
	    
	    public boolean hasMimoN_M_Ratio()
	    {
		return componentIsPresent(0);
	    }
	    
	    public void deleteMimoN_M_Ratio()
	    {
		setComponentAbsent(0);
	    }
	    
	    
	    // Methods for field "mimoPilotConfiguration"
	    public MIMO_PilotConfiguration getMimoPilotConfiguration()
	    {
		return (MIMO_PilotConfiguration)mComponents[1];
	    }
	    
	    public void setMimoPilotConfiguration(MIMO_PilotConfiguration mimoPilotConfiguration)
	    {
		mComponents[1] = mimoPilotConfiguration;
	    }
	    
	    public boolean hasMimoPilotConfiguration()
	    {
		return componentIsPresent(1);
	    }
	    
	    public void deleteMimoPilotConfiguration()
	    {
		setComponentAbsent(1);
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
		    "MIMO_Parameters_r8$ModeSpecificInfo$Fdd"
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
					"MIMO_N_M_Ratio"
				    ),
				    new QName (
					"InformationElements",
					"MIMO-N-M-Ratio"
				    ),
				    12314,
				    null,
				    new MemberList (
					new MemberListElement[] {
					    new MemberListElement (
						"mnm1-2",
						0
					    ),
					    new MemberListElement (
						"mnm2-3",
						1
					    ),
					    new MemberListElement (
						"mnm3-4",
						2
					    ),
					    new MemberListElement (
						"mnm4-5",
						3
					    ),
					    new MemberListElement (
						"mnm5-6",
						4
					    ),
					    new MemberListElement (
						"mnm6-7",
						5
					    ),
					    new MemberListElement (
						"mnm7-8",
						6
					    ),
					    new MemberListElement (
						"mnm8-9",
						7
					    ),
					    new MemberListElement (
						"mnm9-10",
						8
					    ),
					    new MemberListElement (
						"mnm1-1",
						9
					    )
					}
				    ),
				    0,
				    MIMO_N_M_Ratio.mnm1_2
				)
			    ),
			    "mimoN-M-Ratio",
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
					"MIMO_PilotConfiguration"
				    ),
				    new QName (
					"InformationElements",
					"MIMO-PilotConfiguration"
				    ),
				    12314,
				    null,
				    new FieldsRef (
					new QName (
					    "rrc.informationelements",
					    "MIMO_PilotConfiguration"
					)
				    ),
				    0,
				    new TagDecodersRef (
					new QName (
					    "rrc.informationelements",
					    "MIMO_PilotConfiguration"
					)
				    ),
				    0
				)
			    ),
			    "mimoPilotConfiguration",
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
	 * @see Choice
	 */
	public static class Tdd extends Choice {
	    
	    /**
	     * The default constructor.
	     */
	    public Tdd()
	    {
	    }
	    
	    public static final  int  tdd128_chosen = 1;
	    public static final  int  tdd384_tdd768_chosen = 2;
	    
	    // Methods for field "tdd128"
	    public static Tdd createTddWithTdd128(Tdd128 tdd128)
	    {
		Tdd __object = new Tdd();

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
		public Tdd128(MimoSFModeForHSPDSCHDualStream mimoSFModeForHSPDSCHDualStream, 
				HS_SICH_ReferenceSignalInfoList hs_sich_ReferenceSignalInfoList)
		{
		    setMimoSFModeForHSPDSCHDualStream(mimoSFModeForHSPDSCHDualStream);
		    setHs_sich_ReferenceSignalInfoList(hs_sich_ReferenceSignalInfoList);
		}
		
		/**
		 * Construct with required components.
		 */
		public Tdd128(MimoSFModeForHSPDSCHDualStream mimoSFModeForHSPDSCHDualStream)
		{
		    setMimoSFModeForHSPDSCHDualStream(mimoSFModeForHSPDSCHDualStream);
		}
		
		public void initComponents()
		{
		    mComponents[0] = MimoSFModeForHSPDSCHDualStream.sf1;
		    mComponents[1] = new HS_SICH_ReferenceSignalInfoList();
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
			    return MimoSFModeForHSPDSCHDualStream.sf1;
			case 1:
			    return new HS_SICH_ReferenceSignalInfoList();
			default:
			    throw new InternalError("AbstractCollection.createInstance()");
		    }
		    
		}
		
		
		// Methods for field "mimoSFModeForHSPDSCHDualStream"
		public MimoSFModeForHSPDSCHDualStream getMimoSFModeForHSPDSCHDualStream()
		{
		    return (MimoSFModeForHSPDSCHDualStream)mComponents[0];
		}
		
		public void setMimoSFModeForHSPDSCHDualStream(MimoSFModeForHSPDSCHDualStream mimoSFModeForHSPDSCHDualStream)
		{
		    mComponents[0] = mimoSFModeForHSPDSCHDualStream;
		}
		
		
		
		/**
		 * Define the ASN1 Type MimoSFModeForHSPDSCHDualStream from ASN1 Module InformationElements.
		 * @see Enumerated
		 */
		public static final class MimoSFModeForHSPDSCHDualStream extends Enumerated {
		    
		    /**
		     * The default constructor.
		     */
		    private MimoSFModeForHSPDSCHDualStream()
		    {
			super(cFirstNumber);
		    }
		    
		    protected MimoSFModeForHSPDSCHDualStream(long value)
		    {
			super(value);
		    }
		    
		    // Named list definitions.
		    public static final MimoSFModeForHSPDSCHDualStream sf1 =
			new MimoSFModeForHSPDSCHDualStream(0);
		    public static final MimoSFModeForHSPDSCHDualStream sf1sf16 =
			new MimoSFModeForHSPDSCHDualStream(1);
		    private final static MimoSFModeForHSPDSCHDualStream cNamedNumbers[] = {
			 sf1, 
			 sf1sf16
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
		    
		    public static MimoSFModeForHSPDSCHDualStream valueOf(long value)
		    {
			return (MimoSFModeForHSPDSCHDualStream)sf1.lookupValue(value);
		    }
		    
		    /**
		     * Initialize the type descriptor.
		     */
		    private static final EnumeratedInfo c_typeinfo = new EnumeratedInfo (
			new Tags (
			    new short[] {
				(short)0x8000
			    }
			),
			new QName (
			    "rrc.informationelements",
			    "MIMO_Parameters_r8$ModeSpecificInfo$Tdd$Tdd128$MimoSFModeForHSPDSCHDualStream"
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
				    "sf1",
				    0
				),
				new MemberListElement (
				    "sf1sf16",
				    1
				)
			    }
			),
			0,
			sf1
		    );
		    
		    /**
		     * Get the type descriptor (TypeInfo) of 'this' MimoSFModeForHSPDSCHDualStream object.
		     */
		    public TypeInfo getTypeInfo()
		    {
			return c_typeinfo;
		    }
		    
		    /**
		     * Get the static type descriptor (TypeInfo) of 'this' MimoSFModeForHSPDSCHDualStream object.
		     */
		    public static TypeInfo getStaticTypeInfo()
		    {
			return c_typeinfo;
		    }
		    
		} // End class definition for MimoSFModeForHSPDSCHDualStream

		// Methods for field "hs_sich_ReferenceSignalInfoList"
		public HS_SICH_ReferenceSignalInfoList getHs_sich_ReferenceSignalInfoList()
		{
		    return (HS_SICH_ReferenceSignalInfoList)mComponents[1];
		}
		
		public void setHs_sich_ReferenceSignalInfoList(HS_SICH_ReferenceSignalInfoList hs_sich_ReferenceSignalInfoList)
		{
		    mComponents[1] = hs_sich_ReferenceSignalInfoList;
		}
		
		public boolean hasHs_sich_ReferenceSignalInfoList()
		{
		    return componentIsPresent(1);
		}
		
		public void deleteHs_sich_ReferenceSignalInfoList()
		{
		    setComponentAbsent(1);
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
			"MIMO_Parameters_r8$ModeSpecificInfo$Tdd$Tdd128"
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
					"MIMO_Parameters_r8$ModeSpecificInfo$Tdd$Tdd128$MimoSFModeForHSPDSCHDualStream"
				    )
				),
				"mimoSFModeForHSPDSCHDualStream",
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
					    "HS_SICH_ReferenceSignalInfoList"
					),
					new QName (
					    "InformationElements",
					    "HS-SICH-ReferenceSignalInfoList"
					),
					12314,
					new SizeConstraint (
					    new ValueRangeConstraint (
						new AbstractBounds(
						    new com.oss.asn1.INTEGER(1), 
						    new com.oss.asn1.INTEGER(4),
						    0
						)
					    )
					),
					new Bounds (
					    new java.lang.Long(1),
					    new java.lang.Long(4)
					),
					new TypeInfoRef (
					    new QName (
						"rrc.informationelements",
						"HS_SICH_ReferenceSignalInfoList$Sequence_"
					    )
					)
				    )
				),
				"hs-sich-ReferenceSignalInfoList",
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

	    // Methods for field "tdd384_tdd768"
	    public static Tdd createTddWithTdd384_tdd768(Null tdd384_tdd768)
	    {
		Tdd __object = new Tdd();

		__object.setTdd384_tdd768(tdd384_tdd768);
		return __object;
	    }
	    
	    public boolean hasTdd384_tdd768()
	    {
		return getChosenFlag() == tdd384_tdd768_chosen;
	    }
	    
	    public void setTdd384_tdd768(Null tdd384_tdd768)
	    {
		setChosenValue(tdd384_tdd768);
		setChosenFlag(tdd384_tdd768_chosen);
	    }
	    
	    
	    // Method to create a specific choice instance
	    public AbstractData createInstance(int chosen)
	    {
		switch (chosen) {
		    case tdd128_chosen:
			return new Tdd128();
		    case tdd384_tdd768_chosen:
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
			(short)0x8001
		    }
		),
		new QName (
		    "rrc.informationelements",
		    "MIMO_Parameters_r8$ModeSpecificInfo$Tdd"
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
				    "MIMO_Parameters_r8$ModeSpecificInfo$Tdd$Tdd128"
				)
			    ),
			    "tdd128",
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
			    "tdd384-tdd768",
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
		"MIMO_Parameters_r8$ModeSpecificInfo"
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
				"MIMO_Parameters_r8$ModeSpecificInfo$Fdd"
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
				"MIMO_Parameters_r8$ModeSpecificInfo$Tdd"
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
	    "MIMO_Parameters_r8"
	),
	new QName (
	    "InformationElements",
	    "MIMO-Parameters-r8"
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
				"MIMO_Operation"
			    ),
			    new QName (
				"InformationElements",
				"MIMO-Operation"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"start",
					0
				    ),
				    new MemberListElement (
					"continue",
					1
				    )
				}
			    ),
			    0,
			    MIMO_Operation.start
			)
		    ),
		    "mimoOperation",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "MIMO_Parameters_r8$ModeSpecificInfo"
			)
		    ),
		    "modeSpecificInfo",
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
     * Get the type descriptor (TypeInfo) of 'this' MIMO_Parameters_r8 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' MIMO_Parameters_r8 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for MIMO_Parameters_r8
