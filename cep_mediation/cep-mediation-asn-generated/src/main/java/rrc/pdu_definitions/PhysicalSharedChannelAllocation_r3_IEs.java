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


package rrc.pdu_definitions;

import com.oss.asn1.*;
import com.oss.metadata.*;
import rrc.*;

/**
 * Define the ASN1 Type PhysicalSharedChannelAllocation_r3_IEs from ASN1 Module PDU_definitions.
 * @see Sequence
 */

public class PhysicalSharedChannelAllocation_r3_IEs extends Sequence {
    
    /**
     * The default constructor.
     */
    public PhysicalSharedChannelAllocation_r3_IEs()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public PhysicalSharedChannelAllocation_r3_IEs(rrc.informationelements.DSCH_RNTI dsch_RNTI, 
		    rrc.informationelements.RRC_TransactionIdentifier rrc_TransactionIdentifier, 
		    rrc.informationelements.UL_TimingAdvanceControl ul_TimingAdvance, 
		    rrc.informationelements.PUSCH_CapacityAllocationInfo pusch_CapacityAllocationInfo, 
		    rrc.informationelements.PDSCH_CapacityAllocationInfo pdsch_CapacityAllocationInfo, 
		    ConfirmRequest confirmRequest, 
		    INTEGER trafficVolumeReportRequest, 
		    rrc.informationelements.TimeslotList iscpTimeslotList, 
		    BOOLEAN requestPCCPCHRSCP)
    {
	setDsch_RNTI(dsch_RNTI);
	setRrc_TransactionIdentifier(rrc_TransactionIdentifier);
	setUl_TimingAdvance(ul_TimingAdvance);
	setPusch_CapacityAllocationInfo(pusch_CapacityAllocationInfo);
	setPdsch_CapacityAllocationInfo(pdsch_CapacityAllocationInfo);
	setConfirmRequest(confirmRequest);
	setTrafficVolumeReportRequest(trafficVolumeReportRequest);
	setIscpTimeslotList(iscpTimeslotList);
	setRequestPCCPCHRSCP(requestPCCPCHRSCP);
    }
    
    /**
     * Construct with components.
     */
    public PhysicalSharedChannelAllocation_r3_IEs(rrc.informationelements.DSCH_RNTI dsch_RNTI, 
		    rrc.informationelements.RRC_TransactionIdentifier rrc_TransactionIdentifier, 
		    rrc.informationelements.UL_TimingAdvanceControl ul_TimingAdvance, 
		    rrc.informationelements.PUSCH_CapacityAllocationInfo pusch_CapacityAllocationInfo, 
		    rrc.informationelements.PDSCH_CapacityAllocationInfo pdsch_CapacityAllocationInfo, 
		    ConfirmRequest confirmRequest, 
		    long trafficVolumeReportRequest, 
		    rrc.informationelements.TimeslotList iscpTimeslotList, 
		    boolean requestPCCPCHRSCP)
    {
	this(dsch_RNTI, rrc_TransactionIdentifier, ul_TimingAdvance, 
	     pusch_CapacityAllocationInfo, pdsch_CapacityAllocationInfo, 
	     confirmRequest, new INTEGER(trafficVolumeReportRequest), 
	     iscpTimeslotList, new BOOLEAN(requestPCCPCHRSCP));
    }
    
    /**
     * Construct with required components.
     */
    public PhysicalSharedChannelAllocation_r3_IEs(rrc.informationelements.RRC_TransactionIdentifier rrc_TransactionIdentifier, 
		    boolean requestPCCPCHRSCP)
    {
	setRrc_TransactionIdentifier(rrc_TransactionIdentifier);
	setRequestPCCPCHRSCP(requestPCCPCHRSCP);
    }
    
