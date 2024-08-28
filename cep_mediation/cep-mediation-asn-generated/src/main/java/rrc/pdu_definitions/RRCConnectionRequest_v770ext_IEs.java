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
 * Define the ASN1 Type RRCConnectionRequest_v770ext_IEs from ASN1 Module PDU_definitions.
 * @see Sequence
 */

public class RRCConnectionRequest_v770ext_IEs extends Sequence {
    
    /**
     * The default constructor.
     */
    public RRCConnectionRequest_v770ext_IEs()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public RRCConnectionRequest_v770ext_IEs(rrc.informationelements.High_MobilityDetected ueMobilityStateIndicator, 
		    HspdschReception_CellFach hspdschReception_CellFach, 
		    Mac_ehsSupport mac_ehsSupport, 
		    DiscontinuousDpcchTransmission discontinuousDpcchTransmission)
    {
	setUeMobilityStateIndicator(ueMobilityStateIndicator);
	setHspdschReception_CellFach(hspdschReception_CellFach);
	setMac_ehsSupport(mac_ehsSupport);
	setDiscontinuousDpcchTransmission(discontinuousDpcchTransmission);
    }
    
    public void initComponents()
    {
	mComponents[0] = rrc.informationelements.High_MobilityDetected.high_MobilityDetected;
	mComponents[1] = HspdschReception_CellFach._true;
	mComponents[2] = Mac_ehsSupport._true;
	mComponents[3] = DiscontinuousDpcchTransmission._true;
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
		return rrc.informationelements.High_MobilityDetected.high_MobilityDetected;
	    case 1:
		return HspdschReception_CellFach._true;
	    case 2:
		return Mac_ehsSupport._true;
	    case 3:
		return DiscontinuousDpcchTransmission._true;
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "ueMobilityStateIndicator"
    public rrc.informationelements.High_MobilityDetected getUeMobilityStateIndicator()
    {
	return (rrc.informationelements.High_MobilityDetected)mComponents[0];
    }
    
    public void setUeMobilityStateIndicator(rrc.informationelements.High_MobilityDetected ueMobilityStateIndicator)
    {
	mComponents[0] = ueMobilityStateIndicator;
    }
    
    public boolean hasUeMobilityStateIndicator()
    {
	return componentIsPresent(0);
    }
    
    public void deleteUeMobilityStateIndicator()
    {
	setComponentAbsent(0);
    }
    
    
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
		"RRCConnectionRequest_v770ext_IEs$HspdschReception_CellFach"
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

    // Methods for field "mac_ehsSupport"
    public Mac_ehsSupport getMac_ehsSupport()
    {
	return (Mac_ehsSupport)mComponents[2];
    }
    
    public void setMac_ehsSupport(Mac_ehsSupport mac_ehsSupport)
    {
	mComponents[2] = mac_ehsSupport;
    }
    
    public boolean hasMac_ehsSupport()
    {
	return componentIsPresent(2);
    }
    
    public void deleteMac_ehsSupport()
    {
	setComponentAbsent(2);
    }
    
    
    
    /**
     * Define the ASN1 Type Mac_ehsSupport from ASN1 Module PDU_definitions.
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
		    (short)0x8002
		}
	    ),
	    new QName (
		"rrc.pdu_definitions",
		"RRCConnectionRequest_v770ext_IEs$Mac_ehsSupport"
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

    // Methods for field "discontinuousDpcchTransmission"
    public DiscontinuousDpcchTransmission getDiscontinuousDpcchTransmission()
    {
	return (DiscontinuousDpcchTransmission)mComponents[3];
    }
    
    public void setDiscontinuousDpcchTransmission(DiscontinuousDpcchTransmission discontinuousDpcchTransmission)
    {
	mComponents[3] = discontinuousDpcchTransmission;
    }
    
    public boolean hasDiscontinuousDpcchTransmission()
    {
	return componentIsPresent(3);
    }
    
    public void deleteDiscontinuousDpcchTransmission()
    {
	setComponentAbsent(3);
    }
    
    
    
    /**
     * Define the ASN1 Type DiscontinuousDpcchTransmission from ASN1 Module PDU_definitions.
     * @see Enumerated
     */
    public static final class DiscontinuousDpcchTransmission extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private DiscontinuousDpcchTransmission()
	{
	    super(cFirstNumber);
	}
	
	protected DiscontinuousDpcchTransmission(long value)
	{
	    super(value);
	}
	
	// Named list definitions.
	public static final DiscontinuousDpcchTransmission _true =
	    new DiscontinuousDpcchTransmission(0);
	private final static DiscontinuousDpcchTransmission cNamedNumbers[] = {
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
	
	public static DiscontinuousDpcchTransmission valueOf(long value)
	{
	    return (DiscontinuousDpcchTransmission)_true.lookupValue(value);
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
		"RRCConnectionRequest_v770ext_IEs$DiscontinuousDpcchTransmission"
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
	 * Get the type descriptor (TypeInfo) of 'this' DiscontinuousDpcchTransmission object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' DiscontinuousDpcchTransmission object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for DiscontinuousDpcchTransmission

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
	    "RRCConnectionRequest_v770ext_IEs"
	),
	new QName (
	    "PDU-definitions",
	    "RRCConnectionRequest-v770ext-IEs"
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
		    0,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.pdu_definitions",
			    "RRCConnectionRequest_v770ext_IEs$HspdschReception_CellFach"
			)
		    ),
		    "hspdschReception-CellFach",
		    1,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.pdu_definitions",
			    "RRCConnectionRequest_v770ext_IEs$Mac_ehsSupport"
			)
		    ),
		    "mac-ehsSupport",
		    2,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.pdu_definitions",
			    "RRCConnectionRequest_v770ext_IEs$DiscontinuousDpcchTransmission"
			)
		    ),
		    "discontinuousDpcchTransmission",
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
     * Get the type descriptor (TypeInfo) of 'this' RRCConnectionRequest_v770ext_IEs object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' RRCConnectionRequest_v770ext_IEs object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for RRCConnectionRequest_v770ext_IEs
