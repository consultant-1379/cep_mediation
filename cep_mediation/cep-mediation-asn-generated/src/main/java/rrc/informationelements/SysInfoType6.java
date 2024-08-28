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
 * Define the ASN1 Type SysInfoType6 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class SysInfoType6 extends Sequence {
    
    /**
     * The default constructor.
     */
    public SysInfoType6()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public SysInfoType6(PICH_PowerOffset pich_PowerOffset, 
		    ModeSpecificInfo modeSpecificInfo, 
		    PrimaryCCPCH_Info primaryCCPCH_Info, 
		    PRACH_SystemInformationList prach_SystemInformationList, 
		    SCCPCH_SystemInformationList sCCPCH_SystemInformationList, 
		    CBS_DRX_Level1Information cbs_DRX_Level1Information, 
		    V4b0NCEs v4b0NCEs)
    {
	setPich_PowerOffset(pich_PowerOffset);
	setModeSpecificInfo(modeSpecificInfo);
	setPrimaryCCPCH_Info(primaryCCPCH_Info);
	setPrach_SystemInformationList(prach_SystemInformationList);
	setSCCPCH_SystemInformationList(sCCPCH_SystemInformationList);
	setCbs_DRX_Level1Information(cbs_DRX_Level1Information);
	setV4b0NCEs(v4b0NCEs);
    }
    
    /**
     * Construct with required components.
     */
    public SysInfoType6(PICH_PowerOffset pich_PowerOffset, 
		    ModeSpecificInfo modeSpecificInfo)
    {
	setPich_PowerOffset(pich_PowerOffset);
	setModeSpecificInfo(modeSpecificInfo);
    }
    
    public void initComponents()
    {
	mComponents[0] = new PICH_PowerOffset();
	mComponents[1] = new ModeSpecificInfo();
	mComponents[2] = new PrimaryCCPCH_Info();
	mComponents[3] = new PRACH_SystemInformationList();
	mComponents[4] = new SCCPCH_SystemInformationList();
	mComponents[5] = new CBS_DRX_Level1Information();
	mComponents[6] = new V4b0NCEs();
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
		return new PICH_PowerOffset();
	    case 1:
		return new ModeSpecificInfo();
	    case 2:
		return new PrimaryCCPCH_Info();
	    case 3:
		return new PRACH_SystemInformationList();
	    case 4:
		return new SCCPCH_SystemInformationList();
	    case 5:
		return new CBS_DRX_Level1Information();
	    case 6:
		return new V4b0NCEs();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "pich_PowerOffset"
    public PICH_PowerOffset getPich_PowerOffset()
    {
	return (PICH_PowerOffset)mComponents[0];
    }
    
    public void setPich_PowerOffset(PICH_PowerOffset pich_PowerOffset)
    {
	mComponents[0] = pich_PowerOffset;
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
	    public Fdd(AICH_PowerOffset aich_PowerOffset, 
			    CSICH_PowerOffset dummy)
	    {
		setAich_PowerOffset(aich_PowerOffset);
		setDummy(dummy);
	    }
	    
	    /**
	     * Construct with required components.
	     */
	    public Fdd(AICH_PowerOffset aich_PowerOffset)
	    {
		setAich_PowerOffset(aich_PowerOffset);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new AICH_PowerOffset();
		mComponents[1] = new CSICH_PowerOffset();
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
			return new AICH_PowerOffset();
		    case 1:
			return new CSICH_PowerOffset();
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
	    
	    
	    // Methods for field "dummy"
	    public CSICH_PowerOffset getDummy()
	    {
		return (CSICH_PowerOffset)mComponents[1];
	    }
	    
	    public void setDummy(CSICH_PowerOffset dummy)
	    {
		mComponents[1] = dummy;
	    }
	    
	    public boolean hasDummy()
	    {
		return componentIsPresent(1);
	    }
	    
	    public void deleteDummy()
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
		    "SysInfoType6$ModeSpecificInfo$Fdd"
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
					"CSICH_PowerOffset"
				    ),
				    new QName (
					"InformationElements",
					"CSICH-PowerOffset"
				    ),
				    12314,
				    new ValueRangeConstraint (
					new AbstractBounds(
					    new CSICH_PowerOffset(-10), 
					    new CSICH_PowerOffset(5),
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
			    "dummy",
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
		    "SysInfoType6$ModeSpecificInfo$Tdd"
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
		    (short)0x8001
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"SysInfoType6$ModeSpecificInfo"
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
				"SysInfoType6$ModeSpecificInfo$Fdd"
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
				"SysInfoType6$ModeSpecificInfo$Tdd"
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
	return (PrimaryCCPCH_Info)mComponents[2];
    }
    
    public void setPrimaryCCPCH_Info(PrimaryCCPCH_Info primaryCCPCH_Info)
    {
	mComponents[2] = primaryCCPCH_Info;
    }
    
    public boolean hasPrimaryCCPCH_Info()
    {
	return componentIsPresent(2);
    }
    
    public void deletePrimaryCCPCH_Info()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "prach_SystemInformationList"
    public PRACH_SystemInformationList getPrach_SystemInformationList()
    {
	return (PRACH_SystemInformationList)mComponents[3];
    }
    
    public void setPrach_SystemInformationList(PRACH_SystemInformationList prach_SystemInformationList)
    {
	mComponents[3] = prach_SystemInformationList;
    }
    
    public boolean hasPrach_SystemInformationList()
    {
	return componentIsPresent(3);
    }
    
    public void deletePrach_SystemInformationList()
    {
	setComponentAbsent(3);
    }
    
    
    // Methods for field "sCCPCH_SystemInformationList"
    public SCCPCH_SystemInformationList getSCCPCH_SystemInformationList()
    {
	return (SCCPCH_SystemInformationList)mComponents[4];
    }
    
    public void setSCCPCH_SystemInformationList(SCCPCH_SystemInformationList sCCPCH_SystemInformationList)
    {
	mComponents[4] = sCCPCH_SystemInformationList;
    }
    
    public boolean hasSCCPCH_SystemInformationList()
    {
	return componentIsPresent(4);
    }
    
    public void deleteSCCPCH_SystemInformationList()
    {
	setComponentAbsent(4);
    }
    
    
    // Methods for field "cbs_DRX_Level1Information"
    public CBS_DRX_Level1Information getCbs_DRX_Level1Information()
    {
	return (CBS_DRX_Level1Information)mComponents[5];
    }
    
    public void setCbs_DRX_Level1Information(CBS_DRX_Level1Information cbs_DRX_Level1Information)
    {
	mComponents[5] = cbs_DRX_Level1Information;
    }
    
    public boolean hasCbs_DRX_Level1Information()
    {
	return componentIsPresent(5);
    }
    
    public void deleteCbs_DRX_Level1Information()
    {
	setComponentAbsent(5);
    }
    
    
    // Methods for field "v4b0NCEs"
    public V4b0NCEs getV4b0NCEs()
    {
	return (V4b0NCEs)mComponents[6];
    }
    
    public void setV4b0NCEs(V4b0NCEs v4b0NCEs)
    {
	mComponents[6] = v4b0NCEs;
    }
    
    public boolean hasV4b0NCEs()
    {
	return componentIsPresent(6);
    }
    
    public void deleteV4b0NCEs()
    {
	setComponentAbsent(6);
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
	public V4b0NCEs(SysInfoType6_v4b0ext_IEs sysInfoType6_v4b0ext, 
			V590NCEs v590NCEs)
	{
	    setSysInfoType6_v4b0ext(sysInfoType6_v4b0ext);
	    setV590NCEs(v590NCEs);
	}
	
	public void initComponents()
	{
	    mComponents[0] = new SysInfoType6_v4b0ext_IEs();
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
		    return new SysInfoType6_v4b0ext_IEs();
		case 1:
		    return new V590NCEs();
		default:
		    throw new InternalError("AbstractCollection.createInstance()");
	    }
	    
	}
	
	
	// Methods for field "sysInfoType6_v4b0ext"
	public SysInfoType6_v4b0ext_IEs getSysInfoType6_v4b0ext()
	{
	    return (SysInfoType6_v4b0ext_IEs)mComponents[0];
	}
	
	public void setSysInfoType6_v4b0ext(SysInfoType6_v4b0ext_IEs sysInfoType6_v4b0ext)
	{
	    mComponents[0] = sysInfoType6_v4b0ext;
	}
	
	public boolean hasSysInfoType6_v4b0ext()
	{
	    return componentIsPresent(0);
	}
	
	public void deleteSysInfoType6_v4b0ext()
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
	    public V590NCEs(SysInfoType6_v590ext_IEs sysInfoType6_v590ext, 
			    V650nonCriticalExtensions v650nonCriticalExtensions)
	    {
		setSysInfoType6_v590ext(sysInfoType6_v590ext);
		setV650nonCriticalExtensions(v650nonCriticalExtensions);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new SysInfoType6_v590ext_IEs();
		mComponents[1] = new V650nonCriticalExtensions();
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
			return new SysInfoType6_v590ext_IEs();
		    case 1:
			return new V650nonCriticalExtensions();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "sysInfoType6_v590ext"
	    public SysInfoType6_v590ext_IEs getSysInfoType6_v590ext()
	    {
		return (SysInfoType6_v590ext_IEs)mComponents[0];
	    }
	    
	    public void setSysInfoType6_v590ext(SysInfoType6_v590ext_IEs sysInfoType6_v590ext)
	    {
		mComponents[0] = sysInfoType6_v590ext;
	    }
	    
	    public boolean hasSysInfoType6_v590ext()
	    {
		return componentIsPresent(0);
	    }
	    
	    public void deleteSysInfoType6_v590ext()
	    {
		setComponentAbsent(0);
	    }
	    
	    
	    // Methods for field "v650nonCriticalExtensions"
	    public V650nonCriticalExtensions getV650nonCriticalExtensions()
	    {
		return (V650nonCriticalExtensions)mComponents[1];
	    }
	    
	    public void setV650nonCriticalExtensions(V650nonCriticalExtensions v650nonCriticalExtensions)
	    {
		mComponents[1] = v650nonCriticalExtensions;
	    }
	    
	    public boolean hasV650nonCriticalExtensions()
	    {
		return componentIsPresent(1);
	    }
	    
	    public void deleteV650nonCriticalExtensions()
	    {
		setComponentAbsent(1);
	    }
	    
	    
	    
	    /**
	     * Define the ASN1 Type V650nonCriticalExtensions from ASN1 Module InformationElements.
	     * @see Sequence
	     */
	    public static class V650nonCriticalExtensions extends Sequence {
		
		/**
		 * The default constructor.
		 */
		public V650nonCriticalExtensions()
		{
		}
		
		/**
		 * Construct with AbstractData components.
		 */
		public V650nonCriticalExtensions(SysInfoType6_v650ext_IEs sysInfoType6_v650ext, 
				V690nonCriticalExtensions v690nonCriticalExtensions)
		{
		    setSysInfoType6_v650ext(sysInfoType6_v650ext);
		    setV690nonCriticalExtensions(v690nonCriticalExtensions);
		}
		
		public void initComponents()
		{
		    mComponents[0] = new SysInfoType6_v650ext_IEs();
		    mComponents[1] = new V690nonCriticalExtensions();
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
			    return new SysInfoType6_v650ext_IEs();
			case 1:
			    return new V690nonCriticalExtensions();
			default:
			    throw new InternalError("AbstractCollection.createInstance()");
		    }
		    
		}
		
		
		// Methods for field "sysInfoType6_v650ext"
		public SysInfoType6_v650ext_IEs getSysInfoType6_v650ext()
		{
		    return (SysInfoType6_v650ext_IEs)mComponents[0];
		}
		
		public void setSysInfoType6_v650ext(SysInfoType6_v650ext_IEs sysInfoType6_v650ext)
		{
		    mComponents[0] = sysInfoType6_v650ext;
		}
		
		public boolean hasSysInfoType6_v650ext()
		{
		    return componentIsPresent(0);
		}
		
		public void deleteSysInfoType6_v650ext()
		{
		    setComponentAbsent(0);
		}
		
		
		// Methods for field "v690nonCriticalExtensions"
		public V690nonCriticalExtensions getV690nonCriticalExtensions()
		{
		    return (V690nonCriticalExtensions)mComponents[1];
		}
		
		public void setV690nonCriticalExtensions(V690nonCriticalExtensions v690nonCriticalExtensions)
		{
		    mComponents[1] = v690nonCriticalExtensions;
		}
		
		public boolean hasV690nonCriticalExtensions()
		{
		    return componentIsPresent(1);
		}
		
		public void deleteV690nonCriticalExtensions()
		{
		    setComponentAbsent(1);
		}
		
		
		
		/**
		 * Define the ASN1 Type V690nonCriticalExtensions from ASN1 Module InformationElements.
		 * @see Sequence
		 */
		public static class V690nonCriticalExtensions extends Sequence {
		    
		    /**
		     * The default constructor.
		     */
		    public V690nonCriticalExtensions()
		    {
		    }
		    
		    /**
		     * Construct with AbstractData components.
		     */
		    public V690nonCriticalExtensions(SysInfoType6_v690ext_IEs sysInfoType6_v690ext, 
				    V770NCEs v770NCEs)
		    {
			setSysInfoType6_v690ext(sysInfoType6_v690ext);
			setV770NCEs(v770NCEs);
		    }
		    
		    /**
		     * Construct with required components.
		     */
		    public V690nonCriticalExtensions(SysInfoType6_v690ext_IEs sysInfoType6_v690ext)
		    {
			setSysInfoType6_v690ext(sysInfoType6_v690ext);
		    }
		    
		    public void initComponents()
		    {
			mComponents[0] = new SysInfoType6_v690ext_IEs();
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
				return new SysInfoType6_v690ext_IEs();
			    case 1:
				return new V770NCEs();
			    default:
				throw new InternalError("AbstractCollection.createInstance()");
			}
			
		    }
		    
		    
		    // Methods for field "sysInfoType6_v690ext"
		    public SysInfoType6_v690ext_IEs getSysInfoType6_v690ext()
		    {
			return (SysInfoType6_v690ext_IEs)mComponents[0];
		    }
		    
		    public void setSysInfoType6_v690ext(SysInfoType6_v690ext_IEs sysInfoType6_v690ext)
		    {
			mComponents[0] = sysInfoType6_v690ext;
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
			public V770NCEs(SysInfoType6_v770ext_IEs sysInfoType6_v770ext, 
					Va40NCEs va40NCEs)
			{
			    setSysInfoType6_v770ext(sysInfoType6_v770ext);
			    setVa40NCEs(va40NCEs);
			}
			
			/**
			 * Construct with required components.
			 */
			public V770NCEs(SysInfoType6_v770ext_IEs sysInfoType6_v770ext)
			{
			    setSysInfoType6_v770ext(sysInfoType6_v770ext);
			}
			
			public void initComponents()
			{
			    mComponents[0] = new SysInfoType6_v770ext_IEs();
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
				    return new SysInfoType6_v770ext_IEs();
				case 1:
				    return new Va40NCEs();
				default:
				    throw new InternalError("AbstractCollection.createInstance()");
			    }
			    
			}
			
			
			// Methods for field "sysInfoType6_v770ext"
			public SysInfoType6_v770ext_IEs getSysInfoType6_v770ext()
			{
			    return (SysInfoType6_v770ext_IEs)mComponents[0];
			}
			
			public void setSysInfoType6_v770ext(SysInfoType6_v770ext_IEs sysInfoType6_v770ext)
			{
			    mComponents[0] = sysInfoType6_v770ext;
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
			    public Va40NCEs(SysInfoType6_va40ext_IEs sysInfoType6_va40ext, 
					    NonCriticalExtensions nonCriticalExtensions)
			    {
				setSysInfoType6_va40ext(sysInfoType6_va40ext);
				setNonCriticalExtensions(nonCriticalExtensions);
			    }
			    
			    /**
			     * Construct with required components.
			     */
			    public Va40NCEs(SysInfoType6_va40ext_IEs sysInfoType6_va40ext)
			    {
				setSysInfoType6_va40ext(sysInfoType6_va40ext);
			    }
			    
			    public void initComponents()
			    {
				mComponents[0] = new SysInfoType6_va40ext_IEs();
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
					return new SysInfoType6_va40ext_IEs();
				    case 1:
					return new NonCriticalExtensions();
				    default:
					throw new InternalError("AbstractCollection.createInstance()");
				}
				
			    }
			    
			    
			    // Methods for field "sysInfoType6_va40ext"
			    public SysInfoType6_va40ext_IEs getSysInfoType6_va40ext()
			    {
				return (SysInfoType6_va40ext_IEs)mComponents[0];
			    }
			    
			    public void setSysInfoType6_va40ext(SysInfoType6_va40ext_IEs sysInfoType6_va40ext)
			    {
				mComponents[0] = sysInfoType6_va40ext;
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
					"SysInfoType6$V4b0NCEs$V590NCEs$V650nonCriticalExtensions$V690nonCriticalExtensions$V770NCEs$Va40NCEs$NonCriticalExtensions"
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
				    "SysInfoType6$V4b0NCEs$V590NCEs$V650nonCriticalExtensions$V690nonCriticalExtensions$V770NCEs$Va40NCEs"
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
							"SysInfoType6_va40ext_IEs"
						    ),
						    new QName (
							"InformationElements",
							"SysInfoType6-va40ext-IEs"
						    ),
						    12314,
						    null,
						    new FieldsRef (
							new QName (
							    "rrc.informationelements",
							    "SysInfoType6_va40ext_IEs"
							)
						    ),
						    0,
						    new TagDecodersRef (
							new QName (
							    "rrc.informationelements",
							    "SysInfoType6_va40ext_IEs"
							)
						    ),
						    0
						)
					    ),
					    "sysInfoType6-va40ext",
					    0,
					    2,
					    null
					),
					new SequenceFieldInfo (
					    new TypeInfoRef (
						new QName (
						    "rrc.informationelements",
						    "SysInfoType6$V4b0NCEs$V590NCEs$V650nonCriticalExtensions$V690nonCriticalExtensions$V770NCEs$Va40NCEs$NonCriticalExtensions"
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
				"SysInfoType6$V4b0NCEs$V590NCEs$V650nonCriticalExtensions$V690nonCriticalExtensions$V770NCEs"
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
						    "SysInfoType6_v770ext_IEs"
						),
						new QName (
						    "InformationElements",
						    "SysInfoType6-v770ext-IEs"
						),
						12314,
						null,
						new FieldsRef (
						    new QName (
							"rrc.informationelements",
							"SysInfoType6_v770ext_IEs"
						    )
						),
						0,
						new TagDecodersRef (
						    new QName (
							"rrc.informationelements",
							"SysInfoType6_v770ext_IEs"
						    )
						),
						0
					    )
					),
					"sysInfoType6-v770ext",
					0,
					2,
					null
				    ),
				    new SequenceFieldInfo (
					new TypeInfoRef (
					    new QName (
						"rrc.informationelements",
						"SysInfoType6$V4b0NCEs$V590NCEs$V650nonCriticalExtensions$V690nonCriticalExtensions$V770NCEs$Va40NCEs"
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
			    "SysInfoType6$V4b0NCEs$V590NCEs$V650nonCriticalExtensions$V690nonCriticalExtensions"
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
						"SysInfoType6_v690ext_IEs"
					    ),
					    new QName (
						"InformationElements",
						"SysInfoType6-v690ext-IEs"
					    ),
					    12314,
					    null,
					    new FieldsRef (
						new QName (
						    "rrc.informationelements",
						    "SysInfoType6_v690ext_IEs"
						)
					    ),
					    0,
					    new TagDecodersRef (
						new QName (
						    "rrc.informationelements",
						    "SysInfoType6_v690ext_IEs"
						)
					    ),
					    0
					)
				    ),
				    "sysInfoType6-v690ext",
				    0,
				    2,
				    null
				),
				new SequenceFieldInfo (
				    new TypeInfoRef (
					new QName (
					    "rrc.informationelements",
					    "SysInfoType6$V4b0NCEs$V590NCEs$V650nonCriticalExtensions$V690nonCriticalExtensions$V770NCEs"
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
		     * Get the type descriptor (TypeInfo) of 'this' V690nonCriticalExtensions object.
		     */
		    public TypeInfo getTypeInfo()
		    {
			return c_typeinfo;
		    }
		    
		    /**
		     * Get the static type descriptor (TypeInfo) of 'this' V690nonCriticalExtensions object.
		     */
		    public static TypeInfo getStaticTypeInfo()
		    {
			return c_typeinfo;
		    }
		    
		} // End class definition for V690nonCriticalExtensions

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
			"SysInfoType6$V4b0NCEs$V590NCEs$V650nonCriticalExtensions"
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
					    "SysInfoType6_v650ext_IEs"
					),
					new QName (
					    "InformationElements",
					    "SysInfoType6-v650ext-IEs"
					),
					12314,
					null,
					new FieldsRef (
					    new QName (
						"rrc.informationelements",
						"SysInfoType6_v650ext_IEs"
					    )
					),
					0,
					new TagDecodersRef (
					    new QName (
						"rrc.informationelements",
						"SysInfoType6_v650ext_IEs"
					    )
					),
					0
				    )
				),
				"sysInfoType6-v650ext",
				0,
				3,
				null
			    ),
			    new SequenceFieldInfo (
				new TypeInfoRef (
				    new QName (
					"rrc.informationelements",
					"SysInfoType6$V4b0NCEs$V590NCEs$V650nonCriticalExtensions$V690nonCriticalExtensions"
				    )
				),
				"v690nonCriticalExtensions",
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
		 * Get the type descriptor (TypeInfo) of 'this' V650nonCriticalExtensions object.
		 */
		public TypeInfo getTypeInfo()
		{
		    return c_typeinfo;
		}
		
		/**
		 * Get the static type descriptor (TypeInfo) of 'this' V650nonCriticalExtensions object.
		 */
		public static TypeInfo getStaticTypeInfo()
		{
		    return c_typeinfo;
		}
		
	    } // End class definition for V650nonCriticalExtensions

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
		    "SysInfoType6$V4b0NCEs$V590NCEs"
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
					"SysInfoType6_v590ext_IEs"
				    ),
				    new QName (
					"InformationElements",
					"SysInfoType6-v590ext-IEs"
				    ),
				    12314,
				    null,
				    new FieldsRef (
					new QName (
					    "rrc.informationelements",
					    "SysInfoType6_v590ext_IEs"
					)
				    ),
				    0,
				    new TagDecodersRef (
					new QName (
					    "rrc.informationelements",
					    "SysInfoType6_v590ext_IEs"
					)
				    ),
				    0
				)
			    ),
			    "sysInfoType6-v590ext",
			    0,
			    3,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "SysInfoType6$V4b0NCEs$V590NCEs$V650nonCriticalExtensions"
				)
			    ),
			    "v650nonCriticalExtensions",
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
		    (short)0x8006
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"SysInfoType6$V4b0NCEs"
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
				    "SysInfoType6_v4b0ext_IEs"
				),
				new QName (
				    "InformationElements",
				    "SysInfoType6-v4b0ext-IEs"
				),
				12314,
				null,
				new FieldsRef (
				    new QName (
					"rrc.informationelements",
					"SysInfoType6_v4b0ext_IEs"
				    )
				),
				0,
				new TagDecodersRef (
				    new QName (
					"rrc.informationelements",
					"SysInfoType6_v4b0ext_IEs"
				    )
				),
				0
			    )
			),
			"sysInfoType6-v4b0ext",
			0,
			3,
			null
		    ),
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.informationelements",
				"SysInfoType6$V4b0NCEs$V590NCEs"
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
	    "SysInfoType6"
	),
	new QName (
	    "InformationElements",
	    "SysInfoType6"
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
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "SysInfoType6$ModeSpecificInfo"
			)
		    ),
		    "modeSpecificInfo",
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
		    4,
		    3,
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
		    5,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "SysInfoType6$V4b0NCEs"
			)
		    ),
		    "v4b0NCEs",
		    6,
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
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6)
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
     * Get the type descriptor (TypeInfo) of 'this' SysInfoType6 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' SysInfoType6 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * The type is a PDU.
     */
    public boolean isPDU()
    {
	return true;
    }
    
} // End class definition for SysInfoType6
