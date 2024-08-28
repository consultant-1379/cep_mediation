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
 * Define the ASN1 Type SysInfoType5_v690ext_IEs from ASN1 Module InformationElements.
 * @see Sequence
 */

public class SysInfoType5_v690ext_IEs extends Sequence {
    
    /**
     * The default constructor.
     */
    public SysInfoType5_v690ext_IEs()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public SysInfoType5_v690ext_IEs(Edch_CellIndicator edch_CellIndicator, 
		    Sccpch_SystemInformation_MBMS sccpch_SystemInformation_MBMS, 
		    AdditionalPRACH_TF_and_TFCS_CCCH_List additionalPRACH_TF_and_TFCS_CCCH_List, 
		    CBS_DRX_Level1Information_extension_r6 cBS_DRX_Level1Information_extension)
    {
	setEdch_CellIndicator(edch_CellIndicator);
	setSccpch_SystemInformation_MBMS(sccpch_SystemInformation_MBMS);
	setAdditionalPRACH_TF_and_TFCS_CCCH_List(additionalPRACH_TF_and_TFCS_CCCH_List);
	setCBS_DRX_Level1Information_extension(cBS_DRX_Level1Information_extension);
    }
    
    public void initComponents()
    {
	mComponents[0] = Edch_CellIndicator.edch_CapableCell;
	mComponents[1] = new Sccpch_SystemInformation_MBMS();
	mComponents[2] = new AdditionalPRACH_TF_and_TFCS_CCCH_List();
	mComponents[3] = CBS_DRX_Level1Information_extension_r6.p8;
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
		return Edch_CellIndicator.edch_CapableCell;
	    case 1:
		return new Sccpch_SystemInformation_MBMS();
	    case 2:
		return new AdditionalPRACH_TF_and_TFCS_CCCH_List();
	    case 3:
		return CBS_DRX_Level1Information_extension_r6.p8;
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "edch_CellIndicator"
    public Edch_CellIndicator getEdch_CellIndicator()
    {
	return (Edch_CellIndicator)mComponents[0];
    }
    
    public void setEdch_CellIndicator(Edch_CellIndicator edch_CellIndicator)
    {
	mComponents[0] = edch_CellIndicator;
    }
    
    public boolean hasEdch_CellIndicator()
    {
	return componentIsPresent(0);
    }
    
    public void deleteEdch_CellIndicator()
    {
	setComponentAbsent(0);
    }
    
    
    
    /**
     * Define the ASN1 Type Edch_CellIndicator from ASN1 Module InformationElements.
     * @see Enumerated
     */
    public static final class Edch_CellIndicator extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private Edch_CellIndicator()
	{
	    super(cFirstNumber);
	}
	
	protected Edch_CellIndicator(long value)
	{
	    super(value);
	}
	
	// Named list definitions.
	public static final Edch_CellIndicator edch_CapableCell =
	    new Edch_CellIndicator(0);
	private final static Edch_CellIndicator cNamedNumbers[] = {
	     edch_CapableCell
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
	
	public static Edch_CellIndicator valueOf(long value)
	{
	    return (Edch_CellIndicator)edch_CapableCell.lookupValue(value);
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
		"SysInfoType5_v690ext_IEs$Edch_CellIndicator"
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
			"edch-CapableCell",
			0
		    )
		}
	    ),
	    0,
	    edch_CapableCell
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' Edch_CellIndicator object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Edch_CellIndicator object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Edch_CellIndicator

    // Methods for field "sccpch_SystemInformation_MBMS"
    public Sccpch_SystemInformation_MBMS getSccpch_SystemInformation_MBMS()
    {
	return (Sccpch_SystemInformation_MBMS)mComponents[1];
    }
    
    public void setSccpch_SystemInformation_MBMS(Sccpch_SystemInformation_MBMS sccpch_SystemInformation_MBMS)
    {
	mComponents[1] = sccpch_SystemInformation_MBMS;
    }
    
