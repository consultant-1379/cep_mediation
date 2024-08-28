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
 * Define the ASN1 Type UE_RadioAccessCapability_v860ext_IEs from ASN1 Module InformationElements.
 * @see Sequence
 */

public class UE_RadioAccessCapability_v860ext_IEs extends Sequence {
    
    /**
     * The default constructor.
     */
    public UE_RadioAccessCapability_v860ext_IEs()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public UE_RadioAccessCapability_v860ext_IEs(RF_Capability_v860ext rf_Capability, 
		    PhysicalChannelCapability_v860ext physicalChannelCapability, 
		    MultiModeRAT_Capability_v860ext multiModeRAT_Capability, 
		    UE_PositioningCapability_v860ext ue_PositioningCapability, 
		    MeasurementCapability_v860ext measurementCapability, 
		    MeasurementCapabilityTDD measurementCapabilityTDD, 
		    SupportOfCommonEDCH supportOfCommonEDCH, 
		    SupportOfMACiis supportOfMACiis, 
		    SupportOfSPSOperation supportOfSPSOperation, 
		    SupportOfControlChannelDRXOperation supportOfControlChannelDRXOperation, 
		    SupportOfCSG supportOfCSG, 
		    UE_RadioAccessCapabBandFDDList3 ue_RadioAccessCapabBandFDDList3)
    {
	setRf_Capability(rf_Capability);
	setPhysicalChannelCapability(physicalChannelCapability);
	setMultiModeRAT_Capability(multiModeRAT_Capability);
	setUe_PositioningCapability(ue_PositioningCapability);
	setMeasurementCapability(measurementCapability);
	setMeasurementCapabilityTDD(measurementCapabilityTDD);
	setSupportOfCommonEDCH(supportOfCommonEDCH);
	setSupportOfMACiis(supportOfMACiis);
	setSupportOfSPSOperation(supportOfSPSOperation);
	setSupportOfControlChannelDRXOperation(supportOfControlChannelDRXOperation);
	setSupportOfCSG(supportOfCSG);
	setUe_RadioAccessCapabBandFDDList3(ue_RadioAccessCapabBandFDDList3);
    }
    
    /**
     * Construct with required components.
     */
    public UE_RadioAccessCapability_v860ext_IEs(PhysicalChannelCapability_v860ext physicalChannelCapability, 
		    MultiModeRAT_Capability_v860ext multiModeRAT_Capability, 
		    UE_PositioningCapability_v860ext ue_PositioningCapability)
    {
	setPhysicalChannelCapability(physicalChannelCapability);
	setMultiModeRAT_Capability(multiModeRAT_Capability);
	setUe_PositioningCapability(ue_PositioningCapability);
    }
    