    public void initComponents()
    {
	mComponents[0] = new rrc.informationelements.DSCH_RNTI();
	mComponents[1] = new rrc.informationelements.RRC_TransactionIdentifier();
	mComponents[2] = new rrc.informationelements.UL_TimingAdvanceControl();
	mComponents[3] = new rrc.informationelements.PUSCH_CapacityAllocationInfo();
	mComponents[4] = new rrc.informationelements.PDSCH_CapacityAllocationInfo();
	mComponents[5] = ConfirmRequest.confirmPDSCH;
	mComponents[6] = new INTEGER();
	mComponents[7] = new rrc.informationelements.TimeslotList();
	mComponents[8] = new BOOLEAN();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[9];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new rrc.informationelements.DSCH_RNTI();
	    case 1:
		return new rrc.informationelements.RRC_TransactionIdentifier();
	    case 2:
		return new rrc.informationelements.UL_TimingAdvanceControl();
	    case 3:
		return new rrc.informationelements.PUSCH_CapacityAllocationInfo();
	    case 4:
		return new rrc.informationelements.PDSCH_CapacityAllocationInfo();
	    case 5:
		return ConfirmRequest.confirmPDSCH;
	    case 6:
		return new INTEGER();
	    case 7:
		return new rrc.informationelements.TimeslotList();
	    case 8:
		return new BOOLEAN();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "dsch_RNTI"
    public rrc.informationelements.DSCH_RNTI getDsch_RNTI()
    {
	return (rrc.informationelements.DSCH_RNTI)mComponents[0];
    }
    
    public void setDsch_RNTI(rrc.informationelements.DSCH_RNTI dsch_RNTI)
    {
	mComponents[0] = dsch_RNTI;
    }
    
    public boolean hasDsch_RNTI()
    {
	return componentIsPresent(0);
    }
    
    public void deleteDsch_RNTI()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "rrc_TransactionIdentifier"
    public rrc.informationelements.RRC_TransactionIdentifier getRrc_TransactionIdentifier()
    {
	return (rrc.informationelements.RRC_TransactionIdentifier)mComponents[1];
    }
    
    public void setRrc_TransactionIdentifier(rrc.informationelements.RRC_TransactionIdentifier rrc_TransactionIdentifier)
    {
	mComponents[1] = rrc_TransactionIdentifier;
    }
    
    
    // Methods for field "ul_TimingAdvance"
    public rrc.informationelements.UL_TimingAdvanceControl getUl_TimingAdvance()
    {
	return (rrc.informationelements.UL_TimingAdvanceControl)mComponents[2];
    }
    
    public void setUl_TimingAdvance(rrc.informationelements.UL_TimingAdvanceControl ul_TimingAdvance)
    {
	mComponents[2] = ul_TimingAdvance;
    }
    
    public boolean hasUl_TimingAdvance()
    {
	return componentIsPresent(2);
    }
    
    public void deleteUl_TimingAdvance()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "pusch_CapacityAllocationInfo"
    public rrc.informationelements.PUSCH_CapacityAllocationInfo getPusch_CapacityAllocationInfo()
    {
	return (rrc.informationelements.PUSCH_CapacityAllocationInfo)mComponents[3];
    }
    
    public void setPusch_CapacityAllocationInfo(rrc.informationelements.PUSCH_CapacityAllocationInfo pusch_CapacityAllocationInfo)
    {
	mComponents[3] = pusch_CapacityAllocationInfo;
    }
    
    public boolean hasPusch_CapacityAllocationInfo()
    {
	return componentIsPresent(3);
    }
    
    public void deletePusch_CapacityAllocationInfo()
    {
	setComponentAbsent(3);
    }
    
    
    // Methods for field "pdsch_CapacityAllocationInfo"
    public rrc.informationelements.PDSCH_CapacityAllocationInfo getPdsch_CapacityAllocationInfo()
    {
	return (rrc.informationelements.PDSCH_CapacityAllocationInfo)mComponents[4];
    }
    
    public void setPdsch_CapacityAllocationInfo(rrc.informationelements.PDSCH_CapacityAllocationInfo pdsch_CapacityAllocationInfo)
    {
	mComponents[4] = pdsch_CapacityAllocationInfo;
    }
    
    public boolean hasPdsch_CapacityAllocationInfo()
    {
	return componentIsPresent(4);
    }
    
    public void deletePdsch_CapacityAllocationInfo()
    {
	setComponentAbsent(4);
    }
    
    
    // Methods for field "confirmRequest"
    public ConfirmRequest getConfirmRequest()
    {
	return (ConfirmRequest)mComponents[5];
    }
    
    public void setConfirmRequest(ConfirmRequest confirmRequest)
    {
	mComponents[5] = confirmRequest;
    }
    
    public boolean hasConfirmRequest()
    {
	return componentIsPresent(5);
    }
    
    public void deleteConfirmRequest()
    {
	setComponentAbsent(5);
    }
    
    
    
    /**
     * Define the ASN1 Type ConfirmRequest from ASN1 Module PDU_definitions.
     * @see Enumerated
     */
    public static final class ConfirmRequest extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private ConfirmRequest()
	{
	    super(cFirstNumber);
	}
	
	protected ConfirmRequest(long value)
	{
	    super(value);
	}
	
	// Named list definitions.
	public static final ConfirmRequest confirmPDSCH =
	    new ConfirmRequest(0);
	public static final ConfirmRequest confirmPUSCH =
	    new ConfirmRequest(1);
	private final static ConfirmRequest cNamedNumbers[] = {
	     confirmPDSCH, 
	     confirmPUSCH
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
	
	public static ConfirmRequest valueOf(long value)
	{
	    return (ConfirmRequest)confirmPDSCH.lookupValue(value);
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final EnumeratedInfo c_typeinfo = new EnumeratedInfo (
	    new Tags (
		new short[] {
		    (short)0x8005
		}
	    ),
	    new QName (
		"rrc.pdu_definitions",
		"PhysicalSharedChannelAllocation_r3_IEs$ConfirmRequest"
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
			"confirmPDSCH",
			0
		    ),
		    new MemberListElement (
			"confirmPUSCH",
			1
		    )
		}
	    ),
	    0,
	    confirmPDSCH
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' ConfirmRequest object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' ConfirmRequest object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for ConfirmRequest

    // Methods for field "trafficVolumeReportRequest"
    public long getTrafficVolumeReportRequest()
    {
	return ((INTEGER)mComponents[6]).longValue();
    }
    
    public void setTrafficVolumeReportRequest(long trafficVolumeReportRequest)
    {
	setTrafficVolumeReportRequest(new INTEGER(trafficVolumeReportRequest));
    }
    
    public void setTrafficVolumeReportRequest(INTEGER trafficVolumeReportRequest)
    {
	mComponents[6] = trafficVolumeReportRequest;
    }
    
    public boolean hasTrafficVolumeReportRequest()
    {
	return componentIsPresent(6);
    }
    
    public void deleteTrafficVolumeReportRequest()
    {
	setComponentAbsent(6);
    }
    
    
    // Methods for field "iscpTimeslotList"
    public rrc.informationelements.TimeslotList getIscpTimeslotList()
    {
	return (rrc.informationelements.TimeslotList)mComponents[7];
    }
    
    public void setIscpTimeslotList(rrc.informationelements.TimeslotList iscpTimeslotList)
    {
	mComponents[7] = iscpTimeslotList;
    }
    
    public boolean hasIscpTimeslotList()
    {
	return componentIsPresent(7);
    }
    
    public void deleteIscpTimeslotList()
    {
	setComponentAbsent(7);
    }
    
    
    // Methods for field "requestPCCPCHRSCP"
    public boolean getRequestPCCPCHRSCP()
    {
	return ((BOOLEAN)mComponents[8]).booleanValue();
    }
    
    public void setRequestPCCPCHRSCP(boolean requestPCCPCHRSCP)
    {
	setRequestPCCPCHRSCP(new BOOLEAN(requestPCCPCHRSCP));
    }
    
    public void setRequestPCCPCHRSCP(BOOLEAN requestPCCPCHRSCP)
    {
	mComponents[8] = requestPCCPCHRSCP;
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
	    "rrc.pdu_definitions",
	    "PhysicalSharedChannelAllocation_r3_IEs"
	),
	new QName (
	    "PDU-definitions",
	    "PhysicalSharedChannelAllocation-r3-IEs"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"DSCH_RNTI"
			    ),
			    new QName (
				"InformationElements",
				"DSCH-RNTI"
			    ),
			    12314,
			    new SizeConstraint (
				new SingleValueConstraint (
				    new com.oss.asn1.INTEGER(16)
				)
			    ),
			    new Bounds (
				new java.lang.Long(16),
				new java.lang.Long(16)
			    ),
			    null
			)
		    ),
		    "dsch-RNTI",
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
				"RRC_TransactionIdentifier"
			    ),
			    new QName (
				"InformationElements",
				"RRC-TransactionIdentifier"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new rrc.informationelements.RRC_TransactionIdentifier(0), 
				    new rrc.informationelements.RRC_TransactionIdentifier(3),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(3)
			    ),
			    null
			)
		    ),
		    "rrc-TransactionIdentifier",
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
				"UL_TimingAdvanceControl"
			    ),
			    new QName (
				"InformationElements",
				"UL-TimingAdvanceControl"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UL_TimingAdvanceControl"
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
		    "ul-TimingAdvance",
		    2,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"PUSCH_CapacityAllocationInfo"
			    ),
			    new QName (
				"InformationElements",
				"PUSCH-CapacityAllocationInfo"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "PUSCH_CapacityAllocationInfo"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "PUSCH_CapacityAllocationInfo"
				)
			    ),
			    0
			)
		    ),
		    "pusch-CapacityAllocationInfo",
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
				"PDSCH_CapacityAllocationInfo"
			    ),
			    new QName (
				"InformationElements",
				"PDSCH-CapacityAllocationInfo"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "PDSCH_CapacityAllocationInfo"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "PDSCH_CapacityAllocationInfo"
				)
			    ),
			    0
			)
		    ),
		    "pdsch-CapacityAllocationInfo",
		    4,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.pdu_definitions",
			    "PhysicalSharedChannelAllocation_r3_IEs$ConfirmRequest"
			)
		    ),
		    "confirmRequest",
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
				"com.oss.asn1",
				"INTEGER"
			    ),
			    new QName (
				"builtin",
				"INTEGER"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new com.oss.asn1.INTEGER(0), 
				    new com.oss.asn1.INTEGER(255),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(255)
			    ),
			    null
			)
		    ),
		    "trafficVolumeReportRequest",
		    6,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8007
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"TimeslotList"
			    ),
			    new QName (
				"InformationElements",
				"TimeslotList"
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
				    "TimeslotNumber"
				)
			    )
			)
		    ),
		    "iscpTimeslotList",
		    7,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8008
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
		    "requestPCCPCHRSCP",
		    8,
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
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6),
			new TagDecoderElement((short)0x8007, 7),
			new TagDecoderElement((short)0x8008, 8)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6),
			new TagDecoderElement((short)0x8007, 7),
			new TagDecoderElement((short)0x8008, 8)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6),
			new TagDecoderElement((short)0x8007, 7),
			new TagDecoderElement((short)0x8008, 8)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6),
			new TagDecoderElement((short)0x8007, 7),
			new TagDecoderElement((short)0x8008, 8)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8006, 6),
			new TagDecoderElement((short)0x8007, 7),
			new TagDecoderElement((short)0x8008, 8)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8007, 7),
			new TagDecoderElement((short)0x8008, 8)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8008, 8)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' PhysicalSharedChannelAllocation_r3_IEs object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' PhysicalSharedChannelAllocation_r3_IEs object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for PhysicalSharedChannelAllocation_r3_IEs
