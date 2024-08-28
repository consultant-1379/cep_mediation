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
 * Define the ASN1 Type UE_RadioAccessCapability_va40ext_IEs from ASN1 Module InformationElements.
 * @see Sequence
 */

public class UE_RadioAccessCapability_va40ext_IEs extends Sequence {
    
    /**
     * The default constructor.
     */
    public UE_RadioAccessCapability_va40ext_IEs()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public UE_RadioAccessCapability_va40ext_IEs(UE_RadioAccessCapabBandCombList_va40ext ue_RadioAccessCapabBandCombList_va40ext, 
		    PhysicalChannelCapability_va40ext physicalChannelCapability, 
		    RLC_Capability_va40ext rlc_Capability, 
		    MeasurementCapability_va40ext measurementCapability, 
		    SupportOfMUMIMO supportOfMUMIMO, 
		    SupportForDualCellMimoInDifferentBands supportForDualCellMimoInDifferentBands, 
		    UE_BasedNetworkPerformanceMeasurementsParameters ue_BasedNetworkPerformanceMeasurementsParameters, 
		    SupportOfUTRANANR supportOfUTRANANR, 
		    UE_RadioAccessCapabBandFDDList4 ue_RadioAccessCapabBandFDDList4)
    {
	setUe_RadioAccessCapabBandCombList_va40ext(ue_RadioAccessCapabBandCombList_va40ext);
	setPhysicalChannelCapability(physicalChannelCapability);
	setRlc_Capability(rlc_Capability);
	setMeasurementCapability(measurementCapability);
	setSupportOfMUMIMO(supportOfMUMIMO);
	setSupportForDualCellMimoInDifferentBands(supportForDualCellMimoInDifferentBands);
	setUe_BasedNetworkPerformanceMeasurementsParameters(ue_BasedNetworkPerformanceMeasurementsParameters);
	setSupportOfUTRANANR(supportOfUTRANANR);
	setUe_RadioAccessCapabBandFDDList4(ue_RadioAccessCapabBandFDDList4);
    }
    
    /**
     * Construct with required components.
     */
    public UE_RadioAccessCapability_va40ext_IEs(PhysicalChannelCapability_va40ext physicalChannelCapability, 
		    RLC_Capability_va40ext rlc_Capability)
    {
	setPhysicalChannelCapability(physicalChannelCapability);
	setRlc_Capability(rlc_Capability);
    }
    
