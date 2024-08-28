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
 * Define the ASN1 Type CellUpdate_v770ext_IEs from ASN1 Module PDU_definitions.
 * @see Sequence
 */

public class CellUpdate_v770ext_IEs extends Sequence {
    
    /**
     * The default constructor.
     */
    public CellUpdate_v770ext_IEs()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public CellUpdate_v770ext_IEs(CsCallType csCallType, 
		    HspdschReception_CellFach hspdschReception_CellFach, 
		    rrc.informationelements.High_MobilityDetected ueMobilityStateIndicator, 
		    CapabilityChangeIndicator capabilityChangeIndicator)
    {
	setCsCallType(csCallType);
	setHspdschReception_CellFach(hspdschReception_CellFach);
	setUeMobilityStateIndicator(ueMobilityStateIndicator);
	setCapabilityChangeIndicator(capabilityChangeIndicator);
    }
    
    public void initComponents()
    {
	mComponents[0] = CsCallType.speech;
	mComponents[1] = HspdschReception_CellFach._true;
	mComponents[2] = rrc.informationelements.High_MobilityDetected.high_MobilityDetected;
	mComponents[3] = CapabilityChangeIndicator._true;
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[4];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return CsCallType.speech;
	    case 1:
		return HspdschReception_CellFach._true;
	    case 2:
		return rrc.informationelements.High_MobilityDetected.high_MobilityDetected;
	    case 3:
		return CapabilityChangeIndicator._true;
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "csCallType"
    public CsCallType getCsCallType()
    {
	return (CsCallType)mComponents[0];
    }
    
    public void setCsCallType(CsCallType csCallType)
    {
	mComponents[0] = csCallType;
    }
    
    public boolean hasCsCallType()
    {
	return componentIsPresent(0);
    }
    
    public void deleteCsCallType()
    {
	setComponentAbsent(0);
    }
    
    
    
    /**
     * Define the ASN1 Type CsCallType from ASN1 Module PDU_definitions.
     * @see Enumerated
     */
    public static final class CsCallType extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private CsCallType()
	{
	    super(cFirstNumber);
	}
	
	protected CsCallType(long value)
	{
	    super(value);
	}
	
	// Named list definitions.
	public static final CsCallType speech =
	    new CsCallType(0);
	public static final CsCallType video =
	    new CsCallType(1);
	public static final CsCallType other =
	    new CsCallType(2);
	public static final CsCallType spare =
	    new CsCallType(3);
	private final static CsCallType cNamedNumbers[] = {
	     speech, 
	     video, 
	     other, 
	     spare
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
	
	public static CsCallType valueOf(long value)
	{
	    return (CsCallType)speech.lookupValue(value);
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final EnumeratedInfo c_typeinfo = new EnumeratedInfo (
	    new Tags (
		new short[] {
		    (short)0x8000
		}
	    ),
	    new QName (
		"rrc.pdu_definitions",
		"CellUpdate_v770ext_IEs$CsCallType"
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
			"speech",
			0
		    ),
		    new MemberListElement (
			"video",
			1
		    ),
		    new MemberListElement (
			"other",
			2
		    ),
		    new MemberListElement (
			"spare",
			3
		    )
		}
	    ),
	    0,
	    speech
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' CsCallType object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' CsCallType object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for CsCallType

    // Methods for field "hspdschReception_CellFach"
    public HspdschReception_CellFach getHspdschReception_CellFach()
    {
	return (HspdschReception_CellFach)mComponents[1];
    }
    
    public void setHspdschReception_CellFach(HspdschReception_CellFach hspdschReception_CellFach)
    {
	mComponents[1] = hspdschReception_CellFach;
    }
    
    public boolean hasHspdschReception_CellFach()
    {
	return componentIsPresent(1);
    }
    
    public void deleteHspdschReception_CellFach()
    {
	setComponentAbsent(1);
    }
    
    
    
    /**
     * Define the ASN1 Type HspdschReception_CellFach from ASN1 Module PDU_definitions.
     * @see Enumerated
     */
    public static final class HspdschReception_CellFach extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private HspdschReception_CellFach()
	{
	    super(cFirstNumber);
	}
	
	protected HspdschReception_CellFach(long value)
	{
	    super(value);
	}
	
	// Named list definitions.
	public static final HspdschReception_CellFach _true =
	    new HspdschReception_CellFach(0);
	private final static HspdschReception_CellFach cNamedNumbers[] = {
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
	
	public static HspdschReception_CellFach valueOf(long value)
	{
	    return (HspdschReception_CellFach)_true.lookupValue(value);
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
		"rrc.pdu_definitions",
		"CellUpdate_v770ext_IEs$HspdschReception_CellFach"
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
	 * Get the type descriptor (TypeInfo) of 'this' HspdschReception_CellFach object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' HspdschReception_CellFach object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for HspdschReception_CellFach

    // Methods for field "ueMobilityStateIndicator"
    public rrc.informationelements.High_MobilityDetected getUeMobilityStateIndicator()
    {
	return (rrc.informationelements.High_MobilityDetected)mComponents[2];
    }
    
    public void setUeMobilityStateIndicator(rrc.informationelements.High_MobilityDetected ueMobilityStateIndicator)
    {
	mComponents[2] = ueMobilityStateIndicator;
    }
    
    public boolean hasUeMobilityStateIndicator()
    {
	return componentIsPresent(2);
    }
    
    public void deleteUeMobilityStateIndicator()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "capabilityChangeIndicator"
    public CapabilityChangeIndicator getCapabilityChangeIndicator()
    {
	return (CapabilityChangeIndicator)mComponents[3];
    }
    
    public void setCapabilityChangeIndicator(CapabilityChangeIndicator capabilityChangeIndicator)
    {
	mComponents[3] = capabilityChangeIndicator;
    }
    
    public boolean hasCapabilityChangeIndicator()
    {
	return componentIsPresent(3);
    }
    
    public void deleteCapabilityChangeIndicator()
    {
	setComponentAbsent(3);
    }
    
    
    
    /**
     * Define the ASN1 Type CapabilityChangeIndicator from ASN1 Module PDU_definitions.
     * @see Enumerated
     */
    public static final class CapabilityChangeIndicator extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private CapabilityChangeIndicator()
	{
	    super(cFirstNumber);
	}
	
	protected CapabilityChangeIndicator(long value)
	{
	    super(value);
	}
	
	// Named list definitions.
	public static final CapabilityChangeIndicator _true =
	    new CapabilityChangeIndicator(0);
	private final static CapabilityChangeIndicator cNamedNumbers[] = {
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
	
	public static CapabilityChangeIndicator valueOf(long value)
	{
	    return (CapabilityChangeIndicator)_true.lookupValue(value);
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
		"CellUpdate_v770ext_IEs$CapabilityChangeIndicator"
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
	 * Get the type descriptor (TypeInfo) of 'this' CapabilityChangeIndicator object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' CapabilityChangeIndicator object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for CapabilityChangeIndicator

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
	    "CellUpdate_v770ext_IEs"
	),
	new QName (
	    "PDU-definitions",
	    "CellUpdate-v770ext-IEs"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.pdu_definitions",
			    "CellUpdate_v770ext_IEs$CsCallType"
			)
		    ),
		    "csCallType",
		    0,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.pdu_definitions",
			    "CellUpdate_v770ext_IEs$HspdschReception_CellFach"
			)
		    ),
		    "hspdschReception-CellFach",
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
				"High_MobilityDetected"
			    ),
			    new QName (
				"InformationElements",
				"High-MobilityDetected"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"high-MobilityDetected",
					0
				    )
				}
			    ),
			    0,
			    rrc.informationelements.High_MobilityDetected.high_MobilityDetected
			)
		    ),
		    "ueMobilityStateIndicator",
		    2,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.pdu_definitions",
			    "CellUpdate_v770ext_IEs$CapabilityChangeIndicator"
			)
		    ),
		    "capabilityChangeIndicator",
		    3,
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
			new TagDecoderElement((short)0x8003, 3)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8003, 3)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' CellUpdate_v770ext_IEs object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' CellUpdate_v770ext_IEs object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for CellUpdate_v770ext_IEs
