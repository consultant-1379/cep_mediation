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


package rrc.internode_definitions;

import com.oss.asn1.*;
import com.oss.metadata.*;
import rrc.*;

/**
 * Define the ASN1 Type SRNC_RelocationInfo_v690ext_IEs from ASN1 Module Internode_definitions.
 * @see Sequence
 */

public class SRNC_RelocationInfo_v690ext_IEs extends Sequence {
    
    /**
     * The default constructor.
     */
    public SRNC_RelocationInfo_v690ext_IEs()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public SRNC_RelocationInfo_v690ext_IEs(UeCapabilityContainer ueCapabilityContainer, 
		    UeCapabilityContainer_RSC ueCapabilityContainer_RSC, 
		    UeCapabilityContainer_UCI ueCapabilityContainer_UCI, 
		    rrc.informationelements.RAB_InformationSetupList_r6_ext rab_InformationSetupList, 
		    rrc.informationelements.MeasuredResultsOnRACHinterFreq measuredResultsOnRACHinterFreq, 
		    rrc.informationelements.MBMS_JoinedInformation_r6 mbms_JoinedInformation, 
		    IntraFreqReportingCriteria_r6_ext intraFreqReportingCriteria)
    {
	setUeCapabilityContainer(ueCapabilityContainer);
	setUeCapabilityContainer_RSC(ueCapabilityContainer_RSC);
	setUeCapabilityContainer_UCI(ueCapabilityContainer_UCI);
	setRab_InformationSetupList(rab_InformationSetupList);
	setMeasuredResultsOnRACHinterFreq(measuredResultsOnRACHinterFreq);
	setMbms_JoinedInformation(mbms_JoinedInformation);
	setIntraFreqReportingCriteria(intraFreqReportingCriteria);
    }
    
