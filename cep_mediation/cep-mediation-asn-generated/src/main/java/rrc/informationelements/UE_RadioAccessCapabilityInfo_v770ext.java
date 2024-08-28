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
 * Define the ASN1 Type UE_RadioAccessCapabilityInfo_v770ext from ASN1 Module InformationElements.
 * @see Sequence
 */

public class UE_RadioAccessCapabilityInfo_v770ext extends Sequence {
    
    /**
     * The default constructor.
     */
    public UE_RadioAccessCapabilityInfo_v770ext()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public UE_RadioAccessCapabilityInfo_v770ext(RF_Capability_v770ext rf_Capability, 
		    PhysicalChannelCapabilityInfo_v770ext physicalChannelCapability, 
		    GanssSupportIndication ganssSupportIndication, 
		    Mac_ehsSupport mac_ehsSupport, 
		    UE_SpecificCapabilityInformation_LCRTDD ue_SpecificCapabilityInformation)
    {
	setRf_Capability(rf_Capability);
	setPhysicalChannelCapability(physicalChannelCapability);
	setGanssSupportIndication(ganssSupportIndication);
	setMac_ehsSupport(mac_ehsSupport);
	setUe_SpecificCapabilityInformation(ue_SpecificCapabilityInformation);
    }
    
    /**
     * Construct with required components.
     */
    public UE_RadioAccessCapabilityInfo_v770ext(PhysicalChannelCapabilityInfo_v770ext physicalChannelCapability)
    {
	setPhysicalChannelCapability(physicalChannelCapability);
    }
    