    public boolean hasSccpch_SystemInformation_MBMS()
    {
	return componentIsPresent(1);
    }
    
    public void deleteSccpch_SystemInformation_MBMS()
    {
	setComponentAbsent(1);
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
	
	public static final  int  mcchOnSCCPCHusedForNonMBMS_chosen = 1;
	public static final  int  mcchOnSCCPCHusedOnlyForMBMS_chosen = 2;
	
	// Methods for field "mcchOnSCCPCHusedForNonMBMS"
	public static Sccpch_SystemInformation_MBMS createSccpch_SystemInformation_MBMSWithMcchOnSCCPCHusedForNonMBMS(MBMS_MCCH_ConfigurationInfo_r6 mcchOnSCCPCHusedForNonMBMS)
	{
	    Sccpch_SystemInformation_MBMS __object = new Sccpch_SystemInformation_MBMS();

	    __object.setMcchOnSCCPCHusedForNonMBMS(mcchOnSCCPCHusedForNonMBMS);
	    return __object;
	}
	
	public boolean hasMcchOnSCCPCHusedForNonMBMS()
	{
	    return getChosenFlag() == mcchOnSCCPCHusedForNonMBMS_chosen;
	}
	
	public void setMcchOnSCCPCHusedForNonMBMS(MBMS_MCCH_ConfigurationInfo_r6 mcchOnSCCPCHusedForNonMBMS)
	{
	    setChosenValue(mcchOnSCCPCHusedForNonMBMS);
	    setChosenFlag(mcchOnSCCPCHusedForNonMBMS_chosen);
	}
	
	
	// Methods for field "mcchOnSCCPCHusedOnlyForMBMS"
	public static Sccpch_SystemInformation_MBMS createSccpch_SystemInformation_MBMSWithMcchOnSCCPCHusedOnlyForMBMS(SCCPCH_SystemInformation_MBMS_r6 mcchOnSCCPCHusedOnlyForMBMS)
	{
	    Sccpch_SystemInformation_MBMS __object = new Sccpch_SystemInformation_MBMS();

	    __object.setMcchOnSCCPCHusedOnlyForMBMS(mcchOnSCCPCHusedOnlyForMBMS);
	    return __object;
	}
	
	public boolean hasMcchOnSCCPCHusedOnlyForMBMS()
	{
	    return getChosenFlag() == mcchOnSCCPCHusedOnlyForMBMS_chosen;
	}
	
	public void setMcchOnSCCPCHusedOnlyForMBMS(SCCPCH_SystemInformation_MBMS_r6 mcchOnSCCPCHusedOnlyForMBMS)
	{
	    setChosenValue(mcchOnSCCPCHusedOnlyForMBMS);
	    setChosenFlag(mcchOnSCCPCHusedOnlyForMBMS_chosen);
	}
	
	
	// Method to create a specific choice instance
	public AbstractData createInstance(int chosen)
	{
	    switch (chosen) {
		case mcchOnSCCPCHusedForNonMBMS_chosen:
		    return new MBMS_MCCH_ConfigurationInfo_r6();
		case mcchOnSCCPCHusedOnlyForMBMS_chosen:
		    return new SCCPCH_SystemInformation_MBMS_r6();
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
		"SysInfoType5_v690ext_IEs$Sccpch_SystemInformation_MBMS"
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
				    "MBMS_MCCH_ConfigurationInfo_r6"
				),
				new QName (
				    "InformationElements",
				    "MBMS-MCCH-ConfigurationInfo-r6"
				),
				12314,
				null,
				new FieldsRef (
				    new QName (
					"rrc.informationelements",
					"MBMS_MCCH_ConfigurationInfo_r6"
				    )
				),
				0,
				new TagDecodersRef (
				    new QName (
					"rrc.informationelements",
					"MBMS_MCCH_ConfigurationInfo_r6"
				    )
				),
				0
			    )
			),
			"mcchOnSCCPCHusedForNonMBMS",
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
				    "SCCPCH_SystemInformation_MBMS_r6"
				),
				new QName (
				    "InformationElements",
				    "SCCPCH-SystemInformation-MBMS-r6"
				),
				12314,
				null,
				new FieldsRef (
				    new QName (
					"rrc.informationelements",
					"SCCPCH_SystemInformation_MBMS_r6"
				    )
				),
				0,
				new TagDecodersRef (
				    new QName (
					"rrc.informationelements",
					"SCCPCH_SystemInformation_MBMS_r6"
				    )
				),
				0
			    )
			),
			"mcchOnSCCPCHusedOnlyForMBMS",
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

    // Methods for field "additionalPRACH_TF_and_TFCS_CCCH_List"
    public AdditionalPRACH_TF_and_TFCS_CCCH_List getAdditionalPRACH_TF_and_TFCS_CCCH_List()
    {
	return (AdditionalPRACH_TF_and_TFCS_CCCH_List)mComponents[2];
    }
    
    public void setAdditionalPRACH_TF_and_TFCS_CCCH_List(AdditionalPRACH_TF_and_TFCS_CCCH_List additionalPRACH_TF_and_TFCS_CCCH_List)
    {
	mComponents[2] = additionalPRACH_TF_and_TFCS_CCCH_List;
    }
    
    public boolean hasAdditionalPRACH_TF_and_TFCS_CCCH_List()
    {
	return componentIsPresent(2);
    }
    
    public void deleteAdditionalPRACH_TF_and_TFCS_CCCH_List()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "cBS_DRX_Level1Information_extension"
    public CBS_DRX_Level1Information_extension_r6 getCBS_DRX_Level1Information_extension()
    {
	return (CBS_DRX_Level1Information_extension_r6)mComponents[3];
    }
    
    public void setCBS_DRX_Level1Information_extension(CBS_DRX_Level1Information_extension_r6 cBS_DRX_Level1Information_extension)
    {
	mComponents[3] = cBS_DRX_Level1Information_extension;
    }
    
    public boolean hasCBS_DRX_Level1Information_extension()
    {
	return componentIsPresent(3);
    }
    
    public void deleteCBS_DRX_Level1Information_extension()
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
	    "SysInfoType5_v690ext_IEs"
	),
	new QName (
	    "InformationElements",
	    "SysInfoType5-v690ext-IEs"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "SysInfoType5_v690ext_IEs$Edch_CellIndicator"
			)
		    ),
		    "edch-CellIndicator",
		    0,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "SysInfoType5_v690ext_IEs$Sccpch_SystemInformation_MBMS"
			)
		    ),
		    "sccpch-SystemInformation-MBMS",
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
				"AdditionalPRACH_TF_and_TFCS_CCCH_List"
			    ),
			    new QName (
				"InformationElements",
				"AdditionalPRACH-TF-and-TFCS-CCCH-List"
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
				    "AdditionalPRACH_TF_and_TFCS_CCCH"
				)
			    )
			)
		    ),
		    "additionalPRACH-TF-and-TFCS-CCCH-List",
		    2,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"CBS_DRX_Level1Information_extension_r6"
			    ),
			    new QName (
				"InformationElements",
				"CBS-DRX-Level1Information-extension-r6"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"p8",
					0
				    ),
				    new MemberListElement (
					"p16",
					1
				    ),
				    new MemberListElement (
					"p32",
					2
				    ),
				    new MemberListElement (
					"p64",
					3
				    ),
				    new MemberListElement (
					"p128",
					4
				    ),
				    new MemberListElement (
					"p256",
					5
				    )
				}
			    ),
			    0,
			    CBS_DRX_Level1Information_extension_r6.p8
			)
		    ),
		    "cBS-DRX-Level1Information-extension",
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
     * Get the type descriptor (TypeInfo) of 'this' SysInfoType5_v690ext_IEs object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' SysInfoType5_v690ext_IEs object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for SysInfoType5_v690ext_IEs
