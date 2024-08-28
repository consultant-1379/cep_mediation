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
 * Define the ASN1 Type CPCH_SetInfo from ASN1 Module InformationElements.
 * @see Sequence
 */

public class CPCH_SetInfo extends Sequence {
    
    /**
     * The default constructor.
     */
    public CPCH_SetInfo()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public CPCH_SetInfo(CPCH_SetID cpch_SetID, 
		    TransportFormatSet transportFormatSet, TFCS tfcs, 
		    AP_PreambleScramblingCode ap_PreambleScramblingCode, 
		    AP_AICH_ChannelisationCode ap_AICH_ChannelisationCode, 
		    CD_PreambleScramblingCode cd_PreambleScramblingCode, 
		    CD_CA_ICH_ChannelisationCode cd_CA_ICH_ChannelisationCode, 
		    CD_AccessSlotSubchannelList cd_AccessSlotSubchannelList, 
		    CD_SignatureCodeList cd_SignatureCodeList, 
		    DeltaPp_m deltaPp_m, 
		    UL_DPCCH_SlotFormat ul_DPCCH_SlotFormat, 
		    N_StartMessage n_StartMessage, N_EOT n_EOT, 
		    ChannelAssignmentActive channelAssignmentActive, 
		    CPCH_StatusIndicationMode cpch_StatusIndicationMode, 
		    PCPCH_ChannelInfoList pcpch_ChannelInfoList)
    {
	setCpch_SetID(cpch_SetID);
	setTransportFormatSet(transportFormatSet);
	setTfcs(tfcs);
	setAp_PreambleScramblingCode(ap_PreambleScramblingCode);
	setAp_AICH_ChannelisationCode(ap_AICH_ChannelisationCode);
	setCd_PreambleScramblingCode(cd_PreambleScramblingCode);
	setCd_CA_ICH_ChannelisationCode(cd_CA_ICH_ChannelisationCode);
	setCd_AccessSlotSubchannelList(cd_AccessSlotSubchannelList);
	setCd_SignatureCodeList(cd_SignatureCodeList);
	setDeltaPp_m(deltaPp_m);
	setUl_DPCCH_SlotFormat(ul_DPCCH_SlotFormat);
	setN_StartMessage(n_StartMessage);
	setN_EOT(n_EOT);
	setChannelAssignmentActive(channelAssignmentActive);
	setCpch_StatusIndicationMode(cpch_StatusIndicationMode);
	setPcpch_ChannelInfoList(pcpch_ChannelInfoList);
    }
    
    /**
     * Construct with required components.
     */
    public CPCH_SetInfo(CPCH_SetID cpch_SetID, 
		    TransportFormatSet transportFormatSet, TFCS tfcs, 
		    AP_PreambleScramblingCode ap_PreambleScramblingCode, 
		    AP_AICH_ChannelisationCode ap_AICH_ChannelisationCode, 
		    CD_PreambleScramblingCode cd_PreambleScramblingCode, 
		    CD_CA_ICH_ChannelisationCode cd_CA_ICH_ChannelisationCode, 
		    DeltaPp_m deltaPp_m, 
		    UL_DPCCH_SlotFormat ul_DPCCH_SlotFormat, 
		    N_StartMessage n_StartMessage, N_EOT n_EOT, 
		    ChannelAssignmentActive channelAssignmentActive, 
		    CPCH_StatusIndicationMode cpch_StatusIndicationMode, 
		    PCPCH_ChannelInfoList pcpch_ChannelInfoList)
    {
	setCpch_SetID(cpch_SetID);
	setTransportFormatSet(transportFormatSet);
	setTfcs(tfcs);
	setAp_PreambleScramblingCode(ap_PreambleScramblingCode);
	setAp_AICH_ChannelisationCode(ap_AICH_ChannelisationCode);
	setCd_PreambleScramblingCode(cd_PreambleScramblingCode);
	setCd_CA_ICH_ChannelisationCode(cd_CA_ICH_ChannelisationCode);
	setDeltaPp_m(deltaPp_m);
	setUl_DPCCH_SlotFormat(ul_DPCCH_SlotFormat);
	setN_StartMessage(n_StartMessage);
	setN_EOT(n_EOT);
	setChannelAssignmentActive(channelAssignmentActive);
	setCpch_StatusIndicationMode(cpch_StatusIndicationMode);
	setPcpch_ChannelInfoList(pcpch_ChannelInfoList);
    }
    
