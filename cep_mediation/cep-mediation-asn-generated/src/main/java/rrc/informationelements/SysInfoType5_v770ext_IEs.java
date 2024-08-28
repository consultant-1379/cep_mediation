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
 * Define the ASN1 Type SysInfoType5_v770ext_IEs from ASN1 Module InformationElements.
 * @see Sequence
 */

public class SysInfoType5_v770ext_IEs extends Sequence {
    
    /**
     * The default constructor.
     */
    public SysInfoType5_v770ext_IEs()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public SysInfoType5_v770ext_IEs(ModeSpecificInfo modeSpecificInfo, 
		    SCCPCH_SystemInformationList_HCR_VHCR_r7 sccpch_SystemInformationList, 
		    Sccpch_SystemInformation_MBMS sccpch_SystemInformation_MBMS, 
		    TDD_MBSFNInformation tDD_MBSFNInformation)
    {
	setModeSpecificInfo(modeSpecificInfo);
	setSccpch_SystemInformationList(sccpch_SystemInformationList);
	setSccpch_SystemInformation_MBMS(sccpch_SystemInformation_MBMS);
	setTDD_MBSFNInformation(tDD_MBSFNInformation);
    }
    
    public void initComponents()
    {
	mComponents[0] = new ModeSpecificInfo();
	mComponents[1] = new SCCPCH_SystemInformationList_HCR_VHCR_r7();
	mComponents[2] = new Sccpch_SystemInformation_MBMS();
	mComponents[3] = new TDD_MBSFNInformation();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[4];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new ModeSpecificInfo();
	    case 1:
		return new SCCPCH_SystemInformationList_HCR_VHCR_r7();
	    case 2:
		return new Sccpch_SystemInformation_MBMS();
	    case 3:
		return new TDD_MBSFNInformation();
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
    
    public boolean hasModeSpecificInfo()
    {
	return componentIsPresent(0);
    }
    
    public void deleteModeSpecificInfo()
    {
	setComponentAbsent(0);
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
	public static final  int  tdd768_chosen = 2;
	public static final  int  tdd128_chosen = 3;
	
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
	    public Fdd(HS_DSCH_CommonSystemInformation hs_dsch_CommonSystemInformation, 
			    HS_DSCH_PagingSystemInformation hs_dsch_PagingSystemInformation)
	    {
		setHs_dsch_CommonSystemInformation(hs_dsch_CommonSystemInformation);
		setHs_dsch_PagingSystemInformation(hs_dsch_PagingSystemInformation);
	    }
	    
	    /**
	     * Construct with required components.
	     */
	    public Fdd(HS_DSCH_CommonSystemInformation hs_dsch_CommonSystemInformation)
	    {
		setHs_dsch_CommonSystemInformation(hs_dsch_CommonSystemInformation);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new HS_DSCH_CommonSystemInformation();
		mComponents[1] = new HS_DSCH_PagingSystemInformation();
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
			return new HS_DSCH_CommonSystemInformation();
		    case 1:
			return new HS_DSCH_PagingSystemInformation();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "hs_dsch_CommonSystemInformation"
	    public HS_DSCH_CommonSystemInformation getHs_dsch_CommonSystemInformation()
	    {
		return (HS_DSCH_CommonSystemInformation)mComponents[0];
	    }
	    
	    public void setHs_dsch_CommonSystemInformation(HS_DSCH_CommonSystemInformation hs_dsch_CommonSystemInformation)
	    {
		mComponents[0] = hs_dsch_CommonSystemInformation;
	    }
	    
	    
	    // Methods for field "hs_dsch_PagingSystemInformation"
	    public HS_DSCH_PagingSystemInformation getHs_dsch_PagingSystemInformation()
	    {
		return (HS_DSCH_PagingSystemInformation)mComponents[1];
	    }
	    
	    public void setHs_dsch_PagingSystemInformation(HS_DSCH_PagingSystemInformation hs_dsch_PagingSystemInformation)
	    {
		mComponents[1] = hs_dsch_PagingSystemInformation;
	    }
	    
	    public boolean hasHs_dsch_PagingSystemInformation()
	    {
		return componentIsPresent(1);
	    }
	    
	    public void deleteHs_dsch_PagingSystemInformation()
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
		    "SysInfoType5_v770ext_IEs$ModeSpecificInfo$Fdd"
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
					"HS_DSCH_CommonSystemInformation"
				    ),
				    new QName (
					"InformationElements",
					"HS-DSCH-CommonSystemInformation"
				    ),
				    12314,
				    null,
				    new FieldsRef (
					new QName (
					    "rrc.informationelements",
					    "HS_DSCH_CommonSystemInformation"
					)
				    ),
				    0,
				    new TagDecodersRef (
					new QName (
					    "rrc.informationelements",
					    "HS_DSCH_CommonSystemInformation"
					)
				    ),
				    0
				)
			    ),
			    "hs-dsch-CommonSystemInformation",
			    0,
			    2,
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
					"HS_DSCH_PagingSystemInformation"
				    ),
				    new QName (
					"InformationElements",
					"HS-DSCH-PagingSystemInformation"
				    ),
				    12314,
				    null,
				    new FieldsRef (
					new QName (
					    "rrc.informationelements",
					    "HS_DSCH_PagingSystemInformation"
					)
				    ),
				    0,
				    new TagDecodersRef (
					new QName (
					    "rrc.informationelements",
					    "HS_DSCH_PagingSystemInformation"
					)
				    ),
				    0
				)
			    ),
			    "hs-dsch-PagingSystemInformation",
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

	// Methods for field "tdd768"
	public static ModeSpecificInfo createModeSpecificInfoWithTdd768(Tdd768 tdd768)
	{
	    ModeSpecificInfo __object = new ModeSpecificInfo();

	    __object.setTdd768(tdd768);
	    return __object;
	}
	
	public boolean hasTdd768()
	{
	    return getChosenFlag() == tdd768_chosen;
	}
	
	public void setTdd768(Tdd768 tdd768)
	{
	    setChosenValue(tdd768);
	    setChosenFlag(tdd768_chosen);
	}
	
	
	
	/**
	 * Define the ASN1 Type Tdd768 from ASN1 Module InformationElements.
	 * @see Sequence
	 */
	public static class Tdd768 extends Sequence {
	    
	    /**
	     * The default constructor.
	     */
	    public Tdd768()
	    {
	    }
	    
	    /**
	     * Construct with AbstractData components.
	     */
	    public Tdd768(PUSCH_SysInfoList_SFN_VHCR pusch_SysInfoList_SFN, 
			    PDSCH_SysInfoList_VHCR_r7 pdsch_SysInfoList_SFN, 
			    PRACH_SystemInformationList_VHCR_r7 prach_SystemInformationList)
	    {
		setPusch_SysInfoList_SFN(pusch_SysInfoList_SFN);
		setPdsch_SysInfoList_SFN(pdsch_SysInfoList_SFN);
		setPrach_SystemInformationList(prach_SystemInformationList);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new PUSCH_SysInfoList_SFN_VHCR();
		mComponents[1] = new PDSCH_SysInfoList_VHCR_r7();
		mComponents[2] = new PRACH_SystemInformationList_VHCR_r7();
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
			return new PUSCH_SysInfoList_SFN_VHCR();
		    case 1:
			return new PDSCH_SysInfoList_VHCR_r7();
		    case 2:
			return new PRACH_SystemInformationList_VHCR_r7();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "pusch_SysInfoList_SFN"
	    public PUSCH_SysInfoList_SFN_VHCR getPusch_SysInfoList_SFN()
	    {
		return (PUSCH_SysInfoList_SFN_VHCR)mComponents[0];
	    }
	    
	    public void setPusch_SysInfoList_SFN(PUSCH_SysInfoList_SFN_VHCR pusch_SysInfoList_SFN)
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
	    public PDSCH_SysInfoList_VHCR_r7 getPdsch_SysInfoList_SFN()
	    {
		return (PDSCH_SysInfoList_VHCR_r7)mComponents[1];
	    }
	    
	    public void setPdsch_SysInfoList_SFN(PDSCH_SysInfoList_VHCR_r7 pdsch_SysInfoList_SFN)
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
	    
	    
	    // Methods for field "prach_SystemInformationList"
	    public PRACH_SystemInformationList_VHCR_r7 getPrach_SystemInformationList()
	    {
		return (PRACH_SystemInformationList_VHCR_r7)mComponents[2];
	    }
	    
	    public void setPrach_SystemInformationList(PRACH_SystemInformationList_VHCR_r7 prach_SystemInformationList)
	    {
		mComponents[2] = prach_SystemInformationList;
	    }
	    
	    public boolean hasPrach_SystemInformationList()
	    {
		return componentIsPresent(2);
	    }
	    
	    public void deletePrach_SystemInformationList()
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
		    "SysInfoType5_v770ext_IEs$ModeSpecificInfo$Tdd768"
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
					"PUSCH_SysInfoList_SFN_VHCR"
				    ),
				    new QName (
					"InformationElements",
					"PUSCH-SysInfoList-SFN-VHCR"
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
					    "PUSCH_SysInfoList_SFN_VHCR$Sequence_"
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
					"PDSCH_SysInfoList_VHCR_r7"
				    ),
				    new QName (
					"InformationElements",
					"PDSCH-SysInfoList-VHCR-r7"
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
					    "PDSCH_SysInfo_VHCR_r7"
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
				new ContainerInfo (
				    new Tags (
					new short[] {
					    (short)0x8002
					}
				    ),
				    new QName (
					"rrc.informationelements",
					"PRACH_SystemInformationList_VHCR_r7"
				    ),
				    new QName (
					"InformationElements",
					"PRACH-SystemInformationList-VHCR-r7"
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
					    "PRACH_SystemInformation_VHCR_r7"
					)
				    )
				)
			    ),
			    "prach-SystemInformationList",
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
	     * Get the type descriptor (TypeInfo) of 'this' Tdd768 object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' Tdd768 object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for Tdd768

	// Methods for field "tdd128"
	public static ModeSpecificInfo createModeSpecificInfoWithTdd128(Tdd128 tdd128)
	{
	    ModeSpecificInfo __object = new ModeSpecificInfo();

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
	    public Tdd128(PRACH_SystemInformationList_LCR_v770ext prach_SystemInformationList)
	    {
		setPrach_SystemInformationList(prach_SystemInformationList);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new PRACH_SystemInformationList_LCR_v770ext();
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
			return new PRACH_SystemInformationList_LCR_v770ext();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "prach_SystemInformationList"
	    public PRACH_SystemInformationList_LCR_v770ext getPrach_SystemInformationList()
	    {
		return (PRACH_SystemInformationList_LCR_v770ext)mComponents[0];
	    }
	    
	    public void setPrach_SystemInformationList(PRACH_SystemInformationList_LCR_v770ext prach_SystemInformationList)
	    {
		mComponents[0] = prach_SystemInformationList;
	    }
	    
	    public boolean hasPrach_SystemInformationList()
	    {
		return componentIsPresent(0);
	    }
	    
	    public void deletePrach_SystemInformationList()
	    {
		setComponentAbsent(0);
	    }
	    
	    
	    /**
	     * Initialize the type descriptor.
	     */
	    private static final SequenceInfo c_typeinfo = new SequenceInfo (
		new Tags (
		    new short[] {
			(short)0x8002
		    }
		),
		new QName (
		    "rrc.informationelements",
		    "SysInfoType5_v770ext_IEs$ModeSpecificInfo$Tdd128"
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
					"PRACH_SystemInformationList_LCR_v770ext"
				    ),
				    new QName (
					"InformationElements",
					"PRACH-SystemInformationList-LCR-v770ext"
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
					    "PRACH_SystemInformation_LCR_v770ext"
					)
				    )
				)
			    ),
			    "prach-SystemInformationList",
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
		case fdd_chosen:
		    return new Fdd();
		case tdd768_chosen:
		    return new Tdd768();
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
		    (short)0x8000
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"SysInfoType5_v770ext_IEs$ModeSpecificInfo"
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
				"SysInfoType5_v770ext_IEs$ModeSpecificInfo$Fdd"
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
				"SysInfoType5_v770ext_IEs$ModeSpecificInfo$Tdd768"
			    )
			),
			"tdd768",
			1,
			2
		    ),
		    new FieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.informationelements",
				"SysInfoType5_v770ext_IEs$ModeSpecificInfo$Tdd128"
			    )
			),
			"tdd128",
			2,
			2
		    )
		}
	    ),
	    0,
	    new TagDecoder (
		new TagDecoderElement[] {
		    new TagDecoderElement((short)0x8000, 0),
		    new TagDecoderElement((short)0x8001, 1),
		    new TagDecoderElement((short)0x8002, 2)
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

    // Methods for field "sccpch_SystemInformationList"
    public SCCPCH_SystemInformationList_HCR_VHCR_r7 getSccpch_SystemInformationList()
    {
	return (SCCPCH_SystemInformationList_HCR_VHCR_r7)mComponents[1];
    }
    
    public void setSccpch_SystemInformationList(SCCPCH_SystemInformationList_HCR_VHCR_r7 sccpch_SystemInformationList)
    {
	mComponents[1] = sccpch_SystemInformationList;
    }
    
    public boolean hasSccpch_SystemInformationList()
    {
	return componentIsPresent(1);
    }
    
    public void deleteSccpch_SystemInformationList()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "sccpch_SystemInformation_MBMS"
    public Sccpch_SystemInformation_MBMS getSccpch_SystemInformation_MBMS()
    {
	return (Sccpch_SystemInformation_MBMS)mComponents[2];
    }
    
    public void setSccpch_SystemInformation_MBMS(Sccpch_SystemInformation_MBMS sccpch_SystemInformation_MBMS)
    {
	mComponents[2] = sccpch_SystemInformation_MBMS;
    }
    
    public boolean hasSccpch_SystemInformation_MBMS()
    {
	return componentIsPresent(2);
    }
    
    public void deleteSccpch_SystemInformation_MBMS()
    {
	setComponentAbsent(2);
    }
    
    
    
    /**
     * Define the ASN1 Type Sccpch_SystemInformation_MBMS from ASN1 Module InformationElements.
     * @see Choice
     */
    public static class Sccpch_SystemInformation_MBMS extends Choice {
	
	/**
	 * The default constructor.
	 */
	public Sccpch_SystemInformation_MBMS()
	{
	}
	
	public static final  int  mcchOnSCCPCHusedOnlyForMBMS_chosen = 1;
	
	// Methods for field "mcchOnSCCPCHusedOnlyForMBMS"
	public static Sccpch_SystemInformation_MBMS createSccpch_SystemInformation_MBMSWithMcchOnSCCPCHusedOnlyForMBMS(SCCPCH_SystemInformation_MBMS_r7 mcchOnSCCPCHusedOnlyForMBMS)
	{
	    Sccpch_SystemInformation_MBMS __object = new Sccpch_SystemInformation_MBMS();

	    __object.setMcchOnSCCPCHusedOnlyForMBMS(mcchOnSCCPCHusedOnlyForMBMS);
	    return __object;
	}
	
	public boolean hasMcchOnSCCPCHusedOnlyForMBMS()
	{
	    return getChosenFlag() == mcchOnSCCPCHusedOnlyForMBMS_chosen;
	}
	
	public void setMcchOnSCCPCHusedOnlyForMBMS(SCCPCH_SystemInformation_MBMS_r7 mcchOnSCCPCHusedOnlyForMBMS)
	{
	    setChosenValue(mcchOnSCCPCHusedOnlyForMBMS);
	    setChosenFlag(mcchOnSCCPCHusedOnlyForMBMS_chosen);
	}
	
	
	// Method to create a specific choice instance
	public AbstractData createInstance(int chosen)
	{
	    switch (chosen) {
		case mcchOnSCCPCHusedOnlyForMBMS_chosen:
		    return new SCCPCH_SystemInformation_MBMS_r7();
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
		"SysInfoType5_v770ext_IEs$Sccpch_SystemInformation_MBMS"
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
				    "SCCPCH_SystemInformation_MBMS_r7"
				),
				new QName (
				    "InformationElements",
				    "SCCPCH-SystemInformation-MBMS-r7"
				),
				12314,
				null,
				new FieldsRef (
				    new QName (
					"rrc.informationelements",
					"SCCPCH_SystemInformation_MBMS_r7"
				    )
				),
				0,
				new TagDecodersRef (
				    new QName (
					"rrc.informationelements",
					"SCCPCH_SystemInformation_MBMS_r7"
				    )
				),
				0
			    )
			),
			"mcchOnSCCPCHusedOnlyForMBMS",
			0,
			2
		    )
		}
	    ),
	    0,
	    new TagDecoder (
		new TagDecoderElement[] {
		    new TagDecoderElement((short)0x8000, 0)
		}
	    )
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' Sccpch_SystemInformation_MBMS object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Sccpch_SystemInformation_MBMS object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Sccpch_SystemInformation_MBMS

    // Methods for field "tDD_MBSFNInformation"
    public TDD_MBSFNInformation getTDD_MBSFNInformation()
    {
	return (TDD_MBSFNInformation)mComponents[3];
    }
    
    public void setTDD_MBSFNInformation(TDD_MBSFNInformation tDD_MBSFNInformation)
    {
	mComponents[3] = tDD_MBSFNInformation;
    }
    
    public boolean hasTDD_MBSFNInformation()
    {
	return componentIsPresent(3);
    }
    
    public void deleteTDD_MBSFNInformation()
    {
	setComponentAbsent(3);
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
	    "SysInfoType5_v770ext_IEs"
	),
	new QName (
	    "InformationElements",
	    "SysInfoType5-v770ext-IEs"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "SysInfoType5_v770ext_IEs$ModeSpecificInfo"
			)
		    ),
		    "modeSpecificInfo",
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
				"SCCPCH_SystemInformationList_HCR_VHCR_r7"
			    ),
			    new QName (
				"InformationElements",
				"SCCPCH-SystemInformationList-HCR-VHCR-r7"
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
				    "SCCPCH_SystemInformation_HCR_VHCR_r7"
				)
			    )
			)
		    ),
		    "sccpch-SystemInformationList",
		    1,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "SysInfoType5_v770ext_IEs$Sccpch_SystemInformation_MBMS"
			)
		    ),
		    "sccpch-SystemInformation-MBMS",
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
				"TDD_MBSFNInformation"
			    ),
			    new QName (
				"InformationElements",
				"TDD-MBSFNInformation"
			    ),
			    12314,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new com.oss.asn1.INTEGER(1), 
					new com.oss.asn1.INTEGER(14),
					0
				    )
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(14)
			    ),
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "TDD_MBSFNTSlotInfo"
				)
			    )
			)
		    ),
		    "tDD-MBSFNInformation",
		    3,
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
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3)
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
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' SysInfoType5_v770ext_IEs object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' SysInfoType5_v770ext_IEs object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for SysInfoType5_v770ext_IEs