    public void initComponents()
    {
	mComponents[0] = new UE_RadioAccessCapabBandCombList_va40ext();
	mComponents[1] = new PhysicalChannelCapability_va40ext();
	mComponents[2] = new RLC_Capability_va40ext();
	mComponents[3] = new MeasurementCapability_va40ext();
	mComponents[4] = SupportOfMUMIMO.uplink;
	mComponents[5] = SupportForDualCellMimoInDifferentBands._true;
	mComponents[6] = new UE_BasedNetworkPerformanceMeasurementsParameters();
	mComponents[7] = SupportOfUTRANANR._true;
	mComponents[8] = new UE_RadioAccessCapabBandFDDList4();
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
		return new UE_RadioAccessCapabBandCombList_va40ext();
	    case 1:
		return new PhysicalChannelCapability_va40ext();
	    case 2:
		return new RLC_Capability_va40ext();
	    case 3:
		return new MeasurementCapability_va40ext();
	    case 4:
		return SupportOfMUMIMO.uplink;
	    case 5:
		return SupportForDualCellMimoInDifferentBands._true;
	    case 6:
		return new UE_BasedNetworkPerformanceMeasurementsParameters();
	    case 7:
		return SupportOfUTRANANR._true;
	    case 8:
		return new UE_RadioAccessCapabBandFDDList4();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "ue_RadioAccessCapabBandCombList_va40ext"
    public UE_RadioAccessCapabBandCombList_va40ext getUe_RadioAccessCapabBandCombList_va40ext()
    {
	return (UE_RadioAccessCapabBandCombList_va40ext)mComponents[0];
    }
    
    public void setUe_RadioAccessCapabBandCombList_va40ext(UE_RadioAccessCapabBandCombList_va40ext ue_RadioAccessCapabBandCombList_va40ext)
    {
	mComponents[0] = ue_RadioAccessCapabBandCombList_va40ext;
    }
    
    public boolean hasUe_RadioAccessCapabBandCombList_va40ext()
    {
	return componentIsPresent(0);
    }
    
    public void deleteUe_RadioAccessCapabBandCombList_va40ext()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "physicalChannelCapability"
    public PhysicalChannelCapability_va40ext getPhysicalChannelCapability()
    {
	return (PhysicalChannelCapability_va40ext)mComponents[1];
    }
    
    public void setPhysicalChannelCapability(PhysicalChannelCapability_va40ext physicalChannelCapability)
    {
	mComponents[1] = physicalChannelCapability;
    }
    
    
    // Methods for field "rlc_Capability"
    public RLC_Capability_va40ext getRlc_Capability()
    {
	return (RLC_Capability_va40ext)mComponents[2];
    }
    
    public void setRlc_Capability(RLC_Capability_va40ext rlc_Capability)
    {
	mComponents[2] = rlc_Capability;
    }
    
    
    // Methods for field "measurementCapability"
    public MeasurementCapability_va40ext getMeasurementCapability()
    {
	return (MeasurementCapability_va40ext)mComponents[3];
    }
    
    public void setMeasurementCapability(MeasurementCapability_va40ext measurementCapability)
    {
	mComponents[3] = measurementCapability;
    }
    
    public boolean hasMeasurementCapability()
    {
	return componentIsPresent(3);
    }
    
    public void deleteMeasurementCapability()
    {
	setComponentAbsent(3);
    }
    
    
    // Methods for field "supportOfMUMIMO"
    public SupportOfMUMIMO getSupportOfMUMIMO()
    {
	return (SupportOfMUMIMO)mComponents[4];
    }
    
    public void setSupportOfMUMIMO(SupportOfMUMIMO supportOfMUMIMO)
    {
	mComponents[4] = supportOfMUMIMO;
    }
    
    public boolean hasSupportOfMUMIMO()
    {
	return componentIsPresent(4);
    }
    
    public void deleteSupportOfMUMIMO()
    {
	setComponentAbsent(4);
    }
    
    
    
    /**
     * Define the ASN1 Type SupportOfMUMIMO from ASN1 Module InformationElements.
     * @see Enumerated
     */
    public static final class SupportOfMUMIMO extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private SupportOfMUMIMO()
	{
	    super(cFirstNumber);
	}
	
	protected SupportOfMUMIMO(long value)
	{
	    super(value);
	}
	
	// Named list definitions.
	public static final SupportOfMUMIMO uplink =
	    new SupportOfMUMIMO(0);
	public static final SupportOfMUMIMO uplink_and_downlink =
	    new SupportOfMUMIMO(1);
	private final static SupportOfMUMIMO cNamedNumbers[] = {
	     uplink, 
	     uplink_and_downlink
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
	
	public static SupportOfMUMIMO valueOf(long value)
	{
	    return (SupportOfMUMIMO)uplink.lookupValue(value);
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
		"rrc.informationelements",
		"UE_RadioAccessCapability_va40ext_IEs$SupportOfMUMIMO"
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
			"uplink",
			0
		    ),
		    new MemberListElement (
			"uplink-and-downlink",
			1
		    )
		}
	    ),
	    0,
	    uplink
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' SupportOfMUMIMO object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' SupportOfMUMIMO object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for SupportOfMUMIMO

    // Methods for field "supportForDualCellMimoInDifferentBands"
    public SupportForDualCellMimoInDifferentBands getSupportForDualCellMimoInDifferentBands()
    {
	return (SupportForDualCellMimoInDifferentBands)mComponents[5];
    }
    
    public void setSupportForDualCellMimoInDifferentBands(SupportForDualCellMimoInDifferentBands supportForDualCellMimoInDifferentBands)
    {
	mComponents[5] = supportForDualCellMimoInDifferentBands;
    }
    
