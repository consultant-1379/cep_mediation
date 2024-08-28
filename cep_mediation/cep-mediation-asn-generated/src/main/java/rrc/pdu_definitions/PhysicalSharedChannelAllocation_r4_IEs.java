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
 * Define the ASN1 Type PhysicalSharedChannelAllocation_r4_IEs from ASN1 Module PDU_definitions.
 * @see Sequence
 */

public class PhysicalSharedChannelAllocation_r4_IEs extends Sequence {
    
    /**
     * The default constructor.
     */
    public PhysicalSharedChannelAllocation_r4_IEs()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public PhysicalSharedChannelAllocation_r4_IEs(rrc.informationelements.UL_TimingAdvanceControl_r4 ul_TimingAdvance, 
		    rrc.informationelements.PUSCH_CapacityAllocationInfo_r4 pusch_CapacityAllocationInfo, 
		    rrc.informationelements.PDSCH_CapacityAllocationInfo_r4 pdsch_CapacityAllocationInfo, 
		    ConfirmRequest confirmRequest, 
		    INTEGER trafficVolumeReportRequest, 
		    rrc.informationelements.TimeslotList_r4 iscpTimeslotList, 
		    BOOLEAN requestPCCPCHRSCP)
    {
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
    public PhysicalSharedChannelAllocation_r4_IEs(rrc.informationelements.UL_TimingAdvanceControl_r4 ul_TimingAdvance, 
		    rrc.informationelements.PUSCH_CapacityAllocationInfo_r4 pusch_CapacityAllocationInfo, 
		    rrc.informationelements.PDSCH_CapacityAllocationInfo_r4 pdsch_CapacityAllocationInfo, 
		    ConfirmRequest confirmRequest, 
		    long trafficVolumeReportRequest, 
		    rrc.informationelements.TimeslotList_r4 iscpTimeslotList, 
		    boolean requestPCCPCHRSCP)
    {
	this(ul_TimingAdvance, pusch_CapacityAllocationInfo, 
	     pdsch_CapacityAllocationInfo, confirmRequest, 
	     new INTEGER(trafficVolumeReportRequest), iscpTimeslotList, 
	     new BOOLEAN(requestPCCPCHRSCP));
    }
    
    /**
     * Construct with required components.
     */
    public PhysicalSharedChannelAllocation_r4_IEs(boolean requestPCCPCHRSCP)
    {
	setRequestPCCPCHRSCP(requestPCCPCHRSCP);
    }
    
    public void initComponents()
    {
	mComponents[0] = new rrc.informationelements.UL_TimingAdvanceControl_r4();
	mComponents[1] = new rrc.informationelements.PUSCH_CapacityAllocationInfo_r4();
	mComponents[2] = new rrc.informationelements.PDSCH_CapacityAllocationInfo_r4();
	mComponents[3] = ConfirmRequest.confirmPDSCH;
	mComponents[4] = new INTEGER();
	mComponents[5] = new rrc.informationelements.TimeslotList_r4();
	mComponents[6] = new BOOLEAN();
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
		return new rrc.informationelements.UL_TimingAdvanceControl_r4();
	    case 1:
		return new rrc.informationelements.PUSCH_CapacityAllocationInfo_r4();
	    case 2:
		return new rrc.informationelements.PDSCH_CapacityAllocationInfo_r4();
	    case 3:
		return ConfirmRequest.confirmPDSCH;
	    case 4:
		return new INTEGER();
	    case 5:
		return new rrc.informationelements.TimeslotList_r4();
	    case 6:
		return new BOOLEAN();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "ul_TimingAdvance"
    public rrc.informationelements.UL_TimingAdvanceControl_r4 getUl_TimingAdvance()
    {
	return (rrc.informationelements.UL_TimingAdvanceControl_r4)mComponents[0];
    }
    
    public void setUl_TimingAdvance(rrc.informationelements.UL_TimingAdvanceControl_r4 ul_TimingAdvance)
    {
	mComponents[0] = ul_TimingAdvance;
    }
    
    public boolean hasUl_TimingAdvance()
    {
	return componentIsPresent(0);
    }
    
    public void deleteUl_TimingAdvance()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "pusch_CapacityAllocationInfo"
    public rrc.informationelements.PUSCH_CapacityAllocationInfo_r4 getPusch_CapacityAllocationInfo()
    {
	return (rrc.informationelements.PUSCH_CapacityAllocationInfo_r4)mComponents[1];
    }
    
    public void setPusch_CapacityAllocationInfo(rrc.informationelements.PUSCH_CapacityAllocationInfo_r4 pusch_CapacityAllocationInfo)
    {
	mComponents[1] = pusch_CapacityAllocationInfo;
    }
    
    public boolean hasPusch_CapacityAllocationInfo()
    {
	return componentIsPresent(1);
    }
    
    public void deletePusch_CapacityAllocationInfo()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "pdsch_CapacityAllocationInfo"
    public rrc.informationelements.PDSCH_CapacityAllocationInfo_r4 getPdsch_CapacityAllocationInfo()
    {
	return (rrc.informationelements.PDSCH_CapacityAllocationInfo_r4)mComponents[2];
    }
    
    public void setPdsch_CapacityAllocationInfo(rrc.informationelements.PDSCH_CapacityAllocationInfo_r4 pdsch_CapacityAllocationInfo)
    {
	mComponents[2] = pdsch_CapacityAllocationInfo;
    }
    
    public boolean hasPdsch_CapacityAllocationInfo()
    {
	return componentIsPresent(2);
    }
    
    public void deletePdsch_CapacityAllocationInfo()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "confirmRequest"
    public ConfirmRequest getConfirmRequest()
    {
	return (ConfirmRequest)mComponents[3];
    }
    
    public void setConfirmRequest(ConfirmRequest confirmRequest)
    {
	mComponents[3] = confirmRequest;
    }
    
    public boolean hasConfirmRequest()
    {
	return componentIsPresent(3);
    }
    
    public void deleteConfirmRequest()
    {
	setComponentAbsent(3);
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
		    (short)0x8003
		}
	    ),
	    new QName (
		"rrc.pdu_definitions",
		"PhysicalSharedChannelAllocation_r4_IEs$ConfirmRequest"
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
	return ((INTEGER)mComponents[4]).longValue();
    }
    
    public void setTrafficVolumeReportRequest(long trafficVolumeReportRequest)
    {
	setTrafficVolumeReportRequest(new INTEGER(trafficVolumeReportRequest));
    }
    
    public void setTrafficVolumeReportRequest(INTEGER trafficVolumeReportRequest)
    {
	mComponents[4] = trafficVolumeReportRequest;
    }
    
    public boolean hasTrafficVolumeReportRequest()
    {
	return componentIsPresent(4);
    }
    
    public void deleteTrafficVolumeReportRequest()
    {
	setComponentAbsent(4);
    }
    
    
    // Methods for field "iscpTimeslotList"
    public rrc.informationelements.TimeslotList_r4 getIscpTimeslotList()
    {
	return (rrc.informationelements.TimeslotList_r4)mComponents[5];
    }
    
    public void setIscpTimeslotList(rrc.informationelements.TimeslotList_r4 iscpTimeslotList)
    {
	mComponents[5] = iscpTimeslotList;
    }
    
    public boolean hasIscpTimeslotList()
    {
	return componentIsPresent(5);
    }
    
    public void deleteIscpTimeslotList()
    {
	setComponentAbsent(5);
    }
    
    
    // Methods for field "requestPCCPCHRSCP"
    public boolean getRequestPCCPCHRSCP()
    {
	return ((BOOLEAN)mComponents[6]).booleanValue();
    }
    
    public void setRequestPCCPCHRSCP(boolean requestPCCPCHRSCP)
    {
	setRequestPCCPCHRSCP(new BOOLEAN(requestPCCPCHRSCP));
    }
    
    public void setRequestPCCPCHRSCP(BOOLEAN requestPCCPCHRSCP)
    {
	mComponents[6] = requestPCCPCHRSCP;
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
	    "PhysicalSharedChannelAllocation_r4_IEs"
	),
	new QName (
	    "PDU-definitions",
	    "PhysicalSharedChannelAllocation-r4-IEs"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"UL_TimingAdvanceControl_r4"
			    ),
			    new QName (
				"InformationElements",
				"UL-TimingAdvanceControl-r4"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UL_TimingAdvanceControl_r4"
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
				"PUSCH_CapacityAllocationInfo_r4"
			    ),
			    new QName (
				"InformationElements",
				"PUSCH-CapacityAllocationInfo-r4"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "PUSCH_CapacityAllocationInfo_r4"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "PUSCH_CapacityAllocationInfo_r4"
				)
			    ),
			    0
			)
		    ),
		    "pusch-CapacityAllocationInfo",
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
				"PDSCH_CapacityAllocationInfo_r4"
			    ),
			    new QName (
				"InformationElements",
				"PDSCH-CapacityAllocationInfo-r4"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "PDSCH_CapacityAllocationInfo_r4"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "PDSCH_CapacityAllocationInfo_r4"
				)
			    ),
			    0
			)
		    ),
		    "pdsch-CapacityAllocationInfo",
		    2,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.pdu_definitions",
			    "PhysicalSharedChannelAllocation_r4_IEs$ConfirmRequest"
			)
		    ),
		    "confirmRequest",
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
		    4,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x8005
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"TimeslotList_r4"
			    ),
			    new QName (
				"InformationElements",
				"TimeslotList-r4"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "TimeslotList_r4"
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
		    "iscpTimeslotList",
		    5,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8006
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
     * Get the type descriptor (TypeInfo) of 'this' PhysicalSharedChannelAllocation_r4_IEs object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' PhysicalSharedChannelAllocation_r4_IEs object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for PhysicalSharedChannelAllocation_r4_IEs