    public void initComponents()
    {
	mComponents[0] = new RF_Capability_v770ext();
	mComponents[1] = new PhysicalChannelCapabilityInfo_v770ext();
	mComponents[2] = GanssSupportIndication._true;
	mComponents[3] = Mac_ehsSupport._true;
	mComponents[4] = UE_SpecificCapabilityInformation_LCRTDD.nF;
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[5];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new RF_Capability_v770ext();
	    case 1:
		return new PhysicalChannelCapabilityInfo_v770ext();
	    case 2:
		return GanssSupportIndication._true;
	    case 3:
		return Mac_ehsSupport._true;
	    case 4:
		return UE_SpecificCapabilityInformation_LCRTDD.nF;
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "rf_Capability"
    public RF_Capability_v770ext getRf_Capability()
    {
	return (RF_Capability_v770ext)mComponents[0];
    }
    
    public void setRf_Capability(RF_Capability_v770ext rf_Capability)
    {
	mComponents[0] = rf_Capability;
    }
    
    public boolean hasRf_Capability()
    {
	return componentIsPresent(0);
    }
    
    public void deleteRf_Capability()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "physicalChannelCapability"
    public PhysicalChannelCapabilityInfo_v770ext getPhysicalChannelCapability()
    {
	return (PhysicalChannelCapabilityInfo_v770ext)mComponents[1];
    }
    
    public void setPhysicalChannelCapability(PhysicalChannelCapabilityInfo_v770ext physicalChannelCapability)
    {
	mComponents[1] = physicalChannelCapability;
    }
    
    
    // Methods for field "ganssSupportIndication"
    public GanssSupportIndication getGanssSupportIndication()
    {
	return (GanssSupportIndication)mComponents[2];
    }
    
    public void setGanssSupportIndication(GanssSupportIndication ganssSupportIndication)
    {
	mComponents[2] = ganssSupportIndication;
    }
    
    public boolean hasGanssSupportIndication()
    {
	return componentIsPresent(2);
    }
    
    public void deleteGanssSupportIndication()
    {
	setComponentAbsent(2);
    }
    
    
    
    /**
     * Define the ASN1 Type GanssSupportIndication from ASN1 Module InformationElements.
     * @see Enumerated
     */
    public static final class GanssSupportIndication extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private GanssSupportIndication()
	{
	    super(cFirstNumber);
	}
	
	protected GanssSupportIndication(long value)
	{
	    super(value);
	}
	
	// Named list definitions.
	public static final GanssSupportIndication _true =
	    new GanssSupportIndication(0);
	private final static GanssSupportIndication cNamedNumbers[] = {
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
	
	public static GanssSupportIndication valueOf(long value)
	{
	    return (GanssSupportIndication)_true.lookupValue(value);
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final EnumeratedInfo c_typeinfo = new EnumeratedInfo (
	    new Tags (
		new short[] {
		    (short)0x8002
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"UE_RadioAccessCapabilityInfo_v770ext$GanssSupportIndication"
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
	 * Get the type descriptor (TypeInfo) of 'this' GanssSupportIndication object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' GanssSupportIndication object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for GanssSupportIndication

    // Methods for field "mac_ehsSupport"
    public Mac_ehsSupport getMac_ehsSupport()
    {
	return (Mac_ehsSupport)mComponents[3];
    }
    
    public void setMac_ehsSupport(Mac_ehsSupport mac_ehsSupport)
    {
	mComponents[3] = mac_ehsSupport;
    }
    
    public boolean hasMac_ehsSupport()
    {
	return componentIsPresent(3);
    }
    
    public void deleteMac_ehsSupport()
    {
	setComponentAbsent(3);
    }
    
    
    
    /**
     * Define the ASN1 Type Mac_ehsSupport from ASN1 Module InformationElements.
     * @see Enumerated
     */
    public static final class Mac_ehsSupport extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private Mac_ehsSupport()
	{
	    super(cFirstNumber);
	}
	
	protected Mac_ehsSupport(long value)
	{
	    super(value);
	}
	
	// Named list definitions.
	public static final Mac_ehsSupport _true =
	    new Mac_ehsSupport(0);
	private final static Mac_ehsSupport cNamedNumbers[] = {
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
	
	public static Mac_ehsSupport valueOf(long value)
	{
	    return (Mac_ehsSupport)_true.lookupValue(value);
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
		"rrc.informationelements",
		"UE_RadioAccessCapabilityInfo_v770ext$Mac_ehsSupport"
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
	 * Get the type descriptor (TypeInfo) of 'this' Mac_ehsSupport object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Mac_ehsSupport object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Mac_ehsSupport

    // Methods for field "ue_SpecificCapabilityInformation"
    public UE_SpecificCapabilityInformation_LCRTDD getUe_SpecificCapabilityInformation()
    {
	return (UE_SpecificCapabilityInformation_LCRTDD)mComponents[4];
    }
    
    public void setUe_SpecificCapabilityInformation(UE_SpecificCapabilityInformation_LCRTDD ue_SpecificCapabilityInformation)
    {
	mComponents[4] = ue_SpecificCapabilityInformation;
    }
    
    public boolean hasUe_SpecificCapabilityInformation()
    {
	return componentIsPresent(4);
    }
    
    public void deleteUe_SpecificCapabilityInformation()
    {
	setComponentAbsent(4);
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
	    "UE_RadioAccessCapabilityInfo_v770ext"
	),
	new QName (
	    "InformationElements",
	    "UE-RadioAccessCapabilityInfo-v770ext"
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
				"RF_Capability_v770ext"
			    ),
			    new QName (
				"InformationElements",
				"RF-Capability-v770ext"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "RF_Capability_v770ext"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "RF_Capability_v770ext"
				)
			    ),
			    0
			)
		    ),
		    "rf-Capability",
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
				"PhysicalChannelCapabilityInfo_v770ext"
			    ),
			    new QName (
				"InformationElements",
				"PhysicalChannelCapabilityInfo-v770ext"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "PhysicalChannelCapabilityInfo_v770ext"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "PhysicalChannelCapabilityInfo_v770ext"
				)
			    ),
			    0
			)
		    ),
		    "physicalChannelCapability",
		    1,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "UE_RadioAccessCapabilityInfo_v770ext$GanssSupportIndication"
			)
		    ),
		    "ganssSupportIndication",
		    2,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "UE_RadioAccessCapabilityInfo_v770ext$Mac_ehsSupport"
			)
		    ),
		    "mac-ehsSupport",
		    3,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8004
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"UE_SpecificCapabilityInformation_LCRTDD"
			    ),
			    new QName (
				"InformationElements",
				"UE-SpecificCapabilityInformation-LCRTDD"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"nF",
					0
				    ),
				    new MemberListElement (
					"nFMc-TriRx-UniTx",
					1
				    ),
				    new MemberListElement (
					"nFMc-TriRx-TriTx",
					2
				    ),
				    new MemberListElement (
					"nFMc-HexRx-UniTx",
					3
				    ),
				    new MemberListElement (
					"nFMc-HexRx-TriTx",
					4
				    ),
				    new MemberListElement (
					"nFMc-HexRx-HexTx",
					5
				    ),
				    new MemberListElement (
					"nFMc-TwoRx-UniTx",
					6
				    ),
				    new MemberListElement (
					"nFMc-TwoRx-TwoTx",
					7
				    ),
				    new MemberListElement (
					"spare8",
					8
				    ),
				    new MemberListElement (
					"spare7",
					9
				    ),
				    new MemberListElement (
					"spare6",
					10
				    ),
				    new MemberListElement (
					"spare5",
					11
				    ),
				    new MemberListElement (
					"spare4",
					12
				    ),
				    new MemberListElement (
					"spare3",
					13
				    ),
				    new MemberListElement (
					"spare2",
					14
				    ),
				    new MemberListElement (
					"spare1",
					15
				    )
				}
			    ),
			    0,
			    UE_SpecificCapabilityInformation_LCRTDD.nF
			)
		    ),
		    "ue-SpecificCapabilityInformation",
		    4,
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
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4)
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
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' UE_RadioAccessCapabilityInfo_v770ext object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UE_RadioAccessCapabilityInfo_v770ext object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UE_RadioAccessCapabilityInfo_v770ext
