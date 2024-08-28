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
 * Define the ASN1 Type SysInfoType5 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class SysInfoType5 extends Sequence {
    
    /**
     * The default constructor.
     */
    public SysInfoType5()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public SysInfoType5(BOOLEAN sib6indicator, 
		    PICH_PowerOffset pich_PowerOffset, 
		    ModeSpecificInfo modeSpecificInfo, 
		    PrimaryCCPCH_Info primaryCCPCH_Info, 
		    PRACH_SystemInformationList prach_SystemInformationList, 
		    SCCPCH_SystemInformationList sCCPCH_SystemInformationList, 
		    CBS_DRX_Level1Information cbs_DRX_Level1Information, 
		    V4b0NCEs v4b0NCEs)
    {
	setSib6indicator(sib6indicator);
	setPich_PowerOffset(pich_PowerOffset);
	setModeSpecificInfo(modeSpecificInfo);
	setPrimaryCCPCH_Info(primaryCCPCH_Info);
	setPrach_SystemInformationList(prach_SystemInformationList);
	setSCCPCH_SystemInformationList(sCCPCH_SystemInformationList);
	setCbs_DRX_Level1Information(cbs_DRX_Level1Information);
	setV4b0NCEs(v4b0NCEs);
    }
    
    /**
     * Construct with components.
     */
    public SysInfoType5(boolean sib6indicator, 
		    PICH_PowerOffset pich_PowerOffset, 
		    ModeSpecificInfo modeSpecificInfo, 
		    PrimaryCCPCH_Info primaryCCPCH_Info, 
		    PRACH_SystemInformationList prach_SystemInformationList, 
		    SCCPCH_SystemInformationList sCCPCH_SystemInformationList, 
		    CBS_DRX_Level1Information cbs_DRX_Level1Information, 
		    V4b0NCEs v4b0NCEs)
    {
	this(new BOOLEAN(sib6indicator), pich_PowerOffset, 
	     modeSpecificInfo, primaryCCPCH_Info, 
	     prach_SystemInformationList, sCCPCH_SystemInformationList, 
	     cbs_DRX_Level1Information, v4b0NCEs);
    }
    
    /**
     * Construct with required components.
     */
    public SysInfoType5(boolean sib6indicator, 
		    PICH_PowerOffset pich_PowerOffset, 
		    ModeSpecificInfo modeSpecificInfo, 
		    PRACH_SystemInformationList prach_SystemInformationList, 
		    SCCPCH_SystemInformationList sCCPCH_SystemInformationList)
    {
	setSib6indicator(sib6indicator);
	setPich_PowerOffset(pich_PowerOffset);
	setModeSpecificInfo(modeSpecificInfo);
	setPrach_SystemInformationList(prach_SystemInformationList);
	setSCCPCH_SystemInformationList(sCCPCH_SystemInformationList);
    }
    
    public void initComponents()
    {
	mComponents[0] = new BOOLEAN();
	mComponents[1] = new PICH_PowerOffset();
	mComponents[2] = new ModeSpecificInfo();
	mComponents[3] = new PrimaryCCPCH_Info();
	mComponents[4] = new PRACH_SystemInformationList();
	mComponents[5] = new SCCPCH_SystemInformationList();
	mComponents[6] = new CBS_DRX_Level1Information();
	mComponents[7] = new V4b0NCEs();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[8];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new BOOLEAN();
	    case 1:
		return new PICH_PowerOffset();
	    case 2:
		return new ModeSpecificInfo();
	    case 3:
		return new PrimaryCCPCH_Info();
	    case 4:
		return new PRACH_SystemInformationList();
	    case 5:
		return new SCCPCH_SystemInformationList();
	    case 6:
		return new CBS_DRX_Level1Information();
	    case 7:
		return new V4b0NCEs();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "sib6indicator"
    public boolean getSib6indicator()
    {
	return ((BOOLEAN)mComponents[0]).booleanValue();
    }
    
    public void setSib6indicator(boolean sib6indicator)
    {
	setSib6indicator(new BOOLEAN(sib6indicator));
    }
    
    public void setSib6indicator(BOOLEAN sib6indicator)
    {
	mComponents[0] = sib6indicator;
    }
    
    
    // Methods for field "pich_PowerOffset"
    public PICH_PowerOffset getPich_PowerOffset()
    {
	return (PICH_PowerOffset)mComponents[1];
    }
    
    public void setPich_PowerOffset(PICH_PowerOffset pich_PowerOffset)
    {
	mComponents[1] = pich_PowerOffset;
    }
    
    
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
	    public Fdd(AICH_PowerOffset aich_PowerOffset)
	    {
		setAich_PowerOffset(aich_PowerOffset);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new AICH_PowerOffset();
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
			return new AICH_PowerOffset();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "aich_PowerOffset"
	    public AICH_PowerOffset getAich_PowerOffset()
	    {
		return (AICH_PowerOffset)mComponents[0];
	    }
	    
	    public void setAich_PowerOffset(AICH_PowerOffset aich_PowerOffset)
	    {
		mComponents[0] = aich_PowerOffset;
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
		    "SysInfoType5$ModeSpecificInfo$Fdd"
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
					"AICH_PowerOffset"
				    ),
				    new QName (
					"InformationElements",
					"AICH-PowerOffset"
				    ),
				    12314,
				    new ValueRangeConstraint (
					new AbstractBounds(
					    new AICH_PowerOffset(-22), 
					    new AICH_PowerOffset(5),
					    0
					)
				    ),
				    new Bounds (
					new java.lang.Long(-22),
					new java.lang.Long(5)
				    ),
				    null
				)
			    ),
			    "aich-PowerOffset",
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
	    public Tdd(PUSCH_SysInfoList_SFN pusch_SysInfoList_SFN, 
			    PDSCH_SysInfoList_SFN pdsch_SysInfoList_SFN, 
			    OpenLoopPowerControl_TDD openLoopPowerControl_TDD)
	    {
		setPusch_SysInfoList_SFN(pusch_SysInfoList_SFN);
		setPdsch_SysInfoList_SFN(pdsch_SysInfoList_SFN);
		setOpenLoopPowerControl_TDD(openLoopPowerControl_TDD);
	    }
	    
	    /**
	     * Construct with required components.
	     */
	    public Tdd(OpenLoopPowerControl_TDD openLoopPowerControl_TDD)
	    {
		setOpenLoopPowerControl_TDD(openLoopPowerControl_TDD);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new PUSCH_SysInfoList_SFN();
		mComponents[1] = new PDSCH_SysInfoList_SFN();
		mComponents[2] = new OpenLoopPowerControl_TDD();
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
			return new PUSCH_SysInfoList_SFN();
		    case 1:
			return new PDSCH_SysInfoList_SFN();
		    case 2:
			return new OpenLoopPowerControl_TDD();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "pusch_SysInfoList_SFN"
	    public PUSCH_SysInfoList_SFN getPusch_SysInfoList_SFN()
	    {
		return (PUSCH_SysInfoList_SFN)mComponents[0];
	    }
	    
	    public void setPusch_SysInfoList_SFN(PUSCH_SysInfoList_SFN pusch_SysInfoList_SFN)
	    {
		mComponents[0] = pusch_SysInfoList_SFN;
	    }
	    
	    public boolean hasPusch_SysInfoList_SFN()
	    {
		return componentIsPresent(0);
	    }
	    
	    public void deletePusch_SysInfoList_SFN()
	    {
		setComponentAbsent(0);
	    }
	    
	    
	    // Methods for field "pdsch_SysInfoList_SFN"
	    public PDSCH_SysInfoList_SFN getPdsch_SysInfoList_SFN()
	    {
		return (PDSCH_SysInfoList_SFN)mComponents[1];
	    }
	    
	    public void setPdsch_SysInfoList_SFN(PDSCH_SysInfoList_SFN pdsch_SysInfoList_SFN)
	    {
		mComponents[1] = pdsch_SysInfoList_SFN;
	    }
	    
	    public boolean hasPdsch_SysInfoList_SFN()
	    {
		return componentIsPresent(1);
	    }
	    
	    public void deletePdsch_SysInfoList_SFN()
	    {
		setComponentAbsent(1);
	    }
	    
	    
	    // Methods for field "openLoopPowerControl_TDD"
	    public OpenLoopPowerControl_TDD getOpenLoopPowerControl_TDD()
	    {
		return (OpenLoopPowerControl_TDD)mComponents[2];
	    }
	    
	    public void setOpenLoopPowerControl_TDD(OpenLoopPowerControl_TDD openLoopPowerControl_TDD)
	    {
		mComponents[2] = openLoopPowerControl_TDD;
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
		    "SysInfoType5$ModeSpecificInfo$Tdd"
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
					"PUSCH_SysInfoList_SFN"
				    ),
				    new QName (
					"InformationElements",
					"PUSCH-SysInfoList-SFN"
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
					    "PUSCH_SysInfoList_SFN$Sequence_"
					)
				    )
				)
			    ),
			    "pusch-SysInfoList-SFN",
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
					"PDSCH_SysInfoList_SFN"
				    ),
				    new QName (
					"InformationElements",
					"PDSCH-SysInfoList-SFN"
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
					    "PDSCH_SysInfoList_SFN$Sequence_"
					)
				    )
				)
			    ),
			    "pdsch-SysInfoList-SFN",
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
					"OpenLoopPowerControl_TDD"
				    ),
				    new QName (
					"InformationElements",
					"OpenLoopPowerControl-TDD"
				    ),
				    12314,
				    null,
				    new FieldsRef (
					new QName (
					    "rrc.informationelements",
					    "OpenLoopPowerControl_TDD"
					)
				    ),
				    0,
				    new TagDecodersRef (
					new QName (
					    "rrc.informationelements",
					    "OpenLoopPowerControl_TDD"
					)
				    ),
				    0
				)
			    ),
			    "openLoopPowerControl-TDD",
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
		"SysInfoType5$ModeSpecificInfo"
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
				"SysInfoType5$ModeSpecificInfo$Fdd"
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
				"SysInfoType5$ModeSpecificInfo$Tdd"
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

    // Methods for field "primaryCCPCH_Info"
    public PrimaryCCPCH_Info getPrimaryCCPCH_Info()
    {
	return (PrimaryCCPCH_Info)mComponents[3];
    }
    
    public void setPrimaryCCPCH_Info(PrimaryCCPCH_Info primaryCCPCH_Info)
    {
	mComponents[3] = primaryCCPCH_Info;
    }
    
    public boolean hasPrimaryCCPCH_Info()
    {
	return componentIsPresent(3);
    }
    
    public void deletePrimaryCCPCH_Info()
    {
	setComponentAbsent(3);
    }
    
    
    // Methods for field "prach_SystemInformationList"
    public PRACH_SystemInformationList getPrach_SystemInformationList()
    {
	return (PRACH_SystemInformationList)mComponents[4];
    }
    
    public void setPrach_SystemInformationList(PRACH_SystemInformationList prach_SystemInformationList)
    {
	mComponents[4] = prach_SystemInformationList;
    }
    
    
    // Methods for field "sCCPCH_SystemInformationList"
    public SCCPCH_SystemInformationList getSCCPCH_SystemInformationList()
    {
	return (SCCPCH_SystemInformationList)mComponents[5];
    }
    
    public void setSCCPCH_SystemInformationList(SCCPCH_SystemInformationList sCCPCH_SystemInformationList)
    {
	mComponents[5] = sCCPCH_SystemInformationList;
    }
    
    
    // Methods for field "cbs_DRX_Level1Information"
    public CBS_DRX_Level1Information getCbs_DRX_Level1Information()
    {
	return (CBS_DRX_Level1Information)mComponents[6];
    }
    
    public void setCbs_DRX_Level1Information(CBS_DRX_Level1Information cbs_DRX_Level1Information)
    {
	mComponents[6] = cbs_DRX_Level1Information;
    }
    
    public boolean hasCbs_DRX_Level1Information()
    {
	return componentIsPresent(6);
    }
    
    public void deleteCbs_DRX_Level1Information()
    {
	setComponentAbsent(6);
    }
    
    
    // Methods for field "v4b0NCEs"
    public V4b0NCEs getV4b0NCEs()
    {
	return (V4b0NCEs)mComponents[7];
    }
    
    public void setV4b0NCEs(V4b0NCEs v4b0NCEs)
    {
	mComponents[7] = v4b0NCEs;
    }
    
    public boolean hasV4b0NCEs()
    {
	return componentIsPresent(7);
    }
    
    public void deleteV4b0NCEs()
    {
	setComponentAbsent(7);
    }
    
    
    
    /**
     * Define the ASN1 Type V4b0NCEs from ASN1 Module InformationElements.
     * @see Sequence
     */
    public static class V4b0NCEs extends Sequence {
	
	/**
	 * The default constructor.
	 */
	public V4b0NCEs()
	{
	}
	
	/**
	 * Construct with AbstractData components.
	 */
	public V4b0NCEs(SysInfoType5_v4b0ext_IEs sysInfoType5_v4b0ext, 
			V590NCEs v590NCEs)
	{
	    setSysInfoType5_v4b0ext(sysInfoType5_v4b0ext);
	    setV590NCEs(v590NCEs);
	}
	
	public void initComponents()
	{
	    mComponents[0] = new SysInfoType5_v4b0ext_IEs();
	    mComponents[1] = new V590NCEs();
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
		    return new SysInfoType5_v4b0ext_IEs();
		case 1:
		    return new V590NCEs();
		default:
		    throw new InternalError("AbstractCollection.createInstance()");
	    }
	    
	}
	
	
	// Methods for field "sysInfoType5_v4b0ext"
	public SysInfoType5_v4b0ext_IEs getSysInfoType5_v4b0ext()
	{
	    return (SysInfoType5_v4b0ext_IEs)mComponents[0];
	}
	
	public void setSysInfoType5_v4b0ext(SysInfoType5_v4b0ext_IEs sysInfoType5_v4b0ext)
	{
	    mComponents[0] = sysInfoType5_v4b0ext;
	}
	
	public boolean hasSysInfoType5_v4b0ext()
	{
	    return componentIsPresent(0);
	}
	
	public void deleteSysInfoType5_v4b0ext()
	{
	    setComponentAbsent(0);
	}
	
	
	// Methods for field "v590NCEs"
	public V590NCEs getV590NCEs()
	{
	    return (V590NCEs)mComponents[1];
	}
	
	public void setV590NCEs(V590NCEs v590NCEs)
	{
	    mComponents[1] = v590NCEs;
	}
	
	public boolean hasV590NCEs()
	{
	    return componentIsPresent(1);
	}
	
	public void deleteV590NCEs()
	{
	    setComponentAbsent(1);
	}
	
	
	
	/**
	 * Define the ASN1 Type V590NCEs from ASN1 Module InformationElements.
	 * @see Sequence
	 */
	public static class V590NCEs extends Sequence {
	    
	    /**
	     * The default constructor.
	     */
	    public V590NCEs()
	    {
	    }
	    
	    /**
	     * Construct with AbstractData components.
	     */
	    public V590NCEs(SysInfoType5_v590ext_IEs sysInfoType5_v590ext, 
			    V650NCEs v650NCEs)
	    {
		setSysInfoType5_v590ext(sysInfoType5_v590ext);
		setV650NCEs(v650NCEs);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new SysInfoType5_v590ext_IEs();
		mComponents[1] = new V650NCEs();
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
			return new SysInfoType5_v590ext_IEs();
		    case 1:
			return new V650NCEs();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "sysInfoType5_v590ext"
	    public SysInfoType5_v590ext_IEs getSysInfoType5_v590ext()
	    {
		return (SysInfoType5_v590ext_IEs)mComponents[0];
	    }
	    
	    public void setSysInfoType5_v590ext(SysInfoType5_v590ext_IEs sysInfoType5_v590ext)
	    {
		mComponents[0] = sysInfoType5_v590ext;
	    }
	    
	    public boolean hasSysInfoType5_v590ext()
	    {
		return componentIsPresent(0);
	    }
	    
	    public void deleteSysInfoType5_v590ext()
	    {
		setComponentAbsent(0);
	    }
	    
	    
	    // Methods for field "v650NCEs"
	    public V650NCEs getV650NCEs()
	    {
		return (V650NCEs)mComponents[1];
	    }
	    
	    public void setV650NCEs(V650NCEs v650NCEs)
	    {
		mComponents[1] = v650NCEs;
	    }
	    
	    public boolean hasV650NCEs()
	    {
		return componentIsPresent(1);
	    }
	    
	    public void deleteV650NCEs()
	    {
		setComponentAbsent(1);
	    }
	    
	    
	    
	    /**
	     * Define the ASN1 Type V650NCEs from ASN1 Module InformationElements.
	     * @see Sequence
	     */
	    public static class V650NCEs extends Sequence {
		
		/**
		 * The default constructor.
		 */
		public V650NCEs()
		{
		}
		
		/**
		 * Construct with AbstractData components.
		 */
		public V650NCEs(SysInfoType5_v650ext_IEs sysInfoType5_v650ext, 
				V680NCEs v680NCEs)
		{
		    setSysInfoType5_v650ext(sysInfoType5_v650ext);
		    setV680NCEs(v680NCEs);
		}
		
		public void initComponents()
		{
		    mComponents[0] = new SysInfoType5_v650ext_IEs();
		    mComponents[1] = new V680NCEs();
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
			    return new SysInfoType5_v650ext_IEs();
			case 1:
			    return new V680NCEs();
			default:
			    throw new InternalError("AbstractCollection.createInstance()");
		    }
		    
		}
		
		
		// Methods for field "sysInfoType5_v650ext"
		public SysInfoType5_v650ext_IEs getSysInfoType5_v650ext()
		{
		    return (SysInfoType5_v650ext_IEs)mComponents[0];
		}
		
		public void setSysInfoType5_v650ext(SysInfoType5_v650ext_IEs sysInfoType5_v650ext)
		{
		    mComponents[0] = sysInfoType5_v650ext;
		}
		
		public boolean hasSysInfoType5_v650ext()
		{
		    return componentIsPresent(0);
		}
		
		public void deleteSysInfoType5_v650ext()
		{
		    setComponentAbsent(0);
		}
		
		
		// Methods for field "v680NCEs"
		public V680NCEs getV680NCEs()
		{
		    return (V680NCEs)mComponents[1];
		}
		
		public void setV680NCEs(V680NCEs v680NCEs)
		{
		    mComponents[1] = v680NCEs;
		}
		
		public boolean hasV680NCEs()
		{
		    return componentIsPresent(1);
		}
		
		public void deleteV680NCEs()
		{
		    setComponentAbsent(1);
		}
		
		
		
		/**
		 * Define the ASN1 Type V680NCEs from ASN1 Module InformationElements.
		 * @see Sequence
		 */
		public static class V680NCEs extends Sequence {
		    
		    /**
		     * The default constructor.
		     */
		    public V680NCEs()
		    {
		    }
		    
		    /**
		     * Construct with AbstractData components.
		     */
		    public V680NCEs(SysInfoType5_v680ext_IEs sysInfoType5_v680ext, 
				    V690NCEs v690NCEs)
		    {
			setSysInfoType5_v680ext(sysInfoType5_v680ext);
			setV690NCEs(v690NCEs);
		    }
		    
		    public void initComponents()
		    {
			mComponents[0] = new SysInfoType5_v680ext_IEs();
			mComponents[1] = new V690NCEs();
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
				return new SysInfoType5_v680ext_IEs();
			    case 1:
				return new V690NCEs();
			    default:
				throw new InternalError("AbstractCollection.createInstance()");
			}
			
		    }
		    
		    
		    // Methods for field "sysInfoType5_v680ext"
		    public SysInfoType5_v680ext_IEs getSysInfoType5_v680ext()
		    {
			return (SysInfoType5_v680ext_IEs)mComponents[0];
		    }
		    
		    public void setSysInfoType5_v680ext(SysInfoType5_v680ext_IEs sysInfoType5_v680ext)
		    {
			mComponents[0] = sysInfoType5_v680ext;
		    }
		    
		    public boolean hasSysInfoType5_v680ext()
		    {
			return componentIsPresent(0);
		    }
		    
		    public void deleteSysInfoType5_v680ext()
		    {
			setComponentAbsent(0);
		    }
		    
		    
		    // Methods for field "v690NCEs"
		    public V690NCEs getV690NCEs()
		    {
			return (V690NCEs)mComponents[1];
		    }
		    
		    public void setV690NCEs(V690NCEs v690NCEs)
		    {
			mComponents[1] = v690NCEs;
		    }
		    
		    public boolean hasV690NCEs()
		    {
			return componentIsPresent(1);
		    }
		    
		    public void deleteV690NCEs()
		    {
			setComponentAbsent(1);
		    }
		    
		    
		    
		    /**
		     * Define the ASN1 Type V690NCEs from ASN1 Module InformationElements.
		     * @see Sequence
		     */
		    public static class V690NCEs extends Sequence {
			
			/**
			 * The default constructor.
			 */
			public V690NCEs()
			{
			}
			
			/**
			 * Construct with AbstractData components.
			 */
			public V690NCEs(SysInfoType5_v690ext_IEs sysInfoType5_v690ext, 
					V770NCEs v770NCEs)
			{
			    setSysInfoType5_v690ext(sysInfoType5_v690ext);
			    setV770NCEs(v770NCEs);
			}
			
			/**
			 * Construct with required components.
			 */
			public V690NCEs(SysInfoType5_v690ext_IEs sysInfoType5_v690ext)
			{
			    setSysInfoType5_v690ext(sysInfoType5_v690ext);
			}
			
			public void initComponents()
			{
			    mComponents[0] = new SysInfoType5_v690ext_IEs();
			    mComponents[1] = new V770NCEs();
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
				    return new SysInfoType5_v690ext_IEs();
				case 1:
				    return new V770NCEs();
				default:
				    throw new InternalError("AbstractCollection.createInstance()");
			    }
			    
			}
			
			
			// Methods for field "sysInfoType5_v690ext"
			public SysInfoType5_v690ext_IEs getSysInfoType5_v690ext()
			{
			    return (SysInfoType5_v690ext_IEs)mComponents[0];
			}
			
			public void setSysInfoType5_v690ext(SysInfoType5_v690ext_IEs sysInfoType5_v690ext)
			{
			    mComponents[0] = sysInfoType5_v690ext;
			}
			
			
			// Methods for field "v770NCEs"
			public V770NCEs getV770NCEs()
			{
			    return (V770NCEs)mComponents[1];
			}
			
			public void setV770NCEs(V770NCEs v770NCEs)
			{
			    mComponents[1] = v770NCEs;
			}
			
			public boolean hasV770NCEs()
			{
			    return componentIsPresent(1);
			}
			
			public void deleteV770NCEs()
			{
			    setComponentAbsent(1);
			}
			
			
			
			/**
			 * Define the ASN1 Type V770NCEs from ASN1 Module InformationElements.
			 * @see Sequence
			 */
			public static class V770NCEs extends Sequence {
			    
			    /**
			     * The default constructor.
			     */
			    public V770NCEs()
			    {
			    }
			    
			    /**
			     * Construct with AbstractData components.
			     */
			    public V770NCEs(SysInfoType5_v770ext_IEs sysInfoType5_v770ext, 
					    V860NCEs v860NCEs)
			    {
				setSysInfoType5_v770ext(sysInfoType5_v770ext);
				setV860NCEs(v860NCEs);
			    }
			    
			    /**
			     * Construct with required components.
			     */
			    public V770NCEs(SysInfoType5_v770ext_IEs sysInfoType5_v770ext)
			    {
				setSysInfoType5_v770ext(sysInfoType5_v770ext);
			    }
			    
			    public void initComponents()
			    {
				mComponents[0] = new SysInfoType5_v770ext_IEs();
				mComponents[1] = new V860NCEs();
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
					return new SysInfoType5_v770ext_IEs();
				    case 1:
					return new V860NCEs();
				    default:
					throw new InternalError("AbstractCollection.createInstance()");
				}
				
			    }
			    
			    
			    // Methods for field "sysInfoType5_v770ext"
			    public SysInfoType5_v770ext_IEs getSysInfoType5_v770ext()
			    {
				return (SysInfoType5_v770ext_IEs)mComponents[0];
			    }
			    
			    public void setSysInfoType5_v770ext(SysInfoType5_v770ext_IEs sysInfoType5_v770ext)
			    {
				mComponents[0] = sysInfoType5_v770ext;
			    }
			    
			    
			    // Methods for field "v860NCEs"
			    public V860NCEs getV860NCEs()
			    {
				return (V860NCEs)mComponents[1];
			    }
			    
			    public void setV860NCEs(V860NCEs v860NCEs)
			    {
				mComponents[1] = v860NCEs;
			    }
			    
			    public boolean hasV860NCEs()
			    {
				return componentIsPresent(1);
			    }
			    
			    public void deleteV860NCEs()
			    {
				setComponentAbsent(1);
			    }
			    
			    
			    
			    /**
			     * Define the ASN1 Type V860NCEs from ASN1 Module InformationElements.
			     * @see Sequence
			     */
			    public static class V860NCEs extends Sequence {
				
				/**
				 * The default constructor.
				 */
				public V860NCEs()
				{
				}
				
				/**
				 * Construct with AbstractData components.
				 */
				public V860NCEs(SysInfoType5_v860ext_IEs sysInfoType5_v860ext, 
						V890NCEs v890NCEs)
				{
				    setSysInfoType5_v860ext(sysInfoType5_v860ext);
				    setV890NCEs(v890NCEs);
				}
				
				/**
				 * Construct with required components.
				 */
				public V860NCEs(SysInfoType5_v860ext_IEs sysInfoType5_v860ext)
				{
				    setSysInfoType5_v860ext(sysInfoType5_v860ext);
				}
				
				public void initComponents()
				{
				    mComponents[0] = new SysInfoType5_v860ext_IEs();
				    mComponents[1] = new V890NCEs();
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
					    return new SysInfoType5_v860ext_IEs();
					case 1:
					    return new V890NCEs();
					default:
					    throw new InternalError("AbstractCollection.createInstance()");
				    }
				    
				}
				
				
				// Methods for field "sysInfoType5_v860ext"
				public SysInfoType5_v860ext_IEs getSysInfoType5_v860ext()
				{
				    return (SysInfoType5_v860ext_IEs)mComponents[0];
				}
				
				public void setSysInfoType5_v860ext(SysInfoType5_v860ext_IEs sysInfoType5_v860ext)
				{
				    mComponents[0] = sysInfoType5_v860ext;
				}
				
				
				// Methods for field "v890NCEs"
				public V890NCEs getV890NCEs()
				{
				    return (V890NCEs)mComponents[1];
				}
				
				public void setV890NCEs(V890NCEs v890NCEs)
				{
				    mComponents[1] = v890NCEs;
				}
				
				public boolean hasV890NCEs()
				{
				    return componentIsPresent(1);
				}
				
				public void deleteV890NCEs()
				{
				    setComponentAbsent(1);
				}
				
				
				
				/**
				 * Define the ASN1 Type V890NCEs from ASN1 Module InformationElements.
				 * @see Sequence
				 */
				public static class V890NCEs extends Sequence {
				    
				    /**
				     * The default constructor.
				     */
				    public V890NCEs()
				    {
				    }
				    
				    /**
				     * Construct with AbstractData components.
				     */
				    public V890NCEs(SysInfoType5_v890ext_IEs sysInfoType5_v890ext, 
						    V8b0NCEs v8b0NCEs)
				    {
					setSysInfoType5_v890ext(sysInfoType5_v890ext);
					setV8b0NCEs(v8b0NCEs);
				    }
				    
				    /**
				     * Construct with required components.
				     */
				    public V890NCEs(SysInfoType5_v890ext_IEs sysInfoType5_v890ext)
				    {
					setSysInfoType5_v890ext(sysInfoType5_v890ext);
				    }
				    
				    public void initComponents()
				    {
					mComponents[0] = new SysInfoType5_v890ext_IEs();
					mComponents[1] = new V8b0NCEs();
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
						return new SysInfoType5_v890ext_IEs();
					    case 1:
						return new V8b0NCEs();
					    default:
						throw new InternalError("AbstractCollection.createInstance()");
					}
					
				    }
				    
				    
				    // Methods for field "sysInfoType5_v890ext"
				    public SysInfoType5_v890ext_IEs getSysInfoType5_v890ext()
				    {
					return (SysInfoType5_v890ext_IEs)mComponents[0];
				    }
				    
				    public void setSysInfoType5_v890ext(SysInfoType5_v890ext_IEs sysInfoType5_v890ext)
				    {
					mComponents[0] = sysInfoType5_v890ext;
				    }
				    
				    
				    // Methods for field "v8b0NCEs"
				    public V8b0NCEs getV8b0NCEs()
				    {
					return (V8b0NCEs)mComponents[1];
				    }
				    
				    public void setV8b0NCEs(V8b0NCEs v8b0NCEs)
				    {
					mComponents[1] = v8b0NCEs;
				    }
				    
				    public boolean hasV8b0NCEs()
				    {
					return componentIsPresent(1);
				    }
				    
				    public void deleteV8b0NCEs()
				    {
					setComponentAbsent(1);
				    }
				    
				    
				    
				    /**
				     * Define the ASN1 Type V8b0NCEs from ASN1 Module InformationElements.
				     * @see Sequence
				     */
				    public static class V8b0NCEs extends Sequence {
					
					/**
					 * The default constructor.
					 */
					public V8b0NCEs()
					{
					}
					
					/**
					 * Construct with AbstractData components.
					 */
					public V8b0NCEs(SysInfoType5_v8b0ext_IEs sysInfoType5_v8b0ext, 
							V8d0NCEs v8d0NCEs)
					{
					    setSysInfoType5_v8b0ext(sysInfoType5_v8b0ext);
					    setV8d0NCEs(v8d0NCEs);
					}
					
					/**
					 * Construct with required components.
					 */
					public V8b0NCEs(SysInfoType5_v8b0ext_IEs sysInfoType5_v8b0ext)
					{
					    setSysInfoType5_v8b0ext(sysInfoType5_v8b0ext);
					}
					
					public void initComponents()
					{
					    mComponents[0] = new SysInfoType5_v8b0ext_IEs();
					    mComponents[1] = new V8d0NCEs();
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
						    return new SysInfoType5_v8b0ext_IEs();
						case 1:
						    return new V8d0NCEs();
						default:
						    throw new InternalError("AbstractCollection.createInstance()");
					    }
					    
					}
					
					
					// Methods for field "sysInfoType5_v8b0ext"
					public SysInfoType5_v8b0ext_IEs getSysInfoType5_v8b0ext()
					{
					    return (SysInfoType5_v8b0ext_IEs)mComponents[0];
					}
					
					public void setSysInfoType5_v8b0ext(SysInfoType5_v8b0ext_IEs sysInfoType5_v8b0ext)
					{
					    mComponents[0] = sysInfoType5_v8b0ext;
					}
					
					
					// Methods for field "v8d0NCEs"
					public V8d0NCEs getV8d0NCEs()
					{
					    return (V8d0NCEs)mComponents[1];
					}
					
					public void setV8d0NCEs(V8d0NCEs v8d0NCEs)
					{
					    mComponents[1] = v8d0NCEs;
					}
					
					public boolean hasV8d0NCEs()
					{
					    return componentIsPresent(1);
					}
					
					public void deleteV8d0NCEs()
					{
					    setComponentAbsent(1);
					}
					
					
					
					/**
					 * Define the ASN1 Type V8d0NCEs from ASN1 Module InformationElements.
					 * @see Sequence
					 */
					public static class V8d0NCEs extends Sequence {
					    
					    /**
					     * The default constructor.
					     */
					    public V8d0NCEs()
					    {
					    }
					    
					    /**
					     * Construct with AbstractData components.
					     */
					    public V8d0NCEs(SysInfoType5_v8d0ext_IEs sysInfoType5_v8d0ext, 
							    Va40NCEs va40NCEs)
					    {
						setSysInfoType5_v8d0ext(sysInfoType5_v8d0ext);
						setVa40NCEs(va40NCEs);
					    }
					    
					    /**
					     * Construct with required components.
					     */
					    public V8d0NCEs(SysInfoType5_v8d0ext_IEs sysInfoType5_v8d0ext)
					    {
						setSysInfoType5_v8d0ext(sysInfoType5_v8d0ext);
					    }
					    
					    public void initComponents()
					    {
						mComponents[0] = new SysInfoType5_v8d0ext_IEs();
						mComponents[1] = new Va40NCEs();
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
							return new SysInfoType5_v8d0ext_IEs();
						    case 1:
							return new Va40NCEs();
						    default:
							throw new InternalError("AbstractCollection.createInstance()");
						}
						
					    }
					    
					    
					    // Methods for field "sysInfoType5_v8d0ext"
					    public SysInfoType5_v8d0ext_IEs getSysInfoType5_v8d0ext()
					    {
						return (SysInfoType5_v8d0ext_IEs)mComponents[0];
					    }
					    
					    public void setSysInfoType5_v8d0ext(SysInfoType5_v8d0ext_IEs sysInfoType5_v8d0ext)
					    {
						mComponents[0] = sysInfoType5_v8d0ext;
					    }
					    
					    
					    // Methods for field "va40NCEs"
					    public Va40NCEs getVa40NCEs()
					    {
						return (Va40NCEs)mComponents[1];
					    }
					    
					    public void setVa40NCEs(Va40NCEs va40NCEs)
					    {
						mComponents[1] = va40NCEs;
					    }
					    
					    public boolean hasVa40NCEs()
					    {
						return componentIsPresent(1);
					    }
					    
					    public void deleteVa40NCEs()
					    {
						setComponentAbsent(1);
					    }
					    
					    
					    
					    /**
					     * Define the ASN1 Type Va40NCEs from ASN1 Module InformationElements.
					     * @see Sequence
					     */
					    public static class Va40NCEs extends Sequence {
						
						/**
						 * The default constructor.
						 */
						public Va40NCEs()
						{
						}
						
						/**
						 * Construct with AbstractData components.
						 */
						public Va40NCEs(SysInfoType5_va40ext_IEs sysInfoType5_va40ext, 
								NonCriticalExtensions nonCriticalExtensions)
						{
						    setSysInfoType5_va40ext(sysInfoType5_va40ext);
						    setNonCriticalExtensions(nonCriticalExtensions);
						}
						
						/**
						 * Construct with required components.
						 */
						public Va40NCEs(SysInfoType5_va40ext_IEs sysInfoType5_va40ext)
						{
						    setSysInfoType5_va40ext(sysInfoType5_va40ext);
						}
						
						public void initComponents()
						{
						    mComponents[0] = new SysInfoType5_va40ext_IEs();
						    mComponents[1] = new NonCriticalExtensions();
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
							    return new SysInfoType5_va40ext_IEs();
							case 1:
							    return new NonCriticalExtensions();
							default:
							    throw new InternalError("AbstractCollection.createInstance()");
						    }
						    
						}
						
						
						// Methods for field "sysInfoType5_va40ext"
						public SysInfoType5_va40ext_IEs getSysInfoType5_va40ext()
						{
						    return (SysInfoType5_va40ext_IEs)mComponents[0];
						}
						
						public void setSysInfoType5_va40ext(SysInfoType5_va40ext_IEs sysInfoType5_va40ext)
						{
						    mComponents[0] = sysInfoType5_va40ext;
						}
						
						
						// Methods for field "nonCriticalExtensions"
						public NonCriticalExtensions getNonCriticalExtensions()
						{
						    return (NonCriticalExtensions)mComponents[1];
						}
						
						public void setNonCriticalExtensions(NonCriticalExtensions nonCriticalExtensions)
						{
						    mComponents[1] = nonCriticalExtensions;
						}
						
						public boolean hasNonCriticalExtensions()
						{
						    return componentIsPresent(1);
						}
						
						public void deleteNonCriticalExtensions()
						{
						    setComponentAbsent(1);
						}
						
						
						
						/**
						 * Define the ASN1 Type NonCriticalExtensions from ASN1 Module InformationElements.
						 * @see Sequence
						 */
						public static class NonCriticalExtensions extends Sequence {
						    
						    /**
						     * The default constructor.
						     */
						    public NonCriticalExtensions()
						    {
						    }
						    
						    public void initComponents()
						    {
							
						    }
						    
						    // Instance initializer
						    {
							mComponents = new AbstractData[0];
						    }
						    
						    // Method to create a specific component instance
						    public AbstractData createInstance(int index)
						    {
							return null;
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
							    "SysInfoType5$V4b0NCEs$V590NCEs$V650NCEs$V680NCEs$V690NCEs$V770NCEs$V860NCEs$V890NCEs$V8b0NCEs$V8d0NCEs$Va40NCEs$NonCriticalExtensions"
							),
							new QName (
							    "builtin",
							    "SEQUENCE"
							),
							12314,
							null,
							new Fields (
							    new SequenceFieldInfo[] {
							    }
							),
							0,
							null,
							0
						    );
						    
						    /**
						     * Get the type descriptor (TypeInfo) of 'this' NonCriticalExtensions object.
						     */
						    public TypeInfo getTypeInfo()
						    {
							return c_typeinfo;
						    }
						    
						    /**
						     * Get the static type descriptor (TypeInfo) of 'this' NonCriticalExtensions object.
						     */
						    public static TypeInfo getStaticTypeInfo()
						    {
							return c_typeinfo;
						    }
						    
						} // End class definition for NonCriticalExtensions

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
							"SysInfoType5$V4b0NCEs$V590NCEs$V650NCEs$V680NCEs$V690NCEs$V770NCEs$V860NCEs$V890NCEs$V8b0NCEs$V8d0NCEs$Va40NCEs"
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
									    "SysInfoType5_va40ext_IEs"
									),
									new QName (
									    "InformationElements",
									    "SysInfoType5-va40ext-IEs"
									),
									12314,
									null,
									new FieldsRef (
									    new QName (
										"rrc.informationelements",
										"SysInfoType5_va40ext_IEs"
									    )
									),
									0,
									new TagDecodersRef (
									    new QName (
										"rrc.informationelements",
										"SysInfoType5_va40ext_IEs"
									    )
									),
									0
								    )
								),
								"sysInfoType5-va40ext",
								0,
								2,
								null
							    ),
							    new SequenceFieldInfo (
								new TypeInfoRef (
								    new QName (
									"rrc.informationelements",
									"SysInfoType5$V4b0NCEs$V590NCEs$V650NCEs$V680NCEs$V690NCEs$V770NCEs$V860NCEs$V890NCEs$V8b0NCEs$V8d0NCEs$Va40NCEs$NonCriticalExtensions"
								    )
								),
								"nonCriticalExtensions",
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
						 * Get the type descriptor (TypeInfo) of 'this' Va40NCEs object.
						 */
						public TypeInfo getTypeInfo()
						{
						    return c_typeinfo;
						}
						
						/**
						 * Get the static type descriptor (TypeInfo) of 'this' Va40NCEs object.
						 */
						public static TypeInfo getStaticTypeInfo()
						{
						    return c_typeinfo;
						}
						
					    } // End class definition for Va40NCEs

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
						    "SysInfoType5$V4b0NCEs$V590NCEs$V650NCEs$V680NCEs$V690NCEs$V770NCEs$V860NCEs$V890NCEs$V8b0NCEs$V8d0NCEs"
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
									"SysInfoType5_v8d0ext_IEs"
								    ),
								    new QName (
									"InformationElements",
									"SysInfoType5-v8d0ext-IEs"
								    ),
								    12314,
								    null,
								    new FieldsRef (
									new QName (
									    "rrc.informationelements",
									    "SysInfoType5_v8d0ext_IEs"
									)
								    ),
								    0,
								    new TagDecodersRef (
									new QName (
									    "rrc.informationelements",
									    "SysInfoType5_v8d0ext_IEs"
									)
								    ),
								    0
								)
							    ),
							    "sysInfoType5-v8d0ext",
							    0,
							    2,
							    null
							),
							new SequenceFieldInfo (
							    new TypeInfoRef (
								new QName (
								    "rrc.informationelements",
								    "SysInfoType5$V4b0NCEs$V590NCEs$V650NCEs$V680NCEs$V690NCEs$V770NCEs$V860NCEs$V890NCEs$V8b0NCEs$V8d0NCEs$Va40NCEs"
								)
							    ),
							    "va40NCEs",
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
					     * Get the type descriptor (TypeInfo) of 'this' V8d0NCEs object.
					     */
					    public TypeInfo getTypeInfo()
					    {
						return c_typeinfo;
					    }
					    
					    /**
					     * Get the static type descriptor (TypeInfo) of 'this' V8d0NCEs object.
					     */
					    public static TypeInfo getStaticTypeInfo()
					    {
						return c_typeinfo;
					    }
					    
					} // End class definition for V8d0NCEs

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
						"SysInfoType5$V4b0NCEs$V590NCEs$V650NCEs$V680NCEs$V690NCEs$V770NCEs$V860NCEs$V890NCEs$V8b0NCEs"
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
								    "SysInfoType5_v8b0ext_IEs"
								),
								new QName (
								    "InformationElements",
								    "SysInfoType5-v8b0ext-IEs"
								),
								12314,
								null,
								new FieldsRef (
								    new QName (
									"rrc.informationelements",
									"SysInfoType5_v8b0ext_IEs"
								    )
								),
								0,
								new TagDecodersRef (
								    new QName (
									"rrc.informationelements",
									"SysInfoType5_v8b0ext_IEs"
								    )
								),
								0
							    )
							),
							"sysInfoType5-v8b0ext",
							0,
							2,
							null
						    ),
						    new SequenceFieldInfo (
							new TypeInfoRef (
							    new QName (
								"rrc.informationelements",
								"SysInfoType5$V4b0NCEs$V590NCEs$V650NCEs$V680NCEs$V690NCEs$V770NCEs$V860NCEs$V890NCEs$V8b0NCEs$V8d0NCEs"
							    )
							),
							"v8d0NCEs",
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
					 * Get the type descriptor (TypeInfo) of 'this' V8b0NCEs object.
					 */
					public TypeInfo getTypeInfo()
					{
					    return c_typeinfo;
					}
					
					/**
					 * Get the static type descriptor (TypeInfo) of 'this' V8b0NCEs object.
					 */
					public static TypeInfo getStaticTypeInfo()
					{
					    return c_typeinfo;
					}
					
				    } // End class definition for V8b0NCEs

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
					    "SysInfoType5$V4b0NCEs$V590NCEs$V650NCEs$V680NCEs$V690NCEs$V770NCEs$V860NCEs$V890NCEs"
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
								"SysInfoType5_v890ext_IEs"
							    ),
							    new QName (
								"InformationElements",
								"SysInfoType5-v890ext-IEs"
							    ),
							    12314,
							    null,
							    new FieldsRef (
								new QName (
								    "rrc.informationelements",
								    "SysInfoType5_v890ext_IEs"
								)
							    ),
							    0,
							    new TagDecodersRef (
								new QName (
								    "rrc.informationelements",
								    "SysInfoType5_v890ext_IEs"
								)
							    ),
							    0
							)
						    ),
						    "sysInfoType5-v890ext",
						    0,
						    2,
						    null
						),
						new SequenceFieldInfo (
						    new TypeInfoRef (
							new QName (
							    "rrc.informationelements",
							    "SysInfoType5$V4b0NCEs$V590NCEs$V650NCEs$V680NCEs$V690NCEs$V770NCEs$V860NCEs$V890NCEs$V8b0NCEs"
							)
						    ),
						    "v8b0NCEs",
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
				     * Get the type descriptor (TypeInfo) of 'this' V890NCEs object.
				     */
				    public TypeInfo getTypeInfo()
				    {
					return c_typeinfo;
				    }
				    
				    /**
				     * Get the static type descriptor (TypeInfo) of 'this' V890NCEs object.
				     */
				    public static TypeInfo getStaticTypeInfo()
				    {
					return c_typeinfo;
				    }
				    
				} // End class definition for V890NCEs

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
					"SysInfoType5$V4b0NCEs$V590NCEs$V650NCEs$V680NCEs$V690NCEs$V770NCEs$V860NCEs"
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
							    "SysInfoType5_v860ext_IEs"
							),
							new QName (
							    "InformationElements",
							    "SysInfoType5-v860ext-IEs"
							),
							12314,
							null,
							new FieldsRef (
							    new QName (
								"rrc.informationelements",
								"SysInfoType5_v860ext_IEs"
							    )
							),
							0,
							new TagDecodersRef (
							    new QName (
								"rrc.informationelements",
								"SysInfoType5_v860ext_IEs"
							    )
							),
							0
						    )
						),
						"sysInfoType5-v860ext",
						0,
						2,
						null
					    ),
					    new SequenceFieldInfo (
						new TypeInfoRef (
						    new QName (
							"rrc.informationelements",
							"SysInfoType5$V4b0NCEs$V590NCEs$V650NCEs$V680NCEs$V690NCEs$V770NCEs$V860NCEs$V890NCEs"
						    )
						),
						"v890NCEs",
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
				 * Get the type descriptor (TypeInfo) of 'this' V860NCEs object.
				 */
				public TypeInfo getTypeInfo()
				{
				    return c_typeinfo;
				}
				
				/**
				 * Get the static type descriptor (TypeInfo) of 'this' V860NCEs object.
				 */
				public static TypeInfo getStaticTypeInfo()
				{
				    return c_typeinfo;
				}
				
			    } // End class definition for V860NCEs

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
				    "SysInfoType5$V4b0NCEs$V590NCEs$V650NCEs$V680NCEs$V690NCEs$V770NCEs"
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
							"SysInfoType5_v770ext_IEs"
						    ),
						    new QName (
							"InformationElements",
							"SysInfoType5-v770ext-IEs"
						    ),
						    12314,
						    null,
						    new FieldsRef (
							new QName (
							    "rrc.informationelements",
							    "SysInfoType5_v770ext_IEs"
							)
						    ),
						    0,
						    new TagDecodersRef (
							new QName (
							    "rrc.informationelements",
							    "SysInfoType5_v770ext_IEs"
							)
						    ),
						    0
						)
					    ),
					    "sysInfoType5-v770ext",
					    0,
					    2,
					    null
					),
					new SequenceFieldInfo (
					    new TypeInfoRef (
						new QName (
						    "rrc.informationelements",
						    "SysInfoType5$V4b0NCEs$V590NCEs$V650NCEs$V680NCEs$V690NCEs$V770NCEs$V860NCEs"
						)
					    ),
					    "v860NCEs",
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
			     * Get the type descriptor (TypeInfo) of 'this' V770NCEs object.
			     */
			    public TypeInfo getTypeInfo()
			    {
				return c_typeinfo;
			    }
			    
			    /**
			     * Get the static type descriptor (TypeInfo) of 'this' V770NCEs object.
			     */
			    public static TypeInfo getStaticTypeInfo()
			    {
				return c_typeinfo;
			    }
			    
			} // End class definition for V770NCEs

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
				"SysInfoType5$V4b0NCEs$V590NCEs$V650NCEs$V680NCEs$V690NCEs"
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
						    "SysInfoType5_v690ext_IEs"
						),
						new QName (
						    "InformationElements",
						    "SysInfoType5-v690ext-IEs"
						),
						12314,
						null,
						new FieldsRef (
						    new QName (
							"rrc.informationelements",
							"SysInfoType5_v690ext_IEs"
						    )
						),
						0,
						new TagDecodersRef (
						    new QName (
							"rrc.informationelements",
							"SysInfoType5_v690ext_IEs"
						    )
						),
						0
					    )
					),
					"sysInfoType5-v690ext",
					0,
					2,
					null
				    ),
				    new SequenceFieldInfo (
					new TypeInfoRef (
					    new QName (
						"rrc.informationelements",
						"SysInfoType5$V4b0NCEs$V590NCEs$V650NCEs$V680NCEs$V690NCEs$V770NCEs"
					    )
					),
					"v770NCEs",
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
			 * Get the type descriptor (TypeInfo) of 'this' V690NCEs object.
			 */
			public TypeInfo getTypeInfo()
			{
			    return c_typeinfo;
			}
			
			/**
			 * Get the static type descriptor (TypeInfo) of 'this' V690NCEs object.
			 */
			public static TypeInfo getStaticTypeInfo()
			{
			    return c_typeinfo;
			}
			
		    } // End class definition for V690NCEs

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
			    "SysInfoType5$V4b0NCEs$V590NCEs$V650NCEs$V680NCEs"
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
						"SysInfoType5_v680ext_IEs"
					    ),
					    new QName (
						"InformationElements",
						"SysInfoType5-v680ext-IEs"
					    ),
					    12314,
					    null,
					    new FieldsRef (
						new QName (
						    "rrc.informationelements",
						    "SysInfoType5_v680ext_IEs"
						)
					    ),
					    0,
					    new TagDecodersRef (
						new QName (
						    "rrc.informationelements",
						    "SysInfoType5_v680ext_IEs"
						)
					    ),
					    0
					)
				    ),
				    "sysInfoType5-v680ext",
				    0,
				    3,
				    null
				),
				new SequenceFieldInfo (
				    new TypeInfoRef (
					new QName (
					    "rrc.informationelements",
					    "SysInfoType5$V4b0NCEs$V590NCEs$V650NCEs$V680NCEs$V690NCEs"
					)
				    ),
				    "v690NCEs",
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
		     * Get the type descriptor (TypeInfo) of 'this' V680NCEs object.
		     */
		    public TypeInfo getTypeInfo()
		    {
			return c_typeinfo;
		    }
		    
		    /**
		     * Get the static type descriptor (TypeInfo) of 'this' V680NCEs object.
		     */
		    public static TypeInfo getStaticTypeInfo()
		    {
			return c_typeinfo;
		    }
		    
		} // End class definition for V680NCEs

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
			"SysInfoType5$V4b0NCEs$V590NCEs$V650NCEs"
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
					    "SysInfoType5_v650ext_IEs"
					),
					new QName (
					    "InformationElements",
					    "SysInfoType5-v650ext-IEs"
					),
					12314,
					null,
					new FieldsRef (
					    new QName (
						"rrc.informationelements",
						"SysInfoType5_v650ext_IEs"
					    )
					),
					0,
					new TagDecodersRef (
					    new QName (
						"rrc.informationelements",
						"SysInfoType5_v650ext_IEs"
					    )
					),
					0
				    )
				),
				"sysInfoType5-v650ext",
				0,
				3,
				null
			    ),
			    new SequenceFieldInfo (
				new TypeInfoRef (
				    new QName (
					"rrc.informationelements",
					"SysInfoType5$V4b0NCEs$V590NCEs$V650NCEs$V680NCEs"
				    )
				),
				"v680NCEs",
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
		 * Get the type descriptor (TypeInfo) of 'this' V650NCEs object.
		 */
		public TypeInfo getTypeInfo()
		{
		    return c_typeinfo;
		}
		
		/**
		 * Get the static type descriptor (TypeInfo) of 'this' V650NCEs object.
		 */
		public static TypeInfo getStaticTypeInfo()
		{
		    return c_typeinfo;
		}
		
	    } // End class definition for V650NCEs

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
		    "SysInfoType5$V4b0NCEs$V590NCEs"
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
					"SysInfoType5_v590ext_IEs"
				    ),
				    new QName (
					"InformationElements",
					"SysInfoType5-v590ext-IEs"
				    ),
				    12314,
				    null,
				    new FieldsRef (
					new QName (
					    "rrc.informationelements",
					    "SysInfoType5_v590ext_IEs"
					)
				    ),
				    0,
				    new TagDecodersRef (
					new QName (
					    "rrc.informationelements",
					    "SysInfoType5_v590ext_IEs"
					)
				    ),
				    0
				)
			    ),
			    "sysInfoType5-v590ext",
			    0,
			    3,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "SysInfoType5$V4b0NCEs$V590NCEs$V650NCEs"
				)
			    ),
			    "v650NCEs",
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
	     * Get the type descriptor (TypeInfo) of 'this' V590NCEs object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' V590NCEs object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for V590NCEs

	/**
	 * Initialize the type descriptor.
	 */
	private static final SequenceInfo c_typeinfo = new SequenceInfo (
	    new Tags (
		new short[] {
		    (short)0x8007
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"SysInfoType5$V4b0NCEs"
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
				    "SysInfoType5_v4b0ext_IEs"
				),
				new QName (
				    "InformationElements",
				    "SysInfoType5-v4b0ext-IEs"
				),
				12314,
				null,
				new FieldsRef (
				    new QName (
					"rrc.informationelements",
					"SysInfoType5_v4b0ext_IEs"
				    )
				),
				0,
				new TagDecodersRef (
				    new QName (
					"rrc.informationelements",
					"SysInfoType5_v4b0ext_IEs"
				    )
				),
				0
			    )
			),
			"sysInfoType5-v4b0ext",
			0,
			3,
			null
		    ),
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.informationelements",
				"SysInfoType5$V4b0NCEs$V590NCEs"
			    )
			),
			"v590NCEs",
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
	 * Get the type descriptor (TypeInfo) of 'this' V4b0NCEs object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' V4b0NCEs object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for V4b0NCEs

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
	    "SysInfoType5"
	),
	new QName (
	    "InformationElements",
	    "SysInfoType5"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
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
		    "sib6indicator",
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
				"PICH_PowerOffset"
			    ),
			    new QName (
				"InformationElements",
				"PICH-PowerOffset"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new PICH_PowerOffset(-10), 
				    new PICH_PowerOffset(5),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(-10),
				new java.lang.Long(5)
			    ),
			    null
			)
		    ),
		    "pich-PowerOffset",
		    1,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "SysInfoType5$ModeSpecificInfo"
			)
		    ),
		    "modeSpecificInfo",
		    2,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"PrimaryCCPCH_Info"
			    ),
			    new QName (
				"InformationElements",
				"PrimaryCCPCH-Info"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "PrimaryCCPCH_Info"
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
		    "primaryCCPCH-Info",
		    3,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8004
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"PRACH_SystemInformationList"
			    ),
			    new QName (
				"InformationElements",
				"PRACH-SystemInformationList"
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
				    "PRACH_SystemInformation"
				)
			    )
			)
		    ),
		    "prach-SystemInformationList",
		    4,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8005
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"SCCPCH_SystemInformationList"
			    ),
			    new QName (
				"InformationElements",
				"SCCPCH-SystemInformationList"
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
				    "SCCPCH_SystemInformation"
				)
			    )
			)
		    ),
		    "sCCPCH-SystemInformationList",
		    5,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8006
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"CBS_DRX_Level1Information"
			    ),
			    new QName (
				"InformationElements",
				"CBS-DRX-Level1Information"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "CBS_DRX_Level1Information"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "CBS_DRX_Level1Information"
				)
			    ),
			    0
			)
		    ),
		    "cbs-DRX-Level1Information",
		    6,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "SysInfoType5$V4b0NCEs"
			)
		    ),
		    "v4b0NCEs",
		    7,
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
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8006, 6),
			new TagDecoderElement((short)0x8007, 7)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8007, 7)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' SysInfoType5 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' SysInfoType5 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for SysInfoType5