    public boolean hasSupportForDualCellMimoInDifferentBands()
    {
	return componentIsPresent(5);
    }
    
    public void deleteSupportForDualCellMimoInDifferentBands()
    {
	setComponentAbsent(5);
    }
    
    
    
    /**
     * Define the ASN1 Type SupportForDualCellMimoInDifferentBands from ASN1 Module InformationElements.
     * @see Enumerated
     */
    public static final class SupportForDualCellMimoInDifferentBands extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private SupportForDualCellMimoInDifferentBands()
	{
	    super(cFirstNumber);
	}
	
	protected SupportForDualCellMimoInDifferentBands(long value)
	{
	    super(value);
	}
	
	// Named list definitions.
	public static final SupportForDualCellMimoInDifferentBands _true =
	    new SupportForDualCellMimoInDifferentBands(0);
	private final static SupportForDualCellMimoInDifferentBands cNamedNumbers[] = {
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
	
	public static SupportForDualCellMimoInDifferentBands valueOf(long value)
	{
	    return (SupportForDualCellMimoInDifferentBands)_true.lookupValue(value);
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
		"rrc.informationelements",
		"UE_RadioAccessCapability_va40ext_IEs$SupportForDualCellMimoInDifferentBands"
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
	 * Get the type descriptor (TypeInfo) of 'this' SupportForDualCellMimoInDifferentBands object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' SupportForDualCellMimoInDifferentBands object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for SupportForDualCellMimoInDifferentBands

    // Methods for field "ue_BasedNetworkPerformanceMeasurementsParameters"
    public UE_BasedNetworkPerformanceMeasurementsParameters getUe_BasedNetworkPerformanceMeasurementsParameters()
    {
	return (UE_BasedNetworkPerformanceMeasurementsParameters)mComponents[6];
    }
    
    public void setUe_BasedNetworkPerformanceMeasurementsParameters(UE_BasedNetworkPerformanceMeasurementsParameters ue_BasedNetworkPerformanceMeasurementsParameters)
    {
	mComponents[6] = ue_BasedNetworkPerformanceMeasurementsParameters;
    }
    
    public boolean hasUe_BasedNetworkPerformanceMeasurementsParameters()
    {
	return componentIsPresent(6);
    }
    
    public void deleteUe_BasedNetworkPerformanceMeasurementsParameters()
    {
	setComponentAbsent(6);
    }
    
    
    // Methods for field "supportOfUTRANANR"
    public SupportOfUTRANANR getSupportOfUTRANANR()
    {
	return (SupportOfUTRANANR)mComponents[7];
    }
    
    public void setSupportOfUTRANANR(SupportOfUTRANANR supportOfUTRANANR)
    {
	mComponents[7] = supportOfUTRANANR;
    }
    
    public boolean hasSupportOfUTRANANR()
    {
	return componentIsPresent(7);
    }
    
    public void deleteSupportOfUTRANANR()
    {
	setComponentAbsent(7);
    }
    
    
    
    /**
     * Define the ASN1 Type SupportOfUTRANANR from ASN1 Module InformationElements.
     * @see Enumerated
     */
    public static final class SupportOfUTRANANR extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private SupportOfUTRANANR()
	{
	    super(cFirstNumber);
	}
	
	protected SupportOfUTRANANR(long value)
	{
	    super(value);
	}
	
	// Named list definitions.
	public static final SupportOfUTRANANR _true =
	    new SupportOfUTRANANR(0);
	private final static SupportOfUTRANANR cNamedNumbers[] = {
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
	
	public static SupportOfUTRANANR valueOf(long value)
	{
	    return (SupportOfUTRANANR)_true.lookupValue(value);
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final EnumeratedInfo c_typeinfo = new EnumeratedInfo (
	    new Tags (
		new short[] {
		    (short)0x8007
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"UE_RadioAccessCapability_va40ext_IEs$SupportOfUTRANANR"
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
	 * Get the type descriptor (TypeInfo) of 'this' SupportOfUTRANANR object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' SupportOfUTRANANR object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for SupportOfUTRANANR

    // Methods for field "ue_RadioAccessCapabBandFDDList4"
    public UE_RadioAccessCapabBandFDDList4 getUe_RadioAccessCapabBandFDDList4()
    {
	return (UE_RadioAccessCapabBandFDDList4)mComponents[8];
    }
    
    public void setUe_RadioAccessCapabBandFDDList4(UE_RadioAccessCapabBandFDDList4 ue_RadioAccessCapabBandFDDList4)
    {
	mComponents[8] = ue_RadioAccessCapabBandFDDList4;
    }
    
    public boolean hasUe_RadioAccessCapabBandFDDList4()
    {
	return componentIsPresent(8);
    }
    
    public void deleteUe_RadioAccessCapabBandFDDList4()
    {
	setComponentAbsent(8);
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
	    "UE_RadioAccessCapability_va40ext_IEs"
	),
	new QName (
	    "InformationElements",
	    "UE-RadioAccessCapability-va40ext-IEs"
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
				"UE_RadioAccessCapabBandCombList_va40ext"
			    ),
			    new QName (
				"InformationElements",
				"UE-RadioAccessCapabBandCombList-va40ext"
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
				    "SupportedCarrierCombination"
				)
			    )
			)
		    ),
		    "ue-RadioAccessCapabBandCombList-va40ext",
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
				"PhysicalChannelCapability_va40ext"
			    ),
			    new QName (
				"InformationElements",
				"PhysicalChannelCapability-va40ext"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "PhysicalChannelCapability_va40ext"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "PhysicalChannelCapability_va40ext"
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
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"RLC_Capability_va40ext"
			    ),
			    new QName (
				"InformationElements",
				"RLC-Capability-va40ext"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "RLC_Capability_va40ext"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "RLC_Capability_va40ext"
				)
			    ),
			    0
			)
		    ),
		    "rlc-Capability",
		    2,
		    2,
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
				"MeasurementCapability_va40ext"
			    ),
			    new QName (
				"InformationElements",
				"MeasurementCapability-va40ext"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "MeasurementCapability_va40ext"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "MeasurementCapability_va40ext"
				)
			    ),
			    0
			)
		    ),
		    "measurementCapability",
		    3,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "UE_RadioAccessCapability_va40ext_IEs$SupportOfMUMIMO"
			)
		    ),
		    "supportOfMUMIMO",
		    4,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "UE_RadioAccessCapability_va40ext_IEs$SupportForDualCellMimoInDifferentBands"
			)
		    ),
		    "supportForDualCellMimoInDifferentBands",
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
				"rrc.informationelements",
				"UE_BasedNetworkPerformanceMeasurementsParameters"
			    ),
			    new QName (
				"InformationElements",
				"UE-BasedNetworkPerformanceMeasurementsParameters"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UE_BasedNetworkPerformanceMeasurementsParameters"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "UE_BasedNetworkPerformanceMeasurementsParameters"
				)
			    ),
			    0
			)
		    ),
		    "ue-BasedNetworkPerformanceMeasurementsParameters",
		    6,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "UE_RadioAccessCapability_va40ext_IEs$SupportOfUTRANANR"
			)
		    ),
		    "supportOfUTRANANR",
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
				"UE_RadioAccessCapabBandFDDList4"
			    ),
			    new QName (
				"InformationElements",
				"UE-RadioAccessCapabBandFDDList4"
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
				    "UE_RadioAccessCapabBandFDD4"
				)
			    )
			)
		    ),
		    "ue-RadioAccessCapabBandFDDList4",
		    8,
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
			new TagDecoderElement((short)0x8002, 2)
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
     * Get the type descriptor (TypeInfo) of 'this' UE_RadioAccessCapability_va40ext_IEs object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UE_RadioAccessCapability_va40ext_IEs object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UE_RadioAccessCapability_va40ext_IEs
