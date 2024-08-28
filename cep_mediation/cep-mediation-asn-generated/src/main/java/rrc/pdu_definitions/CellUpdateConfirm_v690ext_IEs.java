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
 * Define the ASN1 Type CellUpdateConfirm_v690ext_IEs from ASN1 Module PDU_definitions.
 * @see Sequence
 */

public class CellUpdateConfirm_v690ext_IEs extends Sequence {
    
    /**
     * The default constructor.
     */
    public CellUpdateConfirm_v690ext_IEs()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public CellUpdateConfirm_v690ext_IEs(rrc.informationelements.PLMN_Identity primary_plmn_Identity, 
		    rrc.informationelements.HARQ_Preamble_Mode harq_Preamble_Mode, 
		    rrc.informationelements.BEACON_PL_Est beaconPLEst, 
		    PostVerificationPeriod postVerificationPeriod, 
		    rrc.informationelements.DHS_Sync dhs_sync, 
		    rrc.informationelements.MBMS_PL_ServiceRestrictInfo_r6 mbms_PL_ServiceRestrictInfo)
    {
	setPrimary_plmn_Identity(primary_plmn_Identity);
	setHarq_Preamble_Mode(harq_Preamble_Mode);
	setBeaconPLEst(beaconPLEst);
	setPostVerificationPeriod(postVerificationPeriod);
	setDhs_sync(dhs_sync);
	setMbms_PL_ServiceRestrictInfo(mbms_PL_ServiceRestrictInfo);
    }
    
    public void initComponents()
    {
	mComponents[0] = new rrc.informationelements.PLMN_Identity();
	mComponents[1] = new rrc.informationelements.HARQ_Preamble_Mode();
	mComponents[2] = rrc.informationelements.BEACON_PL_Est._true;
	mComponents[3] = PostVerificationPeriod._true;
	mComponents[4] = new rrc.informationelements.DHS_Sync();
	mComponents[5] = rrc.informationelements.MBMS_PL_ServiceRestrictInfo_r6._true;
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
		return new rrc.informationelements.PLMN_Identity();
	    case 1:
		return new rrc.informationelements.HARQ_Preamble_Mode();
	    case 2:
		return rrc.informationelements.BEACON_PL_Est._true;
	    case 3:
		return PostVerificationPeriod._true;
	    case 4:
		return new rrc.informationelements.DHS_Sync();
	    case 5:
		return rrc.informationelements.MBMS_PL_ServiceRestrictInfo_r6._true;
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "primary_plmn_Identity"
    public rrc.informationelements.PLMN_Identity getPrimary_plmn_Identity()
    {
	return (rrc.informationelements.PLMN_Identity)mComponents[0];
    }
    
    public void setPrimary_plmn_Identity(rrc.informationelements.PLMN_Identity primary_plmn_Identity)
    {
	mComponents[0] = primary_plmn_Identity;
    }
    
    public boolean hasPrimary_plmn_Identity()
    {
	return componentIsPresent(0);
    }
    
    public void deletePrimary_plmn_Identity()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "harq_Preamble_Mode"
    public rrc.informationelements.HARQ_Preamble_Mode getHarq_Preamble_Mode()
    {
	return (rrc.informationelements.HARQ_Preamble_Mode)mComponents[1];
    }
    
    public void setHarq_Preamble_Mode(rrc.informationelements.HARQ_Preamble_Mode harq_Preamble_Mode)
    {
	mComponents[1] = harq_Preamble_Mode;
    }
    
    public boolean hasHarq_Preamble_Mode()
    {
	return componentIsPresent(1);
    }
    
    public void deleteHarq_Preamble_Mode()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "beaconPLEst"
    public rrc.informationelements.BEACON_PL_Est getBeaconPLEst()
    {
	return (rrc.informationelements.BEACON_PL_Est)mComponents[2];
    }
    
    public void setBeaconPLEst(rrc.informationelements.BEACON_PL_Est beaconPLEst)
    {
	mComponents[2] = beaconPLEst;
    }
    
    public boolean hasBeaconPLEst()
    {
	return componentIsPresent(2);
    }
    
    public void deleteBeaconPLEst()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "postVerificationPeriod"
    public PostVerificationPeriod getPostVerificationPeriod()
    {
	return (PostVerificationPeriod)mComponents[3];
    }
    
    public void setPostVerificationPeriod(PostVerificationPeriod postVerificationPeriod)
    {
	mComponents[3] = postVerificationPeriod;
    }
    
    public boolean hasPostVerificationPeriod()
    {
	return componentIsPresent(3);
    }
    
    public void deletePostVerificationPeriod()
    {
	setComponentAbsent(3);
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
		    (short)0x8003
		}
	    ),
	    new QName (
		"rrc.pdu_definitions",
		"CellUpdateConfirm_v690ext_IEs$PostVerificationPeriod"
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
	return (rrc.informationelements.DHS_Sync)mComponents[4];
    }
    
    public void setDhs_sync(rrc.informationelements.DHS_Sync dhs_sync)
    {
	mComponents[4] = dhs_sync;
    }
    
    public boolean hasDhs_sync()
    {
	return componentIsPresent(4);
    }
    
    public void deleteDhs_sync()
    {
	setComponentAbsent(4);
    }
    
    
    // Methods for field "mbms_PL_ServiceRestrictInfo"
    public rrc.informationelements.MBMS_PL_ServiceRestrictInfo_r6 getMbms_PL_ServiceRestrictInfo()
    {
	return (rrc.informationelements.MBMS_PL_ServiceRestrictInfo_r6)mComponents[5];
    }
    
    public void setMbms_PL_ServiceRestrictInfo(rrc.informationelements.MBMS_PL_ServiceRestrictInfo_r6 mbms_PL_ServiceRestrictInfo)
    {
	mComponents[5] = mbms_PL_ServiceRestrictInfo;
    }
    
    public boolean hasMbms_PL_ServiceRestrictInfo()
    {
	return componentIsPresent(5);
    }
    
    public void deleteMbms_PL_ServiceRestrictInfo()
    {
	setComponentAbsent(5);
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
	    "CellUpdateConfirm_v690ext_IEs"
	),
	new QName (
	    "PDU-definitions",
	    "CellUpdateConfirm-v690ext-IEs"
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
		    1,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
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
		    2,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.pdu_definitions",
			    "CellUpdateConfirm_v690ext_IEs$PostVerificationPeriod"
			)
		    ),
		    "postVerificationPeriod",
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
		    4,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8005
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
		    5,
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
			new TagDecoderElement((short)0x8005, 5)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5)
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
     * Get the type descriptor (TypeInfo) of 'this' CellUpdateConfirm_v690ext_IEs object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' CellUpdateConfirm_v690ext_IEs object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for CellUpdateConfirm_v690ext_IEs