    public void initComponents()
    {
	mComponents[0] = new UeCapabilityContainer();
	mComponents[1] = new UeCapabilityContainer_RSC();
	mComponents[2] = new UeCapabilityContainer_UCI();
	mComponents[3] = new rrc.informationelements.RAB_InformationSetupList_r6_ext();
	mComponents[4] = new rrc.informationelements.MeasuredResultsOnRACHinterFreq();
	mComponents[5] = new rrc.informationelements.MBMS_JoinedInformation_r6();
	mComponents[6] = new IntraFreqReportingCriteria_r6_ext();
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
		return new UeCapabilityContainer();
	    case 1:
		return new UeCapabilityContainer_RSC();
	    case 2:
		return new UeCapabilityContainer_UCI();
	    case 3:
		return new rrc.informationelements.RAB_InformationSetupList_r6_ext();
	    case 4:
		return new rrc.informationelements.MeasuredResultsOnRACHinterFreq();
	    case 5:
		return new rrc.informationelements.MBMS_JoinedInformation_r6();
	    case 6:
		return new IntraFreqReportingCriteria_r6_ext();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "ueCapabilityContainer"
    public UeCapabilityContainer getUeCapabilityContainer()
    {
	return (UeCapabilityContainer)mComponents[0];
    }
    
    public void setUeCapabilityContainer(UeCapabilityContainer ueCapabilityContainer)
    {
	mComponents[0] = ueCapabilityContainer;
    }
    
    public boolean hasUeCapabilityContainer()
    {
	return componentIsPresent(0);
    }
    
    public void deleteUeCapabilityContainer()
    {
	setComponentAbsent(0);
    }
    
    
    
    /**
     * Define the ASN1 Type UeCapabilityContainer from ASN1 Module Internode_definitions.
     * @see ContainingBitString
     */
    public static class UeCapabilityContainer extends ContainingBitString {
	
	/**
	 * The default constructor.
	 */
	public UeCapabilityContainer()
	{
	}
	
	/**
	 * Construct Bit String from a byte array.
	 * All bits considered significant.
	 * @param value the byte array to set this object to.
	 */
	public UeCapabilityContainer(byte[] value)
	{
	    super(value);
	}
	
	
	/**
	 * Construct Bit String from a byte array and significant bits.
	 * @param value the byte array to set this object to.
	 * @param sigBits the number of significant bits.
	 */
	public UeCapabilityContainer(byte[] value, int sigBits)
	{
	    super(value, sigBits);
	}
	
	/**
	 * Construct from a contained type value.
	 */
	public UeCapabilityContainer(rrc.informationelements.UE_CapabilityContainer_IEs decoded)
	{
	    super(decoded);
	}
	
	// Methods for getting and setting a contained value
	public rrc.informationelements.UE_CapabilityContainer_IEs getContainedValue()
	{
	    return (rrc.informationelements.UE_CapabilityContainer_IEs)getDecodedValue();
	}
	
	public void setContainedValue(rrc.informationelements.UE_CapabilityContainer_IEs value)
	{
	    setDecodedValue(value);
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final ContainingBitStringInfo c_typeinfo = new ContainingBitStringInfo (
	    new Tags (
		new short[] {
		    (short)0x8000
		}
	    ),
	    new QName (
		"rrc.internode_definitions",
		"SRNC_RelocationInfo_v690ext_IEs$UeCapabilityContainer"
	    ),
	    new QName (
		"builtin",
		"BIT STRING"
	    ),
	    12314,
	    null,
	    null,
	    null,
	    new TypeInfoRef (
		new QName (
		    "rrc.informationelements",
		    "UE_CapabilityContainer_IEs"
		)
	    ),
	    null
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' UeCapabilityContainer object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' UeCapabilityContainer object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for UeCapabilityContainer

    // Methods for field "ueCapabilityContainer_RSC"
    public UeCapabilityContainer_RSC getUeCapabilityContainer_RSC()
    {
	return (UeCapabilityContainer_RSC)mComponents[1];
    }
    
    public void setUeCapabilityContainer_RSC(UeCapabilityContainer_RSC ueCapabilityContainer_RSC)
    {
	mComponents[1] = ueCapabilityContainer_RSC;
    }
    
    public boolean hasUeCapabilityContainer_RSC()
    {
	return componentIsPresent(1);
    }
    
    public void deleteUeCapabilityContainer_RSC()
    {
	setComponentAbsent(1);
    }
    
    
    
    /**
     * Define the ASN1 Type UeCapabilityContainer_RSC from ASN1 Module Internode_definitions.
     * @see ContainingBitString
     */
    public static class UeCapabilityContainer_RSC extends ContainingBitString {
	
	/**
	 * The default constructor.
	 */
	public UeCapabilityContainer_RSC()
	{
	}
	
	/**
	 * Construct Bit String from a byte array.
	 * All bits considered significant.
	 * @param value the byte array to set this object to.
	 */
	public UeCapabilityContainer_RSC(byte[] value)
	{
	    super(value);
	}
	
	
	/**
	 * Construct Bit String from a byte array and significant bits.
	 * @param value the byte array to set this object to.
	 * @param sigBits the number of significant bits.
	 */
	public UeCapabilityContainer_RSC(byte[] value, int sigBits)
	{
	    super(value, sigBits);
	}
	
	/**
	 * Construct from a contained type value.
	 */
	public UeCapabilityContainer_RSC(rrc.pdu_definitions.RRCConnectionSetupComplete_r3_add_ext_IEs decoded)
	{
	    super(decoded);
	}
	
	// Methods for getting and setting a contained value
	public rrc.pdu_definitions.RRCConnectionSetupComplete_r3_add_ext_IEs getContainedValue()
	{
	    return (rrc.pdu_definitions.RRCConnectionSetupComplete_r3_add_ext_IEs)getDecodedValue();
	}
	
	public void setContainedValue(rrc.pdu_definitions.RRCConnectionSetupComplete_r3_add_ext_IEs value)
	{
	    setDecodedValue(value);
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final ContainingBitStringInfo c_typeinfo = new ContainingBitStringInfo (
	    new Tags (
		new short[] {
		    (short)0x8001
		}
	    ),
	    new QName (
		"rrc.internode_definitions",
		"SRNC_RelocationInfo_v690ext_IEs$UeCapabilityContainer_RSC"
	    ),
	    new QName (
		"builtin",
		"BIT STRING"
	    ),
	    12314,
	    null,
	    null,
	    null,
	    new TypeInfoRef (
		new QName (
		    "rrc.pdu_definitions",
		    "RRCConnectionSetupComplete_r3_add_ext_IEs"
		)
	    ),
	    null
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' UeCapabilityContainer_RSC object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' UeCapabilityContainer_RSC object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for UeCapabilityContainer_RSC

    // Methods for field "ueCapabilityContainer_UCI"
    public UeCapabilityContainer_UCI getUeCapabilityContainer_UCI()
    {
	return (UeCapabilityContainer_UCI)mComponents[2];
    }
    
    public void setUeCapabilityContainer_UCI(UeCapabilityContainer_UCI ueCapabilityContainer_UCI)
    {
	mComponents[2] = ueCapabilityContainer_UCI;
    }
    
    public boolean hasUeCapabilityContainer_UCI()
    {
	return componentIsPresent(2);
    }
    
    public void deleteUeCapabilityContainer_UCI()
    {
	setComponentAbsent(2);
    }
    
    
    
    /**
     * Define the ASN1 Type UeCapabilityContainer_UCI from ASN1 Module Internode_definitions.
     * @see ContainingBitString
     */
    public static class UeCapabilityContainer_UCI extends ContainingBitString {
	
	/**
	 * The default constructor.
	 */
	public UeCapabilityContainer_UCI()
	{
	}
	
	/**
	 * Construct Bit String from a byte array.
	 * All bits considered significant.
	 * @param value the byte array to set this object to.
	 */
	public UeCapabilityContainer_UCI(byte[] value)
	{
	    super(value);
	}
	
	
	/**
	 * Construct Bit String from a byte array and significant bits.
	 * @param value the byte array to set this object to.
	 * @param sigBits the number of significant bits.
	 */
	public UeCapabilityContainer_UCI(byte[] value, int sigBits)
	{
	    super(value, sigBits);
	}
	
	/**
	 * Construct from a contained type value.
	 */
	public UeCapabilityContainer_UCI(rrc.pdu_definitions.UECapabilityInformation_r3_add_ext_IEs decoded)
	{
	    super(decoded);
	}
	
	// Methods for getting and setting a contained value
	public rrc.pdu_definitions.UECapabilityInformation_r3_add_ext_IEs getContainedValue()
	{
	    return (rrc.pdu_definitions.UECapabilityInformation_r3_add_ext_IEs)getDecodedValue();
	}
	
	public void setContainedValue(rrc.pdu_definitions.UECapabilityInformation_r3_add_ext_IEs value)
	{
	    setDecodedValue(value);
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final ContainingBitStringInfo c_typeinfo = new ContainingBitStringInfo (
	    new Tags (
		new short[] {
		    (short)0x8002
		}
	    ),
	    new QName (
		"rrc.internode_definitions",
		"SRNC_RelocationInfo_v690ext_IEs$UeCapabilityContainer_UCI"
	    ),
	    new QName (
		"builtin",
		"BIT STRING"
	    ),
	    12314,
	    null,
	    null,
	    null,
	    new TypeInfoRef (
		new QName (
		    "rrc.pdu_definitions",
		    "UECapabilityInformation_r3_add_ext_IEs"
		)
	    ),
	    null
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' UeCapabilityContainer_UCI object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' UeCapabilityContainer_UCI object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for UeCapabilityContainer_UCI

    // Methods for field "rab_InformationSetupList"
    public rrc.informationelements.RAB_InformationSetupList_r6_ext getRab_InformationSetupList()
    {
	return (rrc.informationelements.RAB_InformationSetupList_r6_ext)mComponents[3];
    }
    
    public void setRab_InformationSetupList(rrc.informationelements.RAB_InformationSetupList_r6_ext rab_InformationSetupList)
    {
	mComponents[3] = rab_InformationSetupList;
    }
    
    public boolean hasRab_InformationSetupList()
    {
	return componentIsPresent(3);
    }
    
    public void deleteRab_InformationSetupList()
    {
	setComponentAbsent(3);
    }
    
    
    // Methods for field "measuredResultsOnRACHinterFreq"
    public rrc.informationelements.MeasuredResultsOnRACHinterFreq getMeasuredResultsOnRACHinterFreq()
    {
	return (rrc.informationelements.MeasuredResultsOnRACHinterFreq)mComponents[4];
    }
    
    public void setMeasuredResultsOnRACHinterFreq(rrc.informationelements.MeasuredResultsOnRACHinterFreq measuredResultsOnRACHinterFreq)
    {
	mComponents[4] = measuredResultsOnRACHinterFreq;
    }
    
    public boolean hasMeasuredResultsOnRACHinterFreq()
    {
	return componentIsPresent(4);
    }
    
    public void deleteMeasuredResultsOnRACHinterFreq()
    {
	setComponentAbsent(4);
    }
    
    
    // Methods for field "mbms_JoinedInformation"
    public rrc.informationelements.MBMS_JoinedInformation_r6 getMbms_JoinedInformation()
    {
	return (rrc.informationelements.MBMS_JoinedInformation_r6)mComponents[5];
    }
    
    public void setMbms_JoinedInformation(rrc.informationelements.MBMS_JoinedInformation_r6 mbms_JoinedInformation)
    {
	mComponents[5] = mbms_JoinedInformation;
    }
    
    public boolean hasMbms_JoinedInformation()
    {
	return componentIsPresent(5);
    }
    
    public void deleteMbms_JoinedInformation()
    {
	setComponentAbsent(5);
    }
    
    
    // Methods for field "intraFreqReportingCriteria"
    public IntraFreqReportingCriteria_r6_ext getIntraFreqReportingCriteria()
    {
	return (IntraFreqReportingCriteria_r6_ext)mComponents[6];
    }
    
    public void setIntraFreqReportingCriteria(IntraFreqReportingCriteria_r6_ext intraFreqReportingCriteria)
    {
	mComponents[6] = intraFreqReportingCriteria;
    }
    
    public boolean hasIntraFreqReportingCriteria()
    {
	return componentIsPresent(6);
    }
    
    public void deleteIntraFreqReportingCriteria()
    {
	setComponentAbsent(6);
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
	    "rrc.internode_definitions",
	    "SRNC_RelocationInfo_v690ext_IEs"
	),
	new QName (
	    "Internode-definitions",
	    "SRNC-RelocationInfo-v690ext-IEs"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.internode_definitions",
			    "SRNC_RelocationInfo_v690ext_IEs$UeCapabilityContainer"
			)
		    ),
		    "ueCapabilityContainer",
		    0,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.internode_definitions",
			    "SRNC_RelocationInfo_v690ext_IEs$UeCapabilityContainer_RSC"
			)
		    ),
		    "ueCapabilityContainer-RSC",
		    1,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.internode_definitions",
			    "SRNC_RelocationInfo_v690ext_IEs$UeCapabilityContainer_UCI"
			)
		    ),
		    "ueCapabilityContainer-UCI",
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
				"RAB_InformationSetupList_r6_ext"
			    ),
			    new QName (
				"InformationElements",
				"RAB-InformationSetupList-r6-ext"
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
				    "RAB_InformationSetup_r6_ext"
				)
			    )
			)
		    ),
		    "rab-InformationSetupList",
		    3,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8004
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"MeasuredResultsOnRACHinterFreq"
			    ),
			    new QName (
				"InformationElements",
				"MeasuredResultsOnRACHinterFreq"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "MeasuredResultsOnRACHinterFreq"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "MeasuredResultsOnRACHinterFreq"
				)
			    ),
			    0
			)
		    ),
		    "measuredResultsOnRACHinterFreq",
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
				"MBMS_JoinedInformation_r6"
			    ),
			    new QName (
				"InformationElements",
				"MBMS-JoinedInformation-r6"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "MBMS_JoinedInformation_r6"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "MBMS_JoinedInformation_r6"
				)
			    ),
			    0
			)
		    ),
		    "mbms-JoinedInformation",
		    5,
		    3,
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
				"rrc.internode_definitions",
				"IntraFreqReportingCriteria_r6_ext"
			    ),
			    new QName (
				"Internode-definitions",
				"IntraFreqReportingCriteria-r6-ext"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.internode_definitions",
				    "IntraFreqReportingCriteria_r6_ext"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.internode_definitions",
				    "IntraFreqReportingCriteria_r6_ext"
				)
			    ),
			    0
			)
		    ),
		    "intraFreqReportingCriteria",
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
			new TagDecoderElement((short)0x8000, 0),
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6)
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
     * Get the type descriptor (TypeInfo) of 'this' SRNC_RelocationInfo_v690ext_IEs object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' SRNC_RelocationInfo_v690ext_IEs object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for SRNC_RelocationInfo_v690ext_IEs
