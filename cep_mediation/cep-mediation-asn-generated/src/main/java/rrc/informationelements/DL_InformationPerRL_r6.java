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
 * Define the ASN1 Type DL_InformationPerRL_r6 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class DL_InformationPerRL_r6 extends Sequence {
    
    /**
     * The default constructor.
     */
    public DL_InformationPerRL_r6()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public DL_InformationPerRL_r6(ModeSpecificInfo modeSpecificInfo, 
		    Dl_dpchInfo dl_dpchInfo, 
		    E_AGCH_Information e_AGCH_Information, 
		    E_HICH_Info e_HICH_Info, E_RGCH_Info e_RGCH_Info, 
		    CellIdentity cell_id)
    {
	setModeSpecificInfo(modeSpecificInfo);
	setDl_dpchInfo(dl_dpchInfo);
	setE_AGCH_Information(e_AGCH_Information);
	setE_HICH_Info(e_HICH_Info);
	setE_RGCH_Info(e_RGCH_Info);
	setCell_id(cell_id);
    }
    
    /**
     * Construct with required components.
     */
    public DL_InformationPerRL_r6(ModeSpecificInfo modeSpecificInfo)
    {
	setModeSpecificInfo(modeSpecificInfo);
    }
    
    public void initComponents()
    {
	mComponents[0] = new ModeSpecificInfo();
	mComponents[1] = new Dl_dpchInfo();
	mComponents[2] = new E_AGCH_Information();
	mComponents[3] = new E_HICH_Info();
	mComponents[4] = new E_RGCH_Info();
	mComponents[5] = new CellIdentity();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[6];
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
		return new E_AGCH_Information();
	    case 3:
		return new E_HICH_Info();
	    case 4:
		return new E_RGCH_Info();
	    case 5:
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
		    "DL_InformationPerRL_r6$ModeSpecificInfo$Fdd"
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
		"DL_InformationPerRL_r6$ModeSpecificInfo"
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
				"DL_InformationPerRL_r6$ModeSpecificInfo$Fdd"
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
	public static Dl_dpchInfo createDl_dpchInfoWithDl_DPCH_InfoPerRL(DL_DPCH_InfoPerRL_r6 dl_DPCH_InfoPerRL)
	{
	    Dl_dpchInfo __object = new Dl_dpchInfo();

	    __object.setDl_DPCH_InfoPerRL(dl_DPCH_InfoPerRL);
	    return __object;
	}
	
	public boolean hasDl_DPCH_InfoPerRL()
	{
	    return getChosenFlag() == dl_DPCH_InfoPerRL_chosen;
	}
	
	public void setDl_DPCH_InfoPerRL(DL_DPCH_InfoPerRL_r6 dl_DPCH_InfoPerRL)
	{
	    setChosenValue(dl_DPCH_InfoPerRL);
	    setChosenFlag(dl_DPCH_InfoPerRL_chosen);
	}
	
	
	// Methods for field "dl_FDPCH_InfoPerRL"
	public static Dl_dpchInfo createDl_dpchInfoWithDl_FDPCH_InfoPerRL(DL_FDPCH_InfoPerRL_r6 dl_FDPCH_InfoPerRL)
	{
	    Dl_dpchInfo __object = new Dl_dpchInfo();

	    __object.setDl_FDPCH_InfoPerRL(dl_FDPCH_InfoPerRL);
	    return __object;
	}
	
	public boolean hasDl_FDPCH_InfoPerRL()
	{
	    return getChosenFlag() == dl_FDPCH_InfoPerRL_chosen;
	}
	
	public void setDl_FDPCH_InfoPerRL(DL_FDPCH_InfoPerRL_r6 dl_FDPCH_InfoPerRL)
	{
	    setChosenValue(dl_FDPCH_InfoPerRL);
	    setChosenFlag(dl_FDPCH_InfoPerRL_chosen);
	}
	
	
	// Method to create a specific choice instance
	public AbstractData createInstance(int chosen)
	{
	    switch (chosen) {
		case dl_DPCH_InfoPerRL_chosen:
		    return new DL_DPCH_InfoPerRL_r6();
		case dl_FDPCH_InfoPerRL_chosen:
		    return new DL_FDPCH_InfoPerRL_r6();
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
		"DL_InformationPerRL_r6$Dl_dpchInfo"
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
				    "DL_DPCH_InfoPerRL_r6"
				),
				new QName (
				    "InformationElements",
				    "DL-DPCH-InfoPerRL-r6"
				),
				12314,
				null,
				new FieldsRef (
				    new QName (
					"rrc.informationelements",
					"DL_DPCH_InfoPerRL_r6"
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
				    "DL_FDPCH_InfoPerRL_r6"
				),
				new QName (
				    "InformationElements",
				    "DL-FDPCH-InfoPerRL-r6"
				),
				12314,
				null,
				new FieldsRef (
				    new QName (
					"rrc.informationelements",
					"DL_FDPCH_InfoPerRL_r6"
				    )
				),
				0,
				new TagDecodersRef (
				    new QName (
					"rrc.informationelements",
					"DL_FDPCH_InfoPerRL_r6"
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
    public E_AGCH_Information getE_AGCH_Information()
    {
	return (E_AGCH_Information)mComponents[2];
    }
    
    public void setE_AGCH_Information(E_AGCH_Information e_AGCH_Information)
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
    
    
    // Methods for field "e_HICH_Info"
    public E_HICH_Info getE_HICH_Info()
    {
	return (E_HICH_Info)mComponents[3];
    }
    
    public void setE_HICH_Info(E_HICH_Info e_HICH_Info)
    {
	mComponents[3] = e_HICH_Info;
    }
    
    public boolean hasE_HICH_Info()
    {
	return componentIsPresent(3);
    }
    
    public void deleteE_HICH_Info()
    {
	setComponentAbsent(3);
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
		    (short)0x8003
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"DL_InformationPerRL_r6$E_HICH_Info"
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
	return (E_RGCH_Info)mComponents[4];
    }
    
    public void setE_RGCH_Info(E_RGCH_Info e_RGCH_Info)
    {
	mComponents[4] = e_RGCH_Info;
    }
    
    public boolean hasE_RGCH_Info()
    {
	return componentIsPresent(4);
    }
    
    public void deleteE_RGCH_Info()
    {
	setComponentAbsent(4);
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
		    (short)0x8004
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"DL_InformationPerRL_r6$E_RGCH_Info"
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

    // Methods for field "cell_id"
    public CellIdentity getCell_id()
    {
	return (CellIdentity)mComponents[5];
    }
    
    public void setCell_id(CellIdentity cell_id)
    {
	mComponents[5] = cell_id;
    }
    
    public boolean hasCell_id()
    {
	return componentIsPresent(5);
    }
    
    public void deleteCell_id()
    {
	setComponentAbsent(5);
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
	    "DL_InformationPerRL_r6"
	),
	new QName (
	    "InformationElements",
	    "DL-InformationPerRL-r6"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "DL_InformationPerRL_r6$ModeSpecificInfo"
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
			    "DL_InformationPerRL_r6$Dl_dpchInfo"
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
				"E_AGCH_Information"
			    ),
			    new QName (
				"InformationElements",
				"E-AGCH-Information"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "E_AGCH_Information"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "E_AGCH_Information"
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
			    "DL_InformationPerRL_r6$E_HICH_Info"
			)
		    ),
		    "e-HICH-Info",
		    3,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "DL_InformationPerRL_r6$E_RGCH_Info"
			)
		    ),
		    "e-RGCH-Info",
		    4,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8005
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
		    5,
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
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8005, 5)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' DL_InformationPerRL_r6 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' DL_InformationPerRL_r6 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for DL_InformationPerRL_r6
