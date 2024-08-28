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
 * Define the ASN1 Type UE_RadioAccessCapability_v690ext from ASN1 Module InformationElements.
 * @see Sequence
 */

public class UE_RadioAccessCapability_v690ext extends Sequence {
    
    /**
     * The default constructor.
     */
    public UE_RadioAccessCapability_v690ext()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public UE_RadioAccessCapability_v690ext(PhysicalChannelCapability_edch_r6 physicalchannelcapability_edch, 
		    DeviceType deviceType)
    {
	setPhysicalchannelcapability_edch(physicalchannelcapability_edch);
	setDeviceType(deviceType);
    }
    
    /**
     * Construct with required components.
     */
    public UE_RadioAccessCapability_v690ext(PhysicalChannelCapability_edch_r6 physicalchannelcapability_edch)
    {
	setPhysicalchannelcapability_edch(physicalchannelcapability_edch);
    }
    
    public void initComponents()
    {
	mComponents[0] = new PhysicalChannelCapability_edch_r6();
	mComponents[1] = DeviceType.doesNotBenefitFromBatteryConsumptionOptimisation;
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
		return new PhysicalChannelCapability_edch_r6();
	    case 1:
		return DeviceType.doesNotBenefitFromBatteryConsumptionOptimisation;
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "physicalchannelcapability_edch"
    public PhysicalChannelCapability_edch_r6 getPhysicalchannelcapability_edch()
    {
	return (PhysicalChannelCapability_edch_r6)mComponents[0];
    }
    
    public void setPhysicalchannelcapability_edch(PhysicalChannelCapability_edch_r6 physicalchannelcapability_edch)
    {
	mComponents[0] = physicalchannelcapability_edch;
    }
    
    
    // Methods for field "deviceType"
    public DeviceType getDeviceType()
    {
	return (DeviceType)mComponents[1];
    }
    
    public void setDeviceType(DeviceType deviceType)
    {
	mComponents[1] = deviceType;
    }
    
    public boolean hasDeviceType()
    {
	return componentIsPresent(1);
    }
    
    public void deleteDeviceType()
    {
	setComponentAbsent(1);
    }
    
    
    
    /**
     * Define the ASN1 Type DeviceType from ASN1 Module InformationElements.
     * @see Enumerated
     */
    public static final class DeviceType extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private DeviceType()
	{
	    super(cFirstNumber);
	}
	
	protected DeviceType(long value)
	{
	    super(value);
	}
	
	// Named list definitions.
	public static final DeviceType doesNotBenefitFromBatteryConsumptionOptimisation =
	    new DeviceType(0);
	private final static DeviceType cNamedNumbers[] = {
	     doesNotBenefitFromBatteryConsumptionOptimisation
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
	
	public static DeviceType valueOf(long value)
	{
	    return (DeviceType)doesNotBenefitFromBatteryConsumptionOptimisation.lookupValue(value);
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final EnumeratedInfo c_typeinfo = new EnumeratedInfo (
	    new Tags (
		new short[] {
		    (short)0x8001
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"UE_RadioAccessCapability_v690ext$DeviceType"
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
			"doesNotBenefitFromBatteryConsumptionOptimisation",
			0
		    )
		}
	    ),
	    0,
	    doesNotBenefitFromBatteryConsumptionOptimisation
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' DeviceType object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' DeviceType object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for DeviceType

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
	    "UE_RadioAccessCapability_v690ext"
	),
	new QName (
	    "InformationElements",
	    "UE-RadioAccessCapability-v690ext"
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
				"PhysicalChannelCapability_edch_r6"
			    ),
			    new QName (
				"InformationElements",
				"PhysicalChannelCapability-edch-r6"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "PhysicalChannelCapability_edch_r6"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "PhysicalChannelCapability_edch_r6"
				)
			    ),
			    0
			)
		    ),
		    "physicalchannelcapability-edch",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "UE_RadioAccessCapability_v690ext$DeviceType"
			)
		    ),
		    "deviceType",
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
     * Get the type descriptor (TypeInfo) of 'this' UE_RadioAccessCapability_v690ext object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UE_RadioAccessCapability_v690ext object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UE_RadioAccessCapability_v690ext
