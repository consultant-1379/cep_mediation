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
 * Define the ASN1 Type TransportChannelReconfiguration_v690ext_IEs from ASN1 Module PDU_definitions.
 * @see Sequence
 */

public class TransportChannelReconfiguration_v690ext_IEs extends Sequence {
    
    /**
     * The default constructor.
     */
    public TransportChannelReconfiguration_v690ext_IEs()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public TransportChannelReconfiguration_v690ext_IEs(rrc.informationelements.DelayRestrictionFlag delayRestrictionFlag, 
		    rrc.informationelements.PLMN_Identity primary_plmn_Identity, 
		    rrc.informationelements.HARQ_Preamble_Mode harq_Preamble_Mode, 
		    rrc.informationelements.BEACON_PL_Est beaconPLEst, 
		    PostVerificationPeriod postVerificationPeriod, 
		    rrc.informationelements.DHS_Sync dhs_sync, 
		    rrc.informationelements.TimingMaintainedSynchInd timingMaintainedSynchInd, 
		    rrc.informationelements.MBMS_PL_ServiceRestrictInfo_r6 mbms_PL_ServiceRestrictInfo)
    {
	setDelayRestrictionFlag(delayRestrictionFlag);
	setPrimary_plmn_Identity(primary_plmn_Identity);
	setHarq_Preamble_Mode(harq_Preamble_Mode);
	setBeaconPLEst(beaconPLEst);
	setPostVerificationPeriod(postVerificationPeriod);
	setDhs_sync(dhs_sync);
	setTimingMaintainedSynchInd(timingMaintainedSynchInd);
	setMbms_PL_ServiceRestrictInfo(mbms_PL_ServiceRestrictInfo);
    }
    