    public void initComponents()
    {
	mComponents[0] = new CPCH_SetID();
	mComponents[1] = new TransportFormatSet();
	mComponents[2] = new TFCS();
	mComponents[3] = new AP_PreambleScramblingCode();
	mComponents[4] = new AP_AICH_ChannelisationCode();
	mComponents[5] = new CD_PreambleScramblingCode();
	mComponents[6] = new CD_CA_ICH_ChannelisationCode();
	mComponents[7] = new CD_AccessSlotSubchannelList();
	mComponents[8] = new CD_SignatureCodeList();
	mComponents[9] = new DeltaPp_m();
	mComponents[10] = UL_DPCCH_SlotFormat.slf0;
	mComponents[11] = new N_StartMessage();
	mComponents[12] = new N_EOT();
	mComponents[13] = new ChannelAssignmentActive();
	mComponents[14] = CPCH_StatusIndicationMode.pa_mode;
	mComponents[15] = new PCPCH_ChannelInfoList();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[16];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new CPCH_SetID();
	    case 1:
		return new TransportFormatSet();
	    case 2:
		return new TFCS();
	    case 3:
		return new AP_PreambleScramblingCode();
	    case 4:
		return new AP_AICH_ChannelisationCode();
	    case 5:
		return new CD_PreambleScramblingCode();
	    case 6:
		return new CD_CA_ICH_ChannelisationCode();
	    case 7:
		return new CD_AccessSlotSubchannelList();
	    case 8:
		return new CD_SignatureCodeList();
	    case 9:
		return new DeltaPp_m();
	    case 10:
		return UL_DPCCH_SlotFormat.slf0;
	    case 11:
		return new N_StartMessage();
	    case 12:
		return new N_EOT();
	    case 13:
		return new ChannelAssignmentActive();
	    case 14:
		return CPCH_StatusIndicationMode.pa_mode;
	    case 15:
		return new PCPCH_ChannelInfoList();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "cpch_SetID"
    public CPCH_SetID getCpch_SetID()
    {
	return (CPCH_SetID)mComponents[0];
    }
    
    public void setCpch_SetID(CPCH_SetID cpch_SetID)
    {
	mComponents[0] = cpch_SetID;
    }
    
    
    // Methods for field "transportFormatSet"
    public TransportFormatSet getTransportFormatSet()
    {
	return (TransportFormatSet)mComponents[1];
    }
    
    public void setTransportFormatSet(TransportFormatSet transportFormatSet)
    {
	mComponents[1] = transportFormatSet;
    }
    
    
    // Methods for field "tfcs"
    public TFCS getTfcs()
    {
	return (TFCS)mComponents[2];
    }
    
    public void setTfcs(TFCS tfcs)
    {
	mComponents[2] = tfcs;
    }
    
    
    // Methods for field "ap_PreambleScramblingCode"
    public AP_PreambleScramblingCode getAp_PreambleScramblingCode()
    {
	return (AP_PreambleScramblingCode)mComponents[3];
    }
    
    public void setAp_PreambleScramblingCode(AP_PreambleScramblingCode ap_PreambleScramblingCode)
    {
	mComponents[3] = ap_PreambleScramblingCode;
    }
    
    
    // Methods for field "ap_AICH_ChannelisationCode"
    public AP_AICH_ChannelisationCode getAp_AICH_ChannelisationCode()
    {
	return (AP_AICH_ChannelisationCode)mComponents[4];
    }
    
    public void setAp_AICH_ChannelisationCode(AP_AICH_ChannelisationCode ap_AICH_ChannelisationCode)
    {
	mComponents[4] = ap_AICH_ChannelisationCode;
    }
    
    
    // Methods for field "cd_PreambleScramblingCode"
    public CD_PreambleScramblingCode getCd_PreambleScramblingCode()
    {
	return (CD_PreambleScramblingCode)mComponents[5];
    }
    
    public void setCd_PreambleScramblingCode(CD_PreambleScramblingCode cd_PreambleScramblingCode)
    {
	mComponents[5] = cd_PreambleScramblingCode;
    }
    
    
    // Methods for field "cd_CA_ICH_ChannelisationCode"
    public CD_CA_ICH_ChannelisationCode getCd_CA_ICH_ChannelisationCode()
    {
	return (CD_CA_ICH_ChannelisationCode)mComponents[6];
    }
    
    public void setCd_CA_ICH_ChannelisationCode(CD_CA_ICH_ChannelisationCode cd_CA_ICH_ChannelisationCode)
    {
	mComponents[6] = cd_CA_ICH_ChannelisationCode;
    }
    
    
    // Methods for field "cd_AccessSlotSubchannelList"
    public CD_AccessSlotSubchannelList getCd_AccessSlotSubchannelList()
    {
	return (CD_AccessSlotSubchannelList)mComponents[7];
    }
    
    public void setCd_AccessSlotSubchannelList(CD_AccessSlotSubchannelList cd_AccessSlotSubchannelList)
    {
	mComponents[7] = cd_AccessSlotSubchannelList;
    }
    
    public boolean hasCd_AccessSlotSubchannelList()
    {
	return componentIsPresent(7);
    }
    
    public void deleteCd_AccessSlotSubchannelList()
    {
	setComponentAbsent(7);
    }
    
    
    // Methods for field "cd_SignatureCodeList"
    public CD_SignatureCodeList getCd_SignatureCodeList()
    {
	return (CD_SignatureCodeList)mComponents[8];
    }
    
    public void setCd_SignatureCodeList(CD_SignatureCodeList cd_SignatureCodeList)
    {
	mComponents[8] = cd_SignatureCodeList;
    }
    
    public boolean hasCd_SignatureCodeList()
    {
	return componentIsPresent(8);
    }
    
    public void deleteCd_SignatureCodeList()
    {
	setComponentAbsent(8);
    }
    
    
    // Methods for field "deltaPp_m"
    public DeltaPp_m getDeltaPp_m()
    {
	return (DeltaPp_m)mComponents[9];
    }
    
    public void setDeltaPp_m(DeltaPp_m deltaPp_m)
    {
	mComponents[9] = deltaPp_m;
    }
    
    
    // Methods for field "ul_DPCCH_SlotFormat"
    public UL_DPCCH_SlotFormat getUl_DPCCH_SlotFormat()
    {
	return (UL_DPCCH_SlotFormat)mComponents[10];
    }
    
    public void setUl_DPCCH_SlotFormat(UL_DPCCH_SlotFormat ul_DPCCH_SlotFormat)
    {
	mComponents[10] = ul_DPCCH_SlotFormat;
    }
    
    
    // Methods for field "n_StartMessage"
    public N_StartMessage getN_StartMessage()
    {
	return (N_StartMessage)mComponents[11];
    }
    
    public void setN_StartMessage(N_StartMessage n_StartMessage)
    {
	mComponents[11] = n_StartMessage;
    }
    
    
    // Methods for field "n_EOT"
    public N_EOT getN_EOT()
    {
	return (N_EOT)mComponents[12];
    }
    
    public void setN_EOT(N_EOT n_EOT)
    {
	mComponents[12] = n_EOT;
    }
    
    
    // Methods for field "channelAssignmentActive"
    public ChannelAssignmentActive getChannelAssignmentActive()
    {
	return (ChannelAssignmentActive)mComponents[13];
    }
    
    public void setChannelAssignmentActive(ChannelAssignmentActive channelAssignmentActive)
    {
	mComponents[13] = channelAssignmentActive;
    }
    
    
    // Methods for field "cpch_StatusIndicationMode"
    public CPCH_StatusIndicationMode getCpch_StatusIndicationMode()
    {
	return (CPCH_StatusIndicationMode)mComponents[14];
    }
    
    public void setCpch_StatusIndicationMode(CPCH_StatusIndicationMode cpch_StatusIndicationMode)
    {
	mComponents[14] = cpch_StatusIndicationMode;
    }
    
    
    // Methods for field "pcpch_ChannelInfoList"
    public PCPCH_ChannelInfoList getPcpch_ChannelInfoList()
    {
	return (PCPCH_ChannelInfoList)mComponents[15];
    }
    
    public void setPcpch_ChannelInfoList(PCPCH_ChannelInfoList pcpch_ChannelInfoList)
    {
	mComponents[15] = pcpch_ChannelInfoList;
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
	    "CPCH_SetInfo"
	),
	new QName (
	    "InformationElements",
	    "CPCH-SetInfo"
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
				"CPCH_SetID"
			    ),
			    new QName (
				"InformationElements",
				"CPCH-SetID"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new CPCH_SetID(1), 
				    new CPCH_SetID(16),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(16)
			    ),
			    null
			)
		    ),
		    "cpch-SetID",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"TransportFormatSet"
			    ),
			    new QName (
				"InformationElements",
				"TransportFormatSet"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "TransportFormatSet"
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
		    "transportFormatSet",
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
				"TFCS"
			    ),
			    new QName (
				"InformationElements",
				"TFCS"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "TFCS"
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
		    "tfcs",
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
				"AP_PreambleScramblingCode"
			    ),
			    new QName (
				"InformationElements",
				"AP-PreambleScramblingCode"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new AP_PreambleScramblingCode(0), 
				    new AP_PreambleScramblingCode(79),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(79)
			    ),
			    null
			)
		    ),
		    "ap-PreambleScramblingCode",
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
				"AP_AICH_ChannelisationCode"
			    ),
			    new QName (
				"InformationElements",
				"AP-AICH-ChannelisationCode"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new AP_AICH_ChannelisationCode(0), 
				    new AP_AICH_ChannelisationCode(255),
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
		    "ap-AICH-ChannelisationCode",
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
				"CD_PreambleScramblingCode"
			    ),
			    new QName (
				"InformationElements",
				"CD-PreambleScramblingCode"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new CD_PreambleScramblingCode(0), 
				    new CD_PreambleScramblingCode(79),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(79)
			    ),
			    null
			)
		    ),
		    "cd-PreambleScramblingCode",
		    5,
		    2,
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
				"CD_CA_ICH_ChannelisationCode"
			    ),
			    new QName (
				"InformationElements",
				"CD-CA-ICH-ChannelisationCode"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new CD_CA_ICH_ChannelisationCode(0), 
				    new CD_CA_ICH_ChannelisationCode(255),
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
		    "cd-CA-ICH-ChannelisationCode",
		    6,
		    2,
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
				"CD_AccessSlotSubchannelList"
			    ),
			    new QName (
				"InformationElements",
				"CD-AccessSlotSubchannelList"
			    ),
			    12314,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new com.oss.asn1.INTEGER(1), 
					new com.oss.asn1.INTEGER(12),
					0
				    )
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(12)
			    ),
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "CD_AccessSlotSubchannel"
				)
			    )
			)
		    ),
		    "cd-AccessSlotSubchannelList",
		    7,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8008
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"CD_SignatureCodeList"
			    ),
			    new QName (
				"InformationElements",
				"CD-SignatureCodeList"
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
				    "CD_SignatureCode"
				)
			    )
			)
		    ),
		    "cd-SignatureCodeList",
		    8,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8009
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"DeltaPp_m"
			    ),
			    new QName (
				"InformationElements",
				"DeltaPp-m"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new DeltaPp_m(-10), 
				    new DeltaPp_m(10),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(-10),
				new java.lang.Long(10)
			    ),
			    null
			)
		    ),
		    "deltaPp-m",
		    9,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x800a
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"UL_DPCCH_SlotFormat"
			    ),
			    new QName (
				"InformationElements",
				"UL-DPCCH-SlotFormat"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"slf0",
					0
				    ),
				    new MemberListElement (
					"slf1",
					1
				    ),
				    new MemberListElement (
					"slf2",
					2
				    )
				}
			    ),
			    0,
			    UL_DPCCH_SlotFormat.slf0
			)
		    ),
		    "ul-DPCCH-SlotFormat",
		    10,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x800b
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"N_StartMessage"
			    ),
			    new QName (
				"InformationElements",
				"N-StartMessage"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new N_StartMessage(1), 
				    new N_StartMessage(8),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(8)
			    ),
			    null
			)
		    ),
		    "n-StartMessage",
		    11,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x800c
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"N_EOT"
			    ),
			    new QName (
				"InformationElements",
				"N-EOT"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new N_EOT(0), 
				    new N_EOT(7),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(7)
			    ),
			    null
			)
		    ),
		    "n-EOT",
		    12,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x800d
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"ChannelAssignmentActive"
			    ),
			    new QName (
				"InformationElements",
				"ChannelAssignmentActive"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "ChannelAssignmentActive"
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
		    "channelAssignmentActive",
		    13,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x800e
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"CPCH_StatusIndicationMode"
			    ),
			    new QName (
				"InformationElements",
				"CPCH-StatusIndicationMode"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"pa-mode",
					0
				    ),
				    new MemberListElement (
					"pamsf-mode",
					1
				    )
				}
			    ),
			    0,
			    CPCH_StatusIndicationMode.pa_mode
			)
		    ),
		    "cpch-StatusIndicationMode",
		    14,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x800f
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"PCPCH_ChannelInfoList"
			    ),
			    new QName (
				"InformationElements",
				"PCPCH-ChannelInfoList"
			    ),
			    12314,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new com.oss.asn1.INTEGER(1), 
					new com.oss.asn1.INTEGER(64),
					0
				    )
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(64)
			    ),
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "PCPCH_ChannelInfo"
				)
			    )
			)
		    ),
		    "pcpch-ChannelInfoList",
		    15,
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
			new TagDecoderElement((short)0x8005, 5)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8006, 6)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8007, 7),
			new TagDecoderElement((short)0x8008, 8),
			new TagDecoderElement((short)0x8009, 9)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8008, 8),
			new TagDecoderElement((short)0x8009, 9)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8009, 9)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800a, 10)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800b, 11)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800c, 12)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800d, 13)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800e, 14)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800f, 15)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' CPCH_SetInfo object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' CPCH_SetInfo object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for CPCH_SetInfo
