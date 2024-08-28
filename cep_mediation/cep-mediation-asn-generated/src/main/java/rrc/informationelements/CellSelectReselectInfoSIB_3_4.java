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
 * Define the ASN1 Type CellSelectReselectInfoSIB_3_4 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class CellSelectReselectInfoSIB_3_4 extends Sequence {
    
    /**
     * The default constructor.
     */
    public CellSelectReselectInfoSIB_3_4()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public CellSelectReselectInfoSIB_3_4(MappingInfo mappingInfo, 
		    CellSelectQualityMeasure cellSelectQualityMeasure, 
		    ModeSpecificInfo modeSpecificInfo, Q_Hyst_S q_Hyst_l_S, 
		    T_Reselection_S t_Reselection_S, 
		    HCS_ServingCellInformation hcs_ServingCellInformation, 
		    MaxAllowedUL_TX_Power maxAllowedUL_TX_Power)
    {
	setMappingInfo(mappingInfo);
	setCellSelectQualityMeasure(cellSelectQualityMeasure);
	setModeSpecificInfo(modeSpecificInfo);
	setQ_Hyst_l_S(q_Hyst_l_S);
	setT_Reselection_S(t_Reselection_S);
	setHcs_ServingCellInformation(hcs_ServingCellInformation);
	setMaxAllowedUL_TX_Power(maxAllowedUL_TX_Power);
    }
    
    /**
     * Construct with required components.
     */
    public CellSelectReselectInfoSIB_3_4(CellSelectQualityMeasure cellSelectQualityMeasure, 
		    ModeSpecificInfo modeSpecificInfo, Q_Hyst_S q_Hyst_l_S, 
		    T_Reselection_S t_Reselection_S, 
		    MaxAllowedUL_TX_Power maxAllowedUL_TX_Power)
    {
	setCellSelectQualityMeasure(cellSelectQualityMeasure);
	setModeSpecificInfo(modeSpecificInfo);
	setQ_Hyst_l_S(q_Hyst_l_S);
	setT_Reselection_S(t_Reselection_S);
	setMaxAllowedUL_TX_Power(maxAllowedUL_TX_Power);
    }
    
    public void initComponents()
    {
	mComponents[0] = new MappingInfo();
	mComponents[1] = new CellSelectQualityMeasure();
	mComponents[2] = new ModeSpecificInfo();
	mComponents[3] = new Q_Hyst_S();
	mComponents[4] = new T_Reselection_S();
	mComponents[5] = new HCS_ServingCellInformation();
	mComponents[6] = new MaxAllowedUL_TX_Power();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[7];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new MappingInfo();
	    case 1:
		return new CellSelectQualityMeasure();
	    case 2:
		return new ModeSpecificInfo();
	    case 3:
		return new Q_Hyst_S();
	    case 4:
		return new T_Reselection_S();
	    case 5:
		return new HCS_ServingCellInformation();
	    case 6:
		return new MaxAllowedUL_TX_Power();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "mappingInfo"
    public MappingInfo getMappingInfo()
    {
	return (MappingInfo)mComponents[0];
    }
    
    public void setMappingInfo(MappingInfo mappingInfo)
    {
	mComponents[0] = mappingInfo;
    }
    
    public boolean hasMappingInfo()
    {
	return componentIsPresent(0);
    }
    
    public void deleteMappingInfo()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "cellSelectQualityMeasure"
    public CellSelectQualityMeasure getCellSelectQualityMeasure()
    {
	return (CellSelectQualityMeasure)mComponents[1];
    }
    
    public void setCellSelectQualityMeasure(CellSelectQualityMeasure cellSelectQualityMeasure)
    {
	mComponents[1] = cellSelectQualityMeasure;
    }
    
    
    
    /**
     * Define the ASN1 Type CellSelectQualityMeasure from ASN1 Module InformationElements.
     * @see Choice
     */
    public static class CellSelectQualityMeasure extends Choice {
	
	/**
	 * The default constructor.
	 */
	public CellSelectQualityMeasure()
	{
	}
	
	public static final  int  cpich_Ec_N0_chosen = 1;
	public static final  int  cpich_RSCP_chosen = 2;
	
	// Methods for field "cpich_Ec_N0"
	public static CellSelectQualityMeasure createCellSelectQualityMeasureWithCpich_Ec_N0(Cpich_Ec_N0 cpich_Ec_N0)
	{
	    CellSelectQualityMeasure __object = new CellSelectQualityMeasure();

	    __object.setCpich_Ec_N0(cpich_Ec_N0);
	    return __object;
	}
	
	public boolean hasCpich_Ec_N0()
	{
	    return getChosenFlag() == cpich_Ec_N0_chosen;
	}
	
	public void setCpich_Ec_N0(Cpich_Ec_N0 cpich_Ec_N0)
	{
	    setChosenValue(cpich_Ec_N0);
	    setChosenFlag(cpich_Ec_N0_chosen);
	}
	
	
	
	/**
	 * Define the ASN1 Type Cpich_Ec_N0 from ASN1 Module InformationElements.
	 * @see Sequence
	 */
	public static class Cpich_Ec_N0 extends Sequence {
	    
	    /**
	     * The default constructor.
	     */
	    public Cpich_Ec_N0()
	    {
	    }
	    
	    /**
	     * Construct with AbstractData components.
	     */
	    public Cpich_Ec_N0(Q_Hyst_S q_HYST_2_S)
	    {
		setQ_HYST_2_S(q_HYST_2_S);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new Q_Hyst_S();
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
			return new Q_Hyst_S();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "q_HYST_2_S"
	    public Q_Hyst_S getQ_HYST_2_S()
	    {
		return (Q_Hyst_S)mComponents[0];
	    }
	    
	    public void setQ_HYST_2_S(Q_Hyst_S q_HYST_2_S)
	    {
		mComponents[0] = q_HYST_2_S;
	    }
	    
	    public boolean hasQ_HYST_2_S()
	    {
		return componentIsPresent(0);
	    }
	    
	    public void deleteQ_HYST_2_S()
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
		    "CellSelectReselectInfoSIB_3_4$CellSelectQualityMeasure$Cpich_Ec_N0"
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
					"Q_Hyst_S"
				    ),
				    new QName (
					"InformationElements",
					"Q-Hyst-S"
				    ),
				    12314,
				    new ValueRangeConstraint (
					new AbstractBounds(
					    new Q_Hyst_S(0), 
					    new Q_Hyst_S(20),
					    0
					)
				    ),
				    new Bounds (
					new java.lang.Long(0),
					new java.lang.Long(20)
				    ),
				    null
				)
			    ),
			    "q-HYST-2-S",
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
	     * Get the type descriptor (TypeInfo) of 'this' Cpich_Ec_N0 object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' Cpich_Ec_N0 object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for Cpich_Ec_N0

	// Methods for field "cpich_RSCP"
	public static CellSelectQualityMeasure createCellSelectQualityMeasureWithCpich_RSCP(Null cpich_RSCP)
	{
	    CellSelectQualityMeasure __object = new CellSelectQualityMeasure();

	    __object.setCpich_RSCP(cpich_RSCP);
	    return __object;
	}
	
	public boolean hasCpich_RSCP()
	{
	    return getChosenFlag() == cpich_RSCP_chosen;
	}
	
	public void setCpich_RSCP(Null cpich_RSCP)
	{
	    setChosenValue(cpich_RSCP);
	    setChosenFlag(cpich_RSCP_chosen);
	}
	
	
	// Method to create a specific choice instance
	public AbstractData createInstance(int chosen)
	{
	    switch (chosen) {
		case cpich_Ec_N0_chosen:
		    return new Cpich_Ec_N0();
		case cpich_RSCP_chosen:
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
		"CellSelectReselectInfoSIB_3_4$CellSelectQualityMeasure"
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
				"CellSelectReselectInfoSIB_3_4$CellSelectQualityMeasure$Cpich_Ec_N0"
			    )
			),
			"cpich-Ec-N0",
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
			"cpich-RSCP",
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
	 * Get the type descriptor (TypeInfo) of 'this' CellSelectQualityMeasure object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' CellSelectQualityMeasure object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for CellSelectQualityMeasure

    // Methods for field "modeSpecificInfo"
    public ModeSpecificInfo getModeSpecificInfo()
    {
	return (ModeSpecificInfo)mComponents[2];
    }
    
    public void setModeSpecificInfo(ModeSpecificInfo modeSpecificInfo)
    {
	mComponents[2] = modeSpecificInfo;
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
	    public Fdd(S_SearchQual s_Intrasearch, S_SearchQual s_Intersearch, 
			    S_SearchRXLEV s_SearchHCS, 
			    RAT_FDD_InfoList rat_List, Q_QualMin q_QualMin, 
			    Q_RxlevMin q_RxlevMin)
	    {
		setS_Intrasearch(s_Intrasearch);
		setS_Intersearch(s_Intersearch);
		setS_SearchHCS(s_SearchHCS);
		setRat_List(rat_List);
		setQ_QualMin(q_QualMin);
		setQ_RxlevMin(q_RxlevMin);
	    }
	    
	    /**
	     * Construct with required components.
	     */
	    public Fdd(Q_QualMin q_QualMin, Q_RxlevMin q_RxlevMin)
	    {
		setQ_QualMin(q_QualMin);
		setQ_RxlevMin(q_RxlevMin);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new S_SearchQual();
		mComponents[1] = new S_SearchQual();
		mComponents[2] = new S_SearchRXLEV();
		mComponents[3] = new RAT_FDD_InfoList();
		mComponents[4] = new Q_QualMin();
		mComponents[5] = new Q_RxlevMin();
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
			return new S_SearchQual();
		    case 1:
			return new S_SearchQual();
		    case 2:
			return new S_SearchRXLEV();
		    case 3:
			return new RAT_FDD_InfoList();
		    case 4:
			return new Q_QualMin();
		    case 5:
			return new Q_RxlevMin();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "s_Intrasearch"
	    public S_SearchQual getS_Intrasearch()
	    {
		return (S_SearchQual)mComponents[0];
	    }
	    
	    public void setS_Intrasearch(S_SearchQual s_Intrasearch)
	    {
		mComponents[0] = s_Intrasearch;
	    }
	    
	    public boolean hasS_Intrasearch()
	    {
		return componentIsPresent(0);
	    }
	    
	    public void deleteS_Intrasearch()
	    {
		setComponentAbsent(0);
	    }
	    
	    
	    // Methods for field "s_Intersearch"
	    public S_SearchQual getS_Intersearch()
	    {
		return (S_SearchQual)mComponents[1];
	    }
	    
	    public void setS_Intersearch(S_SearchQual s_Intersearch)
	    {
		mComponents[1] = s_Intersearch;
	    }
	    
	    public boolean hasS_Intersearch()
	    {
		return componentIsPresent(1);
	    }
	    
	    public void deleteS_Intersearch()
	    {
		setComponentAbsent(1);
	    }
	    
	    
	    // Methods for field "s_SearchHCS"
	    public S_SearchRXLEV getS_SearchHCS()
	    {
		return (S_SearchRXLEV)mComponents[2];
	    }
	    
	    public void setS_SearchHCS(S_SearchRXLEV s_SearchHCS)
	    {
		mComponents[2] = s_SearchHCS;
	    }
	    
	    public boolean hasS_SearchHCS()
	    {
		return componentIsPresent(2);
	    }
	    
	    public void deleteS_SearchHCS()
	    {
		setComponentAbsent(2);
	    }
	    
	    
	    // Methods for field "rat_List"
	    public RAT_FDD_InfoList getRat_List()
	    {
		return (RAT_FDD_InfoList)mComponents[3];
	    }
	    
	    public void setRat_List(RAT_FDD_InfoList rat_List)
	    {
		mComponents[3] = rat_List;
	    }
	    
	    public boolean hasRat_List()
	    {
		return componentIsPresent(3);
	    }
	    
	    public void deleteRat_List()
	    {
		setComponentAbsent(3);
	    }
	    
	    
	    // Methods for field "q_QualMin"
	    public Q_QualMin getQ_QualMin()
	    {
		return (Q_QualMin)mComponents[4];
	    }
	    
	    public void setQ_QualMin(Q_QualMin q_QualMin)
	    {
		mComponents[4] = q_QualMin;
	    }
	    
	    
	    // Methods for field "q_RxlevMin"
	    public Q_RxlevMin getQ_RxlevMin()
	    {
		return (Q_RxlevMin)mComponents[5];
	    }
	    
	    public void setQ_RxlevMin(Q_RxlevMin q_RxlevMin)
	    {
		mComponents[5] = q_RxlevMin;
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
		    "CellSelectReselectInfoSIB_3_4$ModeSpecificInfo$Fdd"
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
					"S_SearchQual"
				    ),
				    new QName (
					"InformationElements",
					"S-SearchQual"
				    ),
				    12314,
				    new ValueRangeConstraint (
					new AbstractBounds(
					    new S_SearchQual(-16), 
					    new S_SearchQual(10),
					    0
					)
				    ),
				    new Bounds (
					new java.lang.Long(-16),
					new java.lang.Long(10)
				    ),
				    null
				)
			    ),
			    "s-Intrasearch",
			    0,
			    3,
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
					"S_SearchQual"
				    ),
				    new QName (
					"InformationElements",
					"S-SearchQual"
				    ),
				    12314,
				    new ValueRangeConstraint (
					new AbstractBounds(
					    new S_SearchQual(-16), 
					    new S_SearchQual(10),
					    0
					)
				    ),
				    new Bounds (
					new java.lang.Long(-16),
					new java.lang.Long(10)
				    ),
				    null
				)
			    ),
			    "s-Intersearch",
			    1,
			    3,
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
					"S_SearchRXLEV"
				    ),
				    new QName (
					"InformationElements",
					"S-SearchRXLEV"
				    ),
				    12314,
				    new ValueRangeConstraint (
					new AbstractBounds(
					    new S_SearchRXLEV(-53), 
					    new S_SearchRXLEV(45),
					    0
					)
				    ),
				    new Bounds (
					new java.lang.Long(-53),
					new java.lang.Long(45)
				    ),
				    null
				)
			    ),
			    "s-SearchHCS",
			    2,
			    3,
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
					"RAT_FDD_InfoList"
				    ),
				    new QName (
					"InformationElements",
					"RAT-FDD-InfoList"
				    ),
				    12314,
				    new SizeConstraint (
					new ValueRangeConstraint (
					    new AbstractBounds(
						new com.oss.asn1.INTEGER(1), 
						new com.oss.asn1.INTEGER(15),
						0
					    )
					)
				    ),
				    new Bounds (
					new java.lang.Long(1),
					new java.lang.Long(15)
				    ),
				    new TypeInfoRef (
					new QName (
					    "rrc.informationelements",
					    "RAT_FDD_Info"
					)
				    )
				)
			    ),
			    "rat-List",
			    3,
			    3,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new IntegerInfo (
				    new Tags (
					new short[] {
					    (short)0x8004
					}
				    ),
				    new QName (
					"rrc.informationelements",
					"Q_QualMin"
				    ),
				    new QName (
					"InformationElements",
					"Q-QualMin"
				    ),
				    12314,
				    new ValueRangeConstraint (
					new AbstractBounds(
					    new Q_QualMin(-24), 
					    new Q_QualMin(0),
					    0
					)
				    ),
				    new Bounds (
					new java.lang.Long(-24),
					new java.lang.Long(0)
				    ),
				    null
				)
			    ),
			    "q-QualMin",
			    4,
			    2,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new IntegerInfo (
				    new Tags (
					new short[] {
					    (short)0x8005
					}
				    ),
				    new QName (
					"rrc.informationelements",
					"Q_RxlevMin"
				    ),
				    new QName (
					"InformationElements",
					"Q-RxlevMin"
				    ),
				    12314,
				    new ValueRangeConstraint (
					new AbstractBounds(
					    new Q_RxlevMin(-58), 
					    new Q_RxlevMin(-13),
					    0
					)
				    ),
				    new Bounds (
					new java.lang.Long(-58),
					new java.lang.Long(-13)
				    ),
				    null
				)
			    ),
			    "q-RxlevMin",
			    5,
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
				new TagDecoderElement((short)0x8002, 2),
				new TagDecoderElement((short)0x8003, 3),
				new TagDecoderElement((short)0x8004, 4)
			    }
			),
			new TagDecoder (
			    new TagDecoderElement[] {
				new TagDecoderElement((short)0x8001, 1),
				new TagDecoderElement((short)0x8002, 2),
				new TagDecoderElement((short)0x8003, 3),
				new TagDecoderElement((short)0x8004, 4)
			    }
			),
			new TagDecoder (
			    new TagDecoderElement[] {
				new TagDecoderElement((short)0x8002, 2),
				new TagDecoderElement((short)0x8003, 3),
				new TagDecoderElement((short)0x8004, 4)
			    }
			),
			new TagDecoder (
			    new TagDecoderElement[] {
				new TagDecoderElement((short)0x8003, 3),
				new TagDecoderElement((short)0x8004, 4)
			    }
			),
			new TagDecoder (
			    new TagDecoderElement[] {
				new TagDecoderElement((short)0x8004, 4)
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
	    public Tdd(S_SearchRXLEV s_Intrasearch, 
			    S_SearchRXLEV s_Intersearch, 
			    S_SearchRXLEV s_SearchHCS, 
			    RAT_TDD_InfoList rat_List, Q_RxlevMin q_RxlevMin)
	    {
		setS_Intrasearch(s_Intrasearch);
		setS_Intersearch(s_Intersearch);
		setS_SearchHCS(s_SearchHCS);
		setRat_List(rat_List);
		setQ_RxlevMin(q_RxlevMin);
	    }
	    
	    /**
	     * Construct with required components.
	     */
	    public Tdd(Q_RxlevMin q_RxlevMin)
	    {
		setQ_RxlevMin(q_RxlevMin);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new S_SearchRXLEV();
		mComponents[1] = new S_SearchRXLEV();
		mComponents[2] = new S_SearchRXLEV();
		mComponents[3] = new RAT_TDD_InfoList();
		mComponents[4] = new Q_RxlevMin();
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
			return new S_SearchRXLEV();
		    case 1:
			return new S_SearchRXLEV();
		    case 2:
			return new S_SearchRXLEV();
		    case 3:
			return new RAT_TDD_InfoList();
		    case 4:
			return new Q_RxlevMin();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "s_Intrasearch"
	    public S_SearchRXLEV getS_Intrasearch()
	    {
		return (S_SearchRXLEV)mComponents[0];
	    }
	    
	    public void setS_Intrasearch(S_SearchRXLEV s_Intrasearch)
	    {
		mComponents[0] = s_Intrasearch;
	    }
	    
	    public boolean hasS_Intrasearch()
	    {
		return componentIsPresent(0);
	    }
	    
	    public void deleteS_Intrasearch()
	    {
		setComponentAbsent(0);
	    }
	    
	    
	    // Methods for field "s_Intersearch"
	    public S_SearchRXLEV getS_Intersearch()
	    {
		return (S_SearchRXLEV)mComponents[1];
	    }
	    
	    public void setS_Intersearch(S_SearchRXLEV s_Intersearch)
	    {
		mComponents[1] = s_Intersearch;
	    }
	    
	    public boolean hasS_Intersearch()
	    {
		return componentIsPresent(1);
	    }
	    
	    public void deleteS_Intersearch()
	    {
		setComponentAbsent(1);
	    }
	    
	    
	    // Methods for field "s_SearchHCS"
	    public S_SearchRXLEV getS_SearchHCS()
	    {
		return (S_SearchRXLEV)mComponents[2];
	    }
	    
	    public void setS_SearchHCS(S_SearchRXLEV s_SearchHCS)
	    {
		mComponents[2] = s_SearchHCS;
	    }
	    
	    public boolean hasS_SearchHCS()
	    {
		return componentIsPresent(2);
	    }
	    
	    public void deleteS_SearchHCS()
	    {
		setComponentAbsent(2);
	    }
	    
	    
	    // Methods for field "rat_List"
	    public RAT_TDD_InfoList getRat_List()
	    {
		return (RAT_TDD_InfoList)mComponents[3];
	    }
	    
	    public void setRat_List(RAT_TDD_InfoList rat_List)
	    {
		mComponents[3] = rat_List;
	    }
	    
	    public boolean hasRat_List()
	    {
		return componentIsPresent(3);
	    }
	    
	    public void deleteRat_List()
	    {
		setComponentAbsent(3);
	    }
	    
	    
	    // Methods for field "q_RxlevMin"
	    public Q_RxlevMin getQ_RxlevMin()
	    {
		return (Q_RxlevMin)mComponents[4];
	    }
	    
	    public void setQ_RxlevMin(Q_RxlevMin q_RxlevMin)
	    {
		mComponents[4] = q_RxlevMin;
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
		    "CellSelectReselectInfoSIB_3_4$ModeSpecificInfo$Tdd"
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
					"S_SearchRXLEV"
				    ),
				    new QName (
					"InformationElements",
					"S-SearchRXLEV"
				    ),
				    12314,
				    new ValueRangeConstraint (
					new AbstractBounds(
					    new S_SearchRXLEV(-53), 
					    new S_SearchRXLEV(45),
					    0
					)
				    ),
				    new Bounds (
					new java.lang.Long(-53),
					new java.lang.Long(45)
				    ),
				    null
				)
			    ),
			    "s-Intrasearch",
			    0,
			    3,
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
					"S_SearchRXLEV"
				    ),
				    new QName (
					"InformationElements",
					"S-SearchRXLEV"
				    ),
				    12314,
				    new ValueRangeConstraint (
					new AbstractBounds(
					    new S_SearchRXLEV(-53), 
					    new S_SearchRXLEV(45),
					    0
					)
				    ),
				    new Bounds (
					new java.lang.Long(-53),
					new java.lang.Long(45)
				    ),
				    null
				)
			    ),
			    "s-Intersearch",
			    1,
			    3,
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
					"S_SearchRXLEV"
				    ),
				    new QName (
					"InformationElements",
					"S-SearchRXLEV"
				    ),
				    12314,
				    new ValueRangeConstraint (
					new AbstractBounds(
					    new S_SearchRXLEV(-53), 
					    new S_SearchRXLEV(45),
					    0
					)
				    ),
				    new Bounds (
					new java.lang.Long(-53),
					new java.lang.Long(45)
				    ),
				    null
				)
			    ),
			    "s-SearchHCS",
			    2,
			    3,
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
					"RAT_TDD_InfoList"
				    ),
				    new QName (
					"InformationElements",
					"RAT-TDD-InfoList"
				    ),
				    12314,
				    new SizeConstraint (
					new ValueRangeConstraint (
					    new AbstractBounds(
						new com.oss.asn1.INTEGER(1), 
						new com.oss.asn1.INTEGER(15),
						0
					    )
					)
				    ),
				    new Bounds (
					new java.lang.Long(1),
					new java.lang.Long(15)
				    ),
				    new TypeInfoRef (
					new QName (
					    "rrc.informationelements",
					    "RAT_TDD_Info"
					)
				    )
				)
			    ),
			    "rat-List",
			    3,
			    3,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new IntegerInfo (
				    new Tags (
					new short[] {
					    (short)0x8004
					}
				    ),
				    new QName (
					"rrc.informationelements",
					"Q_RxlevMin"
				    ),
				    new QName (
					"InformationElements",
					"Q-RxlevMin"
				    ),
				    12314,
				    new ValueRangeConstraint (
					new AbstractBounds(
					    new Q_RxlevMin(-58), 
					    new Q_RxlevMin(-13),
					    0
					)
				    ),
				    new Bounds (
					new java.lang.Long(-58),
					new java.lang.Long(-13)
				    ),
				    null
				)
			    ),
			    "q-RxlevMin",
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
				new TagDecoderElement((short)0x8000, 0),
				new TagDecoderElement((short)0x8001, 1),
				new TagDecoderElement((short)0x8002, 2),
				new TagDecoderElement((short)0x8003, 3),
				new TagDecoderElement((short)0x8004, 4)
			    }
			),
			new TagDecoder (
			    new TagDecoderElement[] {
				new TagDecoderElement((short)0x8001, 1),
				new TagDecoderElement((short)0x8002, 2),
				new TagDecoderElement((short)0x8003, 3),
				new TagDecoderElement((short)0x8004, 4)
			    }
			),
			new TagDecoder (
			    new TagDecoderElement[] {
				new TagDecoderElement((short)0x8002, 2),
				new TagDecoderElement((short)0x8003, 3),
				new TagDecoderElement((short)0x8004, 4)
			    }
			),
			new TagDecoder (
			    new TagDecoderElement[] {
				new TagDecoderElement((short)0x8003, 3),
				new TagDecoderElement((short)0x8004, 4)
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
		    (short)0x8002
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"CellSelectReselectInfoSIB_3_4$ModeSpecificInfo"
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
				"CellSelectReselectInfoSIB_3_4$ModeSpecificInfo$Fdd"
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
				"CellSelectReselectInfoSIB_3_4$ModeSpecificInfo$Tdd"
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

    // Methods for field "q_Hyst_l_S"
    public Q_Hyst_S getQ_Hyst_l_S()
    {
	return (Q_Hyst_S)mComponents[3];
    }
    
    public void setQ_Hyst_l_S(Q_Hyst_S q_Hyst_l_S)
    {
	mComponents[3] = q_Hyst_l_S;
    }
    
    
    // Methods for field "t_Reselection_S"
    public T_Reselection_S getT_Reselection_S()
    {
	return (T_Reselection_S)mComponents[4];
    }
    
    public void setT_Reselection_S(T_Reselection_S t_Reselection_S)
    {
	mComponents[4] = t_Reselection_S;
    }
    
    
    // Methods for field "hcs_ServingCellInformation"
    public HCS_ServingCellInformation getHcs_ServingCellInformation()
    {
	return (HCS_ServingCellInformation)mComponents[5];
    }
    
    public void setHcs_ServingCellInformation(HCS_ServingCellInformation hcs_ServingCellInformation)
    {
	mComponents[5] = hcs_ServingCellInformation;
    }
    
    public boolean hasHcs_ServingCellInformation()
    {
	return componentIsPresent(5);
    }
    
    public void deleteHcs_ServingCellInformation()
    {
	setComponentAbsent(5);
    }
    
    
    // Methods for field "maxAllowedUL_TX_Power"
    public MaxAllowedUL_TX_Power getMaxAllowedUL_TX_Power()
    {
	return (MaxAllowedUL_TX_Power)mComponents[6];
    }
    
    public void setMaxAllowedUL_TX_Power(MaxAllowedUL_TX_Power maxAllowedUL_TX_Power)
    {
	mComponents[6] = maxAllowedUL_TX_Power;
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
	    "CellSelectReselectInfoSIB_3_4"
	),
	new QName (
	    "InformationElements",
	    "CellSelectReselectInfoSIB-3-4"
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
				"MappingInfo"
			    ),
			    new QName (
				"InformationElements",
				"MappingInfo"
			    ),
			    12314,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new com.oss.asn1.INTEGER(1), 
					new com.oss.asn1.INTEGER(16),
					0
				    )
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(16)
			    ),
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "Mapping"
				)
			    )
			)
		    ),
		    "mappingInfo",
		    0,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "CellSelectReselectInfoSIB_3_4$CellSelectQualityMeasure"
			)
		    ),
		    "cellSelectQualityMeasure",
		    1,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "CellSelectReselectInfoSIB_3_4$ModeSpecificInfo"
			)
		    ),
		    "modeSpecificInfo",
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
				"Q_Hyst_S"
			    ),
			    new QName (
				"InformationElements",
				"Q-Hyst-S"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new Q_Hyst_S(0), 
				    new Q_Hyst_S(20),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(20)
			    ),
			    null
			)
		    ),
		    "q-Hyst-l-S",
		    3,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8004
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"T_Reselection_S"
			    ),
			    new QName (
				"InformationElements",
				"T-Reselection-S"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new T_Reselection_S(0), 
				    new T_Reselection_S(31),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(31)
			    ),
			    null
			)
		    ),
		    "t-Reselection-S",
		    4,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8005
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"HCS_ServingCellInformation"
			    ),
			    new QName (
				"InformationElements",
				"HCS-ServingCellInformation"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "HCS_ServingCellInformation"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "HCS_ServingCellInformation"
				)
			    ),
			    0
			)
		    ),
		    "hcs-ServingCellInformation",
		    5,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8006
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"MaxAllowedUL_TX_Power"
			    ),
			    new QName (
				"InformationElements",
				"MaxAllowedUL-TX-Power"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new MaxAllowedUL_TX_Power(-50), 
				    new MaxAllowedUL_TX_Power(33),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(-50),
				new java.lang.Long(33)
			    ),
			    null
			)
		    ),
		    "maxAllowedUL-TX-Power",
		    6,
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
			new TagDecoderElement((short)0x8001, 1)
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
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8006, 6)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' CellSelectReselectInfoSIB_3_4 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' CellSelectReselectInfoSIB_3_4 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for CellSelectReselectInfoSIB_3_4
