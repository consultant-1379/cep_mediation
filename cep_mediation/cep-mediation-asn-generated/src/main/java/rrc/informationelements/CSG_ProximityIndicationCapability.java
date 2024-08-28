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
 * Define the ASN1 Type CSG_ProximityIndicationCapability from ASN1 Module InformationElements.
 * @see Sequence
 */

public class CSG_ProximityIndicationCapability extends Sequence {
    
    /**
     * The default constructor.
     */
    public CSG_ProximityIndicationCapability()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public CSG_ProximityIndicationCapability(SupportOfIntraFreqProximityIndication supportOfIntraFreqProximityIndication, 
		    SupportOfInterFreqProximityIndication supportOfInterFreqProximityIndication, 
		    SupportOfE_UtraProximityIndication supportOfE_UtraProximityIndication)
    {
	setSupportOfIntraFreqProximityIndication(supportOfIntraFreqProximityIndication);
	setSupportOfInterFreqProximityIndication(supportOfInterFreqProximityIndication);
	setSupportOfE_UtraProximityIndication(supportOfE_UtraProximityIndication);
    }
    
    public void initComponents()
    {
	mComponents[0] = SupportOfIntraFreqProximityIndication._true;
	mComponents[1] = SupportOfInterFreqProximityIndication._true;
	mComponents[2] = SupportOfE_UtraProximityIndication._true;
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[3];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return SupportOfIntraFreqProximityIndication._true;
	    case 1:
		return SupportOfInterFreqProximityIndication._true;
	    case 2:
		return SupportOfE_UtraProximityIndication._true;
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "supportOfIntraFreqProximityIndication"
    public SupportOfIntraFreqProximityIndication getSupportOfIntraFreqProximityIndication()
    {
	return (SupportOfIntraFreqProximityIndication)mComponents[0];
    }
    
    public void setSupportOfIntraFreqProximityIndication(SupportOfIntraFreqProximityIndication supportOfIntraFreqProximityIndication)
    {
	mComponents[0] = supportOfIntraFreqProximityIndication;
    }
    
    public boolean hasSupportOfIntraFreqProximityIndication()
    {
	return componentIsPresent(0);
    }
    
    public void deleteSupportOfIntraFreqProximityIndication()
    {
	setComponentAbsent(0);
    }
    
    
    
    /**
     * Define the ASN1 Type SupportOfIntraFreqProximityIndication from ASN1 Module InformationElements.
     * @see Enumerated
     */
    public static final class SupportOfIntraFreqProximityIndication extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private SupportOfIntraFreqProximityIndication()
	{
	    super(cFirstNumber);
	}
	
	protected SupportOfIntraFreqProximityIndication(long value)
	{
	    super(value);
	}
	
	// Named list definitions.
	public static final SupportOfIntraFreqProximityIndication _true =
	    new SupportOfIntraFreqProximityIndication(0);
	private final static SupportOfIntraFreqProximityIndication cNamedNumbers[] = {
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
	
	public static SupportOfIntraFreqProximityIndication valueOf(long value)
	{
	    return (SupportOfIntraFreqProximityIndication)_true.lookupValue(value);
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
		"rrc.informationelements",
		"CSG_ProximityIndicationCapability$SupportOfIntraFreqProximityIndication"
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
	 * Get the type descriptor (TypeInfo) of 'this' SupportOfIntraFreqProximityIndication object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' SupportOfIntraFreqProximityIndication object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for SupportOfIntraFreqProximityIndication

    // Methods for field "supportOfInterFreqProximityIndication"
    public SupportOfInterFreqProximityIndication getSupportOfInterFreqProximityIndication()
    {
	return (SupportOfInterFreqProximityIndication)mComponents[1];
    }
    
    public void setSupportOfInterFreqProximityIndication(SupportOfInterFreqProximityIndication supportOfInterFreqProximityIndication)
    {
	mComponents[1] = supportOfInterFreqProximityIndication;
    }
    
    public boolean hasSupportOfInterFreqProximityIndication()
    {
	return componentIsPresent(1);
    }
    
    public void deleteSupportOfInterFreqProximityIndication()
    {
	setComponentAbsent(1);
    }
    
    
    
    /**
     * Define the ASN1 Type SupportOfInterFreqProximityIndication from ASN1 Module InformationElements.
     * @see Enumerated
     */
    public static final class SupportOfInterFreqProximityIndication extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private SupportOfInterFreqProximityIndication()
	{
	    super(cFirstNumber);
	}
	
	protected SupportOfInterFreqProximityIndication(long value)
	{
	    super(value);
	}
	
	// Named list definitions.
	public static final SupportOfInterFreqProximityIndication _true =
	    new SupportOfInterFreqProximityIndication(0);
	private final static SupportOfInterFreqProximityIndication cNamedNumbers[] = {
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
	
	public static SupportOfInterFreqProximityIndication valueOf(long value)
	{
	    return (SupportOfInterFreqProximityIndication)_true.lookupValue(value);
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
		"CSG_ProximityIndicationCapability$SupportOfInterFreqProximityIndication"
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
	 * Get the type descriptor (TypeInfo) of 'this' SupportOfInterFreqProximityIndication object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' SupportOfInterFreqProximityIndication object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for SupportOfInterFreqProximityIndication

    // Methods for field "supportOfE_UtraProximityIndication"
    public SupportOfE_UtraProximityIndication getSupportOfE_UtraProximityIndication()
    {
	return (SupportOfE_UtraProximityIndication)mComponents[2];
    }
    
    public void setSupportOfE_UtraProximityIndication(SupportOfE_UtraProximityIndication supportOfE_UtraProximityIndication)
    {
	mComponents[2] = supportOfE_UtraProximityIndication;
    }
    
    public boolean hasSupportOfE_UtraProximityIndication()
    {
	return componentIsPresent(2);
    }
    
    public void deleteSupportOfE_UtraProximityIndication()
    {
	setComponentAbsent(2);
    }
    
    
    
    /**
     * Define the ASN1 Type SupportOfE_UtraProximityIndication from ASN1 Module InformationElements.
     * @see Enumerated
     */
    public static final class SupportOfE_UtraProximityIndication extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private SupportOfE_UtraProximityIndication()
	{
	    super(cFirstNumber);
	}
	
	protected SupportOfE_UtraProximityIndication(long value)
	{
	    super(value);
	}
	
	// Named list definitions.
	public static final SupportOfE_UtraProximityIndication _true =
	    new SupportOfE_UtraProximityIndication(0);
	private final static SupportOfE_UtraProximityIndication cNamedNumbers[] = {
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
	
	public static SupportOfE_UtraProximityIndication valueOf(long value)
	{
	    return (SupportOfE_UtraProximityIndication)_true.lookupValue(value);
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
		"CSG_ProximityIndicationCapability$SupportOfE_UtraProximityIndication"
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
	 * Get the type descriptor (TypeInfo) of 'this' SupportOfE_UtraProximityIndication object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' SupportOfE_UtraProximityIndication object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for SupportOfE_UtraProximityIndication

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
	    "CSG_ProximityIndicationCapability"
	),
	new QName (
	    "InformationElements",
	    "CSG-ProximityIndicationCapability"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "CSG_ProximityIndicationCapability$SupportOfIntraFreqProximityIndication"
			)
		    ),
		    "supportOfIntraFreqProximityIndication",
		    0,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "CSG_ProximityIndicationCapability$SupportOfInterFreqProximityIndication"
			)
		    ),
		    "supportOfInterFreqProximityIndication",
		    1,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "CSG_ProximityIndicationCapability$SupportOfE_UtraProximityIndication"
			)
		    ),
		    "supportOfE-UtraProximityIndication",
		    2,
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
			new TagDecoderElement((short)0x8002, 2)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8002, 2)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' CSG_ProximityIndicationCapability object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' CSG_ProximityIndicationCapability object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for CSG_ProximityIndicationCapability
