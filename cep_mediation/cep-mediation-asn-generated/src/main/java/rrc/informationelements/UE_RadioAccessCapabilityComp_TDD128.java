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
 * Define the ASN1 Type UE_RadioAccessCapabilityComp_TDD128 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class UE_RadioAccessCapabilityComp_TDD128 extends Sequence {
    
    /**
     * The default constructor.
     */
    public UE_RadioAccessCapabilityComp_TDD128()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public UE_RadioAccessCapabilityComp_TDD128(RadioFrequencyBandTDDextList tdd128RF_Capability, 
		    SupportOfSFModeForHSPDSCHDualStream supportOfSFModeForHSPDSCHDualStream, 
		    SupportOfCommonEDCH supportOfCommonEDCH, 
		    SupportOfMACiis supportOfMACiis, 
		    SupportOfSPSOperation supportOfSPSOperation, 
		    SupportOfControlChannelDRXOperation supportOfControlChannelDRXOperation)
    {
	setTdd128RF_Capability(tdd128RF_Capability);
	setSupportOfSFModeForHSPDSCHDualStream(supportOfSFModeForHSPDSCHDualStream);
	setSupportOfCommonEDCH(supportOfCommonEDCH);
	setSupportOfMACiis(supportOfMACiis);
	setSupportOfSPSOperation(supportOfSPSOperation);
	setSupportOfControlChannelDRXOperation(supportOfControlChannelDRXOperation);
    }
    
    public void initComponents()
    {
	mComponents[0] = new RadioFrequencyBandTDDextList();
	mComponents[1] = SupportOfSFModeForHSPDSCHDualStream.sf1;
	mComponents[2] = SupportOfCommonEDCH._true;
	mComponents[3] = SupportOfMACiis._true;
	mComponents[4] = SupportOfSPSOperation._true;
	mComponents[5] = SupportOfControlChannelDRXOperation._true;
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
		return new RadioFrequencyBandTDDextList();
	    case 1:
		return SupportOfSFModeForHSPDSCHDualStream.sf1;
	    case 2:
		return SupportOfCommonEDCH._true;
	    case 3:
		return SupportOfMACiis._true;
	    case 4:
		return SupportOfSPSOperation._true;
	    case 5:
		return SupportOfControlChannelDRXOperation._true;
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "tdd128RF_Capability"
    public RadioFrequencyBandTDDextList getTdd128RF_Capability()
    {
	return (RadioFrequencyBandTDDextList)mComponents[0];
    }
    
    public void setTdd128RF_Capability(RadioFrequencyBandTDDextList tdd128RF_Capability)
    {
	mComponents[0] = tdd128RF_Capability;
    }
    
    public boolean hasTdd128RF_Capability()
    {
	return componentIsPresent(0);
    }
    
    public void deleteTdd128RF_Capability()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "supportOfSFModeForHSPDSCHDualStream"
    public SupportOfSFModeForHSPDSCHDualStream getSupportOfSFModeForHSPDSCHDualStream()
    {
	return (SupportOfSFModeForHSPDSCHDualStream)mComponents[1];
    }
    
    public void setSupportOfSFModeForHSPDSCHDualStream(SupportOfSFModeForHSPDSCHDualStream supportOfSFModeForHSPDSCHDualStream)
    {
	mComponents[1] = supportOfSFModeForHSPDSCHDualStream;
    }
    
    public boolean hasSupportOfSFModeForHSPDSCHDualStream()
    {
	return componentIsPresent(1);
    }
    
    public void deleteSupportOfSFModeForHSPDSCHDualStream()
    {
	setComponentAbsent(1);
    }
    
    
    
    /**
     * Define the ASN1 Type SupportOfSFModeForHSPDSCHDualStream from ASN1 Module InformationElements.
     * @see Enumerated
     */
    public static final class SupportOfSFModeForHSPDSCHDualStream extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private SupportOfSFModeForHSPDSCHDualStream()
	{
	    super(cFirstNumber);
	}
	
	protected SupportOfSFModeForHSPDSCHDualStream(long value)
	{
	    super(value);
	}
	
	// Named list definitions.
	public static final SupportOfSFModeForHSPDSCHDualStream sf1 =
	    new SupportOfSFModeForHSPDSCHDualStream(0);
	public static final SupportOfSFModeForHSPDSCHDualStream sf1sf16 =
	    new SupportOfSFModeForHSPDSCHDualStream(1);
	private final static SupportOfSFModeForHSPDSCHDualStream cNamedNumbers[] = {
	     sf1, 
	     sf1sf16
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
	
	public static SupportOfSFModeForHSPDSCHDualStream valueOf(long value)
	{
	    return (SupportOfSFModeForHSPDSCHDualStream)sf1.lookupValue(value);
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
		"UE_RadioAccessCapabilityComp_TDD128$SupportOfSFModeForHSPDSCHDualStream"
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
			"sf1",
			0
		    ),
		    new MemberListElement (
			"sf1sf16",
			1
		    )
		}
	    ),
	    0,
	    sf1
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' SupportOfSFModeForHSPDSCHDualStream object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' SupportOfSFModeForHSPDSCHDualStream object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for SupportOfSFModeForHSPDSCHDualStream

    // Methods for field "supportOfCommonEDCH"
    public SupportOfCommonEDCH getSupportOfCommonEDCH()
    {
	return (SupportOfCommonEDCH)mComponents[2];
    }
    
    public void setSupportOfCommonEDCH(SupportOfCommonEDCH supportOfCommonEDCH)
    {
	mComponents[2] = supportOfCommonEDCH;
    }
    
    public boolean hasSupportOfCommonEDCH()
    {
	return componentIsPresent(2);
    }
    
    public void deleteSupportOfCommonEDCH()
    {
	setComponentAbsent(2);
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
		    (short)0x8002
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"UE_RadioAccessCapabilityComp_TDD128$SupportOfCommonEDCH"
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
	return (SupportOfMACiis)mComponents[3];
    }
    
    public void setSupportOfMACiis(SupportOfMACiis supportOfMACiis)
    {
	mComponents[3] = supportOfMACiis;
    }
    
    public boolean hasSupportOfMACiis()
    {
	return componentIsPresent(3);
    }
    
    public void deleteSupportOfMACiis()
    {
	setComponentAbsent(3);
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
		    (short)0x8003
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"UE_RadioAccessCapabilityComp_TDD128$SupportOfMACiis"
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
	return (SupportOfSPSOperation)mComponents[4];
    }
    
    public void setSupportOfSPSOperation(SupportOfSPSOperation supportOfSPSOperation)
    {
	mComponents[4] = supportOfSPSOperation;
    }
    
    public boolean hasSupportOfSPSOperation()
    {
	return componentIsPresent(4);
    }
    
    public void deleteSupportOfSPSOperation()
    {
	setComponentAbsent(4);
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
		    (short)0x8004
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"UE_RadioAccessCapabilityComp_TDD128$SupportOfSPSOperation"
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
	return (SupportOfControlChannelDRXOperation)mComponents[5];
    }
    
    public void setSupportOfControlChannelDRXOperation(SupportOfControlChannelDRXOperation supportOfControlChannelDRXOperation)
    {
	mComponents[5] = supportOfControlChannelDRXOperation;
    }
    
    public boolean hasSupportOfControlChannelDRXOperation()
    {
	return componentIsPresent(5);
    }
    
    public void deleteSupportOfControlChannelDRXOperation()
    {
	setComponentAbsent(5);
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
		    (short)0x8005
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"UE_RadioAccessCapabilityComp_TDD128$SupportOfControlChannelDRXOperation"
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
	    "UE_RadioAccessCapabilityComp_TDD128"
	),
	new QName (
	    "InformationElements",
	    "UE-RadioAccessCapabilityComp-TDD128"
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
				"RadioFrequencyBandTDDextList"
			    ),
			    new QName (
				"InformationElements",
				"RadioFrequencyBandTDDextList"
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
				    "RadioFrequencyBandTDDext"
				)
			    )
			)
		    ),
		    "tdd128RF-Capability",
		    0,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "UE_RadioAccessCapabilityComp_TDD128$SupportOfSFModeForHSPDSCHDualStream"
			)
		    ),
		    "supportOfSFModeForHSPDSCHDualStream",
		    1,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "UE_RadioAccessCapabilityComp_TDD128$SupportOfCommonEDCH"
			)
		    ),
		    "supportOfCommonEDCH",
		    2,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "UE_RadioAccessCapabilityComp_TDD128$SupportOfMACiis"
			)
		    ),
		    "supportOfMACiis",
		    3,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "UE_RadioAccessCapabilityComp_TDD128$SupportOfSPSOperation"
			)
		    ),
		    "supportOfSPSOperation",
		    4,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "UE_RadioAccessCapabilityComp_TDD128$SupportOfControlChannelDRXOperation"
			)
		    ),
		    "supportOfControlChannelDRXOperation",
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
     * Get the type descriptor (TypeInfo) of 'this' UE_RadioAccessCapabilityComp_TDD128 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UE_RadioAccessCapabilityComp_TDD128 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UE_RadioAccessCapabilityComp_TDD128