    public void initComponents()
    {
	mComponents[0] = rrc.informationelements.DelayRestrictionFlag._true;
	mComponents[1] = new rrc.informationelements.PLMN_Identity();
	mComponents[2] = new rrc.informationelements.HARQ_Preamble_Mode();
	mComponents[3] = rrc.informationelements.BEACON_PL_Est._true;
	mComponents[4] = PostVerificationPeriod._true;
	mComponents[5] = new rrc.informationelements.DHS_Sync();
	mComponents[6] = rrc.informationelements.TimingMaintainedSynchInd._false;
	mComponents[7] = rrc.informationelements.MBMS_PL_ServiceRestrictInfo_r6._true;
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
		return rrc.informationelements.DelayRestrictionFlag._true;
	    case 1:
		return new rrc.informationelements.PLMN_Identity();
	    case 2:
		return new rrc.informationelements.HARQ_Preamble_Mode();
	    case 3:
		return rrc.informationelements.BEACON_PL_Est._true;
	    case 4:
		return PostVerificationPeriod._true;
	    case 5:
		return new rrc.informationelements.DHS_Sync();
	    case 6:
		return rrc.informationelements.TimingMaintainedSynchInd._false;
	    case 7:
		return rrc.informationelements.MBMS_PL_ServiceRestrictInfo_r6._true;
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "delayRestrictionFlag"
    public rrc.informationelements.DelayRestrictionFlag getDelayRestrictionFlag()
    {
	return (rrc.informationelements.DelayRestrictionFlag)mComponents[0];
    }
    
    public void setDelayRestrictionFlag(rrc.informationelements.DelayRestrictionFlag delayRestrictionFlag)
    {
	mComponents[0] = delayRestrictionFlag;
    }
    
    public boolean hasDelayRestrictionFlag()
    {
	return componentIsPresent(0);
    }
    
    public void deleteDelayRestrictionFlag()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "primary_plmn_Identity"
    public rrc.informationelements.PLMN_Identity getPrimary_plmn_Identity()
    {
	return (rrc.informationelements.PLMN_Identity)mComponents[1];
    }
    
    public void setPrimary_plmn_Identity(rrc.informationelements.PLMN_Identity primary_plmn_Identity)
    {
	mComponents[1] = primary_plmn_Identity;
    }
    
    public boolean hasPrimary_plmn_Identity()
    {
	return componentIsPresent(1);
    }
    
    public void deletePrimary_plmn_Identity()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "harq_Preamble_Mode"
    public rrc.informationelements.HARQ_Preamble_Mode getHarq_Preamble_Mode()
    {
	return (rrc.informationelements.HARQ_Preamble_Mode)mComponents[2];
    }
    
    public void setHarq_Preamble_Mode(rrc.informationelements.HARQ_Preamble_Mode harq_Preamble_Mode)
    {
	mComponents[2] = harq_Preamble_Mode;
    }
    
    public boolean hasHarq_Preamble_Mode()
    {
	return componentIsPresent(2);
    }
    
    public void deleteHarq_Preamble_Mode()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "beaconPLEst"
    public rrc.informationelements.BEACON_PL_Est getBeaconPLEst()
    {
	return (rrc.informationelements.BEACON_PL_Est)mComponents[3];
    }
    
    public void setBeaconPLEst(rrc.informationelements.BEACON_PL_Est beaconPLEst)
    {
	mComponents[3] = beaconPLEst;
    }
    
    public boolean hasBeaconPLEst()
    {
	return componentIsPresent(3);
    }
    
    public void deleteBeaconPLEst()
    {
	setComponentAbsent(3);
    }
    
    
    // Methods for field "postVerificationPeriod"
    public PostVerificationPeriod getPostVerificationPeriod()
    {
	return (PostVerificationPeriod)mComponents[4];
    }
    
    public void setPostVerificationPeriod(PostVerificationPeriod postVerificationPeriod)
    {
	mComponents[4] = postVerificationPeriod;
    }
    
    public boolean hasPostVerificationPeriod()
    {
	return componentIsPresent(4);
    }
    
    public void deletePostVerificationPeriod()
    {
	setComponentAbsent(4);
    }
    
    
    
    /**
     * Define the ASN1 Type PostVerificationPeriod from ASN1 Module PDU_definitions.
     * @see Enumerated
     */
    public static final class PostVerificationPeriod extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private PostVerificationPeriod()
	{
	    super(cFirstNumber);
	}
	
	protected PostVerificationPeriod(long value)
	{
	    super(value);
	}
	
	// Named list definitions.
	public static final PostVerificationPeriod _true =
	    new PostVerificationPeriod(0);
	private final static PostVerificationPeriod cNamedNumbers[] = {
	     _true
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
	
	public static PostVerificationPeriod valueOf(long value)
	{
	    return (PostVerificationPeriod)_true.lookupValue(value);
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final EnumeratedInfo c_typeinfo = new EnumeratedInfo (
	    new Tags (
		new short[] {
		    (short)0x8004
		}
	    ),
	    new QName (
		"rrc.pdu_definitions",
		"TransportChannelReconfiguration_v690ext_IEs$PostVerificationPeriod"
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
			"true",
			0
		    )
		}
	    ),
	    0,
	    _true
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' PostVerificationPeriod object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' PostVerificationPeriod object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for PostVerificationPeriod

    // Methods for field "dhs_sync"
    public rrc.informationelements.DHS_Sync getDhs_sync()
    {
	return (rrc.informationelements.DHS_Sync)mComponents[5];
    }
    
    public void setDhs_sync(rrc.informationelements.DHS_Sync dhs_sync)
    {
	mComponents[5] = dhs_sync;
    }
    
    public boolean hasDhs_sync()
    {
	return componentIsPresent(5);
    }
    
    public void deleteDhs_sync()
    {
	setComponentAbsent(5);
    }
    
    
    // Methods for field "timingMaintainedSynchInd"
    public rrc.informationelements.TimingMaintainedSynchInd getTimingMaintainedSynchInd()
    {
	return (rrc.informationelements.TimingMaintainedSynchInd)mComponents[6];
    }
    
    public void setTimingMaintainedSynchInd(rrc.informationelements.TimingMaintainedSynchInd timingMaintainedSynchInd)
    {
	mComponents[6] = timingMaintainedSynchInd;
    }
    
    public boolean hasTimingMaintainedSynchInd()
    {
	return componentIsPresent(6);
    }
    
    public void deleteTimingMaintainedSynchInd()
    {
	setComponentAbsent(6);
    }
    
    
    // Methods for field "mbms_PL_ServiceRestrictInfo"
    public rrc.informationelements.MBMS_PL_ServiceRestrictInfo_r6 getMbms_PL_ServiceRestrictInfo()
    {
	return (rrc.informationelements.MBMS_PL_ServiceRestrictInfo_r6)mComponents[7];
    }
    
    public void setMbms_PL_ServiceRestrictInfo(rrc.informationelements.MBMS_PL_ServiceRestrictInfo_r6 mbms_PL_ServiceRestrictInfo)
    {
	mComponents[7] = mbms_PL_ServiceRestrictInfo;
    }
    
    public boolean hasMbms_PL_ServiceRestrictInfo()
    {
	return componentIsPresent(7);
    }
    
    public void deleteMbms_PL_ServiceRestrictInfo()
    {
	setComponentAbsent(7);
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
	    "TransportChannelReconfiguration_v690ext_IEs"
	),
	new QName (
	    "PDU-definitions",
	    "TransportChannelReconfiguration-v690ext-IEs"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"DelayRestrictionFlag"
			    ),
			    new QName (
				"InformationElements",
				"DelayRestrictionFlag"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"true",
					0
				    )
				}
			    ),
			    0,
			    rrc.informationelements.DelayRestrictionFlag._true
			)
		    ),
		    "delayRestrictionFlag",
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
				"PLMN_Identity"
			    ),
			    new QName (
				"InformationElements",
				"PLMN-Identity"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "PLMN_Identity"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "PLMN_Identity"
				)
			    ),
			    0
			)
		    ),
		    "primary-plmn-Identity",
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
				"HARQ_Preamble_Mode"
			    ),
			    new QName (
				"InformationElements",
				"HARQ-Preamble-Mode"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new rrc.informationelements.HARQ_Preamble_Mode(0), 
				    new rrc.informationelements.HARQ_Preamble_Mode(1),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(1)
			    ),
			    null
			)
		    ),
		    "harq-Preamble-Mode",
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
				"BEACON_PL_Est"
			    ),
			    new QName (
				"InformationElements",
				"BEACON-PL-Est"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"true",
					0
				    )
				}
			    ),
			    0,
			    rrc.informationelements.BEACON_PL_Est._true
			)
		    ),
		    "beaconPLEst",
		    3,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.pdu_definitions",
			    "TransportChannelReconfiguration_v690ext_IEs$PostVerificationPeriod"
			)
		    ),
		    "postVerificationPeriod",
		    4,
		    3,
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
				"DHS_Sync"
			    ),
			    new QName (
				"InformationElements",
				"DHS-Sync"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new rrc.informationelements.DHS_Sync(-20), 
				    new rrc.informationelements.DHS_Sync(10),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(-20),
				new java.lang.Long(10)
			    ),
			    null
			)
		    ),
		    "dhs-sync",
		    5,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8006
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"TimingMaintainedSynchInd"
			    ),
			    new QName (
				"InformationElements",
				"TimingMaintainedSynchInd"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"false",
					0
				    )
				}
			    ),
			    0,
			    rrc.informationelements.TimingMaintainedSynchInd._false
			)
		    ),
		    "timingMaintainedSynchInd",
		    6,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8007
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"MBMS_PL_ServiceRestrictInfo_r6"
			    ),
			    new QName (
				"InformationElements",
				"MBMS-PL-ServiceRestrictInfo-r6"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"true",
					0
				    )
				}
			    ),
			    0,
			    rrc.informationelements.MBMS_PL_ServiceRestrictInfo_r6._true
			)
		    ),
		    "mbms-PL-ServiceRestrictInfo",
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
			new TagDecoderElement((short)0x8000, 0),
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6),
			new TagDecoderElement((short)0x8007, 7)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6),
			new TagDecoderElement((short)0x8007, 7)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6),
			new TagDecoderElement((short)0x8007, 7)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6),
			new TagDecoderElement((short)0x8007, 7)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6),
			new TagDecoderElement((short)0x8007, 7)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6),
			new TagDecoderElement((short)0x8007, 7)
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
     * Get the type descriptor (TypeInfo) of 'this' TransportChannelReconfiguration_v690ext_IEs object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' TransportChannelReconfiguration_v690ext_IEs object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for TransportChannelReconfiguration_v690ext_IEs