    public void initComponents()
    {
	mComponents[0] = new RF_Capability_v860ext();
	mComponents[1] = new PhysicalChannelCapability_v860ext();
	mComponents[2] = new MultiModeRAT_Capability_v860ext();
	mComponents[3] = new UE_PositioningCapability_v860ext();
	mComponents[4] = new MeasurementCapability_v860ext();
	mComponents[5] = new MeasurementCapabilityTDD();
	mComponents[6] = SupportOfCommonEDCH._true;
	mComponents[7] = SupportOfMACiis._true;
	mComponents[8] = SupportOfSPSOperation._true;
	mComponents[9] = SupportOfControlChannelDRXOperation._true;
	mComponents[10] = SupportOfCSG._true;
	mComponents[11] = new UE_RadioAccessCapabBandFDDList3();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[12];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new RF_Capability_v860ext();
	    case 1:
		return new PhysicalChannelCapability_v860ext();
	    case 2:
		return new MultiModeRAT_Capability_v860ext();
	    case 3:
		return new UE_PositioningCapability_v860ext();
	    case 4:
		return new MeasurementCapability_v860ext();
	    case 5:
		return new MeasurementCapabilityTDD();
	    case 6:
		return SupportOfCommonEDCH._true;
	    case 7:
		return SupportOfMACiis._true;
	    case 8:
		return SupportOfSPSOperation._true;
	    case 9:
		return SupportOfControlChannelDRXOperation._true;
	    case 10:
		return SupportOfCSG._true;
	    case 11:
		return new UE_RadioAccessCapabBandFDDList3();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "rf_Capability"
    public RF_Capability_v860ext getRf_Capability()
    {
	return (RF_Capability_v860ext)mComponents[0];
    }
    
    public void setRf_Capability(RF_Capability_v860ext rf_Capability)
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
    public PhysicalChannelCapability_v860ext getPhysicalChannelCapability()
    {
	return (PhysicalChannelCapability_v860ext)mComponents[1];
    }
    
    public void setPhysicalChannelCapability(PhysicalChannelCapability_v860ext physicalChannelCapability)
    {
	mComponents[1] = physicalChannelCapability;
    }
    
    
    // Methods for field "multiModeRAT_Capability"
    public MultiModeRAT_Capability_v860ext getMultiModeRAT_Capability()
    {
	return (MultiModeRAT_Capability_v860ext)mComponents[2];
    }
    
    public void setMultiModeRAT_Capability(MultiModeRAT_Capability_v860ext multiModeRAT_Capability)
    {
	mComponents[2] = multiModeRAT_Capability;
    }
    
    
    // Methods for field "ue_PositioningCapability"
    public UE_PositioningCapability_v860ext getUe_PositioningCapability()
    {
	return (UE_PositioningCapability_v860ext)mComponents[3];
    }
    
    public void setUe_PositioningCapability(UE_PositioningCapability_v860ext ue_PositioningCapability)
    {
	mComponents[3] = ue_PositioningCapability;
    }
    
    
    // Methods for field "measurementCapability"
    public MeasurementCapability_v860ext getMeasurementCapability()
    {
	return (MeasurementCapability_v860ext)mComponents[4];
    }
    
    public void setMeasurementCapability(MeasurementCapability_v860ext measurementCapability)
    {
	mComponents[4] = measurementCapability;
    }
    
    public boolean hasMeasurementCapability()
    {
	return componentIsPresent(4);
    }
    
    public void deleteMeasurementCapability()
    {
	setComponentAbsent(4);
    }
    
    
    // Methods for field "measurementCapabilityTDD"
    public MeasurementCapabilityTDD getMeasurementCapabilityTDD()
    {
	return (MeasurementCapabilityTDD)mComponents[5];
    }
    
    public void setMeasurementCapabilityTDD(MeasurementCapabilityTDD measurementCapabilityTDD)
    {
	mComponents[5] = measurementCapabilityTDD;
    }
    
    public boolean hasMeasurementCapabilityTDD()
    {
	return componentIsPresent(5);
    }
    
    public void deleteMeasurementCapabilityTDD()
    {
	setComponentAbsent(5);
    }
    
    
    // Methods for field "supportOfCommonEDCH"
    public SupportOfCommonEDCH getSupportOfCommonEDCH()
    {
	return (SupportOfCommonEDCH)mComponents[6];
    }
    
    public void setSupportOfCommonEDCH(SupportOfCommonEDCH supportOfCommonEDCH)
    {
	mComponents[6] = supportOfCommonEDCH;
    }
    
    public boolean hasSupportOfCommonEDCH()
    {
	return componentIsPresent(6);
    }
    
    public void deleteSupportOfCommonEDCH()
    {
	setComponentAbsent(6);
    }
    
    
    
    /**
     * Define the ASN1 Type SupportOfCommonEDCH from ASN1 Module InformationElements.
     * @see Enumerated
     */
    public static final class SupportOfCommonEDCH extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private SupportOfCommonEDCH()
	{
	    super(cFirstNumber);
	}
	
	protected SupportOfCommonEDCH(long value)
	{
	    super(value);
	}
	
	// Named list definitions.
	public static final SupportOfCommonEDCH _true =
	    new SupportOfCommonEDCH(0);
	private final static SupportOfCommonEDCH cNamedNumbers[] = {
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
	
	public static SupportOfCommonEDCH valueOf(long value)
	{
	    return (SupportOfCommonEDCH)_true.lookupValue(value);
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final EnumeratedInfo c_typeinfo = new EnumeratedInfo (
	    new Tags (
		new short[] {
		    (short)0x8006
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"UE_RadioAccessCapability_v860ext_IEs$SupportOfCommonEDCH"
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
	 * Get the type descriptor (TypeInfo) of 'this' SupportOfCommonEDCH object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' SupportOfCommonEDCH object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for SupportOfCommonEDCH

    // Methods for field "supportOfMACiis"
    public SupportOfMACiis getSupportOfMACiis()
    {
	return (SupportOfMACiis)mComponents[7];
    }
    
    public void setSupportOfMACiis(SupportOfMACiis supportOfMACiis)
    {
	mComponents[7] = supportOfMACiis;
    }
    
    public boolean hasSupportOfMACiis()
    {
	return componentIsPresent(7);
    }
    
    public void deleteSupportOfMACiis()
    {
	setComponentAbsent(7);
    }
    
    
    
    /**
     * Define the ASN1 Type SupportOfMACiis from ASN1 Module InformationElements.
     * @see Enumerated
     */
    public static final class SupportOfMACiis extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private SupportOfMACiis()
	{
	    super(cFirstNumber);
	}
	
	protected SupportOfMACiis(long value)
	{
	    super(value);
	}
	
	// Named list definitions.
	public static final SupportOfMACiis _true =
	    new SupportOfMACiis(0);
	private final static SupportOfMACiis cNamedNumbers[] = {
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
	
	public static SupportOfMACiis valueOf(long value)
	{
	    return (SupportOfMACiis)_true.lookupValue(value);
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
		"UE_RadioAccessCapability_v860ext_IEs$SupportOfMACiis"
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
	 * Get the type descriptor (TypeInfo) of 'this' SupportOfMACiis object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' SupportOfMACiis object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for SupportOfMACiis

    // Methods for field "supportOfSPSOperation"
    public SupportOfSPSOperation getSupportOfSPSOperation()
    {
	return (SupportOfSPSOperation)mComponents[8];
    }
    
    public void setSupportOfSPSOperation(SupportOfSPSOperation supportOfSPSOperation)
    {
	mComponents[8] = supportOfSPSOperation;
    }
    
    public boolean hasSupportOfSPSOperation()
    {
	return componentIsPresent(8);
    }
    
    public void deleteSupportOfSPSOperation()
    {
	setComponentAbsent(8);
    }
    
    
    
    /**
     * Define the ASN1 Type SupportOfSPSOperation from ASN1 Module InformationElements.
     * @see Enumerated
     */
    public static final class SupportOfSPSOperation extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private SupportOfSPSOperation()
	{
	    super(cFirstNumber);
	}
	
	protected SupportOfSPSOperation(long value)
	{
	    super(value);
	}
	
	// Named list definitions.
	public static final SupportOfSPSOperation _true =
	    new SupportOfSPSOperation(0);
	private final static SupportOfSPSOperation cNamedNumbers[] = {
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
	
	public static SupportOfSPSOperation valueOf(long value)
	{
	    return (SupportOfSPSOperation)_true.lookupValue(value);
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final EnumeratedInfo c_typeinfo = new EnumeratedInfo (
	    new Tags (
		new short[] {
		    (short)0x8008
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"UE_RadioAccessCapability_v860ext_IEs$SupportOfSPSOperation"
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
	 * Get the type descriptor (TypeInfo) of 'this' SupportOfSPSOperation object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' SupportOfSPSOperation object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for SupportOfSPSOperation

    // Methods for field "supportOfControlChannelDRXOperation"
    public SupportOfControlChannelDRXOperation getSupportOfControlChannelDRXOperation()
    {
	return (SupportOfControlChannelDRXOperation)mComponents[9];
    }
    
    public void setSupportOfControlChannelDRXOperation(SupportOfControlChannelDRXOperation supportOfControlChannelDRXOperation)
    {
	mComponents[9] = supportOfControlChannelDRXOperation;
    }
    
    public boolean hasSupportOfControlChannelDRXOperation()
    {
	return componentIsPresent(9);
    }
    
    public void deleteSupportOfControlChannelDRXOperation()
    {
	setComponentAbsent(9);
    }
    
    
    
    /**
     * Define the ASN1 Type SupportOfControlChannelDRXOperation from ASN1 Module InformationElements.
     * @see Enumerated
     */
    public static final class SupportOfControlChannelDRXOperation extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private SupportOfControlChannelDRXOperation()
	{
	    super(cFirstNumber);
	}
	
	protected SupportOfControlChannelDRXOperation(long value)
	{
	    super(value);
	}
	
	// Named list definitions.
	public static final SupportOfControlChannelDRXOperation _true =
	    new SupportOfControlChannelDRXOperation(0);
	private final static SupportOfControlChannelDRXOperation cNamedNumbers[] = {
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
	
	public static SupportOfControlChannelDRXOperation valueOf(long value)
	{
	    return (SupportOfControlChannelDRXOperation)_true.lookupValue(value);
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final EnumeratedInfo c_typeinfo = new EnumeratedInfo (
	    new Tags (
		new short[] {
		    (short)0x8009
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"UE_RadioAccessCapability_v860ext_IEs$SupportOfControlChannelDRXOperation"
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
	 * Get the type descriptor (TypeInfo) of 'this' SupportOfControlChannelDRXOperation object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' SupportOfControlChannelDRXOperation object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for SupportOfControlChannelDRXOperation

    // Methods for field "supportOfCSG"
    public SupportOfCSG getSupportOfCSG()
    {
	return (SupportOfCSG)mComponents[10];
    }
    
    public void setSupportOfCSG(SupportOfCSG supportOfCSG)
    {
	mComponents[10] = supportOfCSG;
    }
    
    public boolean hasSupportOfCSG()
    {
	return componentIsPresent(10);
    }
    
    public void deleteSupportOfCSG()
    {
	setComponentAbsent(10);
    }
    
    
    
    /**
     * Define the ASN1 Type SupportOfCSG from ASN1 Module InformationElements.
     * @see Enumerated
     */
    public static final class SupportOfCSG extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private SupportOfCSG()
	{
	    super(cFirstNumber);
	}
	
	protected SupportOfCSG(long value)
	{
	    super(value);
	}
	
	// Named list definitions.
	public static final SupportOfCSG _true =
	    new SupportOfCSG(0);
	private final static SupportOfCSG cNamedNumbers[] = {
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
	
	public static SupportOfCSG valueOf(long value)
	{
	    return (SupportOfCSG)_true.lookupValue(value);
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final EnumeratedInfo c_typeinfo = new EnumeratedInfo (
	    new Tags (
		new short[] {
		    (short)0x800a
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"UE_RadioAccessCapability_v860ext_IEs$SupportOfCSG"
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
	 * Get the type descriptor (TypeInfo) of 'this' SupportOfCSG object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' SupportOfCSG object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for SupportOfCSG

    // Methods for field "ue_RadioAccessCapabBandFDDList3"
    public UE_RadioAccessCapabBandFDDList3 getUe_RadioAccessCapabBandFDDList3()
    {
	return (UE_RadioAccessCapabBandFDDList3)mComponents[11];
    }
    
    public void setUe_RadioAccessCapabBandFDDList3(UE_RadioAccessCapabBandFDDList3 ue_RadioAccessCapabBandFDDList3)
    {
	mComponents[11] = ue_RadioAccessCapabBandFDDList3;
    }
    
    public boolean hasUe_RadioAccessCapabBandFDDList3()
    {
	return componentIsPresent(11);
    }
    
    public void deleteUe_RadioAccessCapabBandFDDList3()
    {
	setComponentAbsent(11);
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
	    "UE_RadioAccessCapability_v860ext_IEs"
	),
	new QName (
	    "InformationElements",
	    "UE-RadioAccessCapability-v860ext-IEs"
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
				"RF_Capability_v860ext"
			    ),
			    new QName (
				"InformationElements",
				"RF-Capability-v860ext"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "RF_Capability_v860ext"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "RF_Capability_v860ext"
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
				"PhysicalChannelCapability_v860ext"
			    ),
			    new QName (
				"InformationElements",
				"PhysicalChannelCapability-v860ext"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "PhysicalChannelCapability_v860ext"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "PhysicalChannelCapability_v860ext"
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
				"MultiModeRAT_Capability_v860ext"
			    ),
			    new QName (
				"InformationElements",
				"MultiModeRAT-Capability-v860ext"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "MultiModeRAT_Capability_v860ext"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "MultiModeRAT_Capability_v860ext"
				)
			    ),
			    0
			)
		    ),
		    "multiModeRAT-Capability",
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
				"UE_PositioningCapability_v860ext"
			    ),
			    new QName (
				"InformationElements",
				"UE-PositioningCapability-v860ext"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UE_PositioningCapability_v860ext"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "UE_PositioningCapability_v860ext"
				)
			    ),
			    0
			)
		    ),
		    "ue-PositioningCapability",
		    3,
		    2,
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
				"MeasurementCapability_v860ext"
			    ),
			    new QName (
				"InformationElements",
				"MeasurementCapability-v860ext"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "MeasurementCapability_v860ext"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "MeasurementCapability_v860ext"
				)
			    ),
			    0
			)
		    ),
		    "measurementCapability",
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
				"MeasurementCapabilityTDD"
			    ),
			    new QName (
				"InformationElements",
				"MeasurementCapabilityTDD"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "MeasurementCapabilityTDD"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "MeasurementCapabilityTDD"
				)
			    ),
			    0
			)
		    ),
		    "measurementCapabilityTDD",
		    5,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "UE_RadioAccessCapability_v860ext_IEs$SupportOfCommonEDCH"
			)
		    ),
		    "supportOfCommonEDCH",
		    6,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "UE_RadioAccessCapability_v860ext_IEs$SupportOfMACiis"
			)
		    ),
		    "supportOfMACiis",
		    7,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "UE_RadioAccessCapability_v860ext_IEs$SupportOfSPSOperation"
			)
		    ),
		    "supportOfSPSOperation",
		    8,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "UE_RadioAccessCapability_v860ext_IEs$SupportOfControlChannelDRXOperation"
			)
		    ),
		    "supportOfControlChannelDRXOperation",
		    9,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "UE_RadioAccessCapability_v860ext_IEs$SupportOfCSG"
			)
		    ),
		    "supportOfCSG",
		    10,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x800b
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"UE_RadioAccessCapabBandFDDList3"
			    ),
			    new QName (
				"InformationElements",
				"UE-RadioAccessCapabBandFDDList3"
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
				    "UE_RadioAccessCapabBandFDD3"
				)
			    )
			)
		    ),
		    "ue-RadioAccessCapabBandFDDList3",
		    11,
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
			new TagDecoderElement((short)0x8003, 3)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6),
			new TagDecoderElement((short)0x8007, 7),
			new TagDecoderElement((short)0x8008, 8),
			new TagDecoderElement((short)0x8009, 9),
			new TagDecoderElement((short)0x800a, 10),
			new TagDecoderElement((short)0x800b, 11)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6),
			new TagDecoderElement((short)0x8007, 7),
			new TagDecoderElement((short)0x8008, 8),
			new TagDecoderElement((short)0x8009, 9),
			new TagDecoderElement((short)0x800a, 10),
			new TagDecoderElement((short)0x800b, 11)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8006, 6),
			new TagDecoderElement((short)0x8007, 7),
			new TagDecoderElement((short)0x8008, 8),
			new TagDecoderElement((short)0x8009, 9),
			new TagDecoderElement((short)0x800a, 10),
			new TagDecoderElement((short)0x800b, 11)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8007, 7),
			new TagDecoderElement((short)0x8008, 8),
			new TagDecoderElement((short)0x8009, 9),
			new TagDecoderElement((short)0x800a, 10),
			new TagDecoderElement((short)0x800b, 11)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8008, 8),
			new TagDecoderElement((short)0x8009, 9),
			new TagDecoderElement((short)0x800a, 10),
			new TagDecoderElement((short)0x800b, 11)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8009, 9),
			new TagDecoderElement((short)0x800a, 10),
			new TagDecoderElement((short)0x800b, 11)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800a, 10),
			new TagDecoderElement((short)0x800b, 11)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800b, 11)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' UE_RadioAccessCapability_v860ext_IEs object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UE_RadioAccessCapability_v860ext_IEs object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UE_RadioAccessCapability_v860ext_IEs
