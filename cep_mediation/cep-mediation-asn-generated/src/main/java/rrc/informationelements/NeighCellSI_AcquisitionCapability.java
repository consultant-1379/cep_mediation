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
 * Define the ASN1 Type NeighCellSI_AcquisitionCapability from ASN1 Module InformationElements.
 * @see Sequence
 */

public class NeighCellSI_AcquisitionCapability extends Sequence {
    
    /**
     * The default constructor.
     */
    public NeighCellSI_AcquisitionCapability()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public NeighCellSI_AcquisitionCapability(SupportOfIntraFreqSIAcquisitionForHO supportOfIntraFreqSIAcquisitionForHO, 
		    SupportOfInterFreqSIAcquisitionForHO supportOfInterFreqSIAcquisitionForHO, 
		    SupportOfE_UtraSIAcquisitionForHO supportOfE_UtraSIAcquisitionForHO)
    {
	setSupportOfIntraFreqSIAcquisitionForHO(supportOfIntraFreqSIAcquisitionForHO);
	setSupportOfInterFreqSIAcquisitionForHO(supportOfInterFreqSIAcquisitionForHO);
	setSupportOfE_UtraSIAcquisitionForHO(supportOfE_UtraSIAcquisitionForHO);
    }
    
    public void initComponents()
    {
	mComponents[0] = SupportOfIntraFreqSIAcquisitionForHO._true;
	mComponents[1] = SupportOfInterFreqSIAcquisitionForHO._true;
	mComponents[2] = SupportOfE_UtraSIAcquisitionForHO._true;
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
		return SupportOfIntraFreqSIAcquisitionForHO._true;
	    case 1:
		return SupportOfInterFreqSIAcquisitionForHO._true;
	    case 2:
		return SupportOfE_UtraSIAcquisitionForHO._true;
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "supportOfIntraFreqSIAcquisitionForHO"
    public SupportOfIntraFreqSIAcquisitionForHO getSupportOfIntraFreqSIAcquisitionForHO()
    {
	return (SupportOfIntraFreqSIAcquisitionForHO)mComponents[0];
    }
    
    public void setSupportOfIntraFreqSIAcquisitionForHO(SupportOfIntraFreqSIAcquisitionForHO supportOfIntraFreqSIAcquisitionForHO)
    {
	mComponents[0] = supportOfIntraFreqSIAcquisitionForHO;
    }
    
    public boolean hasSupportOfIntraFreqSIAcquisitionForHO()
    {
	return componentIsPresent(0);
    }
    
    public void deleteSupportOfIntraFreqSIAcquisitionForHO()
    {
	setComponentAbsent(0);
    }
    
    
    
    /**
     * Define the ASN1 Type SupportOfIntraFreqSIAcquisitionForHO from ASN1 Module InformationElements.
     * @see Enumerated
     */
    public static final class SupportOfIntraFreqSIAcquisitionForHO extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private SupportOfIntraFreqSIAcquisitionForHO()
	{
	    super(cFirstNumber);
	}
	
	protected SupportOfIntraFreqSIAcquisitionForHO(long value)
	{
	    super(value);
	}
	
	// Named list definitions.
	public static final SupportOfIntraFreqSIAcquisitionForHO _true =
	    new SupportOfIntraFreqSIAcquisitionForHO(0);
	private final static SupportOfIntraFreqSIAcquisitionForHO cNamedNumbers[] = {
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
	
	public static SupportOfIntraFreqSIAcquisitionForHO valueOf(long value)
	{
	    return (SupportOfIntraFreqSIAcquisitionForHO)_true.lookupValue(value);
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
		"NeighCellSI_AcquisitionCapability$SupportOfIntraFreqSIAcquisitionForHO"
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
	 * Get the type descriptor (TypeInfo) of 'this' SupportOfIntraFreqSIAcquisitionForHO object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' SupportOfIntraFreqSIAcquisitionForHO object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for SupportOfIntraFreqSIAcquisitionForHO

    // Methods for field "supportOfInterFreqSIAcquisitionForHO"
    public SupportOfInterFreqSIAcquisitionForHO getSupportOfInterFreqSIAcquisitionForHO()
    {
	return (SupportOfInterFreqSIAcquisitionForHO)mComponents[1];
    }
    
    public void setSupportOfInterFreqSIAcquisitionForHO(SupportOfInterFreqSIAcquisitionForHO supportOfInterFreqSIAcquisitionForHO)
    {
	mComponents[1] = supportOfInterFreqSIAcquisitionForHO;
    }
    
    public boolean hasSupportOfInterFreqSIAcquisitionForHO()
    {
	return componentIsPresent(1);
    }
    
    public void deleteSupportOfInterFreqSIAcquisitionForHO()
    {
	setComponentAbsent(1);
    }
    
    
    
    /**
     * Define the ASN1 Type SupportOfInterFreqSIAcquisitionForHO from ASN1 Module InformationElements.
     * @see Enumerated
     */
    public static final class SupportOfInterFreqSIAcquisitionForHO extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private SupportOfInterFreqSIAcquisitionForHO()
	{
	    super(cFirstNumber);
	}
	
	protected SupportOfInterFreqSIAcquisitionForHO(long value)
	{
	    super(value);
	}
	
	// Named list definitions.
	public static final SupportOfInterFreqSIAcquisitionForHO _true =
	    new SupportOfInterFreqSIAcquisitionForHO(0);
	private final static SupportOfInterFreqSIAcquisitionForHO cNamedNumbers[] = {
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
	
	public static SupportOfInterFreqSIAcquisitionForHO valueOf(long value)
	{
	    return (SupportOfInterFreqSIAcquisitionForHO)_true.lookupValue(value);
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
		"NeighCellSI_AcquisitionCapability$SupportOfInterFreqSIAcquisitionForHO"
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
	 * Get the type descriptor (TypeInfo) of 'this' SupportOfInterFreqSIAcquisitionForHO object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' SupportOfInterFreqSIAcquisitionForHO object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for SupportOfInterFreqSIAcquisitionForHO

    // Methods for field "supportOfE_UtraSIAcquisitionForHO"
    public SupportOfE_UtraSIAcquisitionForHO getSupportOfE_UtraSIAcquisitionForHO()
    {
	return (SupportOfE_UtraSIAcquisitionForHO)mComponents[2];
    }
    
    public void setSupportOfE_UtraSIAcquisitionForHO(SupportOfE_UtraSIAcquisitionForHO supportOfE_UtraSIAcquisitionForHO)
    {
	mComponents[2] = supportOfE_UtraSIAcquisitionForHO;
    }
    
    public boolean hasSupportOfE_UtraSIAcquisitionForHO()
    {
	return componentIsPresent(2);
    }
    
    public void deleteSupportOfE_UtraSIAcquisitionForHO()
    {
	setComponentAbsent(2);
    }
    
    
    
    /**
     * Define the ASN1 Type SupportOfE_UtraSIAcquisitionForHO from ASN1 Module InformationElements.
     * @see Enumerated
     */
    public static final class SupportOfE_UtraSIAcquisitionForHO extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private SupportOfE_UtraSIAcquisitionForHO()
	{
	    super(cFirstNumber);
	}
	
	protected SupportOfE_UtraSIAcquisitionForHO(long value)
	{
	    super(value);
	}
	
	// Named list definitions.
	public static final SupportOfE_UtraSIAcquisitionForHO _true =
	    new SupportOfE_UtraSIAcquisitionForHO(0);
	private final static SupportOfE_UtraSIAcquisitionForHO cNamedNumbers[] = {
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
	
	public static SupportOfE_UtraSIAcquisitionForHO valueOf(long value)
	{
	    return (SupportOfE_UtraSIAcquisitionForHO)_true.lookupValue(value);
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
		"NeighCellSI_AcquisitionCapability$SupportOfE_UtraSIAcquisitionForHO"
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
	 * Get the type descriptor (TypeInfo) of 'this' SupportOfE_UtraSIAcquisitionForHO object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' SupportOfE_UtraSIAcquisitionForHO object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for SupportOfE_UtraSIAcquisitionForHO

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
	    "NeighCellSI_AcquisitionCapability"
	),
	new QName (
	    "InformationElements",
	    "NeighCellSI-AcquisitionCapability"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "NeighCellSI_AcquisitionCapability$SupportOfIntraFreqSIAcquisitionForHO"
			)
		    ),
		    "supportOfIntraFreqSIAcquisitionForHO",
		    0,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "NeighCellSI_AcquisitionCapability$SupportOfInterFreqSIAcquisitionForHO"
			)
		    ),
		    "supportOfInterFreqSIAcquisitionForHO",
		    1,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "NeighCellSI_AcquisitionCapability$SupportOfE_UtraSIAcquisitionForHO"
			)
		    ),
		    "supportOfE-UtraSIAcquisitionForHO",
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
     * Get the type descriptor (TypeInfo) of 'this' NeighCellSI_AcquisitionCapability object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' NeighCellSI_AcquisitionCapability object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for NeighCellSI_AcquisitionCapability
