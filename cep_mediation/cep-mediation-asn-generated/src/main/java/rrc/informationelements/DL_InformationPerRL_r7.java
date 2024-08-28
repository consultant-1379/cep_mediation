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
 * Define the ASN1 Type DL_InformationPerRL_r7 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class DL_InformationPerRL_r7 extends Sequence {
    
    /**
     * The default constructor.
     */
    public DL_InformationPerRL_r7()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public DL_InformationPerRL_r7(ModeSpecificInfo modeSpecificInfo, 
		    Dl_dpchInfo dl_dpchInfo, 
		    E_AGCH_Information_r7 e_AGCH_Information, 
		    ModeSpecificInfo2 modeSpecificInfo2, CellIdentity cell_id)
    {
	setModeSpecificInfo(modeSpecificInfo);
	setDl_dpchInfo(dl_dpchInfo);
	setE_AGCH_Information(e_AGCH_Information);
	setModeSpecificInfo2(modeSpecificInfo2);
	setCell_id(cell_id);
    }
    
    /**
     * Construct with required components.
     */
    public DL_InformationPerRL_r7(ModeSpecificInfo modeSpecificInfo, 
		    ModeSpecificInfo2 modeSpecificInfo2)
    {
	setModeSpecificInfo(modeSpecificInfo);
	setModeSpecificInfo2(modeSpecificInfo2);
    }
    
    public void initComponents()
    {
	mComponents[0] = new ModeSpecificInfo();
	mComponents[1] = new Dl_dpchInfo();
	mComponents[2] = new E_AGCH_Information_r7();
	mComponents[3] = new ModeSpecificInfo2();
	mComponents[4] = new CellIdentity();
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
		return new ModeSpecificInfo();
	    case 1:
		return new Dl_dpchInfo();
	    case 2:
		return new E_AGCH_Information_r7();
	    case 3:
		return new ModeSpecificInfo2();
	    case 4:
		return new CellIdentity();
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
	    public Fdd(PrimaryCPICH_Info primaryCPICH_Info, 
			    BOOLEAN servingHSDSCH_RL_indicator, 
			    BOOLEAN servingEDCH_RL_indicator)
	    {
		setPrimaryCPICH_Info(primaryCPICH_Info);
		setServingHSDSCH_RL_indicator(servingHSDSCH_RL_indicator);
		setServingEDCH_RL_indicator(servingEDCH_RL_indicator);
	    }
	    
	    /**
	     * Construct with components.
	     */
	    public Fdd(PrimaryCPICH_Info primaryCPICH_Info, 
			    boolean servingHSDSCH_RL_indicator, 
			    boolean servingEDCH_RL_indicator)
	    {
		this(primaryCPICH_Info, 
		     new BOOLEAN(servingHSDSCH_RL_indicator), 
		     new BOOLEAN(servingEDCH_RL_indicator));
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new PrimaryCPICH_Info();
		mComponents[1] = new BOOLEAN();
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
			return new PrimaryCPICH_Info();
		    case 1:
			return new BOOLEAN();
		    case 2:
			return new BOOLEAN();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "primaryCPICH_Info"
	    public PrimaryCPICH_Info getPrimaryCPICH_Info()
	    {
		return (PrimaryCPICH_Info)mComponents[0];
	    }
	    
	    public void setPrimaryCPICH_Info(PrimaryCPICH_Info primaryCPICH_Info)
	    {
		mComponents[0] = primaryCPICH_Info;
	    }
	    
	    
	    // Methods for field "servingHSDSCH_RL_indicator"
	    public boolean getServingHSDSCH_RL_indicator()
	    {
		return ((BOOLEAN)mComponents[1]).booleanValue();
	    }
	    
	    public void setServingHSDSCH_RL_indicator(boolean servingHSDSCH_RL_indicator)
	    {
		setServingHSDSCH_RL_indicator(new BOOLEAN(servingHSDSCH_RL_indicator));
	    }
	    
	    public void setServingHSDSCH_RL_indicator(BOOLEAN servingHSDSCH_RL_indicator)
	    {
		mComponents[1] = servingHSDSCH_RL_indicator;
	    }
	    
	    
	    // Methods for field "servingEDCH_RL_indicator"
	    public boolean getServingEDCH_RL_indicator()
	    {
		return ((BOOLEAN)mComponents[2]).booleanValue();
	    }
	    
	    public void setServingEDCH_RL_indicator(boolean servingEDCH_RL_indicator)
	    {
		setServingEDCH_RL_indicator(new BOOLEAN(servingEDCH_RL_indicator));
	    }
	    
	    public void setServingEDCH_RL_indicator(BOOLEAN servingEDCH_RL_indicator)
	    {
		mComponents[2] = servingEDCH_RL_indicator;
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
		    "DL_InformationPerRL_r7$ModeSpecificInfo$Fdd"
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
					"PrimaryCPICH_Info"
				    ),
				    new QName (
					"InformationElements",
					"PrimaryCPICH-Info"
				    ),
				    12314,
				    null,
				    new FieldsRef (
					new QName (
					    "rrc.informationelements",
					    "PrimaryCPICH_Info"
					)
				    ),
				    0,
				    new TagDecodersRef (
					new QName (
					    "rrc.informationelements",
					    "PrimaryCPICH_Info"
					)
				    ),
				    0
				)
			    ),
			    "primaryCPICH-Info",
			    0,
			    2,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new TypeInfo (
				    new Tags (
					new short[] {
					    (short)0x8001
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
			    "servingHSDSCH-RL-indicator",
			    1,
			    2,
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
			    "servingEDCH-RL-indicator",
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
	public static ModeSpecificInfo createModeSpecificInfoWithTdd(PrimaryCCPCH_Info_r4 tdd)
	{
	    ModeSpecificInfo __object = new ModeSpecificInfo();

	    __object.setTdd(tdd);
	    return __object;
	}
	
	public boolean hasTdd()
	{
	    return getChosenFlag() == tdd_chosen;
	}
	
	public void setTdd(PrimaryCCPCH_Info_r4 tdd)
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
		    return new PrimaryCCPCH_Info_r4();
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
		"DL_InformationPerRL_r7$ModeSpecificInfo"
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
				"DL_InformationPerRL_r7$ModeSpecificInfo$Fdd"
			    )
			),
			"fdd",
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
				    "PrimaryCCPCH_Info_r4"
				),
				new QName (
				    "InformationElements",
				    "PrimaryCCPCH-Info-r4"
				),
				12314,
				null,
				new FieldsRef (
				    new QName (
					"rrc.informationelements",
					"PrimaryCCPCH_Info_r4"
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

    // Methods for field "dl_dpchInfo"
    public Dl_dpchInfo getDl_dpchInfo()
    {
	return (Dl_dpchInfo)mComponents[1];
    }
    
    public void setDl_dpchInfo(Dl_dpchInfo dl_dpchInfo)
    {
	mComponents[1] = dl_dpchInfo;
    }
    
    public boolean hasDl_dpchInfo()
    {
	return componentIsPresent(1);
    }
    
    public void deleteDl_dpchInfo()
    {
	setComponentAbsent(1);
    }
    
    
    
    /**
     * Define the ASN1 Type Dl_dpchInfo from ASN1 Module InformationElements.
     * @see Choice
     */
    public static class Dl_dpchInfo extends Choice {
	
	/**
	 * The default constructor.
	 */
	public Dl_dpchInfo()
	{
	}
	
	public static final  int  dl_DPCH_InfoPerRL_chosen = 1;
	public static final  int  dl_FDPCH_InfoPerRL_chosen = 2;
	
	// Methods for field "dl_DPCH_InfoPerRL"
	public static Dl_dpchInfo createDl_dpchInfoWithDl_DPCH_InfoPerRL(DL_DPCH_InfoPerRL_r7 dl_DPCH_InfoPerRL)
	{
	    Dl_dpchInfo __object = new Dl_dpchInfo();

	    __object.setDl_DPCH_InfoPerRL(dl_DPCH_InfoPerRL);
	    return __object;
	}
	
	public boolean hasDl_DPCH_InfoPerRL()
	{
	    return getChosenFlag() == dl_DPCH_InfoPerRL_chosen;
	}
	
	public void setDl_DPCH_InfoPerRL(DL_DPCH_InfoPerRL_r7 dl_DPCH_InfoPerRL)
	{
	    setChosenValue(dl_DPCH_InfoPerRL);
	    setChosenFlag(dl_DPCH_InfoPerRL_chosen);
	}
	
	
	// Methods for field "dl_FDPCH_InfoPerRL"
	public static Dl_dpchInfo createDl_dpchInfoWithDl_FDPCH_InfoPerRL(DL_FDPCH_InfoPerRL_r7 dl_FDPCH_InfoPerRL)
	{
	    Dl_dpchInfo __object = new Dl_dpchInfo();

	    __object.setDl_FDPCH_InfoPerRL(dl_FDPCH_InfoPerRL);
	    return __object;
	}
	
	public boolean hasDl_FDPCH_InfoPerRL()
	{
	    return getChosenFlag() == dl_FDPCH_InfoPerRL_chosen;
	}
	
	public void setDl_FDPCH_InfoPerRL(DL_FDPCH_InfoPerRL_r7 dl_FDPCH_InfoPerRL)
	{
	    setChosenValue(dl_FDPCH_InfoPerRL);
	    setChosenFlag(dl_FDPCH_InfoPerRL_chosen);
	}
	
	
	// Method to create a specific choice instance
	public AbstractData createInstance(int chosen)
	{
	    switch (chosen) {
		case dl_DPCH_InfoPerRL_chosen:
		    return new DL_DPCH_InfoPerRL_r7();
		case dl_FDPCH_InfoPerRL_chosen:
		    return new DL_FDPCH_InfoPerRL_r7();
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
		"DL_InformationPerRL_r7$Dl_dpchInfo"
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
				    "DL_DPCH_InfoPerRL_r7"
				),
				new QName (
				    "InformationElements",
				    "DL-DPCH-InfoPerRL-r7"
				),
				12314,
				null,
				new FieldsRef (
				    new QName (
					"rrc.informationelements",
					"DL_DPCH_InfoPerRL_r7"
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
			"dl-DPCH-InfoPerRL",
			0,
			2
		    ),
		    new FieldInfo (
			new TypeInfoRef (
			    new SequenceInfo (
				new Tags (
				    new short[] {
					(short)0x8001
				    }
				),
				new QName (
				    "rrc.informationelements",
				    "DL_FDPCH_InfoPerRL_r7"
				),
				new QName (
				    "InformationElements",
				    "DL-FDPCH-InfoPerRL-r7"
				),
				12314,
				null,
				new FieldsRef (
				    new QName (
					"rrc.informationelements",
					"DL_FDPCH_InfoPerRL_r7"
				    )
				),
				0,
				new TagDecodersRef (
				    new QName (
					"rrc.informationelements",
					"DL_FDPCH_InfoPerRL_r7"
				    )
				),
				0
			    )
			),
			"dl-FDPCH-InfoPerRL",
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
	 * Get the type descriptor (TypeInfo) of 'this' Dl_dpchInfo object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Dl_dpchInfo object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Dl_dpchInfo

    // Methods for field "e_AGCH_Information"
    public E_AGCH_Information_r7 getE_AGCH_Information()
    {
	return (E_AGCH_Information_r7)mComponents[2];
    }
    
    public void setE_AGCH_Information(E_AGCH_Information_r7 e_AGCH_Information)
    {
	mComponents[2] = e_AGCH_Information;
    }
    
    public boolean hasE_AGCH_Information()
    {
	return componentIsPresent(2);
    }
    
    public void deleteE_AGCH_Information()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "modeSpecificInfo2"
    public ModeSpecificInfo2 getModeSpecificInfo2()
    {
	return (ModeSpecificInfo2)mComponents[3];
    }
    
    public void setModeSpecificInfo2(ModeSpecificInfo2 modeSpecificInfo2)
    {
	mComponents[3] = modeSpecificInfo2;
    }
    
    
    
    /**
     * Define the ASN1 Type ModeSpecificInfo2 from ASN1 Module InformationElements.
     * @see Choice
     */
    public static class ModeSpecificInfo2 extends Choice {
	
	/**
	 * The default constructor.
	 */
	public ModeSpecificInfo2()
	{
	}
	
	public static final  int  fdd_chosen = 1;
	public static final  int  tdd_chosen = 2;
	
	// Methods for field "fdd"
	public static ModeSpecificInfo2 createModeSpecificInfo2WithFdd(Fdd fdd)
	{
	    ModeSpecificInfo2 __object = new ModeSpecificInfo2();

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
	    public Fdd(E_HICH_Info e_HICH_Info, E_RGCH_Info e_RGCH_Info)
	    {
		setE_HICH_Info(e_HICH_Info);
		setE_RGCH_Info(e_RGCH_Info);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new E_HICH_Info();
		mComponents[1] = new E_RGCH_Info();
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
			return new E_HICH_Info();
		    case 1:
			return new E_RGCH_Info();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "e_HICH_Info"
	    public E_HICH_Info getE_HICH_Info()
	    {
		return (E_HICH_Info)mComponents[0];
	    }
	    
	    public void setE_HICH_Info(E_HICH_Info e_HICH_Info)
	    {
		mComponents[0] = e_HICH_Info;
	    }
	    
	    public boolean hasE_HICH_Info()
	    {
		return componentIsPresent(0);
	    }
	    
	    public void deleteE_HICH_Info()
	    {
		setComponentAbsent(0);
	    }
	    
	    
	    
	    /**
	     * Define the ASN1 Type E_HICH_Info from ASN1 Module InformationElements.
	     * @see Choice
	     */
	    public static class E_HICH_Info extends Choice {
		
		/**
		 * The default constructor.
		 */
		public E_HICH_Info()
		{
		}
		
		public static final  int  e_HICH_Information_chosen = 1;
		public static final  int  releaseIndicator_chosen = 2;
		
		// Methods for field "e_HICH_Information"
		public static E_HICH_Info createE_HICH_InfoWithE_HICH_Information(E_HICH_Information e_HICH_Information)
		{
		    E_HICH_Info __object = new E_HICH_Info();

		    __object.setE_HICH_Information(e_HICH_Information);
		    return __object;
		}
		
		public boolean hasE_HICH_Information()
		{
		    return getChosenFlag() == e_HICH_Information_chosen;
		}
		
		public void setE_HICH_Information(E_HICH_Information e_HICH_Information)
		{
		    setChosenValue(e_HICH_Information);
		    setChosenFlag(e_HICH_Information_chosen);
		}
		
		
		// Methods for field "releaseIndicator"
		public static E_HICH_Info createE_HICH_InfoWithReleaseIndicator(Null releaseIndicator)
		{
		    E_HICH_Info __object = new E_HICH_Info();

		    __object.setReleaseIndicator(releaseIndicator);
		    return __object;
		}
		
		public boolean hasReleaseIndicator()
		{
		    return getChosenFlag() == releaseIndicator_chosen;
		}
		
		public void setReleaseIndicator(Null releaseIndicator)
		{
		    setChosenValue(releaseIndicator);
		    setChosenFlag(releaseIndicator_chosen);
		}
		
		
		// Method to create a specific choice instance
		public AbstractData createInstance(int chosen)
		{
		    switch (chosen) {
			case e_HICH_Information_chosen:
			    return new E_HICH_Information();
			case releaseIndicator_chosen:
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
			"DL_InformationPerRL_r7$ModeSpecificInfo2$Fdd$E_HICH_Info"
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
				    new SequenceInfo (
					new Tags (
					    new short[] {
						(short)0x8000
					    }
					),
					new QName (
					    "rrc.informationelements",
					    "E_HICH_Information"
					),
					new QName (
					    "InformationElements",
					    "E-HICH-Information"
					),
					12314,
					null,
					new FieldsRef (
					    new QName (
						"rrc.informationelements",
						"E_HICH_Information"
					    )
					),
					0,
					new TagDecodersRef (
					    new QName (
						"rrc.informationelements",
						"E_HICH_Information"
					    )
					),
					0
				    )
				),
				"e-HICH-Information",
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
				"releaseIndicator",
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
		 * Get the type descriptor (TypeInfo) of 'this' E_HICH_Info object.
		 */
		public TypeInfo getTypeInfo()
		{
		    return c_typeinfo;
		}
		
		/**
		 * Get the static type descriptor (TypeInfo) of 'this' E_HICH_Info object.
		 */
		public static TypeInfo getStaticTypeInfo()
		{
		    return c_typeinfo;
		}
		
	    } // End class definition for E_HICH_Info

	    // Methods for field "e_RGCH_Info"
	    public E_RGCH_Info getE_RGCH_Info()
	    {
		return (E_RGCH_Info)mComponents[1];
	    }
	    
	    public void setE_RGCH_Info(E_RGCH_Info e_RGCH_Info)
	    {
		mComponents[1] = e_RGCH_Info;
	    }
	    
	    public boolean hasE_RGCH_Info()
	    {
		return componentIsPresent(1);
	    }
	    
	    public void deleteE_RGCH_Info()
	    {
		setComponentAbsent(1);
	    }
	    
	    
	    
	    /**
	     * Define the ASN1 Type E_RGCH_Info from ASN1 Module InformationElements.
	     * @see Choice
	     */
	    public static class E_RGCH_Info extends Choice {
		
		/**
		 * The default constructor.
		 */
		public E_RGCH_Info()
		{
		}
		
		public static final  int  e_RGCH_Information_chosen = 1;
		public static final  int  releaseIndicator_chosen = 2;
		
		// Methods for field "e_RGCH_Information"
		public static E_RGCH_Info createE_RGCH_InfoWithE_RGCH_Information(E_RGCH_Information e_RGCH_Information)
		{
		    E_RGCH_Info __object = new E_RGCH_Info();

		    __object.setE_RGCH_Information(e_RGCH_Information);
		    return __object;
		}
		
		public boolean hasE_RGCH_Information()
		{
		    return getChosenFlag() == e_RGCH_Information_chosen;
		}
		
		public void setE_RGCH_Information(E_RGCH_Information e_RGCH_Information)
		{
		    setChosenValue(e_RGCH_Information);
		    setChosenFlag(e_RGCH_Information_chosen);
		}
		
		
		// Methods for field "releaseIndicator"
		public static E_RGCH_Info createE_RGCH_InfoWithReleaseIndicator(Null releaseIndicator)
		{
		    E_RGCH_Info __object = new E_RGCH_Info();

		    __object.setReleaseIndicator(releaseIndicator);
		    return __object;
		}
		
		public boolean hasReleaseIndicator()
		{
		    return getChosenFlag() == releaseIndicator_chosen;
		}
		
		public void setReleaseIndicator(Null releaseIndicator)
		{
		    setChosenValue(releaseIndicator);
		    setChosenFlag(releaseIndicator_chosen);
		}
		
		
		// Method to create a specific choice instance
		public AbstractData createInstance(int chosen)
		{
		    switch (chosen) {
			case e_RGCH_Information_chosen:
			    return new E_RGCH_Information();
			case releaseIndicator_chosen:
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
			"DL_InformationPerRL_r7$ModeSpecificInfo2$Fdd$E_RGCH_Info"
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
				    new SequenceInfo (
					new Tags (
					    new short[] {
						(short)0x8000
					    }
					),
					new QName (
					    "rrc.informationelements",
					    "E_RGCH_Information"
					),
					new QName (
					    "InformationElements",
					    "E-RGCH-Information"
					),
					12314,
					null,
					new FieldsRef (
					    new QName (
						"rrc.informationelements",
						"E_RGCH_Information"
					    )
					),
					0,
					new TagDecodersRef (
					    new QName (
						"rrc.informationelements",
						"E_RGCH_Information"
					    )
					),
					0
				    )
				),
				"e-RGCH-Information",
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
				"releaseIndicator",
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
		 * Get the type descriptor (TypeInfo) of 'this' E_RGCH_Info object.
		 */
		public TypeInfo getTypeInfo()
		{
		    return c_typeinfo;
		}
		
		/**
		 * Get the static type descriptor (TypeInfo) of 'this' E_RGCH_Info object.
		 */
		public static TypeInfo getStaticTypeInfo()
		{
		    return c_typeinfo;
		}
		
	    } // End class definition for E_RGCH_Info

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
		    "DL_InformationPerRL_r7$ModeSpecificInfo2$Fdd"
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
				    "DL_InformationPerRL_r7$ModeSpecificInfo2$Fdd$E_HICH_Info"
				)
			    ),
			    "e-HICH-Info",
			    0,
			    3,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "DL_InformationPerRL_r7$ModeSpecificInfo2$Fdd$E_RGCH_Info"
				)
			    ),
			    "e-RGCH-Info",
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
	public static ModeSpecificInfo2 createModeSpecificInfo2WithTdd(Tdd tdd)
	{
	    ModeSpecificInfo2 __object = new ModeSpecificInfo2();

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
	    
	    public static final  int  tdd384_tdd768_chosen = 1;
	    public static final  int  tdd128_chosen = 2;
	    
	    // Methods for field "tdd384_tdd768"
	    public static Tdd createTddWithTdd384_tdd768(Tdd384_tdd768 tdd384_tdd768)
	    {
		Tdd __object = new Tdd();

		__object.setTdd384_tdd768(tdd384_tdd768);
		return __object;
	    }
	    
	    public boolean hasTdd384_tdd768()
	    {
		return getChosenFlag() == tdd384_tdd768_chosen;
	    }
	    
	    public void setTdd384_tdd768(Tdd384_tdd768 tdd384_tdd768)
	    {
		setChosenValue(tdd384_tdd768);
		setChosenFlag(tdd384_tdd768_chosen);
	    }
	    
	    
	    
	    /**
	     * Define the ASN1 Type Tdd384_tdd768 from ASN1 Module InformationElements.
	     * @see Sequence
	     */
	    public static class Tdd384_tdd768 extends Sequence {
		
		/**
		 * The default constructor.
		 */
		public Tdd384_tdd768()
		{
		}
		
		/**
		 * Construct with AbstractData components.
		 */
		public Tdd384_tdd768(E_HICH_Information_TDD384_768 e_HICH_Info)
		{
		    setE_HICH_Info(e_HICH_Info);
		}
		
		public void initComponents()
		{
		    mComponents[0] = new E_HICH_Information_TDD384_768();
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
			    return new E_HICH_Information_TDD384_768();
			default:
			    throw new InternalError("AbstractCollection.createInstance()");
		    }
		    
		}
		
		
		// Methods for field "e_HICH_Info"
		public E_HICH_Information_TDD384_768 getE_HICH_Info()
		{
		    return (E_HICH_Information_TDD384_768)mComponents[0];
		}
		
		public void setE_HICH_Info(E_HICH_Information_TDD384_768 e_HICH_Info)
		{
		    mComponents[0] = e_HICH_Info;
		}
		
		public boolean hasE_HICH_Info()
		{
		    return componentIsPresent(0);
		}
		
		public void deleteE_HICH_Info()
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
			"DL_InformationPerRL_r7$ModeSpecificInfo2$Tdd$Tdd384_tdd768"
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
					    "E_HICH_Information_TDD384_768"
					),
					new QName (
					    "InformationElements",
					    "E-HICH-Information-TDD384-768"
					),
					12314,
					null,
					new FieldsRef (
					    new QName (
						"rrc.informationelements",
						"E_HICH_Information_TDD384_768"
					    )
					),
					0,
					new TagDecodersRef (
					    new QName (
						"rrc.informationelements",
						"E_HICH_Information_TDD384_768"
					    )
					),
					0
				    )
				),
				"e-HICH-Info",
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
		 * Get the type descriptor (TypeInfo) of 'this' Tdd384_tdd768 object.
		 */
		public TypeInfo getTypeInfo()
		{
		    return c_typeinfo;
		}
		
		/**
		 * Get the static type descriptor (TypeInfo) of 'this' Tdd384_tdd768 object.
		 */
		public static TypeInfo getStaticTypeInfo()
		{
		    return c_typeinfo;
		}
		
	    } // End class definition for Tdd384_tdd768

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
		public Tdd128(E_HICH_Information_TDD128 e_HICH_Info)
		{
		    setE_HICH_Info(e_HICH_Info);
		}
		
		public void initComponents()
		{
		    mComponents[0] = new E_HICH_Information_TDD128();
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
			    return new E_HICH_Information_TDD128();
			default:
			    throw new InternalError("AbstractCollection.createInstance()");
		    }
		    
		}
		
		
		// Methods for field "e_HICH_Info"
		public E_HICH_Information_TDD128 getE_HICH_Info()
		{
		    return (E_HICH_Information_TDD128)mComponents[0];
		}
		
		public void setE_HICH_Info(E_HICH_Information_TDD128 e_HICH_Info)
		{
		    mComponents[0] = e_HICH_Info;
		}
		
		public boolean hasE_HICH_Info()
		{
		    return componentIsPresent(0);
		}
		
		public void deleteE_HICH_Info()
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
			"DL_InformationPerRL_r7$ModeSpecificInfo2$Tdd$Tdd128"
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
					    "E_HICH_Information_TDD128"
					),
					new QName (
					    "InformationElements",
					    "E-HICH-Information-TDD128"
					),
					12314,
					null,
					new FieldsRef (
					    new QName (
						"rrc.informationelements",
						"E_HICH_Information_TDD128"
					    )
					),
					0,
					new TagDecodersRef (
					    new QName (
						"rrc.informationelements",
						"E_HICH_Information_TDD128"
					    )
					),
					0
				    )
				),
				"e-HICH-Info",
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
		    case tdd384_tdd768_chosen:
			return new Tdd384_tdd768();
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
			(short)0x8001
		    }
		),
		new QName (
		    "rrc.informationelements",
		    "DL_InformationPerRL_r7$ModeSpecificInfo2$Tdd"
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
				    "DL_InformationPerRL_r7$ModeSpecificInfo2$Tdd$Tdd384_tdd768"
				)
			    ),
			    "tdd384-tdd768",
			    0,
			    2
			),
			new FieldInfo (
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "DL_InformationPerRL_r7$ModeSpecificInfo2$Tdd$Tdd128"
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
		    (short)0x8003
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"DL_InformationPerRL_r7$ModeSpecificInfo2"
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
				"DL_InformationPerRL_r7$ModeSpecificInfo2$Fdd"
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
				"DL_InformationPerRL_r7$ModeSpecificInfo2$Tdd"
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
	 * Get the type descriptor (TypeInfo) of 'this' ModeSpecificInfo2 object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' ModeSpecificInfo2 object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for ModeSpecificInfo2

    // Methods for field "cell_id"
    public CellIdentity getCell_id()
    {
	return (CellIdentity)mComponents[4];
    }
    
    public void setCell_id(CellIdentity cell_id)
    {
	mComponents[4] = cell_id;
    }
    
    public boolean hasCell_id()
    {
	return componentIsPresent(4);
    }
    
    public void deleteCell_id()
    {
	setComponentAbsent(4);
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
	    "DL_InformationPerRL_r7"
	),
	new QName (
	    "InformationElements",
	    "DL-InformationPerRL-r7"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "DL_InformationPerRL_r7$ModeSpecificInfo"
			)
		    ),
		    "modeSpecificInfo",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "DL_InformationPerRL_r7$Dl_dpchInfo"
			)
		    ),
		    "dl-dpchInfo",
		    1,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"E_AGCH_Information_r7"
			    ),
			    new QName (
				"InformationElements",
				"E-AGCH-Information-r7"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "E_AGCH_Information_r7"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "E_AGCH_Information_r7"
				)
			    ),
			    0
			)
		    ),
		    "e-AGCH-Information",
		    2,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "DL_InformationPerRL_r7$ModeSpecificInfo2"
			)
		    ),
		    "modeSpecificInfo2",
		    3,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8004
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"CellIdentity"
			    ),
			    new QName (
				"InformationElements",
				"CellIdentity"
			    ),
			    12314,
			    new SizeConstraint (
				new SingleValueConstraint (
				    new com.oss.asn1.INTEGER(28)
				)
			    ),
			    new Bounds (
				new java.lang.Long(28),
				new java.lang.Long(28)
			    ),
			    null
			)
		    ),
		    "cell-id",
		    4,
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
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3)
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
     * Get the type descriptor (TypeInfo) of 'this' DL_InformationPerRL_r7 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' DL_InformationPerRL_r7 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for DL_InformationPerRL_r7
